package nl.dslmeinte.xtext.examples.validation;

import nl.dslmeinte.xtext.examples.DataModelDslUtil;
import nl.dslmeinte.xtext.examples.dataModelDsl.DataModelDslPackage;
import nl.dslmeinte.xtext.examples.dataModelDsl.Field;
import nl.dslmeinte.xtext.examples.dataModelDsl.Modifier;

import org.eclipse.xtext.validation.Check;
 

public class DataModelDslJavaValidator extends AbstractDataModelDslJavaValidator {

	@Check
	public void check_dataType_only_has_simple_fields(Field field) {
		if(    DataModelDslUtil.isSimple(field)
		    && ( field.getModifier() == Modifier.REPEATED ) ) {
			error( "fields having primitive type can't be 'repeated'", DataModelDslPackage.FIELD__MODIFIER );
		}
	}

}
