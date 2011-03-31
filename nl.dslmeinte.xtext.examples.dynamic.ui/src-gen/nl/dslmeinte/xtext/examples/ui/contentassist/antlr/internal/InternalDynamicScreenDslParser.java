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
import nl.dslmeinte.xtext.examples.services.DynamicScreenDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDynamicScreenDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'display'", "'required'", "'readonly'", "'calculated'", "'doubleAsterisk'", "'true'", "'false'", "'is-one-of'", "'is-not-one-of'", "'dynamic-screen'", "'view-class'", "'='", "'data-import'", "'[nl:'", "']'", "'/'", "'('", "')'", "'external-var'", "'as'", "'define'", "'of'", "'data-store'", "'of-type'", "'group'", "'{'", "'}'", "'with'", "'if'", "'+'", "'restrict-to'", "'restrict-to-group'", "'<'", "'>'", "'or'", "'and'", "'not'", "'is'", "'equals'", "'is-present'", "'is-multi-valued'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_STRING=5;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;

        public InternalDynamicScreenDslParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g"; }


     
     	private DynamicScreenDslGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(DynamicScreenDslGrammarAccess grammarAccess) {
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




    // $ANTLR start entryRuleDynamicScreen
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:61:1: entryRuleDynamicScreen : ruleDynamicScreen EOF ;
    public final void entryRuleDynamicScreen() throws RecognitionException {
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:62:1: ( ruleDynamicScreen EOF )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:63:1: ruleDynamicScreen EOF
            {
             before(grammarAccess.getDynamicScreenRule()); 
            pushFollow(FOLLOW_ruleDynamicScreen_in_entryRuleDynamicScreen61);
            ruleDynamicScreen();
            _fsp--;

             after(grammarAccess.getDynamicScreenRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDynamicScreen68); 

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
    // $ANTLR end entryRuleDynamicScreen


    // $ANTLR start ruleDynamicScreen
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:70:1: ruleDynamicScreen : ( ( rule__DynamicScreen__Group__0 ) ) ;
    public final void ruleDynamicScreen() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:74:2: ( ( ( rule__DynamicScreen__Group__0 ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:75:1: ( ( rule__DynamicScreen__Group__0 ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:75:1: ( ( rule__DynamicScreen__Group__0 ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:76:1: ( rule__DynamicScreen__Group__0 )
            {
             before(grammarAccess.getDynamicScreenAccess().getGroup()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:77:1: ( rule__DynamicScreen__Group__0 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:77:2: rule__DynamicScreen__Group__0
            {
            pushFollow(FOLLOW_rule__DynamicScreen__Group__0_in_ruleDynamicScreen94);
            rule__DynamicScreen__Group__0();
            _fsp--;


            }

             after(grammarAccess.getDynamicScreenAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleDynamicScreen


    // $ANTLR start entryRuleDataImport
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:89:1: entryRuleDataImport : ruleDataImport EOF ;
    public final void entryRuleDataImport() throws RecognitionException {
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:90:1: ( ruleDataImport EOF )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:91:1: ruleDataImport EOF
            {
             before(grammarAccess.getDataImportRule()); 
            pushFollow(FOLLOW_ruleDataImport_in_entryRuleDataImport121);
            ruleDataImport();
            _fsp--;

             after(grammarAccess.getDataImportRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataImport128); 

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
    // $ANTLR end entryRuleDataImport


    // $ANTLR start ruleDataImport
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:98:1: ruleDataImport : ( ( rule__DataImport__Group__0 ) ) ;
    public final void ruleDataImport() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:102:2: ( ( ( rule__DataImport__Group__0 ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:103:1: ( ( rule__DataImport__Group__0 ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:103:1: ( ( rule__DataImport__Group__0 ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:104:1: ( rule__DataImport__Group__0 )
            {
             before(grammarAccess.getDataImportAccess().getGroup()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:105:1: ( rule__DataImport__Group__0 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:105:2: rule__DataImport__Group__0
            {
            pushFollow(FOLLOW_rule__DataImport__Group__0_in_ruleDataImport154);
            rule__DataImport__Group__0();
            _fsp--;


            }

             after(grammarAccess.getDataImportAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleDataImport


    // $ANTLR start entryRuleLabel
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:117:1: entryRuleLabel : ruleLabel EOF ;
    public final void entryRuleLabel() throws RecognitionException {
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:118:1: ( ruleLabel EOF )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:119:1: ruleLabel EOF
            {
             before(grammarAccess.getLabelRule()); 
            pushFollow(FOLLOW_ruleLabel_in_entryRuleLabel181);
            ruleLabel();
            _fsp--;

             after(grammarAccess.getLabelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLabel188); 

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
    // $ANTLR end entryRuleLabel


    // $ANTLR start ruleLabel
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:126:1: ruleLabel : ( ( rule__Label__Group__0 ) ) ;
    public final void ruleLabel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:130:2: ( ( ( rule__Label__Group__0 ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:131:1: ( ( rule__Label__Group__0 ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:131:1: ( ( rule__Label__Group__0 ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:132:1: ( rule__Label__Group__0 )
            {
             before(grammarAccess.getLabelAccess().getGroup()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:133:1: ( rule__Label__Group__0 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:133:2: rule__Label__Group__0
            {
            pushFollow(FOLLOW_rule__Label__Group__0_in_ruleLabel214);
            rule__Label__Group__0();
            _fsp--;


            }

             after(grammarAccess.getLabelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleLabel


    // $ANTLR start entryRulePathTail
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:145:1: entryRulePathTail : rulePathTail EOF ;
    public final void entryRulePathTail() throws RecognitionException {
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:146:1: ( rulePathTail EOF )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:147:1: rulePathTail EOF
            {
             before(grammarAccess.getPathTailRule()); 
            pushFollow(FOLLOW_rulePathTail_in_entryRulePathTail241);
            rulePathTail();
            _fsp--;

             after(grammarAccess.getPathTailRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePathTail248); 

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
    // $ANTLR end entryRulePathTail


    // $ANTLR start rulePathTail
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:154:1: rulePathTail : ( ( rule__PathTail__Group__0 ) ) ;
    public final void rulePathTail() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:158:2: ( ( ( rule__PathTail__Group__0 ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:159:1: ( ( rule__PathTail__Group__0 ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:159:1: ( ( rule__PathTail__Group__0 ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:160:1: ( rule__PathTail__Group__0 )
            {
             before(grammarAccess.getPathTailAccess().getGroup()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:161:1: ( rule__PathTail__Group__0 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:161:2: rule__PathTail__Group__0
            {
            pushFollow(FOLLOW_rule__PathTail__Group__0_in_rulePathTail274);
            rule__PathTail__Group__0();
            _fsp--;


            }

             after(grammarAccess.getPathTailAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rulePathTail


    // $ANTLR start entryRuleDeclaration
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:173:1: entryRuleDeclaration : ruleDeclaration EOF ;
    public final void entryRuleDeclaration() throws RecognitionException {
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:174:1: ( ruleDeclaration EOF )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:175:1: ruleDeclaration EOF
            {
             before(grammarAccess.getDeclarationRule()); 
            pushFollow(FOLLOW_ruleDeclaration_in_entryRuleDeclaration301);
            ruleDeclaration();
            _fsp--;

             after(grammarAccess.getDeclarationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeclaration308); 

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
    // $ANTLR end entryRuleDeclaration


    // $ANTLR start ruleDeclaration
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:182:1: ruleDeclaration : ( ( rule__Declaration__Alternatives ) ) ;
    public final void ruleDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:186:2: ( ( ( rule__Declaration__Alternatives ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:187:1: ( ( rule__Declaration__Alternatives ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:187:1: ( ( rule__Declaration__Alternatives ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:188:1: ( rule__Declaration__Alternatives )
            {
             before(grammarAccess.getDeclarationAccess().getAlternatives()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:189:1: ( rule__Declaration__Alternatives )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:189:2: rule__Declaration__Alternatives
            {
            pushFollow(FOLLOW_rule__Declaration__Alternatives_in_ruleDeclaration334);
            rule__Declaration__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getDeclarationAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleDeclaration


    // $ANTLR start entryRuleExternalVariable
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:201:1: entryRuleExternalVariable : ruleExternalVariable EOF ;
    public final void entryRuleExternalVariable() throws RecognitionException {
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:202:1: ( ruleExternalVariable EOF )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:203:1: ruleExternalVariable EOF
            {
             before(grammarAccess.getExternalVariableRule()); 
            pushFollow(FOLLOW_ruleExternalVariable_in_entryRuleExternalVariable361);
            ruleExternalVariable();
            _fsp--;

             after(grammarAccess.getExternalVariableRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExternalVariable368); 

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
    // $ANTLR end entryRuleExternalVariable


    // $ANTLR start ruleExternalVariable
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:210:1: ruleExternalVariable : ( ( rule__ExternalVariable__Group__0 ) ) ;
    public final void ruleExternalVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:214:2: ( ( ( rule__ExternalVariable__Group__0 ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:215:1: ( ( rule__ExternalVariable__Group__0 ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:215:1: ( ( rule__ExternalVariable__Group__0 ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:216:1: ( rule__ExternalVariable__Group__0 )
            {
             before(grammarAccess.getExternalVariableAccess().getGroup()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:217:1: ( rule__ExternalVariable__Group__0 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:217:2: rule__ExternalVariable__Group__0
            {
            pushFollow(FOLLOW_rule__ExternalVariable__Group__0_in_ruleExternalVariable394);
            rule__ExternalVariable__Group__0();
            _fsp--;


            }

             after(grammarAccess.getExternalVariableAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleExternalVariable


    // $ANTLR start entryRuleEnumList
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:229:1: entryRuleEnumList : ruleEnumList EOF ;
    public final void entryRuleEnumList() throws RecognitionException {
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:230:1: ( ruleEnumList EOF )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:231:1: ruleEnumList EOF
            {
             before(grammarAccess.getEnumListRule()); 
            pushFollow(FOLLOW_ruleEnumList_in_entryRuleEnumList421);
            ruleEnumList();
            _fsp--;

             after(grammarAccess.getEnumListRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumList428); 

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
    // $ANTLR end entryRuleEnumList


    // $ANTLR start ruleEnumList
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:238:1: ruleEnumList : ( ( rule__EnumList__Group__0 ) ) ;
    public final void ruleEnumList() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:242:2: ( ( ( rule__EnumList__Group__0 ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:243:1: ( ( rule__EnumList__Group__0 ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:243:1: ( ( rule__EnumList__Group__0 ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:244:1: ( rule__EnumList__Group__0 )
            {
             before(grammarAccess.getEnumListAccess().getGroup()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:245:1: ( rule__EnumList__Group__0 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:245:2: rule__EnumList__Group__0
            {
            pushFollow(FOLLOW_rule__EnumList__Group__0_in_ruleEnumList454);
            rule__EnumList__Group__0();
            _fsp--;


            }

             after(grammarAccess.getEnumListAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleEnumList


    // $ANTLR start entryRuleDataStore
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:257:1: entryRuleDataStore : ruleDataStore EOF ;
    public final void entryRuleDataStore() throws RecognitionException {
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:258:1: ( ruleDataStore EOF )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:259:1: ruleDataStore EOF
            {
             before(grammarAccess.getDataStoreRule()); 
            pushFollow(FOLLOW_ruleDataStore_in_entryRuleDataStore481);
            ruleDataStore();
            _fsp--;

             after(grammarAccess.getDataStoreRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataStore488); 

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
    // $ANTLR end entryRuleDataStore


    // $ANTLR start ruleDataStore
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:266:1: ruleDataStore : ( ( rule__DataStore__Group__0 ) ) ;
    public final void ruleDataStore() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:270:2: ( ( ( rule__DataStore__Group__0 ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:271:1: ( ( rule__DataStore__Group__0 ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:271:1: ( ( rule__DataStore__Group__0 ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:272:1: ( rule__DataStore__Group__0 )
            {
             before(grammarAccess.getDataStoreAccess().getGroup()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:273:1: ( rule__DataStore__Group__0 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:273:2: rule__DataStore__Group__0
            {
            pushFollow(FOLLOW_rule__DataStore__Group__0_in_ruleDataStore514);
            rule__DataStore__Group__0();
            _fsp--;


            }

             after(grammarAccess.getDataStoreAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleDataStore


    // $ANTLR start entryRuleGroupElement
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:285:1: entryRuleGroupElement : ruleGroupElement EOF ;
    public final void entryRuleGroupElement() throws RecognitionException {
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:286:1: ( ruleGroupElement EOF )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:287:1: ruleGroupElement EOF
            {
             before(grammarAccess.getGroupElementRule()); 
            pushFollow(FOLLOW_ruleGroupElement_in_entryRuleGroupElement541);
            ruleGroupElement();
            _fsp--;

             after(grammarAccess.getGroupElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGroupElement548); 

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
    // $ANTLR end entryRuleGroupElement


    // $ANTLR start ruleGroupElement
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:294:1: ruleGroupElement : ( ( rule__GroupElement__Alternatives ) ) ;
    public final void ruleGroupElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:298:2: ( ( ( rule__GroupElement__Alternatives ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:299:1: ( ( rule__GroupElement__Alternatives ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:299:1: ( ( rule__GroupElement__Alternatives ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:300:1: ( rule__GroupElement__Alternatives )
            {
             before(grammarAccess.getGroupElementAccess().getAlternatives()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:301:1: ( rule__GroupElement__Alternatives )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:301:2: rule__GroupElement__Alternatives
            {
            pushFollow(FOLLOW_rule__GroupElement__Alternatives_in_ruleGroupElement574);
            rule__GroupElement__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getGroupElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleGroupElement


    // $ANTLR start entryRuleField
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:313:1: entryRuleField : ruleField EOF ;
    public final void entryRuleField() throws RecognitionException {
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:314:1: ( ruleField EOF )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:315:1: ruleField EOF
            {
             before(grammarAccess.getFieldRule()); 
            pushFollow(FOLLOW_ruleField_in_entryRuleField601);
            ruleField();
            _fsp--;

             after(grammarAccess.getFieldRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleField608); 

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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:322:1: ruleField : ( ( rule__Field__Group__0 ) ) ;
    public final void ruleField() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:326:2: ( ( ( rule__Field__Group__0 ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:327:1: ( ( rule__Field__Group__0 ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:327:1: ( ( rule__Field__Group__0 ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:328:1: ( rule__Field__Group__0 )
            {
             before(grammarAccess.getFieldAccess().getGroup()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:329:1: ( rule__Field__Group__0 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:329:2: rule__Field__Group__0
            {
            pushFollow(FOLLOW_rule__Field__Group__0_in_ruleField634);
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


    // $ANTLR start entryRuleFieldGroup
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:341:1: entryRuleFieldGroup : ruleFieldGroup EOF ;
    public final void entryRuleFieldGroup() throws RecognitionException {
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:342:1: ( ruleFieldGroup EOF )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:343:1: ruleFieldGroup EOF
            {
             before(grammarAccess.getFieldGroupRule()); 
            pushFollow(FOLLOW_ruleFieldGroup_in_entryRuleFieldGroup661);
            ruleFieldGroup();
            _fsp--;

             after(grammarAccess.getFieldGroupRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFieldGroup668); 

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
    // $ANTLR end entryRuleFieldGroup


    // $ANTLR start ruleFieldGroup
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:350:1: ruleFieldGroup : ( ( rule__FieldGroup__Group__0 ) ) ;
    public final void ruleFieldGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:354:2: ( ( ( rule__FieldGroup__Group__0 ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:355:1: ( ( rule__FieldGroup__Group__0 ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:355:1: ( ( rule__FieldGroup__Group__0 ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:356:1: ( rule__FieldGroup__Group__0 )
            {
             before(grammarAccess.getFieldGroupAccess().getGroup()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:357:1: ( rule__FieldGroup__Group__0 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:357:2: rule__FieldGroup__Group__0
            {
            pushFollow(FOLLOW_rule__FieldGroup__Group__0_in_ruleFieldGroup694);
            rule__FieldGroup__Group__0();
            _fsp--;


            }

             after(grammarAccess.getFieldGroupAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleFieldGroup


    // $ANTLR start entryRuleAttribute
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:369:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:370:1: ( ruleAttribute EOF )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:371:1: ruleAttribute EOF
            {
             before(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute721);
            ruleAttribute();
            _fsp--;

             after(grammarAccess.getAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute728); 

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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:378:1: ruleAttribute : ( ( rule__Attribute__Alternatives ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:382:2: ( ( ( rule__Attribute__Alternatives ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:383:1: ( ( rule__Attribute__Alternatives ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:383:1: ( ( rule__Attribute__Alternatives ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:384:1: ( rule__Attribute__Alternatives )
            {
             before(grammarAccess.getAttributeAccess().getAlternatives()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:385:1: ( rule__Attribute__Alternatives )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:385:2: rule__Attribute__Alternatives
            {
            pushFollow(FOLLOW_rule__Attribute__Alternatives_in_ruleAttribute754);
            rule__Attribute__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getAttributeAccess().getAlternatives()); 

            }


            }

        }
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


    // $ANTLR start entryRuleEnumFieldAttribute
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:397:1: entryRuleEnumFieldAttribute : ruleEnumFieldAttribute EOF ;
    public final void entryRuleEnumFieldAttribute() throws RecognitionException {
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:398:1: ( ruleEnumFieldAttribute EOF )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:399:1: ruleEnumFieldAttribute EOF
            {
             before(grammarAccess.getEnumFieldAttributeRule()); 
            pushFollow(FOLLOW_ruleEnumFieldAttribute_in_entryRuleEnumFieldAttribute781);
            ruleEnumFieldAttribute();
            _fsp--;

             after(grammarAccess.getEnumFieldAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumFieldAttribute788); 

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
    // $ANTLR end entryRuleEnumFieldAttribute


    // $ANTLR start ruleEnumFieldAttribute
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:406:1: ruleEnumFieldAttribute : ( ( rule__EnumFieldAttribute__Alternatives ) ) ;
    public final void ruleEnumFieldAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:410:2: ( ( ( rule__EnumFieldAttribute__Alternatives ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:411:1: ( ( rule__EnumFieldAttribute__Alternatives ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:411:1: ( ( rule__EnumFieldAttribute__Alternatives ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:412:1: ( rule__EnumFieldAttribute__Alternatives )
            {
             before(grammarAccess.getEnumFieldAttributeAccess().getAlternatives()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:413:1: ( rule__EnumFieldAttribute__Alternatives )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:413:2: rule__EnumFieldAttribute__Alternatives
            {
            pushFollow(FOLLOW_rule__EnumFieldAttribute__Alternatives_in_ruleEnumFieldAttribute814);
            rule__EnumFieldAttribute__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getEnumFieldAttributeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleEnumFieldAttribute


    // $ANTLR start entryRuleNormalAttribute
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:425:1: entryRuleNormalAttribute : ruleNormalAttribute EOF ;
    public final void entryRuleNormalAttribute() throws RecognitionException {
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:426:1: ( ruleNormalAttribute EOF )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:427:1: ruleNormalAttribute EOF
            {
             before(grammarAccess.getNormalAttributeRule()); 
            pushFollow(FOLLOW_ruleNormalAttribute_in_entryRuleNormalAttribute841);
            ruleNormalAttribute();
            _fsp--;

             after(grammarAccess.getNormalAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNormalAttribute848); 

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
    // $ANTLR end entryRuleNormalAttribute


    // $ANTLR start ruleNormalAttribute
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:434:1: ruleNormalAttribute : ( ( rule__NormalAttribute__Group__0 ) ) ;
    public final void ruleNormalAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:438:2: ( ( ( rule__NormalAttribute__Group__0 ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:439:1: ( ( rule__NormalAttribute__Group__0 ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:439:1: ( ( rule__NormalAttribute__Group__0 ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:440:1: ( rule__NormalAttribute__Group__0 )
            {
             before(grammarAccess.getNormalAttributeAccess().getGroup()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:441:1: ( rule__NormalAttribute__Group__0 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:441:2: rule__NormalAttribute__Group__0
            {
            pushFollow(FOLLOW_rule__NormalAttribute__Group__0_in_ruleNormalAttribute874);
            rule__NormalAttribute__Group__0();
            _fsp--;


            }

             after(grammarAccess.getNormalAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleNormalAttribute


    // $ANTLR start entryRuleAttributeClassExpression
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:453:1: entryRuleAttributeClassExpression : ruleAttributeClassExpression EOF ;
    public final void entryRuleAttributeClassExpression() throws RecognitionException {
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:454:1: ( ruleAttributeClassExpression EOF )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:455:1: ruleAttributeClassExpression EOF
            {
             before(grammarAccess.getAttributeClassExpressionRule()); 
            pushFollow(FOLLOW_ruleAttributeClassExpression_in_entryRuleAttributeClassExpression901);
            ruleAttributeClassExpression();
            _fsp--;

             after(grammarAccess.getAttributeClassExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributeClassExpression908); 

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
    // $ANTLR end entryRuleAttributeClassExpression


    // $ANTLR start ruleAttributeClassExpression
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:462:1: ruleAttributeClassExpression : ( ( rule__AttributeClassExpression__Group__0 ) ) ;
    public final void ruleAttributeClassExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:466:2: ( ( ( rule__AttributeClassExpression__Group__0 ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:467:1: ( ( rule__AttributeClassExpression__Group__0 ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:467:1: ( ( rule__AttributeClassExpression__Group__0 ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:468:1: ( rule__AttributeClassExpression__Group__0 )
            {
             before(grammarAccess.getAttributeClassExpressionAccess().getGroup()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:469:1: ( rule__AttributeClassExpression__Group__0 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:469:2: rule__AttributeClassExpression__Group__0
            {
            pushFollow(FOLLOW_rule__AttributeClassExpression__Group__0_in_ruleAttributeClassExpression934);
            rule__AttributeClassExpression__Group__0();
            _fsp--;


            }

             after(grammarAccess.getAttributeClassExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleAttributeClassExpression


    // $ANTLR start entryRuleRestrictionAttribute
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:481:1: entryRuleRestrictionAttribute : ruleRestrictionAttribute EOF ;
    public final void entryRuleRestrictionAttribute() throws RecognitionException {
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:482:1: ( ruleRestrictionAttribute EOF )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:483:1: ruleRestrictionAttribute EOF
            {
             before(grammarAccess.getRestrictionAttributeRule()); 
            pushFollow(FOLLOW_ruleRestrictionAttribute_in_entryRuleRestrictionAttribute961);
            ruleRestrictionAttribute();
            _fsp--;

             after(grammarAccess.getRestrictionAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRestrictionAttribute968); 

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
    // $ANTLR end entryRuleRestrictionAttribute


    // $ANTLR start ruleRestrictionAttribute
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:490:1: ruleRestrictionAttribute : ( ( rule__RestrictionAttribute__Group__0 ) ) ;
    public final void ruleRestrictionAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:494:2: ( ( ( rule__RestrictionAttribute__Group__0 ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:495:1: ( ( rule__RestrictionAttribute__Group__0 ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:495:1: ( ( rule__RestrictionAttribute__Group__0 ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:496:1: ( rule__RestrictionAttribute__Group__0 )
            {
             before(grammarAccess.getRestrictionAttributeAccess().getGroup()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:497:1: ( rule__RestrictionAttribute__Group__0 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:497:2: rule__RestrictionAttribute__Group__0
            {
            pushFollow(FOLLOW_rule__RestrictionAttribute__Group__0_in_ruleRestrictionAttribute994);
            rule__RestrictionAttribute__Group__0();
            _fsp--;


            }

             after(grammarAccess.getRestrictionAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleRestrictionAttribute


    // $ANTLR start entryRuleRestrictionGroupAttribute
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:509:1: entryRuleRestrictionGroupAttribute : ruleRestrictionGroupAttribute EOF ;
    public final void entryRuleRestrictionGroupAttribute() throws RecognitionException {
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:510:1: ( ruleRestrictionGroupAttribute EOF )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:511:1: ruleRestrictionGroupAttribute EOF
            {
             before(grammarAccess.getRestrictionGroupAttributeRule()); 
            pushFollow(FOLLOW_ruleRestrictionGroupAttribute_in_entryRuleRestrictionGroupAttribute1021);
            ruleRestrictionGroupAttribute();
            _fsp--;

             after(grammarAccess.getRestrictionGroupAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRestrictionGroupAttribute1028); 

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
    // $ANTLR end entryRuleRestrictionGroupAttribute


    // $ANTLR start ruleRestrictionGroupAttribute
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:518:1: ruleRestrictionGroupAttribute : ( ( rule__RestrictionGroupAttribute__Group__0 ) ) ;
    public final void ruleRestrictionGroupAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:522:2: ( ( ( rule__RestrictionGroupAttribute__Group__0 ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:523:1: ( ( rule__RestrictionGroupAttribute__Group__0 ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:523:1: ( ( rule__RestrictionGroupAttribute__Group__0 ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:524:1: ( rule__RestrictionGroupAttribute__Group__0 )
            {
             before(grammarAccess.getRestrictionGroupAttributeAccess().getGroup()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:525:1: ( rule__RestrictionGroupAttribute__Group__0 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:525:2: rule__RestrictionGroupAttribute__Group__0
            {
            pushFollow(FOLLOW_rule__RestrictionGroupAttribute__Group__0_in_ruleRestrictionGroupAttribute1054);
            rule__RestrictionGroupAttribute__Group__0();
            _fsp--;


            }

             after(grammarAccess.getRestrictionGroupAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleRestrictionGroupAttribute


    // $ANTLR start entryRuleRestrictionRule
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:537:1: entryRuleRestrictionRule : ruleRestrictionRule EOF ;
    public final void entryRuleRestrictionRule() throws RecognitionException {
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:538:1: ( ruleRestrictionRule EOF )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:539:1: ruleRestrictionRule EOF
            {
             before(grammarAccess.getRestrictionRuleRule()); 
            pushFollow(FOLLOW_ruleRestrictionRule_in_entryRuleRestrictionRule1081);
            ruleRestrictionRule();
            _fsp--;

             after(grammarAccess.getRestrictionRuleRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRestrictionRule1088); 

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
    // $ANTLR end entryRuleRestrictionRule


    // $ANTLR start ruleRestrictionRule
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:546:1: ruleRestrictionRule : ( ( rule__RestrictionRule__Group__0 ) ) ;
    public final void ruleRestrictionRule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:550:2: ( ( ( rule__RestrictionRule__Group__0 ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:551:1: ( ( rule__RestrictionRule__Group__0 ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:551:1: ( ( rule__RestrictionRule__Group__0 ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:552:1: ( rule__RestrictionRule__Group__0 )
            {
             before(grammarAccess.getRestrictionRuleAccess().getGroup()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:553:1: ( rule__RestrictionRule__Group__0 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:553:2: rule__RestrictionRule__Group__0
            {
            pushFollow(FOLLOW_rule__RestrictionRule__Group__0_in_ruleRestrictionRule1114);
            rule__RestrictionRule__Group__0();
            _fsp--;


            }

             after(grammarAccess.getRestrictionRuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleRestrictionRule


    // $ANTLR start entryRuleReferenceTarget
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:565:1: entryRuleReferenceTarget : ruleReferenceTarget EOF ;
    public final void entryRuleReferenceTarget() throws RecognitionException {
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:566:1: ( ruleReferenceTarget EOF )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:567:1: ruleReferenceTarget EOF
            {
             before(grammarAccess.getReferenceTargetRule()); 
            pushFollow(FOLLOW_ruleReferenceTarget_in_entryRuleReferenceTarget1141);
            ruleReferenceTarget();
            _fsp--;

             after(grammarAccess.getReferenceTargetRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReferenceTarget1148); 

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
    // $ANTLR end entryRuleReferenceTarget


    // $ANTLR start ruleReferenceTarget
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:574:1: ruleReferenceTarget : ( ( rule__ReferenceTarget__Alternatives ) ) ;
    public final void ruleReferenceTarget() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:578:2: ( ( ( rule__ReferenceTarget__Alternatives ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:579:1: ( ( rule__ReferenceTarget__Alternatives ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:579:1: ( ( rule__ReferenceTarget__Alternatives ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:580:1: ( rule__ReferenceTarget__Alternatives )
            {
             before(grammarAccess.getReferenceTargetAccess().getAlternatives()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:581:1: ( rule__ReferenceTarget__Alternatives )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:581:2: rule__ReferenceTarget__Alternatives
            {
            pushFollow(FOLLOW_rule__ReferenceTarget__Alternatives_in_ruleReferenceTarget1174);
            rule__ReferenceTarget__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getReferenceTargetAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleReferenceTarget


    // $ANTLR start entryRuleReference
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:593:1: entryRuleReference : ruleReference EOF ;
    public final void entryRuleReference() throws RecognitionException {
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:594:1: ( ruleReference EOF )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:595:1: ruleReference EOF
            {
             before(grammarAccess.getReferenceRule()); 
            pushFollow(FOLLOW_ruleReference_in_entryRuleReference1201);
            ruleReference();
            _fsp--;

             after(grammarAccess.getReferenceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReference1208); 

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
    // $ANTLR end entryRuleReference


    // $ANTLR start ruleReference
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:602:1: ruleReference : ( ( rule__Reference__RefAssignment ) ) ;
    public final void ruleReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:606:2: ( ( ( rule__Reference__RefAssignment ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:607:1: ( ( rule__Reference__RefAssignment ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:607:1: ( ( rule__Reference__RefAssignment ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:608:1: ( rule__Reference__RefAssignment )
            {
             before(grammarAccess.getReferenceAccess().getRefAssignment()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:609:1: ( rule__Reference__RefAssignment )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:609:2: rule__Reference__RefAssignment
            {
            pushFollow(FOLLOW_rule__Reference__RefAssignment_in_ruleReference1234);
            rule__Reference__RefAssignment();
            _fsp--;


            }

             after(grammarAccess.getReferenceAccess().getRefAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleReference


    // $ANTLR start entryRuleBExpression
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:623:1: entryRuleBExpression : ruleBExpression EOF ;
    public final void entryRuleBExpression() throws RecognitionException {
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:624:1: ( ruleBExpression EOF )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:625:1: ruleBExpression EOF
            {
             before(grammarAccess.getBExpressionRule()); 
            pushFollow(FOLLOW_ruleBExpression_in_entryRuleBExpression1263);
            ruleBExpression();
            _fsp--;

             after(grammarAccess.getBExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBExpression1270); 

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
    // $ANTLR end entryRuleBExpression


    // $ANTLR start ruleBExpression
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:632:1: ruleBExpression : ( ruleBOrExpression ) ;
    public final void ruleBExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:636:2: ( ( ruleBOrExpression ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:637:1: ( ruleBOrExpression )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:637:1: ( ruleBOrExpression )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:638:1: ruleBOrExpression
            {
             before(grammarAccess.getBExpressionAccess().getBOrExpressionParserRuleCall()); 
            pushFollow(FOLLOW_ruleBOrExpression_in_ruleBExpression1296);
            ruleBOrExpression();
            _fsp--;

             after(grammarAccess.getBExpressionAccess().getBOrExpressionParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleBExpression


    // $ANTLR start entryRuleBOrExpression
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:651:1: entryRuleBOrExpression : ruleBOrExpression EOF ;
    public final void entryRuleBOrExpression() throws RecognitionException {
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:652:1: ( ruleBOrExpression EOF )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:653:1: ruleBOrExpression EOF
            {
             before(grammarAccess.getBOrExpressionRule()); 
            pushFollow(FOLLOW_ruleBOrExpression_in_entryRuleBOrExpression1322);
            ruleBOrExpression();
            _fsp--;

             after(grammarAccess.getBOrExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBOrExpression1329); 

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
    // $ANTLR end entryRuleBOrExpression


    // $ANTLR start ruleBOrExpression
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:660:1: ruleBOrExpression : ( ( rule__BOrExpression__Group__0 ) ) ;
    public final void ruleBOrExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:664:2: ( ( ( rule__BOrExpression__Group__0 ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:665:1: ( ( rule__BOrExpression__Group__0 ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:665:1: ( ( rule__BOrExpression__Group__0 ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:666:1: ( rule__BOrExpression__Group__0 )
            {
             before(grammarAccess.getBOrExpressionAccess().getGroup()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:667:1: ( rule__BOrExpression__Group__0 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:667:2: rule__BOrExpression__Group__0
            {
            pushFollow(FOLLOW_rule__BOrExpression__Group__0_in_ruleBOrExpression1355);
            rule__BOrExpression__Group__0();
            _fsp--;


            }

             after(grammarAccess.getBOrExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleBOrExpression


    // $ANTLR start entryRuleBAndExpression
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:679:1: entryRuleBAndExpression : ruleBAndExpression EOF ;
    public final void entryRuleBAndExpression() throws RecognitionException {
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:680:1: ( ruleBAndExpression EOF )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:681:1: ruleBAndExpression EOF
            {
             before(grammarAccess.getBAndExpressionRule()); 
            pushFollow(FOLLOW_ruleBAndExpression_in_entryRuleBAndExpression1382);
            ruleBAndExpression();
            _fsp--;

             after(grammarAccess.getBAndExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBAndExpression1389); 

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
    // $ANTLR end entryRuleBAndExpression


    // $ANTLR start ruleBAndExpression
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:688:1: ruleBAndExpression : ( ( rule__BAndExpression__Group__0 ) ) ;
    public final void ruleBAndExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:692:2: ( ( ( rule__BAndExpression__Group__0 ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:693:1: ( ( rule__BAndExpression__Group__0 ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:693:1: ( ( rule__BAndExpression__Group__0 ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:694:1: ( rule__BAndExpression__Group__0 )
            {
             before(grammarAccess.getBAndExpressionAccess().getGroup()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:695:1: ( rule__BAndExpression__Group__0 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:695:2: rule__BAndExpression__Group__0
            {
            pushFollow(FOLLOW_rule__BAndExpression__Group__0_in_ruleBAndExpression1415);
            rule__BAndExpression__Group__0();
            _fsp--;


            }

             after(grammarAccess.getBAndExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleBAndExpression


    // $ANTLR start entryRuleTerminalBExpression
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:707:1: entryRuleTerminalBExpression : ruleTerminalBExpression EOF ;
    public final void entryRuleTerminalBExpression() throws RecognitionException {
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:708:1: ( ruleTerminalBExpression EOF )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:709:1: ruleTerminalBExpression EOF
            {
             before(grammarAccess.getTerminalBExpressionRule()); 
            pushFollow(FOLLOW_ruleTerminalBExpression_in_entryRuleTerminalBExpression1442);
            ruleTerminalBExpression();
            _fsp--;

             after(grammarAccess.getTerminalBExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTerminalBExpression1449); 

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
    // $ANTLR end entryRuleTerminalBExpression


    // $ANTLR start ruleTerminalBExpression
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:716:1: ruleTerminalBExpression : ( ( rule__TerminalBExpression__Alternatives ) ) ;
    public final void ruleTerminalBExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:720:2: ( ( ( rule__TerminalBExpression__Alternatives ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:721:1: ( ( rule__TerminalBExpression__Alternatives ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:721:1: ( ( rule__TerminalBExpression__Alternatives ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:722:1: ( rule__TerminalBExpression__Alternatives )
            {
             before(grammarAccess.getTerminalBExpressionAccess().getAlternatives()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:723:1: ( rule__TerminalBExpression__Alternatives )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:723:2: rule__TerminalBExpression__Alternatives
            {
            pushFollow(FOLLOW_rule__TerminalBExpression__Alternatives_in_ruleTerminalBExpression1475);
            rule__TerminalBExpression__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getTerminalBExpressionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleTerminalBExpression


    // $ANTLR start entryRuleNegationExpression
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:735:1: entryRuleNegationExpression : ruleNegationExpression EOF ;
    public final void entryRuleNegationExpression() throws RecognitionException {
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:736:1: ( ruleNegationExpression EOF )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:737:1: ruleNegationExpression EOF
            {
             before(grammarAccess.getNegationExpressionRule()); 
            pushFollow(FOLLOW_ruleNegationExpression_in_entryRuleNegationExpression1502);
            ruleNegationExpression();
            _fsp--;

             after(grammarAccess.getNegationExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNegationExpression1509); 

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
    // $ANTLR end entryRuleNegationExpression


    // $ANTLR start ruleNegationExpression
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:744:1: ruleNegationExpression : ( ( rule__NegationExpression__Group__0 ) ) ;
    public final void ruleNegationExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:748:2: ( ( ( rule__NegationExpression__Group__0 ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:749:1: ( ( rule__NegationExpression__Group__0 ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:749:1: ( ( rule__NegationExpression__Group__0 ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:750:1: ( rule__NegationExpression__Group__0 )
            {
             before(grammarAccess.getNegationExpressionAccess().getGroup()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:751:1: ( rule__NegationExpression__Group__0 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:751:2: rule__NegationExpression__Group__0
            {
            pushFollow(FOLLOW_rule__NegationExpression__Group__0_in_ruleNegationExpression1535);
            rule__NegationExpression__Group__0();
            _fsp--;


            }

             after(grammarAccess.getNegationExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleNegationExpression


    // $ANTLR start entryRuleAtomicReferringBExpression
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:763:1: entryRuleAtomicReferringBExpression : ruleAtomicReferringBExpression EOF ;
    public final void entryRuleAtomicReferringBExpression() throws RecognitionException {
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:764:1: ( ruleAtomicReferringBExpression EOF )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:765:1: ruleAtomicReferringBExpression EOF
            {
             before(grammarAccess.getAtomicReferringBExpressionRule()); 
            pushFollow(FOLLOW_ruleAtomicReferringBExpression_in_entryRuleAtomicReferringBExpression1562);
            ruleAtomicReferringBExpression();
            _fsp--;

             after(grammarAccess.getAtomicReferringBExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtomicReferringBExpression1569); 

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
    // $ANTLR end entryRuleAtomicReferringBExpression


    // $ANTLR start ruleAtomicReferringBExpression
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:772:1: ruleAtomicReferringBExpression : ( ( rule__AtomicReferringBExpression__Alternatives ) ) ;
    public final void ruleAtomicReferringBExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:776:2: ( ( ( rule__AtomicReferringBExpression__Alternatives ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:777:1: ( ( rule__AtomicReferringBExpression__Alternatives ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:777:1: ( ( rule__AtomicReferringBExpression__Alternatives ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:778:1: ( rule__AtomicReferringBExpression__Alternatives )
            {
             before(grammarAccess.getAtomicReferringBExpressionAccess().getAlternatives()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:779:1: ( rule__AtomicReferringBExpression__Alternatives )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:779:2: rule__AtomicReferringBExpression__Alternatives
            {
            pushFollow(FOLLOW_rule__AtomicReferringBExpression__Alternatives_in_ruleAtomicReferringBExpression1595);
            rule__AtomicReferringBExpression__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getAtomicReferringBExpressionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleAtomicReferringBExpression


    // $ANTLR start entryRuleBComparison
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:791:1: entryRuleBComparison : ruleBComparison EOF ;
    public final void entryRuleBComparison() throws RecognitionException {
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:792:1: ( ruleBComparison EOF )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:793:1: ruleBComparison EOF
            {
             before(grammarAccess.getBComparisonRule()); 
            pushFollow(FOLLOW_ruleBComparison_in_entryRuleBComparison1622);
            ruleBComparison();
            _fsp--;

             after(grammarAccess.getBComparisonRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBComparison1629); 

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
    // $ANTLR end entryRuleBComparison


    // $ANTLR start ruleBComparison
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:800:1: ruleBComparison : ( ( rule__BComparison__Group__0 ) ) ;
    public final void ruleBComparison() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:804:2: ( ( ( rule__BComparison__Group__0 ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:805:1: ( ( rule__BComparison__Group__0 ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:805:1: ( ( rule__BComparison__Group__0 ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:806:1: ( rule__BComparison__Group__0 )
            {
             before(grammarAccess.getBComparisonAccess().getGroup()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:807:1: ( rule__BComparison__Group__0 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:807:2: rule__BComparison__Group__0
            {
            pushFollow(FOLLOW_rule__BComparison__Group__0_in_ruleBComparison1655);
            rule__BComparison__Group__0();
            _fsp--;


            }

             after(grammarAccess.getBComparisonAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleBComparison


    // $ANTLR start entryRuleEnumComparison
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:819:1: entryRuleEnumComparison : ruleEnumComparison EOF ;
    public final void entryRuleEnumComparison() throws RecognitionException {
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:820:1: ( ruleEnumComparison EOF )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:821:1: ruleEnumComparison EOF
            {
             before(grammarAccess.getEnumComparisonRule()); 
            pushFollow(FOLLOW_ruleEnumComparison_in_entryRuleEnumComparison1682);
            ruleEnumComparison();
            _fsp--;

             after(grammarAccess.getEnumComparisonRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumComparison1689); 

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
    // $ANTLR end entryRuleEnumComparison


    // $ANTLR start ruleEnumComparison
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:828:1: ruleEnumComparison : ( ( rule__EnumComparison__Alternatives ) ) ;
    public final void ruleEnumComparison() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:832:2: ( ( ( rule__EnumComparison__Alternatives ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:833:1: ( ( rule__EnumComparison__Alternatives ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:833:1: ( ( rule__EnumComparison__Alternatives ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:834:1: ( rule__EnumComparison__Alternatives )
            {
             before(grammarAccess.getEnumComparisonAccess().getAlternatives()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:835:1: ( rule__EnumComparison__Alternatives )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:835:2: rule__EnumComparison__Alternatives
            {
            pushFollow(FOLLOW_rule__EnumComparison__Alternatives_in_ruleEnumComparison1715);
            rule__EnumComparison__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getEnumComparisonAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleEnumComparison


    // $ANTLR start entryRuleSingleEnumComparison
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:847:1: entryRuleSingleEnumComparison : ruleSingleEnumComparison EOF ;
    public final void entryRuleSingleEnumComparison() throws RecognitionException {
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:848:1: ( ruleSingleEnumComparison EOF )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:849:1: ruleSingleEnumComparison EOF
            {
             before(grammarAccess.getSingleEnumComparisonRule()); 
            pushFollow(FOLLOW_ruleSingleEnumComparison_in_entryRuleSingleEnumComparison1742);
            ruleSingleEnumComparison();
            _fsp--;

             after(grammarAccess.getSingleEnumComparisonRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSingleEnumComparison1749); 

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
    // $ANTLR end entryRuleSingleEnumComparison


    // $ANTLR start ruleSingleEnumComparison
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:856:1: ruleSingleEnumComparison : ( ( rule__SingleEnumComparison__Group__0 ) ) ;
    public final void ruleSingleEnumComparison() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:860:2: ( ( ( rule__SingleEnumComparison__Group__0 ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:861:1: ( ( rule__SingleEnumComparison__Group__0 ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:861:1: ( ( rule__SingleEnumComparison__Group__0 ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:862:1: ( rule__SingleEnumComparison__Group__0 )
            {
             before(grammarAccess.getSingleEnumComparisonAccess().getGroup()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:863:1: ( rule__SingleEnumComparison__Group__0 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:863:2: rule__SingleEnumComparison__Group__0
            {
            pushFollow(FOLLOW_rule__SingleEnumComparison__Group__0_in_ruleSingleEnumComparison1775);
            rule__SingleEnumComparison__Group__0();
            _fsp--;


            }

             after(grammarAccess.getSingleEnumComparisonAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleSingleEnumComparison


    // $ANTLR start entryRuleMultiEnumComparison
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:875:1: entryRuleMultiEnumComparison : ruleMultiEnumComparison EOF ;
    public final void entryRuleMultiEnumComparison() throws RecognitionException {
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:876:1: ( ruleMultiEnumComparison EOF )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:877:1: ruleMultiEnumComparison EOF
            {
             before(grammarAccess.getMultiEnumComparisonRule()); 
            pushFollow(FOLLOW_ruleMultiEnumComparison_in_entryRuleMultiEnumComparison1802);
            ruleMultiEnumComparison();
            _fsp--;

             after(grammarAccess.getMultiEnumComparisonRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiEnumComparison1809); 

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
    // $ANTLR end entryRuleMultiEnumComparison


    // $ANTLR start ruleMultiEnumComparison
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:884:1: ruleMultiEnumComparison : ( ( rule__MultiEnumComparison__Group__0 ) ) ;
    public final void ruleMultiEnumComparison() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:888:2: ( ( ( rule__MultiEnumComparison__Group__0 ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:889:1: ( ( rule__MultiEnumComparison__Group__0 ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:889:1: ( ( rule__MultiEnumComparison__Group__0 ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:890:1: ( rule__MultiEnumComparison__Group__0 )
            {
             before(grammarAccess.getMultiEnumComparisonAccess().getGroup()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:891:1: ( rule__MultiEnumComparison__Group__0 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:891:2: rule__MultiEnumComparison__Group__0
            {
            pushFollow(FOLLOW_rule__MultiEnumComparison__Group__0_in_ruleMultiEnumComparison1835);
            rule__MultiEnumComparison__Group__0();
            _fsp--;


            }

             after(grammarAccess.getMultiEnumComparisonAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleMultiEnumComparison


    // $ANTLR start entryRuleStringValueComparison
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:903:1: entryRuleStringValueComparison : ruleStringValueComparison EOF ;
    public final void entryRuleStringValueComparison() throws RecognitionException {
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:904:1: ( ruleStringValueComparison EOF )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:905:1: ruleStringValueComparison EOF
            {
             before(grammarAccess.getStringValueComparisonRule()); 
            pushFollow(FOLLOW_ruleStringValueComparison_in_entryRuleStringValueComparison1862);
            ruleStringValueComparison();
            _fsp--;

             after(grammarAccess.getStringValueComparisonRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringValueComparison1869); 

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
    // $ANTLR end entryRuleStringValueComparison


    // $ANTLR start ruleStringValueComparison
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:912:1: ruleStringValueComparison : ( ( rule__StringValueComparison__Group__0 ) ) ;
    public final void ruleStringValueComparison() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:916:2: ( ( ( rule__StringValueComparison__Group__0 ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:917:1: ( ( rule__StringValueComparison__Group__0 ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:917:1: ( ( rule__StringValueComparison__Group__0 ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:918:1: ( rule__StringValueComparison__Group__0 )
            {
             before(grammarAccess.getStringValueComparisonAccess().getGroup()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:919:1: ( rule__StringValueComparison__Group__0 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:919:2: rule__StringValueComparison__Group__0
            {
            pushFollow(FOLLOW_rule__StringValueComparison__Group__0_in_ruleStringValueComparison1895);
            rule__StringValueComparison__Group__0();
            _fsp--;


            }

             after(grammarAccess.getStringValueComparisonAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleStringValueComparison


    // $ANTLR start entryRulePresenceCheck
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:931:1: entryRulePresenceCheck : rulePresenceCheck EOF ;
    public final void entryRulePresenceCheck() throws RecognitionException {
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:932:1: ( rulePresenceCheck EOF )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:933:1: rulePresenceCheck EOF
            {
             before(grammarAccess.getPresenceCheckRule()); 
            pushFollow(FOLLOW_rulePresenceCheck_in_entryRulePresenceCheck1922);
            rulePresenceCheck();
            _fsp--;

             after(grammarAccess.getPresenceCheckRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePresenceCheck1929); 

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
    // $ANTLR end entryRulePresenceCheck


    // $ANTLR start rulePresenceCheck
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:940:1: rulePresenceCheck : ( ( rule__PresenceCheck__Group__0 ) ) ;
    public final void rulePresenceCheck() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:944:2: ( ( ( rule__PresenceCheck__Group__0 ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:945:1: ( ( rule__PresenceCheck__Group__0 ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:945:1: ( ( rule__PresenceCheck__Group__0 ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:946:1: ( rule__PresenceCheck__Group__0 )
            {
             before(grammarAccess.getPresenceCheckAccess().getGroup()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:947:1: ( rule__PresenceCheck__Group__0 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:947:2: rule__PresenceCheck__Group__0
            {
            pushFollow(FOLLOW_rule__PresenceCheck__Group__0_in_rulePresenceCheck1955);
            rule__PresenceCheck__Group__0();
            _fsp--;


            }

             after(grammarAccess.getPresenceCheckAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rulePresenceCheck


    // $ANTLR start entryRuleEnumLiteralsCollection
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:959:1: entryRuleEnumLiteralsCollection : ruleEnumLiteralsCollection EOF ;
    public final void entryRuleEnumLiteralsCollection() throws RecognitionException {
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:960:1: ( ruleEnumLiteralsCollection EOF )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:961:1: ruleEnumLiteralsCollection EOF
            {
             before(grammarAccess.getEnumLiteralsCollectionRule()); 
            pushFollow(FOLLOW_ruleEnumLiteralsCollection_in_entryRuleEnumLiteralsCollection1982);
            ruleEnumLiteralsCollection();
            _fsp--;

             after(grammarAccess.getEnumLiteralsCollectionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumLiteralsCollection1989); 

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
    // $ANTLR end entryRuleEnumLiteralsCollection


    // $ANTLR start ruleEnumLiteralsCollection
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:968:1: ruleEnumLiteralsCollection : ( ( rule__EnumLiteralsCollection__Alternatives ) ) ;
    public final void ruleEnumLiteralsCollection() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:972:2: ( ( ( rule__EnumLiteralsCollection__Alternatives ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:973:1: ( ( rule__EnumLiteralsCollection__Alternatives ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:973:1: ( ( rule__EnumLiteralsCollection__Alternatives ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:974:1: ( rule__EnumLiteralsCollection__Alternatives )
            {
             before(grammarAccess.getEnumLiteralsCollectionAccess().getAlternatives()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:975:1: ( rule__EnumLiteralsCollection__Alternatives )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:975:2: rule__EnumLiteralsCollection__Alternatives
            {
            pushFollow(FOLLOW_rule__EnumLiteralsCollection__Alternatives_in_ruleEnumLiteralsCollection2015);
            rule__EnumLiteralsCollection__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getEnumLiteralsCollectionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleEnumLiteralsCollection


    // $ANTLR start entryRuleDirectEnumLiteralsCollection
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:987:1: entryRuleDirectEnumLiteralsCollection : ruleDirectEnumLiteralsCollection EOF ;
    public final void entryRuleDirectEnumLiteralsCollection() throws RecognitionException {
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:988:1: ( ruleDirectEnumLiteralsCollection EOF )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:989:1: ruleDirectEnumLiteralsCollection EOF
            {
             before(grammarAccess.getDirectEnumLiteralsCollectionRule()); 
            pushFollow(FOLLOW_ruleDirectEnumLiteralsCollection_in_entryRuleDirectEnumLiteralsCollection2042);
            ruleDirectEnumLiteralsCollection();
            _fsp--;

             after(grammarAccess.getDirectEnumLiteralsCollectionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDirectEnumLiteralsCollection2049); 

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
    // $ANTLR end entryRuleDirectEnumLiteralsCollection


    // $ANTLR start ruleDirectEnumLiteralsCollection
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:996:1: ruleDirectEnumLiteralsCollection : ( ( rule__DirectEnumLiteralsCollection__Group__0 ) ) ;
    public final void ruleDirectEnumLiteralsCollection() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1000:2: ( ( ( rule__DirectEnumLiteralsCollection__Group__0 ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1001:1: ( ( rule__DirectEnumLiteralsCollection__Group__0 ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1001:1: ( ( rule__DirectEnumLiteralsCollection__Group__0 ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1002:1: ( rule__DirectEnumLiteralsCollection__Group__0 )
            {
             before(grammarAccess.getDirectEnumLiteralsCollectionAccess().getGroup()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1003:1: ( rule__DirectEnumLiteralsCollection__Group__0 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1003:2: rule__DirectEnumLiteralsCollection__Group__0
            {
            pushFollow(FOLLOW_rule__DirectEnumLiteralsCollection__Group__0_in_ruleDirectEnumLiteralsCollection2075);
            rule__DirectEnumLiteralsCollection__Group__0();
            _fsp--;


            }

             after(grammarAccess.getDirectEnumLiteralsCollectionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleDirectEnumLiteralsCollection


    // $ANTLR start entryRuleEnumListReference
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1015:1: entryRuleEnumListReference : ruleEnumListReference EOF ;
    public final void entryRuleEnumListReference() throws RecognitionException {
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1016:1: ( ruleEnumListReference EOF )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1017:1: ruleEnumListReference EOF
            {
             before(grammarAccess.getEnumListReferenceRule()); 
            pushFollow(FOLLOW_ruleEnumListReference_in_entryRuleEnumListReference2102);
            ruleEnumListReference();
            _fsp--;

             after(grammarAccess.getEnumListReferenceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumListReference2109); 

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
    // $ANTLR end entryRuleEnumListReference


    // $ANTLR start ruleEnumListReference
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1024:1: ruleEnumListReference : ( ( rule__EnumListReference__RefAssignment ) ) ;
    public final void ruleEnumListReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1028:2: ( ( ( rule__EnumListReference__RefAssignment ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1029:1: ( ( rule__EnumListReference__RefAssignment ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1029:1: ( ( rule__EnumListReference__RefAssignment ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1030:1: ( rule__EnumListReference__RefAssignment )
            {
             before(grammarAccess.getEnumListReferenceAccess().getRefAssignment()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1031:1: ( rule__EnumListReference__RefAssignment )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1031:2: rule__EnumListReference__RefAssignment
            {
            pushFollow(FOLLOW_rule__EnumListReference__RefAssignment_in_ruleEnumListReference2135);
            rule__EnumListReference__RefAssignment();
            _fsp--;


            }

             after(grammarAccess.getEnumListReferenceAccess().getRefAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleEnumListReference


    // $ANTLR start ruleAttributeClass
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1044:1: ruleAttributeClass : ( ( rule__AttributeClass__Alternatives ) ) ;
    public final void ruleAttributeClass() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1048:1: ( ( ( rule__AttributeClass__Alternatives ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1049:1: ( ( rule__AttributeClass__Alternatives ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1049:1: ( ( rule__AttributeClass__Alternatives ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1050:1: ( rule__AttributeClass__Alternatives )
            {
             before(grammarAccess.getAttributeClassAccess().getAlternatives()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1051:1: ( rule__AttributeClass__Alternatives )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1051:2: rule__AttributeClass__Alternatives
            {
            pushFollow(FOLLOW_rule__AttributeClass__Alternatives_in_ruleAttributeClass2172);
            rule__AttributeClass__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getAttributeClassAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleAttributeClass


    // $ANTLR start ruleBLiteral
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1063:1: ruleBLiteral : ( ( rule__BLiteral__Alternatives ) ) ;
    public final void ruleBLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1067:1: ( ( ( rule__BLiteral__Alternatives ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1068:1: ( ( rule__BLiteral__Alternatives ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1068:1: ( ( rule__BLiteral__Alternatives ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1069:1: ( rule__BLiteral__Alternatives )
            {
             before(grammarAccess.getBLiteralAccess().getAlternatives()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1070:1: ( rule__BLiteral__Alternatives )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1070:2: rule__BLiteral__Alternatives
            {
            pushFollow(FOLLOW_rule__BLiteral__Alternatives_in_ruleBLiteral2208);
            rule__BLiteral__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getBLiteralAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleBLiteral


    // $ANTLR start ruleEnumMembership
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1082:1: ruleEnumMembership : ( ( rule__EnumMembership__Alternatives ) ) ;
    public final void ruleEnumMembership() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1086:1: ( ( ( rule__EnumMembership__Alternatives ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1087:1: ( ( rule__EnumMembership__Alternatives ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1087:1: ( ( rule__EnumMembership__Alternatives ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1088:1: ( rule__EnumMembership__Alternatives )
            {
             before(grammarAccess.getEnumMembershipAccess().getAlternatives()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1089:1: ( rule__EnumMembership__Alternatives )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1089:2: rule__EnumMembership__Alternatives
            {
            pushFollow(FOLLOW_rule__EnumMembership__Alternatives_in_ruleEnumMembership2244);
            rule__EnumMembership__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getEnumMembershipAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleEnumMembership


    // $ANTLR start rule__Declaration__Alternatives
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1100:1: rule__Declaration__Alternatives : ( ( ruleExternalVariable ) | ( ruleEnumList ) | ( ruleDataStore ) );
    public final void rule__Declaration__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1104:1: ( ( ruleExternalVariable ) | ( ruleEnumList ) | ( ruleDataStore ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt1=1;
                }
                break;
            case 31:
                {
                alt1=2;
                }
                break;
            case 33:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1100:1: rule__Declaration__Alternatives : ( ( ruleExternalVariable ) | ( ruleEnumList ) | ( ruleDataStore ) );", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1105:1: ( ruleExternalVariable )
                    {
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1105:1: ( ruleExternalVariable )
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1106:1: ruleExternalVariable
                    {
                     before(grammarAccess.getDeclarationAccess().getExternalVariableParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleExternalVariable_in_rule__Declaration__Alternatives2279);
                    ruleExternalVariable();
                    _fsp--;

                     after(grammarAccess.getDeclarationAccess().getExternalVariableParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1111:6: ( ruleEnumList )
                    {
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1111:6: ( ruleEnumList )
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1112:1: ruleEnumList
                    {
                     before(grammarAccess.getDeclarationAccess().getEnumListParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleEnumList_in_rule__Declaration__Alternatives2296);
                    ruleEnumList();
                    _fsp--;

                     after(grammarAccess.getDeclarationAccess().getEnumListParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1117:6: ( ruleDataStore )
                    {
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1117:6: ( ruleDataStore )
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1118:1: ruleDataStore
                    {
                     before(grammarAccess.getDeclarationAccess().getDataStoreParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleDataStore_in_rule__Declaration__Alternatives2313);
                    ruleDataStore();
                    _fsp--;

                     after(grammarAccess.getDeclarationAccess().getDataStoreParserRuleCall_2()); 

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
    // $ANTLR end rule__Declaration__Alternatives


    // $ANTLR start rule__GroupElement__Alternatives
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1128:1: rule__GroupElement__Alternatives : ( ( ruleField ) | ( ruleFieldGroup ) );
    public final void rule__GroupElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1132:1: ( ( ruleField ) | ( ruleFieldGroup ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                alt2=1;
            }
            else if ( (LA2_0==35) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1128:1: rule__GroupElement__Alternatives : ( ( ruleField ) | ( ruleFieldGroup ) );", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1133:1: ( ruleField )
                    {
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1133:1: ( ruleField )
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1134:1: ruleField
                    {
                     before(grammarAccess.getGroupElementAccess().getFieldParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleField_in_rule__GroupElement__Alternatives2345);
                    ruleField();
                    _fsp--;

                     after(grammarAccess.getGroupElementAccess().getFieldParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1139:6: ( ruleFieldGroup )
                    {
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1139:6: ( ruleFieldGroup )
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1140:1: ruleFieldGroup
                    {
                     before(grammarAccess.getGroupElementAccess().getFieldGroupParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleFieldGroup_in_rule__GroupElement__Alternatives2362);
                    ruleFieldGroup();
                    _fsp--;

                     after(grammarAccess.getGroupElementAccess().getFieldGroupParserRuleCall_1()); 

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
    // $ANTLR end rule__GroupElement__Alternatives


    // $ANTLR start rule__Attribute__Alternatives
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1150:1: rule__Attribute__Alternatives : ( ( ruleNormalAttribute ) | ( ruleEnumFieldAttribute ) );
    public final void rule__Attribute__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1154:1: ( ( ruleNormalAttribute ) | ( ruleEnumFieldAttribute ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=11 && LA3_0<=15)) ) {
                alt3=1;
            }
            else if ( ((LA3_0>=41 && LA3_0<=42)) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1150:1: rule__Attribute__Alternatives : ( ( ruleNormalAttribute ) | ( ruleEnumFieldAttribute ) );", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1155:1: ( ruleNormalAttribute )
                    {
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1155:1: ( ruleNormalAttribute )
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1156:1: ruleNormalAttribute
                    {
                     before(grammarAccess.getAttributeAccess().getNormalAttributeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleNormalAttribute_in_rule__Attribute__Alternatives2394);
                    ruleNormalAttribute();
                    _fsp--;

                     after(grammarAccess.getAttributeAccess().getNormalAttributeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1161:6: ( ruleEnumFieldAttribute )
                    {
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1161:6: ( ruleEnumFieldAttribute )
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1162:1: ruleEnumFieldAttribute
                    {
                     before(grammarAccess.getAttributeAccess().getEnumFieldAttributeParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleEnumFieldAttribute_in_rule__Attribute__Alternatives2411);
                    ruleEnumFieldAttribute();
                    _fsp--;

                     after(grammarAccess.getAttributeAccess().getEnumFieldAttributeParserRuleCall_1()); 

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
    // $ANTLR end rule__Attribute__Alternatives


    // $ANTLR start rule__EnumFieldAttribute__Alternatives
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1172:1: rule__EnumFieldAttribute__Alternatives : ( ( ruleRestrictionAttribute ) | ( ruleRestrictionGroupAttribute ) );
    public final void rule__EnumFieldAttribute__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1176:1: ( ( ruleRestrictionAttribute ) | ( ruleRestrictionGroupAttribute ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==41) ) {
                alt4=1;
            }
            else if ( (LA4_0==42) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1172:1: rule__EnumFieldAttribute__Alternatives : ( ( ruleRestrictionAttribute ) | ( ruleRestrictionGroupAttribute ) );", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1177:1: ( ruleRestrictionAttribute )
                    {
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1177:1: ( ruleRestrictionAttribute )
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1178:1: ruleRestrictionAttribute
                    {
                     before(grammarAccess.getEnumFieldAttributeAccess().getRestrictionAttributeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleRestrictionAttribute_in_rule__EnumFieldAttribute__Alternatives2443);
                    ruleRestrictionAttribute();
                    _fsp--;

                     after(grammarAccess.getEnumFieldAttributeAccess().getRestrictionAttributeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1183:6: ( ruleRestrictionGroupAttribute )
                    {
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1183:6: ( ruleRestrictionGroupAttribute )
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1184:1: ruleRestrictionGroupAttribute
                    {
                     before(grammarAccess.getEnumFieldAttributeAccess().getRestrictionGroupAttributeParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleRestrictionGroupAttribute_in_rule__EnumFieldAttribute__Alternatives2460);
                    ruleRestrictionGroupAttribute();
                    _fsp--;

                     after(grammarAccess.getEnumFieldAttributeAccess().getRestrictionGroupAttributeParserRuleCall_1()); 

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
    // $ANTLR end rule__EnumFieldAttribute__Alternatives


    // $ANTLR start rule__ReferenceTarget__Alternatives
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1194:1: rule__ReferenceTarget__Alternatives : ( ( ruleField ) | ( ruleExternalVariable ) );
    public final void rule__ReferenceTarget__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1198:1: ( ( ruleField ) | ( ruleExternalVariable ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                alt5=1;
            }
            else if ( (LA5_0==29) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1194:1: rule__ReferenceTarget__Alternatives : ( ( ruleField ) | ( ruleExternalVariable ) );", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1199:1: ( ruleField )
                    {
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1199:1: ( ruleField )
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1200:1: ruleField
                    {
                     before(grammarAccess.getReferenceTargetAccess().getFieldParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleField_in_rule__ReferenceTarget__Alternatives2492);
                    ruleField();
                    _fsp--;

                     after(grammarAccess.getReferenceTargetAccess().getFieldParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1205:6: ( ruleExternalVariable )
                    {
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1205:6: ( ruleExternalVariable )
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1206:1: ruleExternalVariable
                    {
                     before(grammarAccess.getReferenceTargetAccess().getExternalVariableParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleExternalVariable_in_rule__ReferenceTarget__Alternatives2509);
                    ruleExternalVariable();
                    _fsp--;

                     after(grammarAccess.getReferenceTargetAccess().getExternalVariableParserRuleCall_1()); 

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
    // $ANTLR end rule__ReferenceTarget__Alternatives


    // $ANTLR start rule__TerminalBExpression__Alternatives
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1217:1: rule__TerminalBExpression__Alternatives : ( ( ruleAtomicReferringBExpression ) | ( ruleNegationExpression ) | ( ( rule__TerminalBExpression__Group_2__0 ) ) );
    public final void rule__TerminalBExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1221:1: ( ( ruleAtomicReferringBExpression ) | ( ruleNegationExpression ) | ( ( rule__TerminalBExpression__Group_2__0 ) ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt6=1;
                }
                break;
            case 47:
                {
                alt6=2;
                }
                break;
            case 27:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1217:1: rule__TerminalBExpression__Alternatives : ( ( ruleAtomicReferringBExpression ) | ( ruleNegationExpression ) | ( ( rule__TerminalBExpression__Group_2__0 ) ) );", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1222:1: ( ruleAtomicReferringBExpression )
                    {
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1222:1: ( ruleAtomicReferringBExpression )
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1223:1: ruleAtomicReferringBExpression
                    {
                     before(grammarAccess.getTerminalBExpressionAccess().getAtomicReferringBExpressionParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleAtomicReferringBExpression_in_rule__TerminalBExpression__Alternatives2542);
                    ruleAtomicReferringBExpression();
                    _fsp--;

                     after(grammarAccess.getTerminalBExpressionAccess().getAtomicReferringBExpressionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1228:6: ( ruleNegationExpression )
                    {
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1228:6: ( ruleNegationExpression )
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1229:1: ruleNegationExpression
                    {
                     before(grammarAccess.getTerminalBExpressionAccess().getNegationExpressionParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleNegationExpression_in_rule__TerminalBExpression__Alternatives2559);
                    ruleNegationExpression();
                    _fsp--;

                     after(grammarAccess.getTerminalBExpressionAccess().getNegationExpressionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1234:6: ( ( rule__TerminalBExpression__Group_2__0 ) )
                    {
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1234:6: ( ( rule__TerminalBExpression__Group_2__0 ) )
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1235:1: ( rule__TerminalBExpression__Group_2__0 )
                    {
                     before(grammarAccess.getTerminalBExpressionAccess().getGroup_2()); 
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1236:1: ( rule__TerminalBExpression__Group_2__0 )
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1236:2: rule__TerminalBExpression__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__TerminalBExpression__Group_2__0_in_rule__TerminalBExpression__Alternatives2576);
                    rule__TerminalBExpression__Group_2__0();
                    _fsp--;


                    }

                     after(grammarAccess.getTerminalBExpressionAccess().getGroup_2()); 

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
    // $ANTLR end rule__TerminalBExpression__Alternatives


    // $ANTLR start rule__AtomicReferringBExpression__Alternatives
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1245:1: rule__AtomicReferringBExpression__Alternatives : ( ( ruleBComparison ) | ( ruleEnumComparison ) | ( ruleStringValueComparison ) | ( rulePresenceCheck ) );
    public final void rule__AtomicReferringBExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1249:1: ( ( ruleBComparison ) | ( ruleEnumComparison ) | ( ruleStringValueComparison ) | ( rulePresenceCheck ) )
            int alt7=4;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case 50:
                    {
                    alt7=4;
                    }
                    break;
                case 18:
                case 19:
                case 22:
                    {
                    alt7=2;
                    }
                    break;
                case 49:
                    {
                    alt7=3;
                    }
                    break;
                case EOF:
                case RULE_ID:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                case 27:
                case 28:
                case 35:
                case 37:
                case 41:
                case 42:
                case 44:
                case 45:
                case 46:
                case 48:
                    {
                    alt7=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("1245:1: rule__AtomicReferringBExpression__Alternatives : ( ( ruleBComparison ) | ( ruleEnumComparison ) | ( ruleStringValueComparison ) | ( rulePresenceCheck ) );", 7, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1245:1: rule__AtomicReferringBExpression__Alternatives : ( ( ruleBComparison ) | ( ruleEnumComparison ) | ( ruleStringValueComparison ) | ( rulePresenceCheck ) );", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1250:1: ( ruleBComparison )
                    {
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1250:1: ( ruleBComparison )
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1251:1: ruleBComparison
                    {
                     before(grammarAccess.getAtomicReferringBExpressionAccess().getBComparisonParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleBComparison_in_rule__AtomicReferringBExpression__Alternatives2609);
                    ruleBComparison();
                    _fsp--;

                     after(grammarAccess.getAtomicReferringBExpressionAccess().getBComparisonParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1256:6: ( ruleEnumComparison )
                    {
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1256:6: ( ruleEnumComparison )
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1257:1: ruleEnumComparison
                    {
                     before(grammarAccess.getAtomicReferringBExpressionAccess().getEnumComparisonParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleEnumComparison_in_rule__AtomicReferringBExpression__Alternatives2626);
                    ruleEnumComparison();
                    _fsp--;

                     after(grammarAccess.getAtomicReferringBExpressionAccess().getEnumComparisonParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1262:6: ( ruleStringValueComparison )
                    {
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1262:6: ( ruleStringValueComparison )
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1263:1: ruleStringValueComparison
                    {
                     before(grammarAccess.getAtomicReferringBExpressionAccess().getStringValueComparisonParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleStringValueComparison_in_rule__AtomicReferringBExpression__Alternatives2643);
                    ruleStringValueComparison();
                    _fsp--;

                     after(grammarAccess.getAtomicReferringBExpressionAccess().getStringValueComparisonParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1268:6: ( rulePresenceCheck )
                    {
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1268:6: ( rulePresenceCheck )
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1269:1: rulePresenceCheck
                    {
                     before(grammarAccess.getAtomicReferringBExpressionAccess().getPresenceCheckParserRuleCall_3()); 
                    pushFollow(FOLLOW_rulePresenceCheck_in_rule__AtomicReferringBExpression__Alternatives2660);
                    rulePresenceCheck();
                    _fsp--;

                     after(grammarAccess.getAtomicReferringBExpressionAccess().getPresenceCheckParserRuleCall_3()); 

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
    // $ANTLR end rule__AtomicReferringBExpression__Alternatives


    // $ANTLR start rule__EnumComparison__Alternatives
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1279:1: rule__EnumComparison__Alternatives : ( ( ruleSingleEnumComparison ) | ( ruleMultiEnumComparison ) );
    public final void rule__EnumComparison__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1283:1: ( ( ruleSingleEnumComparison ) | ( ruleMultiEnumComparison ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                int LA8_1 = input.LA(2);

                if ( ((LA8_1>=18 && LA8_1<=19)) ) {
                    alt8=2;
                }
                else if ( (LA8_1==22) ) {
                    alt8=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1279:1: rule__EnumComparison__Alternatives : ( ( ruleSingleEnumComparison ) | ( ruleMultiEnumComparison ) );", 8, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1279:1: rule__EnumComparison__Alternatives : ( ( ruleSingleEnumComparison ) | ( ruleMultiEnumComparison ) );", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1284:1: ( ruleSingleEnumComparison )
                    {
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1284:1: ( ruleSingleEnumComparison )
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1285:1: ruleSingleEnumComparison
                    {
                     before(grammarAccess.getEnumComparisonAccess().getSingleEnumComparisonParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleSingleEnumComparison_in_rule__EnumComparison__Alternatives2692);
                    ruleSingleEnumComparison();
                    _fsp--;

                     after(grammarAccess.getEnumComparisonAccess().getSingleEnumComparisonParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1290:6: ( ruleMultiEnumComparison )
                    {
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1290:6: ( ruleMultiEnumComparison )
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1291:1: ruleMultiEnumComparison
                    {
                     before(grammarAccess.getEnumComparisonAccess().getMultiEnumComparisonParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleMultiEnumComparison_in_rule__EnumComparison__Alternatives2709);
                    ruleMultiEnumComparison();
                    _fsp--;

                     after(grammarAccess.getEnumComparisonAccess().getMultiEnumComparisonParserRuleCall_1()); 

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
    // $ANTLR end rule__EnumComparison__Alternatives


    // $ANTLR start rule__EnumLiteralsCollection__Alternatives
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1301:1: rule__EnumLiteralsCollection__Alternatives : ( ( ruleDirectEnumLiteralsCollection ) | ( ruleEnumListReference ) );
    public final void rule__EnumLiteralsCollection__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1305:1: ( ( ruleDirectEnumLiteralsCollection ) | ( ruleEnumListReference ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==27) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_ID) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1301:1: rule__EnumLiteralsCollection__Alternatives : ( ( ruleDirectEnumLiteralsCollection ) | ( ruleEnumListReference ) );", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1306:1: ( ruleDirectEnumLiteralsCollection )
                    {
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1306:1: ( ruleDirectEnumLiteralsCollection )
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1307:1: ruleDirectEnumLiteralsCollection
                    {
                     before(grammarAccess.getEnumLiteralsCollectionAccess().getDirectEnumLiteralsCollectionParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleDirectEnumLiteralsCollection_in_rule__EnumLiteralsCollection__Alternatives2741);
                    ruleDirectEnumLiteralsCollection();
                    _fsp--;

                     after(grammarAccess.getEnumLiteralsCollectionAccess().getDirectEnumLiteralsCollectionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1312:6: ( ruleEnumListReference )
                    {
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1312:6: ( ruleEnumListReference )
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1313:1: ruleEnumListReference
                    {
                     before(grammarAccess.getEnumLiteralsCollectionAccess().getEnumListReferenceParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleEnumListReference_in_rule__EnumLiteralsCollection__Alternatives2758);
                    ruleEnumListReference();
                    _fsp--;

                     after(grammarAccess.getEnumLiteralsCollectionAccess().getEnumListReferenceParserRuleCall_1()); 

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
    // $ANTLR end rule__EnumLiteralsCollection__Alternatives


    // $ANTLR start rule__AttributeClass__Alternatives
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1323:1: rule__AttributeClass__Alternatives : ( ( ( 'display' ) ) | ( ( 'required' ) ) | ( ( 'readonly' ) ) | ( ( 'calculated' ) ) | ( ( 'doubleAsterisk' ) ) );
    public final void rule__AttributeClass__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1327:1: ( ( ( 'display' ) ) | ( ( 'required' ) ) | ( ( 'readonly' ) ) | ( ( 'calculated' ) ) | ( ( 'doubleAsterisk' ) ) )
            int alt10=5;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt10=1;
                }
                break;
            case 12:
                {
                alt10=2;
                }
                break;
            case 13:
                {
                alt10=3;
                }
                break;
            case 14:
                {
                alt10=4;
                }
                break;
            case 15:
                {
                alt10=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1323:1: rule__AttributeClass__Alternatives : ( ( ( 'display' ) ) | ( ( 'required' ) ) | ( ( 'readonly' ) ) | ( ( 'calculated' ) ) | ( ( 'doubleAsterisk' ) ) );", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1328:1: ( ( 'display' ) )
                    {
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1328:1: ( ( 'display' ) )
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1329:1: ( 'display' )
                    {
                     before(grammarAccess.getAttributeClassAccess().getDisplayEnumLiteralDeclaration_0()); 
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1330:1: ( 'display' )
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1330:3: 'display'
                    {
                    match(input,11,FOLLOW_11_in_rule__AttributeClass__Alternatives2791); 

                    }

                     after(grammarAccess.getAttributeClassAccess().getDisplayEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1335:6: ( ( 'required' ) )
                    {
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1335:6: ( ( 'required' ) )
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1336:1: ( 'required' )
                    {
                     before(grammarAccess.getAttributeClassAccess().getRequiredEnumLiteralDeclaration_1()); 
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1337:1: ( 'required' )
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1337:3: 'required'
                    {
                    match(input,12,FOLLOW_12_in_rule__AttributeClass__Alternatives2812); 

                    }

                     after(grammarAccess.getAttributeClassAccess().getRequiredEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1342:6: ( ( 'readonly' ) )
                    {
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1342:6: ( ( 'readonly' ) )
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1343:1: ( 'readonly' )
                    {
                     before(grammarAccess.getAttributeClassAccess().getReadonlyEnumLiteralDeclaration_2()); 
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1344:1: ( 'readonly' )
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1344:3: 'readonly'
                    {
                    match(input,13,FOLLOW_13_in_rule__AttributeClass__Alternatives2833); 

                    }

                     after(grammarAccess.getAttributeClassAccess().getReadonlyEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1349:6: ( ( 'calculated' ) )
                    {
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1349:6: ( ( 'calculated' ) )
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1350:1: ( 'calculated' )
                    {
                     before(grammarAccess.getAttributeClassAccess().getCalculatedEnumLiteralDeclaration_3()); 
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1351:1: ( 'calculated' )
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1351:3: 'calculated'
                    {
                    match(input,14,FOLLOW_14_in_rule__AttributeClass__Alternatives2854); 

                    }

                     after(grammarAccess.getAttributeClassAccess().getCalculatedEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1356:6: ( ( 'doubleAsterisk' ) )
                    {
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1356:6: ( ( 'doubleAsterisk' ) )
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1357:1: ( 'doubleAsterisk' )
                    {
                     before(grammarAccess.getAttributeClassAccess().getDoubleAsteriskEnumLiteralDeclaration_4()); 
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1358:1: ( 'doubleAsterisk' )
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1358:3: 'doubleAsterisk'
                    {
                    match(input,15,FOLLOW_15_in_rule__AttributeClass__Alternatives2875); 

                    }

                     after(grammarAccess.getAttributeClassAccess().getDoubleAsteriskEnumLiteralDeclaration_4()); 

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
    // $ANTLR end rule__AttributeClass__Alternatives


    // $ANTLR start rule__BLiteral__Alternatives
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1368:1: rule__BLiteral__Alternatives : ( ( ( 'true' ) ) | ( ( 'false' ) ) );
    public final void rule__BLiteral__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1372:1: ( ( ( 'true' ) ) | ( ( 'false' ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==16) ) {
                alt11=1;
            }
            else if ( (LA11_0==17) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1368:1: rule__BLiteral__Alternatives : ( ( ( 'true' ) ) | ( ( 'false' ) ) );", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1373:1: ( ( 'true' ) )
                    {
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1373:1: ( ( 'true' ) )
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1374:1: ( 'true' )
                    {
                     before(grammarAccess.getBLiteralAccess().getTrueEnumLiteralDeclaration_0()); 
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1375:1: ( 'true' )
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1375:3: 'true'
                    {
                    match(input,16,FOLLOW_16_in_rule__BLiteral__Alternatives2911); 

                    }

                     after(grammarAccess.getBLiteralAccess().getTrueEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1380:6: ( ( 'false' ) )
                    {
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1380:6: ( ( 'false' ) )
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1381:1: ( 'false' )
                    {
                     before(grammarAccess.getBLiteralAccess().getFalseEnumLiteralDeclaration_1()); 
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1382:1: ( 'false' )
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1382:3: 'false'
                    {
                    match(input,17,FOLLOW_17_in_rule__BLiteral__Alternatives2932); 

                    }

                     after(grammarAccess.getBLiteralAccess().getFalseEnumLiteralDeclaration_1()); 

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
    // $ANTLR end rule__BLiteral__Alternatives


    // $ANTLR start rule__EnumMembership__Alternatives
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1392:1: rule__EnumMembership__Alternatives : ( ( ( 'is-one-of' ) ) | ( ( 'is-not-one-of' ) ) );
    public final void rule__EnumMembership__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1396:1: ( ( ( 'is-one-of' ) ) | ( ( 'is-not-one-of' ) ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==18) ) {
                alt12=1;
            }
            else if ( (LA12_0==19) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1392:1: rule__EnumMembership__Alternatives : ( ( ( 'is-one-of' ) ) | ( ( 'is-not-one-of' ) ) );", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1397:1: ( ( 'is-one-of' ) )
                    {
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1397:1: ( ( 'is-one-of' ) )
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1398:1: ( 'is-one-of' )
                    {
                     before(grammarAccess.getEnumMembershipAccess().getIsInEnumLiteralDeclaration_0()); 
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1399:1: ( 'is-one-of' )
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1399:3: 'is-one-of'
                    {
                    match(input,18,FOLLOW_18_in_rule__EnumMembership__Alternatives2968); 

                    }

                     after(grammarAccess.getEnumMembershipAccess().getIsInEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1404:6: ( ( 'is-not-one-of' ) )
                    {
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1404:6: ( ( 'is-not-one-of' ) )
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1405:1: ( 'is-not-one-of' )
                    {
                     before(grammarAccess.getEnumMembershipAccess().getIsNotInEnumLiteralDeclaration_1()); 
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1406:1: ( 'is-not-one-of' )
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1406:3: 'is-not-one-of'
                    {
                    match(input,19,FOLLOW_19_in_rule__EnumMembership__Alternatives2989); 

                    }

                     after(grammarAccess.getEnumMembershipAccess().getIsNotInEnumLiteralDeclaration_1()); 

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
    // $ANTLR end rule__EnumMembership__Alternatives


    // $ANTLR start rule__DynamicScreen__Group__0
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1418:1: rule__DynamicScreen__Group__0 : rule__DynamicScreen__Group__0__Impl rule__DynamicScreen__Group__1 ;
    public final void rule__DynamicScreen__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1422:1: ( rule__DynamicScreen__Group__0__Impl rule__DynamicScreen__Group__1 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1423:2: rule__DynamicScreen__Group__0__Impl rule__DynamicScreen__Group__1
            {
            pushFollow(FOLLOW_rule__DynamicScreen__Group__0__Impl_in_rule__DynamicScreen__Group__03022);
            rule__DynamicScreen__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DynamicScreen__Group__1_in_rule__DynamicScreen__Group__03025);
            rule__DynamicScreen__Group__1();
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
    // $ANTLR end rule__DynamicScreen__Group__0


    // $ANTLR start rule__DynamicScreen__Group__0__Impl
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1430:1: rule__DynamicScreen__Group__0__Impl : ( 'dynamic-screen' ) ;
    public final void rule__DynamicScreen__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1434:1: ( ( 'dynamic-screen' ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1435:1: ( 'dynamic-screen' )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1435:1: ( 'dynamic-screen' )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1436:1: 'dynamic-screen'
            {
             before(grammarAccess.getDynamicScreenAccess().getDynamicScreenKeyword_0()); 
            match(input,20,FOLLOW_20_in_rule__DynamicScreen__Group__0__Impl3053); 
             after(grammarAccess.getDynamicScreenAccess().getDynamicScreenKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DynamicScreen__Group__0__Impl


    // $ANTLR start rule__DynamicScreen__Group__1
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1449:1: rule__DynamicScreen__Group__1 : rule__DynamicScreen__Group__1__Impl rule__DynamicScreen__Group__2 ;
    public final void rule__DynamicScreen__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1453:1: ( rule__DynamicScreen__Group__1__Impl rule__DynamicScreen__Group__2 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1454:2: rule__DynamicScreen__Group__1__Impl rule__DynamicScreen__Group__2
            {
            pushFollow(FOLLOW_rule__DynamicScreen__Group__1__Impl_in_rule__DynamicScreen__Group__13084);
            rule__DynamicScreen__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DynamicScreen__Group__2_in_rule__DynamicScreen__Group__13087);
            rule__DynamicScreen__Group__2();
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
    // $ANTLR end rule__DynamicScreen__Group__1


    // $ANTLR start rule__DynamicScreen__Group__1__Impl
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1461:1: rule__DynamicScreen__Group__1__Impl : ( ( rule__DynamicScreen__LabelAssignment_1 ) ) ;
    public final void rule__DynamicScreen__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1465:1: ( ( ( rule__DynamicScreen__LabelAssignment_1 ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1466:1: ( ( rule__DynamicScreen__LabelAssignment_1 ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1466:1: ( ( rule__DynamicScreen__LabelAssignment_1 ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1467:1: ( rule__DynamicScreen__LabelAssignment_1 )
            {
             before(grammarAccess.getDynamicScreenAccess().getLabelAssignment_1()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1468:1: ( rule__DynamicScreen__LabelAssignment_1 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1468:2: rule__DynamicScreen__LabelAssignment_1
            {
            pushFollow(FOLLOW_rule__DynamicScreen__LabelAssignment_1_in_rule__DynamicScreen__Group__1__Impl3114);
            rule__DynamicScreen__LabelAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getDynamicScreenAccess().getLabelAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DynamicScreen__Group__1__Impl


    // $ANTLR start rule__DynamicScreen__Group__2
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1478:1: rule__DynamicScreen__Group__2 : rule__DynamicScreen__Group__2__Impl rule__DynamicScreen__Group__3 ;
    public final void rule__DynamicScreen__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1482:1: ( rule__DynamicScreen__Group__2__Impl rule__DynamicScreen__Group__3 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1483:2: rule__DynamicScreen__Group__2__Impl rule__DynamicScreen__Group__3
            {
            pushFollow(FOLLOW_rule__DynamicScreen__Group__2__Impl_in_rule__DynamicScreen__Group__23144);
            rule__DynamicScreen__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DynamicScreen__Group__3_in_rule__DynamicScreen__Group__23147);
            rule__DynamicScreen__Group__3();
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
    // $ANTLR end rule__DynamicScreen__Group__2


    // $ANTLR start rule__DynamicScreen__Group__2__Impl
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1490:1: rule__DynamicScreen__Group__2__Impl : ( ( rule__DynamicScreen__DataImportAssignment_2 ) ) ;
    public final void rule__DynamicScreen__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1494:1: ( ( ( rule__DynamicScreen__DataImportAssignment_2 ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1495:1: ( ( rule__DynamicScreen__DataImportAssignment_2 ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1495:1: ( ( rule__DynamicScreen__DataImportAssignment_2 ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1496:1: ( rule__DynamicScreen__DataImportAssignment_2 )
            {
             before(grammarAccess.getDynamicScreenAccess().getDataImportAssignment_2()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1497:1: ( rule__DynamicScreen__DataImportAssignment_2 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1497:2: rule__DynamicScreen__DataImportAssignment_2
            {
            pushFollow(FOLLOW_rule__DynamicScreen__DataImportAssignment_2_in_rule__DynamicScreen__Group__2__Impl3174);
            rule__DynamicScreen__DataImportAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getDynamicScreenAccess().getDataImportAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DynamicScreen__Group__2__Impl


    // $ANTLR start rule__DynamicScreen__Group__3
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1507:1: rule__DynamicScreen__Group__3 : rule__DynamicScreen__Group__3__Impl rule__DynamicScreen__Group__4 ;
    public final void rule__DynamicScreen__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1511:1: ( rule__DynamicScreen__Group__3__Impl rule__DynamicScreen__Group__4 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1512:2: rule__DynamicScreen__Group__3__Impl rule__DynamicScreen__Group__4
            {
            pushFollow(FOLLOW_rule__DynamicScreen__Group__3__Impl_in_rule__DynamicScreen__Group__33204);
            rule__DynamicScreen__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DynamicScreen__Group__4_in_rule__DynamicScreen__Group__33207);
            rule__DynamicScreen__Group__4();
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
    // $ANTLR end rule__DynamicScreen__Group__3


    // $ANTLR start rule__DynamicScreen__Group__3__Impl
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1519:1: rule__DynamicScreen__Group__3__Impl : ( 'view-class' ) ;
    public final void rule__DynamicScreen__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1523:1: ( ( 'view-class' ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1524:1: ( 'view-class' )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1524:1: ( 'view-class' )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1525:1: 'view-class'
            {
             before(grammarAccess.getDynamicScreenAccess().getViewClassKeyword_3()); 
            match(input,21,FOLLOW_21_in_rule__DynamicScreen__Group__3__Impl3235); 
             after(grammarAccess.getDynamicScreenAccess().getViewClassKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DynamicScreen__Group__3__Impl


    // $ANTLR start rule__DynamicScreen__Group__4
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1538:1: rule__DynamicScreen__Group__4 : rule__DynamicScreen__Group__4__Impl rule__DynamicScreen__Group__5 ;
    public final void rule__DynamicScreen__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1542:1: ( rule__DynamicScreen__Group__4__Impl rule__DynamicScreen__Group__5 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1543:2: rule__DynamicScreen__Group__4__Impl rule__DynamicScreen__Group__5
            {
            pushFollow(FOLLOW_rule__DynamicScreen__Group__4__Impl_in_rule__DynamicScreen__Group__43266);
            rule__DynamicScreen__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DynamicScreen__Group__5_in_rule__DynamicScreen__Group__43269);
            rule__DynamicScreen__Group__5();
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
    // $ANTLR end rule__DynamicScreen__Group__4


    // $ANTLR start rule__DynamicScreen__Group__4__Impl
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1550:1: rule__DynamicScreen__Group__4__Impl : ( '=' ) ;
    public final void rule__DynamicScreen__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1554:1: ( ( '=' ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1555:1: ( '=' )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1555:1: ( '=' )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1556:1: '='
            {
             before(grammarAccess.getDynamicScreenAccess().getEqualsSignKeyword_4()); 
            match(input,22,FOLLOW_22_in_rule__DynamicScreen__Group__4__Impl3297); 
             after(grammarAccess.getDynamicScreenAccess().getEqualsSignKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DynamicScreen__Group__4__Impl


    // $ANTLR start rule__DynamicScreen__Group__5
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1569:1: rule__DynamicScreen__Group__5 : rule__DynamicScreen__Group__5__Impl rule__DynamicScreen__Group__6 ;
    public final void rule__DynamicScreen__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1573:1: ( rule__DynamicScreen__Group__5__Impl rule__DynamicScreen__Group__6 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1574:2: rule__DynamicScreen__Group__5__Impl rule__DynamicScreen__Group__6
            {
            pushFollow(FOLLOW_rule__DynamicScreen__Group__5__Impl_in_rule__DynamicScreen__Group__53328);
            rule__DynamicScreen__Group__5__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DynamicScreen__Group__6_in_rule__DynamicScreen__Group__53331);
            rule__DynamicScreen__Group__6();
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
    // $ANTLR end rule__DynamicScreen__Group__5


    // $ANTLR start rule__DynamicScreen__Group__5__Impl
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1581:1: rule__DynamicScreen__Group__5__Impl : ( ( rule__DynamicScreen__ViewClassAssignment_5 ) ) ;
    public final void rule__DynamicScreen__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1585:1: ( ( ( rule__DynamicScreen__ViewClassAssignment_5 ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1586:1: ( ( rule__DynamicScreen__ViewClassAssignment_5 ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1586:1: ( ( rule__DynamicScreen__ViewClassAssignment_5 ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1587:1: ( rule__DynamicScreen__ViewClassAssignment_5 )
            {
             before(grammarAccess.getDynamicScreenAccess().getViewClassAssignment_5()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1588:1: ( rule__DynamicScreen__ViewClassAssignment_5 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1588:2: rule__DynamicScreen__ViewClassAssignment_5
            {
            pushFollow(FOLLOW_rule__DynamicScreen__ViewClassAssignment_5_in_rule__DynamicScreen__Group__5__Impl3358);
            rule__DynamicScreen__ViewClassAssignment_5();
            _fsp--;


            }

             after(grammarAccess.getDynamicScreenAccess().getViewClassAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DynamicScreen__Group__5__Impl


    // $ANTLR start rule__DynamicScreen__Group__6
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1598:1: rule__DynamicScreen__Group__6 : rule__DynamicScreen__Group__6__Impl rule__DynamicScreen__Group__7 ;
    public final void rule__DynamicScreen__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1602:1: ( rule__DynamicScreen__Group__6__Impl rule__DynamicScreen__Group__7 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1603:2: rule__DynamicScreen__Group__6__Impl rule__DynamicScreen__Group__7
            {
            pushFollow(FOLLOW_rule__DynamicScreen__Group__6__Impl_in_rule__DynamicScreen__Group__63388);
            rule__DynamicScreen__Group__6__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DynamicScreen__Group__7_in_rule__DynamicScreen__Group__63391);
            rule__DynamicScreen__Group__7();
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
    // $ANTLR end rule__DynamicScreen__Group__6


    // $ANTLR start rule__DynamicScreen__Group__6__Impl
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1610:1: rule__DynamicScreen__Group__6__Impl : ( ( rule__DynamicScreen__DeclarationsAssignment_6 )* ) ;
    public final void rule__DynamicScreen__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1614:1: ( ( ( rule__DynamicScreen__DeclarationsAssignment_6 )* ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1615:1: ( ( rule__DynamicScreen__DeclarationsAssignment_6 )* )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1615:1: ( ( rule__DynamicScreen__DeclarationsAssignment_6 )* )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1616:1: ( rule__DynamicScreen__DeclarationsAssignment_6 )*
            {
             before(grammarAccess.getDynamicScreenAccess().getDeclarationsAssignment_6()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1617:1: ( rule__DynamicScreen__DeclarationsAssignment_6 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==29||LA13_0==31||LA13_0==33) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1617:2: rule__DynamicScreen__DeclarationsAssignment_6
            	    {
            	    pushFollow(FOLLOW_rule__DynamicScreen__DeclarationsAssignment_6_in_rule__DynamicScreen__Group__6__Impl3418);
            	    rule__DynamicScreen__DeclarationsAssignment_6();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getDynamicScreenAccess().getDeclarationsAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DynamicScreen__Group__6__Impl


    // $ANTLR start rule__DynamicScreen__Group__7
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1627:1: rule__DynamicScreen__Group__7 : rule__DynamicScreen__Group__7__Impl ;
    public final void rule__DynamicScreen__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1631:1: ( rule__DynamicScreen__Group__7__Impl )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1632:2: rule__DynamicScreen__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__DynamicScreen__Group__7__Impl_in_rule__DynamicScreen__Group__73449);
            rule__DynamicScreen__Group__7__Impl();
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
    // $ANTLR end rule__DynamicScreen__Group__7


    // $ANTLR start rule__DynamicScreen__Group__7__Impl
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1638:1: rule__DynamicScreen__Group__7__Impl : ( ( ( rule__DynamicScreen__GroupsAssignment_7 ) ) ( ( rule__DynamicScreen__GroupsAssignment_7 )* ) ) ;
    public final void rule__DynamicScreen__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1642:1: ( ( ( ( rule__DynamicScreen__GroupsAssignment_7 ) ) ( ( rule__DynamicScreen__GroupsAssignment_7 )* ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1643:1: ( ( ( rule__DynamicScreen__GroupsAssignment_7 ) ) ( ( rule__DynamicScreen__GroupsAssignment_7 )* ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1643:1: ( ( ( rule__DynamicScreen__GroupsAssignment_7 ) ) ( ( rule__DynamicScreen__GroupsAssignment_7 )* ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1644:1: ( ( rule__DynamicScreen__GroupsAssignment_7 ) ) ( ( rule__DynamicScreen__GroupsAssignment_7 )* )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1644:1: ( ( rule__DynamicScreen__GroupsAssignment_7 ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1645:1: ( rule__DynamicScreen__GroupsAssignment_7 )
            {
             before(grammarAccess.getDynamicScreenAccess().getGroupsAssignment_7()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1646:1: ( rule__DynamicScreen__GroupsAssignment_7 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1646:2: rule__DynamicScreen__GroupsAssignment_7
            {
            pushFollow(FOLLOW_rule__DynamicScreen__GroupsAssignment_7_in_rule__DynamicScreen__Group__7__Impl3478);
            rule__DynamicScreen__GroupsAssignment_7();
            _fsp--;


            }

             after(grammarAccess.getDynamicScreenAccess().getGroupsAssignment_7()); 

            }

            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1649:1: ( ( rule__DynamicScreen__GroupsAssignment_7 )* )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1650:1: ( rule__DynamicScreen__GroupsAssignment_7 )*
            {
             before(grammarAccess.getDynamicScreenAccess().getGroupsAssignment_7()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1651:1: ( rule__DynamicScreen__GroupsAssignment_7 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==35) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1651:2: rule__DynamicScreen__GroupsAssignment_7
            	    {
            	    pushFollow(FOLLOW_rule__DynamicScreen__GroupsAssignment_7_in_rule__DynamicScreen__Group__7__Impl3490);
            	    rule__DynamicScreen__GroupsAssignment_7();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getDynamicScreenAccess().getGroupsAssignment_7()); 

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
    // $ANTLR end rule__DynamicScreen__Group__7__Impl


    // $ANTLR start rule__DataImport__Group__0
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1678:1: rule__DataImport__Group__0 : rule__DataImport__Group__0__Impl rule__DataImport__Group__1 ;
    public final void rule__DataImport__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1682:1: ( rule__DataImport__Group__0__Impl rule__DataImport__Group__1 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1683:2: rule__DataImport__Group__0__Impl rule__DataImport__Group__1
            {
            pushFollow(FOLLOW_rule__DataImport__Group__0__Impl_in_rule__DataImport__Group__03539);
            rule__DataImport__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DataImport__Group__1_in_rule__DataImport__Group__03542);
            rule__DataImport__Group__1();
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
    // $ANTLR end rule__DataImport__Group__0


    // $ANTLR start rule__DataImport__Group__0__Impl
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1690:1: rule__DataImport__Group__0__Impl : ( 'data-import' ) ;
    public final void rule__DataImport__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1694:1: ( ( 'data-import' ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1695:1: ( 'data-import' )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1695:1: ( 'data-import' )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1696:1: 'data-import'
            {
             before(grammarAccess.getDataImportAccess().getDataImportKeyword_0()); 
            match(input,23,FOLLOW_23_in_rule__DataImport__Group__0__Impl3570); 
             after(grammarAccess.getDataImportAccess().getDataImportKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DataImport__Group__0__Impl


    // $ANTLR start rule__DataImport__Group__1
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1709:1: rule__DataImport__Group__1 : rule__DataImport__Group__1__Impl rule__DataImport__Group__2 ;
    public final void rule__DataImport__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1713:1: ( rule__DataImport__Group__1__Impl rule__DataImport__Group__2 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1714:2: rule__DataImport__Group__1__Impl rule__DataImport__Group__2
            {
            pushFollow(FOLLOW_rule__DataImport__Group__1__Impl_in_rule__DataImport__Group__13601);
            rule__DataImport__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DataImport__Group__2_in_rule__DataImport__Group__13604);
            rule__DataImport__Group__2();
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
    // $ANTLR end rule__DataImport__Group__1


    // $ANTLR start rule__DataImport__Group__1__Impl
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1721:1: rule__DataImport__Group__1__Impl : ( '=' ) ;
    public final void rule__DataImport__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1725:1: ( ( '=' ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1726:1: ( '=' )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1726:1: ( '=' )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1727:1: '='
            {
             before(grammarAccess.getDataImportAccess().getEqualsSignKeyword_1()); 
            match(input,22,FOLLOW_22_in_rule__DataImport__Group__1__Impl3632); 
             after(grammarAccess.getDataImportAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DataImport__Group__1__Impl


    // $ANTLR start rule__DataImport__Group__2
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1740:1: rule__DataImport__Group__2 : rule__DataImport__Group__2__Impl ;
    public final void rule__DataImport__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1744:1: ( rule__DataImport__Group__2__Impl )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1745:2: rule__DataImport__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__DataImport__Group__2__Impl_in_rule__DataImport__Group__23663);
            rule__DataImport__Group__2__Impl();
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
    // $ANTLR end rule__DataImport__Group__2


    // $ANTLR start rule__DataImport__Group__2__Impl
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1751:1: rule__DataImport__Group__2__Impl : ( ( rule__DataImport__ImportURIAssignment_2 ) ) ;
    public final void rule__DataImport__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1755:1: ( ( ( rule__DataImport__ImportURIAssignment_2 ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1756:1: ( ( rule__DataImport__ImportURIAssignment_2 ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1756:1: ( ( rule__DataImport__ImportURIAssignment_2 ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1757:1: ( rule__DataImport__ImportURIAssignment_2 )
            {
             before(grammarAccess.getDataImportAccess().getImportURIAssignment_2()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1758:1: ( rule__DataImport__ImportURIAssignment_2 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1758:2: rule__DataImport__ImportURIAssignment_2
            {
            pushFollow(FOLLOW_rule__DataImport__ImportURIAssignment_2_in_rule__DataImport__Group__2__Impl3690);
            rule__DataImport__ImportURIAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getDataImportAccess().getImportURIAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DataImport__Group__2__Impl


    // $ANTLR start rule__Label__Group__0
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1774:1: rule__Label__Group__0 : rule__Label__Group__0__Impl rule__Label__Group__1 ;
    public final void rule__Label__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1778:1: ( rule__Label__Group__0__Impl rule__Label__Group__1 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1779:2: rule__Label__Group__0__Impl rule__Label__Group__1
            {
            pushFollow(FOLLOW_rule__Label__Group__0__Impl_in_rule__Label__Group__03726);
            rule__Label__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Label__Group__1_in_rule__Label__Group__03729);
            rule__Label__Group__1();
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
    // $ANTLR end rule__Label__Group__0


    // $ANTLR start rule__Label__Group__0__Impl
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1786:1: rule__Label__Group__0__Impl : ( ( rule__Label__EnAssignment_0 ) ) ;
    public final void rule__Label__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1790:1: ( ( ( rule__Label__EnAssignment_0 ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1791:1: ( ( rule__Label__EnAssignment_0 ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1791:1: ( ( rule__Label__EnAssignment_0 ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1792:1: ( rule__Label__EnAssignment_0 )
            {
             before(grammarAccess.getLabelAccess().getEnAssignment_0()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1793:1: ( rule__Label__EnAssignment_0 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1793:2: rule__Label__EnAssignment_0
            {
            pushFollow(FOLLOW_rule__Label__EnAssignment_0_in_rule__Label__Group__0__Impl3756);
            rule__Label__EnAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getLabelAccess().getEnAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Label__Group__0__Impl


    // $ANTLR start rule__Label__Group__1
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1803:1: rule__Label__Group__1 : rule__Label__Group__1__Impl ;
    public final void rule__Label__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1807:1: ( rule__Label__Group__1__Impl )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1808:2: rule__Label__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Label__Group__1__Impl_in_rule__Label__Group__13786);
            rule__Label__Group__1__Impl();
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
    // $ANTLR end rule__Label__Group__1


    // $ANTLR start rule__Label__Group__1__Impl
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1814:1: rule__Label__Group__1__Impl : ( ( rule__Label__Group_1__0 )? ) ;
    public final void rule__Label__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1818:1: ( ( ( rule__Label__Group_1__0 )? ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1819:1: ( ( rule__Label__Group_1__0 )? )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1819:1: ( ( rule__Label__Group_1__0 )? )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1820:1: ( rule__Label__Group_1__0 )?
            {
             before(grammarAccess.getLabelAccess().getGroup_1()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1821:1: ( rule__Label__Group_1__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==24) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1821:2: rule__Label__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Label__Group_1__0_in_rule__Label__Group__1__Impl3813);
                    rule__Label__Group_1__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLabelAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Label__Group__1__Impl


    // $ANTLR start rule__Label__Group_1__0
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1835:1: rule__Label__Group_1__0 : rule__Label__Group_1__0__Impl rule__Label__Group_1__1 ;
    public final void rule__Label__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1839:1: ( rule__Label__Group_1__0__Impl rule__Label__Group_1__1 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1840:2: rule__Label__Group_1__0__Impl rule__Label__Group_1__1
            {
            pushFollow(FOLLOW_rule__Label__Group_1__0__Impl_in_rule__Label__Group_1__03848);
            rule__Label__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Label__Group_1__1_in_rule__Label__Group_1__03851);
            rule__Label__Group_1__1();
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
    // $ANTLR end rule__Label__Group_1__0


    // $ANTLR start rule__Label__Group_1__0__Impl
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1847:1: rule__Label__Group_1__0__Impl : ( '[nl:' ) ;
    public final void rule__Label__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1851:1: ( ( '[nl:' ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1852:1: ( '[nl:' )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1852:1: ( '[nl:' )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1853:1: '[nl:'
            {
             before(grammarAccess.getLabelAccess().getNlKeyword_1_0()); 
            match(input,24,FOLLOW_24_in_rule__Label__Group_1__0__Impl3879); 
             after(grammarAccess.getLabelAccess().getNlKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Label__Group_1__0__Impl


    // $ANTLR start rule__Label__Group_1__1
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1866:1: rule__Label__Group_1__1 : rule__Label__Group_1__1__Impl rule__Label__Group_1__2 ;
    public final void rule__Label__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1870:1: ( rule__Label__Group_1__1__Impl rule__Label__Group_1__2 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1871:2: rule__Label__Group_1__1__Impl rule__Label__Group_1__2
            {
            pushFollow(FOLLOW_rule__Label__Group_1__1__Impl_in_rule__Label__Group_1__13910);
            rule__Label__Group_1__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Label__Group_1__2_in_rule__Label__Group_1__13913);
            rule__Label__Group_1__2();
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
    // $ANTLR end rule__Label__Group_1__1


    // $ANTLR start rule__Label__Group_1__1__Impl
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1878:1: rule__Label__Group_1__1__Impl : ( ( rule__Label__NlAssignment_1_1 ) ) ;
    public final void rule__Label__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1882:1: ( ( ( rule__Label__NlAssignment_1_1 ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1883:1: ( ( rule__Label__NlAssignment_1_1 ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1883:1: ( ( rule__Label__NlAssignment_1_1 ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1884:1: ( rule__Label__NlAssignment_1_1 )
            {
             before(grammarAccess.getLabelAccess().getNlAssignment_1_1()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1885:1: ( rule__Label__NlAssignment_1_1 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1885:2: rule__Label__NlAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Label__NlAssignment_1_1_in_rule__Label__Group_1__1__Impl3940);
            rule__Label__NlAssignment_1_1();
            _fsp--;


            }

             after(grammarAccess.getLabelAccess().getNlAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Label__Group_1__1__Impl


    // $ANTLR start rule__Label__Group_1__2
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1895:1: rule__Label__Group_1__2 : rule__Label__Group_1__2__Impl ;
    public final void rule__Label__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1899:1: ( rule__Label__Group_1__2__Impl )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1900:2: rule__Label__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Label__Group_1__2__Impl_in_rule__Label__Group_1__23970);
            rule__Label__Group_1__2__Impl();
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
    // $ANTLR end rule__Label__Group_1__2


    // $ANTLR start rule__Label__Group_1__2__Impl
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1906:1: rule__Label__Group_1__2__Impl : ( ']' ) ;
    public final void rule__Label__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1910:1: ( ( ']' ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1911:1: ( ']' )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1911:1: ( ']' )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1912:1: ']'
            {
             before(grammarAccess.getLabelAccess().getRightSquareBracketKeyword_1_2()); 
            match(input,25,FOLLOW_25_in_rule__Label__Group_1__2__Impl3998); 
             after(grammarAccess.getLabelAccess().getRightSquareBracketKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Label__Group_1__2__Impl


    // $ANTLR start rule__PathTail__Group__0
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1931:1: rule__PathTail__Group__0 : rule__PathTail__Group__0__Impl rule__PathTail__Group__1 ;
    public final void rule__PathTail__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1935:1: ( rule__PathTail__Group__0__Impl rule__PathTail__Group__1 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1936:2: rule__PathTail__Group__0__Impl rule__PathTail__Group__1
            {
            pushFollow(FOLLOW_rule__PathTail__Group__0__Impl_in_rule__PathTail__Group__04035);
            rule__PathTail__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__PathTail__Group__1_in_rule__PathTail__Group__04038);
            rule__PathTail__Group__1();
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
    // $ANTLR end rule__PathTail__Group__0


    // $ANTLR start rule__PathTail__Group__0__Impl
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1943:1: rule__PathTail__Group__0__Impl : ( '/' ) ;
    public final void rule__PathTail__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1947:1: ( ( '/' ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1948:1: ( '/' )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1948:1: ( '/' )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1949:1: '/'
            {
             before(grammarAccess.getPathTailAccess().getSolidusKeyword_0()); 
            match(input,26,FOLLOW_26_in_rule__PathTail__Group__0__Impl4066); 
             after(grammarAccess.getPathTailAccess().getSolidusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PathTail__Group__0__Impl


    // $ANTLR start rule__PathTail__Group__1
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1962:1: rule__PathTail__Group__1 : rule__PathTail__Group__1__Impl rule__PathTail__Group__2 ;
    public final void rule__PathTail__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1966:1: ( rule__PathTail__Group__1__Impl rule__PathTail__Group__2 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1967:2: rule__PathTail__Group__1__Impl rule__PathTail__Group__2
            {
            pushFollow(FOLLOW_rule__PathTail__Group__1__Impl_in_rule__PathTail__Group__14097);
            rule__PathTail__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__PathTail__Group__2_in_rule__PathTail__Group__14100);
            rule__PathTail__Group__2();
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
    // $ANTLR end rule__PathTail__Group__1


    // $ANTLR start rule__PathTail__Group__1__Impl
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1974:1: rule__PathTail__Group__1__Impl : ( ( rule__PathTail__FieldAssignment_1 ) ) ;
    public final void rule__PathTail__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1978:1: ( ( ( rule__PathTail__FieldAssignment_1 ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1979:1: ( ( rule__PathTail__FieldAssignment_1 ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1979:1: ( ( rule__PathTail__FieldAssignment_1 ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1980:1: ( rule__PathTail__FieldAssignment_1 )
            {
             before(grammarAccess.getPathTailAccess().getFieldAssignment_1()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1981:1: ( rule__PathTail__FieldAssignment_1 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1981:2: rule__PathTail__FieldAssignment_1
            {
            pushFollow(FOLLOW_rule__PathTail__FieldAssignment_1_in_rule__PathTail__Group__1__Impl4127);
            rule__PathTail__FieldAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getPathTailAccess().getFieldAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PathTail__Group__1__Impl


    // $ANTLR start rule__PathTail__Group__2
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1991:1: rule__PathTail__Group__2 : rule__PathTail__Group__2__Impl rule__PathTail__Group__3 ;
    public final void rule__PathTail__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1995:1: ( rule__PathTail__Group__2__Impl rule__PathTail__Group__3 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1996:2: rule__PathTail__Group__2__Impl rule__PathTail__Group__3
            {
            pushFollow(FOLLOW_rule__PathTail__Group__2__Impl_in_rule__PathTail__Group__24157);
            rule__PathTail__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__PathTail__Group__3_in_rule__PathTail__Group__24160);
            rule__PathTail__Group__3();
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
    // $ANTLR end rule__PathTail__Group__2


    // $ANTLR start rule__PathTail__Group__2__Impl
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2003:1: rule__PathTail__Group__2__Impl : ( ( rule__PathTail__Group_2__0 )? ) ;
    public final void rule__PathTail__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2007:1: ( ( ( rule__PathTail__Group_2__0 )? ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2008:1: ( ( rule__PathTail__Group_2__0 )? )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2008:1: ( ( rule__PathTail__Group_2__0 )? )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2009:1: ( rule__PathTail__Group_2__0 )?
            {
             before(grammarAccess.getPathTailAccess().getGroup_2()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2010:1: ( rule__PathTail__Group_2__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==27) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2010:2: rule__PathTail__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__PathTail__Group_2__0_in_rule__PathTail__Group__2__Impl4187);
                    rule__PathTail__Group_2__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPathTailAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PathTail__Group__2__Impl


    // $ANTLR start rule__PathTail__Group__3
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2020:1: rule__PathTail__Group__3 : rule__PathTail__Group__3__Impl ;
    public final void rule__PathTail__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2024:1: ( rule__PathTail__Group__3__Impl )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2025:2: rule__PathTail__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__PathTail__Group__3__Impl_in_rule__PathTail__Group__34218);
            rule__PathTail__Group__3__Impl();
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
    // $ANTLR end rule__PathTail__Group__3


    // $ANTLR start rule__PathTail__Group__3__Impl
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2031:1: rule__PathTail__Group__3__Impl : ( ( rule__PathTail__TailAssignment_3 )? ) ;
    public final void rule__PathTail__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2035:1: ( ( ( rule__PathTail__TailAssignment_3 )? ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2036:1: ( ( rule__PathTail__TailAssignment_3 )? )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2036:1: ( ( rule__PathTail__TailAssignment_3 )? )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2037:1: ( rule__PathTail__TailAssignment_3 )?
            {
             before(grammarAccess.getPathTailAccess().getTailAssignment_3()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2038:1: ( rule__PathTail__TailAssignment_3 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==26) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2038:2: rule__PathTail__TailAssignment_3
                    {
                    pushFollow(FOLLOW_rule__PathTail__TailAssignment_3_in_rule__PathTail__Group__3__Impl4245);
                    rule__PathTail__TailAssignment_3();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPathTailAccess().getTailAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PathTail__Group__3__Impl


    // $ANTLR start rule__PathTail__Group_2__0
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2056:1: rule__PathTail__Group_2__0 : rule__PathTail__Group_2__0__Impl rule__PathTail__Group_2__1 ;
    public final void rule__PathTail__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2060:1: ( rule__PathTail__Group_2__0__Impl rule__PathTail__Group_2__1 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2061:2: rule__PathTail__Group_2__0__Impl rule__PathTail__Group_2__1
            {
            pushFollow(FOLLOW_rule__PathTail__Group_2__0__Impl_in_rule__PathTail__Group_2__04284);
            rule__PathTail__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__PathTail__Group_2__1_in_rule__PathTail__Group_2__04287);
            rule__PathTail__Group_2__1();
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
    // $ANTLR end rule__PathTail__Group_2__0


    // $ANTLR start rule__PathTail__Group_2__0__Impl
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2068:1: rule__PathTail__Group_2__0__Impl : ( '(' ) ;
    public final void rule__PathTail__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2072:1: ( ( '(' ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2073:1: ( '(' )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2073:1: ( '(' )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2074:1: '('
            {
             before(grammarAccess.getPathTailAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,27,FOLLOW_27_in_rule__PathTail__Group_2__0__Impl4315); 
             after(grammarAccess.getPathTailAccess().getLeftParenthesisKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PathTail__Group_2__0__Impl


    // $ANTLR start rule__PathTail__Group_2__1
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2087:1: rule__PathTail__Group_2__1 : rule__PathTail__Group_2__1__Impl rule__PathTail__Group_2__2 ;
    public final void rule__PathTail__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2091:1: ( rule__PathTail__Group_2__1__Impl rule__PathTail__Group_2__2 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2092:2: rule__PathTail__Group_2__1__Impl rule__PathTail__Group_2__2
            {
            pushFollow(FOLLOW_rule__PathTail__Group_2__1__Impl_in_rule__PathTail__Group_2__14346);
            rule__PathTail__Group_2__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__PathTail__Group_2__2_in_rule__PathTail__Group_2__14349);
            rule__PathTail__Group_2__2();
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
    // $ANTLR end rule__PathTail__Group_2__1


    // $ANTLR start rule__PathTail__Group_2__1__Impl
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2099:1: rule__PathTail__Group_2__1__Impl : ( ( rule__PathTail__AsEntityAssignment_2_1 ) ) ;
    public final void rule__PathTail__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2103:1: ( ( ( rule__PathTail__AsEntityAssignment_2_1 ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2104:1: ( ( rule__PathTail__AsEntityAssignment_2_1 ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2104:1: ( ( rule__PathTail__AsEntityAssignment_2_1 ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2105:1: ( rule__PathTail__AsEntityAssignment_2_1 )
            {
             before(grammarAccess.getPathTailAccess().getAsEntityAssignment_2_1()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2106:1: ( rule__PathTail__AsEntityAssignment_2_1 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2106:2: rule__PathTail__AsEntityAssignment_2_1
            {
            pushFollow(FOLLOW_rule__PathTail__AsEntityAssignment_2_1_in_rule__PathTail__Group_2__1__Impl4376);
            rule__PathTail__AsEntityAssignment_2_1();
            _fsp--;


            }

             after(grammarAccess.getPathTailAccess().getAsEntityAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PathTail__Group_2__1__Impl


    // $ANTLR start rule__PathTail__Group_2__2
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2116:1: rule__PathTail__Group_2__2 : rule__PathTail__Group_2__2__Impl ;
    public final void rule__PathTail__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2120:1: ( rule__PathTail__Group_2__2__Impl )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2121:2: rule__PathTail__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__PathTail__Group_2__2__Impl_in_rule__PathTail__Group_2__24406);
            rule__PathTail__Group_2__2__Impl();
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
    // $ANTLR end rule__PathTail__Group_2__2


    // $ANTLR start rule__PathTail__Group_2__2__Impl
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2127:1: rule__PathTail__Group_2__2__Impl : ( ')' ) ;
    public final void rule__PathTail__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2131:1: ( ( ')' ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2132:1: ( ')' )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2132:1: ( ')' )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2133:1: ')'
            {
             before(grammarAccess.getPathTailAccess().getRightParenthesisKeyword_2_2()); 
            match(input,28,FOLLOW_28_in_rule__PathTail__Group_2__2__Impl4434); 
             after(grammarAccess.getPathTailAccess().getRightParenthesisKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PathTail__Group_2__2__Impl


    // $ANTLR start rule__ExternalVariable__Group__0
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2152:1: rule__ExternalVariable__Group__0 : rule__ExternalVariable__Group__0__Impl rule__ExternalVariable__Group__1 ;
    public final void rule__ExternalVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2156:1: ( rule__ExternalVariable__Group__0__Impl rule__ExternalVariable__Group__1 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2157:2: rule__ExternalVariable__Group__0__Impl rule__ExternalVariable__Group__1
            {
            pushFollow(FOLLOW_rule__ExternalVariable__Group__0__Impl_in_rule__ExternalVariable__Group__04471);
            rule__ExternalVariable__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ExternalVariable__Group__1_in_rule__ExternalVariable__Group__04474);
            rule__ExternalVariable__Group__1();
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
    // $ANTLR end rule__ExternalVariable__Group__0


    // $ANTLR start rule__ExternalVariable__Group__0__Impl
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2164:1: rule__ExternalVariable__Group__0__Impl : ( 'external-var' ) ;
    public final void rule__ExternalVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2168:1: ( ( 'external-var' ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2169:1: ( 'external-var' )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2169:1: ( 'external-var' )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2170:1: 'external-var'
            {
             before(grammarAccess.getExternalVariableAccess().getExternalVarKeyword_0()); 
            match(input,29,FOLLOW_29_in_rule__ExternalVariable__Group__0__Impl4502); 
             after(grammarAccess.getExternalVariableAccess().getExternalVarKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ExternalVariable__Group__0__Impl


    // $ANTLR start rule__ExternalVariable__Group__1
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2183:1: rule__ExternalVariable__Group__1 : rule__ExternalVariable__Group__1__Impl rule__ExternalVariable__Group__2 ;
    public final void rule__ExternalVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2187:1: ( rule__ExternalVariable__Group__1__Impl rule__ExternalVariable__Group__2 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2188:2: rule__ExternalVariable__Group__1__Impl rule__ExternalVariable__Group__2
            {
            pushFollow(FOLLOW_rule__ExternalVariable__Group__1__Impl_in_rule__ExternalVariable__Group__14533);
            rule__ExternalVariable__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ExternalVariable__Group__2_in_rule__ExternalVariable__Group__14536);
            rule__ExternalVariable__Group__2();
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
    // $ANTLR end rule__ExternalVariable__Group__1


    // $ANTLR start rule__ExternalVariable__Group__1__Impl
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2195:1: rule__ExternalVariable__Group__1__Impl : ( ( rule__ExternalVariable__PathAssignment_1 ) ) ;
    public final void rule__ExternalVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2199:1: ( ( ( rule__ExternalVariable__PathAssignment_1 ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2200:1: ( ( rule__ExternalVariable__PathAssignment_1 ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2200:1: ( ( rule__ExternalVariable__PathAssignment_1 ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2201:1: ( rule__ExternalVariable__PathAssignment_1 )
            {
             before(grammarAccess.getExternalVariableAccess().getPathAssignment_1()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2202:1: ( rule__ExternalVariable__PathAssignment_1 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2202:2: rule__ExternalVariable__PathAssignment_1
            {
            pushFollow(FOLLOW_rule__ExternalVariable__PathAssignment_1_in_rule__ExternalVariable__Group__1__Impl4563);
            rule__ExternalVariable__PathAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getExternalVariableAccess().getPathAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ExternalVariable__Group__1__Impl


    // $ANTLR start rule__ExternalVariable__Group__2
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2212:1: rule__ExternalVariable__Group__2 : rule__ExternalVariable__Group__2__Impl rule__ExternalVariable__Group__3 ;
    public final void rule__ExternalVariable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2216:1: ( rule__ExternalVariable__Group__2__Impl rule__ExternalVariable__Group__3 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2217:2: rule__ExternalVariable__Group__2__Impl rule__ExternalVariable__Group__3
            {
            pushFollow(FOLLOW_rule__ExternalVariable__Group__2__Impl_in_rule__ExternalVariable__Group__24593);
            rule__ExternalVariable__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ExternalVariable__Group__3_in_rule__ExternalVariable__Group__24596);
            rule__ExternalVariable__Group__3();
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
    // $ANTLR end rule__ExternalVariable__Group__2


    // $ANTLR start rule__ExternalVariable__Group__2__Impl
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2224:1: rule__ExternalVariable__Group__2__Impl : ( 'as' ) ;
    public final void rule__ExternalVariable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2228:1: ( ( 'as' ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2229:1: ( 'as' )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2229:1: ( 'as' )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2230:1: 'as'
            {
             before(grammarAccess.getExternalVariableAccess().getAsKeyword_2()); 
            match(input,30,FOLLOW_30_in_rule__ExternalVariable__Group__2__Impl4624); 
             after(grammarAccess.getExternalVariableAccess().getAsKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ExternalVariable__Group__2__Impl


    // $ANTLR start rule__ExternalVariable__Group__3
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2243:1: rule__ExternalVariable__Group__3 : rule__ExternalVariable__Group__3__Impl ;
    public final void rule__ExternalVariable__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2247:1: ( rule__ExternalVariable__Group__3__Impl )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2248:2: rule__ExternalVariable__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ExternalVariable__Group__3__Impl_in_rule__ExternalVariable__Group__34655);
            rule__ExternalVariable__Group__3__Impl();
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
    // $ANTLR end rule__ExternalVariable__Group__3


    // $ANTLR start rule__ExternalVariable__Group__3__Impl
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2254:1: rule__ExternalVariable__Group__3__Impl : ( ( rule__ExternalVariable__NameAssignment_3 ) ) ;
    public final void rule__ExternalVariable__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2258:1: ( ( ( rule__ExternalVariable__NameAssignment_3 ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2259:1: ( ( rule__ExternalVariable__NameAssignment_3 ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2259:1: ( ( rule__ExternalVariable__NameAssignment_3 ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2260:1: ( rule__ExternalVariable__NameAssignment_3 )
            {
             before(grammarAccess.getExternalVariableAccess().getNameAssignment_3()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2261:1: ( rule__ExternalVariable__NameAssignment_3 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2261:2: rule__ExternalVariable__NameAssignment_3
            {
            pushFollow(FOLLOW_rule__ExternalVariable__NameAssignment_3_in_rule__ExternalVariable__Group__3__Impl4682);
            rule__ExternalVariable__NameAssignment_3();
            _fsp--;


            }

             after(grammarAccess.getExternalVariableAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ExternalVariable__Group__3__Impl


    // $ANTLR start rule__EnumList__Group__0
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2279:1: rule__EnumList__Group__0 : rule__EnumList__Group__0__Impl rule__EnumList__Group__1 ;
    public final void rule__EnumList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2283:1: ( rule__EnumList__Group__0__Impl rule__EnumList__Group__1 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2284:2: rule__EnumList__Group__0__Impl rule__EnumList__Group__1
            {
            pushFollow(FOLLOW_rule__EnumList__Group__0__Impl_in_rule__EnumList__Group__04720);
            rule__EnumList__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__EnumList__Group__1_in_rule__EnumList__Group__04723);
            rule__EnumList__Group__1();
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
    // $ANTLR end rule__EnumList__Group__0


    // $ANTLR start rule__EnumList__Group__0__Impl
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2291:1: rule__EnumList__Group__0__Impl : ( 'define' ) ;
    public final void rule__EnumList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2295:1: ( ( 'define' ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2296:1: ( 'define' )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2296:1: ( 'define' )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2297:1: 'define'
            {
             before(grammarAccess.getEnumListAccess().getDefineKeyword_0()); 
            match(input,31,FOLLOW_31_in_rule__EnumList__Group__0__Impl4751); 
             after(grammarAccess.getEnumListAccess().getDefineKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EnumList__Group__0__Impl


    // $ANTLR start rule__EnumList__Group__1
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2310:1: rule__EnumList__Group__1 : rule__EnumList__Group__1__Impl rule__EnumList__Group__2 ;
    public final void rule__EnumList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2314:1: ( rule__EnumList__Group__1__Impl rule__EnumList__Group__2 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2315:2: rule__EnumList__Group__1__Impl rule__EnumList__Group__2
            {
            pushFollow(FOLLOW_rule__EnumList__Group__1__Impl_in_rule__EnumList__Group__14782);
            rule__EnumList__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__EnumList__Group__2_in_rule__EnumList__Group__14785);
            rule__EnumList__Group__2();
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
    // $ANTLR end rule__EnumList__Group__1


    // $ANTLR start rule__EnumList__Group__1__Impl
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2322:1: rule__EnumList__Group__1__Impl : ( ( rule__EnumList__NameAssignment_1 ) ) ;
    public final void rule__EnumList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2326:1: ( ( ( rule__EnumList__NameAssignment_1 ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2327:1: ( ( rule__EnumList__NameAssignment_1 ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2327:1: ( ( rule__EnumList__NameAssignment_1 ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2328:1: ( rule__EnumList__NameAssignment_1 )
            {
             before(grammarAccess.getEnumListAccess().getNameAssignment_1()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2329:1: ( rule__EnumList__NameAssignment_1 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2329:2: rule__EnumList__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__EnumList__NameAssignment_1_in_rule__EnumList__Group__1__Impl4812);
            rule__EnumList__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getEnumListAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EnumList__Group__1__Impl


    // $ANTLR start rule__EnumList__Group__2
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2339:1: rule__EnumList__Group__2 : rule__EnumList__Group__2__Impl rule__EnumList__Group__3 ;
    public final void rule__EnumList__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2343:1: ( rule__EnumList__Group__2__Impl rule__EnumList__Group__3 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2344:2: rule__EnumList__Group__2__Impl rule__EnumList__Group__3
            {
            pushFollow(FOLLOW_rule__EnumList__Group__2__Impl_in_rule__EnumList__Group__24842);
            rule__EnumList__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__EnumList__Group__3_in_rule__EnumList__Group__24845);
            rule__EnumList__Group__3();
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
    // $ANTLR end rule__EnumList__Group__2


    // $ANTLR start rule__EnumList__Group__2__Impl
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2351:1: rule__EnumList__Group__2__Impl : ( 'as' ) ;
    public final void rule__EnumList__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2355:1: ( ( 'as' ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2356:1: ( 'as' )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2356:1: ( 'as' )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2357:1: 'as'
            {
             before(grammarAccess.getEnumListAccess().getAsKeyword_2()); 
            match(input,30,FOLLOW_30_in_rule__EnumList__Group__2__Impl4873); 
             after(grammarAccess.getEnumListAccess().getAsKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EnumList__Group__2__Impl


    // $ANTLR start rule__EnumList__Group__3
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2370:1: rule__EnumList__Group__3 : rule__EnumList__Group__3__Impl rule__EnumList__Group__4 ;
    public final void rule__EnumList__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2374:1: ( rule__EnumList__Group__3__Impl rule__EnumList__Group__4 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2375:2: rule__EnumList__Group__3__Impl rule__EnumList__Group__4
            {
            pushFollow(FOLLOW_rule__EnumList__Group__3__Impl_in_rule__EnumList__Group__34904);
            rule__EnumList__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__EnumList__Group__4_in_rule__EnumList__Group__34907);
            rule__EnumList__Group__4();
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
    // $ANTLR end rule__EnumList__Group__3


    // $ANTLR start rule__EnumList__Group__3__Impl
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2382:1: rule__EnumList__Group__3__Impl : ( '(' ) ;
    public final void rule__EnumList__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2386:1: ( ( '(' ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2387:1: ( '(' )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2387:1: ( '(' )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2388:1: '('
            {
             before(grammarAccess.getEnumListAccess().getLeftParenthesisKeyword_3()); 
            match(input,27,FOLLOW_27_in_rule__EnumList__Group__3__Impl4935); 
             after(grammarAccess.getEnumListAccess().getLeftParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EnumList__Group__3__Impl


    // $ANTLR start rule__EnumList__Group__4
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2401:1: rule__EnumList__Group__4 : rule__EnumList__Group__4__Impl rule__EnumList__Group__5 ;
    public final void rule__EnumList__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2405:1: ( rule__EnumList__Group__4__Impl rule__EnumList__Group__5 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2406:2: rule__EnumList__Group__4__Impl rule__EnumList__Group__5
            {
            pushFollow(FOLLOW_rule__EnumList__Group__4__Impl_in_rule__EnumList__Group__44966);
            rule__EnumList__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__EnumList__Group__5_in_rule__EnumList__Group__44969);
            rule__EnumList__Group__5();
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
    // $ANTLR end rule__EnumList__Group__4


    // $ANTLR start rule__EnumList__Group__4__Impl
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2413:1: rule__EnumList__Group__4__Impl : ( ( ( rule__EnumList__LiteralsAssignment_4 ) ) ( ( rule__EnumList__LiteralsAssignment_4 )* ) ) ;
    public final void rule__EnumList__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2417:1: ( ( ( ( rule__EnumList__LiteralsAssignment_4 ) ) ( ( rule__EnumList__LiteralsAssignment_4 )* ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2418:1: ( ( ( rule__EnumList__LiteralsAssignment_4 ) ) ( ( rule__EnumList__LiteralsAssignment_4 )* ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2418:1: ( ( ( rule__EnumList__LiteralsAssignment_4 ) ) ( ( rule__EnumList__LiteralsAssignment_4 )* ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2419:1: ( ( rule__EnumList__LiteralsAssignment_4 ) ) ( ( rule__EnumList__LiteralsAssignment_4 )* )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2419:1: ( ( rule__EnumList__LiteralsAssignment_4 ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2420:1: ( rule__EnumList__LiteralsAssignment_4 )
            {
             before(grammarAccess.getEnumListAccess().getLiteralsAssignment_4()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2421:1: ( rule__EnumList__LiteralsAssignment_4 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2421:2: rule__EnumList__LiteralsAssignment_4
            {
            pushFollow(FOLLOW_rule__EnumList__LiteralsAssignment_4_in_rule__EnumList__Group__4__Impl4998);
            rule__EnumList__LiteralsAssignment_4();
            _fsp--;


            }

             after(grammarAccess.getEnumListAccess().getLiteralsAssignment_4()); 

            }

            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2424:1: ( ( rule__EnumList__LiteralsAssignment_4 )* )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2425:1: ( rule__EnumList__LiteralsAssignment_4 )*
            {
             before(grammarAccess.getEnumListAccess().getLiteralsAssignment_4()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2426:1: ( rule__EnumList__LiteralsAssignment_4 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_ID) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2426:2: rule__EnumList__LiteralsAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__EnumList__LiteralsAssignment_4_in_rule__EnumList__Group__4__Impl5010);
            	    rule__EnumList__LiteralsAssignment_4();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getEnumListAccess().getLiteralsAssignment_4()); 

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
    // $ANTLR end rule__EnumList__Group__4__Impl


    // $ANTLR start rule__EnumList__Group__5
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2437:1: rule__EnumList__Group__5 : rule__EnumList__Group__5__Impl rule__EnumList__Group__6 ;
    public final void rule__EnumList__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2441:1: ( rule__EnumList__Group__5__Impl rule__EnumList__Group__6 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2442:2: rule__EnumList__Group__5__Impl rule__EnumList__Group__6
            {
            pushFollow(FOLLOW_rule__EnumList__Group__5__Impl_in_rule__EnumList__Group__55043);
            rule__EnumList__Group__5__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__EnumList__Group__6_in_rule__EnumList__Group__55046);
            rule__EnumList__Group__6();
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
    // $ANTLR end rule__EnumList__Group__5


    // $ANTLR start rule__EnumList__Group__5__Impl
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2449:1: rule__EnumList__Group__5__Impl : ( ')' ) ;
    public final void rule__EnumList__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2453:1: ( ( ')' ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2454:1: ( ')' )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2454:1: ( ')' )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2455:1: ')'
            {
             before(grammarAccess.getEnumListAccess().getRightParenthesisKeyword_5()); 
            match(input,28,FOLLOW_28_in_rule__EnumList__Group__5__Impl5074); 
             after(grammarAccess.getEnumListAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EnumList__Group__5__Impl


    // $ANTLR start rule__EnumList__Group__6
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2468:1: rule__EnumList__Group__6 : rule__EnumList__Group__6__Impl rule__EnumList__Group__7 ;
    public final void rule__EnumList__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2472:1: ( rule__EnumList__Group__6__Impl rule__EnumList__Group__7 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2473:2: rule__EnumList__Group__6__Impl rule__EnumList__Group__7
            {
            pushFollow(FOLLOW_rule__EnumList__Group__6__Impl_in_rule__EnumList__Group__65105);
            rule__EnumList__Group__6__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__EnumList__Group__7_in_rule__EnumList__Group__65108);
            rule__EnumList__Group__7();
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
    // $ANTLR end rule__EnumList__Group__6


    // $ANTLR start rule__EnumList__Group__6__Impl
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2480:1: rule__EnumList__Group__6__Impl : ( 'of' ) ;
    public final void rule__EnumList__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2484:1: ( ( 'of' ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2485:1: ( 'of' )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2485:1: ( 'of' )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2486:1: 'of'
            {
             before(grammarAccess.getEnumListAccess().getOfKeyword_6()); 
            match(input,32,FOLLOW_32_in_rule__EnumList__Group__6__Impl5136); 
             after(grammarAccess.getEnumListAccess().getOfKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EnumList__Group__6__Impl


    // $ANTLR start rule__EnumList__Group__7
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2499:1: rule__EnumList__Group__7 : rule__EnumList__Group__7__Impl ;
    public final void rule__EnumList__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2503:1: ( rule__EnumList__Group__7__Impl )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2504:2: rule__EnumList__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__EnumList__Group__7__Impl_in_rule__EnumList__Group__75167);
            rule__EnumList__Group__7__Impl();
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
    // $ANTLR end rule__EnumList__Group__7


    // $ANTLR start rule__EnumList__Group__7__Impl
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2510:1: rule__EnumList__Group__7__Impl : ( ( rule__EnumList__EnumAssignment_7 ) ) ;
    public final void rule__EnumList__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2514:1: ( ( ( rule__EnumList__EnumAssignment_7 ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2515:1: ( ( rule__EnumList__EnumAssignment_7 ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2515:1: ( ( rule__EnumList__EnumAssignment_7 ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2516:1: ( rule__EnumList__EnumAssignment_7 )
            {
             before(grammarAccess.getEnumListAccess().getEnumAssignment_7()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2517:1: ( rule__EnumList__EnumAssignment_7 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2517:2: rule__EnumList__EnumAssignment_7
            {
            pushFollow(FOLLOW_rule__EnumList__EnumAssignment_7_in_rule__EnumList__Group__7__Impl5194);
            rule__EnumList__EnumAssignment_7();
            _fsp--;


            }

             after(grammarAccess.getEnumListAccess().getEnumAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EnumList__Group__7__Impl


    // $ANTLR start rule__DataStore__Group__0
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2543:1: rule__DataStore__Group__0 : rule__DataStore__Group__0__Impl rule__DataStore__Group__1 ;
    public final void rule__DataStore__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2547:1: ( rule__DataStore__Group__0__Impl rule__DataStore__Group__1 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2548:2: rule__DataStore__Group__0__Impl rule__DataStore__Group__1
            {
            pushFollow(FOLLOW_rule__DataStore__Group__0__Impl_in_rule__DataStore__Group__05240);
            rule__DataStore__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DataStore__Group__1_in_rule__DataStore__Group__05243);
            rule__DataStore__Group__1();
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
    // $ANTLR end rule__DataStore__Group__0


    // $ANTLR start rule__DataStore__Group__0__Impl
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2555:1: rule__DataStore__Group__0__Impl : ( 'data-store' ) ;
    public final void rule__DataStore__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2559:1: ( ( 'data-store' ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2560:1: ( 'data-store' )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2560:1: ( 'data-store' )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2561:1: 'data-store'
            {
             before(grammarAccess.getDataStoreAccess().getDataStoreKeyword_0()); 
            match(input,33,FOLLOW_33_in_rule__DataStore__Group__0__Impl5271); 
             after(grammarAccess.getDataStoreAccess().getDataStoreKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DataStore__Group__0__Impl


    // $ANTLR start rule__DataStore__Group__1
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2574:1: rule__DataStore__Group__1 : rule__DataStore__Group__1__Impl rule__DataStore__Group__2 ;
    public final void rule__DataStore__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2578:1: ( rule__DataStore__Group__1__Impl rule__DataStore__Group__2 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2579:2: rule__DataStore__Group__1__Impl rule__DataStore__Group__2
            {
            pushFollow(FOLLOW_rule__DataStore__Group__1__Impl_in_rule__DataStore__Group__15302);
            rule__DataStore__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DataStore__Group__2_in_rule__DataStore__Group__15305);
            rule__DataStore__Group__2();
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
    // $ANTLR end rule__DataStore__Group__1


    // $ANTLR start rule__DataStore__Group__1__Impl
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2586:1: rule__DataStore__Group__1__Impl : ( ( rule__DataStore__NameAssignment_1 ) ) ;
    public final void rule__DataStore__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2590:1: ( ( ( rule__DataStore__NameAssignment_1 ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2591:1: ( ( rule__DataStore__NameAssignment_1 ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2591:1: ( ( rule__DataStore__NameAssignment_1 ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2592:1: ( rule__DataStore__NameAssignment_1 )
            {
             before(grammarAccess.getDataStoreAccess().getNameAssignment_1()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2593:1: ( rule__DataStore__NameAssignment_1 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2593:2: rule__DataStore__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__DataStore__NameAssignment_1_in_rule__DataStore__Group__1__Impl5332);
            rule__DataStore__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getDataStoreAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DataStore__Group__1__Impl


    // $ANTLR start rule__DataStore__Group__2
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2603:1: rule__DataStore__Group__2 : rule__DataStore__Group__2__Impl rule__DataStore__Group__3 ;
    public final void rule__DataStore__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2607:1: ( rule__DataStore__Group__2__Impl rule__DataStore__Group__3 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2608:2: rule__DataStore__Group__2__Impl rule__DataStore__Group__3
            {
            pushFollow(FOLLOW_rule__DataStore__Group__2__Impl_in_rule__DataStore__Group__25362);
            rule__DataStore__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DataStore__Group__3_in_rule__DataStore__Group__25365);
            rule__DataStore__Group__3();
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
    // $ANTLR end rule__DataStore__Group__2


    // $ANTLR start rule__DataStore__Group__2__Impl
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2615:1: rule__DataStore__Group__2__Impl : ( 'of-type' ) ;
    public final void rule__DataStore__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2619:1: ( ( 'of-type' ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2620:1: ( 'of-type' )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2620:1: ( 'of-type' )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2621:1: 'of-type'
            {
             before(grammarAccess.getDataStoreAccess().getOfTypeKeyword_2()); 
            match(input,34,FOLLOW_34_in_rule__DataStore__Group__2__Impl5393); 
             after(grammarAccess.getDataStoreAccess().getOfTypeKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DataStore__Group__2__Impl


    // $ANTLR start rule__DataStore__Group__3
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2634:1: rule__DataStore__Group__3 : rule__DataStore__Group__3__Impl rule__DataStore__Group__4 ;
    public final void rule__DataStore__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2638:1: ( rule__DataStore__Group__3__Impl rule__DataStore__Group__4 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2639:2: rule__DataStore__Group__3__Impl rule__DataStore__Group__4
            {
            pushFollow(FOLLOW_rule__DataStore__Group__3__Impl_in_rule__DataStore__Group__35424);
            rule__DataStore__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DataStore__Group__4_in_rule__DataStore__Group__35427);
            rule__DataStore__Group__4();
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
    // $ANTLR end rule__DataStore__Group__3


    // $ANTLR start rule__DataStore__Group__3__Impl
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2646:1: rule__DataStore__Group__3__Impl : ( ( rule__DataStore__ClassAssignment_3 ) ) ;
    public final void rule__DataStore__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2650:1: ( ( ( rule__DataStore__ClassAssignment_3 ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2651:1: ( ( rule__DataStore__ClassAssignment_3 ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2651:1: ( ( rule__DataStore__ClassAssignment_3 ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2652:1: ( rule__DataStore__ClassAssignment_3 )
            {
             before(grammarAccess.getDataStoreAccess().getClassAssignment_3()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2653:1: ( rule__DataStore__ClassAssignment_3 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2653:2: rule__DataStore__ClassAssignment_3
            {
            pushFollow(FOLLOW_rule__DataStore__ClassAssignment_3_in_rule__DataStore__Group__3__Impl5454);
            rule__DataStore__ClassAssignment_3();
            _fsp--;


            }

             after(grammarAccess.getDataStoreAccess().getClassAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DataStore__Group__3__Impl


    // $ANTLR start rule__DataStore__Group__4
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2663:1: rule__DataStore__Group__4 : rule__DataStore__Group__4__Impl ;
    public final void rule__DataStore__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2667:1: ( rule__DataStore__Group__4__Impl )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2668:2: rule__DataStore__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__DataStore__Group__4__Impl_in_rule__DataStore__Group__45484);
            rule__DataStore__Group__4__Impl();
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
    // $ANTLR end rule__DataStore__Group__4


    // $ANTLR start rule__DataStore__Group__4__Impl
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2674:1: rule__DataStore__Group__4__Impl : ( ( rule__DataStore__MultiAssignment_4 )? ) ;
    public final void rule__DataStore__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2678:1: ( ( ( rule__DataStore__MultiAssignment_4 )? ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2679:1: ( ( rule__DataStore__MultiAssignment_4 )? )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2679:1: ( ( rule__DataStore__MultiAssignment_4 )? )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2680:1: ( rule__DataStore__MultiAssignment_4 )?
            {
             before(grammarAccess.getDataStoreAccess().getMultiAssignment_4()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2681:1: ( rule__DataStore__MultiAssignment_4 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==51) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2681:2: rule__DataStore__MultiAssignment_4
                    {
                    pushFollow(FOLLOW_rule__DataStore__MultiAssignment_4_in_rule__DataStore__Group__4__Impl5511);
                    rule__DataStore__MultiAssignment_4();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDataStoreAccess().getMultiAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DataStore__Group__4__Impl


    // $ANTLR start rule__Field__Group__0
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2701:1: rule__Field__Group__0 : rule__Field__Group__0__Impl rule__Field__Group__1 ;
    public final void rule__Field__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2705:1: ( rule__Field__Group__0__Impl rule__Field__Group__1 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2706:2: rule__Field__Group__0__Impl rule__Field__Group__1
            {
            pushFollow(FOLLOW_rule__Field__Group__0__Impl_in_rule__Field__Group__05552);
            rule__Field__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Field__Group__1_in_rule__Field__Group__05555);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2713:1: rule__Field__Group__0__Impl : ( ( rule__Field__NameAssignment_0 ) ) ;
    public final void rule__Field__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2717:1: ( ( ( rule__Field__NameAssignment_0 ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2718:1: ( ( rule__Field__NameAssignment_0 ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2718:1: ( ( rule__Field__NameAssignment_0 ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2719:1: ( rule__Field__NameAssignment_0 )
            {
             before(grammarAccess.getFieldAccess().getNameAssignment_0()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2720:1: ( rule__Field__NameAssignment_0 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2720:2: rule__Field__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Field__NameAssignment_0_in_rule__Field__Group__0__Impl5582);
            rule__Field__NameAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getFieldAccess().getNameAssignment_0()); 

            }


            }

        }
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2730:1: rule__Field__Group__1 : rule__Field__Group__1__Impl rule__Field__Group__2 ;
    public final void rule__Field__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2734:1: ( rule__Field__Group__1__Impl rule__Field__Group__2 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2735:2: rule__Field__Group__1__Impl rule__Field__Group__2
            {
            pushFollow(FOLLOW_rule__Field__Group__1__Impl_in_rule__Field__Group__15612);
            rule__Field__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Field__Group__2_in_rule__Field__Group__15615);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2742:1: rule__Field__Group__1__Impl : ( ( rule__Field__LabelAssignment_1 ) ) ;
    public final void rule__Field__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2746:1: ( ( ( rule__Field__LabelAssignment_1 ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2747:1: ( ( rule__Field__LabelAssignment_1 ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2747:1: ( ( rule__Field__LabelAssignment_1 ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2748:1: ( rule__Field__LabelAssignment_1 )
            {
             before(grammarAccess.getFieldAccess().getLabelAssignment_1()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2749:1: ( rule__Field__LabelAssignment_1 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2749:2: rule__Field__LabelAssignment_1
            {
            pushFollow(FOLLOW_rule__Field__LabelAssignment_1_in_rule__Field__Group__1__Impl5642);
            rule__Field__LabelAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getFieldAccess().getLabelAssignment_1()); 

            }


            }

        }
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2759:1: rule__Field__Group__2 : rule__Field__Group__2__Impl rule__Field__Group__3 ;
    public final void rule__Field__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2763:1: ( rule__Field__Group__2__Impl rule__Field__Group__3 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2764:2: rule__Field__Group__2__Impl rule__Field__Group__3
            {
            pushFollow(FOLLOW_rule__Field__Group__2__Impl_in_rule__Field__Group__25672);
            rule__Field__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Field__Group__3_in_rule__Field__Group__25675);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2771:1: rule__Field__Group__2__Impl : ( ( rule__Field__PathAssignment_2 ) ) ;
    public final void rule__Field__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2775:1: ( ( ( rule__Field__PathAssignment_2 ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2776:1: ( ( rule__Field__PathAssignment_2 ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2776:1: ( ( rule__Field__PathAssignment_2 ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2777:1: ( rule__Field__PathAssignment_2 )
            {
             before(grammarAccess.getFieldAccess().getPathAssignment_2()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2778:1: ( rule__Field__PathAssignment_2 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2778:2: rule__Field__PathAssignment_2
            {
            pushFollow(FOLLOW_rule__Field__PathAssignment_2_in_rule__Field__Group__2__Impl5702);
            rule__Field__PathAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getFieldAccess().getPathAssignment_2()); 

            }


            }

        }
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2788:1: rule__Field__Group__3 : rule__Field__Group__3__Impl ;
    public final void rule__Field__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2792:1: ( rule__Field__Group__3__Impl )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2793:2: rule__Field__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Field__Group__3__Impl_in_rule__Field__Group__35732);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2799:1: rule__Field__Group__3__Impl : ( ( rule__Field__AttributesAssignment_3 )* ) ;
    public final void rule__Field__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2803:1: ( ( ( rule__Field__AttributesAssignment_3 )* ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2804:1: ( ( rule__Field__AttributesAssignment_3 )* )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2804:1: ( ( rule__Field__AttributesAssignment_3 )* )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2805:1: ( rule__Field__AttributesAssignment_3 )*
            {
             before(grammarAccess.getFieldAccess().getAttributesAssignment_3()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2806:1: ( rule__Field__AttributesAssignment_3 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=11 && LA20_0<=15)||(LA20_0>=41 && LA20_0<=42)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2806:2: rule__Field__AttributesAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Field__AttributesAssignment_3_in_rule__Field__Group__3__Impl5759);
            	    rule__Field__AttributesAssignment_3();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getFieldAccess().getAttributesAssignment_3()); 

            }


            }

        }
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


    // $ANTLR start rule__FieldGroup__Group__0
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2824:1: rule__FieldGroup__Group__0 : rule__FieldGroup__Group__0__Impl rule__FieldGroup__Group__1 ;
    public final void rule__FieldGroup__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2828:1: ( rule__FieldGroup__Group__0__Impl rule__FieldGroup__Group__1 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2829:2: rule__FieldGroup__Group__0__Impl rule__FieldGroup__Group__1
            {
            pushFollow(FOLLOW_rule__FieldGroup__Group__0__Impl_in_rule__FieldGroup__Group__05798);
            rule__FieldGroup__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__FieldGroup__Group__1_in_rule__FieldGroup__Group__05801);
            rule__FieldGroup__Group__1();
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
    // $ANTLR end rule__FieldGroup__Group__0


    // $ANTLR start rule__FieldGroup__Group__0__Impl
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2836:1: rule__FieldGroup__Group__0__Impl : ( 'group' ) ;
    public final void rule__FieldGroup__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2840:1: ( ( 'group' ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2841:1: ( 'group' )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2841:1: ( 'group' )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2842:1: 'group'
            {
             before(grammarAccess.getFieldGroupAccess().getGroupKeyword_0()); 
            match(input,35,FOLLOW_35_in_rule__FieldGroup__Group__0__Impl5829); 
             after(grammarAccess.getFieldGroupAccess().getGroupKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FieldGroup__Group__0__Impl


    // $ANTLR start rule__FieldGroup__Group__1
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2855:1: rule__FieldGroup__Group__1 : rule__FieldGroup__Group__1__Impl rule__FieldGroup__Group__2 ;
    public final void rule__FieldGroup__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2859:1: ( rule__FieldGroup__Group__1__Impl rule__FieldGroup__Group__2 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2860:2: rule__FieldGroup__Group__1__Impl rule__FieldGroup__Group__2
            {
            pushFollow(FOLLOW_rule__FieldGroup__Group__1__Impl_in_rule__FieldGroup__Group__15860);
            rule__FieldGroup__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__FieldGroup__Group__2_in_rule__FieldGroup__Group__15863);
            rule__FieldGroup__Group__2();
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
    // $ANTLR end rule__FieldGroup__Group__1


    // $ANTLR start rule__FieldGroup__Group__1__Impl
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2867:1: rule__FieldGroup__Group__1__Impl : ( ( rule__FieldGroup__LabelAssignment_1 )? ) ;
    public final void rule__FieldGroup__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2871:1: ( ( ( rule__FieldGroup__LabelAssignment_1 )? ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2872:1: ( ( rule__FieldGroup__LabelAssignment_1 )? )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2872:1: ( ( rule__FieldGroup__LabelAssignment_1 )? )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2873:1: ( rule__FieldGroup__LabelAssignment_1 )?
            {
             before(grammarAccess.getFieldGroupAccess().getLabelAssignment_1()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2874:1: ( rule__FieldGroup__LabelAssignment_1 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_STRING) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2874:2: rule__FieldGroup__LabelAssignment_1
                    {
                    pushFollow(FOLLOW_rule__FieldGroup__LabelAssignment_1_in_rule__FieldGroup__Group__1__Impl5890);
                    rule__FieldGroup__LabelAssignment_1();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFieldGroupAccess().getLabelAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FieldGroup__Group__1__Impl


    // $ANTLR start rule__FieldGroup__Group__2
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2884:1: rule__FieldGroup__Group__2 : rule__FieldGroup__Group__2__Impl rule__FieldGroup__Group__3 ;
    public final void rule__FieldGroup__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2888:1: ( rule__FieldGroup__Group__2__Impl rule__FieldGroup__Group__3 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2889:2: rule__FieldGroup__Group__2__Impl rule__FieldGroup__Group__3
            {
            pushFollow(FOLLOW_rule__FieldGroup__Group__2__Impl_in_rule__FieldGroup__Group__25921);
            rule__FieldGroup__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__FieldGroup__Group__3_in_rule__FieldGroup__Group__25924);
            rule__FieldGroup__Group__3();
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
    // $ANTLR end rule__FieldGroup__Group__2


    // $ANTLR start rule__FieldGroup__Group__2__Impl
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2896:1: rule__FieldGroup__Group__2__Impl : ( ( rule__FieldGroup__Group_2__0 )? ) ;
    public final void rule__FieldGroup__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2900:1: ( ( ( rule__FieldGroup__Group_2__0 )? ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2901:1: ( ( rule__FieldGroup__Group_2__0 )? )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2901:1: ( ( rule__FieldGroup__Group_2__0 )? )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2902:1: ( rule__FieldGroup__Group_2__0 )?
            {
             before(grammarAccess.getFieldGroupAccess().getGroup_2()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2903:1: ( rule__FieldGroup__Group_2__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==38) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2903:2: rule__FieldGroup__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__FieldGroup__Group_2__0_in_rule__FieldGroup__Group__2__Impl5951);
                    rule__FieldGroup__Group_2__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFieldGroupAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FieldGroup__Group__2__Impl


    // $ANTLR start rule__FieldGroup__Group__3
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2913:1: rule__FieldGroup__Group__3 : rule__FieldGroup__Group__3__Impl rule__FieldGroup__Group__4 ;
    public final void rule__FieldGroup__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2917:1: ( rule__FieldGroup__Group__3__Impl rule__FieldGroup__Group__4 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2918:2: rule__FieldGroup__Group__3__Impl rule__FieldGroup__Group__4
            {
            pushFollow(FOLLOW_rule__FieldGroup__Group__3__Impl_in_rule__FieldGroup__Group__35982);
            rule__FieldGroup__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__FieldGroup__Group__4_in_rule__FieldGroup__Group__35985);
            rule__FieldGroup__Group__4();
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
    // $ANTLR end rule__FieldGroup__Group__3


    // $ANTLR start rule__FieldGroup__Group__3__Impl
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2925:1: rule__FieldGroup__Group__3__Impl : ( '{' ) ;
    public final void rule__FieldGroup__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2929:1: ( ( '{' ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2930:1: ( '{' )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2930:1: ( '{' )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2931:1: '{'
            {
             before(grammarAccess.getFieldGroupAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,36,FOLLOW_36_in_rule__FieldGroup__Group__3__Impl6013); 
             after(grammarAccess.getFieldGroupAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FieldGroup__Group__3__Impl


    // $ANTLR start rule__FieldGroup__Group__4
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2944:1: rule__FieldGroup__Group__4 : rule__FieldGroup__Group__4__Impl rule__FieldGroup__Group__5 ;
    public final void rule__FieldGroup__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2948:1: ( rule__FieldGroup__Group__4__Impl rule__FieldGroup__Group__5 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2949:2: rule__FieldGroup__Group__4__Impl rule__FieldGroup__Group__5
            {
            pushFollow(FOLLOW_rule__FieldGroup__Group__4__Impl_in_rule__FieldGroup__Group__46044);
            rule__FieldGroup__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__FieldGroup__Group__5_in_rule__FieldGroup__Group__46047);
            rule__FieldGroup__Group__5();
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
    // $ANTLR end rule__FieldGroup__Group__4


    // $ANTLR start rule__FieldGroup__Group__4__Impl
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2956:1: rule__FieldGroup__Group__4__Impl : ( ( ( rule__FieldGroup__ElementsAssignment_4 ) ) ( ( rule__FieldGroup__ElementsAssignment_4 )* ) ) ;
    public final void rule__FieldGroup__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2960:1: ( ( ( ( rule__FieldGroup__ElementsAssignment_4 ) ) ( ( rule__FieldGroup__ElementsAssignment_4 )* ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2961:1: ( ( ( rule__FieldGroup__ElementsAssignment_4 ) ) ( ( rule__FieldGroup__ElementsAssignment_4 )* ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2961:1: ( ( ( rule__FieldGroup__ElementsAssignment_4 ) ) ( ( rule__FieldGroup__ElementsAssignment_4 )* ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2962:1: ( ( rule__FieldGroup__ElementsAssignment_4 ) ) ( ( rule__FieldGroup__ElementsAssignment_4 )* )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2962:1: ( ( rule__FieldGroup__ElementsAssignment_4 ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2963:1: ( rule__FieldGroup__ElementsAssignment_4 )
            {
             before(grammarAccess.getFieldGroupAccess().getElementsAssignment_4()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2964:1: ( rule__FieldGroup__ElementsAssignment_4 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2964:2: rule__FieldGroup__ElementsAssignment_4
            {
            pushFollow(FOLLOW_rule__FieldGroup__ElementsAssignment_4_in_rule__FieldGroup__Group__4__Impl6076);
            rule__FieldGroup__ElementsAssignment_4();
            _fsp--;


            }

             after(grammarAccess.getFieldGroupAccess().getElementsAssignment_4()); 

            }

            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2967:1: ( ( rule__FieldGroup__ElementsAssignment_4 )* )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2968:1: ( rule__FieldGroup__ElementsAssignment_4 )*
            {
             before(grammarAccess.getFieldGroupAccess().getElementsAssignment_4()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2969:1: ( rule__FieldGroup__ElementsAssignment_4 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_ID||LA23_0==35) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2969:2: rule__FieldGroup__ElementsAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__FieldGroup__ElementsAssignment_4_in_rule__FieldGroup__Group__4__Impl6088);
            	    rule__FieldGroup__ElementsAssignment_4();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getFieldGroupAccess().getElementsAssignment_4()); 

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
    // $ANTLR end rule__FieldGroup__Group__4__Impl


    // $ANTLR start rule__FieldGroup__Group__5
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2980:1: rule__FieldGroup__Group__5 : rule__FieldGroup__Group__5__Impl rule__FieldGroup__Group__6 ;
    public final void rule__FieldGroup__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2984:1: ( rule__FieldGroup__Group__5__Impl rule__FieldGroup__Group__6 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2985:2: rule__FieldGroup__Group__5__Impl rule__FieldGroup__Group__6
            {
            pushFollow(FOLLOW_rule__FieldGroup__Group__5__Impl_in_rule__FieldGroup__Group__56121);
            rule__FieldGroup__Group__5__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__FieldGroup__Group__6_in_rule__FieldGroup__Group__56124);
            rule__FieldGroup__Group__6();
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
    // $ANTLR end rule__FieldGroup__Group__5


    // $ANTLR start rule__FieldGroup__Group__5__Impl
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2992:1: rule__FieldGroup__Group__5__Impl : ( '}' ) ;
    public final void rule__FieldGroup__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2996:1: ( ( '}' ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2997:1: ( '}' )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2997:1: ( '}' )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2998:1: '}'
            {
             before(grammarAccess.getFieldGroupAccess().getRightCurlyBracketKeyword_5()); 
            match(input,37,FOLLOW_37_in_rule__FieldGroup__Group__5__Impl6152); 
             after(grammarAccess.getFieldGroupAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FieldGroup__Group__5__Impl


    // $ANTLR start rule__FieldGroup__Group__6
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3011:1: rule__FieldGroup__Group__6 : rule__FieldGroup__Group__6__Impl ;
    public final void rule__FieldGroup__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3015:1: ( rule__FieldGroup__Group__6__Impl )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3016:2: rule__FieldGroup__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__FieldGroup__Group__6__Impl_in_rule__FieldGroup__Group__66183);
            rule__FieldGroup__Group__6__Impl();
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
    // $ANTLR end rule__FieldGroup__Group__6


    // $ANTLR start rule__FieldGroup__Group__6__Impl
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3022:1: rule__FieldGroup__Group__6__Impl : ( ( rule__FieldGroup__AttributesAssignment_6 )* ) ;
    public final void rule__FieldGroup__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3026:1: ( ( ( rule__FieldGroup__AttributesAssignment_6 )* ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3027:1: ( ( rule__FieldGroup__AttributesAssignment_6 )* )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3027:1: ( ( rule__FieldGroup__AttributesAssignment_6 )* )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3028:1: ( rule__FieldGroup__AttributesAssignment_6 )*
            {
             before(grammarAccess.getFieldGroupAccess().getAttributesAssignment_6()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3029:1: ( rule__FieldGroup__AttributesAssignment_6 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=11 && LA24_0<=15)||(LA24_0>=41 && LA24_0<=42)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3029:2: rule__FieldGroup__AttributesAssignment_6
            	    {
            	    pushFollow(FOLLOW_rule__FieldGroup__AttributesAssignment_6_in_rule__FieldGroup__Group__6__Impl6210);
            	    rule__FieldGroup__AttributesAssignment_6();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getFieldGroupAccess().getAttributesAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FieldGroup__Group__6__Impl


    // $ANTLR start rule__FieldGroup__Group_2__0
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3053:1: rule__FieldGroup__Group_2__0 : rule__FieldGroup__Group_2__0__Impl rule__FieldGroup__Group_2__1 ;
    public final void rule__FieldGroup__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3057:1: ( rule__FieldGroup__Group_2__0__Impl rule__FieldGroup__Group_2__1 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3058:2: rule__FieldGroup__Group_2__0__Impl rule__FieldGroup__Group_2__1
            {
            pushFollow(FOLLOW_rule__FieldGroup__Group_2__0__Impl_in_rule__FieldGroup__Group_2__06255);
            rule__FieldGroup__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__FieldGroup__Group_2__1_in_rule__FieldGroup__Group_2__06258);
            rule__FieldGroup__Group_2__1();
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
    // $ANTLR end rule__FieldGroup__Group_2__0


    // $ANTLR start rule__FieldGroup__Group_2__0__Impl
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3065:1: rule__FieldGroup__Group_2__0__Impl : ( 'with' ) ;
    public final void rule__FieldGroup__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3069:1: ( ( 'with' ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3070:1: ( 'with' )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3070:1: ( 'with' )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3071:1: 'with'
            {
             before(grammarAccess.getFieldGroupAccess().getWithKeyword_2_0()); 
            match(input,38,FOLLOW_38_in_rule__FieldGroup__Group_2__0__Impl6286); 
             after(grammarAccess.getFieldGroupAccess().getWithKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FieldGroup__Group_2__0__Impl


    // $ANTLR start rule__FieldGroup__Group_2__1
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3084:1: rule__FieldGroup__Group_2__1 : rule__FieldGroup__Group_2__1__Impl ;
    public final void rule__FieldGroup__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3088:1: ( rule__FieldGroup__Group_2__1__Impl )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3089:2: rule__FieldGroup__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__FieldGroup__Group_2__1__Impl_in_rule__FieldGroup__Group_2__16317);
            rule__FieldGroup__Group_2__1__Impl();
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
    // $ANTLR end rule__FieldGroup__Group_2__1


    // $ANTLR start rule__FieldGroup__Group_2__1__Impl
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3095:1: rule__FieldGroup__Group_2__1__Impl : ( ( rule__FieldGroup__WithAssignment_2_1 ) ) ;
    public final void rule__FieldGroup__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3099:1: ( ( ( rule__FieldGroup__WithAssignment_2_1 ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3100:1: ( ( rule__FieldGroup__WithAssignment_2_1 ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3100:1: ( ( rule__FieldGroup__WithAssignment_2_1 ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3101:1: ( rule__FieldGroup__WithAssignment_2_1 )
            {
             before(grammarAccess.getFieldGroupAccess().getWithAssignment_2_1()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3102:1: ( rule__FieldGroup__WithAssignment_2_1 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3102:2: rule__FieldGroup__WithAssignment_2_1
            {
            pushFollow(FOLLOW_rule__FieldGroup__WithAssignment_2_1_in_rule__FieldGroup__Group_2__1__Impl6344);
            rule__FieldGroup__WithAssignment_2_1();
            _fsp--;


            }

             after(grammarAccess.getFieldGroupAccess().getWithAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FieldGroup__Group_2__1__Impl


    // $ANTLR start rule__NormalAttribute__Group__0
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3116:1: rule__NormalAttribute__Group__0 : rule__NormalAttribute__Group__0__Impl rule__NormalAttribute__Group__1 ;
    public final void rule__NormalAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3120:1: ( rule__NormalAttribute__Group__0__Impl rule__NormalAttribute__Group__1 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3121:2: rule__NormalAttribute__Group__0__Impl rule__NormalAttribute__Group__1
            {
            pushFollow(FOLLOW_rule__NormalAttribute__Group__0__Impl_in_rule__NormalAttribute__Group__06378);
            rule__NormalAttribute__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__NormalAttribute__Group__1_in_rule__NormalAttribute__Group__06381);
            rule__NormalAttribute__Group__1();
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
    // $ANTLR end rule__NormalAttribute__Group__0


    // $ANTLR start rule__NormalAttribute__Group__0__Impl
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3128:1: rule__NormalAttribute__Group__0__Impl : ( ( rule__NormalAttribute__ClassExprAssignment_0 ) ) ;
    public final void rule__NormalAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3132:1: ( ( ( rule__NormalAttribute__ClassExprAssignment_0 ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3133:1: ( ( rule__NormalAttribute__ClassExprAssignment_0 ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3133:1: ( ( rule__NormalAttribute__ClassExprAssignment_0 ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3134:1: ( rule__NormalAttribute__ClassExprAssignment_0 )
            {
             before(grammarAccess.getNormalAttributeAccess().getClassExprAssignment_0()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3135:1: ( rule__NormalAttribute__ClassExprAssignment_0 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3135:2: rule__NormalAttribute__ClassExprAssignment_0
            {
            pushFollow(FOLLOW_rule__NormalAttribute__ClassExprAssignment_0_in_rule__NormalAttribute__Group__0__Impl6408);
            rule__NormalAttribute__ClassExprAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getNormalAttributeAccess().getClassExprAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__NormalAttribute__Group__0__Impl


    // $ANTLR start rule__NormalAttribute__Group__1
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3145:1: rule__NormalAttribute__Group__1 : rule__NormalAttribute__Group__1__Impl ;
    public final void rule__NormalAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3149:1: ( rule__NormalAttribute__Group__1__Impl )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3150:2: rule__NormalAttribute__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__NormalAttribute__Group__1__Impl_in_rule__NormalAttribute__Group__16438);
            rule__NormalAttribute__Group__1__Impl();
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
    // $ANTLR end rule__NormalAttribute__Group__1


    // $ANTLR start rule__NormalAttribute__Group__1__Impl
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3156:1: rule__NormalAttribute__Group__1__Impl : ( ( rule__NormalAttribute__Group_1__0 )? ) ;
    public final void rule__NormalAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3160:1: ( ( ( rule__NormalAttribute__Group_1__0 )? ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3161:1: ( ( rule__NormalAttribute__Group_1__0 )? )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3161:1: ( ( rule__NormalAttribute__Group_1__0 )? )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3162:1: ( rule__NormalAttribute__Group_1__0 )?
            {
             before(grammarAccess.getNormalAttributeAccess().getGroup_1()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3163:1: ( rule__NormalAttribute__Group_1__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==39) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3163:2: rule__NormalAttribute__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__NormalAttribute__Group_1__0_in_rule__NormalAttribute__Group__1__Impl6465);
                    rule__NormalAttribute__Group_1__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNormalAttributeAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__NormalAttribute__Group__1__Impl


    // $ANTLR start rule__NormalAttribute__Group_1__0
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3177:1: rule__NormalAttribute__Group_1__0 : rule__NormalAttribute__Group_1__0__Impl rule__NormalAttribute__Group_1__1 ;
    public final void rule__NormalAttribute__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3181:1: ( rule__NormalAttribute__Group_1__0__Impl rule__NormalAttribute__Group_1__1 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3182:2: rule__NormalAttribute__Group_1__0__Impl rule__NormalAttribute__Group_1__1
            {
            pushFollow(FOLLOW_rule__NormalAttribute__Group_1__0__Impl_in_rule__NormalAttribute__Group_1__06500);
            rule__NormalAttribute__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__NormalAttribute__Group_1__1_in_rule__NormalAttribute__Group_1__06503);
            rule__NormalAttribute__Group_1__1();
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
    // $ANTLR end rule__NormalAttribute__Group_1__0


    // $ANTLR start rule__NormalAttribute__Group_1__0__Impl
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3189:1: rule__NormalAttribute__Group_1__0__Impl : ( 'if' ) ;
    public final void rule__NormalAttribute__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3193:1: ( ( 'if' ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3194:1: ( 'if' )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3194:1: ( 'if' )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3195:1: 'if'
            {
             before(grammarAccess.getNormalAttributeAccess().getIfKeyword_1_0()); 
            match(input,39,FOLLOW_39_in_rule__NormalAttribute__Group_1__0__Impl6531); 
             after(grammarAccess.getNormalAttributeAccess().getIfKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__NormalAttribute__Group_1__0__Impl


    // $ANTLR start rule__NormalAttribute__Group_1__1
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3208:1: rule__NormalAttribute__Group_1__1 : rule__NormalAttribute__Group_1__1__Impl ;
    public final void rule__NormalAttribute__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3212:1: ( rule__NormalAttribute__Group_1__1__Impl )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3213:2: rule__NormalAttribute__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__NormalAttribute__Group_1__1__Impl_in_rule__NormalAttribute__Group_1__16562);
            rule__NormalAttribute__Group_1__1__Impl();
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
    // $ANTLR end rule__NormalAttribute__Group_1__1


    // $ANTLR start rule__NormalAttribute__Group_1__1__Impl
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3219:1: rule__NormalAttribute__Group_1__1__Impl : ( ( rule__NormalAttribute__ClauseAssignment_1_1 ) ) ;
    public final void rule__NormalAttribute__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3223:1: ( ( ( rule__NormalAttribute__ClauseAssignment_1_1 ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3224:1: ( ( rule__NormalAttribute__ClauseAssignment_1_1 ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3224:1: ( ( rule__NormalAttribute__ClauseAssignment_1_1 ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3225:1: ( rule__NormalAttribute__ClauseAssignment_1_1 )
            {
             before(grammarAccess.getNormalAttributeAccess().getClauseAssignment_1_1()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3226:1: ( rule__NormalAttribute__ClauseAssignment_1_1 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3226:2: rule__NormalAttribute__ClauseAssignment_1_1
            {
            pushFollow(FOLLOW_rule__NormalAttribute__ClauseAssignment_1_1_in_rule__NormalAttribute__Group_1__1__Impl6589);
            rule__NormalAttribute__ClauseAssignment_1_1();
            _fsp--;


            }

             after(grammarAccess.getNormalAttributeAccess().getClauseAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__NormalAttribute__Group_1__1__Impl


    // $ANTLR start rule__AttributeClassExpression__Group__0
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3240:1: rule__AttributeClassExpression__Group__0 : rule__AttributeClassExpression__Group__0__Impl rule__AttributeClassExpression__Group__1 ;
    public final void rule__AttributeClassExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3244:1: ( rule__AttributeClassExpression__Group__0__Impl rule__AttributeClassExpression__Group__1 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3245:2: rule__AttributeClassExpression__Group__0__Impl rule__AttributeClassExpression__Group__1
            {
            pushFollow(FOLLOW_rule__AttributeClassExpression__Group__0__Impl_in_rule__AttributeClassExpression__Group__06623);
            rule__AttributeClassExpression__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__AttributeClassExpression__Group__1_in_rule__AttributeClassExpression__Group__06626);
            rule__AttributeClassExpression__Group__1();
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
    // $ANTLR end rule__AttributeClassExpression__Group__0


    // $ANTLR start rule__AttributeClassExpression__Group__0__Impl
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3252:1: rule__AttributeClassExpression__Group__0__Impl : ( ( rule__AttributeClassExpression__ClassesAssignment_0 ) ) ;
    public final void rule__AttributeClassExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3256:1: ( ( ( rule__AttributeClassExpression__ClassesAssignment_0 ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3257:1: ( ( rule__AttributeClassExpression__ClassesAssignment_0 ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3257:1: ( ( rule__AttributeClassExpression__ClassesAssignment_0 ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3258:1: ( rule__AttributeClassExpression__ClassesAssignment_0 )
            {
             before(grammarAccess.getAttributeClassExpressionAccess().getClassesAssignment_0()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3259:1: ( rule__AttributeClassExpression__ClassesAssignment_0 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3259:2: rule__AttributeClassExpression__ClassesAssignment_0
            {
            pushFollow(FOLLOW_rule__AttributeClassExpression__ClassesAssignment_0_in_rule__AttributeClassExpression__Group__0__Impl6653);
            rule__AttributeClassExpression__ClassesAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getAttributeClassExpressionAccess().getClassesAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AttributeClassExpression__Group__0__Impl


    // $ANTLR start rule__AttributeClassExpression__Group__1
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3269:1: rule__AttributeClassExpression__Group__1 : rule__AttributeClassExpression__Group__1__Impl ;
    public final void rule__AttributeClassExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3273:1: ( rule__AttributeClassExpression__Group__1__Impl )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3274:2: rule__AttributeClassExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__AttributeClassExpression__Group__1__Impl_in_rule__AttributeClassExpression__Group__16683);
            rule__AttributeClassExpression__Group__1__Impl();
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
    // $ANTLR end rule__AttributeClassExpression__Group__1


    // $ANTLR start rule__AttributeClassExpression__Group__1__Impl
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3280:1: rule__AttributeClassExpression__Group__1__Impl : ( ( rule__AttributeClassExpression__Group_1__0 )* ) ;
    public final void rule__AttributeClassExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3284:1: ( ( ( rule__AttributeClassExpression__Group_1__0 )* ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3285:1: ( ( rule__AttributeClassExpression__Group_1__0 )* )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3285:1: ( ( rule__AttributeClassExpression__Group_1__0 )* )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3286:1: ( rule__AttributeClassExpression__Group_1__0 )*
            {
             before(grammarAccess.getAttributeClassExpressionAccess().getGroup_1()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3287:1: ( rule__AttributeClassExpression__Group_1__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==40) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3287:2: rule__AttributeClassExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__AttributeClassExpression__Group_1__0_in_rule__AttributeClassExpression__Group__1__Impl6710);
            	    rule__AttributeClassExpression__Group_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getAttributeClassExpressionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AttributeClassExpression__Group__1__Impl


    // $ANTLR start rule__AttributeClassExpression__Group_1__0
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3301:1: rule__AttributeClassExpression__Group_1__0 : rule__AttributeClassExpression__Group_1__0__Impl rule__AttributeClassExpression__Group_1__1 ;
    public final void rule__AttributeClassExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3305:1: ( rule__AttributeClassExpression__Group_1__0__Impl rule__AttributeClassExpression__Group_1__1 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3306:2: rule__AttributeClassExpression__Group_1__0__Impl rule__AttributeClassExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__AttributeClassExpression__Group_1__0__Impl_in_rule__AttributeClassExpression__Group_1__06745);
            rule__AttributeClassExpression__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__AttributeClassExpression__Group_1__1_in_rule__AttributeClassExpression__Group_1__06748);
            rule__AttributeClassExpression__Group_1__1();
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
    // $ANTLR end rule__AttributeClassExpression__Group_1__0


    // $ANTLR start rule__AttributeClassExpression__Group_1__0__Impl
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3313:1: rule__AttributeClassExpression__Group_1__0__Impl : ( '+' ) ;
    public final void rule__AttributeClassExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3317:1: ( ( '+' ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3318:1: ( '+' )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3318:1: ( '+' )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3319:1: '+'
            {
             before(grammarAccess.getAttributeClassExpressionAccess().getPlusSignKeyword_1_0()); 
            match(input,40,FOLLOW_40_in_rule__AttributeClassExpression__Group_1__0__Impl6776); 
             after(grammarAccess.getAttributeClassExpressionAccess().getPlusSignKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AttributeClassExpression__Group_1__0__Impl


    // $ANTLR start rule__AttributeClassExpression__Group_1__1
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3332:1: rule__AttributeClassExpression__Group_1__1 : rule__AttributeClassExpression__Group_1__1__Impl ;
    public final void rule__AttributeClassExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3336:1: ( rule__AttributeClassExpression__Group_1__1__Impl )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3337:2: rule__AttributeClassExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__AttributeClassExpression__Group_1__1__Impl_in_rule__AttributeClassExpression__Group_1__16807);
            rule__AttributeClassExpression__Group_1__1__Impl();
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
    // $ANTLR end rule__AttributeClassExpression__Group_1__1


    // $ANTLR start rule__AttributeClassExpression__Group_1__1__Impl
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3343:1: rule__AttributeClassExpression__Group_1__1__Impl : ( ( rule__AttributeClassExpression__ClassesAssignment_1_1 ) ) ;
    public final void rule__AttributeClassExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3347:1: ( ( ( rule__AttributeClassExpression__ClassesAssignment_1_1 ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3348:1: ( ( rule__AttributeClassExpression__ClassesAssignment_1_1 ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3348:1: ( ( rule__AttributeClassExpression__ClassesAssignment_1_1 ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3349:1: ( rule__AttributeClassExpression__ClassesAssignment_1_1 )
            {
             before(grammarAccess.getAttributeClassExpressionAccess().getClassesAssignment_1_1()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3350:1: ( rule__AttributeClassExpression__ClassesAssignment_1_1 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3350:2: rule__AttributeClassExpression__ClassesAssignment_1_1
            {
            pushFollow(FOLLOW_rule__AttributeClassExpression__ClassesAssignment_1_1_in_rule__AttributeClassExpression__Group_1__1__Impl6834);
            rule__AttributeClassExpression__ClassesAssignment_1_1();
            _fsp--;


            }

             after(grammarAccess.getAttributeClassExpressionAccess().getClassesAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AttributeClassExpression__Group_1__1__Impl


    // $ANTLR start rule__RestrictionAttribute__Group__0
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3364:1: rule__RestrictionAttribute__Group__0 : rule__RestrictionAttribute__Group__0__Impl rule__RestrictionAttribute__Group__1 ;
    public final void rule__RestrictionAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3368:1: ( rule__RestrictionAttribute__Group__0__Impl rule__RestrictionAttribute__Group__1 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3369:2: rule__RestrictionAttribute__Group__0__Impl rule__RestrictionAttribute__Group__1
            {
            pushFollow(FOLLOW_rule__RestrictionAttribute__Group__0__Impl_in_rule__RestrictionAttribute__Group__06868);
            rule__RestrictionAttribute__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__RestrictionAttribute__Group__1_in_rule__RestrictionAttribute__Group__06871);
            rule__RestrictionAttribute__Group__1();
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
    // $ANTLR end rule__RestrictionAttribute__Group__0


    // $ANTLR start rule__RestrictionAttribute__Group__0__Impl
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3376:1: rule__RestrictionAttribute__Group__0__Impl : ( 'restrict-to' ) ;
    public final void rule__RestrictionAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3380:1: ( ( 'restrict-to' ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3381:1: ( 'restrict-to' )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3381:1: ( 'restrict-to' )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3382:1: 'restrict-to'
            {
             before(grammarAccess.getRestrictionAttributeAccess().getRestrictToKeyword_0()); 
            match(input,41,FOLLOW_41_in_rule__RestrictionAttribute__Group__0__Impl6899); 
             after(grammarAccess.getRestrictionAttributeAccess().getRestrictToKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RestrictionAttribute__Group__0__Impl


    // $ANTLR start rule__RestrictionAttribute__Group__1
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3395:1: rule__RestrictionAttribute__Group__1 : rule__RestrictionAttribute__Group__1__Impl rule__RestrictionAttribute__Group__2 ;
    public final void rule__RestrictionAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3399:1: ( rule__RestrictionAttribute__Group__1__Impl rule__RestrictionAttribute__Group__2 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3400:2: rule__RestrictionAttribute__Group__1__Impl rule__RestrictionAttribute__Group__2
            {
            pushFollow(FOLLOW_rule__RestrictionAttribute__Group__1__Impl_in_rule__RestrictionAttribute__Group__16930);
            rule__RestrictionAttribute__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__RestrictionAttribute__Group__2_in_rule__RestrictionAttribute__Group__16933);
            rule__RestrictionAttribute__Group__2();
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
    // $ANTLR end rule__RestrictionAttribute__Group__1


    // $ANTLR start rule__RestrictionAttribute__Group__1__Impl
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3407:1: rule__RestrictionAttribute__Group__1__Impl : ( ( rule__RestrictionAttribute__LiteralsAssignment_1 ) ) ;
    public final void rule__RestrictionAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3411:1: ( ( ( rule__RestrictionAttribute__LiteralsAssignment_1 ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3412:1: ( ( rule__RestrictionAttribute__LiteralsAssignment_1 ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3412:1: ( ( rule__RestrictionAttribute__LiteralsAssignment_1 ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3413:1: ( rule__RestrictionAttribute__LiteralsAssignment_1 )
            {
             before(grammarAccess.getRestrictionAttributeAccess().getLiteralsAssignment_1()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3414:1: ( rule__RestrictionAttribute__LiteralsAssignment_1 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3414:2: rule__RestrictionAttribute__LiteralsAssignment_1
            {
            pushFollow(FOLLOW_rule__RestrictionAttribute__LiteralsAssignment_1_in_rule__RestrictionAttribute__Group__1__Impl6960);
            rule__RestrictionAttribute__LiteralsAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getRestrictionAttributeAccess().getLiteralsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RestrictionAttribute__Group__1__Impl


    // $ANTLR start rule__RestrictionAttribute__Group__2
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3424:1: rule__RestrictionAttribute__Group__2 : rule__RestrictionAttribute__Group__2__Impl rule__RestrictionAttribute__Group__3 ;
    public final void rule__RestrictionAttribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3428:1: ( rule__RestrictionAttribute__Group__2__Impl rule__RestrictionAttribute__Group__3 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3429:2: rule__RestrictionAttribute__Group__2__Impl rule__RestrictionAttribute__Group__3
            {
            pushFollow(FOLLOW_rule__RestrictionAttribute__Group__2__Impl_in_rule__RestrictionAttribute__Group__26990);
            rule__RestrictionAttribute__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__RestrictionAttribute__Group__3_in_rule__RestrictionAttribute__Group__26993);
            rule__RestrictionAttribute__Group__3();
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
    // $ANTLR end rule__RestrictionAttribute__Group__2


    // $ANTLR start rule__RestrictionAttribute__Group__2__Impl
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3436:1: rule__RestrictionAttribute__Group__2__Impl : ( 'if' ) ;
    public final void rule__RestrictionAttribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3440:1: ( ( 'if' ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3441:1: ( 'if' )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3441:1: ( 'if' )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3442:1: 'if'
            {
             before(grammarAccess.getRestrictionAttributeAccess().getIfKeyword_2()); 
            match(input,39,FOLLOW_39_in_rule__RestrictionAttribute__Group__2__Impl7021); 
             after(grammarAccess.getRestrictionAttributeAccess().getIfKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RestrictionAttribute__Group__2__Impl


    // $ANTLR start rule__RestrictionAttribute__Group__3
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3455:1: rule__RestrictionAttribute__Group__3 : rule__RestrictionAttribute__Group__3__Impl ;
    public final void rule__RestrictionAttribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3459:1: ( rule__RestrictionAttribute__Group__3__Impl )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3460:2: rule__RestrictionAttribute__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__RestrictionAttribute__Group__3__Impl_in_rule__RestrictionAttribute__Group__37052);
            rule__RestrictionAttribute__Group__3__Impl();
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
    // $ANTLR end rule__RestrictionAttribute__Group__3


    // $ANTLR start rule__RestrictionAttribute__Group__3__Impl
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3466:1: rule__RestrictionAttribute__Group__3__Impl : ( ( rule__RestrictionAttribute__ClauseAssignment_3 ) ) ;
    public final void rule__RestrictionAttribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3470:1: ( ( ( rule__RestrictionAttribute__ClauseAssignment_3 ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3471:1: ( ( rule__RestrictionAttribute__ClauseAssignment_3 ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3471:1: ( ( rule__RestrictionAttribute__ClauseAssignment_3 ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3472:1: ( rule__RestrictionAttribute__ClauseAssignment_3 )
            {
             before(grammarAccess.getRestrictionAttributeAccess().getClauseAssignment_3()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3473:1: ( rule__RestrictionAttribute__ClauseAssignment_3 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3473:2: rule__RestrictionAttribute__ClauseAssignment_3
            {
            pushFollow(FOLLOW_rule__RestrictionAttribute__ClauseAssignment_3_in_rule__RestrictionAttribute__Group__3__Impl7079);
            rule__RestrictionAttribute__ClauseAssignment_3();
            _fsp--;


            }

             after(grammarAccess.getRestrictionAttributeAccess().getClauseAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RestrictionAttribute__Group__3__Impl


    // $ANTLR start rule__RestrictionGroupAttribute__Group__0
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3491:1: rule__RestrictionGroupAttribute__Group__0 : rule__RestrictionGroupAttribute__Group__0__Impl rule__RestrictionGroupAttribute__Group__1 ;
    public final void rule__RestrictionGroupAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3495:1: ( rule__RestrictionGroupAttribute__Group__0__Impl rule__RestrictionGroupAttribute__Group__1 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3496:2: rule__RestrictionGroupAttribute__Group__0__Impl rule__RestrictionGroupAttribute__Group__1
            {
            pushFollow(FOLLOW_rule__RestrictionGroupAttribute__Group__0__Impl_in_rule__RestrictionGroupAttribute__Group__07117);
            rule__RestrictionGroupAttribute__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__RestrictionGroupAttribute__Group__1_in_rule__RestrictionGroupAttribute__Group__07120);
            rule__RestrictionGroupAttribute__Group__1();
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
    // $ANTLR end rule__RestrictionGroupAttribute__Group__0


    // $ANTLR start rule__RestrictionGroupAttribute__Group__0__Impl
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3503:1: rule__RestrictionGroupAttribute__Group__0__Impl : ( () ) ;
    public final void rule__RestrictionGroupAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3507:1: ( ( () ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3508:1: ( () )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3508:1: ( () )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3509:1: ()
            {
             before(grammarAccess.getRestrictionGroupAttributeAccess().getRestrictionGroupAttributeAction_0()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3510:1: ()
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3512:1: 
            {
            }

             after(grammarAccess.getRestrictionGroupAttributeAccess().getRestrictionGroupAttributeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RestrictionGroupAttribute__Group__0__Impl


    // $ANTLR start rule__RestrictionGroupAttribute__Group__1
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3522:1: rule__RestrictionGroupAttribute__Group__1 : rule__RestrictionGroupAttribute__Group__1__Impl rule__RestrictionGroupAttribute__Group__2 ;
    public final void rule__RestrictionGroupAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3526:1: ( rule__RestrictionGroupAttribute__Group__1__Impl rule__RestrictionGroupAttribute__Group__2 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3527:2: rule__RestrictionGroupAttribute__Group__1__Impl rule__RestrictionGroupAttribute__Group__2
            {
            pushFollow(FOLLOW_rule__RestrictionGroupAttribute__Group__1__Impl_in_rule__RestrictionGroupAttribute__Group__17178);
            rule__RestrictionGroupAttribute__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__RestrictionGroupAttribute__Group__2_in_rule__RestrictionGroupAttribute__Group__17181);
            rule__RestrictionGroupAttribute__Group__2();
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
    // $ANTLR end rule__RestrictionGroupAttribute__Group__1


    // $ANTLR start rule__RestrictionGroupAttribute__Group__1__Impl
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3534:1: rule__RestrictionGroupAttribute__Group__1__Impl : ( 'restrict-to-group' ) ;
    public final void rule__RestrictionGroupAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3538:1: ( ( 'restrict-to-group' ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3539:1: ( 'restrict-to-group' )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3539:1: ( 'restrict-to-group' )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3540:1: 'restrict-to-group'
            {
             before(grammarAccess.getRestrictionGroupAttributeAccess().getRestrictToGroupKeyword_1()); 
            match(input,42,FOLLOW_42_in_rule__RestrictionGroupAttribute__Group__1__Impl7209); 
             after(grammarAccess.getRestrictionGroupAttributeAccess().getRestrictToGroupKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RestrictionGroupAttribute__Group__1__Impl


    // $ANTLR start rule__RestrictionGroupAttribute__Group__2
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3553:1: rule__RestrictionGroupAttribute__Group__2 : rule__RestrictionGroupAttribute__Group__2__Impl rule__RestrictionGroupAttribute__Group__3 ;
    public final void rule__RestrictionGroupAttribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3557:1: ( rule__RestrictionGroupAttribute__Group__2__Impl rule__RestrictionGroupAttribute__Group__3 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3558:2: rule__RestrictionGroupAttribute__Group__2__Impl rule__RestrictionGroupAttribute__Group__3
            {
            pushFollow(FOLLOW_rule__RestrictionGroupAttribute__Group__2__Impl_in_rule__RestrictionGroupAttribute__Group__27240);
            rule__RestrictionGroupAttribute__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__RestrictionGroupAttribute__Group__3_in_rule__RestrictionGroupAttribute__Group__27243);
            rule__RestrictionGroupAttribute__Group__3();
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
    // $ANTLR end rule__RestrictionGroupAttribute__Group__2


    // $ANTLR start rule__RestrictionGroupAttribute__Group__2__Impl
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3565:1: rule__RestrictionGroupAttribute__Group__2__Impl : ( '<' ) ;
    public final void rule__RestrictionGroupAttribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3569:1: ( ( '<' ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3570:1: ( '<' )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3570:1: ( '<' )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3571:1: '<'
            {
             before(grammarAccess.getRestrictionGroupAttributeAccess().getLessThanSignKeyword_2()); 
            match(input,43,FOLLOW_43_in_rule__RestrictionGroupAttribute__Group__2__Impl7271); 
             after(grammarAccess.getRestrictionGroupAttributeAccess().getLessThanSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RestrictionGroupAttribute__Group__2__Impl


    // $ANTLR start rule__RestrictionGroupAttribute__Group__3
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3584:1: rule__RestrictionGroupAttribute__Group__3 : rule__RestrictionGroupAttribute__Group__3__Impl rule__RestrictionGroupAttribute__Group__4 ;
    public final void rule__RestrictionGroupAttribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3588:1: ( rule__RestrictionGroupAttribute__Group__3__Impl rule__RestrictionGroupAttribute__Group__4 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3589:2: rule__RestrictionGroupAttribute__Group__3__Impl rule__RestrictionGroupAttribute__Group__4
            {
            pushFollow(FOLLOW_rule__RestrictionGroupAttribute__Group__3__Impl_in_rule__RestrictionGroupAttribute__Group__37302);
            rule__RestrictionGroupAttribute__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__RestrictionGroupAttribute__Group__4_in_rule__RestrictionGroupAttribute__Group__37305);
            rule__RestrictionGroupAttribute__Group__4();
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
    // $ANTLR end rule__RestrictionGroupAttribute__Group__3


    // $ANTLR start rule__RestrictionGroupAttribute__Group__3__Impl
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3596:1: rule__RestrictionGroupAttribute__Group__3__Impl : ( ( ( rule__RestrictionGroupAttribute__RulesAssignment_3 ) ) ( ( rule__RestrictionGroupAttribute__RulesAssignment_3 )* ) ) ;
    public final void rule__RestrictionGroupAttribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3600:1: ( ( ( ( rule__RestrictionGroupAttribute__RulesAssignment_3 ) ) ( ( rule__RestrictionGroupAttribute__RulesAssignment_3 )* ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3601:1: ( ( ( rule__RestrictionGroupAttribute__RulesAssignment_3 ) ) ( ( rule__RestrictionGroupAttribute__RulesAssignment_3 )* ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3601:1: ( ( ( rule__RestrictionGroupAttribute__RulesAssignment_3 ) ) ( ( rule__RestrictionGroupAttribute__RulesAssignment_3 )* ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3602:1: ( ( rule__RestrictionGroupAttribute__RulesAssignment_3 ) ) ( ( rule__RestrictionGroupAttribute__RulesAssignment_3 )* )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3602:1: ( ( rule__RestrictionGroupAttribute__RulesAssignment_3 ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3603:1: ( rule__RestrictionGroupAttribute__RulesAssignment_3 )
            {
             before(grammarAccess.getRestrictionGroupAttributeAccess().getRulesAssignment_3()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3604:1: ( rule__RestrictionGroupAttribute__RulesAssignment_3 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3604:2: rule__RestrictionGroupAttribute__RulesAssignment_3
            {
            pushFollow(FOLLOW_rule__RestrictionGroupAttribute__RulesAssignment_3_in_rule__RestrictionGroupAttribute__Group__3__Impl7334);
            rule__RestrictionGroupAttribute__RulesAssignment_3();
            _fsp--;


            }

             after(grammarAccess.getRestrictionGroupAttributeAccess().getRulesAssignment_3()); 

            }

            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3607:1: ( ( rule__RestrictionGroupAttribute__RulesAssignment_3 )* )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3608:1: ( rule__RestrictionGroupAttribute__RulesAssignment_3 )*
            {
             before(grammarAccess.getRestrictionGroupAttributeAccess().getRulesAssignment_3()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3609:1: ( rule__RestrictionGroupAttribute__RulesAssignment_3 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==RULE_ID||LA27_0==27) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3609:2: rule__RestrictionGroupAttribute__RulesAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__RestrictionGroupAttribute__RulesAssignment_3_in_rule__RestrictionGroupAttribute__Group__3__Impl7346);
            	    rule__RestrictionGroupAttribute__RulesAssignment_3();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getRestrictionGroupAttributeAccess().getRulesAssignment_3()); 

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
    // $ANTLR end rule__RestrictionGroupAttribute__Group__3__Impl


    // $ANTLR start rule__RestrictionGroupAttribute__Group__4
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3620:1: rule__RestrictionGroupAttribute__Group__4 : rule__RestrictionGroupAttribute__Group__4__Impl ;
    public final void rule__RestrictionGroupAttribute__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3624:1: ( rule__RestrictionGroupAttribute__Group__4__Impl )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3625:2: rule__RestrictionGroupAttribute__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__RestrictionGroupAttribute__Group__4__Impl_in_rule__RestrictionGroupAttribute__Group__47379);
            rule__RestrictionGroupAttribute__Group__4__Impl();
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
    // $ANTLR end rule__RestrictionGroupAttribute__Group__4


    // $ANTLR start rule__RestrictionGroupAttribute__Group__4__Impl
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3631:1: rule__RestrictionGroupAttribute__Group__4__Impl : ( '>' ) ;
    public final void rule__RestrictionGroupAttribute__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3635:1: ( ( '>' ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3636:1: ( '>' )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3636:1: ( '>' )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3637:1: '>'
            {
             before(grammarAccess.getRestrictionGroupAttributeAccess().getGreaterThanSignKeyword_4()); 
            match(input,44,FOLLOW_44_in_rule__RestrictionGroupAttribute__Group__4__Impl7407); 
             after(grammarAccess.getRestrictionGroupAttributeAccess().getGreaterThanSignKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RestrictionGroupAttribute__Group__4__Impl


    // $ANTLR start rule__RestrictionRule__Group__0
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3660:1: rule__RestrictionRule__Group__0 : rule__RestrictionRule__Group__0__Impl rule__RestrictionRule__Group__1 ;
    public final void rule__RestrictionRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3664:1: ( rule__RestrictionRule__Group__0__Impl rule__RestrictionRule__Group__1 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3665:2: rule__RestrictionRule__Group__0__Impl rule__RestrictionRule__Group__1
            {
            pushFollow(FOLLOW_rule__RestrictionRule__Group__0__Impl_in_rule__RestrictionRule__Group__07448);
            rule__RestrictionRule__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__RestrictionRule__Group__1_in_rule__RestrictionRule__Group__07451);
            rule__RestrictionRule__Group__1();
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
    // $ANTLR end rule__RestrictionRule__Group__0


    // $ANTLR start rule__RestrictionRule__Group__0__Impl
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3672:1: rule__RestrictionRule__Group__0__Impl : ( ( rule__RestrictionRule__LiteralsAssignment_0 ) ) ;
    public final void rule__RestrictionRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3676:1: ( ( ( rule__RestrictionRule__LiteralsAssignment_0 ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3677:1: ( ( rule__RestrictionRule__LiteralsAssignment_0 ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3677:1: ( ( rule__RestrictionRule__LiteralsAssignment_0 ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3678:1: ( rule__RestrictionRule__LiteralsAssignment_0 )
            {
             before(grammarAccess.getRestrictionRuleAccess().getLiteralsAssignment_0()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3679:1: ( rule__RestrictionRule__LiteralsAssignment_0 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3679:2: rule__RestrictionRule__LiteralsAssignment_0
            {
            pushFollow(FOLLOW_rule__RestrictionRule__LiteralsAssignment_0_in_rule__RestrictionRule__Group__0__Impl7478);
            rule__RestrictionRule__LiteralsAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getRestrictionRuleAccess().getLiteralsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RestrictionRule__Group__0__Impl


    // $ANTLR start rule__RestrictionRule__Group__1
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3689:1: rule__RestrictionRule__Group__1 : rule__RestrictionRule__Group__1__Impl rule__RestrictionRule__Group__2 ;
    public final void rule__RestrictionRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3693:1: ( rule__RestrictionRule__Group__1__Impl rule__RestrictionRule__Group__2 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3694:2: rule__RestrictionRule__Group__1__Impl rule__RestrictionRule__Group__2
            {
            pushFollow(FOLLOW_rule__RestrictionRule__Group__1__Impl_in_rule__RestrictionRule__Group__17508);
            rule__RestrictionRule__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__RestrictionRule__Group__2_in_rule__RestrictionRule__Group__17511);
            rule__RestrictionRule__Group__2();
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
    // $ANTLR end rule__RestrictionRule__Group__1


    // $ANTLR start rule__RestrictionRule__Group__1__Impl
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3701:1: rule__RestrictionRule__Group__1__Impl : ( 'if' ) ;
    public final void rule__RestrictionRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3705:1: ( ( 'if' ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3706:1: ( 'if' )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3706:1: ( 'if' )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3707:1: 'if'
            {
             before(grammarAccess.getRestrictionRuleAccess().getIfKeyword_1()); 
            match(input,39,FOLLOW_39_in_rule__RestrictionRule__Group__1__Impl7539); 
             after(grammarAccess.getRestrictionRuleAccess().getIfKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RestrictionRule__Group__1__Impl


    // $ANTLR start rule__RestrictionRule__Group__2
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3720:1: rule__RestrictionRule__Group__2 : rule__RestrictionRule__Group__2__Impl ;
    public final void rule__RestrictionRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3724:1: ( rule__RestrictionRule__Group__2__Impl )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3725:2: rule__RestrictionRule__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__RestrictionRule__Group__2__Impl_in_rule__RestrictionRule__Group__27570);
            rule__RestrictionRule__Group__2__Impl();
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
    // $ANTLR end rule__RestrictionRule__Group__2


    // $ANTLR start rule__RestrictionRule__Group__2__Impl
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3731:1: rule__RestrictionRule__Group__2__Impl : ( ( rule__RestrictionRule__ClauseAssignment_2 ) ) ;
    public final void rule__RestrictionRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3735:1: ( ( ( rule__RestrictionRule__ClauseAssignment_2 ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3736:1: ( ( rule__RestrictionRule__ClauseAssignment_2 ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3736:1: ( ( rule__RestrictionRule__ClauseAssignment_2 ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3737:1: ( rule__RestrictionRule__ClauseAssignment_2 )
            {
             before(grammarAccess.getRestrictionRuleAccess().getClauseAssignment_2()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3738:1: ( rule__RestrictionRule__ClauseAssignment_2 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3738:2: rule__RestrictionRule__ClauseAssignment_2
            {
            pushFollow(FOLLOW_rule__RestrictionRule__ClauseAssignment_2_in_rule__RestrictionRule__Group__2__Impl7597);
            rule__RestrictionRule__ClauseAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getRestrictionRuleAccess().getClauseAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RestrictionRule__Group__2__Impl


    // $ANTLR start rule__BOrExpression__Group__0
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3754:1: rule__BOrExpression__Group__0 : rule__BOrExpression__Group__0__Impl rule__BOrExpression__Group__1 ;
    public final void rule__BOrExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3758:1: ( rule__BOrExpression__Group__0__Impl rule__BOrExpression__Group__1 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3759:2: rule__BOrExpression__Group__0__Impl rule__BOrExpression__Group__1
            {
            pushFollow(FOLLOW_rule__BOrExpression__Group__0__Impl_in_rule__BOrExpression__Group__07633);
            rule__BOrExpression__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BOrExpression__Group__1_in_rule__BOrExpression__Group__07636);
            rule__BOrExpression__Group__1();
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
    // $ANTLR end rule__BOrExpression__Group__0


    // $ANTLR start rule__BOrExpression__Group__0__Impl
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3766:1: rule__BOrExpression__Group__0__Impl : ( ruleBAndExpression ) ;
    public final void rule__BOrExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3770:1: ( ( ruleBAndExpression ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3771:1: ( ruleBAndExpression )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3771:1: ( ruleBAndExpression )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3772:1: ruleBAndExpression
            {
             before(grammarAccess.getBOrExpressionAccess().getBAndExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleBAndExpression_in_rule__BOrExpression__Group__0__Impl7663);
            ruleBAndExpression();
            _fsp--;

             after(grammarAccess.getBOrExpressionAccess().getBAndExpressionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BOrExpression__Group__0__Impl


    // $ANTLR start rule__BOrExpression__Group__1
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3783:1: rule__BOrExpression__Group__1 : rule__BOrExpression__Group__1__Impl ;
    public final void rule__BOrExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3787:1: ( rule__BOrExpression__Group__1__Impl )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3788:2: rule__BOrExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__BOrExpression__Group__1__Impl_in_rule__BOrExpression__Group__17692);
            rule__BOrExpression__Group__1__Impl();
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
    // $ANTLR end rule__BOrExpression__Group__1


    // $ANTLR start rule__BOrExpression__Group__1__Impl
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3794:1: rule__BOrExpression__Group__1__Impl : ( ( rule__BOrExpression__Group_1__0 )* ) ;
    public final void rule__BOrExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3798:1: ( ( ( rule__BOrExpression__Group_1__0 )* ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3799:1: ( ( rule__BOrExpression__Group_1__0 )* )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3799:1: ( ( rule__BOrExpression__Group_1__0 )* )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3800:1: ( rule__BOrExpression__Group_1__0 )*
            {
             before(grammarAccess.getBOrExpressionAccess().getGroup_1()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3801:1: ( rule__BOrExpression__Group_1__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==45) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3801:2: rule__BOrExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__BOrExpression__Group_1__0_in_rule__BOrExpression__Group__1__Impl7719);
            	    rule__BOrExpression__Group_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getBOrExpressionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BOrExpression__Group__1__Impl


    // $ANTLR start rule__BOrExpression__Group_1__0
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3815:1: rule__BOrExpression__Group_1__0 : rule__BOrExpression__Group_1__0__Impl rule__BOrExpression__Group_1__1 ;
    public final void rule__BOrExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3819:1: ( rule__BOrExpression__Group_1__0__Impl rule__BOrExpression__Group_1__1 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3820:2: rule__BOrExpression__Group_1__0__Impl rule__BOrExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__BOrExpression__Group_1__0__Impl_in_rule__BOrExpression__Group_1__07754);
            rule__BOrExpression__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BOrExpression__Group_1__1_in_rule__BOrExpression__Group_1__07757);
            rule__BOrExpression__Group_1__1();
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
    // $ANTLR end rule__BOrExpression__Group_1__0


    // $ANTLR start rule__BOrExpression__Group_1__0__Impl
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3827:1: rule__BOrExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__BOrExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3831:1: ( ( () ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3832:1: ( () )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3832:1: ( () )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3833:1: ()
            {
             before(grammarAccess.getBOrExpressionAccess().getOrOperationLeftAction_1_0()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3834:1: ()
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3836:1: 
            {
            }

             after(grammarAccess.getBOrExpressionAccess().getOrOperationLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BOrExpression__Group_1__0__Impl


    // $ANTLR start rule__BOrExpression__Group_1__1
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3846:1: rule__BOrExpression__Group_1__1 : rule__BOrExpression__Group_1__1__Impl rule__BOrExpression__Group_1__2 ;
    public final void rule__BOrExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3850:1: ( rule__BOrExpression__Group_1__1__Impl rule__BOrExpression__Group_1__2 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3851:2: rule__BOrExpression__Group_1__1__Impl rule__BOrExpression__Group_1__2
            {
            pushFollow(FOLLOW_rule__BOrExpression__Group_1__1__Impl_in_rule__BOrExpression__Group_1__17815);
            rule__BOrExpression__Group_1__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BOrExpression__Group_1__2_in_rule__BOrExpression__Group_1__17818);
            rule__BOrExpression__Group_1__2();
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
    // $ANTLR end rule__BOrExpression__Group_1__1


    // $ANTLR start rule__BOrExpression__Group_1__1__Impl
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3858:1: rule__BOrExpression__Group_1__1__Impl : ( 'or' ) ;
    public final void rule__BOrExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3862:1: ( ( 'or' ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3863:1: ( 'or' )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3863:1: ( 'or' )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3864:1: 'or'
            {
             before(grammarAccess.getBOrExpressionAccess().getOrKeyword_1_1()); 
            match(input,45,FOLLOW_45_in_rule__BOrExpression__Group_1__1__Impl7846); 
             after(grammarAccess.getBOrExpressionAccess().getOrKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BOrExpression__Group_1__1__Impl


    // $ANTLR start rule__BOrExpression__Group_1__2
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3877:1: rule__BOrExpression__Group_1__2 : rule__BOrExpression__Group_1__2__Impl ;
    public final void rule__BOrExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3881:1: ( rule__BOrExpression__Group_1__2__Impl )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3882:2: rule__BOrExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__BOrExpression__Group_1__2__Impl_in_rule__BOrExpression__Group_1__27877);
            rule__BOrExpression__Group_1__2__Impl();
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
    // $ANTLR end rule__BOrExpression__Group_1__2


    // $ANTLR start rule__BOrExpression__Group_1__2__Impl
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3888:1: rule__BOrExpression__Group_1__2__Impl : ( ( rule__BOrExpression__RightAssignment_1_2 ) ) ;
    public final void rule__BOrExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3892:1: ( ( ( rule__BOrExpression__RightAssignment_1_2 ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3893:1: ( ( rule__BOrExpression__RightAssignment_1_2 ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3893:1: ( ( rule__BOrExpression__RightAssignment_1_2 ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3894:1: ( rule__BOrExpression__RightAssignment_1_2 )
            {
             before(grammarAccess.getBOrExpressionAccess().getRightAssignment_1_2()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3895:1: ( rule__BOrExpression__RightAssignment_1_2 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3895:2: rule__BOrExpression__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__BOrExpression__RightAssignment_1_2_in_rule__BOrExpression__Group_1__2__Impl7904);
            rule__BOrExpression__RightAssignment_1_2();
            _fsp--;


            }

             after(grammarAccess.getBOrExpressionAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BOrExpression__Group_1__2__Impl


    // $ANTLR start rule__BAndExpression__Group__0
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3911:1: rule__BAndExpression__Group__0 : rule__BAndExpression__Group__0__Impl rule__BAndExpression__Group__1 ;
    public final void rule__BAndExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3915:1: ( rule__BAndExpression__Group__0__Impl rule__BAndExpression__Group__1 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3916:2: rule__BAndExpression__Group__0__Impl rule__BAndExpression__Group__1
            {
            pushFollow(FOLLOW_rule__BAndExpression__Group__0__Impl_in_rule__BAndExpression__Group__07940);
            rule__BAndExpression__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BAndExpression__Group__1_in_rule__BAndExpression__Group__07943);
            rule__BAndExpression__Group__1();
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
    // $ANTLR end rule__BAndExpression__Group__0


    // $ANTLR start rule__BAndExpression__Group__0__Impl
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3923:1: rule__BAndExpression__Group__0__Impl : ( ruleTerminalBExpression ) ;
    public final void rule__BAndExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3927:1: ( ( ruleTerminalBExpression ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3928:1: ( ruleTerminalBExpression )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3928:1: ( ruleTerminalBExpression )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3929:1: ruleTerminalBExpression
            {
             before(grammarAccess.getBAndExpressionAccess().getTerminalBExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleTerminalBExpression_in_rule__BAndExpression__Group__0__Impl7970);
            ruleTerminalBExpression();
            _fsp--;

             after(grammarAccess.getBAndExpressionAccess().getTerminalBExpressionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BAndExpression__Group__0__Impl


    // $ANTLR start rule__BAndExpression__Group__1
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3940:1: rule__BAndExpression__Group__1 : rule__BAndExpression__Group__1__Impl ;
    public final void rule__BAndExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3944:1: ( rule__BAndExpression__Group__1__Impl )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3945:2: rule__BAndExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__BAndExpression__Group__1__Impl_in_rule__BAndExpression__Group__17999);
            rule__BAndExpression__Group__1__Impl();
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
    // $ANTLR end rule__BAndExpression__Group__1


    // $ANTLR start rule__BAndExpression__Group__1__Impl
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3951:1: rule__BAndExpression__Group__1__Impl : ( ( rule__BAndExpression__Group_1__0 )* ) ;
    public final void rule__BAndExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3955:1: ( ( ( rule__BAndExpression__Group_1__0 )* ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3956:1: ( ( rule__BAndExpression__Group_1__0 )* )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3956:1: ( ( rule__BAndExpression__Group_1__0 )* )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3957:1: ( rule__BAndExpression__Group_1__0 )*
            {
             before(grammarAccess.getBAndExpressionAccess().getGroup_1()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3958:1: ( rule__BAndExpression__Group_1__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==46) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3958:2: rule__BAndExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__BAndExpression__Group_1__0_in_rule__BAndExpression__Group__1__Impl8026);
            	    rule__BAndExpression__Group_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

             after(grammarAccess.getBAndExpressionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BAndExpression__Group__1__Impl


    // $ANTLR start rule__BAndExpression__Group_1__0
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3972:1: rule__BAndExpression__Group_1__0 : rule__BAndExpression__Group_1__0__Impl rule__BAndExpression__Group_1__1 ;
    public final void rule__BAndExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3976:1: ( rule__BAndExpression__Group_1__0__Impl rule__BAndExpression__Group_1__1 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3977:2: rule__BAndExpression__Group_1__0__Impl rule__BAndExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__BAndExpression__Group_1__0__Impl_in_rule__BAndExpression__Group_1__08061);
            rule__BAndExpression__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BAndExpression__Group_1__1_in_rule__BAndExpression__Group_1__08064);
            rule__BAndExpression__Group_1__1();
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
    // $ANTLR end rule__BAndExpression__Group_1__0


    // $ANTLR start rule__BAndExpression__Group_1__0__Impl
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3984:1: rule__BAndExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__BAndExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3988:1: ( ( () ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3989:1: ( () )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3989:1: ( () )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3990:1: ()
            {
             before(grammarAccess.getBAndExpressionAccess().getAndOperationLeftAction_1_0()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3991:1: ()
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3993:1: 
            {
            }

             after(grammarAccess.getBAndExpressionAccess().getAndOperationLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BAndExpression__Group_1__0__Impl


    // $ANTLR start rule__BAndExpression__Group_1__1
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4003:1: rule__BAndExpression__Group_1__1 : rule__BAndExpression__Group_1__1__Impl rule__BAndExpression__Group_1__2 ;
    public final void rule__BAndExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4007:1: ( rule__BAndExpression__Group_1__1__Impl rule__BAndExpression__Group_1__2 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4008:2: rule__BAndExpression__Group_1__1__Impl rule__BAndExpression__Group_1__2
            {
            pushFollow(FOLLOW_rule__BAndExpression__Group_1__1__Impl_in_rule__BAndExpression__Group_1__18122);
            rule__BAndExpression__Group_1__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BAndExpression__Group_1__2_in_rule__BAndExpression__Group_1__18125);
            rule__BAndExpression__Group_1__2();
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
    // $ANTLR end rule__BAndExpression__Group_1__1


    // $ANTLR start rule__BAndExpression__Group_1__1__Impl
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4015:1: rule__BAndExpression__Group_1__1__Impl : ( 'and' ) ;
    public final void rule__BAndExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4019:1: ( ( 'and' ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4020:1: ( 'and' )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4020:1: ( 'and' )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4021:1: 'and'
            {
             before(grammarAccess.getBAndExpressionAccess().getAndKeyword_1_1()); 
            match(input,46,FOLLOW_46_in_rule__BAndExpression__Group_1__1__Impl8153); 
             after(grammarAccess.getBAndExpressionAccess().getAndKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BAndExpression__Group_1__1__Impl


    // $ANTLR start rule__BAndExpression__Group_1__2
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4034:1: rule__BAndExpression__Group_1__2 : rule__BAndExpression__Group_1__2__Impl ;
    public final void rule__BAndExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4038:1: ( rule__BAndExpression__Group_1__2__Impl )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4039:2: rule__BAndExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__BAndExpression__Group_1__2__Impl_in_rule__BAndExpression__Group_1__28184);
            rule__BAndExpression__Group_1__2__Impl();
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
    // $ANTLR end rule__BAndExpression__Group_1__2


    // $ANTLR start rule__BAndExpression__Group_1__2__Impl
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4045:1: rule__BAndExpression__Group_1__2__Impl : ( ( rule__BAndExpression__RightAssignment_1_2 ) ) ;
    public final void rule__BAndExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4049:1: ( ( ( rule__BAndExpression__RightAssignment_1_2 ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4050:1: ( ( rule__BAndExpression__RightAssignment_1_2 ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4050:1: ( ( rule__BAndExpression__RightAssignment_1_2 ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4051:1: ( rule__BAndExpression__RightAssignment_1_2 )
            {
             before(grammarAccess.getBAndExpressionAccess().getRightAssignment_1_2()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4052:1: ( rule__BAndExpression__RightAssignment_1_2 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4052:2: rule__BAndExpression__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__BAndExpression__RightAssignment_1_2_in_rule__BAndExpression__Group_1__2__Impl8211);
            rule__BAndExpression__RightAssignment_1_2();
            _fsp--;


            }

             after(grammarAccess.getBAndExpressionAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BAndExpression__Group_1__2__Impl


    // $ANTLR start rule__TerminalBExpression__Group_2__0
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4068:1: rule__TerminalBExpression__Group_2__0 : rule__TerminalBExpression__Group_2__0__Impl rule__TerminalBExpression__Group_2__1 ;
    public final void rule__TerminalBExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4072:1: ( rule__TerminalBExpression__Group_2__0__Impl rule__TerminalBExpression__Group_2__1 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4073:2: rule__TerminalBExpression__Group_2__0__Impl rule__TerminalBExpression__Group_2__1
            {
            pushFollow(FOLLOW_rule__TerminalBExpression__Group_2__0__Impl_in_rule__TerminalBExpression__Group_2__08247);
            rule__TerminalBExpression__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TerminalBExpression__Group_2__1_in_rule__TerminalBExpression__Group_2__08250);
            rule__TerminalBExpression__Group_2__1();
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
    // $ANTLR end rule__TerminalBExpression__Group_2__0


    // $ANTLR start rule__TerminalBExpression__Group_2__0__Impl
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4080:1: rule__TerminalBExpression__Group_2__0__Impl : ( '(' ) ;
    public final void rule__TerminalBExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4084:1: ( ( '(' ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4085:1: ( '(' )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4085:1: ( '(' )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4086:1: '('
            {
             before(grammarAccess.getTerminalBExpressionAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,27,FOLLOW_27_in_rule__TerminalBExpression__Group_2__0__Impl8278); 
             after(grammarAccess.getTerminalBExpressionAccess().getLeftParenthesisKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TerminalBExpression__Group_2__0__Impl


    // $ANTLR start rule__TerminalBExpression__Group_2__1
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4099:1: rule__TerminalBExpression__Group_2__1 : rule__TerminalBExpression__Group_2__1__Impl rule__TerminalBExpression__Group_2__2 ;
    public final void rule__TerminalBExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4103:1: ( rule__TerminalBExpression__Group_2__1__Impl rule__TerminalBExpression__Group_2__2 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4104:2: rule__TerminalBExpression__Group_2__1__Impl rule__TerminalBExpression__Group_2__2
            {
            pushFollow(FOLLOW_rule__TerminalBExpression__Group_2__1__Impl_in_rule__TerminalBExpression__Group_2__18309);
            rule__TerminalBExpression__Group_2__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TerminalBExpression__Group_2__2_in_rule__TerminalBExpression__Group_2__18312);
            rule__TerminalBExpression__Group_2__2();
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
    // $ANTLR end rule__TerminalBExpression__Group_2__1


    // $ANTLR start rule__TerminalBExpression__Group_2__1__Impl
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4111:1: rule__TerminalBExpression__Group_2__1__Impl : ( ruleBExpression ) ;
    public final void rule__TerminalBExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4115:1: ( ( ruleBExpression ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4116:1: ( ruleBExpression )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4116:1: ( ruleBExpression )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4117:1: ruleBExpression
            {
             before(grammarAccess.getTerminalBExpressionAccess().getBExpressionParserRuleCall_2_1()); 
            pushFollow(FOLLOW_ruleBExpression_in_rule__TerminalBExpression__Group_2__1__Impl8339);
            ruleBExpression();
            _fsp--;

             after(grammarAccess.getTerminalBExpressionAccess().getBExpressionParserRuleCall_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TerminalBExpression__Group_2__1__Impl


    // $ANTLR start rule__TerminalBExpression__Group_2__2
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4128:1: rule__TerminalBExpression__Group_2__2 : rule__TerminalBExpression__Group_2__2__Impl ;
    public final void rule__TerminalBExpression__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4132:1: ( rule__TerminalBExpression__Group_2__2__Impl )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4133:2: rule__TerminalBExpression__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__TerminalBExpression__Group_2__2__Impl_in_rule__TerminalBExpression__Group_2__28368);
            rule__TerminalBExpression__Group_2__2__Impl();
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
    // $ANTLR end rule__TerminalBExpression__Group_2__2


    // $ANTLR start rule__TerminalBExpression__Group_2__2__Impl
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4139:1: rule__TerminalBExpression__Group_2__2__Impl : ( ')' ) ;
    public final void rule__TerminalBExpression__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4143:1: ( ( ')' ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4144:1: ( ')' )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4144:1: ( ')' )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4145:1: ')'
            {
             before(grammarAccess.getTerminalBExpressionAccess().getRightParenthesisKeyword_2_2()); 
            match(input,28,FOLLOW_28_in_rule__TerminalBExpression__Group_2__2__Impl8396); 
             after(grammarAccess.getTerminalBExpressionAccess().getRightParenthesisKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TerminalBExpression__Group_2__2__Impl


    // $ANTLR start rule__NegationExpression__Group__0
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4164:1: rule__NegationExpression__Group__0 : rule__NegationExpression__Group__0__Impl rule__NegationExpression__Group__1 ;
    public final void rule__NegationExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4168:1: ( rule__NegationExpression__Group__0__Impl rule__NegationExpression__Group__1 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4169:2: rule__NegationExpression__Group__0__Impl rule__NegationExpression__Group__1
            {
            pushFollow(FOLLOW_rule__NegationExpression__Group__0__Impl_in_rule__NegationExpression__Group__08433);
            rule__NegationExpression__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__NegationExpression__Group__1_in_rule__NegationExpression__Group__08436);
            rule__NegationExpression__Group__1();
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
    // $ANTLR end rule__NegationExpression__Group__0


    // $ANTLR start rule__NegationExpression__Group__0__Impl
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4176:1: rule__NegationExpression__Group__0__Impl : ( 'not' ) ;
    public final void rule__NegationExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4180:1: ( ( 'not' ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4181:1: ( 'not' )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4181:1: ( 'not' )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4182:1: 'not'
            {
             before(grammarAccess.getNegationExpressionAccess().getNotKeyword_0()); 
            match(input,47,FOLLOW_47_in_rule__NegationExpression__Group__0__Impl8464); 
             after(grammarAccess.getNegationExpressionAccess().getNotKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__NegationExpression__Group__0__Impl


    // $ANTLR start rule__NegationExpression__Group__1
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4195:1: rule__NegationExpression__Group__1 : rule__NegationExpression__Group__1__Impl ;
    public final void rule__NegationExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4199:1: ( rule__NegationExpression__Group__1__Impl )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4200:2: rule__NegationExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__NegationExpression__Group__1__Impl_in_rule__NegationExpression__Group__18495);
            rule__NegationExpression__Group__1__Impl();
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
    // $ANTLR end rule__NegationExpression__Group__1


    // $ANTLR start rule__NegationExpression__Group__1__Impl
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4206:1: rule__NegationExpression__Group__1__Impl : ( ( rule__NegationExpression__ExprAssignment_1 ) ) ;
    public final void rule__NegationExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4210:1: ( ( ( rule__NegationExpression__ExprAssignment_1 ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4211:1: ( ( rule__NegationExpression__ExprAssignment_1 ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4211:1: ( ( rule__NegationExpression__ExprAssignment_1 ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4212:1: ( rule__NegationExpression__ExprAssignment_1 )
            {
             before(grammarAccess.getNegationExpressionAccess().getExprAssignment_1()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4213:1: ( rule__NegationExpression__ExprAssignment_1 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4213:2: rule__NegationExpression__ExprAssignment_1
            {
            pushFollow(FOLLOW_rule__NegationExpression__ExprAssignment_1_in_rule__NegationExpression__Group__1__Impl8522);
            rule__NegationExpression__ExprAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getNegationExpressionAccess().getExprAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__NegationExpression__Group__1__Impl


    // $ANTLR start rule__BComparison__Group__0
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4227:1: rule__BComparison__Group__0 : rule__BComparison__Group__0__Impl rule__BComparison__Group__1 ;
    public final void rule__BComparison__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4231:1: ( rule__BComparison__Group__0__Impl rule__BComparison__Group__1 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4232:2: rule__BComparison__Group__0__Impl rule__BComparison__Group__1
            {
            pushFollow(FOLLOW_rule__BComparison__Group__0__Impl_in_rule__BComparison__Group__08556);
            rule__BComparison__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BComparison__Group__1_in_rule__BComparison__Group__08559);
            rule__BComparison__Group__1();
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
    // $ANTLR end rule__BComparison__Group__0


    // $ANTLR start rule__BComparison__Group__0__Impl
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4239:1: rule__BComparison__Group__0__Impl : ( () ) ;
    public final void rule__BComparison__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4243:1: ( ( () ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4244:1: ( () )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4244:1: ( () )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4245:1: ()
            {
             before(grammarAccess.getBComparisonAccess().getBComparisonAction_0()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4246:1: ()
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4248:1: 
            {
            }

             after(grammarAccess.getBComparisonAccess().getBComparisonAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BComparison__Group__0__Impl


    // $ANTLR start rule__BComparison__Group__1
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4258:1: rule__BComparison__Group__1 : rule__BComparison__Group__1__Impl rule__BComparison__Group__2 ;
    public final void rule__BComparison__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4262:1: ( rule__BComparison__Group__1__Impl rule__BComparison__Group__2 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4263:2: rule__BComparison__Group__1__Impl rule__BComparison__Group__2
            {
            pushFollow(FOLLOW_rule__BComparison__Group__1__Impl_in_rule__BComparison__Group__18617);
            rule__BComparison__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BComparison__Group__2_in_rule__BComparison__Group__18620);
            rule__BComparison__Group__2();
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
    // $ANTLR end rule__BComparison__Group__1


    // $ANTLR start rule__BComparison__Group__1__Impl
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4270:1: rule__BComparison__Group__1__Impl : ( ( rule__BComparison__RefAssignment_1 ) ) ;
    public final void rule__BComparison__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4274:1: ( ( ( rule__BComparison__RefAssignment_1 ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4275:1: ( ( rule__BComparison__RefAssignment_1 ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4275:1: ( ( rule__BComparison__RefAssignment_1 ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4276:1: ( rule__BComparison__RefAssignment_1 )
            {
             before(grammarAccess.getBComparisonAccess().getRefAssignment_1()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4277:1: ( rule__BComparison__RefAssignment_1 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4277:2: rule__BComparison__RefAssignment_1
            {
            pushFollow(FOLLOW_rule__BComparison__RefAssignment_1_in_rule__BComparison__Group__1__Impl8647);
            rule__BComparison__RefAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getBComparisonAccess().getRefAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BComparison__Group__1__Impl


    // $ANTLR start rule__BComparison__Group__2
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4287:1: rule__BComparison__Group__2 : rule__BComparison__Group__2__Impl ;
    public final void rule__BComparison__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4291:1: ( rule__BComparison__Group__2__Impl )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4292:2: rule__BComparison__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__BComparison__Group__2__Impl_in_rule__BComparison__Group__28677);
            rule__BComparison__Group__2__Impl();
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
    // $ANTLR end rule__BComparison__Group__2


    // $ANTLR start rule__BComparison__Group__2__Impl
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4298:1: rule__BComparison__Group__2__Impl : ( ( rule__BComparison__Group_2__0 )? ) ;
    public final void rule__BComparison__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4302:1: ( ( ( rule__BComparison__Group_2__0 )? ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4303:1: ( ( rule__BComparison__Group_2__0 )? )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4303:1: ( ( rule__BComparison__Group_2__0 )? )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4304:1: ( rule__BComparison__Group_2__0 )?
            {
             before(grammarAccess.getBComparisonAccess().getGroup_2()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4305:1: ( rule__BComparison__Group_2__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==48) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4305:2: rule__BComparison__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__BComparison__Group_2__0_in_rule__BComparison__Group__2__Impl8704);
                    rule__BComparison__Group_2__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBComparisonAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BComparison__Group__2__Impl


    // $ANTLR start rule__BComparison__Group_2__0
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4321:1: rule__BComparison__Group_2__0 : rule__BComparison__Group_2__0__Impl rule__BComparison__Group_2__1 ;
    public final void rule__BComparison__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4325:1: ( rule__BComparison__Group_2__0__Impl rule__BComparison__Group_2__1 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4326:2: rule__BComparison__Group_2__0__Impl rule__BComparison__Group_2__1
            {
            pushFollow(FOLLOW_rule__BComparison__Group_2__0__Impl_in_rule__BComparison__Group_2__08741);
            rule__BComparison__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BComparison__Group_2__1_in_rule__BComparison__Group_2__08744);
            rule__BComparison__Group_2__1();
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
    // $ANTLR end rule__BComparison__Group_2__0


    // $ANTLR start rule__BComparison__Group_2__0__Impl
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4333:1: rule__BComparison__Group_2__0__Impl : ( 'is' ) ;
    public final void rule__BComparison__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4337:1: ( ( 'is' ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4338:1: ( 'is' )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4338:1: ( 'is' )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4339:1: 'is'
            {
             before(grammarAccess.getBComparisonAccess().getIsKeyword_2_0()); 
            match(input,48,FOLLOW_48_in_rule__BComparison__Group_2__0__Impl8772); 
             after(grammarAccess.getBComparisonAccess().getIsKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BComparison__Group_2__0__Impl


    // $ANTLR start rule__BComparison__Group_2__1
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4352:1: rule__BComparison__Group_2__1 : rule__BComparison__Group_2__1__Impl ;
    public final void rule__BComparison__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4356:1: ( rule__BComparison__Group_2__1__Impl )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4357:2: rule__BComparison__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__BComparison__Group_2__1__Impl_in_rule__BComparison__Group_2__18803);
            rule__BComparison__Group_2__1__Impl();
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
    // $ANTLR end rule__BComparison__Group_2__1


    // $ANTLR start rule__BComparison__Group_2__1__Impl
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4363:1: rule__BComparison__Group_2__1__Impl : ( ( rule__BComparison__BLiteralAssignment_2_1 ) ) ;
    public final void rule__BComparison__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4367:1: ( ( ( rule__BComparison__BLiteralAssignment_2_1 ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4368:1: ( ( rule__BComparison__BLiteralAssignment_2_1 ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4368:1: ( ( rule__BComparison__BLiteralAssignment_2_1 ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4369:1: ( rule__BComparison__BLiteralAssignment_2_1 )
            {
             before(grammarAccess.getBComparisonAccess().getBLiteralAssignment_2_1()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4370:1: ( rule__BComparison__BLiteralAssignment_2_1 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4370:2: rule__BComparison__BLiteralAssignment_2_1
            {
            pushFollow(FOLLOW_rule__BComparison__BLiteralAssignment_2_1_in_rule__BComparison__Group_2__1__Impl8830);
            rule__BComparison__BLiteralAssignment_2_1();
            _fsp--;


            }

             after(grammarAccess.getBComparisonAccess().getBLiteralAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BComparison__Group_2__1__Impl


    // $ANTLR start rule__SingleEnumComparison__Group__0
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4384:1: rule__SingleEnumComparison__Group__0 : rule__SingleEnumComparison__Group__0__Impl rule__SingleEnumComparison__Group__1 ;
    public final void rule__SingleEnumComparison__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4388:1: ( rule__SingleEnumComparison__Group__0__Impl rule__SingleEnumComparison__Group__1 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4389:2: rule__SingleEnumComparison__Group__0__Impl rule__SingleEnumComparison__Group__1
            {
            pushFollow(FOLLOW_rule__SingleEnumComparison__Group__0__Impl_in_rule__SingleEnumComparison__Group__08864);
            rule__SingleEnumComparison__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SingleEnumComparison__Group__1_in_rule__SingleEnumComparison__Group__08867);
            rule__SingleEnumComparison__Group__1();
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
    // $ANTLR end rule__SingleEnumComparison__Group__0


    // $ANTLR start rule__SingleEnumComparison__Group__0__Impl
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4396:1: rule__SingleEnumComparison__Group__0__Impl : ( ( rule__SingleEnumComparison__RefAssignment_0 ) ) ;
    public final void rule__SingleEnumComparison__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4400:1: ( ( ( rule__SingleEnumComparison__RefAssignment_0 ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4401:1: ( ( rule__SingleEnumComparison__RefAssignment_0 ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4401:1: ( ( rule__SingleEnumComparison__RefAssignment_0 ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4402:1: ( rule__SingleEnumComparison__RefAssignment_0 )
            {
             before(grammarAccess.getSingleEnumComparisonAccess().getRefAssignment_0()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4403:1: ( rule__SingleEnumComparison__RefAssignment_0 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4403:2: rule__SingleEnumComparison__RefAssignment_0
            {
            pushFollow(FOLLOW_rule__SingleEnumComparison__RefAssignment_0_in_rule__SingleEnumComparison__Group__0__Impl8894);
            rule__SingleEnumComparison__RefAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getSingleEnumComparisonAccess().getRefAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SingleEnumComparison__Group__0__Impl


    // $ANTLR start rule__SingleEnumComparison__Group__1
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4413:1: rule__SingleEnumComparison__Group__1 : rule__SingleEnumComparison__Group__1__Impl rule__SingleEnumComparison__Group__2 ;
    public final void rule__SingleEnumComparison__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4417:1: ( rule__SingleEnumComparison__Group__1__Impl rule__SingleEnumComparison__Group__2 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4418:2: rule__SingleEnumComparison__Group__1__Impl rule__SingleEnumComparison__Group__2
            {
            pushFollow(FOLLOW_rule__SingleEnumComparison__Group__1__Impl_in_rule__SingleEnumComparison__Group__18924);
            rule__SingleEnumComparison__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SingleEnumComparison__Group__2_in_rule__SingleEnumComparison__Group__18927);
            rule__SingleEnumComparison__Group__2();
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
    // $ANTLR end rule__SingleEnumComparison__Group__1


    // $ANTLR start rule__SingleEnumComparison__Group__1__Impl
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4425:1: rule__SingleEnumComparison__Group__1__Impl : ( '=' ) ;
    public final void rule__SingleEnumComparison__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4429:1: ( ( '=' ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4430:1: ( '=' )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4430:1: ( '=' )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4431:1: '='
            {
             before(grammarAccess.getSingleEnumComparisonAccess().getEqualsSignKeyword_1()); 
            match(input,22,FOLLOW_22_in_rule__SingleEnumComparison__Group__1__Impl8955); 
             after(grammarAccess.getSingleEnumComparisonAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SingleEnumComparison__Group__1__Impl


    // $ANTLR start rule__SingleEnumComparison__Group__2
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4444:1: rule__SingleEnumComparison__Group__2 : rule__SingleEnumComparison__Group__2__Impl ;
    public final void rule__SingleEnumComparison__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4448:1: ( rule__SingleEnumComparison__Group__2__Impl )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4449:2: rule__SingleEnumComparison__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__SingleEnumComparison__Group__2__Impl_in_rule__SingleEnumComparison__Group__28986);
            rule__SingleEnumComparison__Group__2__Impl();
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
    // $ANTLR end rule__SingleEnumComparison__Group__2


    // $ANTLR start rule__SingleEnumComparison__Group__2__Impl
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4455:1: rule__SingleEnumComparison__Group__2__Impl : ( ( rule__SingleEnumComparison__ELiteralAssignment_2 ) ) ;
    public final void rule__SingleEnumComparison__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4459:1: ( ( ( rule__SingleEnumComparison__ELiteralAssignment_2 ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4460:1: ( ( rule__SingleEnumComparison__ELiteralAssignment_2 ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4460:1: ( ( rule__SingleEnumComparison__ELiteralAssignment_2 ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4461:1: ( rule__SingleEnumComparison__ELiteralAssignment_2 )
            {
             before(grammarAccess.getSingleEnumComparisonAccess().getELiteralAssignment_2()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4462:1: ( rule__SingleEnumComparison__ELiteralAssignment_2 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4462:2: rule__SingleEnumComparison__ELiteralAssignment_2
            {
            pushFollow(FOLLOW_rule__SingleEnumComparison__ELiteralAssignment_2_in_rule__SingleEnumComparison__Group__2__Impl9013);
            rule__SingleEnumComparison__ELiteralAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getSingleEnumComparisonAccess().getELiteralAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SingleEnumComparison__Group__2__Impl


    // $ANTLR start rule__MultiEnumComparison__Group__0
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4478:1: rule__MultiEnumComparison__Group__0 : rule__MultiEnumComparison__Group__0__Impl rule__MultiEnumComparison__Group__1 ;
    public final void rule__MultiEnumComparison__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4482:1: ( rule__MultiEnumComparison__Group__0__Impl rule__MultiEnumComparison__Group__1 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4483:2: rule__MultiEnumComparison__Group__0__Impl rule__MultiEnumComparison__Group__1
            {
            pushFollow(FOLLOW_rule__MultiEnumComparison__Group__0__Impl_in_rule__MultiEnumComparison__Group__09049);
            rule__MultiEnumComparison__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__MultiEnumComparison__Group__1_in_rule__MultiEnumComparison__Group__09052);
            rule__MultiEnumComparison__Group__1();
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
    // $ANTLR end rule__MultiEnumComparison__Group__0


    // $ANTLR start rule__MultiEnumComparison__Group__0__Impl
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4490:1: rule__MultiEnumComparison__Group__0__Impl : ( ( rule__MultiEnumComparison__RefAssignment_0 ) ) ;
    public final void rule__MultiEnumComparison__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4494:1: ( ( ( rule__MultiEnumComparison__RefAssignment_0 ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4495:1: ( ( rule__MultiEnumComparison__RefAssignment_0 ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4495:1: ( ( rule__MultiEnumComparison__RefAssignment_0 ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4496:1: ( rule__MultiEnumComparison__RefAssignment_0 )
            {
             before(grammarAccess.getMultiEnumComparisonAccess().getRefAssignment_0()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4497:1: ( rule__MultiEnumComparison__RefAssignment_0 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4497:2: rule__MultiEnumComparison__RefAssignment_0
            {
            pushFollow(FOLLOW_rule__MultiEnumComparison__RefAssignment_0_in_rule__MultiEnumComparison__Group__0__Impl9079);
            rule__MultiEnumComparison__RefAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getMultiEnumComparisonAccess().getRefAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MultiEnumComparison__Group__0__Impl


    // $ANTLR start rule__MultiEnumComparison__Group__1
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4507:1: rule__MultiEnumComparison__Group__1 : rule__MultiEnumComparison__Group__1__Impl rule__MultiEnumComparison__Group__2 ;
    public final void rule__MultiEnumComparison__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4511:1: ( rule__MultiEnumComparison__Group__1__Impl rule__MultiEnumComparison__Group__2 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4512:2: rule__MultiEnumComparison__Group__1__Impl rule__MultiEnumComparison__Group__2
            {
            pushFollow(FOLLOW_rule__MultiEnumComparison__Group__1__Impl_in_rule__MultiEnumComparison__Group__19109);
            rule__MultiEnumComparison__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__MultiEnumComparison__Group__2_in_rule__MultiEnumComparison__Group__19112);
            rule__MultiEnumComparison__Group__2();
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
    // $ANTLR end rule__MultiEnumComparison__Group__1


    // $ANTLR start rule__MultiEnumComparison__Group__1__Impl
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4519:1: rule__MultiEnumComparison__Group__1__Impl : ( ( rule__MultiEnumComparison__MembershipAssignment_1 ) ) ;
    public final void rule__MultiEnumComparison__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4523:1: ( ( ( rule__MultiEnumComparison__MembershipAssignment_1 ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4524:1: ( ( rule__MultiEnumComparison__MembershipAssignment_1 ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4524:1: ( ( rule__MultiEnumComparison__MembershipAssignment_1 ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4525:1: ( rule__MultiEnumComparison__MembershipAssignment_1 )
            {
             before(grammarAccess.getMultiEnumComparisonAccess().getMembershipAssignment_1()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4526:1: ( rule__MultiEnumComparison__MembershipAssignment_1 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4526:2: rule__MultiEnumComparison__MembershipAssignment_1
            {
            pushFollow(FOLLOW_rule__MultiEnumComparison__MembershipAssignment_1_in_rule__MultiEnumComparison__Group__1__Impl9139);
            rule__MultiEnumComparison__MembershipAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getMultiEnumComparisonAccess().getMembershipAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MultiEnumComparison__Group__1__Impl


    // $ANTLR start rule__MultiEnumComparison__Group__2
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4536:1: rule__MultiEnumComparison__Group__2 : rule__MultiEnumComparison__Group__2__Impl ;
    public final void rule__MultiEnumComparison__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4540:1: ( rule__MultiEnumComparison__Group__2__Impl )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4541:2: rule__MultiEnumComparison__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__MultiEnumComparison__Group__2__Impl_in_rule__MultiEnumComparison__Group__29169);
            rule__MultiEnumComparison__Group__2__Impl();
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
    // $ANTLR end rule__MultiEnumComparison__Group__2


    // $ANTLR start rule__MultiEnumComparison__Group__2__Impl
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4547:1: rule__MultiEnumComparison__Group__2__Impl : ( ( rule__MultiEnumComparison__ELiteralsAssignment_2 ) ) ;
    public final void rule__MultiEnumComparison__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4551:1: ( ( ( rule__MultiEnumComparison__ELiteralsAssignment_2 ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4552:1: ( ( rule__MultiEnumComparison__ELiteralsAssignment_2 ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4552:1: ( ( rule__MultiEnumComparison__ELiteralsAssignment_2 ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4553:1: ( rule__MultiEnumComparison__ELiteralsAssignment_2 )
            {
             before(grammarAccess.getMultiEnumComparisonAccess().getELiteralsAssignment_2()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4554:1: ( rule__MultiEnumComparison__ELiteralsAssignment_2 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4554:2: rule__MultiEnumComparison__ELiteralsAssignment_2
            {
            pushFollow(FOLLOW_rule__MultiEnumComparison__ELiteralsAssignment_2_in_rule__MultiEnumComparison__Group__2__Impl9196);
            rule__MultiEnumComparison__ELiteralsAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getMultiEnumComparisonAccess().getELiteralsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MultiEnumComparison__Group__2__Impl


    // $ANTLR start rule__StringValueComparison__Group__0
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4570:1: rule__StringValueComparison__Group__0 : rule__StringValueComparison__Group__0__Impl rule__StringValueComparison__Group__1 ;
    public final void rule__StringValueComparison__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4574:1: ( rule__StringValueComparison__Group__0__Impl rule__StringValueComparison__Group__1 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4575:2: rule__StringValueComparison__Group__0__Impl rule__StringValueComparison__Group__1
            {
            pushFollow(FOLLOW_rule__StringValueComparison__Group__0__Impl_in_rule__StringValueComparison__Group__09232);
            rule__StringValueComparison__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__StringValueComparison__Group__1_in_rule__StringValueComparison__Group__09235);
            rule__StringValueComparison__Group__1();
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
    // $ANTLR end rule__StringValueComparison__Group__0


    // $ANTLR start rule__StringValueComparison__Group__0__Impl
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4582:1: rule__StringValueComparison__Group__0__Impl : ( ( rule__StringValueComparison__RefAssignment_0 ) ) ;
    public final void rule__StringValueComparison__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4586:1: ( ( ( rule__StringValueComparison__RefAssignment_0 ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4587:1: ( ( rule__StringValueComparison__RefAssignment_0 ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4587:1: ( ( rule__StringValueComparison__RefAssignment_0 ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4588:1: ( rule__StringValueComparison__RefAssignment_0 )
            {
             before(grammarAccess.getStringValueComparisonAccess().getRefAssignment_0()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4589:1: ( rule__StringValueComparison__RefAssignment_0 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4589:2: rule__StringValueComparison__RefAssignment_0
            {
            pushFollow(FOLLOW_rule__StringValueComparison__RefAssignment_0_in_rule__StringValueComparison__Group__0__Impl9262);
            rule__StringValueComparison__RefAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getStringValueComparisonAccess().getRefAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StringValueComparison__Group__0__Impl


    // $ANTLR start rule__StringValueComparison__Group__1
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4599:1: rule__StringValueComparison__Group__1 : rule__StringValueComparison__Group__1__Impl rule__StringValueComparison__Group__2 ;
    public final void rule__StringValueComparison__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4603:1: ( rule__StringValueComparison__Group__1__Impl rule__StringValueComparison__Group__2 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4604:2: rule__StringValueComparison__Group__1__Impl rule__StringValueComparison__Group__2
            {
            pushFollow(FOLLOW_rule__StringValueComparison__Group__1__Impl_in_rule__StringValueComparison__Group__19292);
            rule__StringValueComparison__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__StringValueComparison__Group__2_in_rule__StringValueComparison__Group__19295);
            rule__StringValueComparison__Group__2();
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
    // $ANTLR end rule__StringValueComparison__Group__1


    // $ANTLR start rule__StringValueComparison__Group__1__Impl
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4611:1: rule__StringValueComparison__Group__1__Impl : ( 'equals' ) ;
    public final void rule__StringValueComparison__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4615:1: ( ( 'equals' ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4616:1: ( 'equals' )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4616:1: ( 'equals' )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4617:1: 'equals'
            {
             before(grammarAccess.getStringValueComparisonAccess().getEqualsKeyword_1()); 
            match(input,49,FOLLOW_49_in_rule__StringValueComparison__Group__1__Impl9323); 
             after(grammarAccess.getStringValueComparisonAccess().getEqualsKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StringValueComparison__Group__1__Impl


    // $ANTLR start rule__StringValueComparison__Group__2
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4630:1: rule__StringValueComparison__Group__2 : rule__StringValueComparison__Group__2__Impl ;
    public final void rule__StringValueComparison__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4634:1: ( rule__StringValueComparison__Group__2__Impl )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4635:2: rule__StringValueComparison__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__StringValueComparison__Group__2__Impl_in_rule__StringValueComparison__Group__29354);
            rule__StringValueComparison__Group__2__Impl();
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
    // $ANTLR end rule__StringValueComparison__Group__2


    // $ANTLR start rule__StringValueComparison__Group__2__Impl
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4641:1: rule__StringValueComparison__Group__2__Impl : ( ( rule__StringValueComparison__TargetValueAssignment_2 ) ) ;
    public final void rule__StringValueComparison__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4645:1: ( ( ( rule__StringValueComparison__TargetValueAssignment_2 ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4646:1: ( ( rule__StringValueComparison__TargetValueAssignment_2 ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4646:1: ( ( rule__StringValueComparison__TargetValueAssignment_2 ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4647:1: ( rule__StringValueComparison__TargetValueAssignment_2 )
            {
             before(grammarAccess.getStringValueComparisonAccess().getTargetValueAssignment_2()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4648:1: ( rule__StringValueComparison__TargetValueAssignment_2 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4648:2: rule__StringValueComparison__TargetValueAssignment_2
            {
            pushFollow(FOLLOW_rule__StringValueComparison__TargetValueAssignment_2_in_rule__StringValueComparison__Group__2__Impl9381);
            rule__StringValueComparison__TargetValueAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getStringValueComparisonAccess().getTargetValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StringValueComparison__Group__2__Impl


    // $ANTLR start rule__PresenceCheck__Group__0
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4664:1: rule__PresenceCheck__Group__0 : rule__PresenceCheck__Group__0__Impl rule__PresenceCheck__Group__1 ;
    public final void rule__PresenceCheck__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4668:1: ( rule__PresenceCheck__Group__0__Impl rule__PresenceCheck__Group__1 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4669:2: rule__PresenceCheck__Group__0__Impl rule__PresenceCheck__Group__1
            {
            pushFollow(FOLLOW_rule__PresenceCheck__Group__0__Impl_in_rule__PresenceCheck__Group__09417);
            rule__PresenceCheck__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__PresenceCheck__Group__1_in_rule__PresenceCheck__Group__09420);
            rule__PresenceCheck__Group__1();
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
    // $ANTLR end rule__PresenceCheck__Group__0


    // $ANTLR start rule__PresenceCheck__Group__0__Impl
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4676:1: rule__PresenceCheck__Group__0__Impl : ( ( rule__PresenceCheck__RefAssignment_0 ) ) ;
    public final void rule__PresenceCheck__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4680:1: ( ( ( rule__PresenceCheck__RefAssignment_0 ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4681:1: ( ( rule__PresenceCheck__RefAssignment_0 ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4681:1: ( ( rule__PresenceCheck__RefAssignment_0 ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4682:1: ( rule__PresenceCheck__RefAssignment_0 )
            {
             before(grammarAccess.getPresenceCheckAccess().getRefAssignment_0()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4683:1: ( rule__PresenceCheck__RefAssignment_0 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4683:2: rule__PresenceCheck__RefAssignment_0
            {
            pushFollow(FOLLOW_rule__PresenceCheck__RefAssignment_0_in_rule__PresenceCheck__Group__0__Impl9447);
            rule__PresenceCheck__RefAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getPresenceCheckAccess().getRefAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PresenceCheck__Group__0__Impl


    // $ANTLR start rule__PresenceCheck__Group__1
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4693:1: rule__PresenceCheck__Group__1 : rule__PresenceCheck__Group__1__Impl ;
    public final void rule__PresenceCheck__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4697:1: ( rule__PresenceCheck__Group__1__Impl )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4698:2: rule__PresenceCheck__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__PresenceCheck__Group__1__Impl_in_rule__PresenceCheck__Group__19477);
            rule__PresenceCheck__Group__1__Impl();
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
    // $ANTLR end rule__PresenceCheck__Group__1


    // $ANTLR start rule__PresenceCheck__Group__1__Impl
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4704:1: rule__PresenceCheck__Group__1__Impl : ( 'is-present' ) ;
    public final void rule__PresenceCheck__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4708:1: ( ( 'is-present' ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4709:1: ( 'is-present' )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4709:1: ( 'is-present' )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4710:1: 'is-present'
            {
             before(grammarAccess.getPresenceCheckAccess().getIsPresentKeyword_1()); 
            match(input,50,FOLLOW_50_in_rule__PresenceCheck__Group__1__Impl9505); 
             after(grammarAccess.getPresenceCheckAccess().getIsPresentKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PresenceCheck__Group__1__Impl


    // $ANTLR start rule__DirectEnumLiteralsCollection__Group__0
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4727:1: rule__DirectEnumLiteralsCollection__Group__0 : rule__DirectEnumLiteralsCollection__Group__0__Impl rule__DirectEnumLiteralsCollection__Group__1 ;
    public final void rule__DirectEnumLiteralsCollection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4731:1: ( rule__DirectEnumLiteralsCollection__Group__0__Impl rule__DirectEnumLiteralsCollection__Group__1 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4732:2: rule__DirectEnumLiteralsCollection__Group__0__Impl rule__DirectEnumLiteralsCollection__Group__1
            {
            pushFollow(FOLLOW_rule__DirectEnumLiteralsCollection__Group__0__Impl_in_rule__DirectEnumLiteralsCollection__Group__09540);
            rule__DirectEnumLiteralsCollection__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DirectEnumLiteralsCollection__Group__1_in_rule__DirectEnumLiteralsCollection__Group__09543);
            rule__DirectEnumLiteralsCollection__Group__1();
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
    // $ANTLR end rule__DirectEnumLiteralsCollection__Group__0


    // $ANTLR start rule__DirectEnumLiteralsCollection__Group__0__Impl
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4739:1: rule__DirectEnumLiteralsCollection__Group__0__Impl : ( () ) ;
    public final void rule__DirectEnumLiteralsCollection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4743:1: ( ( () ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4744:1: ( () )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4744:1: ( () )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4745:1: ()
            {
             before(grammarAccess.getDirectEnumLiteralsCollectionAccess().getDirectEnumLiteralsCollectionAction_0()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4746:1: ()
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4748:1: 
            {
            }

             after(grammarAccess.getDirectEnumLiteralsCollectionAccess().getDirectEnumLiteralsCollectionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DirectEnumLiteralsCollection__Group__0__Impl


    // $ANTLR start rule__DirectEnumLiteralsCollection__Group__1
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4758:1: rule__DirectEnumLiteralsCollection__Group__1 : rule__DirectEnumLiteralsCollection__Group__1__Impl rule__DirectEnumLiteralsCollection__Group__2 ;
    public final void rule__DirectEnumLiteralsCollection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4762:1: ( rule__DirectEnumLiteralsCollection__Group__1__Impl rule__DirectEnumLiteralsCollection__Group__2 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4763:2: rule__DirectEnumLiteralsCollection__Group__1__Impl rule__DirectEnumLiteralsCollection__Group__2
            {
            pushFollow(FOLLOW_rule__DirectEnumLiteralsCollection__Group__1__Impl_in_rule__DirectEnumLiteralsCollection__Group__19601);
            rule__DirectEnumLiteralsCollection__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DirectEnumLiteralsCollection__Group__2_in_rule__DirectEnumLiteralsCollection__Group__19604);
            rule__DirectEnumLiteralsCollection__Group__2();
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
    // $ANTLR end rule__DirectEnumLiteralsCollection__Group__1


    // $ANTLR start rule__DirectEnumLiteralsCollection__Group__1__Impl
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4770:1: rule__DirectEnumLiteralsCollection__Group__1__Impl : ( '(' ) ;
    public final void rule__DirectEnumLiteralsCollection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4774:1: ( ( '(' ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4775:1: ( '(' )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4775:1: ( '(' )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4776:1: '('
            {
             before(grammarAccess.getDirectEnumLiteralsCollectionAccess().getLeftParenthesisKeyword_1()); 
            match(input,27,FOLLOW_27_in_rule__DirectEnumLiteralsCollection__Group__1__Impl9632); 
             after(grammarAccess.getDirectEnumLiteralsCollectionAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DirectEnumLiteralsCollection__Group__1__Impl


    // $ANTLR start rule__DirectEnumLiteralsCollection__Group__2
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4789:1: rule__DirectEnumLiteralsCollection__Group__2 : rule__DirectEnumLiteralsCollection__Group__2__Impl rule__DirectEnumLiteralsCollection__Group__3 ;
    public final void rule__DirectEnumLiteralsCollection__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4793:1: ( rule__DirectEnumLiteralsCollection__Group__2__Impl rule__DirectEnumLiteralsCollection__Group__3 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4794:2: rule__DirectEnumLiteralsCollection__Group__2__Impl rule__DirectEnumLiteralsCollection__Group__3
            {
            pushFollow(FOLLOW_rule__DirectEnumLiteralsCollection__Group__2__Impl_in_rule__DirectEnumLiteralsCollection__Group__29663);
            rule__DirectEnumLiteralsCollection__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DirectEnumLiteralsCollection__Group__3_in_rule__DirectEnumLiteralsCollection__Group__29666);
            rule__DirectEnumLiteralsCollection__Group__3();
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
    // $ANTLR end rule__DirectEnumLiteralsCollection__Group__2


    // $ANTLR start rule__DirectEnumLiteralsCollection__Group__2__Impl
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4801:1: rule__DirectEnumLiteralsCollection__Group__2__Impl : ( ( rule__DirectEnumLiteralsCollection__LiteralsAssignment_2 )* ) ;
    public final void rule__DirectEnumLiteralsCollection__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4805:1: ( ( ( rule__DirectEnumLiteralsCollection__LiteralsAssignment_2 )* ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4806:1: ( ( rule__DirectEnumLiteralsCollection__LiteralsAssignment_2 )* )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4806:1: ( ( rule__DirectEnumLiteralsCollection__LiteralsAssignment_2 )* )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4807:1: ( rule__DirectEnumLiteralsCollection__LiteralsAssignment_2 )*
            {
             before(grammarAccess.getDirectEnumLiteralsCollectionAccess().getLiteralsAssignment_2()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4808:1: ( rule__DirectEnumLiteralsCollection__LiteralsAssignment_2 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==RULE_ID) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4808:2: rule__DirectEnumLiteralsCollection__LiteralsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__DirectEnumLiteralsCollection__LiteralsAssignment_2_in_rule__DirectEnumLiteralsCollection__Group__2__Impl9693);
            	    rule__DirectEnumLiteralsCollection__LiteralsAssignment_2();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

             after(grammarAccess.getDirectEnumLiteralsCollectionAccess().getLiteralsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DirectEnumLiteralsCollection__Group__2__Impl


    // $ANTLR start rule__DirectEnumLiteralsCollection__Group__3
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4818:1: rule__DirectEnumLiteralsCollection__Group__3 : rule__DirectEnumLiteralsCollection__Group__3__Impl ;
    public final void rule__DirectEnumLiteralsCollection__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4822:1: ( rule__DirectEnumLiteralsCollection__Group__3__Impl )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4823:2: rule__DirectEnumLiteralsCollection__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__DirectEnumLiteralsCollection__Group__3__Impl_in_rule__DirectEnumLiteralsCollection__Group__39724);
            rule__DirectEnumLiteralsCollection__Group__3__Impl();
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
    // $ANTLR end rule__DirectEnumLiteralsCollection__Group__3


    // $ANTLR start rule__DirectEnumLiteralsCollection__Group__3__Impl
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4829:1: rule__DirectEnumLiteralsCollection__Group__3__Impl : ( ')' ) ;
    public final void rule__DirectEnumLiteralsCollection__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4833:1: ( ( ')' ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4834:1: ( ')' )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4834:1: ( ')' )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4835:1: ')'
            {
             before(grammarAccess.getDirectEnumLiteralsCollectionAccess().getRightParenthesisKeyword_3()); 
            match(input,28,FOLLOW_28_in_rule__DirectEnumLiteralsCollection__Group__3__Impl9752); 
             after(grammarAccess.getDirectEnumLiteralsCollectionAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DirectEnumLiteralsCollection__Group__3__Impl


    // $ANTLR start rule__DynamicScreen__LabelAssignment_1
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4857:1: rule__DynamicScreen__LabelAssignment_1 : ( ruleLabel ) ;
    public final void rule__DynamicScreen__LabelAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4861:1: ( ( ruleLabel ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4862:1: ( ruleLabel )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4862:1: ( ruleLabel )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4863:1: ruleLabel
            {
             before(grammarAccess.getDynamicScreenAccess().getLabelLabelParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleLabel_in_rule__DynamicScreen__LabelAssignment_19796);
            ruleLabel();
            _fsp--;

             after(grammarAccess.getDynamicScreenAccess().getLabelLabelParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DynamicScreen__LabelAssignment_1


    // $ANTLR start rule__DynamicScreen__DataImportAssignment_2
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4872:1: rule__DynamicScreen__DataImportAssignment_2 : ( ruleDataImport ) ;
    public final void rule__DynamicScreen__DataImportAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4876:1: ( ( ruleDataImport ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4877:1: ( ruleDataImport )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4877:1: ( ruleDataImport )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4878:1: ruleDataImport
            {
             before(grammarAccess.getDynamicScreenAccess().getDataImportDataImportParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleDataImport_in_rule__DynamicScreen__DataImportAssignment_29827);
            ruleDataImport();
            _fsp--;

             after(grammarAccess.getDynamicScreenAccess().getDataImportDataImportParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DynamicScreen__DataImportAssignment_2


    // $ANTLR start rule__DynamicScreen__ViewClassAssignment_5
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4887:1: rule__DynamicScreen__ViewClassAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__DynamicScreen__ViewClassAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4891:1: ( ( ( RULE_ID ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4892:1: ( ( RULE_ID ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4892:1: ( ( RULE_ID ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4893:1: ( RULE_ID )
            {
             before(grammarAccess.getDynamicScreenAccess().getViewClassEntityCrossReference_5_0()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4894:1: ( RULE_ID )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4895:1: RULE_ID
            {
             before(grammarAccess.getDynamicScreenAccess().getViewClassEntityIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DynamicScreen__ViewClassAssignment_59862); 
             after(grammarAccess.getDynamicScreenAccess().getViewClassEntityIDTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getDynamicScreenAccess().getViewClassEntityCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DynamicScreen__ViewClassAssignment_5


    // $ANTLR start rule__DynamicScreen__DeclarationsAssignment_6
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4906:1: rule__DynamicScreen__DeclarationsAssignment_6 : ( ruleDeclaration ) ;
    public final void rule__DynamicScreen__DeclarationsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4910:1: ( ( ruleDeclaration ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4911:1: ( ruleDeclaration )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4911:1: ( ruleDeclaration )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4912:1: ruleDeclaration
            {
             before(grammarAccess.getDynamicScreenAccess().getDeclarationsDeclarationParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleDeclaration_in_rule__DynamicScreen__DeclarationsAssignment_69897);
            ruleDeclaration();
            _fsp--;

             after(grammarAccess.getDynamicScreenAccess().getDeclarationsDeclarationParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DynamicScreen__DeclarationsAssignment_6


    // $ANTLR start rule__DynamicScreen__GroupsAssignment_7
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4921:1: rule__DynamicScreen__GroupsAssignment_7 : ( ruleFieldGroup ) ;
    public final void rule__DynamicScreen__GroupsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4925:1: ( ( ruleFieldGroup ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4926:1: ( ruleFieldGroup )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4926:1: ( ruleFieldGroup )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4927:1: ruleFieldGroup
            {
             before(grammarAccess.getDynamicScreenAccess().getGroupsFieldGroupParserRuleCall_7_0()); 
            pushFollow(FOLLOW_ruleFieldGroup_in_rule__DynamicScreen__GroupsAssignment_79928);
            ruleFieldGroup();
            _fsp--;

             after(grammarAccess.getDynamicScreenAccess().getGroupsFieldGroupParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DynamicScreen__GroupsAssignment_7


    // $ANTLR start rule__DataImport__ImportURIAssignment_2
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4936:1: rule__DataImport__ImportURIAssignment_2 : ( RULE_STRING ) ;
    public final void rule__DataImport__ImportURIAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4940:1: ( ( RULE_STRING ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4941:1: ( RULE_STRING )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4941:1: ( RULE_STRING )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4942:1: RULE_STRING
            {
             before(grammarAccess.getDataImportAccess().getImportURISTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__DataImport__ImportURIAssignment_29959); 
             after(grammarAccess.getDataImportAccess().getImportURISTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DataImport__ImportURIAssignment_2


    // $ANTLR start rule__Label__EnAssignment_0
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4951:1: rule__Label__EnAssignment_0 : ( RULE_STRING ) ;
    public final void rule__Label__EnAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4955:1: ( ( RULE_STRING ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4956:1: ( RULE_STRING )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4956:1: ( RULE_STRING )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4957:1: RULE_STRING
            {
             before(grammarAccess.getLabelAccess().getEnSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Label__EnAssignment_09990); 
             after(grammarAccess.getLabelAccess().getEnSTRINGTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Label__EnAssignment_0


    // $ANTLR start rule__Label__NlAssignment_1_1
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4966:1: rule__Label__NlAssignment_1_1 : ( RULE_STRING ) ;
    public final void rule__Label__NlAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4970:1: ( ( RULE_STRING ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4971:1: ( RULE_STRING )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4971:1: ( RULE_STRING )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4972:1: RULE_STRING
            {
             before(grammarAccess.getLabelAccess().getNlSTRINGTerminalRuleCall_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Label__NlAssignment_1_110021); 
             after(grammarAccess.getLabelAccess().getNlSTRINGTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Label__NlAssignment_1_1


    // $ANTLR start rule__PathTail__FieldAssignment_1
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4981:1: rule__PathTail__FieldAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__PathTail__FieldAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4985:1: ( ( ( RULE_ID ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4986:1: ( ( RULE_ID ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4986:1: ( ( RULE_ID ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4987:1: ( RULE_ID )
            {
             before(grammarAccess.getPathTailAccess().getFieldFieldCrossReference_1_0()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4988:1: ( RULE_ID )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4989:1: RULE_ID
            {
             before(grammarAccess.getPathTailAccess().getFieldFieldIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__PathTail__FieldAssignment_110056); 
             after(grammarAccess.getPathTailAccess().getFieldFieldIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getPathTailAccess().getFieldFieldCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PathTail__FieldAssignment_1


    // $ANTLR start rule__PathTail__AsEntityAssignment_2_1
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5000:1: rule__PathTail__AsEntityAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__PathTail__AsEntityAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5004:1: ( ( ( RULE_ID ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5005:1: ( ( RULE_ID ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5005:1: ( ( RULE_ID ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5006:1: ( RULE_ID )
            {
             before(grammarAccess.getPathTailAccess().getAsEntityEntityCrossReference_2_1_0()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5007:1: ( RULE_ID )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5008:1: RULE_ID
            {
             before(grammarAccess.getPathTailAccess().getAsEntityEntityIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__PathTail__AsEntityAssignment_2_110095); 
             after(grammarAccess.getPathTailAccess().getAsEntityEntityIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getPathTailAccess().getAsEntityEntityCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PathTail__AsEntityAssignment_2_1


    // $ANTLR start rule__PathTail__TailAssignment_3
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5019:1: rule__PathTail__TailAssignment_3 : ( rulePathTail ) ;
    public final void rule__PathTail__TailAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5023:1: ( ( rulePathTail ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5024:1: ( rulePathTail )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5024:1: ( rulePathTail )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5025:1: rulePathTail
            {
             before(grammarAccess.getPathTailAccess().getTailPathTailParserRuleCall_3_0()); 
            pushFollow(FOLLOW_rulePathTail_in_rule__PathTail__TailAssignment_310130);
            rulePathTail();
            _fsp--;

             after(grammarAccess.getPathTailAccess().getTailPathTailParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PathTail__TailAssignment_3


    // $ANTLR start rule__ExternalVariable__PathAssignment_1
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5034:1: rule__ExternalVariable__PathAssignment_1 : ( rulePathTail ) ;
    public final void rule__ExternalVariable__PathAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5038:1: ( ( rulePathTail ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5039:1: ( rulePathTail )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5039:1: ( rulePathTail )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5040:1: rulePathTail
            {
             before(grammarAccess.getExternalVariableAccess().getPathPathTailParserRuleCall_1_0()); 
            pushFollow(FOLLOW_rulePathTail_in_rule__ExternalVariable__PathAssignment_110161);
            rulePathTail();
            _fsp--;

             after(grammarAccess.getExternalVariableAccess().getPathPathTailParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ExternalVariable__PathAssignment_1


    // $ANTLR start rule__ExternalVariable__NameAssignment_3
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5049:1: rule__ExternalVariable__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__ExternalVariable__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5053:1: ( ( RULE_ID ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5054:1: ( RULE_ID )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5054:1: ( RULE_ID )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5055:1: RULE_ID
            {
             before(grammarAccess.getExternalVariableAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ExternalVariable__NameAssignment_310192); 
             after(grammarAccess.getExternalVariableAccess().getNameIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ExternalVariable__NameAssignment_3


    // $ANTLR start rule__EnumList__NameAssignment_1
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5064:1: rule__EnumList__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__EnumList__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5068:1: ( ( RULE_ID ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5069:1: ( RULE_ID )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5069:1: ( RULE_ID )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5070:1: RULE_ID
            {
             before(grammarAccess.getEnumListAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumList__NameAssignment_110223); 
             after(grammarAccess.getEnumListAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EnumList__NameAssignment_1


    // $ANTLR start rule__EnumList__LiteralsAssignment_4
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5079:1: rule__EnumList__LiteralsAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__EnumList__LiteralsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5083:1: ( ( ( RULE_ID ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5084:1: ( ( RULE_ID ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5084:1: ( ( RULE_ID ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5085:1: ( RULE_ID )
            {
             before(grammarAccess.getEnumListAccess().getLiteralsEnumLiteralCrossReference_4_0()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5086:1: ( RULE_ID )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5087:1: RULE_ID
            {
             before(grammarAccess.getEnumListAccess().getLiteralsEnumLiteralIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumList__LiteralsAssignment_410258); 
             after(grammarAccess.getEnumListAccess().getLiteralsEnumLiteralIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getEnumListAccess().getLiteralsEnumLiteralCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EnumList__LiteralsAssignment_4


    // $ANTLR start rule__EnumList__EnumAssignment_7
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5098:1: rule__EnumList__EnumAssignment_7 : ( ( RULE_ID ) ) ;
    public final void rule__EnumList__EnumAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5102:1: ( ( ( RULE_ID ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5103:1: ( ( RULE_ID ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5103:1: ( ( RULE_ID ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5104:1: ( RULE_ID )
            {
             before(grammarAccess.getEnumListAccess().getEnumEnumerationCrossReference_7_0()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5105:1: ( RULE_ID )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5106:1: RULE_ID
            {
             before(grammarAccess.getEnumListAccess().getEnumEnumerationIDTerminalRuleCall_7_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumList__EnumAssignment_710297); 
             after(grammarAccess.getEnumListAccess().getEnumEnumerationIDTerminalRuleCall_7_0_1()); 

            }

             after(grammarAccess.getEnumListAccess().getEnumEnumerationCrossReference_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EnumList__EnumAssignment_7


    // $ANTLR start rule__DataStore__NameAssignment_1
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5117:1: rule__DataStore__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DataStore__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5121:1: ( ( RULE_ID ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5122:1: ( RULE_ID )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5122:1: ( RULE_ID )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5123:1: RULE_ID
            {
             before(grammarAccess.getDataStoreAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DataStore__NameAssignment_110332); 
             after(grammarAccess.getDataStoreAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DataStore__NameAssignment_1


    // $ANTLR start rule__DataStore__ClassAssignment_3
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5132:1: rule__DataStore__ClassAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__DataStore__ClassAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5136:1: ( ( ( RULE_ID ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5137:1: ( ( RULE_ID ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5137:1: ( ( RULE_ID ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5138:1: ( RULE_ID )
            {
             before(grammarAccess.getDataStoreAccess().getClassEntityCrossReference_3_0()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5139:1: ( RULE_ID )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5140:1: RULE_ID
            {
             before(grammarAccess.getDataStoreAccess().getClassEntityIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DataStore__ClassAssignment_310367); 
             after(grammarAccess.getDataStoreAccess().getClassEntityIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getDataStoreAccess().getClassEntityCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DataStore__ClassAssignment_3


    // $ANTLR start rule__DataStore__MultiAssignment_4
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5151:1: rule__DataStore__MultiAssignment_4 : ( ( 'is-multi-valued' ) ) ;
    public final void rule__DataStore__MultiAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5155:1: ( ( ( 'is-multi-valued' ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5156:1: ( ( 'is-multi-valued' ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5156:1: ( ( 'is-multi-valued' ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5157:1: ( 'is-multi-valued' )
            {
             before(grammarAccess.getDataStoreAccess().getMultiIsMultiValuedKeyword_4_0()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5158:1: ( 'is-multi-valued' )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5159:1: 'is-multi-valued'
            {
             before(grammarAccess.getDataStoreAccess().getMultiIsMultiValuedKeyword_4_0()); 
            match(input,51,FOLLOW_51_in_rule__DataStore__MultiAssignment_410407); 
             after(grammarAccess.getDataStoreAccess().getMultiIsMultiValuedKeyword_4_0()); 

            }

             after(grammarAccess.getDataStoreAccess().getMultiIsMultiValuedKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DataStore__MultiAssignment_4


    // $ANTLR start rule__Field__NameAssignment_0
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5174:1: rule__Field__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Field__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5178:1: ( ( RULE_ID ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5179:1: ( RULE_ID )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5179:1: ( RULE_ID )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5180:1: RULE_ID
            {
             before(grammarAccess.getFieldAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Field__NameAssignment_010446); 
             after(grammarAccess.getFieldAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Field__NameAssignment_0


    // $ANTLR start rule__Field__LabelAssignment_1
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5189:1: rule__Field__LabelAssignment_1 : ( ruleLabel ) ;
    public final void rule__Field__LabelAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5193:1: ( ( ruleLabel ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5194:1: ( ruleLabel )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5194:1: ( ruleLabel )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5195:1: ruleLabel
            {
             before(grammarAccess.getFieldAccess().getLabelLabelParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleLabel_in_rule__Field__LabelAssignment_110477);
            ruleLabel();
            _fsp--;

             after(grammarAccess.getFieldAccess().getLabelLabelParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Field__LabelAssignment_1


    // $ANTLR start rule__Field__PathAssignment_2
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5204:1: rule__Field__PathAssignment_2 : ( rulePathTail ) ;
    public final void rule__Field__PathAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5208:1: ( ( rulePathTail ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5209:1: ( rulePathTail )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5209:1: ( rulePathTail )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5210:1: rulePathTail
            {
             before(grammarAccess.getFieldAccess().getPathPathTailParserRuleCall_2_0()); 
            pushFollow(FOLLOW_rulePathTail_in_rule__Field__PathAssignment_210508);
            rulePathTail();
            _fsp--;

             after(grammarAccess.getFieldAccess().getPathPathTailParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Field__PathAssignment_2


    // $ANTLR start rule__Field__AttributesAssignment_3
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5219:1: rule__Field__AttributesAssignment_3 : ( ruleAttribute ) ;
    public final void rule__Field__AttributesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5223:1: ( ( ruleAttribute ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5224:1: ( ruleAttribute )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5224:1: ( ruleAttribute )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5225:1: ruleAttribute
            {
             before(grammarAccess.getFieldAccess().getAttributesAttributeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleAttribute_in_rule__Field__AttributesAssignment_310539);
            ruleAttribute();
            _fsp--;

             after(grammarAccess.getFieldAccess().getAttributesAttributeParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Field__AttributesAssignment_3


    // $ANTLR start rule__FieldGroup__LabelAssignment_1
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5234:1: rule__FieldGroup__LabelAssignment_1 : ( ruleLabel ) ;
    public final void rule__FieldGroup__LabelAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5238:1: ( ( ruleLabel ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5239:1: ( ruleLabel )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5239:1: ( ruleLabel )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5240:1: ruleLabel
            {
             before(grammarAccess.getFieldGroupAccess().getLabelLabelParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleLabel_in_rule__FieldGroup__LabelAssignment_110570);
            ruleLabel();
            _fsp--;

             after(grammarAccess.getFieldGroupAccess().getLabelLabelParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FieldGroup__LabelAssignment_1


    // $ANTLR start rule__FieldGroup__WithAssignment_2_1
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5249:1: rule__FieldGroup__WithAssignment_2_1 : ( rulePathTail ) ;
    public final void rule__FieldGroup__WithAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5253:1: ( ( rulePathTail ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5254:1: ( rulePathTail )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5254:1: ( rulePathTail )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5255:1: rulePathTail
            {
             before(grammarAccess.getFieldGroupAccess().getWithPathTailParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_rulePathTail_in_rule__FieldGroup__WithAssignment_2_110601);
            rulePathTail();
            _fsp--;

             after(grammarAccess.getFieldGroupAccess().getWithPathTailParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FieldGroup__WithAssignment_2_1


    // $ANTLR start rule__FieldGroup__ElementsAssignment_4
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5264:1: rule__FieldGroup__ElementsAssignment_4 : ( ruleGroupElement ) ;
    public final void rule__FieldGroup__ElementsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5268:1: ( ( ruleGroupElement ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5269:1: ( ruleGroupElement )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5269:1: ( ruleGroupElement )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5270:1: ruleGroupElement
            {
             before(grammarAccess.getFieldGroupAccess().getElementsGroupElementParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleGroupElement_in_rule__FieldGroup__ElementsAssignment_410632);
            ruleGroupElement();
            _fsp--;

             after(grammarAccess.getFieldGroupAccess().getElementsGroupElementParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FieldGroup__ElementsAssignment_4


    // $ANTLR start rule__FieldGroup__AttributesAssignment_6
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5279:1: rule__FieldGroup__AttributesAssignment_6 : ( ruleAttribute ) ;
    public final void rule__FieldGroup__AttributesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5283:1: ( ( ruleAttribute ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5284:1: ( ruleAttribute )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5284:1: ( ruleAttribute )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5285:1: ruleAttribute
            {
             before(grammarAccess.getFieldGroupAccess().getAttributesAttributeParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleAttribute_in_rule__FieldGroup__AttributesAssignment_610663);
            ruleAttribute();
            _fsp--;

             after(grammarAccess.getFieldGroupAccess().getAttributesAttributeParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FieldGroup__AttributesAssignment_6


    // $ANTLR start rule__NormalAttribute__ClassExprAssignment_0
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5294:1: rule__NormalAttribute__ClassExprAssignment_0 : ( ruleAttributeClassExpression ) ;
    public final void rule__NormalAttribute__ClassExprAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5298:1: ( ( ruleAttributeClassExpression ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5299:1: ( ruleAttributeClassExpression )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5299:1: ( ruleAttributeClassExpression )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5300:1: ruleAttributeClassExpression
            {
             before(grammarAccess.getNormalAttributeAccess().getClassExprAttributeClassExpressionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleAttributeClassExpression_in_rule__NormalAttribute__ClassExprAssignment_010694);
            ruleAttributeClassExpression();
            _fsp--;

             after(grammarAccess.getNormalAttributeAccess().getClassExprAttributeClassExpressionParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__NormalAttribute__ClassExprAssignment_0


    // $ANTLR start rule__NormalAttribute__ClauseAssignment_1_1
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5309:1: rule__NormalAttribute__ClauseAssignment_1_1 : ( ruleBExpression ) ;
    public final void rule__NormalAttribute__ClauseAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5313:1: ( ( ruleBExpression ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5314:1: ( ruleBExpression )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5314:1: ( ruleBExpression )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5315:1: ruleBExpression
            {
             before(grammarAccess.getNormalAttributeAccess().getClauseBExpressionParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleBExpression_in_rule__NormalAttribute__ClauseAssignment_1_110725);
            ruleBExpression();
            _fsp--;

             after(grammarAccess.getNormalAttributeAccess().getClauseBExpressionParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__NormalAttribute__ClauseAssignment_1_1


    // $ANTLR start rule__AttributeClassExpression__ClassesAssignment_0
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5324:1: rule__AttributeClassExpression__ClassesAssignment_0 : ( ruleAttributeClass ) ;
    public final void rule__AttributeClassExpression__ClassesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5328:1: ( ( ruleAttributeClass ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5329:1: ( ruleAttributeClass )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5329:1: ( ruleAttributeClass )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5330:1: ruleAttributeClass
            {
             before(grammarAccess.getAttributeClassExpressionAccess().getClassesAttributeClassEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleAttributeClass_in_rule__AttributeClassExpression__ClassesAssignment_010756);
            ruleAttributeClass();
            _fsp--;

             after(grammarAccess.getAttributeClassExpressionAccess().getClassesAttributeClassEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AttributeClassExpression__ClassesAssignment_0


    // $ANTLR start rule__AttributeClassExpression__ClassesAssignment_1_1
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5339:1: rule__AttributeClassExpression__ClassesAssignment_1_1 : ( ruleAttributeClass ) ;
    public final void rule__AttributeClassExpression__ClassesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5343:1: ( ( ruleAttributeClass ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5344:1: ( ruleAttributeClass )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5344:1: ( ruleAttributeClass )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5345:1: ruleAttributeClass
            {
             before(grammarAccess.getAttributeClassExpressionAccess().getClassesAttributeClassEnumRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleAttributeClass_in_rule__AttributeClassExpression__ClassesAssignment_1_110787);
            ruleAttributeClass();
            _fsp--;

             after(grammarAccess.getAttributeClassExpressionAccess().getClassesAttributeClassEnumRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AttributeClassExpression__ClassesAssignment_1_1


    // $ANTLR start rule__RestrictionAttribute__LiteralsAssignment_1
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5354:1: rule__RestrictionAttribute__LiteralsAssignment_1 : ( ruleEnumLiteralsCollection ) ;
    public final void rule__RestrictionAttribute__LiteralsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5358:1: ( ( ruleEnumLiteralsCollection ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5359:1: ( ruleEnumLiteralsCollection )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5359:1: ( ruleEnumLiteralsCollection )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5360:1: ruleEnumLiteralsCollection
            {
             before(grammarAccess.getRestrictionAttributeAccess().getLiteralsEnumLiteralsCollectionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleEnumLiteralsCollection_in_rule__RestrictionAttribute__LiteralsAssignment_110818);
            ruleEnumLiteralsCollection();
            _fsp--;

             after(grammarAccess.getRestrictionAttributeAccess().getLiteralsEnumLiteralsCollectionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RestrictionAttribute__LiteralsAssignment_1


    // $ANTLR start rule__RestrictionAttribute__ClauseAssignment_3
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5369:1: rule__RestrictionAttribute__ClauseAssignment_3 : ( ruleBExpression ) ;
    public final void rule__RestrictionAttribute__ClauseAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5373:1: ( ( ruleBExpression ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5374:1: ( ruleBExpression )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5374:1: ( ruleBExpression )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5375:1: ruleBExpression
            {
             before(grammarAccess.getRestrictionAttributeAccess().getClauseBExpressionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleBExpression_in_rule__RestrictionAttribute__ClauseAssignment_310849);
            ruleBExpression();
            _fsp--;

             after(grammarAccess.getRestrictionAttributeAccess().getClauseBExpressionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RestrictionAttribute__ClauseAssignment_3


    // $ANTLR start rule__RestrictionGroupAttribute__RulesAssignment_3
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5384:1: rule__RestrictionGroupAttribute__RulesAssignment_3 : ( ruleRestrictionRule ) ;
    public final void rule__RestrictionGroupAttribute__RulesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5388:1: ( ( ruleRestrictionRule ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5389:1: ( ruleRestrictionRule )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5389:1: ( ruleRestrictionRule )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5390:1: ruleRestrictionRule
            {
             before(grammarAccess.getRestrictionGroupAttributeAccess().getRulesRestrictionRuleParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleRestrictionRule_in_rule__RestrictionGroupAttribute__RulesAssignment_310880);
            ruleRestrictionRule();
            _fsp--;

             after(grammarAccess.getRestrictionGroupAttributeAccess().getRulesRestrictionRuleParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RestrictionGroupAttribute__RulesAssignment_3


    // $ANTLR start rule__RestrictionRule__LiteralsAssignment_0
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5399:1: rule__RestrictionRule__LiteralsAssignment_0 : ( ruleEnumLiteralsCollection ) ;
    public final void rule__RestrictionRule__LiteralsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5403:1: ( ( ruleEnumLiteralsCollection ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5404:1: ( ruleEnumLiteralsCollection )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5404:1: ( ruleEnumLiteralsCollection )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5405:1: ruleEnumLiteralsCollection
            {
             before(grammarAccess.getRestrictionRuleAccess().getLiteralsEnumLiteralsCollectionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleEnumLiteralsCollection_in_rule__RestrictionRule__LiteralsAssignment_010911);
            ruleEnumLiteralsCollection();
            _fsp--;

             after(grammarAccess.getRestrictionRuleAccess().getLiteralsEnumLiteralsCollectionParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RestrictionRule__LiteralsAssignment_0


    // $ANTLR start rule__RestrictionRule__ClauseAssignment_2
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5414:1: rule__RestrictionRule__ClauseAssignment_2 : ( ruleBExpression ) ;
    public final void rule__RestrictionRule__ClauseAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5418:1: ( ( ruleBExpression ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5419:1: ( ruleBExpression )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5419:1: ( ruleBExpression )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5420:1: ruleBExpression
            {
             before(grammarAccess.getRestrictionRuleAccess().getClauseBExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleBExpression_in_rule__RestrictionRule__ClauseAssignment_210942);
            ruleBExpression();
            _fsp--;

             after(grammarAccess.getRestrictionRuleAccess().getClauseBExpressionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RestrictionRule__ClauseAssignment_2


    // $ANTLR start rule__Reference__RefAssignment
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5429:1: rule__Reference__RefAssignment : ( ( RULE_ID ) ) ;
    public final void rule__Reference__RefAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5433:1: ( ( ( RULE_ID ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5434:1: ( ( RULE_ID ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5434:1: ( ( RULE_ID ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5435:1: ( RULE_ID )
            {
             before(grammarAccess.getReferenceAccess().getRefReferenceTargetCrossReference_0()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5436:1: ( RULE_ID )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5437:1: RULE_ID
            {
             before(grammarAccess.getReferenceAccess().getRefReferenceTargetIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Reference__RefAssignment10977); 
             after(grammarAccess.getReferenceAccess().getRefReferenceTargetIDTerminalRuleCall_0_1()); 

            }

             after(grammarAccess.getReferenceAccess().getRefReferenceTargetCrossReference_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Reference__RefAssignment


    // $ANTLR start rule__BOrExpression__RightAssignment_1_2
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5448:1: rule__BOrExpression__RightAssignment_1_2 : ( ruleBAndExpression ) ;
    public final void rule__BOrExpression__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5452:1: ( ( ruleBAndExpression ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5453:1: ( ruleBAndExpression )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5453:1: ( ruleBAndExpression )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5454:1: ruleBAndExpression
            {
             before(grammarAccess.getBOrExpressionAccess().getRightBAndExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleBAndExpression_in_rule__BOrExpression__RightAssignment_1_211012);
            ruleBAndExpression();
            _fsp--;

             after(grammarAccess.getBOrExpressionAccess().getRightBAndExpressionParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BOrExpression__RightAssignment_1_2


    // $ANTLR start rule__BAndExpression__RightAssignment_1_2
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5463:1: rule__BAndExpression__RightAssignment_1_2 : ( ruleTerminalBExpression ) ;
    public final void rule__BAndExpression__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5467:1: ( ( ruleTerminalBExpression ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5468:1: ( ruleTerminalBExpression )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5468:1: ( ruleTerminalBExpression )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5469:1: ruleTerminalBExpression
            {
             before(grammarAccess.getBAndExpressionAccess().getRightTerminalBExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleTerminalBExpression_in_rule__BAndExpression__RightAssignment_1_211043);
            ruleTerminalBExpression();
            _fsp--;

             after(grammarAccess.getBAndExpressionAccess().getRightTerminalBExpressionParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BAndExpression__RightAssignment_1_2


    // $ANTLR start rule__NegationExpression__ExprAssignment_1
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5478:1: rule__NegationExpression__ExprAssignment_1 : ( ruleBExpression ) ;
    public final void rule__NegationExpression__ExprAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5482:1: ( ( ruleBExpression ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5483:1: ( ruleBExpression )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5483:1: ( ruleBExpression )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5484:1: ruleBExpression
            {
             before(grammarAccess.getNegationExpressionAccess().getExprBExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleBExpression_in_rule__NegationExpression__ExprAssignment_111074);
            ruleBExpression();
            _fsp--;

             after(grammarAccess.getNegationExpressionAccess().getExprBExpressionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__NegationExpression__ExprAssignment_1


    // $ANTLR start rule__BComparison__RefAssignment_1
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5493:1: rule__BComparison__RefAssignment_1 : ( ruleReference ) ;
    public final void rule__BComparison__RefAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5497:1: ( ( ruleReference ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5498:1: ( ruleReference )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5498:1: ( ruleReference )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5499:1: ruleReference
            {
             before(grammarAccess.getBComparisonAccess().getRefReferenceParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleReference_in_rule__BComparison__RefAssignment_111105);
            ruleReference();
            _fsp--;

             after(grammarAccess.getBComparisonAccess().getRefReferenceParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BComparison__RefAssignment_1


    // $ANTLR start rule__BComparison__BLiteralAssignment_2_1
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5508:1: rule__BComparison__BLiteralAssignment_2_1 : ( ruleBLiteral ) ;
    public final void rule__BComparison__BLiteralAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5512:1: ( ( ruleBLiteral ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5513:1: ( ruleBLiteral )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5513:1: ( ruleBLiteral )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5514:1: ruleBLiteral
            {
             before(grammarAccess.getBComparisonAccess().getBLiteralBLiteralEnumRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleBLiteral_in_rule__BComparison__BLiteralAssignment_2_111136);
            ruleBLiteral();
            _fsp--;

             after(grammarAccess.getBComparisonAccess().getBLiteralBLiteralEnumRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BComparison__BLiteralAssignment_2_1


    // $ANTLR start rule__SingleEnumComparison__RefAssignment_0
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5523:1: rule__SingleEnumComparison__RefAssignment_0 : ( ruleReference ) ;
    public final void rule__SingleEnumComparison__RefAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5527:1: ( ( ruleReference ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5528:1: ( ruleReference )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5528:1: ( ruleReference )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5529:1: ruleReference
            {
             before(grammarAccess.getSingleEnumComparisonAccess().getRefReferenceParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleReference_in_rule__SingleEnumComparison__RefAssignment_011167);
            ruleReference();
            _fsp--;

             after(grammarAccess.getSingleEnumComparisonAccess().getRefReferenceParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SingleEnumComparison__RefAssignment_0


    // $ANTLR start rule__SingleEnumComparison__ELiteralAssignment_2
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5538:1: rule__SingleEnumComparison__ELiteralAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__SingleEnumComparison__ELiteralAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5542:1: ( ( ( RULE_ID ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5543:1: ( ( RULE_ID ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5543:1: ( ( RULE_ID ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5544:1: ( RULE_ID )
            {
             before(grammarAccess.getSingleEnumComparisonAccess().getELiteralEnumLiteralCrossReference_2_0()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5545:1: ( RULE_ID )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5546:1: RULE_ID
            {
             before(grammarAccess.getSingleEnumComparisonAccess().getELiteralEnumLiteralIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SingleEnumComparison__ELiteralAssignment_211202); 
             after(grammarAccess.getSingleEnumComparisonAccess().getELiteralEnumLiteralIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getSingleEnumComparisonAccess().getELiteralEnumLiteralCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SingleEnumComparison__ELiteralAssignment_2


    // $ANTLR start rule__MultiEnumComparison__RefAssignment_0
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5557:1: rule__MultiEnumComparison__RefAssignment_0 : ( ruleReference ) ;
    public final void rule__MultiEnumComparison__RefAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5561:1: ( ( ruleReference ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5562:1: ( ruleReference )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5562:1: ( ruleReference )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5563:1: ruleReference
            {
             before(grammarAccess.getMultiEnumComparisonAccess().getRefReferenceParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleReference_in_rule__MultiEnumComparison__RefAssignment_011237);
            ruleReference();
            _fsp--;

             after(grammarAccess.getMultiEnumComparisonAccess().getRefReferenceParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MultiEnumComparison__RefAssignment_0


    // $ANTLR start rule__MultiEnumComparison__MembershipAssignment_1
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5572:1: rule__MultiEnumComparison__MembershipAssignment_1 : ( ruleEnumMembership ) ;
    public final void rule__MultiEnumComparison__MembershipAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5576:1: ( ( ruleEnumMembership ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5577:1: ( ruleEnumMembership )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5577:1: ( ruleEnumMembership )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5578:1: ruleEnumMembership
            {
             before(grammarAccess.getMultiEnumComparisonAccess().getMembershipEnumMembershipEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleEnumMembership_in_rule__MultiEnumComparison__MembershipAssignment_111268);
            ruleEnumMembership();
            _fsp--;

             after(grammarAccess.getMultiEnumComparisonAccess().getMembershipEnumMembershipEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MultiEnumComparison__MembershipAssignment_1


    // $ANTLR start rule__MultiEnumComparison__ELiteralsAssignment_2
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5587:1: rule__MultiEnumComparison__ELiteralsAssignment_2 : ( ruleEnumLiteralsCollection ) ;
    public final void rule__MultiEnumComparison__ELiteralsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5591:1: ( ( ruleEnumLiteralsCollection ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5592:1: ( ruleEnumLiteralsCollection )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5592:1: ( ruleEnumLiteralsCollection )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5593:1: ruleEnumLiteralsCollection
            {
             before(grammarAccess.getMultiEnumComparisonAccess().getELiteralsEnumLiteralsCollectionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleEnumLiteralsCollection_in_rule__MultiEnumComparison__ELiteralsAssignment_211299);
            ruleEnumLiteralsCollection();
            _fsp--;

             after(grammarAccess.getMultiEnumComparisonAccess().getELiteralsEnumLiteralsCollectionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MultiEnumComparison__ELiteralsAssignment_2


    // $ANTLR start rule__StringValueComparison__RefAssignment_0
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5602:1: rule__StringValueComparison__RefAssignment_0 : ( ruleReference ) ;
    public final void rule__StringValueComparison__RefAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5606:1: ( ( ruleReference ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5607:1: ( ruleReference )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5607:1: ( ruleReference )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5608:1: ruleReference
            {
             before(grammarAccess.getStringValueComparisonAccess().getRefReferenceParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleReference_in_rule__StringValueComparison__RefAssignment_011330);
            ruleReference();
            _fsp--;

             after(grammarAccess.getStringValueComparisonAccess().getRefReferenceParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StringValueComparison__RefAssignment_0


    // $ANTLR start rule__StringValueComparison__TargetValueAssignment_2
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5617:1: rule__StringValueComparison__TargetValueAssignment_2 : ( RULE_STRING ) ;
    public final void rule__StringValueComparison__TargetValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5621:1: ( ( RULE_STRING ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5622:1: ( RULE_STRING )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5622:1: ( RULE_STRING )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5623:1: RULE_STRING
            {
             before(grammarAccess.getStringValueComparisonAccess().getTargetValueSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__StringValueComparison__TargetValueAssignment_211361); 
             after(grammarAccess.getStringValueComparisonAccess().getTargetValueSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StringValueComparison__TargetValueAssignment_2


    // $ANTLR start rule__PresenceCheck__RefAssignment_0
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5632:1: rule__PresenceCheck__RefAssignment_0 : ( ruleReference ) ;
    public final void rule__PresenceCheck__RefAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5636:1: ( ( ruleReference ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5637:1: ( ruleReference )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5637:1: ( ruleReference )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5638:1: ruleReference
            {
             before(grammarAccess.getPresenceCheckAccess().getRefReferenceParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleReference_in_rule__PresenceCheck__RefAssignment_011392);
            ruleReference();
            _fsp--;

             after(grammarAccess.getPresenceCheckAccess().getRefReferenceParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PresenceCheck__RefAssignment_0


    // $ANTLR start rule__DirectEnumLiteralsCollection__LiteralsAssignment_2
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5647:1: rule__DirectEnumLiteralsCollection__LiteralsAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__DirectEnumLiteralsCollection__LiteralsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5651:1: ( ( ( RULE_ID ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5652:1: ( ( RULE_ID ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5652:1: ( ( RULE_ID ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5653:1: ( RULE_ID )
            {
             before(grammarAccess.getDirectEnumLiteralsCollectionAccess().getLiteralsEnumLiteralCrossReference_2_0()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5654:1: ( RULE_ID )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5655:1: RULE_ID
            {
             before(grammarAccess.getDirectEnumLiteralsCollectionAccess().getLiteralsEnumLiteralIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DirectEnumLiteralsCollection__LiteralsAssignment_211427); 
             after(grammarAccess.getDirectEnumLiteralsCollectionAccess().getLiteralsEnumLiteralIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getDirectEnumLiteralsCollectionAccess().getLiteralsEnumLiteralCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DirectEnumLiteralsCollection__LiteralsAssignment_2


    // $ANTLR start rule__EnumListReference__RefAssignment
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5666:1: rule__EnumListReference__RefAssignment : ( ( RULE_ID ) ) ;
    public final void rule__EnumListReference__RefAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5670:1: ( ( ( RULE_ID ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5671:1: ( ( RULE_ID ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5671:1: ( ( RULE_ID ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5672:1: ( RULE_ID )
            {
             before(grammarAccess.getEnumListReferenceAccess().getRefEnumListCrossReference_0()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5673:1: ( RULE_ID )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5674:1: RULE_ID
            {
             before(grammarAccess.getEnumListReferenceAccess().getRefEnumListIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumListReference__RefAssignment11466); 
             after(grammarAccess.getEnumListReferenceAccess().getRefEnumListIDTerminalRuleCall_0_1()); 

            }

             after(grammarAccess.getEnumListReferenceAccess().getRefEnumListCrossReference_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EnumListReference__RefAssignment


 

    public static final BitSet FOLLOW_ruleDynamicScreen_in_entryRuleDynamicScreen61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDynamicScreen68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DynamicScreen__Group__0_in_ruleDynamicScreen94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataImport_in_entryRuleDataImport121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataImport128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataImport__Group__0_in_ruleDataImport154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabel_in_entryRuleLabel181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLabel188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Label__Group__0_in_ruleLabel214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePathTail_in_entryRulePathTail241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePathTail248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PathTail__Group__0_in_rulePathTail274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_entryRuleDeclaration301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeclaration308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Alternatives_in_ruleDeclaration334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExternalVariable_in_entryRuleExternalVariable361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExternalVariable368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalVariable__Group__0_in_ruleExternalVariable394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumList_in_entryRuleEnumList421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumList428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumList__Group__0_in_ruleEnumList454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataStore_in_entryRuleDataStore481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataStore488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataStore__Group__0_in_ruleDataStore514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGroupElement_in_entryRuleGroupElement541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGroupElement548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GroupElement__Alternatives_in_ruleGroupElement574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_in_entryRuleField601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleField608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__0_in_ruleField634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldGroup_in_entryRuleFieldGroup661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFieldGroup668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldGroup__Group__0_in_ruleFieldGroup694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Alternatives_in_ruleAttribute754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumFieldAttribute_in_entryRuleEnumFieldAttribute781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumFieldAttribute788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumFieldAttribute__Alternatives_in_ruleEnumFieldAttribute814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNormalAttribute_in_entryRuleNormalAttribute841 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNormalAttribute848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NormalAttribute__Group__0_in_ruleNormalAttribute874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeClassExpression_in_entryRuleAttributeClassExpression901 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributeClassExpression908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeClassExpression__Group__0_in_ruleAttributeClassExpression934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRestrictionAttribute_in_entryRuleRestrictionAttribute961 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRestrictionAttribute968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RestrictionAttribute__Group__0_in_ruleRestrictionAttribute994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRestrictionGroupAttribute_in_entryRuleRestrictionGroupAttribute1021 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRestrictionGroupAttribute1028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RestrictionGroupAttribute__Group__0_in_ruleRestrictionGroupAttribute1054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRestrictionRule_in_entryRuleRestrictionRule1081 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRestrictionRule1088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RestrictionRule__Group__0_in_ruleRestrictionRule1114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReferenceTarget_in_entryRuleReferenceTarget1141 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReferenceTarget1148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReferenceTarget__Alternatives_in_ruleReferenceTarget1174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_entryRuleReference1201 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReference1208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__RefAssignment_in_ruleReference1234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBExpression_in_entryRuleBExpression1263 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBExpression1270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBOrExpression_in_ruleBExpression1296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBOrExpression_in_entryRuleBOrExpression1322 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBOrExpression1329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BOrExpression__Group__0_in_ruleBOrExpression1355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBAndExpression_in_entryRuleBAndExpression1382 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBAndExpression1389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BAndExpression__Group__0_in_ruleBAndExpression1415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminalBExpression_in_entryRuleTerminalBExpression1442 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTerminalBExpression1449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalBExpression__Alternatives_in_ruleTerminalBExpression1475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNegationExpression_in_entryRuleNegationExpression1502 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNegationExpression1509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NegationExpression__Group__0_in_ruleNegationExpression1535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicReferringBExpression_in_entryRuleAtomicReferringBExpression1562 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtomicReferringBExpression1569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicReferringBExpression__Alternatives_in_ruleAtomicReferringBExpression1595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBComparison_in_entryRuleBComparison1622 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBComparison1629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BComparison__Group__0_in_ruleBComparison1655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumComparison_in_entryRuleEnumComparison1682 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumComparison1689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumComparison__Alternatives_in_ruleEnumComparison1715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleEnumComparison_in_entryRuleSingleEnumComparison1742 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSingleEnumComparison1749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SingleEnumComparison__Group__0_in_ruleSingleEnumComparison1775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiEnumComparison_in_entryRuleMultiEnumComparison1802 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiEnumComparison1809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiEnumComparison__Group__0_in_ruleMultiEnumComparison1835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValueComparison_in_entryRuleStringValueComparison1862 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringValueComparison1869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringValueComparison__Group__0_in_ruleStringValueComparison1895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePresenceCheck_in_entryRulePresenceCheck1922 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePresenceCheck1929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PresenceCheck__Group__0_in_rulePresenceCheck1955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumLiteralsCollection_in_entryRuleEnumLiteralsCollection1982 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumLiteralsCollection1989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumLiteralsCollection__Alternatives_in_ruleEnumLiteralsCollection2015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDirectEnumLiteralsCollection_in_entryRuleDirectEnumLiteralsCollection2042 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDirectEnumLiteralsCollection2049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DirectEnumLiteralsCollection__Group__0_in_ruleDirectEnumLiteralsCollection2075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumListReference_in_entryRuleEnumListReference2102 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumListReference2109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumListReference__RefAssignment_in_ruleEnumListReference2135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeClass__Alternatives_in_ruleAttributeClass2172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BLiteral__Alternatives_in_ruleBLiteral2208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumMembership__Alternatives_in_ruleEnumMembership2244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExternalVariable_in_rule__Declaration__Alternatives2279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumList_in_rule__Declaration__Alternatives2296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataStore_in_rule__Declaration__Alternatives2313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_in_rule__GroupElement__Alternatives2345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldGroup_in_rule__GroupElement__Alternatives2362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNormalAttribute_in_rule__Attribute__Alternatives2394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumFieldAttribute_in_rule__Attribute__Alternatives2411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRestrictionAttribute_in_rule__EnumFieldAttribute__Alternatives2443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRestrictionGroupAttribute_in_rule__EnumFieldAttribute__Alternatives2460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_in_rule__ReferenceTarget__Alternatives2492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExternalVariable_in_rule__ReferenceTarget__Alternatives2509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicReferringBExpression_in_rule__TerminalBExpression__Alternatives2542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNegationExpression_in_rule__TerminalBExpression__Alternatives2559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalBExpression__Group_2__0_in_rule__TerminalBExpression__Alternatives2576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBComparison_in_rule__AtomicReferringBExpression__Alternatives2609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumComparison_in_rule__AtomicReferringBExpression__Alternatives2626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValueComparison_in_rule__AtomicReferringBExpression__Alternatives2643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePresenceCheck_in_rule__AtomicReferringBExpression__Alternatives2660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleEnumComparison_in_rule__EnumComparison__Alternatives2692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiEnumComparison_in_rule__EnumComparison__Alternatives2709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDirectEnumLiteralsCollection_in_rule__EnumLiteralsCollection__Alternatives2741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumListReference_in_rule__EnumLiteralsCollection__Alternatives2758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__AttributeClass__Alternatives2791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__AttributeClass__Alternatives2812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__AttributeClass__Alternatives2833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__AttributeClass__Alternatives2854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__AttributeClass__Alternatives2875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__BLiteral__Alternatives2911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__BLiteral__Alternatives2932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__EnumMembership__Alternatives2968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__EnumMembership__Alternatives2989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DynamicScreen__Group__0__Impl_in_rule__DynamicScreen__Group__03022 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__DynamicScreen__Group__1_in_rule__DynamicScreen__Group__03025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__DynamicScreen__Group__0__Impl3053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DynamicScreen__Group__1__Impl_in_rule__DynamicScreen__Group__13084 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__DynamicScreen__Group__2_in_rule__DynamicScreen__Group__13087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DynamicScreen__LabelAssignment_1_in_rule__DynamicScreen__Group__1__Impl3114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DynamicScreen__Group__2__Impl_in_rule__DynamicScreen__Group__23144 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__DynamicScreen__Group__3_in_rule__DynamicScreen__Group__23147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DynamicScreen__DataImportAssignment_2_in_rule__DynamicScreen__Group__2__Impl3174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DynamicScreen__Group__3__Impl_in_rule__DynamicScreen__Group__33204 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__DynamicScreen__Group__4_in_rule__DynamicScreen__Group__33207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__DynamicScreen__Group__3__Impl3235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DynamicScreen__Group__4__Impl_in_rule__DynamicScreen__Group__43266 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DynamicScreen__Group__5_in_rule__DynamicScreen__Group__43269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__DynamicScreen__Group__4__Impl3297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DynamicScreen__Group__5__Impl_in_rule__DynamicScreen__Group__53328 = new BitSet(new long[]{0x0000000AA0000000L});
    public static final BitSet FOLLOW_rule__DynamicScreen__Group__6_in_rule__DynamicScreen__Group__53331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DynamicScreen__ViewClassAssignment_5_in_rule__DynamicScreen__Group__5__Impl3358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DynamicScreen__Group__6__Impl_in_rule__DynamicScreen__Group__63388 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__DynamicScreen__Group__7_in_rule__DynamicScreen__Group__63391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DynamicScreen__DeclarationsAssignment_6_in_rule__DynamicScreen__Group__6__Impl3418 = new BitSet(new long[]{0x00000002A0000002L});
    public static final BitSet FOLLOW_rule__DynamicScreen__Group__7__Impl_in_rule__DynamicScreen__Group__73449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DynamicScreen__GroupsAssignment_7_in_rule__DynamicScreen__Group__7__Impl3478 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_rule__DynamicScreen__GroupsAssignment_7_in_rule__DynamicScreen__Group__7__Impl3490 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_rule__DataImport__Group__0__Impl_in_rule__DataImport__Group__03539 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__DataImport__Group__1_in_rule__DataImport__Group__03542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__DataImport__Group__0__Impl3570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataImport__Group__1__Impl_in_rule__DataImport__Group__13601 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__DataImport__Group__2_in_rule__DataImport__Group__13604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__DataImport__Group__1__Impl3632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataImport__Group__2__Impl_in_rule__DataImport__Group__23663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataImport__ImportURIAssignment_2_in_rule__DataImport__Group__2__Impl3690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Label__Group__0__Impl_in_rule__Label__Group__03726 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_rule__Label__Group__1_in_rule__Label__Group__03729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Label__EnAssignment_0_in_rule__Label__Group__0__Impl3756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Label__Group__1__Impl_in_rule__Label__Group__13786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Label__Group_1__0_in_rule__Label__Group__1__Impl3813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Label__Group_1__0__Impl_in_rule__Label__Group_1__03848 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Label__Group_1__1_in_rule__Label__Group_1__03851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Label__Group_1__0__Impl3879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Label__Group_1__1__Impl_in_rule__Label__Group_1__13910 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Label__Group_1__2_in_rule__Label__Group_1__13913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Label__NlAssignment_1_1_in_rule__Label__Group_1__1__Impl3940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Label__Group_1__2__Impl_in_rule__Label__Group_1__23970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Label__Group_1__2__Impl3998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PathTail__Group__0__Impl_in_rule__PathTail__Group__04035 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__PathTail__Group__1_in_rule__PathTail__Group__04038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__PathTail__Group__0__Impl4066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PathTail__Group__1__Impl_in_rule__PathTail__Group__14097 = new BitSet(new long[]{0x000000000C000002L});
    public static final BitSet FOLLOW_rule__PathTail__Group__2_in_rule__PathTail__Group__14100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PathTail__FieldAssignment_1_in_rule__PathTail__Group__1__Impl4127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PathTail__Group__2__Impl_in_rule__PathTail__Group__24157 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__PathTail__Group__3_in_rule__PathTail__Group__24160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PathTail__Group_2__0_in_rule__PathTail__Group__2__Impl4187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PathTail__Group__3__Impl_in_rule__PathTail__Group__34218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PathTail__TailAssignment_3_in_rule__PathTail__Group__3__Impl4245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PathTail__Group_2__0__Impl_in_rule__PathTail__Group_2__04284 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__PathTail__Group_2__1_in_rule__PathTail__Group_2__04287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__PathTail__Group_2__0__Impl4315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PathTail__Group_2__1__Impl_in_rule__PathTail__Group_2__14346 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__PathTail__Group_2__2_in_rule__PathTail__Group_2__14349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PathTail__AsEntityAssignment_2_1_in_rule__PathTail__Group_2__1__Impl4376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PathTail__Group_2__2__Impl_in_rule__PathTail__Group_2__24406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__PathTail__Group_2__2__Impl4434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalVariable__Group__0__Impl_in_rule__ExternalVariable__Group__04471 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__ExternalVariable__Group__1_in_rule__ExternalVariable__Group__04474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__ExternalVariable__Group__0__Impl4502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalVariable__Group__1__Impl_in_rule__ExternalVariable__Group__14533 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__ExternalVariable__Group__2_in_rule__ExternalVariable__Group__14536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalVariable__PathAssignment_1_in_rule__ExternalVariable__Group__1__Impl4563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalVariable__Group__2__Impl_in_rule__ExternalVariable__Group__24593 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ExternalVariable__Group__3_in_rule__ExternalVariable__Group__24596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__ExternalVariable__Group__2__Impl4624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalVariable__Group__3__Impl_in_rule__ExternalVariable__Group__34655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalVariable__NameAssignment_3_in_rule__ExternalVariable__Group__3__Impl4682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumList__Group__0__Impl_in_rule__EnumList__Group__04720 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EnumList__Group__1_in_rule__EnumList__Group__04723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__EnumList__Group__0__Impl4751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumList__Group__1__Impl_in_rule__EnumList__Group__14782 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__EnumList__Group__2_in_rule__EnumList__Group__14785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumList__NameAssignment_1_in_rule__EnumList__Group__1__Impl4812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumList__Group__2__Impl_in_rule__EnumList__Group__24842 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__EnumList__Group__3_in_rule__EnumList__Group__24845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__EnumList__Group__2__Impl4873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumList__Group__3__Impl_in_rule__EnumList__Group__34904 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EnumList__Group__4_in_rule__EnumList__Group__34907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__EnumList__Group__3__Impl4935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumList__Group__4__Impl_in_rule__EnumList__Group__44966 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__EnumList__Group__5_in_rule__EnumList__Group__44969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumList__LiteralsAssignment_4_in_rule__EnumList__Group__4__Impl4998 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__EnumList__LiteralsAssignment_4_in_rule__EnumList__Group__4__Impl5010 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__EnumList__Group__5__Impl_in_rule__EnumList__Group__55043 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__EnumList__Group__6_in_rule__EnumList__Group__55046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__EnumList__Group__5__Impl5074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumList__Group__6__Impl_in_rule__EnumList__Group__65105 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EnumList__Group__7_in_rule__EnumList__Group__65108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__EnumList__Group__6__Impl5136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumList__Group__7__Impl_in_rule__EnumList__Group__75167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumList__EnumAssignment_7_in_rule__EnumList__Group__7__Impl5194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataStore__Group__0__Impl_in_rule__DataStore__Group__05240 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DataStore__Group__1_in_rule__DataStore__Group__05243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__DataStore__Group__0__Impl5271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataStore__Group__1__Impl_in_rule__DataStore__Group__15302 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__DataStore__Group__2_in_rule__DataStore__Group__15305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataStore__NameAssignment_1_in_rule__DataStore__Group__1__Impl5332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataStore__Group__2__Impl_in_rule__DataStore__Group__25362 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DataStore__Group__3_in_rule__DataStore__Group__25365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__DataStore__Group__2__Impl5393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataStore__Group__3__Impl_in_rule__DataStore__Group__35424 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_rule__DataStore__Group__4_in_rule__DataStore__Group__35427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataStore__ClassAssignment_3_in_rule__DataStore__Group__3__Impl5454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataStore__Group__4__Impl_in_rule__DataStore__Group__45484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataStore__MultiAssignment_4_in_rule__DataStore__Group__4__Impl5511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__0__Impl_in_rule__Field__Group__05552 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Field__Group__1_in_rule__Field__Group__05555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__NameAssignment_0_in_rule__Field__Group__0__Impl5582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__1__Impl_in_rule__Field__Group__15612 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Field__Group__2_in_rule__Field__Group__15615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__LabelAssignment_1_in_rule__Field__Group__1__Impl5642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__2__Impl_in_rule__Field__Group__25672 = new BitSet(new long[]{0x000006000000F802L});
    public static final BitSet FOLLOW_rule__Field__Group__3_in_rule__Field__Group__25675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__PathAssignment_2_in_rule__Field__Group__2__Impl5702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__3__Impl_in_rule__Field__Group__35732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__AttributesAssignment_3_in_rule__Field__Group__3__Impl5759 = new BitSet(new long[]{0x000006000000F802L});
    public static final BitSet FOLLOW_rule__FieldGroup__Group__0__Impl_in_rule__FieldGroup__Group__05798 = new BitSet(new long[]{0x0000005000000020L});
    public static final BitSet FOLLOW_rule__FieldGroup__Group__1_in_rule__FieldGroup__Group__05801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__FieldGroup__Group__0__Impl5829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldGroup__Group__1__Impl_in_rule__FieldGroup__Group__15860 = new BitSet(new long[]{0x0000005000000000L});
    public static final BitSet FOLLOW_rule__FieldGroup__Group__2_in_rule__FieldGroup__Group__15863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldGroup__LabelAssignment_1_in_rule__FieldGroup__Group__1__Impl5890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldGroup__Group__2__Impl_in_rule__FieldGroup__Group__25921 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__FieldGroup__Group__3_in_rule__FieldGroup__Group__25924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldGroup__Group_2__0_in_rule__FieldGroup__Group__2__Impl5951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldGroup__Group__3__Impl_in_rule__FieldGroup__Group__35982 = new BitSet(new long[]{0x0000000800000010L});
    public static final BitSet FOLLOW_rule__FieldGroup__Group__4_in_rule__FieldGroup__Group__35985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__FieldGroup__Group__3__Impl6013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldGroup__Group__4__Impl_in_rule__FieldGroup__Group__46044 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__FieldGroup__Group__5_in_rule__FieldGroup__Group__46047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldGroup__ElementsAssignment_4_in_rule__FieldGroup__Group__4__Impl6076 = new BitSet(new long[]{0x0000000800000012L});
    public static final BitSet FOLLOW_rule__FieldGroup__ElementsAssignment_4_in_rule__FieldGroup__Group__4__Impl6088 = new BitSet(new long[]{0x0000000800000012L});
    public static final BitSet FOLLOW_rule__FieldGroup__Group__5__Impl_in_rule__FieldGroup__Group__56121 = new BitSet(new long[]{0x000006000000F802L});
    public static final BitSet FOLLOW_rule__FieldGroup__Group__6_in_rule__FieldGroup__Group__56124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__FieldGroup__Group__5__Impl6152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldGroup__Group__6__Impl_in_rule__FieldGroup__Group__66183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldGroup__AttributesAssignment_6_in_rule__FieldGroup__Group__6__Impl6210 = new BitSet(new long[]{0x000006000000F802L});
    public static final BitSet FOLLOW_rule__FieldGroup__Group_2__0__Impl_in_rule__FieldGroup__Group_2__06255 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__FieldGroup__Group_2__1_in_rule__FieldGroup__Group_2__06258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__FieldGroup__Group_2__0__Impl6286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldGroup__Group_2__1__Impl_in_rule__FieldGroup__Group_2__16317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldGroup__WithAssignment_2_1_in_rule__FieldGroup__Group_2__1__Impl6344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NormalAttribute__Group__0__Impl_in_rule__NormalAttribute__Group__06378 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_rule__NormalAttribute__Group__1_in_rule__NormalAttribute__Group__06381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NormalAttribute__ClassExprAssignment_0_in_rule__NormalAttribute__Group__0__Impl6408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NormalAttribute__Group__1__Impl_in_rule__NormalAttribute__Group__16438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NormalAttribute__Group_1__0_in_rule__NormalAttribute__Group__1__Impl6465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NormalAttribute__Group_1__0__Impl_in_rule__NormalAttribute__Group_1__06500 = new BitSet(new long[]{0x0000800008000010L});
    public static final BitSet FOLLOW_rule__NormalAttribute__Group_1__1_in_rule__NormalAttribute__Group_1__06503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__NormalAttribute__Group_1__0__Impl6531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NormalAttribute__Group_1__1__Impl_in_rule__NormalAttribute__Group_1__16562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NormalAttribute__ClauseAssignment_1_1_in_rule__NormalAttribute__Group_1__1__Impl6589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeClassExpression__Group__0__Impl_in_rule__AttributeClassExpression__Group__06623 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_rule__AttributeClassExpression__Group__1_in_rule__AttributeClassExpression__Group__06626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeClassExpression__ClassesAssignment_0_in_rule__AttributeClassExpression__Group__0__Impl6653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeClassExpression__Group__1__Impl_in_rule__AttributeClassExpression__Group__16683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeClassExpression__Group_1__0_in_rule__AttributeClassExpression__Group__1__Impl6710 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_rule__AttributeClassExpression__Group_1__0__Impl_in_rule__AttributeClassExpression__Group_1__06745 = new BitSet(new long[]{0x000000000000F800L});
    public static final BitSet FOLLOW_rule__AttributeClassExpression__Group_1__1_in_rule__AttributeClassExpression__Group_1__06748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__AttributeClassExpression__Group_1__0__Impl6776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeClassExpression__Group_1__1__Impl_in_rule__AttributeClassExpression__Group_1__16807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeClassExpression__ClassesAssignment_1_1_in_rule__AttributeClassExpression__Group_1__1__Impl6834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RestrictionAttribute__Group__0__Impl_in_rule__RestrictionAttribute__Group__06868 = new BitSet(new long[]{0x0000000008000010L});
    public static final BitSet FOLLOW_rule__RestrictionAttribute__Group__1_in_rule__RestrictionAttribute__Group__06871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__RestrictionAttribute__Group__0__Impl6899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RestrictionAttribute__Group__1__Impl_in_rule__RestrictionAttribute__Group__16930 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__RestrictionAttribute__Group__2_in_rule__RestrictionAttribute__Group__16933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RestrictionAttribute__LiteralsAssignment_1_in_rule__RestrictionAttribute__Group__1__Impl6960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RestrictionAttribute__Group__2__Impl_in_rule__RestrictionAttribute__Group__26990 = new BitSet(new long[]{0x0000800008000010L});
    public static final BitSet FOLLOW_rule__RestrictionAttribute__Group__3_in_rule__RestrictionAttribute__Group__26993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__RestrictionAttribute__Group__2__Impl7021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RestrictionAttribute__Group__3__Impl_in_rule__RestrictionAttribute__Group__37052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RestrictionAttribute__ClauseAssignment_3_in_rule__RestrictionAttribute__Group__3__Impl7079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RestrictionGroupAttribute__Group__0__Impl_in_rule__RestrictionGroupAttribute__Group__07117 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__RestrictionGroupAttribute__Group__1_in_rule__RestrictionGroupAttribute__Group__07120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RestrictionGroupAttribute__Group__1__Impl_in_rule__RestrictionGroupAttribute__Group__17178 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__RestrictionGroupAttribute__Group__2_in_rule__RestrictionGroupAttribute__Group__17181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__RestrictionGroupAttribute__Group__1__Impl7209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RestrictionGroupAttribute__Group__2__Impl_in_rule__RestrictionGroupAttribute__Group__27240 = new BitSet(new long[]{0x0000000008000010L});
    public static final BitSet FOLLOW_rule__RestrictionGroupAttribute__Group__3_in_rule__RestrictionGroupAttribute__Group__27243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__RestrictionGroupAttribute__Group__2__Impl7271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RestrictionGroupAttribute__Group__3__Impl_in_rule__RestrictionGroupAttribute__Group__37302 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__RestrictionGroupAttribute__Group__4_in_rule__RestrictionGroupAttribute__Group__37305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RestrictionGroupAttribute__RulesAssignment_3_in_rule__RestrictionGroupAttribute__Group__3__Impl7334 = new BitSet(new long[]{0x0000000008000012L});
    public static final BitSet FOLLOW_rule__RestrictionGroupAttribute__RulesAssignment_3_in_rule__RestrictionGroupAttribute__Group__3__Impl7346 = new BitSet(new long[]{0x0000000008000012L});
    public static final BitSet FOLLOW_rule__RestrictionGroupAttribute__Group__4__Impl_in_rule__RestrictionGroupAttribute__Group__47379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__RestrictionGroupAttribute__Group__4__Impl7407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RestrictionRule__Group__0__Impl_in_rule__RestrictionRule__Group__07448 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__RestrictionRule__Group__1_in_rule__RestrictionRule__Group__07451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RestrictionRule__LiteralsAssignment_0_in_rule__RestrictionRule__Group__0__Impl7478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RestrictionRule__Group__1__Impl_in_rule__RestrictionRule__Group__17508 = new BitSet(new long[]{0x0000800008000010L});
    public static final BitSet FOLLOW_rule__RestrictionRule__Group__2_in_rule__RestrictionRule__Group__17511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__RestrictionRule__Group__1__Impl7539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RestrictionRule__Group__2__Impl_in_rule__RestrictionRule__Group__27570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RestrictionRule__ClauseAssignment_2_in_rule__RestrictionRule__Group__2__Impl7597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BOrExpression__Group__0__Impl_in_rule__BOrExpression__Group__07633 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_rule__BOrExpression__Group__1_in_rule__BOrExpression__Group__07636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBAndExpression_in_rule__BOrExpression__Group__0__Impl7663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BOrExpression__Group__1__Impl_in_rule__BOrExpression__Group__17692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BOrExpression__Group_1__0_in_rule__BOrExpression__Group__1__Impl7719 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_rule__BOrExpression__Group_1__0__Impl_in_rule__BOrExpression__Group_1__07754 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_rule__BOrExpression__Group_1__1_in_rule__BOrExpression__Group_1__07757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BOrExpression__Group_1__1__Impl_in_rule__BOrExpression__Group_1__17815 = new BitSet(new long[]{0x0000800008000010L});
    public static final BitSet FOLLOW_rule__BOrExpression__Group_1__2_in_rule__BOrExpression__Group_1__17818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__BOrExpression__Group_1__1__Impl7846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BOrExpression__Group_1__2__Impl_in_rule__BOrExpression__Group_1__27877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BOrExpression__RightAssignment_1_2_in_rule__BOrExpression__Group_1__2__Impl7904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BAndExpression__Group__0__Impl_in_rule__BAndExpression__Group__07940 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_rule__BAndExpression__Group__1_in_rule__BAndExpression__Group__07943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminalBExpression_in_rule__BAndExpression__Group__0__Impl7970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BAndExpression__Group__1__Impl_in_rule__BAndExpression__Group__17999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BAndExpression__Group_1__0_in_rule__BAndExpression__Group__1__Impl8026 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_rule__BAndExpression__Group_1__0__Impl_in_rule__BAndExpression__Group_1__08061 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_rule__BAndExpression__Group_1__1_in_rule__BAndExpression__Group_1__08064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BAndExpression__Group_1__1__Impl_in_rule__BAndExpression__Group_1__18122 = new BitSet(new long[]{0x0000800008000010L});
    public static final BitSet FOLLOW_rule__BAndExpression__Group_1__2_in_rule__BAndExpression__Group_1__18125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__BAndExpression__Group_1__1__Impl8153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BAndExpression__Group_1__2__Impl_in_rule__BAndExpression__Group_1__28184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BAndExpression__RightAssignment_1_2_in_rule__BAndExpression__Group_1__2__Impl8211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalBExpression__Group_2__0__Impl_in_rule__TerminalBExpression__Group_2__08247 = new BitSet(new long[]{0x0000800008000010L});
    public static final BitSet FOLLOW_rule__TerminalBExpression__Group_2__1_in_rule__TerminalBExpression__Group_2__08250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__TerminalBExpression__Group_2__0__Impl8278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalBExpression__Group_2__1__Impl_in_rule__TerminalBExpression__Group_2__18309 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__TerminalBExpression__Group_2__2_in_rule__TerminalBExpression__Group_2__18312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBExpression_in_rule__TerminalBExpression__Group_2__1__Impl8339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalBExpression__Group_2__2__Impl_in_rule__TerminalBExpression__Group_2__28368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__TerminalBExpression__Group_2__2__Impl8396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NegationExpression__Group__0__Impl_in_rule__NegationExpression__Group__08433 = new BitSet(new long[]{0x0000800008000010L});
    public static final BitSet FOLLOW_rule__NegationExpression__Group__1_in_rule__NegationExpression__Group__08436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__NegationExpression__Group__0__Impl8464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NegationExpression__Group__1__Impl_in_rule__NegationExpression__Group__18495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NegationExpression__ExprAssignment_1_in_rule__NegationExpression__Group__1__Impl8522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BComparison__Group__0__Impl_in_rule__BComparison__Group__08556 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__BComparison__Group__1_in_rule__BComparison__Group__08559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BComparison__Group__1__Impl_in_rule__BComparison__Group__18617 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_rule__BComparison__Group__2_in_rule__BComparison__Group__18620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BComparison__RefAssignment_1_in_rule__BComparison__Group__1__Impl8647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BComparison__Group__2__Impl_in_rule__BComparison__Group__28677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BComparison__Group_2__0_in_rule__BComparison__Group__2__Impl8704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BComparison__Group_2__0__Impl_in_rule__BComparison__Group_2__08741 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_rule__BComparison__Group_2__1_in_rule__BComparison__Group_2__08744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__BComparison__Group_2__0__Impl8772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BComparison__Group_2__1__Impl_in_rule__BComparison__Group_2__18803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BComparison__BLiteralAssignment_2_1_in_rule__BComparison__Group_2__1__Impl8830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SingleEnumComparison__Group__0__Impl_in_rule__SingleEnumComparison__Group__08864 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__SingleEnumComparison__Group__1_in_rule__SingleEnumComparison__Group__08867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SingleEnumComparison__RefAssignment_0_in_rule__SingleEnumComparison__Group__0__Impl8894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SingleEnumComparison__Group__1__Impl_in_rule__SingleEnumComparison__Group__18924 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SingleEnumComparison__Group__2_in_rule__SingleEnumComparison__Group__18927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__SingleEnumComparison__Group__1__Impl8955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SingleEnumComparison__Group__2__Impl_in_rule__SingleEnumComparison__Group__28986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SingleEnumComparison__ELiteralAssignment_2_in_rule__SingleEnumComparison__Group__2__Impl9013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiEnumComparison__Group__0__Impl_in_rule__MultiEnumComparison__Group__09049 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_rule__MultiEnumComparison__Group__1_in_rule__MultiEnumComparison__Group__09052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiEnumComparison__RefAssignment_0_in_rule__MultiEnumComparison__Group__0__Impl9079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiEnumComparison__Group__1__Impl_in_rule__MultiEnumComparison__Group__19109 = new BitSet(new long[]{0x0000000008000010L});
    public static final BitSet FOLLOW_rule__MultiEnumComparison__Group__2_in_rule__MultiEnumComparison__Group__19112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiEnumComparison__MembershipAssignment_1_in_rule__MultiEnumComparison__Group__1__Impl9139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiEnumComparison__Group__2__Impl_in_rule__MultiEnumComparison__Group__29169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiEnumComparison__ELiteralsAssignment_2_in_rule__MultiEnumComparison__Group__2__Impl9196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringValueComparison__Group__0__Impl_in_rule__StringValueComparison__Group__09232 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_rule__StringValueComparison__Group__1_in_rule__StringValueComparison__Group__09235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringValueComparison__RefAssignment_0_in_rule__StringValueComparison__Group__0__Impl9262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringValueComparison__Group__1__Impl_in_rule__StringValueComparison__Group__19292 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__StringValueComparison__Group__2_in_rule__StringValueComparison__Group__19295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__StringValueComparison__Group__1__Impl9323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringValueComparison__Group__2__Impl_in_rule__StringValueComparison__Group__29354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringValueComparison__TargetValueAssignment_2_in_rule__StringValueComparison__Group__2__Impl9381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PresenceCheck__Group__0__Impl_in_rule__PresenceCheck__Group__09417 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_rule__PresenceCheck__Group__1_in_rule__PresenceCheck__Group__09420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PresenceCheck__RefAssignment_0_in_rule__PresenceCheck__Group__0__Impl9447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PresenceCheck__Group__1__Impl_in_rule__PresenceCheck__Group__19477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__PresenceCheck__Group__1__Impl9505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DirectEnumLiteralsCollection__Group__0__Impl_in_rule__DirectEnumLiteralsCollection__Group__09540 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__DirectEnumLiteralsCollection__Group__1_in_rule__DirectEnumLiteralsCollection__Group__09543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DirectEnumLiteralsCollection__Group__1__Impl_in_rule__DirectEnumLiteralsCollection__Group__19601 = new BitSet(new long[]{0x0000000010000010L});
    public static final BitSet FOLLOW_rule__DirectEnumLiteralsCollection__Group__2_in_rule__DirectEnumLiteralsCollection__Group__19604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__DirectEnumLiteralsCollection__Group__1__Impl9632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DirectEnumLiteralsCollection__Group__2__Impl_in_rule__DirectEnumLiteralsCollection__Group__29663 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__DirectEnumLiteralsCollection__Group__3_in_rule__DirectEnumLiteralsCollection__Group__29666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DirectEnumLiteralsCollection__LiteralsAssignment_2_in_rule__DirectEnumLiteralsCollection__Group__2__Impl9693 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__DirectEnumLiteralsCollection__Group__3__Impl_in_rule__DirectEnumLiteralsCollection__Group__39724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__DirectEnumLiteralsCollection__Group__3__Impl9752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabel_in_rule__DynamicScreen__LabelAssignment_19796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataImport_in_rule__DynamicScreen__DataImportAssignment_29827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DynamicScreen__ViewClassAssignment_59862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_rule__DynamicScreen__DeclarationsAssignment_69897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldGroup_in_rule__DynamicScreen__GroupsAssignment_79928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__DataImport__ImportURIAssignment_29959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Label__EnAssignment_09990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Label__NlAssignment_1_110021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__PathTail__FieldAssignment_110056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__PathTail__AsEntityAssignment_2_110095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePathTail_in_rule__PathTail__TailAssignment_310130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePathTail_in_rule__ExternalVariable__PathAssignment_110161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ExternalVariable__NameAssignment_310192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumList__NameAssignment_110223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumList__LiteralsAssignment_410258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumList__EnumAssignment_710297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DataStore__NameAssignment_110332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DataStore__ClassAssignment_310367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__DataStore__MultiAssignment_410407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Field__NameAssignment_010446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabel_in_rule__Field__LabelAssignment_110477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePathTail_in_rule__Field__PathAssignment_210508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_rule__Field__AttributesAssignment_310539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabel_in_rule__FieldGroup__LabelAssignment_110570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePathTail_in_rule__FieldGroup__WithAssignment_2_110601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGroupElement_in_rule__FieldGroup__ElementsAssignment_410632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_rule__FieldGroup__AttributesAssignment_610663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeClassExpression_in_rule__NormalAttribute__ClassExprAssignment_010694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBExpression_in_rule__NormalAttribute__ClauseAssignment_1_110725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeClass_in_rule__AttributeClassExpression__ClassesAssignment_010756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeClass_in_rule__AttributeClassExpression__ClassesAssignment_1_110787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumLiteralsCollection_in_rule__RestrictionAttribute__LiteralsAssignment_110818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBExpression_in_rule__RestrictionAttribute__ClauseAssignment_310849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRestrictionRule_in_rule__RestrictionGroupAttribute__RulesAssignment_310880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumLiteralsCollection_in_rule__RestrictionRule__LiteralsAssignment_010911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBExpression_in_rule__RestrictionRule__ClauseAssignment_210942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Reference__RefAssignment10977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBAndExpression_in_rule__BOrExpression__RightAssignment_1_211012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminalBExpression_in_rule__BAndExpression__RightAssignment_1_211043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBExpression_in_rule__NegationExpression__ExprAssignment_111074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_rule__BComparison__RefAssignment_111105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBLiteral_in_rule__BComparison__BLiteralAssignment_2_111136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_rule__SingleEnumComparison__RefAssignment_011167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SingleEnumComparison__ELiteralAssignment_211202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_rule__MultiEnumComparison__RefAssignment_011237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumMembership_in_rule__MultiEnumComparison__MembershipAssignment_111268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumLiteralsCollection_in_rule__MultiEnumComparison__ELiteralsAssignment_211299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_rule__StringValueComparison__RefAssignment_011330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__StringValueComparison__TargetValueAssignment_211361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_rule__PresenceCheck__RefAssignment_011392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DirectEnumLiteralsCollection__LiteralsAssignment_211427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumListReference__RefAssignment11466 = new BitSet(new long[]{0x0000000000000002L});

}