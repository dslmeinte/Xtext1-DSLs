package nl.dslmeinte.xtext.sgml.base.services;

import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverter;
import org.eclipse.xtext.conversion.impl.AbstractDeclarativeValueConverterService;
import org.eclipse.xtext.conversion.impl.STRINGValueConverter;

import com.google.inject.Inject;

public class BaseTerminalsConverter extends AbstractDeclarativeValueConverterService {

	@Inject
	private STRINGValueConverter stringValueConverter;
	
	@ValueConverter(rule = "QuotedString")
	public IValueConverter<String> QuotedString() {
		return stringValueConverter;
	}

}
