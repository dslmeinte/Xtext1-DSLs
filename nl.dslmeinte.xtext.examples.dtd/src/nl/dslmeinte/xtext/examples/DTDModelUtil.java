package nl.dslmeinte.xtext.examples;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import nl.dslmeinte.xtext.examples.dTDLanguage.Attribute;
import nl.dslmeinte.xtext.examples.dTDLanguage.AttributeList;
import nl.dslmeinte.xtext.examples.dTDLanguage.DTDDefinition;
import nl.dslmeinte.xtext.examples.dTDLanguage.Definition;
import nl.dslmeinte.xtext.examples.dTDLanguage.Element;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * Util class to interrogate {@link DTDDefinition} instances/models and some of
 * their members.
 * 
 * @author Meinte Boersma
 */
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

	/**
	 * @return the first {@link Element} in the given {@link DTDDefinition}.
	 */
	public static Element getFirstElement(DTDDefinition dtdDefinition) {
		for( Definition definition : dtdDefinition.getDefinitions() ) {
			if( definition instanceof Element ) {
				return (Element) definition;
			}
		}
		throw new IllegalArgumentException("no elements in DTD");
	}

	/**
	 * @return a {@link Set} (of {@link String}s) of all tag keywords in the
	 *         given {@link DTDDefinition}.
	 */
	public static Set<String> getKeywords(DTDDefinition dtdDefinition) {
		Set<String> keywordsSet = new HashSet<String>();
		for( Definition definition : dtdDefinition.getDefinitions() ) {
			if( definition instanceof Element ) {
				keywordsSet.add(((Element) definition).getName());
			}
			if( definition instanceof AttributeList ) {
				for( Attribute attribute : ((AttributeList) definition).getAttributes() ) {
					keywordsSet.add(attribute.getName());
				}
			}
		}
		return keywordsSet;
	}

	/**
	 * @return the {@link Element} in the given {@link DTDDefinition} with the
	 *         given name or {@code null} if none could be found.
	 */
	public static Element findElement(String name, DTDDefinition dtdDefinition) {
		for( Definition definition : dtdDefinition.getDefinitions() ) {
			if( definition instanceof Element && (((Element) definition).getName().equalsIgnoreCase(name)) ) {
				return( (Element) definition );
			}
		}
		return null;
	}

}
