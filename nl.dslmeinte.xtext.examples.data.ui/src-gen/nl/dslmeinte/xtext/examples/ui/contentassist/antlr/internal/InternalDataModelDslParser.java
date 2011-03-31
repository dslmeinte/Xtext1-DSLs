package nl.dslmeinte.xtext.examples.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import nl.dslmeinte.xtext.examples.services.DataModelDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDataModelDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'string'", "'int'", "'number'", "'boolean'", "'optional'", "'required'", "'repeated'", "'primitive-types'", "'{'", "'}'", "'extends'", "'->'", "'datatype'", "':'", "'enum'", "'entity'", "'constraint'", "'uses'", "'function'", "'('", "')'", "'transient'", "'abstract'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int RULE_WS=9;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;

        public InternalDataModelDslParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g"; }


     
     	private DataModelDslGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(DataModelDslGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start entryRuleDataModel
    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:61:1: entryRuleDataModel : ruleDataModel EOF ;
    public final void entryRuleDataModel() throws RecognitionException {
        try {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:62:1: ( ruleDataModel EOF )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:63:1: ruleDataModel EOF
            {
             before(grammarAccess.getDataModelRule()); 
            pushFollow(FOLLOW_ruleDataModel_in_entryRuleDataModel61);
            ruleDataModel();
            _fsp--;

             after(grammarAccess.getDataModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataModel68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleDataModel


    // $ANTLR start ruleDataModel
    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:70:1: ruleDataModel : ( ( rule__DataModel__Group__0 ) ) ;
    public final void ruleDataModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:74:2: ( ( ( rule__DataModel__Group__0 ) ) )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:75:1: ( ( rule__DataModel__Group__0 ) )
            {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:75:1: ( ( rule__DataModel__Group__0 ) )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:76:1: ( rule__DataModel__Group__0 )
            {
             before(grammarAccess.getDataModelAccess().getGroup()); 
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:77:1: ( rule__DataModel__Group__0 )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:77:2: rule__DataModel__Group__0
            {
            pushFollow(FOLLOW_rule__DataModel__Group__0_in_ruleDataModel94);
            rule__DataModel__Group__0();
            _fsp--;


            }

             after(grammarAccess.getDataModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleDataModel


    // $ANTLR start entryRuleCompoundType
    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:91:1: entryRuleCompoundType : ruleCompoundType EOF ;
    public final void entryRuleCompoundType() throws RecognitionException {
        try {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:92:1: ( ruleCompoundType EOF )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:93:1: ruleCompoundType EOF
            {
             before(grammarAccess.getCompoundTypeRule()); 
            pushFollow(FOLLOW_ruleCompoundType_in_entryRuleCompoundType123);
            ruleCompoundType();
            _fsp--;

             after(grammarAccess.getCompoundTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompoundType130); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleCompoundType


    // $ANTLR start ruleCompoundType
    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:100:1: ruleCompoundType : ( ( rule__CompoundType__Alternatives ) ) ;
    public final void ruleCompoundType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:104:2: ( ( ( rule__CompoundType__Alternatives ) ) )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:105:1: ( ( rule__CompoundType__Alternatives ) )
            {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:105:1: ( ( rule__CompoundType__Alternatives ) )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:106:1: ( rule__CompoundType__Alternatives )
            {
             before(grammarAccess.getCompoundTypeAccess().getAlternatives()); 
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:107:1: ( rule__CompoundType__Alternatives )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:107:2: rule__CompoundType__Alternatives
            {
            pushFollow(FOLLOW_rule__CompoundType__Alternatives_in_ruleCompoundType156);
            rule__CompoundType__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getCompoundTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleCompoundType


    // $ANTLR start entryRulePrimitiveTypes
    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:119:1: entryRulePrimitiveTypes : rulePrimitiveTypes EOF ;
    public final void entryRulePrimitiveTypes() throws RecognitionException {
        try {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:120:1: ( rulePrimitiveTypes EOF )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:121:1: rulePrimitiveTypes EOF
            {
             before(grammarAccess.getPrimitiveTypesRule()); 
            pushFollow(FOLLOW_rulePrimitiveTypes_in_entryRulePrimitiveTypes183);
            rulePrimitiveTypes();
            _fsp--;

             after(grammarAccess.getPrimitiveTypesRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitiveTypes190); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRulePrimitiveTypes


    // $ANTLR start rulePrimitiveTypes
    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:128:1: rulePrimitiveTypes : ( ( rule__PrimitiveTypes__Group__0 ) ) ;
    public final void rulePrimitiveTypes() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:132:2: ( ( ( rule__PrimitiveTypes__Group__0 ) ) )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:133:1: ( ( rule__PrimitiveTypes__Group__0 ) )
            {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:133:1: ( ( rule__PrimitiveTypes__Group__0 ) )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:134:1: ( rule__PrimitiveTypes__Group__0 )
            {
             before(grammarAccess.getPrimitiveTypesAccess().getGroup()); 
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:135:1: ( rule__PrimitiveTypes__Group__0 )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:135:2: rule__PrimitiveTypes__Group__0
            {
            pushFollow(FOLLOW_rule__PrimitiveTypes__Group__0_in_rulePrimitiveTypes216);
            rule__PrimitiveTypes__Group__0();
            _fsp--;


            }

             after(grammarAccess.getPrimitiveTypesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rulePrimitiveTypes


    // $ANTLR start entryRulePrimitiveType
    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:147:1: entryRulePrimitiveType : rulePrimitiveType EOF ;
    public final void entryRulePrimitiveType() throws RecognitionException {
        try {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:148:1: ( rulePrimitiveType EOF )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:149:1: rulePrimitiveType EOF
            {
             before(grammarAccess.getPrimitiveTypeRule()); 
            pushFollow(FOLLOW_rulePrimitiveType_in_entryRulePrimitiveType243);
            rulePrimitiveType();
            _fsp--;

             after(grammarAccess.getPrimitiveTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitiveType250); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRulePrimitiveType


    // $ANTLR start rulePrimitiveType
    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:156:1: rulePrimitiveType : ( ( rule__PrimitiveType__Group__0 ) ) ;
    public final void rulePrimitiveType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:160:2: ( ( ( rule__PrimitiveType__Group__0 ) ) )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:161:1: ( ( rule__PrimitiveType__Group__0 ) )
            {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:161:1: ( ( rule__PrimitiveType__Group__0 ) )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:162:1: ( rule__PrimitiveType__Group__0 )
            {
             before(grammarAccess.getPrimitiveTypeAccess().getGroup()); 
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:163:1: ( rule__PrimitiveType__Group__0 )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:163:2: rule__PrimitiveType__Group__0
            {
            pushFollow(FOLLOW_rule__PrimitiveType__Group__0_in_rulePrimitiveType276);
            rule__PrimitiveType__Group__0();
            _fsp--;


            }

             after(grammarAccess.getPrimitiveTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rulePrimitiveType


    // $ANTLR start entryRuleDataType
    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:175:1: entryRuleDataType : ruleDataType EOF ;
    public final void entryRuleDataType() throws RecognitionException {
        try {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:176:1: ( ruleDataType EOF )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:177:1: ruleDataType EOF
            {
             before(grammarAccess.getDataTypeRule()); 
            pushFollow(FOLLOW_ruleDataType_in_entryRuleDataType303);
            ruleDataType();
            _fsp--;

             after(grammarAccess.getDataTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataType310); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleDataType


    // $ANTLR start ruleDataType
    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:184:1: ruleDataType : ( ( rule__DataType__Group__0 ) ) ;
    public final void ruleDataType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:188:2: ( ( ( rule__DataType__Group__0 ) ) )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:189:1: ( ( rule__DataType__Group__0 ) )
            {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:189:1: ( ( rule__DataType__Group__0 ) )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:190:1: ( rule__DataType__Group__0 )
            {
             before(grammarAccess.getDataTypeAccess().getGroup()); 
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:191:1: ( rule__DataType__Group__0 )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:191:2: rule__DataType__Group__0
            {
            pushFollow(FOLLOW_rule__DataType__Group__0_in_ruleDataType336);
            rule__DataType__Group__0();
            _fsp--;


            }

             after(grammarAccess.getDataTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleDataType


    // $ANTLR start entryRuleField
    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:203:1: entryRuleField : ruleField EOF ;
    public final void entryRuleField() throws RecognitionException {
        try {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:204:1: ( ruleField EOF )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:205:1: ruleField EOF
            {
             before(grammarAccess.getFieldRule()); 
            pushFollow(FOLLOW_ruleField_in_entryRuleField363);
            ruleField();
            _fsp--;

             after(grammarAccess.getFieldRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleField370); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleField


    // $ANTLR start ruleField
    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:212:1: ruleField : ( ( rule__Field__Group__0 ) ) ;
    public final void ruleField() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:216:2: ( ( ( rule__Field__Group__0 ) ) )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:217:1: ( ( rule__Field__Group__0 ) )
            {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:217:1: ( ( rule__Field__Group__0 ) )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:218:1: ( rule__Field__Group__0 )
            {
             before(grammarAccess.getFieldAccess().getGroup()); 
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:219:1: ( rule__Field__Group__0 )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:219:2: rule__Field__Group__0
            {
            pushFollow(FOLLOW_rule__Field__Group__0_in_ruleField396);
            rule__Field__Group__0();
            _fsp--;


            }

             after(grammarAccess.getFieldAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleField


    // $ANTLR start entryRuleEnumeration
    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:231:1: entryRuleEnumeration : ruleEnumeration EOF ;
    public final void entryRuleEnumeration() throws RecognitionException {
        try {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:232:1: ( ruleEnumeration EOF )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:233:1: ruleEnumeration EOF
            {
             before(grammarAccess.getEnumerationRule()); 
            pushFollow(FOLLOW_ruleEnumeration_in_entryRuleEnumeration423);
            ruleEnumeration();
            _fsp--;

             after(grammarAccess.getEnumerationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumeration430); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleEnumeration


    // $ANTLR start ruleEnumeration
    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:240:1: ruleEnumeration : ( ( rule__Enumeration__Group__0 ) ) ;
    public final void ruleEnumeration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:244:2: ( ( ( rule__Enumeration__Group__0 ) ) )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:245:1: ( ( rule__Enumeration__Group__0 ) )
            {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:245:1: ( ( rule__Enumeration__Group__0 ) )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:246:1: ( rule__Enumeration__Group__0 )
            {
             before(grammarAccess.getEnumerationAccess().getGroup()); 
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:247:1: ( rule__Enumeration__Group__0 )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:247:2: rule__Enumeration__Group__0
            {
            pushFollow(FOLLOW_rule__Enumeration__Group__0_in_ruleEnumeration456);
            rule__Enumeration__Group__0();
            _fsp--;


            }

             after(grammarAccess.getEnumerationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleEnumeration


    // $ANTLR start entryRuleEnumLiteral
    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:259:1: entryRuleEnumLiteral : ruleEnumLiteral EOF ;
    public final void entryRuleEnumLiteral() throws RecognitionException {
        try {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:260:1: ( ruleEnumLiteral EOF )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:261:1: ruleEnumLiteral EOF
            {
             before(grammarAccess.getEnumLiteralRule()); 
            pushFollow(FOLLOW_ruleEnumLiteral_in_entryRuleEnumLiteral483);
            ruleEnumLiteral();
            _fsp--;

             after(grammarAccess.getEnumLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumLiteral490); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleEnumLiteral


    // $ANTLR start ruleEnumLiteral
    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:268:1: ruleEnumLiteral : ( ( rule__EnumLiteral__NameAssignment ) ) ;
    public final void ruleEnumLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:272:2: ( ( ( rule__EnumLiteral__NameAssignment ) ) )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:273:1: ( ( rule__EnumLiteral__NameAssignment ) )
            {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:273:1: ( ( rule__EnumLiteral__NameAssignment ) )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:274:1: ( rule__EnumLiteral__NameAssignment )
            {
             before(grammarAccess.getEnumLiteralAccess().getNameAssignment()); 
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:275:1: ( rule__EnumLiteral__NameAssignment )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:275:2: rule__EnumLiteral__NameAssignment
            {
            pushFollow(FOLLOW_rule__EnumLiteral__NameAssignment_in_ruleEnumLiteral516);
            rule__EnumLiteral__NameAssignment();
            _fsp--;


            }

             after(grammarAccess.getEnumLiteralAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleEnumLiteral


    // $ANTLR start entryRuleEntity
    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:287:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:288:1: ( ruleEntity EOF )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:289:1: ruleEntity EOF
            {
             before(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_ruleEntity_in_entryRuleEntity543);
            ruleEntity();
            _fsp--;

             after(grammarAccess.getEntityRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntity550); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleEntity


    // $ANTLR start ruleEntity
    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:296:1: ruleEntity : ( ( rule__Entity__Group__0 ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:300:2: ( ( ( rule__Entity__Group__0 ) ) )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:301:1: ( ( rule__Entity__Group__0 ) )
            {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:301:1: ( ( rule__Entity__Group__0 ) )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:302:1: ( rule__Entity__Group__0 )
            {
             before(grammarAccess.getEntityAccess().getGroup()); 
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:303:1: ( rule__Entity__Group__0 )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:303:2: rule__Entity__Group__0
            {
            pushFollow(FOLLOW_rule__Entity__Group__0_in_ruleEntity576);
            rule__Entity__Group__0();
            _fsp--;


            }

             after(grammarAccess.getEntityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleEntity


    // $ANTLR start entryRuleConstraint
    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:315:1: entryRuleConstraint : ruleConstraint EOF ;
    public final void entryRuleConstraint() throws RecognitionException {
        try {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:316:1: ( ruleConstraint EOF )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:317:1: ruleConstraint EOF
            {
             before(grammarAccess.getConstraintRule()); 
            pushFollow(FOLLOW_ruleConstraint_in_entryRuleConstraint603);
            ruleConstraint();
            _fsp--;

             after(grammarAccess.getConstraintRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstraint610); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleConstraint


    // $ANTLR start ruleConstraint
    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:324:1: ruleConstraint : ( ( rule__Constraint__Group__0 ) ) ;
    public final void ruleConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:328:2: ( ( ( rule__Constraint__Group__0 ) ) )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:329:1: ( ( rule__Constraint__Group__0 ) )
            {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:329:1: ( ( rule__Constraint__Group__0 ) )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:330:1: ( rule__Constraint__Group__0 )
            {
             before(grammarAccess.getConstraintAccess().getGroup()); 
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:331:1: ( rule__Constraint__Group__0 )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:331:2: rule__Constraint__Group__0
            {
            pushFollow(FOLLOW_rule__Constraint__Group__0_in_ruleConstraint636);
            rule__Constraint__Group__0();
            _fsp--;


            }

             after(grammarAccess.getConstraintAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleConstraint


    // $ANTLR start entryRuleUsage
    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:343:1: entryRuleUsage : ruleUsage EOF ;
    public final void entryRuleUsage() throws RecognitionException {
        try {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:344:1: ( ruleUsage EOF )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:345:1: ruleUsage EOF
            {
             before(grammarAccess.getUsageRule()); 
            pushFollow(FOLLOW_ruleUsage_in_entryRuleUsage663);
            ruleUsage();
            _fsp--;

             after(grammarAccess.getUsageRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUsage670); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleUsage


    // $ANTLR start ruleUsage
    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:352:1: ruleUsage : ( ( rule__Usage__FieldAssignment ) ) ;
    public final void ruleUsage() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:356:2: ( ( ( rule__Usage__FieldAssignment ) ) )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:357:1: ( ( rule__Usage__FieldAssignment ) )
            {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:357:1: ( ( rule__Usage__FieldAssignment ) )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:358:1: ( rule__Usage__FieldAssignment )
            {
             before(grammarAccess.getUsageAccess().getFieldAssignment()); 
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:359:1: ( rule__Usage__FieldAssignment )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:359:2: rule__Usage__FieldAssignment
            {
            pushFollow(FOLLOW_rule__Usage__FieldAssignment_in_ruleUsage696);
            rule__Usage__FieldAssignment();
            _fsp--;


            }

             after(grammarAccess.getUsageAccess().getFieldAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleUsage


    // $ANTLR start entryRuleFunction
    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:371:1: entryRuleFunction : ruleFunction EOF ;
    public final void entryRuleFunction() throws RecognitionException {
        try {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:372:1: ( ruleFunction EOF )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:373:1: ruleFunction EOF
            {
             before(grammarAccess.getFunctionRule()); 
            pushFollow(FOLLOW_ruleFunction_in_entryRuleFunction723);
            ruleFunction();
            _fsp--;

             after(grammarAccess.getFunctionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunction730); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleFunction


    // $ANTLR start ruleFunction
    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:380:1: ruleFunction : ( ( rule__Function__Group__0 ) ) ;
    public final void ruleFunction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:384:2: ( ( ( rule__Function__Group__0 ) ) )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:385:1: ( ( rule__Function__Group__0 ) )
            {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:385:1: ( ( rule__Function__Group__0 ) )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:386:1: ( rule__Function__Group__0 )
            {
             before(grammarAccess.getFunctionAccess().getGroup()); 
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:387:1: ( rule__Function__Group__0 )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:387:2: rule__Function__Group__0
            {
            pushFollow(FOLLOW_rule__Function__Group__0_in_ruleFunction756);
            rule__Function__Group__0();
            _fsp--;


            }

             after(grammarAccess.getFunctionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleFunction


    // $ANTLR start entryRuleArgument
    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:399:1: entryRuleArgument : ruleArgument EOF ;
    public final void entryRuleArgument() throws RecognitionException {
        try {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:400:1: ( ruleArgument EOF )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:401:1: ruleArgument EOF
            {
             before(grammarAccess.getArgumentRule()); 
            pushFollow(FOLLOW_ruleArgument_in_entryRuleArgument783);
            ruleArgument();
            _fsp--;

             after(grammarAccess.getArgumentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArgument790); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleArgument


    // $ANTLR start ruleArgument
    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:408:1: ruleArgument : ( ( rule__Argument__Group__0 ) ) ;
    public final void ruleArgument() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:412:2: ( ( ( rule__Argument__Group__0 ) ) )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:413:1: ( ( rule__Argument__Group__0 ) )
            {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:413:1: ( ( rule__Argument__Group__0 ) )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:414:1: ( rule__Argument__Group__0 )
            {
             before(grammarAccess.getArgumentAccess().getGroup()); 
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:415:1: ( rule__Argument__Group__0 )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:415:2: rule__Argument__Group__0
            {
            pushFollow(FOLLOW_rule__Argument__Group__0_in_ruleArgument816);
            rule__Argument__Group__0();
            _fsp--;


            }

             after(grammarAccess.getArgumentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleArgument


    // $ANTLR start ruleMetaPrimitiveType
    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:432:1: ruleMetaPrimitiveType : ( ( rule__MetaPrimitiveType__Alternatives ) ) ;
    public final void ruleMetaPrimitiveType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:436:1: ( ( ( rule__MetaPrimitiveType__Alternatives ) ) )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:437:1: ( ( rule__MetaPrimitiveType__Alternatives ) )
            {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:437:1: ( ( rule__MetaPrimitiveType__Alternatives ) )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:438:1: ( rule__MetaPrimitiveType__Alternatives )
            {
             before(grammarAccess.getMetaPrimitiveTypeAccess().getAlternatives()); 
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:439:1: ( rule__MetaPrimitiveType__Alternatives )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:439:2: rule__MetaPrimitiveType__Alternatives
            {
            pushFollow(FOLLOW_rule__MetaPrimitiveType__Alternatives_in_ruleMetaPrimitiveType857);
            rule__MetaPrimitiveType__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getMetaPrimitiveTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleMetaPrimitiveType


    // $ANTLR start ruleModifier
    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:451:1: ruleModifier : ( ( rule__Modifier__Alternatives ) ) ;
    public final void ruleModifier() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:455:1: ( ( ( rule__Modifier__Alternatives ) ) )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:456:1: ( ( rule__Modifier__Alternatives ) )
            {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:456:1: ( ( rule__Modifier__Alternatives ) )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:457:1: ( rule__Modifier__Alternatives )
            {
             before(grammarAccess.getModifierAccess().getAlternatives()); 
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:458:1: ( rule__Modifier__Alternatives )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:458:2: rule__Modifier__Alternatives
            {
            pushFollow(FOLLOW_rule__Modifier__Alternatives_in_ruleModifier893);
            rule__Modifier__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getModifierAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleModifier


    // $ANTLR start rule__CompoundType__Alternatives
    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:470:1: rule__CompoundType__Alternatives : ( ( ruleDataType ) | ( ruleEnumeration ) | ( ruleEntity ) );
    public final void rule__CompoundType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:474:1: ( ( ruleDataType ) | ( ruleEnumeration ) | ( ruleEntity ) )
            int alt1=3;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==23) ) {
                alt1=1;
            }
            else if ( (LA1_0==25) ) {
                alt1=2;
            }
            else if ( LA1_0 ==32 && getUnorderedGroupHelper().canSelect(grammarAccess.getEntityAccess().getUnorderedGroup_0(), 0) ) {
                alt1=3;
            }
            else if ( LA1_0 ==33 && getUnorderedGroupHelper().canSelect(grammarAccess.getEntityAccess().getUnorderedGroup_0(), 1) ) {
                alt1=3;
            }
            else if ( (LA1_0==26) ) {
                alt1=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("470:1: rule__CompoundType__Alternatives : ( ( ruleDataType ) | ( ruleEnumeration ) | ( ruleEntity ) );", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:475:1: ( ruleDataType )
                    {
                    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:475:1: ( ruleDataType )
                    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:476:1: ruleDataType
                    {
                     before(grammarAccess.getCompoundTypeAccess().getDataTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleDataType_in_rule__CompoundType__Alternatives929);
                    ruleDataType();
                    _fsp--;

                     after(grammarAccess.getCompoundTypeAccess().getDataTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:481:6: ( ruleEnumeration )
                    {
                    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:481:6: ( ruleEnumeration )
                    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:482:1: ruleEnumeration
                    {
                     before(grammarAccess.getCompoundTypeAccess().getEnumerationParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleEnumeration_in_rule__CompoundType__Alternatives946);
                    ruleEnumeration();
                    _fsp--;

                     after(grammarAccess.getCompoundTypeAccess().getEnumerationParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:487:6: ( ruleEntity )
                    {
                    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:487:6: ( ruleEntity )
                    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:488:1: ruleEntity
                    {
                     before(grammarAccess.getCompoundTypeAccess().getEntityParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleEntity_in_rule__CompoundType__Alternatives963);
                    ruleEntity();
                    _fsp--;

                     after(grammarAccess.getCompoundTypeAccess().getEntityParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CompoundType__Alternatives


    // $ANTLR start rule__PrimitiveType__Alternatives_1
    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:498:1: rule__PrimitiveType__Alternatives_1 : ( ( ( rule__PrimitiveType__Group_1_0__0 ) ) | ( ( rule__PrimitiveType__Group_1_1__0 )? ) );
    public final void rule__PrimitiveType__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:502:1: ( ( ( rule__PrimitiveType__Group_1_0__0 ) ) | ( ( rule__PrimitiveType__Group_1_1__0 )? ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==21) ) {
                alt3=1;
            }
            else if ( (LA3_0==EOF||LA3_0==RULE_ID||LA3_0==20||LA3_0==22) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("498:1: rule__PrimitiveType__Alternatives_1 : ( ( ( rule__PrimitiveType__Group_1_0__0 ) ) | ( ( rule__PrimitiveType__Group_1_1__0 )? ) );", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:503:1: ( ( rule__PrimitiveType__Group_1_0__0 ) )
                    {
                    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:503:1: ( ( rule__PrimitiveType__Group_1_0__0 ) )
                    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:504:1: ( rule__PrimitiveType__Group_1_0__0 )
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getGroup_1_0()); 
                    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:505:1: ( rule__PrimitiveType__Group_1_0__0 )
                    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:505:2: rule__PrimitiveType__Group_1_0__0
                    {
                    pushFollow(FOLLOW_rule__PrimitiveType__Group_1_0__0_in_rule__PrimitiveType__Alternatives_1995);
                    rule__PrimitiveType__Group_1_0__0();
                    _fsp--;


                    }

                     after(grammarAccess.getPrimitiveTypeAccess().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:509:6: ( ( rule__PrimitiveType__Group_1_1__0 )? )
                    {
                    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:509:6: ( ( rule__PrimitiveType__Group_1_1__0 )? )
                    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:510:1: ( rule__PrimitiveType__Group_1_1__0 )?
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getGroup_1_1()); 
                    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:511:1: ( rule__PrimitiveType__Group_1_1__0 )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==22) ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:511:2: rule__PrimitiveType__Group_1_1__0
                            {
                            pushFollow(FOLLOW_rule__PrimitiveType__Group_1_1__0_in_rule__PrimitiveType__Alternatives_11013);
                            rule__PrimitiveType__Group_1_1__0();
                            _fsp--;


                            }
                            break;

                    }

                     after(grammarAccess.getPrimitiveTypeAccess().getGroup_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PrimitiveType__Alternatives_1


    // $ANTLR start rule__MetaPrimitiveType__Alternatives
    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:522:1: rule__MetaPrimitiveType__Alternatives : ( ( ( 'string' ) ) | ( ( 'int' ) ) | ( ( 'number' ) ) | ( ( 'boolean' ) ) );
    public final void rule__MetaPrimitiveType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:526:1: ( ( ( 'string' ) ) | ( ( 'int' ) ) | ( ( 'number' ) ) | ( ( 'boolean' ) ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt4=1;
                }
                break;
            case 12:
                {
                alt4=2;
                }
                break;
            case 13:
                {
                alt4=3;
                }
                break;
            case 14:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("522:1: rule__MetaPrimitiveType__Alternatives : ( ( ( 'string' ) ) | ( ( 'int' ) ) | ( ( 'number' ) ) | ( ( 'boolean' ) ) );", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:527:1: ( ( 'string' ) )
                    {
                    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:527:1: ( ( 'string' ) )
                    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:528:1: ( 'string' )
                    {
                     before(grammarAccess.getMetaPrimitiveTypeAccess().getStringEnumLiteralDeclaration_0()); 
                    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:529:1: ( 'string' )
                    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:529:3: 'string'
                    {
                    match(input,11,FOLLOW_11_in_rule__MetaPrimitiveType__Alternatives1050); 

                    }

                     after(grammarAccess.getMetaPrimitiveTypeAccess().getStringEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:534:6: ( ( 'int' ) )
                    {
                    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:534:6: ( ( 'int' ) )
                    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:535:1: ( 'int' )
                    {
                     before(grammarAccess.getMetaPrimitiveTypeAccess().getIntEnumLiteralDeclaration_1()); 
                    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:536:1: ( 'int' )
                    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:536:3: 'int'
                    {
                    match(input,12,FOLLOW_12_in_rule__MetaPrimitiveType__Alternatives1071); 

                    }

                     after(grammarAccess.getMetaPrimitiveTypeAccess().getIntEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:541:6: ( ( 'number' ) )
                    {
                    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:541:6: ( ( 'number' ) )
                    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:542:1: ( 'number' )
                    {
                     before(grammarAccess.getMetaPrimitiveTypeAccess().getNumberEnumLiteralDeclaration_2()); 
                    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:543:1: ( 'number' )
                    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:543:3: 'number'
                    {
                    match(input,13,FOLLOW_13_in_rule__MetaPrimitiveType__Alternatives1092); 

                    }

                     after(grammarAccess.getMetaPrimitiveTypeAccess().getNumberEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:548:6: ( ( 'boolean' ) )
                    {
                    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:548:6: ( ( 'boolean' ) )
                    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:549:1: ( 'boolean' )
                    {
                     before(grammarAccess.getMetaPrimitiveTypeAccess().getBooleanEnumLiteralDeclaration_3()); 
                    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:550:1: ( 'boolean' )
                    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:550:3: 'boolean'
                    {
                    match(input,14,FOLLOW_14_in_rule__MetaPrimitiveType__Alternatives1113); 

                    }

                     after(grammarAccess.getMetaPrimitiveTypeAccess().getBooleanEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MetaPrimitiveType__Alternatives


    // $ANTLR start rule__Modifier__Alternatives
    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:560:1: rule__Modifier__Alternatives : ( ( ( 'optional' ) ) | ( ( 'required' ) ) | ( ( 'repeated' ) ) );
    public final void rule__Modifier__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:564:1: ( ( ( 'optional' ) ) | ( ( 'required' ) ) | ( ( 'repeated' ) ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt5=1;
                }
                break;
            case 16:
                {
                alt5=2;
                }
                break;
            case 17:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("560:1: rule__Modifier__Alternatives : ( ( ( 'optional' ) ) | ( ( 'required' ) ) | ( ( 'repeated' ) ) );", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:565:1: ( ( 'optional' ) )
                    {
                    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:565:1: ( ( 'optional' ) )
                    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:566:1: ( 'optional' )
                    {
                     before(grammarAccess.getModifierAccess().getOptionalEnumLiteralDeclaration_0()); 
                    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:567:1: ( 'optional' )
                    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:567:3: 'optional'
                    {
                    match(input,15,FOLLOW_15_in_rule__Modifier__Alternatives1149); 

                    }

                     after(grammarAccess.getModifierAccess().getOptionalEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:572:6: ( ( 'required' ) )
                    {
                    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:572:6: ( ( 'required' ) )
                    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:573:1: ( 'required' )
                    {
                     before(grammarAccess.getModifierAccess().getRequiredEnumLiteralDeclaration_1()); 
                    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:574:1: ( 'required' )
                    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:574:3: 'required'
                    {
                    match(input,16,FOLLOW_16_in_rule__Modifier__Alternatives1170); 

                    }

                     after(grammarAccess.getModifierAccess().getRequiredEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:579:6: ( ( 'repeated' ) )
                    {
                    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:579:6: ( ( 'repeated' ) )
                    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:580:1: ( 'repeated' )
                    {
                     before(grammarAccess.getModifierAccess().getRepeatedEnumLiteralDeclaration_2()); 
                    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:581:1: ( 'repeated' )
                    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:581:3: 'repeated'
                    {
                    match(input,17,FOLLOW_17_in_rule__Modifier__Alternatives1191); 

                    }

                     after(grammarAccess.getModifierAccess().getRepeatedEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Modifier__Alternatives


    // $ANTLR start rule__DataModel__Group__0
    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:593:1: rule__DataModel__Group__0 : rule__DataModel__Group__0__Impl rule__DataModel__Group__1 ;
    public final void rule__DataModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:597:1: ( rule__DataModel__Group__0__Impl rule__DataModel__Group__1 )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:598:2: rule__DataModel__Group__0__Impl rule__DataModel__Group__1
            {
            pushFollow(FOLLOW_rule__DataModel__Group__0__Impl_in_rule__DataModel__Group__01224);
            rule__DataModel__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DataModel__Group__1_in_rule__DataModel__Group__01227);
            rule__DataModel__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DataModel__Group__0


    // $ANTLR start rule__DataModel__Group__0__Impl
    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:605:1: rule__DataModel__Group__0__Impl : ( ( rule__DataModel__PrimitivesAssignment_0 ) ) ;
    public final void rule__DataModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:609:1: ( ( ( rule__DataModel__PrimitivesAssignment_0 ) ) )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:610:1: ( ( rule__DataModel__PrimitivesAssignment_0 ) )
            {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:610:1: ( ( rule__DataModel__PrimitivesAssignment_0 ) )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:611:1: ( rule__DataModel__PrimitivesAssignment_0 )
            {
             before(grammarAccess.getDataModelAccess().getPrimitivesAssignment_0()); 
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:612:1: ( rule__DataModel__PrimitivesAssignment_0 )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:612:2: rule__DataModel__PrimitivesAssignment_0
            {
            pushFollow(FOLLOW_rule__DataModel__PrimitivesAssignment_0_in_rule__DataModel__Group__0__Impl1254);
            rule__DataModel__PrimitivesAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getDataModelAccess().getPrimitivesAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DataModel__Group__0__Impl


    // $ANTLR start rule__DataModel__Group__1
    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:622:1: rule__DataModel__Group__1 : rule__DataModel__Group__1__Impl ;
    public final void rule__DataModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:626:1: ( rule__DataModel__Group__1__Impl )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:627:2: rule__DataModel__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__DataModel__Group__1__Impl_in_rule__DataModel__Group__11284);
            rule__DataModel__Group__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DataModel__Group__1


    // $ANTLR start rule__DataModel__Group__1__Impl
    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:633:1: rule__DataModel__Group__1__Impl : ( ( rule__DataModel__CompoundTypesAssignment_1 )* ) ;
    public final void rule__DataModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:637:1: ( ( ( rule__DataModel__CompoundTypesAssignment_1 )* ) )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:638:1: ( ( rule__DataModel__CompoundTypesAssignment_1 )* )
            {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:638:1: ( ( rule__DataModel__CompoundTypesAssignment_1 )* )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:639:1: ( rule__DataModel__CompoundTypesAssignment_1 )*
            {
             before(grammarAccess.getDataModelAccess().getCompoundTypesAssignment_1()); 
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:640:1: ( rule__DataModel__CompoundTypesAssignment_1 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==23||LA6_0==25) ) {
                    alt6=1;
                }
                else if ( LA6_0 ==32 && getUnorderedGroupHelper().canSelect(grammarAccess.getEntityAccess().getUnorderedGroup_0(), 0) ) {
                    alt6=1;
                }
                else if ( LA6_0 ==33 && getUnorderedGroupHelper().canSelect(grammarAccess.getEntityAccess().getUnorderedGroup_0(), 1) ) {
                    alt6=1;
                }
                else if ( (LA6_0==26) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:640:2: rule__DataModel__CompoundTypesAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__DataModel__CompoundTypesAssignment_1_in_rule__DataModel__Group__1__Impl1311);
            	    rule__DataModel__CompoundTypesAssignment_1();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getDataModelAccess().getCompoundTypesAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DataModel__Group__1__Impl


    // $ANTLR start rule__PrimitiveTypes__Group__0
    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:654:1: rule__PrimitiveTypes__Group__0 : rule__PrimitiveTypes__Group__0__Impl rule__PrimitiveTypes__Group__1 ;
    public final void rule__PrimitiveTypes__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:658:1: ( rule__PrimitiveTypes__Group__0__Impl rule__PrimitiveTypes__Group__1 )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:659:2: rule__PrimitiveTypes__Group__0__Impl rule__PrimitiveTypes__Group__1
            {
            pushFollow(FOLLOW_rule__PrimitiveTypes__Group__0__Impl_in_rule__PrimitiveTypes__Group__01346);
            rule__PrimitiveTypes__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__PrimitiveTypes__Group__1_in_rule__PrimitiveTypes__Group__01349);
            rule__PrimitiveTypes__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PrimitiveTypes__Group__0


    // $ANTLR start rule__PrimitiveTypes__Group__0__Impl
    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:666:1: rule__PrimitiveTypes__Group__0__Impl : ( () ) ;
    public final void rule__PrimitiveTypes__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:670:1: ( ( () ) )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:671:1: ( () )
            {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:671:1: ( () )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:672:1: ()
            {
             before(grammarAccess.getPrimitiveTypesAccess().getPrimitiveTypesAction_0()); 
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:673:1: ()
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:675:1: 
            {
            }

             after(grammarAccess.getPrimitiveTypesAccess().getPrimitiveTypesAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PrimitiveTypes__Group__0__Impl


    // $ANTLR start rule__PrimitiveTypes__Group__1
    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:685:1: rule__PrimitiveTypes__Group__1 : rule__PrimitiveTypes__Group__1__Impl rule__PrimitiveTypes__Group__2 ;
    public final void rule__PrimitiveTypes__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:689:1: ( rule__PrimitiveTypes__Group__1__Impl rule__PrimitiveTypes__Group__2 )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:690:2: rule__PrimitiveTypes__Group__1__Impl rule__PrimitiveTypes__Group__2
            {
            pushFollow(FOLLOW_rule__PrimitiveTypes__Group__1__Impl_in_rule__PrimitiveTypes__Group__11407);
            rule__PrimitiveTypes__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__PrimitiveTypes__Group__2_in_rule__PrimitiveTypes__Group__11410);
            rule__PrimitiveTypes__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PrimitiveTypes__Group__1


    // $ANTLR start rule__PrimitiveTypes__Group__1__Impl
    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:697:1: rule__PrimitiveTypes__Group__1__Impl : ( 'primitive-types' ) ;
    public final void rule__PrimitiveTypes__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:701:1: ( ( 'primitive-types' ) )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:702:1: ( 'primitive-types' )
            {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:702:1: ( 'primitive-types' )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:703:1: 'primitive-types'
            {
             before(grammarAccess.getPrimitiveTypesAccess().getPrimitiveTypesKeyword_1()); 
            match(input,18,FOLLOW_18_in_rule__PrimitiveTypes__Group__1__Impl1438); 
             after(grammarAccess.getPrimitiveTypesAccess().getPrimitiveTypesKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PrimitiveTypes__Group__1__Impl


    // $ANTLR start rule__PrimitiveTypes__Group__2
    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:716:1: rule__PrimitiveTypes__Group__2 : rule__PrimitiveTypes__Group__2__Impl rule__PrimitiveTypes__Group__3 ;
    public final void rule__PrimitiveTypes__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:720:1: ( rule__PrimitiveTypes__Group__2__Impl rule__PrimitiveTypes__Group__3 )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:721:2: rule__PrimitiveTypes__Group__2__Impl rule__PrimitiveTypes__Group__3
            {
            pushFollow(FOLLOW_rule__PrimitiveTypes__Group__2__Impl_in_rule__PrimitiveTypes__Group__21469);
            rule__PrimitiveTypes__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__PrimitiveTypes__Group__3_in_rule__PrimitiveTypes__Group__21472);
            rule__PrimitiveTypes__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PrimitiveTypes__Group__2


    // $ANTLR start rule__PrimitiveTypes__Group__2__Impl
    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:728:1: rule__PrimitiveTypes__Group__2__Impl : ( '{' ) ;
    public final void rule__PrimitiveTypes__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:732:1: ( ( '{' ) )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:733:1: ( '{' )
            {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:733:1: ( '{' )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:734:1: '{'
            {
             before(grammarAccess.getPrimitiveTypesAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,19,FOLLOW_19_in_rule__PrimitiveTypes__Group__2__Impl1500); 
             after(grammarAccess.getPrimitiveTypesAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PrimitiveTypes__Group__2__Impl


    // $ANTLR start rule__PrimitiveTypes__Group__3
    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:747:1: rule__PrimitiveTypes__Group__3 : rule__PrimitiveTypes__Group__3__Impl rule__PrimitiveTypes__Group__4 ;
    public final void rule__PrimitiveTypes__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:751:1: ( rule__PrimitiveTypes__Group__3__Impl rule__PrimitiveTypes__Group__4 )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:752:2: rule__PrimitiveTypes__Group__3__Impl rule__PrimitiveTypes__Group__4
            {
            pushFollow(FOLLOW_rule__PrimitiveTypes__Group__3__Impl_in_rule__PrimitiveTypes__Group__31531);
            rule__PrimitiveTypes__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__PrimitiveTypes__Group__4_in_rule__PrimitiveTypes__Group__31534);
            rule__PrimitiveTypes__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PrimitiveTypes__Group__3


    // $ANTLR start rule__PrimitiveTypes__Group__3__Impl
    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:759:1: rule__PrimitiveTypes__Group__3__Impl : ( ( rule__PrimitiveTypes__PrimitiveTypesAssignment_3 )* ) ;
    public final void rule__PrimitiveTypes__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:763:1: ( ( ( rule__PrimitiveTypes__PrimitiveTypesAssignment_3 )* ) )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:764:1: ( ( rule__PrimitiveTypes__PrimitiveTypesAssignment_3 )* )
            {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:764:1: ( ( rule__PrimitiveTypes__PrimitiveTypesAssignment_3 )* )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:765:1: ( rule__PrimitiveTypes__PrimitiveTypesAssignment_3 )*
            {
             before(grammarAccess.getPrimitiveTypesAccess().getPrimitiveTypesAssignment_3()); 
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:766:1: ( rule__PrimitiveTypes__PrimitiveTypesAssignment_3 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:766:2: rule__PrimitiveTypes__PrimitiveTypesAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__PrimitiveTypes__PrimitiveTypesAssignment_3_in_rule__PrimitiveTypes__Group__3__Impl1561);
            	    rule__PrimitiveTypes__PrimitiveTypesAssignment_3();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getPrimitiveTypesAccess().getPrimitiveTypesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PrimitiveTypes__Group__3__Impl


    // $ANTLR start rule__PrimitiveTypes__Group__4
    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:776:1: rule__PrimitiveTypes__Group__4 : rule__PrimitiveTypes__Group__4__Impl ;
    public final void rule__PrimitiveTypes__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:780:1: ( rule__PrimitiveTypes__Group__4__Impl )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:781:2: rule__PrimitiveTypes__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__PrimitiveTypes__Group__4__Impl_in_rule__PrimitiveTypes__Group__41592);
            rule__PrimitiveTypes__Group__4__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PrimitiveTypes__Group__4


    // $ANTLR start rule__PrimitiveTypes__Group__4__Impl
    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:787:1: rule__PrimitiveTypes__Group__4__Impl : ( '}' ) ;
    public final void rule__PrimitiveTypes__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:791:1: ( ( '}' ) )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:792:1: ( '}' )
            {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:792:1: ( '}' )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:793:1: '}'
            {
             before(grammarAccess.getPrimitiveTypesAccess().getRightCurlyBracketKeyword_4()); 
            match(input,20,FOLLOW_20_in_rule__PrimitiveTypes__Group__4__Impl1620); 
             after(grammarAccess.getPrimitiveTypesAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PrimitiveTypes__Group__4__Impl


    // $ANTLR start rule__PrimitiveType__Group__0
    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:816:1: rule__PrimitiveType__Group__0 : rule__PrimitiveType__Group__0__Impl rule__PrimitiveType__Group__1 ;
    public final void rule__PrimitiveType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:820:1: ( rule__PrimitiveType__Group__0__Impl rule__PrimitiveType__Group__1 )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:821:2: rule__PrimitiveType__Group__0__Impl rule__PrimitiveType__Group__1
            {
            pushFollow(FOLLOW_rule__PrimitiveType__Group__0__Impl_in_rule__PrimitiveType__Group__01661);
            rule__PrimitiveType__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__PrimitiveType__Group__1_in_rule__PrimitiveType__Group__01664);
            rule__PrimitiveType__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PrimitiveType__Group__0


    // $ANTLR start rule__PrimitiveType__Group__0__Impl
    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:828:1: rule__PrimitiveType__Group__0__Impl : ( ( rule__PrimitiveType__NameAssignment_0 ) ) ;
    public final void rule__PrimitiveType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:832:1: ( ( ( rule__PrimitiveType__NameAssignment_0 ) ) )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:833:1: ( ( rule__PrimitiveType__NameAssignment_0 ) )
            {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:833:1: ( ( rule__PrimitiveType__NameAssignment_0 ) )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:834:1: ( rule__PrimitiveType__NameAssignment_0 )
            {
             before(grammarAccess.getPrimitiveTypeAccess().getNameAssignment_0()); 
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:835:1: ( rule__PrimitiveType__NameAssignment_0 )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:835:2: rule__PrimitiveType__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__PrimitiveType__NameAssignment_0_in_rule__PrimitiveType__Group__0__Impl1691);
            rule__PrimitiveType__NameAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getPrimitiveTypeAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PrimitiveType__Group__0__Impl


    // $ANTLR start rule__PrimitiveType__Group__1
    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:845:1: rule__PrimitiveType__Group__1 : rule__PrimitiveType__Group__1__Impl ;
    public final void rule__PrimitiveType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:849:1: ( rule__PrimitiveType__Group__1__Impl )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:850:2: rule__PrimitiveType__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__PrimitiveType__Group__1__Impl_in_rule__PrimitiveType__Group__11721);
            rule__PrimitiveType__Group__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PrimitiveType__Group__1


    // $ANTLR start rule__PrimitiveType__Group__1__Impl
    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:856:1: rule__PrimitiveType__Group__1__Impl : ( ( rule__PrimitiveType__Alternatives_1 ) ) ;
    public final void rule__PrimitiveType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:860:1: ( ( ( rule__PrimitiveType__Alternatives_1 ) ) )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:861:1: ( ( rule__PrimitiveType__Alternatives_1 ) )
            {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:861:1: ( ( rule__PrimitiveType__Alternatives_1 ) )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:862:1: ( rule__PrimitiveType__Alternatives_1 )
            {
             before(grammarAccess.getPrimitiveTypeAccess().getAlternatives_1()); 
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:863:1: ( rule__PrimitiveType__Alternatives_1 )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:863:2: rule__PrimitiveType__Alternatives_1
            {
            pushFollow(FOLLOW_rule__PrimitiveType__Alternatives_1_in_rule__PrimitiveType__Group__1__Impl1748);
            rule__PrimitiveType__Alternatives_1();
            _fsp--;


            }

             after(grammarAccess.getPrimitiveTypeAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PrimitiveType__Group__1__Impl


    // $ANTLR start rule__PrimitiveType__Group_1_0__0
    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:877:1: rule__PrimitiveType__Group_1_0__0 : rule__PrimitiveType__Group_1_0__0__Impl rule__PrimitiveType__Group_1_0__1 ;
    public final void rule__PrimitiveType__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:881:1: ( rule__PrimitiveType__Group_1_0__0__Impl rule__PrimitiveType__Group_1_0__1 )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:882:2: rule__PrimitiveType__Group_1_0__0__Impl rule__PrimitiveType__Group_1_0__1
            {
            pushFollow(FOLLOW_rule__PrimitiveType__Group_1_0__0__Impl_in_rule__PrimitiveType__Group_1_0__01782);
            rule__PrimitiveType__Group_1_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__PrimitiveType__Group_1_0__1_in_rule__PrimitiveType__Group_1_0__01785);
            rule__PrimitiveType__Group_1_0__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PrimitiveType__Group_1_0__0


    // $ANTLR start rule__PrimitiveType__Group_1_0__0__Impl
    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:889:1: rule__PrimitiveType__Group_1_0__0__Impl : ( 'extends' ) ;
    public final void rule__PrimitiveType__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:893:1: ( ( 'extends' ) )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:894:1: ( 'extends' )
            {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:894:1: ( 'extends' )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:895:1: 'extends'
            {
             before(grammarAccess.getPrimitiveTypeAccess().getExtendsKeyword_1_0_0()); 
            match(input,21,FOLLOW_21_in_rule__PrimitiveType__Group_1_0__0__Impl1813); 
             after(grammarAccess.getPrimitiveTypeAccess().getExtendsKeyword_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PrimitiveType__Group_1_0__0__Impl


    // $ANTLR start rule__PrimitiveType__Group_1_0__1
    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:908:1: rule__PrimitiveType__Group_1_0__1 : rule__PrimitiveType__Group_1_0__1__Impl ;
    public final void rule__PrimitiveType__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:912:1: ( rule__PrimitiveType__Group_1_0__1__Impl )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:913:2: rule__PrimitiveType__Group_1_0__1__Impl
            {
            pushFollow(FOLLOW_rule__PrimitiveType__Group_1_0__1__Impl_in_rule__PrimitiveType__Group_1_0__11844);
            rule__PrimitiveType__Group_1_0__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PrimitiveType__Group_1_0__1


    // $ANTLR start rule__PrimitiveType__Group_1_0__1__Impl
    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:919:1: rule__PrimitiveType__Group_1_0__1__Impl : ( ( rule__PrimitiveType__SuperTypeAssignment_1_0_1 ) ) ;
    public final void rule__PrimitiveType__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:923:1: ( ( ( rule__PrimitiveType__SuperTypeAssignment_1_0_1 ) ) )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:924:1: ( ( rule__PrimitiveType__SuperTypeAssignment_1_0_1 ) )
            {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:924:1: ( ( rule__PrimitiveType__SuperTypeAssignment_1_0_1 ) )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:925:1: ( rule__PrimitiveType__SuperTypeAssignment_1_0_1 )
            {
             before(grammarAccess.getPrimitiveTypeAccess().getSuperTypeAssignment_1_0_1()); 
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:926:1: ( rule__PrimitiveType__SuperTypeAssignment_1_0_1 )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:926:2: rule__PrimitiveType__SuperTypeAssignment_1_0_1
            {
            pushFollow(FOLLOW_rule__PrimitiveType__SuperTypeAssignment_1_0_1_in_rule__PrimitiveType__Group_1_0__1__Impl1871);
            rule__PrimitiveType__SuperTypeAssignment_1_0_1();
            _fsp--;


            }

             after(grammarAccess.getPrimitiveTypeAccess().getSuperTypeAssignment_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PrimitiveType__Group_1_0__1__Impl


    // $ANTLR start rule__PrimitiveType__Group_1_1__0
    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:940:1: rule__PrimitiveType__Group_1_1__0 : rule__PrimitiveType__Group_1_1__0__Impl rule__PrimitiveType__Group_1_1__1 ;
    public final void rule__PrimitiveType__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:944:1: ( rule__PrimitiveType__Group_1_1__0__Impl rule__PrimitiveType__Group_1_1__1 )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:945:2: rule__PrimitiveType__Group_1_1__0__Impl rule__PrimitiveType__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__PrimitiveType__Group_1_1__0__Impl_in_rule__PrimitiveType__Group_1_1__01905);
            rule__PrimitiveType__Group_1_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__PrimitiveType__Group_1_1__1_in_rule__PrimitiveType__Group_1_1__01908);
            rule__PrimitiveType__Group_1_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PrimitiveType__Group_1_1__0


    // $ANTLR start rule__PrimitiveType__Group_1_1__0__Impl
    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:952:1: rule__PrimitiveType__Group_1_1__0__Impl : ( '->' ) ;
    public final void rule__PrimitiveType__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:956:1: ( ( '->' ) )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:957:1: ( '->' )
            {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:957:1: ( '->' )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:958:1: '->'
            {
             before(grammarAccess.getPrimitiveTypeAccess().getHyphenMinusGreaterThanSignKeyword_1_1_0()); 
            match(input,22,FOLLOW_22_in_rule__PrimitiveType__Group_1_1__0__Impl1936); 
             after(grammarAccess.getPrimitiveTypeAccess().getHyphenMinusGreaterThanSignKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PrimitiveType__Group_1_1__0__Impl


    // $ANTLR start rule__PrimitiveType__Group_1_1__1
    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:971:1: rule__PrimitiveType__Group_1_1__1 : rule__PrimitiveType__Group_1_1__1__Impl ;
    public final void rule__PrimitiveType__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:975:1: ( rule__PrimitiveType__Group_1_1__1__Impl )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:976:2: rule__PrimitiveType__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__PrimitiveType__Group_1_1__1__Impl_in_rule__PrimitiveType__Group_1_1__11967);
            rule__PrimitiveType__Group_1_1__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PrimitiveType__Group_1_1__1


    // $ANTLR start rule__PrimitiveType__Group_1_1__1__Impl
    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:982:1: rule__PrimitiveType__Group_1_1__1__Impl : ( ( rule__PrimitiveType__RealizationTypeAssignment_1_1_1 ) ) ;
    public final void rule__PrimitiveType__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:986:1: ( ( ( rule__PrimitiveType__RealizationTypeAssignment_1_1_1 ) ) )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:987:1: ( ( rule__PrimitiveType__RealizationTypeAssignment_1_1_1 ) )
            {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:987:1: ( ( rule__PrimitiveType__RealizationTypeAssignment_1_1_1 ) )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:988:1: ( rule__PrimitiveType__RealizationTypeAssignment_1_1_1 )
            {
             before(grammarAccess.getPrimitiveTypeAccess().getRealizationTypeAssignment_1_1_1()); 
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:989:1: ( rule__PrimitiveType__RealizationTypeAssignment_1_1_1 )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:989:2: rule__PrimitiveType__RealizationTypeAssignment_1_1_1
            {
            pushFollow(FOLLOW_rule__PrimitiveType__RealizationTypeAssignment_1_1_1_in_rule__PrimitiveType__Group_1_1__1__Impl1994);
            rule__PrimitiveType__RealizationTypeAssignment_1_1_1();
            _fsp--;


            }

             after(grammarAccess.getPrimitiveTypeAccess().getRealizationTypeAssignment_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PrimitiveType__Group_1_1__1__Impl


    // $ANTLR start rule__DataType__Group__0
    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1003:1: rule__DataType__Group__0 : rule__DataType__Group__0__Impl rule__DataType__Group__1 ;
    public final void rule__DataType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1007:1: ( rule__DataType__Group__0__Impl rule__DataType__Group__1 )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1008:2: rule__DataType__Group__0__Impl rule__DataType__Group__1
            {
            pushFollow(FOLLOW_rule__DataType__Group__0__Impl_in_rule__DataType__Group__02028);
            rule__DataType__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DataType__Group__1_in_rule__DataType__Group__02031);
            rule__DataType__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DataType__Group__0


    // $ANTLR start rule__DataType__Group__0__Impl
    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1015:1: rule__DataType__Group__0__Impl : ( 'datatype' ) ;
    public final void rule__DataType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1019:1: ( ( 'datatype' ) )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1020:1: ( 'datatype' )
            {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1020:1: ( 'datatype' )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1021:1: 'datatype'
            {
             before(grammarAccess.getDataTypeAccess().getDatatypeKeyword_0()); 
            match(input,23,FOLLOW_23_in_rule__DataType__Group__0__Impl2059); 
             after(grammarAccess.getDataTypeAccess().getDatatypeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DataType__Group__0__Impl


    // $ANTLR start rule__DataType__Group__1
    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1034:1: rule__DataType__Group__1 : rule__DataType__Group__1__Impl rule__DataType__Group__2 ;
    public final void rule__DataType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1038:1: ( rule__DataType__Group__1__Impl rule__DataType__Group__2 )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1039:2: rule__DataType__Group__1__Impl rule__DataType__Group__2
            {
            pushFollow(FOLLOW_rule__DataType__Group__1__Impl_in_rule__DataType__Group__12090);
            rule__DataType__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DataType__Group__2_in_rule__DataType__Group__12093);
            rule__DataType__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DataType__Group__1


    // $ANTLR start rule__DataType__Group__1__Impl
    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1046:1: rule__DataType__Group__1__Impl : ( ( rule__DataType__NameAssignment_1 ) ) ;
    public final void rule__DataType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1050:1: ( ( ( rule__DataType__NameAssignment_1 ) ) )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1051:1: ( ( rule__DataType__NameAssignment_1 ) )
            {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1051:1: ( ( rule__DataType__NameAssignment_1 ) )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1052:1: ( rule__DataType__NameAssignment_1 )
            {
             before(grammarAccess.getDataTypeAccess().getNameAssignment_1()); 
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1053:1: ( rule__DataType__NameAssignment_1 )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1053:2: rule__DataType__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__DataType__NameAssignment_1_in_rule__DataType__Group__1__Impl2120);
            rule__DataType__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getDataTypeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DataType__Group__1__Impl


    // $ANTLR start rule__DataType__Group__2
    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1063:1: rule__DataType__Group__2 : rule__DataType__Group__2__Impl rule__DataType__Group__3 ;
    public final void rule__DataType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1067:1: ( rule__DataType__Group__2__Impl rule__DataType__Group__3 )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1068:2: rule__DataType__Group__2__Impl rule__DataType__Group__3
            {
            pushFollow(FOLLOW_rule__DataType__Group__2__Impl_in_rule__DataType__Group__22150);
            rule__DataType__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DataType__Group__3_in_rule__DataType__Group__22153);
            rule__DataType__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DataType__Group__2


    // $ANTLR start rule__DataType__Group__2__Impl
    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1075:1: rule__DataType__Group__2__Impl : ( '{' ) ;
    public final void rule__DataType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1079:1: ( ( '{' ) )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1080:1: ( '{' )
            {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1080:1: ( '{' )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1081:1: '{'
            {
             before(grammarAccess.getDataTypeAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,19,FOLLOW_19_in_rule__DataType__Group__2__Impl2181); 
             after(grammarAccess.getDataTypeAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DataType__Group__2__Impl


    // $ANTLR start rule__DataType__Group__3
    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1094:1: rule__DataType__Group__3 : rule__DataType__Group__3__Impl rule__DataType__Group__4 ;
    public final void rule__DataType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1098:1: ( rule__DataType__Group__3__Impl rule__DataType__Group__4 )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1099:2: rule__DataType__Group__3__Impl rule__DataType__Group__4
            {
            pushFollow(FOLLOW_rule__DataType__Group__3__Impl_in_rule__DataType__Group__32212);
            rule__DataType__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DataType__Group__4_in_rule__DataType__Group__32215);
            rule__DataType__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DataType__Group__3


    // $ANTLR start rule__DataType__Group__3__Impl
    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1106:1: rule__DataType__Group__3__Impl : ( ( rule__DataType__FieldsAssignment_3 )* ) ;
    public final void rule__DataType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1110:1: ( ( ( rule__DataType__FieldsAssignment_3 )* ) )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1111:1: ( ( rule__DataType__FieldsAssignment_3 )* )
            {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1111:1: ( ( rule__DataType__FieldsAssignment_3 )* )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1112:1: ( rule__DataType__FieldsAssignment_3 )*
            {
             before(grammarAccess.getDataTypeAccess().getFieldsAssignment_3()); 
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1113:1: ( rule__DataType__FieldsAssignment_3 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID||(LA8_0>=15 && LA8_0<=17)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1113:2: rule__DataType__FieldsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__DataType__FieldsAssignment_3_in_rule__DataType__Group__3__Impl2242);
            	    rule__DataType__FieldsAssignment_3();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getDataTypeAccess().getFieldsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DataType__Group__3__Impl


    // $ANTLR start rule__DataType__Group__4
    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1123:1: rule__DataType__Group__4 : rule__DataType__Group__4__Impl rule__DataType__Group__5 ;
    public final void rule__DataType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1127:1: ( rule__DataType__Group__4__Impl rule__DataType__Group__5 )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1128:2: rule__DataType__Group__4__Impl rule__DataType__Group__5
            {
            pushFollow(FOLLOW_rule__DataType__Group__4__Impl_in_rule__DataType__Group__42273);
            rule__DataType__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DataType__Group__5_in_rule__DataType__Group__42276);
            rule__DataType__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DataType__Group__4


    // $ANTLR start rule__DataType__Group__4__Impl
    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1135:1: rule__DataType__Group__4__Impl : ( ( rule__DataType__ConstraintsAssignment_4 )* ) ;
    public final void rule__DataType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1139:1: ( ( ( rule__DataType__ConstraintsAssignment_4 )* ) )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1140:1: ( ( rule__DataType__ConstraintsAssignment_4 )* )
            {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1140:1: ( ( rule__DataType__ConstraintsAssignment_4 )* )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1141:1: ( rule__DataType__ConstraintsAssignment_4 )*
            {
             before(grammarAccess.getDataTypeAccess().getConstraintsAssignment_4()); 
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1142:1: ( rule__DataType__ConstraintsAssignment_4 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==27) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1142:2: rule__DataType__ConstraintsAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__DataType__ConstraintsAssignment_4_in_rule__DataType__Group__4__Impl2303);
            	    rule__DataType__ConstraintsAssignment_4();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getDataTypeAccess().getConstraintsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DataType__Group__4__Impl


    // $ANTLR start rule__DataType__Group__5
    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1152:1: rule__DataType__Group__5 : rule__DataType__Group__5__Impl rule__DataType__Group__6 ;
    public final void rule__DataType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1156:1: ( rule__DataType__Group__5__Impl rule__DataType__Group__6 )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1157:2: rule__DataType__Group__5__Impl rule__DataType__Group__6
            {
            pushFollow(FOLLOW_rule__DataType__Group__5__Impl_in_rule__DataType__Group__52334);
            rule__DataType__Group__5__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DataType__Group__6_in_rule__DataType__Group__52337);
            rule__DataType__Group__6();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DataType__Group__5


    // $ANTLR start rule__DataType__Group__5__Impl
    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1164:1: rule__DataType__Group__5__Impl : ( ( rule__DataType__FunctionsAssignment_5 )* ) ;
    public final void rule__DataType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1168:1: ( ( ( rule__DataType__FunctionsAssignment_5 )* ) )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1169:1: ( ( rule__DataType__FunctionsAssignment_5 )* )
            {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1169:1: ( ( rule__DataType__FunctionsAssignment_5 )* )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1170:1: ( rule__DataType__FunctionsAssignment_5 )*
            {
             before(grammarAccess.getDataTypeAccess().getFunctionsAssignment_5()); 
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1171:1: ( rule__DataType__FunctionsAssignment_5 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==29) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1171:2: rule__DataType__FunctionsAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__DataType__FunctionsAssignment_5_in_rule__DataType__Group__5__Impl2364);
            	    rule__DataType__FunctionsAssignment_5();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getDataTypeAccess().getFunctionsAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DataType__Group__5__Impl


    // $ANTLR start rule__DataType__Group__6
    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1181:1: rule__DataType__Group__6 : rule__DataType__Group__6__Impl ;
    public final void rule__DataType__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1185:1: ( rule__DataType__Group__6__Impl )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1186:2: rule__DataType__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__DataType__Group__6__Impl_in_rule__DataType__Group__62395);
            rule__DataType__Group__6__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DataType__Group__6


    // $ANTLR start rule__DataType__Group__6__Impl
    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1192:1: rule__DataType__Group__6__Impl : ( '}' ) ;
    public final void rule__DataType__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1196:1: ( ( '}' ) )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1197:1: ( '}' )
            {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1197:1: ( '}' )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1198:1: '}'
            {
             before(grammarAccess.getDataTypeAccess().getRightCurlyBracketKeyword_6()); 
            match(input,20,FOLLOW_20_in_rule__DataType__Group__6__Impl2423); 
             after(grammarAccess.getDataTypeAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DataType__Group__6__Impl


    // $ANTLR start rule__Field__Group__0
    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1225:1: rule__Field__Group__0 : rule__Field__Group__0__Impl rule__Field__Group__1 ;
    public final void rule__Field__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1229:1: ( rule__Field__Group__0__Impl rule__Field__Group__1 )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1230:2: rule__Field__Group__0__Impl rule__Field__Group__1
            {
            pushFollow(FOLLOW_rule__Field__Group__0__Impl_in_rule__Field__Group__02468);
            rule__Field__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Field__Group__1_in_rule__Field__Group__02471);
            rule__Field__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Field__Group__0


    // $ANTLR start rule__Field__Group__0__Impl
    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1237:1: rule__Field__Group__0__Impl : ( ( rule__Field__ModifierAssignment_0 )? ) ;
    public final void rule__Field__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1241:1: ( ( ( rule__Field__ModifierAssignment_0 )? ) )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1242:1: ( ( rule__Field__ModifierAssignment_0 )? )
            {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1242:1: ( ( rule__Field__ModifierAssignment_0 )? )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1243:1: ( rule__Field__ModifierAssignment_0 )?
            {
             before(grammarAccess.getFieldAccess().getModifierAssignment_0()); 
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1244:1: ( rule__Field__ModifierAssignment_0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=15 && LA11_0<=17)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1244:2: rule__Field__ModifierAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Field__ModifierAssignment_0_in_rule__Field__Group__0__Impl2498);
                    rule__Field__ModifierAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFieldAccess().getModifierAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Field__Group__0__Impl


    // $ANTLR start rule__Field__Group__1
    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1254:1: rule__Field__Group__1 : rule__Field__Group__1__Impl rule__Field__Group__2 ;
    public final void rule__Field__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1258:1: ( rule__Field__Group__1__Impl rule__Field__Group__2 )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1259:2: rule__Field__Group__1__Impl rule__Field__Group__2
            {
            pushFollow(FOLLOW_rule__Field__Group__1__Impl_in_rule__Field__Group__12529);
            rule__Field__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Field__Group__2_in_rule__Field__Group__12532);
            rule__Field__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Field__Group__1


    // $ANTLR start rule__Field__Group__1__Impl
    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1266:1: rule__Field__Group__1__Impl : ( ( rule__Field__NameAssignment_1 ) ) ;
    public final void rule__Field__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1270:1: ( ( ( rule__Field__NameAssignment_1 ) ) )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1271:1: ( ( rule__Field__NameAssignment_1 ) )
            {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1271:1: ( ( rule__Field__NameAssignment_1 ) )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1272:1: ( rule__Field__NameAssignment_1 )
            {
             before(grammarAccess.getFieldAccess().getNameAssignment_1()); 
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1273:1: ( rule__Field__NameAssignment_1 )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1273:2: rule__Field__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Field__NameAssignment_1_in_rule__Field__Group__1__Impl2559);
            rule__Field__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getFieldAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Field__Group__1__Impl


    // $ANTLR start rule__Field__Group__2
    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1283:1: rule__Field__Group__2 : rule__Field__Group__2__Impl rule__Field__Group__3 ;
    public final void rule__Field__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1287:1: ( rule__Field__Group__2__Impl rule__Field__Group__3 )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1288:2: rule__Field__Group__2__Impl rule__Field__Group__3
            {
            pushFollow(FOLLOW_rule__Field__Group__2__Impl_in_rule__Field__Group__22589);
            rule__Field__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Field__Group__3_in_rule__Field__Group__22592);
            rule__Field__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Field__Group__2


    // $ANTLR start rule__Field__Group__2__Impl
    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1295:1: rule__Field__Group__2__Impl : ( ':' ) ;
    public final void rule__Field__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1299:1: ( ( ':' ) )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1300:1: ( ':' )
            {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1300:1: ( ':' )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1301:1: ':'
            {
             before(grammarAccess.getFieldAccess().getColonKeyword_2()); 
            match(input,24,FOLLOW_24_in_rule__Field__Group__2__Impl2620); 
             after(grammarAccess.getFieldAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Field__Group__2__Impl


    // $ANTLR start rule__Field__Group__3
    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1314:1: rule__Field__Group__3 : rule__Field__Group__3__Impl ;
    public final void rule__Field__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1318:1: ( rule__Field__Group__3__Impl )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1319:2: rule__Field__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Field__Group__3__Impl_in_rule__Field__Group__32651);
            rule__Field__Group__3__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Field__Group__3


    // $ANTLR start rule__Field__Group__3__Impl
    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1325:1: rule__Field__Group__3__Impl : ( ( rule__Field__TypeAssignment_3 ) ) ;
    public final void rule__Field__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1329:1: ( ( ( rule__Field__TypeAssignment_3 ) ) )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1330:1: ( ( rule__Field__TypeAssignment_3 ) )
            {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1330:1: ( ( rule__Field__TypeAssignment_3 ) )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1331:1: ( rule__Field__TypeAssignment_3 )
            {
             before(grammarAccess.getFieldAccess().getTypeAssignment_3()); 
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1332:1: ( rule__Field__TypeAssignment_3 )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1332:2: rule__Field__TypeAssignment_3
            {
            pushFollow(FOLLOW_rule__Field__TypeAssignment_3_in_rule__Field__Group__3__Impl2678);
            rule__Field__TypeAssignment_3();
            _fsp--;


            }

             after(grammarAccess.getFieldAccess().getTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Field__Group__3__Impl


    // $ANTLR start rule__Enumeration__Group__0
    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1350:1: rule__Enumeration__Group__0 : rule__Enumeration__Group__0__Impl rule__Enumeration__Group__1 ;
    public final void rule__Enumeration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1354:1: ( rule__Enumeration__Group__0__Impl rule__Enumeration__Group__1 )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1355:2: rule__Enumeration__Group__0__Impl rule__Enumeration__Group__1
            {
            pushFollow(FOLLOW_rule__Enumeration__Group__0__Impl_in_rule__Enumeration__Group__02716);
            rule__Enumeration__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Enumeration__Group__1_in_rule__Enumeration__Group__02719);
            rule__Enumeration__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Enumeration__Group__0


    // $ANTLR start rule__Enumeration__Group__0__Impl
    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1362:1: rule__Enumeration__Group__0__Impl : ( 'enum' ) ;
    public final void rule__Enumeration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1366:1: ( ( 'enum' ) )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1367:1: ( 'enum' )
            {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1367:1: ( 'enum' )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1368:1: 'enum'
            {
             before(grammarAccess.getEnumerationAccess().getEnumKeyword_0()); 
            match(input,25,FOLLOW_25_in_rule__Enumeration__Group__0__Impl2747); 
             after(grammarAccess.getEnumerationAccess().getEnumKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Enumeration__Group__0__Impl


    // $ANTLR start rule__Enumeration__Group__1
    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1381:1: rule__Enumeration__Group__1 : rule__Enumeration__Group__1__Impl rule__Enumeration__Group__2 ;
    public final void rule__Enumeration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1385:1: ( rule__Enumeration__Group__1__Impl rule__Enumeration__Group__2 )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1386:2: rule__Enumeration__Group__1__Impl rule__Enumeration__Group__2
            {
            pushFollow(FOLLOW_rule__Enumeration__Group__1__Impl_in_rule__Enumeration__Group__12778);
            rule__Enumeration__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Enumeration__Group__2_in_rule__Enumeration__Group__12781);
            rule__Enumeration__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Enumeration__Group__1


    // $ANTLR start rule__Enumeration__Group__1__Impl
    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1393:1: rule__Enumeration__Group__1__Impl : ( ( rule__Enumeration__NameAssignment_1 ) ) ;
    public final void rule__Enumeration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1397:1: ( ( ( rule__Enumeration__NameAssignment_1 ) ) )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1398:1: ( ( rule__Enumeration__NameAssignment_1 ) )
            {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1398:1: ( ( rule__Enumeration__NameAssignment_1 ) )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1399:1: ( rule__Enumeration__NameAssignment_1 )
            {
             before(grammarAccess.getEnumerationAccess().getNameAssignment_1()); 
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1400:1: ( rule__Enumeration__NameAssignment_1 )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1400:2: rule__Enumeration__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Enumeration__NameAssignment_1_in_rule__Enumeration__Group__1__Impl2808);
            rule__Enumeration__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getEnumerationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Enumeration__Group__1__Impl


    // $ANTLR start rule__Enumeration__Group__2
    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1410:1: rule__Enumeration__Group__2 : rule__Enumeration__Group__2__Impl rule__Enumeration__Group__3 ;
    public final void rule__Enumeration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1414:1: ( rule__Enumeration__Group__2__Impl rule__Enumeration__Group__3 )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1415:2: rule__Enumeration__Group__2__Impl rule__Enumeration__Group__3
            {
            pushFollow(FOLLOW_rule__Enumeration__Group__2__Impl_in_rule__Enumeration__Group__22838);
            rule__Enumeration__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Enumeration__Group__3_in_rule__Enumeration__Group__22841);
            rule__Enumeration__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Enumeration__Group__2


    // $ANTLR start rule__Enumeration__Group__2__Impl
    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1422:1: rule__Enumeration__Group__2__Impl : ( '{' ) ;
    public final void rule__Enumeration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1426:1: ( ( '{' ) )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1427:1: ( '{' )
            {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1427:1: ( '{' )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1428:1: '{'
            {
             before(grammarAccess.getEnumerationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,19,FOLLOW_19_in_rule__Enumeration__Group__2__Impl2869); 
             after(grammarAccess.getEnumerationAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Enumeration__Group__2__Impl


    // $ANTLR start rule__Enumeration__Group__3
    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1441:1: rule__Enumeration__Group__3 : rule__Enumeration__Group__3__Impl rule__Enumeration__Group__4 ;
    public final void rule__Enumeration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1445:1: ( rule__Enumeration__Group__3__Impl rule__Enumeration__Group__4 )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1446:2: rule__Enumeration__Group__3__Impl rule__Enumeration__Group__4
            {
            pushFollow(FOLLOW_rule__Enumeration__Group__3__Impl_in_rule__Enumeration__Group__32900);
            rule__Enumeration__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Enumeration__Group__4_in_rule__Enumeration__Group__32903);
            rule__Enumeration__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Enumeration__Group__3


    // $ANTLR start rule__Enumeration__Group__3__Impl
    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1453:1: rule__Enumeration__Group__3__Impl : ( ( rule__Enumeration__LiteralsAssignment_3 )* ) ;
    public final void rule__Enumeration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1457:1: ( ( ( rule__Enumeration__LiteralsAssignment_3 )* ) )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1458:1: ( ( rule__Enumeration__LiteralsAssignment_3 )* )
            {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1458:1: ( ( rule__Enumeration__LiteralsAssignment_3 )* )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1459:1: ( rule__Enumeration__LiteralsAssignment_3 )*
            {
             before(grammarAccess.getEnumerationAccess().getLiteralsAssignment_3()); 
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1460:1: ( rule__Enumeration__LiteralsAssignment_3 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1460:2: rule__Enumeration__LiteralsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Enumeration__LiteralsAssignment_3_in_rule__Enumeration__Group__3__Impl2930);
            	    rule__Enumeration__LiteralsAssignment_3();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getEnumerationAccess().getLiteralsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Enumeration__Group__3__Impl


    // $ANTLR start rule__Enumeration__Group__4
    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1470:1: rule__Enumeration__Group__4 : rule__Enumeration__Group__4__Impl ;
    public final void rule__Enumeration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1474:1: ( rule__Enumeration__Group__4__Impl )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1475:2: rule__Enumeration__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Enumeration__Group__4__Impl_in_rule__Enumeration__Group__42961);
            rule__Enumeration__Group__4__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Enumeration__Group__4


    // $ANTLR start rule__Enumeration__Group__4__Impl
    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1481:1: rule__Enumeration__Group__4__Impl : ( '}' ) ;
    public final void rule__Enumeration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1485:1: ( ( '}' ) )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1486:1: ( '}' )
            {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1486:1: ( '}' )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1487:1: '}'
            {
             before(grammarAccess.getEnumerationAccess().getRightCurlyBracketKeyword_4()); 
            match(input,20,FOLLOW_20_in_rule__Enumeration__Group__4__Impl2989); 
             after(grammarAccess.getEnumerationAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Enumeration__Group__4__Impl


    // $ANTLR start rule__Entity__Group__0
    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1510:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1514:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1515:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
            {
            pushFollow(FOLLOW_rule__Entity__Group__0__Impl_in_rule__Entity__Group__03030);
            rule__Entity__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__03033);
            rule__Entity__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__Group__0


    // $ANTLR start rule__Entity__Group__0__Impl
    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1522:1: rule__Entity__Group__0__Impl : ( ( rule__Entity__UnorderedGroup_0 ) ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1526:1: ( ( ( rule__Entity__UnorderedGroup_0 ) ) )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1527:1: ( ( rule__Entity__UnorderedGroup_0 ) )
            {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1527:1: ( ( rule__Entity__UnorderedGroup_0 ) )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1528:1: ( rule__Entity__UnorderedGroup_0 )
            {
             before(grammarAccess.getEntityAccess().getUnorderedGroup_0()); 
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1529:1: ( rule__Entity__UnorderedGroup_0 )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1529:2: rule__Entity__UnorderedGroup_0
            {
            pushFollow(FOLLOW_rule__Entity__UnorderedGroup_0_in_rule__Entity__Group__0__Impl3060);
            rule__Entity__UnorderedGroup_0();
            _fsp--;


            }

             after(grammarAccess.getEntityAccess().getUnorderedGroup_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__Group__0__Impl


    // $ANTLR start rule__Entity__Group__1
    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1539:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1543:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1544:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
            {
            pushFollow(FOLLOW_rule__Entity__Group__1__Impl_in_rule__Entity__Group__13090);
            rule__Entity__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__13093);
            rule__Entity__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__Group__1


    // $ANTLR start rule__Entity__Group__1__Impl
    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1551:1: rule__Entity__Group__1__Impl : ( 'entity' ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1555:1: ( ( 'entity' ) )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1556:1: ( 'entity' )
            {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1556:1: ( 'entity' )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1557:1: 'entity'
            {
             before(grammarAccess.getEntityAccess().getEntityKeyword_1()); 
            match(input,26,FOLLOW_26_in_rule__Entity__Group__1__Impl3121); 
             after(grammarAccess.getEntityAccess().getEntityKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__Group__1__Impl


    // $ANTLR start rule__Entity__Group__2
    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1570:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1574:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1575:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
            {
            pushFollow(FOLLOW_rule__Entity__Group__2__Impl_in_rule__Entity__Group__23152);
            rule__Entity__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__3_in_rule__Entity__Group__23155);
            rule__Entity__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__Group__2


    // $ANTLR start rule__Entity__Group__2__Impl
    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1582:1: rule__Entity__Group__2__Impl : ( ( rule__Entity__NameAssignment_2 ) ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1586:1: ( ( ( rule__Entity__NameAssignment_2 ) ) )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1587:1: ( ( rule__Entity__NameAssignment_2 ) )
            {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1587:1: ( ( rule__Entity__NameAssignment_2 ) )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1588:1: ( rule__Entity__NameAssignment_2 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_2()); 
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1589:1: ( rule__Entity__NameAssignment_2 )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1589:2: rule__Entity__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Entity__NameAssignment_2_in_rule__Entity__Group__2__Impl3182);
            rule__Entity__NameAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getEntityAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__Group__2__Impl


    // $ANTLR start rule__Entity__Group__3
    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1599:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl rule__Entity__Group__4 ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1603:1: ( rule__Entity__Group__3__Impl rule__Entity__Group__4 )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1604:2: rule__Entity__Group__3__Impl rule__Entity__Group__4
            {
            pushFollow(FOLLOW_rule__Entity__Group__3__Impl_in_rule__Entity__Group__33212);
            rule__Entity__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__4_in_rule__Entity__Group__33215);
            rule__Entity__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__Group__3


    // $ANTLR start rule__Entity__Group__3__Impl
    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1611:1: rule__Entity__Group__3__Impl : ( ( rule__Entity__Group_3__0 )? ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1615:1: ( ( ( rule__Entity__Group_3__0 )? ) )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1616:1: ( ( rule__Entity__Group_3__0 )? )
            {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1616:1: ( ( rule__Entity__Group_3__0 )? )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1617:1: ( rule__Entity__Group_3__0 )?
            {
             before(grammarAccess.getEntityAccess().getGroup_3()); 
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1618:1: ( rule__Entity__Group_3__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==21) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1618:2: rule__Entity__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Entity__Group_3__0_in_rule__Entity__Group__3__Impl3242);
                    rule__Entity__Group_3__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEntityAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__Group__3__Impl


    // $ANTLR start rule__Entity__Group__4
    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1628:1: rule__Entity__Group__4 : rule__Entity__Group__4__Impl rule__Entity__Group__5 ;
    public final void rule__Entity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1632:1: ( rule__Entity__Group__4__Impl rule__Entity__Group__5 )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1633:2: rule__Entity__Group__4__Impl rule__Entity__Group__5
            {
            pushFollow(FOLLOW_rule__Entity__Group__4__Impl_in_rule__Entity__Group__43273);
            rule__Entity__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__5_in_rule__Entity__Group__43276);
            rule__Entity__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__Group__4


    // $ANTLR start rule__Entity__Group__4__Impl
    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1640:1: rule__Entity__Group__4__Impl : ( '{' ) ;
    public final void rule__Entity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1644:1: ( ( '{' ) )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1645:1: ( '{' )
            {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1645:1: ( '{' )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1646:1: '{'
            {
             before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,19,FOLLOW_19_in_rule__Entity__Group__4__Impl3304); 
             after(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__Group__4__Impl


    // $ANTLR start rule__Entity__Group__5
    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1659:1: rule__Entity__Group__5 : rule__Entity__Group__5__Impl rule__Entity__Group__6 ;
    public final void rule__Entity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1663:1: ( rule__Entity__Group__5__Impl rule__Entity__Group__6 )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1664:2: rule__Entity__Group__5__Impl rule__Entity__Group__6
            {
            pushFollow(FOLLOW_rule__Entity__Group__5__Impl_in_rule__Entity__Group__53335);
            rule__Entity__Group__5__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__6_in_rule__Entity__Group__53338);
            rule__Entity__Group__6();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__Group__5


    // $ANTLR start rule__Entity__Group__5__Impl
    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1671:1: rule__Entity__Group__5__Impl : ( ( rule__Entity__FieldsAssignment_5 )* ) ;
    public final void rule__Entity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1675:1: ( ( ( rule__Entity__FieldsAssignment_5 )* ) )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1676:1: ( ( rule__Entity__FieldsAssignment_5 )* )
            {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1676:1: ( ( rule__Entity__FieldsAssignment_5 )* )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1677:1: ( rule__Entity__FieldsAssignment_5 )*
            {
             before(grammarAccess.getEntityAccess().getFieldsAssignment_5()); 
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1678:1: ( rule__Entity__FieldsAssignment_5 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID||(LA14_0>=15 && LA14_0<=17)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1678:2: rule__Entity__FieldsAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__Entity__FieldsAssignment_5_in_rule__Entity__Group__5__Impl3365);
            	    rule__Entity__FieldsAssignment_5();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getEntityAccess().getFieldsAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__Group__5__Impl


    // $ANTLR start rule__Entity__Group__6
    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1688:1: rule__Entity__Group__6 : rule__Entity__Group__6__Impl rule__Entity__Group__7 ;
    public final void rule__Entity__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1692:1: ( rule__Entity__Group__6__Impl rule__Entity__Group__7 )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1693:2: rule__Entity__Group__6__Impl rule__Entity__Group__7
            {
            pushFollow(FOLLOW_rule__Entity__Group__6__Impl_in_rule__Entity__Group__63396);
            rule__Entity__Group__6__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__7_in_rule__Entity__Group__63399);
            rule__Entity__Group__7();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__Group__6


    // $ANTLR start rule__Entity__Group__6__Impl
    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1700:1: rule__Entity__Group__6__Impl : ( ( rule__Entity__ConstraintsAssignment_6 )* ) ;
    public final void rule__Entity__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1704:1: ( ( ( rule__Entity__ConstraintsAssignment_6 )* ) )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1705:1: ( ( rule__Entity__ConstraintsAssignment_6 )* )
            {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1705:1: ( ( rule__Entity__ConstraintsAssignment_6 )* )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1706:1: ( rule__Entity__ConstraintsAssignment_6 )*
            {
             before(grammarAccess.getEntityAccess().getConstraintsAssignment_6()); 
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1707:1: ( rule__Entity__ConstraintsAssignment_6 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==27) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1707:2: rule__Entity__ConstraintsAssignment_6
            	    {
            	    pushFollow(FOLLOW_rule__Entity__ConstraintsAssignment_6_in_rule__Entity__Group__6__Impl3426);
            	    rule__Entity__ConstraintsAssignment_6();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getEntityAccess().getConstraintsAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__Group__6__Impl


    // $ANTLR start rule__Entity__Group__7
    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1717:1: rule__Entity__Group__7 : rule__Entity__Group__7__Impl rule__Entity__Group__8 ;
    public final void rule__Entity__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1721:1: ( rule__Entity__Group__7__Impl rule__Entity__Group__8 )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1722:2: rule__Entity__Group__7__Impl rule__Entity__Group__8
            {
            pushFollow(FOLLOW_rule__Entity__Group__7__Impl_in_rule__Entity__Group__73457);
            rule__Entity__Group__7__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__8_in_rule__Entity__Group__73460);
            rule__Entity__Group__8();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__Group__7


    // $ANTLR start rule__Entity__Group__7__Impl
    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1729:1: rule__Entity__Group__7__Impl : ( ( rule__Entity__FunctionsAssignment_7 )* ) ;
    public final void rule__Entity__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1733:1: ( ( ( rule__Entity__FunctionsAssignment_7 )* ) )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1734:1: ( ( rule__Entity__FunctionsAssignment_7 )* )
            {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1734:1: ( ( rule__Entity__FunctionsAssignment_7 )* )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1735:1: ( rule__Entity__FunctionsAssignment_7 )*
            {
             before(grammarAccess.getEntityAccess().getFunctionsAssignment_7()); 
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1736:1: ( rule__Entity__FunctionsAssignment_7 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==29) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1736:2: rule__Entity__FunctionsAssignment_7
            	    {
            	    pushFollow(FOLLOW_rule__Entity__FunctionsAssignment_7_in_rule__Entity__Group__7__Impl3487);
            	    rule__Entity__FunctionsAssignment_7();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getEntityAccess().getFunctionsAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__Group__7__Impl


    // $ANTLR start rule__Entity__Group__8
    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1746:1: rule__Entity__Group__8 : rule__Entity__Group__8__Impl ;
    public final void rule__Entity__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1750:1: ( rule__Entity__Group__8__Impl )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1751:2: rule__Entity__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__Entity__Group__8__Impl_in_rule__Entity__Group__83518);
            rule__Entity__Group__8__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__Group__8


    // $ANTLR start rule__Entity__Group__8__Impl
    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1757:1: rule__Entity__Group__8__Impl : ( '}' ) ;
    public final void rule__Entity__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1761:1: ( ( '}' ) )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1762:1: ( '}' )
            {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1762:1: ( '}' )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1763:1: '}'
            {
             before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_8()); 
            match(input,20,FOLLOW_20_in_rule__Entity__Group__8__Impl3546); 
             after(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__Group__8__Impl


    // $ANTLR start rule__Entity__Group_3__0
    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1794:1: rule__Entity__Group_3__0 : rule__Entity__Group_3__0__Impl rule__Entity__Group_3__1 ;
    public final void rule__Entity__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1798:1: ( rule__Entity__Group_3__0__Impl rule__Entity__Group_3__1 )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1799:2: rule__Entity__Group_3__0__Impl rule__Entity__Group_3__1
            {
            pushFollow(FOLLOW_rule__Entity__Group_3__0__Impl_in_rule__Entity__Group_3__03595);
            rule__Entity__Group_3__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Entity__Group_3__1_in_rule__Entity__Group_3__03598);
            rule__Entity__Group_3__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__Group_3__0


    // $ANTLR start rule__Entity__Group_3__0__Impl
    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1806:1: rule__Entity__Group_3__0__Impl : ( 'extends' ) ;
    public final void rule__Entity__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1810:1: ( ( 'extends' ) )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1811:1: ( 'extends' )
            {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1811:1: ( 'extends' )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1812:1: 'extends'
            {
             before(grammarAccess.getEntityAccess().getExtendsKeyword_3_0()); 
            match(input,21,FOLLOW_21_in_rule__Entity__Group_3__0__Impl3626); 
             after(grammarAccess.getEntityAccess().getExtendsKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__Group_3__0__Impl


    // $ANTLR start rule__Entity__Group_3__1
    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1825:1: rule__Entity__Group_3__1 : rule__Entity__Group_3__1__Impl ;
    public final void rule__Entity__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1829:1: ( rule__Entity__Group_3__1__Impl )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1830:2: rule__Entity__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Entity__Group_3__1__Impl_in_rule__Entity__Group_3__13657);
            rule__Entity__Group_3__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__Group_3__1


    // $ANTLR start rule__Entity__Group_3__1__Impl
    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1836:1: rule__Entity__Group_3__1__Impl : ( ( rule__Entity__SuperTypeAssignment_3_1 ) ) ;
    public final void rule__Entity__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1840:1: ( ( ( rule__Entity__SuperTypeAssignment_3_1 ) ) )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1841:1: ( ( rule__Entity__SuperTypeAssignment_3_1 ) )
            {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1841:1: ( ( rule__Entity__SuperTypeAssignment_3_1 ) )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1842:1: ( rule__Entity__SuperTypeAssignment_3_1 )
            {
             before(grammarAccess.getEntityAccess().getSuperTypeAssignment_3_1()); 
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1843:1: ( rule__Entity__SuperTypeAssignment_3_1 )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1843:2: rule__Entity__SuperTypeAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Entity__SuperTypeAssignment_3_1_in_rule__Entity__Group_3__1__Impl3684);
            rule__Entity__SuperTypeAssignment_3_1();
            _fsp--;


            }

             after(grammarAccess.getEntityAccess().getSuperTypeAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__Group_3__1__Impl


    // $ANTLR start rule__Constraint__Group__0
    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1857:1: rule__Constraint__Group__0 : rule__Constraint__Group__0__Impl rule__Constraint__Group__1 ;
    public final void rule__Constraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1861:1: ( rule__Constraint__Group__0__Impl rule__Constraint__Group__1 )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1862:2: rule__Constraint__Group__0__Impl rule__Constraint__Group__1
            {
            pushFollow(FOLLOW_rule__Constraint__Group__0__Impl_in_rule__Constraint__Group__03718);
            rule__Constraint__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Constraint__Group__1_in_rule__Constraint__Group__03721);
            rule__Constraint__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Constraint__Group__0


    // $ANTLR start rule__Constraint__Group__0__Impl
    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1869:1: rule__Constraint__Group__0__Impl : ( 'constraint' ) ;
    public final void rule__Constraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1873:1: ( ( 'constraint' ) )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1874:1: ( 'constraint' )
            {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1874:1: ( 'constraint' )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1875:1: 'constraint'
            {
             before(grammarAccess.getConstraintAccess().getConstraintKeyword_0()); 
            match(input,27,FOLLOW_27_in_rule__Constraint__Group__0__Impl3749); 
             after(grammarAccess.getConstraintAccess().getConstraintKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Constraint__Group__0__Impl


    // $ANTLR start rule__Constraint__Group__1
    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1888:1: rule__Constraint__Group__1 : rule__Constraint__Group__1__Impl rule__Constraint__Group__2 ;
    public final void rule__Constraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1892:1: ( rule__Constraint__Group__1__Impl rule__Constraint__Group__2 )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1893:2: rule__Constraint__Group__1__Impl rule__Constraint__Group__2
            {
            pushFollow(FOLLOW_rule__Constraint__Group__1__Impl_in_rule__Constraint__Group__13780);
            rule__Constraint__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Constraint__Group__2_in_rule__Constraint__Group__13783);
            rule__Constraint__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Constraint__Group__1


    // $ANTLR start rule__Constraint__Group__1__Impl
    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1900:1: rule__Constraint__Group__1__Impl : ( ( rule__Constraint__NameAssignment_1 ) ) ;
    public final void rule__Constraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1904:1: ( ( ( rule__Constraint__NameAssignment_1 ) ) )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1905:1: ( ( rule__Constraint__NameAssignment_1 ) )
            {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1905:1: ( ( rule__Constraint__NameAssignment_1 ) )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1906:1: ( rule__Constraint__NameAssignment_1 )
            {
             before(grammarAccess.getConstraintAccess().getNameAssignment_1()); 
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1907:1: ( rule__Constraint__NameAssignment_1 )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1907:2: rule__Constraint__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Constraint__NameAssignment_1_in_rule__Constraint__Group__1__Impl3810);
            rule__Constraint__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getConstraintAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Constraint__Group__1__Impl


    // $ANTLR start rule__Constraint__Group__2
    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1917:1: rule__Constraint__Group__2 : rule__Constraint__Group__2__Impl rule__Constraint__Group__3 ;
    public final void rule__Constraint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1921:1: ( rule__Constraint__Group__2__Impl rule__Constraint__Group__3 )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1922:2: rule__Constraint__Group__2__Impl rule__Constraint__Group__3
            {
            pushFollow(FOLLOW_rule__Constraint__Group__2__Impl_in_rule__Constraint__Group__23840);
            rule__Constraint__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Constraint__Group__3_in_rule__Constraint__Group__23843);
            rule__Constraint__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Constraint__Group__2


    // $ANTLR start rule__Constraint__Group__2__Impl
    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1929:1: rule__Constraint__Group__2__Impl : ( 'uses' ) ;
    public final void rule__Constraint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1933:1: ( ( 'uses' ) )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1934:1: ( 'uses' )
            {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1934:1: ( 'uses' )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1935:1: 'uses'
            {
             before(grammarAccess.getConstraintAccess().getUsesKeyword_2()); 
            match(input,28,FOLLOW_28_in_rule__Constraint__Group__2__Impl3871); 
             after(grammarAccess.getConstraintAccess().getUsesKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Constraint__Group__2__Impl


    // $ANTLR start rule__Constraint__Group__3
    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1948:1: rule__Constraint__Group__3 : rule__Constraint__Group__3__Impl ;
    public final void rule__Constraint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1952:1: ( rule__Constraint__Group__3__Impl )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1953:2: rule__Constraint__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Constraint__Group__3__Impl_in_rule__Constraint__Group__33902);
            rule__Constraint__Group__3__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Constraint__Group__3


    // $ANTLR start rule__Constraint__Group__3__Impl
    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1959:1: rule__Constraint__Group__3__Impl : ( ( ( rule__Constraint__SlotsAssignment_3 ) ) ( ( rule__Constraint__SlotsAssignment_3 )* ) ) ;
    public final void rule__Constraint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1963:1: ( ( ( ( rule__Constraint__SlotsAssignment_3 ) ) ( ( rule__Constraint__SlotsAssignment_3 )* ) ) )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1964:1: ( ( ( rule__Constraint__SlotsAssignment_3 ) ) ( ( rule__Constraint__SlotsAssignment_3 )* ) )
            {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1964:1: ( ( ( rule__Constraint__SlotsAssignment_3 ) ) ( ( rule__Constraint__SlotsAssignment_3 )* ) )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1965:1: ( ( rule__Constraint__SlotsAssignment_3 ) ) ( ( rule__Constraint__SlotsAssignment_3 )* )
            {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1965:1: ( ( rule__Constraint__SlotsAssignment_3 ) )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1966:1: ( rule__Constraint__SlotsAssignment_3 )
            {
             before(grammarAccess.getConstraintAccess().getSlotsAssignment_3()); 
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1967:1: ( rule__Constraint__SlotsAssignment_3 )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1967:2: rule__Constraint__SlotsAssignment_3
            {
            pushFollow(FOLLOW_rule__Constraint__SlotsAssignment_3_in_rule__Constraint__Group__3__Impl3931);
            rule__Constraint__SlotsAssignment_3();
            _fsp--;


            }

             after(grammarAccess.getConstraintAccess().getSlotsAssignment_3()); 

            }

            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1970:1: ( ( rule__Constraint__SlotsAssignment_3 )* )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1971:1: ( rule__Constraint__SlotsAssignment_3 )*
            {
             before(grammarAccess.getConstraintAccess().getSlotsAssignment_3()); 
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1972:1: ( rule__Constraint__SlotsAssignment_3 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_ID) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1972:2: rule__Constraint__SlotsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Constraint__SlotsAssignment_3_in_rule__Constraint__Group__3__Impl3943);
            	    rule__Constraint__SlotsAssignment_3();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getConstraintAccess().getSlotsAssignment_3()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Constraint__Group__3__Impl


    // $ANTLR start rule__Function__Group__0
    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1991:1: rule__Function__Group__0 : rule__Function__Group__0__Impl rule__Function__Group__1 ;
    public final void rule__Function__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1995:1: ( rule__Function__Group__0__Impl rule__Function__Group__1 )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:1996:2: rule__Function__Group__0__Impl rule__Function__Group__1
            {
            pushFollow(FOLLOW_rule__Function__Group__0__Impl_in_rule__Function__Group__03984);
            rule__Function__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Function__Group__1_in_rule__Function__Group__03987);
            rule__Function__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Function__Group__0


    // $ANTLR start rule__Function__Group__0__Impl
    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2003:1: rule__Function__Group__0__Impl : ( 'function' ) ;
    public final void rule__Function__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2007:1: ( ( 'function' ) )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2008:1: ( 'function' )
            {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2008:1: ( 'function' )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2009:1: 'function'
            {
             before(grammarAccess.getFunctionAccess().getFunctionKeyword_0()); 
            match(input,29,FOLLOW_29_in_rule__Function__Group__0__Impl4015); 
             after(grammarAccess.getFunctionAccess().getFunctionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Function__Group__0__Impl


    // $ANTLR start rule__Function__Group__1
    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2022:1: rule__Function__Group__1 : rule__Function__Group__1__Impl rule__Function__Group__2 ;
    public final void rule__Function__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2026:1: ( rule__Function__Group__1__Impl rule__Function__Group__2 )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2027:2: rule__Function__Group__1__Impl rule__Function__Group__2
            {
            pushFollow(FOLLOW_rule__Function__Group__1__Impl_in_rule__Function__Group__14046);
            rule__Function__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Function__Group__2_in_rule__Function__Group__14049);
            rule__Function__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Function__Group__1


    // $ANTLR start rule__Function__Group__1__Impl
    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2034:1: rule__Function__Group__1__Impl : ( ( rule__Function__NameAssignment_1 ) ) ;
    public final void rule__Function__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2038:1: ( ( ( rule__Function__NameAssignment_1 ) ) )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2039:1: ( ( rule__Function__NameAssignment_1 ) )
            {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2039:1: ( ( rule__Function__NameAssignment_1 ) )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2040:1: ( rule__Function__NameAssignment_1 )
            {
             before(grammarAccess.getFunctionAccess().getNameAssignment_1()); 
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2041:1: ( rule__Function__NameAssignment_1 )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2041:2: rule__Function__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Function__NameAssignment_1_in_rule__Function__Group__1__Impl4076);
            rule__Function__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getFunctionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Function__Group__1__Impl


    // $ANTLR start rule__Function__Group__2
    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2051:1: rule__Function__Group__2 : rule__Function__Group__2__Impl rule__Function__Group__3 ;
    public final void rule__Function__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2055:1: ( rule__Function__Group__2__Impl rule__Function__Group__3 )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2056:2: rule__Function__Group__2__Impl rule__Function__Group__3
            {
            pushFollow(FOLLOW_rule__Function__Group__2__Impl_in_rule__Function__Group__24106);
            rule__Function__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Function__Group__3_in_rule__Function__Group__24109);
            rule__Function__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Function__Group__2


    // $ANTLR start rule__Function__Group__2__Impl
    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2063:1: rule__Function__Group__2__Impl : ( ':' ) ;
    public final void rule__Function__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2067:1: ( ( ':' ) )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2068:1: ( ':' )
            {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2068:1: ( ':' )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2069:1: ':'
            {
             before(grammarAccess.getFunctionAccess().getColonKeyword_2()); 
            match(input,24,FOLLOW_24_in_rule__Function__Group__2__Impl4137); 
             after(grammarAccess.getFunctionAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Function__Group__2__Impl


    // $ANTLR start rule__Function__Group__3
    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2082:1: rule__Function__Group__3 : rule__Function__Group__3__Impl rule__Function__Group__4 ;
    public final void rule__Function__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2086:1: ( rule__Function__Group__3__Impl rule__Function__Group__4 )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2087:2: rule__Function__Group__3__Impl rule__Function__Group__4
            {
            pushFollow(FOLLOW_rule__Function__Group__3__Impl_in_rule__Function__Group__34168);
            rule__Function__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Function__Group__4_in_rule__Function__Group__34171);
            rule__Function__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Function__Group__3


    // $ANTLR start rule__Function__Group__3__Impl
    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2094:1: rule__Function__Group__3__Impl : ( ( rule__Function__ReturnTypeAssignment_3 ) ) ;
    public final void rule__Function__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2098:1: ( ( ( rule__Function__ReturnTypeAssignment_3 ) ) )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2099:1: ( ( rule__Function__ReturnTypeAssignment_3 ) )
            {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2099:1: ( ( rule__Function__ReturnTypeAssignment_3 ) )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2100:1: ( rule__Function__ReturnTypeAssignment_3 )
            {
             before(grammarAccess.getFunctionAccess().getReturnTypeAssignment_3()); 
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2101:1: ( rule__Function__ReturnTypeAssignment_3 )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2101:2: rule__Function__ReturnTypeAssignment_3
            {
            pushFollow(FOLLOW_rule__Function__ReturnTypeAssignment_3_in_rule__Function__Group__3__Impl4198);
            rule__Function__ReturnTypeAssignment_3();
            _fsp--;


            }

             after(grammarAccess.getFunctionAccess().getReturnTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Function__Group__3__Impl


    // $ANTLR start rule__Function__Group__4
    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2111:1: rule__Function__Group__4 : rule__Function__Group__4__Impl ;
    public final void rule__Function__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2115:1: ( rule__Function__Group__4__Impl )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2116:2: rule__Function__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Function__Group__4__Impl_in_rule__Function__Group__44228);
            rule__Function__Group__4__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Function__Group__4


    // $ANTLR start rule__Function__Group__4__Impl
    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2122:1: rule__Function__Group__4__Impl : ( ( rule__Function__Group_4__0 )? ) ;
    public final void rule__Function__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2126:1: ( ( ( rule__Function__Group_4__0 )? ) )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2127:1: ( ( rule__Function__Group_4__0 )? )
            {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2127:1: ( ( rule__Function__Group_4__0 )? )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2128:1: ( rule__Function__Group_4__0 )?
            {
             before(grammarAccess.getFunctionAccess().getGroup_4()); 
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2129:1: ( rule__Function__Group_4__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==30) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2129:2: rule__Function__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Function__Group_4__0_in_rule__Function__Group__4__Impl4255);
                    rule__Function__Group_4__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFunctionAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Function__Group__4__Impl


    // $ANTLR start rule__Function__Group_4__0
    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2149:1: rule__Function__Group_4__0 : rule__Function__Group_4__0__Impl rule__Function__Group_4__1 ;
    public final void rule__Function__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2153:1: ( rule__Function__Group_4__0__Impl rule__Function__Group_4__1 )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2154:2: rule__Function__Group_4__0__Impl rule__Function__Group_4__1
            {
            pushFollow(FOLLOW_rule__Function__Group_4__0__Impl_in_rule__Function__Group_4__04296);
            rule__Function__Group_4__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Function__Group_4__1_in_rule__Function__Group_4__04299);
            rule__Function__Group_4__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Function__Group_4__0


    // $ANTLR start rule__Function__Group_4__0__Impl
    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2161:1: rule__Function__Group_4__0__Impl : ( '(' ) ;
    public final void rule__Function__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2165:1: ( ( '(' ) )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2166:1: ( '(' )
            {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2166:1: ( '(' )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2167:1: '('
            {
             before(grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_4_0()); 
            match(input,30,FOLLOW_30_in_rule__Function__Group_4__0__Impl4327); 
             after(grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Function__Group_4__0__Impl


    // $ANTLR start rule__Function__Group_4__1
    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2180:1: rule__Function__Group_4__1 : rule__Function__Group_4__1__Impl rule__Function__Group_4__2 ;
    public final void rule__Function__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2184:1: ( rule__Function__Group_4__1__Impl rule__Function__Group_4__2 )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2185:2: rule__Function__Group_4__1__Impl rule__Function__Group_4__2
            {
            pushFollow(FOLLOW_rule__Function__Group_4__1__Impl_in_rule__Function__Group_4__14358);
            rule__Function__Group_4__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Function__Group_4__2_in_rule__Function__Group_4__14361);
            rule__Function__Group_4__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Function__Group_4__1


    // $ANTLR start rule__Function__Group_4__1__Impl
    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2192:1: rule__Function__Group_4__1__Impl : ( ( ( rule__Function__ArgumentsAssignment_4_1 ) ) ( ( rule__Function__ArgumentsAssignment_4_1 )* ) ) ;
    public final void rule__Function__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2196:1: ( ( ( ( rule__Function__ArgumentsAssignment_4_1 ) ) ( ( rule__Function__ArgumentsAssignment_4_1 )* ) ) )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2197:1: ( ( ( rule__Function__ArgumentsAssignment_4_1 ) ) ( ( rule__Function__ArgumentsAssignment_4_1 )* ) )
            {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2197:1: ( ( ( rule__Function__ArgumentsAssignment_4_1 ) ) ( ( rule__Function__ArgumentsAssignment_4_1 )* ) )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2198:1: ( ( rule__Function__ArgumentsAssignment_4_1 ) ) ( ( rule__Function__ArgumentsAssignment_4_1 )* )
            {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2198:1: ( ( rule__Function__ArgumentsAssignment_4_1 ) )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2199:1: ( rule__Function__ArgumentsAssignment_4_1 )
            {
             before(grammarAccess.getFunctionAccess().getArgumentsAssignment_4_1()); 
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2200:1: ( rule__Function__ArgumentsAssignment_4_1 )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2200:2: rule__Function__ArgumentsAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Function__ArgumentsAssignment_4_1_in_rule__Function__Group_4__1__Impl4390);
            rule__Function__ArgumentsAssignment_4_1();
            _fsp--;


            }

             after(grammarAccess.getFunctionAccess().getArgumentsAssignment_4_1()); 

            }

            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2203:1: ( ( rule__Function__ArgumentsAssignment_4_1 )* )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2204:1: ( rule__Function__ArgumentsAssignment_4_1 )*
            {
             before(grammarAccess.getFunctionAccess().getArgumentsAssignment_4_1()); 
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2205:1: ( rule__Function__ArgumentsAssignment_4_1 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_ID) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2205:2: rule__Function__ArgumentsAssignment_4_1
            	    {
            	    pushFollow(FOLLOW_rule__Function__ArgumentsAssignment_4_1_in_rule__Function__Group_4__1__Impl4402);
            	    rule__Function__ArgumentsAssignment_4_1();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getFunctionAccess().getArgumentsAssignment_4_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Function__Group_4__1__Impl


    // $ANTLR start rule__Function__Group_4__2
    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2216:1: rule__Function__Group_4__2 : rule__Function__Group_4__2__Impl ;
    public final void rule__Function__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2220:1: ( rule__Function__Group_4__2__Impl )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2221:2: rule__Function__Group_4__2__Impl
            {
            pushFollow(FOLLOW_rule__Function__Group_4__2__Impl_in_rule__Function__Group_4__24435);
            rule__Function__Group_4__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Function__Group_4__2


    // $ANTLR start rule__Function__Group_4__2__Impl
    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2227:1: rule__Function__Group_4__2__Impl : ( ')' ) ;
    public final void rule__Function__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2231:1: ( ( ')' ) )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2232:1: ( ')' )
            {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2232:1: ( ')' )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2233:1: ')'
            {
             before(grammarAccess.getFunctionAccess().getRightParenthesisKeyword_4_2()); 
            match(input,31,FOLLOW_31_in_rule__Function__Group_4__2__Impl4463); 
             after(grammarAccess.getFunctionAccess().getRightParenthesisKeyword_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Function__Group_4__2__Impl


    // $ANTLR start rule__Argument__Group__0
    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2252:1: rule__Argument__Group__0 : rule__Argument__Group__0__Impl rule__Argument__Group__1 ;
    public final void rule__Argument__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2256:1: ( rule__Argument__Group__0__Impl rule__Argument__Group__1 )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2257:2: rule__Argument__Group__0__Impl rule__Argument__Group__1
            {
            pushFollow(FOLLOW_rule__Argument__Group__0__Impl_in_rule__Argument__Group__04500);
            rule__Argument__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Argument__Group__1_in_rule__Argument__Group__04503);
            rule__Argument__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group__0


    // $ANTLR start rule__Argument__Group__0__Impl
    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2264:1: rule__Argument__Group__0__Impl : ( ( rule__Argument__TypeAssignment_0 ) ) ;
    public final void rule__Argument__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2268:1: ( ( ( rule__Argument__TypeAssignment_0 ) ) )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2269:1: ( ( rule__Argument__TypeAssignment_0 ) )
            {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2269:1: ( ( rule__Argument__TypeAssignment_0 ) )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2270:1: ( rule__Argument__TypeAssignment_0 )
            {
             before(grammarAccess.getArgumentAccess().getTypeAssignment_0()); 
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2271:1: ( rule__Argument__TypeAssignment_0 )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2271:2: rule__Argument__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__Argument__TypeAssignment_0_in_rule__Argument__Group__0__Impl4530);
            rule__Argument__TypeAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getArgumentAccess().getTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group__0__Impl


    // $ANTLR start rule__Argument__Group__1
    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2281:1: rule__Argument__Group__1 : rule__Argument__Group__1__Impl ;
    public final void rule__Argument__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2285:1: ( rule__Argument__Group__1__Impl )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2286:2: rule__Argument__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Argument__Group__1__Impl_in_rule__Argument__Group__14560);
            rule__Argument__Group__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group__1


    // $ANTLR start rule__Argument__Group__1__Impl
    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2292:1: rule__Argument__Group__1__Impl : ( ( rule__Argument__NameAssignment_1 ) ) ;
    public final void rule__Argument__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2296:1: ( ( ( rule__Argument__NameAssignment_1 ) ) )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2297:1: ( ( rule__Argument__NameAssignment_1 ) )
            {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2297:1: ( ( rule__Argument__NameAssignment_1 ) )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2298:1: ( rule__Argument__NameAssignment_1 )
            {
             before(grammarAccess.getArgumentAccess().getNameAssignment_1()); 
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2299:1: ( rule__Argument__NameAssignment_1 )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2299:2: rule__Argument__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Argument__NameAssignment_1_in_rule__Argument__Group__1__Impl4587);
            rule__Argument__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getArgumentAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group__1__Impl


    // $ANTLR start rule__Entity__UnorderedGroup_0
    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2314:1: rule__Entity__UnorderedGroup_0 : ( rule__Entity__UnorderedGroup_0__0 )? ;
    public final void rule__Entity__UnorderedGroup_0() throws RecognitionException {

            	int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getEntityAccess().getUnorderedGroup_0());
            
        try {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2319:1: ( ( rule__Entity__UnorderedGroup_0__0 )? )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2320:2: ( rule__Entity__UnorderedGroup_0__0 )?
            {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2320:2: ( rule__Entity__UnorderedGroup_0__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( LA20_0 ==32 && getUnorderedGroupHelper().canSelect(grammarAccess.getEntityAccess().getUnorderedGroup_0(), 0) ) {
                alt20=1;
            }
            else if ( LA20_0 ==33 && getUnorderedGroupHelper().canSelect(grammarAccess.getEntityAccess().getUnorderedGroup_0(), 1) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2320:2: rule__Entity__UnorderedGroup_0__0
                    {
                    pushFollow(FOLLOW_rule__Entity__UnorderedGroup_0__0_in_rule__Entity__UnorderedGroup_04622);
                    rule__Entity__UnorderedGroup_0__0();
                    _fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getEntityAccess().getUnorderedGroup_0());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__UnorderedGroup_0


    // $ANTLR start rule__Entity__UnorderedGroup_0__Impl
    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2330:1: rule__Entity__UnorderedGroup_0__Impl : ( ({...}? => ( ( ( rule__Entity__TransientAssignment_0_0 ) ) ) ) | ({...}? => ( ( ( rule__Entity__AbstractAssignment_0_1 ) ) ) ) ) ;
    public final void rule__Entity__UnorderedGroup_0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
            
        try {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2335:1: ( ( ({...}? => ( ( ( rule__Entity__TransientAssignment_0_0 ) ) ) ) | ({...}? => ( ( ( rule__Entity__AbstractAssignment_0_1 ) ) ) ) ) )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2336:3: ( ({...}? => ( ( ( rule__Entity__TransientAssignment_0_0 ) ) ) ) | ({...}? => ( ( ( rule__Entity__AbstractAssignment_0_1 ) ) ) ) )
            {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2336:3: ( ({...}? => ( ( ( rule__Entity__TransientAssignment_0_0 ) ) ) ) | ({...}? => ( ( ( rule__Entity__AbstractAssignment_0_1 ) ) ) ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( LA21_0 ==32 && getUnorderedGroupHelper().canSelect(grammarAccess.getEntityAccess().getUnorderedGroup_0(), 0) ) {
                alt21=1;
            }
            else if ( LA21_0 ==33 && getUnorderedGroupHelper().canSelect(grammarAccess.getEntityAccess().getUnorderedGroup_0(), 1) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("2336:3: ( ({...}? => ( ( ( rule__Entity__TransientAssignment_0_0 ) ) ) ) | ({...}? => ( ( ( rule__Entity__AbstractAssignment_0_1 ) ) ) ) )", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2338:4: ({...}? => ( ( ( rule__Entity__TransientAssignment_0_0 ) ) ) )
                    {
                    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2338:4: ({...}? => ( ( ( rule__Entity__TransientAssignment_0_0 ) ) ) )
                    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2339:5: {...}? => ( ( ( rule__Entity__TransientAssignment_0_0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEntityAccess().getUnorderedGroup_0(), 0) ) {
                        throw new FailedPredicateException(input, "rule__Entity__UnorderedGroup_0__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getEntityAccess().getUnorderedGroup_0(), 0)");
                    }
                    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2339:103: ( ( ( rule__Entity__TransientAssignment_0_0 ) ) )
                    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2340:6: ( ( rule__Entity__TransientAssignment_0_0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getEntityAccess().getUnorderedGroup_0(), 0);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2346:6: ( ( rule__Entity__TransientAssignment_0_0 ) )
                    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2348:7: ( rule__Entity__TransientAssignment_0_0 )
                    {
                     before(grammarAccess.getEntityAccess().getTransientAssignment_0_0()); 
                    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2349:7: ( rule__Entity__TransientAssignment_0_0 )
                    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2349:8: rule__Entity__TransientAssignment_0_0
                    {
                    pushFollow(FOLLOW_rule__Entity__TransientAssignment_0_0_in_rule__Entity__UnorderedGroup_0__Impl4709);
                    rule__Entity__TransientAssignment_0_0();
                    _fsp--;


                    }

                     after(grammarAccess.getEntityAccess().getTransientAssignment_0_0()); 

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2355:4: ({...}? => ( ( ( rule__Entity__AbstractAssignment_0_1 ) ) ) )
                    {
                    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2355:4: ({...}? => ( ( ( rule__Entity__AbstractAssignment_0_1 ) ) ) )
                    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2356:5: {...}? => ( ( ( rule__Entity__AbstractAssignment_0_1 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEntityAccess().getUnorderedGroup_0(), 1) ) {
                        throw new FailedPredicateException(input, "rule__Entity__UnorderedGroup_0__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getEntityAccess().getUnorderedGroup_0(), 1)");
                    }
                    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2356:103: ( ( ( rule__Entity__AbstractAssignment_0_1 ) ) )
                    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2357:6: ( ( rule__Entity__AbstractAssignment_0_1 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getEntityAccess().getUnorderedGroup_0(), 1);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2363:6: ( ( rule__Entity__AbstractAssignment_0_1 ) )
                    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2365:7: ( rule__Entity__AbstractAssignment_0_1 )
                    {
                     before(grammarAccess.getEntityAccess().getAbstractAssignment_0_1()); 
                    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2366:7: ( rule__Entity__AbstractAssignment_0_1 )
                    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2366:8: rule__Entity__AbstractAssignment_0_1
                    {
                    pushFollow(FOLLOW_rule__Entity__AbstractAssignment_0_1_in_rule__Entity__UnorderedGroup_0__Impl4800);
                    rule__Entity__AbstractAssignment_0_1();
                    _fsp--;


                    }

                     after(grammarAccess.getEntityAccess().getAbstractAssignment_0_1()); 

                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEntityAccess().getUnorderedGroup_0());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__UnorderedGroup_0__Impl


    // $ANTLR start rule__Entity__UnorderedGroup_0__0
    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2381:1: rule__Entity__UnorderedGroup_0__0 : rule__Entity__UnorderedGroup_0__Impl ( rule__Entity__UnorderedGroup_0__1 )? ;
    public final void rule__Entity__UnorderedGroup_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2385:1: ( rule__Entity__UnorderedGroup_0__Impl ( rule__Entity__UnorderedGroup_0__1 )? )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2386:2: rule__Entity__UnorderedGroup_0__Impl ( rule__Entity__UnorderedGroup_0__1 )?
            {
            pushFollow(FOLLOW_rule__Entity__UnorderedGroup_0__Impl_in_rule__Entity__UnorderedGroup_0__04859);
            rule__Entity__UnorderedGroup_0__Impl();
            _fsp--;

            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2387:2: ( rule__Entity__UnorderedGroup_0__1 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( LA22_0 ==32 && getUnorderedGroupHelper().canSelect(grammarAccess.getEntityAccess().getUnorderedGroup_0(), 0) ) {
                alt22=1;
            }
            else if ( LA22_0 ==33 && getUnorderedGroupHelper().canSelect(grammarAccess.getEntityAccess().getUnorderedGroup_0(), 1) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2387:2: rule__Entity__UnorderedGroup_0__1
                    {
                    pushFollow(FOLLOW_rule__Entity__UnorderedGroup_0__1_in_rule__Entity__UnorderedGroup_0__04862);
                    rule__Entity__UnorderedGroup_0__1();
                    _fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__UnorderedGroup_0__0


    // $ANTLR start rule__Entity__UnorderedGroup_0__1
    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2394:1: rule__Entity__UnorderedGroup_0__1 : rule__Entity__UnorderedGroup_0__Impl ;
    public final void rule__Entity__UnorderedGroup_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2398:1: ( rule__Entity__UnorderedGroup_0__Impl )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2399:2: rule__Entity__UnorderedGroup_0__Impl
            {
            pushFollow(FOLLOW_rule__Entity__UnorderedGroup_0__Impl_in_rule__Entity__UnorderedGroup_0__14887);
            rule__Entity__UnorderedGroup_0__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__UnorderedGroup_0__1


    // $ANTLR start rule__DataModel__PrimitivesAssignment_0
    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2410:1: rule__DataModel__PrimitivesAssignment_0 : ( rulePrimitiveTypes ) ;
    public final void rule__DataModel__PrimitivesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2414:1: ( ( rulePrimitiveTypes ) )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2415:1: ( rulePrimitiveTypes )
            {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2415:1: ( rulePrimitiveTypes )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2416:1: rulePrimitiveTypes
            {
             before(grammarAccess.getDataModelAccess().getPrimitivesPrimitiveTypesParserRuleCall_0_0()); 
            pushFollow(FOLLOW_rulePrimitiveTypes_in_rule__DataModel__PrimitivesAssignment_04919);
            rulePrimitiveTypes();
            _fsp--;

             after(grammarAccess.getDataModelAccess().getPrimitivesPrimitiveTypesParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DataModel__PrimitivesAssignment_0


    // $ANTLR start rule__DataModel__CompoundTypesAssignment_1
    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2425:1: rule__DataModel__CompoundTypesAssignment_1 : ( ruleCompoundType ) ;
    public final void rule__DataModel__CompoundTypesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2429:1: ( ( ruleCompoundType ) )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2430:1: ( ruleCompoundType )
            {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2430:1: ( ruleCompoundType )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2431:1: ruleCompoundType
            {
             before(grammarAccess.getDataModelAccess().getCompoundTypesCompoundTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleCompoundType_in_rule__DataModel__CompoundTypesAssignment_14950);
            ruleCompoundType();
            _fsp--;

             after(grammarAccess.getDataModelAccess().getCompoundTypesCompoundTypeParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DataModel__CompoundTypesAssignment_1


    // $ANTLR start rule__PrimitiveTypes__PrimitiveTypesAssignment_3
    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2440:1: rule__PrimitiveTypes__PrimitiveTypesAssignment_3 : ( rulePrimitiveType ) ;
    public final void rule__PrimitiveTypes__PrimitiveTypesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2444:1: ( ( rulePrimitiveType ) )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2445:1: ( rulePrimitiveType )
            {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2445:1: ( rulePrimitiveType )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2446:1: rulePrimitiveType
            {
             before(grammarAccess.getPrimitiveTypesAccess().getPrimitiveTypesPrimitiveTypeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_rulePrimitiveType_in_rule__PrimitiveTypes__PrimitiveTypesAssignment_34981);
            rulePrimitiveType();
            _fsp--;

             after(grammarAccess.getPrimitiveTypesAccess().getPrimitiveTypesPrimitiveTypeParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PrimitiveTypes__PrimitiveTypesAssignment_3


    // $ANTLR start rule__PrimitiveType__NameAssignment_0
    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2455:1: rule__PrimitiveType__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__PrimitiveType__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2459:1: ( ( RULE_ID ) )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2460:1: ( RULE_ID )
            {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2460:1: ( RULE_ID )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2461:1: RULE_ID
            {
             before(grammarAccess.getPrimitiveTypeAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__PrimitiveType__NameAssignment_05012); 
             after(grammarAccess.getPrimitiveTypeAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PrimitiveType__NameAssignment_0


    // $ANTLR start rule__PrimitiveType__SuperTypeAssignment_1_0_1
    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2470:1: rule__PrimitiveType__SuperTypeAssignment_1_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__PrimitiveType__SuperTypeAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2474:1: ( ( ( RULE_ID ) ) )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2475:1: ( ( RULE_ID ) )
            {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2475:1: ( ( RULE_ID ) )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2476:1: ( RULE_ID )
            {
             before(grammarAccess.getPrimitiveTypeAccess().getSuperTypePrimitiveTypeCrossReference_1_0_1_0()); 
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2477:1: ( RULE_ID )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2478:1: RULE_ID
            {
             before(grammarAccess.getPrimitiveTypeAccess().getSuperTypePrimitiveTypeIDTerminalRuleCall_1_0_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__PrimitiveType__SuperTypeAssignment_1_0_15047); 
             after(grammarAccess.getPrimitiveTypeAccess().getSuperTypePrimitiveTypeIDTerminalRuleCall_1_0_1_0_1()); 

            }

             after(grammarAccess.getPrimitiveTypeAccess().getSuperTypePrimitiveTypeCrossReference_1_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PrimitiveType__SuperTypeAssignment_1_0_1


    // $ANTLR start rule__PrimitiveType__RealizationTypeAssignment_1_1_1
    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2489:1: rule__PrimitiveType__RealizationTypeAssignment_1_1_1 : ( ruleMetaPrimitiveType ) ;
    public final void rule__PrimitiveType__RealizationTypeAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2493:1: ( ( ruleMetaPrimitiveType ) )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2494:1: ( ruleMetaPrimitiveType )
            {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2494:1: ( ruleMetaPrimitiveType )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2495:1: ruleMetaPrimitiveType
            {
             before(grammarAccess.getPrimitiveTypeAccess().getRealizationTypeMetaPrimitiveTypeEnumRuleCall_1_1_1_0()); 
            pushFollow(FOLLOW_ruleMetaPrimitiveType_in_rule__PrimitiveType__RealizationTypeAssignment_1_1_15082);
            ruleMetaPrimitiveType();
            _fsp--;

             after(grammarAccess.getPrimitiveTypeAccess().getRealizationTypeMetaPrimitiveTypeEnumRuleCall_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PrimitiveType__RealizationTypeAssignment_1_1_1


    // $ANTLR start rule__DataType__NameAssignment_1
    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2504:1: rule__DataType__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DataType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2508:1: ( ( RULE_ID ) )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2509:1: ( RULE_ID )
            {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2509:1: ( RULE_ID )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2510:1: RULE_ID
            {
             before(grammarAccess.getDataTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DataType__NameAssignment_15113); 
             after(grammarAccess.getDataTypeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DataType__NameAssignment_1


    // $ANTLR start rule__DataType__FieldsAssignment_3
    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2519:1: rule__DataType__FieldsAssignment_3 : ( ruleField ) ;
    public final void rule__DataType__FieldsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2523:1: ( ( ruleField ) )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2524:1: ( ruleField )
            {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2524:1: ( ruleField )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2525:1: ruleField
            {
             before(grammarAccess.getDataTypeAccess().getFieldsFieldParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleField_in_rule__DataType__FieldsAssignment_35144);
            ruleField();
            _fsp--;

             after(grammarAccess.getDataTypeAccess().getFieldsFieldParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DataType__FieldsAssignment_3


    // $ANTLR start rule__DataType__ConstraintsAssignment_4
    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2534:1: rule__DataType__ConstraintsAssignment_4 : ( ruleConstraint ) ;
    public final void rule__DataType__ConstraintsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2538:1: ( ( ruleConstraint ) )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2539:1: ( ruleConstraint )
            {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2539:1: ( ruleConstraint )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2540:1: ruleConstraint
            {
             before(grammarAccess.getDataTypeAccess().getConstraintsConstraintParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleConstraint_in_rule__DataType__ConstraintsAssignment_45175);
            ruleConstraint();
            _fsp--;

             after(grammarAccess.getDataTypeAccess().getConstraintsConstraintParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DataType__ConstraintsAssignment_4


    // $ANTLR start rule__DataType__FunctionsAssignment_5
    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2549:1: rule__DataType__FunctionsAssignment_5 : ( ruleFunction ) ;
    public final void rule__DataType__FunctionsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2553:1: ( ( ruleFunction ) )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2554:1: ( ruleFunction )
            {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2554:1: ( ruleFunction )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2555:1: ruleFunction
            {
             before(grammarAccess.getDataTypeAccess().getFunctionsFunctionParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleFunction_in_rule__DataType__FunctionsAssignment_55206);
            ruleFunction();
            _fsp--;

             after(grammarAccess.getDataTypeAccess().getFunctionsFunctionParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DataType__FunctionsAssignment_5


    // $ANTLR start rule__Field__ModifierAssignment_0
    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2564:1: rule__Field__ModifierAssignment_0 : ( ruleModifier ) ;
    public final void rule__Field__ModifierAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2568:1: ( ( ruleModifier ) )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2569:1: ( ruleModifier )
            {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2569:1: ( ruleModifier )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2570:1: ruleModifier
            {
             before(grammarAccess.getFieldAccess().getModifierModifierEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleModifier_in_rule__Field__ModifierAssignment_05237);
            ruleModifier();
            _fsp--;

             after(grammarAccess.getFieldAccess().getModifierModifierEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Field__ModifierAssignment_0


    // $ANTLR start rule__Field__NameAssignment_1
    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2579:1: rule__Field__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Field__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2583:1: ( ( RULE_ID ) )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2584:1: ( RULE_ID )
            {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2584:1: ( RULE_ID )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2585:1: RULE_ID
            {
             before(grammarAccess.getFieldAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Field__NameAssignment_15268); 
             after(grammarAccess.getFieldAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Field__NameAssignment_1


    // $ANTLR start rule__Field__TypeAssignment_3
    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2594:1: rule__Field__TypeAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Field__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2598:1: ( ( ( RULE_ID ) ) )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2599:1: ( ( RULE_ID ) )
            {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2599:1: ( ( RULE_ID ) )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2600:1: ( RULE_ID )
            {
             before(grammarAccess.getFieldAccess().getTypeTypeCrossReference_3_0()); 
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2601:1: ( RULE_ID )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2602:1: RULE_ID
            {
             before(grammarAccess.getFieldAccess().getTypeTypeIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Field__TypeAssignment_35303); 
             after(grammarAccess.getFieldAccess().getTypeTypeIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getFieldAccess().getTypeTypeCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Field__TypeAssignment_3


    // $ANTLR start rule__Enumeration__NameAssignment_1
    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2613:1: rule__Enumeration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Enumeration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2617:1: ( ( RULE_ID ) )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2618:1: ( RULE_ID )
            {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2618:1: ( RULE_ID )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2619:1: RULE_ID
            {
             before(grammarAccess.getEnumerationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Enumeration__NameAssignment_15338); 
             after(grammarAccess.getEnumerationAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Enumeration__NameAssignment_1


    // $ANTLR start rule__Enumeration__LiteralsAssignment_3
    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2628:1: rule__Enumeration__LiteralsAssignment_3 : ( ruleEnumLiteral ) ;
    public final void rule__Enumeration__LiteralsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2632:1: ( ( ruleEnumLiteral ) )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2633:1: ( ruleEnumLiteral )
            {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2633:1: ( ruleEnumLiteral )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2634:1: ruleEnumLiteral
            {
             before(grammarAccess.getEnumerationAccess().getLiteralsEnumLiteralParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleEnumLiteral_in_rule__Enumeration__LiteralsAssignment_35369);
            ruleEnumLiteral();
            _fsp--;

             after(grammarAccess.getEnumerationAccess().getLiteralsEnumLiteralParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Enumeration__LiteralsAssignment_3


    // $ANTLR start rule__EnumLiteral__NameAssignment
    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2643:1: rule__EnumLiteral__NameAssignment : ( RULE_ID ) ;
    public final void rule__EnumLiteral__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2647:1: ( ( RULE_ID ) )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2648:1: ( RULE_ID )
            {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2648:1: ( RULE_ID )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2649:1: RULE_ID
            {
             before(grammarAccess.getEnumLiteralAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumLiteral__NameAssignment5400); 
             after(grammarAccess.getEnumLiteralAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EnumLiteral__NameAssignment


    // $ANTLR start rule__Entity__TransientAssignment_0_0
    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2658:1: rule__Entity__TransientAssignment_0_0 : ( ( 'transient' ) ) ;
    public final void rule__Entity__TransientAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2662:1: ( ( ( 'transient' ) ) )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2663:1: ( ( 'transient' ) )
            {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2663:1: ( ( 'transient' ) )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2664:1: ( 'transient' )
            {
             before(grammarAccess.getEntityAccess().getTransientTransientKeyword_0_0_0()); 
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2665:1: ( 'transient' )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2666:1: 'transient'
            {
             before(grammarAccess.getEntityAccess().getTransientTransientKeyword_0_0_0()); 
            match(input,32,FOLLOW_32_in_rule__Entity__TransientAssignment_0_05436); 
             after(grammarAccess.getEntityAccess().getTransientTransientKeyword_0_0_0()); 

            }

             after(grammarAccess.getEntityAccess().getTransientTransientKeyword_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__TransientAssignment_0_0


    // $ANTLR start rule__Entity__AbstractAssignment_0_1
    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2681:1: rule__Entity__AbstractAssignment_0_1 : ( ( 'abstract' ) ) ;
    public final void rule__Entity__AbstractAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2685:1: ( ( ( 'abstract' ) ) )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2686:1: ( ( 'abstract' ) )
            {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2686:1: ( ( 'abstract' ) )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2687:1: ( 'abstract' )
            {
             before(grammarAccess.getEntityAccess().getAbstractAbstractKeyword_0_1_0()); 
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2688:1: ( 'abstract' )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2689:1: 'abstract'
            {
             before(grammarAccess.getEntityAccess().getAbstractAbstractKeyword_0_1_0()); 
            match(input,33,FOLLOW_33_in_rule__Entity__AbstractAssignment_0_15480); 
             after(grammarAccess.getEntityAccess().getAbstractAbstractKeyword_0_1_0()); 

            }

             after(grammarAccess.getEntityAccess().getAbstractAbstractKeyword_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__AbstractAssignment_0_1


    // $ANTLR start rule__Entity__NameAssignment_2
    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2704:1: rule__Entity__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2708:1: ( ( RULE_ID ) )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2709:1: ( RULE_ID )
            {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2709:1: ( RULE_ID )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2710:1: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Entity__NameAssignment_25519); 
             after(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__NameAssignment_2


    // $ANTLR start rule__Entity__SuperTypeAssignment_3_1
    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2719:1: rule__Entity__SuperTypeAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__Entity__SuperTypeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2723:1: ( ( ( RULE_ID ) ) )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2724:1: ( ( RULE_ID ) )
            {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2724:1: ( ( RULE_ID ) )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2725:1: ( RULE_ID )
            {
             before(grammarAccess.getEntityAccess().getSuperTypeEntityCrossReference_3_1_0()); 
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2726:1: ( RULE_ID )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2727:1: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getSuperTypeEntityIDTerminalRuleCall_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Entity__SuperTypeAssignment_3_15554); 
             after(grammarAccess.getEntityAccess().getSuperTypeEntityIDTerminalRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getEntityAccess().getSuperTypeEntityCrossReference_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__SuperTypeAssignment_3_1


    // $ANTLR start rule__Entity__FieldsAssignment_5
    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2738:1: rule__Entity__FieldsAssignment_5 : ( ruleField ) ;
    public final void rule__Entity__FieldsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2742:1: ( ( ruleField ) )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2743:1: ( ruleField )
            {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2743:1: ( ruleField )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2744:1: ruleField
            {
             before(grammarAccess.getEntityAccess().getFieldsFieldParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleField_in_rule__Entity__FieldsAssignment_55589);
            ruleField();
            _fsp--;

             after(grammarAccess.getEntityAccess().getFieldsFieldParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__FieldsAssignment_5


    // $ANTLR start rule__Entity__ConstraintsAssignment_6
    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2753:1: rule__Entity__ConstraintsAssignment_6 : ( ruleConstraint ) ;
    public final void rule__Entity__ConstraintsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2757:1: ( ( ruleConstraint ) )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2758:1: ( ruleConstraint )
            {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2758:1: ( ruleConstraint )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2759:1: ruleConstraint
            {
             before(grammarAccess.getEntityAccess().getConstraintsConstraintParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleConstraint_in_rule__Entity__ConstraintsAssignment_65620);
            ruleConstraint();
            _fsp--;

             after(grammarAccess.getEntityAccess().getConstraintsConstraintParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__ConstraintsAssignment_6


    // $ANTLR start rule__Entity__FunctionsAssignment_7
    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2768:1: rule__Entity__FunctionsAssignment_7 : ( ruleFunction ) ;
    public final void rule__Entity__FunctionsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2772:1: ( ( ruleFunction ) )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2773:1: ( ruleFunction )
            {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2773:1: ( ruleFunction )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2774:1: ruleFunction
            {
             before(grammarAccess.getEntityAccess().getFunctionsFunctionParserRuleCall_7_0()); 
            pushFollow(FOLLOW_ruleFunction_in_rule__Entity__FunctionsAssignment_75651);
            ruleFunction();
            _fsp--;

             after(grammarAccess.getEntityAccess().getFunctionsFunctionParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__FunctionsAssignment_7


    // $ANTLR start rule__Constraint__NameAssignment_1
    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2783:1: rule__Constraint__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Constraint__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2787:1: ( ( RULE_ID ) )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2788:1: ( RULE_ID )
            {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2788:1: ( RULE_ID )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2789:1: RULE_ID
            {
             before(grammarAccess.getConstraintAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Constraint__NameAssignment_15682); 
             after(grammarAccess.getConstraintAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Constraint__NameAssignment_1


    // $ANTLR start rule__Constraint__SlotsAssignment_3
    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2798:1: rule__Constraint__SlotsAssignment_3 : ( ruleUsage ) ;
    public final void rule__Constraint__SlotsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2802:1: ( ( ruleUsage ) )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2803:1: ( ruleUsage )
            {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2803:1: ( ruleUsage )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2804:1: ruleUsage
            {
             before(grammarAccess.getConstraintAccess().getSlotsUsageParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleUsage_in_rule__Constraint__SlotsAssignment_35713);
            ruleUsage();
            _fsp--;

             after(grammarAccess.getConstraintAccess().getSlotsUsageParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Constraint__SlotsAssignment_3


    // $ANTLR start rule__Usage__FieldAssignment
    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2813:1: rule__Usage__FieldAssignment : ( ( RULE_ID ) ) ;
    public final void rule__Usage__FieldAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2817:1: ( ( ( RULE_ID ) ) )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2818:1: ( ( RULE_ID ) )
            {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2818:1: ( ( RULE_ID ) )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2819:1: ( RULE_ID )
            {
             before(grammarAccess.getUsageAccess().getFieldFieldCrossReference_0()); 
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2820:1: ( RULE_ID )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2821:1: RULE_ID
            {
             before(grammarAccess.getUsageAccess().getFieldFieldIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Usage__FieldAssignment5748); 
             after(grammarAccess.getUsageAccess().getFieldFieldIDTerminalRuleCall_0_1()); 

            }

             after(grammarAccess.getUsageAccess().getFieldFieldCrossReference_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Usage__FieldAssignment


    // $ANTLR start rule__Function__NameAssignment_1
    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2832:1: rule__Function__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Function__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2836:1: ( ( RULE_ID ) )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2837:1: ( RULE_ID )
            {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2837:1: ( RULE_ID )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2838:1: RULE_ID
            {
             before(grammarAccess.getFunctionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Function__NameAssignment_15783); 
             after(grammarAccess.getFunctionAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Function__NameAssignment_1


    // $ANTLR start rule__Function__ReturnTypeAssignment_3
    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2847:1: rule__Function__ReturnTypeAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Function__ReturnTypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2851:1: ( ( ( RULE_ID ) ) )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2852:1: ( ( RULE_ID ) )
            {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2852:1: ( ( RULE_ID ) )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2853:1: ( RULE_ID )
            {
             before(grammarAccess.getFunctionAccess().getReturnTypeTypeCrossReference_3_0()); 
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2854:1: ( RULE_ID )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2855:1: RULE_ID
            {
             before(grammarAccess.getFunctionAccess().getReturnTypeTypeIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Function__ReturnTypeAssignment_35818); 
             after(grammarAccess.getFunctionAccess().getReturnTypeTypeIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getFunctionAccess().getReturnTypeTypeCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Function__ReturnTypeAssignment_3


    // $ANTLR start rule__Function__ArgumentsAssignment_4_1
    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2866:1: rule__Function__ArgumentsAssignment_4_1 : ( ruleArgument ) ;
    public final void rule__Function__ArgumentsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2870:1: ( ( ruleArgument ) )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2871:1: ( ruleArgument )
            {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2871:1: ( ruleArgument )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2872:1: ruleArgument
            {
             before(grammarAccess.getFunctionAccess().getArgumentsArgumentParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleArgument_in_rule__Function__ArgumentsAssignment_4_15853);
            ruleArgument();
            _fsp--;

             after(grammarAccess.getFunctionAccess().getArgumentsArgumentParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Function__ArgumentsAssignment_4_1


    // $ANTLR start rule__Argument__TypeAssignment_0
    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2881:1: rule__Argument__TypeAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Argument__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2885:1: ( ( ( RULE_ID ) ) )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2886:1: ( ( RULE_ID ) )
            {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2886:1: ( ( RULE_ID ) )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2887:1: ( RULE_ID )
            {
             before(grammarAccess.getArgumentAccess().getTypeTypeCrossReference_0_0()); 
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2888:1: ( RULE_ID )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2889:1: RULE_ID
            {
             before(grammarAccess.getArgumentAccess().getTypeTypeIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Argument__TypeAssignment_05888); 
             after(grammarAccess.getArgumentAccess().getTypeTypeIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getArgumentAccess().getTypeTypeCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__TypeAssignment_0


    // $ANTLR start rule__Argument__NameAssignment_1
    // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2900:1: rule__Argument__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Argument__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2904:1: ( ( RULE_ID ) )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2905:1: ( RULE_ID )
            {
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2905:1: ( RULE_ID )
            // ../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g:2906:1: RULE_ID
            {
             before(grammarAccess.getArgumentAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Argument__NameAssignment_15923); 
             after(grammarAccess.getArgumentAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__NameAssignment_1


 

    public static final BitSet FOLLOW_ruleDataModel_in_entryRuleDataModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataModel__Group__0_in_ruleDataModel94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompoundType_in_entryRuleCompoundType123 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompoundType130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompoundType__Alternatives_in_ruleCompoundType156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveTypes_in_entryRulePrimitiveTypes183 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveTypes190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimitiveTypes__Group__0_in_rulePrimitiveTypes216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveType_in_entryRulePrimitiveType243 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveType250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimitiveType__Group__0_in_rulePrimitiveType276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataType_in_entryRuleDataType303 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataType310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataType__Group__0_in_ruleDataType336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_in_entryRuleField363 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleField370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__0_in_ruleField396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumeration_in_entryRuleEnumeration423 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumeration430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__0_in_ruleEnumeration456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumLiteral_in_entryRuleEnumLiteral483 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumLiteral490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumLiteral__NameAssignment_in_ruleEnumLiteral516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity543 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntity550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__0_in_ruleEntity576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraint_in_entryRuleConstraint603 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstraint610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__Group__0_in_ruleConstraint636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUsage_in_entryRuleUsage663 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUsage670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Usage__FieldAssignment_in_ruleUsage696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunction_in_entryRuleFunction723 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunction730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__0_in_ruleFunction756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArgument_in_entryRuleArgument783 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArgument790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group__0_in_ruleArgument816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaPrimitiveType__Alternatives_in_ruleMetaPrimitiveType857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Modifier__Alternatives_in_ruleModifier893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataType_in_rule__CompoundType__Alternatives929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumeration_in_rule__CompoundType__Alternatives946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_rule__CompoundType__Alternatives963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimitiveType__Group_1_0__0_in_rule__PrimitiveType__Alternatives_1995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimitiveType__Group_1_1__0_in_rule__PrimitiveType__Alternatives_11013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__MetaPrimitiveType__Alternatives1050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__MetaPrimitiveType__Alternatives1071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__MetaPrimitiveType__Alternatives1092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__MetaPrimitiveType__Alternatives1113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Modifier__Alternatives1149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Modifier__Alternatives1170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Modifier__Alternatives1191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataModel__Group__0__Impl_in_rule__DataModel__Group__01224 = new BitSet(new long[]{0x0000000306800002L});
    public static final BitSet FOLLOW_rule__DataModel__Group__1_in_rule__DataModel__Group__01227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataModel__PrimitivesAssignment_0_in_rule__DataModel__Group__0__Impl1254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataModel__Group__1__Impl_in_rule__DataModel__Group__11284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataModel__CompoundTypesAssignment_1_in_rule__DataModel__Group__1__Impl1311 = new BitSet(new long[]{0x0000000306800002L});
    public static final BitSet FOLLOW_rule__PrimitiveTypes__Group__0__Impl_in_rule__PrimitiveTypes__Group__01346 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__PrimitiveTypes__Group__1_in_rule__PrimitiveTypes__Group__01349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimitiveTypes__Group__1__Impl_in_rule__PrimitiveTypes__Group__11407 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__PrimitiveTypes__Group__2_in_rule__PrimitiveTypes__Group__11410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__PrimitiveTypes__Group__1__Impl1438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimitiveTypes__Group__2__Impl_in_rule__PrimitiveTypes__Group__21469 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_rule__PrimitiveTypes__Group__3_in_rule__PrimitiveTypes__Group__21472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__PrimitiveTypes__Group__2__Impl1500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimitiveTypes__Group__3__Impl_in_rule__PrimitiveTypes__Group__31531 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__PrimitiveTypes__Group__4_in_rule__PrimitiveTypes__Group__31534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimitiveTypes__PrimitiveTypesAssignment_3_in_rule__PrimitiveTypes__Group__3__Impl1561 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__PrimitiveTypes__Group__4__Impl_in_rule__PrimitiveTypes__Group__41592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__PrimitiveTypes__Group__4__Impl1620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimitiveType__Group__0__Impl_in_rule__PrimitiveType__Group__01661 = new BitSet(new long[]{0x0000000000600002L});
    public static final BitSet FOLLOW_rule__PrimitiveType__Group__1_in_rule__PrimitiveType__Group__01664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimitiveType__NameAssignment_0_in_rule__PrimitiveType__Group__0__Impl1691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimitiveType__Group__1__Impl_in_rule__PrimitiveType__Group__11721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimitiveType__Alternatives_1_in_rule__PrimitiveType__Group__1__Impl1748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimitiveType__Group_1_0__0__Impl_in_rule__PrimitiveType__Group_1_0__01782 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__PrimitiveType__Group_1_0__1_in_rule__PrimitiveType__Group_1_0__01785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__PrimitiveType__Group_1_0__0__Impl1813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimitiveType__Group_1_0__1__Impl_in_rule__PrimitiveType__Group_1_0__11844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimitiveType__SuperTypeAssignment_1_0_1_in_rule__PrimitiveType__Group_1_0__1__Impl1871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimitiveType__Group_1_1__0__Impl_in_rule__PrimitiveType__Group_1_1__01905 = new BitSet(new long[]{0x0000000000007800L});
    public static final BitSet FOLLOW_rule__PrimitiveType__Group_1_1__1_in_rule__PrimitiveType__Group_1_1__01908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__PrimitiveType__Group_1_1__0__Impl1936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimitiveType__Group_1_1__1__Impl_in_rule__PrimitiveType__Group_1_1__11967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimitiveType__RealizationTypeAssignment_1_1_1_in_rule__PrimitiveType__Group_1_1__1__Impl1994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataType__Group__0__Impl_in_rule__DataType__Group__02028 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DataType__Group__1_in_rule__DataType__Group__02031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__DataType__Group__0__Impl2059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataType__Group__1__Impl_in_rule__DataType__Group__12090 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__DataType__Group__2_in_rule__DataType__Group__12093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataType__NameAssignment_1_in_rule__DataType__Group__1__Impl2120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataType__Group__2__Impl_in_rule__DataType__Group__22150 = new BitSet(new long[]{0x0000000028138010L});
    public static final BitSet FOLLOW_rule__DataType__Group__3_in_rule__DataType__Group__22153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__DataType__Group__2__Impl2181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataType__Group__3__Impl_in_rule__DataType__Group__32212 = new BitSet(new long[]{0x0000000028100000L});
    public static final BitSet FOLLOW_rule__DataType__Group__4_in_rule__DataType__Group__32215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataType__FieldsAssignment_3_in_rule__DataType__Group__3__Impl2242 = new BitSet(new long[]{0x0000000000038012L});
    public static final BitSet FOLLOW_rule__DataType__Group__4__Impl_in_rule__DataType__Group__42273 = new BitSet(new long[]{0x0000000020100000L});
    public static final BitSet FOLLOW_rule__DataType__Group__5_in_rule__DataType__Group__42276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataType__ConstraintsAssignment_4_in_rule__DataType__Group__4__Impl2303 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_rule__DataType__Group__5__Impl_in_rule__DataType__Group__52334 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__DataType__Group__6_in_rule__DataType__Group__52337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataType__FunctionsAssignment_5_in_rule__DataType__Group__5__Impl2364 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_rule__DataType__Group__6__Impl_in_rule__DataType__Group__62395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__DataType__Group__6__Impl2423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__0__Impl_in_rule__Field__Group__02468 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Field__Group__1_in_rule__Field__Group__02471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__ModifierAssignment_0_in_rule__Field__Group__0__Impl2498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__1__Impl_in_rule__Field__Group__12529 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Field__Group__2_in_rule__Field__Group__12532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__NameAssignment_1_in_rule__Field__Group__1__Impl2559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__2__Impl_in_rule__Field__Group__22589 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Field__Group__3_in_rule__Field__Group__22592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Field__Group__2__Impl2620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__3__Impl_in_rule__Field__Group__32651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__TypeAssignment_3_in_rule__Field__Group__3__Impl2678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__0__Impl_in_rule__Enumeration__Group__02716 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__1_in_rule__Enumeration__Group__02719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Enumeration__Group__0__Impl2747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__1__Impl_in_rule__Enumeration__Group__12778 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__2_in_rule__Enumeration__Group__12781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enumeration__NameAssignment_1_in_rule__Enumeration__Group__1__Impl2808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__2__Impl_in_rule__Enumeration__Group__22838 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__3_in_rule__Enumeration__Group__22841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Enumeration__Group__2__Impl2869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__3__Impl_in_rule__Enumeration__Group__32900 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__4_in_rule__Enumeration__Group__32903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enumeration__LiteralsAssignment_3_in_rule__Enumeration__Group__3__Impl2930 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__4__Impl_in_rule__Enumeration__Group__42961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Enumeration__Group__4__Impl2989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__0__Impl_in_rule__Entity__Group__03030 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__03033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__UnorderedGroup_0_in_rule__Entity__Group__0__Impl3060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__1__Impl_in_rule__Entity__Group__13090 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__13093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Entity__Group__1__Impl3121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__2__Impl_in_rule__Entity__Group__23152 = new BitSet(new long[]{0x0000000000280000L});
    public static final BitSet FOLLOW_rule__Entity__Group__3_in_rule__Entity__Group__23155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__NameAssignment_2_in_rule__Entity__Group__2__Impl3182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__3__Impl_in_rule__Entity__Group__33212 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Entity__Group__4_in_rule__Entity__Group__33215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group_3__0_in_rule__Entity__Group__3__Impl3242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__4__Impl_in_rule__Entity__Group__43273 = new BitSet(new long[]{0x0000000028138010L});
    public static final BitSet FOLLOW_rule__Entity__Group__5_in_rule__Entity__Group__43276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Entity__Group__4__Impl3304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__5__Impl_in_rule__Entity__Group__53335 = new BitSet(new long[]{0x0000000028100000L});
    public static final BitSet FOLLOW_rule__Entity__Group__6_in_rule__Entity__Group__53338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__FieldsAssignment_5_in_rule__Entity__Group__5__Impl3365 = new BitSet(new long[]{0x0000000000038012L});
    public static final BitSet FOLLOW_rule__Entity__Group__6__Impl_in_rule__Entity__Group__63396 = new BitSet(new long[]{0x0000000020100000L});
    public static final BitSet FOLLOW_rule__Entity__Group__7_in_rule__Entity__Group__63399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__ConstraintsAssignment_6_in_rule__Entity__Group__6__Impl3426 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__7__Impl_in_rule__Entity__Group__73457 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Entity__Group__8_in_rule__Entity__Group__73460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__FunctionsAssignment_7_in_rule__Entity__Group__7__Impl3487 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__8__Impl_in_rule__Entity__Group__83518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Entity__Group__8__Impl3546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group_3__0__Impl_in_rule__Entity__Group_3__03595 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Entity__Group_3__1_in_rule__Entity__Group_3__03598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Entity__Group_3__0__Impl3626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group_3__1__Impl_in_rule__Entity__Group_3__13657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__SuperTypeAssignment_3_1_in_rule__Entity__Group_3__1__Impl3684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__Group__0__Impl_in_rule__Constraint__Group__03718 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Constraint__Group__1_in_rule__Constraint__Group__03721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Constraint__Group__0__Impl3749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__Group__1__Impl_in_rule__Constraint__Group__13780 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Constraint__Group__2_in_rule__Constraint__Group__13783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__NameAssignment_1_in_rule__Constraint__Group__1__Impl3810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__Group__2__Impl_in_rule__Constraint__Group__23840 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Constraint__Group__3_in_rule__Constraint__Group__23843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Constraint__Group__2__Impl3871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__Group__3__Impl_in_rule__Constraint__Group__33902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__SlotsAssignment_3_in_rule__Constraint__Group__3__Impl3931 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Constraint__SlotsAssignment_3_in_rule__Constraint__Group__3__Impl3943 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Function__Group__0__Impl_in_rule__Function__Group__03984 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Function__Group__1_in_rule__Function__Group__03987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Function__Group__0__Impl4015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__1__Impl_in_rule__Function__Group__14046 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Function__Group__2_in_rule__Function__Group__14049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__NameAssignment_1_in_rule__Function__Group__1__Impl4076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__2__Impl_in_rule__Function__Group__24106 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Function__Group__3_in_rule__Function__Group__24109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Function__Group__2__Impl4137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__3__Impl_in_rule__Function__Group__34168 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_rule__Function__Group__4_in_rule__Function__Group__34171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__ReturnTypeAssignment_3_in_rule__Function__Group__3__Impl4198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__4__Impl_in_rule__Function__Group__44228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group_4__0_in_rule__Function__Group__4__Impl4255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group_4__0__Impl_in_rule__Function__Group_4__04296 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Function__Group_4__1_in_rule__Function__Group_4__04299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Function__Group_4__0__Impl4327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group_4__1__Impl_in_rule__Function__Group_4__14358 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Function__Group_4__2_in_rule__Function__Group_4__14361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__ArgumentsAssignment_4_1_in_rule__Function__Group_4__1__Impl4390 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Function__ArgumentsAssignment_4_1_in_rule__Function__Group_4__1__Impl4402 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Function__Group_4__2__Impl_in_rule__Function__Group_4__24435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Function__Group_4__2__Impl4463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group__0__Impl_in_rule__Argument__Group__04500 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Argument__Group__1_in_rule__Argument__Group__04503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__TypeAssignment_0_in_rule__Argument__Group__0__Impl4530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group__1__Impl_in_rule__Argument__Group__14560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__NameAssignment_1_in_rule__Argument__Group__1__Impl4587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__UnorderedGroup_0__0_in_rule__Entity__UnorderedGroup_04622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__TransientAssignment_0_0_in_rule__Entity__UnorderedGroup_0__Impl4709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__AbstractAssignment_0_1_in_rule__Entity__UnorderedGroup_0__Impl4800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__UnorderedGroup_0__Impl_in_rule__Entity__UnorderedGroup_0__04859 = new BitSet(new long[]{0x0000000300000002L});
    public static final BitSet FOLLOW_rule__Entity__UnorderedGroup_0__1_in_rule__Entity__UnorderedGroup_0__04862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__UnorderedGroup_0__Impl_in_rule__Entity__UnorderedGroup_0__14887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveTypes_in_rule__DataModel__PrimitivesAssignment_04919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompoundType_in_rule__DataModel__CompoundTypesAssignment_14950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveType_in_rule__PrimitiveTypes__PrimitiveTypesAssignment_34981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__PrimitiveType__NameAssignment_05012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__PrimitiveType__SuperTypeAssignment_1_0_15047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetaPrimitiveType_in_rule__PrimitiveType__RealizationTypeAssignment_1_1_15082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DataType__NameAssignment_15113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_in_rule__DataType__FieldsAssignment_35144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraint_in_rule__DataType__ConstraintsAssignment_45175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunction_in_rule__DataType__FunctionsAssignment_55206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifier_in_rule__Field__ModifierAssignment_05237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Field__NameAssignment_15268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Field__TypeAssignment_35303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Enumeration__NameAssignment_15338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumLiteral_in_rule__Enumeration__LiteralsAssignment_35369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumLiteral__NameAssignment5400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Entity__TransientAssignment_0_05436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Entity__AbstractAssignment_0_15480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Entity__NameAssignment_25519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Entity__SuperTypeAssignment_3_15554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_in_rule__Entity__FieldsAssignment_55589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraint_in_rule__Entity__ConstraintsAssignment_65620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunction_in_rule__Entity__FunctionsAssignment_75651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Constraint__NameAssignment_15682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUsage_in_rule__Constraint__SlotsAssignment_35713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Usage__FieldAssignment5748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Function__NameAssignment_15783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Function__ReturnTypeAssignment_35818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArgument_in_rule__Function__ArgumentsAssignment_4_15853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Argument__TypeAssignment_05888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Argument__NameAssignment_15923 = new BitSet(new long[]{0x0000000000000002L});

}
