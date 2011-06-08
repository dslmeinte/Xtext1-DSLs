package nl.dslmeinte.xtext.sgml.parser;

import static nl.dslmeinte.xtext.sgml.lexer.TokenType.*;
import static nl.dslmeinte.xtext.sgml.parser.Result.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import nl.dslmeinte.xtext.examples.dTDLanguage.Alternatives;
import nl.dslmeinte.xtext.examples.dTDLanguage.Attribute;
import nl.dslmeinte.xtext.examples.dTDLanguage.Cardinality;
import nl.dslmeinte.xtext.examples.dTDLanguage.Concatenation;
import nl.dslmeinte.xtext.examples.dTDLanguage.DTDDefinition;
import nl.dslmeinte.xtext.examples.dTDLanguage.Element;
import nl.dslmeinte.xtext.examples.dTDLanguage.ElementCardinality;
import nl.dslmeinte.xtext.examples.dTDLanguage.ElementReference;
import nl.dslmeinte.xtext.examples.dTDLanguage.EmptyContent;
import nl.dslmeinte.xtext.examples.dTDLanguage.Expression;
import nl.dslmeinte.xtext.examples.dTDLanguage.PCData;
import nl.dslmeinte.xtext.sgml.dtd.DTDManager;
import nl.dslmeinte.xtext.sgml.lexer.Lexer;
import nl.dslmeinte.xtext.sgml.lexer.SgmlLexer;
import nl.dslmeinte.xtext.sgml.lexer.TokenType;

import org.antlr.runtime.CharStream;
import org.antlr.runtime.Token;
import org.apache.log4j.Logger;

import com.google.common.base.Function;

public class SgmlParser {

	private final DTDManager dtdManager;

	private final Lexer sgmlLexer;

	public SgmlParser(DTDManager dtdManager) {
		this.dtdManager = dtdManager;
		this.sgmlLexer = new SgmlLexer(dtdManager.getKeywords());
	}

	private TokenStream tokenStream;

	private final Logger logger = Logger.getLogger(getClass());

	private boolean printDebug = false;

	public void setPrintDebug(boolean printDebug) {
		this.printDebug = printDebug;
	}

	private Stack<Element> callStack;

	public void parse(CharStream input) {
		sgmlLexer.setCharStream(input);
		tokenStream = new TokenStream(sgmlLexer);
		tokenStream.setHiddenTokenCriterion(new Function<Token, Boolean>() {
			@Override
			public Boolean apply(Token token) {
				return whitespace.isTypeOf(token) || headerComments.isTypeOf(token);
			}
		});
		matchHeader();
		final Pattern whitespacePattern = Pattern.compile("\\s+");
		final Matcher matcher = whitespacePattern.matcher("");
		tokenStream.setHiddenTokenCriterion(new Function<Token, Boolean>() {
			@Override
			public Boolean apply(Token token) {
				if( whitespace.isTypeOf(token) /* ~ LexicalState.tag */ || comments.isTypeOf(token) /* ~ LexicalState.content */ ) {
					return true;
				}
				if( !literalContents.isTypeOf(token) ) {
					return false;
				}
				matcher.reset(token.getText());
				return matcher.matches();
			}
		});
		callStack = new Stack<Element>();
		matchElement(dtdManager.getFirstElement());
		tokenStream.expectNextTokenType(EOF);
	}

	private void matchHeader() {
		tokenStream.expectNextTokenType(openTagSymbol);
		tokenStream.expectNextTokenType(doctypeKeyword);
		tokenStream.expectNextTokenType(identifier);
		tokenStream.expectNextTokenType(identifier);
		tokenStream.expectNextTokenType(quotedString);
		Token token = tokenStream.peek();
		if( quotedString.isTypeOf(token) ) {
			tokenStream.consume();
		}
		token = tokenStream.nextToken();
		int entities = 0;
		if( openBracketSymbol.isTypeOf(token) ) {
			while( openTagSymbol.isTypeOf(token = tokenStream.nextToken()) ) {
				entities++;
				tokenStream.expectNextTokenType(entityKeyword);
				tokenStream.expectNextTokenType(identifier);
				if( identifier.isTypeOf(tokenStream.peek()) ) {
					tokenStream.consume();
				}
				tokenStream.expectNextTokenType(quotedString);
				if( headerComments.isTypeOf(tokenStream.peek()) ) {
					tokenStream.consume();
				}
				tokenStream.expectNextTokenType(closeTagSymbol);
			}
			closeBracketSymbol.expectOf(token);
			tokenStream.expectNextTokenType(closeTagSymbol);
		} else {
			closeTagSymbol.expectOf(token);
		}
	}

	/**
	 * Tries to parses the input, expecting to find the given {@link Element},
	 * including all its substructure specified through the (global)
	 * {@link DTDDefinition}.
	 * <p>
	 * Matches "'<' element.getName() ...".
	 * 
	 * @return true <em>iff</em> input matches successfully (required for
	 *         matching {@link Alternatives}).
	 */
	protected boolean matchElement(Element element) {
			tokenStream.mark();
			callStack.push(element);
			boolean match = matchElementInternal(element);
			if( !match ) {
				tokenStream.rewind();
			} 
			callStack.pop();
			tokenStream.unmark();
			if( match && printDebug ) {
				Token token = tokenStream.peek();
				logger.debug(
						String.format(
								"matched %s; next token @L%d: |%s|",
								element.getName(), token.getLine(), token.getText()
							)
					);
				if( element.getName().equals("FORMFAQS") && token.getLine() == 10 ) {
					System.out.println("Stop! [...] Hammer time! :-)");
				}
			}
			return match;
		}

	private boolean matchElementInternal(Element element) {
		// expecting "'<' ..."
		if( !( 
				   matchTokenType(openTagSymbol)
				&& matchKeywordEntry(element.getName())
				&& matchAttributes2()
				&& matchTokenType(closeTagSymbol)
			  )
		  )
		{
			return false;
		}
		if( element.getContent() instanceof EmptyContent ) {
			// check for optional closing tag:
			matchClosingTag(element.getName());
			return true;
		}
		Result result = matchExpression(element.getContent());
		if( result == noMatch ) {
			return false;
		}
		// check for non-optional closing tag:
		boolean match = matchClosingTag(element.getName());
		return match;
	}

	private boolean matchClosingTag(String keyword) {
		tokenStream.mark();
		if(
				   matchTokenType(openTagSymbol)
				&& matchTokenType(tagSlash)
				&& matchKeywordEntry(keyword)
				&& matchTokenType(closeTagSymbol)
		  )
		{
			tokenStream.unmark();
			return true;
		} else {
			tokenStream.rewind();
			tokenStream.unmark();
			return false;
		}
	}

	private boolean matchKeywordEntry(String keyword2match) {
		Token token = tokenStream.peek();
		if( keyword.isTypeOf(token) && token.getText().equalsIgnoreCase(keyword2match) ) {
			tokenStream.consume();
			return true;
		}
		return false;
	}

	private boolean matchTokenType(TokenType type) {
		Token token = tokenStream.peek();
		if( type.isTypeOf(token) ) {
			tokenStream.consume();
			return true;
		}
		return false;
	}

	private Result matchExpression(Expression expression) {
		tokenStream.mark();
		Result match = matchExpressionInternal(expression);
		if( match == noMatch ) {
			tokenStream.rewind();
		}
		tokenStream.unmark();
		return match;
	}

	private Result matchExpressionInternal(Expression expression) {
		if( expression instanceof Alternatives ) {
			return matchAlternatives((Alternatives) expression);
		}
		if( expression instanceof Cardinality ) {
			return matchCardinality((Cardinality) expression);
		}
		if( expression instanceof Concatenation ) {
			return matchConcatenation((Concatenation) expression);
		}
		if( expression instanceof ElementReference ) {
			return matchElementReference((ElementReference) expression);
		}
		if( expression instanceof EmptyContent ) {
			return emptyMatch;
		}
		if( expression instanceof PCData ) {
			return matchPCData();
		}
		return noMatch;
	}

	private Result matchAlternatives(Alternatives alternatives) {
		for( Expression expression : alternatives.getAlternatives() ) {
			Result match = matchExpression(expression);
			if( match != noMatch ) {
				return match;
			}
		}
		return noMatch;
	}

	private Result matchCardinality(Cardinality cardinalityExpr) {
		ElementCardinality cardinality = cardinalityExpr.getCardinality();
		Expression expression = cardinalityExpr.getNestedExpr();
		switch( cardinality ) {
			case OPTIONAL :
				{
					Result result = matchExpression(expression);
					if( result == matchWithConsumption ) {
						return matchWithConsumption;
					}
					return emptyMatch;
				}
			case ONE_OR_MORE :
				{
					Result match = matchExpression(expression);
					if( match != matchWithConsumption ) {
						return match;
					}
					while( matchExpression(expression) == matchWithConsumption ) {}
					return matchWithConsumption;
				}
			case ZERO_OR_MORE :
				{
					Result match = matchExpression(expression);
					if( match != matchWithConsumption ) {
						return emptyMatch;
					}
					while( matchExpression(expression) == matchWithConsumption ) {}
					return matchWithConsumption;
				}
		}
		return noMatch;
	}

	private Result matchConcatenation(Concatenation concatenation) {
		boolean empty = true;
		for( Expression expression : concatenation.getMembers() ) {
			Result match = matchExpression(expression);
			if( match == noMatch ) {
				return noMatch;
			}
			if( match == matchWithConsumption ) {
				empty = false;
			}
		}
		return empty ? emptyMatch : matchWithConsumption;
	}

	private Result matchElementReference(ElementReference elementReference) {
		boolean match = matchElement(elementReference.getElement());
		return match ? matchWithConsumption : noMatch;
	}

	/**
	 * Matches until first {@link TokenType#openTagSymbol}, gobbling up either
	 * {@link TokenType#literalContents}, {@link TokenType#entityReference} or
	 * (hidden) {@link TokenType#comments} tokens.
	 */
	private Result matchPCData() {
		Token token = tokenStream.peek();
		if( openTagSymbol.isTypeOf(token) ) {
			return noMatch;
		}
		tokenStream.consume();
		while( !openTagSymbol.isTypeOf(token = tokenStream.peek()) ) {
			tokenStream.consume();
		}
		return matchWithConsumption;
	}

	private String undelimit(String quotedString) {
		return quotedString.substring(1, quotedString.length()-1);
	}

	/**
	 * Tries to parse all attributes, until (and including) the closing tag
	 * symbol.
	 */
	@SuppressWarnings("unused")
	private Result matchAttributes(List<Attribute> attributes) {
		Map<String, String> attributeMap = new HashMap<String, String>();
		Token token;
		while( !closeTagSymbol.isTypeOf(token = tokenStream.peek()) ) {
			tokenStream.consume();
			// match attribute name:
			keyword.expectOf(token);
			String name = token.getText();
			// match '=':
			tokenStream.expectNextTokenType(equalsSymbol);
			// match attribute value:
			token = tokenStream.nextToken();
			quotedString.expectOf(token);
			String value = undelimit(token.getText());
			// store attribute:
			attributeMap.put(name, value);
//			if( name.equalsIgnoreCase("COND") ) {
//				parseConditional(value);
//			}
			// TODO  provide a hook here to alter return result
		}
		return( attributeMap.size() > 0 ? matchWithConsumption : emptyMatch );
	}

	private boolean matchAttributes2() {
		// just gobble up for now:
		while( !closeTagSymbol.isTypeOf(tokenStream.peek()) ) {
			tokenStream.consume();
		}
		return true;
	}

}
