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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'or'", "'|'", "'and'", "'&'", "'not'", "'!'", "'display'", "'required'", "'readonly'", "'calculated'", "'doubleAsterisk'", "'true'", "'false'", "'is-one-of'", "'is-not-one-of'", "'dynamic-screen'", "'data-import'", "'='", "'view-class'", "'[nl:'", "']'", "'/'", "'('", "')'", "'external-var'", "'as'", "'define'", "'of'", "'data-store'", "'of-type'", "'group'", "'{'", "'}'", "'with'", "'if'", "'+'", "'restrict-to'", "'restrict-to-group'", "'<'", "'>'", "'is'", "'equals'", "'is-present'", "'is-multi-valued'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_STRING=4;
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


    // $ANTLR start entryRuleLabel
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:89:1: entryRuleLabel : ruleLabel EOF ;
    public final void entryRuleLabel() throws RecognitionException {
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:90:1: ( ruleLabel EOF )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:91:1: ruleLabel EOF
            {
             before(grammarAccess.getLabelRule()); 
            pushFollow(FOLLOW_ruleLabel_in_entryRuleLabel121);
            ruleLabel();
            _fsp--;

             after(grammarAccess.getLabelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLabel128); 

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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:98:1: ruleLabel : ( ( rule__Label__Group__0 ) ) ;
    public final void ruleLabel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:102:2: ( ( ( rule__Label__Group__0 ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:103:1: ( ( rule__Label__Group__0 ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:103:1: ( ( rule__Label__Group__0 ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:104:1: ( rule__Label__Group__0 )
            {
             before(grammarAccess.getLabelAccess().getGroup()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:105:1: ( rule__Label__Group__0 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:105:2: rule__Label__Group__0
            {
            pushFollow(FOLLOW_rule__Label__Group__0_in_ruleLabel154);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:117:1: entryRulePathTail : rulePathTail EOF ;
    public final void entryRulePathTail() throws RecognitionException {
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:118:1: ( rulePathTail EOF )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:119:1: rulePathTail EOF
            {
             before(grammarAccess.getPathTailRule()); 
            pushFollow(FOLLOW_rulePathTail_in_entryRulePathTail181);
            rulePathTail();
            _fsp--;

             after(grammarAccess.getPathTailRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePathTail188); 

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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:126:1: rulePathTail : ( ( rule__PathTail__Group__0 ) ) ;
    public final void rulePathTail() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:130:2: ( ( ( rule__PathTail__Group__0 ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:131:1: ( ( rule__PathTail__Group__0 ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:131:1: ( ( rule__PathTail__Group__0 ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:132:1: ( rule__PathTail__Group__0 )
            {
             before(grammarAccess.getPathTailAccess().getGroup()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:133:1: ( rule__PathTail__Group__0 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:133:2: rule__PathTail__Group__0
            {
            pushFollow(FOLLOW_rule__PathTail__Group__0_in_rulePathTail214);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:145:1: entryRuleDeclaration : ruleDeclaration EOF ;
    public final void entryRuleDeclaration() throws RecognitionException {
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:146:1: ( ruleDeclaration EOF )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:147:1: ruleDeclaration EOF
            {
             before(grammarAccess.getDeclarationRule()); 
            pushFollow(FOLLOW_ruleDeclaration_in_entryRuleDeclaration241);
            ruleDeclaration();
            _fsp--;

             after(grammarAccess.getDeclarationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeclaration248); 

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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:154:1: ruleDeclaration : ( ( rule__Declaration__Alternatives ) ) ;
    public final void ruleDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:158:2: ( ( ( rule__Declaration__Alternatives ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:159:1: ( ( rule__Declaration__Alternatives ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:159:1: ( ( rule__Declaration__Alternatives ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:160:1: ( rule__Declaration__Alternatives )
            {
             before(grammarAccess.getDeclarationAccess().getAlternatives()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:161:1: ( rule__Declaration__Alternatives )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:161:2: rule__Declaration__Alternatives
            {
            pushFollow(FOLLOW_rule__Declaration__Alternatives_in_ruleDeclaration274);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:173:1: entryRuleExternalVariable : ruleExternalVariable EOF ;
    public final void entryRuleExternalVariable() throws RecognitionException {
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:174:1: ( ruleExternalVariable EOF )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:175:1: ruleExternalVariable EOF
            {
             before(grammarAccess.getExternalVariableRule()); 
            pushFollow(FOLLOW_ruleExternalVariable_in_entryRuleExternalVariable301);
            ruleExternalVariable();
            _fsp--;

             after(grammarAccess.getExternalVariableRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExternalVariable308); 

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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:182:1: ruleExternalVariable : ( ( rule__ExternalVariable__Group__0 ) ) ;
    public final void ruleExternalVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:186:2: ( ( ( rule__ExternalVariable__Group__0 ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:187:1: ( ( rule__ExternalVariable__Group__0 ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:187:1: ( ( rule__ExternalVariable__Group__0 ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:188:1: ( rule__ExternalVariable__Group__0 )
            {
             before(grammarAccess.getExternalVariableAccess().getGroup()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:189:1: ( rule__ExternalVariable__Group__0 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:189:2: rule__ExternalVariable__Group__0
            {
            pushFollow(FOLLOW_rule__ExternalVariable__Group__0_in_ruleExternalVariable334);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:201:1: entryRuleEnumList : ruleEnumList EOF ;
    public final void entryRuleEnumList() throws RecognitionException {
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:202:1: ( ruleEnumList EOF )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:203:1: ruleEnumList EOF
            {
             before(grammarAccess.getEnumListRule()); 
            pushFollow(FOLLOW_ruleEnumList_in_entryRuleEnumList361);
            ruleEnumList();
            _fsp--;

             after(grammarAccess.getEnumListRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumList368); 

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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:210:1: ruleEnumList : ( ( rule__EnumList__Group__0 ) ) ;
    public final void ruleEnumList() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:214:2: ( ( ( rule__EnumList__Group__0 ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:215:1: ( ( rule__EnumList__Group__0 ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:215:1: ( ( rule__EnumList__Group__0 ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:216:1: ( rule__EnumList__Group__0 )
            {
             before(grammarAccess.getEnumListAccess().getGroup()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:217:1: ( rule__EnumList__Group__0 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:217:2: rule__EnumList__Group__0
            {
            pushFollow(FOLLOW_rule__EnumList__Group__0_in_ruleEnumList394);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:229:1: entryRuleDataStore : ruleDataStore EOF ;
    public final void entryRuleDataStore() throws RecognitionException {
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:230:1: ( ruleDataStore EOF )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:231:1: ruleDataStore EOF
            {
             before(grammarAccess.getDataStoreRule()); 
            pushFollow(FOLLOW_ruleDataStore_in_entryRuleDataStore421);
            ruleDataStore();
            _fsp--;

             after(grammarAccess.getDataStoreRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataStore428); 

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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:238:1: ruleDataStore : ( ( rule__DataStore__Group__0 ) ) ;
    public final void ruleDataStore() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:242:2: ( ( ( rule__DataStore__Group__0 ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:243:1: ( ( rule__DataStore__Group__0 ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:243:1: ( ( rule__DataStore__Group__0 ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:244:1: ( rule__DataStore__Group__0 )
            {
             before(grammarAccess.getDataStoreAccess().getGroup()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:245:1: ( rule__DataStore__Group__0 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:245:2: rule__DataStore__Group__0
            {
            pushFollow(FOLLOW_rule__DataStore__Group__0_in_ruleDataStore454);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:257:1: entryRuleGroupElement : ruleGroupElement EOF ;
    public final void entryRuleGroupElement() throws RecognitionException {
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:258:1: ( ruleGroupElement EOF )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:259:1: ruleGroupElement EOF
            {
             before(grammarAccess.getGroupElementRule()); 
            pushFollow(FOLLOW_ruleGroupElement_in_entryRuleGroupElement481);
            ruleGroupElement();
            _fsp--;

             after(grammarAccess.getGroupElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGroupElement488); 

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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:266:1: ruleGroupElement : ( ( rule__GroupElement__Alternatives ) ) ;
    public final void ruleGroupElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:270:2: ( ( ( rule__GroupElement__Alternatives ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:271:1: ( ( rule__GroupElement__Alternatives ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:271:1: ( ( rule__GroupElement__Alternatives ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:272:1: ( rule__GroupElement__Alternatives )
            {
             before(grammarAccess.getGroupElementAccess().getAlternatives()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:273:1: ( rule__GroupElement__Alternatives )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:273:2: rule__GroupElement__Alternatives
            {
            pushFollow(FOLLOW_rule__GroupElement__Alternatives_in_ruleGroupElement514);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:285:1: entryRuleField : ruleField EOF ;
    public final void entryRuleField() throws RecognitionException {
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:286:1: ( ruleField EOF )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:287:1: ruleField EOF
            {
             before(grammarAccess.getFieldRule()); 
            pushFollow(FOLLOW_ruleField_in_entryRuleField541);
            ruleField();
            _fsp--;

             after(grammarAccess.getFieldRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleField548); 

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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:294:1: ruleField : ( ( rule__Field__Group__0 ) ) ;
    public final void ruleField() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:298:2: ( ( ( rule__Field__Group__0 ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:299:1: ( ( rule__Field__Group__0 ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:299:1: ( ( rule__Field__Group__0 ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:300:1: ( rule__Field__Group__0 )
            {
             before(grammarAccess.getFieldAccess().getGroup()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:301:1: ( rule__Field__Group__0 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:301:2: rule__Field__Group__0
            {
            pushFollow(FOLLOW_rule__Field__Group__0_in_ruleField574);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:313:1: entryRuleFieldGroup : ruleFieldGroup EOF ;
    public final void entryRuleFieldGroup() throws RecognitionException {
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:314:1: ( ruleFieldGroup EOF )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:315:1: ruleFieldGroup EOF
            {
             before(grammarAccess.getFieldGroupRule()); 
            pushFollow(FOLLOW_ruleFieldGroup_in_entryRuleFieldGroup601);
            ruleFieldGroup();
            _fsp--;

             after(grammarAccess.getFieldGroupRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFieldGroup608); 

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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:322:1: ruleFieldGroup : ( ( rule__FieldGroup__Group__0 ) ) ;
    public final void ruleFieldGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:326:2: ( ( ( rule__FieldGroup__Group__0 ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:327:1: ( ( rule__FieldGroup__Group__0 ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:327:1: ( ( rule__FieldGroup__Group__0 ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:328:1: ( rule__FieldGroup__Group__0 )
            {
             before(grammarAccess.getFieldGroupAccess().getGroup()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:329:1: ( rule__FieldGroup__Group__0 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:329:2: rule__FieldGroup__Group__0
            {
            pushFollow(FOLLOW_rule__FieldGroup__Group__0_in_ruleFieldGroup634);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:341:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:342:1: ( ruleAttribute EOF )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:343:1: ruleAttribute EOF
            {
             before(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute661);
            ruleAttribute();
            _fsp--;

             after(grammarAccess.getAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute668); 

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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:350:1: ruleAttribute : ( ( rule__Attribute__Alternatives ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:354:2: ( ( ( rule__Attribute__Alternatives ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:355:1: ( ( rule__Attribute__Alternatives ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:355:1: ( ( rule__Attribute__Alternatives ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:356:1: ( rule__Attribute__Alternatives )
            {
             before(grammarAccess.getAttributeAccess().getAlternatives()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:357:1: ( rule__Attribute__Alternatives )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:357:2: rule__Attribute__Alternatives
            {
            pushFollow(FOLLOW_rule__Attribute__Alternatives_in_ruleAttribute694);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:369:1: entryRuleEnumFieldAttribute : ruleEnumFieldAttribute EOF ;
    public final void entryRuleEnumFieldAttribute() throws RecognitionException {
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:370:1: ( ruleEnumFieldAttribute EOF )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:371:1: ruleEnumFieldAttribute EOF
            {
             before(grammarAccess.getEnumFieldAttributeRule()); 
            pushFollow(FOLLOW_ruleEnumFieldAttribute_in_entryRuleEnumFieldAttribute721);
            ruleEnumFieldAttribute();
            _fsp--;

             after(grammarAccess.getEnumFieldAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumFieldAttribute728); 

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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:378:1: ruleEnumFieldAttribute : ( ( rule__EnumFieldAttribute__Alternatives ) ) ;
    public final void ruleEnumFieldAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:382:2: ( ( ( rule__EnumFieldAttribute__Alternatives ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:383:1: ( ( rule__EnumFieldAttribute__Alternatives ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:383:1: ( ( rule__EnumFieldAttribute__Alternatives ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:384:1: ( rule__EnumFieldAttribute__Alternatives )
            {
             before(grammarAccess.getEnumFieldAttributeAccess().getAlternatives()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:385:1: ( rule__EnumFieldAttribute__Alternatives )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:385:2: rule__EnumFieldAttribute__Alternatives
            {
            pushFollow(FOLLOW_rule__EnumFieldAttribute__Alternatives_in_ruleEnumFieldAttribute754);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:397:1: entryRuleNormalAttribute : ruleNormalAttribute EOF ;
    public final void entryRuleNormalAttribute() throws RecognitionException {
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:398:1: ( ruleNormalAttribute EOF )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:399:1: ruleNormalAttribute EOF
            {
             before(grammarAccess.getNormalAttributeRule()); 
            pushFollow(FOLLOW_ruleNormalAttribute_in_entryRuleNormalAttribute781);
            ruleNormalAttribute();
            _fsp--;

             after(grammarAccess.getNormalAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNormalAttribute788); 

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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:406:1: ruleNormalAttribute : ( ( rule__NormalAttribute__Group__0 ) ) ;
    public final void ruleNormalAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:410:2: ( ( ( rule__NormalAttribute__Group__0 ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:411:1: ( ( rule__NormalAttribute__Group__0 ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:411:1: ( ( rule__NormalAttribute__Group__0 ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:412:1: ( rule__NormalAttribute__Group__0 )
            {
             before(grammarAccess.getNormalAttributeAccess().getGroup()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:413:1: ( rule__NormalAttribute__Group__0 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:413:2: rule__NormalAttribute__Group__0
            {
            pushFollow(FOLLOW_rule__NormalAttribute__Group__0_in_ruleNormalAttribute814);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:425:1: entryRuleAttributeClassExpression : ruleAttributeClassExpression EOF ;
    public final void entryRuleAttributeClassExpression() throws RecognitionException {
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:426:1: ( ruleAttributeClassExpression EOF )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:427:1: ruleAttributeClassExpression EOF
            {
             before(grammarAccess.getAttributeClassExpressionRule()); 
            pushFollow(FOLLOW_ruleAttributeClassExpression_in_entryRuleAttributeClassExpression841);
            ruleAttributeClassExpression();
            _fsp--;

             after(grammarAccess.getAttributeClassExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributeClassExpression848); 

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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:434:1: ruleAttributeClassExpression : ( ( rule__AttributeClassExpression__Group__0 ) ) ;
    public final void ruleAttributeClassExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:438:2: ( ( ( rule__AttributeClassExpression__Group__0 ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:439:1: ( ( rule__AttributeClassExpression__Group__0 ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:439:1: ( ( rule__AttributeClassExpression__Group__0 ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:440:1: ( rule__AttributeClassExpression__Group__0 )
            {
             before(grammarAccess.getAttributeClassExpressionAccess().getGroup()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:441:1: ( rule__AttributeClassExpression__Group__0 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:441:2: rule__AttributeClassExpression__Group__0
            {
            pushFollow(FOLLOW_rule__AttributeClassExpression__Group__0_in_ruleAttributeClassExpression874);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:453:1: entryRuleRestrictionAttribute : ruleRestrictionAttribute EOF ;
    public final void entryRuleRestrictionAttribute() throws RecognitionException {
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:454:1: ( ruleRestrictionAttribute EOF )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:455:1: ruleRestrictionAttribute EOF
            {
             before(grammarAccess.getRestrictionAttributeRule()); 
            pushFollow(FOLLOW_ruleRestrictionAttribute_in_entryRuleRestrictionAttribute901);
            ruleRestrictionAttribute();
            _fsp--;

             after(grammarAccess.getRestrictionAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRestrictionAttribute908); 

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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:462:1: ruleRestrictionAttribute : ( ( rule__RestrictionAttribute__Group__0 ) ) ;
    public final void ruleRestrictionAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:466:2: ( ( ( rule__RestrictionAttribute__Group__0 ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:467:1: ( ( rule__RestrictionAttribute__Group__0 ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:467:1: ( ( rule__RestrictionAttribute__Group__0 ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:468:1: ( rule__RestrictionAttribute__Group__0 )
            {
             before(grammarAccess.getRestrictionAttributeAccess().getGroup()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:469:1: ( rule__RestrictionAttribute__Group__0 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:469:2: rule__RestrictionAttribute__Group__0
            {
            pushFollow(FOLLOW_rule__RestrictionAttribute__Group__0_in_ruleRestrictionAttribute934);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:481:1: entryRuleRestrictionGroupAttribute : ruleRestrictionGroupAttribute EOF ;
    public final void entryRuleRestrictionGroupAttribute() throws RecognitionException {
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:482:1: ( ruleRestrictionGroupAttribute EOF )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:483:1: ruleRestrictionGroupAttribute EOF
            {
             before(grammarAccess.getRestrictionGroupAttributeRule()); 
            pushFollow(FOLLOW_ruleRestrictionGroupAttribute_in_entryRuleRestrictionGroupAttribute961);
            ruleRestrictionGroupAttribute();
            _fsp--;

             after(grammarAccess.getRestrictionGroupAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRestrictionGroupAttribute968); 

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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:490:1: ruleRestrictionGroupAttribute : ( ( rule__RestrictionGroupAttribute__Group__0 ) ) ;
    public final void ruleRestrictionGroupAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:494:2: ( ( ( rule__RestrictionGroupAttribute__Group__0 ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:495:1: ( ( rule__RestrictionGroupAttribute__Group__0 ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:495:1: ( ( rule__RestrictionGroupAttribute__Group__0 ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:496:1: ( rule__RestrictionGroupAttribute__Group__0 )
            {
             before(grammarAccess.getRestrictionGroupAttributeAccess().getGroup()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:497:1: ( rule__RestrictionGroupAttribute__Group__0 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:497:2: rule__RestrictionGroupAttribute__Group__0
            {
            pushFollow(FOLLOW_rule__RestrictionGroupAttribute__Group__0_in_ruleRestrictionGroupAttribute994);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:509:1: entryRuleRestrictionRule : ruleRestrictionRule EOF ;
    public final void entryRuleRestrictionRule() throws RecognitionException {
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:510:1: ( ruleRestrictionRule EOF )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:511:1: ruleRestrictionRule EOF
            {
             before(grammarAccess.getRestrictionRuleRule()); 
            pushFollow(FOLLOW_ruleRestrictionRule_in_entryRuleRestrictionRule1021);
            ruleRestrictionRule();
            _fsp--;

             after(grammarAccess.getRestrictionRuleRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRestrictionRule1028); 

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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:518:1: ruleRestrictionRule : ( ( rule__RestrictionRule__Group__0 ) ) ;
    public final void ruleRestrictionRule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:522:2: ( ( ( rule__RestrictionRule__Group__0 ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:523:1: ( ( rule__RestrictionRule__Group__0 ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:523:1: ( ( rule__RestrictionRule__Group__0 ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:524:1: ( rule__RestrictionRule__Group__0 )
            {
             before(grammarAccess.getRestrictionRuleAccess().getGroup()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:525:1: ( rule__RestrictionRule__Group__0 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:525:2: rule__RestrictionRule__Group__0
            {
            pushFollow(FOLLOW_rule__RestrictionRule__Group__0_in_ruleRestrictionRule1054);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:537:1: entryRuleReferenceTarget : ruleReferenceTarget EOF ;
    public final void entryRuleReferenceTarget() throws RecognitionException {
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:538:1: ( ruleReferenceTarget EOF )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:539:1: ruleReferenceTarget EOF
            {
             before(grammarAccess.getReferenceTargetRule()); 
            pushFollow(FOLLOW_ruleReferenceTarget_in_entryRuleReferenceTarget1081);
            ruleReferenceTarget();
            _fsp--;

             after(grammarAccess.getReferenceTargetRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReferenceTarget1088); 

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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:546:1: ruleReferenceTarget : ( ( rule__ReferenceTarget__Alternatives ) ) ;
    public final void ruleReferenceTarget() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:550:2: ( ( ( rule__ReferenceTarget__Alternatives ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:551:1: ( ( rule__ReferenceTarget__Alternatives ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:551:1: ( ( rule__ReferenceTarget__Alternatives ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:552:1: ( rule__ReferenceTarget__Alternatives )
            {
             before(grammarAccess.getReferenceTargetAccess().getAlternatives()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:553:1: ( rule__ReferenceTarget__Alternatives )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:553:2: rule__ReferenceTarget__Alternatives
            {
            pushFollow(FOLLOW_rule__ReferenceTarget__Alternatives_in_ruleReferenceTarget1114);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:565:1: entryRuleReference : ruleReference EOF ;
    public final void entryRuleReference() throws RecognitionException {
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:566:1: ( ruleReference EOF )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:567:1: ruleReference EOF
            {
             before(grammarAccess.getReferenceRule()); 
            pushFollow(FOLLOW_ruleReference_in_entryRuleReference1141);
            ruleReference();
            _fsp--;

             after(grammarAccess.getReferenceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReference1148); 

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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:574:1: ruleReference : ( ( rule__Reference__RefAssignment ) ) ;
    public final void ruleReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:578:2: ( ( ( rule__Reference__RefAssignment ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:579:1: ( ( rule__Reference__RefAssignment ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:579:1: ( ( rule__Reference__RefAssignment ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:580:1: ( rule__Reference__RefAssignment )
            {
             before(grammarAccess.getReferenceAccess().getRefAssignment()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:581:1: ( rule__Reference__RefAssignment )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:581:2: rule__Reference__RefAssignment
            {
            pushFollow(FOLLOW_rule__Reference__RefAssignment_in_ruleReference1174);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:595:1: entryRuleBExpression : ruleBExpression EOF ;
    public final void entryRuleBExpression() throws RecognitionException {
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:596:1: ( ruleBExpression EOF )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:597:1: ruleBExpression EOF
            {
             before(grammarAccess.getBExpressionRule()); 
            pushFollow(FOLLOW_ruleBExpression_in_entryRuleBExpression1203);
            ruleBExpression();
            _fsp--;

             after(grammarAccess.getBExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBExpression1210); 

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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:604:1: ruleBExpression : ( ruleBOrExpression ) ;
    public final void ruleBExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:608:2: ( ( ruleBOrExpression ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:609:1: ( ruleBOrExpression )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:609:1: ( ruleBOrExpression )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:610:1: ruleBOrExpression
            {
             before(grammarAccess.getBExpressionAccess().getBOrExpressionParserRuleCall()); 
            pushFollow(FOLLOW_ruleBOrExpression_in_ruleBExpression1236);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:623:1: entryRuleBOrExpression : ruleBOrExpression EOF ;
    public final void entryRuleBOrExpression() throws RecognitionException {
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:624:1: ( ruleBOrExpression EOF )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:625:1: ruleBOrExpression EOF
            {
             before(grammarAccess.getBOrExpressionRule()); 
            pushFollow(FOLLOW_ruleBOrExpression_in_entryRuleBOrExpression1262);
            ruleBOrExpression();
            _fsp--;

             after(grammarAccess.getBOrExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBOrExpression1269); 

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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:632:1: ruleBOrExpression : ( ( rule__BOrExpression__Group__0 ) ) ;
    public final void ruleBOrExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:636:2: ( ( ( rule__BOrExpression__Group__0 ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:637:1: ( ( rule__BOrExpression__Group__0 ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:637:1: ( ( rule__BOrExpression__Group__0 ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:638:1: ( rule__BOrExpression__Group__0 )
            {
             before(grammarAccess.getBOrExpressionAccess().getGroup()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:639:1: ( rule__BOrExpression__Group__0 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:639:2: rule__BOrExpression__Group__0
            {
            pushFollow(FOLLOW_rule__BOrExpression__Group__0_in_ruleBOrExpression1295);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:651:1: entryRuleBAndExpression : ruleBAndExpression EOF ;
    public final void entryRuleBAndExpression() throws RecognitionException {
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:652:1: ( ruleBAndExpression EOF )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:653:1: ruleBAndExpression EOF
            {
             before(grammarAccess.getBAndExpressionRule()); 
            pushFollow(FOLLOW_ruleBAndExpression_in_entryRuleBAndExpression1322);
            ruleBAndExpression();
            _fsp--;

             after(grammarAccess.getBAndExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBAndExpression1329); 

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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:660:1: ruleBAndExpression : ( ( rule__BAndExpression__Group__0 ) ) ;
    public final void ruleBAndExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:664:2: ( ( ( rule__BAndExpression__Group__0 ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:665:1: ( ( rule__BAndExpression__Group__0 ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:665:1: ( ( rule__BAndExpression__Group__0 ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:666:1: ( rule__BAndExpression__Group__0 )
            {
             before(grammarAccess.getBAndExpressionAccess().getGroup()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:667:1: ( rule__BAndExpression__Group__0 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:667:2: rule__BAndExpression__Group__0
            {
            pushFollow(FOLLOW_rule__BAndExpression__Group__0_in_ruleBAndExpression1355);
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


    // $ANTLR start entryRuleNegationExpression
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:679:1: entryRuleNegationExpression : ruleNegationExpression EOF ;
    public final void entryRuleNegationExpression() throws RecognitionException {
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:680:1: ( ruleNegationExpression EOF )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:681:1: ruleNegationExpression EOF
            {
             before(grammarAccess.getNegationExpressionRule()); 
            pushFollow(FOLLOW_ruleNegationExpression_in_entryRuleNegationExpression1382);
            ruleNegationExpression();
            _fsp--;

             after(grammarAccess.getNegationExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNegationExpression1389); 

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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:688:1: ruleNegationExpression : ( ( rule__NegationExpression__Alternatives ) ) ;
    public final void ruleNegationExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:692:2: ( ( ( rule__NegationExpression__Alternatives ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:693:1: ( ( rule__NegationExpression__Alternatives ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:693:1: ( ( rule__NegationExpression__Alternatives ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:694:1: ( rule__NegationExpression__Alternatives )
            {
             before(grammarAccess.getNegationExpressionAccess().getAlternatives()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:695:1: ( rule__NegationExpression__Alternatives )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:695:2: rule__NegationExpression__Alternatives
            {
            pushFollow(FOLLOW_rule__NegationExpression__Alternatives_in_ruleNegationExpression1415);
            rule__NegationExpression__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getNegationExpressionAccess().getAlternatives()); 

            }


            }

        }
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


    // $ANTLR start entryRuleAtomicReferringBExpression
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:735:1: entryRuleAtomicReferringBExpression : ruleAtomicReferringBExpression EOF ;
    public final void entryRuleAtomicReferringBExpression() throws RecognitionException {
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:736:1: ( ruleAtomicReferringBExpression EOF )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:737:1: ruleAtomicReferringBExpression EOF
            {
             before(grammarAccess.getAtomicReferringBExpressionRule()); 
            pushFollow(FOLLOW_ruleAtomicReferringBExpression_in_entryRuleAtomicReferringBExpression1502);
            ruleAtomicReferringBExpression();
            _fsp--;

             after(grammarAccess.getAtomicReferringBExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtomicReferringBExpression1509); 

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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:744:1: ruleAtomicReferringBExpression : ( ( rule__AtomicReferringBExpression__Alternatives ) ) ;
    public final void ruleAtomicReferringBExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:748:2: ( ( ( rule__AtomicReferringBExpression__Alternatives ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:749:1: ( ( rule__AtomicReferringBExpression__Alternatives ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:749:1: ( ( rule__AtomicReferringBExpression__Alternatives ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:750:1: ( rule__AtomicReferringBExpression__Alternatives )
            {
             before(grammarAccess.getAtomicReferringBExpressionAccess().getAlternatives()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:751:1: ( rule__AtomicReferringBExpression__Alternatives )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:751:2: rule__AtomicReferringBExpression__Alternatives
            {
            pushFollow(FOLLOW_rule__AtomicReferringBExpression__Alternatives_in_ruleAtomicReferringBExpression1535);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:763:1: entryRuleBComparison : ruleBComparison EOF ;
    public final void entryRuleBComparison() throws RecognitionException {
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:764:1: ( ruleBComparison EOF )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:765:1: ruleBComparison EOF
            {
             before(grammarAccess.getBComparisonRule()); 
            pushFollow(FOLLOW_ruleBComparison_in_entryRuleBComparison1562);
            ruleBComparison();
            _fsp--;

             after(grammarAccess.getBComparisonRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBComparison1569); 

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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:772:1: ruleBComparison : ( ( rule__BComparison__Group__0 ) ) ;
    public final void ruleBComparison() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:776:2: ( ( ( rule__BComparison__Group__0 ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:777:1: ( ( rule__BComparison__Group__0 ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:777:1: ( ( rule__BComparison__Group__0 ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:778:1: ( rule__BComparison__Group__0 )
            {
             before(grammarAccess.getBComparisonAccess().getGroup()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:779:1: ( rule__BComparison__Group__0 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:779:2: rule__BComparison__Group__0
            {
            pushFollow(FOLLOW_rule__BComparison__Group__0_in_ruleBComparison1595);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:791:1: entryRuleEnumComparison : ruleEnumComparison EOF ;
    public final void entryRuleEnumComparison() throws RecognitionException {
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:792:1: ( ruleEnumComparison EOF )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:793:1: ruleEnumComparison EOF
            {
             before(grammarAccess.getEnumComparisonRule()); 
            pushFollow(FOLLOW_ruleEnumComparison_in_entryRuleEnumComparison1622);
            ruleEnumComparison();
            _fsp--;

             after(grammarAccess.getEnumComparisonRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumComparison1629); 

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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:800:1: ruleEnumComparison : ( ( rule__EnumComparison__Alternatives ) ) ;
    public final void ruleEnumComparison() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:804:2: ( ( ( rule__EnumComparison__Alternatives ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:805:1: ( ( rule__EnumComparison__Alternatives ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:805:1: ( ( rule__EnumComparison__Alternatives ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:806:1: ( rule__EnumComparison__Alternatives )
            {
             before(grammarAccess.getEnumComparisonAccess().getAlternatives()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:807:1: ( rule__EnumComparison__Alternatives )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:807:2: rule__EnumComparison__Alternatives
            {
            pushFollow(FOLLOW_rule__EnumComparison__Alternatives_in_ruleEnumComparison1655);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:819:1: entryRuleSingleEnumComparison : ruleSingleEnumComparison EOF ;
    public final void entryRuleSingleEnumComparison() throws RecognitionException {
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:820:1: ( ruleSingleEnumComparison EOF )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:821:1: ruleSingleEnumComparison EOF
            {
             before(grammarAccess.getSingleEnumComparisonRule()); 
            pushFollow(FOLLOW_ruleSingleEnumComparison_in_entryRuleSingleEnumComparison1682);
            ruleSingleEnumComparison();
            _fsp--;

             after(grammarAccess.getSingleEnumComparisonRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSingleEnumComparison1689); 

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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:828:1: ruleSingleEnumComparison : ( ( rule__SingleEnumComparison__Group__0 ) ) ;
    public final void ruleSingleEnumComparison() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:832:2: ( ( ( rule__SingleEnumComparison__Group__0 ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:833:1: ( ( rule__SingleEnumComparison__Group__0 ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:833:1: ( ( rule__SingleEnumComparison__Group__0 ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:834:1: ( rule__SingleEnumComparison__Group__0 )
            {
             before(grammarAccess.getSingleEnumComparisonAccess().getGroup()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:835:1: ( rule__SingleEnumComparison__Group__0 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:835:2: rule__SingleEnumComparison__Group__0
            {
            pushFollow(FOLLOW_rule__SingleEnumComparison__Group__0_in_ruleSingleEnumComparison1715);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:847:1: entryRuleMultiEnumComparison : ruleMultiEnumComparison EOF ;
    public final void entryRuleMultiEnumComparison() throws RecognitionException {
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:848:1: ( ruleMultiEnumComparison EOF )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:849:1: ruleMultiEnumComparison EOF
            {
             before(grammarAccess.getMultiEnumComparisonRule()); 
            pushFollow(FOLLOW_ruleMultiEnumComparison_in_entryRuleMultiEnumComparison1742);
            ruleMultiEnumComparison();
            _fsp--;

             after(grammarAccess.getMultiEnumComparisonRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiEnumComparison1749); 

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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:856:1: ruleMultiEnumComparison : ( ( rule__MultiEnumComparison__Group__0 ) ) ;
    public final void ruleMultiEnumComparison() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:860:2: ( ( ( rule__MultiEnumComparison__Group__0 ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:861:1: ( ( rule__MultiEnumComparison__Group__0 ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:861:1: ( ( rule__MultiEnumComparison__Group__0 ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:862:1: ( rule__MultiEnumComparison__Group__0 )
            {
             before(grammarAccess.getMultiEnumComparisonAccess().getGroup()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:863:1: ( rule__MultiEnumComparison__Group__0 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:863:2: rule__MultiEnumComparison__Group__0
            {
            pushFollow(FOLLOW_rule__MultiEnumComparison__Group__0_in_ruleMultiEnumComparison1775);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:875:1: entryRuleStringValueComparison : ruleStringValueComparison EOF ;
    public final void entryRuleStringValueComparison() throws RecognitionException {
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:876:1: ( ruleStringValueComparison EOF )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:877:1: ruleStringValueComparison EOF
            {
             before(grammarAccess.getStringValueComparisonRule()); 
            pushFollow(FOLLOW_ruleStringValueComparison_in_entryRuleStringValueComparison1802);
            ruleStringValueComparison();
            _fsp--;

             after(grammarAccess.getStringValueComparisonRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringValueComparison1809); 

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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:884:1: ruleStringValueComparison : ( ( rule__StringValueComparison__Group__0 ) ) ;
    public final void ruleStringValueComparison() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:888:2: ( ( ( rule__StringValueComparison__Group__0 ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:889:1: ( ( rule__StringValueComparison__Group__0 ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:889:1: ( ( rule__StringValueComparison__Group__0 ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:890:1: ( rule__StringValueComparison__Group__0 )
            {
             before(grammarAccess.getStringValueComparisonAccess().getGroup()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:891:1: ( rule__StringValueComparison__Group__0 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:891:2: rule__StringValueComparison__Group__0
            {
            pushFollow(FOLLOW_rule__StringValueComparison__Group__0_in_ruleStringValueComparison1835);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:903:1: entryRulePresenceCheck : rulePresenceCheck EOF ;
    public final void entryRulePresenceCheck() throws RecognitionException {
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:904:1: ( rulePresenceCheck EOF )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:905:1: rulePresenceCheck EOF
            {
             before(grammarAccess.getPresenceCheckRule()); 
            pushFollow(FOLLOW_rulePresenceCheck_in_entryRulePresenceCheck1862);
            rulePresenceCheck();
            _fsp--;

             after(grammarAccess.getPresenceCheckRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePresenceCheck1869); 

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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:912:1: rulePresenceCheck : ( ( rule__PresenceCheck__Group__0 ) ) ;
    public final void rulePresenceCheck() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:916:2: ( ( ( rule__PresenceCheck__Group__0 ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:917:1: ( ( rule__PresenceCheck__Group__0 ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:917:1: ( ( rule__PresenceCheck__Group__0 ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:918:1: ( rule__PresenceCheck__Group__0 )
            {
             before(grammarAccess.getPresenceCheckAccess().getGroup()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:919:1: ( rule__PresenceCheck__Group__0 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:919:2: rule__PresenceCheck__Group__0
            {
            pushFollow(FOLLOW_rule__PresenceCheck__Group__0_in_rulePresenceCheck1895);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:931:1: entryRuleEnumLiteralsCollection : ruleEnumLiteralsCollection EOF ;
    public final void entryRuleEnumLiteralsCollection() throws RecognitionException {
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:932:1: ( ruleEnumLiteralsCollection EOF )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:933:1: ruleEnumLiteralsCollection EOF
            {
             before(grammarAccess.getEnumLiteralsCollectionRule()); 
            pushFollow(FOLLOW_ruleEnumLiteralsCollection_in_entryRuleEnumLiteralsCollection1922);
            ruleEnumLiteralsCollection();
            _fsp--;

             after(grammarAccess.getEnumLiteralsCollectionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumLiteralsCollection1929); 

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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:940:1: ruleEnumLiteralsCollection : ( ( rule__EnumLiteralsCollection__Alternatives ) ) ;
    public final void ruleEnumLiteralsCollection() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:944:2: ( ( ( rule__EnumLiteralsCollection__Alternatives ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:945:1: ( ( rule__EnumLiteralsCollection__Alternatives ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:945:1: ( ( rule__EnumLiteralsCollection__Alternatives ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:946:1: ( rule__EnumLiteralsCollection__Alternatives )
            {
             before(grammarAccess.getEnumLiteralsCollectionAccess().getAlternatives()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:947:1: ( rule__EnumLiteralsCollection__Alternatives )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:947:2: rule__EnumLiteralsCollection__Alternatives
            {
            pushFollow(FOLLOW_rule__EnumLiteralsCollection__Alternatives_in_ruleEnumLiteralsCollection1955);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:959:1: entryRuleDirectEnumLiteralsCollection : ruleDirectEnumLiteralsCollection EOF ;
    public final void entryRuleDirectEnumLiteralsCollection() throws RecognitionException {
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:960:1: ( ruleDirectEnumLiteralsCollection EOF )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:961:1: ruleDirectEnumLiteralsCollection EOF
            {
             before(grammarAccess.getDirectEnumLiteralsCollectionRule()); 
            pushFollow(FOLLOW_ruleDirectEnumLiteralsCollection_in_entryRuleDirectEnumLiteralsCollection1982);
            ruleDirectEnumLiteralsCollection();
            _fsp--;

             after(grammarAccess.getDirectEnumLiteralsCollectionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDirectEnumLiteralsCollection1989); 

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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:968:1: ruleDirectEnumLiteralsCollection : ( ( rule__DirectEnumLiteralsCollection__Group__0 ) ) ;
    public final void ruleDirectEnumLiteralsCollection() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:972:2: ( ( ( rule__DirectEnumLiteralsCollection__Group__0 ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:973:1: ( ( rule__DirectEnumLiteralsCollection__Group__0 ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:973:1: ( ( rule__DirectEnumLiteralsCollection__Group__0 ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:974:1: ( rule__DirectEnumLiteralsCollection__Group__0 )
            {
             before(grammarAccess.getDirectEnumLiteralsCollectionAccess().getGroup()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:975:1: ( rule__DirectEnumLiteralsCollection__Group__0 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:975:2: rule__DirectEnumLiteralsCollection__Group__0
            {
            pushFollow(FOLLOW_rule__DirectEnumLiteralsCollection__Group__0_in_ruleDirectEnumLiteralsCollection2015);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:987:1: entryRuleEnumListReference : ruleEnumListReference EOF ;
    public final void entryRuleEnumListReference() throws RecognitionException {
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:988:1: ( ruleEnumListReference EOF )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:989:1: ruleEnumListReference EOF
            {
             before(grammarAccess.getEnumListReferenceRule()); 
            pushFollow(FOLLOW_ruleEnumListReference_in_entryRuleEnumListReference2042);
            ruleEnumListReference();
            _fsp--;

             after(grammarAccess.getEnumListReferenceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumListReference2049); 

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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:996:1: ruleEnumListReference : ( ( rule__EnumListReference__RefAssignment ) ) ;
    public final void ruleEnumListReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1000:2: ( ( ( rule__EnumListReference__RefAssignment ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1001:1: ( ( rule__EnumListReference__RefAssignment ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1001:1: ( ( rule__EnumListReference__RefAssignment ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1002:1: ( rule__EnumListReference__RefAssignment )
            {
             before(grammarAccess.getEnumListReferenceAccess().getRefAssignment()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1003:1: ( rule__EnumListReference__RefAssignment )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1003:2: rule__EnumListReference__RefAssignment
            {
            pushFollow(FOLLOW_rule__EnumListReference__RefAssignment_in_ruleEnumListReference2075);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1016:1: ruleAttributeClass : ( ( rule__AttributeClass__Alternatives ) ) ;
    public final void ruleAttributeClass() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1020:1: ( ( ( rule__AttributeClass__Alternatives ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1021:1: ( ( rule__AttributeClass__Alternatives ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1021:1: ( ( rule__AttributeClass__Alternatives ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1022:1: ( rule__AttributeClass__Alternatives )
            {
             before(grammarAccess.getAttributeClassAccess().getAlternatives()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1023:1: ( rule__AttributeClass__Alternatives )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1023:2: rule__AttributeClass__Alternatives
            {
            pushFollow(FOLLOW_rule__AttributeClass__Alternatives_in_ruleAttributeClass2112);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1035:1: ruleBLiteral : ( ( rule__BLiteral__Alternatives ) ) ;
    public final void ruleBLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1039:1: ( ( ( rule__BLiteral__Alternatives ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1040:1: ( ( rule__BLiteral__Alternatives ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1040:1: ( ( rule__BLiteral__Alternatives ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1041:1: ( rule__BLiteral__Alternatives )
            {
             before(grammarAccess.getBLiteralAccess().getAlternatives()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1042:1: ( rule__BLiteral__Alternatives )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1042:2: rule__BLiteral__Alternatives
            {
            pushFollow(FOLLOW_rule__BLiteral__Alternatives_in_ruleBLiteral2148);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1054:1: ruleEnumMembership : ( ( rule__EnumMembership__Alternatives ) ) ;
    public final void ruleEnumMembership() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1058:1: ( ( ( rule__EnumMembership__Alternatives ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1059:1: ( ( rule__EnumMembership__Alternatives ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1059:1: ( ( rule__EnumMembership__Alternatives ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1060:1: ( rule__EnumMembership__Alternatives )
            {
             before(grammarAccess.getEnumMembershipAccess().getAlternatives()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1061:1: ( rule__EnumMembership__Alternatives )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1061:2: rule__EnumMembership__Alternatives
            {
            pushFollow(FOLLOW_rule__EnumMembership__Alternatives_in_ruleEnumMembership2184);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1072:1: rule__Declaration__Alternatives : ( ( ruleExternalVariable ) | ( ruleEnumList ) | ( ruleDataStore ) );
    public final void rule__Declaration__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1076:1: ( ( ruleExternalVariable ) | ( ruleEnumList ) | ( ruleDataStore ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt1=1;
                }
                break;
            case 37:
                {
                alt1=2;
                }
                break;
            case 39:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1072:1: rule__Declaration__Alternatives : ( ( ruleExternalVariable ) | ( ruleEnumList ) | ( ruleDataStore ) );", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1077:1: ( ruleExternalVariable )
                    {
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1077:1: ( ruleExternalVariable )
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1078:1: ruleExternalVariable
                    {
                     before(grammarAccess.getDeclarationAccess().getExternalVariableParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleExternalVariable_in_rule__Declaration__Alternatives2219);
                    ruleExternalVariable();
                    _fsp--;

                     after(grammarAccess.getDeclarationAccess().getExternalVariableParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1083:6: ( ruleEnumList )
                    {
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1083:6: ( ruleEnumList )
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1084:1: ruleEnumList
                    {
                     before(grammarAccess.getDeclarationAccess().getEnumListParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleEnumList_in_rule__Declaration__Alternatives2236);
                    ruleEnumList();
                    _fsp--;

                     after(grammarAccess.getDeclarationAccess().getEnumListParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1089:6: ( ruleDataStore )
                    {
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1089:6: ( ruleDataStore )
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1090:1: ruleDataStore
                    {
                     before(grammarAccess.getDeclarationAccess().getDataStoreParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleDataStore_in_rule__Declaration__Alternatives2253);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1100:1: rule__GroupElement__Alternatives : ( ( ruleField ) | ( ruleFieldGroup ) );
    public final void rule__GroupElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1104:1: ( ( ruleField ) | ( ruleFieldGroup ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                alt2=1;
            }
            else if ( (LA2_0==41) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1100:1: rule__GroupElement__Alternatives : ( ( ruleField ) | ( ruleFieldGroup ) );", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1105:1: ( ruleField )
                    {
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1105:1: ( ruleField )
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1106:1: ruleField
                    {
                     before(grammarAccess.getGroupElementAccess().getFieldParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleField_in_rule__GroupElement__Alternatives2285);
                    ruleField();
                    _fsp--;

                     after(grammarAccess.getGroupElementAccess().getFieldParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1111:6: ( ruleFieldGroup )
                    {
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1111:6: ( ruleFieldGroup )
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1112:1: ruleFieldGroup
                    {
                     before(grammarAccess.getGroupElementAccess().getFieldGroupParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleFieldGroup_in_rule__GroupElement__Alternatives2302);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1122:1: rule__Attribute__Alternatives : ( ( ruleNormalAttribute ) | ( ruleEnumFieldAttribute ) );
    public final void rule__Attribute__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1126:1: ( ( ruleNormalAttribute ) | ( ruleEnumFieldAttribute ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=17 && LA3_0<=21)) ) {
                alt3=1;
            }
            else if ( ((LA3_0>=47 && LA3_0<=48)) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1122:1: rule__Attribute__Alternatives : ( ( ruleNormalAttribute ) | ( ruleEnumFieldAttribute ) );", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1127:1: ( ruleNormalAttribute )
                    {
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1127:1: ( ruleNormalAttribute )
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1128:1: ruleNormalAttribute
                    {
                     before(grammarAccess.getAttributeAccess().getNormalAttributeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleNormalAttribute_in_rule__Attribute__Alternatives2334);
                    ruleNormalAttribute();
                    _fsp--;

                     after(grammarAccess.getAttributeAccess().getNormalAttributeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1133:6: ( ruleEnumFieldAttribute )
                    {
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1133:6: ( ruleEnumFieldAttribute )
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1134:1: ruleEnumFieldAttribute
                    {
                     before(grammarAccess.getAttributeAccess().getEnumFieldAttributeParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleEnumFieldAttribute_in_rule__Attribute__Alternatives2351);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1144:1: rule__EnumFieldAttribute__Alternatives : ( ( ruleRestrictionAttribute ) | ( ruleRestrictionGroupAttribute ) );
    public final void rule__EnumFieldAttribute__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1148:1: ( ( ruleRestrictionAttribute ) | ( ruleRestrictionGroupAttribute ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==47) ) {
                alt4=1;
            }
            else if ( (LA4_0==48) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1144:1: rule__EnumFieldAttribute__Alternatives : ( ( ruleRestrictionAttribute ) | ( ruleRestrictionGroupAttribute ) );", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1149:1: ( ruleRestrictionAttribute )
                    {
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1149:1: ( ruleRestrictionAttribute )
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1150:1: ruleRestrictionAttribute
                    {
                     before(grammarAccess.getEnumFieldAttributeAccess().getRestrictionAttributeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleRestrictionAttribute_in_rule__EnumFieldAttribute__Alternatives2383);
                    ruleRestrictionAttribute();
                    _fsp--;

                     after(grammarAccess.getEnumFieldAttributeAccess().getRestrictionAttributeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1155:6: ( ruleRestrictionGroupAttribute )
                    {
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1155:6: ( ruleRestrictionGroupAttribute )
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1156:1: ruleRestrictionGroupAttribute
                    {
                     before(grammarAccess.getEnumFieldAttributeAccess().getRestrictionGroupAttributeParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleRestrictionGroupAttribute_in_rule__EnumFieldAttribute__Alternatives2400);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1166:1: rule__ReferenceTarget__Alternatives : ( ( ruleField ) | ( ruleExternalVariable ) );
    public final void rule__ReferenceTarget__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1170:1: ( ( ruleField ) | ( ruleExternalVariable ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                alt5=1;
            }
            else if ( (LA5_0==35) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1166:1: rule__ReferenceTarget__Alternatives : ( ( ruleField ) | ( ruleExternalVariable ) );", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1171:1: ( ruleField )
                    {
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1171:1: ( ruleField )
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1172:1: ruleField
                    {
                     before(grammarAccess.getReferenceTargetAccess().getFieldParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleField_in_rule__ReferenceTarget__Alternatives2432);
                    ruleField();
                    _fsp--;

                     after(grammarAccess.getReferenceTargetAccess().getFieldParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1177:6: ( ruleExternalVariable )
                    {
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1177:6: ( ruleExternalVariable )
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1178:1: ruleExternalVariable
                    {
                     before(grammarAccess.getReferenceTargetAccess().getExternalVariableParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleExternalVariable_in_rule__ReferenceTarget__Alternatives2449);
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


    // $ANTLR start rule__BOrExpression__Alternatives_1_1
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1189:1: rule__BOrExpression__Alternatives_1_1 : ( ( 'or' ) | ( '|' ) );
    public final void rule__BOrExpression__Alternatives_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1193:1: ( ( 'or' ) | ( '|' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==11) ) {
                alt6=1;
            }
            else if ( (LA6_0==12) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1189:1: rule__BOrExpression__Alternatives_1_1 : ( ( 'or' ) | ( '|' ) );", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1194:1: ( 'or' )
                    {
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1194:1: ( 'or' )
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1195:1: 'or'
                    {
                     before(grammarAccess.getBOrExpressionAccess().getOrKeyword_1_1_0()); 
                    match(input,11,FOLLOW_11_in_rule__BOrExpression__Alternatives_1_12483); 
                     after(grammarAccess.getBOrExpressionAccess().getOrKeyword_1_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1202:6: ( '|' )
                    {
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1202:6: ( '|' )
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1203:1: '|'
                    {
                     before(grammarAccess.getBOrExpressionAccess().getVerticalLineKeyword_1_1_1()); 
                    match(input,12,FOLLOW_12_in_rule__BOrExpression__Alternatives_1_12503); 
                     after(grammarAccess.getBOrExpressionAccess().getVerticalLineKeyword_1_1_1()); 

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
    // $ANTLR end rule__BOrExpression__Alternatives_1_1


    // $ANTLR start rule__BAndExpression__Alternatives_1_1
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1215:1: rule__BAndExpression__Alternatives_1_1 : ( ( 'and' ) | ( '&' ) );
    public final void rule__BAndExpression__Alternatives_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1219:1: ( ( 'and' ) | ( '&' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==13) ) {
                alt7=1;
            }
            else if ( (LA7_0==14) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1215:1: rule__BAndExpression__Alternatives_1_1 : ( ( 'and' ) | ( '&' ) );", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1220:1: ( 'and' )
                    {
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1220:1: ( 'and' )
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1221:1: 'and'
                    {
                     before(grammarAccess.getBAndExpressionAccess().getAndKeyword_1_1_0()); 
                    match(input,13,FOLLOW_13_in_rule__BAndExpression__Alternatives_1_12538); 
                     after(grammarAccess.getBAndExpressionAccess().getAndKeyword_1_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1228:6: ( '&' )
                    {
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1228:6: ( '&' )
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1229:1: '&'
                    {
                     before(grammarAccess.getBAndExpressionAccess().getAmpersandKeyword_1_1_1()); 
                    match(input,14,FOLLOW_14_in_rule__BAndExpression__Alternatives_1_12558); 
                     after(grammarAccess.getBAndExpressionAccess().getAmpersandKeyword_1_1_1()); 

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
    // $ANTLR end rule__BAndExpression__Alternatives_1_1


    // $ANTLR start rule__NegationExpression__Alternatives
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1241:1: rule__NegationExpression__Alternatives : ( ( ruleTerminalBExpression ) | ( ( rule__NegationExpression__Group_1__0 ) ) );
    public final void rule__NegationExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1245:1: ( ( ruleTerminalBExpression ) | ( ( rule__NegationExpression__Group_1__0 ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID||LA8_0==33) ) {
                alt8=1;
            }
            else if ( ((LA8_0>=15 && LA8_0<=16)) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1241:1: rule__NegationExpression__Alternatives : ( ( ruleTerminalBExpression ) | ( ( rule__NegationExpression__Group_1__0 ) ) );", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1246:1: ( ruleTerminalBExpression )
                    {
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1246:1: ( ruleTerminalBExpression )
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1247:1: ruleTerminalBExpression
                    {
                     before(grammarAccess.getNegationExpressionAccess().getTerminalBExpressionParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleTerminalBExpression_in_rule__NegationExpression__Alternatives2592);
                    ruleTerminalBExpression();
                    _fsp--;

                     after(grammarAccess.getNegationExpressionAccess().getTerminalBExpressionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1252:6: ( ( rule__NegationExpression__Group_1__0 ) )
                    {
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1252:6: ( ( rule__NegationExpression__Group_1__0 ) )
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1253:1: ( rule__NegationExpression__Group_1__0 )
                    {
                     before(grammarAccess.getNegationExpressionAccess().getGroup_1()); 
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1254:1: ( rule__NegationExpression__Group_1__0 )
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1254:2: rule__NegationExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__NegationExpression__Group_1__0_in_rule__NegationExpression__Alternatives2609);
                    rule__NegationExpression__Group_1__0();
                    _fsp--;


                    }

                     after(grammarAccess.getNegationExpressionAccess().getGroup_1()); 

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
    // $ANTLR end rule__NegationExpression__Alternatives


    // $ANTLR start rule__NegationExpression__Alternatives_1_1
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1263:1: rule__NegationExpression__Alternatives_1_1 : ( ( 'not' ) | ( '!' ) );
    public final void rule__NegationExpression__Alternatives_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1267:1: ( ( 'not' ) | ( '!' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==15) ) {
                alt9=1;
            }
            else if ( (LA9_0==16) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1263:1: rule__NegationExpression__Alternatives_1_1 : ( ( 'not' ) | ( '!' ) );", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1268:1: ( 'not' )
                    {
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1268:1: ( 'not' )
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1269:1: 'not'
                    {
                     before(grammarAccess.getNegationExpressionAccess().getNotKeyword_1_1_0()); 
                    match(input,15,FOLLOW_15_in_rule__NegationExpression__Alternatives_1_12643); 
                     after(grammarAccess.getNegationExpressionAccess().getNotKeyword_1_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1276:6: ( '!' )
                    {
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1276:6: ( '!' )
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1277:1: '!'
                    {
                     before(grammarAccess.getNegationExpressionAccess().getExclamationMarkKeyword_1_1_1()); 
                    match(input,16,FOLLOW_16_in_rule__NegationExpression__Alternatives_1_12663); 
                     after(grammarAccess.getNegationExpressionAccess().getExclamationMarkKeyword_1_1_1()); 

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
    // $ANTLR end rule__NegationExpression__Alternatives_1_1


    // $ANTLR start rule__TerminalBExpression__Alternatives
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1289:1: rule__TerminalBExpression__Alternatives : ( ( ruleAtomicReferringBExpression ) | ( ( rule__TerminalBExpression__Group_1__0 ) ) );
    public final void rule__TerminalBExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1293:1: ( ( ruleAtomicReferringBExpression ) | ( ( rule__TerminalBExpression__Group_1__0 ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                alt10=1;
            }
            else if ( (LA10_0==33) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1289:1: rule__TerminalBExpression__Alternatives : ( ( ruleAtomicReferringBExpression ) | ( ( rule__TerminalBExpression__Group_1__0 ) ) );", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1294:1: ( ruleAtomicReferringBExpression )
                    {
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1294:1: ( ruleAtomicReferringBExpression )
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1295:1: ruleAtomicReferringBExpression
                    {
                     before(grammarAccess.getTerminalBExpressionAccess().getAtomicReferringBExpressionParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleAtomicReferringBExpression_in_rule__TerminalBExpression__Alternatives2697);
                    ruleAtomicReferringBExpression();
                    _fsp--;

                     after(grammarAccess.getTerminalBExpressionAccess().getAtomicReferringBExpressionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1300:6: ( ( rule__TerminalBExpression__Group_1__0 ) )
                    {
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1300:6: ( ( rule__TerminalBExpression__Group_1__0 ) )
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1301:1: ( rule__TerminalBExpression__Group_1__0 )
                    {
                     before(grammarAccess.getTerminalBExpressionAccess().getGroup_1()); 
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1302:1: ( rule__TerminalBExpression__Group_1__0 )
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1302:2: rule__TerminalBExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__TerminalBExpression__Group_1__0_in_rule__TerminalBExpression__Alternatives2714);
                    rule__TerminalBExpression__Group_1__0();
                    _fsp--;


                    }

                     after(grammarAccess.getTerminalBExpressionAccess().getGroup_1()); 

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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1311:1: rule__AtomicReferringBExpression__Alternatives : ( ( ruleBComparison ) | ( ruleEnumComparison ) | ( ruleStringValueComparison ) | ( rulePresenceCheck ) );
    public final void rule__AtomicReferringBExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1315:1: ( ( ruleBComparison ) | ( ruleEnumComparison ) | ( ruleStringValueComparison ) | ( rulePresenceCheck ) )
            int alt11=4;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case 24:
                case 25:
                case 28:
                    {
                    alt11=2;
                    }
                    break;
                case 53:
                    {
                    alt11=4;
                    }
                    break;
                case 52:
                    {
                    alt11=3;
                    }
                    break;
                case EOF:
                case RULE_ID:
                case 11:
                case 12:
                case 13:
                case 14:
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 33:
                case 34:
                case 41:
                case 43:
                case 47:
                case 48:
                case 50:
                case 51:
                    {
                    alt11=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("1311:1: rule__AtomicReferringBExpression__Alternatives : ( ( ruleBComparison ) | ( ruleEnumComparison ) | ( ruleStringValueComparison ) | ( rulePresenceCheck ) );", 11, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1311:1: rule__AtomicReferringBExpression__Alternatives : ( ( ruleBComparison ) | ( ruleEnumComparison ) | ( ruleStringValueComparison ) | ( rulePresenceCheck ) );", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1316:1: ( ruleBComparison )
                    {
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1316:1: ( ruleBComparison )
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1317:1: ruleBComparison
                    {
                     before(grammarAccess.getAtomicReferringBExpressionAccess().getBComparisonParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleBComparison_in_rule__AtomicReferringBExpression__Alternatives2747);
                    ruleBComparison();
                    _fsp--;

                     after(grammarAccess.getAtomicReferringBExpressionAccess().getBComparisonParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1322:6: ( ruleEnumComparison )
                    {
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1322:6: ( ruleEnumComparison )
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1323:1: ruleEnumComparison
                    {
                     before(grammarAccess.getAtomicReferringBExpressionAccess().getEnumComparisonParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleEnumComparison_in_rule__AtomicReferringBExpression__Alternatives2764);
                    ruleEnumComparison();
                    _fsp--;

                     after(grammarAccess.getAtomicReferringBExpressionAccess().getEnumComparisonParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1328:6: ( ruleStringValueComparison )
                    {
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1328:6: ( ruleStringValueComparison )
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1329:1: ruleStringValueComparison
                    {
                     before(grammarAccess.getAtomicReferringBExpressionAccess().getStringValueComparisonParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleStringValueComparison_in_rule__AtomicReferringBExpression__Alternatives2781);
                    ruleStringValueComparison();
                    _fsp--;

                     after(grammarAccess.getAtomicReferringBExpressionAccess().getStringValueComparisonParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1334:6: ( rulePresenceCheck )
                    {
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1334:6: ( rulePresenceCheck )
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1335:1: rulePresenceCheck
                    {
                     before(grammarAccess.getAtomicReferringBExpressionAccess().getPresenceCheckParserRuleCall_3()); 
                    pushFollow(FOLLOW_rulePresenceCheck_in_rule__AtomicReferringBExpression__Alternatives2798);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1345:1: rule__EnumComparison__Alternatives : ( ( ruleSingleEnumComparison ) | ( ruleMultiEnumComparison ) );
    public final void rule__EnumComparison__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1349:1: ( ( ruleSingleEnumComparison ) | ( ruleMultiEnumComparison ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID) ) {
                int LA12_1 = input.LA(2);

                if ( ((LA12_1>=24 && LA12_1<=25)) ) {
                    alt12=2;
                }
                else if ( (LA12_1==28) ) {
                    alt12=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1345:1: rule__EnumComparison__Alternatives : ( ( ruleSingleEnumComparison ) | ( ruleMultiEnumComparison ) );", 12, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1345:1: rule__EnumComparison__Alternatives : ( ( ruleSingleEnumComparison ) | ( ruleMultiEnumComparison ) );", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1350:1: ( ruleSingleEnumComparison )
                    {
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1350:1: ( ruleSingleEnumComparison )
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1351:1: ruleSingleEnumComparison
                    {
                     before(grammarAccess.getEnumComparisonAccess().getSingleEnumComparisonParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleSingleEnumComparison_in_rule__EnumComparison__Alternatives2830);
                    ruleSingleEnumComparison();
                    _fsp--;

                     after(grammarAccess.getEnumComparisonAccess().getSingleEnumComparisonParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1356:6: ( ruleMultiEnumComparison )
                    {
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1356:6: ( ruleMultiEnumComparison )
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1357:1: ruleMultiEnumComparison
                    {
                     before(grammarAccess.getEnumComparisonAccess().getMultiEnumComparisonParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleMultiEnumComparison_in_rule__EnumComparison__Alternatives2847);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1367:1: rule__EnumLiteralsCollection__Alternatives : ( ( ruleDirectEnumLiteralsCollection ) | ( ruleEnumListReference ) );
    public final void rule__EnumLiteralsCollection__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1371:1: ( ( ruleDirectEnumLiteralsCollection ) | ( ruleEnumListReference ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==33) ) {
                alt13=1;
            }
            else if ( (LA13_0==RULE_ID) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1367:1: rule__EnumLiteralsCollection__Alternatives : ( ( ruleDirectEnumLiteralsCollection ) | ( ruleEnumListReference ) );", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1372:1: ( ruleDirectEnumLiteralsCollection )
                    {
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1372:1: ( ruleDirectEnumLiteralsCollection )
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1373:1: ruleDirectEnumLiteralsCollection
                    {
                     before(grammarAccess.getEnumLiteralsCollectionAccess().getDirectEnumLiteralsCollectionParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleDirectEnumLiteralsCollection_in_rule__EnumLiteralsCollection__Alternatives2879);
                    ruleDirectEnumLiteralsCollection();
                    _fsp--;

                     after(grammarAccess.getEnumLiteralsCollectionAccess().getDirectEnumLiteralsCollectionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1378:6: ( ruleEnumListReference )
                    {
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1378:6: ( ruleEnumListReference )
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1379:1: ruleEnumListReference
                    {
                     before(grammarAccess.getEnumLiteralsCollectionAccess().getEnumListReferenceParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleEnumListReference_in_rule__EnumLiteralsCollection__Alternatives2896);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1389:1: rule__AttributeClass__Alternatives : ( ( ( 'display' ) ) | ( ( 'required' ) ) | ( ( 'readonly' ) ) | ( ( 'calculated' ) ) | ( ( 'doubleAsterisk' ) ) );
    public final void rule__AttributeClass__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1393:1: ( ( ( 'display' ) ) | ( ( 'required' ) ) | ( ( 'readonly' ) ) | ( ( 'calculated' ) ) | ( ( 'doubleAsterisk' ) ) )
            int alt14=5;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt14=1;
                }
                break;
            case 18:
                {
                alt14=2;
                }
                break;
            case 19:
                {
                alt14=3;
                }
                break;
            case 20:
                {
                alt14=4;
                }
                break;
            case 21:
                {
                alt14=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1389:1: rule__AttributeClass__Alternatives : ( ( ( 'display' ) ) | ( ( 'required' ) ) | ( ( 'readonly' ) ) | ( ( 'calculated' ) ) | ( ( 'doubleAsterisk' ) ) );", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1394:1: ( ( 'display' ) )
                    {
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1394:1: ( ( 'display' ) )
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1395:1: ( 'display' )
                    {
                     before(grammarAccess.getAttributeClassAccess().getDisplayEnumLiteralDeclaration_0()); 
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1396:1: ( 'display' )
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1396:3: 'display'
                    {
                    match(input,17,FOLLOW_17_in_rule__AttributeClass__Alternatives2929); 

                    }

                     after(grammarAccess.getAttributeClassAccess().getDisplayEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1401:6: ( ( 'required' ) )
                    {
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1401:6: ( ( 'required' ) )
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1402:1: ( 'required' )
                    {
                     before(grammarAccess.getAttributeClassAccess().getRequiredEnumLiteralDeclaration_1()); 
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1403:1: ( 'required' )
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1403:3: 'required'
                    {
                    match(input,18,FOLLOW_18_in_rule__AttributeClass__Alternatives2950); 

                    }

                     after(grammarAccess.getAttributeClassAccess().getRequiredEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1408:6: ( ( 'readonly' ) )
                    {
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1408:6: ( ( 'readonly' ) )
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1409:1: ( 'readonly' )
                    {
                     before(grammarAccess.getAttributeClassAccess().getReadonlyEnumLiteralDeclaration_2()); 
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1410:1: ( 'readonly' )
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1410:3: 'readonly'
                    {
                    match(input,19,FOLLOW_19_in_rule__AttributeClass__Alternatives2971); 

                    }

                     after(grammarAccess.getAttributeClassAccess().getReadonlyEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1415:6: ( ( 'calculated' ) )
                    {
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1415:6: ( ( 'calculated' ) )
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1416:1: ( 'calculated' )
                    {
                     before(grammarAccess.getAttributeClassAccess().getCalculatedEnumLiteralDeclaration_3()); 
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1417:1: ( 'calculated' )
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1417:3: 'calculated'
                    {
                    match(input,20,FOLLOW_20_in_rule__AttributeClass__Alternatives2992); 

                    }

                     after(grammarAccess.getAttributeClassAccess().getCalculatedEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1422:6: ( ( 'doubleAsterisk' ) )
                    {
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1422:6: ( ( 'doubleAsterisk' ) )
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1423:1: ( 'doubleAsterisk' )
                    {
                     before(grammarAccess.getAttributeClassAccess().getDoubleAsteriskEnumLiteralDeclaration_4()); 
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1424:1: ( 'doubleAsterisk' )
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1424:3: 'doubleAsterisk'
                    {
                    match(input,21,FOLLOW_21_in_rule__AttributeClass__Alternatives3013); 

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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1434:1: rule__BLiteral__Alternatives : ( ( ( 'true' ) ) | ( ( 'false' ) ) );
    public final void rule__BLiteral__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1438:1: ( ( ( 'true' ) ) | ( ( 'false' ) ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==22) ) {
                alt15=1;
            }
            else if ( (LA15_0==23) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1434:1: rule__BLiteral__Alternatives : ( ( ( 'true' ) ) | ( ( 'false' ) ) );", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1439:1: ( ( 'true' ) )
                    {
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1439:1: ( ( 'true' ) )
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1440:1: ( 'true' )
                    {
                     before(grammarAccess.getBLiteralAccess().getTrueEnumLiteralDeclaration_0()); 
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1441:1: ( 'true' )
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1441:3: 'true'
                    {
                    match(input,22,FOLLOW_22_in_rule__BLiteral__Alternatives3049); 

                    }

                     after(grammarAccess.getBLiteralAccess().getTrueEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1446:6: ( ( 'false' ) )
                    {
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1446:6: ( ( 'false' ) )
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1447:1: ( 'false' )
                    {
                     before(grammarAccess.getBLiteralAccess().getFalseEnumLiteralDeclaration_1()); 
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1448:1: ( 'false' )
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1448:3: 'false'
                    {
                    match(input,23,FOLLOW_23_in_rule__BLiteral__Alternatives3070); 

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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1458:1: rule__EnumMembership__Alternatives : ( ( ( 'is-one-of' ) ) | ( ( 'is-not-one-of' ) ) );
    public final void rule__EnumMembership__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1462:1: ( ( ( 'is-one-of' ) ) | ( ( 'is-not-one-of' ) ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==24) ) {
                alt16=1;
            }
            else if ( (LA16_0==25) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1458:1: rule__EnumMembership__Alternatives : ( ( ( 'is-one-of' ) ) | ( ( 'is-not-one-of' ) ) );", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1463:1: ( ( 'is-one-of' ) )
                    {
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1463:1: ( ( 'is-one-of' ) )
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1464:1: ( 'is-one-of' )
                    {
                     before(grammarAccess.getEnumMembershipAccess().getIsInEnumLiteralDeclaration_0()); 
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1465:1: ( 'is-one-of' )
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1465:3: 'is-one-of'
                    {
                    match(input,24,FOLLOW_24_in_rule__EnumMembership__Alternatives3106); 

                    }

                     after(grammarAccess.getEnumMembershipAccess().getIsInEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1470:6: ( ( 'is-not-one-of' ) )
                    {
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1470:6: ( ( 'is-not-one-of' ) )
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1471:1: ( 'is-not-one-of' )
                    {
                     before(grammarAccess.getEnumMembershipAccess().getIsNotInEnumLiteralDeclaration_1()); 
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1472:1: ( 'is-not-one-of' )
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1472:3: 'is-not-one-of'
                    {
                    match(input,25,FOLLOW_25_in_rule__EnumMembership__Alternatives3127); 

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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1484:1: rule__DynamicScreen__Group__0 : rule__DynamicScreen__Group__0__Impl rule__DynamicScreen__Group__1 ;
    public final void rule__DynamicScreen__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1488:1: ( rule__DynamicScreen__Group__0__Impl rule__DynamicScreen__Group__1 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1489:2: rule__DynamicScreen__Group__0__Impl rule__DynamicScreen__Group__1
            {
            pushFollow(FOLLOW_rule__DynamicScreen__Group__0__Impl_in_rule__DynamicScreen__Group__03160);
            rule__DynamicScreen__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DynamicScreen__Group__1_in_rule__DynamicScreen__Group__03163);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1496:1: rule__DynamicScreen__Group__0__Impl : ( 'dynamic-screen' ) ;
    public final void rule__DynamicScreen__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1500:1: ( ( 'dynamic-screen' ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1501:1: ( 'dynamic-screen' )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1501:1: ( 'dynamic-screen' )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1502:1: 'dynamic-screen'
            {
             before(grammarAccess.getDynamicScreenAccess().getDynamicScreenKeyword_0()); 
            match(input,26,FOLLOW_26_in_rule__DynamicScreen__Group__0__Impl3191); 
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1515:1: rule__DynamicScreen__Group__1 : rule__DynamicScreen__Group__1__Impl rule__DynamicScreen__Group__2 ;
    public final void rule__DynamicScreen__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1519:1: ( rule__DynamicScreen__Group__1__Impl rule__DynamicScreen__Group__2 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1520:2: rule__DynamicScreen__Group__1__Impl rule__DynamicScreen__Group__2
            {
            pushFollow(FOLLOW_rule__DynamicScreen__Group__1__Impl_in_rule__DynamicScreen__Group__13222);
            rule__DynamicScreen__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DynamicScreen__Group__2_in_rule__DynamicScreen__Group__13225);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1527:1: rule__DynamicScreen__Group__1__Impl : ( ( rule__DynamicScreen__LabelAssignment_1 ) ) ;
    public final void rule__DynamicScreen__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1531:1: ( ( ( rule__DynamicScreen__LabelAssignment_1 ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1532:1: ( ( rule__DynamicScreen__LabelAssignment_1 ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1532:1: ( ( rule__DynamicScreen__LabelAssignment_1 ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1533:1: ( rule__DynamicScreen__LabelAssignment_1 )
            {
             before(grammarAccess.getDynamicScreenAccess().getLabelAssignment_1()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1534:1: ( rule__DynamicScreen__LabelAssignment_1 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1534:2: rule__DynamicScreen__LabelAssignment_1
            {
            pushFollow(FOLLOW_rule__DynamicScreen__LabelAssignment_1_in_rule__DynamicScreen__Group__1__Impl3252);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1544:1: rule__DynamicScreen__Group__2 : rule__DynamicScreen__Group__2__Impl rule__DynamicScreen__Group__3 ;
    public final void rule__DynamicScreen__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1548:1: ( rule__DynamicScreen__Group__2__Impl rule__DynamicScreen__Group__3 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1549:2: rule__DynamicScreen__Group__2__Impl rule__DynamicScreen__Group__3
            {
            pushFollow(FOLLOW_rule__DynamicScreen__Group__2__Impl_in_rule__DynamicScreen__Group__23282);
            rule__DynamicScreen__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DynamicScreen__Group__3_in_rule__DynamicScreen__Group__23285);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1556:1: rule__DynamicScreen__Group__2__Impl : ( 'data-import' ) ;
    public final void rule__DynamicScreen__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1560:1: ( ( 'data-import' ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1561:1: ( 'data-import' )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1561:1: ( 'data-import' )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1562:1: 'data-import'
            {
             before(grammarAccess.getDynamicScreenAccess().getDataImportKeyword_2()); 
            match(input,27,FOLLOW_27_in_rule__DynamicScreen__Group__2__Impl3313); 
             after(grammarAccess.getDynamicScreenAccess().getDataImportKeyword_2()); 

            }


            }

        }
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1575:1: rule__DynamicScreen__Group__3 : rule__DynamicScreen__Group__3__Impl rule__DynamicScreen__Group__4 ;
    public final void rule__DynamicScreen__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1579:1: ( rule__DynamicScreen__Group__3__Impl rule__DynamicScreen__Group__4 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1580:2: rule__DynamicScreen__Group__3__Impl rule__DynamicScreen__Group__4
            {
            pushFollow(FOLLOW_rule__DynamicScreen__Group__3__Impl_in_rule__DynamicScreen__Group__33344);
            rule__DynamicScreen__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DynamicScreen__Group__4_in_rule__DynamicScreen__Group__33347);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1587:1: rule__DynamicScreen__Group__3__Impl : ( '=' ) ;
    public final void rule__DynamicScreen__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1591:1: ( ( '=' ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1592:1: ( '=' )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1592:1: ( '=' )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1593:1: '='
            {
             before(grammarAccess.getDynamicScreenAccess().getEqualsSignKeyword_3()); 
            match(input,28,FOLLOW_28_in_rule__DynamicScreen__Group__3__Impl3375); 
             after(grammarAccess.getDynamicScreenAccess().getEqualsSignKeyword_3()); 

            }


            }

        }
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1606:1: rule__DynamicScreen__Group__4 : rule__DynamicScreen__Group__4__Impl rule__DynamicScreen__Group__5 ;
    public final void rule__DynamicScreen__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1610:1: ( rule__DynamicScreen__Group__4__Impl rule__DynamicScreen__Group__5 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1611:2: rule__DynamicScreen__Group__4__Impl rule__DynamicScreen__Group__5
            {
            pushFollow(FOLLOW_rule__DynamicScreen__Group__4__Impl_in_rule__DynamicScreen__Group__43406);
            rule__DynamicScreen__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DynamicScreen__Group__5_in_rule__DynamicScreen__Group__43409);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1618:1: rule__DynamicScreen__Group__4__Impl : ( ( rule__DynamicScreen__ImportURIAssignment_4 ) ) ;
    public final void rule__DynamicScreen__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1622:1: ( ( ( rule__DynamicScreen__ImportURIAssignment_4 ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1623:1: ( ( rule__DynamicScreen__ImportURIAssignment_4 ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1623:1: ( ( rule__DynamicScreen__ImportURIAssignment_4 ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1624:1: ( rule__DynamicScreen__ImportURIAssignment_4 )
            {
             before(grammarAccess.getDynamicScreenAccess().getImportURIAssignment_4()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1625:1: ( rule__DynamicScreen__ImportURIAssignment_4 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1625:2: rule__DynamicScreen__ImportURIAssignment_4
            {
            pushFollow(FOLLOW_rule__DynamicScreen__ImportURIAssignment_4_in_rule__DynamicScreen__Group__4__Impl3436);
            rule__DynamicScreen__ImportURIAssignment_4();
            _fsp--;


            }

             after(grammarAccess.getDynamicScreenAccess().getImportURIAssignment_4()); 

            }


            }

        }
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1635:1: rule__DynamicScreen__Group__5 : rule__DynamicScreen__Group__5__Impl rule__DynamicScreen__Group__6 ;
    public final void rule__DynamicScreen__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1639:1: ( rule__DynamicScreen__Group__5__Impl rule__DynamicScreen__Group__6 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1640:2: rule__DynamicScreen__Group__5__Impl rule__DynamicScreen__Group__6
            {
            pushFollow(FOLLOW_rule__DynamicScreen__Group__5__Impl_in_rule__DynamicScreen__Group__53466);
            rule__DynamicScreen__Group__5__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DynamicScreen__Group__6_in_rule__DynamicScreen__Group__53469);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1647:1: rule__DynamicScreen__Group__5__Impl : ( 'view-class' ) ;
    public final void rule__DynamicScreen__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1651:1: ( ( 'view-class' ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1652:1: ( 'view-class' )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1652:1: ( 'view-class' )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1653:1: 'view-class'
            {
             before(grammarAccess.getDynamicScreenAccess().getViewClassKeyword_5()); 
            match(input,29,FOLLOW_29_in_rule__DynamicScreen__Group__5__Impl3497); 
             after(grammarAccess.getDynamicScreenAccess().getViewClassKeyword_5()); 

            }


            }

        }
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1666:1: rule__DynamicScreen__Group__6 : rule__DynamicScreen__Group__6__Impl rule__DynamicScreen__Group__7 ;
    public final void rule__DynamicScreen__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1670:1: ( rule__DynamicScreen__Group__6__Impl rule__DynamicScreen__Group__7 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1671:2: rule__DynamicScreen__Group__6__Impl rule__DynamicScreen__Group__7
            {
            pushFollow(FOLLOW_rule__DynamicScreen__Group__6__Impl_in_rule__DynamicScreen__Group__63528);
            rule__DynamicScreen__Group__6__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DynamicScreen__Group__7_in_rule__DynamicScreen__Group__63531);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1678:1: rule__DynamicScreen__Group__6__Impl : ( '=' ) ;
    public final void rule__DynamicScreen__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1682:1: ( ( '=' ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1683:1: ( '=' )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1683:1: ( '=' )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1684:1: '='
            {
             before(grammarAccess.getDynamicScreenAccess().getEqualsSignKeyword_6()); 
            match(input,28,FOLLOW_28_in_rule__DynamicScreen__Group__6__Impl3559); 
             after(grammarAccess.getDynamicScreenAccess().getEqualsSignKeyword_6()); 

            }


            }

        }
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1697:1: rule__DynamicScreen__Group__7 : rule__DynamicScreen__Group__7__Impl rule__DynamicScreen__Group__8 ;
    public final void rule__DynamicScreen__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1701:1: ( rule__DynamicScreen__Group__7__Impl rule__DynamicScreen__Group__8 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1702:2: rule__DynamicScreen__Group__7__Impl rule__DynamicScreen__Group__8
            {
            pushFollow(FOLLOW_rule__DynamicScreen__Group__7__Impl_in_rule__DynamicScreen__Group__73590);
            rule__DynamicScreen__Group__7__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DynamicScreen__Group__8_in_rule__DynamicScreen__Group__73593);
            rule__DynamicScreen__Group__8();
            _fsp--;


            }

        }
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1709:1: rule__DynamicScreen__Group__7__Impl : ( ( rule__DynamicScreen__ViewClassAssignment_7 ) ) ;
    public final void rule__DynamicScreen__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1713:1: ( ( ( rule__DynamicScreen__ViewClassAssignment_7 ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1714:1: ( ( rule__DynamicScreen__ViewClassAssignment_7 ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1714:1: ( ( rule__DynamicScreen__ViewClassAssignment_7 ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1715:1: ( rule__DynamicScreen__ViewClassAssignment_7 )
            {
             before(grammarAccess.getDynamicScreenAccess().getViewClassAssignment_7()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1716:1: ( rule__DynamicScreen__ViewClassAssignment_7 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1716:2: rule__DynamicScreen__ViewClassAssignment_7
            {
            pushFollow(FOLLOW_rule__DynamicScreen__ViewClassAssignment_7_in_rule__DynamicScreen__Group__7__Impl3620);
            rule__DynamicScreen__ViewClassAssignment_7();
            _fsp--;


            }

             after(grammarAccess.getDynamicScreenAccess().getViewClassAssignment_7()); 

            }


            }

        }
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


    // $ANTLR start rule__DynamicScreen__Group__8
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1726:1: rule__DynamicScreen__Group__8 : rule__DynamicScreen__Group__8__Impl rule__DynamicScreen__Group__9 ;
    public final void rule__DynamicScreen__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1730:1: ( rule__DynamicScreen__Group__8__Impl rule__DynamicScreen__Group__9 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1731:2: rule__DynamicScreen__Group__8__Impl rule__DynamicScreen__Group__9
            {
            pushFollow(FOLLOW_rule__DynamicScreen__Group__8__Impl_in_rule__DynamicScreen__Group__83650);
            rule__DynamicScreen__Group__8__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DynamicScreen__Group__9_in_rule__DynamicScreen__Group__83653);
            rule__DynamicScreen__Group__9();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DynamicScreen__Group__8


    // $ANTLR start rule__DynamicScreen__Group__8__Impl
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1738:1: rule__DynamicScreen__Group__8__Impl : ( ( rule__DynamicScreen__DeclarationsAssignment_8 )* ) ;
    public final void rule__DynamicScreen__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1742:1: ( ( ( rule__DynamicScreen__DeclarationsAssignment_8 )* ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1743:1: ( ( rule__DynamicScreen__DeclarationsAssignment_8 )* )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1743:1: ( ( rule__DynamicScreen__DeclarationsAssignment_8 )* )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1744:1: ( rule__DynamicScreen__DeclarationsAssignment_8 )*
            {
             before(grammarAccess.getDynamicScreenAccess().getDeclarationsAssignment_8()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1745:1: ( rule__DynamicScreen__DeclarationsAssignment_8 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==35||LA17_0==37||LA17_0==39) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1745:2: rule__DynamicScreen__DeclarationsAssignment_8
            	    {
            	    pushFollow(FOLLOW_rule__DynamicScreen__DeclarationsAssignment_8_in_rule__DynamicScreen__Group__8__Impl3680);
            	    rule__DynamicScreen__DeclarationsAssignment_8();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getDynamicScreenAccess().getDeclarationsAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DynamicScreen__Group__8__Impl


    // $ANTLR start rule__DynamicScreen__Group__9
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1755:1: rule__DynamicScreen__Group__9 : rule__DynamicScreen__Group__9__Impl ;
    public final void rule__DynamicScreen__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1759:1: ( rule__DynamicScreen__Group__9__Impl )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1760:2: rule__DynamicScreen__Group__9__Impl
            {
            pushFollow(FOLLOW_rule__DynamicScreen__Group__9__Impl_in_rule__DynamicScreen__Group__93711);
            rule__DynamicScreen__Group__9__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DynamicScreen__Group__9


    // $ANTLR start rule__DynamicScreen__Group__9__Impl
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1766:1: rule__DynamicScreen__Group__9__Impl : ( ( ( rule__DynamicScreen__GroupsAssignment_9 ) ) ( ( rule__DynamicScreen__GroupsAssignment_9 )* ) ) ;
    public final void rule__DynamicScreen__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1770:1: ( ( ( ( rule__DynamicScreen__GroupsAssignment_9 ) ) ( ( rule__DynamicScreen__GroupsAssignment_9 )* ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1771:1: ( ( ( rule__DynamicScreen__GroupsAssignment_9 ) ) ( ( rule__DynamicScreen__GroupsAssignment_9 )* ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1771:1: ( ( ( rule__DynamicScreen__GroupsAssignment_9 ) ) ( ( rule__DynamicScreen__GroupsAssignment_9 )* ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1772:1: ( ( rule__DynamicScreen__GroupsAssignment_9 ) ) ( ( rule__DynamicScreen__GroupsAssignment_9 )* )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1772:1: ( ( rule__DynamicScreen__GroupsAssignment_9 ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1773:1: ( rule__DynamicScreen__GroupsAssignment_9 )
            {
             before(grammarAccess.getDynamicScreenAccess().getGroupsAssignment_9()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1774:1: ( rule__DynamicScreen__GroupsAssignment_9 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1774:2: rule__DynamicScreen__GroupsAssignment_9
            {
            pushFollow(FOLLOW_rule__DynamicScreen__GroupsAssignment_9_in_rule__DynamicScreen__Group__9__Impl3740);
            rule__DynamicScreen__GroupsAssignment_9();
            _fsp--;


            }

             after(grammarAccess.getDynamicScreenAccess().getGroupsAssignment_9()); 

            }

            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1777:1: ( ( rule__DynamicScreen__GroupsAssignment_9 )* )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1778:1: ( rule__DynamicScreen__GroupsAssignment_9 )*
            {
             before(grammarAccess.getDynamicScreenAccess().getGroupsAssignment_9()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1779:1: ( rule__DynamicScreen__GroupsAssignment_9 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==41) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1779:2: rule__DynamicScreen__GroupsAssignment_9
            	    {
            	    pushFollow(FOLLOW_rule__DynamicScreen__GroupsAssignment_9_in_rule__DynamicScreen__Group__9__Impl3752);
            	    rule__DynamicScreen__GroupsAssignment_9();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getDynamicScreenAccess().getGroupsAssignment_9()); 

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
    // $ANTLR end rule__DynamicScreen__Group__9__Impl


    // $ANTLR start rule__Label__Group__0
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1810:1: rule__Label__Group__0 : rule__Label__Group__0__Impl rule__Label__Group__1 ;
    public final void rule__Label__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1814:1: ( rule__Label__Group__0__Impl rule__Label__Group__1 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1815:2: rule__Label__Group__0__Impl rule__Label__Group__1
            {
            pushFollow(FOLLOW_rule__Label__Group__0__Impl_in_rule__Label__Group__03805);
            rule__Label__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Label__Group__1_in_rule__Label__Group__03808);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1822:1: rule__Label__Group__0__Impl : ( ( rule__Label__EnAssignment_0 ) ) ;
    public final void rule__Label__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1826:1: ( ( ( rule__Label__EnAssignment_0 ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1827:1: ( ( rule__Label__EnAssignment_0 ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1827:1: ( ( rule__Label__EnAssignment_0 ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1828:1: ( rule__Label__EnAssignment_0 )
            {
             before(grammarAccess.getLabelAccess().getEnAssignment_0()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1829:1: ( rule__Label__EnAssignment_0 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1829:2: rule__Label__EnAssignment_0
            {
            pushFollow(FOLLOW_rule__Label__EnAssignment_0_in_rule__Label__Group__0__Impl3835);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1839:1: rule__Label__Group__1 : rule__Label__Group__1__Impl ;
    public final void rule__Label__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1843:1: ( rule__Label__Group__1__Impl )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1844:2: rule__Label__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Label__Group__1__Impl_in_rule__Label__Group__13865);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1850:1: rule__Label__Group__1__Impl : ( ( rule__Label__Group_1__0 )? ) ;
    public final void rule__Label__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1854:1: ( ( ( rule__Label__Group_1__0 )? ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1855:1: ( ( rule__Label__Group_1__0 )? )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1855:1: ( ( rule__Label__Group_1__0 )? )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1856:1: ( rule__Label__Group_1__0 )?
            {
             before(grammarAccess.getLabelAccess().getGroup_1()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1857:1: ( rule__Label__Group_1__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==30) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1857:2: rule__Label__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Label__Group_1__0_in_rule__Label__Group__1__Impl3892);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1871:1: rule__Label__Group_1__0 : rule__Label__Group_1__0__Impl rule__Label__Group_1__1 ;
    public final void rule__Label__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1875:1: ( rule__Label__Group_1__0__Impl rule__Label__Group_1__1 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1876:2: rule__Label__Group_1__0__Impl rule__Label__Group_1__1
            {
            pushFollow(FOLLOW_rule__Label__Group_1__0__Impl_in_rule__Label__Group_1__03927);
            rule__Label__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Label__Group_1__1_in_rule__Label__Group_1__03930);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1883:1: rule__Label__Group_1__0__Impl : ( '[nl:' ) ;
    public final void rule__Label__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1887:1: ( ( '[nl:' ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1888:1: ( '[nl:' )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1888:1: ( '[nl:' )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1889:1: '[nl:'
            {
             before(grammarAccess.getLabelAccess().getNlKeyword_1_0()); 
            match(input,30,FOLLOW_30_in_rule__Label__Group_1__0__Impl3958); 
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1902:1: rule__Label__Group_1__1 : rule__Label__Group_1__1__Impl rule__Label__Group_1__2 ;
    public final void rule__Label__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1906:1: ( rule__Label__Group_1__1__Impl rule__Label__Group_1__2 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1907:2: rule__Label__Group_1__1__Impl rule__Label__Group_1__2
            {
            pushFollow(FOLLOW_rule__Label__Group_1__1__Impl_in_rule__Label__Group_1__13989);
            rule__Label__Group_1__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Label__Group_1__2_in_rule__Label__Group_1__13992);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1914:1: rule__Label__Group_1__1__Impl : ( ( rule__Label__NlAssignment_1_1 ) ) ;
    public final void rule__Label__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1918:1: ( ( ( rule__Label__NlAssignment_1_1 ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1919:1: ( ( rule__Label__NlAssignment_1_1 ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1919:1: ( ( rule__Label__NlAssignment_1_1 ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1920:1: ( rule__Label__NlAssignment_1_1 )
            {
             before(grammarAccess.getLabelAccess().getNlAssignment_1_1()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1921:1: ( rule__Label__NlAssignment_1_1 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1921:2: rule__Label__NlAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Label__NlAssignment_1_1_in_rule__Label__Group_1__1__Impl4019);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1931:1: rule__Label__Group_1__2 : rule__Label__Group_1__2__Impl ;
    public final void rule__Label__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1935:1: ( rule__Label__Group_1__2__Impl )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1936:2: rule__Label__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Label__Group_1__2__Impl_in_rule__Label__Group_1__24049);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1942:1: rule__Label__Group_1__2__Impl : ( ']' ) ;
    public final void rule__Label__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1946:1: ( ( ']' ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1947:1: ( ']' )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1947:1: ( ']' )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1948:1: ']'
            {
             before(grammarAccess.getLabelAccess().getRightSquareBracketKeyword_1_2()); 
            match(input,31,FOLLOW_31_in_rule__Label__Group_1__2__Impl4077); 
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1967:1: rule__PathTail__Group__0 : rule__PathTail__Group__0__Impl rule__PathTail__Group__1 ;
    public final void rule__PathTail__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1971:1: ( rule__PathTail__Group__0__Impl rule__PathTail__Group__1 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1972:2: rule__PathTail__Group__0__Impl rule__PathTail__Group__1
            {
            pushFollow(FOLLOW_rule__PathTail__Group__0__Impl_in_rule__PathTail__Group__04114);
            rule__PathTail__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__PathTail__Group__1_in_rule__PathTail__Group__04117);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1979:1: rule__PathTail__Group__0__Impl : ( '/' ) ;
    public final void rule__PathTail__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1983:1: ( ( '/' ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1984:1: ( '/' )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1984:1: ( '/' )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1985:1: '/'
            {
             before(grammarAccess.getPathTailAccess().getSolidusKeyword_0()); 
            match(input,32,FOLLOW_32_in_rule__PathTail__Group__0__Impl4145); 
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1998:1: rule__PathTail__Group__1 : rule__PathTail__Group__1__Impl rule__PathTail__Group__2 ;
    public final void rule__PathTail__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2002:1: ( rule__PathTail__Group__1__Impl rule__PathTail__Group__2 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2003:2: rule__PathTail__Group__1__Impl rule__PathTail__Group__2
            {
            pushFollow(FOLLOW_rule__PathTail__Group__1__Impl_in_rule__PathTail__Group__14176);
            rule__PathTail__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__PathTail__Group__2_in_rule__PathTail__Group__14179);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2010:1: rule__PathTail__Group__1__Impl : ( ( rule__PathTail__FieldAssignment_1 ) ) ;
    public final void rule__PathTail__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2014:1: ( ( ( rule__PathTail__FieldAssignment_1 ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2015:1: ( ( rule__PathTail__FieldAssignment_1 ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2015:1: ( ( rule__PathTail__FieldAssignment_1 ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2016:1: ( rule__PathTail__FieldAssignment_1 )
            {
             before(grammarAccess.getPathTailAccess().getFieldAssignment_1()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2017:1: ( rule__PathTail__FieldAssignment_1 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2017:2: rule__PathTail__FieldAssignment_1
            {
            pushFollow(FOLLOW_rule__PathTail__FieldAssignment_1_in_rule__PathTail__Group__1__Impl4206);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2027:1: rule__PathTail__Group__2 : rule__PathTail__Group__2__Impl rule__PathTail__Group__3 ;
    public final void rule__PathTail__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2031:1: ( rule__PathTail__Group__2__Impl rule__PathTail__Group__3 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2032:2: rule__PathTail__Group__2__Impl rule__PathTail__Group__3
            {
            pushFollow(FOLLOW_rule__PathTail__Group__2__Impl_in_rule__PathTail__Group__24236);
            rule__PathTail__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__PathTail__Group__3_in_rule__PathTail__Group__24239);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2039:1: rule__PathTail__Group__2__Impl : ( ( rule__PathTail__Group_2__0 )? ) ;
    public final void rule__PathTail__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2043:1: ( ( ( rule__PathTail__Group_2__0 )? ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2044:1: ( ( rule__PathTail__Group_2__0 )? )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2044:1: ( ( rule__PathTail__Group_2__0 )? )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2045:1: ( rule__PathTail__Group_2__0 )?
            {
             before(grammarAccess.getPathTailAccess().getGroup_2()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2046:1: ( rule__PathTail__Group_2__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==33) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2046:2: rule__PathTail__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__PathTail__Group_2__0_in_rule__PathTail__Group__2__Impl4266);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2056:1: rule__PathTail__Group__3 : rule__PathTail__Group__3__Impl ;
    public final void rule__PathTail__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2060:1: ( rule__PathTail__Group__3__Impl )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2061:2: rule__PathTail__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__PathTail__Group__3__Impl_in_rule__PathTail__Group__34297);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2067:1: rule__PathTail__Group__3__Impl : ( ( rule__PathTail__TailAssignment_3 )? ) ;
    public final void rule__PathTail__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2071:1: ( ( ( rule__PathTail__TailAssignment_3 )? ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2072:1: ( ( rule__PathTail__TailAssignment_3 )? )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2072:1: ( ( rule__PathTail__TailAssignment_3 )? )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2073:1: ( rule__PathTail__TailAssignment_3 )?
            {
             before(grammarAccess.getPathTailAccess().getTailAssignment_3()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2074:1: ( rule__PathTail__TailAssignment_3 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==32) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2074:2: rule__PathTail__TailAssignment_3
                    {
                    pushFollow(FOLLOW_rule__PathTail__TailAssignment_3_in_rule__PathTail__Group__3__Impl4324);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2092:1: rule__PathTail__Group_2__0 : rule__PathTail__Group_2__0__Impl rule__PathTail__Group_2__1 ;
    public final void rule__PathTail__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2096:1: ( rule__PathTail__Group_2__0__Impl rule__PathTail__Group_2__1 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2097:2: rule__PathTail__Group_2__0__Impl rule__PathTail__Group_2__1
            {
            pushFollow(FOLLOW_rule__PathTail__Group_2__0__Impl_in_rule__PathTail__Group_2__04363);
            rule__PathTail__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__PathTail__Group_2__1_in_rule__PathTail__Group_2__04366);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2104:1: rule__PathTail__Group_2__0__Impl : ( '(' ) ;
    public final void rule__PathTail__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2108:1: ( ( '(' ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2109:1: ( '(' )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2109:1: ( '(' )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2110:1: '('
            {
             before(grammarAccess.getPathTailAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,33,FOLLOW_33_in_rule__PathTail__Group_2__0__Impl4394); 
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2123:1: rule__PathTail__Group_2__1 : rule__PathTail__Group_2__1__Impl rule__PathTail__Group_2__2 ;
    public final void rule__PathTail__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2127:1: ( rule__PathTail__Group_2__1__Impl rule__PathTail__Group_2__2 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2128:2: rule__PathTail__Group_2__1__Impl rule__PathTail__Group_2__2
            {
            pushFollow(FOLLOW_rule__PathTail__Group_2__1__Impl_in_rule__PathTail__Group_2__14425);
            rule__PathTail__Group_2__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__PathTail__Group_2__2_in_rule__PathTail__Group_2__14428);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2135:1: rule__PathTail__Group_2__1__Impl : ( ( rule__PathTail__AsEntityAssignment_2_1 ) ) ;
    public final void rule__PathTail__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2139:1: ( ( ( rule__PathTail__AsEntityAssignment_2_1 ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2140:1: ( ( rule__PathTail__AsEntityAssignment_2_1 ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2140:1: ( ( rule__PathTail__AsEntityAssignment_2_1 ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2141:1: ( rule__PathTail__AsEntityAssignment_2_1 )
            {
             before(grammarAccess.getPathTailAccess().getAsEntityAssignment_2_1()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2142:1: ( rule__PathTail__AsEntityAssignment_2_1 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2142:2: rule__PathTail__AsEntityAssignment_2_1
            {
            pushFollow(FOLLOW_rule__PathTail__AsEntityAssignment_2_1_in_rule__PathTail__Group_2__1__Impl4455);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2152:1: rule__PathTail__Group_2__2 : rule__PathTail__Group_2__2__Impl ;
    public final void rule__PathTail__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2156:1: ( rule__PathTail__Group_2__2__Impl )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2157:2: rule__PathTail__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__PathTail__Group_2__2__Impl_in_rule__PathTail__Group_2__24485);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2163:1: rule__PathTail__Group_2__2__Impl : ( ')' ) ;
    public final void rule__PathTail__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2167:1: ( ( ')' ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2168:1: ( ')' )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2168:1: ( ')' )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2169:1: ')'
            {
             before(grammarAccess.getPathTailAccess().getRightParenthesisKeyword_2_2()); 
            match(input,34,FOLLOW_34_in_rule__PathTail__Group_2__2__Impl4513); 
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2188:1: rule__ExternalVariable__Group__0 : rule__ExternalVariable__Group__0__Impl rule__ExternalVariable__Group__1 ;
    public final void rule__ExternalVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2192:1: ( rule__ExternalVariable__Group__0__Impl rule__ExternalVariable__Group__1 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2193:2: rule__ExternalVariable__Group__0__Impl rule__ExternalVariable__Group__1
            {
            pushFollow(FOLLOW_rule__ExternalVariable__Group__0__Impl_in_rule__ExternalVariable__Group__04550);
            rule__ExternalVariable__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ExternalVariable__Group__1_in_rule__ExternalVariable__Group__04553);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2200:1: rule__ExternalVariable__Group__0__Impl : ( 'external-var' ) ;
    public final void rule__ExternalVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2204:1: ( ( 'external-var' ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2205:1: ( 'external-var' )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2205:1: ( 'external-var' )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2206:1: 'external-var'
            {
             before(grammarAccess.getExternalVariableAccess().getExternalVarKeyword_0()); 
            match(input,35,FOLLOW_35_in_rule__ExternalVariable__Group__0__Impl4581); 
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2219:1: rule__ExternalVariable__Group__1 : rule__ExternalVariable__Group__1__Impl rule__ExternalVariable__Group__2 ;
    public final void rule__ExternalVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2223:1: ( rule__ExternalVariable__Group__1__Impl rule__ExternalVariable__Group__2 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2224:2: rule__ExternalVariable__Group__1__Impl rule__ExternalVariable__Group__2
            {
            pushFollow(FOLLOW_rule__ExternalVariable__Group__1__Impl_in_rule__ExternalVariable__Group__14612);
            rule__ExternalVariable__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ExternalVariable__Group__2_in_rule__ExternalVariable__Group__14615);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2231:1: rule__ExternalVariable__Group__1__Impl : ( ( rule__ExternalVariable__PathAssignment_1 ) ) ;
    public final void rule__ExternalVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2235:1: ( ( ( rule__ExternalVariable__PathAssignment_1 ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2236:1: ( ( rule__ExternalVariable__PathAssignment_1 ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2236:1: ( ( rule__ExternalVariable__PathAssignment_1 ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2237:1: ( rule__ExternalVariable__PathAssignment_1 )
            {
             before(grammarAccess.getExternalVariableAccess().getPathAssignment_1()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2238:1: ( rule__ExternalVariable__PathAssignment_1 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2238:2: rule__ExternalVariable__PathAssignment_1
            {
            pushFollow(FOLLOW_rule__ExternalVariable__PathAssignment_1_in_rule__ExternalVariable__Group__1__Impl4642);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2248:1: rule__ExternalVariable__Group__2 : rule__ExternalVariable__Group__2__Impl rule__ExternalVariable__Group__3 ;
    public final void rule__ExternalVariable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2252:1: ( rule__ExternalVariable__Group__2__Impl rule__ExternalVariable__Group__3 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2253:2: rule__ExternalVariable__Group__2__Impl rule__ExternalVariable__Group__3
            {
            pushFollow(FOLLOW_rule__ExternalVariable__Group__2__Impl_in_rule__ExternalVariable__Group__24672);
            rule__ExternalVariable__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ExternalVariable__Group__3_in_rule__ExternalVariable__Group__24675);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2260:1: rule__ExternalVariable__Group__2__Impl : ( 'as' ) ;
    public final void rule__ExternalVariable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2264:1: ( ( 'as' ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2265:1: ( 'as' )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2265:1: ( 'as' )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2266:1: 'as'
            {
             before(grammarAccess.getExternalVariableAccess().getAsKeyword_2()); 
            match(input,36,FOLLOW_36_in_rule__ExternalVariable__Group__2__Impl4703); 
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2279:1: rule__ExternalVariable__Group__3 : rule__ExternalVariable__Group__3__Impl ;
    public final void rule__ExternalVariable__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2283:1: ( rule__ExternalVariable__Group__3__Impl )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2284:2: rule__ExternalVariable__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ExternalVariable__Group__3__Impl_in_rule__ExternalVariable__Group__34734);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2290:1: rule__ExternalVariable__Group__3__Impl : ( ( rule__ExternalVariable__NameAssignment_3 ) ) ;
    public final void rule__ExternalVariable__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2294:1: ( ( ( rule__ExternalVariable__NameAssignment_3 ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2295:1: ( ( rule__ExternalVariable__NameAssignment_3 ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2295:1: ( ( rule__ExternalVariable__NameAssignment_3 ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2296:1: ( rule__ExternalVariable__NameAssignment_3 )
            {
             before(grammarAccess.getExternalVariableAccess().getNameAssignment_3()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2297:1: ( rule__ExternalVariable__NameAssignment_3 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2297:2: rule__ExternalVariable__NameAssignment_3
            {
            pushFollow(FOLLOW_rule__ExternalVariable__NameAssignment_3_in_rule__ExternalVariable__Group__3__Impl4761);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2315:1: rule__EnumList__Group__0 : rule__EnumList__Group__0__Impl rule__EnumList__Group__1 ;
    public final void rule__EnumList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2319:1: ( rule__EnumList__Group__0__Impl rule__EnumList__Group__1 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2320:2: rule__EnumList__Group__0__Impl rule__EnumList__Group__1
            {
            pushFollow(FOLLOW_rule__EnumList__Group__0__Impl_in_rule__EnumList__Group__04799);
            rule__EnumList__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__EnumList__Group__1_in_rule__EnumList__Group__04802);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2327:1: rule__EnumList__Group__0__Impl : ( 'define' ) ;
    public final void rule__EnumList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2331:1: ( ( 'define' ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2332:1: ( 'define' )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2332:1: ( 'define' )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2333:1: 'define'
            {
             before(grammarAccess.getEnumListAccess().getDefineKeyword_0()); 
            match(input,37,FOLLOW_37_in_rule__EnumList__Group__0__Impl4830); 
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2346:1: rule__EnumList__Group__1 : rule__EnumList__Group__1__Impl rule__EnumList__Group__2 ;
    public final void rule__EnumList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2350:1: ( rule__EnumList__Group__1__Impl rule__EnumList__Group__2 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2351:2: rule__EnumList__Group__1__Impl rule__EnumList__Group__2
            {
            pushFollow(FOLLOW_rule__EnumList__Group__1__Impl_in_rule__EnumList__Group__14861);
            rule__EnumList__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__EnumList__Group__2_in_rule__EnumList__Group__14864);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2358:1: rule__EnumList__Group__1__Impl : ( ( rule__EnumList__NameAssignment_1 ) ) ;
    public final void rule__EnumList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2362:1: ( ( ( rule__EnumList__NameAssignment_1 ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2363:1: ( ( rule__EnumList__NameAssignment_1 ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2363:1: ( ( rule__EnumList__NameAssignment_1 ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2364:1: ( rule__EnumList__NameAssignment_1 )
            {
             before(grammarAccess.getEnumListAccess().getNameAssignment_1()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2365:1: ( rule__EnumList__NameAssignment_1 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2365:2: rule__EnumList__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__EnumList__NameAssignment_1_in_rule__EnumList__Group__1__Impl4891);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2375:1: rule__EnumList__Group__2 : rule__EnumList__Group__2__Impl rule__EnumList__Group__3 ;
    public final void rule__EnumList__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2379:1: ( rule__EnumList__Group__2__Impl rule__EnumList__Group__3 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2380:2: rule__EnumList__Group__2__Impl rule__EnumList__Group__3
            {
            pushFollow(FOLLOW_rule__EnumList__Group__2__Impl_in_rule__EnumList__Group__24921);
            rule__EnumList__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__EnumList__Group__3_in_rule__EnumList__Group__24924);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2387:1: rule__EnumList__Group__2__Impl : ( 'as' ) ;
    public final void rule__EnumList__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2391:1: ( ( 'as' ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2392:1: ( 'as' )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2392:1: ( 'as' )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2393:1: 'as'
            {
             before(grammarAccess.getEnumListAccess().getAsKeyword_2()); 
            match(input,36,FOLLOW_36_in_rule__EnumList__Group__2__Impl4952); 
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2406:1: rule__EnumList__Group__3 : rule__EnumList__Group__3__Impl rule__EnumList__Group__4 ;
    public final void rule__EnumList__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2410:1: ( rule__EnumList__Group__3__Impl rule__EnumList__Group__4 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2411:2: rule__EnumList__Group__3__Impl rule__EnumList__Group__4
            {
            pushFollow(FOLLOW_rule__EnumList__Group__3__Impl_in_rule__EnumList__Group__34983);
            rule__EnumList__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__EnumList__Group__4_in_rule__EnumList__Group__34986);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2418:1: rule__EnumList__Group__3__Impl : ( '(' ) ;
    public final void rule__EnumList__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2422:1: ( ( '(' ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2423:1: ( '(' )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2423:1: ( '(' )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2424:1: '('
            {
             before(grammarAccess.getEnumListAccess().getLeftParenthesisKeyword_3()); 
            match(input,33,FOLLOW_33_in_rule__EnumList__Group__3__Impl5014); 
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2437:1: rule__EnumList__Group__4 : rule__EnumList__Group__4__Impl rule__EnumList__Group__5 ;
    public final void rule__EnumList__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2441:1: ( rule__EnumList__Group__4__Impl rule__EnumList__Group__5 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2442:2: rule__EnumList__Group__4__Impl rule__EnumList__Group__5
            {
            pushFollow(FOLLOW_rule__EnumList__Group__4__Impl_in_rule__EnumList__Group__45045);
            rule__EnumList__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__EnumList__Group__5_in_rule__EnumList__Group__45048);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2449:1: rule__EnumList__Group__4__Impl : ( ( ( rule__EnumList__LiteralsAssignment_4 ) ) ( ( rule__EnumList__LiteralsAssignment_4 )* ) ) ;
    public final void rule__EnumList__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2453:1: ( ( ( ( rule__EnumList__LiteralsAssignment_4 ) ) ( ( rule__EnumList__LiteralsAssignment_4 )* ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2454:1: ( ( ( rule__EnumList__LiteralsAssignment_4 ) ) ( ( rule__EnumList__LiteralsAssignment_4 )* ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2454:1: ( ( ( rule__EnumList__LiteralsAssignment_4 ) ) ( ( rule__EnumList__LiteralsAssignment_4 )* ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2455:1: ( ( rule__EnumList__LiteralsAssignment_4 ) ) ( ( rule__EnumList__LiteralsAssignment_4 )* )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2455:1: ( ( rule__EnumList__LiteralsAssignment_4 ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2456:1: ( rule__EnumList__LiteralsAssignment_4 )
            {
             before(grammarAccess.getEnumListAccess().getLiteralsAssignment_4()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2457:1: ( rule__EnumList__LiteralsAssignment_4 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2457:2: rule__EnumList__LiteralsAssignment_4
            {
            pushFollow(FOLLOW_rule__EnumList__LiteralsAssignment_4_in_rule__EnumList__Group__4__Impl5077);
            rule__EnumList__LiteralsAssignment_4();
            _fsp--;


            }

             after(grammarAccess.getEnumListAccess().getLiteralsAssignment_4()); 

            }

            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2460:1: ( ( rule__EnumList__LiteralsAssignment_4 )* )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2461:1: ( rule__EnumList__LiteralsAssignment_4 )*
            {
             before(grammarAccess.getEnumListAccess().getLiteralsAssignment_4()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2462:1: ( rule__EnumList__LiteralsAssignment_4 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_ID) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2462:2: rule__EnumList__LiteralsAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__EnumList__LiteralsAssignment_4_in_rule__EnumList__Group__4__Impl5089);
            	    rule__EnumList__LiteralsAssignment_4();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2473:1: rule__EnumList__Group__5 : rule__EnumList__Group__5__Impl rule__EnumList__Group__6 ;
    public final void rule__EnumList__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2477:1: ( rule__EnumList__Group__5__Impl rule__EnumList__Group__6 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2478:2: rule__EnumList__Group__5__Impl rule__EnumList__Group__6
            {
            pushFollow(FOLLOW_rule__EnumList__Group__5__Impl_in_rule__EnumList__Group__55122);
            rule__EnumList__Group__5__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__EnumList__Group__6_in_rule__EnumList__Group__55125);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2485:1: rule__EnumList__Group__5__Impl : ( ')' ) ;
    public final void rule__EnumList__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2489:1: ( ( ')' ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2490:1: ( ')' )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2490:1: ( ')' )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2491:1: ')'
            {
             before(grammarAccess.getEnumListAccess().getRightParenthesisKeyword_5()); 
            match(input,34,FOLLOW_34_in_rule__EnumList__Group__5__Impl5153); 
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2504:1: rule__EnumList__Group__6 : rule__EnumList__Group__6__Impl rule__EnumList__Group__7 ;
    public final void rule__EnumList__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2508:1: ( rule__EnumList__Group__6__Impl rule__EnumList__Group__7 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2509:2: rule__EnumList__Group__6__Impl rule__EnumList__Group__7
            {
            pushFollow(FOLLOW_rule__EnumList__Group__6__Impl_in_rule__EnumList__Group__65184);
            rule__EnumList__Group__6__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__EnumList__Group__7_in_rule__EnumList__Group__65187);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2516:1: rule__EnumList__Group__6__Impl : ( 'of' ) ;
    public final void rule__EnumList__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2520:1: ( ( 'of' ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2521:1: ( 'of' )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2521:1: ( 'of' )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2522:1: 'of'
            {
             before(grammarAccess.getEnumListAccess().getOfKeyword_6()); 
            match(input,38,FOLLOW_38_in_rule__EnumList__Group__6__Impl5215); 
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2535:1: rule__EnumList__Group__7 : rule__EnumList__Group__7__Impl ;
    public final void rule__EnumList__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2539:1: ( rule__EnumList__Group__7__Impl )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2540:2: rule__EnumList__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__EnumList__Group__7__Impl_in_rule__EnumList__Group__75246);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2546:1: rule__EnumList__Group__7__Impl : ( ( rule__EnumList__EnumAssignment_7 ) ) ;
    public final void rule__EnumList__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2550:1: ( ( ( rule__EnumList__EnumAssignment_7 ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2551:1: ( ( rule__EnumList__EnumAssignment_7 ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2551:1: ( ( rule__EnumList__EnumAssignment_7 ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2552:1: ( rule__EnumList__EnumAssignment_7 )
            {
             before(grammarAccess.getEnumListAccess().getEnumAssignment_7()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2553:1: ( rule__EnumList__EnumAssignment_7 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2553:2: rule__EnumList__EnumAssignment_7
            {
            pushFollow(FOLLOW_rule__EnumList__EnumAssignment_7_in_rule__EnumList__Group__7__Impl5273);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2579:1: rule__DataStore__Group__0 : rule__DataStore__Group__0__Impl rule__DataStore__Group__1 ;
    public final void rule__DataStore__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2583:1: ( rule__DataStore__Group__0__Impl rule__DataStore__Group__1 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2584:2: rule__DataStore__Group__0__Impl rule__DataStore__Group__1
            {
            pushFollow(FOLLOW_rule__DataStore__Group__0__Impl_in_rule__DataStore__Group__05319);
            rule__DataStore__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DataStore__Group__1_in_rule__DataStore__Group__05322);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2591:1: rule__DataStore__Group__0__Impl : ( 'data-store' ) ;
    public final void rule__DataStore__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2595:1: ( ( 'data-store' ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2596:1: ( 'data-store' )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2596:1: ( 'data-store' )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2597:1: 'data-store'
            {
             before(grammarAccess.getDataStoreAccess().getDataStoreKeyword_0()); 
            match(input,39,FOLLOW_39_in_rule__DataStore__Group__0__Impl5350); 
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2610:1: rule__DataStore__Group__1 : rule__DataStore__Group__1__Impl rule__DataStore__Group__2 ;
    public final void rule__DataStore__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2614:1: ( rule__DataStore__Group__1__Impl rule__DataStore__Group__2 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2615:2: rule__DataStore__Group__1__Impl rule__DataStore__Group__2
            {
            pushFollow(FOLLOW_rule__DataStore__Group__1__Impl_in_rule__DataStore__Group__15381);
            rule__DataStore__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DataStore__Group__2_in_rule__DataStore__Group__15384);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2622:1: rule__DataStore__Group__1__Impl : ( ( rule__DataStore__NameAssignment_1 ) ) ;
    public final void rule__DataStore__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2626:1: ( ( ( rule__DataStore__NameAssignment_1 ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2627:1: ( ( rule__DataStore__NameAssignment_1 ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2627:1: ( ( rule__DataStore__NameAssignment_1 ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2628:1: ( rule__DataStore__NameAssignment_1 )
            {
             before(grammarAccess.getDataStoreAccess().getNameAssignment_1()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2629:1: ( rule__DataStore__NameAssignment_1 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2629:2: rule__DataStore__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__DataStore__NameAssignment_1_in_rule__DataStore__Group__1__Impl5411);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2639:1: rule__DataStore__Group__2 : rule__DataStore__Group__2__Impl rule__DataStore__Group__3 ;
    public final void rule__DataStore__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2643:1: ( rule__DataStore__Group__2__Impl rule__DataStore__Group__3 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2644:2: rule__DataStore__Group__2__Impl rule__DataStore__Group__3
            {
            pushFollow(FOLLOW_rule__DataStore__Group__2__Impl_in_rule__DataStore__Group__25441);
            rule__DataStore__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DataStore__Group__3_in_rule__DataStore__Group__25444);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2651:1: rule__DataStore__Group__2__Impl : ( 'of-type' ) ;
    public final void rule__DataStore__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2655:1: ( ( 'of-type' ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2656:1: ( 'of-type' )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2656:1: ( 'of-type' )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2657:1: 'of-type'
            {
             before(grammarAccess.getDataStoreAccess().getOfTypeKeyword_2()); 
            match(input,40,FOLLOW_40_in_rule__DataStore__Group__2__Impl5472); 
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2670:1: rule__DataStore__Group__3 : rule__DataStore__Group__3__Impl rule__DataStore__Group__4 ;
    public final void rule__DataStore__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2674:1: ( rule__DataStore__Group__3__Impl rule__DataStore__Group__4 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2675:2: rule__DataStore__Group__3__Impl rule__DataStore__Group__4
            {
            pushFollow(FOLLOW_rule__DataStore__Group__3__Impl_in_rule__DataStore__Group__35503);
            rule__DataStore__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DataStore__Group__4_in_rule__DataStore__Group__35506);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2682:1: rule__DataStore__Group__3__Impl : ( ( rule__DataStore__ClassAssignment_3 ) ) ;
    public final void rule__DataStore__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2686:1: ( ( ( rule__DataStore__ClassAssignment_3 ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2687:1: ( ( rule__DataStore__ClassAssignment_3 ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2687:1: ( ( rule__DataStore__ClassAssignment_3 ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2688:1: ( rule__DataStore__ClassAssignment_3 )
            {
             before(grammarAccess.getDataStoreAccess().getClassAssignment_3()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2689:1: ( rule__DataStore__ClassAssignment_3 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2689:2: rule__DataStore__ClassAssignment_3
            {
            pushFollow(FOLLOW_rule__DataStore__ClassAssignment_3_in_rule__DataStore__Group__3__Impl5533);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2699:1: rule__DataStore__Group__4 : rule__DataStore__Group__4__Impl ;
    public final void rule__DataStore__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2703:1: ( rule__DataStore__Group__4__Impl )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2704:2: rule__DataStore__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__DataStore__Group__4__Impl_in_rule__DataStore__Group__45563);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2710:1: rule__DataStore__Group__4__Impl : ( ( rule__DataStore__MultiAssignment_4 )? ) ;
    public final void rule__DataStore__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2714:1: ( ( ( rule__DataStore__MultiAssignment_4 )? ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2715:1: ( ( rule__DataStore__MultiAssignment_4 )? )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2715:1: ( ( rule__DataStore__MultiAssignment_4 )? )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2716:1: ( rule__DataStore__MultiAssignment_4 )?
            {
             before(grammarAccess.getDataStoreAccess().getMultiAssignment_4()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2717:1: ( rule__DataStore__MultiAssignment_4 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==54) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2717:2: rule__DataStore__MultiAssignment_4
                    {
                    pushFollow(FOLLOW_rule__DataStore__MultiAssignment_4_in_rule__DataStore__Group__4__Impl5590);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2737:1: rule__Field__Group__0 : rule__Field__Group__0__Impl rule__Field__Group__1 ;
    public final void rule__Field__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2741:1: ( rule__Field__Group__0__Impl rule__Field__Group__1 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2742:2: rule__Field__Group__0__Impl rule__Field__Group__1
            {
            pushFollow(FOLLOW_rule__Field__Group__0__Impl_in_rule__Field__Group__05631);
            rule__Field__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Field__Group__1_in_rule__Field__Group__05634);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2749:1: rule__Field__Group__0__Impl : ( ( rule__Field__NameAssignment_0 ) ) ;
    public final void rule__Field__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2753:1: ( ( ( rule__Field__NameAssignment_0 ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2754:1: ( ( rule__Field__NameAssignment_0 ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2754:1: ( ( rule__Field__NameAssignment_0 ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2755:1: ( rule__Field__NameAssignment_0 )
            {
             before(grammarAccess.getFieldAccess().getNameAssignment_0()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2756:1: ( rule__Field__NameAssignment_0 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2756:2: rule__Field__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Field__NameAssignment_0_in_rule__Field__Group__0__Impl5661);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2766:1: rule__Field__Group__1 : rule__Field__Group__1__Impl rule__Field__Group__2 ;
    public final void rule__Field__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2770:1: ( rule__Field__Group__1__Impl rule__Field__Group__2 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2771:2: rule__Field__Group__1__Impl rule__Field__Group__2
            {
            pushFollow(FOLLOW_rule__Field__Group__1__Impl_in_rule__Field__Group__15691);
            rule__Field__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Field__Group__2_in_rule__Field__Group__15694);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2778:1: rule__Field__Group__1__Impl : ( ( rule__Field__LabelAssignment_1 ) ) ;
    public final void rule__Field__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2782:1: ( ( ( rule__Field__LabelAssignment_1 ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2783:1: ( ( rule__Field__LabelAssignment_1 ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2783:1: ( ( rule__Field__LabelAssignment_1 ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2784:1: ( rule__Field__LabelAssignment_1 )
            {
             before(grammarAccess.getFieldAccess().getLabelAssignment_1()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2785:1: ( rule__Field__LabelAssignment_1 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2785:2: rule__Field__LabelAssignment_1
            {
            pushFollow(FOLLOW_rule__Field__LabelAssignment_1_in_rule__Field__Group__1__Impl5721);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2795:1: rule__Field__Group__2 : rule__Field__Group__2__Impl rule__Field__Group__3 ;
    public final void rule__Field__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2799:1: ( rule__Field__Group__2__Impl rule__Field__Group__3 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2800:2: rule__Field__Group__2__Impl rule__Field__Group__3
            {
            pushFollow(FOLLOW_rule__Field__Group__2__Impl_in_rule__Field__Group__25751);
            rule__Field__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Field__Group__3_in_rule__Field__Group__25754);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2807:1: rule__Field__Group__2__Impl : ( ( rule__Field__PathAssignment_2 ) ) ;
    public final void rule__Field__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2811:1: ( ( ( rule__Field__PathAssignment_2 ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2812:1: ( ( rule__Field__PathAssignment_2 ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2812:1: ( ( rule__Field__PathAssignment_2 ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2813:1: ( rule__Field__PathAssignment_2 )
            {
             before(grammarAccess.getFieldAccess().getPathAssignment_2()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2814:1: ( rule__Field__PathAssignment_2 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2814:2: rule__Field__PathAssignment_2
            {
            pushFollow(FOLLOW_rule__Field__PathAssignment_2_in_rule__Field__Group__2__Impl5781);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2824:1: rule__Field__Group__3 : rule__Field__Group__3__Impl ;
    public final void rule__Field__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2828:1: ( rule__Field__Group__3__Impl )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2829:2: rule__Field__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Field__Group__3__Impl_in_rule__Field__Group__35811);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2835:1: rule__Field__Group__3__Impl : ( ( rule__Field__AttributesAssignment_3 )* ) ;
    public final void rule__Field__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2839:1: ( ( ( rule__Field__AttributesAssignment_3 )* ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2840:1: ( ( rule__Field__AttributesAssignment_3 )* )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2840:1: ( ( rule__Field__AttributesAssignment_3 )* )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2841:1: ( rule__Field__AttributesAssignment_3 )*
            {
             before(grammarAccess.getFieldAccess().getAttributesAssignment_3()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2842:1: ( rule__Field__AttributesAssignment_3 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=17 && LA24_0<=21)||(LA24_0>=47 && LA24_0<=48)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2842:2: rule__Field__AttributesAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Field__AttributesAssignment_3_in_rule__Field__Group__3__Impl5838);
            	    rule__Field__AttributesAssignment_3();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2860:1: rule__FieldGroup__Group__0 : rule__FieldGroup__Group__0__Impl rule__FieldGroup__Group__1 ;
    public final void rule__FieldGroup__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2864:1: ( rule__FieldGroup__Group__0__Impl rule__FieldGroup__Group__1 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2865:2: rule__FieldGroup__Group__0__Impl rule__FieldGroup__Group__1
            {
            pushFollow(FOLLOW_rule__FieldGroup__Group__0__Impl_in_rule__FieldGroup__Group__05877);
            rule__FieldGroup__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__FieldGroup__Group__1_in_rule__FieldGroup__Group__05880);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2872:1: rule__FieldGroup__Group__0__Impl : ( 'group' ) ;
    public final void rule__FieldGroup__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2876:1: ( ( 'group' ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2877:1: ( 'group' )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2877:1: ( 'group' )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2878:1: 'group'
            {
             before(grammarAccess.getFieldGroupAccess().getGroupKeyword_0()); 
            match(input,41,FOLLOW_41_in_rule__FieldGroup__Group__0__Impl5908); 
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2891:1: rule__FieldGroup__Group__1 : rule__FieldGroup__Group__1__Impl rule__FieldGroup__Group__2 ;
    public final void rule__FieldGroup__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2895:1: ( rule__FieldGroup__Group__1__Impl rule__FieldGroup__Group__2 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2896:2: rule__FieldGroup__Group__1__Impl rule__FieldGroup__Group__2
            {
            pushFollow(FOLLOW_rule__FieldGroup__Group__1__Impl_in_rule__FieldGroup__Group__15939);
            rule__FieldGroup__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__FieldGroup__Group__2_in_rule__FieldGroup__Group__15942);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2903:1: rule__FieldGroup__Group__1__Impl : ( ( rule__FieldGroup__LabelAssignment_1 )? ) ;
    public final void rule__FieldGroup__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2907:1: ( ( ( rule__FieldGroup__LabelAssignment_1 )? ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2908:1: ( ( rule__FieldGroup__LabelAssignment_1 )? )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2908:1: ( ( rule__FieldGroup__LabelAssignment_1 )? )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2909:1: ( rule__FieldGroup__LabelAssignment_1 )?
            {
             before(grammarAccess.getFieldGroupAccess().getLabelAssignment_1()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2910:1: ( rule__FieldGroup__LabelAssignment_1 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_STRING) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2910:2: rule__FieldGroup__LabelAssignment_1
                    {
                    pushFollow(FOLLOW_rule__FieldGroup__LabelAssignment_1_in_rule__FieldGroup__Group__1__Impl5969);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2920:1: rule__FieldGroup__Group__2 : rule__FieldGroup__Group__2__Impl rule__FieldGroup__Group__3 ;
    public final void rule__FieldGroup__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2924:1: ( rule__FieldGroup__Group__2__Impl rule__FieldGroup__Group__3 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2925:2: rule__FieldGroup__Group__2__Impl rule__FieldGroup__Group__3
            {
            pushFollow(FOLLOW_rule__FieldGroup__Group__2__Impl_in_rule__FieldGroup__Group__26000);
            rule__FieldGroup__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__FieldGroup__Group__3_in_rule__FieldGroup__Group__26003);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2932:1: rule__FieldGroup__Group__2__Impl : ( ( rule__FieldGroup__Group_2__0 )? ) ;
    public final void rule__FieldGroup__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2936:1: ( ( ( rule__FieldGroup__Group_2__0 )? ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2937:1: ( ( rule__FieldGroup__Group_2__0 )? )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2937:1: ( ( rule__FieldGroup__Group_2__0 )? )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2938:1: ( rule__FieldGroup__Group_2__0 )?
            {
             before(grammarAccess.getFieldGroupAccess().getGroup_2()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2939:1: ( rule__FieldGroup__Group_2__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==44) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2939:2: rule__FieldGroup__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__FieldGroup__Group_2__0_in_rule__FieldGroup__Group__2__Impl6030);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2949:1: rule__FieldGroup__Group__3 : rule__FieldGroup__Group__3__Impl rule__FieldGroup__Group__4 ;
    public final void rule__FieldGroup__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2953:1: ( rule__FieldGroup__Group__3__Impl rule__FieldGroup__Group__4 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2954:2: rule__FieldGroup__Group__3__Impl rule__FieldGroup__Group__4
            {
            pushFollow(FOLLOW_rule__FieldGroup__Group__3__Impl_in_rule__FieldGroup__Group__36061);
            rule__FieldGroup__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__FieldGroup__Group__4_in_rule__FieldGroup__Group__36064);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2961:1: rule__FieldGroup__Group__3__Impl : ( '{' ) ;
    public final void rule__FieldGroup__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2965:1: ( ( '{' ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2966:1: ( '{' )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2966:1: ( '{' )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2967:1: '{'
            {
             before(grammarAccess.getFieldGroupAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,42,FOLLOW_42_in_rule__FieldGroup__Group__3__Impl6092); 
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2980:1: rule__FieldGroup__Group__4 : rule__FieldGroup__Group__4__Impl rule__FieldGroup__Group__5 ;
    public final void rule__FieldGroup__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2984:1: ( rule__FieldGroup__Group__4__Impl rule__FieldGroup__Group__5 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2985:2: rule__FieldGroup__Group__4__Impl rule__FieldGroup__Group__5
            {
            pushFollow(FOLLOW_rule__FieldGroup__Group__4__Impl_in_rule__FieldGroup__Group__46123);
            rule__FieldGroup__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__FieldGroup__Group__5_in_rule__FieldGroup__Group__46126);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2992:1: rule__FieldGroup__Group__4__Impl : ( ( ( rule__FieldGroup__ElementsAssignment_4 ) ) ( ( rule__FieldGroup__ElementsAssignment_4 )* ) ) ;
    public final void rule__FieldGroup__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2996:1: ( ( ( ( rule__FieldGroup__ElementsAssignment_4 ) ) ( ( rule__FieldGroup__ElementsAssignment_4 )* ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2997:1: ( ( ( rule__FieldGroup__ElementsAssignment_4 ) ) ( ( rule__FieldGroup__ElementsAssignment_4 )* ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2997:1: ( ( ( rule__FieldGroup__ElementsAssignment_4 ) ) ( ( rule__FieldGroup__ElementsAssignment_4 )* ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2998:1: ( ( rule__FieldGroup__ElementsAssignment_4 ) ) ( ( rule__FieldGroup__ElementsAssignment_4 )* )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2998:1: ( ( rule__FieldGroup__ElementsAssignment_4 ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:2999:1: ( rule__FieldGroup__ElementsAssignment_4 )
            {
             before(grammarAccess.getFieldGroupAccess().getElementsAssignment_4()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3000:1: ( rule__FieldGroup__ElementsAssignment_4 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3000:2: rule__FieldGroup__ElementsAssignment_4
            {
            pushFollow(FOLLOW_rule__FieldGroup__ElementsAssignment_4_in_rule__FieldGroup__Group__4__Impl6155);
            rule__FieldGroup__ElementsAssignment_4();
            _fsp--;


            }

             after(grammarAccess.getFieldGroupAccess().getElementsAssignment_4()); 

            }

            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3003:1: ( ( rule__FieldGroup__ElementsAssignment_4 )* )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3004:1: ( rule__FieldGroup__ElementsAssignment_4 )*
            {
             before(grammarAccess.getFieldGroupAccess().getElementsAssignment_4()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3005:1: ( rule__FieldGroup__ElementsAssignment_4 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==RULE_ID||LA27_0==41) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3005:2: rule__FieldGroup__ElementsAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__FieldGroup__ElementsAssignment_4_in_rule__FieldGroup__Group__4__Impl6167);
            	    rule__FieldGroup__ElementsAssignment_4();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3016:1: rule__FieldGroup__Group__5 : rule__FieldGroup__Group__5__Impl rule__FieldGroup__Group__6 ;
    public final void rule__FieldGroup__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3020:1: ( rule__FieldGroup__Group__5__Impl rule__FieldGroup__Group__6 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3021:2: rule__FieldGroup__Group__5__Impl rule__FieldGroup__Group__6
            {
            pushFollow(FOLLOW_rule__FieldGroup__Group__5__Impl_in_rule__FieldGroup__Group__56200);
            rule__FieldGroup__Group__5__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__FieldGroup__Group__6_in_rule__FieldGroup__Group__56203);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3028:1: rule__FieldGroup__Group__5__Impl : ( '}' ) ;
    public final void rule__FieldGroup__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3032:1: ( ( '}' ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3033:1: ( '}' )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3033:1: ( '}' )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3034:1: '}'
            {
             before(grammarAccess.getFieldGroupAccess().getRightCurlyBracketKeyword_5()); 
            match(input,43,FOLLOW_43_in_rule__FieldGroup__Group__5__Impl6231); 
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3047:1: rule__FieldGroup__Group__6 : rule__FieldGroup__Group__6__Impl ;
    public final void rule__FieldGroup__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3051:1: ( rule__FieldGroup__Group__6__Impl )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3052:2: rule__FieldGroup__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__FieldGroup__Group__6__Impl_in_rule__FieldGroup__Group__66262);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3058:1: rule__FieldGroup__Group__6__Impl : ( ( rule__FieldGroup__AttributesAssignment_6 )* ) ;
    public final void rule__FieldGroup__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3062:1: ( ( ( rule__FieldGroup__AttributesAssignment_6 )* ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3063:1: ( ( rule__FieldGroup__AttributesAssignment_6 )* )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3063:1: ( ( rule__FieldGroup__AttributesAssignment_6 )* )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3064:1: ( rule__FieldGroup__AttributesAssignment_6 )*
            {
             before(grammarAccess.getFieldGroupAccess().getAttributesAssignment_6()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3065:1: ( rule__FieldGroup__AttributesAssignment_6 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>=17 && LA28_0<=21)||(LA28_0>=47 && LA28_0<=48)) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3065:2: rule__FieldGroup__AttributesAssignment_6
            	    {
            	    pushFollow(FOLLOW_rule__FieldGroup__AttributesAssignment_6_in_rule__FieldGroup__Group__6__Impl6289);
            	    rule__FieldGroup__AttributesAssignment_6();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3089:1: rule__FieldGroup__Group_2__0 : rule__FieldGroup__Group_2__0__Impl rule__FieldGroup__Group_2__1 ;
    public final void rule__FieldGroup__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3093:1: ( rule__FieldGroup__Group_2__0__Impl rule__FieldGroup__Group_2__1 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3094:2: rule__FieldGroup__Group_2__0__Impl rule__FieldGroup__Group_2__1
            {
            pushFollow(FOLLOW_rule__FieldGroup__Group_2__0__Impl_in_rule__FieldGroup__Group_2__06334);
            rule__FieldGroup__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__FieldGroup__Group_2__1_in_rule__FieldGroup__Group_2__06337);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3101:1: rule__FieldGroup__Group_2__0__Impl : ( 'with' ) ;
    public final void rule__FieldGroup__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3105:1: ( ( 'with' ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3106:1: ( 'with' )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3106:1: ( 'with' )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3107:1: 'with'
            {
             before(grammarAccess.getFieldGroupAccess().getWithKeyword_2_0()); 
            match(input,44,FOLLOW_44_in_rule__FieldGroup__Group_2__0__Impl6365); 
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3120:1: rule__FieldGroup__Group_2__1 : rule__FieldGroup__Group_2__1__Impl ;
    public final void rule__FieldGroup__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3124:1: ( rule__FieldGroup__Group_2__1__Impl )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3125:2: rule__FieldGroup__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__FieldGroup__Group_2__1__Impl_in_rule__FieldGroup__Group_2__16396);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3131:1: rule__FieldGroup__Group_2__1__Impl : ( ( rule__FieldGroup__WithAssignment_2_1 ) ) ;
    public final void rule__FieldGroup__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3135:1: ( ( ( rule__FieldGroup__WithAssignment_2_1 ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3136:1: ( ( rule__FieldGroup__WithAssignment_2_1 ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3136:1: ( ( rule__FieldGroup__WithAssignment_2_1 ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3137:1: ( rule__FieldGroup__WithAssignment_2_1 )
            {
             before(grammarAccess.getFieldGroupAccess().getWithAssignment_2_1()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3138:1: ( rule__FieldGroup__WithAssignment_2_1 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3138:2: rule__FieldGroup__WithAssignment_2_1
            {
            pushFollow(FOLLOW_rule__FieldGroup__WithAssignment_2_1_in_rule__FieldGroup__Group_2__1__Impl6423);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3152:1: rule__NormalAttribute__Group__0 : rule__NormalAttribute__Group__0__Impl rule__NormalAttribute__Group__1 ;
    public final void rule__NormalAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3156:1: ( rule__NormalAttribute__Group__0__Impl rule__NormalAttribute__Group__1 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3157:2: rule__NormalAttribute__Group__0__Impl rule__NormalAttribute__Group__1
            {
            pushFollow(FOLLOW_rule__NormalAttribute__Group__0__Impl_in_rule__NormalAttribute__Group__06457);
            rule__NormalAttribute__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__NormalAttribute__Group__1_in_rule__NormalAttribute__Group__06460);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3164:1: rule__NormalAttribute__Group__0__Impl : ( ( rule__NormalAttribute__ClassExprAssignment_0 ) ) ;
    public final void rule__NormalAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3168:1: ( ( ( rule__NormalAttribute__ClassExprAssignment_0 ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3169:1: ( ( rule__NormalAttribute__ClassExprAssignment_0 ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3169:1: ( ( rule__NormalAttribute__ClassExprAssignment_0 ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3170:1: ( rule__NormalAttribute__ClassExprAssignment_0 )
            {
             before(grammarAccess.getNormalAttributeAccess().getClassExprAssignment_0()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3171:1: ( rule__NormalAttribute__ClassExprAssignment_0 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3171:2: rule__NormalAttribute__ClassExprAssignment_0
            {
            pushFollow(FOLLOW_rule__NormalAttribute__ClassExprAssignment_0_in_rule__NormalAttribute__Group__0__Impl6487);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3181:1: rule__NormalAttribute__Group__1 : rule__NormalAttribute__Group__1__Impl ;
    public final void rule__NormalAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3185:1: ( rule__NormalAttribute__Group__1__Impl )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3186:2: rule__NormalAttribute__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__NormalAttribute__Group__1__Impl_in_rule__NormalAttribute__Group__16517);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3192:1: rule__NormalAttribute__Group__1__Impl : ( ( rule__NormalAttribute__Group_1__0 )? ) ;
    public final void rule__NormalAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3196:1: ( ( ( rule__NormalAttribute__Group_1__0 )? ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3197:1: ( ( rule__NormalAttribute__Group_1__0 )? )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3197:1: ( ( rule__NormalAttribute__Group_1__0 )? )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3198:1: ( rule__NormalAttribute__Group_1__0 )?
            {
             before(grammarAccess.getNormalAttributeAccess().getGroup_1()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3199:1: ( rule__NormalAttribute__Group_1__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==45) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3199:2: rule__NormalAttribute__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__NormalAttribute__Group_1__0_in_rule__NormalAttribute__Group__1__Impl6544);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3213:1: rule__NormalAttribute__Group_1__0 : rule__NormalAttribute__Group_1__0__Impl rule__NormalAttribute__Group_1__1 ;
    public final void rule__NormalAttribute__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3217:1: ( rule__NormalAttribute__Group_1__0__Impl rule__NormalAttribute__Group_1__1 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3218:2: rule__NormalAttribute__Group_1__0__Impl rule__NormalAttribute__Group_1__1
            {
            pushFollow(FOLLOW_rule__NormalAttribute__Group_1__0__Impl_in_rule__NormalAttribute__Group_1__06579);
            rule__NormalAttribute__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__NormalAttribute__Group_1__1_in_rule__NormalAttribute__Group_1__06582);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3225:1: rule__NormalAttribute__Group_1__0__Impl : ( 'if' ) ;
    public final void rule__NormalAttribute__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3229:1: ( ( 'if' ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3230:1: ( 'if' )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3230:1: ( 'if' )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3231:1: 'if'
            {
             before(grammarAccess.getNormalAttributeAccess().getIfKeyword_1_0()); 
            match(input,45,FOLLOW_45_in_rule__NormalAttribute__Group_1__0__Impl6610); 
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3244:1: rule__NormalAttribute__Group_1__1 : rule__NormalAttribute__Group_1__1__Impl ;
    public final void rule__NormalAttribute__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3248:1: ( rule__NormalAttribute__Group_1__1__Impl )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3249:2: rule__NormalAttribute__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__NormalAttribute__Group_1__1__Impl_in_rule__NormalAttribute__Group_1__16641);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3255:1: rule__NormalAttribute__Group_1__1__Impl : ( ( rule__NormalAttribute__ClauseAssignment_1_1 ) ) ;
    public final void rule__NormalAttribute__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3259:1: ( ( ( rule__NormalAttribute__ClauseAssignment_1_1 ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3260:1: ( ( rule__NormalAttribute__ClauseAssignment_1_1 ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3260:1: ( ( rule__NormalAttribute__ClauseAssignment_1_1 ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3261:1: ( rule__NormalAttribute__ClauseAssignment_1_1 )
            {
             before(grammarAccess.getNormalAttributeAccess().getClauseAssignment_1_1()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3262:1: ( rule__NormalAttribute__ClauseAssignment_1_1 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3262:2: rule__NormalAttribute__ClauseAssignment_1_1
            {
            pushFollow(FOLLOW_rule__NormalAttribute__ClauseAssignment_1_1_in_rule__NormalAttribute__Group_1__1__Impl6668);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3276:1: rule__AttributeClassExpression__Group__0 : rule__AttributeClassExpression__Group__0__Impl rule__AttributeClassExpression__Group__1 ;
    public final void rule__AttributeClassExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3280:1: ( rule__AttributeClassExpression__Group__0__Impl rule__AttributeClassExpression__Group__1 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3281:2: rule__AttributeClassExpression__Group__0__Impl rule__AttributeClassExpression__Group__1
            {
            pushFollow(FOLLOW_rule__AttributeClassExpression__Group__0__Impl_in_rule__AttributeClassExpression__Group__06702);
            rule__AttributeClassExpression__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__AttributeClassExpression__Group__1_in_rule__AttributeClassExpression__Group__06705);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3288:1: rule__AttributeClassExpression__Group__0__Impl : ( ( rule__AttributeClassExpression__ClassesAssignment_0 ) ) ;
    public final void rule__AttributeClassExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3292:1: ( ( ( rule__AttributeClassExpression__ClassesAssignment_0 ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3293:1: ( ( rule__AttributeClassExpression__ClassesAssignment_0 ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3293:1: ( ( rule__AttributeClassExpression__ClassesAssignment_0 ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3294:1: ( rule__AttributeClassExpression__ClassesAssignment_0 )
            {
             before(grammarAccess.getAttributeClassExpressionAccess().getClassesAssignment_0()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3295:1: ( rule__AttributeClassExpression__ClassesAssignment_0 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3295:2: rule__AttributeClassExpression__ClassesAssignment_0
            {
            pushFollow(FOLLOW_rule__AttributeClassExpression__ClassesAssignment_0_in_rule__AttributeClassExpression__Group__0__Impl6732);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3305:1: rule__AttributeClassExpression__Group__1 : rule__AttributeClassExpression__Group__1__Impl ;
    public final void rule__AttributeClassExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3309:1: ( rule__AttributeClassExpression__Group__1__Impl )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3310:2: rule__AttributeClassExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__AttributeClassExpression__Group__1__Impl_in_rule__AttributeClassExpression__Group__16762);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3316:1: rule__AttributeClassExpression__Group__1__Impl : ( ( rule__AttributeClassExpression__Group_1__0 )* ) ;
    public final void rule__AttributeClassExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3320:1: ( ( ( rule__AttributeClassExpression__Group_1__0 )* ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3321:1: ( ( rule__AttributeClassExpression__Group_1__0 )* )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3321:1: ( ( rule__AttributeClassExpression__Group_1__0 )* )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3322:1: ( rule__AttributeClassExpression__Group_1__0 )*
            {
             before(grammarAccess.getAttributeClassExpressionAccess().getGroup_1()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3323:1: ( rule__AttributeClassExpression__Group_1__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==46) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3323:2: rule__AttributeClassExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__AttributeClassExpression__Group_1__0_in_rule__AttributeClassExpression__Group__1__Impl6789);
            	    rule__AttributeClassExpression__Group_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3337:1: rule__AttributeClassExpression__Group_1__0 : rule__AttributeClassExpression__Group_1__0__Impl rule__AttributeClassExpression__Group_1__1 ;
    public final void rule__AttributeClassExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3341:1: ( rule__AttributeClassExpression__Group_1__0__Impl rule__AttributeClassExpression__Group_1__1 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3342:2: rule__AttributeClassExpression__Group_1__0__Impl rule__AttributeClassExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__AttributeClassExpression__Group_1__0__Impl_in_rule__AttributeClassExpression__Group_1__06824);
            rule__AttributeClassExpression__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__AttributeClassExpression__Group_1__1_in_rule__AttributeClassExpression__Group_1__06827);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3349:1: rule__AttributeClassExpression__Group_1__0__Impl : ( '+' ) ;
    public final void rule__AttributeClassExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3353:1: ( ( '+' ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3354:1: ( '+' )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3354:1: ( '+' )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3355:1: '+'
            {
             before(grammarAccess.getAttributeClassExpressionAccess().getPlusSignKeyword_1_0()); 
            match(input,46,FOLLOW_46_in_rule__AttributeClassExpression__Group_1__0__Impl6855); 
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3368:1: rule__AttributeClassExpression__Group_1__1 : rule__AttributeClassExpression__Group_1__1__Impl ;
    public final void rule__AttributeClassExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3372:1: ( rule__AttributeClassExpression__Group_1__1__Impl )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3373:2: rule__AttributeClassExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__AttributeClassExpression__Group_1__1__Impl_in_rule__AttributeClassExpression__Group_1__16886);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3379:1: rule__AttributeClassExpression__Group_1__1__Impl : ( ( rule__AttributeClassExpression__ClassesAssignment_1_1 ) ) ;
    public final void rule__AttributeClassExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3383:1: ( ( ( rule__AttributeClassExpression__ClassesAssignment_1_1 ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3384:1: ( ( rule__AttributeClassExpression__ClassesAssignment_1_1 ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3384:1: ( ( rule__AttributeClassExpression__ClassesAssignment_1_1 ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3385:1: ( rule__AttributeClassExpression__ClassesAssignment_1_1 )
            {
             before(grammarAccess.getAttributeClassExpressionAccess().getClassesAssignment_1_1()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3386:1: ( rule__AttributeClassExpression__ClassesAssignment_1_1 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3386:2: rule__AttributeClassExpression__ClassesAssignment_1_1
            {
            pushFollow(FOLLOW_rule__AttributeClassExpression__ClassesAssignment_1_1_in_rule__AttributeClassExpression__Group_1__1__Impl6913);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3400:1: rule__RestrictionAttribute__Group__0 : rule__RestrictionAttribute__Group__0__Impl rule__RestrictionAttribute__Group__1 ;
    public final void rule__RestrictionAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3404:1: ( rule__RestrictionAttribute__Group__0__Impl rule__RestrictionAttribute__Group__1 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3405:2: rule__RestrictionAttribute__Group__0__Impl rule__RestrictionAttribute__Group__1
            {
            pushFollow(FOLLOW_rule__RestrictionAttribute__Group__0__Impl_in_rule__RestrictionAttribute__Group__06947);
            rule__RestrictionAttribute__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__RestrictionAttribute__Group__1_in_rule__RestrictionAttribute__Group__06950);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3412:1: rule__RestrictionAttribute__Group__0__Impl : ( 'restrict-to' ) ;
    public final void rule__RestrictionAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3416:1: ( ( 'restrict-to' ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3417:1: ( 'restrict-to' )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3417:1: ( 'restrict-to' )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3418:1: 'restrict-to'
            {
             before(grammarAccess.getRestrictionAttributeAccess().getRestrictToKeyword_0()); 
            match(input,47,FOLLOW_47_in_rule__RestrictionAttribute__Group__0__Impl6978); 
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3431:1: rule__RestrictionAttribute__Group__1 : rule__RestrictionAttribute__Group__1__Impl rule__RestrictionAttribute__Group__2 ;
    public final void rule__RestrictionAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3435:1: ( rule__RestrictionAttribute__Group__1__Impl rule__RestrictionAttribute__Group__2 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3436:2: rule__RestrictionAttribute__Group__1__Impl rule__RestrictionAttribute__Group__2
            {
            pushFollow(FOLLOW_rule__RestrictionAttribute__Group__1__Impl_in_rule__RestrictionAttribute__Group__17009);
            rule__RestrictionAttribute__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__RestrictionAttribute__Group__2_in_rule__RestrictionAttribute__Group__17012);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3443:1: rule__RestrictionAttribute__Group__1__Impl : ( ( rule__RestrictionAttribute__LiteralsAssignment_1 ) ) ;
    public final void rule__RestrictionAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3447:1: ( ( ( rule__RestrictionAttribute__LiteralsAssignment_1 ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3448:1: ( ( rule__RestrictionAttribute__LiteralsAssignment_1 ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3448:1: ( ( rule__RestrictionAttribute__LiteralsAssignment_1 ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3449:1: ( rule__RestrictionAttribute__LiteralsAssignment_1 )
            {
             before(grammarAccess.getRestrictionAttributeAccess().getLiteralsAssignment_1()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3450:1: ( rule__RestrictionAttribute__LiteralsAssignment_1 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3450:2: rule__RestrictionAttribute__LiteralsAssignment_1
            {
            pushFollow(FOLLOW_rule__RestrictionAttribute__LiteralsAssignment_1_in_rule__RestrictionAttribute__Group__1__Impl7039);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3460:1: rule__RestrictionAttribute__Group__2 : rule__RestrictionAttribute__Group__2__Impl rule__RestrictionAttribute__Group__3 ;
    public final void rule__RestrictionAttribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3464:1: ( rule__RestrictionAttribute__Group__2__Impl rule__RestrictionAttribute__Group__3 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3465:2: rule__RestrictionAttribute__Group__2__Impl rule__RestrictionAttribute__Group__3
            {
            pushFollow(FOLLOW_rule__RestrictionAttribute__Group__2__Impl_in_rule__RestrictionAttribute__Group__27069);
            rule__RestrictionAttribute__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__RestrictionAttribute__Group__3_in_rule__RestrictionAttribute__Group__27072);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3472:1: rule__RestrictionAttribute__Group__2__Impl : ( 'if' ) ;
    public final void rule__RestrictionAttribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3476:1: ( ( 'if' ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3477:1: ( 'if' )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3477:1: ( 'if' )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3478:1: 'if'
            {
             before(grammarAccess.getRestrictionAttributeAccess().getIfKeyword_2()); 
            match(input,45,FOLLOW_45_in_rule__RestrictionAttribute__Group__2__Impl7100); 
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3491:1: rule__RestrictionAttribute__Group__3 : rule__RestrictionAttribute__Group__3__Impl ;
    public final void rule__RestrictionAttribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3495:1: ( rule__RestrictionAttribute__Group__3__Impl )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3496:2: rule__RestrictionAttribute__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__RestrictionAttribute__Group__3__Impl_in_rule__RestrictionAttribute__Group__37131);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3502:1: rule__RestrictionAttribute__Group__3__Impl : ( ( rule__RestrictionAttribute__ClauseAssignment_3 ) ) ;
    public final void rule__RestrictionAttribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3506:1: ( ( ( rule__RestrictionAttribute__ClauseAssignment_3 ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3507:1: ( ( rule__RestrictionAttribute__ClauseAssignment_3 ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3507:1: ( ( rule__RestrictionAttribute__ClauseAssignment_3 ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3508:1: ( rule__RestrictionAttribute__ClauseAssignment_3 )
            {
             before(grammarAccess.getRestrictionAttributeAccess().getClauseAssignment_3()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3509:1: ( rule__RestrictionAttribute__ClauseAssignment_3 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3509:2: rule__RestrictionAttribute__ClauseAssignment_3
            {
            pushFollow(FOLLOW_rule__RestrictionAttribute__ClauseAssignment_3_in_rule__RestrictionAttribute__Group__3__Impl7158);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3527:1: rule__RestrictionGroupAttribute__Group__0 : rule__RestrictionGroupAttribute__Group__0__Impl rule__RestrictionGroupAttribute__Group__1 ;
    public final void rule__RestrictionGroupAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3531:1: ( rule__RestrictionGroupAttribute__Group__0__Impl rule__RestrictionGroupAttribute__Group__1 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3532:2: rule__RestrictionGroupAttribute__Group__0__Impl rule__RestrictionGroupAttribute__Group__1
            {
            pushFollow(FOLLOW_rule__RestrictionGroupAttribute__Group__0__Impl_in_rule__RestrictionGroupAttribute__Group__07196);
            rule__RestrictionGroupAttribute__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__RestrictionGroupAttribute__Group__1_in_rule__RestrictionGroupAttribute__Group__07199);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3539:1: rule__RestrictionGroupAttribute__Group__0__Impl : ( () ) ;
    public final void rule__RestrictionGroupAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3543:1: ( ( () ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3544:1: ( () )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3544:1: ( () )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3545:1: ()
            {
             before(grammarAccess.getRestrictionGroupAttributeAccess().getRestrictionGroupAttributeAction_0()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3546:1: ()
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3548:1: 
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3558:1: rule__RestrictionGroupAttribute__Group__1 : rule__RestrictionGroupAttribute__Group__1__Impl rule__RestrictionGroupAttribute__Group__2 ;
    public final void rule__RestrictionGroupAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3562:1: ( rule__RestrictionGroupAttribute__Group__1__Impl rule__RestrictionGroupAttribute__Group__2 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3563:2: rule__RestrictionGroupAttribute__Group__1__Impl rule__RestrictionGroupAttribute__Group__2
            {
            pushFollow(FOLLOW_rule__RestrictionGroupAttribute__Group__1__Impl_in_rule__RestrictionGroupAttribute__Group__17257);
            rule__RestrictionGroupAttribute__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__RestrictionGroupAttribute__Group__2_in_rule__RestrictionGroupAttribute__Group__17260);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3570:1: rule__RestrictionGroupAttribute__Group__1__Impl : ( 'restrict-to-group' ) ;
    public final void rule__RestrictionGroupAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3574:1: ( ( 'restrict-to-group' ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3575:1: ( 'restrict-to-group' )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3575:1: ( 'restrict-to-group' )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3576:1: 'restrict-to-group'
            {
             before(grammarAccess.getRestrictionGroupAttributeAccess().getRestrictToGroupKeyword_1()); 
            match(input,48,FOLLOW_48_in_rule__RestrictionGroupAttribute__Group__1__Impl7288); 
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3589:1: rule__RestrictionGroupAttribute__Group__2 : rule__RestrictionGroupAttribute__Group__2__Impl rule__RestrictionGroupAttribute__Group__3 ;
    public final void rule__RestrictionGroupAttribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3593:1: ( rule__RestrictionGroupAttribute__Group__2__Impl rule__RestrictionGroupAttribute__Group__3 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3594:2: rule__RestrictionGroupAttribute__Group__2__Impl rule__RestrictionGroupAttribute__Group__3
            {
            pushFollow(FOLLOW_rule__RestrictionGroupAttribute__Group__2__Impl_in_rule__RestrictionGroupAttribute__Group__27319);
            rule__RestrictionGroupAttribute__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__RestrictionGroupAttribute__Group__3_in_rule__RestrictionGroupAttribute__Group__27322);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3601:1: rule__RestrictionGroupAttribute__Group__2__Impl : ( '<' ) ;
    public final void rule__RestrictionGroupAttribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3605:1: ( ( '<' ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3606:1: ( '<' )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3606:1: ( '<' )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3607:1: '<'
            {
             before(grammarAccess.getRestrictionGroupAttributeAccess().getLessThanSignKeyword_2()); 
            match(input,49,FOLLOW_49_in_rule__RestrictionGroupAttribute__Group__2__Impl7350); 
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3620:1: rule__RestrictionGroupAttribute__Group__3 : rule__RestrictionGroupAttribute__Group__3__Impl rule__RestrictionGroupAttribute__Group__4 ;
    public final void rule__RestrictionGroupAttribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3624:1: ( rule__RestrictionGroupAttribute__Group__3__Impl rule__RestrictionGroupAttribute__Group__4 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3625:2: rule__RestrictionGroupAttribute__Group__3__Impl rule__RestrictionGroupAttribute__Group__4
            {
            pushFollow(FOLLOW_rule__RestrictionGroupAttribute__Group__3__Impl_in_rule__RestrictionGroupAttribute__Group__37381);
            rule__RestrictionGroupAttribute__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__RestrictionGroupAttribute__Group__4_in_rule__RestrictionGroupAttribute__Group__37384);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3632:1: rule__RestrictionGroupAttribute__Group__3__Impl : ( ( ( rule__RestrictionGroupAttribute__RulesAssignment_3 ) ) ( ( rule__RestrictionGroupAttribute__RulesAssignment_3 )* ) ) ;
    public final void rule__RestrictionGroupAttribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3636:1: ( ( ( ( rule__RestrictionGroupAttribute__RulesAssignment_3 ) ) ( ( rule__RestrictionGroupAttribute__RulesAssignment_3 )* ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3637:1: ( ( ( rule__RestrictionGroupAttribute__RulesAssignment_3 ) ) ( ( rule__RestrictionGroupAttribute__RulesAssignment_3 )* ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3637:1: ( ( ( rule__RestrictionGroupAttribute__RulesAssignment_3 ) ) ( ( rule__RestrictionGroupAttribute__RulesAssignment_3 )* ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3638:1: ( ( rule__RestrictionGroupAttribute__RulesAssignment_3 ) ) ( ( rule__RestrictionGroupAttribute__RulesAssignment_3 )* )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3638:1: ( ( rule__RestrictionGroupAttribute__RulesAssignment_3 ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3639:1: ( rule__RestrictionGroupAttribute__RulesAssignment_3 )
            {
             before(grammarAccess.getRestrictionGroupAttributeAccess().getRulesAssignment_3()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3640:1: ( rule__RestrictionGroupAttribute__RulesAssignment_3 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3640:2: rule__RestrictionGroupAttribute__RulesAssignment_3
            {
            pushFollow(FOLLOW_rule__RestrictionGroupAttribute__RulesAssignment_3_in_rule__RestrictionGroupAttribute__Group__3__Impl7413);
            rule__RestrictionGroupAttribute__RulesAssignment_3();
            _fsp--;


            }

             after(grammarAccess.getRestrictionGroupAttributeAccess().getRulesAssignment_3()); 

            }

            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3643:1: ( ( rule__RestrictionGroupAttribute__RulesAssignment_3 )* )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3644:1: ( rule__RestrictionGroupAttribute__RulesAssignment_3 )*
            {
             before(grammarAccess.getRestrictionGroupAttributeAccess().getRulesAssignment_3()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3645:1: ( rule__RestrictionGroupAttribute__RulesAssignment_3 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==RULE_ID||LA31_0==33) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3645:2: rule__RestrictionGroupAttribute__RulesAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__RestrictionGroupAttribute__RulesAssignment_3_in_rule__RestrictionGroupAttribute__Group__3__Impl7425);
            	    rule__RestrictionGroupAttribute__RulesAssignment_3();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3656:1: rule__RestrictionGroupAttribute__Group__4 : rule__RestrictionGroupAttribute__Group__4__Impl ;
    public final void rule__RestrictionGroupAttribute__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3660:1: ( rule__RestrictionGroupAttribute__Group__4__Impl )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3661:2: rule__RestrictionGroupAttribute__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__RestrictionGroupAttribute__Group__4__Impl_in_rule__RestrictionGroupAttribute__Group__47458);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3667:1: rule__RestrictionGroupAttribute__Group__4__Impl : ( '>' ) ;
    public final void rule__RestrictionGroupAttribute__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3671:1: ( ( '>' ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3672:1: ( '>' )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3672:1: ( '>' )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3673:1: '>'
            {
             before(grammarAccess.getRestrictionGroupAttributeAccess().getGreaterThanSignKeyword_4()); 
            match(input,50,FOLLOW_50_in_rule__RestrictionGroupAttribute__Group__4__Impl7486); 
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3696:1: rule__RestrictionRule__Group__0 : rule__RestrictionRule__Group__0__Impl rule__RestrictionRule__Group__1 ;
    public final void rule__RestrictionRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3700:1: ( rule__RestrictionRule__Group__0__Impl rule__RestrictionRule__Group__1 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3701:2: rule__RestrictionRule__Group__0__Impl rule__RestrictionRule__Group__1
            {
            pushFollow(FOLLOW_rule__RestrictionRule__Group__0__Impl_in_rule__RestrictionRule__Group__07527);
            rule__RestrictionRule__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__RestrictionRule__Group__1_in_rule__RestrictionRule__Group__07530);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3708:1: rule__RestrictionRule__Group__0__Impl : ( ( rule__RestrictionRule__LiteralsAssignment_0 ) ) ;
    public final void rule__RestrictionRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3712:1: ( ( ( rule__RestrictionRule__LiteralsAssignment_0 ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3713:1: ( ( rule__RestrictionRule__LiteralsAssignment_0 ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3713:1: ( ( rule__RestrictionRule__LiteralsAssignment_0 ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3714:1: ( rule__RestrictionRule__LiteralsAssignment_0 )
            {
             before(grammarAccess.getRestrictionRuleAccess().getLiteralsAssignment_0()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3715:1: ( rule__RestrictionRule__LiteralsAssignment_0 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3715:2: rule__RestrictionRule__LiteralsAssignment_0
            {
            pushFollow(FOLLOW_rule__RestrictionRule__LiteralsAssignment_0_in_rule__RestrictionRule__Group__0__Impl7557);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3725:1: rule__RestrictionRule__Group__1 : rule__RestrictionRule__Group__1__Impl rule__RestrictionRule__Group__2 ;
    public final void rule__RestrictionRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3729:1: ( rule__RestrictionRule__Group__1__Impl rule__RestrictionRule__Group__2 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3730:2: rule__RestrictionRule__Group__1__Impl rule__RestrictionRule__Group__2
            {
            pushFollow(FOLLOW_rule__RestrictionRule__Group__1__Impl_in_rule__RestrictionRule__Group__17587);
            rule__RestrictionRule__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__RestrictionRule__Group__2_in_rule__RestrictionRule__Group__17590);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3737:1: rule__RestrictionRule__Group__1__Impl : ( 'if' ) ;
    public final void rule__RestrictionRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3741:1: ( ( 'if' ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3742:1: ( 'if' )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3742:1: ( 'if' )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3743:1: 'if'
            {
             before(grammarAccess.getRestrictionRuleAccess().getIfKeyword_1()); 
            match(input,45,FOLLOW_45_in_rule__RestrictionRule__Group__1__Impl7618); 
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3756:1: rule__RestrictionRule__Group__2 : rule__RestrictionRule__Group__2__Impl ;
    public final void rule__RestrictionRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3760:1: ( rule__RestrictionRule__Group__2__Impl )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3761:2: rule__RestrictionRule__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__RestrictionRule__Group__2__Impl_in_rule__RestrictionRule__Group__27649);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3767:1: rule__RestrictionRule__Group__2__Impl : ( ( rule__RestrictionRule__ClauseAssignment_2 ) ) ;
    public final void rule__RestrictionRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3771:1: ( ( ( rule__RestrictionRule__ClauseAssignment_2 ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3772:1: ( ( rule__RestrictionRule__ClauseAssignment_2 ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3772:1: ( ( rule__RestrictionRule__ClauseAssignment_2 ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3773:1: ( rule__RestrictionRule__ClauseAssignment_2 )
            {
             before(grammarAccess.getRestrictionRuleAccess().getClauseAssignment_2()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3774:1: ( rule__RestrictionRule__ClauseAssignment_2 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3774:2: rule__RestrictionRule__ClauseAssignment_2
            {
            pushFollow(FOLLOW_rule__RestrictionRule__ClauseAssignment_2_in_rule__RestrictionRule__Group__2__Impl7676);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3790:1: rule__BOrExpression__Group__0 : rule__BOrExpression__Group__0__Impl rule__BOrExpression__Group__1 ;
    public final void rule__BOrExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3794:1: ( rule__BOrExpression__Group__0__Impl rule__BOrExpression__Group__1 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3795:2: rule__BOrExpression__Group__0__Impl rule__BOrExpression__Group__1
            {
            pushFollow(FOLLOW_rule__BOrExpression__Group__0__Impl_in_rule__BOrExpression__Group__07712);
            rule__BOrExpression__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BOrExpression__Group__1_in_rule__BOrExpression__Group__07715);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3802:1: rule__BOrExpression__Group__0__Impl : ( ruleBAndExpression ) ;
    public final void rule__BOrExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3806:1: ( ( ruleBAndExpression ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3807:1: ( ruleBAndExpression )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3807:1: ( ruleBAndExpression )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3808:1: ruleBAndExpression
            {
             before(grammarAccess.getBOrExpressionAccess().getBAndExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleBAndExpression_in_rule__BOrExpression__Group__0__Impl7742);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3819:1: rule__BOrExpression__Group__1 : rule__BOrExpression__Group__1__Impl ;
    public final void rule__BOrExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3823:1: ( rule__BOrExpression__Group__1__Impl )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3824:2: rule__BOrExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__BOrExpression__Group__1__Impl_in_rule__BOrExpression__Group__17771);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3830:1: rule__BOrExpression__Group__1__Impl : ( ( rule__BOrExpression__Group_1__0 )* ) ;
    public final void rule__BOrExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3834:1: ( ( ( rule__BOrExpression__Group_1__0 )* ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3835:1: ( ( rule__BOrExpression__Group_1__0 )* )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3835:1: ( ( rule__BOrExpression__Group_1__0 )* )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3836:1: ( rule__BOrExpression__Group_1__0 )*
            {
             before(grammarAccess.getBOrExpressionAccess().getGroup_1()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3837:1: ( rule__BOrExpression__Group_1__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( ((LA32_0>=11 && LA32_0<=12)) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3837:2: rule__BOrExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__BOrExpression__Group_1__0_in_rule__BOrExpression__Group__1__Impl7798);
            	    rule__BOrExpression__Group_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3851:1: rule__BOrExpression__Group_1__0 : rule__BOrExpression__Group_1__0__Impl rule__BOrExpression__Group_1__1 ;
    public final void rule__BOrExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3855:1: ( rule__BOrExpression__Group_1__0__Impl rule__BOrExpression__Group_1__1 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3856:2: rule__BOrExpression__Group_1__0__Impl rule__BOrExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__BOrExpression__Group_1__0__Impl_in_rule__BOrExpression__Group_1__07833);
            rule__BOrExpression__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BOrExpression__Group_1__1_in_rule__BOrExpression__Group_1__07836);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3863:1: rule__BOrExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__BOrExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3867:1: ( ( () ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3868:1: ( () )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3868:1: ( () )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3869:1: ()
            {
             before(grammarAccess.getBOrExpressionAccess().getOrOperationLeftAction_1_0()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3870:1: ()
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3872:1: 
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3882:1: rule__BOrExpression__Group_1__1 : rule__BOrExpression__Group_1__1__Impl rule__BOrExpression__Group_1__2 ;
    public final void rule__BOrExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3886:1: ( rule__BOrExpression__Group_1__1__Impl rule__BOrExpression__Group_1__2 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3887:2: rule__BOrExpression__Group_1__1__Impl rule__BOrExpression__Group_1__2
            {
            pushFollow(FOLLOW_rule__BOrExpression__Group_1__1__Impl_in_rule__BOrExpression__Group_1__17894);
            rule__BOrExpression__Group_1__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BOrExpression__Group_1__2_in_rule__BOrExpression__Group_1__17897);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3894:1: rule__BOrExpression__Group_1__1__Impl : ( ( rule__BOrExpression__Alternatives_1_1 ) ) ;
    public final void rule__BOrExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3898:1: ( ( ( rule__BOrExpression__Alternatives_1_1 ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3899:1: ( ( rule__BOrExpression__Alternatives_1_1 ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3899:1: ( ( rule__BOrExpression__Alternatives_1_1 ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3900:1: ( rule__BOrExpression__Alternatives_1_1 )
            {
             before(grammarAccess.getBOrExpressionAccess().getAlternatives_1_1()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3901:1: ( rule__BOrExpression__Alternatives_1_1 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3901:2: rule__BOrExpression__Alternatives_1_1
            {
            pushFollow(FOLLOW_rule__BOrExpression__Alternatives_1_1_in_rule__BOrExpression__Group_1__1__Impl7924);
            rule__BOrExpression__Alternatives_1_1();
            _fsp--;


            }

             after(grammarAccess.getBOrExpressionAccess().getAlternatives_1_1()); 

            }


            }

        }
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3911:1: rule__BOrExpression__Group_1__2 : rule__BOrExpression__Group_1__2__Impl ;
    public final void rule__BOrExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3915:1: ( rule__BOrExpression__Group_1__2__Impl )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3916:2: rule__BOrExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__BOrExpression__Group_1__2__Impl_in_rule__BOrExpression__Group_1__27954);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3922:1: rule__BOrExpression__Group_1__2__Impl : ( ( rule__BOrExpression__RightAssignment_1_2 ) ) ;
    public final void rule__BOrExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3926:1: ( ( ( rule__BOrExpression__RightAssignment_1_2 ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3927:1: ( ( rule__BOrExpression__RightAssignment_1_2 ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3927:1: ( ( rule__BOrExpression__RightAssignment_1_2 ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3928:1: ( rule__BOrExpression__RightAssignment_1_2 )
            {
             before(grammarAccess.getBOrExpressionAccess().getRightAssignment_1_2()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3929:1: ( rule__BOrExpression__RightAssignment_1_2 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3929:2: rule__BOrExpression__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__BOrExpression__RightAssignment_1_2_in_rule__BOrExpression__Group_1__2__Impl7981);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3945:1: rule__BAndExpression__Group__0 : rule__BAndExpression__Group__0__Impl rule__BAndExpression__Group__1 ;
    public final void rule__BAndExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3949:1: ( rule__BAndExpression__Group__0__Impl rule__BAndExpression__Group__1 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3950:2: rule__BAndExpression__Group__0__Impl rule__BAndExpression__Group__1
            {
            pushFollow(FOLLOW_rule__BAndExpression__Group__0__Impl_in_rule__BAndExpression__Group__08017);
            rule__BAndExpression__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BAndExpression__Group__1_in_rule__BAndExpression__Group__08020);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3957:1: rule__BAndExpression__Group__0__Impl : ( ruleNegationExpression ) ;
    public final void rule__BAndExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3961:1: ( ( ruleNegationExpression ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3962:1: ( ruleNegationExpression )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3962:1: ( ruleNegationExpression )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3963:1: ruleNegationExpression
            {
             before(grammarAccess.getBAndExpressionAccess().getNegationExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleNegationExpression_in_rule__BAndExpression__Group__0__Impl8047);
            ruleNegationExpression();
            _fsp--;

             after(grammarAccess.getBAndExpressionAccess().getNegationExpressionParserRuleCall_0()); 

            }


            }

        }
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3974:1: rule__BAndExpression__Group__1 : rule__BAndExpression__Group__1__Impl ;
    public final void rule__BAndExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3978:1: ( rule__BAndExpression__Group__1__Impl )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3979:2: rule__BAndExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__BAndExpression__Group__1__Impl_in_rule__BAndExpression__Group__18076);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3985:1: rule__BAndExpression__Group__1__Impl : ( ( rule__BAndExpression__Group_1__0 )* ) ;
    public final void rule__BAndExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3989:1: ( ( ( rule__BAndExpression__Group_1__0 )* ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3990:1: ( ( rule__BAndExpression__Group_1__0 )* )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3990:1: ( ( rule__BAndExpression__Group_1__0 )* )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3991:1: ( rule__BAndExpression__Group_1__0 )*
            {
             before(grammarAccess.getBAndExpressionAccess().getGroup_1()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3992:1: ( rule__BAndExpression__Group_1__0 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( ((LA33_0>=13 && LA33_0<=14)) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:3992:2: rule__BAndExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__BAndExpression__Group_1__0_in_rule__BAndExpression__Group__1__Impl8103);
            	    rule__BAndExpression__Group_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4006:1: rule__BAndExpression__Group_1__0 : rule__BAndExpression__Group_1__0__Impl rule__BAndExpression__Group_1__1 ;
    public final void rule__BAndExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4010:1: ( rule__BAndExpression__Group_1__0__Impl rule__BAndExpression__Group_1__1 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4011:2: rule__BAndExpression__Group_1__0__Impl rule__BAndExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__BAndExpression__Group_1__0__Impl_in_rule__BAndExpression__Group_1__08138);
            rule__BAndExpression__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BAndExpression__Group_1__1_in_rule__BAndExpression__Group_1__08141);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4018:1: rule__BAndExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__BAndExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4022:1: ( ( () ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4023:1: ( () )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4023:1: ( () )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4024:1: ()
            {
             before(grammarAccess.getBAndExpressionAccess().getAndOperationLeftAction_1_0()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4025:1: ()
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4027:1: 
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4037:1: rule__BAndExpression__Group_1__1 : rule__BAndExpression__Group_1__1__Impl rule__BAndExpression__Group_1__2 ;
    public final void rule__BAndExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4041:1: ( rule__BAndExpression__Group_1__1__Impl rule__BAndExpression__Group_1__2 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4042:2: rule__BAndExpression__Group_1__1__Impl rule__BAndExpression__Group_1__2
            {
            pushFollow(FOLLOW_rule__BAndExpression__Group_1__1__Impl_in_rule__BAndExpression__Group_1__18199);
            rule__BAndExpression__Group_1__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BAndExpression__Group_1__2_in_rule__BAndExpression__Group_1__18202);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4049:1: rule__BAndExpression__Group_1__1__Impl : ( ( rule__BAndExpression__Alternatives_1_1 ) ) ;
    public final void rule__BAndExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4053:1: ( ( ( rule__BAndExpression__Alternatives_1_1 ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4054:1: ( ( rule__BAndExpression__Alternatives_1_1 ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4054:1: ( ( rule__BAndExpression__Alternatives_1_1 ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4055:1: ( rule__BAndExpression__Alternatives_1_1 )
            {
             before(grammarAccess.getBAndExpressionAccess().getAlternatives_1_1()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4056:1: ( rule__BAndExpression__Alternatives_1_1 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4056:2: rule__BAndExpression__Alternatives_1_1
            {
            pushFollow(FOLLOW_rule__BAndExpression__Alternatives_1_1_in_rule__BAndExpression__Group_1__1__Impl8229);
            rule__BAndExpression__Alternatives_1_1();
            _fsp--;


            }

             after(grammarAccess.getBAndExpressionAccess().getAlternatives_1_1()); 

            }


            }

        }
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4066:1: rule__BAndExpression__Group_1__2 : rule__BAndExpression__Group_1__2__Impl ;
    public final void rule__BAndExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4070:1: ( rule__BAndExpression__Group_1__2__Impl )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4071:2: rule__BAndExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__BAndExpression__Group_1__2__Impl_in_rule__BAndExpression__Group_1__28259);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4077:1: rule__BAndExpression__Group_1__2__Impl : ( ( rule__BAndExpression__RightAssignment_1_2 ) ) ;
    public final void rule__BAndExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4081:1: ( ( ( rule__BAndExpression__RightAssignment_1_2 ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4082:1: ( ( rule__BAndExpression__RightAssignment_1_2 ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4082:1: ( ( rule__BAndExpression__RightAssignment_1_2 ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4083:1: ( rule__BAndExpression__RightAssignment_1_2 )
            {
             before(grammarAccess.getBAndExpressionAccess().getRightAssignment_1_2()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4084:1: ( rule__BAndExpression__RightAssignment_1_2 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4084:2: rule__BAndExpression__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__BAndExpression__RightAssignment_1_2_in_rule__BAndExpression__Group_1__2__Impl8286);
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


    // $ANTLR start rule__NegationExpression__Group_1__0
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4100:1: rule__NegationExpression__Group_1__0 : rule__NegationExpression__Group_1__0__Impl rule__NegationExpression__Group_1__1 ;
    public final void rule__NegationExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4104:1: ( rule__NegationExpression__Group_1__0__Impl rule__NegationExpression__Group_1__1 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4105:2: rule__NegationExpression__Group_1__0__Impl rule__NegationExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__NegationExpression__Group_1__0__Impl_in_rule__NegationExpression__Group_1__08322);
            rule__NegationExpression__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__NegationExpression__Group_1__1_in_rule__NegationExpression__Group_1__08325);
            rule__NegationExpression__Group_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__NegationExpression__Group_1__0


    // $ANTLR start rule__NegationExpression__Group_1__0__Impl
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4112:1: rule__NegationExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__NegationExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4116:1: ( ( () ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4117:1: ( () )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4117:1: ( () )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4118:1: ()
            {
             before(grammarAccess.getNegationExpressionAccess().getNegationExpressionAction_1_0()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4119:1: ()
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4121:1: 
            {
            }

             after(grammarAccess.getNegationExpressionAccess().getNegationExpressionAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__NegationExpression__Group_1__0__Impl


    // $ANTLR start rule__NegationExpression__Group_1__1
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4131:1: rule__NegationExpression__Group_1__1 : rule__NegationExpression__Group_1__1__Impl rule__NegationExpression__Group_1__2 ;
    public final void rule__NegationExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4135:1: ( rule__NegationExpression__Group_1__1__Impl rule__NegationExpression__Group_1__2 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4136:2: rule__NegationExpression__Group_1__1__Impl rule__NegationExpression__Group_1__2
            {
            pushFollow(FOLLOW_rule__NegationExpression__Group_1__1__Impl_in_rule__NegationExpression__Group_1__18383);
            rule__NegationExpression__Group_1__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__NegationExpression__Group_1__2_in_rule__NegationExpression__Group_1__18386);
            rule__NegationExpression__Group_1__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__NegationExpression__Group_1__1


    // $ANTLR start rule__NegationExpression__Group_1__1__Impl
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4143:1: rule__NegationExpression__Group_1__1__Impl : ( ( rule__NegationExpression__Alternatives_1_1 ) ) ;
    public final void rule__NegationExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4147:1: ( ( ( rule__NegationExpression__Alternatives_1_1 ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4148:1: ( ( rule__NegationExpression__Alternatives_1_1 ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4148:1: ( ( rule__NegationExpression__Alternatives_1_1 ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4149:1: ( rule__NegationExpression__Alternatives_1_1 )
            {
             before(grammarAccess.getNegationExpressionAccess().getAlternatives_1_1()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4150:1: ( rule__NegationExpression__Alternatives_1_1 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4150:2: rule__NegationExpression__Alternatives_1_1
            {
            pushFollow(FOLLOW_rule__NegationExpression__Alternatives_1_1_in_rule__NegationExpression__Group_1__1__Impl8413);
            rule__NegationExpression__Alternatives_1_1();
            _fsp--;


            }

             after(grammarAccess.getNegationExpressionAccess().getAlternatives_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__NegationExpression__Group_1__1__Impl


    // $ANTLR start rule__NegationExpression__Group_1__2
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4160:1: rule__NegationExpression__Group_1__2 : rule__NegationExpression__Group_1__2__Impl ;
    public final void rule__NegationExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4164:1: ( rule__NegationExpression__Group_1__2__Impl )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4165:2: rule__NegationExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__NegationExpression__Group_1__2__Impl_in_rule__NegationExpression__Group_1__28443);
            rule__NegationExpression__Group_1__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__NegationExpression__Group_1__2


    // $ANTLR start rule__NegationExpression__Group_1__2__Impl
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4171:1: rule__NegationExpression__Group_1__2__Impl : ( ( rule__NegationExpression__ExprAssignment_1_2 ) ) ;
    public final void rule__NegationExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4175:1: ( ( ( rule__NegationExpression__ExprAssignment_1_2 ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4176:1: ( ( rule__NegationExpression__ExprAssignment_1_2 ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4176:1: ( ( rule__NegationExpression__ExprAssignment_1_2 ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4177:1: ( rule__NegationExpression__ExprAssignment_1_2 )
            {
             before(grammarAccess.getNegationExpressionAccess().getExprAssignment_1_2()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4178:1: ( rule__NegationExpression__ExprAssignment_1_2 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4178:2: rule__NegationExpression__ExprAssignment_1_2
            {
            pushFollow(FOLLOW_rule__NegationExpression__ExprAssignment_1_2_in_rule__NegationExpression__Group_1__2__Impl8470);
            rule__NegationExpression__ExprAssignment_1_2();
            _fsp--;


            }

             after(grammarAccess.getNegationExpressionAccess().getExprAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__NegationExpression__Group_1__2__Impl


    // $ANTLR start rule__TerminalBExpression__Group_1__0
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4194:1: rule__TerminalBExpression__Group_1__0 : rule__TerminalBExpression__Group_1__0__Impl rule__TerminalBExpression__Group_1__1 ;
    public final void rule__TerminalBExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4198:1: ( rule__TerminalBExpression__Group_1__0__Impl rule__TerminalBExpression__Group_1__1 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4199:2: rule__TerminalBExpression__Group_1__0__Impl rule__TerminalBExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__TerminalBExpression__Group_1__0__Impl_in_rule__TerminalBExpression__Group_1__08506);
            rule__TerminalBExpression__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TerminalBExpression__Group_1__1_in_rule__TerminalBExpression__Group_1__08509);
            rule__TerminalBExpression__Group_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TerminalBExpression__Group_1__0


    // $ANTLR start rule__TerminalBExpression__Group_1__0__Impl
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4206:1: rule__TerminalBExpression__Group_1__0__Impl : ( '(' ) ;
    public final void rule__TerminalBExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4210:1: ( ( '(' ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4211:1: ( '(' )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4211:1: ( '(' )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4212:1: '('
            {
             before(grammarAccess.getTerminalBExpressionAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,33,FOLLOW_33_in_rule__TerminalBExpression__Group_1__0__Impl8537); 
             after(grammarAccess.getTerminalBExpressionAccess().getLeftParenthesisKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TerminalBExpression__Group_1__0__Impl


    // $ANTLR start rule__TerminalBExpression__Group_1__1
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4225:1: rule__TerminalBExpression__Group_1__1 : rule__TerminalBExpression__Group_1__1__Impl rule__TerminalBExpression__Group_1__2 ;
    public final void rule__TerminalBExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4229:1: ( rule__TerminalBExpression__Group_1__1__Impl rule__TerminalBExpression__Group_1__2 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4230:2: rule__TerminalBExpression__Group_1__1__Impl rule__TerminalBExpression__Group_1__2
            {
            pushFollow(FOLLOW_rule__TerminalBExpression__Group_1__1__Impl_in_rule__TerminalBExpression__Group_1__18568);
            rule__TerminalBExpression__Group_1__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TerminalBExpression__Group_1__2_in_rule__TerminalBExpression__Group_1__18571);
            rule__TerminalBExpression__Group_1__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TerminalBExpression__Group_1__1


    // $ANTLR start rule__TerminalBExpression__Group_1__1__Impl
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4237:1: rule__TerminalBExpression__Group_1__1__Impl : ( ruleBExpression ) ;
    public final void rule__TerminalBExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4241:1: ( ( ruleBExpression ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4242:1: ( ruleBExpression )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4242:1: ( ruleBExpression )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4243:1: ruleBExpression
            {
             before(grammarAccess.getTerminalBExpressionAccess().getBExpressionParserRuleCall_1_1()); 
            pushFollow(FOLLOW_ruleBExpression_in_rule__TerminalBExpression__Group_1__1__Impl8598);
            ruleBExpression();
            _fsp--;

             after(grammarAccess.getTerminalBExpressionAccess().getBExpressionParserRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TerminalBExpression__Group_1__1__Impl


    // $ANTLR start rule__TerminalBExpression__Group_1__2
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4254:1: rule__TerminalBExpression__Group_1__2 : rule__TerminalBExpression__Group_1__2__Impl ;
    public final void rule__TerminalBExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4258:1: ( rule__TerminalBExpression__Group_1__2__Impl )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4259:2: rule__TerminalBExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__TerminalBExpression__Group_1__2__Impl_in_rule__TerminalBExpression__Group_1__28627);
            rule__TerminalBExpression__Group_1__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TerminalBExpression__Group_1__2


    // $ANTLR start rule__TerminalBExpression__Group_1__2__Impl
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4265:1: rule__TerminalBExpression__Group_1__2__Impl : ( ')' ) ;
    public final void rule__TerminalBExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4269:1: ( ( ')' ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4270:1: ( ')' )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4270:1: ( ')' )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4271:1: ')'
            {
             before(grammarAccess.getTerminalBExpressionAccess().getRightParenthesisKeyword_1_2()); 
            match(input,34,FOLLOW_34_in_rule__TerminalBExpression__Group_1__2__Impl8655); 
             after(grammarAccess.getTerminalBExpressionAccess().getRightParenthesisKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TerminalBExpression__Group_1__2__Impl


    // $ANTLR start rule__BComparison__Group__0
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4290:1: rule__BComparison__Group__0 : rule__BComparison__Group__0__Impl rule__BComparison__Group__1 ;
    public final void rule__BComparison__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4294:1: ( rule__BComparison__Group__0__Impl rule__BComparison__Group__1 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4295:2: rule__BComparison__Group__0__Impl rule__BComparison__Group__1
            {
            pushFollow(FOLLOW_rule__BComparison__Group__0__Impl_in_rule__BComparison__Group__08692);
            rule__BComparison__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BComparison__Group__1_in_rule__BComparison__Group__08695);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4302:1: rule__BComparison__Group__0__Impl : ( () ) ;
    public final void rule__BComparison__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4306:1: ( ( () ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4307:1: ( () )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4307:1: ( () )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4308:1: ()
            {
             before(grammarAccess.getBComparisonAccess().getBComparisonAction_0()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4309:1: ()
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4311:1: 
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4321:1: rule__BComparison__Group__1 : rule__BComparison__Group__1__Impl rule__BComparison__Group__2 ;
    public final void rule__BComparison__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4325:1: ( rule__BComparison__Group__1__Impl rule__BComparison__Group__2 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4326:2: rule__BComparison__Group__1__Impl rule__BComparison__Group__2
            {
            pushFollow(FOLLOW_rule__BComparison__Group__1__Impl_in_rule__BComparison__Group__18753);
            rule__BComparison__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BComparison__Group__2_in_rule__BComparison__Group__18756);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4333:1: rule__BComparison__Group__1__Impl : ( ( rule__BComparison__RefAssignment_1 ) ) ;
    public final void rule__BComparison__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4337:1: ( ( ( rule__BComparison__RefAssignment_1 ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4338:1: ( ( rule__BComparison__RefAssignment_1 ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4338:1: ( ( rule__BComparison__RefAssignment_1 ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4339:1: ( rule__BComparison__RefAssignment_1 )
            {
             before(grammarAccess.getBComparisonAccess().getRefAssignment_1()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4340:1: ( rule__BComparison__RefAssignment_1 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4340:2: rule__BComparison__RefAssignment_1
            {
            pushFollow(FOLLOW_rule__BComparison__RefAssignment_1_in_rule__BComparison__Group__1__Impl8783);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4350:1: rule__BComparison__Group__2 : rule__BComparison__Group__2__Impl ;
    public final void rule__BComparison__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4354:1: ( rule__BComparison__Group__2__Impl )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4355:2: rule__BComparison__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__BComparison__Group__2__Impl_in_rule__BComparison__Group__28813);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4361:1: rule__BComparison__Group__2__Impl : ( ( rule__BComparison__Group_2__0 )? ) ;
    public final void rule__BComparison__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4365:1: ( ( ( rule__BComparison__Group_2__0 )? ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4366:1: ( ( rule__BComparison__Group_2__0 )? )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4366:1: ( ( rule__BComparison__Group_2__0 )? )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4367:1: ( rule__BComparison__Group_2__0 )?
            {
             before(grammarAccess.getBComparisonAccess().getGroup_2()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4368:1: ( rule__BComparison__Group_2__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==51) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4368:2: rule__BComparison__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__BComparison__Group_2__0_in_rule__BComparison__Group__2__Impl8840);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4384:1: rule__BComparison__Group_2__0 : rule__BComparison__Group_2__0__Impl rule__BComparison__Group_2__1 ;
    public final void rule__BComparison__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4388:1: ( rule__BComparison__Group_2__0__Impl rule__BComparison__Group_2__1 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4389:2: rule__BComparison__Group_2__0__Impl rule__BComparison__Group_2__1
            {
            pushFollow(FOLLOW_rule__BComparison__Group_2__0__Impl_in_rule__BComparison__Group_2__08877);
            rule__BComparison__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BComparison__Group_2__1_in_rule__BComparison__Group_2__08880);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4396:1: rule__BComparison__Group_2__0__Impl : ( 'is' ) ;
    public final void rule__BComparison__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4400:1: ( ( 'is' ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4401:1: ( 'is' )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4401:1: ( 'is' )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4402:1: 'is'
            {
             before(grammarAccess.getBComparisonAccess().getIsKeyword_2_0()); 
            match(input,51,FOLLOW_51_in_rule__BComparison__Group_2__0__Impl8908); 
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4415:1: rule__BComparison__Group_2__1 : rule__BComparison__Group_2__1__Impl ;
    public final void rule__BComparison__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4419:1: ( rule__BComparison__Group_2__1__Impl )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4420:2: rule__BComparison__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__BComparison__Group_2__1__Impl_in_rule__BComparison__Group_2__18939);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4426:1: rule__BComparison__Group_2__1__Impl : ( ( rule__BComparison__BLiteralAssignment_2_1 ) ) ;
    public final void rule__BComparison__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4430:1: ( ( ( rule__BComparison__BLiteralAssignment_2_1 ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4431:1: ( ( rule__BComparison__BLiteralAssignment_2_1 ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4431:1: ( ( rule__BComparison__BLiteralAssignment_2_1 ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4432:1: ( rule__BComparison__BLiteralAssignment_2_1 )
            {
             before(grammarAccess.getBComparisonAccess().getBLiteralAssignment_2_1()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4433:1: ( rule__BComparison__BLiteralAssignment_2_1 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4433:2: rule__BComparison__BLiteralAssignment_2_1
            {
            pushFollow(FOLLOW_rule__BComparison__BLiteralAssignment_2_1_in_rule__BComparison__Group_2__1__Impl8966);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4447:1: rule__SingleEnumComparison__Group__0 : rule__SingleEnumComparison__Group__0__Impl rule__SingleEnumComparison__Group__1 ;
    public final void rule__SingleEnumComparison__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4451:1: ( rule__SingleEnumComparison__Group__0__Impl rule__SingleEnumComparison__Group__1 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4452:2: rule__SingleEnumComparison__Group__0__Impl rule__SingleEnumComparison__Group__1
            {
            pushFollow(FOLLOW_rule__SingleEnumComparison__Group__0__Impl_in_rule__SingleEnumComparison__Group__09000);
            rule__SingleEnumComparison__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SingleEnumComparison__Group__1_in_rule__SingleEnumComparison__Group__09003);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4459:1: rule__SingleEnumComparison__Group__0__Impl : ( ( rule__SingleEnumComparison__RefAssignment_0 ) ) ;
    public final void rule__SingleEnumComparison__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4463:1: ( ( ( rule__SingleEnumComparison__RefAssignment_0 ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4464:1: ( ( rule__SingleEnumComparison__RefAssignment_0 ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4464:1: ( ( rule__SingleEnumComparison__RefAssignment_0 ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4465:1: ( rule__SingleEnumComparison__RefAssignment_0 )
            {
             before(grammarAccess.getSingleEnumComparisonAccess().getRefAssignment_0()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4466:1: ( rule__SingleEnumComparison__RefAssignment_0 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4466:2: rule__SingleEnumComparison__RefAssignment_0
            {
            pushFollow(FOLLOW_rule__SingleEnumComparison__RefAssignment_0_in_rule__SingleEnumComparison__Group__0__Impl9030);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4476:1: rule__SingleEnumComparison__Group__1 : rule__SingleEnumComparison__Group__1__Impl rule__SingleEnumComparison__Group__2 ;
    public final void rule__SingleEnumComparison__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4480:1: ( rule__SingleEnumComparison__Group__1__Impl rule__SingleEnumComparison__Group__2 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4481:2: rule__SingleEnumComparison__Group__1__Impl rule__SingleEnumComparison__Group__2
            {
            pushFollow(FOLLOW_rule__SingleEnumComparison__Group__1__Impl_in_rule__SingleEnumComparison__Group__19060);
            rule__SingleEnumComparison__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SingleEnumComparison__Group__2_in_rule__SingleEnumComparison__Group__19063);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4488:1: rule__SingleEnumComparison__Group__1__Impl : ( '=' ) ;
    public final void rule__SingleEnumComparison__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4492:1: ( ( '=' ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4493:1: ( '=' )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4493:1: ( '=' )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4494:1: '='
            {
             before(grammarAccess.getSingleEnumComparisonAccess().getEqualsSignKeyword_1()); 
            match(input,28,FOLLOW_28_in_rule__SingleEnumComparison__Group__1__Impl9091); 
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4507:1: rule__SingleEnumComparison__Group__2 : rule__SingleEnumComparison__Group__2__Impl ;
    public final void rule__SingleEnumComparison__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4511:1: ( rule__SingleEnumComparison__Group__2__Impl )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4512:2: rule__SingleEnumComparison__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__SingleEnumComparison__Group__2__Impl_in_rule__SingleEnumComparison__Group__29122);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4518:1: rule__SingleEnumComparison__Group__2__Impl : ( ( rule__SingleEnumComparison__ELiteralAssignment_2 ) ) ;
    public final void rule__SingleEnumComparison__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4522:1: ( ( ( rule__SingleEnumComparison__ELiteralAssignment_2 ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4523:1: ( ( rule__SingleEnumComparison__ELiteralAssignment_2 ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4523:1: ( ( rule__SingleEnumComparison__ELiteralAssignment_2 ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4524:1: ( rule__SingleEnumComparison__ELiteralAssignment_2 )
            {
             before(grammarAccess.getSingleEnumComparisonAccess().getELiteralAssignment_2()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4525:1: ( rule__SingleEnumComparison__ELiteralAssignment_2 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4525:2: rule__SingleEnumComparison__ELiteralAssignment_2
            {
            pushFollow(FOLLOW_rule__SingleEnumComparison__ELiteralAssignment_2_in_rule__SingleEnumComparison__Group__2__Impl9149);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4541:1: rule__MultiEnumComparison__Group__0 : rule__MultiEnumComparison__Group__0__Impl rule__MultiEnumComparison__Group__1 ;
    public final void rule__MultiEnumComparison__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4545:1: ( rule__MultiEnumComparison__Group__0__Impl rule__MultiEnumComparison__Group__1 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4546:2: rule__MultiEnumComparison__Group__0__Impl rule__MultiEnumComparison__Group__1
            {
            pushFollow(FOLLOW_rule__MultiEnumComparison__Group__0__Impl_in_rule__MultiEnumComparison__Group__09185);
            rule__MultiEnumComparison__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__MultiEnumComparison__Group__1_in_rule__MultiEnumComparison__Group__09188);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4553:1: rule__MultiEnumComparison__Group__0__Impl : ( ( rule__MultiEnumComparison__RefAssignment_0 ) ) ;
    public final void rule__MultiEnumComparison__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4557:1: ( ( ( rule__MultiEnumComparison__RefAssignment_0 ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4558:1: ( ( rule__MultiEnumComparison__RefAssignment_0 ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4558:1: ( ( rule__MultiEnumComparison__RefAssignment_0 ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4559:1: ( rule__MultiEnumComparison__RefAssignment_0 )
            {
             before(grammarAccess.getMultiEnumComparisonAccess().getRefAssignment_0()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4560:1: ( rule__MultiEnumComparison__RefAssignment_0 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4560:2: rule__MultiEnumComparison__RefAssignment_0
            {
            pushFollow(FOLLOW_rule__MultiEnumComparison__RefAssignment_0_in_rule__MultiEnumComparison__Group__0__Impl9215);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4570:1: rule__MultiEnumComparison__Group__1 : rule__MultiEnumComparison__Group__1__Impl rule__MultiEnumComparison__Group__2 ;
    public final void rule__MultiEnumComparison__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4574:1: ( rule__MultiEnumComparison__Group__1__Impl rule__MultiEnumComparison__Group__2 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4575:2: rule__MultiEnumComparison__Group__1__Impl rule__MultiEnumComparison__Group__2
            {
            pushFollow(FOLLOW_rule__MultiEnumComparison__Group__1__Impl_in_rule__MultiEnumComparison__Group__19245);
            rule__MultiEnumComparison__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__MultiEnumComparison__Group__2_in_rule__MultiEnumComparison__Group__19248);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4582:1: rule__MultiEnumComparison__Group__1__Impl : ( ( rule__MultiEnumComparison__MembershipAssignment_1 ) ) ;
    public final void rule__MultiEnumComparison__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4586:1: ( ( ( rule__MultiEnumComparison__MembershipAssignment_1 ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4587:1: ( ( rule__MultiEnumComparison__MembershipAssignment_1 ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4587:1: ( ( rule__MultiEnumComparison__MembershipAssignment_1 ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4588:1: ( rule__MultiEnumComparison__MembershipAssignment_1 )
            {
             before(grammarAccess.getMultiEnumComparisonAccess().getMembershipAssignment_1()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4589:1: ( rule__MultiEnumComparison__MembershipAssignment_1 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4589:2: rule__MultiEnumComparison__MembershipAssignment_1
            {
            pushFollow(FOLLOW_rule__MultiEnumComparison__MembershipAssignment_1_in_rule__MultiEnumComparison__Group__1__Impl9275);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4599:1: rule__MultiEnumComparison__Group__2 : rule__MultiEnumComparison__Group__2__Impl ;
    public final void rule__MultiEnumComparison__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4603:1: ( rule__MultiEnumComparison__Group__2__Impl )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4604:2: rule__MultiEnumComparison__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__MultiEnumComparison__Group__2__Impl_in_rule__MultiEnumComparison__Group__29305);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4610:1: rule__MultiEnumComparison__Group__2__Impl : ( ( rule__MultiEnumComparison__ELiteralsAssignment_2 ) ) ;
    public final void rule__MultiEnumComparison__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4614:1: ( ( ( rule__MultiEnumComparison__ELiteralsAssignment_2 ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4615:1: ( ( rule__MultiEnumComparison__ELiteralsAssignment_2 ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4615:1: ( ( rule__MultiEnumComparison__ELiteralsAssignment_2 ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4616:1: ( rule__MultiEnumComparison__ELiteralsAssignment_2 )
            {
             before(grammarAccess.getMultiEnumComparisonAccess().getELiteralsAssignment_2()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4617:1: ( rule__MultiEnumComparison__ELiteralsAssignment_2 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4617:2: rule__MultiEnumComparison__ELiteralsAssignment_2
            {
            pushFollow(FOLLOW_rule__MultiEnumComparison__ELiteralsAssignment_2_in_rule__MultiEnumComparison__Group__2__Impl9332);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4633:1: rule__StringValueComparison__Group__0 : rule__StringValueComparison__Group__0__Impl rule__StringValueComparison__Group__1 ;
    public final void rule__StringValueComparison__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4637:1: ( rule__StringValueComparison__Group__0__Impl rule__StringValueComparison__Group__1 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4638:2: rule__StringValueComparison__Group__0__Impl rule__StringValueComparison__Group__1
            {
            pushFollow(FOLLOW_rule__StringValueComparison__Group__0__Impl_in_rule__StringValueComparison__Group__09368);
            rule__StringValueComparison__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__StringValueComparison__Group__1_in_rule__StringValueComparison__Group__09371);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4645:1: rule__StringValueComparison__Group__0__Impl : ( ( rule__StringValueComparison__RefAssignment_0 ) ) ;
    public final void rule__StringValueComparison__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4649:1: ( ( ( rule__StringValueComparison__RefAssignment_0 ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4650:1: ( ( rule__StringValueComparison__RefAssignment_0 ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4650:1: ( ( rule__StringValueComparison__RefAssignment_0 ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4651:1: ( rule__StringValueComparison__RefAssignment_0 )
            {
             before(grammarAccess.getStringValueComparisonAccess().getRefAssignment_0()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4652:1: ( rule__StringValueComparison__RefAssignment_0 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4652:2: rule__StringValueComparison__RefAssignment_0
            {
            pushFollow(FOLLOW_rule__StringValueComparison__RefAssignment_0_in_rule__StringValueComparison__Group__0__Impl9398);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4662:1: rule__StringValueComparison__Group__1 : rule__StringValueComparison__Group__1__Impl rule__StringValueComparison__Group__2 ;
    public final void rule__StringValueComparison__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4666:1: ( rule__StringValueComparison__Group__1__Impl rule__StringValueComparison__Group__2 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4667:2: rule__StringValueComparison__Group__1__Impl rule__StringValueComparison__Group__2
            {
            pushFollow(FOLLOW_rule__StringValueComparison__Group__1__Impl_in_rule__StringValueComparison__Group__19428);
            rule__StringValueComparison__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__StringValueComparison__Group__2_in_rule__StringValueComparison__Group__19431);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4674:1: rule__StringValueComparison__Group__1__Impl : ( 'equals' ) ;
    public final void rule__StringValueComparison__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4678:1: ( ( 'equals' ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4679:1: ( 'equals' )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4679:1: ( 'equals' )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4680:1: 'equals'
            {
             before(grammarAccess.getStringValueComparisonAccess().getEqualsKeyword_1()); 
            match(input,52,FOLLOW_52_in_rule__StringValueComparison__Group__1__Impl9459); 
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4693:1: rule__StringValueComparison__Group__2 : rule__StringValueComparison__Group__2__Impl ;
    public final void rule__StringValueComparison__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4697:1: ( rule__StringValueComparison__Group__2__Impl )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4698:2: rule__StringValueComparison__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__StringValueComparison__Group__2__Impl_in_rule__StringValueComparison__Group__29490);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4704:1: rule__StringValueComparison__Group__2__Impl : ( ( rule__StringValueComparison__TargetValueAssignment_2 ) ) ;
    public final void rule__StringValueComparison__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4708:1: ( ( ( rule__StringValueComparison__TargetValueAssignment_2 ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4709:1: ( ( rule__StringValueComparison__TargetValueAssignment_2 ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4709:1: ( ( rule__StringValueComparison__TargetValueAssignment_2 ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4710:1: ( rule__StringValueComparison__TargetValueAssignment_2 )
            {
             before(grammarAccess.getStringValueComparisonAccess().getTargetValueAssignment_2()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4711:1: ( rule__StringValueComparison__TargetValueAssignment_2 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4711:2: rule__StringValueComparison__TargetValueAssignment_2
            {
            pushFollow(FOLLOW_rule__StringValueComparison__TargetValueAssignment_2_in_rule__StringValueComparison__Group__2__Impl9517);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4727:1: rule__PresenceCheck__Group__0 : rule__PresenceCheck__Group__0__Impl rule__PresenceCheck__Group__1 ;
    public final void rule__PresenceCheck__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4731:1: ( rule__PresenceCheck__Group__0__Impl rule__PresenceCheck__Group__1 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4732:2: rule__PresenceCheck__Group__0__Impl rule__PresenceCheck__Group__1
            {
            pushFollow(FOLLOW_rule__PresenceCheck__Group__0__Impl_in_rule__PresenceCheck__Group__09553);
            rule__PresenceCheck__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__PresenceCheck__Group__1_in_rule__PresenceCheck__Group__09556);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4739:1: rule__PresenceCheck__Group__0__Impl : ( ( rule__PresenceCheck__RefAssignment_0 ) ) ;
    public final void rule__PresenceCheck__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4743:1: ( ( ( rule__PresenceCheck__RefAssignment_0 ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4744:1: ( ( rule__PresenceCheck__RefAssignment_0 ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4744:1: ( ( rule__PresenceCheck__RefAssignment_0 ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4745:1: ( rule__PresenceCheck__RefAssignment_0 )
            {
             before(grammarAccess.getPresenceCheckAccess().getRefAssignment_0()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4746:1: ( rule__PresenceCheck__RefAssignment_0 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4746:2: rule__PresenceCheck__RefAssignment_0
            {
            pushFollow(FOLLOW_rule__PresenceCheck__RefAssignment_0_in_rule__PresenceCheck__Group__0__Impl9583);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4756:1: rule__PresenceCheck__Group__1 : rule__PresenceCheck__Group__1__Impl ;
    public final void rule__PresenceCheck__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4760:1: ( rule__PresenceCheck__Group__1__Impl )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4761:2: rule__PresenceCheck__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__PresenceCheck__Group__1__Impl_in_rule__PresenceCheck__Group__19613);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4767:1: rule__PresenceCheck__Group__1__Impl : ( 'is-present' ) ;
    public final void rule__PresenceCheck__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4771:1: ( ( 'is-present' ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4772:1: ( 'is-present' )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4772:1: ( 'is-present' )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4773:1: 'is-present'
            {
             before(grammarAccess.getPresenceCheckAccess().getIsPresentKeyword_1()); 
            match(input,53,FOLLOW_53_in_rule__PresenceCheck__Group__1__Impl9641); 
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4790:1: rule__DirectEnumLiteralsCollection__Group__0 : rule__DirectEnumLiteralsCollection__Group__0__Impl rule__DirectEnumLiteralsCollection__Group__1 ;
    public final void rule__DirectEnumLiteralsCollection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4794:1: ( rule__DirectEnumLiteralsCollection__Group__0__Impl rule__DirectEnumLiteralsCollection__Group__1 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4795:2: rule__DirectEnumLiteralsCollection__Group__0__Impl rule__DirectEnumLiteralsCollection__Group__1
            {
            pushFollow(FOLLOW_rule__DirectEnumLiteralsCollection__Group__0__Impl_in_rule__DirectEnumLiteralsCollection__Group__09676);
            rule__DirectEnumLiteralsCollection__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DirectEnumLiteralsCollection__Group__1_in_rule__DirectEnumLiteralsCollection__Group__09679);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4802:1: rule__DirectEnumLiteralsCollection__Group__0__Impl : ( () ) ;
    public final void rule__DirectEnumLiteralsCollection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4806:1: ( ( () ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4807:1: ( () )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4807:1: ( () )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4808:1: ()
            {
             before(grammarAccess.getDirectEnumLiteralsCollectionAccess().getDirectEnumLiteralsCollectionAction_0()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4809:1: ()
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4811:1: 
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4821:1: rule__DirectEnumLiteralsCollection__Group__1 : rule__DirectEnumLiteralsCollection__Group__1__Impl rule__DirectEnumLiteralsCollection__Group__2 ;
    public final void rule__DirectEnumLiteralsCollection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4825:1: ( rule__DirectEnumLiteralsCollection__Group__1__Impl rule__DirectEnumLiteralsCollection__Group__2 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4826:2: rule__DirectEnumLiteralsCollection__Group__1__Impl rule__DirectEnumLiteralsCollection__Group__2
            {
            pushFollow(FOLLOW_rule__DirectEnumLiteralsCollection__Group__1__Impl_in_rule__DirectEnumLiteralsCollection__Group__19737);
            rule__DirectEnumLiteralsCollection__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DirectEnumLiteralsCollection__Group__2_in_rule__DirectEnumLiteralsCollection__Group__19740);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4833:1: rule__DirectEnumLiteralsCollection__Group__1__Impl : ( '(' ) ;
    public final void rule__DirectEnumLiteralsCollection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4837:1: ( ( '(' ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4838:1: ( '(' )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4838:1: ( '(' )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4839:1: '('
            {
             before(grammarAccess.getDirectEnumLiteralsCollectionAccess().getLeftParenthesisKeyword_1()); 
            match(input,33,FOLLOW_33_in_rule__DirectEnumLiteralsCollection__Group__1__Impl9768); 
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4852:1: rule__DirectEnumLiteralsCollection__Group__2 : rule__DirectEnumLiteralsCollection__Group__2__Impl rule__DirectEnumLiteralsCollection__Group__3 ;
    public final void rule__DirectEnumLiteralsCollection__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4856:1: ( rule__DirectEnumLiteralsCollection__Group__2__Impl rule__DirectEnumLiteralsCollection__Group__3 )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4857:2: rule__DirectEnumLiteralsCollection__Group__2__Impl rule__DirectEnumLiteralsCollection__Group__3
            {
            pushFollow(FOLLOW_rule__DirectEnumLiteralsCollection__Group__2__Impl_in_rule__DirectEnumLiteralsCollection__Group__29799);
            rule__DirectEnumLiteralsCollection__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DirectEnumLiteralsCollection__Group__3_in_rule__DirectEnumLiteralsCollection__Group__29802);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4864:1: rule__DirectEnumLiteralsCollection__Group__2__Impl : ( ( rule__DirectEnumLiteralsCollection__LiteralsAssignment_2 )* ) ;
    public final void rule__DirectEnumLiteralsCollection__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4868:1: ( ( ( rule__DirectEnumLiteralsCollection__LiteralsAssignment_2 )* ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4869:1: ( ( rule__DirectEnumLiteralsCollection__LiteralsAssignment_2 )* )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4869:1: ( ( rule__DirectEnumLiteralsCollection__LiteralsAssignment_2 )* )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4870:1: ( rule__DirectEnumLiteralsCollection__LiteralsAssignment_2 )*
            {
             before(grammarAccess.getDirectEnumLiteralsCollectionAccess().getLiteralsAssignment_2()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4871:1: ( rule__DirectEnumLiteralsCollection__LiteralsAssignment_2 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==RULE_ID) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4871:2: rule__DirectEnumLiteralsCollection__LiteralsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__DirectEnumLiteralsCollection__LiteralsAssignment_2_in_rule__DirectEnumLiteralsCollection__Group__2__Impl9829);
            	    rule__DirectEnumLiteralsCollection__LiteralsAssignment_2();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop35;
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4881:1: rule__DirectEnumLiteralsCollection__Group__3 : rule__DirectEnumLiteralsCollection__Group__3__Impl ;
    public final void rule__DirectEnumLiteralsCollection__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4885:1: ( rule__DirectEnumLiteralsCollection__Group__3__Impl )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4886:2: rule__DirectEnumLiteralsCollection__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__DirectEnumLiteralsCollection__Group__3__Impl_in_rule__DirectEnumLiteralsCollection__Group__39860);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4892:1: rule__DirectEnumLiteralsCollection__Group__3__Impl : ( ')' ) ;
    public final void rule__DirectEnumLiteralsCollection__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4896:1: ( ( ')' ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4897:1: ( ')' )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4897:1: ( ')' )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4898:1: ')'
            {
             before(grammarAccess.getDirectEnumLiteralsCollectionAccess().getRightParenthesisKeyword_3()); 
            match(input,34,FOLLOW_34_in_rule__DirectEnumLiteralsCollection__Group__3__Impl9888); 
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4920:1: rule__DynamicScreen__LabelAssignment_1 : ( ruleLabel ) ;
    public final void rule__DynamicScreen__LabelAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4924:1: ( ( ruleLabel ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4925:1: ( ruleLabel )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4925:1: ( ruleLabel )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4926:1: ruleLabel
            {
             before(grammarAccess.getDynamicScreenAccess().getLabelLabelParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleLabel_in_rule__DynamicScreen__LabelAssignment_19932);
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


    // $ANTLR start rule__DynamicScreen__ImportURIAssignment_4
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4935:1: rule__DynamicScreen__ImportURIAssignment_4 : ( RULE_STRING ) ;
    public final void rule__DynamicScreen__ImportURIAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4939:1: ( ( RULE_STRING ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4940:1: ( RULE_STRING )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4940:1: ( RULE_STRING )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4941:1: RULE_STRING
            {
             before(grammarAccess.getDynamicScreenAccess().getImportURISTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__DynamicScreen__ImportURIAssignment_49963); 
             after(grammarAccess.getDynamicScreenAccess().getImportURISTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DynamicScreen__ImportURIAssignment_4


    // $ANTLR start rule__DynamicScreen__ViewClassAssignment_7
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4950:1: rule__DynamicScreen__ViewClassAssignment_7 : ( ( RULE_ID ) ) ;
    public final void rule__DynamicScreen__ViewClassAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4954:1: ( ( ( RULE_ID ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4955:1: ( ( RULE_ID ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4955:1: ( ( RULE_ID ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4956:1: ( RULE_ID )
            {
             before(grammarAccess.getDynamicScreenAccess().getViewClassEntityCrossReference_7_0()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4957:1: ( RULE_ID )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4958:1: RULE_ID
            {
             before(grammarAccess.getDynamicScreenAccess().getViewClassEntityIDTerminalRuleCall_7_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DynamicScreen__ViewClassAssignment_79998); 
             after(grammarAccess.getDynamicScreenAccess().getViewClassEntityIDTerminalRuleCall_7_0_1()); 

            }

             after(grammarAccess.getDynamicScreenAccess().getViewClassEntityCrossReference_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DynamicScreen__ViewClassAssignment_7


    // $ANTLR start rule__DynamicScreen__DeclarationsAssignment_8
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4969:1: rule__DynamicScreen__DeclarationsAssignment_8 : ( ruleDeclaration ) ;
    public final void rule__DynamicScreen__DeclarationsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4973:1: ( ( ruleDeclaration ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4974:1: ( ruleDeclaration )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4974:1: ( ruleDeclaration )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4975:1: ruleDeclaration
            {
             before(grammarAccess.getDynamicScreenAccess().getDeclarationsDeclarationParserRuleCall_8_0()); 
            pushFollow(FOLLOW_ruleDeclaration_in_rule__DynamicScreen__DeclarationsAssignment_810033);
            ruleDeclaration();
            _fsp--;

             after(grammarAccess.getDynamicScreenAccess().getDeclarationsDeclarationParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DynamicScreen__DeclarationsAssignment_8


    // $ANTLR start rule__DynamicScreen__GroupsAssignment_9
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4984:1: rule__DynamicScreen__GroupsAssignment_9 : ( ruleFieldGroup ) ;
    public final void rule__DynamicScreen__GroupsAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4988:1: ( ( ruleFieldGroup ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4989:1: ( ruleFieldGroup )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4989:1: ( ruleFieldGroup )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4990:1: ruleFieldGroup
            {
             before(grammarAccess.getDynamicScreenAccess().getGroupsFieldGroupParserRuleCall_9_0()); 
            pushFollow(FOLLOW_ruleFieldGroup_in_rule__DynamicScreen__GroupsAssignment_910064);
            ruleFieldGroup();
            _fsp--;

             after(grammarAccess.getDynamicScreenAccess().getGroupsFieldGroupParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DynamicScreen__GroupsAssignment_9


    // $ANTLR start rule__Label__EnAssignment_0
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:4999:1: rule__Label__EnAssignment_0 : ( RULE_STRING ) ;
    public final void rule__Label__EnAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5003:1: ( ( RULE_STRING ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5004:1: ( RULE_STRING )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5004:1: ( RULE_STRING )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5005:1: RULE_STRING
            {
             before(grammarAccess.getLabelAccess().getEnSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Label__EnAssignment_010095); 
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5014:1: rule__Label__NlAssignment_1_1 : ( RULE_STRING ) ;
    public final void rule__Label__NlAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5018:1: ( ( RULE_STRING ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5019:1: ( RULE_STRING )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5019:1: ( RULE_STRING )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5020:1: RULE_STRING
            {
             before(grammarAccess.getLabelAccess().getNlSTRINGTerminalRuleCall_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Label__NlAssignment_1_110126); 
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5029:1: rule__PathTail__FieldAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__PathTail__FieldAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5033:1: ( ( ( RULE_ID ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5034:1: ( ( RULE_ID ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5034:1: ( ( RULE_ID ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5035:1: ( RULE_ID )
            {
             before(grammarAccess.getPathTailAccess().getFieldFieldCrossReference_1_0()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5036:1: ( RULE_ID )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5037:1: RULE_ID
            {
             before(grammarAccess.getPathTailAccess().getFieldFieldIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__PathTail__FieldAssignment_110161); 
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5048:1: rule__PathTail__AsEntityAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__PathTail__AsEntityAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5052:1: ( ( ( RULE_ID ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5053:1: ( ( RULE_ID ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5053:1: ( ( RULE_ID ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5054:1: ( RULE_ID )
            {
             before(grammarAccess.getPathTailAccess().getAsEntityEntityCrossReference_2_1_0()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5055:1: ( RULE_ID )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5056:1: RULE_ID
            {
             before(grammarAccess.getPathTailAccess().getAsEntityEntityIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__PathTail__AsEntityAssignment_2_110200); 
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5067:1: rule__PathTail__TailAssignment_3 : ( rulePathTail ) ;
    public final void rule__PathTail__TailAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5071:1: ( ( rulePathTail ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5072:1: ( rulePathTail )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5072:1: ( rulePathTail )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5073:1: rulePathTail
            {
             before(grammarAccess.getPathTailAccess().getTailPathTailParserRuleCall_3_0()); 
            pushFollow(FOLLOW_rulePathTail_in_rule__PathTail__TailAssignment_310235);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5082:1: rule__ExternalVariable__PathAssignment_1 : ( rulePathTail ) ;
    public final void rule__ExternalVariable__PathAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5086:1: ( ( rulePathTail ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5087:1: ( rulePathTail )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5087:1: ( rulePathTail )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5088:1: rulePathTail
            {
             before(grammarAccess.getExternalVariableAccess().getPathPathTailParserRuleCall_1_0()); 
            pushFollow(FOLLOW_rulePathTail_in_rule__ExternalVariable__PathAssignment_110266);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5097:1: rule__ExternalVariable__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__ExternalVariable__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5101:1: ( ( RULE_ID ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5102:1: ( RULE_ID )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5102:1: ( RULE_ID )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5103:1: RULE_ID
            {
             before(grammarAccess.getExternalVariableAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ExternalVariable__NameAssignment_310297); 
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5112:1: rule__EnumList__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__EnumList__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5116:1: ( ( RULE_ID ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5117:1: ( RULE_ID )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5117:1: ( RULE_ID )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5118:1: RULE_ID
            {
             before(grammarAccess.getEnumListAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumList__NameAssignment_110328); 
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5127:1: rule__EnumList__LiteralsAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__EnumList__LiteralsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5131:1: ( ( ( RULE_ID ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5132:1: ( ( RULE_ID ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5132:1: ( ( RULE_ID ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5133:1: ( RULE_ID )
            {
             before(grammarAccess.getEnumListAccess().getLiteralsEnumLiteralCrossReference_4_0()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5134:1: ( RULE_ID )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5135:1: RULE_ID
            {
             before(grammarAccess.getEnumListAccess().getLiteralsEnumLiteralIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumList__LiteralsAssignment_410363); 
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5146:1: rule__EnumList__EnumAssignment_7 : ( ( RULE_ID ) ) ;
    public final void rule__EnumList__EnumAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5150:1: ( ( ( RULE_ID ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5151:1: ( ( RULE_ID ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5151:1: ( ( RULE_ID ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5152:1: ( RULE_ID )
            {
             before(grammarAccess.getEnumListAccess().getEnumEnumerationCrossReference_7_0()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5153:1: ( RULE_ID )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5154:1: RULE_ID
            {
             before(grammarAccess.getEnumListAccess().getEnumEnumerationIDTerminalRuleCall_7_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumList__EnumAssignment_710402); 
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5165:1: rule__DataStore__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DataStore__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5169:1: ( ( RULE_ID ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5170:1: ( RULE_ID )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5170:1: ( RULE_ID )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5171:1: RULE_ID
            {
             before(grammarAccess.getDataStoreAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DataStore__NameAssignment_110437); 
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5180:1: rule__DataStore__ClassAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__DataStore__ClassAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5184:1: ( ( ( RULE_ID ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5185:1: ( ( RULE_ID ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5185:1: ( ( RULE_ID ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5186:1: ( RULE_ID )
            {
             before(grammarAccess.getDataStoreAccess().getClassEntityCrossReference_3_0()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5187:1: ( RULE_ID )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5188:1: RULE_ID
            {
             before(grammarAccess.getDataStoreAccess().getClassEntityIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DataStore__ClassAssignment_310472); 
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5199:1: rule__DataStore__MultiAssignment_4 : ( ( 'is-multi-valued' ) ) ;
    public final void rule__DataStore__MultiAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5203:1: ( ( ( 'is-multi-valued' ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5204:1: ( ( 'is-multi-valued' ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5204:1: ( ( 'is-multi-valued' ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5205:1: ( 'is-multi-valued' )
            {
             before(grammarAccess.getDataStoreAccess().getMultiIsMultiValuedKeyword_4_0()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5206:1: ( 'is-multi-valued' )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5207:1: 'is-multi-valued'
            {
             before(grammarAccess.getDataStoreAccess().getMultiIsMultiValuedKeyword_4_0()); 
            match(input,54,FOLLOW_54_in_rule__DataStore__MultiAssignment_410512); 
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5222:1: rule__Field__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Field__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5226:1: ( ( RULE_ID ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5227:1: ( RULE_ID )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5227:1: ( RULE_ID )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5228:1: RULE_ID
            {
             before(grammarAccess.getFieldAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Field__NameAssignment_010551); 
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5237:1: rule__Field__LabelAssignment_1 : ( ruleLabel ) ;
    public final void rule__Field__LabelAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5241:1: ( ( ruleLabel ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5242:1: ( ruleLabel )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5242:1: ( ruleLabel )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5243:1: ruleLabel
            {
             before(grammarAccess.getFieldAccess().getLabelLabelParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleLabel_in_rule__Field__LabelAssignment_110582);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5252:1: rule__Field__PathAssignment_2 : ( rulePathTail ) ;
    public final void rule__Field__PathAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5256:1: ( ( rulePathTail ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5257:1: ( rulePathTail )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5257:1: ( rulePathTail )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5258:1: rulePathTail
            {
             before(grammarAccess.getFieldAccess().getPathPathTailParserRuleCall_2_0()); 
            pushFollow(FOLLOW_rulePathTail_in_rule__Field__PathAssignment_210613);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5267:1: rule__Field__AttributesAssignment_3 : ( ruleAttribute ) ;
    public final void rule__Field__AttributesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5271:1: ( ( ruleAttribute ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5272:1: ( ruleAttribute )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5272:1: ( ruleAttribute )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5273:1: ruleAttribute
            {
             before(grammarAccess.getFieldAccess().getAttributesAttributeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleAttribute_in_rule__Field__AttributesAssignment_310644);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5282:1: rule__FieldGroup__LabelAssignment_1 : ( ruleLabel ) ;
    public final void rule__FieldGroup__LabelAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5286:1: ( ( ruleLabel ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5287:1: ( ruleLabel )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5287:1: ( ruleLabel )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5288:1: ruleLabel
            {
             before(grammarAccess.getFieldGroupAccess().getLabelLabelParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleLabel_in_rule__FieldGroup__LabelAssignment_110675);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5297:1: rule__FieldGroup__WithAssignment_2_1 : ( rulePathTail ) ;
    public final void rule__FieldGroup__WithAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5301:1: ( ( rulePathTail ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5302:1: ( rulePathTail )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5302:1: ( rulePathTail )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5303:1: rulePathTail
            {
             before(grammarAccess.getFieldGroupAccess().getWithPathTailParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_rulePathTail_in_rule__FieldGroup__WithAssignment_2_110706);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5312:1: rule__FieldGroup__ElementsAssignment_4 : ( ruleGroupElement ) ;
    public final void rule__FieldGroup__ElementsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5316:1: ( ( ruleGroupElement ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5317:1: ( ruleGroupElement )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5317:1: ( ruleGroupElement )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5318:1: ruleGroupElement
            {
             before(grammarAccess.getFieldGroupAccess().getElementsGroupElementParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleGroupElement_in_rule__FieldGroup__ElementsAssignment_410737);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5327:1: rule__FieldGroup__AttributesAssignment_6 : ( ruleAttribute ) ;
    public final void rule__FieldGroup__AttributesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5331:1: ( ( ruleAttribute ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5332:1: ( ruleAttribute )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5332:1: ( ruleAttribute )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5333:1: ruleAttribute
            {
             before(grammarAccess.getFieldGroupAccess().getAttributesAttributeParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleAttribute_in_rule__FieldGroup__AttributesAssignment_610768);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5342:1: rule__NormalAttribute__ClassExprAssignment_0 : ( ruleAttributeClassExpression ) ;
    public final void rule__NormalAttribute__ClassExprAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5346:1: ( ( ruleAttributeClassExpression ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5347:1: ( ruleAttributeClassExpression )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5347:1: ( ruleAttributeClassExpression )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5348:1: ruleAttributeClassExpression
            {
             before(grammarAccess.getNormalAttributeAccess().getClassExprAttributeClassExpressionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleAttributeClassExpression_in_rule__NormalAttribute__ClassExprAssignment_010799);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5357:1: rule__NormalAttribute__ClauseAssignment_1_1 : ( ruleBExpression ) ;
    public final void rule__NormalAttribute__ClauseAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5361:1: ( ( ruleBExpression ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5362:1: ( ruleBExpression )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5362:1: ( ruleBExpression )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5363:1: ruleBExpression
            {
             before(grammarAccess.getNormalAttributeAccess().getClauseBExpressionParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleBExpression_in_rule__NormalAttribute__ClauseAssignment_1_110830);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5372:1: rule__AttributeClassExpression__ClassesAssignment_0 : ( ruleAttributeClass ) ;
    public final void rule__AttributeClassExpression__ClassesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5376:1: ( ( ruleAttributeClass ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5377:1: ( ruleAttributeClass )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5377:1: ( ruleAttributeClass )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5378:1: ruleAttributeClass
            {
             before(grammarAccess.getAttributeClassExpressionAccess().getClassesAttributeClassEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleAttributeClass_in_rule__AttributeClassExpression__ClassesAssignment_010861);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5387:1: rule__AttributeClassExpression__ClassesAssignment_1_1 : ( ruleAttributeClass ) ;
    public final void rule__AttributeClassExpression__ClassesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5391:1: ( ( ruleAttributeClass ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5392:1: ( ruleAttributeClass )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5392:1: ( ruleAttributeClass )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5393:1: ruleAttributeClass
            {
             before(grammarAccess.getAttributeClassExpressionAccess().getClassesAttributeClassEnumRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleAttributeClass_in_rule__AttributeClassExpression__ClassesAssignment_1_110892);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5402:1: rule__RestrictionAttribute__LiteralsAssignment_1 : ( ruleEnumLiteralsCollection ) ;
    public final void rule__RestrictionAttribute__LiteralsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5406:1: ( ( ruleEnumLiteralsCollection ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5407:1: ( ruleEnumLiteralsCollection )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5407:1: ( ruleEnumLiteralsCollection )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5408:1: ruleEnumLiteralsCollection
            {
             before(grammarAccess.getRestrictionAttributeAccess().getLiteralsEnumLiteralsCollectionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleEnumLiteralsCollection_in_rule__RestrictionAttribute__LiteralsAssignment_110923);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5417:1: rule__RestrictionAttribute__ClauseAssignment_3 : ( ruleBExpression ) ;
    public final void rule__RestrictionAttribute__ClauseAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5421:1: ( ( ruleBExpression ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5422:1: ( ruleBExpression )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5422:1: ( ruleBExpression )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5423:1: ruleBExpression
            {
             before(grammarAccess.getRestrictionAttributeAccess().getClauseBExpressionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleBExpression_in_rule__RestrictionAttribute__ClauseAssignment_310954);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5432:1: rule__RestrictionGroupAttribute__RulesAssignment_3 : ( ruleRestrictionRule ) ;
    public final void rule__RestrictionGroupAttribute__RulesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5436:1: ( ( ruleRestrictionRule ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5437:1: ( ruleRestrictionRule )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5437:1: ( ruleRestrictionRule )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5438:1: ruleRestrictionRule
            {
             before(grammarAccess.getRestrictionGroupAttributeAccess().getRulesRestrictionRuleParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleRestrictionRule_in_rule__RestrictionGroupAttribute__RulesAssignment_310985);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5447:1: rule__RestrictionRule__LiteralsAssignment_0 : ( ruleEnumLiteralsCollection ) ;
    public final void rule__RestrictionRule__LiteralsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5451:1: ( ( ruleEnumLiteralsCollection ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5452:1: ( ruleEnumLiteralsCollection )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5452:1: ( ruleEnumLiteralsCollection )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5453:1: ruleEnumLiteralsCollection
            {
             before(grammarAccess.getRestrictionRuleAccess().getLiteralsEnumLiteralsCollectionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleEnumLiteralsCollection_in_rule__RestrictionRule__LiteralsAssignment_011016);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5462:1: rule__RestrictionRule__ClauseAssignment_2 : ( ruleBExpression ) ;
    public final void rule__RestrictionRule__ClauseAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5466:1: ( ( ruleBExpression ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5467:1: ( ruleBExpression )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5467:1: ( ruleBExpression )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5468:1: ruleBExpression
            {
             before(grammarAccess.getRestrictionRuleAccess().getClauseBExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleBExpression_in_rule__RestrictionRule__ClauseAssignment_211047);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5477:1: rule__Reference__RefAssignment : ( ( RULE_ID ) ) ;
    public final void rule__Reference__RefAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5481:1: ( ( ( RULE_ID ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5482:1: ( ( RULE_ID ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5482:1: ( ( RULE_ID ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5483:1: ( RULE_ID )
            {
             before(grammarAccess.getReferenceAccess().getRefReferenceTargetCrossReference_0()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5484:1: ( RULE_ID )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5485:1: RULE_ID
            {
             before(grammarAccess.getReferenceAccess().getRefReferenceTargetIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Reference__RefAssignment11082); 
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5496:1: rule__BOrExpression__RightAssignment_1_2 : ( ruleBAndExpression ) ;
    public final void rule__BOrExpression__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5500:1: ( ( ruleBAndExpression ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5501:1: ( ruleBAndExpression )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5501:1: ( ruleBAndExpression )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5502:1: ruleBAndExpression
            {
             before(grammarAccess.getBOrExpressionAccess().getRightBAndExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleBAndExpression_in_rule__BOrExpression__RightAssignment_1_211117);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5511:1: rule__BAndExpression__RightAssignment_1_2 : ( ruleNegationExpression ) ;
    public final void rule__BAndExpression__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5515:1: ( ( ruleNegationExpression ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5516:1: ( ruleNegationExpression )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5516:1: ( ruleNegationExpression )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5517:1: ruleNegationExpression
            {
             before(grammarAccess.getBAndExpressionAccess().getRightNegationExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleNegationExpression_in_rule__BAndExpression__RightAssignment_1_211148);
            ruleNegationExpression();
            _fsp--;

             after(grammarAccess.getBAndExpressionAccess().getRightNegationExpressionParserRuleCall_1_2_0()); 

            }


            }

        }
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


    // $ANTLR start rule__NegationExpression__ExprAssignment_1_2
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5526:1: rule__NegationExpression__ExprAssignment_1_2 : ( ruleNegationExpression ) ;
    public final void rule__NegationExpression__ExprAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5530:1: ( ( ruleNegationExpression ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5531:1: ( ruleNegationExpression )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5531:1: ( ruleNegationExpression )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5532:1: ruleNegationExpression
            {
             before(grammarAccess.getNegationExpressionAccess().getExprNegationExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleNegationExpression_in_rule__NegationExpression__ExprAssignment_1_211179);
            ruleNegationExpression();
            _fsp--;

             after(grammarAccess.getNegationExpressionAccess().getExprNegationExpressionParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__NegationExpression__ExprAssignment_1_2


    // $ANTLR start rule__BComparison__RefAssignment_1
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5541:1: rule__BComparison__RefAssignment_1 : ( ruleReference ) ;
    public final void rule__BComparison__RefAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5545:1: ( ( ruleReference ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5546:1: ( ruleReference )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5546:1: ( ruleReference )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5547:1: ruleReference
            {
             before(grammarAccess.getBComparisonAccess().getRefReferenceParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleReference_in_rule__BComparison__RefAssignment_111210);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5556:1: rule__BComparison__BLiteralAssignment_2_1 : ( ruleBLiteral ) ;
    public final void rule__BComparison__BLiteralAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5560:1: ( ( ruleBLiteral ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5561:1: ( ruleBLiteral )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5561:1: ( ruleBLiteral )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5562:1: ruleBLiteral
            {
             before(grammarAccess.getBComparisonAccess().getBLiteralBLiteralEnumRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleBLiteral_in_rule__BComparison__BLiteralAssignment_2_111241);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5571:1: rule__SingleEnumComparison__RefAssignment_0 : ( ruleReference ) ;
    public final void rule__SingleEnumComparison__RefAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5575:1: ( ( ruleReference ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5576:1: ( ruleReference )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5576:1: ( ruleReference )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5577:1: ruleReference
            {
             before(grammarAccess.getSingleEnumComparisonAccess().getRefReferenceParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleReference_in_rule__SingleEnumComparison__RefAssignment_011272);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5586:1: rule__SingleEnumComparison__ELiteralAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__SingleEnumComparison__ELiteralAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5590:1: ( ( ( RULE_ID ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5591:1: ( ( RULE_ID ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5591:1: ( ( RULE_ID ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5592:1: ( RULE_ID )
            {
             before(grammarAccess.getSingleEnumComparisonAccess().getELiteralEnumLiteralCrossReference_2_0()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5593:1: ( RULE_ID )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5594:1: RULE_ID
            {
             before(grammarAccess.getSingleEnumComparisonAccess().getELiteralEnumLiteralIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SingleEnumComparison__ELiteralAssignment_211307); 
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5605:1: rule__MultiEnumComparison__RefAssignment_0 : ( ruleReference ) ;
    public final void rule__MultiEnumComparison__RefAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5609:1: ( ( ruleReference ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5610:1: ( ruleReference )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5610:1: ( ruleReference )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5611:1: ruleReference
            {
             before(grammarAccess.getMultiEnumComparisonAccess().getRefReferenceParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleReference_in_rule__MultiEnumComparison__RefAssignment_011342);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5620:1: rule__MultiEnumComparison__MembershipAssignment_1 : ( ruleEnumMembership ) ;
    public final void rule__MultiEnumComparison__MembershipAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5624:1: ( ( ruleEnumMembership ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5625:1: ( ruleEnumMembership )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5625:1: ( ruleEnumMembership )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5626:1: ruleEnumMembership
            {
             before(grammarAccess.getMultiEnumComparisonAccess().getMembershipEnumMembershipEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleEnumMembership_in_rule__MultiEnumComparison__MembershipAssignment_111373);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5635:1: rule__MultiEnumComparison__ELiteralsAssignment_2 : ( ruleEnumLiteralsCollection ) ;
    public final void rule__MultiEnumComparison__ELiteralsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5639:1: ( ( ruleEnumLiteralsCollection ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5640:1: ( ruleEnumLiteralsCollection )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5640:1: ( ruleEnumLiteralsCollection )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5641:1: ruleEnumLiteralsCollection
            {
             before(grammarAccess.getMultiEnumComparisonAccess().getELiteralsEnumLiteralsCollectionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleEnumLiteralsCollection_in_rule__MultiEnumComparison__ELiteralsAssignment_211404);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5650:1: rule__StringValueComparison__RefAssignment_0 : ( ruleReference ) ;
    public final void rule__StringValueComparison__RefAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5654:1: ( ( ruleReference ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5655:1: ( ruleReference )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5655:1: ( ruleReference )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5656:1: ruleReference
            {
             before(grammarAccess.getStringValueComparisonAccess().getRefReferenceParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleReference_in_rule__StringValueComparison__RefAssignment_011435);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5665:1: rule__StringValueComparison__TargetValueAssignment_2 : ( RULE_STRING ) ;
    public final void rule__StringValueComparison__TargetValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5669:1: ( ( RULE_STRING ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5670:1: ( RULE_STRING )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5670:1: ( RULE_STRING )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5671:1: RULE_STRING
            {
             before(grammarAccess.getStringValueComparisonAccess().getTargetValueSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__StringValueComparison__TargetValueAssignment_211466); 
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5680:1: rule__PresenceCheck__RefAssignment_0 : ( ruleReference ) ;
    public final void rule__PresenceCheck__RefAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5684:1: ( ( ruleReference ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5685:1: ( ruleReference )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5685:1: ( ruleReference )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5686:1: ruleReference
            {
             before(grammarAccess.getPresenceCheckAccess().getRefReferenceParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleReference_in_rule__PresenceCheck__RefAssignment_011497);
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5695:1: rule__DirectEnumLiteralsCollection__LiteralsAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__DirectEnumLiteralsCollection__LiteralsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5699:1: ( ( ( RULE_ID ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5700:1: ( ( RULE_ID ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5700:1: ( ( RULE_ID ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5701:1: ( RULE_ID )
            {
             before(grammarAccess.getDirectEnumLiteralsCollectionAccess().getLiteralsEnumLiteralCrossReference_2_0()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5702:1: ( RULE_ID )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5703:1: RULE_ID
            {
             before(grammarAccess.getDirectEnumLiteralsCollectionAccess().getLiteralsEnumLiteralIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DirectEnumLiteralsCollection__LiteralsAssignment_211532); 
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
    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5714:1: rule__EnumListReference__RefAssignment : ( ( RULE_ID ) ) ;
    public final void rule__EnumListReference__RefAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5718:1: ( ( ( RULE_ID ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5719:1: ( ( RULE_ID ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5719:1: ( ( RULE_ID ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5720:1: ( RULE_ID )
            {
             before(grammarAccess.getEnumListReferenceAccess().getRefEnumListCrossReference_0()); 
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5721:1: ( RULE_ID )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5722:1: RULE_ID
            {
             before(grammarAccess.getEnumListReferenceAccess().getRefEnumListIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumListReference__RefAssignment11571); 
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
    public static final BitSet FOLLOW_ruleLabel_in_entryRuleLabel121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLabel128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Label__Group__0_in_ruleLabel154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePathTail_in_entryRulePathTail181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePathTail188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PathTail__Group__0_in_rulePathTail214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_entryRuleDeclaration241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeclaration248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Alternatives_in_ruleDeclaration274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExternalVariable_in_entryRuleExternalVariable301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExternalVariable308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalVariable__Group__0_in_ruleExternalVariable334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumList_in_entryRuleEnumList361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumList368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumList__Group__0_in_ruleEnumList394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataStore_in_entryRuleDataStore421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataStore428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataStore__Group__0_in_ruleDataStore454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGroupElement_in_entryRuleGroupElement481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGroupElement488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GroupElement__Alternatives_in_ruleGroupElement514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_in_entryRuleField541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleField548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__0_in_ruleField574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldGroup_in_entryRuleFieldGroup601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFieldGroup608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldGroup__Group__0_in_ruleFieldGroup634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Alternatives_in_ruleAttribute694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumFieldAttribute_in_entryRuleEnumFieldAttribute721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumFieldAttribute728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumFieldAttribute__Alternatives_in_ruleEnumFieldAttribute754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNormalAttribute_in_entryRuleNormalAttribute781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNormalAttribute788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NormalAttribute__Group__0_in_ruleNormalAttribute814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeClassExpression_in_entryRuleAttributeClassExpression841 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributeClassExpression848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeClassExpression__Group__0_in_ruleAttributeClassExpression874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRestrictionAttribute_in_entryRuleRestrictionAttribute901 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRestrictionAttribute908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RestrictionAttribute__Group__0_in_ruleRestrictionAttribute934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRestrictionGroupAttribute_in_entryRuleRestrictionGroupAttribute961 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRestrictionGroupAttribute968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RestrictionGroupAttribute__Group__0_in_ruleRestrictionGroupAttribute994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRestrictionRule_in_entryRuleRestrictionRule1021 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRestrictionRule1028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RestrictionRule__Group__0_in_ruleRestrictionRule1054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReferenceTarget_in_entryRuleReferenceTarget1081 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReferenceTarget1088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReferenceTarget__Alternatives_in_ruleReferenceTarget1114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_entryRuleReference1141 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReference1148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__RefAssignment_in_ruleReference1174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBExpression_in_entryRuleBExpression1203 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBExpression1210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBOrExpression_in_ruleBExpression1236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBOrExpression_in_entryRuleBOrExpression1262 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBOrExpression1269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BOrExpression__Group__0_in_ruleBOrExpression1295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBAndExpression_in_entryRuleBAndExpression1322 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBAndExpression1329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BAndExpression__Group__0_in_ruleBAndExpression1355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNegationExpression_in_entryRuleNegationExpression1382 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNegationExpression1389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NegationExpression__Alternatives_in_ruleNegationExpression1415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminalBExpression_in_entryRuleTerminalBExpression1442 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTerminalBExpression1449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalBExpression__Alternatives_in_ruleTerminalBExpression1475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicReferringBExpression_in_entryRuleAtomicReferringBExpression1502 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtomicReferringBExpression1509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicReferringBExpression__Alternatives_in_ruleAtomicReferringBExpression1535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBComparison_in_entryRuleBComparison1562 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBComparison1569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BComparison__Group__0_in_ruleBComparison1595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumComparison_in_entryRuleEnumComparison1622 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumComparison1629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumComparison__Alternatives_in_ruleEnumComparison1655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleEnumComparison_in_entryRuleSingleEnumComparison1682 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSingleEnumComparison1689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SingleEnumComparison__Group__0_in_ruleSingleEnumComparison1715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiEnumComparison_in_entryRuleMultiEnumComparison1742 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiEnumComparison1749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiEnumComparison__Group__0_in_ruleMultiEnumComparison1775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValueComparison_in_entryRuleStringValueComparison1802 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringValueComparison1809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringValueComparison__Group__0_in_ruleStringValueComparison1835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePresenceCheck_in_entryRulePresenceCheck1862 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePresenceCheck1869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PresenceCheck__Group__0_in_rulePresenceCheck1895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumLiteralsCollection_in_entryRuleEnumLiteralsCollection1922 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumLiteralsCollection1929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumLiteralsCollection__Alternatives_in_ruleEnumLiteralsCollection1955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDirectEnumLiteralsCollection_in_entryRuleDirectEnumLiteralsCollection1982 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDirectEnumLiteralsCollection1989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DirectEnumLiteralsCollection__Group__0_in_ruleDirectEnumLiteralsCollection2015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumListReference_in_entryRuleEnumListReference2042 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumListReference2049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumListReference__RefAssignment_in_ruleEnumListReference2075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeClass__Alternatives_in_ruleAttributeClass2112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BLiteral__Alternatives_in_ruleBLiteral2148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumMembership__Alternatives_in_ruleEnumMembership2184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExternalVariable_in_rule__Declaration__Alternatives2219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumList_in_rule__Declaration__Alternatives2236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataStore_in_rule__Declaration__Alternatives2253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_in_rule__GroupElement__Alternatives2285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldGroup_in_rule__GroupElement__Alternatives2302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNormalAttribute_in_rule__Attribute__Alternatives2334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumFieldAttribute_in_rule__Attribute__Alternatives2351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRestrictionAttribute_in_rule__EnumFieldAttribute__Alternatives2383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRestrictionGroupAttribute_in_rule__EnumFieldAttribute__Alternatives2400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_in_rule__ReferenceTarget__Alternatives2432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExternalVariable_in_rule__ReferenceTarget__Alternatives2449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__BOrExpression__Alternatives_1_12483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__BOrExpression__Alternatives_1_12503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__BAndExpression__Alternatives_1_12538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__BAndExpression__Alternatives_1_12558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminalBExpression_in_rule__NegationExpression__Alternatives2592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NegationExpression__Group_1__0_in_rule__NegationExpression__Alternatives2609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__NegationExpression__Alternatives_1_12643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__NegationExpression__Alternatives_1_12663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicReferringBExpression_in_rule__TerminalBExpression__Alternatives2697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalBExpression__Group_1__0_in_rule__TerminalBExpression__Alternatives2714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBComparison_in_rule__AtomicReferringBExpression__Alternatives2747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumComparison_in_rule__AtomicReferringBExpression__Alternatives2764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValueComparison_in_rule__AtomicReferringBExpression__Alternatives2781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePresenceCheck_in_rule__AtomicReferringBExpression__Alternatives2798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleEnumComparison_in_rule__EnumComparison__Alternatives2830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiEnumComparison_in_rule__EnumComparison__Alternatives2847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDirectEnumLiteralsCollection_in_rule__EnumLiteralsCollection__Alternatives2879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumListReference_in_rule__EnumLiteralsCollection__Alternatives2896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__AttributeClass__Alternatives2929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__AttributeClass__Alternatives2950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__AttributeClass__Alternatives2971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__AttributeClass__Alternatives2992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__AttributeClass__Alternatives3013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__BLiteral__Alternatives3049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__BLiteral__Alternatives3070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__EnumMembership__Alternatives3106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__EnumMembership__Alternatives3127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DynamicScreen__Group__0__Impl_in_rule__DynamicScreen__Group__03160 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DynamicScreen__Group__1_in_rule__DynamicScreen__Group__03163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__DynamicScreen__Group__0__Impl3191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DynamicScreen__Group__1__Impl_in_rule__DynamicScreen__Group__13222 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__DynamicScreen__Group__2_in_rule__DynamicScreen__Group__13225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DynamicScreen__LabelAssignment_1_in_rule__DynamicScreen__Group__1__Impl3252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DynamicScreen__Group__2__Impl_in_rule__DynamicScreen__Group__23282 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__DynamicScreen__Group__3_in_rule__DynamicScreen__Group__23285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__DynamicScreen__Group__2__Impl3313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DynamicScreen__Group__3__Impl_in_rule__DynamicScreen__Group__33344 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DynamicScreen__Group__4_in_rule__DynamicScreen__Group__33347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__DynamicScreen__Group__3__Impl3375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DynamicScreen__Group__4__Impl_in_rule__DynamicScreen__Group__43406 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__DynamicScreen__Group__5_in_rule__DynamicScreen__Group__43409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DynamicScreen__ImportURIAssignment_4_in_rule__DynamicScreen__Group__4__Impl3436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DynamicScreen__Group__5__Impl_in_rule__DynamicScreen__Group__53466 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__DynamicScreen__Group__6_in_rule__DynamicScreen__Group__53469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__DynamicScreen__Group__5__Impl3497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DynamicScreen__Group__6__Impl_in_rule__DynamicScreen__Group__63528 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__DynamicScreen__Group__7_in_rule__DynamicScreen__Group__63531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__DynamicScreen__Group__6__Impl3559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DynamicScreen__Group__7__Impl_in_rule__DynamicScreen__Group__73590 = new BitSet(new long[]{0x000002A800000000L});
    public static final BitSet FOLLOW_rule__DynamicScreen__Group__8_in_rule__DynamicScreen__Group__73593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DynamicScreen__ViewClassAssignment_7_in_rule__DynamicScreen__Group__7__Impl3620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DynamicScreen__Group__8__Impl_in_rule__DynamicScreen__Group__83650 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__DynamicScreen__Group__9_in_rule__DynamicScreen__Group__83653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DynamicScreen__DeclarationsAssignment_8_in_rule__DynamicScreen__Group__8__Impl3680 = new BitSet(new long[]{0x000000A800000002L});
    public static final BitSet FOLLOW_rule__DynamicScreen__Group__9__Impl_in_rule__DynamicScreen__Group__93711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DynamicScreen__GroupsAssignment_9_in_rule__DynamicScreen__Group__9__Impl3740 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_rule__DynamicScreen__GroupsAssignment_9_in_rule__DynamicScreen__Group__9__Impl3752 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_rule__Label__Group__0__Impl_in_rule__Label__Group__03805 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_rule__Label__Group__1_in_rule__Label__Group__03808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Label__EnAssignment_0_in_rule__Label__Group__0__Impl3835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Label__Group__1__Impl_in_rule__Label__Group__13865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Label__Group_1__0_in_rule__Label__Group__1__Impl3892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Label__Group_1__0__Impl_in_rule__Label__Group_1__03927 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Label__Group_1__1_in_rule__Label__Group_1__03930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Label__Group_1__0__Impl3958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Label__Group_1__1__Impl_in_rule__Label__Group_1__13989 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Label__Group_1__2_in_rule__Label__Group_1__13992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Label__NlAssignment_1_1_in_rule__Label__Group_1__1__Impl4019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Label__Group_1__2__Impl_in_rule__Label__Group_1__24049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Label__Group_1__2__Impl4077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PathTail__Group__0__Impl_in_rule__PathTail__Group__04114 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__PathTail__Group__1_in_rule__PathTail__Group__04117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__PathTail__Group__0__Impl4145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PathTail__Group__1__Impl_in_rule__PathTail__Group__14176 = new BitSet(new long[]{0x0000000300000002L});
    public static final BitSet FOLLOW_rule__PathTail__Group__2_in_rule__PathTail__Group__14179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PathTail__FieldAssignment_1_in_rule__PathTail__Group__1__Impl4206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PathTail__Group__2__Impl_in_rule__PathTail__Group__24236 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_rule__PathTail__Group__3_in_rule__PathTail__Group__24239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PathTail__Group_2__0_in_rule__PathTail__Group__2__Impl4266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PathTail__Group__3__Impl_in_rule__PathTail__Group__34297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PathTail__TailAssignment_3_in_rule__PathTail__Group__3__Impl4324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PathTail__Group_2__0__Impl_in_rule__PathTail__Group_2__04363 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__PathTail__Group_2__1_in_rule__PathTail__Group_2__04366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__PathTail__Group_2__0__Impl4394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PathTail__Group_2__1__Impl_in_rule__PathTail__Group_2__14425 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__PathTail__Group_2__2_in_rule__PathTail__Group_2__14428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PathTail__AsEntityAssignment_2_1_in_rule__PathTail__Group_2__1__Impl4455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PathTail__Group_2__2__Impl_in_rule__PathTail__Group_2__24485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__PathTail__Group_2__2__Impl4513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalVariable__Group__0__Impl_in_rule__ExternalVariable__Group__04550 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__ExternalVariable__Group__1_in_rule__ExternalVariable__Group__04553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__ExternalVariable__Group__0__Impl4581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalVariable__Group__1__Impl_in_rule__ExternalVariable__Group__14612 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__ExternalVariable__Group__2_in_rule__ExternalVariable__Group__14615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalVariable__PathAssignment_1_in_rule__ExternalVariable__Group__1__Impl4642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalVariable__Group__2__Impl_in_rule__ExternalVariable__Group__24672 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ExternalVariable__Group__3_in_rule__ExternalVariable__Group__24675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__ExternalVariable__Group__2__Impl4703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalVariable__Group__3__Impl_in_rule__ExternalVariable__Group__34734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalVariable__NameAssignment_3_in_rule__ExternalVariable__Group__3__Impl4761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumList__Group__0__Impl_in_rule__EnumList__Group__04799 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__EnumList__Group__1_in_rule__EnumList__Group__04802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__EnumList__Group__0__Impl4830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumList__Group__1__Impl_in_rule__EnumList__Group__14861 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__EnumList__Group__2_in_rule__EnumList__Group__14864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumList__NameAssignment_1_in_rule__EnumList__Group__1__Impl4891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumList__Group__2__Impl_in_rule__EnumList__Group__24921 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__EnumList__Group__3_in_rule__EnumList__Group__24924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__EnumList__Group__2__Impl4952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumList__Group__3__Impl_in_rule__EnumList__Group__34983 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__EnumList__Group__4_in_rule__EnumList__Group__34986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__EnumList__Group__3__Impl5014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumList__Group__4__Impl_in_rule__EnumList__Group__45045 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__EnumList__Group__5_in_rule__EnumList__Group__45048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumList__LiteralsAssignment_4_in_rule__EnumList__Group__4__Impl5077 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__EnumList__LiteralsAssignment_4_in_rule__EnumList__Group__4__Impl5089 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__EnumList__Group__5__Impl_in_rule__EnumList__Group__55122 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__EnumList__Group__6_in_rule__EnumList__Group__55125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__EnumList__Group__5__Impl5153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumList__Group__6__Impl_in_rule__EnumList__Group__65184 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__EnumList__Group__7_in_rule__EnumList__Group__65187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__EnumList__Group__6__Impl5215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumList__Group__7__Impl_in_rule__EnumList__Group__75246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumList__EnumAssignment_7_in_rule__EnumList__Group__7__Impl5273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataStore__Group__0__Impl_in_rule__DataStore__Group__05319 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__DataStore__Group__1_in_rule__DataStore__Group__05322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__DataStore__Group__0__Impl5350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataStore__Group__1__Impl_in_rule__DataStore__Group__15381 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__DataStore__Group__2_in_rule__DataStore__Group__15384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataStore__NameAssignment_1_in_rule__DataStore__Group__1__Impl5411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataStore__Group__2__Impl_in_rule__DataStore__Group__25441 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__DataStore__Group__3_in_rule__DataStore__Group__25444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__DataStore__Group__2__Impl5472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataStore__Group__3__Impl_in_rule__DataStore__Group__35503 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_rule__DataStore__Group__4_in_rule__DataStore__Group__35506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataStore__ClassAssignment_3_in_rule__DataStore__Group__3__Impl5533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataStore__Group__4__Impl_in_rule__DataStore__Group__45563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataStore__MultiAssignment_4_in_rule__DataStore__Group__4__Impl5590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__0__Impl_in_rule__Field__Group__05631 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Field__Group__1_in_rule__Field__Group__05634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__NameAssignment_0_in_rule__Field__Group__0__Impl5661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__1__Impl_in_rule__Field__Group__15691 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Field__Group__2_in_rule__Field__Group__15694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__LabelAssignment_1_in_rule__Field__Group__1__Impl5721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__2__Impl_in_rule__Field__Group__25751 = new BitSet(new long[]{0x00018000003E0002L});
    public static final BitSet FOLLOW_rule__Field__Group__3_in_rule__Field__Group__25754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__PathAssignment_2_in_rule__Field__Group__2__Impl5781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__3__Impl_in_rule__Field__Group__35811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__AttributesAssignment_3_in_rule__Field__Group__3__Impl5838 = new BitSet(new long[]{0x00018000003E0002L});
    public static final BitSet FOLLOW_rule__FieldGroup__Group__0__Impl_in_rule__FieldGroup__Group__05877 = new BitSet(new long[]{0x0000140000000010L});
    public static final BitSet FOLLOW_rule__FieldGroup__Group__1_in_rule__FieldGroup__Group__05880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__FieldGroup__Group__0__Impl5908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldGroup__Group__1__Impl_in_rule__FieldGroup__Group__15939 = new BitSet(new long[]{0x0000140000000000L});
    public static final BitSet FOLLOW_rule__FieldGroup__Group__2_in_rule__FieldGroup__Group__15942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldGroup__LabelAssignment_1_in_rule__FieldGroup__Group__1__Impl5969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldGroup__Group__2__Impl_in_rule__FieldGroup__Group__26000 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__FieldGroup__Group__3_in_rule__FieldGroup__Group__26003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldGroup__Group_2__0_in_rule__FieldGroup__Group__2__Impl6030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldGroup__Group__3__Impl_in_rule__FieldGroup__Group__36061 = new BitSet(new long[]{0x0000020000000020L});
    public static final BitSet FOLLOW_rule__FieldGroup__Group__4_in_rule__FieldGroup__Group__36064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__FieldGroup__Group__3__Impl6092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldGroup__Group__4__Impl_in_rule__FieldGroup__Group__46123 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__FieldGroup__Group__5_in_rule__FieldGroup__Group__46126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldGroup__ElementsAssignment_4_in_rule__FieldGroup__Group__4__Impl6155 = new BitSet(new long[]{0x0000020000000022L});
    public static final BitSet FOLLOW_rule__FieldGroup__ElementsAssignment_4_in_rule__FieldGroup__Group__4__Impl6167 = new BitSet(new long[]{0x0000020000000022L});
    public static final BitSet FOLLOW_rule__FieldGroup__Group__5__Impl_in_rule__FieldGroup__Group__56200 = new BitSet(new long[]{0x00018000003E0002L});
    public static final BitSet FOLLOW_rule__FieldGroup__Group__6_in_rule__FieldGroup__Group__56203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__FieldGroup__Group__5__Impl6231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldGroup__Group__6__Impl_in_rule__FieldGroup__Group__66262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldGroup__AttributesAssignment_6_in_rule__FieldGroup__Group__6__Impl6289 = new BitSet(new long[]{0x00018000003E0002L});
    public static final BitSet FOLLOW_rule__FieldGroup__Group_2__0__Impl_in_rule__FieldGroup__Group_2__06334 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__FieldGroup__Group_2__1_in_rule__FieldGroup__Group_2__06337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__FieldGroup__Group_2__0__Impl6365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldGroup__Group_2__1__Impl_in_rule__FieldGroup__Group_2__16396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldGroup__WithAssignment_2_1_in_rule__FieldGroup__Group_2__1__Impl6423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NormalAttribute__Group__0__Impl_in_rule__NormalAttribute__Group__06457 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_rule__NormalAttribute__Group__1_in_rule__NormalAttribute__Group__06460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NormalAttribute__ClassExprAssignment_0_in_rule__NormalAttribute__Group__0__Impl6487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NormalAttribute__Group__1__Impl_in_rule__NormalAttribute__Group__16517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NormalAttribute__Group_1__0_in_rule__NormalAttribute__Group__1__Impl6544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NormalAttribute__Group_1__0__Impl_in_rule__NormalAttribute__Group_1__06579 = new BitSet(new long[]{0x0000000200018020L});
    public static final BitSet FOLLOW_rule__NormalAttribute__Group_1__1_in_rule__NormalAttribute__Group_1__06582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__NormalAttribute__Group_1__0__Impl6610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NormalAttribute__Group_1__1__Impl_in_rule__NormalAttribute__Group_1__16641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NormalAttribute__ClauseAssignment_1_1_in_rule__NormalAttribute__Group_1__1__Impl6668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeClassExpression__Group__0__Impl_in_rule__AttributeClassExpression__Group__06702 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_rule__AttributeClassExpression__Group__1_in_rule__AttributeClassExpression__Group__06705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeClassExpression__ClassesAssignment_0_in_rule__AttributeClassExpression__Group__0__Impl6732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeClassExpression__Group__1__Impl_in_rule__AttributeClassExpression__Group__16762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeClassExpression__Group_1__0_in_rule__AttributeClassExpression__Group__1__Impl6789 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_rule__AttributeClassExpression__Group_1__0__Impl_in_rule__AttributeClassExpression__Group_1__06824 = new BitSet(new long[]{0x00000000003E0000L});
    public static final BitSet FOLLOW_rule__AttributeClassExpression__Group_1__1_in_rule__AttributeClassExpression__Group_1__06827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__AttributeClassExpression__Group_1__0__Impl6855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeClassExpression__Group_1__1__Impl_in_rule__AttributeClassExpression__Group_1__16886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeClassExpression__ClassesAssignment_1_1_in_rule__AttributeClassExpression__Group_1__1__Impl6913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RestrictionAttribute__Group__0__Impl_in_rule__RestrictionAttribute__Group__06947 = new BitSet(new long[]{0x0000000200000020L});
    public static final BitSet FOLLOW_rule__RestrictionAttribute__Group__1_in_rule__RestrictionAttribute__Group__06950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__RestrictionAttribute__Group__0__Impl6978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RestrictionAttribute__Group__1__Impl_in_rule__RestrictionAttribute__Group__17009 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_rule__RestrictionAttribute__Group__2_in_rule__RestrictionAttribute__Group__17012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RestrictionAttribute__LiteralsAssignment_1_in_rule__RestrictionAttribute__Group__1__Impl7039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RestrictionAttribute__Group__2__Impl_in_rule__RestrictionAttribute__Group__27069 = new BitSet(new long[]{0x0000000200018020L});
    public static final BitSet FOLLOW_rule__RestrictionAttribute__Group__3_in_rule__RestrictionAttribute__Group__27072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__RestrictionAttribute__Group__2__Impl7100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RestrictionAttribute__Group__3__Impl_in_rule__RestrictionAttribute__Group__37131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RestrictionAttribute__ClauseAssignment_3_in_rule__RestrictionAttribute__Group__3__Impl7158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RestrictionGroupAttribute__Group__0__Impl_in_rule__RestrictionGroupAttribute__Group__07196 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_rule__RestrictionGroupAttribute__Group__1_in_rule__RestrictionGroupAttribute__Group__07199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RestrictionGroupAttribute__Group__1__Impl_in_rule__RestrictionGroupAttribute__Group__17257 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_rule__RestrictionGroupAttribute__Group__2_in_rule__RestrictionGroupAttribute__Group__17260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__RestrictionGroupAttribute__Group__1__Impl7288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RestrictionGroupAttribute__Group__2__Impl_in_rule__RestrictionGroupAttribute__Group__27319 = new BitSet(new long[]{0x0000000200000020L});
    public static final BitSet FOLLOW_rule__RestrictionGroupAttribute__Group__3_in_rule__RestrictionGroupAttribute__Group__27322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__RestrictionGroupAttribute__Group__2__Impl7350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RestrictionGroupAttribute__Group__3__Impl_in_rule__RestrictionGroupAttribute__Group__37381 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_rule__RestrictionGroupAttribute__Group__4_in_rule__RestrictionGroupAttribute__Group__37384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RestrictionGroupAttribute__RulesAssignment_3_in_rule__RestrictionGroupAttribute__Group__3__Impl7413 = new BitSet(new long[]{0x0000000200000022L});
    public static final BitSet FOLLOW_rule__RestrictionGroupAttribute__RulesAssignment_3_in_rule__RestrictionGroupAttribute__Group__3__Impl7425 = new BitSet(new long[]{0x0000000200000022L});
    public static final BitSet FOLLOW_rule__RestrictionGroupAttribute__Group__4__Impl_in_rule__RestrictionGroupAttribute__Group__47458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__RestrictionGroupAttribute__Group__4__Impl7486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RestrictionRule__Group__0__Impl_in_rule__RestrictionRule__Group__07527 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_rule__RestrictionRule__Group__1_in_rule__RestrictionRule__Group__07530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RestrictionRule__LiteralsAssignment_0_in_rule__RestrictionRule__Group__0__Impl7557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RestrictionRule__Group__1__Impl_in_rule__RestrictionRule__Group__17587 = new BitSet(new long[]{0x0000000200018020L});
    public static final BitSet FOLLOW_rule__RestrictionRule__Group__2_in_rule__RestrictionRule__Group__17590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__RestrictionRule__Group__1__Impl7618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RestrictionRule__Group__2__Impl_in_rule__RestrictionRule__Group__27649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RestrictionRule__ClauseAssignment_2_in_rule__RestrictionRule__Group__2__Impl7676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BOrExpression__Group__0__Impl_in_rule__BOrExpression__Group__07712 = new BitSet(new long[]{0x0000000000001802L});
    public static final BitSet FOLLOW_rule__BOrExpression__Group__1_in_rule__BOrExpression__Group__07715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBAndExpression_in_rule__BOrExpression__Group__0__Impl7742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BOrExpression__Group__1__Impl_in_rule__BOrExpression__Group__17771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BOrExpression__Group_1__0_in_rule__BOrExpression__Group__1__Impl7798 = new BitSet(new long[]{0x0000000000001802L});
    public static final BitSet FOLLOW_rule__BOrExpression__Group_1__0__Impl_in_rule__BOrExpression__Group_1__07833 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_rule__BOrExpression__Group_1__1_in_rule__BOrExpression__Group_1__07836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BOrExpression__Group_1__1__Impl_in_rule__BOrExpression__Group_1__17894 = new BitSet(new long[]{0x0000000200018020L});
    public static final BitSet FOLLOW_rule__BOrExpression__Group_1__2_in_rule__BOrExpression__Group_1__17897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BOrExpression__Alternatives_1_1_in_rule__BOrExpression__Group_1__1__Impl7924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BOrExpression__Group_1__2__Impl_in_rule__BOrExpression__Group_1__27954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BOrExpression__RightAssignment_1_2_in_rule__BOrExpression__Group_1__2__Impl7981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BAndExpression__Group__0__Impl_in_rule__BAndExpression__Group__08017 = new BitSet(new long[]{0x0000000000006002L});
    public static final BitSet FOLLOW_rule__BAndExpression__Group__1_in_rule__BAndExpression__Group__08020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNegationExpression_in_rule__BAndExpression__Group__0__Impl8047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BAndExpression__Group__1__Impl_in_rule__BAndExpression__Group__18076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BAndExpression__Group_1__0_in_rule__BAndExpression__Group__1__Impl8103 = new BitSet(new long[]{0x0000000000006002L});
    public static final BitSet FOLLOW_rule__BAndExpression__Group_1__0__Impl_in_rule__BAndExpression__Group_1__08138 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_rule__BAndExpression__Group_1__1_in_rule__BAndExpression__Group_1__08141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BAndExpression__Group_1__1__Impl_in_rule__BAndExpression__Group_1__18199 = new BitSet(new long[]{0x0000000200018020L});
    public static final BitSet FOLLOW_rule__BAndExpression__Group_1__2_in_rule__BAndExpression__Group_1__18202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BAndExpression__Alternatives_1_1_in_rule__BAndExpression__Group_1__1__Impl8229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BAndExpression__Group_1__2__Impl_in_rule__BAndExpression__Group_1__28259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BAndExpression__RightAssignment_1_2_in_rule__BAndExpression__Group_1__2__Impl8286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NegationExpression__Group_1__0__Impl_in_rule__NegationExpression__Group_1__08322 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_rule__NegationExpression__Group_1__1_in_rule__NegationExpression__Group_1__08325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NegationExpression__Group_1__1__Impl_in_rule__NegationExpression__Group_1__18383 = new BitSet(new long[]{0x0000000200018020L});
    public static final BitSet FOLLOW_rule__NegationExpression__Group_1__2_in_rule__NegationExpression__Group_1__18386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NegationExpression__Alternatives_1_1_in_rule__NegationExpression__Group_1__1__Impl8413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NegationExpression__Group_1__2__Impl_in_rule__NegationExpression__Group_1__28443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NegationExpression__ExprAssignment_1_2_in_rule__NegationExpression__Group_1__2__Impl8470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalBExpression__Group_1__0__Impl_in_rule__TerminalBExpression__Group_1__08506 = new BitSet(new long[]{0x0000000200018020L});
    public static final BitSet FOLLOW_rule__TerminalBExpression__Group_1__1_in_rule__TerminalBExpression__Group_1__08509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__TerminalBExpression__Group_1__0__Impl8537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalBExpression__Group_1__1__Impl_in_rule__TerminalBExpression__Group_1__18568 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__TerminalBExpression__Group_1__2_in_rule__TerminalBExpression__Group_1__18571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBExpression_in_rule__TerminalBExpression__Group_1__1__Impl8598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalBExpression__Group_1__2__Impl_in_rule__TerminalBExpression__Group_1__28627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__TerminalBExpression__Group_1__2__Impl8655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BComparison__Group__0__Impl_in_rule__BComparison__Group__08692 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__BComparison__Group__1_in_rule__BComparison__Group__08695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BComparison__Group__1__Impl_in_rule__BComparison__Group__18753 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_rule__BComparison__Group__2_in_rule__BComparison__Group__18756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BComparison__RefAssignment_1_in_rule__BComparison__Group__1__Impl8783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BComparison__Group__2__Impl_in_rule__BComparison__Group__28813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BComparison__Group_2__0_in_rule__BComparison__Group__2__Impl8840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BComparison__Group_2__0__Impl_in_rule__BComparison__Group_2__08877 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_rule__BComparison__Group_2__1_in_rule__BComparison__Group_2__08880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__BComparison__Group_2__0__Impl8908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BComparison__Group_2__1__Impl_in_rule__BComparison__Group_2__18939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BComparison__BLiteralAssignment_2_1_in_rule__BComparison__Group_2__1__Impl8966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SingleEnumComparison__Group__0__Impl_in_rule__SingleEnumComparison__Group__09000 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__SingleEnumComparison__Group__1_in_rule__SingleEnumComparison__Group__09003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SingleEnumComparison__RefAssignment_0_in_rule__SingleEnumComparison__Group__0__Impl9030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SingleEnumComparison__Group__1__Impl_in_rule__SingleEnumComparison__Group__19060 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__SingleEnumComparison__Group__2_in_rule__SingleEnumComparison__Group__19063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__SingleEnumComparison__Group__1__Impl9091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SingleEnumComparison__Group__2__Impl_in_rule__SingleEnumComparison__Group__29122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SingleEnumComparison__ELiteralAssignment_2_in_rule__SingleEnumComparison__Group__2__Impl9149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiEnumComparison__Group__0__Impl_in_rule__MultiEnumComparison__Group__09185 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_rule__MultiEnumComparison__Group__1_in_rule__MultiEnumComparison__Group__09188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiEnumComparison__RefAssignment_0_in_rule__MultiEnumComparison__Group__0__Impl9215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiEnumComparison__Group__1__Impl_in_rule__MultiEnumComparison__Group__19245 = new BitSet(new long[]{0x0000000200000020L});
    public static final BitSet FOLLOW_rule__MultiEnumComparison__Group__2_in_rule__MultiEnumComparison__Group__19248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiEnumComparison__MembershipAssignment_1_in_rule__MultiEnumComparison__Group__1__Impl9275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiEnumComparison__Group__2__Impl_in_rule__MultiEnumComparison__Group__29305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiEnumComparison__ELiteralsAssignment_2_in_rule__MultiEnumComparison__Group__2__Impl9332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringValueComparison__Group__0__Impl_in_rule__StringValueComparison__Group__09368 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_rule__StringValueComparison__Group__1_in_rule__StringValueComparison__Group__09371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringValueComparison__RefAssignment_0_in_rule__StringValueComparison__Group__0__Impl9398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringValueComparison__Group__1__Impl_in_rule__StringValueComparison__Group__19428 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__StringValueComparison__Group__2_in_rule__StringValueComparison__Group__19431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__StringValueComparison__Group__1__Impl9459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringValueComparison__Group__2__Impl_in_rule__StringValueComparison__Group__29490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringValueComparison__TargetValueAssignment_2_in_rule__StringValueComparison__Group__2__Impl9517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PresenceCheck__Group__0__Impl_in_rule__PresenceCheck__Group__09553 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_rule__PresenceCheck__Group__1_in_rule__PresenceCheck__Group__09556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PresenceCheck__RefAssignment_0_in_rule__PresenceCheck__Group__0__Impl9583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PresenceCheck__Group__1__Impl_in_rule__PresenceCheck__Group__19613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__PresenceCheck__Group__1__Impl9641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DirectEnumLiteralsCollection__Group__0__Impl_in_rule__DirectEnumLiteralsCollection__Group__09676 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__DirectEnumLiteralsCollection__Group__1_in_rule__DirectEnumLiteralsCollection__Group__09679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DirectEnumLiteralsCollection__Group__1__Impl_in_rule__DirectEnumLiteralsCollection__Group__19737 = new BitSet(new long[]{0x0000000400000020L});
    public static final BitSet FOLLOW_rule__DirectEnumLiteralsCollection__Group__2_in_rule__DirectEnumLiteralsCollection__Group__19740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__DirectEnumLiteralsCollection__Group__1__Impl9768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DirectEnumLiteralsCollection__Group__2__Impl_in_rule__DirectEnumLiteralsCollection__Group__29799 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__DirectEnumLiteralsCollection__Group__3_in_rule__DirectEnumLiteralsCollection__Group__29802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DirectEnumLiteralsCollection__LiteralsAssignment_2_in_rule__DirectEnumLiteralsCollection__Group__2__Impl9829 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__DirectEnumLiteralsCollection__Group__3__Impl_in_rule__DirectEnumLiteralsCollection__Group__39860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__DirectEnumLiteralsCollection__Group__3__Impl9888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabel_in_rule__DynamicScreen__LabelAssignment_19932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__DynamicScreen__ImportURIAssignment_49963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DynamicScreen__ViewClassAssignment_79998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_rule__DynamicScreen__DeclarationsAssignment_810033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldGroup_in_rule__DynamicScreen__GroupsAssignment_910064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Label__EnAssignment_010095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Label__NlAssignment_1_110126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__PathTail__FieldAssignment_110161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__PathTail__AsEntityAssignment_2_110200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePathTail_in_rule__PathTail__TailAssignment_310235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePathTail_in_rule__ExternalVariable__PathAssignment_110266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ExternalVariable__NameAssignment_310297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumList__NameAssignment_110328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumList__LiteralsAssignment_410363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumList__EnumAssignment_710402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DataStore__NameAssignment_110437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DataStore__ClassAssignment_310472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__DataStore__MultiAssignment_410512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Field__NameAssignment_010551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabel_in_rule__Field__LabelAssignment_110582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePathTail_in_rule__Field__PathAssignment_210613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_rule__Field__AttributesAssignment_310644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabel_in_rule__FieldGroup__LabelAssignment_110675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePathTail_in_rule__FieldGroup__WithAssignment_2_110706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGroupElement_in_rule__FieldGroup__ElementsAssignment_410737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_rule__FieldGroup__AttributesAssignment_610768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeClassExpression_in_rule__NormalAttribute__ClassExprAssignment_010799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBExpression_in_rule__NormalAttribute__ClauseAssignment_1_110830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeClass_in_rule__AttributeClassExpression__ClassesAssignment_010861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeClass_in_rule__AttributeClassExpression__ClassesAssignment_1_110892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumLiteralsCollection_in_rule__RestrictionAttribute__LiteralsAssignment_110923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBExpression_in_rule__RestrictionAttribute__ClauseAssignment_310954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRestrictionRule_in_rule__RestrictionGroupAttribute__RulesAssignment_310985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumLiteralsCollection_in_rule__RestrictionRule__LiteralsAssignment_011016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBExpression_in_rule__RestrictionRule__ClauseAssignment_211047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Reference__RefAssignment11082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBAndExpression_in_rule__BOrExpression__RightAssignment_1_211117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNegationExpression_in_rule__BAndExpression__RightAssignment_1_211148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNegationExpression_in_rule__NegationExpression__ExprAssignment_1_211179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_rule__BComparison__RefAssignment_111210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBLiteral_in_rule__BComparison__BLiteralAssignment_2_111241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_rule__SingleEnumComparison__RefAssignment_011272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SingleEnumComparison__ELiteralAssignment_211307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_rule__MultiEnumComparison__RefAssignment_011342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumMembership_in_rule__MultiEnumComparison__MembershipAssignment_111373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumLiteralsCollection_in_rule__MultiEnumComparison__ELiteralsAssignment_211404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_rule__StringValueComparison__RefAssignment_011435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__StringValueComparison__TargetValueAssignment_211466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_rule__PresenceCheck__RefAssignment_011497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DirectEnumLiteralsCollection__LiteralsAssignment_211532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumListReference__RefAssignment11571 = new BitSet(new long[]{0x0000000000000002L});

}