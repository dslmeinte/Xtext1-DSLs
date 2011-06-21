package nl.dslmeinte.xtext.sgml.lexer;

import org.antlr.runtime.CharStream;

import com.google.inject.Provider;

public class InternalSgmlLexerProvider<T extends WeavableAntlrLexer> implements Provider<T> {

	private final Class<T> lexerClass;
	private final AntlrParserFacade facade;

	private InternalSgmlLexerProvider(Class<T> lexerClass, AntlrParserFacade facade) {
		this.lexerClass = lexerClass;
		this.facade = facade;
	}

	public static <T extends WeavableAntlrLexer> InternalSgmlLexerProvider<T> create(Class<T> lexerClass, AntlrParserFacade facade) {
		return new InternalSgmlLexerProvider<T>(lexerClass, facade);
	}

	public T get() {
		try {
			T baseLexer = lexerClass.getConstructor(CharStream.class).newInstance(new Object[] { null });
			SgmlLexer sgmlLexer = new SgmlLexer();
			sgmlLexer.setFacade(facade);
			sgmlLexer.setBaseLexer(baseLexer);
			baseLexer.setSgmlLexer(sgmlLexer);
			return baseLexer;
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

}
