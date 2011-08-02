package nl.dslmeinte.xtext.sgml.base.services;

import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverter;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.conversion.impl.AbstractDeclarativeValueConverterService;
import org.eclipse.xtext.conversion.impl.AbstractLexerBasedConverter;
import org.eclipse.xtext.parsetree.AbstractNode;

public class BaseTerminalsConverter extends AbstractDeclarativeValueConverterService {

	@ValueConverter(rule = "QuotedString")
	public IValueConverter<String> QuotedString() {
		return new IValueConverter<String>() {
				@Override
				public String toString(String value) throws ValueConverterException {
					return "\"" + value + "\"";
				}
				@Override
				public String toValue(String string, AbstractNode node) throws ValueConverterException {
					return string.substring(1, string.length()-1);
					// Note that 'node' could be used to determine which characters to escape.
				}
			};
	}

	/**
	 * @return A no-op {@link IValueConverter} to prevent the default-mapped
	 *         {@link AbstractLexerBasedConverter} from raising exceptions due
	 *         to mismatched token types, because we do our own lexing.
	 */
	@ValueConverter(rule = "IDENTIFIER")
	public IValueConverter<String> Identifier() {
		return noOpConverter;
	}

	/**
	 * Singleton {@link IValueConverter} implementation of the
	 * "no operation"-/identity-conversion.
	 */
	private static IValueConverter<String> noOpConverter = new IValueConverter<String>() {
		@Override
		public String toString(String value) throws ValueConverterException {
			return value;
		}
		@Override
		public String toValue(String string, AbstractNode node) throws ValueConverterException {
			return string;
		}
	};

}
