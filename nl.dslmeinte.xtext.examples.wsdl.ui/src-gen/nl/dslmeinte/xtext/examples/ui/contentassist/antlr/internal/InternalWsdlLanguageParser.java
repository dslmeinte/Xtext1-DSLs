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
import nl.dslmeinte.xtext.examples.services.WsdlLanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalWsdlLanguageParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'document'", "'rpc'", "'get'", "'put'", "'wsdl'", "'namespace:'", "'messages:'", "'portTypes:'", "'bindings:'", "'services:'", "'xsd-import'", "'as'", "'{'", "'}'", "'->'", "'operation'", "':'", "'<-'", "'binds'", "'using'", "'soap'", "'('", "')'", "'http'", "'-'", "'documentation'", "'port'", "'on'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_STRING=5;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;

        public InternalWsdlLanguageParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g"; }


     
     	private WsdlLanguageGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(WsdlLanguageGrammarAccess grammarAccess) {
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




    // $ANTLR start entryRuleDefinitions
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:61:1: entryRuleDefinitions : ruleDefinitions EOF ;
    public final void entryRuleDefinitions() throws RecognitionException {
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:62:1: ( ruleDefinitions EOF )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:63:1: ruleDefinitions EOF
            {
             before(grammarAccess.getDefinitionsRule()); 
            pushFollow(FOLLOW_ruleDefinitions_in_entryRuleDefinitions61);
            ruleDefinitions();
            _fsp--;

             after(grammarAccess.getDefinitionsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefinitions68); 

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
    // $ANTLR end entryRuleDefinitions


    // $ANTLR start ruleDefinitions
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:70:1: ruleDefinitions : ( ( rule__Definitions__Group__0 ) ) ;
    public final void ruleDefinitions() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:74:2: ( ( ( rule__Definitions__Group__0 ) ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:75:1: ( ( rule__Definitions__Group__0 ) )
            {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:75:1: ( ( rule__Definitions__Group__0 ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:76:1: ( rule__Definitions__Group__0 )
            {
             before(grammarAccess.getDefinitionsAccess().getGroup()); 
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:77:1: ( rule__Definitions__Group__0 )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:77:2: rule__Definitions__Group__0
            {
            pushFollow(FOLLOW_rule__Definitions__Group__0_in_ruleDefinitions94);
            rule__Definitions__Group__0();
            _fsp--;


            }

             after(grammarAccess.getDefinitionsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleDefinitions


    // $ANTLR start entryRuleXsdImport
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:89:1: entryRuleXsdImport : ruleXsdImport EOF ;
    public final void entryRuleXsdImport() throws RecognitionException {
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:90:1: ( ruleXsdImport EOF )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:91:1: ruleXsdImport EOF
            {
             before(grammarAccess.getXsdImportRule()); 
            pushFollow(FOLLOW_ruleXsdImport_in_entryRuleXsdImport121);
            ruleXsdImport();
            _fsp--;

             after(grammarAccess.getXsdImportRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleXsdImport128); 

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
    // $ANTLR end entryRuleXsdImport


    // $ANTLR start ruleXsdImport
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:98:1: ruleXsdImport : ( ( rule__XsdImport__Group__0 ) ) ;
    public final void ruleXsdImport() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:102:2: ( ( ( rule__XsdImport__Group__0 ) ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:103:1: ( ( rule__XsdImport__Group__0 ) )
            {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:103:1: ( ( rule__XsdImport__Group__0 ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:104:1: ( rule__XsdImport__Group__0 )
            {
             before(grammarAccess.getXsdImportAccess().getGroup()); 
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:105:1: ( rule__XsdImport__Group__0 )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:105:2: rule__XsdImport__Group__0
            {
            pushFollow(FOLLOW_rule__XsdImport__Group__0_in_ruleXsdImport154);
            rule__XsdImport__Group__0();
            _fsp--;


            }

             after(grammarAccess.getXsdImportAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleXsdImport


    // $ANTLR start entryRuleMessage
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:117:1: entryRuleMessage : ruleMessage EOF ;
    public final void entryRuleMessage() throws RecognitionException {
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:118:1: ( ruleMessage EOF )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:119:1: ruleMessage EOF
            {
             before(grammarAccess.getMessageRule()); 
            pushFollow(FOLLOW_ruleMessage_in_entryRuleMessage181);
            ruleMessage();
            _fsp--;

             after(grammarAccess.getMessageRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMessage188); 

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
    // $ANTLR end entryRuleMessage


    // $ANTLR start ruleMessage
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:126:1: ruleMessage : ( ( rule__Message__Group__0 ) ) ;
    public final void ruleMessage() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:130:2: ( ( ( rule__Message__Group__0 ) ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:131:1: ( ( rule__Message__Group__0 ) )
            {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:131:1: ( ( rule__Message__Group__0 ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:132:1: ( rule__Message__Group__0 )
            {
             before(grammarAccess.getMessageAccess().getGroup()); 
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:133:1: ( rule__Message__Group__0 )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:133:2: rule__Message__Group__0
            {
            pushFollow(FOLLOW_rule__Message__Group__0_in_ruleMessage214);
            rule__Message__Group__0();
            _fsp--;


            }

             after(grammarAccess.getMessageAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleMessage


    // $ANTLR start entryRulePart
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:145:1: entryRulePart : rulePart EOF ;
    public final void entryRulePart() throws RecognitionException {
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:146:1: ( rulePart EOF )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:147:1: rulePart EOF
            {
             before(grammarAccess.getPartRule()); 
            pushFollow(FOLLOW_rulePart_in_entryRulePart241);
            rulePart();
            _fsp--;

             after(grammarAccess.getPartRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePart248); 

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
    // $ANTLR end entryRulePart


    // $ANTLR start rulePart
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:154:1: rulePart : ( ( rule__Part__Group__0 ) ) ;
    public final void rulePart() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:158:2: ( ( ( rule__Part__Group__0 ) ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:159:1: ( ( rule__Part__Group__0 ) )
            {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:159:1: ( ( rule__Part__Group__0 ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:160:1: ( rule__Part__Group__0 )
            {
             before(grammarAccess.getPartAccess().getGroup()); 
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:161:1: ( rule__Part__Group__0 )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:161:2: rule__Part__Group__0
            {
            pushFollow(FOLLOW_rule__Part__Group__0_in_rulePart274);
            rule__Part__Group__0();
            _fsp--;


            }

             after(grammarAccess.getPartAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rulePart


    // $ANTLR start entryRulePortType
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:173:1: entryRulePortType : rulePortType EOF ;
    public final void entryRulePortType() throws RecognitionException {
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:174:1: ( rulePortType EOF )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:175:1: rulePortType EOF
            {
             before(grammarAccess.getPortTypeRule()); 
            pushFollow(FOLLOW_rulePortType_in_entryRulePortType301);
            rulePortType();
            _fsp--;

             after(grammarAccess.getPortTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePortType308); 

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
    // $ANTLR end entryRulePortType


    // $ANTLR start rulePortType
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:182:1: rulePortType : ( ( rule__PortType__Group__0 ) ) ;
    public final void rulePortType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:186:2: ( ( ( rule__PortType__Group__0 ) ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:187:1: ( ( rule__PortType__Group__0 ) )
            {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:187:1: ( ( rule__PortType__Group__0 ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:188:1: ( rule__PortType__Group__0 )
            {
             before(grammarAccess.getPortTypeAccess().getGroup()); 
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:189:1: ( rule__PortType__Group__0 )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:189:2: rule__PortType__Group__0
            {
            pushFollow(FOLLOW_rule__PortType__Group__0_in_rulePortType334);
            rule__PortType__Group__0();
            _fsp--;


            }

             after(grammarAccess.getPortTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rulePortType


    // $ANTLR start entryRuleOperation
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:201:1: entryRuleOperation : ruleOperation EOF ;
    public final void entryRuleOperation() throws RecognitionException {
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:202:1: ( ruleOperation EOF )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:203:1: ruleOperation EOF
            {
             before(grammarAccess.getOperationRule()); 
            pushFollow(FOLLOW_ruleOperation_in_entryRuleOperation361);
            ruleOperation();
            _fsp--;

             after(grammarAccess.getOperationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperation368); 

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
    // $ANTLR end entryRuleOperation


    // $ANTLR start ruleOperation
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:210:1: ruleOperation : ( ( rule__Operation__Alternatives ) ) ;
    public final void ruleOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:214:2: ( ( ( rule__Operation__Alternatives ) ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:215:1: ( ( rule__Operation__Alternatives ) )
            {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:215:1: ( ( rule__Operation__Alternatives ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:216:1: ( rule__Operation__Alternatives )
            {
             before(grammarAccess.getOperationAccess().getAlternatives()); 
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:217:1: ( rule__Operation__Alternatives )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:217:2: rule__Operation__Alternatives
            {
            pushFollow(FOLLOW_rule__Operation__Alternatives_in_ruleOperation394);
            rule__Operation__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getOperationAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleOperation


    // $ANTLR start entryRuleOneWayOperation
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:229:1: entryRuleOneWayOperation : ruleOneWayOperation EOF ;
    public final void entryRuleOneWayOperation() throws RecognitionException {
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:230:1: ( ruleOneWayOperation EOF )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:231:1: ruleOneWayOperation EOF
            {
             before(grammarAccess.getOneWayOperationRule()); 
            pushFollow(FOLLOW_ruleOneWayOperation_in_entryRuleOneWayOperation421);
            ruleOneWayOperation();
            _fsp--;

             after(grammarAccess.getOneWayOperationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOneWayOperation428); 

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
    // $ANTLR end entryRuleOneWayOperation


    // $ANTLR start ruleOneWayOperation
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:238:1: ruleOneWayOperation : ( ( rule__OneWayOperation__Group__0 ) ) ;
    public final void ruleOneWayOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:242:2: ( ( ( rule__OneWayOperation__Group__0 ) ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:243:1: ( ( rule__OneWayOperation__Group__0 ) )
            {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:243:1: ( ( rule__OneWayOperation__Group__0 ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:244:1: ( rule__OneWayOperation__Group__0 )
            {
             before(grammarAccess.getOneWayOperationAccess().getGroup()); 
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:245:1: ( rule__OneWayOperation__Group__0 )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:245:2: rule__OneWayOperation__Group__0
            {
            pushFollow(FOLLOW_rule__OneWayOperation__Group__0_in_ruleOneWayOperation454);
            rule__OneWayOperation__Group__0();
            _fsp--;


            }

             after(grammarAccess.getOneWayOperationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleOneWayOperation


    // $ANTLR start entryRuleRequestResponseOperation
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:257:1: entryRuleRequestResponseOperation : ruleRequestResponseOperation EOF ;
    public final void entryRuleRequestResponseOperation() throws RecognitionException {
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:258:1: ( ruleRequestResponseOperation EOF )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:259:1: ruleRequestResponseOperation EOF
            {
             before(grammarAccess.getRequestResponseOperationRule()); 
            pushFollow(FOLLOW_ruleRequestResponseOperation_in_entryRuleRequestResponseOperation481);
            ruleRequestResponseOperation();
            _fsp--;

             after(grammarAccess.getRequestResponseOperationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRequestResponseOperation488); 

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
    // $ANTLR end entryRuleRequestResponseOperation


    // $ANTLR start ruleRequestResponseOperation
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:266:1: ruleRequestResponseOperation : ( ( rule__RequestResponseOperation__Group__0 ) ) ;
    public final void ruleRequestResponseOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:270:2: ( ( ( rule__RequestResponseOperation__Group__0 ) ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:271:1: ( ( rule__RequestResponseOperation__Group__0 ) )
            {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:271:1: ( ( rule__RequestResponseOperation__Group__0 ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:272:1: ( rule__RequestResponseOperation__Group__0 )
            {
             before(grammarAccess.getRequestResponseOperationAccess().getGroup()); 
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:273:1: ( rule__RequestResponseOperation__Group__0 )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:273:2: rule__RequestResponseOperation__Group__0
            {
            pushFollow(FOLLOW_rule__RequestResponseOperation__Group__0_in_ruleRequestResponseOperation514);
            rule__RequestResponseOperation__Group__0();
            _fsp--;


            }

             after(grammarAccess.getRequestResponseOperationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleRequestResponseOperation


    // $ANTLR start entryRuleSolicitResponseOperation
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:285:1: entryRuleSolicitResponseOperation : ruleSolicitResponseOperation EOF ;
    public final void entryRuleSolicitResponseOperation() throws RecognitionException {
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:286:1: ( ruleSolicitResponseOperation EOF )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:287:1: ruleSolicitResponseOperation EOF
            {
             before(grammarAccess.getSolicitResponseOperationRule()); 
            pushFollow(FOLLOW_ruleSolicitResponseOperation_in_entryRuleSolicitResponseOperation541);
            ruleSolicitResponseOperation();
            _fsp--;

             after(grammarAccess.getSolicitResponseOperationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSolicitResponseOperation548); 

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
    // $ANTLR end entryRuleSolicitResponseOperation


    // $ANTLR start ruleSolicitResponseOperation
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:294:1: ruleSolicitResponseOperation : ( ( rule__SolicitResponseOperation__Group__0 ) ) ;
    public final void ruleSolicitResponseOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:298:2: ( ( ( rule__SolicitResponseOperation__Group__0 ) ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:299:1: ( ( rule__SolicitResponseOperation__Group__0 ) )
            {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:299:1: ( ( rule__SolicitResponseOperation__Group__0 ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:300:1: ( rule__SolicitResponseOperation__Group__0 )
            {
             before(grammarAccess.getSolicitResponseOperationAccess().getGroup()); 
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:301:1: ( rule__SolicitResponseOperation__Group__0 )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:301:2: rule__SolicitResponseOperation__Group__0
            {
            pushFollow(FOLLOW_rule__SolicitResponseOperation__Group__0_in_ruleSolicitResponseOperation574);
            rule__SolicitResponseOperation__Group__0();
            _fsp--;


            }

             after(grammarAccess.getSolicitResponseOperationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleSolicitResponseOperation


    // $ANTLR start entryRuleNotificationOperation
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:313:1: entryRuleNotificationOperation : ruleNotificationOperation EOF ;
    public final void entryRuleNotificationOperation() throws RecognitionException {
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:314:1: ( ruleNotificationOperation EOF )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:315:1: ruleNotificationOperation EOF
            {
             before(grammarAccess.getNotificationOperationRule()); 
            pushFollow(FOLLOW_ruleNotificationOperation_in_entryRuleNotificationOperation601);
            ruleNotificationOperation();
            _fsp--;

             after(grammarAccess.getNotificationOperationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNotificationOperation608); 

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
    // $ANTLR end entryRuleNotificationOperation


    // $ANTLR start ruleNotificationOperation
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:322:1: ruleNotificationOperation : ( ( rule__NotificationOperation__Group__0 ) ) ;
    public final void ruleNotificationOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:326:2: ( ( ( rule__NotificationOperation__Group__0 ) ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:327:1: ( ( rule__NotificationOperation__Group__0 ) )
            {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:327:1: ( ( rule__NotificationOperation__Group__0 ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:328:1: ( rule__NotificationOperation__Group__0 )
            {
             before(grammarAccess.getNotificationOperationAccess().getGroup()); 
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:329:1: ( rule__NotificationOperation__Group__0 )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:329:2: rule__NotificationOperation__Group__0
            {
            pushFollow(FOLLOW_rule__NotificationOperation__Group__0_in_ruleNotificationOperation634);
            rule__NotificationOperation__Group__0();
            _fsp--;


            }

             after(grammarAccess.getNotificationOperationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleNotificationOperation


    // $ANTLR start entryRuleBinding
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:341:1: entryRuleBinding : ruleBinding EOF ;
    public final void entryRuleBinding() throws RecognitionException {
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:342:1: ( ruleBinding EOF )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:343:1: ruleBinding EOF
            {
             before(grammarAccess.getBindingRule()); 
            pushFollow(FOLLOW_ruleBinding_in_entryRuleBinding661);
            ruleBinding();
            _fsp--;

             after(grammarAccess.getBindingRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBinding668); 

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
    // $ANTLR end entryRuleBinding


    // $ANTLR start ruleBinding
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:350:1: ruleBinding : ( ( rule__Binding__Group__0 ) ) ;
    public final void ruleBinding() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:354:2: ( ( ( rule__Binding__Group__0 ) ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:355:1: ( ( rule__Binding__Group__0 ) )
            {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:355:1: ( ( rule__Binding__Group__0 ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:356:1: ( rule__Binding__Group__0 )
            {
             before(grammarAccess.getBindingAccess().getGroup()); 
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:357:1: ( rule__Binding__Group__0 )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:357:2: rule__Binding__Group__0
            {
            pushFollow(FOLLOW_rule__Binding__Group__0_in_ruleBinding694);
            rule__Binding__Group__0();
            _fsp--;


            }

             after(grammarAccess.getBindingAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleBinding


    // $ANTLR start entryRuleTransport
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:369:1: entryRuleTransport : ruleTransport EOF ;
    public final void entryRuleTransport() throws RecognitionException {
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:370:1: ( ruleTransport EOF )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:371:1: ruleTransport EOF
            {
             before(grammarAccess.getTransportRule()); 
            pushFollow(FOLLOW_ruleTransport_in_entryRuleTransport721);
            ruleTransport();
            _fsp--;

             after(grammarAccess.getTransportRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransport728); 

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
    // $ANTLR end entryRuleTransport


    // $ANTLR start ruleTransport
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:378:1: ruleTransport : ( ( rule__Transport__Alternatives ) ) ;
    public final void ruleTransport() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:382:2: ( ( ( rule__Transport__Alternatives ) ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:383:1: ( ( rule__Transport__Alternatives ) )
            {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:383:1: ( ( rule__Transport__Alternatives ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:384:1: ( rule__Transport__Alternatives )
            {
             before(grammarAccess.getTransportAccess().getAlternatives()); 
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:385:1: ( rule__Transport__Alternatives )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:385:2: rule__Transport__Alternatives
            {
            pushFollow(FOLLOW_rule__Transport__Alternatives_in_ruleTransport754);
            rule__Transport__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getTransportAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleTransport


    // $ANTLR start entryRuleSoapTransport
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:397:1: entryRuleSoapTransport : ruleSoapTransport EOF ;
    public final void entryRuleSoapTransport() throws RecognitionException {
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:398:1: ( ruleSoapTransport EOF )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:399:1: ruleSoapTransport EOF
            {
             before(grammarAccess.getSoapTransportRule()); 
            pushFollow(FOLLOW_ruleSoapTransport_in_entryRuleSoapTransport781);
            ruleSoapTransport();
            _fsp--;

             after(grammarAccess.getSoapTransportRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSoapTransport788); 

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
    // $ANTLR end entryRuleSoapTransport


    // $ANTLR start ruleSoapTransport
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:406:1: ruleSoapTransport : ( ( rule__SoapTransport__Group__0 ) ) ;
    public final void ruleSoapTransport() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:410:2: ( ( ( rule__SoapTransport__Group__0 ) ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:411:1: ( ( rule__SoapTransport__Group__0 ) )
            {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:411:1: ( ( rule__SoapTransport__Group__0 ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:412:1: ( rule__SoapTransport__Group__0 )
            {
             before(grammarAccess.getSoapTransportAccess().getGroup()); 
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:413:1: ( rule__SoapTransport__Group__0 )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:413:2: rule__SoapTransport__Group__0
            {
            pushFollow(FOLLOW_rule__SoapTransport__Group__0_in_ruleSoapTransport814);
            rule__SoapTransport__Group__0();
            _fsp--;


            }

             after(grammarAccess.getSoapTransportAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleSoapTransport


    // $ANTLR start entryRuleHttpTransport
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:425:1: entryRuleHttpTransport : ruleHttpTransport EOF ;
    public final void entryRuleHttpTransport() throws RecognitionException {
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:426:1: ( ruleHttpTransport EOF )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:427:1: ruleHttpTransport EOF
            {
             before(grammarAccess.getHttpTransportRule()); 
            pushFollow(FOLLOW_ruleHttpTransport_in_entryRuleHttpTransport841);
            ruleHttpTransport();
            _fsp--;

             after(grammarAccess.getHttpTransportRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHttpTransport848); 

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
    // $ANTLR end entryRuleHttpTransport


    // $ANTLR start ruleHttpTransport
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:434:1: ruleHttpTransport : ( ( rule__HttpTransport__Group__0 ) ) ;
    public final void ruleHttpTransport() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:438:2: ( ( ( rule__HttpTransport__Group__0 ) ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:439:1: ( ( rule__HttpTransport__Group__0 ) )
            {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:439:1: ( ( rule__HttpTransport__Group__0 ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:440:1: ( rule__HttpTransport__Group__0 )
            {
             before(grammarAccess.getHttpTransportAccess().getGroup()); 
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:441:1: ( rule__HttpTransport__Group__0 )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:441:2: rule__HttpTransport__Group__0
            {
            pushFollow(FOLLOW_rule__HttpTransport__Group__0_in_ruleHttpTransport874);
            rule__HttpTransport__Group__0();
            _fsp--;


            }

             after(grammarAccess.getHttpTransportAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleHttpTransport


    // $ANTLR start entryRuleService
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:453:1: entryRuleService : ruleService EOF ;
    public final void entryRuleService() throws RecognitionException {
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:454:1: ( ruleService EOF )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:455:1: ruleService EOF
            {
             before(grammarAccess.getServiceRule()); 
            pushFollow(FOLLOW_ruleService_in_entryRuleService901);
            ruleService();
            _fsp--;

             after(grammarAccess.getServiceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleService908); 

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
    // $ANTLR end entryRuleService


    // $ANTLR start ruleService
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:462:1: ruleService : ( ( rule__Service__Group__0 ) ) ;
    public final void ruleService() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:466:2: ( ( ( rule__Service__Group__0 ) ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:467:1: ( ( rule__Service__Group__0 ) )
            {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:467:1: ( ( rule__Service__Group__0 ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:468:1: ( rule__Service__Group__0 )
            {
             before(grammarAccess.getServiceAccess().getGroup()); 
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:469:1: ( rule__Service__Group__0 )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:469:2: rule__Service__Group__0
            {
            pushFollow(FOLLOW_rule__Service__Group__0_in_ruleService934);
            rule__Service__Group__0();
            _fsp--;


            }

             after(grammarAccess.getServiceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleService


    // $ANTLR start entryRulePort
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:481:1: entryRulePort : rulePort EOF ;
    public final void entryRulePort() throws RecognitionException {
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:482:1: ( rulePort EOF )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:483:1: rulePort EOF
            {
             before(grammarAccess.getPortRule()); 
            pushFollow(FOLLOW_rulePort_in_entryRulePort961);
            rulePort();
            _fsp--;

             after(grammarAccess.getPortRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePort968); 

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
    // $ANTLR end entryRulePort


    // $ANTLR start rulePort
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:490:1: rulePort : ( ( rule__Port__Group__0 ) ) ;
    public final void rulePort() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:494:2: ( ( ( rule__Port__Group__0 ) ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:495:1: ( ( rule__Port__Group__0 ) )
            {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:495:1: ( ( rule__Port__Group__0 ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:496:1: ( rule__Port__Group__0 )
            {
             before(grammarAccess.getPortAccess().getGroup()); 
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:497:1: ( rule__Port__Group__0 )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:497:2: rule__Port__Group__0
            {
            pushFollow(FOLLOW_rule__Port__Group__0_in_rulePort994);
            rule__Port__Group__0();
            _fsp--;


            }

             after(grammarAccess.getPortAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rulePort


    // $ANTLR start ruleSoapType
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:510:1: ruleSoapType : ( ( rule__SoapType__Alternatives ) ) ;
    public final void ruleSoapType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:514:1: ( ( ( rule__SoapType__Alternatives ) ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:515:1: ( ( rule__SoapType__Alternatives ) )
            {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:515:1: ( ( rule__SoapType__Alternatives ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:516:1: ( rule__SoapType__Alternatives )
            {
             before(grammarAccess.getSoapTypeAccess().getAlternatives()); 
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:517:1: ( rule__SoapType__Alternatives )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:517:2: rule__SoapType__Alternatives
            {
            pushFollow(FOLLOW_rule__SoapType__Alternatives_in_ruleSoapType1031);
            rule__SoapType__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getSoapTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleSoapType


    // $ANTLR start ruleHttpType
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:529:1: ruleHttpType : ( ( rule__HttpType__Alternatives ) ) ;
    public final void ruleHttpType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:533:1: ( ( ( rule__HttpType__Alternatives ) ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:534:1: ( ( rule__HttpType__Alternatives ) )
            {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:534:1: ( ( rule__HttpType__Alternatives ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:535:1: ( rule__HttpType__Alternatives )
            {
             before(grammarAccess.getHttpTypeAccess().getAlternatives()); 
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:536:1: ( rule__HttpType__Alternatives )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:536:2: rule__HttpType__Alternatives
            {
            pushFollow(FOLLOW_rule__HttpType__Alternatives_in_ruleHttpType1067);
            rule__HttpType__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getHttpTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleHttpType


    // $ANTLR start rule__Operation__Alternatives
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:547:1: rule__Operation__Alternatives : ( ( ruleOneWayOperation ) | ( ruleRequestResponseOperation ) | ( ruleSolicitResponseOperation ) | ( ruleNotificationOperation ) );
    public final void rule__Operation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:551:1: ( ( ruleOneWayOperation ) | ( ruleRequestResponseOperation ) | ( ruleSolicitResponseOperation ) | ( ruleNotificationOperation ) )
            int alt1=4;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==26) ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==RULE_ID) ) {
                    int LA1_2 = input.LA(3);

                    if ( (LA1_2==27) ) {
                        int LA1_3 = input.LA(4);

                        if ( (LA1_3==RULE_ID) ) {
                            switch ( input.LA(5) ) {
                            case EOF:
                            case 24:
                            case 26:
                                {
                                alt1=1;
                                }
                                break;
                            case 25:
                                {
                                alt1=2;
                                }
                                break;
                            case 28:
                                {
                                alt1=3;
                                }
                                break;
                            default:
                                NoViableAltException nvae =
                                    new NoViableAltException("547:1: rule__Operation__Alternatives : ( ( ruleOneWayOperation ) | ( ruleRequestResponseOperation ) | ( ruleSolicitResponseOperation ) | ( ruleNotificationOperation ) );", 1, 4, input);

                                throw nvae;
                            }

                        }
                        else if ( (LA1_3==25) ) {
                            alt1=4;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("547:1: rule__Operation__Alternatives : ( ( ruleOneWayOperation ) | ( ruleRequestResponseOperation ) | ( ruleSolicitResponseOperation ) | ( ruleNotificationOperation ) );", 1, 3, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("547:1: rule__Operation__Alternatives : ( ( ruleOneWayOperation ) | ( ruleRequestResponseOperation ) | ( ruleSolicitResponseOperation ) | ( ruleNotificationOperation ) );", 1, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("547:1: rule__Operation__Alternatives : ( ( ruleOneWayOperation ) | ( ruleRequestResponseOperation ) | ( ruleSolicitResponseOperation ) | ( ruleNotificationOperation ) );", 1, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("547:1: rule__Operation__Alternatives : ( ( ruleOneWayOperation ) | ( ruleRequestResponseOperation ) | ( ruleSolicitResponseOperation ) | ( ruleNotificationOperation ) );", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:552:1: ( ruleOneWayOperation )
                    {
                    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:552:1: ( ruleOneWayOperation )
                    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:553:1: ruleOneWayOperation
                    {
                     before(grammarAccess.getOperationAccess().getOneWayOperationParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleOneWayOperation_in_rule__Operation__Alternatives1102);
                    ruleOneWayOperation();
                    _fsp--;

                     after(grammarAccess.getOperationAccess().getOneWayOperationParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:558:6: ( ruleRequestResponseOperation )
                    {
                    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:558:6: ( ruleRequestResponseOperation )
                    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:559:1: ruleRequestResponseOperation
                    {
                     before(grammarAccess.getOperationAccess().getRequestResponseOperationParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleRequestResponseOperation_in_rule__Operation__Alternatives1119);
                    ruleRequestResponseOperation();
                    _fsp--;

                     after(grammarAccess.getOperationAccess().getRequestResponseOperationParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:564:6: ( ruleSolicitResponseOperation )
                    {
                    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:564:6: ( ruleSolicitResponseOperation )
                    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:565:1: ruleSolicitResponseOperation
                    {
                     before(grammarAccess.getOperationAccess().getSolicitResponseOperationParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleSolicitResponseOperation_in_rule__Operation__Alternatives1136);
                    ruleSolicitResponseOperation();
                    _fsp--;

                     after(grammarAccess.getOperationAccess().getSolicitResponseOperationParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:570:6: ( ruleNotificationOperation )
                    {
                    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:570:6: ( ruleNotificationOperation )
                    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:571:1: ruleNotificationOperation
                    {
                     before(grammarAccess.getOperationAccess().getNotificationOperationParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleNotificationOperation_in_rule__Operation__Alternatives1153);
                    ruleNotificationOperation();
                    _fsp--;

                     after(grammarAccess.getOperationAccess().getNotificationOperationParserRuleCall_3()); 

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
    // $ANTLR end rule__Operation__Alternatives


    // $ANTLR start rule__Transport__Alternatives
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:581:1: rule__Transport__Alternatives : ( ( ruleSoapTransport ) | ( ruleHttpTransport ) );
    public final void rule__Transport__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:585:1: ( ( ruleSoapTransport ) | ( ruleHttpTransport ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==31) ) {
                alt2=1;
            }
            else if ( (LA2_0==34) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("581:1: rule__Transport__Alternatives : ( ( ruleSoapTransport ) | ( ruleHttpTransport ) );", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:586:1: ( ruleSoapTransport )
                    {
                    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:586:1: ( ruleSoapTransport )
                    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:587:1: ruleSoapTransport
                    {
                     before(grammarAccess.getTransportAccess().getSoapTransportParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleSoapTransport_in_rule__Transport__Alternatives1185);
                    ruleSoapTransport();
                    _fsp--;

                     after(grammarAccess.getTransportAccess().getSoapTransportParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:592:6: ( ruleHttpTransport )
                    {
                    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:592:6: ( ruleHttpTransport )
                    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:593:1: ruleHttpTransport
                    {
                     before(grammarAccess.getTransportAccess().getHttpTransportParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleHttpTransport_in_rule__Transport__Alternatives1202);
                    ruleHttpTransport();
                    _fsp--;

                     after(grammarAccess.getTransportAccess().getHttpTransportParserRuleCall_1()); 

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
    // $ANTLR end rule__Transport__Alternatives


    // $ANTLR start rule__SoapType__Alternatives
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:603:1: rule__SoapType__Alternatives : ( ( ( 'document' ) ) | ( ( 'rpc' ) ) );
    public final void rule__SoapType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:607:1: ( ( ( 'document' ) ) | ( ( 'rpc' ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            else if ( (LA3_0==12) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("603:1: rule__SoapType__Alternatives : ( ( ( 'document' ) ) | ( ( 'rpc' ) ) );", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:608:1: ( ( 'document' ) )
                    {
                    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:608:1: ( ( 'document' ) )
                    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:609:1: ( 'document' )
                    {
                     before(grammarAccess.getSoapTypeAccess().getDocumentEnumLiteralDeclaration_0()); 
                    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:610:1: ( 'document' )
                    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:610:3: 'document'
                    {
                    match(input,11,FOLLOW_11_in_rule__SoapType__Alternatives1235); 

                    }

                     after(grammarAccess.getSoapTypeAccess().getDocumentEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:615:6: ( ( 'rpc' ) )
                    {
                    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:615:6: ( ( 'rpc' ) )
                    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:616:1: ( 'rpc' )
                    {
                     before(grammarAccess.getSoapTypeAccess().getRpcEnumLiteralDeclaration_1()); 
                    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:617:1: ( 'rpc' )
                    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:617:3: 'rpc'
                    {
                    match(input,12,FOLLOW_12_in_rule__SoapType__Alternatives1256); 

                    }

                     after(grammarAccess.getSoapTypeAccess().getRpcEnumLiteralDeclaration_1()); 

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
    // $ANTLR end rule__SoapType__Alternatives


    // $ANTLR start rule__HttpType__Alternatives
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:627:1: rule__HttpType__Alternatives : ( ( ( 'get' ) ) | ( ( 'put' ) ) );
    public final void rule__HttpType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:631:1: ( ( ( 'get' ) ) | ( ( 'put' ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==13) ) {
                alt4=1;
            }
            else if ( (LA4_0==14) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("627:1: rule__HttpType__Alternatives : ( ( ( 'get' ) ) | ( ( 'put' ) ) );", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:632:1: ( ( 'get' ) )
                    {
                    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:632:1: ( ( 'get' ) )
                    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:633:1: ( 'get' )
                    {
                     before(grammarAccess.getHttpTypeAccess().getGetEnumLiteralDeclaration_0()); 
                    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:634:1: ( 'get' )
                    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:634:3: 'get'
                    {
                    match(input,13,FOLLOW_13_in_rule__HttpType__Alternatives1292); 

                    }

                     after(grammarAccess.getHttpTypeAccess().getGetEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:639:6: ( ( 'put' ) )
                    {
                    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:639:6: ( ( 'put' ) )
                    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:640:1: ( 'put' )
                    {
                     before(grammarAccess.getHttpTypeAccess().getPutEnumLiteralDeclaration_1()); 
                    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:641:1: ( 'put' )
                    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:641:3: 'put'
                    {
                    match(input,14,FOLLOW_14_in_rule__HttpType__Alternatives1313); 

                    }

                     after(grammarAccess.getHttpTypeAccess().getPutEnumLiteralDeclaration_1()); 

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
    // $ANTLR end rule__HttpType__Alternatives


    // $ANTLR start rule__Definitions__Group__0
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:653:1: rule__Definitions__Group__0 : rule__Definitions__Group__0__Impl rule__Definitions__Group__1 ;
    public final void rule__Definitions__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:657:1: ( rule__Definitions__Group__0__Impl rule__Definitions__Group__1 )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:658:2: rule__Definitions__Group__0__Impl rule__Definitions__Group__1
            {
            pushFollow(FOLLOW_rule__Definitions__Group__0__Impl_in_rule__Definitions__Group__01346);
            rule__Definitions__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Definitions__Group__1_in_rule__Definitions__Group__01349);
            rule__Definitions__Group__1();
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
    // $ANTLR end rule__Definitions__Group__0


    // $ANTLR start rule__Definitions__Group__0__Impl
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:665:1: rule__Definitions__Group__0__Impl : ( 'wsdl' ) ;
    public final void rule__Definitions__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:669:1: ( ( 'wsdl' ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:670:1: ( 'wsdl' )
            {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:670:1: ( 'wsdl' )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:671:1: 'wsdl'
            {
             before(grammarAccess.getDefinitionsAccess().getWsdlKeyword_0()); 
            match(input,15,FOLLOW_15_in_rule__Definitions__Group__0__Impl1377); 
             after(grammarAccess.getDefinitionsAccess().getWsdlKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Definitions__Group__0__Impl


    // $ANTLR start rule__Definitions__Group__1
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:684:1: rule__Definitions__Group__1 : rule__Definitions__Group__1__Impl rule__Definitions__Group__2 ;
    public final void rule__Definitions__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:688:1: ( rule__Definitions__Group__1__Impl rule__Definitions__Group__2 )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:689:2: rule__Definitions__Group__1__Impl rule__Definitions__Group__2
            {
            pushFollow(FOLLOW_rule__Definitions__Group__1__Impl_in_rule__Definitions__Group__11408);
            rule__Definitions__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Definitions__Group__2_in_rule__Definitions__Group__11411);
            rule__Definitions__Group__2();
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
    // $ANTLR end rule__Definitions__Group__1


    // $ANTLR start rule__Definitions__Group__1__Impl
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:696:1: rule__Definitions__Group__1__Impl : ( ( rule__Definitions__NameAssignment_1 ) ) ;
    public final void rule__Definitions__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:700:1: ( ( ( rule__Definitions__NameAssignment_1 ) ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:701:1: ( ( rule__Definitions__NameAssignment_1 ) )
            {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:701:1: ( ( rule__Definitions__NameAssignment_1 ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:702:1: ( rule__Definitions__NameAssignment_1 )
            {
             before(grammarAccess.getDefinitionsAccess().getNameAssignment_1()); 
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:703:1: ( rule__Definitions__NameAssignment_1 )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:703:2: rule__Definitions__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Definitions__NameAssignment_1_in_rule__Definitions__Group__1__Impl1438);
            rule__Definitions__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getDefinitionsAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Definitions__Group__1__Impl


    // $ANTLR start rule__Definitions__Group__2
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:713:1: rule__Definitions__Group__2 : rule__Definitions__Group__2__Impl rule__Definitions__Group__3 ;
    public final void rule__Definitions__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:717:1: ( rule__Definitions__Group__2__Impl rule__Definitions__Group__3 )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:718:2: rule__Definitions__Group__2__Impl rule__Definitions__Group__3
            {
            pushFollow(FOLLOW_rule__Definitions__Group__2__Impl_in_rule__Definitions__Group__21468);
            rule__Definitions__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Definitions__Group__3_in_rule__Definitions__Group__21471);
            rule__Definitions__Group__3();
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
    // $ANTLR end rule__Definitions__Group__2


    // $ANTLR start rule__Definitions__Group__2__Impl
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:725:1: rule__Definitions__Group__2__Impl : ( 'namespace:' ) ;
    public final void rule__Definitions__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:729:1: ( ( 'namespace:' ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:730:1: ( 'namespace:' )
            {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:730:1: ( 'namespace:' )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:731:1: 'namespace:'
            {
             before(grammarAccess.getDefinitionsAccess().getNamespaceKeyword_2()); 
            match(input,16,FOLLOW_16_in_rule__Definitions__Group__2__Impl1499); 
             after(grammarAccess.getDefinitionsAccess().getNamespaceKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Definitions__Group__2__Impl


    // $ANTLR start rule__Definitions__Group__3
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:744:1: rule__Definitions__Group__3 : rule__Definitions__Group__3__Impl rule__Definitions__Group__4 ;
    public final void rule__Definitions__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:748:1: ( rule__Definitions__Group__3__Impl rule__Definitions__Group__4 )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:749:2: rule__Definitions__Group__3__Impl rule__Definitions__Group__4
            {
            pushFollow(FOLLOW_rule__Definitions__Group__3__Impl_in_rule__Definitions__Group__31530);
            rule__Definitions__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Definitions__Group__4_in_rule__Definitions__Group__31533);
            rule__Definitions__Group__4();
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
    // $ANTLR end rule__Definitions__Group__3


    // $ANTLR start rule__Definitions__Group__3__Impl
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:756:1: rule__Definitions__Group__3__Impl : ( ( rule__Definitions__NsUriAssignment_3 ) ) ;
    public final void rule__Definitions__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:760:1: ( ( ( rule__Definitions__NsUriAssignment_3 ) ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:761:1: ( ( rule__Definitions__NsUriAssignment_3 ) )
            {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:761:1: ( ( rule__Definitions__NsUriAssignment_3 ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:762:1: ( rule__Definitions__NsUriAssignment_3 )
            {
             before(grammarAccess.getDefinitionsAccess().getNsUriAssignment_3()); 
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:763:1: ( rule__Definitions__NsUriAssignment_3 )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:763:2: rule__Definitions__NsUriAssignment_3
            {
            pushFollow(FOLLOW_rule__Definitions__NsUriAssignment_3_in_rule__Definitions__Group__3__Impl1560);
            rule__Definitions__NsUriAssignment_3();
            _fsp--;


            }

             after(grammarAccess.getDefinitionsAccess().getNsUriAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Definitions__Group__3__Impl


    // $ANTLR start rule__Definitions__Group__4
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:773:1: rule__Definitions__Group__4 : rule__Definitions__Group__4__Impl rule__Definitions__Group__5 ;
    public final void rule__Definitions__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:777:1: ( rule__Definitions__Group__4__Impl rule__Definitions__Group__5 )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:778:2: rule__Definitions__Group__4__Impl rule__Definitions__Group__5
            {
            pushFollow(FOLLOW_rule__Definitions__Group__4__Impl_in_rule__Definitions__Group__41590);
            rule__Definitions__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Definitions__Group__5_in_rule__Definitions__Group__41593);
            rule__Definitions__Group__5();
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
    // $ANTLR end rule__Definitions__Group__4


    // $ANTLR start rule__Definitions__Group__4__Impl
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:785:1: rule__Definitions__Group__4__Impl : ( ( rule__Definitions__XsdImportAssignment_4 ) ) ;
    public final void rule__Definitions__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:789:1: ( ( ( rule__Definitions__XsdImportAssignment_4 ) ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:790:1: ( ( rule__Definitions__XsdImportAssignment_4 ) )
            {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:790:1: ( ( rule__Definitions__XsdImportAssignment_4 ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:791:1: ( rule__Definitions__XsdImportAssignment_4 )
            {
             before(grammarAccess.getDefinitionsAccess().getXsdImportAssignment_4()); 
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:792:1: ( rule__Definitions__XsdImportAssignment_4 )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:792:2: rule__Definitions__XsdImportAssignment_4
            {
            pushFollow(FOLLOW_rule__Definitions__XsdImportAssignment_4_in_rule__Definitions__Group__4__Impl1620);
            rule__Definitions__XsdImportAssignment_4();
            _fsp--;


            }

             after(grammarAccess.getDefinitionsAccess().getXsdImportAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Definitions__Group__4__Impl


    // $ANTLR start rule__Definitions__Group__5
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:802:1: rule__Definitions__Group__5 : rule__Definitions__Group__5__Impl rule__Definitions__Group__6 ;
    public final void rule__Definitions__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:806:1: ( rule__Definitions__Group__5__Impl rule__Definitions__Group__6 )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:807:2: rule__Definitions__Group__5__Impl rule__Definitions__Group__6
            {
            pushFollow(FOLLOW_rule__Definitions__Group__5__Impl_in_rule__Definitions__Group__51650);
            rule__Definitions__Group__5__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Definitions__Group__6_in_rule__Definitions__Group__51653);
            rule__Definitions__Group__6();
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
    // $ANTLR end rule__Definitions__Group__5


    // $ANTLR start rule__Definitions__Group__5__Impl
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:814:1: rule__Definitions__Group__5__Impl : ( ( rule__Definitions__Group_5__0 )? ) ;
    public final void rule__Definitions__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:818:1: ( ( ( rule__Definitions__Group_5__0 )? ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:819:1: ( ( rule__Definitions__Group_5__0 )? )
            {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:819:1: ( ( rule__Definitions__Group_5__0 )? )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:820:1: ( rule__Definitions__Group_5__0 )?
            {
             before(grammarAccess.getDefinitionsAccess().getGroup_5()); 
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:821:1: ( rule__Definitions__Group_5__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:821:2: rule__Definitions__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Definitions__Group_5__0_in_rule__Definitions__Group__5__Impl1680);
                    rule__Definitions__Group_5__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDefinitionsAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Definitions__Group__5__Impl


    // $ANTLR start rule__Definitions__Group__6
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:831:1: rule__Definitions__Group__6 : rule__Definitions__Group__6__Impl rule__Definitions__Group__7 ;
    public final void rule__Definitions__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:835:1: ( rule__Definitions__Group__6__Impl rule__Definitions__Group__7 )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:836:2: rule__Definitions__Group__6__Impl rule__Definitions__Group__7
            {
            pushFollow(FOLLOW_rule__Definitions__Group__6__Impl_in_rule__Definitions__Group__61711);
            rule__Definitions__Group__6__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Definitions__Group__7_in_rule__Definitions__Group__61714);
            rule__Definitions__Group__7();
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
    // $ANTLR end rule__Definitions__Group__6


    // $ANTLR start rule__Definitions__Group__6__Impl
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:843:1: rule__Definitions__Group__6__Impl : ( ( rule__Definitions__Group_6__0 )? ) ;
    public final void rule__Definitions__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:847:1: ( ( ( rule__Definitions__Group_6__0 )? ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:848:1: ( ( rule__Definitions__Group_6__0 )? )
            {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:848:1: ( ( rule__Definitions__Group_6__0 )? )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:849:1: ( rule__Definitions__Group_6__0 )?
            {
             before(grammarAccess.getDefinitionsAccess().getGroup_6()); 
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:850:1: ( rule__Definitions__Group_6__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:850:2: rule__Definitions__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__Definitions__Group_6__0_in_rule__Definitions__Group__6__Impl1741);
                    rule__Definitions__Group_6__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDefinitionsAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Definitions__Group__6__Impl


    // $ANTLR start rule__Definitions__Group__7
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:860:1: rule__Definitions__Group__7 : rule__Definitions__Group__7__Impl rule__Definitions__Group__8 ;
    public final void rule__Definitions__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:864:1: ( rule__Definitions__Group__7__Impl rule__Definitions__Group__8 )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:865:2: rule__Definitions__Group__7__Impl rule__Definitions__Group__8
            {
            pushFollow(FOLLOW_rule__Definitions__Group__7__Impl_in_rule__Definitions__Group__71772);
            rule__Definitions__Group__7__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Definitions__Group__8_in_rule__Definitions__Group__71775);
            rule__Definitions__Group__8();
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
    // $ANTLR end rule__Definitions__Group__7


    // $ANTLR start rule__Definitions__Group__7__Impl
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:872:1: rule__Definitions__Group__7__Impl : ( ( rule__Definitions__Group_7__0 )? ) ;
    public final void rule__Definitions__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:876:1: ( ( ( rule__Definitions__Group_7__0 )? ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:877:1: ( ( rule__Definitions__Group_7__0 )? )
            {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:877:1: ( ( rule__Definitions__Group_7__0 )? )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:878:1: ( rule__Definitions__Group_7__0 )?
            {
             before(grammarAccess.getDefinitionsAccess().getGroup_7()); 
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:879:1: ( rule__Definitions__Group_7__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:879:2: rule__Definitions__Group_7__0
                    {
                    pushFollow(FOLLOW_rule__Definitions__Group_7__0_in_rule__Definitions__Group__7__Impl1802);
                    rule__Definitions__Group_7__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDefinitionsAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Definitions__Group__7__Impl


    // $ANTLR start rule__Definitions__Group__8
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:889:1: rule__Definitions__Group__8 : rule__Definitions__Group__8__Impl ;
    public final void rule__Definitions__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:893:1: ( rule__Definitions__Group__8__Impl )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:894:2: rule__Definitions__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__Definitions__Group__8__Impl_in_rule__Definitions__Group__81833);
            rule__Definitions__Group__8__Impl();
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
    // $ANTLR end rule__Definitions__Group__8


    // $ANTLR start rule__Definitions__Group__8__Impl
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:900:1: rule__Definitions__Group__8__Impl : ( ( rule__Definitions__Group_8__0 )? ) ;
    public final void rule__Definitions__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:904:1: ( ( ( rule__Definitions__Group_8__0 )? ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:905:1: ( ( rule__Definitions__Group_8__0 )? )
            {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:905:1: ( ( rule__Definitions__Group_8__0 )? )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:906:1: ( rule__Definitions__Group_8__0 )?
            {
             before(grammarAccess.getDefinitionsAccess().getGroup_8()); 
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:907:1: ( rule__Definitions__Group_8__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==20) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:907:2: rule__Definitions__Group_8__0
                    {
                    pushFollow(FOLLOW_rule__Definitions__Group_8__0_in_rule__Definitions__Group__8__Impl1860);
                    rule__Definitions__Group_8__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDefinitionsAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Definitions__Group__8__Impl


    // $ANTLR start rule__Definitions__Group_5__0
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:935:1: rule__Definitions__Group_5__0 : rule__Definitions__Group_5__0__Impl rule__Definitions__Group_5__1 ;
    public final void rule__Definitions__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:939:1: ( rule__Definitions__Group_5__0__Impl rule__Definitions__Group_5__1 )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:940:2: rule__Definitions__Group_5__0__Impl rule__Definitions__Group_5__1
            {
            pushFollow(FOLLOW_rule__Definitions__Group_5__0__Impl_in_rule__Definitions__Group_5__01909);
            rule__Definitions__Group_5__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Definitions__Group_5__1_in_rule__Definitions__Group_5__01912);
            rule__Definitions__Group_5__1();
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
    // $ANTLR end rule__Definitions__Group_5__0


    // $ANTLR start rule__Definitions__Group_5__0__Impl
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:947:1: rule__Definitions__Group_5__0__Impl : ( 'messages:' ) ;
    public final void rule__Definitions__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:951:1: ( ( 'messages:' ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:952:1: ( 'messages:' )
            {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:952:1: ( 'messages:' )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:953:1: 'messages:'
            {
             before(grammarAccess.getDefinitionsAccess().getMessagesKeyword_5_0()); 
            match(input,17,FOLLOW_17_in_rule__Definitions__Group_5__0__Impl1940); 
             after(grammarAccess.getDefinitionsAccess().getMessagesKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Definitions__Group_5__0__Impl


    // $ANTLR start rule__Definitions__Group_5__1
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:966:1: rule__Definitions__Group_5__1 : rule__Definitions__Group_5__1__Impl ;
    public final void rule__Definitions__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:970:1: ( rule__Definitions__Group_5__1__Impl )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:971:2: rule__Definitions__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__Definitions__Group_5__1__Impl_in_rule__Definitions__Group_5__11971);
            rule__Definitions__Group_5__1__Impl();
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
    // $ANTLR end rule__Definitions__Group_5__1


    // $ANTLR start rule__Definitions__Group_5__1__Impl
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:977:1: rule__Definitions__Group_5__1__Impl : ( ( rule__Definitions__MessagesAssignment_5_1 )* ) ;
    public final void rule__Definitions__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:981:1: ( ( ( rule__Definitions__MessagesAssignment_5_1 )* ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:982:1: ( ( rule__Definitions__MessagesAssignment_5_1 )* )
            {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:982:1: ( ( rule__Definitions__MessagesAssignment_5_1 )* )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:983:1: ( rule__Definitions__MessagesAssignment_5_1 )*
            {
             before(grammarAccess.getDefinitionsAccess().getMessagesAssignment_5_1()); 
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:984:1: ( rule__Definitions__MessagesAssignment_5_1 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:984:2: rule__Definitions__MessagesAssignment_5_1
            	    {
            	    pushFollow(FOLLOW_rule__Definitions__MessagesAssignment_5_1_in_rule__Definitions__Group_5__1__Impl1998);
            	    rule__Definitions__MessagesAssignment_5_1();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getDefinitionsAccess().getMessagesAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Definitions__Group_5__1__Impl


    // $ANTLR start rule__Definitions__Group_6__0
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:998:1: rule__Definitions__Group_6__0 : rule__Definitions__Group_6__0__Impl rule__Definitions__Group_6__1 ;
    public final void rule__Definitions__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1002:1: ( rule__Definitions__Group_6__0__Impl rule__Definitions__Group_6__1 )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1003:2: rule__Definitions__Group_6__0__Impl rule__Definitions__Group_6__1
            {
            pushFollow(FOLLOW_rule__Definitions__Group_6__0__Impl_in_rule__Definitions__Group_6__02033);
            rule__Definitions__Group_6__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Definitions__Group_6__1_in_rule__Definitions__Group_6__02036);
            rule__Definitions__Group_6__1();
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
    // $ANTLR end rule__Definitions__Group_6__0


    // $ANTLR start rule__Definitions__Group_6__0__Impl
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1010:1: rule__Definitions__Group_6__0__Impl : ( 'portTypes:' ) ;
    public final void rule__Definitions__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1014:1: ( ( 'portTypes:' ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1015:1: ( 'portTypes:' )
            {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1015:1: ( 'portTypes:' )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1016:1: 'portTypes:'
            {
             before(grammarAccess.getDefinitionsAccess().getPortTypesKeyword_6_0()); 
            match(input,18,FOLLOW_18_in_rule__Definitions__Group_6__0__Impl2064); 
             after(grammarAccess.getDefinitionsAccess().getPortTypesKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Definitions__Group_6__0__Impl


    // $ANTLR start rule__Definitions__Group_6__1
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1029:1: rule__Definitions__Group_6__1 : rule__Definitions__Group_6__1__Impl ;
    public final void rule__Definitions__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1033:1: ( rule__Definitions__Group_6__1__Impl )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1034:2: rule__Definitions__Group_6__1__Impl
            {
            pushFollow(FOLLOW_rule__Definitions__Group_6__1__Impl_in_rule__Definitions__Group_6__12095);
            rule__Definitions__Group_6__1__Impl();
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
    // $ANTLR end rule__Definitions__Group_6__1


    // $ANTLR start rule__Definitions__Group_6__1__Impl
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1040:1: rule__Definitions__Group_6__1__Impl : ( ( rule__Definitions__PortTypesAssignment_6_1 )* ) ;
    public final void rule__Definitions__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1044:1: ( ( ( rule__Definitions__PortTypesAssignment_6_1 )* ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1045:1: ( ( rule__Definitions__PortTypesAssignment_6_1 )* )
            {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1045:1: ( ( rule__Definitions__PortTypesAssignment_6_1 )* )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1046:1: ( rule__Definitions__PortTypesAssignment_6_1 )*
            {
             before(grammarAccess.getDefinitionsAccess().getPortTypesAssignment_6_1()); 
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1047:1: ( rule__Definitions__PortTypesAssignment_6_1 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1047:2: rule__Definitions__PortTypesAssignment_6_1
            	    {
            	    pushFollow(FOLLOW_rule__Definitions__PortTypesAssignment_6_1_in_rule__Definitions__Group_6__1__Impl2122);
            	    rule__Definitions__PortTypesAssignment_6_1();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getDefinitionsAccess().getPortTypesAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Definitions__Group_6__1__Impl


    // $ANTLR start rule__Definitions__Group_7__0
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1061:1: rule__Definitions__Group_7__0 : rule__Definitions__Group_7__0__Impl rule__Definitions__Group_7__1 ;
    public final void rule__Definitions__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1065:1: ( rule__Definitions__Group_7__0__Impl rule__Definitions__Group_7__1 )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1066:2: rule__Definitions__Group_7__0__Impl rule__Definitions__Group_7__1
            {
            pushFollow(FOLLOW_rule__Definitions__Group_7__0__Impl_in_rule__Definitions__Group_7__02157);
            rule__Definitions__Group_7__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Definitions__Group_7__1_in_rule__Definitions__Group_7__02160);
            rule__Definitions__Group_7__1();
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
    // $ANTLR end rule__Definitions__Group_7__0


    // $ANTLR start rule__Definitions__Group_7__0__Impl
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1073:1: rule__Definitions__Group_7__0__Impl : ( 'bindings:' ) ;
    public final void rule__Definitions__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1077:1: ( ( 'bindings:' ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1078:1: ( 'bindings:' )
            {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1078:1: ( 'bindings:' )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1079:1: 'bindings:'
            {
             before(grammarAccess.getDefinitionsAccess().getBindingsKeyword_7_0()); 
            match(input,19,FOLLOW_19_in_rule__Definitions__Group_7__0__Impl2188); 
             after(grammarAccess.getDefinitionsAccess().getBindingsKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Definitions__Group_7__0__Impl


    // $ANTLR start rule__Definitions__Group_7__1
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1092:1: rule__Definitions__Group_7__1 : rule__Definitions__Group_7__1__Impl ;
    public final void rule__Definitions__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1096:1: ( rule__Definitions__Group_7__1__Impl )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1097:2: rule__Definitions__Group_7__1__Impl
            {
            pushFollow(FOLLOW_rule__Definitions__Group_7__1__Impl_in_rule__Definitions__Group_7__12219);
            rule__Definitions__Group_7__1__Impl();
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
    // $ANTLR end rule__Definitions__Group_7__1


    // $ANTLR start rule__Definitions__Group_7__1__Impl
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1103:1: rule__Definitions__Group_7__1__Impl : ( ( rule__Definitions__BindingsAssignment_7_1 )* ) ;
    public final void rule__Definitions__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1107:1: ( ( ( rule__Definitions__BindingsAssignment_7_1 )* ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1108:1: ( ( rule__Definitions__BindingsAssignment_7_1 )* )
            {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1108:1: ( ( rule__Definitions__BindingsAssignment_7_1 )* )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1109:1: ( rule__Definitions__BindingsAssignment_7_1 )*
            {
             before(grammarAccess.getDefinitionsAccess().getBindingsAssignment_7_1()); 
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1110:1: ( rule__Definitions__BindingsAssignment_7_1 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1110:2: rule__Definitions__BindingsAssignment_7_1
            	    {
            	    pushFollow(FOLLOW_rule__Definitions__BindingsAssignment_7_1_in_rule__Definitions__Group_7__1__Impl2246);
            	    rule__Definitions__BindingsAssignment_7_1();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getDefinitionsAccess().getBindingsAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Definitions__Group_7__1__Impl


    // $ANTLR start rule__Definitions__Group_8__0
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1124:1: rule__Definitions__Group_8__0 : rule__Definitions__Group_8__0__Impl rule__Definitions__Group_8__1 ;
    public final void rule__Definitions__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1128:1: ( rule__Definitions__Group_8__0__Impl rule__Definitions__Group_8__1 )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1129:2: rule__Definitions__Group_8__0__Impl rule__Definitions__Group_8__1
            {
            pushFollow(FOLLOW_rule__Definitions__Group_8__0__Impl_in_rule__Definitions__Group_8__02281);
            rule__Definitions__Group_8__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Definitions__Group_8__1_in_rule__Definitions__Group_8__02284);
            rule__Definitions__Group_8__1();
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
    // $ANTLR end rule__Definitions__Group_8__0


    // $ANTLR start rule__Definitions__Group_8__0__Impl
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1136:1: rule__Definitions__Group_8__0__Impl : ( 'services:' ) ;
    public final void rule__Definitions__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1140:1: ( ( 'services:' ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1141:1: ( 'services:' )
            {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1141:1: ( 'services:' )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1142:1: 'services:'
            {
             before(grammarAccess.getDefinitionsAccess().getServicesKeyword_8_0()); 
            match(input,20,FOLLOW_20_in_rule__Definitions__Group_8__0__Impl2312); 
             after(grammarAccess.getDefinitionsAccess().getServicesKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Definitions__Group_8__0__Impl


    // $ANTLR start rule__Definitions__Group_8__1
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1155:1: rule__Definitions__Group_8__1 : rule__Definitions__Group_8__1__Impl ;
    public final void rule__Definitions__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1159:1: ( rule__Definitions__Group_8__1__Impl )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1160:2: rule__Definitions__Group_8__1__Impl
            {
            pushFollow(FOLLOW_rule__Definitions__Group_8__1__Impl_in_rule__Definitions__Group_8__12343);
            rule__Definitions__Group_8__1__Impl();
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
    // $ANTLR end rule__Definitions__Group_8__1


    // $ANTLR start rule__Definitions__Group_8__1__Impl
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1166:1: rule__Definitions__Group_8__1__Impl : ( ( rule__Definitions__ServicesAssignment_8_1 )* ) ;
    public final void rule__Definitions__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1170:1: ( ( ( rule__Definitions__ServicesAssignment_8_1 )* ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1171:1: ( ( rule__Definitions__ServicesAssignment_8_1 )* )
            {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1171:1: ( ( rule__Definitions__ServicesAssignment_8_1 )* )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1172:1: ( rule__Definitions__ServicesAssignment_8_1 )*
            {
             before(grammarAccess.getDefinitionsAccess().getServicesAssignment_8_1()); 
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1173:1: ( rule__Definitions__ServicesAssignment_8_1 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1173:2: rule__Definitions__ServicesAssignment_8_1
            	    {
            	    pushFollow(FOLLOW_rule__Definitions__ServicesAssignment_8_1_in_rule__Definitions__Group_8__1__Impl2370);
            	    rule__Definitions__ServicesAssignment_8_1();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getDefinitionsAccess().getServicesAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Definitions__Group_8__1__Impl


    // $ANTLR start rule__XsdImport__Group__0
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1187:1: rule__XsdImport__Group__0 : rule__XsdImport__Group__0__Impl rule__XsdImport__Group__1 ;
    public final void rule__XsdImport__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1191:1: ( rule__XsdImport__Group__0__Impl rule__XsdImport__Group__1 )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1192:2: rule__XsdImport__Group__0__Impl rule__XsdImport__Group__1
            {
            pushFollow(FOLLOW_rule__XsdImport__Group__0__Impl_in_rule__XsdImport__Group__02405);
            rule__XsdImport__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__XsdImport__Group__1_in_rule__XsdImport__Group__02408);
            rule__XsdImport__Group__1();
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
    // $ANTLR end rule__XsdImport__Group__0


    // $ANTLR start rule__XsdImport__Group__0__Impl
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1199:1: rule__XsdImport__Group__0__Impl : ( 'xsd-import' ) ;
    public final void rule__XsdImport__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1203:1: ( ( 'xsd-import' ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1204:1: ( 'xsd-import' )
            {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1204:1: ( 'xsd-import' )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1205:1: 'xsd-import'
            {
             before(grammarAccess.getXsdImportAccess().getXsdImportKeyword_0()); 
            match(input,21,FOLLOW_21_in_rule__XsdImport__Group__0__Impl2436); 
             after(grammarAccess.getXsdImportAccess().getXsdImportKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__XsdImport__Group__0__Impl


    // $ANTLR start rule__XsdImport__Group__1
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1218:1: rule__XsdImport__Group__1 : rule__XsdImport__Group__1__Impl rule__XsdImport__Group__2 ;
    public final void rule__XsdImport__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1222:1: ( rule__XsdImport__Group__1__Impl rule__XsdImport__Group__2 )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1223:2: rule__XsdImport__Group__1__Impl rule__XsdImport__Group__2
            {
            pushFollow(FOLLOW_rule__XsdImport__Group__1__Impl_in_rule__XsdImport__Group__12467);
            rule__XsdImport__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__XsdImport__Group__2_in_rule__XsdImport__Group__12470);
            rule__XsdImport__Group__2();
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
    // $ANTLR end rule__XsdImport__Group__1


    // $ANTLR start rule__XsdImport__Group__1__Impl
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1230:1: rule__XsdImport__Group__1__Impl : ( ( rule__XsdImport__ImportURIAssignment_1 ) ) ;
    public final void rule__XsdImport__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1234:1: ( ( ( rule__XsdImport__ImportURIAssignment_1 ) ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1235:1: ( ( rule__XsdImport__ImportURIAssignment_1 ) )
            {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1235:1: ( ( rule__XsdImport__ImportURIAssignment_1 ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1236:1: ( rule__XsdImport__ImportURIAssignment_1 )
            {
             before(grammarAccess.getXsdImportAccess().getImportURIAssignment_1()); 
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1237:1: ( rule__XsdImport__ImportURIAssignment_1 )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1237:2: rule__XsdImport__ImportURIAssignment_1
            {
            pushFollow(FOLLOW_rule__XsdImport__ImportURIAssignment_1_in_rule__XsdImport__Group__1__Impl2497);
            rule__XsdImport__ImportURIAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getXsdImportAccess().getImportURIAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__XsdImport__Group__1__Impl


    // $ANTLR start rule__XsdImport__Group__2
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1247:1: rule__XsdImport__Group__2 : rule__XsdImport__Group__2__Impl rule__XsdImport__Group__3 ;
    public final void rule__XsdImport__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1251:1: ( rule__XsdImport__Group__2__Impl rule__XsdImport__Group__3 )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1252:2: rule__XsdImport__Group__2__Impl rule__XsdImport__Group__3
            {
            pushFollow(FOLLOW_rule__XsdImport__Group__2__Impl_in_rule__XsdImport__Group__22527);
            rule__XsdImport__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__XsdImport__Group__3_in_rule__XsdImport__Group__22530);
            rule__XsdImport__Group__3();
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
    // $ANTLR end rule__XsdImport__Group__2


    // $ANTLR start rule__XsdImport__Group__2__Impl
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1259:1: rule__XsdImport__Group__2__Impl : ( 'as' ) ;
    public final void rule__XsdImport__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1263:1: ( ( 'as' ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1264:1: ( 'as' )
            {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1264:1: ( 'as' )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1265:1: 'as'
            {
             before(grammarAccess.getXsdImportAccess().getAsKeyword_2()); 
            match(input,22,FOLLOW_22_in_rule__XsdImport__Group__2__Impl2558); 
             after(grammarAccess.getXsdImportAccess().getAsKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__XsdImport__Group__2__Impl


    // $ANTLR start rule__XsdImport__Group__3
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1278:1: rule__XsdImport__Group__3 : rule__XsdImport__Group__3__Impl ;
    public final void rule__XsdImport__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1282:1: ( rule__XsdImport__Group__3__Impl )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1283:2: rule__XsdImport__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__XsdImport__Group__3__Impl_in_rule__XsdImport__Group__32589);
            rule__XsdImport__Group__3__Impl();
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
    // $ANTLR end rule__XsdImport__Group__3


    // $ANTLR start rule__XsdImport__Group__3__Impl
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1289:1: rule__XsdImport__Group__3__Impl : ( ( rule__XsdImport__NsPrefixAssignment_3 ) ) ;
    public final void rule__XsdImport__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1293:1: ( ( ( rule__XsdImport__NsPrefixAssignment_3 ) ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1294:1: ( ( rule__XsdImport__NsPrefixAssignment_3 ) )
            {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1294:1: ( ( rule__XsdImport__NsPrefixAssignment_3 ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1295:1: ( rule__XsdImport__NsPrefixAssignment_3 )
            {
             before(grammarAccess.getXsdImportAccess().getNsPrefixAssignment_3()); 
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1296:1: ( rule__XsdImport__NsPrefixAssignment_3 )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1296:2: rule__XsdImport__NsPrefixAssignment_3
            {
            pushFollow(FOLLOW_rule__XsdImport__NsPrefixAssignment_3_in_rule__XsdImport__Group__3__Impl2616);
            rule__XsdImport__NsPrefixAssignment_3();
            _fsp--;


            }

             after(grammarAccess.getXsdImportAccess().getNsPrefixAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__XsdImport__Group__3__Impl


    // $ANTLR start rule__Message__Group__0
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1314:1: rule__Message__Group__0 : rule__Message__Group__0__Impl rule__Message__Group__1 ;
    public final void rule__Message__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1318:1: ( rule__Message__Group__0__Impl rule__Message__Group__1 )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1319:2: rule__Message__Group__0__Impl rule__Message__Group__1
            {
            pushFollow(FOLLOW_rule__Message__Group__0__Impl_in_rule__Message__Group__02654);
            rule__Message__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Message__Group__1_in_rule__Message__Group__02657);
            rule__Message__Group__1();
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
    // $ANTLR end rule__Message__Group__0


    // $ANTLR start rule__Message__Group__0__Impl
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1326:1: rule__Message__Group__0__Impl : ( ( rule__Message__NameAssignment_0 ) ) ;
    public final void rule__Message__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1330:1: ( ( ( rule__Message__NameAssignment_0 ) ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1331:1: ( ( rule__Message__NameAssignment_0 ) )
            {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1331:1: ( ( rule__Message__NameAssignment_0 ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1332:1: ( rule__Message__NameAssignment_0 )
            {
             before(grammarAccess.getMessageAccess().getNameAssignment_0()); 
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1333:1: ( rule__Message__NameAssignment_0 )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1333:2: rule__Message__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Message__NameAssignment_0_in_rule__Message__Group__0__Impl2684);
            rule__Message__NameAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getMessageAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Message__Group__0__Impl


    // $ANTLR start rule__Message__Group__1
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1343:1: rule__Message__Group__1 : rule__Message__Group__1__Impl rule__Message__Group__2 ;
    public final void rule__Message__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1347:1: ( rule__Message__Group__1__Impl rule__Message__Group__2 )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1348:2: rule__Message__Group__1__Impl rule__Message__Group__2
            {
            pushFollow(FOLLOW_rule__Message__Group__1__Impl_in_rule__Message__Group__12714);
            rule__Message__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Message__Group__2_in_rule__Message__Group__12717);
            rule__Message__Group__2();
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
    // $ANTLR end rule__Message__Group__1


    // $ANTLR start rule__Message__Group__1__Impl
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1355:1: rule__Message__Group__1__Impl : ( '{' ) ;
    public final void rule__Message__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1359:1: ( ( '{' ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1360:1: ( '{' )
            {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1360:1: ( '{' )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1361:1: '{'
            {
             before(grammarAccess.getMessageAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,23,FOLLOW_23_in_rule__Message__Group__1__Impl2745); 
             after(grammarAccess.getMessageAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Message__Group__1__Impl


    // $ANTLR start rule__Message__Group__2
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1374:1: rule__Message__Group__2 : rule__Message__Group__2__Impl rule__Message__Group__3 ;
    public final void rule__Message__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1378:1: ( rule__Message__Group__2__Impl rule__Message__Group__3 )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1379:2: rule__Message__Group__2__Impl rule__Message__Group__3
            {
            pushFollow(FOLLOW_rule__Message__Group__2__Impl_in_rule__Message__Group__22776);
            rule__Message__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Message__Group__3_in_rule__Message__Group__22779);
            rule__Message__Group__3();
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
    // $ANTLR end rule__Message__Group__2


    // $ANTLR start rule__Message__Group__2__Impl
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1386:1: rule__Message__Group__2__Impl : ( ( rule__Message__PartsAssignment_2 )* ) ;
    public final void rule__Message__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1390:1: ( ( ( rule__Message__PartsAssignment_2 )* ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1391:1: ( ( rule__Message__PartsAssignment_2 )* )
            {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1391:1: ( ( rule__Message__PartsAssignment_2 )* )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1392:1: ( rule__Message__PartsAssignment_2 )*
            {
             before(grammarAccess.getMessageAccess().getPartsAssignment_2()); 
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1393:1: ( rule__Message__PartsAssignment_2 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1393:2: rule__Message__PartsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Message__PartsAssignment_2_in_rule__Message__Group__2__Impl2806);
            	    rule__Message__PartsAssignment_2();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getMessageAccess().getPartsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Message__Group__2__Impl


    // $ANTLR start rule__Message__Group__3
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1403:1: rule__Message__Group__3 : rule__Message__Group__3__Impl ;
    public final void rule__Message__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1407:1: ( rule__Message__Group__3__Impl )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1408:2: rule__Message__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Message__Group__3__Impl_in_rule__Message__Group__32837);
            rule__Message__Group__3__Impl();
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
    // $ANTLR end rule__Message__Group__3


    // $ANTLR start rule__Message__Group__3__Impl
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1414:1: rule__Message__Group__3__Impl : ( '}' ) ;
    public final void rule__Message__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1418:1: ( ( '}' ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1419:1: ( '}' )
            {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1419:1: ( '}' )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1420:1: '}'
            {
             before(grammarAccess.getMessageAccess().getRightCurlyBracketKeyword_3()); 
            match(input,24,FOLLOW_24_in_rule__Message__Group__3__Impl2865); 
             after(grammarAccess.getMessageAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Message__Group__3__Impl


    // $ANTLR start rule__Part__Group__0
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1441:1: rule__Part__Group__0 : rule__Part__Group__0__Impl rule__Part__Group__1 ;
    public final void rule__Part__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1445:1: ( rule__Part__Group__0__Impl rule__Part__Group__1 )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1446:2: rule__Part__Group__0__Impl rule__Part__Group__1
            {
            pushFollow(FOLLOW_rule__Part__Group__0__Impl_in_rule__Part__Group__02904);
            rule__Part__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Part__Group__1_in_rule__Part__Group__02907);
            rule__Part__Group__1();
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
    // $ANTLR end rule__Part__Group__0


    // $ANTLR start rule__Part__Group__0__Impl
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1453:1: rule__Part__Group__0__Impl : ( ( rule__Part__NameAssignment_0 ) ) ;
    public final void rule__Part__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1457:1: ( ( ( rule__Part__NameAssignment_0 ) ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1458:1: ( ( rule__Part__NameAssignment_0 ) )
            {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1458:1: ( ( rule__Part__NameAssignment_0 ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1459:1: ( rule__Part__NameAssignment_0 )
            {
             before(grammarAccess.getPartAccess().getNameAssignment_0()); 
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1460:1: ( rule__Part__NameAssignment_0 )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1460:2: rule__Part__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Part__NameAssignment_0_in_rule__Part__Group__0__Impl2934);
            rule__Part__NameAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getPartAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Part__Group__0__Impl


    // $ANTLR start rule__Part__Group__1
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1470:1: rule__Part__Group__1 : rule__Part__Group__1__Impl rule__Part__Group__2 ;
    public final void rule__Part__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1474:1: ( rule__Part__Group__1__Impl rule__Part__Group__2 )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1475:2: rule__Part__Group__1__Impl rule__Part__Group__2
            {
            pushFollow(FOLLOW_rule__Part__Group__1__Impl_in_rule__Part__Group__12964);
            rule__Part__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Part__Group__2_in_rule__Part__Group__12967);
            rule__Part__Group__2();
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
    // $ANTLR end rule__Part__Group__1


    // $ANTLR start rule__Part__Group__1__Impl
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1482:1: rule__Part__Group__1__Impl : ( '->' ) ;
    public final void rule__Part__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1486:1: ( ( '->' ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1487:1: ( '->' )
            {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1487:1: ( '->' )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1488:1: '->'
            {
             before(grammarAccess.getPartAccess().getHyphenMinusGreaterThanSignKeyword_1()); 
            match(input,25,FOLLOW_25_in_rule__Part__Group__1__Impl2995); 
             after(grammarAccess.getPartAccess().getHyphenMinusGreaterThanSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Part__Group__1__Impl


    // $ANTLR start rule__Part__Group__2
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1501:1: rule__Part__Group__2 : rule__Part__Group__2__Impl ;
    public final void rule__Part__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1505:1: ( rule__Part__Group__2__Impl )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1506:2: rule__Part__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Part__Group__2__Impl_in_rule__Part__Group__23026);
            rule__Part__Group__2__Impl();
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
    // $ANTLR end rule__Part__Group__2


    // $ANTLR start rule__Part__Group__2__Impl
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1512:1: rule__Part__Group__2__Impl : ( ( rule__Part__DefAssignment_2 ) ) ;
    public final void rule__Part__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1516:1: ( ( ( rule__Part__DefAssignment_2 ) ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1517:1: ( ( rule__Part__DefAssignment_2 ) )
            {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1517:1: ( ( rule__Part__DefAssignment_2 ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1518:1: ( rule__Part__DefAssignment_2 )
            {
             before(grammarAccess.getPartAccess().getDefAssignment_2()); 
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1519:1: ( rule__Part__DefAssignment_2 )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1519:2: rule__Part__DefAssignment_2
            {
            pushFollow(FOLLOW_rule__Part__DefAssignment_2_in_rule__Part__Group__2__Impl3053);
            rule__Part__DefAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getPartAccess().getDefAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Part__Group__2__Impl


    // $ANTLR start rule__PortType__Group__0
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1535:1: rule__PortType__Group__0 : rule__PortType__Group__0__Impl rule__PortType__Group__1 ;
    public final void rule__PortType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1539:1: ( rule__PortType__Group__0__Impl rule__PortType__Group__1 )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1540:2: rule__PortType__Group__0__Impl rule__PortType__Group__1
            {
            pushFollow(FOLLOW_rule__PortType__Group__0__Impl_in_rule__PortType__Group__03089);
            rule__PortType__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__PortType__Group__1_in_rule__PortType__Group__03092);
            rule__PortType__Group__1();
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
    // $ANTLR end rule__PortType__Group__0


    // $ANTLR start rule__PortType__Group__0__Impl
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1547:1: rule__PortType__Group__0__Impl : ( ( rule__PortType__NameAssignment_0 ) ) ;
    public final void rule__PortType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1551:1: ( ( ( rule__PortType__NameAssignment_0 ) ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1552:1: ( ( rule__PortType__NameAssignment_0 ) )
            {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1552:1: ( ( rule__PortType__NameAssignment_0 ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1553:1: ( rule__PortType__NameAssignment_0 )
            {
             before(grammarAccess.getPortTypeAccess().getNameAssignment_0()); 
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1554:1: ( rule__PortType__NameAssignment_0 )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1554:2: rule__PortType__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__PortType__NameAssignment_0_in_rule__PortType__Group__0__Impl3119);
            rule__PortType__NameAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getPortTypeAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PortType__Group__0__Impl


    // $ANTLR start rule__PortType__Group__1
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1564:1: rule__PortType__Group__1 : rule__PortType__Group__1__Impl rule__PortType__Group__2 ;
    public final void rule__PortType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1568:1: ( rule__PortType__Group__1__Impl rule__PortType__Group__2 )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1569:2: rule__PortType__Group__1__Impl rule__PortType__Group__2
            {
            pushFollow(FOLLOW_rule__PortType__Group__1__Impl_in_rule__PortType__Group__13149);
            rule__PortType__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__PortType__Group__2_in_rule__PortType__Group__13152);
            rule__PortType__Group__2();
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
    // $ANTLR end rule__PortType__Group__1


    // $ANTLR start rule__PortType__Group__1__Impl
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1576:1: rule__PortType__Group__1__Impl : ( '{' ) ;
    public final void rule__PortType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1580:1: ( ( '{' ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1581:1: ( '{' )
            {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1581:1: ( '{' )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1582:1: '{'
            {
             before(grammarAccess.getPortTypeAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,23,FOLLOW_23_in_rule__PortType__Group__1__Impl3180); 
             after(grammarAccess.getPortTypeAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PortType__Group__1__Impl


    // $ANTLR start rule__PortType__Group__2
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1595:1: rule__PortType__Group__2 : rule__PortType__Group__2__Impl rule__PortType__Group__3 ;
    public final void rule__PortType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1599:1: ( rule__PortType__Group__2__Impl rule__PortType__Group__3 )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1600:2: rule__PortType__Group__2__Impl rule__PortType__Group__3
            {
            pushFollow(FOLLOW_rule__PortType__Group__2__Impl_in_rule__PortType__Group__23211);
            rule__PortType__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__PortType__Group__3_in_rule__PortType__Group__23214);
            rule__PortType__Group__3();
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
    // $ANTLR end rule__PortType__Group__2


    // $ANTLR start rule__PortType__Group__2__Impl
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1607:1: rule__PortType__Group__2__Impl : ( ( rule__PortType__OperationsAssignment_2 )* ) ;
    public final void rule__PortType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1611:1: ( ( ( rule__PortType__OperationsAssignment_2 )* ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1612:1: ( ( rule__PortType__OperationsAssignment_2 )* )
            {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1612:1: ( ( rule__PortType__OperationsAssignment_2 )* )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1613:1: ( rule__PortType__OperationsAssignment_2 )*
            {
             before(grammarAccess.getPortTypeAccess().getOperationsAssignment_2()); 
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1614:1: ( rule__PortType__OperationsAssignment_2 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==26) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1614:2: rule__PortType__OperationsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__PortType__OperationsAssignment_2_in_rule__PortType__Group__2__Impl3241);
            	    rule__PortType__OperationsAssignment_2();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getPortTypeAccess().getOperationsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PortType__Group__2__Impl


    // $ANTLR start rule__PortType__Group__3
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1624:1: rule__PortType__Group__3 : rule__PortType__Group__3__Impl ;
    public final void rule__PortType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1628:1: ( rule__PortType__Group__3__Impl )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1629:2: rule__PortType__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__PortType__Group__3__Impl_in_rule__PortType__Group__33272);
            rule__PortType__Group__3__Impl();
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
    // $ANTLR end rule__PortType__Group__3


    // $ANTLR start rule__PortType__Group__3__Impl
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1635:1: rule__PortType__Group__3__Impl : ( '}' ) ;
    public final void rule__PortType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1639:1: ( ( '}' ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1640:1: ( '}' )
            {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1640:1: ( '}' )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1641:1: '}'
            {
             before(grammarAccess.getPortTypeAccess().getRightCurlyBracketKeyword_3()); 
            match(input,24,FOLLOW_24_in_rule__PortType__Group__3__Impl3300); 
             after(grammarAccess.getPortTypeAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PortType__Group__3__Impl


    // $ANTLR start rule__OneWayOperation__Group__0
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1662:1: rule__OneWayOperation__Group__0 : rule__OneWayOperation__Group__0__Impl rule__OneWayOperation__Group__1 ;
    public final void rule__OneWayOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1666:1: ( rule__OneWayOperation__Group__0__Impl rule__OneWayOperation__Group__1 )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1667:2: rule__OneWayOperation__Group__0__Impl rule__OneWayOperation__Group__1
            {
            pushFollow(FOLLOW_rule__OneWayOperation__Group__0__Impl_in_rule__OneWayOperation__Group__03339);
            rule__OneWayOperation__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__OneWayOperation__Group__1_in_rule__OneWayOperation__Group__03342);
            rule__OneWayOperation__Group__1();
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
    // $ANTLR end rule__OneWayOperation__Group__0


    // $ANTLR start rule__OneWayOperation__Group__0__Impl
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1674:1: rule__OneWayOperation__Group__0__Impl : ( 'operation' ) ;
    public final void rule__OneWayOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1678:1: ( ( 'operation' ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1679:1: ( 'operation' )
            {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1679:1: ( 'operation' )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1680:1: 'operation'
            {
             before(grammarAccess.getOneWayOperationAccess().getOperationKeyword_0()); 
            match(input,26,FOLLOW_26_in_rule__OneWayOperation__Group__0__Impl3370); 
             after(grammarAccess.getOneWayOperationAccess().getOperationKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__OneWayOperation__Group__0__Impl


    // $ANTLR start rule__OneWayOperation__Group__1
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1693:1: rule__OneWayOperation__Group__1 : rule__OneWayOperation__Group__1__Impl rule__OneWayOperation__Group__2 ;
    public final void rule__OneWayOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1697:1: ( rule__OneWayOperation__Group__1__Impl rule__OneWayOperation__Group__2 )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1698:2: rule__OneWayOperation__Group__1__Impl rule__OneWayOperation__Group__2
            {
            pushFollow(FOLLOW_rule__OneWayOperation__Group__1__Impl_in_rule__OneWayOperation__Group__13401);
            rule__OneWayOperation__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__OneWayOperation__Group__2_in_rule__OneWayOperation__Group__13404);
            rule__OneWayOperation__Group__2();
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
    // $ANTLR end rule__OneWayOperation__Group__1


    // $ANTLR start rule__OneWayOperation__Group__1__Impl
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1705:1: rule__OneWayOperation__Group__1__Impl : ( ( rule__OneWayOperation__NameAssignment_1 ) ) ;
    public final void rule__OneWayOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1709:1: ( ( ( rule__OneWayOperation__NameAssignment_1 ) ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1710:1: ( ( rule__OneWayOperation__NameAssignment_1 ) )
            {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1710:1: ( ( rule__OneWayOperation__NameAssignment_1 ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1711:1: ( rule__OneWayOperation__NameAssignment_1 )
            {
             before(grammarAccess.getOneWayOperationAccess().getNameAssignment_1()); 
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1712:1: ( rule__OneWayOperation__NameAssignment_1 )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1712:2: rule__OneWayOperation__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__OneWayOperation__NameAssignment_1_in_rule__OneWayOperation__Group__1__Impl3431);
            rule__OneWayOperation__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getOneWayOperationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__OneWayOperation__Group__1__Impl


    // $ANTLR start rule__OneWayOperation__Group__2
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1722:1: rule__OneWayOperation__Group__2 : rule__OneWayOperation__Group__2__Impl rule__OneWayOperation__Group__3 ;
    public final void rule__OneWayOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1726:1: ( rule__OneWayOperation__Group__2__Impl rule__OneWayOperation__Group__3 )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1727:2: rule__OneWayOperation__Group__2__Impl rule__OneWayOperation__Group__3
            {
            pushFollow(FOLLOW_rule__OneWayOperation__Group__2__Impl_in_rule__OneWayOperation__Group__23461);
            rule__OneWayOperation__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__OneWayOperation__Group__3_in_rule__OneWayOperation__Group__23464);
            rule__OneWayOperation__Group__3();
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
    // $ANTLR end rule__OneWayOperation__Group__2


    // $ANTLR start rule__OneWayOperation__Group__2__Impl
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1734:1: rule__OneWayOperation__Group__2__Impl : ( ':' ) ;
    public final void rule__OneWayOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1738:1: ( ( ':' ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1739:1: ( ':' )
            {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1739:1: ( ':' )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1740:1: ':'
            {
             before(grammarAccess.getOneWayOperationAccess().getColonKeyword_2()); 
            match(input,27,FOLLOW_27_in_rule__OneWayOperation__Group__2__Impl3492); 
             after(grammarAccess.getOneWayOperationAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__OneWayOperation__Group__2__Impl


    // $ANTLR start rule__OneWayOperation__Group__3
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1753:1: rule__OneWayOperation__Group__3 : rule__OneWayOperation__Group__3__Impl ;
    public final void rule__OneWayOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1757:1: ( rule__OneWayOperation__Group__3__Impl )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1758:2: rule__OneWayOperation__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__OneWayOperation__Group__3__Impl_in_rule__OneWayOperation__Group__33523);
            rule__OneWayOperation__Group__3__Impl();
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
    // $ANTLR end rule__OneWayOperation__Group__3


    // $ANTLR start rule__OneWayOperation__Group__3__Impl
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1764:1: rule__OneWayOperation__Group__3__Impl : ( ( rule__OneWayOperation__InputAssignment_3 ) ) ;
    public final void rule__OneWayOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1768:1: ( ( ( rule__OneWayOperation__InputAssignment_3 ) ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1769:1: ( ( rule__OneWayOperation__InputAssignment_3 ) )
            {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1769:1: ( ( rule__OneWayOperation__InputAssignment_3 ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1770:1: ( rule__OneWayOperation__InputAssignment_3 )
            {
             before(grammarAccess.getOneWayOperationAccess().getInputAssignment_3()); 
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1771:1: ( rule__OneWayOperation__InputAssignment_3 )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1771:2: rule__OneWayOperation__InputAssignment_3
            {
            pushFollow(FOLLOW_rule__OneWayOperation__InputAssignment_3_in_rule__OneWayOperation__Group__3__Impl3550);
            rule__OneWayOperation__InputAssignment_3();
            _fsp--;


            }

             after(grammarAccess.getOneWayOperationAccess().getInputAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__OneWayOperation__Group__3__Impl


    // $ANTLR start rule__RequestResponseOperation__Group__0
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1789:1: rule__RequestResponseOperation__Group__0 : rule__RequestResponseOperation__Group__0__Impl rule__RequestResponseOperation__Group__1 ;
    public final void rule__RequestResponseOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1793:1: ( rule__RequestResponseOperation__Group__0__Impl rule__RequestResponseOperation__Group__1 )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1794:2: rule__RequestResponseOperation__Group__0__Impl rule__RequestResponseOperation__Group__1
            {
            pushFollow(FOLLOW_rule__RequestResponseOperation__Group__0__Impl_in_rule__RequestResponseOperation__Group__03588);
            rule__RequestResponseOperation__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__RequestResponseOperation__Group__1_in_rule__RequestResponseOperation__Group__03591);
            rule__RequestResponseOperation__Group__1();
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
    // $ANTLR end rule__RequestResponseOperation__Group__0


    // $ANTLR start rule__RequestResponseOperation__Group__0__Impl
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1801:1: rule__RequestResponseOperation__Group__0__Impl : ( 'operation' ) ;
    public final void rule__RequestResponseOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1805:1: ( ( 'operation' ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1806:1: ( 'operation' )
            {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1806:1: ( 'operation' )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1807:1: 'operation'
            {
             before(grammarAccess.getRequestResponseOperationAccess().getOperationKeyword_0()); 
            match(input,26,FOLLOW_26_in_rule__RequestResponseOperation__Group__0__Impl3619); 
             after(grammarAccess.getRequestResponseOperationAccess().getOperationKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RequestResponseOperation__Group__0__Impl


    // $ANTLR start rule__RequestResponseOperation__Group__1
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1820:1: rule__RequestResponseOperation__Group__1 : rule__RequestResponseOperation__Group__1__Impl rule__RequestResponseOperation__Group__2 ;
    public final void rule__RequestResponseOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1824:1: ( rule__RequestResponseOperation__Group__1__Impl rule__RequestResponseOperation__Group__2 )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1825:2: rule__RequestResponseOperation__Group__1__Impl rule__RequestResponseOperation__Group__2
            {
            pushFollow(FOLLOW_rule__RequestResponseOperation__Group__1__Impl_in_rule__RequestResponseOperation__Group__13650);
            rule__RequestResponseOperation__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__RequestResponseOperation__Group__2_in_rule__RequestResponseOperation__Group__13653);
            rule__RequestResponseOperation__Group__2();
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
    // $ANTLR end rule__RequestResponseOperation__Group__1


    // $ANTLR start rule__RequestResponseOperation__Group__1__Impl
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1832:1: rule__RequestResponseOperation__Group__1__Impl : ( ( rule__RequestResponseOperation__NameAssignment_1 ) ) ;
    public final void rule__RequestResponseOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1836:1: ( ( ( rule__RequestResponseOperation__NameAssignment_1 ) ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1837:1: ( ( rule__RequestResponseOperation__NameAssignment_1 ) )
            {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1837:1: ( ( rule__RequestResponseOperation__NameAssignment_1 ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1838:1: ( rule__RequestResponseOperation__NameAssignment_1 )
            {
             before(grammarAccess.getRequestResponseOperationAccess().getNameAssignment_1()); 
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1839:1: ( rule__RequestResponseOperation__NameAssignment_1 )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1839:2: rule__RequestResponseOperation__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__RequestResponseOperation__NameAssignment_1_in_rule__RequestResponseOperation__Group__1__Impl3680);
            rule__RequestResponseOperation__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getRequestResponseOperationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RequestResponseOperation__Group__1__Impl


    // $ANTLR start rule__RequestResponseOperation__Group__2
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1849:1: rule__RequestResponseOperation__Group__2 : rule__RequestResponseOperation__Group__2__Impl rule__RequestResponseOperation__Group__3 ;
    public final void rule__RequestResponseOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1853:1: ( rule__RequestResponseOperation__Group__2__Impl rule__RequestResponseOperation__Group__3 )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1854:2: rule__RequestResponseOperation__Group__2__Impl rule__RequestResponseOperation__Group__3
            {
            pushFollow(FOLLOW_rule__RequestResponseOperation__Group__2__Impl_in_rule__RequestResponseOperation__Group__23710);
            rule__RequestResponseOperation__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__RequestResponseOperation__Group__3_in_rule__RequestResponseOperation__Group__23713);
            rule__RequestResponseOperation__Group__3();
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
    // $ANTLR end rule__RequestResponseOperation__Group__2


    // $ANTLR start rule__RequestResponseOperation__Group__2__Impl
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1861:1: rule__RequestResponseOperation__Group__2__Impl : ( ':' ) ;
    public final void rule__RequestResponseOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1865:1: ( ( ':' ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1866:1: ( ':' )
            {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1866:1: ( ':' )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1867:1: ':'
            {
             before(grammarAccess.getRequestResponseOperationAccess().getColonKeyword_2()); 
            match(input,27,FOLLOW_27_in_rule__RequestResponseOperation__Group__2__Impl3741); 
             after(grammarAccess.getRequestResponseOperationAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RequestResponseOperation__Group__2__Impl


    // $ANTLR start rule__RequestResponseOperation__Group__3
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1880:1: rule__RequestResponseOperation__Group__3 : rule__RequestResponseOperation__Group__3__Impl rule__RequestResponseOperation__Group__4 ;
    public final void rule__RequestResponseOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1884:1: ( rule__RequestResponseOperation__Group__3__Impl rule__RequestResponseOperation__Group__4 )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1885:2: rule__RequestResponseOperation__Group__3__Impl rule__RequestResponseOperation__Group__4
            {
            pushFollow(FOLLOW_rule__RequestResponseOperation__Group__3__Impl_in_rule__RequestResponseOperation__Group__33772);
            rule__RequestResponseOperation__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__RequestResponseOperation__Group__4_in_rule__RequestResponseOperation__Group__33775);
            rule__RequestResponseOperation__Group__4();
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
    // $ANTLR end rule__RequestResponseOperation__Group__3


    // $ANTLR start rule__RequestResponseOperation__Group__3__Impl
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1892:1: rule__RequestResponseOperation__Group__3__Impl : ( ( rule__RequestResponseOperation__InputAssignment_3 ) ) ;
    public final void rule__RequestResponseOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1896:1: ( ( ( rule__RequestResponseOperation__InputAssignment_3 ) ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1897:1: ( ( rule__RequestResponseOperation__InputAssignment_3 ) )
            {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1897:1: ( ( rule__RequestResponseOperation__InputAssignment_3 ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1898:1: ( rule__RequestResponseOperation__InputAssignment_3 )
            {
             before(grammarAccess.getRequestResponseOperationAccess().getInputAssignment_3()); 
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1899:1: ( rule__RequestResponseOperation__InputAssignment_3 )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1899:2: rule__RequestResponseOperation__InputAssignment_3
            {
            pushFollow(FOLLOW_rule__RequestResponseOperation__InputAssignment_3_in_rule__RequestResponseOperation__Group__3__Impl3802);
            rule__RequestResponseOperation__InputAssignment_3();
            _fsp--;


            }

             after(grammarAccess.getRequestResponseOperationAccess().getInputAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RequestResponseOperation__Group__3__Impl


    // $ANTLR start rule__RequestResponseOperation__Group__4
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1909:1: rule__RequestResponseOperation__Group__4 : rule__RequestResponseOperation__Group__4__Impl rule__RequestResponseOperation__Group__5 ;
    public final void rule__RequestResponseOperation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1913:1: ( rule__RequestResponseOperation__Group__4__Impl rule__RequestResponseOperation__Group__5 )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1914:2: rule__RequestResponseOperation__Group__4__Impl rule__RequestResponseOperation__Group__5
            {
            pushFollow(FOLLOW_rule__RequestResponseOperation__Group__4__Impl_in_rule__RequestResponseOperation__Group__43832);
            rule__RequestResponseOperation__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__RequestResponseOperation__Group__5_in_rule__RequestResponseOperation__Group__43835);
            rule__RequestResponseOperation__Group__5();
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
    // $ANTLR end rule__RequestResponseOperation__Group__4


    // $ANTLR start rule__RequestResponseOperation__Group__4__Impl
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1921:1: rule__RequestResponseOperation__Group__4__Impl : ( '->' ) ;
    public final void rule__RequestResponseOperation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1925:1: ( ( '->' ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1926:1: ( '->' )
            {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1926:1: ( '->' )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1927:1: '->'
            {
             before(grammarAccess.getRequestResponseOperationAccess().getHyphenMinusGreaterThanSignKeyword_4()); 
            match(input,25,FOLLOW_25_in_rule__RequestResponseOperation__Group__4__Impl3863); 
             after(grammarAccess.getRequestResponseOperationAccess().getHyphenMinusGreaterThanSignKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RequestResponseOperation__Group__4__Impl


    // $ANTLR start rule__RequestResponseOperation__Group__5
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1940:1: rule__RequestResponseOperation__Group__5 : rule__RequestResponseOperation__Group__5__Impl ;
    public final void rule__RequestResponseOperation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1944:1: ( rule__RequestResponseOperation__Group__5__Impl )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1945:2: rule__RequestResponseOperation__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__RequestResponseOperation__Group__5__Impl_in_rule__RequestResponseOperation__Group__53894);
            rule__RequestResponseOperation__Group__5__Impl();
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
    // $ANTLR end rule__RequestResponseOperation__Group__5


    // $ANTLR start rule__RequestResponseOperation__Group__5__Impl
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1951:1: rule__RequestResponseOperation__Group__5__Impl : ( ( rule__RequestResponseOperation__OutputAssignment_5 ) ) ;
    public final void rule__RequestResponseOperation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1955:1: ( ( ( rule__RequestResponseOperation__OutputAssignment_5 ) ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1956:1: ( ( rule__RequestResponseOperation__OutputAssignment_5 ) )
            {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1956:1: ( ( rule__RequestResponseOperation__OutputAssignment_5 ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1957:1: ( rule__RequestResponseOperation__OutputAssignment_5 )
            {
             before(grammarAccess.getRequestResponseOperationAccess().getOutputAssignment_5()); 
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1958:1: ( rule__RequestResponseOperation__OutputAssignment_5 )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1958:2: rule__RequestResponseOperation__OutputAssignment_5
            {
            pushFollow(FOLLOW_rule__RequestResponseOperation__OutputAssignment_5_in_rule__RequestResponseOperation__Group__5__Impl3921);
            rule__RequestResponseOperation__OutputAssignment_5();
            _fsp--;


            }

             after(grammarAccess.getRequestResponseOperationAccess().getOutputAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RequestResponseOperation__Group__5__Impl


    // $ANTLR start rule__SolicitResponseOperation__Group__0
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1980:1: rule__SolicitResponseOperation__Group__0 : rule__SolicitResponseOperation__Group__0__Impl rule__SolicitResponseOperation__Group__1 ;
    public final void rule__SolicitResponseOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1984:1: ( rule__SolicitResponseOperation__Group__0__Impl rule__SolicitResponseOperation__Group__1 )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1985:2: rule__SolicitResponseOperation__Group__0__Impl rule__SolicitResponseOperation__Group__1
            {
            pushFollow(FOLLOW_rule__SolicitResponseOperation__Group__0__Impl_in_rule__SolicitResponseOperation__Group__03963);
            rule__SolicitResponseOperation__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SolicitResponseOperation__Group__1_in_rule__SolicitResponseOperation__Group__03966);
            rule__SolicitResponseOperation__Group__1();
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
    // $ANTLR end rule__SolicitResponseOperation__Group__0


    // $ANTLR start rule__SolicitResponseOperation__Group__0__Impl
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1992:1: rule__SolicitResponseOperation__Group__0__Impl : ( 'operation' ) ;
    public final void rule__SolicitResponseOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1996:1: ( ( 'operation' ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1997:1: ( 'operation' )
            {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1997:1: ( 'operation' )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:1998:1: 'operation'
            {
             before(grammarAccess.getSolicitResponseOperationAccess().getOperationKeyword_0()); 
            match(input,26,FOLLOW_26_in_rule__SolicitResponseOperation__Group__0__Impl3994); 
             after(grammarAccess.getSolicitResponseOperationAccess().getOperationKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SolicitResponseOperation__Group__0__Impl


    // $ANTLR start rule__SolicitResponseOperation__Group__1
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2011:1: rule__SolicitResponseOperation__Group__1 : rule__SolicitResponseOperation__Group__1__Impl rule__SolicitResponseOperation__Group__2 ;
    public final void rule__SolicitResponseOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2015:1: ( rule__SolicitResponseOperation__Group__1__Impl rule__SolicitResponseOperation__Group__2 )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2016:2: rule__SolicitResponseOperation__Group__1__Impl rule__SolicitResponseOperation__Group__2
            {
            pushFollow(FOLLOW_rule__SolicitResponseOperation__Group__1__Impl_in_rule__SolicitResponseOperation__Group__14025);
            rule__SolicitResponseOperation__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SolicitResponseOperation__Group__2_in_rule__SolicitResponseOperation__Group__14028);
            rule__SolicitResponseOperation__Group__2();
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
    // $ANTLR end rule__SolicitResponseOperation__Group__1


    // $ANTLR start rule__SolicitResponseOperation__Group__1__Impl
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2023:1: rule__SolicitResponseOperation__Group__1__Impl : ( ( rule__SolicitResponseOperation__NameAssignment_1 ) ) ;
    public final void rule__SolicitResponseOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2027:1: ( ( ( rule__SolicitResponseOperation__NameAssignment_1 ) ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2028:1: ( ( rule__SolicitResponseOperation__NameAssignment_1 ) )
            {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2028:1: ( ( rule__SolicitResponseOperation__NameAssignment_1 ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2029:1: ( rule__SolicitResponseOperation__NameAssignment_1 )
            {
             before(grammarAccess.getSolicitResponseOperationAccess().getNameAssignment_1()); 
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2030:1: ( rule__SolicitResponseOperation__NameAssignment_1 )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2030:2: rule__SolicitResponseOperation__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__SolicitResponseOperation__NameAssignment_1_in_rule__SolicitResponseOperation__Group__1__Impl4055);
            rule__SolicitResponseOperation__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getSolicitResponseOperationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SolicitResponseOperation__Group__1__Impl


    // $ANTLR start rule__SolicitResponseOperation__Group__2
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2040:1: rule__SolicitResponseOperation__Group__2 : rule__SolicitResponseOperation__Group__2__Impl rule__SolicitResponseOperation__Group__3 ;
    public final void rule__SolicitResponseOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2044:1: ( rule__SolicitResponseOperation__Group__2__Impl rule__SolicitResponseOperation__Group__3 )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2045:2: rule__SolicitResponseOperation__Group__2__Impl rule__SolicitResponseOperation__Group__3
            {
            pushFollow(FOLLOW_rule__SolicitResponseOperation__Group__2__Impl_in_rule__SolicitResponseOperation__Group__24085);
            rule__SolicitResponseOperation__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SolicitResponseOperation__Group__3_in_rule__SolicitResponseOperation__Group__24088);
            rule__SolicitResponseOperation__Group__3();
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
    // $ANTLR end rule__SolicitResponseOperation__Group__2


    // $ANTLR start rule__SolicitResponseOperation__Group__2__Impl
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2052:1: rule__SolicitResponseOperation__Group__2__Impl : ( ':' ) ;
    public final void rule__SolicitResponseOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2056:1: ( ( ':' ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2057:1: ( ':' )
            {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2057:1: ( ':' )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2058:1: ':'
            {
             before(grammarAccess.getSolicitResponseOperationAccess().getColonKeyword_2()); 
            match(input,27,FOLLOW_27_in_rule__SolicitResponseOperation__Group__2__Impl4116); 
             after(grammarAccess.getSolicitResponseOperationAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SolicitResponseOperation__Group__2__Impl


    // $ANTLR start rule__SolicitResponseOperation__Group__3
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2071:1: rule__SolicitResponseOperation__Group__3 : rule__SolicitResponseOperation__Group__3__Impl rule__SolicitResponseOperation__Group__4 ;
    public final void rule__SolicitResponseOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2075:1: ( rule__SolicitResponseOperation__Group__3__Impl rule__SolicitResponseOperation__Group__4 )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2076:2: rule__SolicitResponseOperation__Group__3__Impl rule__SolicitResponseOperation__Group__4
            {
            pushFollow(FOLLOW_rule__SolicitResponseOperation__Group__3__Impl_in_rule__SolicitResponseOperation__Group__34147);
            rule__SolicitResponseOperation__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SolicitResponseOperation__Group__4_in_rule__SolicitResponseOperation__Group__34150);
            rule__SolicitResponseOperation__Group__4();
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
    // $ANTLR end rule__SolicitResponseOperation__Group__3


    // $ANTLR start rule__SolicitResponseOperation__Group__3__Impl
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2083:1: rule__SolicitResponseOperation__Group__3__Impl : ( ( rule__SolicitResponseOperation__InputAssignment_3 ) ) ;
    public final void rule__SolicitResponseOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2087:1: ( ( ( rule__SolicitResponseOperation__InputAssignment_3 ) ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2088:1: ( ( rule__SolicitResponseOperation__InputAssignment_3 ) )
            {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2088:1: ( ( rule__SolicitResponseOperation__InputAssignment_3 ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2089:1: ( rule__SolicitResponseOperation__InputAssignment_3 )
            {
             before(grammarAccess.getSolicitResponseOperationAccess().getInputAssignment_3()); 
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2090:1: ( rule__SolicitResponseOperation__InputAssignment_3 )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2090:2: rule__SolicitResponseOperation__InputAssignment_3
            {
            pushFollow(FOLLOW_rule__SolicitResponseOperation__InputAssignment_3_in_rule__SolicitResponseOperation__Group__3__Impl4177);
            rule__SolicitResponseOperation__InputAssignment_3();
            _fsp--;


            }

             after(grammarAccess.getSolicitResponseOperationAccess().getInputAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SolicitResponseOperation__Group__3__Impl


    // $ANTLR start rule__SolicitResponseOperation__Group__4
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2100:1: rule__SolicitResponseOperation__Group__4 : rule__SolicitResponseOperation__Group__4__Impl rule__SolicitResponseOperation__Group__5 ;
    public final void rule__SolicitResponseOperation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2104:1: ( rule__SolicitResponseOperation__Group__4__Impl rule__SolicitResponseOperation__Group__5 )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2105:2: rule__SolicitResponseOperation__Group__4__Impl rule__SolicitResponseOperation__Group__5
            {
            pushFollow(FOLLOW_rule__SolicitResponseOperation__Group__4__Impl_in_rule__SolicitResponseOperation__Group__44207);
            rule__SolicitResponseOperation__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SolicitResponseOperation__Group__5_in_rule__SolicitResponseOperation__Group__44210);
            rule__SolicitResponseOperation__Group__5();
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
    // $ANTLR end rule__SolicitResponseOperation__Group__4


    // $ANTLR start rule__SolicitResponseOperation__Group__4__Impl
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2112:1: rule__SolicitResponseOperation__Group__4__Impl : ( '<-' ) ;
    public final void rule__SolicitResponseOperation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2116:1: ( ( '<-' ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2117:1: ( '<-' )
            {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2117:1: ( '<-' )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2118:1: '<-'
            {
             before(grammarAccess.getSolicitResponseOperationAccess().getLessThanSignHyphenMinusKeyword_4()); 
            match(input,28,FOLLOW_28_in_rule__SolicitResponseOperation__Group__4__Impl4238); 
             after(grammarAccess.getSolicitResponseOperationAccess().getLessThanSignHyphenMinusKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SolicitResponseOperation__Group__4__Impl


    // $ANTLR start rule__SolicitResponseOperation__Group__5
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2131:1: rule__SolicitResponseOperation__Group__5 : rule__SolicitResponseOperation__Group__5__Impl ;
    public final void rule__SolicitResponseOperation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2135:1: ( rule__SolicitResponseOperation__Group__5__Impl )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2136:2: rule__SolicitResponseOperation__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__SolicitResponseOperation__Group__5__Impl_in_rule__SolicitResponseOperation__Group__54269);
            rule__SolicitResponseOperation__Group__5__Impl();
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
    // $ANTLR end rule__SolicitResponseOperation__Group__5


    // $ANTLR start rule__SolicitResponseOperation__Group__5__Impl
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2142:1: rule__SolicitResponseOperation__Group__5__Impl : ( ( rule__SolicitResponseOperation__OutputAssignment_5 ) ) ;
    public final void rule__SolicitResponseOperation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2146:1: ( ( ( rule__SolicitResponseOperation__OutputAssignment_5 ) ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2147:1: ( ( rule__SolicitResponseOperation__OutputAssignment_5 ) )
            {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2147:1: ( ( rule__SolicitResponseOperation__OutputAssignment_5 ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2148:1: ( rule__SolicitResponseOperation__OutputAssignment_5 )
            {
             before(grammarAccess.getSolicitResponseOperationAccess().getOutputAssignment_5()); 
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2149:1: ( rule__SolicitResponseOperation__OutputAssignment_5 )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2149:2: rule__SolicitResponseOperation__OutputAssignment_5
            {
            pushFollow(FOLLOW_rule__SolicitResponseOperation__OutputAssignment_5_in_rule__SolicitResponseOperation__Group__5__Impl4296);
            rule__SolicitResponseOperation__OutputAssignment_5();
            _fsp--;


            }

             after(grammarAccess.getSolicitResponseOperationAccess().getOutputAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SolicitResponseOperation__Group__5__Impl


    // $ANTLR start rule__NotificationOperation__Group__0
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2171:1: rule__NotificationOperation__Group__0 : rule__NotificationOperation__Group__0__Impl rule__NotificationOperation__Group__1 ;
    public final void rule__NotificationOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2175:1: ( rule__NotificationOperation__Group__0__Impl rule__NotificationOperation__Group__1 )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2176:2: rule__NotificationOperation__Group__0__Impl rule__NotificationOperation__Group__1
            {
            pushFollow(FOLLOW_rule__NotificationOperation__Group__0__Impl_in_rule__NotificationOperation__Group__04338);
            rule__NotificationOperation__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__NotificationOperation__Group__1_in_rule__NotificationOperation__Group__04341);
            rule__NotificationOperation__Group__1();
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
    // $ANTLR end rule__NotificationOperation__Group__0


    // $ANTLR start rule__NotificationOperation__Group__0__Impl
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2183:1: rule__NotificationOperation__Group__0__Impl : ( 'operation' ) ;
    public final void rule__NotificationOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2187:1: ( ( 'operation' ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2188:1: ( 'operation' )
            {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2188:1: ( 'operation' )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2189:1: 'operation'
            {
             before(grammarAccess.getNotificationOperationAccess().getOperationKeyword_0()); 
            match(input,26,FOLLOW_26_in_rule__NotificationOperation__Group__0__Impl4369); 
             after(grammarAccess.getNotificationOperationAccess().getOperationKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__NotificationOperation__Group__0__Impl


    // $ANTLR start rule__NotificationOperation__Group__1
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2202:1: rule__NotificationOperation__Group__1 : rule__NotificationOperation__Group__1__Impl rule__NotificationOperation__Group__2 ;
    public final void rule__NotificationOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2206:1: ( rule__NotificationOperation__Group__1__Impl rule__NotificationOperation__Group__2 )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2207:2: rule__NotificationOperation__Group__1__Impl rule__NotificationOperation__Group__2
            {
            pushFollow(FOLLOW_rule__NotificationOperation__Group__1__Impl_in_rule__NotificationOperation__Group__14400);
            rule__NotificationOperation__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__NotificationOperation__Group__2_in_rule__NotificationOperation__Group__14403);
            rule__NotificationOperation__Group__2();
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
    // $ANTLR end rule__NotificationOperation__Group__1


    // $ANTLR start rule__NotificationOperation__Group__1__Impl
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2214:1: rule__NotificationOperation__Group__1__Impl : ( ( rule__NotificationOperation__NameAssignment_1 ) ) ;
    public final void rule__NotificationOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2218:1: ( ( ( rule__NotificationOperation__NameAssignment_1 ) ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2219:1: ( ( rule__NotificationOperation__NameAssignment_1 ) )
            {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2219:1: ( ( rule__NotificationOperation__NameAssignment_1 ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2220:1: ( rule__NotificationOperation__NameAssignment_1 )
            {
             before(grammarAccess.getNotificationOperationAccess().getNameAssignment_1()); 
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2221:1: ( rule__NotificationOperation__NameAssignment_1 )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2221:2: rule__NotificationOperation__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__NotificationOperation__NameAssignment_1_in_rule__NotificationOperation__Group__1__Impl4430);
            rule__NotificationOperation__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getNotificationOperationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__NotificationOperation__Group__1__Impl


    // $ANTLR start rule__NotificationOperation__Group__2
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2231:1: rule__NotificationOperation__Group__2 : rule__NotificationOperation__Group__2__Impl rule__NotificationOperation__Group__3 ;
    public final void rule__NotificationOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2235:1: ( rule__NotificationOperation__Group__2__Impl rule__NotificationOperation__Group__3 )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2236:2: rule__NotificationOperation__Group__2__Impl rule__NotificationOperation__Group__3
            {
            pushFollow(FOLLOW_rule__NotificationOperation__Group__2__Impl_in_rule__NotificationOperation__Group__24460);
            rule__NotificationOperation__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__NotificationOperation__Group__3_in_rule__NotificationOperation__Group__24463);
            rule__NotificationOperation__Group__3();
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
    // $ANTLR end rule__NotificationOperation__Group__2


    // $ANTLR start rule__NotificationOperation__Group__2__Impl
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2243:1: rule__NotificationOperation__Group__2__Impl : ( ':' ) ;
    public final void rule__NotificationOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2247:1: ( ( ':' ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2248:1: ( ':' )
            {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2248:1: ( ':' )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2249:1: ':'
            {
             before(grammarAccess.getNotificationOperationAccess().getColonKeyword_2()); 
            match(input,27,FOLLOW_27_in_rule__NotificationOperation__Group__2__Impl4491); 
             after(grammarAccess.getNotificationOperationAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__NotificationOperation__Group__2__Impl


    // $ANTLR start rule__NotificationOperation__Group__3
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2262:1: rule__NotificationOperation__Group__3 : rule__NotificationOperation__Group__3__Impl rule__NotificationOperation__Group__4 ;
    public final void rule__NotificationOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2266:1: ( rule__NotificationOperation__Group__3__Impl rule__NotificationOperation__Group__4 )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2267:2: rule__NotificationOperation__Group__3__Impl rule__NotificationOperation__Group__4
            {
            pushFollow(FOLLOW_rule__NotificationOperation__Group__3__Impl_in_rule__NotificationOperation__Group__34522);
            rule__NotificationOperation__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__NotificationOperation__Group__4_in_rule__NotificationOperation__Group__34525);
            rule__NotificationOperation__Group__4();
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
    // $ANTLR end rule__NotificationOperation__Group__3


    // $ANTLR start rule__NotificationOperation__Group__3__Impl
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2274:1: rule__NotificationOperation__Group__3__Impl : ( '->' ) ;
    public final void rule__NotificationOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2278:1: ( ( '->' ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2279:1: ( '->' )
            {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2279:1: ( '->' )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2280:1: '->'
            {
             before(grammarAccess.getNotificationOperationAccess().getHyphenMinusGreaterThanSignKeyword_3()); 
            match(input,25,FOLLOW_25_in_rule__NotificationOperation__Group__3__Impl4553); 
             after(grammarAccess.getNotificationOperationAccess().getHyphenMinusGreaterThanSignKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__NotificationOperation__Group__3__Impl


    // $ANTLR start rule__NotificationOperation__Group__4
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2293:1: rule__NotificationOperation__Group__4 : rule__NotificationOperation__Group__4__Impl ;
    public final void rule__NotificationOperation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2297:1: ( rule__NotificationOperation__Group__4__Impl )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2298:2: rule__NotificationOperation__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__NotificationOperation__Group__4__Impl_in_rule__NotificationOperation__Group__44584);
            rule__NotificationOperation__Group__4__Impl();
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
    // $ANTLR end rule__NotificationOperation__Group__4


    // $ANTLR start rule__NotificationOperation__Group__4__Impl
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2304:1: rule__NotificationOperation__Group__4__Impl : ( ( rule__NotificationOperation__OutputAssignment_4 ) ) ;
    public final void rule__NotificationOperation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2308:1: ( ( ( rule__NotificationOperation__OutputAssignment_4 ) ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2309:1: ( ( rule__NotificationOperation__OutputAssignment_4 ) )
            {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2309:1: ( ( rule__NotificationOperation__OutputAssignment_4 ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2310:1: ( rule__NotificationOperation__OutputAssignment_4 )
            {
             before(grammarAccess.getNotificationOperationAccess().getOutputAssignment_4()); 
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2311:1: ( rule__NotificationOperation__OutputAssignment_4 )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2311:2: rule__NotificationOperation__OutputAssignment_4
            {
            pushFollow(FOLLOW_rule__NotificationOperation__OutputAssignment_4_in_rule__NotificationOperation__Group__4__Impl4611);
            rule__NotificationOperation__OutputAssignment_4();
            _fsp--;


            }

             after(grammarAccess.getNotificationOperationAccess().getOutputAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__NotificationOperation__Group__4__Impl


    // $ANTLR start rule__Binding__Group__0
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2331:1: rule__Binding__Group__0 : rule__Binding__Group__0__Impl rule__Binding__Group__1 ;
    public final void rule__Binding__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2335:1: ( rule__Binding__Group__0__Impl rule__Binding__Group__1 )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2336:2: rule__Binding__Group__0__Impl rule__Binding__Group__1
            {
            pushFollow(FOLLOW_rule__Binding__Group__0__Impl_in_rule__Binding__Group__04651);
            rule__Binding__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Binding__Group__1_in_rule__Binding__Group__04654);
            rule__Binding__Group__1();
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
    // $ANTLR end rule__Binding__Group__0


    // $ANTLR start rule__Binding__Group__0__Impl
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2343:1: rule__Binding__Group__0__Impl : ( ( rule__Binding__NameAssignment_0 ) ) ;
    public final void rule__Binding__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2347:1: ( ( ( rule__Binding__NameAssignment_0 ) ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2348:1: ( ( rule__Binding__NameAssignment_0 ) )
            {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2348:1: ( ( rule__Binding__NameAssignment_0 ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2349:1: ( rule__Binding__NameAssignment_0 )
            {
             before(grammarAccess.getBindingAccess().getNameAssignment_0()); 
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2350:1: ( rule__Binding__NameAssignment_0 )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2350:2: rule__Binding__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Binding__NameAssignment_0_in_rule__Binding__Group__0__Impl4681);
            rule__Binding__NameAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getBindingAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Binding__Group__0__Impl


    // $ANTLR start rule__Binding__Group__1
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2360:1: rule__Binding__Group__1 : rule__Binding__Group__1__Impl rule__Binding__Group__2 ;
    public final void rule__Binding__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2364:1: ( rule__Binding__Group__1__Impl rule__Binding__Group__2 )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2365:2: rule__Binding__Group__1__Impl rule__Binding__Group__2
            {
            pushFollow(FOLLOW_rule__Binding__Group__1__Impl_in_rule__Binding__Group__14711);
            rule__Binding__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Binding__Group__2_in_rule__Binding__Group__14714);
            rule__Binding__Group__2();
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
    // $ANTLR end rule__Binding__Group__1


    // $ANTLR start rule__Binding__Group__1__Impl
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2372:1: rule__Binding__Group__1__Impl : ( 'binds' ) ;
    public final void rule__Binding__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2376:1: ( ( 'binds' ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2377:1: ( 'binds' )
            {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2377:1: ( 'binds' )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2378:1: 'binds'
            {
             before(grammarAccess.getBindingAccess().getBindsKeyword_1()); 
            match(input,29,FOLLOW_29_in_rule__Binding__Group__1__Impl4742); 
             after(grammarAccess.getBindingAccess().getBindsKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Binding__Group__1__Impl


    // $ANTLR start rule__Binding__Group__2
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2391:1: rule__Binding__Group__2 : rule__Binding__Group__2__Impl rule__Binding__Group__3 ;
    public final void rule__Binding__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2395:1: ( rule__Binding__Group__2__Impl rule__Binding__Group__3 )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2396:2: rule__Binding__Group__2__Impl rule__Binding__Group__3
            {
            pushFollow(FOLLOW_rule__Binding__Group__2__Impl_in_rule__Binding__Group__24773);
            rule__Binding__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Binding__Group__3_in_rule__Binding__Group__24776);
            rule__Binding__Group__3();
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
    // $ANTLR end rule__Binding__Group__2


    // $ANTLR start rule__Binding__Group__2__Impl
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2403:1: rule__Binding__Group__2__Impl : ( ( rule__Binding__TypeAssignment_2 ) ) ;
    public final void rule__Binding__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2407:1: ( ( ( rule__Binding__TypeAssignment_2 ) ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2408:1: ( ( rule__Binding__TypeAssignment_2 ) )
            {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2408:1: ( ( rule__Binding__TypeAssignment_2 ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2409:1: ( rule__Binding__TypeAssignment_2 )
            {
             before(grammarAccess.getBindingAccess().getTypeAssignment_2()); 
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2410:1: ( rule__Binding__TypeAssignment_2 )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2410:2: rule__Binding__TypeAssignment_2
            {
            pushFollow(FOLLOW_rule__Binding__TypeAssignment_2_in_rule__Binding__Group__2__Impl4803);
            rule__Binding__TypeAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getBindingAccess().getTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Binding__Group__2__Impl


    // $ANTLR start rule__Binding__Group__3
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2420:1: rule__Binding__Group__3 : rule__Binding__Group__3__Impl rule__Binding__Group__4 ;
    public final void rule__Binding__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2424:1: ( rule__Binding__Group__3__Impl rule__Binding__Group__4 )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2425:2: rule__Binding__Group__3__Impl rule__Binding__Group__4
            {
            pushFollow(FOLLOW_rule__Binding__Group__3__Impl_in_rule__Binding__Group__34833);
            rule__Binding__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Binding__Group__4_in_rule__Binding__Group__34836);
            rule__Binding__Group__4();
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
    // $ANTLR end rule__Binding__Group__3


    // $ANTLR start rule__Binding__Group__3__Impl
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2432:1: rule__Binding__Group__3__Impl : ( 'using' ) ;
    public final void rule__Binding__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2436:1: ( ( 'using' ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2437:1: ( 'using' )
            {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2437:1: ( 'using' )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2438:1: 'using'
            {
             before(grammarAccess.getBindingAccess().getUsingKeyword_3()); 
            match(input,30,FOLLOW_30_in_rule__Binding__Group__3__Impl4864); 
             after(grammarAccess.getBindingAccess().getUsingKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Binding__Group__3__Impl


    // $ANTLR start rule__Binding__Group__4
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2451:1: rule__Binding__Group__4 : rule__Binding__Group__4__Impl ;
    public final void rule__Binding__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2455:1: ( rule__Binding__Group__4__Impl )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2456:2: rule__Binding__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Binding__Group__4__Impl_in_rule__Binding__Group__44895);
            rule__Binding__Group__4__Impl();
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
    // $ANTLR end rule__Binding__Group__4


    // $ANTLR start rule__Binding__Group__4__Impl
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2462:1: rule__Binding__Group__4__Impl : ( ( rule__Binding__TransportAssignment_4 ) ) ;
    public final void rule__Binding__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2466:1: ( ( ( rule__Binding__TransportAssignment_4 ) ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2467:1: ( ( rule__Binding__TransportAssignment_4 ) )
            {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2467:1: ( ( rule__Binding__TransportAssignment_4 ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2468:1: ( rule__Binding__TransportAssignment_4 )
            {
             before(grammarAccess.getBindingAccess().getTransportAssignment_4()); 
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2469:1: ( rule__Binding__TransportAssignment_4 )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2469:2: rule__Binding__TransportAssignment_4
            {
            pushFollow(FOLLOW_rule__Binding__TransportAssignment_4_in_rule__Binding__Group__4__Impl4922);
            rule__Binding__TransportAssignment_4();
            _fsp--;


            }

             after(grammarAccess.getBindingAccess().getTransportAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Binding__Group__4__Impl


    // $ANTLR start rule__SoapTransport__Group__0
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2489:1: rule__SoapTransport__Group__0 : rule__SoapTransport__Group__0__Impl rule__SoapTransport__Group__1 ;
    public final void rule__SoapTransport__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2493:1: ( rule__SoapTransport__Group__0__Impl rule__SoapTransport__Group__1 )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2494:2: rule__SoapTransport__Group__0__Impl rule__SoapTransport__Group__1
            {
            pushFollow(FOLLOW_rule__SoapTransport__Group__0__Impl_in_rule__SoapTransport__Group__04962);
            rule__SoapTransport__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SoapTransport__Group__1_in_rule__SoapTransport__Group__04965);
            rule__SoapTransport__Group__1();
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
    // $ANTLR end rule__SoapTransport__Group__0


    // $ANTLR start rule__SoapTransport__Group__0__Impl
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2501:1: rule__SoapTransport__Group__0__Impl : ( 'soap' ) ;
    public final void rule__SoapTransport__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2505:1: ( ( 'soap' ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2506:1: ( 'soap' )
            {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2506:1: ( 'soap' )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2507:1: 'soap'
            {
             before(grammarAccess.getSoapTransportAccess().getSoapKeyword_0()); 
            match(input,31,FOLLOW_31_in_rule__SoapTransport__Group__0__Impl4993); 
             after(grammarAccess.getSoapTransportAccess().getSoapKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SoapTransport__Group__0__Impl


    // $ANTLR start rule__SoapTransport__Group__1
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2520:1: rule__SoapTransport__Group__1 : rule__SoapTransport__Group__1__Impl rule__SoapTransport__Group__2 ;
    public final void rule__SoapTransport__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2524:1: ( rule__SoapTransport__Group__1__Impl rule__SoapTransport__Group__2 )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2525:2: rule__SoapTransport__Group__1__Impl rule__SoapTransport__Group__2
            {
            pushFollow(FOLLOW_rule__SoapTransport__Group__1__Impl_in_rule__SoapTransport__Group__15024);
            rule__SoapTransport__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SoapTransport__Group__2_in_rule__SoapTransport__Group__15027);
            rule__SoapTransport__Group__2();
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
    // $ANTLR end rule__SoapTransport__Group__1


    // $ANTLR start rule__SoapTransport__Group__1__Impl
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2532:1: rule__SoapTransport__Group__1__Impl : ( '(' ) ;
    public final void rule__SoapTransport__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2536:1: ( ( '(' ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2537:1: ( '(' )
            {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2537:1: ( '(' )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2538:1: '('
            {
             before(grammarAccess.getSoapTransportAccess().getLeftParenthesisKeyword_1()); 
            match(input,32,FOLLOW_32_in_rule__SoapTransport__Group__1__Impl5055); 
             after(grammarAccess.getSoapTransportAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SoapTransport__Group__1__Impl


    // $ANTLR start rule__SoapTransport__Group__2
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2551:1: rule__SoapTransport__Group__2 : rule__SoapTransport__Group__2__Impl rule__SoapTransport__Group__3 ;
    public final void rule__SoapTransport__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2555:1: ( rule__SoapTransport__Group__2__Impl rule__SoapTransport__Group__3 )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2556:2: rule__SoapTransport__Group__2__Impl rule__SoapTransport__Group__3
            {
            pushFollow(FOLLOW_rule__SoapTransport__Group__2__Impl_in_rule__SoapTransport__Group__25086);
            rule__SoapTransport__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SoapTransport__Group__3_in_rule__SoapTransport__Group__25089);
            rule__SoapTransport__Group__3();
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
    // $ANTLR end rule__SoapTransport__Group__2


    // $ANTLR start rule__SoapTransport__Group__2__Impl
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2563:1: rule__SoapTransport__Group__2__Impl : ( ( rule__SoapTransport__TypeAssignment_2 ) ) ;
    public final void rule__SoapTransport__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2567:1: ( ( ( rule__SoapTransport__TypeAssignment_2 ) ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2568:1: ( ( rule__SoapTransport__TypeAssignment_2 ) )
            {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2568:1: ( ( rule__SoapTransport__TypeAssignment_2 ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2569:1: ( rule__SoapTransport__TypeAssignment_2 )
            {
             before(grammarAccess.getSoapTransportAccess().getTypeAssignment_2()); 
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2570:1: ( rule__SoapTransport__TypeAssignment_2 )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2570:2: rule__SoapTransport__TypeAssignment_2
            {
            pushFollow(FOLLOW_rule__SoapTransport__TypeAssignment_2_in_rule__SoapTransport__Group__2__Impl5116);
            rule__SoapTransport__TypeAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getSoapTransportAccess().getTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SoapTransport__Group__2__Impl


    // $ANTLR start rule__SoapTransport__Group__3
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2580:1: rule__SoapTransport__Group__3 : rule__SoapTransport__Group__3__Impl ;
    public final void rule__SoapTransport__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2584:1: ( rule__SoapTransport__Group__3__Impl )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2585:2: rule__SoapTransport__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__SoapTransport__Group__3__Impl_in_rule__SoapTransport__Group__35146);
            rule__SoapTransport__Group__3__Impl();
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
    // $ANTLR end rule__SoapTransport__Group__3


    // $ANTLR start rule__SoapTransport__Group__3__Impl
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2591:1: rule__SoapTransport__Group__3__Impl : ( ')' ) ;
    public final void rule__SoapTransport__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2595:1: ( ( ')' ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2596:1: ( ')' )
            {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2596:1: ( ')' )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2597:1: ')'
            {
             before(grammarAccess.getSoapTransportAccess().getRightParenthesisKeyword_3()); 
            match(input,33,FOLLOW_33_in_rule__SoapTransport__Group__3__Impl5174); 
             after(grammarAccess.getSoapTransportAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SoapTransport__Group__3__Impl


    // $ANTLR start rule__HttpTransport__Group__0
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2618:1: rule__HttpTransport__Group__0 : rule__HttpTransport__Group__0__Impl rule__HttpTransport__Group__1 ;
    public final void rule__HttpTransport__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2622:1: ( rule__HttpTransport__Group__0__Impl rule__HttpTransport__Group__1 )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2623:2: rule__HttpTransport__Group__0__Impl rule__HttpTransport__Group__1
            {
            pushFollow(FOLLOW_rule__HttpTransport__Group__0__Impl_in_rule__HttpTransport__Group__05213);
            rule__HttpTransport__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__HttpTransport__Group__1_in_rule__HttpTransport__Group__05216);
            rule__HttpTransport__Group__1();
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
    // $ANTLR end rule__HttpTransport__Group__0


    // $ANTLR start rule__HttpTransport__Group__0__Impl
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2630:1: rule__HttpTransport__Group__0__Impl : ( 'http' ) ;
    public final void rule__HttpTransport__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2634:1: ( ( 'http' ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2635:1: ( 'http' )
            {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2635:1: ( 'http' )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2636:1: 'http'
            {
             before(grammarAccess.getHttpTransportAccess().getHttpKeyword_0()); 
            match(input,34,FOLLOW_34_in_rule__HttpTransport__Group__0__Impl5244); 
             after(grammarAccess.getHttpTransportAccess().getHttpKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__HttpTransport__Group__0__Impl


    // $ANTLR start rule__HttpTransport__Group__1
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2649:1: rule__HttpTransport__Group__1 : rule__HttpTransport__Group__1__Impl rule__HttpTransport__Group__2 ;
    public final void rule__HttpTransport__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2653:1: ( rule__HttpTransport__Group__1__Impl rule__HttpTransport__Group__2 )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2654:2: rule__HttpTransport__Group__1__Impl rule__HttpTransport__Group__2
            {
            pushFollow(FOLLOW_rule__HttpTransport__Group__1__Impl_in_rule__HttpTransport__Group__15275);
            rule__HttpTransport__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__HttpTransport__Group__2_in_rule__HttpTransport__Group__15278);
            rule__HttpTransport__Group__2();
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
    // $ANTLR end rule__HttpTransport__Group__1


    // $ANTLR start rule__HttpTransport__Group__1__Impl
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2661:1: rule__HttpTransport__Group__1__Impl : ( '-' ) ;
    public final void rule__HttpTransport__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2665:1: ( ( '-' ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2666:1: ( '-' )
            {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2666:1: ( '-' )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2667:1: '-'
            {
             before(grammarAccess.getHttpTransportAccess().getHyphenMinusKeyword_1()); 
            match(input,35,FOLLOW_35_in_rule__HttpTransport__Group__1__Impl5306); 
             after(grammarAccess.getHttpTransportAccess().getHyphenMinusKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__HttpTransport__Group__1__Impl


    // $ANTLR start rule__HttpTransport__Group__2
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2680:1: rule__HttpTransport__Group__2 : rule__HttpTransport__Group__2__Impl ;
    public final void rule__HttpTransport__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2684:1: ( rule__HttpTransport__Group__2__Impl )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2685:2: rule__HttpTransport__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__HttpTransport__Group__2__Impl_in_rule__HttpTransport__Group__25337);
            rule__HttpTransport__Group__2__Impl();
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
    // $ANTLR end rule__HttpTransport__Group__2


    // $ANTLR start rule__HttpTransport__Group__2__Impl
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2691:1: rule__HttpTransport__Group__2__Impl : ( ( rule__HttpTransport__TypeAssignment_2 ) ) ;
    public final void rule__HttpTransport__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2695:1: ( ( ( rule__HttpTransport__TypeAssignment_2 ) ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2696:1: ( ( rule__HttpTransport__TypeAssignment_2 ) )
            {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2696:1: ( ( rule__HttpTransport__TypeAssignment_2 ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2697:1: ( rule__HttpTransport__TypeAssignment_2 )
            {
             before(grammarAccess.getHttpTransportAccess().getTypeAssignment_2()); 
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2698:1: ( rule__HttpTransport__TypeAssignment_2 )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2698:2: rule__HttpTransport__TypeAssignment_2
            {
            pushFollow(FOLLOW_rule__HttpTransport__TypeAssignment_2_in_rule__HttpTransport__Group__2__Impl5364);
            rule__HttpTransport__TypeAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getHttpTransportAccess().getTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__HttpTransport__Group__2__Impl


    // $ANTLR start rule__Service__Group__0
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2714:1: rule__Service__Group__0 : rule__Service__Group__0__Impl rule__Service__Group__1 ;
    public final void rule__Service__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2718:1: ( rule__Service__Group__0__Impl rule__Service__Group__1 )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2719:2: rule__Service__Group__0__Impl rule__Service__Group__1
            {
            pushFollow(FOLLOW_rule__Service__Group__0__Impl_in_rule__Service__Group__05400);
            rule__Service__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Service__Group__1_in_rule__Service__Group__05403);
            rule__Service__Group__1();
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
    // $ANTLR end rule__Service__Group__0


    // $ANTLR start rule__Service__Group__0__Impl
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2726:1: rule__Service__Group__0__Impl : ( ( rule__Service__NameAssignment_0 ) ) ;
    public final void rule__Service__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2730:1: ( ( ( rule__Service__NameAssignment_0 ) ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2731:1: ( ( rule__Service__NameAssignment_0 ) )
            {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2731:1: ( ( rule__Service__NameAssignment_0 ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2732:1: ( rule__Service__NameAssignment_0 )
            {
             before(grammarAccess.getServiceAccess().getNameAssignment_0()); 
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2733:1: ( rule__Service__NameAssignment_0 )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2733:2: rule__Service__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Service__NameAssignment_0_in_rule__Service__Group__0__Impl5430);
            rule__Service__NameAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getServiceAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Service__Group__0__Impl


    // $ANTLR start rule__Service__Group__1
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2743:1: rule__Service__Group__1 : rule__Service__Group__1__Impl rule__Service__Group__2 ;
    public final void rule__Service__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2747:1: ( rule__Service__Group__1__Impl rule__Service__Group__2 )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2748:2: rule__Service__Group__1__Impl rule__Service__Group__2
            {
            pushFollow(FOLLOW_rule__Service__Group__1__Impl_in_rule__Service__Group__15460);
            rule__Service__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Service__Group__2_in_rule__Service__Group__15463);
            rule__Service__Group__2();
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
    // $ANTLR end rule__Service__Group__1


    // $ANTLR start rule__Service__Group__1__Impl
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2755:1: rule__Service__Group__1__Impl : ( '{' ) ;
    public final void rule__Service__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2759:1: ( ( '{' ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2760:1: ( '{' )
            {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2760:1: ( '{' )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2761:1: '{'
            {
             before(grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,23,FOLLOW_23_in_rule__Service__Group__1__Impl5491); 
             after(grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Service__Group__1__Impl


    // $ANTLR start rule__Service__Group__2
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2774:1: rule__Service__Group__2 : rule__Service__Group__2__Impl rule__Service__Group__3 ;
    public final void rule__Service__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2778:1: ( rule__Service__Group__2__Impl rule__Service__Group__3 )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2779:2: rule__Service__Group__2__Impl rule__Service__Group__3
            {
            pushFollow(FOLLOW_rule__Service__Group__2__Impl_in_rule__Service__Group__25522);
            rule__Service__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Service__Group__3_in_rule__Service__Group__25525);
            rule__Service__Group__3();
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
    // $ANTLR end rule__Service__Group__2


    // $ANTLR start rule__Service__Group__2__Impl
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2786:1: rule__Service__Group__2__Impl : ( ( rule__Service__Group_2__0 )? ) ;
    public final void rule__Service__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2790:1: ( ( ( rule__Service__Group_2__0 )? ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2791:1: ( ( rule__Service__Group_2__0 )? )
            {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2791:1: ( ( rule__Service__Group_2__0 )? )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2792:1: ( rule__Service__Group_2__0 )?
            {
             before(grammarAccess.getServiceAccess().getGroup_2()); 
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2793:1: ( rule__Service__Group_2__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==36) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2793:2: rule__Service__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Service__Group_2__0_in_rule__Service__Group__2__Impl5552);
                    rule__Service__Group_2__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getServiceAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Service__Group__2__Impl


    // $ANTLR start rule__Service__Group__3
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2803:1: rule__Service__Group__3 : rule__Service__Group__3__Impl rule__Service__Group__4 ;
    public final void rule__Service__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2807:1: ( rule__Service__Group__3__Impl rule__Service__Group__4 )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2808:2: rule__Service__Group__3__Impl rule__Service__Group__4
            {
            pushFollow(FOLLOW_rule__Service__Group__3__Impl_in_rule__Service__Group__35583);
            rule__Service__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Service__Group__4_in_rule__Service__Group__35586);
            rule__Service__Group__4();
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
    // $ANTLR end rule__Service__Group__3


    // $ANTLR start rule__Service__Group__3__Impl
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2815:1: rule__Service__Group__3__Impl : ( ( rule__Service__PortsAssignment_3 )* ) ;
    public final void rule__Service__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2819:1: ( ( ( rule__Service__PortsAssignment_3 )* ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2820:1: ( ( rule__Service__PortsAssignment_3 )* )
            {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2820:1: ( ( rule__Service__PortsAssignment_3 )* )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2821:1: ( rule__Service__PortsAssignment_3 )*
            {
             before(grammarAccess.getServiceAccess().getPortsAssignment_3()); 
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2822:1: ( rule__Service__PortsAssignment_3 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==37) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2822:2: rule__Service__PortsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Service__PortsAssignment_3_in_rule__Service__Group__3__Impl5613);
            	    rule__Service__PortsAssignment_3();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getServiceAccess().getPortsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Service__Group__3__Impl


    // $ANTLR start rule__Service__Group__4
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2832:1: rule__Service__Group__4 : rule__Service__Group__4__Impl ;
    public final void rule__Service__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2836:1: ( rule__Service__Group__4__Impl )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2837:2: rule__Service__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Service__Group__4__Impl_in_rule__Service__Group__45644);
            rule__Service__Group__4__Impl();
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
    // $ANTLR end rule__Service__Group__4


    // $ANTLR start rule__Service__Group__4__Impl
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2843:1: rule__Service__Group__4__Impl : ( '}' ) ;
    public final void rule__Service__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2847:1: ( ( '}' ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2848:1: ( '}' )
            {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2848:1: ( '}' )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2849:1: '}'
            {
             before(grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_4()); 
            match(input,24,FOLLOW_24_in_rule__Service__Group__4__Impl5672); 
             after(grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Service__Group__4__Impl


    // $ANTLR start rule__Service__Group_2__0
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2872:1: rule__Service__Group_2__0 : rule__Service__Group_2__0__Impl rule__Service__Group_2__1 ;
    public final void rule__Service__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2876:1: ( rule__Service__Group_2__0__Impl rule__Service__Group_2__1 )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2877:2: rule__Service__Group_2__0__Impl rule__Service__Group_2__1
            {
            pushFollow(FOLLOW_rule__Service__Group_2__0__Impl_in_rule__Service__Group_2__05713);
            rule__Service__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Service__Group_2__1_in_rule__Service__Group_2__05716);
            rule__Service__Group_2__1();
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
    // $ANTLR end rule__Service__Group_2__0


    // $ANTLR start rule__Service__Group_2__0__Impl
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2884:1: rule__Service__Group_2__0__Impl : ( 'documentation' ) ;
    public final void rule__Service__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2888:1: ( ( 'documentation' ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2889:1: ( 'documentation' )
            {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2889:1: ( 'documentation' )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2890:1: 'documentation'
            {
             before(grammarAccess.getServiceAccess().getDocumentationKeyword_2_0()); 
            match(input,36,FOLLOW_36_in_rule__Service__Group_2__0__Impl5744); 
             after(grammarAccess.getServiceAccess().getDocumentationKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Service__Group_2__0__Impl


    // $ANTLR start rule__Service__Group_2__1
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2903:1: rule__Service__Group_2__1 : rule__Service__Group_2__1__Impl ;
    public final void rule__Service__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2907:1: ( rule__Service__Group_2__1__Impl )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2908:2: rule__Service__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Service__Group_2__1__Impl_in_rule__Service__Group_2__15775);
            rule__Service__Group_2__1__Impl();
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
    // $ANTLR end rule__Service__Group_2__1


    // $ANTLR start rule__Service__Group_2__1__Impl
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2914:1: rule__Service__Group_2__1__Impl : ( ( rule__Service__DocumentationAssignment_2_1 ) ) ;
    public final void rule__Service__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2918:1: ( ( ( rule__Service__DocumentationAssignment_2_1 ) ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2919:1: ( ( rule__Service__DocumentationAssignment_2_1 ) )
            {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2919:1: ( ( rule__Service__DocumentationAssignment_2_1 ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2920:1: ( rule__Service__DocumentationAssignment_2_1 )
            {
             before(grammarAccess.getServiceAccess().getDocumentationAssignment_2_1()); 
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2921:1: ( rule__Service__DocumentationAssignment_2_1 )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2921:2: rule__Service__DocumentationAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Service__DocumentationAssignment_2_1_in_rule__Service__Group_2__1__Impl5802);
            rule__Service__DocumentationAssignment_2_1();
            _fsp--;


            }

             after(grammarAccess.getServiceAccess().getDocumentationAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Service__Group_2__1__Impl


    // $ANTLR start rule__Port__Group__0
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2935:1: rule__Port__Group__0 : rule__Port__Group__0__Impl rule__Port__Group__1 ;
    public final void rule__Port__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2939:1: ( rule__Port__Group__0__Impl rule__Port__Group__1 )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2940:2: rule__Port__Group__0__Impl rule__Port__Group__1
            {
            pushFollow(FOLLOW_rule__Port__Group__0__Impl_in_rule__Port__Group__05836);
            rule__Port__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Port__Group__1_in_rule__Port__Group__05839);
            rule__Port__Group__1();
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
    // $ANTLR end rule__Port__Group__0


    // $ANTLR start rule__Port__Group__0__Impl
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2947:1: rule__Port__Group__0__Impl : ( 'port' ) ;
    public final void rule__Port__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2951:1: ( ( 'port' ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2952:1: ( 'port' )
            {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2952:1: ( 'port' )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2953:1: 'port'
            {
             before(grammarAccess.getPortAccess().getPortKeyword_0()); 
            match(input,37,FOLLOW_37_in_rule__Port__Group__0__Impl5867); 
             after(grammarAccess.getPortAccess().getPortKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Port__Group__0__Impl


    // $ANTLR start rule__Port__Group__1
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2966:1: rule__Port__Group__1 : rule__Port__Group__1__Impl rule__Port__Group__2 ;
    public final void rule__Port__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2970:1: ( rule__Port__Group__1__Impl rule__Port__Group__2 )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2971:2: rule__Port__Group__1__Impl rule__Port__Group__2
            {
            pushFollow(FOLLOW_rule__Port__Group__1__Impl_in_rule__Port__Group__15898);
            rule__Port__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Port__Group__2_in_rule__Port__Group__15901);
            rule__Port__Group__2();
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
    // $ANTLR end rule__Port__Group__1


    // $ANTLR start rule__Port__Group__1__Impl
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2978:1: rule__Port__Group__1__Impl : ( ( rule__Port__NameAssignment_1 ) ) ;
    public final void rule__Port__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2982:1: ( ( ( rule__Port__NameAssignment_1 ) ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2983:1: ( ( rule__Port__NameAssignment_1 ) )
            {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2983:1: ( ( rule__Port__NameAssignment_1 ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2984:1: ( rule__Port__NameAssignment_1 )
            {
             before(grammarAccess.getPortAccess().getNameAssignment_1()); 
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2985:1: ( rule__Port__NameAssignment_1 )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2985:2: rule__Port__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Port__NameAssignment_1_in_rule__Port__Group__1__Impl5928);
            rule__Port__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getPortAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Port__Group__1__Impl


    // $ANTLR start rule__Port__Group__2
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2995:1: rule__Port__Group__2 : rule__Port__Group__2__Impl rule__Port__Group__3 ;
    public final void rule__Port__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:2999:1: ( rule__Port__Group__2__Impl rule__Port__Group__3 )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3000:2: rule__Port__Group__2__Impl rule__Port__Group__3
            {
            pushFollow(FOLLOW_rule__Port__Group__2__Impl_in_rule__Port__Group__25958);
            rule__Port__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Port__Group__3_in_rule__Port__Group__25961);
            rule__Port__Group__3();
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
    // $ANTLR end rule__Port__Group__2


    // $ANTLR start rule__Port__Group__2__Impl
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3007:1: rule__Port__Group__2__Impl : ( 'binds' ) ;
    public final void rule__Port__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3011:1: ( ( 'binds' ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3012:1: ( 'binds' )
            {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3012:1: ( 'binds' )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3013:1: 'binds'
            {
             before(grammarAccess.getPortAccess().getBindsKeyword_2()); 
            match(input,29,FOLLOW_29_in_rule__Port__Group__2__Impl5989); 
             after(grammarAccess.getPortAccess().getBindsKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Port__Group__2__Impl


    // $ANTLR start rule__Port__Group__3
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3026:1: rule__Port__Group__3 : rule__Port__Group__3__Impl rule__Port__Group__4 ;
    public final void rule__Port__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3030:1: ( rule__Port__Group__3__Impl rule__Port__Group__4 )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3031:2: rule__Port__Group__3__Impl rule__Port__Group__4
            {
            pushFollow(FOLLOW_rule__Port__Group__3__Impl_in_rule__Port__Group__36020);
            rule__Port__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Port__Group__4_in_rule__Port__Group__36023);
            rule__Port__Group__4();
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
    // $ANTLR end rule__Port__Group__3


    // $ANTLR start rule__Port__Group__3__Impl
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3038:1: rule__Port__Group__3__Impl : ( ( rule__Port__BindingAssignment_3 ) ) ;
    public final void rule__Port__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3042:1: ( ( ( rule__Port__BindingAssignment_3 ) ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3043:1: ( ( rule__Port__BindingAssignment_3 ) )
            {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3043:1: ( ( rule__Port__BindingAssignment_3 ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3044:1: ( rule__Port__BindingAssignment_3 )
            {
             before(grammarAccess.getPortAccess().getBindingAssignment_3()); 
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3045:1: ( rule__Port__BindingAssignment_3 )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3045:2: rule__Port__BindingAssignment_3
            {
            pushFollow(FOLLOW_rule__Port__BindingAssignment_3_in_rule__Port__Group__3__Impl6050);
            rule__Port__BindingAssignment_3();
            _fsp--;


            }

             after(grammarAccess.getPortAccess().getBindingAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Port__Group__3__Impl


    // $ANTLR start rule__Port__Group__4
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3055:1: rule__Port__Group__4 : rule__Port__Group__4__Impl rule__Port__Group__5 ;
    public final void rule__Port__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3059:1: ( rule__Port__Group__4__Impl rule__Port__Group__5 )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3060:2: rule__Port__Group__4__Impl rule__Port__Group__5
            {
            pushFollow(FOLLOW_rule__Port__Group__4__Impl_in_rule__Port__Group__46080);
            rule__Port__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Port__Group__5_in_rule__Port__Group__46083);
            rule__Port__Group__5();
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
    // $ANTLR end rule__Port__Group__4


    // $ANTLR start rule__Port__Group__4__Impl
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3067:1: rule__Port__Group__4__Impl : ( 'on' ) ;
    public final void rule__Port__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3071:1: ( ( 'on' ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3072:1: ( 'on' )
            {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3072:1: ( 'on' )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3073:1: 'on'
            {
             before(grammarAccess.getPortAccess().getOnKeyword_4()); 
            match(input,38,FOLLOW_38_in_rule__Port__Group__4__Impl6111); 
             after(grammarAccess.getPortAccess().getOnKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Port__Group__4__Impl


    // $ANTLR start rule__Port__Group__5
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3086:1: rule__Port__Group__5 : rule__Port__Group__5__Impl ;
    public final void rule__Port__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3090:1: ( rule__Port__Group__5__Impl )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3091:2: rule__Port__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Port__Group__5__Impl_in_rule__Port__Group__56142);
            rule__Port__Group__5__Impl();
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
    // $ANTLR end rule__Port__Group__5


    // $ANTLR start rule__Port__Group__5__Impl
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3097:1: rule__Port__Group__5__Impl : ( ( rule__Port__LocationAssignment_5 ) ) ;
    public final void rule__Port__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3101:1: ( ( ( rule__Port__LocationAssignment_5 ) ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3102:1: ( ( rule__Port__LocationAssignment_5 ) )
            {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3102:1: ( ( rule__Port__LocationAssignment_5 ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3103:1: ( rule__Port__LocationAssignment_5 )
            {
             before(grammarAccess.getPortAccess().getLocationAssignment_5()); 
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3104:1: ( rule__Port__LocationAssignment_5 )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3104:2: rule__Port__LocationAssignment_5
            {
            pushFollow(FOLLOW_rule__Port__LocationAssignment_5_in_rule__Port__Group__5__Impl6169);
            rule__Port__LocationAssignment_5();
            _fsp--;


            }

             after(grammarAccess.getPortAccess().getLocationAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Port__Group__5__Impl


    // $ANTLR start rule__Definitions__NameAssignment_1
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3127:1: rule__Definitions__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Definitions__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3131:1: ( ( RULE_ID ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3132:1: ( RULE_ID )
            {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3132:1: ( RULE_ID )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3133:1: RULE_ID
            {
             before(grammarAccess.getDefinitionsAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Definitions__NameAssignment_16216); 
             after(grammarAccess.getDefinitionsAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Definitions__NameAssignment_1


    // $ANTLR start rule__Definitions__NsUriAssignment_3
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3142:1: rule__Definitions__NsUriAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Definitions__NsUriAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3146:1: ( ( RULE_STRING ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3147:1: ( RULE_STRING )
            {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3147:1: ( RULE_STRING )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3148:1: RULE_STRING
            {
             before(grammarAccess.getDefinitionsAccess().getNsUriSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Definitions__NsUriAssignment_36247); 
             after(grammarAccess.getDefinitionsAccess().getNsUriSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Definitions__NsUriAssignment_3


    // $ANTLR start rule__Definitions__XsdImportAssignment_4
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3157:1: rule__Definitions__XsdImportAssignment_4 : ( ruleXsdImport ) ;
    public final void rule__Definitions__XsdImportAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3161:1: ( ( ruleXsdImport ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3162:1: ( ruleXsdImport )
            {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3162:1: ( ruleXsdImport )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3163:1: ruleXsdImport
            {
             before(grammarAccess.getDefinitionsAccess().getXsdImportXsdImportParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleXsdImport_in_rule__Definitions__XsdImportAssignment_46278);
            ruleXsdImport();
            _fsp--;

             after(grammarAccess.getDefinitionsAccess().getXsdImportXsdImportParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Definitions__XsdImportAssignment_4


    // $ANTLR start rule__Definitions__MessagesAssignment_5_1
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3172:1: rule__Definitions__MessagesAssignment_5_1 : ( ruleMessage ) ;
    public final void rule__Definitions__MessagesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3176:1: ( ( ruleMessage ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3177:1: ( ruleMessage )
            {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3177:1: ( ruleMessage )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3178:1: ruleMessage
            {
             before(grammarAccess.getDefinitionsAccess().getMessagesMessageParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_ruleMessage_in_rule__Definitions__MessagesAssignment_5_16309);
            ruleMessage();
            _fsp--;

             after(grammarAccess.getDefinitionsAccess().getMessagesMessageParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Definitions__MessagesAssignment_5_1


    // $ANTLR start rule__Definitions__PortTypesAssignment_6_1
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3187:1: rule__Definitions__PortTypesAssignment_6_1 : ( rulePortType ) ;
    public final void rule__Definitions__PortTypesAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3191:1: ( ( rulePortType ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3192:1: ( rulePortType )
            {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3192:1: ( rulePortType )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3193:1: rulePortType
            {
             before(grammarAccess.getDefinitionsAccess().getPortTypesPortTypeParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_rulePortType_in_rule__Definitions__PortTypesAssignment_6_16340);
            rulePortType();
            _fsp--;

             after(grammarAccess.getDefinitionsAccess().getPortTypesPortTypeParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Definitions__PortTypesAssignment_6_1


    // $ANTLR start rule__Definitions__BindingsAssignment_7_1
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3202:1: rule__Definitions__BindingsAssignment_7_1 : ( ruleBinding ) ;
    public final void rule__Definitions__BindingsAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3206:1: ( ( ruleBinding ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3207:1: ( ruleBinding )
            {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3207:1: ( ruleBinding )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3208:1: ruleBinding
            {
             before(grammarAccess.getDefinitionsAccess().getBindingsBindingParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_ruleBinding_in_rule__Definitions__BindingsAssignment_7_16371);
            ruleBinding();
            _fsp--;

             after(grammarAccess.getDefinitionsAccess().getBindingsBindingParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Definitions__BindingsAssignment_7_1


    // $ANTLR start rule__Definitions__ServicesAssignment_8_1
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3217:1: rule__Definitions__ServicesAssignment_8_1 : ( ruleService ) ;
    public final void rule__Definitions__ServicesAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3221:1: ( ( ruleService ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3222:1: ( ruleService )
            {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3222:1: ( ruleService )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3223:1: ruleService
            {
             before(grammarAccess.getDefinitionsAccess().getServicesServiceParserRuleCall_8_1_0()); 
            pushFollow(FOLLOW_ruleService_in_rule__Definitions__ServicesAssignment_8_16402);
            ruleService();
            _fsp--;

             after(grammarAccess.getDefinitionsAccess().getServicesServiceParserRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Definitions__ServicesAssignment_8_1


    // $ANTLR start rule__XsdImport__ImportURIAssignment_1
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3232:1: rule__XsdImport__ImportURIAssignment_1 : ( RULE_STRING ) ;
    public final void rule__XsdImport__ImportURIAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3236:1: ( ( RULE_STRING ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3237:1: ( RULE_STRING )
            {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3237:1: ( RULE_STRING )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3238:1: RULE_STRING
            {
             before(grammarAccess.getXsdImportAccess().getImportURISTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__XsdImport__ImportURIAssignment_16433); 
             after(grammarAccess.getXsdImportAccess().getImportURISTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__XsdImport__ImportURIAssignment_1


    // $ANTLR start rule__XsdImport__NsPrefixAssignment_3
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3247:1: rule__XsdImport__NsPrefixAssignment_3 : ( RULE_ID ) ;
    public final void rule__XsdImport__NsPrefixAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3251:1: ( ( RULE_ID ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3252:1: ( RULE_ID )
            {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3252:1: ( RULE_ID )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3253:1: RULE_ID
            {
             before(grammarAccess.getXsdImportAccess().getNsPrefixIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__XsdImport__NsPrefixAssignment_36464); 
             after(grammarAccess.getXsdImportAccess().getNsPrefixIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__XsdImport__NsPrefixAssignment_3


    // $ANTLR start rule__Message__NameAssignment_0
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3262:1: rule__Message__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Message__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3266:1: ( ( RULE_ID ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3267:1: ( RULE_ID )
            {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3267:1: ( RULE_ID )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3268:1: RULE_ID
            {
             before(grammarAccess.getMessageAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Message__NameAssignment_06495); 
             after(grammarAccess.getMessageAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Message__NameAssignment_0


    // $ANTLR start rule__Message__PartsAssignment_2
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3277:1: rule__Message__PartsAssignment_2 : ( rulePart ) ;
    public final void rule__Message__PartsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3281:1: ( ( rulePart ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3282:1: ( rulePart )
            {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3282:1: ( rulePart )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3283:1: rulePart
            {
             before(grammarAccess.getMessageAccess().getPartsPartParserRuleCall_2_0()); 
            pushFollow(FOLLOW_rulePart_in_rule__Message__PartsAssignment_26526);
            rulePart();
            _fsp--;

             after(grammarAccess.getMessageAccess().getPartsPartParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Message__PartsAssignment_2


    // $ANTLR start rule__Part__NameAssignment_0
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3292:1: rule__Part__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Part__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3296:1: ( ( RULE_ID ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3297:1: ( RULE_ID )
            {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3297:1: ( RULE_ID )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3298:1: RULE_ID
            {
             before(grammarAccess.getPartAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Part__NameAssignment_06557); 
             after(grammarAccess.getPartAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Part__NameAssignment_0


    // $ANTLR start rule__Part__DefAssignment_2
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3307:1: rule__Part__DefAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Part__DefAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3311:1: ( ( ( RULE_ID ) ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3312:1: ( ( RULE_ID ) )
            {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3312:1: ( ( RULE_ID ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3313:1: ( RULE_ID )
            {
             before(grammarAccess.getPartAccess().getDefTopLevelDefinitionCrossReference_2_0()); 
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3314:1: ( RULE_ID )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3315:1: RULE_ID
            {
             before(grammarAccess.getPartAccess().getDefTopLevelDefinitionIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Part__DefAssignment_26592); 
             after(grammarAccess.getPartAccess().getDefTopLevelDefinitionIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getPartAccess().getDefTopLevelDefinitionCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Part__DefAssignment_2


    // $ANTLR start rule__PortType__NameAssignment_0
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3326:1: rule__PortType__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__PortType__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3330:1: ( ( RULE_ID ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3331:1: ( RULE_ID )
            {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3331:1: ( RULE_ID )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3332:1: RULE_ID
            {
             before(grammarAccess.getPortTypeAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__PortType__NameAssignment_06627); 
             after(grammarAccess.getPortTypeAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PortType__NameAssignment_0


    // $ANTLR start rule__PortType__OperationsAssignment_2
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3341:1: rule__PortType__OperationsAssignment_2 : ( ruleOperation ) ;
    public final void rule__PortType__OperationsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3345:1: ( ( ruleOperation ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3346:1: ( ruleOperation )
            {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3346:1: ( ruleOperation )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3347:1: ruleOperation
            {
             before(grammarAccess.getPortTypeAccess().getOperationsOperationParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleOperation_in_rule__PortType__OperationsAssignment_26658);
            ruleOperation();
            _fsp--;

             after(grammarAccess.getPortTypeAccess().getOperationsOperationParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PortType__OperationsAssignment_2


    // $ANTLR start rule__OneWayOperation__NameAssignment_1
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3356:1: rule__OneWayOperation__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__OneWayOperation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3360:1: ( ( RULE_ID ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3361:1: ( RULE_ID )
            {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3361:1: ( RULE_ID )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3362:1: RULE_ID
            {
             before(grammarAccess.getOneWayOperationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__OneWayOperation__NameAssignment_16689); 
             after(grammarAccess.getOneWayOperationAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__OneWayOperation__NameAssignment_1


    // $ANTLR start rule__OneWayOperation__InputAssignment_3
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3371:1: rule__OneWayOperation__InputAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__OneWayOperation__InputAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3375:1: ( ( ( RULE_ID ) ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3376:1: ( ( RULE_ID ) )
            {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3376:1: ( ( RULE_ID ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3377:1: ( RULE_ID )
            {
             before(grammarAccess.getOneWayOperationAccess().getInputMessageCrossReference_3_0()); 
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3378:1: ( RULE_ID )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3379:1: RULE_ID
            {
             before(grammarAccess.getOneWayOperationAccess().getInputMessageIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__OneWayOperation__InputAssignment_36724); 
             after(grammarAccess.getOneWayOperationAccess().getInputMessageIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getOneWayOperationAccess().getInputMessageCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__OneWayOperation__InputAssignment_3


    // $ANTLR start rule__RequestResponseOperation__NameAssignment_1
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3390:1: rule__RequestResponseOperation__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__RequestResponseOperation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3394:1: ( ( RULE_ID ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3395:1: ( RULE_ID )
            {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3395:1: ( RULE_ID )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3396:1: RULE_ID
            {
             before(grammarAccess.getRequestResponseOperationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__RequestResponseOperation__NameAssignment_16759); 
             after(grammarAccess.getRequestResponseOperationAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RequestResponseOperation__NameAssignment_1


    // $ANTLR start rule__RequestResponseOperation__InputAssignment_3
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3405:1: rule__RequestResponseOperation__InputAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__RequestResponseOperation__InputAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3409:1: ( ( ( RULE_ID ) ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3410:1: ( ( RULE_ID ) )
            {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3410:1: ( ( RULE_ID ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3411:1: ( RULE_ID )
            {
             before(grammarAccess.getRequestResponseOperationAccess().getInputMessageCrossReference_3_0()); 
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3412:1: ( RULE_ID )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3413:1: RULE_ID
            {
             before(grammarAccess.getRequestResponseOperationAccess().getInputMessageIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__RequestResponseOperation__InputAssignment_36794); 
             after(grammarAccess.getRequestResponseOperationAccess().getInputMessageIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getRequestResponseOperationAccess().getInputMessageCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RequestResponseOperation__InputAssignment_3


    // $ANTLR start rule__RequestResponseOperation__OutputAssignment_5
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3424:1: rule__RequestResponseOperation__OutputAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__RequestResponseOperation__OutputAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3428:1: ( ( ( RULE_ID ) ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3429:1: ( ( RULE_ID ) )
            {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3429:1: ( ( RULE_ID ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3430:1: ( RULE_ID )
            {
             before(grammarAccess.getRequestResponseOperationAccess().getOutputMessageCrossReference_5_0()); 
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3431:1: ( RULE_ID )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3432:1: RULE_ID
            {
             before(grammarAccess.getRequestResponseOperationAccess().getOutputMessageIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__RequestResponseOperation__OutputAssignment_56833); 
             after(grammarAccess.getRequestResponseOperationAccess().getOutputMessageIDTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getRequestResponseOperationAccess().getOutputMessageCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RequestResponseOperation__OutputAssignment_5


    // $ANTLR start rule__SolicitResponseOperation__NameAssignment_1
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3443:1: rule__SolicitResponseOperation__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SolicitResponseOperation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3447:1: ( ( RULE_ID ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3448:1: ( RULE_ID )
            {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3448:1: ( RULE_ID )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3449:1: RULE_ID
            {
             before(grammarAccess.getSolicitResponseOperationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SolicitResponseOperation__NameAssignment_16868); 
             after(grammarAccess.getSolicitResponseOperationAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SolicitResponseOperation__NameAssignment_1


    // $ANTLR start rule__SolicitResponseOperation__InputAssignment_3
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3458:1: rule__SolicitResponseOperation__InputAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__SolicitResponseOperation__InputAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3462:1: ( ( ( RULE_ID ) ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3463:1: ( ( RULE_ID ) )
            {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3463:1: ( ( RULE_ID ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3464:1: ( RULE_ID )
            {
             before(grammarAccess.getSolicitResponseOperationAccess().getInputMessageCrossReference_3_0()); 
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3465:1: ( RULE_ID )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3466:1: RULE_ID
            {
             before(grammarAccess.getSolicitResponseOperationAccess().getInputMessageIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SolicitResponseOperation__InputAssignment_36903); 
             after(grammarAccess.getSolicitResponseOperationAccess().getInputMessageIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getSolicitResponseOperationAccess().getInputMessageCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SolicitResponseOperation__InputAssignment_3


    // $ANTLR start rule__SolicitResponseOperation__OutputAssignment_5
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3477:1: rule__SolicitResponseOperation__OutputAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__SolicitResponseOperation__OutputAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3481:1: ( ( ( RULE_ID ) ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3482:1: ( ( RULE_ID ) )
            {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3482:1: ( ( RULE_ID ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3483:1: ( RULE_ID )
            {
             before(grammarAccess.getSolicitResponseOperationAccess().getOutputMessageCrossReference_5_0()); 
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3484:1: ( RULE_ID )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3485:1: RULE_ID
            {
             before(grammarAccess.getSolicitResponseOperationAccess().getOutputMessageIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SolicitResponseOperation__OutputAssignment_56942); 
             after(grammarAccess.getSolicitResponseOperationAccess().getOutputMessageIDTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getSolicitResponseOperationAccess().getOutputMessageCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SolicitResponseOperation__OutputAssignment_5


    // $ANTLR start rule__NotificationOperation__NameAssignment_1
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3496:1: rule__NotificationOperation__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__NotificationOperation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3500:1: ( ( RULE_ID ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3501:1: ( RULE_ID )
            {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3501:1: ( RULE_ID )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3502:1: RULE_ID
            {
             before(grammarAccess.getNotificationOperationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__NotificationOperation__NameAssignment_16977); 
             after(grammarAccess.getNotificationOperationAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__NotificationOperation__NameAssignment_1


    // $ANTLR start rule__NotificationOperation__OutputAssignment_4
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3511:1: rule__NotificationOperation__OutputAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__NotificationOperation__OutputAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3515:1: ( ( ( RULE_ID ) ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3516:1: ( ( RULE_ID ) )
            {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3516:1: ( ( RULE_ID ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3517:1: ( RULE_ID )
            {
             before(grammarAccess.getNotificationOperationAccess().getOutputMessageCrossReference_4_0()); 
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3518:1: ( RULE_ID )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3519:1: RULE_ID
            {
             before(grammarAccess.getNotificationOperationAccess().getOutputMessageIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__NotificationOperation__OutputAssignment_47012); 
             after(grammarAccess.getNotificationOperationAccess().getOutputMessageIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getNotificationOperationAccess().getOutputMessageCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__NotificationOperation__OutputAssignment_4


    // $ANTLR start rule__Binding__NameAssignment_0
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3530:1: rule__Binding__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Binding__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3534:1: ( ( RULE_ID ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3535:1: ( RULE_ID )
            {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3535:1: ( RULE_ID )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3536:1: RULE_ID
            {
             before(grammarAccess.getBindingAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Binding__NameAssignment_07047); 
             after(grammarAccess.getBindingAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Binding__NameAssignment_0


    // $ANTLR start rule__Binding__TypeAssignment_2
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3545:1: rule__Binding__TypeAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Binding__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3549:1: ( ( ( RULE_ID ) ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3550:1: ( ( RULE_ID ) )
            {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3550:1: ( ( RULE_ID ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3551:1: ( RULE_ID )
            {
             before(grammarAccess.getBindingAccess().getTypePortTypeCrossReference_2_0()); 
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3552:1: ( RULE_ID )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3553:1: RULE_ID
            {
             before(grammarAccess.getBindingAccess().getTypePortTypeIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Binding__TypeAssignment_27082); 
             after(grammarAccess.getBindingAccess().getTypePortTypeIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getBindingAccess().getTypePortTypeCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Binding__TypeAssignment_2


    // $ANTLR start rule__Binding__TransportAssignment_4
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3564:1: rule__Binding__TransportAssignment_4 : ( ruleTransport ) ;
    public final void rule__Binding__TransportAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3568:1: ( ( ruleTransport ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3569:1: ( ruleTransport )
            {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3569:1: ( ruleTransport )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3570:1: ruleTransport
            {
             before(grammarAccess.getBindingAccess().getTransportTransportParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleTransport_in_rule__Binding__TransportAssignment_47117);
            ruleTransport();
            _fsp--;

             after(grammarAccess.getBindingAccess().getTransportTransportParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Binding__TransportAssignment_4


    // $ANTLR start rule__SoapTransport__TypeAssignment_2
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3579:1: rule__SoapTransport__TypeAssignment_2 : ( ruleSoapType ) ;
    public final void rule__SoapTransport__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3583:1: ( ( ruleSoapType ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3584:1: ( ruleSoapType )
            {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3584:1: ( ruleSoapType )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3585:1: ruleSoapType
            {
             before(grammarAccess.getSoapTransportAccess().getTypeSoapTypeEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleSoapType_in_rule__SoapTransport__TypeAssignment_27148);
            ruleSoapType();
            _fsp--;

             after(grammarAccess.getSoapTransportAccess().getTypeSoapTypeEnumRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SoapTransport__TypeAssignment_2


    // $ANTLR start rule__HttpTransport__TypeAssignment_2
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3594:1: rule__HttpTransport__TypeAssignment_2 : ( ruleHttpType ) ;
    public final void rule__HttpTransport__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3598:1: ( ( ruleHttpType ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3599:1: ( ruleHttpType )
            {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3599:1: ( ruleHttpType )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3600:1: ruleHttpType
            {
             before(grammarAccess.getHttpTransportAccess().getTypeHttpTypeEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleHttpType_in_rule__HttpTransport__TypeAssignment_27179);
            ruleHttpType();
            _fsp--;

             after(grammarAccess.getHttpTransportAccess().getTypeHttpTypeEnumRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__HttpTransport__TypeAssignment_2


    // $ANTLR start rule__Service__NameAssignment_0
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3609:1: rule__Service__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Service__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3613:1: ( ( RULE_ID ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3614:1: ( RULE_ID )
            {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3614:1: ( RULE_ID )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3615:1: RULE_ID
            {
             before(grammarAccess.getServiceAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Service__NameAssignment_07210); 
             after(grammarAccess.getServiceAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Service__NameAssignment_0


    // $ANTLR start rule__Service__DocumentationAssignment_2_1
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3624:1: rule__Service__DocumentationAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__Service__DocumentationAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3628:1: ( ( RULE_STRING ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3629:1: ( RULE_STRING )
            {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3629:1: ( RULE_STRING )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3630:1: RULE_STRING
            {
             before(grammarAccess.getServiceAccess().getDocumentationSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Service__DocumentationAssignment_2_17241); 
             after(grammarAccess.getServiceAccess().getDocumentationSTRINGTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Service__DocumentationAssignment_2_1


    // $ANTLR start rule__Service__PortsAssignment_3
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3639:1: rule__Service__PortsAssignment_3 : ( rulePort ) ;
    public final void rule__Service__PortsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3643:1: ( ( rulePort ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3644:1: ( rulePort )
            {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3644:1: ( rulePort )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3645:1: rulePort
            {
             before(grammarAccess.getServiceAccess().getPortsPortParserRuleCall_3_0()); 
            pushFollow(FOLLOW_rulePort_in_rule__Service__PortsAssignment_37272);
            rulePort();
            _fsp--;

             after(grammarAccess.getServiceAccess().getPortsPortParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Service__PortsAssignment_3


    // $ANTLR start rule__Port__NameAssignment_1
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3654:1: rule__Port__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Port__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3658:1: ( ( RULE_ID ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3659:1: ( RULE_ID )
            {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3659:1: ( RULE_ID )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3660:1: RULE_ID
            {
             before(grammarAccess.getPortAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Port__NameAssignment_17303); 
             after(grammarAccess.getPortAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Port__NameAssignment_1


    // $ANTLR start rule__Port__BindingAssignment_3
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3669:1: rule__Port__BindingAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Port__BindingAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3673:1: ( ( ( RULE_ID ) ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3674:1: ( ( RULE_ID ) )
            {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3674:1: ( ( RULE_ID ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3675:1: ( RULE_ID )
            {
             before(grammarAccess.getPortAccess().getBindingBindingCrossReference_3_0()); 
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3676:1: ( RULE_ID )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3677:1: RULE_ID
            {
             before(grammarAccess.getPortAccess().getBindingBindingIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Port__BindingAssignment_37338); 
             after(grammarAccess.getPortAccess().getBindingBindingIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getPortAccess().getBindingBindingCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Port__BindingAssignment_3


    // $ANTLR start rule__Port__LocationAssignment_5
    // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3688:1: rule__Port__LocationAssignment_5 : ( RULE_STRING ) ;
    public final void rule__Port__LocationAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3692:1: ( ( RULE_STRING ) )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3693:1: ( RULE_STRING )
            {
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3693:1: ( RULE_STRING )
            // ../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g:3694:1: RULE_STRING
            {
             before(grammarAccess.getPortAccess().getLocationSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Port__LocationAssignment_57373); 
             after(grammarAccess.getPortAccess().getLocationSTRINGTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Port__LocationAssignment_5


 

    public static final BitSet FOLLOW_ruleDefinitions_in_entryRuleDefinitions61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefinitions68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definitions__Group__0_in_ruleDefinitions94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXsdImport_in_entryRuleXsdImport121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXsdImport128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XsdImport__Group__0_in_ruleXsdImport154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessage_in_entryRuleMessage181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMessage188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Message__Group__0_in_ruleMessage214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePart_in_entryRulePart241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePart248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Part__Group__0_in_rulePart274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePortType_in_entryRulePortType301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePortType308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PortType__Group__0_in_rulePortType334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperation_in_entryRuleOperation361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperation368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Alternatives_in_ruleOperation394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOneWayOperation_in_entryRuleOneWayOperation421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOneWayOperation428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OneWayOperation__Group__0_in_ruleOneWayOperation454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRequestResponseOperation_in_entryRuleRequestResponseOperation481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRequestResponseOperation488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RequestResponseOperation__Group__0_in_ruleRequestResponseOperation514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSolicitResponseOperation_in_entryRuleSolicitResponseOperation541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSolicitResponseOperation548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SolicitResponseOperation__Group__0_in_ruleSolicitResponseOperation574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotificationOperation_in_entryRuleNotificationOperation601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNotificationOperation608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NotificationOperation__Group__0_in_ruleNotificationOperation634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinding_in_entryRuleBinding661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBinding668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Binding__Group__0_in_ruleBinding694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransport_in_entryRuleTransport721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransport728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transport__Alternatives_in_ruleTransport754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSoapTransport_in_entryRuleSoapTransport781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSoapTransport788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SoapTransport__Group__0_in_ruleSoapTransport814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHttpTransport_in_entryRuleHttpTransport841 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHttpTransport848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HttpTransport__Group__0_in_ruleHttpTransport874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleService_in_entryRuleService901 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleService908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__0_in_ruleService934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePort_in_entryRulePort961 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePort968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Port__Group__0_in_rulePort994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SoapType__Alternatives_in_ruleSoapType1031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HttpType__Alternatives_in_ruleHttpType1067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOneWayOperation_in_rule__Operation__Alternatives1102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRequestResponseOperation_in_rule__Operation__Alternatives1119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSolicitResponseOperation_in_rule__Operation__Alternatives1136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotificationOperation_in_rule__Operation__Alternatives1153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSoapTransport_in_rule__Transport__Alternatives1185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHttpTransport_in_rule__Transport__Alternatives1202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__SoapType__Alternatives1235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__SoapType__Alternatives1256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__HttpType__Alternatives1292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__HttpType__Alternatives1313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definitions__Group__0__Impl_in_rule__Definitions__Group__01346 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Definitions__Group__1_in_rule__Definitions__Group__01349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Definitions__Group__0__Impl1377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definitions__Group__1__Impl_in_rule__Definitions__Group__11408 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Definitions__Group__2_in_rule__Definitions__Group__11411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definitions__NameAssignment_1_in_rule__Definitions__Group__1__Impl1438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definitions__Group__2__Impl_in_rule__Definitions__Group__21468 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Definitions__Group__3_in_rule__Definitions__Group__21471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Definitions__Group__2__Impl1499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definitions__Group__3__Impl_in_rule__Definitions__Group__31530 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Definitions__Group__4_in_rule__Definitions__Group__31533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definitions__NsUriAssignment_3_in_rule__Definitions__Group__3__Impl1560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definitions__Group__4__Impl_in_rule__Definitions__Group__41590 = new BitSet(new long[]{0x00000000001E0002L});
    public static final BitSet FOLLOW_rule__Definitions__Group__5_in_rule__Definitions__Group__41593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definitions__XsdImportAssignment_4_in_rule__Definitions__Group__4__Impl1620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definitions__Group__5__Impl_in_rule__Definitions__Group__51650 = new BitSet(new long[]{0x00000000001C0002L});
    public static final BitSet FOLLOW_rule__Definitions__Group__6_in_rule__Definitions__Group__51653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definitions__Group_5__0_in_rule__Definitions__Group__5__Impl1680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definitions__Group__6__Impl_in_rule__Definitions__Group__61711 = new BitSet(new long[]{0x0000000000180002L});
    public static final BitSet FOLLOW_rule__Definitions__Group__7_in_rule__Definitions__Group__61714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definitions__Group_6__0_in_rule__Definitions__Group__6__Impl1741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definitions__Group__7__Impl_in_rule__Definitions__Group__71772 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_rule__Definitions__Group__8_in_rule__Definitions__Group__71775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definitions__Group_7__0_in_rule__Definitions__Group__7__Impl1802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definitions__Group__8__Impl_in_rule__Definitions__Group__81833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definitions__Group_8__0_in_rule__Definitions__Group__8__Impl1860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definitions__Group_5__0__Impl_in_rule__Definitions__Group_5__01909 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Definitions__Group_5__1_in_rule__Definitions__Group_5__01912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Definitions__Group_5__0__Impl1940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definitions__Group_5__1__Impl_in_rule__Definitions__Group_5__11971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definitions__MessagesAssignment_5_1_in_rule__Definitions__Group_5__1__Impl1998 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Definitions__Group_6__0__Impl_in_rule__Definitions__Group_6__02033 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Definitions__Group_6__1_in_rule__Definitions__Group_6__02036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Definitions__Group_6__0__Impl2064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definitions__Group_6__1__Impl_in_rule__Definitions__Group_6__12095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definitions__PortTypesAssignment_6_1_in_rule__Definitions__Group_6__1__Impl2122 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Definitions__Group_7__0__Impl_in_rule__Definitions__Group_7__02157 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Definitions__Group_7__1_in_rule__Definitions__Group_7__02160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Definitions__Group_7__0__Impl2188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definitions__Group_7__1__Impl_in_rule__Definitions__Group_7__12219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definitions__BindingsAssignment_7_1_in_rule__Definitions__Group_7__1__Impl2246 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Definitions__Group_8__0__Impl_in_rule__Definitions__Group_8__02281 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Definitions__Group_8__1_in_rule__Definitions__Group_8__02284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Definitions__Group_8__0__Impl2312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definitions__Group_8__1__Impl_in_rule__Definitions__Group_8__12343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definitions__ServicesAssignment_8_1_in_rule__Definitions__Group_8__1__Impl2370 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__XsdImport__Group__0__Impl_in_rule__XsdImport__Group__02405 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__XsdImport__Group__1_in_rule__XsdImport__Group__02408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__XsdImport__Group__0__Impl2436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XsdImport__Group__1__Impl_in_rule__XsdImport__Group__12467 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__XsdImport__Group__2_in_rule__XsdImport__Group__12470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XsdImport__ImportURIAssignment_1_in_rule__XsdImport__Group__1__Impl2497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XsdImport__Group__2__Impl_in_rule__XsdImport__Group__22527 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__XsdImport__Group__3_in_rule__XsdImport__Group__22530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__XsdImport__Group__2__Impl2558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XsdImport__Group__3__Impl_in_rule__XsdImport__Group__32589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XsdImport__NsPrefixAssignment_3_in_rule__XsdImport__Group__3__Impl2616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Message__Group__0__Impl_in_rule__Message__Group__02654 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Message__Group__1_in_rule__Message__Group__02657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Message__NameAssignment_0_in_rule__Message__Group__0__Impl2684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Message__Group__1__Impl_in_rule__Message__Group__12714 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_rule__Message__Group__2_in_rule__Message__Group__12717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Message__Group__1__Impl2745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Message__Group__2__Impl_in_rule__Message__Group__22776 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Message__Group__3_in_rule__Message__Group__22779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Message__PartsAssignment_2_in_rule__Message__Group__2__Impl2806 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Message__Group__3__Impl_in_rule__Message__Group__32837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Message__Group__3__Impl2865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Part__Group__0__Impl_in_rule__Part__Group__02904 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Part__Group__1_in_rule__Part__Group__02907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Part__NameAssignment_0_in_rule__Part__Group__0__Impl2934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Part__Group__1__Impl_in_rule__Part__Group__12964 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Part__Group__2_in_rule__Part__Group__12967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Part__Group__1__Impl2995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Part__Group__2__Impl_in_rule__Part__Group__23026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Part__DefAssignment_2_in_rule__Part__Group__2__Impl3053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PortType__Group__0__Impl_in_rule__PortType__Group__03089 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__PortType__Group__1_in_rule__PortType__Group__03092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PortType__NameAssignment_0_in_rule__PortType__Group__0__Impl3119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PortType__Group__1__Impl_in_rule__PortType__Group__13149 = new BitSet(new long[]{0x0000000005000000L});
    public static final BitSet FOLLOW_rule__PortType__Group__2_in_rule__PortType__Group__13152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__PortType__Group__1__Impl3180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PortType__Group__2__Impl_in_rule__PortType__Group__23211 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__PortType__Group__3_in_rule__PortType__Group__23214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PortType__OperationsAssignment_2_in_rule__PortType__Group__2__Impl3241 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__PortType__Group__3__Impl_in_rule__PortType__Group__33272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__PortType__Group__3__Impl3300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OneWayOperation__Group__0__Impl_in_rule__OneWayOperation__Group__03339 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__OneWayOperation__Group__1_in_rule__OneWayOperation__Group__03342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__OneWayOperation__Group__0__Impl3370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OneWayOperation__Group__1__Impl_in_rule__OneWayOperation__Group__13401 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__OneWayOperation__Group__2_in_rule__OneWayOperation__Group__13404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OneWayOperation__NameAssignment_1_in_rule__OneWayOperation__Group__1__Impl3431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OneWayOperation__Group__2__Impl_in_rule__OneWayOperation__Group__23461 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__OneWayOperation__Group__3_in_rule__OneWayOperation__Group__23464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__OneWayOperation__Group__2__Impl3492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OneWayOperation__Group__3__Impl_in_rule__OneWayOperation__Group__33523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OneWayOperation__InputAssignment_3_in_rule__OneWayOperation__Group__3__Impl3550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RequestResponseOperation__Group__0__Impl_in_rule__RequestResponseOperation__Group__03588 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RequestResponseOperation__Group__1_in_rule__RequestResponseOperation__Group__03591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__RequestResponseOperation__Group__0__Impl3619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RequestResponseOperation__Group__1__Impl_in_rule__RequestResponseOperation__Group__13650 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__RequestResponseOperation__Group__2_in_rule__RequestResponseOperation__Group__13653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RequestResponseOperation__NameAssignment_1_in_rule__RequestResponseOperation__Group__1__Impl3680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RequestResponseOperation__Group__2__Impl_in_rule__RequestResponseOperation__Group__23710 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RequestResponseOperation__Group__3_in_rule__RequestResponseOperation__Group__23713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__RequestResponseOperation__Group__2__Impl3741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RequestResponseOperation__Group__3__Impl_in_rule__RequestResponseOperation__Group__33772 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__RequestResponseOperation__Group__4_in_rule__RequestResponseOperation__Group__33775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RequestResponseOperation__InputAssignment_3_in_rule__RequestResponseOperation__Group__3__Impl3802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RequestResponseOperation__Group__4__Impl_in_rule__RequestResponseOperation__Group__43832 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RequestResponseOperation__Group__5_in_rule__RequestResponseOperation__Group__43835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__RequestResponseOperation__Group__4__Impl3863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RequestResponseOperation__Group__5__Impl_in_rule__RequestResponseOperation__Group__53894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RequestResponseOperation__OutputAssignment_5_in_rule__RequestResponseOperation__Group__5__Impl3921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SolicitResponseOperation__Group__0__Impl_in_rule__SolicitResponseOperation__Group__03963 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SolicitResponseOperation__Group__1_in_rule__SolicitResponseOperation__Group__03966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__SolicitResponseOperation__Group__0__Impl3994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SolicitResponseOperation__Group__1__Impl_in_rule__SolicitResponseOperation__Group__14025 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__SolicitResponseOperation__Group__2_in_rule__SolicitResponseOperation__Group__14028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SolicitResponseOperation__NameAssignment_1_in_rule__SolicitResponseOperation__Group__1__Impl4055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SolicitResponseOperation__Group__2__Impl_in_rule__SolicitResponseOperation__Group__24085 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SolicitResponseOperation__Group__3_in_rule__SolicitResponseOperation__Group__24088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__SolicitResponseOperation__Group__2__Impl4116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SolicitResponseOperation__Group__3__Impl_in_rule__SolicitResponseOperation__Group__34147 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__SolicitResponseOperation__Group__4_in_rule__SolicitResponseOperation__Group__34150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SolicitResponseOperation__InputAssignment_3_in_rule__SolicitResponseOperation__Group__3__Impl4177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SolicitResponseOperation__Group__4__Impl_in_rule__SolicitResponseOperation__Group__44207 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SolicitResponseOperation__Group__5_in_rule__SolicitResponseOperation__Group__44210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__SolicitResponseOperation__Group__4__Impl4238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SolicitResponseOperation__Group__5__Impl_in_rule__SolicitResponseOperation__Group__54269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SolicitResponseOperation__OutputAssignment_5_in_rule__SolicitResponseOperation__Group__5__Impl4296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NotificationOperation__Group__0__Impl_in_rule__NotificationOperation__Group__04338 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__NotificationOperation__Group__1_in_rule__NotificationOperation__Group__04341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__NotificationOperation__Group__0__Impl4369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NotificationOperation__Group__1__Impl_in_rule__NotificationOperation__Group__14400 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__NotificationOperation__Group__2_in_rule__NotificationOperation__Group__14403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NotificationOperation__NameAssignment_1_in_rule__NotificationOperation__Group__1__Impl4430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NotificationOperation__Group__2__Impl_in_rule__NotificationOperation__Group__24460 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__NotificationOperation__Group__3_in_rule__NotificationOperation__Group__24463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__NotificationOperation__Group__2__Impl4491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NotificationOperation__Group__3__Impl_in_rule__NotificationOperation__Group__34522 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__NotificationOperation__Group__4_in_rule__NotificationOperation__Group__34525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__NotificationOperation__Group__3__Impl4553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NotificationOperation__Group__4__Impl_in_rule__NotificationOperation__Group__44584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NotificationOperation__OutputAssignment_4_in_rule__NotificationOperation__Group__4__Impl4611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Binding__Group__0__Impl_in_rule__Binding__Group__04651 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Binding__Group__1_in_rule__Binding__Group__04654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Binding__NameAssignment_0_in_rule__Binding__Group__0__Impl4681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Binding__Group__1__Impl_in_rule__Binding__Group__14711 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Binding__Group__2_in_rule__Binding__Group__14714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Binding__Group__1__Impl4742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Binding__Group__2__Impl_in_rule__Binding__Group__24773 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Binding__Group__3_in_rule__Binding__Group__24776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Binding__TypeAssignment_2_in_rule__Binding__Group__2__Impl4803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Binding__Group__3__Impl_in_rule__Binding__Group__34833 = new BitSet(new long[]{0x0000000480000000L});
    public static final BitSet FOLLOW_rule__Binding__Group__4_in_rule__Binding__Group__34836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Binding__Group__3__Impl4864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Binding__Group__4__Impl_in_rule__Binding__Group__44895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Binding__TransportAssignment_4_in_rule__Binding__Group__4__Impl4922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SoapTransport__Group__0__Impl_in_rule__SoapTransport__Group__04962 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__SoapTransport__Group__1_in_rule__SoapTransport__Group__04965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__SoapTransport__Group__0__Impl4993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SoapTransport__Group__1__Impl_in_rule__SoapTransport__Group__15024 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_rule__SoapTransport__Group__2_in_rule__SoapTransport__Group__15027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__SoapTransport__Group__1__Impl5055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SoapTransport__Group__2__Impl_in_rule__SoapTransport__Group__25086 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__SoapTransport__Group__3_in_rule__SoapTransport__Group__25089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SoapTransport__TypeAssignment_2_in_rule__SoapTransport__Group__2__Impl5116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SoapTransport__Group__3__Impl_in_rule__SoapTransport__Group__35146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__SoapTransport__Group__3__Impl5174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HttpTransport__Group__0__Impl_in_rule__HttpTransport__Group__05213 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__HttpTransport__Group__1_in_rule__HttpTransport__Group__05216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__HttpTransport__Group__0__Impl5244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HttpTransport__Group__1__Impl_in_rule__HttpTransport__Group__15275 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_rule__HttpTransport__Group__2_in_rule__HttpTransport__Group__15278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__HttpTransport__Group__1__Impl5306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HttpTransport__Group__2__Impl_in_rule__HttpTransport__Group__25337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HttpTransport__TypeAssignment_2_in_rule__HttpTransport__Group__2__Impl5364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__0__Impl_in_rule__Service__Group__05400 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Service__Group__1_in_rule__Service__Group__05403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__NameAssignment_0_in_rule__Service__Group__0__Impl5430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__1__Impl_in_rule__Service__Group__15460 = new BitSet(new long[]{0x0000003001000000L});
    public static final BitSet FOLLOW_rule__Service__Group__2_in_rule__Service__Group__15463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Service__Group__1__Impl5491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__2__Impl_in_rule__Service__Group__25522 = new BitSet(new long[]{0x0000002001000000L});
    public static final BitSet FOLLOW_rule__Service__Group__3_in_rule__Service__Group__25525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group_2__0_in_rule__Service__Group__2__Impl5552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__3__Impl_in_rule__Service__Group__35583 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Service__Group__4_in_rule__Service__Group__35586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__PortsAssignment_3_in_rule__Service__Group__3__Impl5613 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__4__Impl_in_rule__Service__Group__45644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Service__Group__4__Impl5672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group_2__0__Impl_in_rule__Service__Group_2__05713 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Service__Group_2__1_in_rule__Service__Group_2__05716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Service__Group_2__0__Impl5744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group_2__1__Impl_in_rule__Service__Group_2__15775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__DocumentationAssignment_2_1_in_rule__Service__Group_2__1__Impl5802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Port__Group__0__Impl_in_rule__Port__Group__05836 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Port__Group__1_in_rule__Port__Group__05839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Port__Group__0__Impl5867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Port__Group__1__Impl_in_rule__Port__Group__15898 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Port__Group__2_in_rule__Port__Group__15901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Port__NameAssignment_1_in_rule__Port__Group__1__Impl5928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Port__Group__2__Impl_in_rule__Port__Group__25958 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Port__Group__3_in_rule__Port__Group__25961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Port__Group__2__Impl5989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Port__Group__3__Impl_in_rule__Port__Group__36020 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__Port__Group__4_in_rule__Port__Group__36023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Port__BindingAssignment_3_in_rule__Port__Group__3__Impl6050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Port__Group__4__Impl_in_rule__Port__Group__46080 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Port__Group__5_in_rule__Port__Group__46083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Port__Group__4__Impl6111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Port__Group__5__Impl_in_rule__Port__Group__56142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Port__LocationAssignment_5_in_rule__Port__Group__5__Impl6169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Definitions__NameAssignment_16216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Definitions__NsUriAssignment_36247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXsdImport_in_rule__Definitions__XsdImportAssignment_46278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessage_in_rule__Definitions__MessagesAssignment_5_16309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePortType_in_rule__Definitions__PortTypesAssignment_6_16340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinding_in_rule__Definitions__BindingsAssignment_7_16371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleService_in_rule__Definitions__ServicesAssignment_8_16402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__XsdImport__ImportURIAssignment_16433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__XsdImport__NsPrefixAssignment_36464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Message__NameAssignment_06495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePart_in_rule__Message__PartsAssignment_26526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Part__NameAssignment_06557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Part__DefAssignment_26592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__PortType__NameAssignment_06627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperation_in_rule__PortType__OperationsAssignment_26658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__OneWayOperation__NameAssignment_16689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__OneWayOperation__InputAssignment_36724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__RequestResponseOperation__NameAssignment_16759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__RequestResponseOperation__InputAssignment_36794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__RequestResponseOperation__OutputAssignment_56833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SolicitResponseOperation__NameAssignment_16868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SolicitResponseOperation__InputAssignment_36903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SolicitResponseOperation__OutputAssignment_56942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__NotificationOperation__NameAssignment_16977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__NotificationOperation__OutputAssignment_47012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Binding__NameAssignment_07047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Binding__TypeAssignment_27082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransport_in_rule__Binding__TransportAssignment_47117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSoapType_in_rule__SoapTransport__TypeAssignment_27148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHttpType_in_rule__HttpTransport__TypeAssignment_27179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Service__NameAssignment_07210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Service__DocumentationAssignment_2_17241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePort_in_rule__Service__PortsAssignment_37272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Port__NameAssignment_17303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Port__BindingAssignment_37338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Port__LocationAssignment_57373 = new BitSet(new long[]{0x0000000000000002L});

}