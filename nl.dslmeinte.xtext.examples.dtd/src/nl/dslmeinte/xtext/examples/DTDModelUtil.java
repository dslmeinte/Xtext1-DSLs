package nl.dslmeinte.xtext.examples;

import java.util.ArrayList;
import java.util.List;

import nl.dslmeinte.xtext.examples.dTDLanguage.Attribute;
import nl.dslmeinte.xtext.examples.dTDLanguage.AttributeList;
import nl.dslmeinte.xtext.examples.dTDLanguage.DTDDefinition;
import nl.dslmeinte.xtext.examples.dTDLanguage.Definition;
import nl.dslmeinte.xtext.examples.dTDLanguage.Element;

import org.eclipse.emf.ecore.util.EcoreUtil;

public class DTDModelUtil {

	/**
	 * @return all {@link Attribute}s referencing the given {@link Element}.
	 */
	public static List<Attribute> attributes(Element element) {
		List<Attribute> attributes = new ArrayList<Attribute>();
		DTDDefinition root = (DTDDefinition) EcoreUtil.getRootContainer(element);
		for( Definition def : root.getDefinitions() ) {
			if( def instanceof AttributeList ) {
				AttributeList attributeList = (AttributeList) def;
				if( attributeList.getElement() == element ) {
					attributes.addAll(attributeList.getAttributes());
				}
			}
		}
		return attributes;
	}

}
