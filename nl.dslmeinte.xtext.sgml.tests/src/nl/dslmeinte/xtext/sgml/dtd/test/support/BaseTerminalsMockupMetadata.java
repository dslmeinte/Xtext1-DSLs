package nl.dslmeinte.xtext.sgml.dtd.test.support;

import nl.dslmeinte.xtext.sgml.lexer.AntlrParserFacade;

import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;

/**
 * Class which can be used to mock an {@link AbstractInternalAntlrParser} to
 * feed to {@link AntlrParserFacade#AntlrParserFacade(Class)} and which
 * corresponds to the keywords in the base grammar ({@code Base.xtext}).
 * 
 * @author Meinte Boersma
 */
public class BaseTerminalsMockupMetadata {

	private static int id = 1000;

    public static final int EOF=-1;
	public static final int RULE_SYSTEM_BASE_KEYWORD=id++;
    public static final int RULE_SEMICOLON_SYMBOL=id++;
    public static final int RULE_SLASH_SYMBOL=id++;
    public static final int RULE_DOCTYPE_BASE_KEYWORD=id++;
    public static final int RULE_OPEN_TAG_SYMBOL=id++;
    public static final int RULE_EQUALS_SYMBOL=id++;
    public static final int RULE_IDENTIFIER=id++;
    public static final int RULE_HEADER_COMMENTS=id++;
    public static final int RULE_OPEN_BRACKET_SYMBOL=id++;
    public static final int RULE_QUOTED_STRING=id++;
    public static final int RULE_SISGML_BASE_KEYWORD=id++;
    public static final int RULE_ENTITY_BASE_KEYWORD=id++;
    public static final int RULE_CLOSE_BRACKET_SYMBOL=id++;
    public static final int RULE_PUBLIC_BASE_KEYWORD=id++;
    public static final int RULE_CLOSE_TAG_SYMBOL=id++;
    public static final int RULE_WHITESPACE=id++;
    public static final int RULE_LITERAL_CONTENTS=id++;
    public static final int RULE_SGML_COMMENTS=id++;
    public static final int RULE_AMPERSAND_SYMBOL=id++;

}