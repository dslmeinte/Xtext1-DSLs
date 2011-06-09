package nl.dslmeinte.xtext.sgml.dtd;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import nl.dslmeinte.xtext.dtd.DTDModelUtil;
import nl.dslmeinte.xtext.dtd.DtdLanguageStandaloneSetup;
import nl.dslmeinte.xtext.dtd.dtdModel.DocumentTypeDefinition;
import nl.dslmeinte.xtext.dtd.dtdModel.Element;

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
		DtdLanguageStandaloneSetup.doSetup();
	}

	private DocumentTypeDefinition dtd;

	public DocumentTypeDefinition getDTD() {
		return dtd;
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
		dtd = (DocumentTypeDefinition) resource.getContents().get(0);
	}

	private Map<String, Element> elementCache = new HashMap<String, Element>();

	public Element findElement(String name) {
		Element element = elementCache.get(name);
		if( element == null ) {
			element = DTDModelUtil.findElement(name, dtd);
			elementCache.put(name, element);
		}
		return element;
	}

	private List<String> keywords = null;

	public List<String> getKeywords() {
		if( keywords != null ) {
			return keywords;
		}

		keywords = new ArrayList<String>(DTDModelUtil.getKeywords(dtd));
		return keywords;
	}

}
