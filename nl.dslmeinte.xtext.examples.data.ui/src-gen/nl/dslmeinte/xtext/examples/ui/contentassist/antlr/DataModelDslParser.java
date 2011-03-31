/*
* generated by Xtext
*/
package nl.dslmeinte.xtext.examples.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import nl.dslmeinte.xtext.examples.services.DataModelDslGrammarAccess;

public class DataModelDslParser extends AbstractContentAssistParser {
	
	@Inject
	private DataModelDslGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected nl.dslmeinte.xtext.examples.ui.contentassist.antlr.internal.InternalDataModelDslParser createParser() {
		nl.dslmeinte.xtext.examples.ui.contentassist.antlr.internal.InternalDataModelDslParser result = new nl.dslmeinte.xtext.examples.ui.contentassist.antlr.internal.InternalDataModelDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getTypeAccess().getAlternatives(), "rule__Type__Alternatives");
					put(grammarAccess.getCompoundTypeAccess().getAlternatives(), "rule__CompoundType__Alternatives");
					put(grammarAccess.getPrimitiveTypeAccess().getAlternatives_1(), "rule__PrimitiveType__Alternatives_1");
					put(grammarAccess.getSimpleTypeAccess().getAlternatives(), "rule__SimpleType__Alternatives");
					put(grammarAccess.getFeatureAccess().getAlternatives(), "rule__Feature__Alternatives");
					put(grammarAccess.getMetaPrimitiveTypeAccess().getAlternatives(), "rule__MetaPrimitiveType__Alternatives");
					put(grammarAccess.getModifierAccess().getAlternatives(), "rule__Modifier__Alternatives");
					put(grammarAccess.getDataModelAccess().getGroup(), "rule__DataModel__Group__0");
					put(grammarAccess.getPrimitiveTypesAccess().getGroup(), "rule__PrimitiveTypes__Group__0");
					put(grammarAccess.getPrimitiveTypeAccess().getGroup(), "rule__PrimitiveType__Group__0");
					put(grammarAccess.getPrimitiveTypeAccess().getGroup_1_0(), "rule__PrimitiveType__Group_1_0__0");
					put(grammarAccess.getPrimitiveTypeAccess().getGroup_1_1(), "rule__PrimitiveType__Group_1_1__0");
					put(grammarAccess.getDataTypeAccess().getGroup(), "rule__DataType__Group__0");
					put(grammarAccess.getFieldAccess().getGroup(), "rule__Field__Group__0");
					put(grammarAccess.getEnumerationAccess().getGroup(), "rule__Enumeration__Group__0");
					put(grammarAccess.getEntityAccess().getGroup(), "rule__Entity__Group__0");
					put(grammarAccess.getEntityAccess().getGroup_3(), "rule__Entity__Group_3__0");
					put(grammarAccess.getConstraintAccess().getGroup(), "rule__Constraint__Group__0");
					put(grammarAccess.getFunctionAccess().getGroup(), "rule__Function__Group__0");
					put(grammarAccess.getFunctionAccess().getGroup_4(), "rule__Function__Group_4__0");
					put(grammarAccess.getArgumentAccess().getGroup(), "rule__Argument__Group__0");
					put(grammarAccess.getDataModelAccess().getPrimitivesAssignment_0(), "rule__DataModel__PrimitivesAssignment_0");
					put(grammarAccess.getDataModelAccess().getCompoundTypesAssignment_1(), "rule__DataModel__CompoundTypesAssignment_1");
					put(grammarAccess.getPrimitiveTypesAccess().getPrimitiveTypesAssignment_3(), "rule__PrimitiveTypes__PrimitiveTypesAssignment_3");
					put(grammarAccess.getPrimitiveTypeAccess().getNameAssignment_0(), "rule__PrimitiveType__NameAssignment_0");
					put(grammarAccess.getPrimitiveTypeAccess().getSuperTypeAssignment_1_0_1(), "rule__PrimitiveType__SuperTypeAssignment_1_0_1");
					put(grammarAccess.getPrimitiveTypeAccess().getRealizationTypeAssignment_1_1_1(), "rule__PrimitiveType__RealizationTypeAssignment_1_1_1");
					put(grammarAccess.getDataTypeAccess().getNameAssignment_1(), "rule__DataType__NameAssignment_1");
					put(grammarAccess.getDataTypeAccess().getFieldsAssignment_3(), "rule__DataType__FieldsAssignment_3");
					put(grammarAccess.getDataTypeAccess().getConstraintsAssignment_4(), "rule__DataType__ConstraintsAssignment_4");
					put(grammarAccess.getDataTypeAccess().getFunctionsAssignment_5(), "rule__DataType__FunctionsAssignment_5");
					put(grammarAccess.getFieldAccess().getModifierAssignment_0(), "rule__Field__ModifierAssignment_0");
					put(grammarAccess.getFieldAccess().getNameAssignment_1(), "rule__Field__NameAssignment_1");
					put(grammarAccess.getFieldAccess().getTypeAssignment_3(), "rule__Field__TypeAssignment_3");
					put(grammarAccess.getEnumerationAccess().getNameAssignment_1(), "rule__Enumeration__NameAssignment_1");
					put(grammarAccess.getEnumerationAccess().getLiteralsAssignment_3(), "rule__Enumeration__LiteralsAssignment_3");
					put(grammarAccess.getEnumLiteralAccess().getNameAssignment(), "rule__EnumLiteral__NameAssignment");
					put(grammarAccess.getEntityAccess().getTransientAssignment_0_0(), "rule__Entity__TransientAssignment_0_0");
					put(grammarAccess.getEntityAccess().getAbstractAssignment_0_1(), "rule__Entity__AbstractAssignment_0_1");
					put(grammarAccess.getEntityAccess().getNameAssignment_2(), "rule__Entity__NameAssignment_2");
					put(grammarAccess.getEntityAccess().getSuperTypeAssignment_3_1(), "rule__Entity__SuperTypeAssignment_3_1");
					put(grammarAccess.getEntityAccess().getFieldsAssignment_5(), "rule__Entity__FieldsAssignment_5");
					put(grammarAccess.getEntityAccess().getConstraintsAssignment_6(), "rule__Entity__ConstraintsAssignment_6");
					put(grammarAccess.getEntityAccess().getFunctionsAssignment_7(), "rule__Entity__FunctionsAssignment_7");
					put(grammarAccess.getConstraintAccess().getNameAssignment_1(), "rule__Constraint__NameAssignment_1");
					put(grammarAccess.getConstraintAccess().getSlotsAssignment_3(), "rule__Constraint__SlotsAssignment_3");
					put(grammarAccess.getUsageAccess().getFieldAssignment(), "rule__Usage__FieldAssignment");
					put(grammarAccess.getFunctionAccess().getNameAssignment_1(), "rule__Function__NameAssignment_1");
					put(grammarAccess.getFunctionAccess().getReturnTypeAssignment_3(), "rule__Function__ReturnTypeAssignment_3");
					put(grammarAccess.getFunctionAccess().getArgumentsAssignment_4_1(), "rule__Function__ArgumentsAssignment_4_1");
					put(grammarAccess.getArgumentAccess().getTypeAssignment_0(), "rule__Argument__TypeAssignment_0");
					put(grammarAccess.getArgumentAccess().getNameAssignment_1(), "rule__Argument__NameAssignment_1");
					put(grammarAccess.getEntityAccess().getUnorderedGroup_0(), "rule__Entity__UnorderedGroup_0");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			nl.dslmeinte.xtext.examples.ui.contentassist.antlr.internal.InternalDataModelDslParser typedParser = (nl.dslmeinte.xtext.examples.ui.contentassist.antlr.internal.InternalDataModelDslParser) parser;
			typedParser.entryRuleDataModel();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public DataModelDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(DataModelDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
