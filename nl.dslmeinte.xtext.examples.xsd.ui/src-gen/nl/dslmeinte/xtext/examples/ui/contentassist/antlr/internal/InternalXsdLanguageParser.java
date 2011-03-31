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
import nl.dslmeinte.xtext.examples.services.XsdLanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalXsdLanguageParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_PATTERN_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'duration'", "'dateTime'", "'time'", "'date'", "'string'", "'decimal'", "'integer'", "'positiveInteger'", "'nonNegativeInteger'", "'token'", "'base64Binary'", "'schema'", "'namespace'", "'import'", "'as'", "'element'", "'->'", "':'", "'simple-type'", "'['", "']'", "'enumeration'", "'{'", "'}'", "'::'", "'maxLength'", "'='", "'pattern'", "'range'", "'..'", "'length'", "'complex-type'", "'extends'", "'documentation:'", "'@'", "'abstract'", "'required'", "'*'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_STRING=5;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_INT=6;
    public static final int RULE_PATTERN_STRING=7;
    public static final int RULE_WS=10;
    public static final int RULE_SL_COMMENT=9;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=8;

        public InternalXsdLanguageParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g"; }


     
     	private XsdLanguageGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(XsdLanguageGrammarAccess grammarAccess) {
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




    // $ANTLR start entryRuleSchema
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:61:1: entryRuleSchema : ruleSchema EOF ;
    public final void entryRuleSchema() throws RecognitionException {
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:62:1: ( ruleSchema EOF )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:63:1: ruleSchema EOF
            {
             before(grammarAccess.getSchemaRule()); 
            pushFollow(FOLLOW_ruleSchema_in_entryRuleSchema61);
            ruleSchema();
            _fsp--;

             after(grammarAccess.getSchemaRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSchema68); 

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
    // $ANTLR end entryRuleSchema


    // $ANTLR start ruleSchema
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:70:1: ruleSchema : ( ( rule__Schema__Group__0 ) ) ;
    public final void ruleSchema() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:74:2: ( ( ( rule__Schema__Group__0 ) ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:75:1: ( ( rule__Schema__Group__0 ) )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:75:1: ( ( rule__Schema__Group__0 ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:76:1: ( rule__Schema__Group__0 )
            {
             before(grammarAccess.getSchemaAccess().getGroup()); 
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:77:1: ( rule__Schema__Group__0 )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:77:2: rule__Schema__Group__0
            {
            pushFollow(FOLLOW_rule__Schema__Group__0_in_ruleSchema94);
            rule__Schema__Group__0();
            _fsp--;


            }

             after(grammarAccess.getSchemaAccess().getGroup()); 

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
    // $ANTLR end ruleSchema


    // $ANTLR start entryRuleImport
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:89:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:90:1: ( ruleImport EOF )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:91:1: ruleImport EOF
            {
             before(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport121);
            ruleImport();
            _fsp--;

             after(grammarAccess.getImportRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport128); 

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
    // $ANTLR end entryRuleImport


    // $ANTLR start ruleImport
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:98:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:102:2: ( ( ( rule__Import__Group__0 ) ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:103:1: ( ( rule__Import__Group__0 ) )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:103:1: ( ( rule__Import__Group__0 ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:104:1: ( rule__Import__Group__0 )
            {
             before(grammarAccess.getImportAccess().getGroup()); 
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:105:1: ( rule__Import__Group__0 )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:105:2: rule__Import__Group__0
            {
            pushFollow(FOLLOW_rule__Import__Group__0_in_ruleImport154);
            rule__Import__Group__0();
            _fsp--;


            }

             after(grammarAccess.getImportAccess().getGroup()); 

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
    // $ANTLR end ruleImport


    // $ANTLR start entryRuleTopLevelDefinition
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:117:1: entryRuleTopLevelDefinition : ruleTopLevelDefinition EOF ;
    public final void entryRuleTopLevelDefinition() throws RecognitionException {
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:118:1: ( ruleTopLevelDefinition EOF )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:119:1: ruleTopLevelDefinition EOF
            {
             before(grammarAccess.getTopLevelDefinitionRule()); 
            pushFollow(FOLLOW_ruleTopLevelDefinition_in_entryRuleTopLevelDefinition181);
            ruleTopLevelDefinition();
            _fsp--;

             after(grammarAccess.getTopLevelDefinitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTopLevelDefinition188); 

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
    // $ANTLR end entryRuleTopLevelDefinition


    // $ANTLR start ruleTopLevelDefinition
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:126:1: ruleTopLevelDefinition : ( ( rule__TopLevelDefinition__Alternatives ) ) ;
    public final void ruleTopLevelDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:130:2: ( ( ( rule__TopLevelDefinition__Alternatives ) ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:131:1: ( ( rule__TopLevelDefinition__Alternatives ) )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:131:1: ( ( rule__TopLevelDefinition__Alternatives ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:132:1: ( rule__TopLevelDefinition__Alternatives )
            {
             before(grammarAccess.getTopLevelDefinitionAccess().getAlternatives()); 
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:133:1: ( rule__TopLevelDefinition__Alternatives )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:133:2: rule__TopLevelDefinition__Alternatives
            {
            pushFollow(FOLLOW_rule__TopLevelDefinition__Alternatives_in_ruleTopLevelDefinition214);
            rule__TopLevelDefinition__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getTopLevelDefinitionAccess().getAlternatives()); 

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
    // $ANTLR end ruleTopLevelDefinition


    // $ANTLR start entryRuleTopLevelType
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:145:1: entryRuleTopLevelType : ruleTopLevelType EOF ;
    public final void entryRuleTopLevelType() throws RecognitionException {
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:146:1: ( ruleTopLevelType EOF )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:147:1: ruleTopLevelType EOF
            {
             before(grammarAccess.getTopLevelTypeRule()); 
            pushFollow(FOLLOW_ruleTopLevelType_in_entryRuleTopLevelType241);
            ruleTopLevelType();
            _fsp--;

             after(grammarAccess.getTopLevelTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTopLevelType248); 

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
    // $ANTLR end entryRuleTopLevelType


    // $ANTLR start ruleTopLevelType
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:154:1: ruleTopLevelType : ( ( rule__TopLevelType__Alternatives ) ) ;
    public final void ruleTopLevelType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:158:2: ( ( ( rule__TopLevelType__Alternatives ) ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:159:1: ( ( rule__TopLevelType__Alternatives ) )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:159:1: ( ( rule__TopLevelType__Alternatives ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:160:1: ( rule__TopLevelType__Alternatives )
            {
             before(grammarAccess.getTopLevelTypeAccess().getAlternatives()); 
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:161:1: ( rule__TopLevelType__Alternatives )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:161:2: rule__TopLevelType__Alternatives
            {
            pushFollow(FOLLOW_rule__TopLevelType__Alternatives_in_ruleTopLevelType274);
            rule__TopLevelType__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getTopLevelTypeAccess().getAlternatives()); 

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
    // $ANTLR end ruleTopLevelType


    // $ANTLR start entryRuleTopLevelElement
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:173:1: entryRuleTopLevelElement : ruleTopLevelElement EOF ;
    public final void entryRuleTopLevelElement() throws RecognitionException {
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:174:1: ( ruleTopLevelElement EOF )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:175:1: ruleTopLevelElement EOF
            {
             before(grammarAccess.getTopLevelElementRule()); 
            pushFollow(FOLLOW_ruleTopLevelElement_in_entryRuleTopLevelElement301);
            ruleTopLevelElement();
            _fsp--;

             after(grammarAccess.getTopLevelElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTopLevelElement308); 

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
    // $ANTLR end entryRuleTopLevelElement


    // $ANTLR start ruleTopLevelElement
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:182:1: ruleTopLevelElement : ( ( rule__TopLevelElement__Group__0 ) ) ;
    public final void ruleTopLevelElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:186:2: ( ( ( rule__TopLevelElement__Group__0 ) ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:187:1: ( ( rule__TopLevelElement__Group__0 ) )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:187:1: ( ( rule__TopLevelElement__Group__0 ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:188:1: ( rule__TopLevelElement__Group__0 )
            {
             before(grammarAccess.getTopLevelElementAccess().getGroup()); 
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:189:1: ( rule__TopLevelElement__Group__0 )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:189:2: rule__TopLevelElement__Group__0
            {
            pushFollow(FOLLOW_rule__TopLevelElement__Group__0_in_ruleTopLevelElement334);
            rule__TopLevelElement__Group__0();
            _fsp--;


            }

             after(grammarAccess.getTopLevelElementAccess().getGroup()); 

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
    // $ANTLR end ruleTopLevelElement


    // $ANTLR start entryRuleTopLevelSimpleType
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:201:1: entryRuleTopLevelSimpleType : ruleTopLevelSimpleType EOF ;
    public final void entryRuleTopLevelSimpleType() throws RecognitionException {
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:202:1: ( ruleTopLevelSimpleType EOF )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:203:1: ruleTopLevelSimpleType EOF
            {
             before(grammarAccess.getTopLevelSimpleTypeRule()); 
            pushFollow(FOLLOW_ruleTopLevelSimpleType_in_entryRuleTopLevelSimpleType361);
            ruleTopLevelSimpleType();
            _fsp--;

             after(grammarAccess.getTopLevelSimpleTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTopLevelSimpleType368); 

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
    // $ANTLR end entryRuleTopLevelSimpleType


    // $ANTLR start ruleTopLevelSimpleType
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:210:1: ruleTopLevelSimpleType : ( ( rule__TopLevelSimpleType__Group__0 ) ) ;
    public final void ruleTopLevelSimpleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:214:2: ( ( ( rule__TopLevelSimpleType__Group__0 ) ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:215:1: ( ( rule__TopLevelSimpleType__Group__0 ) )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:215:1: ( ( rule__TopLevelSimpleType__Group__0 ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:216:1: ( rule__TopLevelSimpleType__Group__0 )
            {
             before(grammarAccess.getTopLevelSimpleTypeAccess().getGroup()); 
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:217:1: ( rule__TopLevelSimpleType__Group__0 )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:217:2: rule__TopLevelSimpleType__Group__0
            {
            pushFollow(FOLLOW_rule__TopLevelSimpleType__Group__0_in_ruleTopLevelSimpleType394);
            rule__TopLevelSimpleType__Group__0();
            _fsp--;


            }

             after(grammarAccess.getTopLevelSimpleTypeAccess().getGroup()); 

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
    // $ANTLR end ruleTopLevelSimpleType


    // $ANTLR start entryRuleRestriction
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:229:1: entryRuleRestriction : ruleRestriction EOF ;
    public final void entryRuleRestriction() throws RecognitionException {
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:230:1: ( ruleRestriction EOF )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:231:1: ruleRestriction EOF
            {
             before(grammarAccess.getRestrictionRule()); 
            pushFollow(FOLLOW_ruleRestriction_in_entryRuleRestriction421);
            ruleRestriction();
            _fsp--;

             after(grammarAccess.getRestrictionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRestriction428); 

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
    // $ANTLR end entryRuleRestriction


    // $ANTLR start ruleRestriction
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:238:1: ruleRestriction : ( ( rule__Restriction__Group__0 ) ) ;
    public final void ruleRestriction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:242:2: ( ( ( rule__Restriction__Group__0 ) ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:243:1: ( ( rule__Restriction__Group__0 ) )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:243:1: ( ( rule__Restriction__Group__0 ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:244:1: ( rule__Restriction__Group__0 )
            {
             before(grammarAccess.getRestrictionAccess().getGroup()); 
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:245:1: ( rule__Restriction__Group__0 )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:245:2: rule__Restriction__Group__0
            {
            pushFollow(FOLLOW_rule__Restriction__Group__0_in_ruleRestriction454);
            rule__Restriction__Group__0();
            _fsp--;


            }

             after(grammarAccess.getRestrictionAccess().getGroup()); 

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
    // $ANTLR end ruleRestriction


    // $ANTLR start entryRuleFacet
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:257:1: entryRuleFacet : ruleFacet EOF ;
    public final void entryRuleFacet() throws RecognitionException {
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:258:1: ( ruleFacet EOF )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:259:1: ruleFacet EOF
            {
             before(grammarAccess.getFacetRule()); 
            pushFollow(FOLLOW_ruleFacet_in_entryRuleFacet481);
            ruleFacet();
            _fsp--;

             after(grammarAccess.getFacetRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFacet488); 

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
    // $ANTLR end entryRuleFacet


    // $ANTLR start ruleFacet
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:266:1: ruleFacet : ( ( rule__Facet__Alternatives ) ) ;
    public final void ruleFacet() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:270:2: ( ( ( rule__Facet__Alternatives ) ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:271:1: ( ( rule__Facet__Alternatives ) )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:271:1: ( ( rule__Facet__Alternatives ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:272:1: ( rule__Facet__Alternatives )
            {
             before(grammarAccess.getFacetAccess().getAlternatives()); 
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:273:1: ( rule__Facet__Alternatives )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:273:2: rule__Facet__Alternatives
            {
            pushFollow(FOLLOW_rule__Facet__Alternatives_in_ruleFacet514);
            rule__Facet__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getFacetAccess().getAlternatives()); 

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
    // $ANTLR end ruleFacet


    // $ANTLR start entryRuleEnumerationFacet
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:285:1: entryRuleEnumerationFacet : ruleEnumerationFacet EOF ;
    public final void entryRuleEnumerationFacet() throws RecognitionException {
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:286:1: ( ruleEnumerationFacet EOF )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:287:1: ruleEnumerationFacet EOF
            {
             before(grammarAccess.getEnumerationFacetRule()); 
            pushFollow(FOLLOW_ruleEnumerationFacet_in_entryRuleEnumerationFacet541);
            ruleEnumerationFacet();
            _fsp--;

             after(grammarAccess.getEnumerationFacetRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumerationFacet548); 

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
    // $ANTLR end entryRuleEnumerationFacet


    // $ANTLR start ruleEnumerationFacet
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:294:1: ruleEnumerationFacet : ( ( rule__EnumerationFacet__Group__0 ) ) ;
    public final void ruleEnumerationFacet() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:298:2: ( ( ( rule__EnumerationFacet__Group__0 ) ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:299:1: ( ( rule__EnumerationFacet__Group__0 ) )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:299:1: ( ( rule__EnumerationFacet__Group__0 ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:300:1: ( rule__EnumerationFacet__Group__0 )
            {
             before(grammarAccess.getEnumerationFacetAccess().getGroup()); 
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:301:1: ( rule__EnumerationFacet__Group__0 )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:301:2: rule__EnumerationFacet__Group__0
            {
            pushFollow(FOLLOW_rule__EnumerationFacet__Group__0_in_ruleEnumerationFacet574);
            rule__EnumerationFacet__Group__0();
            _fsp--;


            }

             after(grammarAccess.getEnumerationFacetAccess().getGroup()); 

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
    // $ANTLR end ruleEnumerationFacet


    // $ANTLR start entryRuleEnumerationLiteral
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:313:1: entryRuleEnumerationLiteral : ruleEnumerationLiteral EOF ;
    public final void entryRuleEnumerationLiteral() throws RecognitionException {
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:314:1: ( ruleEnumerationLiteral EOF )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:315:1: ruleEnumerationLiteral EOF
            {
             before(grammarAccess.getEnumerationLiteralRule()); 
            pushFollow(FOLLOW_ruleEnumerationLiteral_in_entryRuleEnumerationLiteral601);
            ruleEnumerationLiteral();
            _fsp--;

             after(grammarAccess.getEnumerationLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumerationLiteral608); 

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
    // $ANTLR end entryRuleEnumerationLiteral


    // $ANTLR start ruleEnumerationLiteral
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:322:1: ruleEnumerationLiteral : ( ( rule__EnumerationLiteral__Group__0 ) ) ;
    public final void ruleEnumerationLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:326:2: ( ( ( rule__EnumerationLiteral__Group__0 ) ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:327:1: ( ( rule__EnumerationLiteral__Group__0 ) )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:327:1: ( ( rule__EnumerationLiteral__Group__0 ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:328:1: ( rule__EnumerationLiteral__Group__0 )
            {
             before(grammarAccess.getEnumerationLiteralAccess().getGroup()); 
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:329:1: ( rule__EnumerationLiteral__Group__0 )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:329:2: rule__EnumerationLiteral__Group__0
            {
            pushFollow(FOLLOW_rule__EnumerationLiteral__Group__0_in_ruleEnumerationLiteral634);
            rule__EnumerationLiteral__Group__0();
            _fsp--;


            }

             after(grammarAccess.getEnumerationLiteralAccess().getGroup()); 

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
    // $ANTLR end ruleEnumerationLiteral


    // $ANTLR start entryRuleMaxLengthFacet
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:341:1: entryRuleMaxLengthFacet : ruleMaxLengthFacet EOF ;
    public final void entryRuleMaxLengthFacet() throws RecognitionException {
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:342:1: ( ruleMaxLengthFacet EOF )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:343:1: ruleMaxLengthFacet EOF
            {
             before(grammarAccess.getMaxLengthFacetRule()); 
            pushFollow(FOLLOW_ruleMaxLengthFacet_in_entryRuleMaxLengthFacet661);
            ruleMaxLengthFacet();
            _fsp--;

             after(grammarAccess.getMaxLengthFacetRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMaxLengthFacet668); 

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
    // $ANTLR end entryRuleMaxLengthFacet


    // $ANTLR start ruleMaxLengthFacet
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:350:1: ruleMaxLengthFacet : ( ( rule__MaxLengthFacet__Group__0 ) ) ;
    public final void ruleMaxLengthFacet() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:354:2: ( ( ( rule__MaxLengthFacet__Group__0 ) ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:355:1: ( ( rule__MaxLengthFacet__Group__0 ) )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:355:1: ( ( rule__MaxLengthFacet__Group__0 ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:356:1: ( rule__MaxLengthFacet__Group__0 )
            {
             before(grammarAccess.getMaxLengthFacetAccess().getGroup()); 
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:357:1: ( rule__MaxLengthFacet__Group__0 )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:357:2: rule__MaxLengthFacet__Group__0
            {
            pushFollow(FOLLOW_rule__MaxLengthFacet__Group__0_in_ruleMaxLengthFacet694);
            rule__MaxLengthFacet__Group__0();
            _fsp--;


            }

             after(grammarAccess.getMaxLengthFacetAccess().getGroup()); 

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
    // $ANTLR end ruleMaxLengthFacet


    // $ANTLR start entryRulePatternFacet
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:369:1: entryRulePatternFacet : rulePatternFacet EOF ;
    public final void entryRulePatternFacet() throws RecognitionException {
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:370:1: ( rulePatternFacet EOF )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:371:1: rulePatternFacet EOF
            {
             before(grammarAccess.getPatternFacetRule()); 
            pushFollow(FOLLOW_rulePatternFacet_in_entryRulePatternFacet721);
            rulePatternFacet();
            _fsp--;

             after(grammarAccess.getPatternFacetRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePatternFacet728); 

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
    // $ANTLR end entryRulePatternFacet


    // $ANTLR start rulePatternFacet
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:378:1: rulePatternFacet : ( ( rule__PatternFacet__Group__0 ) ) ;
    public final void rulePatternFacet() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:382:2: ( ( ( rule__PatternFacet__Group__0 ) ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:383:1: ( ( rule__PatternFacet__Group__0 ) )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:383:1: ( ( rule__PatternFacet__Group__0 ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:384:1: ( rule__PatternFacet__Group__0 )
            {
             before(grammarAccess.getPatternFacetAccess().getGroup()); 
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:385:1: ( rule__PatternFacet__Group__0 )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:385:2: rule__PatternFacet__Group__0
            {
            pushFollow(FOLLOW_rule__PatternFacet__Group__0_in_rulePatternFacet754);
            rule__PatternFacet__Group__0();
            _fsp--;


            }

             after(grammarAccess.getPatternFacetAccess().getGroup()); 

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
    // $ANTLR end rulePatternFacet


    // $ANTLR start entryRuleRangeFacet
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:397:1: entryRuleRangeFacet : ruleRangeFacet EOF ;
    public final void entryRuleRangeFacet() throws RecognitionException {
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:398:1: ( ruleRangeFacet EOF )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:399:1: ruleRangeFacet EOF
            {
             before(grammarAccess.getRangeFacetRule()); 
            pushFollow(FOLLOW_ruleRangeFacet_in_entryRuleRangeFacet781);
            ruleRangeFacet();
            _fsp--;

             after(grammarAccess.getRangeFacetRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRangeFacet788); 

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
    // $ANTLR end entryRuleRangeFacet


    // $ANTLR start ruleRangeFacet
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:406:1: ruleRangeFacet : ( ( rule__RangeFacet__Group__0 ) ) ;
    public final void ruleRangeFacet() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:410:2: ( ( ( rule__RangeFacet__Group__0 ) ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:411:1: ( ( rule__RangeFacet__Group__0 ) )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:411:1: ( ( rule__RangeFacet__Group__0 ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:412:1: ( rule__RangeFacet__Group__0 )
            {
             before(grammarAccess.getRangeFacetAccess().getGroup()); 
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:413:1: ( rule__RangeFacet__Group__0 )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:413:2: rule__RangeFacet__Group__0
            {
            pushFollow(FOLLOW_rule__RangeFacet__Group__0_in_ruleRangeFacet814);
            rule__RangeFacet__Group__0();
            _fsp--;


            }

             after(grammarAccess.getRangeFacetAccess().getGroup()); 

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
    // $ANTLR end ruleRangeFacet


    // $ANTLR start entryRuleLengthFacet
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:425:1: entryRuleLengthFacet : ruleLengthFacet EOF ;
    public final void entryRuleLengthFacet() throws RecognitionException {
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:426:1: ( ruleLengthFacet EOF )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:427:1: ruleLengthFacet EOF
            {
             before(grammarAccess.getLengthFacetRule()); 
            pushFollow(FOLLOW_ruleLengthFacet_in_entryRuleLengthFacet841);
            ruleLengthFacet();
            _fsp--;

             after(grammarAccess.getLengthFacetRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLengthFacet848); 

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
    // $ANTLR end entryRuleLengthFacet


    // $ANTLR start ruleLengthFacet
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:434:1: ruleLengthFacet : ( ( rule__LengthFacet__Group__0 ) ) ;
    public final void ruleLengthFacet() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:438:2: ( ( ( rule__LengthFacet__Group__0 ) ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:439:1: ( ( rule__LengthFacet__Group__0 ) )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:439:1: ( ( rule__LengthFacet__Group__0 ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:440:1: ( rule__LengthFacet__Group__0 )
            {
             before(grammarAccess.getLengthFacetAccess().getGroup()); 
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:441:1: ( rule__LengthFacet__Group__0 )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:441:2: rule__LengthFacet__Group__0
            {
            pushFollow(FOLLOW_rule__LengthFacet__Group__0_in_ruleLengthFacet874);
            rule__LengthFacet__Group__0();
            _fsp--;


            }

             after(grammarAccess.getLengthFacetAccess().getGroup()); 

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
    // $ANTLR end ruleLengthFacet


    // $ANTLR start entryRuleDocumentation
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:453:1: entryRuleDocumentation : ruleDocumentation EOF ;
    public final void entryRuleDocumentation() throws RecognitionException {
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:454:1: ( ruleDocumentation EOF )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:455:1: ruleDocumentation EOF
            {
             before(grammarAccess.getDocumentationRule()); 
            pushFollow(FOLLOW_ruleDocumentation_in_entryRuleDocumentation901);
            ruleDocumentation();
            _fsp--;

             after(grammarAccess.getDocumentationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDocumentation908); 

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
    // $ANTLR end entryRuleDocumentation


    // $ANTLR start ruleDocumentation
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:462:1: ruleDocumentation : ( ( rule__Documentation__Group__0 ) ) ;
    public final void ruleDocumentation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:466:2: ( ( ( rule__Documentation__Group__0 ) ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:467:1: ( ( rule__Documentation__Group__0 ) )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:467:1: ( ( rule__Documentation__Group__0 ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:468:1: ( rule__Documentation__Group__0 )
            {
             before(grammarAccess.getDocumentationAccess().getGroup()); 
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:469:1: ( rule__Documentation__Group__0 )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:469:2: rule__Documentation__Group__0
            {
            pushFollow(FOLLOW_rule__Documentation__Group__0_in_ruleDocumentation934);
            rule__Documentation__Group__0();
            _fsp--;


            }

             after(grammarAccess.getDocumentationAccess().getGroup()); 

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
    // $ANTLR end ruleDocumentation


    // $ANTLR start entryRuleTopLevelComplexType
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:481:1: entryRuleTopLevelComplexType : ruleTopLevelComplexType EOF ;
    public final void entryRuleTopLevelComplexType() throws RecognitionException {
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:482:1: ( ruleTopLevelComplexType EOF )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:483:1: ruleTopLevelComplexType EOF
            {
             before(grammarAccess.getTopLevelComplexTypeRule()); 
            pushFollow(FOLLOW_ruleTopLevelComplexType_in_entryRuleTopLevelComplexType961);
            ruleTopLevelComplexType();
            _fsp--;

             after(grammarAccess.getTopLevelComplexTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTopLevelComplexType968); 

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
    // $ANTLR end entryRuleTopLevelComplexType


    // $ANTLR start ruleTopLevelComplexType
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:490:1: ruleTopLevelComplexType : ( ( rule__TopLevelComplexType__Group__0 ) ) ;
    public final void ruleTopLevelComplexType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:494:2: ( ( ( rule__TopLevelComplexType__Group__0 ) ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:495:1: ( ( rule__TopLevelComplexType__Group__0 ) )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:495:1: ( ( rule__TopLevelComplexType__Group__0 ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:496:1: ( rule__TopLevelComplexType__Group__0 )
            {
             before(grammarAccess.getTopLevelComplexTypeAccess().getGroup()); 
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:497:1: ( rule__TopLevelComplexType__Group__0 )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:497:2: rule__TopLevelComplexType__Group__0
            {
            pushFollow(FOLLOW_rule__TopLevelComplexType__Group__0_in_ruleTopLevelComplexType994);
            rule__TopLevelComplexType__Group__0();
            _fsp--;


            }

             after(grammarAccess.getTopLevelComplexTypeAccess().getGroup()); 

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
    // $ANTLR end ruleTopLevelComplexType


    // $ANTLR start entryRuleProperty
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:509:1: entryRuleProperty : ruleProperty EOF ;
    public final void entryRuleProperty() throws RecognitionException {
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:510:1: ( ruleProperty EOF )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:511:1: ruleProperty EOF
            {
             before(grammarAccess.getPropertyRule()); 
            pushFollow(FOLLOW_ruleProperty_in_entryRuleProperty1021);
            ruleProperty();
            _fsp--;

             after(grammarAccess.getPropertyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProperty1028); 

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
    // $ANTLR end entryRuleProperty


    // $ANTLR start ruleProperty
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:518:1: ruleProperty : ( ( rule__Property__Alternatives ) ) ;
    public final void ruleProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:522:2: ( ( ( rule__Property__Alternatives ) ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:523:1: ( ( rule__Property__Alternatives ) )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:523:1: ( ( rule__Property__Alternatives ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:524:1: ( rule__Property__Alternatives )
            {
             before(grammarAccess.getPropertyAccess().getAlternatives()); 
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:525:1: ( rule__Property__Alternatives )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:525:2: rule__Property__Alternatives
            {
            pushFollow(FOLLOW_rule__Property__Alternatives_in_ruleProperty1054);
            rule__Property__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getPropertyAccess().getAlternatives()); 

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
    // $ANTLR end ruleProperty


    // $ANTLR start entryRuleElement
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:537:1: entryRuleElement : ruleElement EOF ;
    public final void entryRuleElement() throws RecognitionException {
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:538:1: ( ruleElement EOF )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:539:1: ruleElement EOF
            {
             before(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_ruleElement_in_entryRuleElement1081);
            ruleElement();
            _fsp--;

             after(grammarAccess.getElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleElement1088); 

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
    // $ANTLR end entryRuleElement


    // $ANTLR start ruleElement
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:546:1: ruleElement : ( ( rule__Element__Group__0 ) ) ;
    public final void ruleElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:550:2: ( ( ( rule__Element__Group__0 ) ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:551:1: ( ( rule__Element__Group__0 ) )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:551:1: ( ( rule__Element__Group__0 ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:552:1: ( rule__Element__Group__0 )
            {
             before(grammarAccess.getElementAccess().getGroup()); 
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:553:1: ( rule__Element__Group__0 )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:553:2: rule__Element__Group__0
            {
            pushFollow(FOLLOW_rule__Element__Group__0_in_ruleElement1114);
            rule__Element__Group__0();
            _fsp--;


            }

             after(grammarAccess.getElementAccess().getGroup()); 

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
    // $ANTLR end ruleElement


    // $ANTLR start entryRuleAttribute
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:565:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:566:1: ( ruleAttribute EOF )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:567:1: ruleAttribute EOF
            {
             before(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute1141);
            ruleAttribute();
            _fsp--;

             after(grammarAccess.getAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute1148); 

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
    // $ANTLR end entryRuleAttribute


    // $ANTLR start ruleAttribute
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:574:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:578:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:579:1: ( ( rule__Attribute__Group__0 ) )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:579:1: ( ( rule__Attribute__Group__0 ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:580:1: ( rule__Attribute__Group__0 )
            {
             before(grammarAccess.getAttributeAccess().getGroup()); 
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:581:1: ( rule__Attribute__Group__0 )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:581:2: rule__Attribute__Group__0
            {
            pushFollow(FOLLOW_rule__Attribute__Group__0_in_ruleAttribute1174);
            rule__Attribute__Group__0();
            _fsp--;


            }

             after(grammarAccess.getAttributeAccess().getGroup()); 

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
    // $ANTLR end ruleAttribute


    // $ANTLR start entryRuleMultiplicity
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:593:1: entryRuleMultiplicity : ruleMultiplicity EOF ;
    public final void entryRuleMultiplicity() throws RecognitionException {
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:594:1: ( ruleMultiplicity EOF )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:595:1: ruleMultiplicity EOF
            {
             before(grammarAccess.getMultiplicityRule()); 
            pushFollow(FOLLOW_ruleMultiplicity_in_entryRuleMultiplicity1201);
            ruleMultiplicity();
            _fsp--;

             after(grammarAccess.getMultiplicityRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiplicity1208); 

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
    // $ANTLR end entryRuleMultiplicity


    // $ANTLR start ruleMultiplicity
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:602:1: ruleMultiplicity : ( ( rule__Multiplicity__Group__0 ) ) ;
    public final void ruleMultiplicity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:606:2: ( ( ( rule__Multiplicity__Group__0 ) ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:607:1: ( ( rule__Multiplicity__Group__0 ) )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:607:1: ( ( rule__Multiplicity__Group__0 ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:608:1: ( rule__Multiplicity__Group__0 )
            {
             before(grammarAccess.getMultiplicityAccess().getGroup()); 
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:609:1: ( rule__Multiplicity__Group__0 )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:609:2: rule__Multiplicity__Group__0
            {
            pushFollow(FOLLOW_rule__Multiplicity__Group__0_in_ruleMultiplicity1234);
            rule__Multiplicity__Group__0();
            _fsp--;


            }

             after(grammarAccess.getMultiplicityAccess().getGroup()); 

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
    // $ANTLR end ruleMultiplicity


    // $ANTLR start entryRuleNamedTypeReference
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:621:1: entryRuleNamedTypeReference : ruleNamedTypeReference EOF ;
    public final void entryRuleNamedTypeReference() throws RecognitionException {
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:622:1: ( ruleNamedTypeReference EOF )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:623:1: ruleNamedTypeReference EOF
            {
             before(grammarAccess.getNamedTypeReferenceRule()); 
            pushFollow(FOLLOW_ruleNamedTypeReference_in_entryRuleNamedTypeReference1261);
            ruleNamedTypeReference();
            _fsp--;

             after(grammarAccess.getNamedTypeReferenceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNamedTypeReference1268); 

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
    // $ANTLR end entryRuleNamedTypeReference


    // $ANTLR start ruleNamedTypeReference
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:630:1: ruleNamedTypeReference : ( ( rule__NamedTypeReference__Alternatives ) ) ;
    public final void ruleNamedTypeReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:634:2: ( ( ( rule__NamedTypeReference__Alternatives ) ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:635:1: ( ( rule__NamedTypeReference__Alternatives ) )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:635:1: ( ( rule__NamedTypeReference__Alternatives ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:636:1: ( rule__NamedTypeReference__Alternatives )
            {
             before(grammarAccess.getNamedTypeReferenceAccess().getAlternatives()); 
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:637:1: ( rule__NamedTypeReference__Alternatives )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:637:2: rule__NamedTypeReference__Alternatives
            {
            pushFollow(FOLLOW_rule__NamedTypeReference__Alternatives_in_ruleNamedTypeReference1294);
            rule__NamedTypeReference__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getNamedTypeReferenceAccess().getAlternatives()); 

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
    // $ANTLR end ruleNamedTypeReference


    // $ANTLR start entryRuleNonComplexTypeReference
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:649:1: entryRuleNonComplexTypeReference : ruleNonComplexTypeReference EOF ;
    public final void entryRuleNonComplexTypeReference() throws RecognitionException {
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:650:1: ( ruleNonComplexTypeReference EOF )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:651:1: ruleNonComplexTypeReference EOF
            {
             before(grammarAccess.getNonComplexTypeReferenceRule()); 
            pushFollow(FOLLOW_ruleNonComplexTypeReference_in_entryRuleNonComplexTypeReference1321);
            ruleNonComplexTypeReference();
            _fsp--;

             after(grammarAccess.getNonComplexTypeReferenceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNonComplexTypeReference1328); 

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
    // $ANTLR end entryRuleNonComplexTypeReference


    // $ANTLR start ruleNonComplexTypeReference
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:658:1: ruleNonComplexTypeReference : ( ( rule__NonComplexTypeReference__Alternatives ) ) ;
    public final void ruleNonComplexTypeReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:662:2: ( ( ( rule__NonComplexTypeReference__Alternatives ) ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:663:1: ( ( rule__NonComplexTypeReference__Alternatives ) )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:663:1: ( ( rule__NonComplexTypeReference__Alternatives ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:664:1: ( rule__NonComplexTypeReference__Alternatives )
            {
             before(grammarAccess.getNonComplexTypeReferenceAccess().getAlternatives()); 
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:665:1: ( rule__NonComplexTypeReference__Alternatives )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:665:2: rule__NonComplexTypeReference__Alternatives
            {
            pushFollow(FOLLOW_rule__NonComplexTypeReference__Alternatives_in_ruleNonComplexTypeReference1354);
            rule__NonComplexTypeReference__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getNonComplexTypeReferenceAccess().getAlternatives()); 

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
    // $ANTLR end ruleNonComplexTypeReference


    // $ANTLR start entryRuleBuiltinTypeReference
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:677:1: entryRuleBuiltinTypeReference : ruleBuiltinTypeReference EOF ;
    public final void entryRuleBuiltinTypeReference() throws RecognitionException {
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:678:1: ( ruleBuiltinTypeReference EOF )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:679:1: ruleBuiltinTypeReference EOF
            {
             before(grammarAccess.getBuiltinTypeReferenceRule()); 
            pushFollow(FOLLOW_ruleBuiltinTypeReference_in_entryRuleBuiltinTypeReference1381);
            ruleBuiltinTypeReference();
            _fsp--;

             after(grammarAccess.getBuiltinTypeReferenceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBuiltinTypeReference1388); 

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
    // $ANTLR end entryRuleBuiltinTypeReference


    // $ANTLR start ruleBuiltinTypeReference
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:686:1: ruleBuiltinTypeReference : ( ( rule__BuiltinTypeReference__BuiltinAssignment ) ) ;
    public final void ruleBuiltinTypeReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:690:2: ( ( ( rule__BuiltinTypeReference__BuiltinAssignment ) ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:691:1: ( ( rule__BuiltinTypeReference__BuiltinAssignment ) )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:691:1: ( ( rule__BuiltinTypeReference__BuiltinAssignment ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:692:1: ( rule__BuiltinTypeReference__BuiltinAssignment )
            {
             before(grammarAccess.getBuiltinTypeReferenceAccess().getBuiltinAssignment()); 
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:693:1: ( rule__BuiltinTypeReference__BuiltinAssignment )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:693:2: rule__BuiltinTypeReference__BuiltinAssignment
            {
            pushFollow(FOLLOW_rule__BuiltinTypeReference__BuiltinAssignment_in_ruleBuiltinTypeReference1414);
            rule__BuiltinTypeReference__BuiltinAssignment();
            _fsp--;


            }

             after(grammarAccess.getBuiltinTypeReferenceAccess().getBuiltinAssignment()); 

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
    // $ANTLR end ruleBuiltinTypeReference


    // $ANTLR start entryRuleTopLevelTypeReference
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:705:1: entryRuleTopLevelTypeReference : ruleTopLevelTypeReference EOF ;
    public final void entryRuleTopLevelTypeReference() throws RecognitionException {
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:706:1: ( ruleTopLevelTypeReference EOF )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:707:1: ruleTopLevelTypeReference EOF
            {
             before(grammarAccess.getTopLevelTypeReferenceRule()); 
            pushFollow(FOLLOW_ruleTopLevelTypeReference_in_entryRuleTopLevelTypeReference1441);
            ruleTopLevelTypeReference();
            _fsp--;

             after(grammarAccess.getTopLevelTypeReferenceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTopLevelTypeReference1448); 

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
    // $ANTLR end entryRuleTopLevelTypeReference


    // $ANTLR start ruleTopLevelTypeReference
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:714:1: ruleTopLevelTypeReference : ( ( rule__TopLevelTypeReference__Alternatives ) ) ;
    public final void ruleTopLevelTypeReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:718:2: ( ( ( rule__TopLevelTypeReference__Alternatives ) ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:719:1: ( ( rule__TopLevelTypeReference__Alternatives ) )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:719:1: ( ( rule__TopLevelTypeReference__Alternatives ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:720:1: ( rule__TopLevelTypeReference__Alternatives )
            {
             before(grammarAccess.getTopLevelTypeReferenceAccess().getAlternatives()); 
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:721:1: ( rule__TopLevelTypeReference__Alternatives )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:721:2: rule__TopLevelTypeReference__Alternatives
            {
            pushFollow(FOLLOW_rule__TopLevelTypeReference__Alternatives_in_ruleTopLevelTypeReference1474);
            rule__TopLevelTypeReference__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getTopLevelTypeReferenceAccess().getAlternatives()); 

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
    // $ANTLR end ruleTopLevelTypeReference


    // $ANTLR start entryRuleTopLevelComplexTypeReference
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:733:1: entryRuleTopLevelComplexTypeReference : ruleTopLevelComplexTypeReference EOF ;
    public final void entryRuleTopLevelComplexTypeReference() throws RecognitionException {
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:734:1: ( ruleTopLevelComplexTypeReference EOF )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:735:1: ruleTopLevelComplexTypeReference EOF
            {
             before(grammarAccess.getTopLevelComplexTypeReferenceRule()); 
            pushFollow(FOLLOW_ruleTopLevelComplexTypeReference_in_entryRuleTopLevelComplexTypeReference1501);
            ruleTopLevelComplexTypeReference();
            _fsp--;

             after(grammarAccess.getTopLevelComplexTypeReferenceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTopLevelComplexTypeReference1508); 

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
    // $ANTLR end entryRuleTopLevelComplexTypeReference


    // $ANTLR start ruleTopLevelComplexTypeReference
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:742:1: ruleTopLevelComplexTypeReference : ( ( rule__TopLevelComplexTypeReference__Alternatives ) ) ;
    public final void ruleTopLevelComplexTypeReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:746:2: ( ( ( rule__TopLevelComplexTypeReference__Alternatives ) ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:747:1: ( ( rule__TopLevelComplexTypeReference__Alternatives ) )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:747:1: ( ( rule__TopLevelComplexTypeReference__Alternatives ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:748:1: ( rule__TopLevelComplexTypeReference__Alternatives )
            {
             before(grammarAccess.getTopLevelComplexTypeReferenceAccess().getAlternatives()); 
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:749:1: ( rule__TopLevelComplexTypeReference__Alternatives )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:749:2: rule__TopLevelComplexTypeReference__Alternatives
            {
            pushFollow(FOLLOW_rule__TopLevelComplexTypeReference__Alternatives_in_ruleTopLevelComplexTypeReference1534);
            rule__TopLevelComplexTypeReference__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getTopLevelComplexTypeReferenceAccess().getAlternatives()); 

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
    // $ANTLR end ruleTopLevelComplexTypeReference


    // $ANTLR start entryRuleTopLevelSimpleTypeReference
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:761:1: entryRuleTopLevelSimpleTypeReference : ruleTopLevelSimpleTypeReference EOF ;
    public final void entryRuleTopLevelSimpleTypeReference() throws RecognitionException {
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:762:1: ( ruleTopLevelSimpleTypeReference EOF )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:763:1: ruleTopLevelSimpleTypeReference EOF
            {
             before(grammarAccess.getTopLevelSimpleTypeReferenceRule()); 
            pushFollow(FOLLOW_ruleTopLevelSimpleTypeReference_in_entryRuleTopLevelSimpleTypeReference1561);
            ruleTopLevelSimpleTypeReference();
            _fsp--;

             after(grammarAccess.getTopLevelSimpleTypeReferenceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTopLevelSimpleTypeReference1568); 

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
    // $ANTLR end entryRuleTopLevelSimpleTypeReference


    // $ANTLR start ruleTopLevelSimpleTypeReference
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:770:1: ruleTopLevelSimpleTypeReference : ( ( rule__TopLevelSimpleTypeReference__Alternatives ) ) ;
    public final void ruleTopLevelSimpleTypeReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:774:2: ( ( ( rule__TopLevelSimpleTypeReference__Alternatives ) ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:775:1: ( ( rule__TopLevelSimpleTypeReference__Alternatives ) )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:775:1: ( ( rule__TopLevelSimpleTypeReference__Alternatives ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:776:1: ( rule__TopLevelSimpleTypeReference__Alternatives )
            {
             before(grammarAccess.getTopLevelSimpleTypeReferenceAccess().getAlternatives()); 
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:777:1: ( rule__TopLevelSimpleTypeReference__Alternatives )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:777:2: rule__TopLevelSimpleTypeReference__Alternatives
            {
            pushFollow(FOLLOW_rule__TopLevelSimpleTypeReference__Alternatives_in_ruleTopLevelSimpleTypeReference1594);
            rule__TopLevelSimpleTypeReference__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getTopLevelSimpleTypeReferenceAccess().getAlternatives()); 

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
    // $ANTLR end ruleTopLevelSimpleTypeReference


    // $ANTLR start entryRuleDirectTopLevelTypeReference
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:789:1: entryRuleDirectTopLevelTypeReference : ruleDirectTopLevelTypeReference EOF ;
    public final void entryRuleDirectTopLevelTypeReference() throws RecognitionException {
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:790:1: ( ruleDirectTopLevelTypeReference EOF )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:791:1: ruleDirectTopLevelTypeReference EOF
            {
             before(grammarAccess.getDirectTopLevelTypeReferenceRule()); 
            pushFollow(FOLLOW_ruleDirectTopLevelTypeReference_in_entryRuleDirectTopLevelTypeReference1621);
            ruleDirectTopLevelTypeReference();
            _fsp--;

             after(grammarAccess.getDirectTopLevelTypeReferenceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDirectTopLevelTypeReference1628); 

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
    // $ANTLR end entryRuleDirectTopLevelTypeReference


    // $ANTLR start ruleDirectTopLevelTypeReference
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:798:1: ruleDirectTopLevelTypeReference : ( ( rule__DirectTopLevelTypeReference__RefAssignment ) ) ;
    public final void ruleDirectTopLevelTypeReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:802:2: ( ( ( rule__DirectTopLevelTypeReference__RefAssignment ) ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:803:1: ( ( rule__DirectTopLevelTypeReference__RefAssignment ) )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:803:1: ( ( rule__DirectTopLevelTypeReference__RefAssignment ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:804:1: ( rule__DirectTopLevelTypeReference__RefAssignment )
            {
             before(grammarAccess.getDirectTopLevelTypeReferenceAccess().getRefAssignment()); 
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:805:1: ( rule__DirectTopLevelTypeReference__RefAssignment )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:805:2: rule__DirectTopLevelTypeReference__RefAssignment
            {
            pushFollow(FOLLOW_rule__DirectTopLevelTypeReference__RefAssignment_in_ruleDirectTopLevelTypeReference1654);
            rule__DirectTopLevelTypeReference__RefAssignment();
            _fsp--;


            }

             after(grammarAccess.getDirectTopLevelTypeReferenceAccess().getRefAssignment()); 

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
    // $ANTLR end ruleDirectTopLevelTypeReference


    // $ANTLR start entryRuleDirectTopLevelSimpleTypeReference
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:817:1: entryRuleDirectTopLevelSimpleTypeReference : ruleDirectTopLevelSimpleTypeReference EOF ;
    public final void entryRuleDirectTopLevelSimpleTypeReference() throws RecognitionException {
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:818:1: ( ruleDirectTopLevelSimpleTypeReference EOF )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:819:1: ruleDirectTopLevelSimpleTypeReference EOF
            {
             before(grammarAccess.getDirectTopLevelSimpleTypeReferenceRule()); 
            pushFollow(FOLLOW_ruleDirectTopLevelSimpleTypeReference_in_entryRuleDirectTopLevelSimpleTypeReference1681);
            ruleDirectTopLevelSimpleTypeReference();
            _fsp--;

             after(grammarAccess.getDirectTopLevelSimpleTypeReferenceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDirectTopLevelSimpleTypeReference1688); 

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
    // $ANTLR end entryRuleDirectTopLevelSimpleTypeReference


    // $ANTLR start ruleDirectTopLevelSimpleTypeReference
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:826:1: ruleDirectTopLevelSimpleTypeReference : ( ( rule__DirectTopLevelSimpleTypeReference__RefAssignment ) ) ;
    public final void ruleDirectTopLevelSimpleTypeReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:830:2: ( ( ( rule__DirectTopLevelSimpleTypeReference__RefAssignment ) ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:831:1: ( ( rule__DirectTopLevelSimpleTypeReference__RefAssignment ) )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:831:1: ( ( rule__DirectTopLevelSimpleTypeReference__RefAssignment ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:832:1: ( rule__DirectTopLevelSimpleTypeReference__RefAssignment )
            {
             before(grammarAccess.getDirectTopLevelSimpleTypeReferenceAccess().getRefAssignment()); 
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:833:1: ( rule__DirectTopLevelSimpleTypeReference__RefAssignment )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:833:2: rule__DirectTopLevelSimpleTypeReference__RefAssignment
            {
            pushFollow(FOLLOW_rule__DirectTopLevelSimpleTypeReference__RefAssignment_in_ruleDirectTopLevelSimpleTypeReference1714);
            rule__DirectTopLevelSimpleTypeReference__RefAssignment();
            _fsp--;


            }

             after(grammarAccess.getDirectTopLevelSimpleTypeReferenceAccess().getRefAssignment()); 

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
    // $ANTLR end ruleDirectTopLevelSimpleTypeReference


    // $ANTLR start entryRuleDirectTopLevelComplexTypeReference
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:845:1: entryRuleDirectTopLevelComplexTypeReference : ruleDirectTopLevelComplexTypeReference EOF ;
    public final void entryRuleDirectTopLevelComplexTypeReference() throws RecognitionException {
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:846:1: ( ruleDirectTopLevelComplexTypeReference EOF )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:847:1: ruleDirectTopLevelComplexTypeReference EOF
            {
             before(grammarAccess.getDirectTopLevelComplexTypeReferenceRule()); 
            pushFollow(FOLLOW_ruleDirectTopLevelComplexTypeReference_in_entryRuleDirectTopLevelComplexTypeReference1741);
            ruleDirectTopLevelComplexTypeReference();
            _fsp--;

             after(grammarAccess.getDirectTopLevelComplexTypeReferenceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDirectTopLevelComplexTypeReference1748); 

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
    // $ANTLR end entryRuleDirectTopLevelComplexTypeReference


    // $ANTLR start ruleDirectTopLevelComplexTypeReference
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:854:1: ruleDirectTopLevelComplexTypeReference : ( ( rule__DirectTopLevelComplexTypeReference__RefAssignment ) ) ;
    public final void ruleDirectTopLevelComplexTypeReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:858:2: ( ( ( rule__DirectTopLevelComplexTypeReference__RefAssignment ) ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:859:1: ( ( rule__DirectTopLevelComplexTypeReference__RefAssignment ) )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:859:1: ( ( rule__DirectTopLevelComplexTypeReference__RefAssignment ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:860:1: ( rule__DirectTopLevelComplexTypeReference__RefAssignment )
            {
             before(grammarAccess.getDirectTopLevelComplexTypeReferenceAccess().getRefAssignment()); 
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:861:1: ( rule__DirectTopLevelComplexTypeReference__RefAssignment )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:861:2: rule__DirectTopLevelComplexTypeReference__RefAssignment
            {
            pushFollow(FOLLOW_rule__DirectTopLevelComplexTypeReference__RefAssignment_in_ruleDirectTopLevelComplexTypeReference1774);
            rule__DirectTopLevelComplexTypeReference__RefAssignment();
            _fsp--;


            }

             after(grammarAccess.getDirectTopLevelComplexTypeReferenceAccess().getRefAssignment()); 

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
    // $ANTLR end ruleDirectTopLevelComplexTypeReference


    // $ANTLR start entryRuleImportedTopLevelTypeReference
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:873:1: entryRuleImportedTopLevelTypeReference : ruleImportedTopLevelTypeReference EOF ;
    public final void entryRuleImportedTopLevelTypeReference() throws RecognitionException {
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:874:1: ( ruleImportedTopLevelTypeReference EOF )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:875:1: ruleImportedTopLevelTypeReference EOF
            {
             before(grammarAccess.getImportedTopLevelTypeReferenceRule()); 
            pushFollow(FOLLOW_ruleImportedTopLevelTypeReference_in_entryRuleImportedTopLevelTypeReference1801);
            ruleImportedTopLevelTypeReference();
            _fsp--;

             after(grammarAccess.getImportedTopLevelTypeReferenceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImportedTopLevelTypeReference1808); 

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
    // $ANTLR end entryRuleImportedTopLevelTypeReference


    // $ANTLR start ruleImportedTopLevelTypeReference
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:882:1: ruleImportedTopLevelTypeReference : ( ( rule__ImportedTopLevelTypeReference__Group__0 ) ) ;
    public final void ruleImportedTopLevelTypeReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:886:2: ( ( ( rule__ImportedTopLevelTypeReference__Group__0 ) ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:887:1: ( ( rule__ImportedTopLevelTypeReference__Group__0 ) )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:887:1: ( ( rule__ImportedTopLevelTypeReference__Group__0 ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:888:1: ( rule__ImportedTopLevelTypeReference__Group__0 )
            {
             before(grammarAccess.getImportedTopLevelTypeReferenceAccess().getGroup()); 
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:889:1: ( rule__ImportedTopLevelTypeReference__Group__0 )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:889:2: rule__ImportedTopLevelTypeReference__Group__0
            {
            pushFollow(FOLLOW_rule__ImportedTopLevelTypeReference__Group__0_in_ruleImportedTopLevelTypeReference1834);
            rule__ImportedTopLevelTypeReference__Group__0();
            _fsp--;


            }

             after(grammarAccess.getImportedTopLevelTypeReferenceAccess().getGroup()); 

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
    // $ANTLR end ruleImportedTopLevelTypeReference


    // $ANTLR start entryRuleImportedTopLevelSimpleTypeReference
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:901:1: entryRuleImportedTopLevelSimpleTypeReference : ruleImportedTopLevelSimpleTypeReference EOF ;
    public final void entryRuleImportedTopLevelSimpleTypeReference() throws RecognitionException {
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:902:1: ( ruleImportedTopLevelSimpleTypeReference EOF )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:903:1: ruleImportedTopLevelSimpleTypeReference EOF
            {
             before(grammarAccess.getImportedTopLevelSimpleTypeReferenceRule()); 
            pushFollow(FOLLOW_ruleImportedTopLevelSimpleTypeReference_in_entryRuleImportedTopLevelSimpleTypeReference1861);
            ruleImportedTopLevelSimpleTypeReference();
            _fsp--;

             after(grammarAccess.getImportedTopLevelSimpleTypeReferenceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImportedTopLevelSimpleTypeReference1868); 

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
    // $ANTLR end entryRuleImportedTopLevelSimpleTypeReference


    // $ANTLR start ruleImportedTopLevelSimpleTypeReference
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:910:1: ruleImportedTopLevelSimpleTypeReference : ( ( rule__ImportedTopLevelSimpleTypeReference__Group__0 ) ) ;
    public final void ruleImportedTopLevelSimpleTypeReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:914:2: ( ( ( rule__ImportedTopLevelSimpleTypeReference__Group__0 ) ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:915:1: ( ( rule__ImportedTopLevelSimpleTypeReference__Group__0 ) )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:915:1: ( ( rule__ImportedTopLevelSimpleTypeReference__Group__0 ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:916:1: ( rule__ImportedTopLevelSimpleTypeReference__Group__0 )
            {
             before(grammarAccess.getImportedTopLevelSimpleTypeReferenceAccess().getGroup()); 
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:917:1: ( rule__ImportedTopLevelSimpleTypeReference__Group__0 )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:917:2: rule__ImportedTopLevelSimpleTypeReference__Group__0
            {
            pushFollow(FOLLOW_rule__ImportedTopLevelSimpleTypeReference__Group__0_in_ruleImportedTopLevelSimpleTypeReference1894);
            rule__ImportedTopLevelSimpleTypeReference__Group__0();
            _fsp--;


            }

             after(grammarAccess.getImportedTopLevelSimpleTypeReferenceAccess().getGroup()); 

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
    // $ANTLR end ruleImportedTopLevelSimpleTypeReference


    // $ANTLR start entryRuleImportedTopLevelComplexTypeReference
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:929:1: entryRuleImportedTopLevelComplexTypeReference : ruleImportedTopLevelComplexTypeReference EOF ;
    public final void entryRuleImportedTopLevelComplexTypeReference() throws RecognitionException {
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:930:1: ( ruleImportedTopLevelComplexTypeReference EOF )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:931:1: ruleImportedTopLevelComplexTypeReference EOF
            {
             before(grammarAccess.getImportedTopLevelComplexTypeReferenceRule()); 
            pushFollow(FOLLOW_ruleImportedTopLevelComplexTypeReference_in_entryRuleImportedTopLevelComplexTypeReference1921);
            ruleImportedTopLevelComplexTypeReference();
            _fsp--;

             after(grammarAccess.getImportedTopLevelComplexTypeReferenceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImportedTopLevelComplexTypeReference1928); 

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
    // $ANTLR end entryRuleImportedTopLevelComplexTypeReference


    // $ANTLR start ruleImportedTopLevelComplexTypeReference
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:938:1: ruleImportedTopLevelComplexTypeReference : ( ( rule__ImportedTopLevelComplexTypeReference__Group__0 ) ) ;
    public final void ruleImportedTopLevelComplexTypeReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:942:2: ( ( ( rule__ImportedTopLevelComplexTypeReference__Group__0 ) ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:943:1: ( ( rule__ImportedTopLevelComplexTypeReference__Group__0 ) )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:943:1: ( ( rule__ImportedTopLevelComplexTypeReference__Group__0 ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:944:1: ( rule__ImportedTopLevelComplexTypeReference__Group__0 )
            {
             before(grammarAccess.getImportedTopLevelComplexTypeReferenceAccess().getGroup()); 
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:945:1: ( rule__ImportedTopLevelComplexTypeReference__Group__0 )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:945:2: rule__ImportedTopLevelComplexTypeReference__Group__0
            {
            pushFollow(FOLLOW_rule__ImportedTopLevelComplexTypeReference__Group__0_in_ruleImportedTopLevelComplexTypeReference1954);
            rule__ImportedTopLevelComplexTypeReference__Group__0();
            _fsp--;


            }

             after(grammarAccess.getImportedTopLevelComplexTypeReferenceAccess().getGroup()); 

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
    // $ANTLR end ruleImportedTopLevelComplexTypeReference


    // $ANTLR start entryRuleEmbeddedType
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:959:1: entryRuleEmbeddedType : ruleEmbeddedType EOF ;
    public final void entryRuleEmbeddedType() throws RecognitionException {
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:960:1: ( ruleEmbeddedType EOF )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:961:1: ruleEmbeddedType EOF
            {
             before(grammarAccess.getEmbeddedTypeRule()); 
            pushFollow(FOLLOW_ruleEmbeddedType_in_entryRuleEmbeddedType1983);
            ruleEmbeddedType();
            _fsp--;

             after(grammarAccess.getEmbeddedTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEmbeddedType1990); 

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
    // $ANTLR end entryRuleEmbeddedType


    // $ANTLR start ruleEmbeddedType
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:968:1: ruleEmbeddedType : ( ( rule__EmbeddedType__Alternatives ) ) ;
    public final void ruleEmbeddedType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:972:2: ( ( ( rule__EmbeddedType__Alternatives ) ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:973:1: ( ( rule__EmbeddedType__Alternatives ) )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:973:1: ( ( rule__EmbeddedType__Alternatives ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:974:1: ( rule__EmbeddedType__Alternatives )
            {
             before(grammarAccess.getEmbeddedTypeAccess().getAlternatives()); 
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:975:1: ( rule__EmbeddedType__Alternatives )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:975:2: rule__EmbeddedType__Alternatives
            {
            pushFollow(FOLLOW_rule__EmbeddedType__Alternatives_in_ruleEmbeddedType2016);
            rule__EmbeddedType__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getEmbeddedTypeAccess().getAlternatives()); 

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
    // $ANTLR end ruleEmbeddedType


    // $ANTLR start entryRuleEmbeddedComplexType
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:987:1: entryRuleEmbeddedComplexType : ruleEmbeddedComplexType EOF ;
    public final void entryRuleEmbeddedComplexType() throws RecognitionException {
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:988:1: ( ruleEmbeddedComplexType EOF )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:989:1: ruleEmbeddedComplexType EOF
            {
             before(grammarAccess.getEmbeddedComplexTypeRule()); 
            pushFollow(FOLLOW_ruleEmbeddedComplexType_in_entryRuleEmbeddedComplexType2043);
            ruleEmbeddedComplexType();
            _fsp--;

             after(grammarAccess.getEmbeddedComplexTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEmbeddedComplexType2050); 

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
    // $ANTLR end entryRuleEmbeddedComplexType


    // $ANTLR start ruleEmbeddedComplexType
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:996:1: ruleEmbeddedComplexType : ( ( rule__EmbeddedComplexType__Group__0 ) ) ;
    public final void ruleEmbeddedComplexType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1000:2: ( ( ( rule__EmbeddedComplexType__Group__0 ) ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1001:1: ( ( rule__EmbeddedComplexType__Group__0 ) )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1001:1: ( ( rule__EmbeddedComplexType__Group__0 ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1002:1: ( rule__EmbeddedComplexType__Group__0 )
            {
             before(grammarAccess.getEmbeddedComplexTypeAccess().getGroup()); 
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1003:1: ( rule__EmbeddedComplexType__Group__0 )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1003:2: rule__EmbeddedComplexType__Group__0
            {
            pushFollow(FOLLOW_rule__EmbeddedComplexType__Group__0_in_ruleEmbeddedComplexType2076);
            rule__EmbeddedComplexType__Group__0();
            _fsp--;


            }

             after(grammarAccess.getEmbeddedComplexTypeAccess().getGroup()); 

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
    // $ANTLR end ruleEmbeddedComplexType


    // $ANTLR start entryRuleEmbeddedSimpleType
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1015:1: entryRuleEmbeddedSimpleType : ruleEmbeddedSimpleType EOF ;
    public final void entryRuleEmbeddedSimpleType() throws RecognitionException {
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1016:1: ( ruleEmbeddedSimpleType EOF )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1017:1: ruleEmbeddedSimpleType EOF
            {
             before(grammarAccess.getEmbeddedSimpleTypeRule()); 
            pushFollow(FOLLOW_ruleEmbeddedSimpleType_in_entryRuleEmbeddedSimpleType2103);
            ruleEmbeddedSimpleType();
            _fsp--;

             after(grammarAccess.getEmbeddedSimpleTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEmbeddedSimpleType2110); 

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
    // $ANTLR end entryRuleEmbeddedSimpleType


    // $ANTLR start ruleEmbeddedSimpleType
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1024:1: ruleEmbeddedSimpleType : ( ( rule__EmbeddedSimpleType__Group__0 ) ) ;
    public final void ruleEmbeddedSimpleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1028:2: ( ( ( rule__EmbeddedSimpleType__Group__0 ) ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1029:1: ( ( rule__EmbeddedSimpleType__Group__0 ) )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1029:1: ( ( rule__EmbeddedSimpleType__Group__0 ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1030:1: ( rule__EmbeddedSimpleType__Group__0 )
            {
             before(grammarAccess.getEmbeddedSimpleTypeAccess().getGroup()); 
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1031:1: ( rule__EmbeddedSimpleType__Group__0 )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1031:2: rule__EmbeddedSimpleType__Group__0
            {
            pushFollow(FOLLOW_rule__EmbeddedSimpleType__Group__0_in_ruleEmbeddedSimpleType2136);
            rule__EmbeddedSimpleType__Group__0();
            _fsp--;


            }

             after(grammarAccess.getEmbeddedSimpleTypeAccess().getGroup()); 

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
    // $ANTLR end ruleEmbeddedSimpleType


    // $ANTLR start ruleBuiltinType
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1048:1: ruleBuiltinType : ( ( rule__BuiltinType__Alternatives ) ) ;
    public final void ruleBuiltinType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1052:1: ( ( ( rule__BuiltinType__Alternatives ) ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1053:1: ( ( rule__BuiltinType__Alternatives ) )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1053:1: ( ( rule__BuiltinType__Alternatives ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1054:1: ( rule__BuiltinType__Alternatives )
            {
             before(grammarAccess.getBuiltinTypeAccess().getAlternatives()); 
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1055:1: ( rule__BuiltinType__Alternatives )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1055:2: rule__BuiltinType__Alternatives
            {
            pushFollow(FOLLOW_rule__BuiltinType__Alternatives_in_ruleBuiltinType2177);
            rule__BuiltinType__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getBuiltinTypeAccess().getAlternatives()); 

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
    // $ANTLR end ruleBuiltinType


    // $ANTLR start rule__TopLevelDefinition__Alternatives
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1066:1: rule__TopLevelDefinition__Alternatives : ( ( ruleTopLevelType ) | ( ruleTopLevelElement ) );
    public final void rule__TopLevelDefinition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1070:1: ( ( ruleTopLevelType ) | ( ruleTopLevelElement ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==30||LA1_0==43||LA1_0==47) ) {
                alt1=1;
            }
            else if ( (LA1_0==27) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1066:1: rule__TopLevelDefinition__Alternatives : ( ( ruleTopLevelType ) | ( ruleTopLevelElement ) );", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1071:1: ( ruleTopLevelType )
                    {
                    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1071:1: ( ruleTopLevelType )
                    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1072:1: ruleTopLevelType
                    {
                     before(grammarAccess.getTopLevelDefinitionAccess().getTopLevelTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleTopLevelType_in_rule__TopLevelDefinition__Alternatives2212);
                    ruleTopLevelType();
                    _fsp--;

                     after(grammarAccess.getTopLevelDefinitionAccess().getTopLevelTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1077:6: ( ruleTopLevelElement )
                    {
                    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1077:6: ( ruleTopLevelElement )
                    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1078:1: ruleTopLevelElement
                    {
                     before(grammarAccess.getTopLevelDefinitionAccess().getTopLevelElementParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleTopLevelElement_in_rule__TopLevelDefinition__Alternatives2229);
                    ruleTopLevelElement();
                    _fsp--;

                     after(grammarAccess.getTopLevelDefinitionAccess().getTopLevelElementParserRuleCall_1()); 

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
    // $ANTLR end rule__TopLevelDefinition__Alternatives


    // $ANTLR start rule__TopLevelType__Alternatives
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1088:1: rule__TopLevelType__Alternatives : ( ( ruleTopLevelSimpleType ) | ( ruleTopLevelComplexType ) );
    public final void rule__TopLevelType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1092:1: ( ( ruleTopLevelSimpleType ) | ( ruleTopLevelComplexType ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==30) ) {
                alt2=1;
            }
            else if ( (LA2_0==43||LA2_0==47) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1088:1: rule__TopLevelType__Alternatives : ( ( ruleTopLevelSimpleType ) | ( ruleTopLevelComplexType ) );", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1093:1: ( ruleTopLevelSimpleType )
                    {
                    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1093:1: ( ruleTopLevelSimpleType )
                    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1094:1: ruleTopLevelSimpleType
                    {
                     before(grammarAccess.getTopLevelTypeAccess().getTopLevelSimpleTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleTopLevelSimpleType_in_rule__TopLevelType__Alternatives2261);
                    ruleTopLevelSimpleType();
                    _fsp--;

                     after(grammarAccess.getTopLevelTypeAccess().getTopLevelSimpleTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1099:6: ( ruleTopLevelComplexType )
                    {
                    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1099:6: ( ruleTopLevelComplexType )
                    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1100:1: ruleTopLevelComplexType
                    {
                     before(grammarAccess.getTopLevelTypeAccess().getTopLevelComplexTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleTopLevelComplexType_in_rule__TopLevelType__Alternatives2278);
                    ruleTopLevelComplexType();
                    _fsp--;

                     after(grammarAccess.getTopLevelTypeAccess().getTopLevelComplexTypeParserRuleCall_1()); 

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
    // $ANTLR end rule__TopLevelType__Alternatives


    // $ANTLR start rule__TopLevelElement__Alternatives_2
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1110:1: rule__TopLevelElement__Alternatives_2 : ( ( ( rule__TopLevelElement__Group_2_0__0 ) ) | ( ( rule__TopLevelElement__Group_2_1__0 ) ) );
    public final void rule__TopLevelElement__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1114:1: ( ( ( rule__TopLevelElement__Group_2_0__0 ) ) | ( ( rule__TopLevelElement__Group_2_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==28) ) {
                alt3=1;
            }
            else if ( (LA3_0==29) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1110:1: rule__TopLevelElement__Alternatives_2 : ( ( ( rule__TopLevelElement__Group_2_0__0 ) ) | ( ( rule__TopLevelElement__Group_2_1__0 ) ) );", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1115:1: ( ( rule__TopLevelElement__Group_2_0__0 ) )
                    {
                    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1115:1: ( ( rule__TopLevelElement__Group_2_0__0 ) )
                    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1116:1: ( rule__TopLevelElement__Group_2_0__0 )
                    {
                     before(grammarAccess.getTopLevelElementAccess().getGroup_2_0()); 
                    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1117:1: ( rule__TopLevelElement__Group_2_0__0 )
                    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1117:2: rule__TopLevelElement__Group_2_0__0
                    {
                    pushFollow(FOLLOW_rule__TopLevelElement__Group_2_0__0_in_rule__TopLevelElement__Alternatives_22310);
                    rule__TopLevelElement__Group_2_0__0();
                    _fsp--;


                    }

                     after(grammarAccess.getTopLevelElementAccess().getGroup_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1121:6: ( ( rule__TopLevelElement__Group_2_1__0 ) )
                    {
                    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1121:6: ( ( rule__TopLevelElement__Group_2_1__0 ) )
                    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1122:1: ( rule__TopLevelElement__Group_2_1__0 )
                    {
                     before(grammarAccess.getTopLevelElementAccess().getGroup_2_1()); 
                    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1123:1: ( rule__TopLevelElement__Group_2_1__0 )
                    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1123:2: rule__TopLevelElement__Group_2_1__0
                    {
                    pushFollow(FOLLOW_rule__TopLevelElement__Group_2_1__0_in_rule__TopLevelElement__Alternatives_22328);
                    rule__TopLevelElement__Group_2_1__0();
                    _fsp--;


                    }

                     after(grammarAccess.getTopLevelElementAccess().getGroup_2_1()); 

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
    // $ANTLR end rule__TopLevelElement__Alternatives_2


    // $ANTLR start rule__Facet__Alternatives
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1132:1: rule__Facet__Alternatives : ( ( ruleEnumerationFacet ) | ( ruleMaxLengthFacet ) | ( rulePatternFacet ) | ( ruleRangeFacet ) | ( ruleLengthFacet ) );
    public final void rule__Facet__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1136:1: ( ( ruleEnumerationFacet ) | ( ruleMaxLengthFacet ) | ( rulePatternFacet ) | ( ruleRangeFacet ) | ( ruleLengthFacet ) )
            int alt4=5;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt4=1;
                }
                break;
            case 37:
                {
                alt4=2;
                }
                break;
            case 39:
                {
                alt4=3;
                }
                break;
            case 40:
                {
                alt4=4;
                }
                break;
            case 42:
                {
                alt4=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1132:1: rule__Facet__Alternatives : ( ( ruleEnumerationFacet ) | ( ruleMaxLengthFacet ) | ( rulePatternFacet ) | ( ruleRangeFacet ) | ( ruleLengthFacet ) );", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1137:1: ( ruleEnumerationFacet )
                    {
                    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1137:1: ( ruleEnumerationFacet )
                    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1138:1: ruleEnumerationFacet
                    {
                     before(grammarAccess.getFacetAccess().getEnumerationFacetParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleEnumerationFacet_in_rule__Facet__Alternatives2361);
                    ruleEnumerationFacet();
                    _fsp--;

                     after(grammarAccess.getFacetAccess().getEnumerationFacetParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1143:6: ( ruleMaxLengthFacet )
                    {
                    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1143:6: ( ruleMaxLengthFacet )
                    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1144:1: ruleMaxLengthFacet
                    {
                     before(grammarAccess.getFacetAccess().getMaxLengthFacetParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleMaxLengthFacet_in_rule__Facet__Alternatives2378);
                    ruleMaxLengthFacet();
                    _fsp--;

                     after(grammarAccess.getFacetAccess().getMaxLengthFacetParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1149:6: ( rulePatternFacet )
                    {
                    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1149:6: ( rulePatternFacet )
                    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1150:1: rulePatternFacet
                    {
                     before(grammarAccess.getFacetAccess().getPatternFacetParserRuleCall_2()); 
                    pushFollow(FOLLOW_rulePatternFacet_in_rule__Facet__Alternatives2395);
                    rulePatternFacet();
                    _fsp--;

                     after(grammarAccess.getFacetAccess().getPatternFacetParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1155:6: ( ruleRangeFacet )
                    {
                    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1155:6: ( ruleRangeFacet )
                    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1156:1: ruleRangeFacet
                    {
                     before(grammarAccess.getFacetAccess().getRangeFacetParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleRangeFacet_in_rule__Facet__Alternatives2412);
                    ruleRangeFacet();
                    _fsp--;

                     after(grammarAccess.getFacetAccess().getRangeFacetParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1161:6: ( ruleLengthFacet )
                    {
                    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1161:6: ( ruleLengthFacet )
                    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1162:1: ruleLengthFacet
                    {
                     before(grammarAccess.getFacetAccess().getLengthFacetParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleLengthFacet_in_rule__Facet__Alternatives2429);
                    ruleLengthFacet();
                    _fsp--;

                     after(grammarAccess.getFacetAccess().getLengthFacetParserRuleCall_4()); 

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
    // $ANTLR end rule__Facet__Alternatives


    // $ANTLR start rule__EnumerationLiteral__ValueAlternatives_0_0
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1172:1: rule__EnumerationLiteral__ValueAlternatives_0_0 : ( ( RULE_ID ) | ( RULE_STRING ) );
    public final void rule__EnumerationLiteral__ValueAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1176:1: ( ( RULE_ID ) | ( RULE_STRING ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_STRING) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1172:1: rule__EnumerationLiteral__ValueAlternatives_0_0 : ( ( RULE_ID ) | ( RULE_STRING ) );", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1177:1: ( RULE_ID )
                    {
                    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1177:1: ( RULE_ID )
                    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1178:1: RULE_ID
                    {
                     before(grammarAccess.getEnumerationLiteralAccess().getValueIDTerminalRuleCall_0_0_0()); 
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumerationLiteral__ValueAlternatives_0_02461); 
                     after(grammarAccess.getEnumerationLiteralAccess().getValueIDTerminalRuleCall_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1183:6: ( RULE_STRING )
                    {
                    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1183:6: ( RULE_STRING )
                    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1184:1: RULE_STRING
                    {
                     before(grammarAccess.getEnumerationLiteralAccess().getValueSTRINGTerminalRuleCall_0_0_1()); 
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__EnumerationLiteral__ValueAlternatives_0_02478); 
                     after(grammarAccess.getEnumerationLiteralAccess().getValueSTRINGTerminalRuleCall_0_0_1()); 

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
    // $ANTLR end rule__EnumerationLiteral__ValueAlternatives_0_0


    // $ANTLR start rule__Property__Alternatives
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1194:1: rule__Property__Alternatives : ( ( ruleElement ) | ( ruleAttribute ) );
    public final void rule__Property__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1198:1: ( ( ruleElement ) | ( ruleAttribute ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                alt6=1;
            }
            else if ( (LA6_0==46||LA6_0==48) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1194:1: rule__Property__Alternatives : ( ( ruleElement ) | ( ruleAttribute ) );", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1199:1: ( ruleElement )
                    {
                    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1199:1: ( ruleElement )
                    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1200:1: ruleElement
                    {
                     before(grammarAccess.getPropertyAccess().getElementParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleElement_in_rule__Property__Alternatives2510);
                    ruleElement();
                    _fsp--;

                     after(grammarAccess.getPropertyAccess().getElementParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1205:6: ( ruleAttribute )
                    {
                    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1205:6: ( ruleAttribute )
                    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1206:1: ruleAttribute
                    {
                     before(grammarAccess.getPropertyAccess().getAttributeParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleAttribute_in_rule__Property__Alternatives2527);
                    ruleAttribute();
                    _fsp--;

                     after(grammarAccess.getPropertyAccess().getAttributeParserRuleCall_1()); 

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
    // $ANTLR end rule__Property__Alternatives


    // $ANTLR start rule__Element__Alternatives_1
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1216:1: rule__Element__Alternatives_1 : ( ( ( rule__Element__Group_1_0__0 ) ) | ( ( rule__Element__Group_1_1__0 ) ) );
    public final void rule__Element__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1220:1: ( ( ( rule__Element__Group_1_0__0 ) ) | ( ( rule__Element__Group_1_1__0 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==28) ) {
                alt7=1;
            }
            else if ( (LA7_0==29) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1216:1: rule__Element__Alternatives_1 : ( ( ( rule__Element__Group_1_0__0 ) ) | ( ( rule__Element__Group_1_1__0 ) ) );", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1221:1: ( ( rule__Element__Group_1_0__0 ) )
                    {
                    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1221:1: ( ( rule__Element__Group_1_0__0 ) )
                    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1222:1: ( rule__Element__Group_1_0__0 )
                    {
                     before(grammarAccess.getElementAccess().getGroup_1_0()); 
                    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1223:1: ( rule__Element__Group_1_0__0 )
                    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1223:2: rule__Element__Group_1_0__0
                    {
                    pushFollow(FOLLOW_rule__Element__Group_1_0__0_in_rule__Element__Alternatives_12559);
                    rule__Element__Group_1_0__0();
                    _fsp--;


                    }

                     after(grammarAccess.getElementAccess().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1227:6: ( ( rule__Element__Group_1_1__0 ) )
                    {
                    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1227:6: ( ( rule__Element__Group_1_1__0 ) )
                    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1228:1: ( rule__Element__Group_1_1__0 )
                    {
                     before(grammarAccess.getElementAccess().getGroup_1_1()); 
                    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1229:1: ( rule__Element__Group_1_1__0 )
                    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1229:2: rule__Element__Group_1_1__0
                    {
                    pushFollow(FOLLOW_rule__Element__Group_1_1__0_in_rule__Element__Alternatives_12577);
                    rule__Element__Group_1_1__0();
                    _fsp--;


                    }

                     after(grammarAccess.getElementAccess().getGroup_1_1()); 

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
    // $ANTLR end rule__Element__Alternatives_1


    // $ANTLR start rule__Multiplicity__Alternatives_3
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1238:1: rule__Multiplicity__Alternatives_3 : ( ( ( rule__Multiplicity__UpperAssignment_3_0 ) ) | ( ( rule__Multiplicity__UnboundedAssignment_3_1 ) ) );
    public final void rule__Multiplicity__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1242:1: ( ( ( rule__Multiplicity__UpperAssignment_3_0 ) ) | ( ( rule__Multiplicity__UnboundedAssignment_3_1 ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_INT) ) {
                alt8=1;
            }
            else if ( (LA8_0==49) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1238:1: rule__Multiplicity__Alternatives_3 : ( ( ( rule__Multiplicity__UpperAssignment_3_0 ) ) | ( ( rule__Multiplicity__UnboundedAssignment_3_1 ) ) );", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1243:1: ( ( rule__Multiplicity__UpperAssignment_3_0 ) )
                    {
                    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1243:1: ( ( rule__Multiplicity__UpperAssignment_3_0 ) )
                    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1244:1: ( rule__Multiplicity__UpperAssignment_3_0 )
                    {
                     before(grammarAccess.getMultiplicityAccess().getUpperAssignment_3_0()); 
                    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1245:1: ( rule__Multiplicity__UpperAssignment_3_0 )
                    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1245:2: rule__Multiplicity__UpperAssignment_3_0
                    {
                    pushFollow(FOLLOW_rule__Multiplicity__UpperAssignment_3_0_in_rule__Multiplicity__Alternatives_32610);
                    rule__Multiplicity__UpperAssignment_3_0();
                    _fsp--;


                    }

                     after(grammarAccess.getMultiplicityAccess().getUpperAssignment_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1249:6: ( ( rule__Multiplicity__UnboundedAssignment_3_1 ) )
                    {
                    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1249:6: ( ( rule__Multiplicity__UnboundedAssignment_3_1 ) )
                    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1250:1: ( rule__Multiplicity__UnboundedAssignment_3_1 )
                    {
                     before(grammarAccess.getMultiplicityAccess().getUnboundedAssignment_3_1()); 
                    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1251:1: ( rule__Multiplicity__UnboundedAssignment_3_1 )
                    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1251:2: rule__Multiplicity__UnboundedAssignment_3_1
                    {
                    pushFollow(FOLLOW_rule__Multiplicity__UnboundedAssignment_3_1_in_rule__Multiplicity__Alternatives_32628);
                    rule__Multiplicity__UnboundedAssignment_3_1();
                    _fsp--;


                    }

                     after(grammarAccess.getMultiplicityAccess().getUnboundedAssignment_3_1()); 

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
    // $ANTLR end rule__Multiplicity__Alternatives_3


    // $ANTLR start rule__NamedTypeReference__Alternatives
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1260:1: rule__NamedTypeReference__Alternatives : ( ( ruleTopLevelTypeReference ) | ( ruleBuiltinTypeReference ) );
    public final void rule__NamedTypeReference__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1264:1: ( ( ruleTopLevelTypeReference ) | ( ruleBuiltinTypeReference ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                alt9=1;
            }
            else if ( ((LA9_0>=12 && LA9_0<=22)) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1260:1: rule__NamedTypeReference__Alternatives : ( ( ruleTopLevelTypeReference ) | ( ruleBuiltinTypeReference ) );", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1265:1: ( ruleTopLevelTypeReference )
                    {
                    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1265:1: ( ruleTopLevelTypeReference )
                    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1266:1: ruleTopLevelTypeReference
                    {
                     before(grammarAccess.getNamedTypeReferenceAccess().getTopLevelTypeReferenceParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleTopLevelTypeReference_in_rule__NamedTypeReference__Alternatives2661);
                    ruleTopLevelTypeReference();
                    _fsp--;

                     after(grammarAccess.getNamedTypeReferenceAccess().getTopLevelTypeReferenceParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1271:6: ( ruleBuiltinTypeReference )
                    {
                    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1271:6: ( ruleBuiltinTypeReference )
                    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1272:1: ruleBuiltinTypeReference
                    {
                     before(grammarAccess.getNamedTypeReferenceAccess().getBuiltinTypeReferenceParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleBuiltinTypeReference_in_rule__NamedTypeReference__Alternatives2678);
                    ruleBuiltinTypeReference();
                    _fsp--;

                     after(grammarAccess.getNamedTypeReferenceAccess().getBuiltinTypeReferenceParserRuleCall_1()); 

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
    // $ANTLR end rule__NamedTypeReference__Alternatives


    // $ANTLR start rule__NonComplexTypeReference__Alternatives
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1282:1: rule__NonComplexTypeReference__Alternatives : ( ( ruleTopLevelSimpleTypeReference ) | ( ruleBuiltinTypeReference ) );
    public final void rule__NonComplexTypeReference__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1286:1: ( ( ruleTopLevelSimpleTypeReference ) | ( ruleBuiltinTypeReference ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                alt10=1;
            }
            else if ( ((LA10_0>=12 && LA10_0<=22)) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1282:1: rule__NonComplexTypeReference__Alternatives : ( ( ruleTopLevelSimpleTypeReference ) | ( ruleBuiltinTypeReference ) );", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1287:1: ( ruleTopLevelSimpleTypeReference )
                    {
                    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1287:1: ( ruleTopLevelSimpleTypeReference )
                    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1288:1: ruleTopLevelSimpleTypeReference
                    {
                     before(grammarAccess.getNonComplexTypeReferenceAccess().getTopLevelSimpleTypeReferenceParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleTopLevelSimpleTypeReference_in_rule__NonComplexTypeReference__Alternatives2710);
                    ruleTopLevelSimpleTypeReference();
                    _fsp--;

                     after(grammarAccess.getNonComplexTypeReferenceAccess().getTopLevelSimpleTypeReferenceParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1293:6: ( ruleBuiltinTypeReference )
                    {
                    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1293:6: ( ruleBuiltinTypeReference )
                    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1294:1: ruleBuiltinTypeReference
                    {
                     before(grammarAccess.getNonComplexTypeReferenceAccess().getBuiltinTypeReferenceParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleBuiltinTypeReference_in_rule__NonComplexTypeReference__Alternatives2727);
                    ruleBuiltinTypeReference();
                    _fsp--;

                     after(grammarAccess.getNonComplexTypeReferenceAccess().getBuiltinTypeReferenceParserRuleCall_1()); 

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
    // $ANTLR end rule__NonComplexTypeReference__Alternatives


    // $ANTLR start rule__TopLevelTypeReference__Alternatives
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1304:1: rule__TopLevelTypeReference__Alternatives : ( ( ruleDirectTopLevelTypeReference ) | ( ruleImportedTopLevelTypeReference ) );
    public final void rule__TopLevelTypeReference__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1308:1: ( ( ruleDirectTopLevelTypeReference ) | ( ruleImportedTopLevelTypeReference ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==EOF||LA11_1==RULE_ID||LA11_1==27||(LA11_1>=30 && LA11_1<=31)||LA11_1==35||LA11_1==43||(LA11_1>=46 && LA11_1<=48)) ) {
                    alt11=1;
                }
                else if ( (LA11_1==29) ) {
                    alt11=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1304:1: rule__TopLevelTypeReference__Alternatives : ( ( ruleDirectTopLevelTypeReference ) | ( ruleImportedTopLevelTypeReference ) );", 11, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1304:1: rule__TopLevelTypeReference__Alternatives : ( ( ruleDirectTopLevelTypeReference ) | ( ruleImportedTopLevelTypeReference ) );", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1309:1: ( ruleDirectTopLevelTypeReference )
                    {
                    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1309:1: ( ruleDirectTopLevelTypeReference )
                    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1310:1: ruleDirectTopLevelTypeReference
                    {
                     before(grammarAccess.getTopLevelTypeReferenceAccess().getDirectTopLevelTypeReferenceParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleDirectTopLevelTypeReference_in_rule__TopLevelTypeReference__Alternatives2759);
                    ruleDirectTopLevelTypeReference();
                    _fsp--;

                     after(grammarAccess.getTopLevelTypeReferenceAccess().getDirectTopLevelTypeReferenceParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1315:6: ( ruleImportedTopLevelTypeReference )
                    {
                    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1315:6: ( ruleImportedTopLevelTypeReference )
                    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1316:1: ruleImportedTopLevelTypeReference
                    {
                     before(grammarAccess.getTopLevelTypeReferenceAccess().getImportedTopLevelTypeReferenceParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleImportedTopLevelTypeReference_in_rule__TopLevelTypeReference__Alternatives2776);
                    ruleImportedTopLevelTypeReference();
                    _fsp--;

                     after(grammarAccess.getTopLevelTypeReferenceAccess().getImportedTopLevelTypeReferenceParserRuleCall_1()); 

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
    // $ANTLR end rule__TopLevelTypeReference__Alternatives


    // $ANTLR start rule__TopLevelComplexTypeReference__Alternatives
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1326:1: rule__TopLevelComplexTypeReference__Alternatives : ( ( ruleDirectTopLevelComplexTypeReference ) | ( ruleImportedTopLevelComplexTypeReference ) );
    public final void rule__TopLevelComplexTypeReference__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1330:1: ( ( ruleDirectTopLevelComplexTypeReference ) | ( ruleImportedTopLevelComplexTypeReference ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID) ) {
                int LA12_1 = input.LA(2);

                if ( (LA12_1==29) ) {
                    alt12=2;
                }
                else if ( (LA12_1==EOF||LA12_1==34) ) {
                    alt12=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1326:1: rule__TopLevelComplexTypeReference__Alternatives : ( ( ruleDirectTopLevelComplexTypeReference ) | ( ruleImportedTopLevelComplexTypeReference ) );", 12, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1326:1: rule__TopLevelComplexTypeReference__Alternatives : ( ( ruleDirectTopLevelComplexTypeReference ) | ( ruleImportedTopLevelComplexTypeReference ) );", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1331:1: ( ruleDirectTopLevelComplexTypeReference )
                    {
                    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1331:1: ( ruleDirectTopLevelComplexTypeReference )
                    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1332:1: ruleDirectTopLevelComplexTypeReference
                    {
                     before(grammarAccess.getTopLevelComplexTypeReferenceAccess().getDirectTopLevelComplexTypeReferenceParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleDirectTopLevelComplexTypeReference_in_rule__TopLevelComplexTypeReference__Alternatives2808);
                    ruleDirectTopLevelComplexTypeReference();
                    _fsp--;

                     after(grammarAccess.getTopLevelComplexTypeReferenceAccess().getDirectTopLevelComplexTypeReferenceParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1337:6: ( ruleImportedTopLevelComplexTypeReference )
                    {
                    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1337:6: ( ruleImportedTopLevelComplexTypeReference )
                    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1338:1: ruleImportedTopLevelComplexTypeReference
                    {
                     before(grammarAccess.getTopLevelComplexTypeReferenceAccess().getImportedTopLevelComplexTypeReferenceParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleImportedTopLevelComplexTypeReference_in_rule__TopLevelComplexTypeReference__Alternatives2825);
                    ruleImportedTopLevelComplexTypeReference();
                    _fsp--;

                     after(grammarAccess.getTopLevelComplexTypeReferenceAccess().getImportedTopLevelComplexTypeReferenceParserRuleCall_1()); 

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
    // $ANTLR end rule__TopLevelComplexTypeReference__Alternatives


    // $ANTLR start rule__TopLevelSimpleTypeReference__Alternatives
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1348:1: rule__TopLevelSimpleTypeReference__Alternatives : ( ( ruleDirectTopLevelSimpleTypeReference ) | ( ruleImportedTopLevelSimpleTypeReference ) );
    public final void rule__TopLevelSimpleTypeReference__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1352:1: ( ( ruleDirectTopLevelSimpleTypeReference ) | ( ruleImportedTopLevelSimpleTypeReference ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID) ) {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==EOF||LA13_1==RULE_ID||LA13_1==32||LA13_1==35||LA13_1==46||LA13_1==48) ) {
                    alt13=1;
                }
                else if ( (LA13_1==29) ) {
                    alt13=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1348:1: rule__TopLevelSimpleTypeReference__Alternatives : ( ( ruleDirectTopLevelSimpleTypeReference ) | ( ruleImportedTopLevelSimpleTypeReference ) );", 13, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1348:1: rule__TopLevelSimpleTypeReference__Alternatives : ( ( ruleDirectTopLevelSimpleTypeReference ) | ( ruleImportedTopLevelSimpleTypeReference ) );", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1353:1: ( ruleDirectTopLevelSimpleTypeReference )
                    {
                    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1353:1: ( ruleDirectTopLevelSimpleTypeReference )
                    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1354:1: ruleDirectTopLevelSimpleTypeReference
                    {
                     before(grammarAccess.getTopLevelSimpleTypeReferenceAccess().getDirectTopLevelSimpleTypeReferenceParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleDirectTopLevelSimpleTypeReference_in_rule__TopLevelSimpleTypeReference__Alternatives2857);
                    ruleDirectTopLevelSimpleTypeReference();
                    _fsp--;

                     after(grammarAccess.getTopLevelSimpleTypeReferenceAccess().getDirectTopLevelSimpleTypeReferenceParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1359:6: ( ruleImportedTopLevelSimpleTypeReference )
                    {
                    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1359:6: ( ruleImportedTopLevelSimpleTypeReference )
                    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1360:1: ruleImportedTopLevelSimpleTypeReference
                    {
                     before(grammarAccess.getTopLevelSimpleTypeReferenceAccess().getImportedTopLevelSimpleTypeReferenceParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleImportedTopLevelSimpleTypeReference_in_rule__TopLevelSimpleTypeReference__Alternatives2874);
                    ruleImportedTopLevelSimpleTypeReference();
                    _fsp--;

                     after(grammarAccess.getTopLevelSimpleTypeReferenceAccess().getImportedTopLevelSimpleTypeReferenceParserRuleCall_1()); 

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
    // $ANTLR end rule__TopLevelSimpleTypeReference__Alternatives


    // $ANTLR start rule__EmbeddedType__Alternatives
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1371:1: rule__EmbeddedType__Alternatives : ( ( ruleEmbeddedComplexType ) | ( ruleEmbeddedSimpleType ) );
    public final void rule__EmbeddedType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1375:1: ( ( ruleEmbeddedComplexType ) | ( ruleEmbeddedSimpleType ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==43) ) {
                alt14=1;
            }
            else if ( (LA14_0==30) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1371:1: rule__EmbeddedType__Alternatives : ( ( ruleEmbeddedComplexType ) | ( ruleEmbeddedSimpleType ) );", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1376:1: ( ruleEmbeddedComplexType )
                    {
                    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1376:1: ( ruleEmbeddedComplexType )
                    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1377:1: ruleEmbeddedComplexType
                    {
                     before(grammarAccess.getEmbeddedTypeAccess().getEmbeddedComplexTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleEmbeddedComplexType_in_rule__EmbeddedType__Alternatives2907);
                    ruleEmbeddedComplexType();
                    _fsp--;

                     after(grammarAccess.getEmbeddedTypeAccess().getEmbeddedComplexTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1382:6: ( ruleEmbeddedSimpleType )
                    {
                    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1382:6: ( ruleEmbeddedSimpleType )
                    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1383:1: ruleEmbeddedSimpleType
                    {
                     before(grammarAccess.getEmbeddedTypeAccess().getEmbeddedSimpleTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleEmbeddedSimpleType_in_rule__EmbeddedType__Alternatives2924);
                    ruleEmbeddedSimpleType();
                    _fsp--;

                     after(grammarAccess.getEmbeddedTypeAccess().getEmbeddedSimpleTypeParserRuleCall_1()); 

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
    // $ANTLR end rule__EmbeddedType__Alternatives


    // $ANTLR start rule__BuiltinType__Alternatives
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1395:1: rule__BuiltinType__Alternatives : ( ( ( 'duration' ) ) | ( ( 'dateTime' ) ) | ( ( 'time' ) ) | ( ( 'date' ) ) | ( ( 'string' ) ) | ( ( 'decimal' ) ) | ( ( 'integer' ) ) | ( ( 'positiveInteger' ) ) | ( ( 'nonNegativeInteger' ) ) | ( ( 'token' ) ) | ( ( 'base64Binary' ) ) );
    public final void rule__BuiltinType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1399:1: ( ( ( 'duration' ) ) | ( ( 'dateTime' ) ) | ( ( 'time' ) ) | ( ( 'date' ) ) | ( ( 'string' ) ) | ( ( 'decimal' ) ) | ( ( 'integer' ) ) | ( ( 'positiveInteger' ) ) | ( ( 'nonNegativeInteger' ) ) | ( ( 'token' ) ) | ( ( 'base64Binary' ) ) )
            int alt15=11;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt15=1;
                }
                break;
            case 13:
                {
                alt15=2;
                }
                break;
            case 14:
                {
                alt15=3;
                }
                break;
            case 15:
                {
                alt15=4;
                }
                break;
            case 16:
                {
                alt15=5;
                }
                break;
            case 17:
                {
                alt15=6;
                }
                break;
            case 18:
                {
                alt15=7;
                }
                break;
            case 19:
                {
                alt15=8;
                }
                break;
            case 20:
                {
                alt15=9;
                }
                break;
            case 21:
                {
                alt15=10;
                }
                break;
            case 22:
                {
                alt15=11;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1395:1: rule__BuiltinType__Alternatives : ( ( ( 'duration' ) ) | ( ( 'dateTime' ) ) | ( ( 'time' ) ) | ( ( 'date' ) ) | ( ( 'string' ) ) | ( ( 'decimal' ) ) | ( ( 'integer' ) ) | ( ( 'positiveInteger' ) ) | ( ( 'nonNegativeInteger' ) ) | ( ( 'token' ) ) | ( ( 'base64Binary' ) ) );", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1400:1: ( ( 'duration' ) )
                    {
                    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1400:1: ( ( 'duration' ) )
                    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1401:1: ( 'duration' )
                    {
                     before(grammarAccess.getBuiltinTypeAccess().getDurationEnumLiteralDeclaration_0()); 
                    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1402:1: ( 'duration' )
                    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1402:3: 'duration'
                    {
                    match(input,12,FOLLOW_12_in_rule__BuiltinType__Alternatives2959); 

                    }

                     after(grammarAccess.getBuiltinTypeAccess().getDurationEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1407:6: ( ( 'dateTime' ) )
                    {
                    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1407:6: ( ( 'dateTime' ) )
                    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1408:1: ( 'dateTime' )
                    {
                     before(grammarAccess.getBuiltinTypeAccess().getDateTimeEnumLiteralDeclaration_1()); 
                    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1409:1: ( 'dateTime' )
                    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1409:3: 'dateTime'
                    {
                    match(input,13,FOLLOW_13_in_rule__BuiltinType__Alternatives2980); 

                    }

                     after(grammarAccess.getBuiltinTypeAccess().getDateTimeEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1414:6: ( ( 'time' ) )
                    {
                    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1414:6: ( ( 'time' ) )
                    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1415:1: ( 'time' )
                    {
                     before(grammarAccess.getBuiltinTypeAccess().getTimeEnumLiteralDeclaration_2()); 
                    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1416:1: ( 'time' )
                    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1416:3: 'time'
                    {
                    match(input,14,FOLLOW_14_in_rule__BuiltinType__Alternatives3001); 

                    }

                     after(grammarAccess.getBuiltinTypeAccess().getTimeEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1421:6: ( ( 'date' ) )
                    {
                    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1421:6: ( ( 'date' ) )
                    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1422:1: ( 'date' )
                    {
                     before(grammarAccess.getBuiltinTypeAccess().getDateEnumLiteralDeclaration_3()); 
                    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1423:1: ( 'date' )
                    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1423:3: 'date'
                    {
                    match(input,15,FOLLOW_15_in_rule__BuiltinType__Alternatives3022); 

                    }

                     after(grammarAccess.getBuiltinTypeAccess().getDateEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1428:6: ( ( 'string' ) )
                    {
                    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1428:6: ( ( 'string' ) )
                    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1429:1: ( 'string' )
                    {
                     before(grammarAccess.getBuiltinTypeAccess().getStringEnumLiteralDeclaration_4()); 
                    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1430:1: ( 'string' )
                    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1430:3: 'string'
                    {
                    match(input,16,FOLLOW_16_in_rule__BuiltinType__Alternatives3043); 

                    }

                     after(grammarAccess.getBuiltinTypeAccess().getStringEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1435:6: ( ( 'decimal' ) )
                    {
                    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1435:6: ( ( 'decimal' ) )
                    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1436:1: ( 'decimal' )
                    {
                     before(grammarAccess.getBuiltinTypeAccess().getDecimalEnumLiteralDeclaration_5()); 
                    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1437:1: ( 'decimal' )
                    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1437:3: 'decimal'
                    {
                    match(input,17,FOLLOW_17_in_rule__BuiltinType__Alternatives3064); 

                    }

                     after(grammarAccess.getBuiltinTypeAccess().getDecimalEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1442:6: ( ( 'integer' ) )
                    {
                    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1442:6: ( ( 'integer' ) )
                    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1443:1: ( 'integer' )
                    {
                     before(grammarAccess.getBuiltinTypeAccess().getIntegerEnumLiteralDeclaration_6()); 
                    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1444:1: ( 'integer' )
                    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1444:3: 'integer'
                    {
                    match(input,18,FOLLOW_18_in_rule__BuiltinType__Alternatives3085); 

                    }

                     after(grammarAccess.getBuiltinTypeAccess().getIntegerEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1449:6: ( ( 'positiveInteger' ) )
                    {
                    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1449:6: ( ( 'positiveInteger' ) )
                    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1450:1: ( 'positiveInteger' )
                    {
                     before(grammarAccess.getBuiltinTypeAccess().getPositiveIntegerEnumLiteralDeclaration_7()); 
                    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1451:1: ( 'positiveInteger' )
                    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1451:3: 'positiveInteger'
                    {
                    match(input,19,FOLLOW_19_in_rule__BuiltinType__Alternatives3106); 

                    }

                     after(grammarAccess.getBuiltinTypeAccess().getPositiveIntegerEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1456:6: ( ( 'nonNegativeInteger' ) )
                    {
                    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1456:6: ( ( 'nonNegativeInteger' ) )
                    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1457:1: ( 'nonNegativeInteger' )
                    {
                     before(grammarAccess.getBuiltinTypeAccess().getNonNegativeIntegerEnumLiteralDeclaration_8()); 
                    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1458:1: ( 'nonNegativeInteger' )
                    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1458:3: 'nonNegativeInteger'
                    {
                    match(input,20,FOLLOW_20_in_rule__BuiltinType__Alternatives3127); 

                    }

                     after(grammarAccess.getBuiltinTypeAccess().getNonNegativeIntegerEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1463:6: ( ( 'token' ) )
                    {
                    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1463:6: ( ( 'token' ) )
                    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1464:1: ( 'token' )
                    {
                     before(grammarAccess.getBuiltinTypeAccess().getTokenEnumLiteralDeclaration_9()); 
                    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1465:1: ( 'token' )
                    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1465:3: 'token'
                    {
                    match(input,21,FOLLOW_21_in_rule__BuiltinType__Alternatives3148); 

                    }

                     after(grammarAccess.getBuiltinTypeAccess().getTokenEnumLiteralDeclaration_9()); 

                    }


                    }
                    break;
                case 11 :
                    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1470:6: ( ( 'base64Binary' ) )
                    {
                    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1470:6: ( ( 'base64Binary' ) )
                    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1471:1: ( 'base64Binary' )
                    {
                     before(grammarAccess.getBuiltinTypeAccess().getBase64BinaryEnumLiteralDeclaration_10()); 
                    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1472:1: ( 'base64Binary' )
                    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1472:3: 'base64Binary'
                    {
                    match(input,22,FOLLOW_22_in_rule__BuiltinType__Alternatives3169); 

                    }

                     after(grammarAccess.getBuiltinTypeAccess().getBase64BinaryEnumLiteralDeclaration_10()); 

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
    // $ANTLR end rule__BuiltinType__Alternatives


    // $ANTLR start rule__Schema__Group__0
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1484:1: rule__Schema__Group__0 : rule__Schema__Group__0__Impl rule__Schema__Group__1 ;
    public final void rule__Schema__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1488:1: ( rule__Schema__Group__0__Impl rule__Schema__Group__1 )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1489:2: rule__Schema__Group__0__Impl rule__Schema__Group__1
            {
            pushFollow(FOLLOW_rule__Schema__Group__0__Impl_in_rule__Schema__Group__03202);
            rule__Schema__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Schema__Group__1_in_rule__Schema__Group__03205);
            rule__Schema__Group__1();
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
    // $ANTLR end rule__Schema__Group__0


    // $ANTLR start rule__Schema__Group__0__Impl
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1496:1: rule__Schema__Group__0__Impl : ( 'schema' ) ;
    public final void rule__Schema__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1500:1: ( ( 'schema' ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1501:1: ( 'schema' )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1501:1: ( 'schema' )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1502:1: 'schema'
            {
             before(grammarAccess.getSchemaAccess().getSchemaKeyword_0()); 
            match(input,23,FOLLOW_23_in_rule__Schema__Group__0__Impl3233); 
             after(grammarAccess.getSchemaAccess().getSchemaKeyword_0()); 

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
    // $ANTLR end rule__Schema__Group__0__Impl


    // $ANTLR start rule__Schema__Group__1
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1515:1: rule__Schema__Group__1 : rule__Schema__Group__1__Impl rule__Schema__Group__2 ;
    public final void rule__Schema__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1519:1: ( rule__Schema__Group__1__Impl rule__Schema__Group__2 )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1520:2: rule__Schema__Group__1__Impl rule__Schema__Group__2
            {
            pushFollow(FOLLOW_rule__Schema__Group__1__Impl_in_rule__Schema__Group__13264);
            rule__Schema__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Schema__Group__2_in_rule__Schema__Group__13267);
            rule__Schema__Group__2();
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
    // $ANTLR end rule__Schema__Group__1


    // $ANTLR start rule__Schema__Group__1__Impl
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1527:1: rule__Schema__Group__1__Impl : ( ( rule__Schema__NameAssignment_1 ) ) ;
    public final void rule__Schema__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1531:1: ( ( ( rule__Schema__NameAssignment_1 ) ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1532:1: ( ( rule__Schema__NameAssignment_1 ) )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1532:1: ( ( rule__Schema__NameAssignment_1 ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1533:1: ( rule__Schema__NameAssignment_1 )
            {
             before(grammarAccess.getSchemaAccess().getNameAssignment_1()); 
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1534:1: ( rule__Schema__NameAssignment_1 )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1534:2: rule__Schema__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Schema__NameAssignment_1_in_rule__Schema__Group__1__Impl3294);
            rule__Schema__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getSchemaAccess().getNameAssignment_1()); 

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
    // $ANTLR end rule__Schema__Group__1__Impl


    // $ANTLR start rule__Schema__Group__2
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1544:1: rule__Schema__Group__2 : rule__Schema__Group__2__Impl rule__Schema__Group__3 ;
    public final void rule__Schema__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1548:1: ( rule__Schema__Group__2__Impl rule__Schema__Group__3 )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1549:2: rule__Schema__Group__2__Impl rule__Schema__Group__3
            {
            pushFollow(FOLLOW_rule__Schema__Group__2__Impl_in_rule__Schema__Group__23324);
            rule__Schema__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Schema__Group__3_in_rule__Schema__Group__23327);
            rule__Schema__Group__3();
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
    // $ANTLR end rule__Schema__Group__2


    // $ANTLR start rule__Schema__Group__2__Impl
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1556:1: rule__Schema__Group__2__Impl : ( 'namespace' ) ;
    public final void rule__Schema__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1560:1: ( ( 'namespace' ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1561:1: ( 'namespace' )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1561:1: ( 'namespace' )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1562:1: 'namespace'
            {
             before(grammarAccess.getSchemaAccess().getNamespaceKeyword_2()); 
            match(input,24,FOLLOW_24_in_rule__Schema__Group__2__Impl3355); 
             after(grammarAccess.getSchemaAccess().getNamespaceKeyword_2()); 

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
    // $ANTLR end rule__Schema__Group__2__Impl


    // $ANTLR start rule__Schema__Group__3
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1575:1: rule__Schema__Group__3 : rule__Schema__Group__3__Impl rule__Schema__Group__4 ;
    public final void rule__Schema__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1579:1: ( rule__Schema__Group__3__Impl rule__Schema__Group__4 )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1580:2: rule__Schema__Group__3__Impl rule__Schema__Group__4
            {
            pushFollow(FOLLOW_rule__Schema__Group__3__Impl_in_rule__Schema__Group__33386);
            rule__Schema__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Schema__Group__4_in_rule__Schema__Group__33389);
            rule__Schema__Group__4();
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
    // $ANTLR end rule__Schema__Group__3


    // $ANTLR start rule__Schema__Group__3__Impl
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1587:1: rule__Schema__Group__3__Impl : ( ( rule__Schema__NsURIAssignment_3 ) ) ;
    public final void rule__Schema__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1591:1: ( ( ( rule__Schema__NsURIAssignment_3 ) ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1592:1: ( ( rule__Schema__NsURIAssignment_3 ) )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1592:1: ( ( rule__Schema__NsURIAssignment_3 ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1593:1: ( rule__Schema__NsURIAssignment_3 )
            {
             before(grammarAccess.getSchemaAccess().getNsURIAssignment_3()); 
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1594:1: ( rule__Schema__NsURIAssignment_3 )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1594:2: rule__Schema__NsURIAssignment_3
            {
            pushFollow(FOLLOW_rule__Schema__NsURIAssignment_3_in_rule__Schema__Group__3__Impl3416);
            rule__Schema__NsURIAssignment_3();
            _fsp--;


            }

             after(grammarAccess.getSchemaAccess().getNsURIAssignment_3()); 

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
    // $ANTLR end rule__Schema__Group__3__Impl


    // $ANTLR start rule__Schema__Group__4
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1604:1: rule__Schema__Group__4 : rule__Schema__Group__4__Impl rule__Schema__Group__5 ;
    public final void rule__Schema__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1608:1: ( rule__Schema__Group__4__Impl rule__Schema__Group__5 )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1609:2: rule__Schema__Group__4__Impl rule__Schema__Group__5
            {
            pushFollow(FOLLOW_rule__Schema__Group__4__Impl_in_rule__Schema__Group__43446);
            rule__Schema__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Schema__Group__5_in_rule__Schema__Group__43449);
            rule__Schema__Group__5();
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
    // $ANTLR end rule__Schema__Group__4


    // $ANTLR start rule__Schema__Group__4__Impl
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1616:1: rule__Schema__Group__4__Impl : ( ( rule__Schema__ImportsAssignment_4 )* ) ;
    public final void rule__Schema__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1620:1: ( ( ( rule__Schema__ImportsAssignment_4 )* ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1621:1: ( ( rule__Schema__ImportsAssignment_4 )* )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1621:1: ( ( rule__Schema__ImportsAssignment_4 )* )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1622:1: ( rule__Schema__ImportsAssignment_4 )*
            {
             before(grammarAccess.getSchemaAccess().getImportsAssignment_4()); 
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1623:1: ( rule__Schema__ImportsAssignment_4 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==25) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1623:2: rule__Schema__ImportsAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Schema__ImportsAssignment_4_in_rule__Schema__Group__4__Impl3476);
            	    rule__Schema__ImportsAssignment_4();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getSchemaAccess().getImportsAssignment_4()); 

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
    // $ANTLR end rule__Schema__Group__4__Impl


    // $ANTLR start rule__Schema__Group__5
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1633:1: rule__Schema__Group__5 : rule__Schema__Group__5__Impl ;
    public final void rule__Schema__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1637:1: ( rule__Schema__Group__5__Impl )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1638:2: rule__Schema__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Schema__Group__5__Impl_in_rule__Schema__Group__53507);
            rule__Schema__Group__5__Impl();
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
    // $ANTLR end rule__Schema__Group__5


    // $ANTLR start rule__Schema__Group__5__Impl
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1644:1: rule__Schema__Group__5__Impl : ( ( rule__Schema__DefinitionsAssignment_5 )* ) ;
    public final void rule__Schema__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1648:1: ( ( ( rule__Schema__DefinitionsAssignment_5 )* ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1649:1: ( ( rule__Schema__DefinitionsAssignment_5 )* )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1649:1: ( ( rule__Schema__DefinitionsAssignment_5 )* )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1650:1: ( rule__Schema__DefinitionsAssignment_5 )*
            {
             before(grammarAccess.getSchemaAccess().getDefinitionsAssignment_5()); 
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1651:1: ( rule__Schema__DefinitionsAssignment_5 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==27||LA17_0==30||LA17_0==43||LA17_0==47) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1651:2: rule__Schema__DefinitionsAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__Schema__DefinitionsAssignment_5_in_rule__Schema__Group__5__Impl3534);
            	    rule__Schema__DefinitionsAssignment_5();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getSchemaAccess().getDefinitionsAssignment_5()); 

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
    // $ANTLR end rule__Schema__Group__5__Impl


    // $ANTLR start rule__Import__Group__0
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1673:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1677:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1678:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__03577);
            rule__Import__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Import__Group__1_in_rule__Import__Group__03580);
            rule__Import__Group__1();
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
    // $ANTLR end rule__Import__Group__0


    // $ANTLR start rule__Import__Group__0__Impl
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1685:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1689:1: ( ( 'import' ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1690:1: ( 'import' )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1690:1: ( 'import' )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1691:1: 'import'
            {
             before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            match(input,25,FOLLOW_25_in_rule__Import__Group__0__Impl3608); 
             after(grammarAccess.getImportAccess().getImportKeyword_0()); 

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
    // $ANTLR end rule__Import__Group__0__Impl


    // $ANTLR start rule__Import__Group__1
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1704:1: rule__Import__Group__1 : rule__Import__Group__1__Impl rule__Import__Group__2 ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1708:1: ( rule__Import__Group__1__Impl rule__Import__Group__2 )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1709:2: rule__Import__Group__1__Impl rule__Import__Group__2
            {
            pushFollow(FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__13639);
            rule__Import__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Import__Group__2_in_rule__Import__Group__13642);
            rule__Import__Group__2();
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
    // $ANTLR end rule__Import__Group__1


    // $ANTLR start rule__Import__Group__1__Impl
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1716:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportURIAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1720:1: ( ( ( rule__Import__ImportURIAssignment_1 ) ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1721:1: ( ( rule__Import__ImportURIAssignment_1 ) )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1721:1: ( ( rule__Import__ImportURIAssignment_1 ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1722:1: ( rule__Import__ImportURIAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getImportURIAssignment_1()); 
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1723:1: ( rule__Import__ImportURIAssignment_1 )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1723:2: rule__Import__ImportURIAssignment_1
            {
            pushFollow(FOLLOW_rule__Import__ImportURIAssignment_1_in_rule__Import__Group__1__Impl3669);
            rule__Import__ImportURIAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getImportAccess().getImportURIAssignment_1()); 

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
    // $ANTLR end rule__Import__Group__1__Impl


    // $ANTLR start rule__Import__Group__2
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1733:1: rule__Import__Group__2 : rule__Import__Group__2__Impl rule__Import__Group__3 ;
    public final void rule__Import__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1737:1: ( rule__Import__Group__2__Impl rule__Import__Group__3 )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1738:2: rule__Import__Group__2__Impl rule__Import__Group__3
            {
            pushFollow(FOLLOW_rule__Import__Group__2__Impl_in_rule__Import__Group__23699);
            rule__Import__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Import__Group__3_in_rule__Import__Group__23702);
            rule__Import__Group__3();
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
    // $ANTLR end rule__Import__Group__2


    // $ANTLR start rule__Import__Group__2__Impl
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1745:1: rule__Import__Group__2__Impl : ( 'as' ) ;
    public final void rule__Import__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1749:1: ( ( 'as' ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1750:1: ( 'as' )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1750:1: ( 'as' )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1751:1: 'as'
            {
             before(grammarAccess.getImportAccess().getAsKeyword_2()); 
            match(input,26,FOLLOW_26_in_rule__Import__Group__2__Impl3730); 
             after(grammarAccess.getImportAccess().getAsKeyword_2()); 

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
    // $ANTLR end rule__Import__Group__2__Impl


    // $ANTLR start rule__Import__Group__3
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1764:1: rule__Import__Group__3 : rule__Import__Group__3__Impl ;
    public final void rule__Import__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1768:1: ( rule__Import__Group__3__Impl )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1769:2: rule__Import__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Import__Group__3__Impl_in_rule__Import__Group__33761);
            rule__Import__Group__3__Impl();
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
    // $ANTLR end rule__Import__Group__3


    // $ANTLR start rule__Import__Group__3__Impl
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1775:1: rule__Import__Group__3__Impl : ( ( rule__Import__NsPrefixAssignment_3 ) ) ;
    public final void rule__Import__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1779:1: ( ( ( rule__Import__NsPrefixAssignment_3 ) ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1780:1: ( ( rule__Import__NsPrefixAssignment_3 ) )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1780:1: ( ( rule__Import__NsPrefixAssignment_3 ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1781:1: ( rule__Import__NsPrefixAssignment_3 )
            {
             before(grammarAccess.getImportAccess().getNsPrefixAssignment_3()); 
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1782:1: ( rule__Import__NsPrefixAssignment_3 )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1782:2: rule__Import__NsPrefixAssignment_3
            {
            pushFollow(FOLLOW_rule__Import__NsPrefixAssignment_3_in_rule__Import__Group__3__Impl3788);
            rule__Import__NsPrefixAssignment_3();
            _fsp--;


            }

             after(grammarAccess.getImportAccess().getNsPrefixAssignment_3()); 

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
    // $ANTLR end rule__Import__Group__3__Impl


    // $ANTLR start rule__TopLevelElement__Group__0
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1800:1: rule__TopLevelElement__Group__0 : rule__TopLevelElement__Group__0__Impl rule__TopLevelElement__Group__1 ;
    public final void rule__TopLevelElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1804:1: ( rule__TopLevelElement__Group__0__Impl rule__TopLevelElement__Group__1 )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1805:2: rule__TopLevelElement__Group__0__Impl rule__TopLevelElement__Group__1
            {
            pushFollow(FOLLOW_rule__TopLevelElement__Group__0__Impl_in_rule__TopLevelElement__Group__03826);
            rule__TopLevelElement__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TopLevelElement__Group__1_in_rule__TopLevelElement__Group__03829);
            rule__TopLevelElement__Group__1();
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
    // $ANTLR end rule__TopLevelElement__Group__0


    // $ANTLR start rule__TopLevelElement__Group__0__Impl
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1812:1: rule__TopLevelElement__Group__0__Impl : ( 'element' ) ;
    public final void rule__TopLevelElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1816:1: ( ( 'element' ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1817:1: ( 'element' )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1817:1: ( 'element' )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1818:1: 'element'
            {
             before(grammarAccess.getTopLevelElementAccess().getElementKeyword_0()); 
            match(input,27,FOLLOW_27_in_rule__TopLevelElement__Group__0__Impl3857); 
             after(grammarAccess.getTopLevelElementAccess().getElementKeyword_0()); 

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
    // $ANTLR end rule__TopLevelElement__Group__0__Impl


    // $ANTLR start rule__TopLevelElement__Group__1
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1831:1: rule__TopLevelElement__Group__1 : rule__TopLevelElement__Group__1__Impl rule__TopLevelElement__Group__2 ;
    public final void rule__TopLevelElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1835:1: ( rule__TopLevelElement__Group__1__Impl rule__TopLevelElement__Group__2 )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1836:2: rule__TopLevelElement__Group__1__Impl rule__TopLevelElement__Group__2
            {
            pushFollow(FOLLOW_rule__TopLevelElement__Group__1__Impl_in_rule__TopLevelElement__Group__13888);
            rule__TopLevelElement__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TopLevelElement__Group__2_in_rule__TopLevelElement__Group__13891);
            rule__TopLevelElement__Group__2();
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
    // $ANTLR end rule__TopLevelElement__Group__1


    // $ANTLR start rule__TopLevelElement__Group__1__Impl
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1843:1: rule__TopLevelElement__Group__1__Impl : ( ( rule__TopLevelElement__NameAssignment_1 ) ) ;
    public final void rule__TopLevelElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1847:1: ( ( ( rule__TopLevelElement__NameAssignment_1 ) ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1848:1: ( ( rule__TopLevelElement__NameAssignment_1 ) )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1848:1: ( ( rule__TopLevelElement__NameAssignment_1 ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1849:1: ( rule__TopLevelElement__NameAssignment_1 )
            {
             before(grammarAccess.getTopLevelElementAccess().getNameAssignment_1()); 
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1850:1: ( rule__TopLevelElement__NameAssignment_1 )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1850:2: rule__TopLevelElement__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__TopLevelElement__NameAssignment_1_in_rule__TopLevelElement__Group__1__Impl3918);
            rule__TopLevelElement__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getTopLevelElementAccess().getNameAssignment_1()); 

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
    // $ANTLR end rule__TopLevelElement__Group__1__Impl


    // $ANTLR start rule__TopLevelElement__Group__2
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1860:1: rule__TopLevelElement__Group__2 : rule__TopLevelElement__Group__2__Impl ;
    public final void rule__TopLevelElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1864:1: ( rule__TopLevelElement__Group__2__Impl )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1865:2: rule__TopLevelElement__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__TopLevelElement__Group__2__Impl_in_rule__TopLevelElement__Group__23948);
            rule__TopLevelElement__Group__2__Impl();
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
    // $ANTLR end rule__TopLevelElement__Group__2


    // $ANTLR start rule__TopLevelElement__Group__2__Impl
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1871:1: rule__TopLevelElement__Group__2__Impl : ( ( rule__TopLevelElement__Alternatives_2 ) ) ;
    public final void rule__TopLevelElement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1875:1: ( ( ( rule__TopLevelElement__Alternatives_2 ) ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1876:1: ( ( rule__TopLevelElement__Alternatives_2 ) )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1876:1: ( ( rule__TopLevelElement__Alternatives_2 ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1877:1: ( rule__TopLevelElement__Alternatives_2 )
            {
             before(grammarAccess.getTopLevelElementAccess().getAlternatives_2()); 
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1878:1: ( rule__TopLevelElement__Alternatives_2 )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1878:2: rule__TopLevelElement__Alternatives_2
            {
            pushFollow(FOLLOW_rule__TopLevelElement__Alternatives_2_in_rule__TopLevelElement__Group__2__Impl3975);
            rule__TopLevelElement__Alternatives_2();
            _fsp--;


            }

             after(grammarAccess.getTopLevelElementAccess().getAlternatives_2()); 

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
    // $ANTLR end rule__TopLevelElement__Group__2__Impl


    // $ANTLR start rule__TopLevelElement__Group_2_0__0
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1894:1: rule__TopLevelElement__Group_2_0__0 : rule__TopLevelElement__Group_2_0__0__Impl rule__TopLevelElement__Group_2_0__1 ;
    public final void rule__TopLevelElement__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1898:1: ( rule__TopLevelElement__Group_2_0__0__Impl rule__TopLevelElement__Group_2_0__1 )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1899:2: rule__TopLevelElement__Group_2_0__0__Impl rule__TopLevelElement__Group_2_0__1
            {
            pushFollow(FOLLOW_rule__TopLevelElement__Group_2_0__0__Impl_in_rule__TopLevelElement__Group_2_0__04011);
            rule__TopLevelElement__Group_2_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TopLevelElement__Group_2_0__1_in_rule__TopLevelElement__Group_2_0__04014);
            rule__TopLevelElement__Group_2_0__1();
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
    // $ANTLR end rule__TopLevelElement__Group_2_0__0


    // $ANTLR start rule__TopLevelElement__Group_2_0__0__Impl
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1906:1: rule__TopLevelElement__Group_2_0__0__Impl : ( '->' ) ;
    public final void rule__TopLevelElement__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1910:1: ( ( '->' ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1911:1: ( '->' )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1911:1: ( '->' )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1912:1: '->'
            {
             before(grammarAccess.getTopLevelElementAccess().getHyphenMinusGreaterThanSignKeyword_2_0_0()); 
            match(input,28,FOLLOW_28_in_rule__TopLevelElement__Group_2_0__0__Impl4042); 
             after(grammarAccess.getTopLevelElementAccess().getHyphenMinusGreaterThanSignKeyword_2_0_0()); 

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
    // $ANTLR end rule__TopLevelElement__Group_2_0__0__Impl


    // $ANTLR start rule__TopLevelElement__Group_2_0__1
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1925:1: rule__TopLevelElement__Group_2_0__1 : rule__TopLevelElement__Group_2_0__1__Impl ;
    public final void rule__TopLevelElement__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1929:1: ( rule__TopLevelElement__Group_2_0__1__Impl )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1930:2: rule__TopLevelElement__Group_2_0__1__Impl
            {
            pushFollow(FOLLOW_rule__TopLevelElement__Group_2_0__1__Impl_in_rule__TopLevelElement__Group_2_0__14073);
            rule__TopLevelElement__Group_2_0__1__Impl();
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
    // $ANTLR end rule__TopLevelElement__Group_2_0__1


    // $ANTLR start rule__TopLevelElement__Group_2_0__1__Impl
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1936:1: rule__TopLevelElement__Group_2_0__1__Impl : ( ( rule__TopLevelElement__TypeRefAssignment_2_0_1 ) ) ;
    public final void rule__TopLevelElement__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1940:1: ( ( ( rule__TopLevelElement__TypeRefAssignment_2_0_1 ) ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1941:1: ( ( rule__TopLevelElement__TypeRefAssignment_2_0_1 ) )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1941:1: ( ( rule__TopLevelElement__TypeRefAssignment_2_0_1 ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1942:1: ( rule__TopLevelElement__TypeRefAssignment_2_0_1 )
            {
             before(grammarAccess.getTopLevelElementAccess().getTypeRefAssignment_2_0_1()); 
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1943:1: ( rule__TopLevelElement__TypeRefAssignment_2_0_1 )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1943:2: rule__TopLevelElement__TypeRefAssignment_2_0_1
            {
            pushFollow(FOLLOW_rule__TopLevelElement__TypeRefAssignment_2_0_1_in_rule__TopLevelElement__Group_2_0__1__Impl4100);
            rule__TopLevelElement__TypeRefAssignment_2_0_1();
            _fsp--;


            }

             after(grammarAccess.getTopLevelElementAccess().getTypeRefAssignment_2_0_1()); 

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
    // $ANTLR end rule__TopLevelElement__Group_2_0__1__Impl


    // $ANTLR start rule__TopLevelElement__Group_2_1__0
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1957:1: rule__TopLevelElement__Group_2_1__0 : rule__TopLevelElement__Group_2_1__0__Impl rule__TopLevelElement__Group_2_1__1 ;
    public final void rule__TopLevelElement__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1961:1: ( rule__TopLevelElement__Group_2_1__0__Impl rule__TopLevelElement__Group_2_1__1 )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1962:2: rule__TopLevelElement__Group_2_1__0__Impl rule__TopLevelElement__Group_2_1__1
            {
            pushFollow(FOLLOW_rule__TopLevelElement__Group_2_1__0__Impl_in_rule__TopLevelElement__Group_2_1__04134);
            rule__TopLevelElement__Group_2_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TopLevelElement__Group_2_1__1_in_rule__TopLevelElement__Group_2_1__04137);
            rule__TopLevelElement__Group_2_1__1();
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
    // $ANTLR end rule__TopLevelElement__Group_2_1__0


    // $ANTLR start rule__TopLevelElement__Group_2_1__0__Impl
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1969:1: rule__TopLevelElement__Group_2_1__0__Impl : ( ':' ) ;
    public final void rule__TopLevelElement__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1973:1: ( ( ':' ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1974:1: ( ':' )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1974:1: ( ':' )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1975:1: ':'
            {
             before(grammarAccess.getTopLevelElementAccess().getColonKeyword_2_1_0()); 
            match(input,29,FOLLOW_29_in_rule__TopLevelElement__Group_2_1__0__Impl4165); 
             after(grammarAccess.getTopLevelElementAccess().getColonKeyword_2_1_0()); 

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
    // $ANTLR end rule__TopLevelElement__Group_2_1__0__Impl


    // $ANTLR start rule__TopLevelElement__Group_2_1__1
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1988:1: rule__TopLevelElement__Group_2_1__1 : rule__TopLevelElement__Group_2_1__1__Impl ;
    public final void rule__TopLevelElement__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1992:1: ( rule__TopLevelElement__Group_2_1__1__Impl )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1993:2: rule__TopLevelElement__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_rule__TopLevelElement__Group_2_1__1__Impl_in_rule__TopLevelElement__Group_2_1__14196);
            rule__TopLevelElement__Group_2_1__1__Impl();
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
    // $ANTLR end rule__TopLevelElement__Group_2_1__1


    // $ANTLR start rule__TopLevelElement__Group_2_1__1__Impl
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1999:1: rule__TopLevelElement__Group_2_1__1__Impl : ( ( rule__TopLevelElement__EmbeddedTypeDefAssignment_2_1_1 ) ) ;
    public final void rule__TopLevelElement__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2003:1: ( ( ( rule__TopLevelElement__EmbeddedTypeDefAssignment_2_1_1 ) ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2004:1: ( ( rule__TopLevelElement__EmbeddedTypeDefAssignment_2_1_1 ) )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2004:1: ( ( rule__TopLevelElement__EmbeddedTypeDefAssignment_2_1_1 ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2005:1: ( rule__TopLevelElement__EmbeddedTypeDefAssignment_2_1_1 )
            {
             before(grammarAccess.getTopLevelElementAccess().getEmbeddedTypeDefAssignment_2_1_1()); 
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2006:1: ( rule__TopLevelElement__EmbeddedTypeDefAssignment_2_1_1 )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2006:2: rule__TopLevelElement__EmbeddedTypeDefAssignment_2_1_1
            {
            pushFollow(FOLLOW_rule__TopLevelElement__EmbeddedTypeDefAssignment_2_1_1_in_rule__TopLevelElement__Group_2_1__1__Impl4223);
            rule__TopLevelElement__EmbeddedTypeDefAssignment_2_1_1();
            _fsp--;


            }

             after(grammarAccess.getTopLevelElementAccess().getEmbeddedTypeDefAssignment_2_1_1()); 

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
    // $ANTLR end rule__TopLevelElement__Group_2_1__1__Impl


    // $ANTLR start rule__TopLevelSimpleType__Group__0
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2020:1: rule__TopLevelSimpleType__Group__0 : rule__TopLevelSimpleType__Group__0__Impl rule__TopLevelSimpleType__Group__1 ;
    public final void rule__TopLevelSimpleType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2024:1: ( rule__TopLevelSimpleType__Group__0__Impl rule__TopLevelSimpleType__Group__1 )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2025:2: rule__TopLevelSimpleType__Group__0__Impl rule__TopLevelSimpleType__Group__1
            {
            pushFollow(FOLLOW_rule__TopLevelSimpleType__Group__0__Impl_in_rule__TopLevelSimpleType__Group__04257);
            rule__TopLevelSimpleType__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TopLevelSimpleType__Group__1_in_rule__TopLevelSimpleType__Group__04260);
            rule__TopLevelSimpleType__Group__1();
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
    // $ANTLR end rule__TopLevelSimpleType__Group__0


    // $ANTLR start rule__TopLevelSimpleType__Group__0__Impl
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2032:1: rule__TopLevelSimpleType__Group__0__Impl : ( 'simple-type' ) ;
    public final void rule__TopLevelSimpleType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2036:1: ( ( 'simple-type' ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2037:1: ( 'simple-type' )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2037:1: ( 'simple-type' )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2038:1: 'simple-type'
            {
             before(grammarAccess.getTopLevelSimpleTypeAccess().getSimpleTypeKeyword_0()); 
            match(input,30,FOLLOW_30_in_rule__TopLevelSimpleType__Group__0__Impl4288); 
             after(grammarAccess.getTopLevelSimpleTypeAccess().getSimpleTypeKeyword_0()); 

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
    // $ANTLR end rule__TopLevelSimpleType__Group__0__Impl


    // $ANTLR start rule__TopLevelSimpleType__Group__1
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2051:1: rule__TopLevelSimpleType__Group__1 : rule__TopLevelSimpleType__Group__1__Impl rule__TopLevelSimpleType__Group__2 ;
    public final void rule__TopLevelSimpleType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2055:1: ( rule__TopLevelSimpleType__Group__1__Impl rule__TopLevelSimpleType__Group__2 )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2056:2: rule__TopLevelSimpleType__Group__1__Impl rule__TopLevelSimpleType__Group__2
            {
            pushFollow(FOLLOW_rule__TopLevelSimpleType__Group__1__Impl_in_rule__TopLevelSimpleType__Group__14319);
            rule__TopLevelSimpleType__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TopLevelSimpleType__Group__2_in_rule__TopLevelSimpleType__Group__14322);
            rule__TopLevelSimpleType__Group__2();
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
    // $ANTLR end rule__TopLevelSimpleType__Group__1


    // $ANTLR start rule__TopLevelSimpleType__Group__1__Impl
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2063:1: rule__TopLevelSimpleType__Group__1__Impl : ( ( rule__TopLevelSimpleType__NameAssignment_1 ) ) ;
    public final void rule__TopLevelSimpleType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2067:1: ( ( ( rule__TopLevelSimpleType__NameAssignment_1 ) ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2068:1: ( ( rule__TopLevelSimpleType__NameAssignment_1 ) )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2068:1: ( ( rule__TopLevelSimpleType__NameAssignment_1 ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2069:1: ( rule__TopLevelSimpleType__NameAssignment_1 )
            {
             before(grammarAccess.getTopLevelSimpleTypeAccess().getNameAssignment_1()); 
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2070:1: ( rule__TopLevelSimpleType__NameAssignment_1 )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2070:2: rule__TopLevelSimpleType__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__TopLevelSimpleType__NameAssignment_1_in_rule__TopLevelSimpleType__Group__1__Impl4349);
            rule__TopLevelSimpleType__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getTopLevelSimpleTypeAccess().getNameAssignment_1()); 

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
    // $ANTLR end rule__TopLevelSimpleType__Group__1__Impl


    // $ANTLR start rule__TopLevelSimpleType__Group__2
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2080:1: rule__TopLevelSimpleType__Group__2 : rule__TopLevelSimpleType__Group__2__Impl rule__TopLevelSimpleType__Group__3 ;
    public final void rule__TopLevelSimpleType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2084:1: ( rule__TopLevelSimpleType__Group__2__Impl rule__TopLevelSimpleType__Group__3 )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2085:2: rule__TopLevelSimpleType__Group__2__Impl rule__TopLevelSimpleType__Group__3
            {
            pushFollow(FOLLOW_rule__TopLevelSimpleType__Group__2__Impl_in_rule__TopLevelSimpleType__Group__24379);
            rule__TopLevelSimpleType__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TopLevelSimpleType__Group__3_in_rule__TopLevelSimpleType__Group__24382);
            rule__TopLevelSimpleType__Group__3();
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
    // $ANTLR end rule__TopLevelSimpleType__Group__2


    // $ANTLR start rule__TopLevelSimpleType__Group__2__Impl
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2092:1: rule__TopLevelSimpleType__Group__2__Impl : ( ( rule__TopLevelSimpleType__RestrictionAssignment_2 )? ) ;
    public final void rule__TopLevelSimpleType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2096:1: ( ( ( rule__TopLevelSimpleType__RestrictionAssignment_2 )? ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2097:1: ( ( rule__TopLevelSimpleType__RestrictionAssignment_2 )? )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2097:1: ( ( rule__TopLevelSimpleType__RestrictionAssignment_2 )? )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2098:1: ( rule__TopLevelSimpleType__RestrictionAssignment_2 )?
            {
             before(grammarAccess.getTopLevelSimpleTypeAccess().getRestrictionAssignment_2()); 
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2099:1: ( rule__TopLevelSimpleType__RestrictionAssignment_2 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==31) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2099:2: rule__TopLevelSimpleType__RestrictionAssignment_2
                    {
                    pushFollow(FOLLOW_rule__TopLevelSimpleType__RestrictionAssignment_2_in_rule__TopLevelSimpleType__Group__2__Impl4409);
                    rule__TopLevelSimpleType__RestrictionAssignment_2();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTopLevelSimpleTypeAccess().getRestrictionAssignment_2()); 

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
    // $ANTLR end rule__TopLevelSimpleType__Group__2__Impl


    // $ANTLR start rule__TopLevelSimpleType__Group__3
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2109:1: rule__TopLevelSimpleType__Group__3 : rule__TopLevelSimpleType__Group__3__Impl ;
    public final void rule__TopLevelSimpleType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2113:1: ( rule__TopLevelSimpleType__Group__3__Impl )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2114:2: rule__TopLevelSimpleType__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__TopLevelSimpleType__Group__3__Impl_in_rule__TopLevelSimpleType__Group__34440);
            rule__TopLevelSimpleType__Group__3__Impl();
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
    // $ANTLR end rule__TopLevelSimpleType__Group__3


    // $ANTLR start rule__TopLevelSimpleType__Group__3__Impl
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2120:1: rule__TopLevelSimpleType__Group__3__Impl : ( ( rule__TopLevelSimpleType__DocumentationAssignment_3 )? ) ;
    public final void rule__TopLevelSimpleType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2124:1: ( ( ( rule__TopLevelSimpleType__DocumentationAssignment_3 )? ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2125:1: ( ( rule__TopLevelSimpleType__DocumentationAssignment_3 )? )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2125:1: ( ( rule__TopLevelSimpleType__DocumentationAssignment_3 )? )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2126:1: ( rule__TopLevelSimpleType__DocumentationAssignment_3 )?
            {
             before(grammarAccess.getTopLevelSimpleTypeAccess().getDocumentationAssignment_3()); 
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2127:1: ( rule__TopLevelSimpleType__DocumentationAssignment_3 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==36) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2127:2: rule__TopLevelSimpleType__DocumentationAssignment_3
                    {
                    pushFollow(FOLLOW_rule__TopLevelSimpleType__DocumentationAssignment_3_in_rule__TopLevelSimpleType__Group__3__Impl4467);
                    rule__TopLevelSimpleType__DocumentationAssignment_3();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTopLevelSimpleTypeAccess().getDocumentationAssignment_3()); 

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
    // $ANTLR end rule__TopLevelSimpleType__Group__3__Impl


    // $ANTLR start rule__Restriction__Group__0
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2145:1: rule__Restriction__Group__0 : rule__Restriction__Group__0__Impl rule__Restriction__Group__1 ;
    public final void rule__Restriction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2149:1: ( rule__Restriction__Group__0__Impl rule__Restriction__Group__1 )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2150:2: rule__Restriction__Group__0__Impl rule__Restriction__Group__1
            {
            pushFollow(FOLLOW_rule__Restriction__Group__0__Impl_in_rule__Restriction__Group__04506);
            rule__Restriction__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Restriction__Group__1_in_rule__Restriction__Group__04509);
            rule__Restriction__Group__1();
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
    // $ANTLR end rule__Restriction__Group__0


    // $ANTLR start rule__Restriction__Group__0__Impl
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2157:1: rule__Restriction__Group__0__Impl : ( '[' ) ;
    public final void rule__Restriction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2161:1: ( ( '[' ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2162:1: ( '[' )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2162:1: ( '[' )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2163:1: '['
            {
             before(grammarAccess.getRestrictionAccess().getLeftSquareBracketKeyword_0()); 
            match(input,31,FOLLOW_31_in_rule__Restriction__Group__0__Impl4537); 
             after(grammarAccess.getRestrictionAccess().getLeftSquareBracketKeyword_0()); 

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
    // $ANTLR end rule__Restriction__Group__0__Impl


    // $ANTLR start rule__Restriction__Group__1
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2176:1: rule__Restriction__Group__1 : rule__Restriction__Group__1__Impl rule__Restriction__Group__2 ;
    public final void rule__Restriction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2180:1: ( rule__Restriction__Group__1__Impl rule__Restriction__Group__2 )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2181:2: rule__Restriction__Group__1__Impl rule__Restriction__Group__2
            {
            pushFollow(FOLLOW_rule__Restriction__Group__1__Impl_in_rule__Restriction__Group__14568);
            rule__Restriction__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Restriction__Group__2_in_rule__Restriction__Group__14571);
            rule__Restriction__Group__2();
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
    // $ANTLR end rule__Restriction__Group__1


    // $ANTLR start rule__Restriction__Group__1__Impl
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2188:1: rule__Restriction__Group__1__Impl : ( ( rule__Restriction__TypeRefAssignment_1 ) ) ;
    public final void rule__Restriction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2192:1: ( ( ( rule__Restriction__TypeRefAssignment_1 ) ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2193:1: ( ( rule__Restriction__TypeRefAssignment_1 ) )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2193:1: ( ( rule__Restriction__TypeRefAssignment_1 ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2194:1: ( rule__Restriction__TypeRefAssignment_1 )
            {
             before(grammarAccess.getRestrictionAccess().getTypeRefAssignment_1()); 
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2195:1: ( rule__Restriction__TypeRefAssignment_1 )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2195:2: rule__Restriction__TypeRefAssignment_1
            {
            pushFollow(FOLLOW_rule__Restriction__TypeRefAssignment_1_in_rule__Restriction__Group__1__Impl4598);
            rule__Restriction__TypeRefAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getRestrictionAccess().getTypeRefAssignment_1()); 

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
    // $ANTLR end rule__Restriction__Group__1__Impl


    // $ANTLR start rule__Restriction__Group__2
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2205:1: rule__Restriction__Group__2 : rule__Restriction__Group__2__Impl rule__Restriction__Group__3 ;
    public final void rule__Restriction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2209:1: ( rule__Restriction__Group__2__Impl rule__Restriction__Group__3 )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2210:2: rule__Restriction__Group__2__Impl rule__Restriction__Group__3
            {
            pushFollow(FOLLOW_rule__Restriction__Group__2__Impl_in_rule__Restriction__Group__24628);
            rule__Restriction__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Restriction__Group__3_in_rule__Restriction__Group__24631);
            rule__Restriction__Group__3();
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
    // $ANTLR end rule__Restriction__Group__2


    // $ANTLR start rule__Restriction__Group__2__Impl
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2217:1: rule__Restriction__Group__2__Impl : ( ']' ) ;
    public final void rule__Restriction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2221:1: ( ( ']' ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2222:1: ( ']' )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2222:1: ( ']' )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2223:1: ']'
            {
             before(grammarAccess.getRestrictionAccess().getRightSquareBracketKeyword_2()); 
            match(input,32,FOLLOW_32_in_rule__Restriction__Group__2__Impl4659); 
             after(grammarAccess.getRestrictionAccess().getRightSquareBracketKeyword_2()); 

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
    // $ANTLR end rule__Restriction__Group__2__Impl


    // $ANTLR start rule__Restriction__Group__3
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2236:1: rule__Restriction__Group__3 : rule__Restriction__Group__3__Impl rule__Restriction__Group__4 ;
    public final void rule__Restriction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2240:1: ( rule__Restriction__Group__3__Impl rule__Restriction__Group__4 )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2241:2: rule__Restriction__Group__3__Impl rule__Restriction__Group__4
            {
            pushFollow(FOLLOW_rule__Restriction__Group__3__Impl_in_rule__Restriction__Group__34690);
            rule__Restriction__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Restriction__Group__4_in_rule__Restriction__Group__34693);
            rule__Restriction__Group__4();
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
    // $ANTLR end rule__Restriction__Group__3


    // $ANTLR start rule__Restriction__Group__3__Impl
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2248:1: rule__Restriction__Group__3__Impl : ( ':' ) ;
    public final void rule__Restriction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2252:1: ( ( ':' ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2253:1: ( ':' )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2253:1: ( ':' )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2254:1: ':'
            {
             before(grammarAccess.getRestrictionAccess().getColonKeyword_3()); 
            match(input,29,FOLLOW_29_in_rule__Restriction__Group__3__Impl4721); 
             after(grammarAccess.getRestrictionAccess().getColonKeyword_3()); 

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
    // $ANTLR end rule__Restriction__Group__3__Impl


    // $ANTLR start rule__Restriction__Group__4
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2267:1: rule__Restriction__Group__4 : rule__Restriction__Group__4__Impl ;
    public final void rule__Restriction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2271:1: ( rule__Restriction__Group__4__Impl )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2272:2: rule__Restriction__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Restriction__Group__4__Impl_in_rule__Restriction__Group__44752);
            rule__Restriction__Group__4__Impl();
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
    // $ANTLR end rule__Restriction__Group__4


    // $ANTLR start rule__Restriction__Group__4__Impl
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2278:1: rule__Restriction__Group__4__Impl : ( ( ( rule__Restriction__FacetsAssignment_4 ) ) ( ( rule__Restriction__FacetsAssignment_4 )* ) ) ;
    public final void rule__Restriction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2282:1: ( ( ( ( rule__Restriction__FacetsAssignment_4 ) ) ( ( rule__Restriction__FacetsAssignment_4 )* ) ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2283:1: ( ( ( rule__Restriction__FacetsAssignment_4 ) ) ( ( rule__Restriction__FacetsAssignment_4 )* ) )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2283:1: ( ( ( rule__Restriction__FacetsAssignment_4 ) ) ( ( rule__Restriction__FacetsAssignment_4 )* ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2284:1: ( ( rule__Restriction__FacetsAssignment_4 ) ) ( ( rule__Restriction__FacetsAssignment_4 )* )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2284:1: ( ( rule__Restriction__FacetsAssignment_4 ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2285:1: ( rule__Restriction__FacetsAssignment_4 )
            {
             before(grammarAccess.getRestrictionAccess().getFacetsAssignment_4()); 
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2286:1: ( rule__Restriction__FacetsAssignment_4 )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2286:2: rule__Restriction__FacetsAssignment_4
            {
            pushFollow(FOLLOW_rule__Restriction__FacetsAssignment_4_in_rule__Restriction__Group__4__Impl4781);
            rule__Restriction__FacetsAssignment_4();
            _fsp--;


            }

             after(grammarAccess.getRestrictionAccess().getFacetsAssignment_4()); 

            }

            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2289:1: ( ( rule__Restriction__FacetsAssignment_4 )* )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2290:1: ( rule__Restriction__FacetsAssignment_4 )*
            {
             before(grammarAccess.getRestrictionAccess().getFacetsAssignment_4()); 
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2291:1: ( rule__Restriction__FacetsAssignment_4 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==33||LA20_0==37||(LA20_0>=39 && LA20_0<=40)||LA20_0==42) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2291:2: rule__Restriction__FacetsAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Restriction__FacetsAssignment_4_in_rule__Restriction__Group__4__Impl4793);
            	    rule__Restriction__FacetsAssignment_4();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getRestrictionAccess().getFacetsAssignment_4()); 

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
    // $ANTLR end rule__Restriction__Group__4__Impl


    // $ANTLR start rule__EnumerationFacet__Group__0
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2312:1: rule__EnumerationFacet__Group__0 : rule__EnumerationFacet__Group__0__Impl rule__EnumerationFacet__Group__1 ;
    public final void rule__EnumerationFacet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2316:1: ( rule__EnumerationFacet__Group__0__Impl rule__EnumerationFacet__Group__1 )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2317:2: rule__EnumerationFacet__Group__0__Impl rule__EnumerationFacet__Group__1
            {
            pushFollow(FOLLOW_rule__EnumerationFacet__Group__0__Impl_in_rule__EnumerationFacet__Group__04836);
            rule__EnumerationFacet__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__EnumerationFacet__Group__1_in_rule__EnumerationFacet__Group__04839);
            rule__EnumerationFacet__Group__1();
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
    // $ANTLR end rule__EnumerationFacet__Group__0


    // $ANTLR start rule__EnumerationFacet__Group__0__Impl
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2324:1: rule__EnumerationFacet__Group__0__Impl : ( 'enumeration' ) ;
    public final void rule__EnumerationFacet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2328:1: ( ( 'enumeration' ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2329:1: ( 'enumeration' )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2329:1: ( 'enumeration' )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2330:1: 'enumeration'
            {
             before(grammarAccess.getEnumerationFacetAccess().getEnumerationKeyword_0()); 
            match(input,33,FOLLOW_33_in_rule__EnumerationFacet__Group__0__Impl4867); 
             after(grammarAccess.getEnumerationFacetAccess().getEnumerationKeyword_0()); 

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
    // $ANTLR end rule__EnumerationFacet__Group__0__Impl


    // $ANTLR start rule__EnumerationFacet__Group__1
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2343:1: rule__EnumerationFacet__Group__1 : rule__EnumerationFacet__Group__1__Impl rule__EnumerationFacet__Group__2 ;
    public final void rule__EnumerationFacet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2347:1: ( rule__EnumerationFacet__Group__1__Impl rule__EnumerationFacet__Group__2 )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2348:2: rule__EnumerationFacet__Group__1__Impl rule__EnumerationFacet__Group__2
            {
            pushFollow(FOLLOW_rule__EnumerationFacet__Group__1__Impl_in_rule__EnumerationFacet__Group__14898);
            rule__EnumerationFacet__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__EnumerationFacet__Group__2_in_rule__EnumerationFacet__Group__14901);
            rule__EnumerationFacet__Group__2();
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
    // $ANTLR end rule__EnumerationFacet__Group__1


    // $ANTLR start rule__EnumerationFacet__Group__1__Impl
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2355:1: rule__EnumerationFacet__Group__1__Impl : ( '{' ) ;
    public final void rule__EnumerationFacet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2359:1: ( ( '{' ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2360:1: ( '{' )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2360:1: ( '{' )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2361:1: '{'
            {
             before(grammarAccess.getEnumerationFacetAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,34,FOLLOW_34_in_rule__EnumerationFacet__Group__1__Impl4929); 
             after(grammarAccess.getEnumerationFacetAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end rule__EnumerationFacet__Group__1__Impl


    // $ANTLR start rule__EnumerationFacet__Group__2
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2374:1: rule__EnumerationFacet__Group__2 : rule__EnumerationFacet__Group__2__Impl rule__EnumerationFacet__Group__3 ;
    public final void rule__EnumerationFacet__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2378:1: ( rule__EnumerationFacet__Group__2__Impl rule__EnumerationFacet__Group__3 )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2379:2: rule__EnumerationFacet__Group__2__Impl rule__EnumerationFacet__Group__3
            {
            pushFollow(FOLLOW_rule__EnumerationFacet__Group__2__Impl_in_rule__EnumerationFacet__Group__24960);
            rule__EnumerationFacet__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__EnumerationFacet__Group__3_in_rule__EnumerationFacet__Group__24963);
            rule__EnumerationFacet__Group__3();
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
    // $ANTLR end rule__EnumerationFacet__Group__2


    // $ANTLR start rule__EnumerationFacet__Group__2__Impl
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2386:1: rule__EnumerationFacet__Group__2__Impl : ( ( ( rule__EnumerationFacet__LiteralsAssignment_2 ) ) ( ( rule__EnumerationFacet__LiteralsAssignment_2 )* ) ) ;
    public final void rule__EnumerationFacet__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2390:1: ( ( ( ( rule__EnumerationFacet__LiteralsAssignment_2 ) ) ( ( rule__EnumerationFacet__LiteralsAssignment_2 )* ) ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2391:1: ( ( ( rule__EnumerationFacet__LiteralsAssignment_2 ) ) ( ( rule__EnumerationFacet__LiteralsAssignment_2 )* ) )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2391:1: ( ( ( rule__EnumerationFacet__LiteralsAssignment_2 ) ) ( ( rule__EnumerationFacet__LiteralsAssignment_2 )* ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2392:1: ( ( rule__EnumerationFacet__LiteralsAssignment_2 ) ) ( ( rule__EnumerationFacet__LiteralsAssignment_2 )* )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2392:1: ( ( rule__EnumerationFacet__LiteralsAssignment_2 ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2393:1: ( rule__EnumerationFacet__LiteralsAssignment_2 )
            {
             before(grammarAccess.getEnumerationFacetAccess().getLiteralsAssignment_2()); 
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2394:1: ( rule__EnumerationFacet__LiteralsAssignment_2 )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2394:2: rule__EnumerationFacet__LiteralsAssignment_2
            {
            pushFollow(FOLLOW_rule__EnumerationFacet__LiteralsAssignment_2_in_rule__EnumerationFacet__Group__2__Impl4992);
            rule__EnumerationFacet__LiteralsAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getEnumerationFacetAccess().getLiteralsAssignment_2()); 

            }

            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2397:1: ( ( rule__EnumerationFacet__LiteralsAssignment_2 )* )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2398:1: ( rule__EnumerationFacet__LiteralsAssignment_2 )*
            {
             before(grammarAccess.getEnumerationFacetAccess().getLiteralsAssignment_2()); 
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2399:1: ( rule__EnumerationFacet__LiteralsAssignment_2 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=RULE_ID && LA21_0<=RULE_STRING)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2399:2: rule__EnumerationFacet__LiteralsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__EnumerationFacet__LiteralsAssignment_2_in_rule__EnumerationFacet__Group__2__Impl5004);
            	    rule__EnumerationFacet__LiteralsAssignment_2();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getEnumerationFacetAccess().getLiteralsAssignment_2()); 

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
    // $ANTLR end rule__EnumerationFacet__Group__2__Impl


    // $ANTLR start rule__EnumerationFacet__Group__3
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2410:1: rule__EnumerationFacet__Group__3 : rule__EnumerationFacet__Group__3__Impl ;
    public final void rule__EnumerationFacet__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2414:1: ( rule__EnumerationFacet__Group__3__Impl )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2415:2: rule__EnumerationFacet__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__EnumerationFacet__Group__3__Impl_in_rule__EnumerationFacet__Group__35037);
            rule__EnumerationFacet__Group__3__Impl();
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
    // $ANTLR end rule__EnumerationFacet__Group__3


    // $ANTLR start rule__EnumerationFacet__Group__3__Impl
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2421:1: rule__EnumerationFacet__Group__3__Impl : ( '}' ) ;
    public final void rule__EnumerationFacet__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2425:1: ( ( '}' ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2426:1: ( '}' )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2426:1: ( '}' )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2427:1: '}'
            {
             before(grammarAccess.getEnumerationFacetAccess().getRightCurlyBracketKeyword_3()); 
            match(input,35,FOLLOW_35_in_rule__EnumerationFacet__Group__3__Impl5065); 
             after(grammarAccess.getEnumerationFacetAccess().getRightCurlyBracketKeyword_3()); 

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
    // $ANTLR end rule__EnumerationFacet__Group__3__Impl


    // $ANTLR start rule__EnumerationLiteral__Group__0
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2448:1: rule__EnumerationLiteral__Group__0 : rule__EnumerationLiteral__Group__0__Impl rule__EnumerationLiteral__Group__1 ;
    public final void rule__EnumerationLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2452:1: ( rule__EnumerationLiteral__Group__0__Impl rule__EnumerationLiteral__Group__1 )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2453:2: rule__EnumerationLiteral__Group__0__Impl rule__EnumerationLiteral__Group__1
            {
            pushFollow(FOLLOW_rule__EnumerationLiteral__Group__0__Impl_in_rule__EnumerationLiteral__Group__05104);
            rule__EnumerationLiteral__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__EnumerationLiteral__Group__1_in_rule__EnumerationLiteral__Group__05107);
            rule__EnumerationLiteral__Group__1();
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
    // $ANTLR end rule__EnumerationLiteral__Group__0


    // $ANTLR start rule__EnumerationLiteral__Group__0__Impl
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2460:1: rule__EnumerationLiteral__Group__0__Impl : ( ( rule__EnumerationLiteral__ValueAssignment_0 ) ) ;
    public final void rule__EnumerationLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2464:1: ( ( ( rule__EnumerationLiteral__ValueAssignment_0 ) ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2465:1: ( ( rule__EnumerationLiteral__ValueAssignment_0 ) )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2465:1: ( ( rule__EnumerationLiteral__ValueAssignment_0 ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2466:1: ( rule__EnumerationLiteral__ValueAssignment_0 )
            {
             before(grammarAccess.getEnumerationLiteralAccess().getValueAssignment_0()); 
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2467:1: ( rule__EnumerationLiteral__ValueAssignment_0 )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2467:2: rule__EnumerationLiteral__ValueAssignment_0
            {
            pushFollow(FOLLOW_rule__EnumerationLiteral__ValueAssignment_0_in_rule__EnumerationLiteral__Group__0__Impl5134);
            rule__EnumerationLiteral__ValueAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getEnumerationLiteralAccess().getValueAssignment_0()); 

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
    // $ANTLR end rule__EnumerationLiteral__Group__0__Impl


    // $ANTLR start rule__EnumerationLiteral__Group__1
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2477:1: rule__EnumerationLiteral__Group__1 : rule__EnumerationLiteral__Group__1__Impl ;
    public final void rule__EnumerationLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2481:1: ( rule__EnumerationLiteral__Group__1__Impl )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2482:2: rule__EnumerationLiteral__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__EnumerationLiteral__Group__1__Impl_in_rule__EnumerationLiteral__Group__15164);
            rule__EnumerationLiteral__Group__1__Impl();
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
    // $ANTLR end rule__EnumerationLiteral__Group__1


    // $ANTLR start rule__EnumerationLiteral__Group__1__Impl
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2488:1: rule__EnumerationLiteral__Group__1__Impl : ( ( rule__EnumerationLiteral__Group_1__0 )? ) ;
    public final void rule__EnumerationLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2492:1: ( ( ( rule__EnumerationLiteral__Group_1__0 )? ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2493:1: ( ( rule__EnumerationLiteral__Group_1__0 )? )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2493:1: ( ( rule__EnumerationLiteral__Group_1__0 )? )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2494:1: ( rule__EnumerationLiteral__Group_1__0 )?
            {
             before(grammarAccess.getEnumerationLiteralAccess().getGroup_1()); 
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2495:1: ( rule__EnumerationLiteral__Group_1__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==36) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2495:2: rule__EnumerationLiteral__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__EnumerationLiteral__Group_1__0_in_rule__EnumerationLiteral__Group__1__Impl5191);
                    rule__EnumerationLiteral__Group_1__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEnumerationLiteralAccess().getGroup_1()); 

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
    // $ANTLR end rule__EnumerationLiteral__Group__1__Impl


    // $ANTLR start rule__EnumerationLiteral__Group_1__0
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2509:1: rule__EnumerationLiteral__Group_1__0 : rule__EnumerationLiteral__Group_1__0__Impl rule__EnumerationLiteral__Group_1__1 ;
    public final void rule__EnumerationLiteral__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2513:1: ( rule__EnumerationLiteral__Group_1__0__Impl rule__EnumerationLiteral__Group_1__1 )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2514:2: rule__EnumerationLiteral__Group_1__0__Impl rule__EnumerationLiteral__Group_1__1
            {
            pushFollow(FOLLOW_rule__EnumerationLiteral__Group_1__0__Impl_in_rule__EnumerationLiteral__Group_1__05226);
            rule__EnumerationLiteral__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__EnumerationLiteral__Group_1__1_in_rule__EnumerationLiteral__Group_1__05229);
            rule__EnumerationLiteral__Group_1__1();
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
    // $ANTLR end rule__EnumerationLiteral__Group_1__0


    // $ANTLR start rule__EnumerationLiteral__Group_1__0__Impl
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2521:1: rule__EnumerationLiteral__Group_1__0__Impl : ( '::' ) ;
    public final void rule__EnumerationLiteral__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2525:1: ( ( '::' ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2526:1: ( '::' )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2526:1: ( '::' )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2527:1: '::'
            {
             before(grammarAccess.getEnumerationLiteralAccess().getColonColonKeyword_1_0()); 
            match(input,36,FOLLOW_36_in_rule__EnumerationLiteral__Group_1__0__Impl5257); 
             after(grammarAccess.getEnumerationLiteralAccess().getColonColonKeyword_1_0()); 

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
    // $ANTLR end rule__EnumerationLiteral__Group_1__0__Impl


    // $ANTLR start rule__EnumerationLiteral__Group_1__1
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2540:1: rule__EnumerationLiteral__Group_1__1 : rule__EnumerationLiteral__Group_1__1__Impl ;
    public final void rule__EnumerationLiteral__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2544:1: ( rule__EnumerationLiteral__Group_1__1__Impl )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2545:2: rule__EnumerationLiteral__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__EnumerationLiteral__Group_1__1__Impl_in_rule__EnumerationLiteral__Group_1__15288);
            rule__EnumerationLiteral__Group_1__1__Impl();
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
    // $ANTLR end rule__EnumerationLiteral__Group_1__1


    // $ANTLR start rule__EnumerationLiteral__Group_1__1__Impl
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2551:1: rule__EnumerationLiteral__Group_1__1__Impl : ( ( rule__EnumerationLiteral__AnnotationAssignment_1_1 ) ) ;
    public final void rule__EnumerationLiteral__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2555:1: ( ( ( rule__EnumerationLiteral__AnnotationAssignment_1_1 ) ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2556:1: ( ( rule__EnumerationLiteral__AnnotationAssignment_1_1 ) )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2556:1: ( ( rule__EnumerationLiteral__AnnotationAssignment_1_1 ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2557:1: ( rule__EnumerationLiteral__AnnotationAssignment_1_1 )
            {
             before(grammarAccess.getEnumerationLiteralAccess().getAnnotationAssignment_1_1()); 
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2558:1: ( rule__EnumerationLiteral__AnnotationAssignment_1_1 )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2558:2: rule__EnumerationLiteral__AnnotationAssignment_1_1
            {
            pushFollow(FOLLOW_rule__EnumerationLiteral__AnnotationAssignment_1_1_in_rule__EnumerationLiteral__Group_1__1__Impl5315);
            rule__EnumerationLiteral__AnnotationAssignment_1_1();
            _fsp--;


            }

             after(grammarAccess.getEnumerationLiteralAccess().getAnnotationAssignment_1_1()); 

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
    // $ANTLR end rule__EnumerationLiteral__Group_1__1__Impl


    // $ANTLR start rule__MaxLengthFacet__Group__0
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2572:1: rule__MaxLengthFacet__Group__0 : rule__MaxLengthFacet__Group__0__Impl rule__MaxLengthFacet__Group__1 ;
    public final void rule__MaxLengthFacet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2576:1: ( rule__MaxLengthFacet__Group__0__Impl rule__MaxLengthFacet__Group__1 )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2577:2: rule__MaxLengthFacet__Group__0__Impl rule__MaxLengthFacet__Group__1
            {
            pushFollow(FOLLOW_rule__MaxLengthFacet__Group__0__Impl_in_rule__MaxLengthFacet__Group__05349);
            rule__MaxLengthFacet__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__MaxLengthFacet__Group__1_in_rule__MaxLengthFacet__Group__05352);
            rule__MaxLengthFacet__Group__1();
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
    // $ANTLR end rule__MaxLengthFacet__Group__0


    // $ANTLR start rule__MaxLengthFacet__Group__0__Impl
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2584:1: rule__MaxLengthFacet__Group__0__Impl : ( 'maxLength' ) ;
    public final void rule__MaxLengthFacet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2588:1: ( ( 'maxLength' ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2589:1: ( 'maxLength' )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2589:1: ( 'maxLength' )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2590:1: 'maxLength'
            {
             before(grammarAccess.getMaxLengthFacetAccess().getMaxLengthKeyword_0()); 
            match(input,37,FOLLOW_37_in_rule__MaxLengthFacet__Group__0__Impl5380); 
             after(grammarAccess.getMaxLengthFacetAccess().getMaxLengthKeyword_0()); 

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
    // $ANTLR end rule__MaxLengthFacet__Group__0__Impl


    // $ANTLR start rule__MaxLengthFacet__Group__1
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2603:1: rule__MaxLengthFacet__Group__1 : rule__MaxLengthFacet__Group__1__Impl rule__MaxLengthFacet__Group__2 ;
    public final void rule__MaxLengthFacet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2607:1: ( rule__MaxLengthFacet__Group__1__Impl rule__MaxLengthFacet__Group__2 )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2608:2: rule__MaxLengthFacet__Group__1__Impl rule__MaxLengthFacet__Group__2
            {
            pushFollow(FOLLOW_rule__MaxLengthFacet__Group__1__Impl_in_rule__MaxLengthFacet__Group__15411);
            rule__MaxLengthFacet__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__MaxLengthFacet__Group__2_in_rule__MaxLengthFacet__Group__15414);
            rule__MaxLengthFacet__Group__2();
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
    // $ANTLR end rule__MaxLengthFacet__Group__1


    // $ANTLR start rule__MaxLengthFacet__Group__1__Impl
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2615:1: rule__MaxLengthFacet__Group__1__Impl : ( '=' ) ;
    public final void rule__MaxLengthFacet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2619:1: ( ( '=' ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2620:1: ( '=' )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2620:1: ( '=' )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2621:1: '='
            {
             before(grammarAccess.getMaxLengthFacetAccess().getEqualsSignKeyword_1()); 
            match(input,38,FOLLOW_38_in_rule__MaxLengthFacet__Group__1__Impl5442); 
             after(grammarAccess.getMaxLengthFacetAccess().getEqualsSignKeyword_1()); 

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
    // $ANTLR end rule__MaxLengthFacet__Group__1__Impl


    // $ANTLR start rule__MaxLengthFacet__Group__2
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2634:1: rule__MaxLengthFacet__Group__2 : rule__MaxLengthFacet__Group__2__Impl ;
    public final void rule__MaxLengthFacet__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2638:1: ( rule__MaxLengthFacet__Group__2__Impl )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2639:2: rule__MaxLengthFacet__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__MaxLengthFacet__Group__2__Impl_in_rule__MaxLengthFacet__Group__25473);
            rule__MaxLengthFacet__Group__2__Impl();
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
    // $ANTLR end rule__MaxLengthFacet__Group__2


    // $ANTLR start rule__MaxLengthFacet__Group__2__Impl
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2645:1: rule__MaxLengthFacet__Group__2__Impl : ( ( rule__MaxLengthFacet__MaxLengthAssignment_2 ) ) ;
    public final void rule__MaxLengthFacet__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2649:1: ( ( ( rule__MaxLengthFacet__MaxLengthAssignment_2 ) ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2650:1: ( ( rule__MaxLengthFacet__MaxLengthAssignment_2 ) )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2650:1: ( ( rule__MaxLengthFacet__MaxLengthAssignment_2 ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2651:1: ( rule__MaxLengthFacet__MaxLengthAssignment_2 )
            {
             before(grammarAccess.getMaxLengthFacetAccess().getMaxLengthAssignment_2()); 
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2652:1: ( rule__MaxLengthFacet__MaxLengthAssignment_2 )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2652:2: rule__MaxLengthFacet__MaxLengthAssignment_2
            {
            pushFollow(FOLLOW_rule__MaxLengthFacet__MaxLengthAssignment_2_in_rule__MaxLengthFacet__Group__2__Impl5500);
            rule__MaxLengthFacet__MaxLengthAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getMaxLengthFacetAccess().getMaxLengthAssignment_2()); 

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
    // $ANTLR end rule__MaxLengthFacet__Group__2__Impl


    // $ANTLR start rule__PatternFacet__Group__0
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2668:1: rule__PatternFacet__Group__0 : rule__PatternFacet__Group__0__Impl rule__PatternFacet__Group__1 ;
    public final void rule__PatternFacet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2672:1: ( rule__PatternFacet__Group__0__Impl rule__PatternFacet__Group__1 )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2673:2: rule__PatternFacet__Group__0__Impl rule__PatternFacet__Group__1
            {
            pushFollow(FOLLOW_rule__PatternFacet__Group__0__Impl_in_rule__PatternFacet__Group__05536);
            rule__PatternFacet__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__PatternFacet__Group__1_in_rule__PatternFacet__Group__05539);
            rule__PatternFacet__Group__1();
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
    // $ANTLR end rule__PatternFacet__Group__0


    // $ANTLR start rule__PatternFacet__Group__0__Impl
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2680:1: rule__PatternFacet__Group__0__Impl : ( 'pattern' ) ;
    public final void rule__PatternFacet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2684:1: ( ( 'pattern' ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2685:1: ( 'pattern' )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2685:1: ( 'pattern' )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2686:1: 'pattern'
            {
             before(grammarAccess.getPatternFacetAccess().getPatternKeyword_0()); 
            match(input,39,FOLLOW_39_in_rule__PatternFacet__Group__0__Impl5567); 
             after(grammarAccess.getPatternFacetAccess().getPatternKeyword_0()); 

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
    // $ANTLR end rule__PatternFacet__Group__0__Impl


    // $ANTLR start rule__PatternFacet__Group__1
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2699:1: rule__PatternFacet__Group__1 : rule__PatternFacet__Group__1__Impl rule__PatternFacet__Group__2 ;
    public final void rule__PatternFacet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2703:1: ( rule__PatternFacet__Group__1__Impl rule__PatternFacet__Group__2 )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2704:2: rule__PatternFacet__Group__1__Impl rule__PatternFacet__Group__2
            {
            pushFollow(FOLLOW_rule__PatternFacet__Group__1__Impl_in_rule__PatternFacet__Group__15598);
            rule__PatternFacet__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__PatternFacet__Group__2_in_rule__PatternFacet__Group__15601);
            rule__PatternFacet__Group__2();
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
    // $ANTLR end rule__PatternFacet__Group__1


    // $ANTLR start rule__PatternFacet__Group__1__Impl
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2711:1: rule__PatternFacet__Group__1__Impl : ( '=' ) ;
    public final void rule__PatternFacet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2715:1: ( ( '=' ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2716:1: ( '=' )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2716:1: ( '=' )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2717:1: '='
            {
             before(grammarAccess.getPatternFacetAccess().getEqualsSignKeyword_1()); 
            match(input,38,FOLLOW_38_in_rule__PatternFacet__Group__1__Impl5629); 
             after(grammarAccess.getPatternFacetAccess().getEqualsSignKeyword_1()); 

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
    // $ANTLR end rule__PatternFacet__Group__1__Impl


    // $ANTLR start rule__PatternFacet__Group__2
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2730:1: rule__PatternFacet__Group__2 : rule__PatternFacet__Group__2__Impl ;
    public final void rule__PatternFacet__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2734:1: ( rule__PatternFacet__Group__2__Impl )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2735:2: rule__PatternFacet__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__PatternFacet__Group__2__Impl_in_rule__PatternFacet__Group__25660);
            rule__PatternFacet__Group__2__Impl();
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
    // $ANTLR end rule__PatternFacet__Group__2


    // $ANTLR start rule__PatternFacet__Group__2__Impl
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2741:1: rule__PatternFacet__Group__2__Impl : ( ( rule__PatternFacet__PatternAssignment_2 ) ) ;
    public final void rule__PatternFacet__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2745:1: ( ( ( rule__PatternFacet__PatternAssignment_2 ) ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2746:1: ( ( rule__PatternFacet__PatternAssignment_2 ) )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2746:1: ( ( rule__PatternFacet__PatternAssignment_2 ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2747:1: ( rule__PatternFacet__PatternAssignment_2 )
            {
             before(grammarAccess.getPatternFacetAccess().getPatternAssignment_2()); 
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2748:1: ( rule__PatternFacet__PatternAssignment_2 )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2748:2: rule__PatternFacet__PatternAssignment_2
            {
            pushFollow(FOLLOW_rule__PatternFacet__PatternAssignment_2_in_rule__PatternFacet__Group__2__Impl5687);
            rule__PatternFacet__PatternAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getPatternFacetAccess().getPatternAssignment_2()); 

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
    // $ANTLR end rule__PatternFacet__Group__2__Impl


    // $ANTLR start rule__RangeFacet__Group__0
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2764:1: rule__RangeFacet__Group__0 : rule__RangeFacet__Group__0__Impl rule__RangeFacet__Group__1 ;
    public final void rule__RangeFacet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2768:1: ( rule__RangeFacet__Group__0__Impl rule__RangeFacet__Group__1 )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2769:2: rule__RangeFacet__Group__0__Impl rule__RangeFacet__Group__1
            {
            pushFollow(FOLLOW_rule__RangeFacet__Group__0__Impl_in_rule__RangeFacet__Group__05723);
            rule__RangeFacet__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__RangeFacet__Group__1_in_rule__RangeFacet__Group__05726);
            rule__RangeFacet__Group__1();
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
    // $ANTLR end rule__RangeFacet__Group__0


    // $ANTLR start rule__RangeFacet__Group__0__Impl
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2776:1: rule__RangeFacet__Group__0__Impl : ( 'range' ) ;
    public final void rule__RangeFacet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2780:1: ( ( 'range' ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2781:1: ( 'range' )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2781:1: ( 'range' )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2782:1: 'range'
            {
             before(grammarAccess.getRangeFacetAccess().getRangeKeyword_0()); 
            match(input,40,FOLLOW_40_in_rule__RangeFacet__Group__0__Impl5754); 
             after(grammarAccess.getRangeFacetAccess().getRangeKeyword_0()); 

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
    // $ANTLR end rule__RangeFacet__Group__0__Impl


    // $ANTLR start rule__RangeFacet__Group__1
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2795:1: rule__RangeFacet__Group__1 : rule__RangeFacet__Group__1__Impl rule__RangeFacet__Group__2 ;
    public final void rule__RangeFacet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2799:1: ( rule__RangeFacet__Group__1__Impl rule__RangeFacet__Group__2 )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2800:2: rule__RangeFacet__Group__1__Impl rule__RangeFacet__Group__2
            {
            pushFollow(FOLLOW_rule__RangeFacet__Group__1__Impl_in_rule__RangeFacet__Group__15785);
            rule__RangeFacet__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__RangeFacet__Group__2_in_rule__RangeFacet__Group__15788);
            rule__RangeFacet__Group__2();
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
    // $ANTLR end rule__RangeFacet__Group__1


    // $ANTLR start rule__RangeFacet__Group__1__Impl
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2807:1: rule__RangeFacet__Group__1__Impl : ( '=' ) ;
    public final void rule__RangeFacet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2811:1: ( ( '=' ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2812:1: ( '=' )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2812:1: ( '=' )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2813:1: '='
            {
             before(grammarAccess.getRangeFacetAccess().getEqualsSignKeyword_1()); 
            match(input,38,FOLLOW_38_in_rule__RangeFacet__Group__1__Impl5816); 
             after(grammarAccess.getRangeFacetAccess().getEqualsSignKeyword_1()); 

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
    // $ANTLR end rule__RangeFacet__Group__1__Impl


    // $ANTLR start rule__RangeFacet__Group__2
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2826:1: rule__RangeFacet__Group__2 : rule__RangeFacet__Group__2__Impl rule__RangeFacet__Group__3 ;
    public final void rule__RangeFacet__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2830:1: ( rule__RangeFacet__Group__2__Impl rule__RangeFacet__Group__3 )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2831:2: rule__RangeFacet__Group__2__Impl rule__RangeFacet__Group__3
            {
            pushFollow(FOLLOW_rule__RangeFacet__Group__2__Impl_in_rule__RangeFacet__Group__25847);
            rule__RangeFacet__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__RangeFacet__Group__3_in_rule__RangeFacet__Group__25850);
            rule__RangeFacet__Group__3();
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
    // $ANTLR end rule__RangeFacet__Group__2


    // $ANTLR start rule__RangeFacet__Group__2__Impl
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2838:1: rule__RangeFacet__Group__2__Impl : ( ( rule__RangeFacet__LowerAssignment_2 ) ) ;
    public final void rule__RangeFacet__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2842:1: ( ( ( rule__RangeFacet__LowerAssignment_2 ) ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2843:1: ( ( rule__RangeFacet__LowerAssignment_2 ) )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2843:1: ( ( rule__RangeFacet__LowerAssignment_2 ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2844:1: ( rule__RangeFacet__LowerAssignment_2 )
            {
             before(grammarAccess.getRangeFacetAccess().getLowerAssignment_2()); 
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2845:1: ( rule__RangeFacet__LowerAssignment_2 )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2845:2: rule__RangeFacet__LowerAssignment_2
            {
            pushFollow(FOLLOW_rule__RangeFacet__LowerAssignment_2_in_rule__RangeFacet__Group__2__Impl5877);
            rule__RangeFacet__LowerAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getRangeFacetAccess().getLowerAssignment_2()); 

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
    // $ANTLR end rule__RangeFacet__Group__2__Impl


    // $ANTLR start rule__RangeFacet__Group__3
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2855:1: rule__RangeFacet__Group__3 : rule__RangeFacet__Group__3__Impl rule__RangeFacet__Group__4 ;
    public final void rule__RangeFacet__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2859:1: ( rule__RangeFacet__Group__3__Impl rule__RangeFacet__Group__4 )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2860:2: rule__RangeFacet__Group__3__Impl rule__RangeFacet__Group__4
            {
            pushFollow(FOLLOW_rule__RangeFacet__Group__3__Impl_in_rule__RangeFacet__Group__35907);
            rule__RangeFacet__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__RangeFacet__Group__4_in_rule__RangeFacet__Group__35910);
            rule__RangeFacet__Group__4();
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
    // $ANTLR end rule__RangeFacet__Group__3


    // $ANTLR start rule__RangeFacet__Group__3__Impl
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2867:1: rule__RangeFacet__Group__3__Impl : ( '..' ) ;
    public final void rule__RangeFacet__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2871:1: ( ( '..' ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2872:1: ( '..' )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2872:1: ( '..' )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2873:1: '..'
            {
             before(grammarAccess.getRangeFacetAccess().getFullStopFullStopKeyword_3()); 
            match(input,41,FOLLOW_41_in_rule__RangeFacet__Group__3__Impl5938); 
             after(grammarAccess.getRangeFacetAccess().getFullStopFullStopKeyword_3()); 

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
    // $ANTLR end rule__RangeFacet__Group__3__Impl


    // $ANTLR start rule__RangeFacet__Group__4
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2886:1: rule__RangeFacet__Group__4 : rule__RangeFacet__Group__4__Impl ;
    public final void rule__RangeFacet__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2890:1: ( rule__RangeFacet__Group__4__Impl )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2891:2: rule__RangeFacet__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__RangeFacet__Group__4__Impl_in_rule__RangeFacet__Group__45969);
            rule__RangeFacet__Group__4__Impl();
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
    // $ANTLR end rule__RangeFacet__Group__4


    // $ANTLR start rule__RangeFacet__Group__4__Impl
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2897:1: rule__RangeFacet__Group__4__Impl : ( ( rule__RangeFacet__UpperAssignment_4 ) ) ;
    public final void rule__RangeFacet__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2901:1: ( ( ( rule__RangeFacet__UpperAssignment_4 ) ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2902:1: ( ( rule__RangeFacet__UpperAssignment_4 ) )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2902:1: ( ( rule__RangeFacet__UpperAssignment_4 ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2903:1: ( rule__RangeFacet__UpperAssignment_4 )
            {
             before(grammarAccess.getRangeFacetAccess().getUpperAssignment_4()); 
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2904:1: ( rule__RangeFacet__UpperAssignment_4 )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2904:2: rule__RangeFacet__UpperAssignment_4
            {
            pushFollow(FOLLOW_rule__RangeFacet__UpperAssignment_4_in_rule__RangeFacet__Group__4__Impl5996);
            rule__RangeFacet__UpperAssignment_4();
            _fsp--;


            }

             after(grammarAccess.getRangeFacetAccess().getUpperAssignment_4()); 

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
    // $ANTLR end rule__RangeFacet__Group__4__Impl


    // $ANTLR start rule__LengthFacet__Group__0
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2924:1: rule__LengthFacet__Group__0 : rule__LengthFacet__Group__0__Impl rule__LengthFacet__Group__1 ;
    public final void rule__LengthFacet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2928:1: ( rule__LengthFacet__Group__0__Impl rule__LengthFacet__Group__1 )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2929:2: rule__LengthFacet__Group__0__Impl rule__LengthFacet__Group__1
            {
            pushFollow(FOLLOW_rule__LengthFacet__Group__0__Impl_in_rule__LengthFacet__Group__06036);
            rule__LengthFacet__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__LengthFacet__Group__1_in_rule__LengthFacet__Group__06039);
            rule__LengthFacet__Group__1();
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
    // $ANTLR end rule__LengthFacet__Group__0


    // $ANTLR start rule__LengthFacet__Group__0__Impl
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2936:1: rule__LengthFacet__Group__0__Impl : ( 'length' ) ;
    public final void rule__LengthFacet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2940:1: ( ( 'length' ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2941:1: ( 'length' )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2941:1: ( 'length' )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2942:1: 'length'
            {
             before(grammarAccess.getLengthFacetAccess().getLengthKeyword_0()); 
            match(input,42,FOLLOW_42_in_rule__LengthFacet__Group__0__Impl6067); 
             after(grammarAccess.getLengthFacetAccess().getLengthKeyword_0()); 

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
    // $ANTLR end rule__LengthFacet__Group__0__Impl


    // $ANTLR start rule__LengthFacet__Group__1
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2955:1: rule__LengthFacet__Group__1 : rule__LengthFacet__Group__1__Impl rule__LengthFacet__Group__2 ;
    public final void rule__LengthFacet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2959:1: ( rule__LengthFacet__Group__1__Impl rule__LengthFacet__Group__2 )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2960:2: rule__LengthFacet__Group__1__Impl rule__LengthFacet__Group__2
            {
            pushFollow(FOLLOW_rule__LengthFacet__Group__1__Impl_in_rule__LengthFacet__Group__16098);
            rule__LengthFacet__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__LengthFacet__Group__2_in_rule__LengthFacet__Group__16101);
            rule__LengthFacet__Group__2();
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
    // $ANTLR end rule__LengthFacet__Group__1


    // $ANTLR start rule__LengthFacet__Group__1__Impl
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2967:1: rule__LengthFacet__Group__1__Impl : ( '=' ) ;
    public final void rule__LengthFacet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2971:1: ( ( '=' ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2972:1: ( '=' )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2972:1: ( '=' )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2973:1: '='
            {
             before(grammarAccess.getLengthFacetAccess().getEqualsSignKeyword_1()); 
            match(input,38,FOLLOW_38_in_rule__LengthFacet__Group__1__Impl6129); 
             after(grammarAccess.getLengthFacetAccess().getEqualsSignKeyword_1()); 

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
    // $ANTLR end rule__LengthFacet__Group__1__Impl


    // $ANTLR start rule__LengthFacet__Group__2
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2986:1: rule__LengthFacet__Group__2 : rule__LengthFacet__Group__2__Impl ;
    public final void rule__LengthFacet__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2990:1: ( rule__LengthFacet__Group__2__Impl )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2991:2: rule__LengthFacet__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__LengthFacet__Group__2__Impl_in_rule__LengthFacet__Group__26160);
            rule__LengthFacet__Group__2__Impl();
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
    // $ANTLR end rule__LengthFacet__Group__2


    // $ANTLR start rule__LengthFacet__Group__2__Impl
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:2997:1: rule__LengthFacet__Group__2__Impl : ( ( rule__LengthFacet__LengthAssignment_2 ) ) ;
    public final void rule__LengthFacet__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3001:1: ( ( ( rule__LengthFacet__LengthAssignment_2 ) ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3002:1: ( ( rule__LengthFacet__LengthAssignment_2 ) )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3002:1: ( ( rule__LengthFacet__LengthAssignment_2 ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3003:1: ( rule__LengthFacet__LengthAssignment_2 )
            {
             before(grammarAccess.getLengthFacetAccess().getLengthAssignment_2()); 
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3004:1: ( rule__LengthFacet__LengthAssignment_2 )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3004:2: rule__LengthFacet__LengthAssignment_2
            {
            pushFollow(FOLLOW_rule__LengthFacet__LengthAssignment_2_in_rule__LengthFacet__Group__2__Impl6187);
            rule__LengthFacet__LengthAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getLengthFacetAccess().getLengthAssignment_2()); 

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
    // $ANTLR end rule__LengthFacet__Group__2__Impl


    // $ANTLR start rule__Documentation__Group__0
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3020:1: rule__Documentation__Group__0 : rule__Documentation__Group__0__Impl rule__Documentation__Group__1 ;
    public final void rule__Documentation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3024:1: ( rule__Documentation__Group__0__Impl rule__Documentation__Group__1 )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3025:2: rule__Documentation__Group__0__Impl rule__Documentation__Group__1
            {
            pushFollow(FOLLOW_rule__Documentation__Group__0__Impl_in_rule__Documentation__Group__06223);
            rule__Documentation__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Documentation__Group__1_in_rule__Documentation__Group__06226);
            rule__Documentation__Group__1();
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
    // $ANTLR end rule__Documentation__Group__0


    // $ANTLR start rule__Documentation__Group__0__Impl
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3032:1: rule__Documentation__Group__0__Impl : ( '::' ) ;
    public final void rule__Documentation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3036:1: ( ( '::' ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3037:1: ( '::' )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3037:1: ( '::' )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3038:1: '::'
            {
             before(grammarAccess.getDocumentationAccess().getColonColonKeyword_0()); 
            match(input,36,FOLLOW_36_in_rule__Documentation__Group__0__Impl6254); 
             after(grammarAccess.getDocumentationAccess().getColonColonKeyword_0()); 

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
    // $ANTLR end rule__Documentation__Group__0__Impl


    // $ANTLR start rule__Documentation__Group__1
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3051:1: rule__Documentation__Group__1 : rule__Documentation__Group__1__Impl ;
    public final void rule__Documentation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3055:1: ( rule__Documentation__Group__1__Impl )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3056:2: rule__Documentation__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Documentation__Group__1__Impl_in_rule__Documentation__Group__16285);
            rule__Documentation__Group__1__Impl();
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
    // $ANTLR end rule__Documentation__Group__1


    // $ANTLR start rule__Documentation__Group__1__Impl
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3062:1: rule__Documentation__Group__1__Impl : ( ( rule__Documentation__TextAssignment_1 ) ) ;
    public final void rule__Documentation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3066:1: ( ( ( rule__Documentation__TextAssignment_1 ) ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3067:1: ( ( rule__Documentation__TextAssignment_1 ) )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3067:1: ( ( rule__Documentation__TextAssignment_1 ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3068:1: ( rule__Documentation__TextAssignment_1 )
            {
             before(grammarAccess.getDocumentationAccess().getTextAssignment_1()); 
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3069:1: ( rule__Documentation__TextAssignment_1 )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3069:2: rule__Documentation__TextAssignment_1
            {
            pushFollow(FOLLOW_rule__Documentation__TextAssignment_1_in_rule__Documentation__Group__1__Impl6312);
            rule__Documentation__TextAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getDocumentationAccess().getTextAssignment_1()); 

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
    // $ANTLR end rule__Documentation__Group__1__Impl


    // $ANTLR start rule__TopLevelComplexType__Group__0
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3083:1: rule__TopLevelComplexType__Group__0 : rule__TopLevelComplexType__Group__0__Impl rule__TopLevelComplexType__Group__1 ;
    public final void rule__TopLevelComplexType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3087:1: ( rule__TopLevelComplexType__Group__0__Impl rule__TopLevelComplexType__Group__1 )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3088:2: rule__TopLevelComplexType__Group__0__Impl rule__TopLevelComplexType__Group__1
            {
            pushFollow(FOLLOW_rule__TopLevelComplexType__Group__0__Impl_in_rule__TopLevelComplexType__Group__06346);
            rule__TopLevelComplexType__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TopLevelComplexType__Group__1_in_rule__TopLevelComplexType__Group__06349);
            rule__TopLevelComplexType__Group__1();
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
    // $ANTLR end rule__TopLevelComplexType__Group__0


    // $ANTLR start rule__TopLevelComplexType__Group__0__Impl
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3095:1: rule__TopLevelComplexType__Group__0__Impl : ( ( rule__TopLevelComplexType__AbstractAssignment_0 )? ) ;
    public final void rule__TopLevelComplexType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3099:1: ( ( ( rule__TopLevelComplexType__AbstractAssignment_0 )? ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3100:1: ( ( rule__TopLevelComplexType__AbstractAssignment_0 )? )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3100:1: ( ( rule__TopLevelComplexType__AbstractAssignment_0 )? )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3101:1: ( rule__TopLevelComplexType__AbstractAssignment_0 )?
            {
             before(grammarAccess.getTopLevelComplexTypeAccess().getAbstractAssignment_0()); 
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3102:1: ( rule__TopLevelComplexType__AbstractAssignment_0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==47) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3102:2: rule__TopLevelComplexType__AbstractAssignment_0
                    {
                    pushFollow(FOLLOW_rule__TopLevelComplexType__AbstractAssignment_0_in_rule__TopLevelComplexType__Group__0__Impl6376);
                    rule__TopLevelComplexType__AbstractAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTopLevelComplexTypeAccess().getAbstractAssignment_0()); 

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
    // $ANTLR end rule__TopLevelComplexType__Group__0__Impl


    // $ANTLR start rule__TopLevelComplexType__Group__1
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3112:1: rule__TopLevelComplexType__Group__1 : rule__TopLevelComplexType__Group__1__Impl rule__TopLevelComplexType__Group__2 ;
    public final void rule__TopLevelComplexType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3116:1: ( rule__TopLevelComplexType__Group__1__Impl rule__TopLevelComplexType__Group__2 )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3117:2: rule__TopLevelComplexType__Group__1__Impl rule__TopLevelComplexType__Group__2
            {
            pushFollow(FOLLOW_rule__TopLevelComplexType__Group__1__Impl_in_rule__TopLevelComplexType__Group__16407);
            rule__TopLevelComplexType__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TopLevelComplexType__Group__2_in_rule__TopLevelComplexType__Group__16410);
            rule__TopLevelComplexType__Group__2();
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
    // $ANTLR end rule__TopLevelComplexType__Group__1


    // $ANTLR start rule__TopLevelComplexType__Group__1__Impl
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3124:1: rule__TopLevelComplexType__Group__1__Impl : ( 'complex-type' ) ;
    public final void rule__TopLevelComplexType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3128:1: ( ( 'complex-type' ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3129:1: ( 'complex-type' )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3129:1: ( 'complex-type' )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3130:1: 'complex-type'
            {
             before(grammarAccess.getTopLevelComplexTypeAccess().getComplexTypeKeyword_1()); 
            match(input,43,FOLLOW_43_in_rule__TopLevelComplexType__Group__1__Impl6438); 
             after(grammarAccess.getTopLevelComplexTypeAccess().getComplexTypeKeyword_1()); 

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
    // $ANTLR end rule__TopLevelComplexType__Group__1__Impl


    // $ANTLR start rule__TopLevelComplexType__Group__2
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3143:1: rule__TopLevelComplexType__Group__2 : rule__TopLevelComplexType__Group__2__Impl rule__TopLevelComplexType__Group__3 ;
    public final void rule__TopLevelComplexType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3147:1: ( rule__TopLevelComplexType__Group__2__Impl rule__TopLevelComplexType__Group__3 )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3148:2: rule__TopLevelComplexType__Group__2__Impl rule__TopLevelComplexType__Group__3
            {
            pushFollow(FOLLOW_rule__TopLevelComplexType__Group__2__Impl_in_rule__TopLevelComplexType__Group__26469);
            rule__TopLevelComplexType__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TopLevelComplexType__Group__3_in_rule__TopLevelComplexType__Group__26472);
            rule__TopLevelComplexType__Group__3();
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
    // $ANTLR end rule__TopLevelComplexType__Group__2


    // $ANTLR start rule__TopLevelComplexType__Group__2__Impl
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3155:1: rule__TopLevelComplexType__Group__2__Impl : ( ( rule__TopLevelComplexType__NameAssignment_2 ) ) ;
    public final void rule__TopLevelComplexType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3159:1: ( ( ( rule__TopLevelComplexType__NameAssignment_2 ) ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3160:1: ( ( rule__TopLevelComplexType__NameAssignment_2 ) )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3160:1: ( ( rule__TopLevelComplexType__NameAssignment_2 ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3161:1: ( rule__TopLevelComplexType__NameAssignment_2 )
            {
             before(grammarAccess.getTopLevelComplexTypeAccess().getNameAssignment_2()); 
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3162:1: ( rule__TopLevelComplexType__NameAssignment_2 )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3162:2: rule__TopLevelComplexType__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__TopLevelComplexType__NameAssignment_2_in_rule__TopLevelComplexType__Group__2__Impl6499);
            rule__TopLevelComplexType__NameAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getTopLevelComplexTypeAccess().getNameAssignment_2()); 

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
    // $ANTLR end rule__TopLevelComplexType__Group__2__Impl


    // $ANTLR start rule__TopLevelComplexType__Group__3
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3172:1: rule__TopLevelComplexType__Group__3 : rule__TopLevelComplexType__Group__3__Impl rule__TopLevelComplexType__Group__4 ;
    public final void rule__TopLevelComplexType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3176:1: ( rule__TopLevelComplexType__Group__3__Impl rule__TopLevelComplexType__Group__4 )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3177:2: rule__TopLevelComplexType__Group__3__Impl rule__TopLevelComplexType__Group__4
            {
            pushFollow(FOLLOW_rule__TopLevelComplexType__Group__3__Impl_in_rule__TopLevelComplexType__Group__36529);
            rule__TopLevelComplexType__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TopLevelComplexType__Group__4_in_rule__TopLevelComplexType__Group__36532);
            rule__TopLevelComplexType__Group__4();
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
    // $ANTLR end rule__TopLevelComplexType__Group__3


    // $ANTLR start rule__TopLevelComplexType__Group__3__Impl
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3184:1: rule__TopLevelComplexType__Group__3__Impl : ( ( rule__TopLevelComplexType__Group_3__0 )? ) ;
    public final void rule__TopLevelComplexType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3188:1: ( ( ( rule__TopLevelComplexType__Group_3__0 )? ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3189:1: ( ( rule__TopLevelComplexType__Group_3__0 )? )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3189:1: ( ( rule__TopLevelComplexType__Group_3__0 )? )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3190:1: ( rule__TopLevelComplexType__Group_3__0 )?
            {
             before(grammarAccess.getTopLevelComplexTypeAccess().getGroup_3()); 
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3191:1: ( rule__TopLevelComplexType__Group_3__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==44) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3191:2: rule__TopLevelComplexType__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__TopLevelComplexType__Group_3__0_in_rule__TopLevelComplexType__Group__3__Impl6559);
                    rule__TopLevelComplexType__Group_3__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTopLevelComplexTypeAccess().getGroup_3()); 

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
    // $ANTLR end rule__TopLevelComplexType__Group__3__Impl


    // $ANTLR start rule__TopLevelComplexType__Group__4
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3201:1: rule__TopLevelComplexType__Group__4 : rule__TopLevelComplexType__Group__4__Impl rule__TopLevelComplexType__Group__5 ;
    public final void rule__TopLevelComplexType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3205:1: ( rule__TopLevelComplexType__Group__4__Impl rule__TopLevelComplexType__Group__5 )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3206:2: rule__TopLevelComplexType__Group__4__Impl rule__TopLevelComplexType__Group__5
            {
            pushFollow(FOLLOW_rule__TopLevelComplexType__Group__4__Impl_in_rule__TopLevelComplexType__Group__46590);
            rule__TopLevelComplexType__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TopLevelComplexType__Group__5_in_rule__TopLevelComplexType__Group__46593);
            rule__TopLevelComplexType__Group__5();
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
    // $ANTLR end rule__TopLevelComplexType__Group__4


    // $ANTLR start rule__TopLevelComplexType__Group__4__Impl
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3213:1: rule__TopLevelComplexType__Group__4__Impl : ( '{' ) ;
    public final void rule__TopLevelComplexType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3217:1: ( ( '{' ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3218:1: ( '{' )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3218:1: ( '{' )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3219:1: '{'
            {
             before(grammarAccess.getTopLevelComplexTypeAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,34,FOLLOW_34_in_rule__TopLevelComplexType__Group__4__Impl6621); 
             after(grammarAccess.getTopLevelComplexTypeAccess().getLeftCurlyBracketKeyword_4()); 

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
    // $ANTLR end rule__TopLevelComplexType__Group__4__Impl


    // $ANTLR start rule__TopLevelComplexType__Group__5
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3232:1: rule__TopLevelComplexType__Group__5 : rule__TopLevelComplexType__Group__5__Impl rule__TopLevelComplexType__Group__6 ;
    public final void rule__TopLevelComplexType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3236:1: ( rule__TopLevelComplexType__Group__5__Impl rule__TopLevelComplexType__Group__6 )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3237:2: rule__TopLevelComplexType__Group__5__Impl rule__TopLevelComplexType__Group__6
            {
            pushFollow(FOLLOW_rule__TopLevelComplexType__Group__5__Impl_in_rule__TopLevelComplexType__Group__56652);
            rule__TopLevelComplexType__Group__5__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TopLevelComplexType__Group__6_in_rule__TopLevelComplexType__Group__56655);
            rule__TopLevelComplexType__Group__6();
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
    // $ANTLR end rule__TopLevelComplexType__Group__5


    // $ANTLR start rule__TopLevelComplexType__Group__5__Impl
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3244:1: rule__TopLevelComplexType__Group__5__Impl : ( ( rule__TopLevelComplexType__PropertiesAssignment_5 )* ) ;
    public final void rule__TopLevelComplexType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3248:1: ( ( ( rule__TopLevelComplexType__PropertiesAssignment_5 )* ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3249:1: ( ( rule__TopLevelComplexType__PropertiesAssignment_5 )* )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3249:1: ( ( rule__TopLevelComplexType__PropertiesAssignment_5 )* )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3250:1: ( rule__TopLevelComplexType__PropertiesAssignment_5 )*
            {
             before(grammarAccess.getTopLevelComplexTypeAccess().getPropertiesAssignment_5()); 
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3251:1: ( rule__TopLevelComplexType__PropertiesAssignment_5 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_ID||LA25_0==46||LA25_0==48) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3251:2: rule__TopLevelComplexType__PropertiesAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__TopLevelComplexType__PropertiesAssignment_5_in_rule__TopLevelComplexType__Group__5__Impl6682);
            	    rule__TopLevelComplexType__PropertiesAssignment_5();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getTopLevelComplexTypeAccess().getPropertiesAssignment_5()); 

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
    // $ANTLR end rule__TopLevelComplexType__Group__5__Impl


    // $ANTLR start rule__TopLevelComplexType__Group__6
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3261:1: rule__TopLevelComplexType__Group__6 : rule__TopLevelComplexType__Group__6__Impl rule__TopLevelComplexType__Group__7 ;
    public final void rule__TopLevelComplexType__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3265:1: ( rule__TopLevelComplexType__Group__6__Impl rule__TopLevelComplexType__Group__7 )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3266:2: rule__TopLevelComplexType__Group__6__Impl rule__TopLevelComplexType__Group__7
            {
            pushFollow(FOLLOW_rule__TopLevelComplexType__Group__6__Impl_in_rule__TopLevelComplexType__Group__66713);
            rule__TopLevelComplexType__Group__6__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TopLevelComplexType__Group__7_in_rule__TopLevelComplexType__Group__66716);
            rule__TopLevelComplexType__Group__7();
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
    // $ANTLR end rule__TopLevelComplexType__Group__6


    // $ANTLR start rule__TopLevelComplexType__Group__6__Impl
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3273:1: rule__TopLevelComplexType__Group__6__Impl : ( '}' ) ;
    public final void rule__TopLevelComplexType__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3277:1: ( ( '}' ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3278:1: ( '}' )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3278:1: ( '}' )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3279:1: '}'
            {
             before(grammarAccess.getTopLevelComplexTypeAccess().getRightCurlyBracketKeyword_6()); 
            match(input,35,FOLLOW_35_in_rule__TopLevelComplexType__Group__6__Impl6744); 
             after(grammarAccess.getTopLevelComplexTypeAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end rule__TopLevelComplexType__Group__6__Impl


    // $ANTLR start rule__TopLevelComplexType__Group__7
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3292:1: rule__TopLevelComplexType__Group__7 : rule__TopLevelComplexType__Group__7__Impl ;
    public final void rule__TopLevelComplexType__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3296:1: ( rule__TopLevelComplexType__Group__7__Impl )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3297:2: rule__TopLevelComplexType__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__TopLevelComplexType__Group__7__Impl_in_rule__TopLevelComplexType__Group__76775);
            rule__TopLevelComplexType__Group__7__Impl();
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
    // $ANTLR end rule__TopLevelComplexType__Group__7


    // $ANTLR start rule__TopLevelComplexType__Group__7__Impl
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3303:1: rule__TopLevelComplexType__Group__7__Impl : ( ( rule__TopLevelComplexType__Group_7__0 )? ) ;
    public final void rule__TopLevelComplexType__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3307:1: ( ( ( rule__TopLevelComplexType__Group_7__0 )? ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3308:1: ( ( rule__TopLevelComplexType__Group_7__0 )? )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3308:1: ( ( rule__TopLevelComplexType__Group_7__0 )? )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3309:1: ( rule__TopLevelComplexType__Group_7__0 )?
            {
             before(grammarAccess.getTopLevelComplexTypeAccess().getGroup_7()); 
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3310:1: ( rule__TopLevelComplexType__Group_7__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==45) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3310:2: rule__TopLevelComplexType__Group_7__0
                    {
                    pushFollow(FOLLOW_rule__TopLevelComplexType__Group_7__0_in_rule__TopLevelComplexType__Group__7__Impl6802);
                    rule__TopLevelComplexType__Group_7__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTopLevelComplexTypeAccess().getGroup_7()); 

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
    // $ANTLR end rule__TopLevelComplexType__Group__7__Impl


    // $ANTLR start rule__TopLevelComplexType__Group_3__0
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3336:1: rule__TopLevelComplexType__Group_3__0 : rule__TopLevelComplexType__Group_3__0__Impl rule__TopLevelComplexType__Group_3__1 ;
    public final void rule__TopLevelComplexType__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3340:1: ( rule__TopLevelComplexType__Group_3__0__Impl rule__TopLevelComplexType__Group_3__1 )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3341:2: rule__TopLevelComplexType__Group_3__0__Impl rule__TopLevelComplexType__Group_3__1
            {
            pushFollow(FOLLOW_rule__TopLevelComplexType__Group_3__0__Impl_in_rule__TopLevelComplexType__Group_3__06849);
            rule__TopLevelComplexType__Group_3__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TopLevelComplexType__Group_3__1_in_rule__TopLevelComplexType__Group_3__06852);
            rule__TopLevelComplexType__Group_3__1();
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
    // $ANTLR end rule__TopLevelComplexType__Group_3__0


    // $ANTLR start rule__TopLevelComplexType__Group_3__0__Impl
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3348:1: rule__TopLevelComplexType__Group_3__0__Impl : ( 'extends' ) ;
    public final void rule__TopLevelComplexType__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3352:1: ( ( 'extends' ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3353:1: ( 'extends' )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3353:1: ( 'extends' )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3354:1: 'extends'
            {
             before(grammarAccess.getTopLevelComplexTypeAccess().getExtendsKeyword_3_0()); 
            match(input,44,FOLLOW_44_in_rule__TopLevelComplexType__Group_3__0__Impl6880); 
             after(grammarAccess.getTopLevelComplexTypeAccess().getExtendsKeyword_3_0()); 

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
    // $ANTLR end rule__TopLevelComplexType__Group_3__0__Impl


    // $ANTLR start rule__TopLevelComplexType__Group_3__1
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3367:1: rule__TopLevelComplexType__Group_3__1 : rule__TopLevelComplexType__Group_3__1__Impl ;
    public final void rule__TopLevelComplexType__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3371:1: ( rule__TopLevelComplexType__Group_3__1__Impl )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3372:2: rule__TopLevelComplexType__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__TopLevelComplexType__Group_3__1__Impl_in_rule__TopLevelComplexType__Group_3__16911);
            rule__TopLevelComplexType__Group_3__1__Impl();
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
    // $ANTLR end rule__TopLevelComplexType__Group_3__1


    // $ANTLR start rule__TopLevelComplexType__Group_3__1__Impl
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3378:1: rule__TopLevelComplexType__Group_3__1__Impl : ( ( rule__TopLevelComplexType__ExtendsAssignment_3_1 ) ) ;
    public final void rule__TopLevelComplexType__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3382:1: ( ( ( rule__TopLevelComplexType__ExtendsAssignment_3_1 ) ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3383:1: ( ( rule__TopLevelComplexType__ExtendsAssignment_3_1 ) )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3383:1: ( ( rule__TopLevelComplexType__ExtendsAssignment_3_1 ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3384:1: ( rule__TopLevelComplexType__ExtendsAssignment_3_1 )
            {
             before(grammarAccess.getTopLevelComplexTypeAccess().getExtendsAssignment_3_1()); 
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3385:1: ( rule__TopLevelComplexType__ExtendsAssignment_3_1 )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3385:2: rule__TopLevelComplexType__ExtendsAssignment_3_1
            {
            pushFollow(FOLLOW_rule__TopLevelComplexType__ExtendsAssignment_3_1_in_rule__TopLevelComplexType__Group_3__1__Impl6938);
            rule__TopLevelComplexType__ExtendsAssignment_3_1();
            _fsp--;


            }

             after(grammarAccess.getTopLevelComplexTypeAccess().getExtendsAssignment_3_1()); 

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
    // $ANTLR end rule__TopLevelComplexType__Group_3__1__Impl


    // $ANTLR start rule__TopLevelComplexType__Group_7__0
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3399:1: rule__TopLevelComplexType__Group_7__0 : rule__TopLevelComplexType__Group_7__0__Impl rule__TopLevelComplexType__Group_7__1 ;
    public final void rule__TopLevelComplexType__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3403:1: ( rule__TopLevelComplexType__Group_7__0__Impl rule__TopLevelComplexType__Group_7__1 )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3404:2: rule__TopLevelComplexType__Group_7__0__Impl rule__TopLevelComplexType__Group_7__1
            {
            pushFollow(FOLLOW_rule__TopLevelComplexType__Group_7__0__Impl_in_rule__TopLevelComplexType__Group_7__06972);
            rule__TopLevelComplexType__Group_7__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TopLevelComplexType__Group_7__1_in_rule__TopLevelComplexType__Group_7__06975);
            rule__TopLevelComplexType__Group_7__1();
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
    // $ANTLR end rule__TopLevelComplexType__Group_7__0


    // $ANTLR start rule__TopLevelComplexType__Group_7__0__Impl
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3411:1: rule__TopLevelComplexType__Group_7__0__Impl : ( 'documentation:' ) ;
    public final void rule__TopLevelComplexType__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3415:1: ( ( 'documentation:' ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3416:1: ( 'documentation:' )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3416:1: ( 'documentation:' )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3417:1: 'documentation:'
            {
             before(grammarAccess.getTopLevelComplexTypeAccess().getDocumentationKeyword_7_0()); 
            match(input,45,FOLLOW_45_in_rule__TopLevelComplexType__Group_7__0__Impl7003); 
             after(grammarAccess.getTopLevelComplexTypeAccess().getDocumentationKeyword_7_0()); 

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
    // $ANTLR end rule__TopLevelComplexType__Group_7__0__Impl


    // $ANTLR start rule__TopLevelComplexType__Group_7__1
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3430:1: rule__TopLevelComplexType__Group_7__1 : rule__TopLevelComplexType__Group_7__1__Impl ;
    public final void rule__TopLevelComplexType__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3434:1: ( rule__TopLevelComplexType__Group_7__1__Impl )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3435:2: rule__TopLevelComplexType__Group_7__1__Impl
            {
            pushFollow(FOLLOW_rule__TopLevelComplexType__Group_7__1__Impl_in_rule__TopLevelComplexType__Group_7__17034);
            rule__TopLevelComplexType__Group_7__1__Impl();
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
    // $ANTLR end rule__TopLevelComplexType__Group_7__1


    // $ANTLR start rule__TopLevelComplexType__Group_7__1__Impl
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3441:1: rule__TopLevelComplexType__Group_7__1__Impl : ( ( rule__TopLevelComplexType__DocumentationAssignment_7_1 ) ) ;
    public final void rule__TopLevelComplexType__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3445:1: ( ( ( rule__TopLevelComplexType__DocumentationAssignment_7_1 ) ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3446:1: ( ( rule__TopLevelComplexType__DocumentationAssignment_7_1 ) )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3446:1: ( ( rule__TopLevelComplexType__DocumentationAssignment_7_1 ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3447:1: ( rule__TopLevelComplexType__DocumentationAssignment_7_1 )
            {
             before(grammarAccess.getTopLevelComplexTypeAccess().getDocumentationAssignment_7_1()); 
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3448:1: ( rule__TopLevelComplexType__DocumentationAssignment_7_1 )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3448:2: rule__TopLevelComplexType__DocumentationAssignment_7_1
            {
            pushFollow(FOLLOW_rule__TopLevelComplexType__DocumentationAssignment_7_1_in_rule__TopLevelComplexType__Group_7__1__Impl7061);
            rule__TopLevelComplexType__DocumentationAssignment_7_1();
            _fsp--;


            }

             after(grammarAccess.getTopLevelComplexTypeAccess().getDocumentationAssignment_7_1()); 

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
    // $ANTLR end rule__TopLevelComplexType__Group_7__1__Impl


    // $ANTLR start rule__Element__Group__0
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3462:1: rule__Element__Group__0 : rule__Element__Group__0__Impl rule__Element__Group__1 ;
    public final void rule__Element__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3466:1: ( rule__Element__Group__0__Impl rule__Element__Group__1 )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3467:2: rule__Element__Group__0__Impl rule__Element__Group__1
            {
            pushFollow(FOLLOW_rule__Element__Group__0__Impl_in_rule__Element__Group__07095);
            rule__Element__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Element__Group__1_in_rule__Element__Group__07098);
            rule__Element__Group__1();
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
    // $ANTLR end rule__Element__Group__0


    // $ANTLR start rule__Element__Group__0__Impl
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3474:1: rule__Element__Group__0__Impl : ( ( rule__Element__NameAssignment_0 ) ) ;
    public final void rule__Element__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3478:1: ( ( ( rule__Element__NameAssignment_0 ) ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3479:1: ( ( rule__Element__NameAssignment_0 ) )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3479:1: ( ( rule__Element__NameAssignment_0 ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3480:1: ( rule__Element__NameAssignment_0 )
            {
             before(grammarAccess.getElementAccess().getNameAssignment_0()); 
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3481:1: ( rule__Element__NameAssignment_0 )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3481:2: rule__Element__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Element__NameAssignment_0_in_rule__Element__Group__0__Impl7125);
            rule__Element__NameAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getElementAccess().getNameAssignment_0()); 

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
    // $ANTLR end rule__Element__Group__0__Impl


    // $ANTLR start rule__Element__Group__1
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3491:1: rule__Element__Group__1 : rule__Element__Group__1__Impl rule__Element__Group__2 ;
    public final void rule__Element__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3495:1: ( rule__Element__Group__1__Impl rule__Element__Group__2 )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3496:2: rule__Element__Group__1__Impl rule__Element__Group__2
            {
            pushFollow(FOLLOW_rule__Element__Group__1__Impl_in_rule__Element__Group__17155);
            rule__Element__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Element__Group__2_in_rule__Element__Group__17158);
            rule__Element__Group__2();
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
    // $ANTLR end rule__Element__Group__1


    // $ANTLR start rule__Element__Group__1__Impl
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3503:1: rule__Element__Group__1__Impl : ( ( rule__Element__Alternatives_1 ) ) ;
    public final void rule__Element__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3507:1: ( ( ( rule__Element__Alternatives_1 ) ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3508:1: ( ( rule__Element__Alternatives_1 ) )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3508:1: ( ( rule__Element__Alternatives_1 ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3509:1: ( rule__Element__Alternatives_1 )
            {
             before(grammarAccess.getElementAccess().getAlternatives_1()); 
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3510:1: ( rule__Element__Alternatives_1 )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3510:2: rule__Element__Alternatives_1
            {
            pushFollow(FOLLOW_rule__Element__Alternatives_1_in_rule__Element__Group__1__Impl7185);
            rule__Element__Alternatives_1();
            _fsp--;


            }

             after(grammarAccess.getElementAccess().getAlternatives_1()); 

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
    // $ANTLR end rule__Element__Group__1__Impl


    // $ANTLR start rule__Element__Group__2
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3520:1: rule__Element__Group__2 : rule__Element__Group__2__Impl ;
    public final void rule__Element__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3524:1: ( rule__Element__Group__2__Impl )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3525:2: rule__Element__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Element__Group__2__Impl_in_rule__Element__Group__27215);
            rule__Element__Group__2__Impl();
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
    // $ANTLR end rule__Element__Group__2


    // $ANTLR start rule__Element__Group__2__Impl
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3531:1: rule__Element__Group__2__Impl : ( ( rule__Element__MultiplicityAssignment_2 )? ) ;
    public final void rule__Element__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3535:1: ( ( ( rule__Element__MultiplicityAssignment_2 )? ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3536:1: ( ( rule__Element__MultiplicityAssignment_2 )? )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3536:1: ( ( rule__Element__MultiplicityAssignment_2 )? )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3537:1: ( rule__Element__MultiplicityAssignment_2 )?
            {
             before(grammarAccess.getElementAccess().getMultiplicityAssignment_2()); 
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3538:1: ( rule__Element__MultiplicityAssignment_2 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==31) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3538:2: rule__Element__MultiplicityAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Element__MultiplicityAssignment_2_in_rule__Element__Group__2__Impl7242);
                    rule__Element__MultiplicityAssignment_2();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getElementAccess().getMultiplicityAssignment_2()); 

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
    // $ANTLR end rule__Element__Group__2__Impl


    // $ANTLR start rule__Element__Group_1_0__0
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3554:1: rule__Element__Group_1_0__0 : rule__Element__Group_1_0__0__Impl rule__Element__Group_1_0__1 ;
    public final void rule__Element__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3558:1: ( rule__Element__Group_1_0__0__Impl rule__Element__Group_1_0__1 )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3559:2: rule__Element__Group_1_0__0__Impl rule__Element__Group_1_0__1
            {
            pushFollow(FOLLOW_rule__Element__Group_1_0__0__Impl_in_rule__Element__Group_1_0__07279);
            rule__Element__Group_1_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Element__Group_1_0__1_in_rule__Element__Group_1_0__07282);
            rule__Element__Group_1_0__1();
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
    // $ANTLR end rule__Element__Group_1_0__0


    // $ANTLR start rule__Element__Group_1_0__0__Impl
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3566:1: rule__Element__Group_1_0__0__Impl : ( '->' ) ;
    public final void rule__Element__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3570:1: ( ( '->' ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3571:1: ( '->' )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3571:1: ( '->' )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3572:1: '->'
            {
             before(grammarAccess.getElementAccess().getHyphenMinusGreaterThanSignKeyword_1_0_0()); 
            match(input,28,FOLLOW_28_in_rule__Element__Group_1_0__0__Impl7310); 
             after(grammarAccess.getElementAccess().getHyphenMinusGreaterThanSignKeyword_1_0_0()); 

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
    // $ANTLR end rule__Element__Group_1_0__0__Impl


    // $ANTLR start rule__Element__Group_1_0__1
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3585:1: rule__Element__Group_1_0__1 : rule__Element__Group_1_0__1__Impl ;
    public final void rule__Element__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3589:1: ( rule__Element__Group_1_0__1__Impl )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3590:2: rule__Element__Group_1_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Element__Group_1_0__1__Impl_in_rule__Element__Group_1_0__17341);
            rule__Element__Group_1_0__1__Impl();
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
    // $ANTLR end rule__Element__Group_1_0__1


    // $ANTLR start rule__Element__Group_1_0__1__Impl
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3596:1: rule__Element__Group_1_0__1__Impl : ( ( rule__Element__TypeRefAssignment_1_0_1 ) ) ;
    public final void rule__Element__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3600:1: ( ( ( rule__Element__TypeRefAssignment_1_0_1 ) ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3601:1: ( ( rule__Element__TypeRefAssignment_1_0_1 ) )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3601:1: ( ( rule__Element__TypeRefAssignment_1_0_1 ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3602:1: ( rule__Element__TypeRefAssignment_1_0_1 )
            {
             before(grammarAccess.getElementAccess().getTypeRefAssignment_1_0_1()); 
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3603:1: ( rule__Element__TypeRefAssignment_1_0_1 )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3603:2: rule__Element__TypeRefAssignment_1_0_1
            {
            pushFollow(FOLLOW_rule__Element__TypeRefAssignment_1_0_1_in_rule__Element__Group_1_0__1__Impl7368);
            rule__Element__TypeRefAssignment_1_0_1();
            _fsp--;


            }

             after(grammarAccess.getElementAccess().getTypeRefAssignment_1_0_1()); 

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
    // $ANTLR end rule__Element__Group_1_0__1__Impl


    // $ANTLR start rule__Element__Group_1_1__0
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3617:1: rule__Element__Group_1_1__0 : rule__Element__Group_1_1__0__Impl rule__Element__Group_1_1__1 ;
    public final void rule__Element__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3621:1: ( rule__Element__Group_1_1__0__Impl rule__Element__Group_1_1__1 )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3622:2: rule__Element__Group_1_1__0__Impl rule__Element__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__Element__Group_1_1__0__Impl_in_rule__Element__Group_1_1__07402);
            rule__Element__Group_1_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Element__Group_1_1__1_in_rule__Element__Group_1_1__07405);
            rule__Element__Group_1_1__1();
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
    // $ANTLR end rule__Element__Group_1_1__0


    // $ANTLR start rule__Element__Group_1_1__0__Impl
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3629:1: rule__Element__Group_1_1__0__Impl : ( ':' ) ;
    public final void rule__Element__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3633:1: ( ( ':' ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3634:1: ( ':' )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3634:1: ( ':' )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3635:1: ':'
            {
             before(grammarAccess.getElementAccess().getColonKeyword_1_1_0()); 
            match(input,29,FOLLOW_29_in_rule__Element__Group_1_1__0__Impl7433); 
             after(grammarAccess.getElementAccess().getColonKeyword_1_1_0()); 

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
    // $ANTLR end rule__Element__Group_1_1__0__Impl


    // $ANTLR start rule__Element__Group_1_1__1
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3648:1: rule__Element__Group_1_1__1 : rule__Element__Group_1_1__1__Impl ;
    public final void rule__Element__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3652:1: ( rule__Element__Group_1_1__1__Impl )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3653:2: rule__Element__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Element__Group_1_1__1__Impl_in_rule__Element__Group_1_1__17464);
            rule__Element__Group_1_1__1__Impl();
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
    // $ANTLR end rule__Element__Group_1_1__1


    // $ANTLR start rule__Element__Group_1_1__1__Impl
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3659:1: rule__Element__Group_1_1__1__Impl : ( ( rule__Element__EmbeddedTypeDefAssignment_1_1_1 ) ) ;
    public final void rule__Element__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3663:1: ( ( ( rule__Element__EmbeddedTypeDefAssignment_1_1_1 ) ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3664:1: ( ( rule__Element__EmbeddedTypeDefAssignment_1_1_1 ) )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3664:1: ( ( rule__Element__EmbeddedTypeDefAssignment_1_1_1 ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3665:1: ( rule__Element__EmbeddedTypeDefAssignment_1_1_1 )
            {
             before(grammarAccess.getElementAccess().getEmbeddedTypeDefAssignment_1_1_1()); 
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3666:1: ( rule__Element__EmbeddedTypeDefAssignment_1_1_1 )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3666:2: rule__Element__EmbeddedTypeDefAssignment_1_1_1
            {
            pushFollow(FOLLOW_rule__Element__EmbeddedTypeDefAssignment_1_1_1_in_rule__Element__Group_1_1__1__Impl7491);
            rule__Element__EmbeddedTypeDefAssignment_1_1_1();
            _fsp--;


            }

             after(grammarAccess.getElementAccess().getEmbeddedTypeDefAssignment_1_1_1()); 

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
    // $ANTLR end rule__Element__Group_1_1__1__Impl


    // $ANTLR start rule__Attribute__Group__0
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3680:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3684:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3685:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_rule__Attribute__Group__0__Impl_in_rule__Attribute__Group__07525);
            rule__Attribute__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group__1_in_rule__Attribute__Group__07528);
            rule__Attribute__Group__1();
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
    // $ANTLR end rule__Attribute__Group__0


    // $ANTLR start rule__Attribute__Group__0__Impl
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3692:1: rule__Attribute__Group__0__Impl : ( ( rule__Attribute__RequiredAssignment_0 )? ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3696:1: ( ( ( rule__Attribute__RequiredAssignment_0 )? ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3697:1: ( ( rule__Attribute__RequiredAssignment_0 )? )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3697:1: ( ( rule__Attribute__RequiredAssignment_0 )? )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3698:1: ( rule__Attribute__RequiredAssignment_0 )?
            {
             before(grammarAccess.getAttributeAccess().getRequiredAssignment_0()); 
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3699:1: ( rule__Attribute__RequiredAssignment_0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==48) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3699:2: rule__Attribute__RequiredAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Attribute__RequiredAssignment_0_in_rule__Attribute__Group__0__Impl7555);
                    rule__Attribute__RequiredAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttributeAccess().getRequiredAssignment_0()); 

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
    // $ANTLR end rule__Attribute__Group__0__Impl


    // $ANTLR start rule__Attribute__Group__1
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3709:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3713:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3714:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_rule__Attribute__Group__1__Impl_in_rule__Attribute__Group__17586);
            rule__Attribute__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group__2_in_rule__Attribute__Group__17589);
            rule__Attribute__Group__2();
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
    // $ANTLR end rule__Attribute__Group__1


    // $ANTLR start rule__Attribute__Group__1__Impl
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3721:1: rule__Attribute__Group__1__Impl : ( '@' ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3725:1: ( ( '@' ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3726:1: ( '@' )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3726:1: ( '@' )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3727:1: '@'
            {
             before(grammarAccess.getAttributeAccess().getCommercialAtKeyword_1()); 
            match(input,46,FOLLOW_46_in_rule__Attribute__Group__1__Impl7617); 
             after(grammarAccess.getAttributeAccess().getCommercialAtKeyword_1()); 

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
    // $ANTLR end rule__Attribute__Group__1__Impl


    // $ANTLR start rule__Attribute__Group__2
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3740:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl rule__Attribute__Group__3 ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3744:1: ( rule__Attribute__Group__2__Impl rule__Attribute__Group__3 )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3745:2: rule__Attribute__Group__2__Impl rule__Attribute__Group__3
            {
            pushFollow(FOLLOW_rule__Attribute__Group__2__Impl_in_rule__Attribute__Group__27648);
            rule__Attribute__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group__3_in_rule__Attribute__Group__27651);
            rule__Attribute__Group__3();
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
    // $ANTLR end rule__Attribute__Group__2


    // $ANTLR start rule__Attribute__Group__2__Impl
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3752:1: rule__Attribute__Group__2__Impl : ( ( rule__Attribute__NameAssignment_2 ) ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3756:1: ( ( ( rule__Attribute__NameAssignment_2 ) ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3757:1: ( ( rule__Attribute__NameAssignment_2 ) )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3757:1: ( ( rule__Attribute__NameAssignment_2 ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3758:1: ( rule__Attribute__NameAssignment_2 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_2()); 
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3759:1: ( rule__Attribute__NameAssignment_2 )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3759:2: rule__Attribute__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Attribute__NameAssignment_2_in_rule__Attribute__Group__2__Impl7678);
            rule__Attribute__NameAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getAttributeAccess().getNameAssignment_2()); 

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
    // $ANTLR end rule__Attribute__Group__2__Impl


    // $ANTLR start rule__Attribute__Group__3
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3769:1: rule__Attribute__Group__3 : rule__Attribute__Group__3__Impl rule__Attribute__Group__4 ;
    public final void rule__Attribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3773:1: ( rule__Attribute__Group__3__Impl rule__Attribute__Group__4 )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3774:2: rule__Attribute__Group__3__Impl rule__Attribute__Group__4
            {
            pushFollow(FOLLOW_rule__Attribute__Group__3__Impl_in_rule__Attribute__Group__37708);
            rule__Attribute__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group__4_in_rule__Attribute__Group__37711);
            rule__Attribute__Group__4();
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
    // $ANTLR end rule__Attribute__Group__3


    // $ANTLR start rule__Attribute__Group__3__Impl
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3781:1: rule__Attribute__Group__3__Impl : ( '->' ) ;
    public final void rule__Attribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3785:1: ( ( '->' ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3786:1: ( '->' )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3786:1: ( '->' )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3787:1: '->'
            {
             before(grammarAccess.getAttributeAccess().getHyphenMinusGreaterThanSignKeyword_3()); 
            match(input,28,FOLLOW_28_in_rule__Attribute__Group__3__Impl7739); 
             after(grammarAccess.getAttributeAccess().getHyphenMinusGreaterThanSignKeyword_3()); 

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
    // $ANTLR end rule__Attribute__Group__3__Impl


    // $ANTLR start rule__Attribute__Group__4
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3800:1: rule__Attribute__Group__4 : rule__Attribute__Group__4__Impl ;
    public final void rule__Attribute__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3804:1: ( rule__Attribute__Group__4__Impl )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3805:2: rule__Attribute__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Attribute__Group__4__Impl_in_rule__Attribute__Group__47770);
            rule__Attribute__Group__4__Impl();
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
    // $ANTLR end rule__Attribute__Group__4


    // $ANTLR start rule__Attribute__Group__4__Impl
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3811:1: rule__Attribute__Group__4__Impl : ( ( rule__Attribute__TypeRefAssignment_4 ) ) ;
    public final void rule__Attribute__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3815:1: ( ( ( rule__Attribute__TypeRefAssignment_4 ) ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3816:1: ( ( rule__Attribute__TypeRefAssignment_4 ) )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3816:1: ( ( rule__Attribute__TypeRefAssignment_4 ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3817:1: ( rule__Attribute__TypeRefAssignment_4 )
            {
             before(grammarAccess.getAttributeAccess().getTypeRefAssignment_4()); 
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3818:1: ( rule__Attribute__TypeRefAssignment_4 )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3818:2: rule__Attribute__TypeRefAssignment_4
            {
            pushFollow(FOLLOW_rule__Attribute__TypeRefAssignment_4_in_rule__Attribute__Group__4__Impl7797);
            rule__Attribute__TypeRefAssignment_4();
            _fsp--;


            }

             after(grammarAccess.getAttributeAccess().getTypeRefAssignment_4()); 

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
    // $ANTLR end rule__Attribute__Group__4__Impl


    // $ANTLR start rule__Multiplicity__Group__0
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3838:1: rule__Multiplicity__Group__0 : rule__Multiplicity__Group__0__Impl rule__Multiplicity__Group__1 ;
    public final void rule__Multiplicity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3842:1: ( rule__Multiplicity__Group__0__Impl rule__Multiplicity__Group__1 )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3843:2: rule__Multiplicity__Group__0__Impl rule__Multiplicity__Group__1
            {
            pushFollow(FOLLOW_rule__Multiplicity__Group__0__Impl_in_rule__Multiplicity__Group__07837);
            rule__Multiplicity__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Multiplicity__Group__1_in_rule__Multiplicity__Group__07840);
            rule__Multiplicity__Group__1();
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
    // $ANTLR end rule__Multiplicity__Group__0


    // $ANTLR start rule__Multiplicity__Group__0__Impl
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3850:1: rule__Multiplicity__Group__0__Impl : ( () ) ;
    public final void rule__Multiplicity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3854:1: ( ( () ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3855:1: ( () )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3855:1: ( () )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3856:1: ()
            {
             before(grammarAccess.getMultiplicityAccess().getMultiplicityAction_0()); 
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3857:1: ()
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3859:1: 
            {
            }

             after(grammarAccess.getMultiplicityAccess().getMultiplicityAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Multiplicity__Group__0__Impl


    // $ANTLR start rule__Multiplicity__Group__1
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3869:1: rule__Multiplicity__Group__1 : rule__Multiplicity__Group__1__Impl rule__Multiplicity__Group__2 ;
    public final void rule__Multiplicity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3873:1: ( rule__Multiplicity__Group__1__Impl rule__Multiplicity__Group__2 )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3874:2: rule__Multiplicity__Group__1__Impl rule__Multiplicity__Group__2
            {
            pushFollow(FOLLOW_rule__Multiplicity__Group__1__Impl_in_rule__Multiplicity__Group__17898);
            rule__Multiplicity__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Multiplicity__Group__2_in_rule__Multiplicity__Group__17901);
            rule__Multiplicity__Group__2();
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
    // $ANTLR end rule__Multiplicity__Group__1


    // $ANTLR start rule__Multiplicity__Group__1__Impl
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3881:1: rule__Multiplicity__Group__1__Impl : ( '[' ) ;
    public final void rule__Multiplicity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3885:1: ( ( '[' ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3886:1: ( '[' )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3886:1: ( '[' )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3887:1: '['
            {
             before(grammarAccess.getMultiplicityAccess().getLeftSquareBracketKeyword_1()); 
            match(input,31,FOLLOW_31_in_rule__Multiplicity__Group__1__Impl7929); 
             after(grammarAccess.getMultiplicityAccess().getLeftSquareBracketKeyword_1()); 

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
    // $ANTLR end rule__Multiplicity__Group__1__Impl


    // $ANTLR start rule__Multiplicity__Group__2
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3900:1: rule__Multiplicity__Group__2 : rule__Multiplicity__Group__2__Impl rule__Multiplicity__Group__3 ;
    public final void rule__Multiplicity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3904:1: ( rule__Multiplicity__Group__2__Impl rule__Multiplicity__Group__3 )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3905:2: rule__Multiplicity__Group__2__Impl rule__Multiplicity__Group__3
            {
            pushFollow(FOLLOW_rule__Multiplicity__Group__2__Impl_in_rule__Multiplicity__Group__27960);
            rule__Multiplicity__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Multiplicity__Group__3_in_rule__Multiplicity__Group__27963);
            rule__Multiplicity__Group__3();
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
    // $ANTLR end rule__Multiplicity__Group__2


    // $ANTLR start rule__Multiplicity__Group__2__Impl
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3912:1: rule__Multiplicity__Group__2__Impl : ( ( rule__Multiplicity__Group_2__0 ) ) ;
    public final void rule__Multiplicity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3916:1: ( ( ( rule__Multiplicity__Group_2__0 ) ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3917:1: ( ( rule__Multiplicity__Group_2__0 ) )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3917:1: ( ( rule__Multiplicity__Group_2__0 ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3918:1: ( rule__Multiplicity__Group_2__0 )
            {
             before(grammarAccess.getMultiplicityAccess().getGroup_2()); 
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3919:1: ( rule__Multiplicity__Group_2__0 )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3919:2: rule__Multiplicity__Group_2__0
            {
            pushFollow(FOLLOW_rule__Multiplicity__Group_2__0_in_rule__Multiplicity__Group__2__Impl7990);
            rule__Multiplicity__Group_2__0();
            _fsp--;


            }

             after(grammarAccess.getMultiplicityAccess().getGroup_2()); 

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
    // $ANTLR end rule__Multiplicity__Group__2__Impl


    // $ANTLR start rule__Multiplicity__Group__3
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3929:1: rule__Multiplicity__Group__3 : rule__Multiplicity__Group__3__Impl rule__Multiplicity__Group__4 ;
    public final void rule__Multiplicity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3933:1: ( rule__Multiplicity__Group__3__Impl rule__Multiplicity__Group__4 )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3934:2: rule__Multiplicity__Group__3__Impl rule__Multiplicity__Group__4
            {
            pushFollow(FOLLOW_rule__Multiplicity__Group__3__Impl_in_rule__Multiplicity__Group__38020);
            rule__Multiplicity__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Multiplicity__Group__4_in_rule__Multiplicity__Group__38023);
            rule__Multiplicity__Group__4();
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
    // $ANTLR end rule__Multiplicity__Group__3


    // $ANTLR start rule__Multiplicity__Group__3__Impl
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3941:1: rule__Multiplicity__Group__3__Impl : ( ( rule__Multiplicity__Alternatives_3 ) ) ;
    public final void rule__Multiplicity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3945:1: ( ( ( rule__Multiplicity__Alternatives_3 ) ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3946:1: ( ( rule__Multiplicity__Alternatives_3 ) )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3946:1: ( ( rule__Multiplicity__Alternatives_3 ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3947:1: ( rule__Multiplicity__Alternatives_3 )
            {
             before(grammarAccess.getMultiplicityAccess().getAlternatives_3()); 
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3948:1: ( rule__Multiplicity__Alternatives_3 )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3948:2: rule__Multiplicity__Alternatives_3
            {
            pushFollow(FOLLOW_rule__Multiplicity__Alternatives_3_in_rule__Multiplicity__Group__3__Impl8050);
            rule__Multiplicity__Alternatives_3();
            _fsp--;


            }

             after(grammarAccess.getMultiplicityAccess().getAlternatives_3()); 

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
    // $ANTLR end rule__Multiplicity__Group__3__Impl


    // $ANTLR start rule__Multiplicity__Group__4
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3958:1: rule__Multiplicity__Group__4 : rule__Multiplicity__Group__4__Impl ;
    public final void rule__Multiplicity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3962:1: ( rule__Multiplicity__Group__4__Impl )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3963:2: rule__Multiplicity__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Multiplicity__Group__4__Impl_in_rule__Multiplicity__Group__48080);
            rule__Multiplicity__Group__4__Impl();
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
    // $ANTLR end rule__Multiplicity__Group__4


    // $ANTLR start rule__Multiplicity__Group__4__Impl
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3969:1: rule__Multiplicity__Group__4__Impl : ( ']' ) ;
    public final void rule__Multiplicity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3973:1: ( ( ']' ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3974:1: ( ']' )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3974:1: ( ']' )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3975:1: ']'
            {
             before(grammarAccess.getMultiplicityAccess().getRightSquareBracketKeyword_4()); 
            match(input,32,FOLLOW_32_in_rule__Multiplicity__Group__4__Impl8108); 
             after(grammarAccess.getMultiplicityAccess().getRightSquareBracketKeyword_4()); 

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
    // $ANTLR end rule__Multiplicity__Group__4__Impl


    // $ANTLR start rule__Multiplicity__Group_2__0
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:3998:1: rule__Multiplicity__Group_2__0 : rule__Multiplicity__Group_2__0__Impl rule__Multiplicity__Group_2__1 ;
    public final void rule__Multiplicity__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4002:1: ( rule__Multiplicity__Group_2__0__Impl rule__Multiplicity__Group_2__1 )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4003:2: rule__Multiplicity__Group_2__0__Impl rule__Multiplicity__Group_2__1
            {
            pushFollow(FOLLOW_rule__Multiplicity__Group_2__0__Impl_in_rule__Multiplicity__Group_2__08149);
            rule__Multiplicity__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Multiplicity__Group_2__1_in_rule__Multiplicity__Group_2__08152);
            rule__Multiplicity__Group_2__1();
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
    // $ANTLR end rule__Multiplicity__Group_2__0


    // $ANTLR start rule__Multiplicity__Group_2__0__Impl
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4010:1: rule__Multiplicity__Group_2__0__Impl : ( ( rule__Multiplicity__LowerAssignment_2_0 ) ) ;
    public final void rule__Multiplicity__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4014:1: ( ( ( rule__Multiplicity__LowerAssignment_2_0 ) ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4015:1: ( ( rule__Multiplicity__LowerAssignment_2_0 ) )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4015:1: ( ( rule__Multiplicity__LowerAssignment_2_0 ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4016:1: ( rule__Multiplicity__LowerAssignment_2_0 )
            {
             before(grammarAccess.getMultiplicityAccess().getLowerAssignment_2_0()); 
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4017:1: ( rule__Multiplicity__LowerAssignment_2_0 )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4017:2: rule__Multiplicity__LowerAssignment_2_0
            {
            pushFollow(FOLLOW_rule__Multiplicity__LowerAssignment_2_0_in_rule__Multiplicity__Group_2__0__Impl8179);
            rule__Multiplicity__LowerAssignment_2_0();
            _fsp--;


            }

             after(grammarAccess.getMultiplicityAccess().getLowerAssignment_2_0()); 

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
    // $ANTLR end rule__Multiplicity__Group_2__0__Impl


    // $ANTLR start rule__Multiplicity__Group_2__1
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4027:1: rule__Multiplicity__Group_2__1 : rule__Multiplicity__Group_2__1__Impl ;
    public final void rule__Multiplicity__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4031:1: ( rule__Multiplicity__Group_2__1__Impl )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4032:2: rule__Multiplicity__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Multiplicity__Group_2__1__Impl_in_rule__Multiplicity__Group_2__18209);
            rule__Multiplicity__Group_2__1__Impl();
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
    // $ANTLR end rule__Multiplicity__Group_2__1


    // $ANTLR start rule__Multiplicity__Group_2__1__Impl
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4038:1: rule__Multiplicity__Group_2__1__Impl : ( '..' ) ;
    public final void rule__Multiplicity__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4042:1: ( ( '..' ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4043:1: ( '..' )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4043:1: ( '..' )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4044:1: '..'
            {
             before(grammarAccess.getMultiplicityAccess().getFullStopFullStopKeyword_2_1()); 
            match(input,41,FOLLOW_41_in_rule__Multiplicity__Group_2__1__Impl8237); 
             after(grammarAccess.getMultiplicityAccess().getFullStopFullStopKeyword_2_1()); 

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
    // $ANTLR end rule__Multiplicity__Group_2__1__Impl


    // $ANTLR start rule__ImportedTopLevelTypeReference__Group__0
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4061:1: rule__ImportedTopLevelTypeReference__Group__0 : rule__ImportedTopLevelTypeReference__Group__0__Impl rule__ImportedTopLevelTypeReference__Group__1 ;
    public final void rule__ImportedTopLevelTypeReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4065:1: ( rule__ImportedTopLevelTypeReference__Group__0__Impl rule__ImportedTopLevelTypeReference__Group__1 )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4066:2: rule__ImportedTopLevelTypeReference__Group__0__Impl rule__ImportedTopLevelTypeReference__Group__1
            {
            pushFollow(FOLLOW_rule__ImportedTopLevelTypeReference__Group__0__Impl_in_rule__ImportedTopLevelTypeReference__Group__08272);
            rule__ImportedTopLevelTypeReference__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ImportedTopLevelTypeReference__Group__1_in_rule__ImportedTopLevelTypeReference__Group__08275);
            rule__ImportedTopLevelTypeReference__Group__1();
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
    // $ANTLR end rule__ImportedTopLevelTypeReference__Group__0


    // $ANTLR start rule__ImportedTopLevelTypeReference__Group__0__Impl
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4073:1: rule__ImportedTopLevelTypeReference__Group__0__Impl : ( ( rule__ImportedTopLevelTypeReference__ImportAssignment_0 ) ) ;
    public final void rule__ImportedTopLevelTypeReference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4077:1: ( ( ( rule__ImportedTopLevelTypeReference__ImportAssignment_0 ) ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4078:1: ( ( rule__ImportedTopLevelTypeReference__ImportAssignment_0 ) )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4078:1: ( ( rule__ImportedTopLevelTypeReference__ImportAssignment_0 ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4079:1: ( rule__ImportedTopLevelTypeReference__ImportAssignment_0 )
            {
             before(grammarAccess.getImportedTopLevelTypeReferenceAccess().getImportAssignment_0()); 
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4080:1: ( rule__ImportedTopLevelTypeReference__ImportAssignment_0 )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4080:2: rule__ImportedTopLevelTypeReference__ImportAssignment_0
            {
            pushFollow(FOLLOW_rule__ImportedTopLevelTypeReference__ImportAssignment_0_in_rule__ImportedTopLevelTypeReference__Group__0__Impl8302);
            rule__ImportedTopLevelTypeReference__ImportAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getImportedTopLevelTypeReferenceAccess().getImportAssignment_0()); 

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
    // $ANTLR end rule__ImportedTopLevelTypeReference__Group__0__Impl


    // $ANTLR start rule__ImportedTopLevelTypeReference__Group__1
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4090:1: rule__ImportedTopLevelTypeReference__Group__1 : rule__ImportedTopLevelTypeReference__Group__1__Impl rule__ImportedTopLevelTypeReference__Group__2 ;
    public final void rule__ImportedTopLevelTypeReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4094:1: ( rule__ImportedTopLevelTypeReference__Group__1__Impl rule__ImportedTopLevelTypeReference__Group__2 )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4095:2: rule__ImportedTopLevelTypeReference__Group__1__Impl rule__ImportedTopLevelTypeReference__Group__2
            {
            pushFollow(FOLLOW_rule__ImportedTopLevelTypeReference__Group__1__Impl_in_rule__ImportedTopLevelTypeReference__Group__18332);
            rule__ImportedTopLevelTypeReference__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ImportedTopLevelTypeReference__Group__2_in_rule__ImportedTopLevelTypeReference__Group__18335);
            rule__ImportedTopLevelTypeReference__Group__2();
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
    // $ANTLR end rule__ImportedTopLevelTypeReference__Group__1


    // $ANTLR start rule__ImportedTopLevelTypeReference__Group__1__Impl
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4102:1: rule__ImportedTopLevelTypeReference__Group__1__Impl : ( ':' ) ;
    public final void rule__ImportedTopLevelTypeReference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4106:1: ( ( ':' ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4107:1: ( ':' )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4107:1: ( ':' )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4108:1: ':'
            {
             before(grammarAccess.getImportedTopLevelTypeReferenceAccess().getColonKeyword_1()); 
            match(input,29,FOLLOW_29_in_rule__ImportedTopLevelTypeReference__Group__1__Impl8363); 
             after(grammarAccess.getImportedTopLevelTypeReferenceAccess().getColonKeyword_1()); 

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
    // $ANTLR end rule__ImportedTopLevelTypeReference__Group__1__Impl


    // $ANTLR start rule__ImportedTopLevelTypeReference__Group__2
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4121:1: rule__ImportedTopLevelTypeReference__Group__2 : rule__ImportedTopLevelTypeReference__Group__2__Impl ;
    public final void rule__ImportedTopLevelTypeReference__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4125:1: ( rule__ImportedTopLevelTypeReference__Group__2__Impl )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4126:2: rule__ImportedTopLevelTypeReference__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ImportedTopLevelTypeReference__Group__2__Impl_in_rule__ImportedTopLevelTypeReference__Group__28394);
            rule__ImportedTopLevelTypeReference__Group__2__Impl();
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
    // $ANTLR end rule__ImportedTopLevelTypeReference__Group__2


    // $ANTLR start rule__ImportedTopLevelTypeReference__Group__2__Impl
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4132:1: rule__ImportedTopLevelTypeReference__Group__2__Impl : ( ( rule__ImportedTopLevelTypeReference__RefAssignment_2 ) ) ;
    public final void rule__ImportedTopLevelTypeReference__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4136:1: ( ( ( rule__ImportedTopLevelTypeReference__RefAssignment_2 ) ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4137:1: ( ( rule__ImportedTopLevelTypeReference__RefAssignment_2 ) )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4137:1: ( ( rule__ImportedTopLevelTypeReference__RefAssignment_2 ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4138:1: ( rule__ImportedTopLevelTypeReference__RefAssignment_2 )
            {
             before(grammarAccess.getImportedTopLevelTypeReferenceAccess().getRefAssignment_2()); 
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4139:1: ( rule__ImportedTopLevelTypeReference__RefAssignment_2 )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4139:2: rule__ImportedTopLevelTypeReference__RefAssignment_2
            {
            pushFollow(FOLLOW_rule__ImportedTopLevelTypeReference__RefAssignment_2_in_rule__ImportedTopLevelTypeReference__Group__2__Impl8421);
            rule__ImportedTopLevelTypeReference__RefAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getImportedTopLevelTypeReferenceAccess().getRefAssignment_2()); 

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
    // $ANTLR end rule__ImportedTopLevelTypeReference__Group__2__Impl


    // $ANTLR start rule__ImportedTopLevelSimpleTypeReference__Group__0
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4155:1: rule__ImportedTopLevelSimpleTypeReference__Group__0 : rule__ImportedTopLevelSimpleTypeReference__Group__0__Impl rule__ImportedTopLevelSimpleTypeReference__Group__1 ;
    public final void rule__ImportedTopLevelSimpleTypeReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4159:1: ( rule__ImportedTopLevelSimpleTypeReference__Group__0__Impl rule__ImportedTopLevelSimpleTypeReference__Group__1 )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4160:2: rule__ImportedTopLevelSimpleTypeReference__Group__0__Impl rule__ImportedTopLevelSimpleTypeReference__Group__1
            {
            pushFollow(FOLLOW_rule__ImportedTopLevelSimpleTypeReference__Group__0__Impl_in_rule__ImportedTopLevelSimpleTypeReference__Group__08457);
            rule__ImportedTopLevelSimpleTypeReference__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ImportedTopLevelSimpleTypeReference__Group__1_in_rule__ImportedTopLevelSimpleTypeReference__Group__08460);
            rule__ImportedTopLevelSimpleTypeReference__Group__1();
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
    // $ANTLR end rule__ImportedTopLevelSimpleTypeReference__Group__0


    // $ANTLR start rule__ImportedTopLevelSimpleTypeReference__Group__0__Impl
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4167:1: rule__ImportedTopLevelSimpleTypeReference__Group__0__Impl : ( ( rule__ImportedTopLevelSimpleTypeReference__ImportAssignment_0 ) ) ;
    public final void rule__ImportedTopLevelSimpleTypeReference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4171:1: ( ( ( rule__ImportedTopLevelSimpleTypeReference__ImportAssignment_0 ) ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4172:1: ( ( rule__ImportedTopLevelSimpleTypeReference__ImportAssignment_0 ) )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4172:1: ( ( rule__ImportedTopLevelSimpleTypeReference__ImportAssignment_0 ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4173:1: ( rule__ImportedTopLevelSimpleTypeReference__ImportAssignment_0 )
            {
             before(grammarAccess.getImportedTopLevelSimpleTypeReferenceAccess().getImportAssignment_0()); 
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4174:1: ( rule__ImportedTopLevelSimpleTypeReference__ImportAssignment_0 )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4174:2: rule__ImportedTopLevelSimpleTypeReference__ImportAssignment_0
            {
            pushFollow(FOLLOW_rule__ImportedTopLevelSimpleTypeReference__ImportAssignment_0_in_rule__ImportedTopLevelSimpleTypeReference__Group__0__Impl8487);
            rule__ImportedTopLevelSimpleTypeReference__ImportAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getImportedTopLevelSimpleTypeReferenceAccess().getImportAssignment_0()); 

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
    // $ANTLR end rule__ImportedTopLevelSimpleTypeReference__Group__0__Impl


    // $ANTLR start rule__ImportedTopLevelSimpleTypeReference__Group__1
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4184:1: rule__ImportedTopLevelSimpleTypeReference__Group__1 : rule__ImportedTopLevelSimpleTypeReference__Group__1__Impl rule__ImportedTopLevelSimpleTypeReference__Group__2 ;
    public final void rule__ImportedTopLevelSimpleTypeReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4188:1: ( rule__ImportedTopLevelSimpleTypeReference__Group__1__Impl rule__ImportedTopLevelSimpleTypeReference__Group__2 )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4189:2: rule__ImportedTopLevelSimpleTypeReference__Group__1__Impl rule__ImportedTopLevelSimpleTypeReference__Group__2
            {
            pushFollow(FOLLOW_rule__ImportedTopLevelSimpleTypeReference__Group__1__Impl_in_rule__ImportedTopLevelSimpleTypeReference__Group__18517);
            rule__ImportedTopLevelSimpleTypeReference__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ImportedTopLevelSimpleTypeReference__Group__2_in_rule__ImportedTopLevelSimpleTypeReference__Group__18520);
            rule__ImportedTopLevelSimpleTypeReference__Group__2();
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
    // $ANTLR end rule__ImportedTopLevelSimpleTypeReference__Group__1


    // $ANTLR start rule__ImportedTopLevelSimpleTypeReference__Group__1__Impl
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4196:1: rule__ImportedTopLevelSimpleTypeReference__Group__1__Impl : ( ':' ) ;
    public final void rule__ImportedTopLevelSimpleTypeReference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4200:1: ( ( ':' ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4201:1: ( ':' )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4201:1: ( ':' )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4202:1: ':'
            {
             before(grammarAccess.getImportedTopLevelSimpleTypeReferenceAccess().getColonKeyword_1()); 
            match(input,29,FOLLOW_29_in_rule__ImportedTopLevelSimpleTypeReference__Group__1__Impl8548); 
             after(grammarAccess.getImportedTopLevelSimpleTypeReferenceAccess().getColonKeyword_1()); 

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
    // $ANTLR end rule__ImportedTopLevelSimpleTypeReference__Group__1__Impl


    // $ANTLR start rule__ImportedTopLevelSimpleTypeReference__Group__2
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4215:1: rule__ImportedTopLevelSimpleTypeReference__Group__2 : rule__ImportedTopLevelSimpleTypeReference__Group__2__Impl ;
    public final void rule__ImportedTopLevelSimpleTypeReference__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4219:1: ( rule__ImportedTopLevelSimpleTypeReference__Group__2__Impl )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4220:2: rule__ImportedTopLevelSimpleTypeReference__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ImportedTopLevelSimpleTypeReference__Group__2__Impl_in_rule__ImportedTopLevelSimpleTypeReference__Group__28579);
            rule__ImportedTopLevelSimpleTypeReference__Group__2__Impl();
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
    // $ANTLR end rule__ImportedTopLevelSimpleTypeReference__Group__2


    // $ANTLR start rule__ImportedTopLevelSimpleTypeReference__Group__2__Impl
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4226:1: rule__ImportedTopLevelSimpleTypeReference__Group__2__Impl : ( ( rule__ImportedTopLevelSimpleTypeReference__RefAssignment_2 ) ) ;
    public final void rule__ImportedTopLevelSimpleTypeReference__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4230:1: ( ( ( rule__ImportedTopLevelSimpleTypeReference__RefAssignment_2 ) ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4231:1: ( ( rule__ImportedTopLevelSimpleTypeReference__RefAssignment_2 ) )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4231:1: ( ( rule__ImportedTopLevelSimpleTypeReference__RefAssignment_2 ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4232:1: ( rule__ImportedTopLevelSimpleTypeReference__RefAssignment_2 )
            {
             before(grammarAccess.getImportedTopLevelSimpleTypeReferenceAccess().getRefAssignment_2()); 
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4233:1: ( rule__ImportedTopLevelSimpleTypeReference__RefAssignment_2 )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4233:2: rule__ImportedTopLevelSimpleTypeReference__RefAssignment_2
            {
            pushFollow(FOLLOW_rule__ImportedTopLevelSimpleTypeReference__RefAssignment_2_in_rule__ImportedTopLevelSimpleTypeReference__Group__2__Impl8606);
            rule__ImportedTopLevelSimpleTypeReference__RefAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getImportedTopLevelSimpleTypeReferenceAccess().getRefAssignment_2()); 

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
    // $ANTLR end rule__ImportedTopLevelSimpleTypeReference__Group__2__Impl


    // $ANTLR start rule__ImportedTopLevelComplexTypeReference__Group__0
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4249:1: rule__ImportedTopLevelComplexTypeReference__Group__0 : rule__ImportedTopLevelComplexTypeReference__Group__0__Impl rule__ImportedTopLevelComplexTypeReference__Group__1 ;
    public final void rule__ImportedTopLevelComplexTypeReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4253:1: ( rule__ImportedTopLevelComplexTypeReference__Group__0__Impl rule__ImportedTopLevelComplexTypeReference__Group__1 )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4254:2: rule__ImportedTopLevelComplexTypeReference__Group__0__Impl rule__ImportedTopLevelComplexTypeReference__Group__1
            {
            pushFollow(FOLLOW_rule__ImportedTopLevelComplexTypeReference__Group__0__Impl_in_rule__ImportedTopLevelComplexTypeReference__Group__08642);
            rule__ImportedTopLevelComplexTypeReference__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ImportedTopLevelComplexTypeReference__Group__1_in_rule__ImportedTopLevelComplexTypeReference__Group__08645);
            rule__ImportedTopLevelComplexTypeReference__Group__1();
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
    // $ANTLR end rule__ImportedTopLevelComplexTypeReference__Group__0


    // $ANTLR start rule__ImportedTopLevelComplexTypeReference__Group__0__Impl
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4261:1: rule__ImportedTopLevelComplexTypeReference__Group__0__Impl : ( ( rule__ImportedTopLevelComplexTypeReference__ImportAssignment_0 ) ) ;
    public final void rule__ImportedTopLevelComplexTypeReference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4265:1: ( ( ( rule__ImportedTopLevelComplexTypeReference__ImportAssignment_0 ) ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4266:1: ( ( rule__ImportedTopLevelComplexTypeReference__ImportAssignment_0 ) )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4266:1: ( ( rule__ImportedTopLevelComplexTypeReference__ImportAssignment_0 ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4267:1: ( rule__ImportedTopLevelComplexTypeReference__ImportAssignment_0 )
            {
             before(grammarAccess.getImportedTopLevelComplexTypeReferenceAccess().getImportAssignment_0()); 
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4268:1: ( rule__ImportedTopLevelComplexTypeReference__ImportAssignment_0 )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4268:2: rule__ImportedTopLevelComplexTypeReference__ImportAssignment_0
            {
            pushFollow(FOLLOW_rule__ImportedTopLevelComplexTypeReference__ImportAssignment_0_in_rule__ImportedTopLevelComplexTypeReference__Group__0__Impl8672);
            rule__ImportedTopLevelComplexTypeReference__ImportAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getImportedTopLevelComplexTypeReferenceAccess().getImportAssignment_0()); 

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
    // $ANTLR end rule__ImportedTopLevelComplexTypeReference__Group__0__Impl


    // $ANTLR start rule__ImportedTopLevelComplexTypeReference__Group__1
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4278:1: rule__ImportedTopLevelComplexTypeReference__Group__1 : rule__ImportedTopLevelComplexTypeReference__Group__1__Impl rule__ImportedTopLevelComplexTypeReference__Group__2 ;
    public final void rule__ImportedTopLevelComplexTypeReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4282:1: ( rule__ImportedTopLevelComplexTypeReference__Group__1__Impl rule__ImportedTopLevelComplexTypeReference__Group__2 )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4283:2: rule__ImportedTopLevelComplexTypeReference__Group__1__Impl rule__ImportedTopLevelComplexTypeReference__Group__2
            {
            pushFollow(FOLLOW_rule__ImportedTopLevelComplexTypeReference__Group__1__Impl_in_rule__ImportedTopLevelComplexTypeReference__Group__18702);
            rule__ImportedTopLevelComplexTypeReference__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ImportedTopLevelComplexTypeReference__Group__2_in_rule__ImportedTopLevelComplexTypeReference__Group__18705);
            rule__ImportedTopLevelComplexTypeReference__Group__2();
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
    // $ANTLR end rule__ImportedTopLevelComplexTypeReference__Group__1


    // $ANTLR start rule__ImportedTopLevelComplexTypeReference__Group__1__Impl
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4290:1: rule__ImportedTopLevelComplexTypeReference__Group__1__Impl : ( ':' ) ;
    public final void rule__ImportedTopLevelComplexTypeReference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4294:1: ( ( ':' ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4295:1: ( ':' )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4295:1: ( ':' )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4296:1: ':'
            {
             before(grammarAccess.getImportedTopLevelComplexTypeReferenceAccess().getColonKeyword_1()); 
            match(input,29,FOLLOW_29_in_rule__ImportedTopLevelComplexTypeReference__Group__1__Impl8733); 
             after(grammarAccess.getImportedTopLevelComplexTypeReferenceAccess().getColonKeyword_1()); 

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
    // $ANTLR end rule__ImportedTopLevelComplexTypeReference__Group__1__Impl


    // $ANTLR start rule__ImportedTopLevelComplexTypeReference__Group__2
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4309:1: rule__ImportedTopLevelComplexTypeReference__Group__2 : rule__ImportedTopLevelComplexTypeReference__Group__2__Impl ;
    public final void rule__ImportedTopLevelComplexTypeReference__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4313:1: ( rule__ImportedTopLevelComplexTypeReference__Group__2__Impl )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4314:2: rule__ImportedTopLevelComplexTypeReference__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ImportedTopLevelComplexTypeReference__Group__2__Impl_in_rule__ImportedTopLevelComplexTypeReference__Group__28764);
            rule__ImportedTopLevelComplexTypeReference__Group__2__Impl();
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
    // $ANTLR end rule__ImportedTopLevelComplexTypeReference__Group__2


    // $ANTLR start rule__ImportedTopLevelComplexTypeReference__Group__2__Impl
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4320:1: rule__ImportedTopLevelComplexTypeReference__Group__2__Impl : ( ( rule__ImportedTopLevelComplexTypeReference__RefAssignment_2 ) ) ;
    public final void rule__ImportedTopLevelComplexTypeReference__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4324:1: ( ( ( rule__ImportedTopLevelComplexTypeReference__RefAssignment_2 ) ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4325:1: ( ( rule__ImportedTopLevelComplexTypeReference__RefAssignment_2 ) )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4325:1: ( ( rule__ImportedTopLevelComplexTypeReference__RefAssignment_2 ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4326:1: ( rule__ImportedTopLevelComplexTypeReference__RefAssignment_2 )
            {
             before(grammarAccess.getImportedTopLevelComplexTypeReferenceAccess().getRefAssignment_2()); 
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4327:1: ( rule__ImportedTopLevelComplexTypeReference__RefAssignment_2 )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4327:2: rule__ImportedTopLevelComplexTypeReference__RefAssignment_2
            {
            pushFollow(FOLLOW_rule__ImportedTopLevelComplexTypeReference__RefAssignment_2_in_rule__ImportedTopLevelComplexTypeReference__Group__2__Impl8791);
            rule__ImportedTopLevelComplexTypeReference__RefAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getImportedTopLevelComplexTypeReferenceAccess().getRefAssignment_2()); 

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
    // $ANTLR end rule__ImportedTopLevelComplexTypeReference__Group__2__Impl


    // $ANTLR start rule__EmbeddedComplexType__Group__0
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4343:1: rule__EmbeddedComplexType__Group__0 : rule__EmbeddedComplexType__Group__0__Impl rule__EmbeddedComplexType__Group__1 ;
    public final void rule__EmbeddedComplexType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4347:1: ( rule__EmbeddedComplexType__Group__0__Impl rule__EmbeddedComplexType__Group__1 )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4348:2: rule__EmbeddedComplexType__Group__0__Impl rule__EmbeddedComplexType__Group__1
            {
            pushFollow(FOLLOW_rule__EmbeddedComplexType__Group__0__Impl_in_rule__EmbeddedComplexType__Group__08827);
            rule__EmbeddedComplexType__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__EmbeddedComplexType__Group__1_in_rule__EmbeddedComplexType__Group__08830);
            rule__EmbeddedComplexType__Group__1();
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
    // $ANTLR end rule__EmbeddedComplexType__Group__0


    // $ANTLR start rule__EmbeddedComplexType__Group__0__Impl
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4355:1: rule__EmbeddedComplexType__Group__0__Impl : ( () ) ;
    public final void rule__EmbeddedComplexType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4359:1: ( ( () ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4360:1: ( () )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4360:1: ( () )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4361:1: ()
            {
             before(grammarAccess.getEmbeddedComplexTypeAccess().getEmbeddedComplexTypeAction_0()); 
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4362:1: ()
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4364:1: 
            {
            }

             after(grammarAccess.getEmbeddedComplexTypeAccess().getEmbeddedComplexTypeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EmbeddedComplexType__Group__0__Impl


    // $ANTLR start rule__EmbeddedComplexType__Group__1
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4374:1: rule__EmbeddedComplexType__Group__1 : rule__EmbeddedComplexType__Group__1__Impl rule__EmbeddedComplexType__Group__2 ;
    public final void rule__EmbeddedComplexType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4378:1: ( rule__EmbeddedComplexType__Group__1__Impl rule__EmbeddedComplexType__Group__2 )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4379:2: rule__EmbeddedComplexType__Group__1__Impl rule__EmbeddedComplexType__Group__2
            {
            pushFollow(FOLLOW_rule__EmbeddedComplexType__Group__1__Impl_in_rule__EmbeddedComplexType__Group__18888);
            rule__EmbeddedComplexType__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__EmbeddedComplexType__Group__2_in_rule__EmbeddedComplexType__Group__18891);
            rule__EmbeddedComplexType__Group__2();
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
    // $ANTLR end rule__EmbeddedComplexType__Group__1


    // $ANTLR start rule__EmbeddedComplexType__Group__1__Impl
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4386:1: rule__EmbeddedComplexType__Group__1__Impl : ( 'complex-type' ) ;
    public final void rule__EmbeddedComplexType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4390:1: ( ( 'complex-type' ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4391:1: ( 'complex-type' )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4391:1: ( 'complex-type' )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4392:1: 'complex-type'
            {
             before(grammarAccess.getEmbeddedComplexTypeAccess().getComplexTypeKeyword_1()); 
            match(input,43,FOLLOW_43_in_rule__EmbeddedComplexType__Group__1__Impl8919); 
             after(grammarAccess.getEmbeddedComplexTypeAccess().getComplexTypeKeyword_1()); 

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
    // $ANTLR end rule__EmbeddedComplexType__Group__1__Impl


    // $ANTLR start rule__EmbeddedComplexType__Group__2
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4405:1: rule__EmbeddedComplexType__Group__2 : rule__EmbeddedComplexType__Group__2__Impl rule__EmbeddedComplexType__Group__3 ;
    public final void rule__EmbeddedComplexType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4409:1: ( rule__EmbeddedComplexType__Group__2__Impl rule__EmbeddedComplexType__Group__3 )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4410:2: rule__EmbeddedComplexType__Group__2__Impl rule__EmbeddedComplexType__Group__3
            {
            pushFollow(FOLLOW_rule__EmbeddedComplexType__Group__2__Impl_in_rule__EmbeddedComplexType__Group__28950);
            rule__EmbeddedComplexType__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__EmbeddedComplexType__Group__3_in_rule__EmbeddedComplexType__Group__28953);
            rule__EmbeddedComplexType__Group__3();
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
    // $ANTLR end rule__EmbeddedComplexType__Group__2


    // $ANTLR start rule__EmbeddedComplexType__Group__2__Impl
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4417:1: rule__EmbeddedComplexType__Group__2__Impl : ( ( rule__EmbeddedComplexType__Group_2__0 )? ) ;
    public final void rule__EmbeddedComplexType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4421:1: ( ( ( rule__EmbeddedComplexType__Group_2__0 )? ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4422:1: ( ( rule__EmbeddedComplexType__Group_2__0 )? )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4422:1: ( ( rule__EmbeddedComplexType__Group_2__0 )? )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4423:1: ( rule__EmbeddedComplexType__Group_2__0 )?
            {
             before(grammarAccess.getEmbeddedComplexTypeAccess().getGroup_2()); 
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4424:1: ( rule__EmbeddedComplexType__Group_2__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==44) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4424:2: rule__EmbeddedComplexType__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__EmbeddedComplexType__Group_2__0_in_rule__EmbeddedComplexType__Group__2__Impl8980);
                    rule__EmbeddedComplexType__Group_2__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEmbeddedComplexTypeAccess().getGroup_2()); 

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
    // $ANTLR end rule__EmbeddedComplexType__Group__2__Impl


    // $ANTLR start rule__EmbeddedComplexType__Group__3
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4434:1: rule__EmbeddedComplexType__Group__3 : rule__EmbeddedComplexType__Group__3__Impl rule__EmbeddedComplexType__Group__4 ;
    public final void rule__EmbeddedComplexType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4438:1: ( rule__EmbeddedComplexType__Group__3__Impl rule__EmbeddedComplexType__Group__4 )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4439:2: rule__EmbeddedComplexType__Group__3__Impl rule__EmbeddedComplexType__Group__4
            {
            pushFollow(FOLLOW_rule__EmbeddedComplexType__Group__3__Impl_in_rule__EmbeddedComplexType__Group__39011);
            rule__EmbeddedComplexType__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__EmbeddedComplexType__Group__4_in_rule__EmbeddedComplexType__Group__39014);
            rule__EmbeddedComplexType__Group__4();
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
    // $ANTLR end rule__EmbeddedComplexType__Group__3


    // $ANTLR start rule__EmbeddedComplexType__Group__3__Impl
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4446:1: rule__EmbeddedComplexType__Group__3__Impl : ( '{' ) ;
    public final void rule__EmbeddedComplexType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4450:1: ( ( '{' ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4451:1: ( '{' )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4451:1: ( '{' )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4452:1: '{'
            {
             before(grammarAccess.getEmbeddedComplexTypeAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,34,FOLLOW_34_in_rule__EmbeddedComplexType__Group__3__Impl9042); 
             after(grammarAccess.getEmbeddedComplexTypeAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end rule__EmbeddedComplexType__Group__3__Impl


    // $ANTLR start rule__EmbeddedComplexType__Group__4
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4465:1: rule__EmbeddedComplexType__Group__4 : rule__EmbeddedComplexType__Group__4__Impl rule__EmbeddedComplexType__Group__5 ;
    public final void rule__EmbeddedComplexType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4469:1: ( rule__EmbeddedComplexType__Group__4__Impl rule__EmbeddedComplexType__Group__5 )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4470:2: rule__EmbeddedComplexType__Group__4__Impl rule__EmbeddedComplexType__Group__5
            {
            pushFollow(FOLLOW_rule__EmbeddedComplexType__Group__4__Impl_in_rule__EmbeddedComplexType__Group__49073);
            rule__EmbeddedComplexType__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__EmbeddedComplexType__Group__5_in_rule__EmbeddedComplexType__Group__49076);
            rule__EmbeddedComplexType__Group__5();
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
    // $ANTLR end rule__EmbeddedComplexType__Group__4


    // $ANTLR start rule__EmbeddedComplexType__Group__4__Impl
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4477:1: rule__EmbeddedComplexType__Group__4__Impl : ( ( rule__EmbeddedComplexType__PropertiesAssignment_4 )* ) ;
    public final void rule__EmbeddedComplexType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4481:1: ( ( ( rule__EmbeddedComplexType__PropertiesAssignment_4 )* ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4482:1: ( ( rule__EmbeddedComplexType__PropertiesAssignment_4 )* )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4482:1: ( ( rule__EmbeddedComplexType__PropertiesAssignment_4 )* )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4483:1: ( rule__EmbeddedComplexType__PropertiesAssignment_4 )*
            {
             before(grammarAccess.getEmbeddedComplexTypeAccess().getPropertiesAssignment_4()); 
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4484:1: ( rule__EmbeddedComplexType__PropertiesAssignment_4 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==RULE_ID||LA30_0==46||LA30_0==48) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4484:2: rule__EmbeddedComplexType__PropertiesAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__EmbeddedComplexType__PropertiesAssignment_4_in_rule__EmbeddedComplexType__Group__4__Impl9103);
            	    rule__EmbeddedComplexType__PropertiesAssignment_4();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getEmbeddedComplexTypeAccess().getPropertiesAssignment_4()); 

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
    // $ANTLR end rule__EmbeddedComplexType__Group__4__Impl


    // $ANTLR start rule__EmbeddedComplexType__Group__5
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4494:1: rule__EmbeddedComplexType__Group__5 : rule__EmbeddedComplexType__Group__5__Impl ;
    public final void rule__EmbeddedComplexType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4498:1: ( rule__EmbeddedComplexType__Group__5__Impl )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4499:2: rule__EmbeddedComplexType__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__EmbeddedComplexType__Group__5__Impl_in_rule__EmbeddedComplexType__Group__59134);
            rule__EmbeddedComplexType__Group__5__Impl();
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
    // $ANTLR end rule__EmbeddedComplexType__Group__5


    // $ANTLR start rule__EmbeddedComplexType__Group__5__Impl
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4505:1: rule__EmbeddedComplexType__Group__5__Impl : ( '}' ) ;
    public final void rule__EmbeddedComplexType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4509:1: ( ( '}' ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4510:1: ( '}' )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4510:1: ( '}' )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4511:1: '}'
            {
             before(grammarAccess.getEmbeddedComplexTypeAccess().getRightCurlyBracketKeyword_5()); 
            match(input,35,FOLLOW_35_in_rule__EmbeddedComplexType__Group__5__Impl9162); 
             after(grammarAccess.getEmbeddedComplexTypeAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end rule__EmbeddedComplexType__Group__5__Impl


    // $ANTLR start rule__EmbeddedComplexType__Group_2__0
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4536:1: rule__EmbeddedComplexType__Group_2__0 : rule__EmbeddedComplexType__Group_2__0__Impl rule__EmbeddedComplexType__Group_2__1 ;
    public final void rule__EmbeddedComplexType__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4540:1: ( rule__EmbeddedComplexType__Group_2__0__Impl rule__EmbeddedComplexType__Group_2__1 )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4541:2: rule__EmbeddedComplexType__Group_2__0__Impl rule__EmbeddedComplexType__Group_2__1
            {
            pushFollow(FOLLOW_rule__EmbeddedComplexType__Group_2__0__Impl_in_rule__EmbeddedComplexType__Group_2__09205);
            rule__EmbeddedComplexType__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__EmbeddedComplexType__Group_2__1_in_rule__EmbeddedComplexType__Group_2__09208);
            rule__EmbeddedComplexType__Group_2__1();
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
    // $ANTLR end rule__EmbeddedComplexType__Group_2__0


    // $ANTLR start rule__EmbeddedComplexType__Group_2__0__Impl
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4548:1: rule__EmbeddedComplexType__Group_2__0__Impl : ( 'extends' ) ;
    public final void rule__EmbeddedComplexType__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4552:1: ( ( 'extends' ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4553:1: ( 'extends' )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4553:1: ( 'extends' )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4554:1: 'extends'
            {
             before(grammarAccess.getEmbeddedComplexTypeAccess().getExtendsKeyword_2_0()); 
            match(input,44,FOLLOW_44_in_rule__EmbeddedComplexType__Group_2__0__Impl9236); 
             after(grammarAccess.getEmbeddedComplexTypeAccess().getExtendsKeyword_2_0()); 

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
    // $ANTLR end rule__EmbeddedComplexType__Group_2__0__Impl


    // $ANTLR start rule__EmbeddedComplexType__Group_2__1
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4567:1: rule__EmbeddedComplexType__Group_2__1 : rule__EmbeddedComplexType__Group_2__1__Impl ;
    public final void rule__EmbeddedComplexType__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4571:1: ( rule__EmbeddedComplexType__Group_2__1__Impl )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4572:2: rule__EmbeddedComplexType__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__EmbeddedComplexType__Group_2__1__Impl_in_rule__EmbeddedComplexType__Group_2__19267);
            rule__EmbeddedComplexType__Group_2__1__Impl();
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
    // $ANTLR end rule__EmbeddedComplexType__Group_2__1


    // $ANTLR start rule__EmbeddedComplexType__Group_2__1__Impl
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4578:1: rule__EmbeddedComplexType__Group_2__1__Impl : ( ( rule__EmbeddedComplexType__ExtendsAssignment_2_1 ) ) ;
    public final void rule__EmbeddedComplexType__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4582:1: ( ( ( rule__EmbeddedComplexType__ExtendsAssignment_2_1 ) ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4583:1: ( ( rule__EmbeddedComplexType__ExtendsAssignment_2_1 ) )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4583:1: ( ( rule__EmbeddedComplexType__ExtendsAssignment_2_1 ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4584:1: ( rule__EmbeddedComplexType__ExtendsAssignment_2_1 )
            {
             before(grammarAccess.getEmbeddedComplexTypeAccess().getExtendsAssignment_2_1()); 
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4585:1: ( rule__EmbeddedComplexType__ExtendsAssignment_2_1 )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4585:2: rule__EmbeddedComplexType__ExtendsAssignment_2_1
            {
            pushFollow(FOLLOW_rule__EmbeddedComplexType__ExtendsAssignment_2_1_in_rule__EmbeddedComplexType__Group_2__1__Impl9294);
            rule__EmbeddedComplexType__ExtendsAssignment_2_1();
            _fsp--;


            }

             after(grammarAccess.getEmbeddedComplexTypeAccess().getExtendsAssignment_2_1()); 

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
    // $ANTLR end rule__EmbeddedComplexType__Group_2__1__Impl


    // $ANTLR start rule__EmbeddedSimpleType__Group__0
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4599:1: rule__EmbeddedSimpleType__Group__0 : rule__EmbeddedSimpleType__Group__0__Impl rule__EmbeddedSimpleType__Group__1 ;
    public final void rule__EmbeddedSimpleType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4603:1: ( rule__EmbeddedSimpleType__Group__0__Impl rule__EmbeddedSimpleType__Group__1 )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4604:2: rule__EmbeddedSimpleType__Group__0__Impl rule__EmbeddedSimpleType__Group__1
            {
            pushFollow(FOLLOW_rule__EmbeddedSimpleType__Group__0__Impl_in_rule__EmbeddedSimpleType__Group__09328);
            rule__EmbeddedSimpleType__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__EmbeddedSimpleType__Group__1_in_rule__EmbeddedSimpleType__Group__09331);
            rule__EmbeddedSimpleType__Group__1();
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
    // $ANTLR end rule__EmbeddedSimpleType__Group__0


    // $ANTLR start rule__EmbeddedSimpleType__Group__0__Impl
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4611:1: rule__EmbeddedSimpleType__Group__0__Impl : ( 'simple-type' ) ;
    public final void rule__EmbeddedSimpleType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4615:1: ( ( 'simple-type' ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4616:1: ( 'simple-type' )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4616:1: ( 'simple-type' )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4617:1: 'simple-type'
            {
             before(grammarAccess.getEmbeddedSimpleTypeAccess().getSimpleTypeKeyword_0()); 
            match(input,30,FOLLOW_30_in_rule__EmbeddedSimpleType__Group__0__Impl9359); 
             after(grammarAccess.getEmbeddedSimpleTypeAccess().getSimpleTypeKeyword_0()); 

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
    // $ANTLR end rule__EmbeddedSimpleType__Group__0__Impl


    // $ANTLR start rule__EmbeddedSimpleType__Group__1
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4630:1: rule__EmbeddedSimpleType__Group__1 : rule__EmbeddedSimpleType__Group__1__Impl rule__EmbeddedSimpleType__Group__2 ;
    public final void rule__EmbeddedSimpleType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4634:1: ( rule__EmbeddedSimpleType__Group__1__Impl rule__EmbeddedSimpleType__Group__2 )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4635:2: rule__EmbeddedSimpleType__Group__1__Impl rule__EmbeddedSimpleType__Group__2
            {
            pushFollow(FOLLOW_rule__EmbeddedSimpleType__Group__1__Impl_in_rule__EmbeddedSimpleType__Group__19390);
            rule__EmbeddedSimpleType__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__EmbeddedSimpleType__Group__2_in_rule__EmbeddedSimpleType__Group__19393);
            rule__EmbeddedSimpleType__Group__2();
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
    // $ANTLR end rule__EmbeddedSimpleType__Group__1


    // $ANTLR start rule__EmbeddedSimpleType__Group__1__Impl
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4642:1: rule__EmbeddedSimpleType__Group__1__Impl : ( ( rule__EmbeddedSimpleType__RestrictionAssignment_1 ) ) ;
    public final void rule__EmbeddedSimpleType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4646:1: ( ( ( rule__EmbeddedSimpleType__RestrictionAssignment_1 ) ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4647:1: ( ( rule__EmbeddedSimpleType__RestrictionAssignment_1 ) )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4647:1: ( ( rule__EmbeddedSimpleType__RestrictionAssignment_1 ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4648:1: ( rule__EmbeddedSimpleType__RestrictionAssignment_1 )
            {
             before(grammarAccess.getEmbeddedSimpleTypeAccess().getRestrictionAssignment_1()); 
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4649:1: ( rule__EmbeddedSimpleType__RestrictionAssignment_1 )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4649:2: rule__EmbeddedSimpleType__RestrictionAssignment_1
            {
            pushFollow(FOLLOW_rule__EmbeddedSimpleType__RestrictionAssignment_1_in_rule__EmbeddedSimpleType__Group__1__Impl9420);
            rule__EmbeddedSimpleType__RestrictionAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getEmbeddedSimpleTypeAccess().getRestrictionAssignment_1()); 

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
    // $ANTLR end rule__EmbeddedSimpleType__Group__1__Impl


    // $ANTLR start rule__EmbeddedSimpleType__Group__2
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4659:1: rule__EmbeddedSimpleType__Group__2 : rule__EmbeddedSimpleType__Group__2__Impl ;
    public final void rule__EmbeddedSimpleType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4663:1: ( rule__EmbeddedSimpleType__Group__2__Impl )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4664:2: rule__EmbeddedSimpleType__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__EmbeddedSimpleType__Group__2__Impl_in_rule__EmbeddedSimpleType__Group__29450);
            rule__EmbeddedSimpleType__Group__2__Impl();
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
    // $ANTLR end rule__EmbeddedSimpleType__Group__2


    // $ANTLR start rule__EmbeddedSimpleType__Group__2__Impl
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4670:1: rule__EmbeddedSimpleType__Group__2__Impl : ( ( rule__EmbeddedSimpleType__DocumentationAssignment_2 )? ) ;
    public final void rule__EmbeddedSimpleType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4674:1: ( ( ( rule__EmbeddedSimpleType__DocumentationAssignment_2 )? ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4675:1: ( ( rule__EmbeddedSimpleType__DocumentationAssignment_2 )? )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4675:1: ( ( rule__EmbeddedSimpleType__DocumentationAssignment_2 )? )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4676:1: ( rule__EmbeddedSimpleType__DocumentationAssignment_2 )?
            {
             before(grammarAccess.getEmbeddedSimpleTypeAccess().getDocumentationAssignment_2()); 
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4677:1: ( rule__EmbeddedSimpleType__DocumentationAssignment_2 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==36) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4677:2: rule__EmbeddedSimpleType__DocumentationAssignment_2
                    {
                    pushFollow(FOLLOW_rule__EmbeddedSimpleType__DocumentationAssignment_2_in_rule__EmbeddedSimpleType__Group__2__Impl9477);
                    rule__EmbeddedSimpleType__DocumentationAssignment_2();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEmbeddedSimpleTypeAccess().getDocumentationAssignment_2()); 

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
    // $ANTLR end rule__EmbeddedSimpleType__Group__2__Impl


    // $ANTLR start rule__Schema__NameAssignment_1
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4694:1: rule__Schema__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Schema__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4698:1: ( ( RULE_ID ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4699:1: ( RULE_ID )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4699:1: ( RULE_ID )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4700:1: RULE_ID
            {
             before(grammarAccess.getSchemaAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Schema__NameAssignment_19519); 
             after(grammarAccess.getSchemaAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end rule__Schema__NameAssignment_1


    // $ANTLR start rule__Schema__NsURIAssignment_3
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4709:1: rule__Schema__NsURIAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Schema__NsURIAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4713:1: ( ( RULE_STRING ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4714:1: ( RULE_STRING )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4714:1: ( RULE_STRING )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4715:1: RULE_STRING
            {
             before(grammarAccess.getSchemaAccess().getNsURISTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Schema__NsURIAssignment_39550); 
             after(grammarAccess.getSchemaAccess().getNsURISTRINGTerminalRuleCall_3_0()); 

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
    // $ANTLR end rule__Schema__NsURIAssignment_3


    // $ANTLR start rule__Schema__ImportsAssignment_4
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4724:1: rule__Schema__ImportsAssignment_4 : ( ruleImport ) ;
    public final void rule__Schema__ImportsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4728:1: ( ( ruleImport ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4729:1: ( ruleImport )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4729:1: ( ruleImport )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4730:1: ruleImport
            {
             before(grammarAccess.getSchemaAccess().getImportsImportParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleImport_in_rule__Schema__ImportsAssignment_49581);
            ruleImport();
            _fsp--;

             after(grammarAccess.getSchemaAccess().getImportsImportParserRuleCall_4_0()); 

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
    // $ANTLR end rule__Schema__ImportsAssignment_4


    // $ANTLR start rule__Schema__DefinitionsAssignment_5
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4739:1: rule__Schema__DefinitionsAssignment_5 : ( ruleTopLevelDefinition ) ;
    public final void rule__Schema__DefinitionsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4743:1: ( ( ruleTopLevelDefinition ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4744:1: ( ruleTopLevelDefinition )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4744:1: ( ruleTopLevelDefinition )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4745:1: ruleTopLevelDefinition
            {
             before(grammarAccess.getSchemaAccess().getDefinitionsTopLevelDefinitionParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleTopLevelDefinition_in_rule__Schema__DefinitionsAssignment_59612);
            ruleTopLevelDefinition();
            _fsp--;

             after(grammarAccess.getSchemaAccess().getDefinitionsTopLevelDefinitionParserRuleCall_5_0()); 

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
    // $ANTLR end rule__Schema__DefinitionsAssignment_5


    // $ANTLR start rule__Import__ImportURIAssignment_1
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4754:1: rule__Import__ImportURIAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Import__ImportURIAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4758:1: ( ( RULE_STRING ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4759:1: ( RULE_STRING )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4759:1: ( RULE_STRING )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4760:1: RULE_STRING
            {
             before(grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Import__ImportURIAssignment_19643); 
             after(grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end rule__Import__ImportURIAssignment_1


    // $ANTLR start rule__Import__NsPrefixAssignment_3
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4769:1: rule__Import__NsPrefixAssignment_3 : ( RULE_ID ) ;
    public final void rule__Import__NsPrefixAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4773:1: ( ( RULE_ID ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4774:1: ( RULE_ID )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4774:1: ( RULE_ID )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4775:1: RULE_ID
            {
             before(grammarAccess.getImportAccess().getNsPrefixIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Import__NsPrefixAssignment_39674); 
             after(grammarAccess.getImportAccess().getNsPrefixIDTerminalRuleCall_3_0()); 

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
    // $ANTLR end rule__Import__NsPrefixAssignment_3


    // $ANTLR start rule__TopLevelElement__NameAssignment_1
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4784:1: rule__TopLevelElement__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__TopLevelElement__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4788:1: ( ( RULE_ID ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4789:1: ( RULE_ID )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4789:1: ( RULE_ID )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4790:1: RULE_ID
            {
             before(grammarAccess.getTopLevelElementAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TopLevelElement__NameAssignment_19705); 
             after(grammarAccess.getTopLevelElementAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end rule__TopLevelElement__NameAssignment_1


    // $ANTLR start rule__TopLevelElement__TypeRefAssignment_2_0_1
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4799:1: rule__TopLevelElement__TypeRefAssignment_2_0_1 : ( ruleNamedTypeReference ) ;
    public final void rule__TopLevelElement__TypeRefAssignment_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4803:1: ( ( ruleNamedTypeReference ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4804:1: ( ruleNamedTypeReference )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4804:1: ( ruleNamedTypeReference )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4805:1: ruleNamedTypeReference
            {
             before(grammarAccess.getTopLevelElementAccess().getTypeRefNamedTypeReferenceParserRuleCall_2_0_1_0()); 
            pushFollow(FOLLOW_ruleNamedTypeReference_in_rule__TopLevelElement__TypeRefAssignment_2_0_19736);
            ruleNamedTypeReference();
            _fsp--;

             after(grammarAccess.getTopLevelElementAccess().getTypeRefNamedTypeReferenceParserRuleCall_2_0_1_0()); 

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
    // $ANTLR end rule__TopLevelElement__TypeRefAssignment_2_0_1


    // $ANTLR start rule__TopLevelElement__EmbeddedTypeDefAssignment_2_1_1
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4814:1: rule__TopLevelElement__EmbeddedTypeDefAssignment_2_1_1 : ( ruleEmbeddedType ) ;
    public final void rule__TopLevelElement__EmbeddedTypeDefAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4818:1: ( ( ruleEmbeddedType ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4819:1: ( ruleEmbeddedType )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4819:1: ( ruleEmbeddedType )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4820:1: ruleEmbeddedType
            {
             before(grammarAccess.getTopLevelElementAccess().getEmbeddedTypeDefEmbeddedTypeParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_ruleEmbeddedType_in_rule__TopLevelElement__EmbeddedTypeDefAssignment_2_1_19767);
            ruleEmbeddedType();
            _fsp--;

             after(grammarAccess.getTopLevelElementAccess().getEmbeddedTypeDefEmbeddedTypeParserRuleCall_2_1_1_0()); 

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
    // $ANTLR end rule__TopLevelElement__EmbeddedTypeDefAssignment_2_1_1


    // $ANTLR start rule__TopLevelSimpleType__NameAssignment_1
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4829:1: rule__TopLevelSimpleType__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__TopLevelSimpleType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4833:1: ( ( RULE_ID ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4834:1: ( RULE_ID )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4834:1: ( RULE_ID )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4835:1: RULE_ID
            {
             before(grammarAccess.getTopLevelSimpleTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TopLevelSimpleType__NameAssignment_19798); 
             after(grammarAccess.getTopLevelSimpleTypeAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end rule__TopLevelSimpleType__NameAssignment_1


    // $ANTLR start rule__TopLevelSimpleType__RestrictionAssignment_2
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4844:1: rule__TopLevelSimpleType__RestrictionAssignment_2 : ( ruleRestriction ) ;
    public final void rule__TopLevelSimpleType__RestrictionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4848:1: ( ( ruleRestriction ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4849:1: ( ruleRestriction )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4849:1: ( ruleRestriction )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4850:1: ruleRestriction
            {
             before(grammarAccess.getTopLevelSimpleTypeAccess().getRestrictionRestrictionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleRestriction_in_rule__TopLevelSimpleType__RestrictionAssignment_29829);
            ruleRestriction();
            _fsp--;

             after(grammarAccess.getTopLevelSimpleTypeAccess().getRestrictionRestrictionParserRuleCall_2_0()); 

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
    // $ANTLR end rule__TopLevelSimpleType__RestrictionAssignment_2


    // $ANTLR start rule__TopLevelSimpleType__DocumentationAssignment_3
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4859:1: rule__TopLevelSimpleType__DocumentationAssignment_3 : ( ruleDocumentation ) ;
    public final void rule__TopLevelSimpleType__DocumentationAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4863:1: ( ( ruleDocumentation ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4864:1: ( ruleDocumentation )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4864:1: ( ruleDocumentation )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4865:1: ruleDocumentation
            {
             before(grammarAccess.getTopLevelSimpleTypeAccess().getDocumentationDocumentationParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleDocumentation_in_rule__TopLevelSimpleType__DocumentationAssignment_39860);
            ruleDocumentation();
            _fsp--;

             after(grammarAccess.getTopLevelSimpleTypeAccess().getDocumentationDocumentationParserRuleCall_3_0()); 

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
    // $ANTLR end rule__TopLevelSimpleType__DocumentationAssignment_3


    // $ANTLR start rule__Restriction__TypeRefAssignment_1
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4874:1: rule__Restriction__TypeRefAssignment_1 : ( ruleNonComplexTypeReference ) ;
    public final void rule__Restriction__TypeRefAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4878:1: ( ( ruleNonComplexTypeReference ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4879:1: ( ruleNonComplexTypeReference )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4879:1: ( ruleNonComplexTypeReference )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4880:1: ruleNonComplexTypeReference
            {
             before(grammarAccess.getRestrictionAccess().getTypeRefNonComplexTypeReferenceParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleNonComplexTypeReference_in_rule__Restriction__TypeRefAssignment_19891);
            ruleNonComplexTypeReference();
            _fsp--;

             after(grammarAccess.getRestrictionAccess().getTypeRefNonComplexTypeReferenceParserRuleCall_1_0()); 

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
    // $ANTLR end rule__Restriction__TypeRefAssignment_1


    // $ANTLR start rule__Restriction__FacetsAssignment_4
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4889:1: rule__Restriction__FacetsAssignment_4 : ( ruleFacet ) ;
    public final void rule__Restriction__FacetsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4893:1: ( ( ruleFacet ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4894:1: ( ruleFacet )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4894:1: ( ruleFacet )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4895:1: ruleFacet
            {
             before(grammarAccess.getRestrictionAccess().getFacetsFacetParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleFacet_in_rule__Restriction__FacetsAssignment_49922);
            ruleFacet();
            _fsp--;

             after(grammarAccess.getRestrictionAccess().getFacetsFacetParserRuleCall_4_0()); 

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
    // $ANTLR end rule__Restriction__FacetsAssignment_4


    // $ANTLR start rule__EnumerationFacet__LiteralsAssignment_2
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4904:1: rule__EnumerationFacet__LiteralsAssignment_2 : ( ruleEnumerationLiteral ) ;
    public final void rule__EnumerationFacet__LiteralsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4908:1: ( ( ruleEnumerationLiteral ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4909:1: ( ruleEnumerationLiteral )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4909:1: ( ruleEnumerationLiteral )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4910:1: ruleEnumerationLiteral
            {
             before(grammarAccess.getEnumerationFacetAccess().getLiteralsEnumerationLiteralParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleEnumerationLiteral_in_rule__EnumerationFacet__LiteralsAssignment_29953);
            ruleEnumerationLiteral();
            _fsp--;

             after(grammarAccess.getEnumerationFacetAccess().getLiteralsEnumerationLiteralParserRuleCall_2_0()); 

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
    // $ANTLR end rule__EnumerationFacet__LiteralsAssignment_2


    // $ANTLR start rule__EnumerationLiteral__ValueAssignment_0
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4919:1: rule__EnumerationLiteral__ValueAssignment_0 : ( ( rule__EnumerationLiteral__ValueAlternatives_0_0 ) ) ;
    public final void rule__EnumerationLiteral__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4923:1: ( ( ( rule__EnumerationLiteral__ValueAlternatives_0_0 ) ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4924:1: ( ( rule__EnumerationLiteral__ValueAlternatives_0_0 ) )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4924:1: ( ( rule__EnumerationLiteral__ValueAlternatives_0_0 ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4925:1: ( rule__EnumerationLiteral__ValueAlternatives_0_0 )
            {
             before(grammarAccess.getEnumerationLiteralAccess().getValueAlternatives_0_0()); 
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4926:1: ( rule__EnumerationLiteral__ValueAlternatives_0_0 )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4926:2: rule__EnumerationLiteral__ValueAlternatives_0_0
            {
            pushFollow(FOLLOW_rule__EnumerationLiteral__ValueAlternatives_0_0_in_rule__EnumerationLiteral__ValueAssignment_09984);
            rule__EnumerationLiteral__ValueAlternatives_0_0();
            _fsp--;


            }

             after(grammarAccess.getEnumerationLiteralAccess().getValueAlternatives_0_0()); 

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
    // $ANTLR end rule__EnumerationLiteral__ValueAssignment_0


    // $ANTLR start rule__EnumerationLiteral__AnnotationAssignment_1_1
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4935:1: rule__EnumerationLiteral__AnnotationAssignment_1_1 : ( RULE_STRING ) ;
    public final void rule__EnumerationLiteral__AnnotationAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4939:1: ( ( RULE_STRING ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4940:1: ( RULE_STRING )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4940:1: ( RULE_STRING )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4941:1: RULE_STRING
            {
             before(grammarAccess.getEnumerationLiteralAccess().getAnnotationSTRINGTerminalRuleCall_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__EnumerationLiteral__AnnotationAssignment_1_110017); 
             after(grammarAccess.getEnumerationLiteralAccess().getAnnotationSTRINGTerminalRuleCall_1_1_0()); 

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
    // $ANTLR end rule__EnumerationLiteral__AnnotationAssignment_1_1


    // $ANTLR start rule__MaxLengthFacet__MaxLengthAssignment_2
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4950:1: rule__MaxLengthFacet__MaxLengthAssignment_2 : ( RULE_INT ) ;
    public final void rule__MaxLengthFacet__MaxLengthAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4954:1: ( ( RULE_INT ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4955:1: ( RULE_INT )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4955:1: ( RULE_INT )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4956:1: RULE_INT
            {
             before(grammarAccess.getMaxLengthFacetAccess().getMaxLengthINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__MaxLengthFacet__MaxLengthAssignment_210048); 
             after(grammarAccess.getMaxLengthFacetAccess().getMaxLengthINTTerminalRuleCall_2_0()); 

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
    // $ANTLR end rule__MaxLengthFacet__MaxLengthAssignment_2


    // $ANTLR start rule__PatternFacet__PatternAssignment_2
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4965:1: rule__PatternFacet__PatternAssignment_2 : ( RULE_PATTERN_STRING ) ;
    public final void rule__PatternFacet__PatternAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4969:1: ( ( RULE_PATTERN_STRING ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4970:1: ( RULE_PATTERN_STRING )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4970:1: ( RULE_PATTERN_STRING )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4971:1: RULE_PATTERN_STRING
            {
             before(grammarAccess.getPatternFacetAccess().getPatternPATTERN_STRINGTerminalRuleCall_2_0()); 
            match(input,RULE_PATTERN_STRING,FOLLOW_RULE_PATTERN_STRING_in_rule__PatternFacet__PatternAssignment_210079); 
             after(grammarAccess.getPatternFacetAccess().getPatternPATTERN_STRINGTerminalRuleCall_2_0()); 

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
    // $ANTLR end rule__PatternFacet__PatternAssignment_2


    // $ANTLR start rule__RangeFacet__LowerAssignment_2
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4980:1: rule__RangeFacet__LowerAssignment_2 : ( RULE_INT ) ;
    public final void rule__RangeFacet__LowerAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4984:1: ( ( RULE_INT ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4985:1: ( RULE_INT )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4985:1: ( RULE_INT )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4986:1: RULE_INT
            {
             before(grammarAccess.getRangeFacetAccess().getLowerINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__RangeFacet__LowerAssignment_210110); 
             after(grammarAccess.getRangeFacetAccess().getLowerINTTerminalRuleCall_2_0()); 

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
    // $ANTLR end rule__RangeFacet__LowerAssignment_2


    // $ANTLR start rule__RangeFacet__UpperAssignment_4
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4995:1: rule__RangeFacet__UpperAssignment_4 : ( RULE_INT ) ;
    public final void rule__RangeFacet__UpperAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:4999:1: ( ( RULE_INT ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5000:1: ( RULE_INT )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5000:1: ( RULE_INT )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5001:1: RULE_INT
            {
             before(grammarAccess.getRangeFacetAccess().getUpperINTTerminalRuleCall_4_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__RangeFacet__UpperAssignment_410141); 
             after(grammarAccess.getRangeFacetAccess().getUpperINTTerminalRuleCall_4_0()); 

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
    // $ANTLR end rule__RangeFacet__UpperAssignment_4


    // $ANTLR start rule__LengthFacet__LengthAssignment_2
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5010:1: rule__LengthFacet__LengthAssignment_2 : ( RULE_INT ) ;
    public final void rule__LengthFacet__LengthAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5014:1: ( ( RULE_INT ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5015:1: ( RULE_INT )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5015:1: ( RULE_INT )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5016:1: RULE_INT
            {
             before(grammarAccess.getLengthFacetAccess().getLengthINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__LengthFacet__LengthAssignment_210172); 
             after(grammarAccess.getLengthFacetAccess().getLengthINTTerminalRuleCall_2_0()); 

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
    // $ANTLR end rule__LengthFacet__LengthAssignment_2


    // $ANTLR start rule__Documentation__TextAssignment_1
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5025:1: rule__Documentation__TextAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Documentation__TextAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5029:1: ( ( RULE_STRING ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5030:1: ( RULE_STRING )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5030:1: ( RULE_STRING )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5031:1: RULE_STRING
            {
             before(grammarAccess.getDocumentationAccess().getTextSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Documentation__TextAssignment_110203); 
             after(grammarAccess.getDocumentationAccess().getTextSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end rule__Documentation__TextAssignment_1


    // $ANTLR start rule__TopLevelComplexType__AbstractAssignment_0
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5040:1: rule__TopLevelComplexType__AbstractAssignment_0 : ( ( 'abstract' ) ) ;
    public final void rule__TopLevelComplexType__AbstractAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5044:1: ( ( ( 'abstract' ) ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5045:1: ( ( 'abstract' ) )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5045:1: ( ( 'abstract' ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5046:1: ( 'abstract' )
            {
             before(grammarAccess.getTopLevelComplexTypeAccess().getAbstractAbstractKeyword_0_0()); 
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5047:1: ( 'abstract' )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5048:1: 'abstract'
            {
             before(grammarAccess.getTopLevelComplexTypeAccess().getAbstractAbstractKeyword_0_0()); 
            match(input,47,FOLLOW_47_in_rule__TopLevelComplexType__AbstractAssignment_010239); 
             after(grammarAccess.getTopLevelComplexTypeAccess().getAbstractAbstractKeyword_0_0()); 

            }

             after(grammarAccess.getTopLevelComplexTypeAccess().getAbstractAbstractKeyword_0_0()); 

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
    // $ANTLR end rule__TopLevelComplexType__AbstractAssignment_0


    // $ANTLR start rule__TopLevelComplexType__NameAssignment_2
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5063:1: rule__TopLevelComplexType__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__TopLevelComplexType__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5067:1: ( ( RULE_ID ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5068:1: ( RULE_ID )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5068:1: ( RULE_ID )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5069:1: RULE_ID
            {
             before(grammarAccess.getTopLevelComplexTypeAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TopLevelComplexType__NameAssignment_210278); 
             after(grammarAccess.getTopLevelComplexTypeAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end rule__TopLevelComplexType__NameAssignment_2


    // $ANTLR start rule__TopLevelComplexType__ExtendsAssignment_3_1
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5078:1: rule__TopLevelComplexType__ExtendsAssignment_3_1 : ( ruleTopLevelComplexTypeReference ) ;
    public final void rule__TopLevelComplexType__ExtendsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5082:1: ( ( ruleTopLevelComplexTypeReference ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5083:1: ( ruleTopLevelComplexTypeReference )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5083:1: ( ruleTopLevelComplexTypeReference )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5084:1: ruleTopLevelComplexTypeReference
            {
             before(grammarAccess.getTopLevelComplexTypeAccess().getExtendsTopLevelComplexTypeReferenceParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleTopLevelComplexTypeReference_in_rule__TopLevelComplexType__ExtendsAssignment_3_110309);
            ruleTopLevelComplexTypeReference();
            _fsp--;

             after(grammarAccess.getTopLevelComplexTypeAccess().getExtendsTopLevelComplexTypeReferenceParserRuleCall_3_1_0()); 

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
    // $ANTLR end rule__TopLevelComplexType__ExtendsAssignment_3_1


    // $ANTLR start rule__TopLevelComplexType__PropertiesAssignment_5
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5093:1: rule__TopLevelComplexType__PropertiesAssignment_5 : ( ruleProperty ) ;
    public final void rule__TopLevelComplexType__PropertiesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5097:1: ( ( ruleProperty ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5098:1: ( ruleProperty )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5098:1: ( ruleProperty )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5099:1: ruleProperty
            {
             before(grammarAccess.getTopLevelComplexTypeAccess().getPropertiesPropertyParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleProperty_in_rule__TopLevelComplexType__PropertiesAssignment_510340);
            ruleProperty();
            _fsp--;

             after(grammarAccess.getTopLevelComplexTypeAccess().getPropertiesPropertyParserRuleCall_5_0()); 

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
    // $ANTLR end rule__TopLevelComplexType__PropertiesAssignment_5


    // $ANTLR start rule__TopLevelComplexType__DocumentationAssignment_7_1
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5108:1: rule__TopLevelComplexType__DocumentationAssignment_7_1 : ( RULE_STRING ) ;
    public final void rule__TopLevelComplexType__DocumentationAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5112:1: ( ( RULE_STRING ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5113:1: ( RULE_STRING )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5113:1: ( RULE_STRING )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5114:1: RULE_STRING
            {
             before(grammarAccess.getTopLevelComplexTypeAccess().getDocumentationSTRINGTerminalRuleCall_7_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__TopLevelComplexType__DocumentationAssignment_7_110371); 
             after(grammarAccess.getTopLevelComplexTypeAccess().getDocumentationSTRINGTerminalRuleCall_7_1_0()); 

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
    // $ANTLR end rule__TopLevelComplexType__DocumentationAssignment_7_1


    // $ANTLR start rule__Element__NameAssignment_0
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5123:1: rule__Element__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Element__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5127:1: ( ( RULE_ID ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5128:1: ( RULE_ID )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5128:1: ( RULE_ID )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5129:1: RULE_ID
            {
             before(grammarAccess.getElementAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Element__NameAssignment_010402); 
             after(grammarAccess.getElementAccess().getNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end rule__Element__NameAssignment_0


    // $ANTLR start rule__Element__TypeRefAssignment_1_0_1
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5138:1: rule__Element__TypeRefAssignment_1_0_1 : ( ruleNamedTypeReference ) ;
    public final void rule__Element__TypeRefAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5142:1: ( ( ruleNamedTypeReference ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5143:1: ( ruleNamedTypeReference )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5143:1: ( ruleNamedTypeReference )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5144:1: ruleNamedTypeReference
            {
             before(grammarAccess.getElementAccess().getTypeRefNamedTypeReferenceParserRuleCall_1_0_1_0()); 
            pushFollow(FOLLOW_ruleNamedTypeReference_in_rule__Element__TypeRefAssignment_1_0_110433);
            ruleNamedTypeReference();
            _fsp--;

             after(grammarAccess.getElementAccess().getTypeRefNamedTypeReferenceParserRuleCall_1_0_1_0()); 

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
    // $ANTLR end rule__Element__TypeRefAssignment_1_0_1


    // $ANTLR start rule__Element__EmbeddedTypeDefAssignment_1_1_1
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5153:1: rule__Element__EmbeddedTypeDefAssignment_1_1_1 : ( ruleEmbeddedType ) ;
    public final void rule__Element__EmbeddedTypeDefAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5157:1: ( ( ruleEmbeddedType ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5158:1: ( ruleEmbeddedType )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5158:1: ( ruleEmbeddedType )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5159:1: ruleEmbeddedType
            {
             before(grammarAccess.getElementAccess().getEmbeddedTypeDefEmbeddedTypeParserRuleCall_1_1_1_0()); 
            pushFollow(FOLLOW_ruleEmbeddedType_in_rule__Element__EmbeddedTypeDefAssignment_1_1_110464);
            ruleEmbeddedType();
            _fsp--;

             after(grammarAccess.getElementAccess().getEmbeddedTypeDefEmbeddedTypeParserRuleCall_1_1_1_0()); 

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
    // $ANTLR end rule__Element__EmbeddedTypeDefAssignment_1_1_1


    // $ANTLR start rule__Element__MultiplicityAssignment_2
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5168:1: rule__Element__MultiplicityAssignment_2 : ( ruleMultiplicity ) ;
    public final void rule__Element__MultiplicityAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5172:1: ( ( ruleMultiplicity ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5173:1: ( ruleMultiplicity )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5173:1: ( ruleMultiplicity )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5174:1: ruleMultiplicity
            {
             before(grammarAccess.getElementAccess().getMultiplicityMultiplicityParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleMultiplicity_in_rule__Element__MultiplicityAssignment_210495);
            ruleMultiplicity();
            _fsp--;

             after(grammarAccess.getElementAccess().getMultiplicityMultiplicityParserRuleCall_2_0()); 

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
    // $ANTLR end rule__Element__MultiplicityAssignment_2


    // $ANTLR start rule__Attribute__RequiredAssignment_0
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5183:1: rule__Attribute__RequiredAssignment_0 : ( ( 'required' ) ) ;
    public final void rule__Attribute__RequiredAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5187:1: ( ( ( 'required' ) ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5188:1: ( ( 'required' ) )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5188:1: ( ( 'required' ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5189:1: ( 'required' )
            {
             before(grammarAccess.getAttributeAccess().getRequiredRequiredKeyword_0_0()); 
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5190:1: ( 'required' )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5191:1: 'required'
            {
             before(grammarAccess.getAttributeAccess().getRequiredRequiredKeyword_0_0()); 
            match(input,48,FOLLOW_48_in_rule__Attribute__RequiredAssignment_010531); 
             after(grammarAccess.getAttributeAccess().getRequiredRequiredKeyword_0_0()); 

            }

             after(grammarAccess.getAttributeAccess().getRequiredRequiredKeyword_0_0()); 

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
    // $ANTLR end rule__Attribute__RequiredAssignment_0


    // $ANTLR start rule__Attribute__NameAssignment_2
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5206:1: rule__Attribute__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5210:1: ( ( RULE_ID ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5211:1: ( RULE_ID )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5211:1: ( RULE_ID )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5212:1: RULE_ID
            {
             before(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Attribute__NameAssignment_210570); 
             after(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end rule__Attribute__NameAssignment_2


    // $ANTLR start rule__Attribute__TypeRefAssignment_4
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5221:1: rule__Attribute__TypeRefAssignment_4 : ( ruleNonComplexTypeReference ) ;
    public final void rule__Attribute__TypeRefAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5225:1: ( ( ruleNonComplexTypeReference ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5226:1: ( ruleNonComplexTypeReference )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5226:1: ( ruleNonComplexTypeReference )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5227:1: ruleNonComplexTypeReference
            {
             before(grammarAccess.getAttributeAccess().getTypeRefNonComplexTypeReferenceParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleNonComplexTypeReference_in_rule__Attribute__TypeRefAssignment_410601);
            ruleNonComplexTypeReference();
            _fsp--;

             after(grammarAccess.getAttributeAccess().getTypeRefNonComplexTypeReferenceParserRuleCall_4_0()); 

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
    // $ANTLR end rule__Attribute__TypeRefAssignment_4


    // $ANTLR start rule__Multiplicity__LowerAssignment_2_0
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5236:1: rule__Multiplicity__LowerAssignment_2_0 : ( RULE_INT ) ;
    public final void rule__Multiplicity__LowerAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5240:1: ( ( RULE_INT ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5241:1: ( RULE_INT )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5241:1: ( RULE_INT )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5242:1: RULE_INT
            {
             before(grammarAccess.getMultiplicityAccess().getLowerINTTerminalRuleCall_2_0_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Multiplicity__LowerAssignment_2_010632); 
             after(grammarAccess.getMultiplicityAccess().getLowerINTTerminalRuleCall_2_0_0()); 

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
    // $ANTLR end rule__Multiplicity__LowerAssignment_2_0


    // $ANTLR start rule__Multiplicity__UpperAssignment_3_0
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5251:1: rule__Multiplicity__UpperAssignment_3_0 : ( RULE_INT ) ;
    public final void rule__Multiplicity__UpperAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5255:1: ( ( RULE_INT ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5256:1: ( RULE_INT )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5256:1: ( RULE_INT )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5257:1: RULE_INT
            {
             before(grammarAccess.getMultiplicityAccess().getUpperINTTerminalRuleCall_3_0_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Multiplicity__UpperAssignment_3_010663); 
             after(grammarAccess.getMultiplicityAccess().getUpperINTTerminalRuleCall_3_0_0()); 

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
    // $ANTLR end rule__Multiplicity__UpperAssignment_3_0


    // $ANTLR start rule__Multiplicity__UnboundedAssignment_3_1
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5266:1: rule__Multiplicity__UnboundedAssignment_3_1 : ( ( '*' ) ) ;
    public final void rule__Multiplicity__UnboundedAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5270:1: ( ( ( '*' ) ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5271:1: ( ( '*' ) )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5271:1: ( ( '*' ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5272:1: ( '*' )
            {
             before(grammarAccess.getMultiplicityAccess().getUnboundedAsteriskKeyword_3_1_0()); 
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5273:1: ( '*' )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5274:1: '*'
            {
             before(grammarAccess.getMultiplicityAccess().getUnboundedAsteriskKeyword_3_1_0()); 
            match(input,49,FOLLOW_49_in_rule__Multiplicity__UnboundedAssignment_3_110699); 
             after(grammarAccess.getMultiplicityAccess().getUnboundedAsteriskKeyword_3_1_0()); 

            }

             after(grammarAccess.getMultiplicityAccess().getUnboundedAsteriskKeyword_3_1_0()); 

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
    // $ANTLR end rule__Multiplicity__UnboundedAssignment_3_1


    // $ANTLR start rule__BuiltinTypeReference__BuiltinAssignment
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5289:1: rule__BuiltinTypeReference__BuiltinAssignment : ( ruleBuiltinType ) ;
    public final void rule__BuiltinTypeReference__BuiltinAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5293:1: ( ( ruleBuiltinType ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5294:1: ( ruleBuiltinType )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5294:1: ( ruleBuiltinType )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5295:1: ruleBuiltinType
            {
             before(grammarAccess.getBuiltinTypeReferenceAccess().getBuiltinBuiltinTypeEnumRuleCall_0()); 
            pushFollow(FOLLOW_ruleBuiltinType_in_rule__BuiltinTypeReference__BuiltinAssignment10738);
            ruleBuiltinType();
            _fsp--;

             after(grammarAccess.getBuiltinTypeReferenceAccess().getBuiltinBuiltinTypeEnumRuleCall_0()); 

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
    // $ANTLR end rule__BuiltinTypeReference__BuiltinAssignment


    // $ANTLR start rule__DirectTopLevelTypeReference__RefAssignment
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5304:1: rule__DirectTopLevelTypeReference__RefAssignment : ( ( RULE_ID ) ) ;
    public final void rule__DirectTopLevelTypeReference__RefAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5308:1: ( ( ( RULE_ID ) ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5309:1: ( ( RULE_ID ) )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5309:1: ( ( RULE_ID ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5310:1: ( RULE_ID )
            {
             before(grammarAccess.getDirectTopLevelTypeReferenceAccess().getRefTopLevelTypeCrossReference_0()); 
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5311:1: ( RULE_ID )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5312:1: RULE_ID
            {
             before(grammarAccess.getDirectTopLevelTypeReferenceAccess().getRefTopLevelTypeIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DirectTopLevelTypeReference__RefAssignment10773); 
             after(grammarAccess.getDirectTopLevelTypeReferenceAccess().getRefTopLevelTypeIDTerminalRuleCall_0_1()); 

            }

             after(grammarAccess.getDirectTopLevelTypeReferenceAccess().getRefTopLevelTypeCrossReference_0()); 

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
    // $ANTLR end rule__DirectTopLevelTypeReference__RefAssignment


    // $ANTLR start rule__DirectTopLevelSimpleTypeReference__RefAssignment
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5323:1: rule__DirectTopLevelSimpleTypeReference__RefAssignment : ( ( RULE_ID ) ) ;
    public final void rule__DirectTopLevelSimpleTypeReference__RefAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5327:1: ( ( ( RULE_ID ) ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5328:1: ( ( RULE_ID ) )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5328:1: ( ( RULE_ID ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5329:1: ( RULE_ID )
            {
             before(grammarAccess.getDirectTopLevelSimpleTypeReferenceAccess().getRefTopLevelSimpleTypeCrossReference_0()); 
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5330:1: ( RULE_ID )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5331:1: RULE_ID
            {
             before(grammarAccess.getDirectTopLevelSimpleTypeReferenceAccess().getRefTopLevelSimpleTypeIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DirectTopLevelSimpleTypeReference__RefAssignment10812); 
             after(grammarAccess.getDirectTopLevelSimpleTypeReferenceAccess().getRefTopLevelSimpleTypeIDTerminalRuleCall_0_1()); 

            }

             after(grammarAccess.getDirectTopLevelSimpleTypeReferenceAccess().getRefTopLevelSimpleTypeCrossReference_0()); 

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
    // $ANTLR end rule__DirectTopLevelSimpleTypeReference__RefAssignment


    // $ANTLR start rule__DirectTopLevelComplexTypeReference__RefAssignment
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5342:1: rule__DirectTopLevelComplexTypeReference__RefAssignment : ( ( RULE_ID ) ) ;
    public final void rule__DirectTopLevelComplexTypeReference__RefAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5346:1: ( ( ( RULE_ID ) ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5347:1: ( ( RULE_ID ) )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5347:1: ( ( RULE_ID ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5348:1: ( RULE_ID )
            {
             before(grammarAccess.getDirectTopLevelComplexTypeReferenceAccess().getRefTopLevelComplexTypeCrossReference_0()); 
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5349:1: ( RULE_ID )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5350:1: RULE_ID
            {
             before(grammarAccess.getDirectTopLevelComplexTypeReferenceAccess().getRefTopLevelComplexTypeIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DirectTopLevelComplexTypeReference__RefAssignment10851); 
             after(grammarAccess.getDirectTopLevelComplexTypeReferenceAccess().getRefTopLevelComplexTypeIDTerminalRuleCall_0_1()); 

            }

             after(grammarAccess.getDirectTopLevelComplexTypeReferenceAccess().getRefTopLevelComplexTypeCrossReference_0()); 

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
    // $ANTLR end rule__DirectTopLevelComplexTypeReference__RefAssignment


    // $ANTLR start rule__ImportedTopLevelTypeReference__ImportAssignment_0
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5361:1: rule__ImportedTopLevelTypeReference__ImportAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__ImportedTopLevelTypeReference__ImportAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5365:1: ( ( ( RULE_ID ) ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5366:1: ( ( RULE_ID ) )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5366:1: ( ( RULE_ID ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5367:1: ( RULE_ID )
            {
             before(grammarAccess.getImportedTopLevelTypeReferenceAccess().getImportImportCrossReference_0_0()); 
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5368:1: ( RULE_ID )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5369:1: RULE_ID
            {
             before(grammarAccess.getImportedTopLevelTypeReferenceAccess().getImportImportIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ImportedTopLevelTypeReference__ImportAssignment_010890); 
             after(grammarAccess.getImportedTopLevelTypeReferenceAccess().getImportImportIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getImportedTopLevelTypeReferenceAccess().getImportImportCrossReference_0_0()); 

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
    // $ANTLR end rule__ImportedTopLevelTypeReference__ImportAssignment_0


    // $ANTLR start rule__ImportedTopLevelTypeReference__RefAssignment_2
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5380:1: rule__ImportedTopLevelTypeReference__RefAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__ImportedTopLevelTypeReference__RefAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5384:1: ( ( ( RULE_ID ) ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5385:1: ( ( RULE_ID ) )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5385:1: ( ( RULE_ID ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5386:1: ( RULE_ID )
            {
             before(grammarAccess.getImportedTopLevelTypeReferenceAccess().getRefTopLevelTypeCrossReference_2_0()); 
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5387:1: ( RULE_ID )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5388:1: RULE_ID
            {
             before(grammarAccess.getImportedTopLevelTypeReferenceAccess().getRefTopLevelTypeIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ImportedTopLevelTypeReference__RefAssignment_210929); 
             after(grammarAccess.getImportedTopLevelTypeReferenceAccess().getRefTopLevelTypeIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getImportedTopLevelTypeReferenceAccess().getRefTopLevelTypeCrossReference_2_0()); 

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
    // $ANTLR end rule__ImportedTopLevelTypeReference__RefAssignment_2


    // $ANTLR start rule__ImportedTopLevelSimpleTypeReference__ImportAssignment_0
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5399:1: rule__ImportedTopLevelSimpleTypeReference__ImportAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__ImportedTopLevelSimpleTypeReference__ImportAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5403:1: ( ( ( RULE_ID ) ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5404:1: ( ( RULE_ID ) )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5404:1: ( ( RULE_ID ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5405:1: ( RULE_ID )
            {
             before(grammarAccess.getImportedTopLevelSimpleTypeReferenceAccess().getImportImportCrossReference_0_0()); 
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5406:1: ( RULE_ID )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5407:1: RULE_ID
            {
             before(grammarAccess.getImportedTopLevelSimpleTypeReferenceAccess().getImportImportIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ImportedTopLevelSimpleTypeReference__ImportAssignment_010968); 
             after(grammarAccess.getImportedTopLevelSimpleTypeReferenceAccess().getImportImportIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getImportedTopLevelSimpleTypeReferenceAccess().getImportImportCrossReference_0_0()); 

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
    // $ANTLR end rule__ImportedTopLevelSimpleTypeReference__ImportAssignment_0


    // $ANTLR start rule__ImportedTopLevelSimpleTypeReference__RefAssignment_2
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5418:1: rule__ImportedTopLevelSimpleTypeReference__RefAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__ImportedTopLevelSimpleTypeReference__RefAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5422:1: ( ( ( RULE_ID ) ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5423:1: ( ( RULE_ID ) )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5423:1: ( ( RULE_ID ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5424:1: ( RULE_ID )
            {
             before(grammarAccess.getImportedTopLevelSimpleTypeReferenceAccess().getRefTopLevelSimpleTypeCrossReference_2_0()); 
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5425:1: ( RULE_ID )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5426:1: RULE_ID
            {
             before(grammarAccess.getImportedTopLevelSimpleTypeReferenceAccess().getRefTopLevelSimpleTypeIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ImportedTopLevelSimpleTypeReference__RefAssignment_211007); 
             after(grammarAccess.getImportedTopLevelSimpleTypeReferenceAccess().getRefTopLevelSimpleTypeIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getImportedTopLevelSimpleTypeReferenceAccess().getRefTopLevelSimpleTypeCrossReference_2_0()); 

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
    // $ANTLR end rule__ImportedTopLevelSimpleTypeReference__RefAssignment_2


    // $ANTLR start rule__ImportedTopLevelComplexTypeReference__ImportAssignment_0
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5437:1: rule__ImportedTopLevelComplexTypeReference__ImportAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__ImportedTopLevelComplexTypeReference__ImportAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5441:1: ( ( ( RULE_ID ) ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5442:1: ( ( RULE_ID ) )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5442:1: ( ( RULE_ID ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5443:1: ( RULE_ID )
            {
             before(grammarAccess.getImportedTopLevelComplexTypeReferenceAccess().getImportImportCrossReference_0_0()); 
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5444:1: ( RULE_ID )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5445:1: RULE_ID
            {
             before(grammarAccess.getImportedTopLevelComplexTypeReferenceAccess().getImportImportIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ImportedTopLevelComplexTypeReference__ImportAssignment_011046); 
             after(grammarAccess.getImportedTopLevelComplexTypeReferenceAccess().getImportImportIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getImportedTopLevelComplexTypeReferenceAccess().getImportImportCrossReference_0_0()); 

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
    // $ANTLR end rule__ImportedTopLevelComplexTypeReference__ImportAssignment_0


    // $ANTLR start rule__ImportedTopLevelComplexTypeReference__RefAssignment_2
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5456:1: rule__ImportedTopLevelComplexTypeReference__RefAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__ImportedTopLevelComplexTypeReference__RefAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5460:1: ( ( ( RULE_ID ) ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5461:1: ( ( RULE_ID ) )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5461:1: ( ( RULE_ID ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5462:1: ( RULE_ID )
            {
             before(grammarAccess.getImportedTopLevelComplexTypeReferenceAccess().getRefTopLevelComplexTypeCrossReference_2_0()); 
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5463:1: ( RULE_ID )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5464:1: RULE_ID
            {
             before(grammarAccess.getImportedTopLevelComplexTypeReferenceAccess().getRefTopLevelComplexTypeIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ImportedTopLevelComplexTypeReference__RefAssignment_211085); 
             after(grammarAccess.getImportedTopLevelComplexTypeReferenceAccess().getRefTopLevelComplexTypeIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getImportedTopLevelComplexTypeReferenceAccess().getRefTopLevelComplexTypeCrossReference_2_0()); 

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
    // $ANTLR end rule__ImportedTopLevelComplexTypeReference__RefAssignment_2


    // $ANTLR start rule__EmbeddedComplexType__ExtendsAssignment_2_1
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5475:1: rule__EmbeddedComplexType__ExtendsAssignment_2_1 : ( ruleTopLevelComplexTypeReference ) ;
    public final void rule__EmbeddedComplexType__ExtendsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5479:1: ( ( ruleTopLevelComplexTypeReference ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5480:1: ( ruleTopLevelComplexTypeReference )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5480:1: ( ruleTopLevelComplexTypeReference )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5481:1: ruleTopLevelComplexTypeReference
            {
             before(grammarAccess.getEmbeddedComplexTypeAccess().getExtendsTopLevelComplexTypeReferenceParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleTopLevelComplexTypeReference_in_rule__EmbeddedComplexType__ExtendsAssignment_2_111120);
            ruleTopLevelComplexTypeReference();
            _fsp--;

             after(grammarAccess.getEmbeddedComplexTypeAccess().getExtendsTopLevelComplexTypeReferenceParserRuleCall_2_1_0()); 

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
    // $ANTLR end rule__EmbeddedComplexType__ExtendsAssignment_2_1


    // $ANTLR start rule__EmbeddedComplexType__PropertiesAssignment_4
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5490:1: rule__EmbeddedComplexType__PropertiesAssignment_4 : ( ruleProperty ) ;
    public final void rule__EmbeddedComplexType__PropertiesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5494:1: ( ( ruleProperty ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5495:1: ( ruleProperty )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5495:1: ( ruleProperty )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5496:1: ruleProperty
            {
             before(grammarAccess.getEmbeddedComplexTypeAccess().getPropertiesPropertyParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleProperty_in_rule__EmbeddedComplexType__PropertiesAssignment_411151);
            ruleProperty();
            _fsp--;

             after(grammarAccess.getEmbeddedComplexTypeAccess().getPropertiesPropertyParserRuleCall_4_0()); 

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
    // $ANTLR end rule__EmbeddedComplexType__PropertiesAssignment_4


    // $ANTLR start rule__EmbeddedSimpleType__RestrictionAssignment_1
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5505:1: rule__EmbeddedSimpleType__RestrictionAssignment_1 : ( ruleRestriction ) ;
    public final void rule__EmbeddedSimpleType__RestrictionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5509:1: ( ( ruleRestriction ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5510:1: ( ruleRestriction )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5510:1: ( ruleRestriction )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5511:1: ruleRestriction
            {
             before(grammarAccess.getEmbeddedSimpleTypeAccess().getRestrictionRestrictionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleRestriction_in_rule__EmbeddedSimpleType__RestrictionAssignment_111182);
            ruleRestriction();
            _fsp--;

             after(grammarAccess.getEmbeddedSimpleTypeAccess().getRestrictionRestrictionParserRuleCall_1_0()); 

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
    // $ANTLR end rule__EmbeddedSimpleType__RestrictionAssignment_1


    // $ANTLR start rule__EmbeddedSimpleType__DocumentationAssignment_2
    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5520:1: rule__EmbeddedSimpleType__DocumentationAssignment_2 : ( ruleDocumentation ) ;
    public final void rule__EmbeddedSimpleType__DocumentationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5524:1: ( ( ruleDocumentation ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5525:1: ( ruleDocumentation )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5525:1: ( ruleDocumentation )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5526:1: ruleDocumentation
            {
             before(grammarAccess.getEmbeddedSimpleTypeAccess().getDocumentationDocumentationParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleDocumentation_in_rule__EmbeddedSimpleType__DocumentationAssignment_211213);
            ruleDocumentation();
            _fsp--;

             after(grammarAccess.getEmbeddedSimpleTypeAccess().getDocumentationDocumentationParserRuleCall_2_0()); 

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
    // $ANTLR end rule__EmbeddedSimpleType__DocumentationAssignment_2


 

    public static final BitSet FOLLOW_ruleSchema_in_entryRuleSchema61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSchema68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Schema__Group__0_in_ruleSchema94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0_in_ruleImport154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTopLevelDefinition_in_entryRuleTopLevelDefinition181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTopLevelDefinition188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TopLevelDefinition__Alternatives_in_ruleTopLevelDefinition214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTopLevelType_in_entryRuleTopLevelType241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTopLevelType248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TopLevelType__Alternatives_in_ruleTopLevelType274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTopLevelElement_in_entryRuleTopLevelElement301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTopLevelElement308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TopLevelElement__Group__0_in_ruleTopLevelElement334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTopLevelSimpleType_in_entryRuleTopLevelSimpleType361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTopLevelSimpleType368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TopLevelSimpleType__Group__0_in_ruleTopLevelSimpleType394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRestriction_in_entryRuleRestriction421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRestriction428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Restriction__Group__0_in_ruleRestriction454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFacet_in_entryRuleFacet481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFacet488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Facet__Alternatives_in_ruleFacet514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumerationFacet_in_entryRuleEnumerationFacet541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumerationFacet548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationFacet__Group__0_in_ruleEnumerationFacet574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumerationLiteral_in_entryRuleEnumerationLiteral601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumerationLiteral608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationLiteral__Group__0_in_ruleEnumerationLiteral634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMaxLengthFacet_in_entryRuleMaxLengthFacet661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMaxLengthFacet668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MaxLengthFacet__Group__0_in_ruleMaxLengthFacet694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePatternFacet_in_entryRulePatternFacet721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePatternFacet728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PatternFacet__Group__0_in_rulePatternFacet754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRangeFacet_in_entryRuleRangeFacet781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRangeFacet788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RangeFacet__Group__0_in_ruleRangeFacet814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLengthFacet_in_entryRuleLengthFacet841 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLengthFacet848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LengthFacet__Group__0_in_ruleLengthFacet874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDocumentation_in_entryRuleDocumentation901 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDocumentation908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Documentation__Group__0_in_ruleDocumentation934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTopLevelComplexType_in_entryRuleTopLevelComplexType961 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTopLevelComplexType968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TopLevelComplexType__Group__0_in_ruleTopLevelComplexType994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty1021 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProperty1028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Alternatives_in_ruleProperty1054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElement_in_entryRuleElement1081 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElement1088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Element__Group__0_in_ruleElement1114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute1141 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute1148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__0_in_ruleAttribute1174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicity_in_entryRuleMultiplicity1201 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplicity1208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplicity__Group__0_in_ruleMultiplicity1234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamedTypeReference_in_entryRuleNamedTypeReference1261 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNamedTypeReference1268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamedTypeReference__Alternatives_in_ruleNamedTypeReference1294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNonComplexTypeReference_in_entryRuleNonComplexTypeReference1321 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNonComplexTypeReference1328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NonComplexTypeReference__Alternatives_in_ruleNonComplexTypeReference1354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBuiltinTypeReference_in_entryRuleBuiltinTypeReference1381 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBuiltinTypeReference1388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BuiltinTypeReference__BuiltinAssignment_in_ruleBuiltinTypeReference1414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTopLevelTypeReference_in_entryRuleTopLevelTypeReference1441 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTopLevelTypeReference1448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TopLevelTypeReference__Alternatives_in_ruleTopLevelTypeReference1474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTopLevelComplexTypeReference_in_entryRuleTopLevelComplexTypeReference1501 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTopLevelComplexTypeReference1508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TopLevelComplexTypeReference__Alternatives_in_ruleTopLevelComplexTypeReference1534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTopLevelSimpleTypeReference_in_entryRuleTopLevelSimpleTypeReference1561 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTopLevelSimpleTypeReference1568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TopLevelSimpleTypeReference__Alternatives_in_ruleTopLevelSimpleTypeReference1594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDirectTopLevelTypeReference_in_entryRuleDirectTopLevelTypeReference1621 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDirectTopLevelTypeReference1628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DirectTopLevelTypeReference__RefAssignment_in_ruleDirectTopLevelTypeReference1654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDirectTopLevelSimpleTypeReference_in_entryRuleDirectTopLevelSimpleTypeReference1681 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDirectTopLevelSimpleTypeReference1688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DirectTopLevelSimpleTypeReference__RefAssignment_in_ruleDirectTopLevelSimpleTypeReference1714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDirectTopLevelComplexTypeReference_in_entryRuleDirectTopLevelComplexTypeReference1741 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDirectTopLevelComplexTypeReference1748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DirectTopLevelComplexTypeReference__RefAssignment_in_ruleDirectTopLevelComplexTypeReference1774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImportedTopLevelTypeReference_in_entryRuleImportedTopLevelTypeReference1801 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImportedTopLevelTypeReference1808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImportedTopLevelTypeReference__Group__0_in_ruleImportedTopLevelTypeReference1834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImportedTopLevelSimpleTypeReference_in_entryRuleImportedTopLevelSimpleTypeReference1861 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImportedTopLevelSimpleTypeReference1868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImportedTopLevelSimpleTypeReference__Group__0_in_ruleImportedTopLevelSimpleTypeReference1894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImportedTopLevelComplexTypeReference_in_entryRuleImportedTopLevelComplexTypeReference1921 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImportedTopLevelComplexTypeReference1928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImportedTopLevelComplexTypeReference__Group__0_in_ruleImportedTopLevelComplexTypeReference1954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmbeddedType_in_entryRuleEmbeddedType1983 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEmbeddedType1990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EmbeddedType__Alternatives_in_ruleEmbeddedType2016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmbeddedComplexType_in_entryRuleEmbeddedComplexType2043 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEmbeddedComplexType2050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EmbeddedComplexType__Group__0_in_ruleEmbeddedComplexType2076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmbeddedSimpleType_in_entryRuleEmbeddedSimpleType2103 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEmbeddedSimpleType2110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EmbeddedSimpleType__Group__0_in_ruleEmbeddedSimpleType2136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BuiltinType__Alternatives_in_ruleBuiltinType2177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTopLevelType_in_rule__TopLevelDefinition__Alternatives2212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTopLevelElement_in_rule__TopLevelDefinition__Alternatives2229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTopLevelSimpleType_in_rule__TopLevelType__Alternatives2261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTopLevelComplexType_in_rule__TopLevelType__Alternatives2278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TopLevelElement__Group_2_0__0_in_rule__TopLevelElement__Alternatives_22310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TopLevelElement__Group_2_1__0_in_rule__TopLevelElement__Alternatives_22328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumerationFacet_in_rule__Facet__Alternatives2361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMaxLengthFacet_in_rule__Facet__Alternatives2378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePatternFacet_in_rule__Facet__Alternatives2395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRangeFacet_in_rule__Facet__Alternatives2412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLengthFacet_in_rule__Facet__Alternatives2429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumerationLiteral__ValueAlternatives_0_02461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__EnumerationLiteral__ValueAlternatives_0_02478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElement_in_rule__Property__Alternatives2510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_rule__Property__Alternatives2527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Element__Group_1_0__0_in_rule__Element__Alternatives_12559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Element__Group_1_1__0_in_rule__Element__Alternatives_12577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplicity__UpperAssignment_3_0_in_rule__Multiplicity__Alternatives_32610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplicity__UnboundedAssignment_3_1_in_rule__Multiplicity__Alternatives_32628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTopLevelTypeReference_in_rule__NamedTypeReference__Alternatives2661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBuiltinTypeReference_in_rule__NamedTypeReference__Alternatives2678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTopLevelSimpleTypeReference_in_rule__NonComplexTypeReference__Alternatives2710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBuiltinTypeReference_in_rule__NonComplexTypeReference__Alternatives2727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDirectTopLevelTypeReference_in_rule__TopLevelTypeReference__Alternatives2759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImportedTopLevelTypeReference_in_rule__TopLevelTypeReference__Alternatives2776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDirectTopLevelComplexTypeReference_in_rule__TopLevelComplexTypeReference__Alternatives2808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImportedTopLevelComplexTypeReference_in_rule__TopLevelComplexTypeReference__Alternatives2825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDirectTopLevelSimpleTypeReference_in_rule__TopLevelSimpleTypeReference__Alternatives2857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImportedTopLevelSimpleTypeReference_in_rule__TopLevelSimpleTypeReference__Alternatives2874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmbeddedComplexType_in_rule__EmbeddedType__Alternatives2907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmbeddedSimpleType_in_rule__EmbeddedType__Alternatives2924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__BuiltinType__Alternatives2959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__BuiltinType__Alternatives2980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__BuiltinType__Alternatives3001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__BuiltinType__Alternatives3022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__BuiltinType__Alternatives3043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__BuiltinType__Alternatives3064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__BuiltinType__Alternatives3085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__BuiltinType__Alternatives3106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__BuiltinType__Alternatives3127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__BuiltinType__Alternatives3148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__BuiltinType__Alternatives3169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Schema__Group__0__Impl_in_rule__Schema__Group__03202 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Schema__Group__1_in_rule__Schema__Group__03205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Schema__Group__0__Impl3233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Schema__Group__1__Impl_in_rule__Schema__Group__13264 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Schema__Group__2_in_rule__Schema__Group__13267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Schema__NameAssignment_1_in_rule__Schema__Group__1__Impl3294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Schema__Group__2__Impl_in_rule__Schema__Group__23324 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Schema__Group__3_in_rule__Schema__Group__23327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Schema__Group__2__Impl3355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Schema__Group__3__Impl_in_rule__Schema__Group__33386 = new BitSet(new long[]{0x000088004A000002L});
    public static final BitSet FOLLOW_rule__Schema__Group__4_in_rule__Schema__Group__33389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Schema__NsURIAssignment_3_in_rule__Schema__Group__3__Impl3416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Schema__Group__4__Impl_in_rule__Schema__Group__43446 = new BitSet(new long[]{0x0000880048000002L});
    public static final BitSet FOLLOW_rule__Schema__Group__5_in_rule__Schema__Group__43449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Schema__ImportsAssignment_4_in_rule__Schema__Group__4__Impl3476 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_rule__Schema__Group__5__Impl_in_rule__Schema__Group__53507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Schema__DefinitionsAssignment_5_in_rule__Schema__Group__5__Impl3534 = new BitSet(new long[]{0x0000880048000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__03577 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Import__Group__1_in_rule__Import__Group__03580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Import__Group__0__Impl3608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__13639 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Import__Group__2_in_rule__Import__Group__13642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__ImportURIAssignment_1_in_rule__Import__Group__1__Impl3669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__2__Impl_in_rule__Import__Group__23699 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Import__Group__3_in_rule__Import__Group__23702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Import__Group__2__Impl3730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__3__Impl_in_rule__Import__Group__33761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__NsPrefixAssignment_3_in_rule__Import__Group__3__Impl3788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TopLevelElement__Group__0__Impl_in_rule__TopLevelElement__Group__03826 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TopLevelElement__Group__1_in_rule__TopLevelElement__Group__03829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__TopLevelElement__Group__0__Impl3857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TopLevelElement__Group__1__Impl_in_rule__TopLevelElement__Group__13888 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_rule__TopLevelElement__Group__2_in_rule__TopLevelElement__Group__13891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TopLevelElement__NameAssignment_1_in_rule__TopLevelElement__Group__1__Impl3918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TopLevelElement__Group__2__Impl_in_rule__TopLevelElement__Group__23948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TopLevelElement__Alternatives_2_in_rule__TopLevelElement__Group__2__Impl3975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TopLevelElement__Group_2_0__0__Impl_in_rule__TopLevelElement__Group_2_0__04011 = new BitSet(new long[]{0x00000000007FF010L});
    public static final BitSet FOLLOW_rule__TopLevelElement__Group_2_0__1_in_rule__TopLevelElement__Group_2_0__04014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__TopLevelElement__Group_2_0__0__Impl4042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TopLevelElement__Group_2_0__1__Impl_in_rule__TopLevelElement__Group_2_0__14073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TopLevelElement__TypeRefAssignment_2_0_1_in_rule__TopLevelElement__Group_2_0__1__Impl4100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TopLevelElement__Group_2_1__0__Impl_in_rule__TopLevelElement__Group_2_1__04134 = new BitSet(new long[]{0x0000080040000000L});
    public static final BitSet FOLLOW_rule__TopLevelElement__Group_2_1__1_in_rule__TopLevelElement__Group_2_1__04137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__TopLevelElement__Group_2_1__0__Impl4165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TopLevelElement__Group_2_1__1__Impl_in_rule__TopLevelElement__Group_2_1__14196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TopLevelElement__EmbeddedTypeDefAssignment_2_1_1_in_rule__TopLevelElement__Group_2_1__1__Impl4223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TopLevelSimpleType__Group__0__Impl_in_rule__TopLevelSimpleType__Group__04257 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TopLevelSimpleType__Group__1_in_rule__TopLevelSimpleType__Group__04260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__TopLevelSimpleType__Group__0__Impl4288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TopLevelSimpleType__Group__1__Impl_in_rule__TopLevelSimpleType__Group__14319 = new BitSet(new long[]{0x0000001080000002L});
    public static final BitSet FOLLOW_rule__TopLevelSimpleType__Group__2_in_rule__TopLevelSimpleType__Group__14322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TopLevelSimpleType__NameAssignment_1_in_rule__TopLevelSimpleType__Group__1__Impl4349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TopLevelSimpleType__Group__2__Impl_in_rule__TopLevelSimpleType__Group__24379 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_rule__TopLevelSimpleType__Group__3_in_rule__TopLevelSimpleType__Group__24382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TopLevelSimpleType__RestrictionAssignment_2_in_rule__TopLevelSimpleType__Group__2__Impl4409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TopLevelSimpleType__Group__3__Impl_in_rule__TopLevelSimpleType__Group__34440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TopLevelSimpleType__DocumentationAssignment_3_in_rule__TopLevelSimpleType__Group__3__Impl4467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Restriction__Group__0__Impl_in_rule__Restriction__Group__04506 = new BitSet(new long[]{0x00000000007FF010L});
    public static final BitSet FOLLOW_rule__Restriction__Group__1_in_rule__Restriction__Group__04509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Restriction__Group__0__Impl4537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Restriction__Group__1__Impl_in_rule__Restriction__Group__14568 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Restriction__Group__2_in_rule__Restriction__Group__14571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Restriction__TypeRefAssignment_1_in_rule__Restriction__Group__1__Impl4598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Restriction__Group__2__Impl_in_rule__Restriction__Group__24628 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Restriction__Group__3_in_rule__Restriction__Group__24631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Restriction__Group__2__Impl4659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Restriction__Group__3__Impl_in_rule__Restriction__Group__34690 = new BitSet(new long[]{0x000005A200000000L});
    public static final BitSet FOLLOW_rule__Restriction__Group__4_in_rule__Restriction__Group__34693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Restriction__Group__3__Impl4721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Restriction__Group__4__Impl_in_rule__Restriction__Group__44752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Restriction__FacetsAssignment_4_in_rule__Restriction__Group__4__Impl4781 = new BitSet(new long[]{0x000005A200000002L});
    public static final BitSet FOLLOW_rule__Restriction__FacetsAssignment_4_in_rule__Restriction__Group__4__Impl4793 = new BitSet(new long[]{0x000005A200000002L});
    public static final BitSet FOLLOW_rule__EnumerationFacet__Group__0__Impl_in_rule__EnumerationFacet__Group__04836 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__EnumerationFacet__Group__1_in_rule__EnumerationFacet__Group__04839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__EnumerationFacet__Group__0__Impl4867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationFacet__Group__1__Impl_in_rule__EnumerationFacet__Group__14898 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__EnumerationFacet__Group__2_in_rule__EnumerationFacet__Group__14901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__EnumerationFacet__Group__1__Impl4929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationFacet__Group__2__Impl_in_rule__EnumerationFacet__Group__24960 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__EnumerationFacet__Group__3_in_rule__EnumerationFacet__Group__24963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationFacet__LiteralsAssignment_2_in_rule__EnumerationFacet__Group__2__Impl4992 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_rule__EnumerationFacet__LiteralsAssignment_2_in_rule__EnumerationFacet__Group__2__Impl5004 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_rule__EnumerationFacet__Group__3__Impl_in_rule__EnumerationFacet__Group__35037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__EnumerationFacet__Group__3__Impl5065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationLiteral__Group__0__Impl_in_rule__EnumerationLiteral__Group__05104 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_rule__EnumerationLiteral__Group__1_in_rule__EnumerationLiteral__Group__05107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationLiteral__ValueAssignment_0_in_rule__EnumerationLiteral__Group__0__Impl5134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationLiteral__Group__1__Impl_in_rule__EnumerationLiteral__Group__15164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationLiteral__Group_1__0_in_rule__EnumerationLiteral__Group__1__Impl5191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationLiteral__Group_1__0__Impl_in_rule__EnumerationLiteral__Group_1__05226 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__EnumerationLiteral__Group_1__1_in_rule__EnumerationLiteral__Group_1__05229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__EnumerationLiteral__Group_1__0__Impl5257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationLiteral__Group_1__1__Impl_in_rule__EnumerationLiteral__Group_1__15288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationLiteral__AnnotationAssignment_1_1_in_rule__EnumerationLiteral__Group_1__1__Impl5315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MaxLengthFacet__Group__0__Impl_in_rule__MaxLengthFacet__Group__05349 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__MaxLengthFacet__Group__1_in_rule__MaxLengthFacet__Group__05352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__MaxLengthFacet__Group__0__Impl5380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MaxLengthFacet__Group__1__Impl_in_rule__MaxLengthFacet__Group__15411 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__MaxLengthFacet__Group__2_in_rule__MaxLengthFacet__Group__15414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__MaxLengthFacet__Group__1__Impl5442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MaxLengthFacet__Group__2__Impl_in_rule__MaxLengthFacet__Group__25473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MaxLengthFacet__MaxLengthAssignment_2_in_rule__MaxLengthFacet__Group__2__Impl5500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PatternFacet__Group__0__Impl_in_rule__PatternFacet__Group__05536 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__PatternFacet__Group__1_in_rule__PatternFacet__Group__05539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__PatternFacet__Group__0__Impl5567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PatternFacet__Group__1__Impl_in_rule__PatternFacet__Group__15598 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__PatternFacet__Group__2_in_rule__PatternFacet__Group__15601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__PatternFacet__Group__1__Impl5629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PatternFacet__Group__2__Impl_in_rule__PatternFacet__Group__25660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PatternFacet__PatternAssignment_2_in_rule__PatternFacet__Group__2__Impl5687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RangeFacet__Group__0__Impl_in_rule__RangeFacet__Group__05723 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__RangeFacet__Group__1_in_rule__RangeFacet__Group__05726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__RangeFacet__Group__0__Impl5754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RangeFacet__Group__1__Impl_in_rule__RangeFacet__Group__15785 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__RangeFacet__Group__2_in_rule__RangeFacet__Group__15788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__RangeFacet__Group__1__Impl5816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RangeFacet__Group__2__Impl_in_rule__RangeFacet__Group__25847 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__RangeFacet__Group__3_in_rule__RangeFacet__Group__25850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RangeFacet__LowerAssignment_2_in_rule__RangeFacet__Group__2__Impl5877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RangeFacet__Group__3__Impl_in_rule__RangeFacet__Group__35907 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__RangeFacet__Group__4_in_rule__RangeFacet__Group__35910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__RangeFacet__Group__3__Impl5938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RangeFacet__Group__4__Impl_in_rule__RangeFacet__Group__45969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RangeFacet__UpperAssignment_4_in_rule__RangeFacet__Group__4__Impl5996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LengthFacet__Group__0__Impl_in_rule__LengthFacet__Group__06036 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__LengthFacet__Group__1_in_rule__LengthFacet__Group__06039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__LengthFacet__Group__0__Impl6067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LengthFacet__Group__1__Impl_in_rule__LengthFacet__Group__16098 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__LengthFacet__Group__2_in_rule__LengthFacet__Group__16101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__LengthFacet__Group__1__Impl6129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LengthFacet__Group__2__Impl_in_rule__LengthFacet__Group__26160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LengthFacet__LengthAssignment_2_in_rule__LengthFacet__Group__2__Impl6187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Documentation__Group__0__Impl_in_rule__Documentation__Group__06223 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Documentation__Group__1_in_rule__Documentation__Group__06226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Documentation__Group__0__Impl6254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Documentation__Group__1__Impl_in_rule__Documentation__Group__16285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Documentation__TextAssignment_1_in_rule__Documentation__Group__1__Impl6312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TopLevelComplexType__Group__0__Impl_in_rule__TopLevelComplexType__Group__06346 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__TopLevelComplexType__Group__1_in_rule__TopLevelComplexType__Group__06349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TopLevelComplexType__AbstractAssignment_0_in_rule__TopLevelComplexType__Group__0__Impl6376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TopLevelComplexType__Group__1__Impl_in_rule__TopLevelComplexType__Group__16407 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TopLevelComplexType__Group__2_in_rule__TopLevelComplexType__Group__16410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__TopLevelComplexType__Group__1__Impl6438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TopLevelComplexType__Group__2__Impl_in_rule__TopLevelComplexType__Group__26469 = new BitSet(new long[]{0x0000100400000000L});
    public static final BitSet FOLLOW_rule__TopLevelComplexType__Group__3_in_rule__TopLevelComplexType__Group__26472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TopLevelComplexType__NameAssignment_2_in_rule__TopLevelComplexType__Group__2__Impl6499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TopLevelComplexType__Group__3__Impl_in_rule__TopLevelComplexType__Group__36529 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__TopLevelComplexType__Group__4_in_rule__TopLevelComplexType__Group__36532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TopLevelComplexType__Group_3__0_in_rule__TopLevelComplexType__Group__3__Impl6559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TopLevelComplexType__Group__4__Impl_in_rule__TopLevelComplexType__Group__46590 = new BitSet(new long[]{0x0001400800000010L});
    public static final BitSet FOLLOW_rule__TopLevelComplexType__Group__5_in_rule__TopLevelComplexType__Group__46593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__TopLevelComplexType__Group__4__Impl6621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TopLevelComplexType__Group__5__Impl_in_rule__TopLevelComplexType__Group__56652 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__TopLevelComplexType__Group__6_in_rule__TopLevelComplexType__Group__56655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TopLevelComplexType__PropertiesAssignment_5_in_rule__TopLevelComplexType__Group__5__Impl6682 = new BitSet(new long[]{0x0001400000000012L});
    public static final BitSet FOLLOW_rule__TopLevelComplexType__Group__6__Impl_in_rule__TopLevelComplexType__Group__66713 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_rule__TopLevelComplexType__Group__7_in_rule__TopLevelComplexType__Group__66716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__TopLevelComplexType__Group__6__Impl6744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TopLevelComplexType__Group__7__Impl_in_rule__TopLevelComplexType__Group__76775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TopLevelComplexType__Group_7__0_in_rule__TopLevelComplexType__Group__7__Impl6802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TopLevelComplexType__Group_3__0__Impl_in_rule__TopLevelComplexType__Group_3__06849 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TopLevelComplexType__Group_3__1_in_rule__TopLevelComplexType__Group_3__06852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__TopLevelComplexType__Group_3__0__Impl6880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TopLevelComplexType__Group_3__1__Impl_in_rule__TopLevelComplexType__Group_3__16911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TopLevelComplexType__ExtendsAssignment_3_1_in_rule__TopLevelComplexType__Group_3__1__Impl6938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TopLevelComplexType__Group_7__0__Impl_in_rule__TopLevelComplexType__Group_7__06972 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__TopLevelComplexType__Group_7__1_in_rule__TopLevelComplexType__Group_7__06975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__TopLevelComplexType__Group_7__0__Impl7003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TopLevelComplexType__Group_7__1__Impl_in_rule__TopLevelComplexType__Group_7__17034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TopLevelComplexType__DocumentationAssignment_7_1_in_rule__TopLevelComplexType__Group_7__1__Impl7061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Element__Group__0__Impl_in_rule__Element__Group__07095 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_rule__Element__Group__1_in_rule__Element__Group__07098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Element__NameAssignment_0_in_rule__Element__Group__0__Impl7125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Element__Group__1__Impl_in_rule__Element__Group__17155 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_rule__Element__Group__2_in_rule__Element__Group__17158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Element__Alternatives_1_in_rule__Element__Group__1__Impl7185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Element__Group__2__Impl_in_rule__Element__Group__27215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Element__MultiplicityAssignment_2_in_rule__Element__Group__2__Impl7242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Element__Group_1_0__0__Impl_in_rule__Element__Group_1_0__07279 = new BitSet(new long[]{0x00000000007FF010L});
    public static final BitSet FOLLOW_rule__Element__Group_1_0__1_in_rule__Element__Group_1_0__07282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Element__Group_1_0__0__Impl7310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Element__Group_1_0__1__Impl_in_rule__Element__Group_1_0__17341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Element__TypeRefAssignment_1_0_1_in_rule__Element__Group_1_0__1__Impl7368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Element__Group_1_1__0__Impl_in_rule__Element__Group_1_1__07402 = new BitSet(new long[]{0x0000080040000000L});
    public static final BitSet FOLLOW_rule__Element__Group_1_1__1_in_rule__Element__Group_1_1__07405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Element__Group_1_1__0__Impl7433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Element__Group_1_1__1__Impl_in_rule__Element__Group_1_1__17464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Element__EmbeddedTypeDefAssignment_1_1_1_in_rule__Element__Group_1_1__1__Impl7491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__0__Impl_in_rule__Attribute__Group__07525 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_rule__Attribute__Group__1_in_rule__Attribute__Group__07528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__RequiredAssignment_0_in_rule__Attribute__Group__0__Impl7555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__1__Impl_in_rule__Attribute__Group__17586 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Attribute__Group__2_in_rule__Attribute__Group__17589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__Attribute__Group__1__Impl7617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__2__Impl_in_rule__Attribute__Group__27648 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Attribute__Group__3_in_rule__Attribute__Group__27651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__NameAssignment_2_in_rule__Attribute__Group__2__Impl7678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__3__Impl_in_rule__Attribute__Group__37708 = new BitSet(new long[]{0x00000000007FF010L});
    public static final BitSet FOLLOW_rule__Attribute__Group__4_in_rule__Attribute__Group__37711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Attribute__Group__3__Impl7739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__4__Impl_in_rule__Attribute__Group__47770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__TypeRefAssignment_4_in_rule__Attribute__Group__4__Impl7797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplicity__Group__0__Impl_in_rule__Multiplicity__Group__07837 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Multiplicity__Group__1_in_rule__Multiplicity__Group__07840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplicity__Group__1__Impl_in_rule__Multiplicity__Group__17898 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Multiplicity__Group__2_in_rule__Multiplicity__Group__17901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Multiplicity__Group__1__Impl7929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplicity__Group__2__Impl_in_rule__Multiplicity__Group__27960 = new BitSet(new long[]{0x0002000000000040L});
    public static final BitSet FOLLOW_rule__Multiplicity__Group__3_in_rule__Multiplicity__Group__27963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplicity__Group_2__0_in_rule__Multiplicity__Group__2__Impl7990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplicity__Group__3__Impl_in_rule__Multiplicity__Group__38020 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Multiplicity__Group__4_in_rule__Multiplicity__Group__38023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplicity__Alternatives_3_in_rule__Multiplicity__Group__3__Impl8050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplicity__Group__4__Impl_in_rule__Multiplicity__Group__48080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Multiplicity__Group__4__Impl8108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplicity__Group_2__0__Impl_in_rule__Multiplicity__Group_2__08149 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__Multiplicity__Group_2__1_in_rule__Multiplicity__Group_2__08152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplicity__LowerAssignment_2_0_in_rule__Multiplicity__Group_2__0__Impl8179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplicity__Group_2__1__Impl_in_rule__Multiplicity__Group_2__18209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Multiplicity__Group_2__1__Impl8237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImportedTopLevelTypeReference__Group__0__Impl_in_rule__ImportedTopLevelTypeReference__Group__08272 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__ImportedTopLevelTypeReference__Group__1_in_rule__ImportedTopLevelTypeReference__Group__08275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImportedTopLevelTypeReference__ImportAssignment_0_in_rule__ImportedTopLevelTypeReference__Group__0__Impl8302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImportedTopLevelTypeReference__Group__1__Impl_in_rule__ImportedTopLevelTypeReference__Group__18332 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ImportedTopLevelTypeReference__Group__2_in_rule__ImportedTopLevelTypeReference__Group__18335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__ImportedTopLevelTypeReference__Group__1__Impl8363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImportedTopLevelTypeReference__Group__2__Impl_in_rule__ImportedTopLevelTypeReference__Group__28394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImportedTopLevelTypeReference__RefAssignment_2_in_rule__ImportedTopLevelTypeReference__Group__2__Impl8421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImportedTopLevelSimpleTypeReference__Group__0__Impl_in_rule__ImportedTopLevelSimpleTypeReference__Group__08457 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__ImportedTopLevelSimpleTypeReference__Group__1_in_rule__ImportedTopLevelSimpleTypeReference__Group__08460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImportedTopLevelSimpleTypeReference__ImportAssignment_0_in_rule__ImportedTopLevelSimpleTypeReference__Group__0__Impl8487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImportedTopLevelSimpleTypeReference__Group__1__Impl_in_rule__ImportedTopLevelSimpleTypeReference__Group__18517 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ImportedTopLevelSimpleTypeReference__Group__2_in_rule__ImportedTopLevelSimpleTypeReference__Group__18520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__ImportedTopLevelSimpleTypeReference__Group__1__Impl8548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImportedTopLevelSimpleTypeReference__Group__2__Impl_in_rule__ImportedTopLevelSimpleTypeReference__Group__28579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImportedTopLevelSimpleTypeReference__RefAssignment_2_in_rule__ImportedTopLevelSimpleTypeReference__Group__2__Impl8606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImportedTopLevelComplexTypeReference__Group__0__Impl_in_rule__ImportedTopLevelComplexTypeReference__Group__08642 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__ImportedTopLevelComplexTypeReference__Group__1_in_rule__ImportedTopLevelComplexTypeReference__Group__08645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImportedTopLevelComplexTypeReference__ImportAssignment_0_in_rule__ImportedTopLevelComplexTypeReference__Group__0__Impl8672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImportedTopLevelComplexTypeReference__Group__1__Impl_in_rule__ImportedTopLevelComplexTypeReference__Group__18702 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ImportedTopLevelComplexTypeReference__Group__2_in_rule__ImportedTopLevelComplexTypeReference__Group__18705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__ImportedTopLevelComplexTypeReference__Group__1__Impl8733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImportedTopLevelComplexTypeReference__Group__2__Impl_in_rule__ImportedTopLevelComplexTypeReference__Group__28764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImportedTopLevelComplexTypeReference__RefAssignment_2_in_rule__ImportedTopLevelComplexTypeReference__Group__2__Impl8791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EmbeddedComplexType__Group__0__Impl_in_rule__EmbeddedComplexType__Group__08827 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__EmbeddedComplexType__Group__1_in_rule__EmbeddedComplexType__Group__08830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EmbeddedComplexType__Group__1__Impl_in_rule__EmbeddedComplexType__Group__18888 = new BitSet(new long[]{0x0000100400000000L});
    public static final BitSet FOLLOW_rule__EmbeddedComplexType__Group__2_in_rule__EmbeddedComplexType__Group__18891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__EmbeddedComplexType__Group__1__Impl8919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EmbeddedComplexType__Group__2__Impl_in_rule__EmbeddedComplexType__Group__28950 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__EmbeddedComplexType__Group__3_in_rule__EmbeddedComplexType__Group__28953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EmbeddedComplexType__Group_2__0_in_rule__EmbeddedComplexType__Group__2__Impl8980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EmbeddedComplexType__Group__3__Impl_in_rule__EmbeddedComplexType__Group__39011 = new BitSet(new long[]{0x0001400800000010L});
    public static final BitSet FOLLOW_rule__EmbeddedComplexType__Group__4_in_rule__EmbeddedComplexType__Group__39014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__EmbeddedComplexType__Group__3__Impl9042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EmbeddedComplexType__Group__4__Impl_in_rule__EmbeddedComplexType__Group__49073 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__EmbeddedComplexType__Group__5_in_rule__EmbeddedComplexType__Group__49076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EmbeddedComplexType__PropertiesAssignment_4_in_rule__EmbeddedComplexType__Group__4__Impl9103 = new BitSet(new long[]{0x0001400000000012L});
    public static final BitSet FOLLOW_rule__EmbeddedComplexType__Group__5__Impl_in_rule__EmbeddedComplexType__Group__59134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__EmbeddedComplexType__Group__5__Impl9162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EmbeddedComplexType__Group_2__0__Impl_in_rule__EmbeddedComplexType__Group_2__09205 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EmbeddedComplexType__Group_2__1_in_rule__EmbeddedComplexType__Group_2__09208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__EmbeddedComplexType__Group_2__0__Impl9236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EmbeddedComplexType__Group_2__1__Impl_in_rule__EmbeddedComplexType__Group_2__19267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EmbeddedComplexType__ExtendsAssignment_2_1_in_rule__EmbeddedComplexType__Group_2__1__Impl9294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EmbeddedSimpleType__Group__0__Impl_in_rule__EmbeddedSimpleType__Group__09328 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__EmbeddedSimpleType__Group__1_in_rule__EmbeddedSimpleType__Group__09331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__EmbeddedSimpleType__Group__0__Impl9359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EmbeddedSimpleType__Group__1__Impl_in_rule__EmbeddedSimpleType__Group__19390 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_rule__EmbeddedSimpleType__Group__2_in_rule__EmbeddedSimpleType__Group__19393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EmbeddedSimpleType__RestrictionAssignment_1_in_rule__EmbeddedSimpleType__Group__1__Impl9420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EmbeddedSimpleType__Group__2__Impl_in_rule__EmbeddedSimpleType__Group__29450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EmbeddedSimpleType__DocumentationAssignment_2_in_rule__EmbeddedSimpleType__Group__2__Impl9477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Schema__NameAssignment_19519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Schema__NsURIAssignment_39550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_rule__Schema__ImportsAssignment_49581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTopLevelDefinition_in_rule__Schema__DefinitionsAssignment_59612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Import__ImportURIAssignment_19643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Import__NsPrefixAssignment_39674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TopLevelElement__NameAssignment_19705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamedTypeReference_in_rule__TopLevelElement__TypeRefAssignment_2_0_19736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmbeddedType_in_rule__TopLevelElement__EmbeddedTypeDefAssignment_2_1_19767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TopLevelSimpleType__NameAssignment_19798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRestriction_in_rule__TopLevelSimpleType__RestrictionAssignment_29829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDocumentation_in_rule__TopLevelSimpleType__DocumentationAssignment_39860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNonComplexTypeReference_in_rule__Restriction__TypeRefAssignment_19891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFacet_in_rule__Restriction__FacetsAssignment_49922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumerationLiteral_in_rule__EnumerationFacet__LiteralsAssignment_29953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationLiteral__ValueAlternatives_0_0_in_rule__EnumerationLiteral__ValueAssignment_09984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__EnumerationLiteral__AnnotationAssignment_1_110017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__MaxLengthFacet__MaxLengthAssignment_210048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PATTERN_STRING_in_rule__PatternFacet__PatternAssignment_210079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__RangeFacet__LowerAssignment_210110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__RangeFacet__UpperAssignment_410141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__LengthFacet__LengthAssignment_210172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Documentation__TextAssignment_110203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__TopLevelComplexType__AbstractAssignment_010239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TopLevelComplexType__NameAssignment_210278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTopLevelComplexTypeReference_in_rule__TopLevelComplexType__ExtendsAssignment_3_110309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_rule__TopLevelComplexType__PropertiesAssignment_510340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__TopLevelComplexType__DocumentationAssignment_7_110371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Element__NameAssignment_010402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamedTypeReference_in_rule__Element__TypeRefAssignment_1_0_110433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmbeddedType_in_rule__Element__EmbeddedTypeDefAssignment_1_1_110464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicity_in_rule__Element__MultiplicityAssignment_210495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__Attribute__RequiredAssignment_010531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Attribute__NameAssignment_210570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNonComplexTypeReference_in_rule__Attribute__TypeRefAssignment_410601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Multiplicity__LowerAssignment_2_010632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Multiplicity__UpperAssignment_3_010663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__Multiplicity__UnboundedAssignment_3_110699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBuiltinType_in_rule__BuiltinTypeReference__BuiltinAssignment10738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DirectTopLevelTypeReference__RefAssignment10773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DirectTopLevelSimpleTypeReference__RefAssignment10812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DirectTopLevelComplexTypeReference__RefAssignment10851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ImportedTopLevelTypeReference__ImportAssignment_010890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ImportedTopLevelTypeReference__RefAssignment_210929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ImportedTopLevelSimpleTypeReference__ImportAssignment_010968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ImportedTopLevelSimpleTypeReference__RefAssignment_211007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ImportedTopLevelComplexTypeReference__ImportAssignment_011046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ImportedTopLevelComplexTypeReference__RefAssignment_211085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTopLevelComplexTypeReference_in_rule__EmbeddedComplexType__ExtendsAssignment_2_111120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_rule__EmbeddedComplexType__PropertiesAssignment_411151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRestriction_in_rule__EmbeddedSimpleType__RestrictionAssignment_111182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDocumentation_in_rule__EmbeddedSimpleType__DocumentationAssignment_211213 = new BitSet(new long[]{0x0000000000000002L});

}