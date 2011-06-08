package nl.dslmeinte.xtext.sgml.dtd;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import nl.dslmeinte.xtext.examples.DTDLanguageStandaloneSetup;
import nl.dslmeinte.xtext.examples.dTDLanguage.Attribute;
import nl.dslmeinte.xtext.examples.dTDLanguage.AttributeList;
import nl.dslmeinte.xtext.examples.dTDLanguage.DTDDefinition;
import nl.dslmeinte.xtext.examples.dTDLanguage.Definition;
import nl.dslmeinte.xtext.examples.dTDLanguage.Element;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * Class to manage and provide util functionality on DTD files.
 * 
 * @author Meinte Boersma
 */
public class DTDManager {

	static {
		DTDLanguageStandaloneSetup.doSetup();
	}

	private DTDDefinition dtdDefinition;

	public DTDDefinition getDtdDefinition() {
		return dtdDefinition;
	}

	public DTDManager(String path) {
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource resource = resourceSet.createResource(URI.createURI(path));
		try {
			resource.load(new FileInputStream(path), Collections.emptyMap());
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		EcoreUtil.resolveAll(resource);
		dtdDefinition = (DTDDefinition) resource.getContents().get(0);
	}

	public Element getFirstElement() {
		for( Definition definition : dtdDefinition.getDefinitions() ) {
			if( definition instanceof Element ) {
				return (Element) definition;
			}
		}
		throw new IllegalArgumentException("no elements in DTD");
	}

	public Element findElement(String name) {
		for( Definition definition : dtdDefinition.getDefinitions() ) {
			if( definition instanceof Element && (((Element) definition).getName().equalsIgnoreCase(name)) ) {
				return( (Element) definition );
			}
		}
		return null;
	}

	private List<String> keywords = null;

	public List<String> getKeywords() {
		if( keywords != null ) {
			return keywords;
		}

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
		keywords = new ArrayList<String>(keywordsSet);
		return keywords;
	}

}
