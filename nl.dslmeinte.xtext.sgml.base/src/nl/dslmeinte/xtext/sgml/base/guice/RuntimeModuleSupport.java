package nl.dslmeinte.xtext.sgml.base.guice;

import nl.dslmeinte.xtext.sgml.base.services.BaseTerminalsConverter;
import nl.dslmeinte.xtext.sgml.lexer.SgmlLexerForParsing;

import org.eclipse.xtext.conversion.IValueConverterService;

import com.google.inject.Binder;
import com.google.inject.name.Names;

public class RuntimeModuleSupport {

	public static void configureRuntimeLexer(Binder binder) {
		binder
			.bind(org.eclipse.xtext.parser.antlr.Lexer.class)
			.annotatedWith(Names.named(org.eclipse.xtext.parser.antlr.LexerBindings.RUNTIME))
			.to(SgmlLexerForParsing.class);
	}

	public static Class<? extends IValueConverterService> bindIValueConverterService() {
		return BaseTerminalsConverter.class;
	}

}
