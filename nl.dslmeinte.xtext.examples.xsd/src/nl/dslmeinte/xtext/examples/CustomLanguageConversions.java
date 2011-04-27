package nl.dslmeinte.xtext.examples;

import java.util.regex.Pattern;

import org.eclipse.xtext.common.services.DefaultTerminalConverters;
import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.IValueConverterService;
import org.eclipse.xtext.conversion.ValueConverter;
import org.eclipse.xtext.conversion.impl.AbstractNullSafeConverter;
import org.eclipse.xtext.parsetree.AbstractNode;

/**
 * Custom {@link IValueConverterService} implementation taking of conversion of
 * the String format (concrete syntax) to the corresponding data type (and vice
 * versa).
 * <p>
 * For this language, this pertains to converting regexp patterns like
 * "/-?\d{1,11}.\d{3}/" into something that's usable as a Java regexp
 * {@link Pattern}.
 */
public class CustomLanguageConversions extends DefaultTerminalConverters {

	@ValueConverter(rule = "PATTERN_STRING")
	public IValueConverter<String> PATTERN_STRING() {
		return new AbstractNullSafeConverter<String>() {
			@Override
			protected String internalToValue(String string, AbstractNode node) {
				return string.substring(1, string.length() - 1).replaceAll("\\/", "/");
			}

			@Override
			protected String internalToString(String value) {
				return "/" + value.replaceAll("/", "\\/") + "/";
			}
		};
	}

}
