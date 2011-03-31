package nl.dslmeinte.xtext.examples;

import org.eclipse.xtext.common.services.DefaultTerminalConverters;
import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverter;
import org.eclipse.xtext.conversion.impl.AbstractNullSafeConverter;
import org.eclipse.xtext.parsetree.AbstractNode;

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
