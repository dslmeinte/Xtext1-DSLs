package nl.dslmeinte.xtext.examples.parser.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.conversion.ValueConverterException;
import nl.dslmeinte.xtext.examples.services.DynamicScreenDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDynamicScreenDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'dynamic-screen'", "'view-class'", "'='", "'data-import'", "'[nl:'", "']'", "'/'", "'('", "')'", "'external-var'", "'as'", "'define'", "'of'", "'data-store'", "'of-type'", "'is-multi-valued'", "'group'", "'with'", "'{'", "'}'", "'if'", "'+'", "'restrict-to'", "'restrict-to-group'", "'<'", "'>'", "'or'", "'and'", "'not'", "'is'", "'equals'", "'is-present'", "'display'", "'required'", "'readonly'", "'calculated'", "'doubleAsterisk'", "'true'", "'false'", "'is-one-of'", "'is-not-one-of'"
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
    public String getGrammarFileName() { return "../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g"; }



     	private DynamicScreenDslGrammarAccess grammarAccess;
     	
        public InternalDynamicScreenDslParser(TokenStream input, IAstFactory factory, DynamicScreenDslGrammarAccess grammarAccess) {
            this(input);
            this.factory = factory;
            registerRules(grammarAccess.getGrammar());
            this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected InputStream getTokenFile() {
        	ClassLoader classLoader = getClass().getClassLoader();
        	return classLoader.getResourceAsStream("nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.tokens");
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "DynamicScreen";	
       	}
       	
       	@Override
       	protected DynamicScreenDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start entryRuleDynamicScreen
    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:78:1: entryRuleDynamicScreen returns [EObject current=null] : iv_ruleDynamicScreen= ruleDynamicScreen EOF ;
    public final EObject entryRuleDynamicScreen() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDynamicScreen = null;


        try {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:79:2: (iv_ruleDynamicScreen= ruleDynamicScreen EOF )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:80:2: iv_ruleDynamicScreen= ruleDynamicScreen EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDynamicScreenRule(), currentNode); 
            pushFollow(FOLLOW_ruleDynamicScreen_in_entryRuleDynamicScreen75);
            iv_ruleDynamicScreen=ruleDynamicScreen();
            _fsp--;

             current =iv_ruleDynamicScreen; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDynamicScreen85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleDynamicScreen


    // $ANTLR start ruleDynamicScreen
    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:87:1: ruleDynamicScreen returns [EObject current=null] : ( 'dynamic-screen' ( (lv_label_1_0= ruleLabel ) ) ( (lv_dataImport_2_0= ruleDataImport ) ) 'view-class' '=' ( ( RULE_ID ) ) ( (lv_declarations_6_0= ruleDeclaration ) )* ( (lv_groups_7_0= ruleFieldGroup ) )+ ) ;
    public final EObject ruleDynamicScreen() throws RecognitionException {
        EObject current = null;

        EObject lv_label_1_0 = null;

        EObject lv_dataImport_2_0 = null;

        EObject lv_declarations_6_0 = null;

        EObject lv_groups_7_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:92:6: ( ( 'dynamic-screen' ( (lv_label_1_0= ruleLabel ) ) ( (lv_dataImport_2_0= ruleDataImport ) ) 'view-class' '=' ( ( RULE_ID ) ) ( (lv_declarations_6_0= ruleDeclaration ) )* ( (lv_groups_7_0= ruleFieldGroup ) )+ ) )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:93:1: ( 'dynamic-screen' ( (lv_label_1_0= ruleLabel ) ) ( (lv_dataImport_2_0= ruleDataImport ) ) 'view-class' '=' ( ( RULE_ID ) ) ( (lv_declarations_6_0= ruleDeclaration ) )* ( (lv_groups_7_0= ruleFieldGroup ) )+ )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:93:1: ( 'dynamic-screen' ( (lv_label_1_0= ruleLabel ) ) ( (lv_dataImport_2_0= ruleDataImport ) ) 'view-class' '=' ( ( RULE_ID ) ) ( (lv_declarations_6_0= ruleDeclaration ) )* ( (lv_groups_7_0= ruleFieldGroup ) )+ )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:93:3: 'dynamic-screen' ( (lv_label_1_0= ruleLabel ) ) ( (lv_dataImport_2_0= ruleDataImport ) ) 'view-class' '=' ( ( RULE_ID ) ) ( (lv_declarations_6_0= ruleDeclaration ) )* ( (lv_groups_7_0= ruleFieldGroup ) )+
            {
            match(input,11,FOLLOW_11_in_ruleDynamicScreen120); 

                    createLeafNode(grammarAccess.getDynamicScreenAccess().getDynamicScreenKeyword_0(), null); 
                
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:97:1: ( (lv_label_1_0= ruleLabel ) )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:98:1: (lv_label_1_0= ruleLabel )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:98:1: (lv_label_1_0= ruleLabel )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:99:3: lv_label_1_0= ruleLabel
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getDynamicScreenAccess().getLabelLabelParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleLabel_in_ruleDynamicScreen141);
            lv_label_1_0=ruleLabel();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getDynamicScreenRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"label",
            	        		lv_label_1_0, 
            	        		"Label", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:121:2: ( (lv_dataImport_2_0= ruleDataImport ) )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:122:1: (lv_dataImport_2_0= ruleDataImport )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:122:1: (lv_dataImport_2_0= ruleDataImport )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:123:3: lv_dataImport_2_0= ruleDataImport
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getDynamicScreenAccess().getDataImportDataImportParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleDataImport_in_ruleDynamicScreen162);
            lv_dataImport_2_0=ruleDataImport();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getDynamicScreenRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"dataImport",
            	        		lv_dataImport_2_0, 
            	        		"DataImport", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,12,FOLLOW_12_in_ruleDynamicScreen172); 

                    createLeafNode(grammarAccess.getDynamicScreenAccess().getViewClassKeyword_3(), null); 
                
            match(input,13,FOLLOW_13_in_ruleDynamicScreen182); 

                    createLeafNode(grammarAccess.getDynamicScreenAccess().getEqualsSignKeyword_4(), null); 
                
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:153:1: ( ( RULE_ID ) )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:154:1: ( RULE_ID )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:154:1: ( RULE_ID )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:155:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getDynamicScreenRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDynamicScreen200); 

            		createLeafNode(grammarAccess.getDynamicScreenAccess().getViewClassEntityCrossReference_5_0(), "viewClass"); 
            	

            }


            }

            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:167:2: ( (lv_declarations_6_0= ruleDeclaration ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==20||LA1_0==22||LA1_0==24) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:168:1: (lv_declarations_6_0= ruleDeclaration )
            	    {
            	    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:168:1: (lv_declarations_6_0= ruleDeclaration )
            	    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:169:3: lv_declarations_6_0= ruleDeclaration
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getDynamicScreenAccess().getDeclarationsDeclarationParserRuleCall_6_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleDeclaration_in_ruleDynamicScreen221);
            	    lv_declarations_6_0=ruleDeclaration();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getDynamicScreenRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"declarations",
            	    	        		lv_declarations_6_0, 
            	    	        		"Declaration", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:191:3: ( (lv_groups_7_0= ruleFieldGroup ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==27) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:192:1: (lv_groups_7_0= ruleFieldGroup )
            	    {
            	    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:192:1: (lv_groups_7_0= ruleFieldGroup )
            	    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:193:3: lv_groups_7_0= ruleFieldGroup
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getDynamicScreenAccess().getGroupsFieldGroupParserRuleCall_7_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleFieldGroup_in_ruleDynamicScreen243);
            	    lv_groups_7_0=ruleFieldGroup();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getDynamicScreenRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"groups",
            	    	        		lv_groups_7_0, 
            	    	        		"FieldGroup", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleDynamicScreen


    // $ANTLR start entryRuleDataImport
    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:223:1: entryRuleDataImport returns [EObject current=null] : iv_ruleDataImport= ruleDataImport EOF ;
    public final EObject entryRuleDataImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataImport = null;


        try {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:224:2: (iv_ruleDataImport= ruleDataImport EOF )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:225:2: iv_ruleDataImport= ruleDataImport EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDataImportRule(), currentNode); 
            pushFollow(FOLLOW_ruleDataImport_in_entryRuleDataImport280);
            iv_ruleDataImport=ruleDataImport();
            _fsp--;

             current =iv_ruleDataImport; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataImport290); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleDataImport


    // $ANTLR start ruleDataImport
    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:232:1: ruleDataImport returns [EObject current=null] : ( 'data-import' '=' ( (lv_importURI_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleDataImport() throws RecognitionException {
        EObject current = null;

        Token lv_importURI_2_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:237:6: ( ( 'data-import' '=' ( (lv_importURI_2_0= RULE_STRING ) ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:238:1: ( 'data-import' '=' ( (lv_importURI_2_0= RULE_STRING ) ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:238:1: ( 'data-import' '=' ( (lv_importURI_2_0= RULE_STRING ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:238:3: 'data-import' '=' ( (lv_importURI_2_0= RULE_STRING ) )
            {
            match(input,14,FOLLOW_14_in_ruleDataImport325); 

                    createLeafNode(grammarAccess.getDataImportAccess().getDataImportKeyword_0(), null); 
                
            match(input,13,FOLLOW_13_in_ruleDataImport335); 

                    createLeafNode(grammarAccess.getDataImportAccess().getEqualsSignKeyword_1(), null); 
                
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:246:1: ( (lv_importURI_2_0= RULE_STRING ) )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:247:1: (lv_importURI_2_0= RULE_STRING )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:247:1: (lv_importURI_2_0= RULE_STRING )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:248:3: lv_importURI_2_0= RULE_STRING
            {
            lv_importURI_2_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDataImport352); 

            			createLeafNode(grammarAccess.getDataImportAccess().getImportURISTRINGTerminalRuleCall_2_0(), "importURI"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getDataImportRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"importURI",
            	        		lv_importURI_2_0, 
            	        		"STRING", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleDataImport


    // $ANTLR start entryRuleLabel
    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:278:1: entryRuleLabel returns [EObject current=null] : iv_ruleLabel= ruleLabel EOF ;
    public final EObject entryRuleLabel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLabel = null;


        try {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:279:2: (iv_ruleLabel= ruleLabel EOF )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:280:2: iv_ruleLabel= ruleLabel EOF
            {
             currentNode = createCompositeNode(grammarAccess.getLabelRule(), currentNode); 
            pushFollow(FOLLOW_ruleLabel_in_entryRuleLabel393);
            iv_ruleLabel=ruleLabel();
            _fsp--;

             current =iv_ruleLabel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLabel403); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleLabel


    // $ANTLR start ruleLabel
    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:287:1: ruleLabel returns [EObject current=null] : ( ( (lv_en_0_0= RULE_STRING ) ) ( '[nl:' ( (lv_nl_2_0= RULE_STRING ) ) ']' )? ) ;
    public final EObject ruleLabel() throws RecognitionException {
        EObject current = null;

        Token lv_en_0_0=null;
        Token lv_nl_2_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:292:6: ( ( ( (lv_en_0_0= RULE_STRING ) ) ( '[nl:' ( (lv_nl_2_0= RULE_STRING ) ) ']' )? ) )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:293:1: ( ( (lv_en_0_0= RULE_STRING ) ) ( '[nl:' ( (lv_nl_2_0= RULE_STRING ) ) ']' )? )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:293:1: ( ( (lv_en_0_0= RULE_STRING ) ) ( '[nl:' ( (lv_nl_2_0= RULE_STRING ) ) ']' )? )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:293:2: ( (lv_en_0_0= RULE_STRING ) ) ( '[nl:' ( (lv_nl_2_0= RULE_STRING ) ) ']' )?
            {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:293:2: ( (lv_en_0_0= RULE_STRING ) )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:294:1: (lv_en_0_0= RULE_STRING )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:294:1: (lv_en_0_0= RULE_STRING )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:295:3: lv_en_0_0= RULE_STRING
            {
            lv_en_0_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleLabel445); 

            			createLeafNode(grammarAccess.getLabelAccess().getEnSTRINGTerminalRuleCall_0_0(), "en"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getLabelRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"en",
            	        		lv_en_0_0, 
            	        		"STRING", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:317:2: ( '[nl:' ( (lv_nl_2_0= RULE_STRING ) ) ']' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:317:4: '[nl:' ( (lv_nl_2_0= RULE_STRING ) ) ']'
                    {
                    match(input,15,FOLLOW_15_in_ruleLabel461); 

                            createLeafNode(grammarAccess.getLabelAccess().getNlKeyword_1_0(), null); 
                        
                    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:321:1: ( (lv_nl_2_0= RULE_STRING ) )
                    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:322:1: (lv_nl_2_0= RULE_STRING )
                    {
                    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:322:1: (lv_nl_2_0= RULE_STRING )
                    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:323:3: lv_nl_2_0= RULE_STRING
                    {
                    lv_nl_2_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleLabel478); 

                    			createLeafNode(grammarAccess.getLabelAccess().getNlSTRINGTerminalRuleCall_1_1_0(), "nl"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getLabelRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"nl",
                    	        		lv_nl_2_0, 
                    	        		"STRING", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }

                    match(input,16,FOLLOW_16_in_ruleLabel493); 

                            createLeafNode(grammarAccess.getLabelAccess().getRightSquareBracketKeyword_1_2(), null); 
                        

                    }
                    break;

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleLabel


    // $ANTLR start entryRulePathTail
    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:357:1: entryRulePathTail returns [EObject current=null] : iv_rulePathTail= rulePathTail EOF ;
    public final EObject entryRulePathTail() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePathTail = null;


        try {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:358:2: (iv_rulePathTail= rulePathTail EOF )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:359:2: iv_rulePathTail= rulePathTail EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPathTailRule(), currentNode); 
            pushFollow(FOLLOW_rulePathTail_in_entryRulePathTail531);
            iv_rulePathTail=rulePathTail();
            _fsp--;

             current =iv_rulePathTail; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePathTail541); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRulePathTail


    // $ANTLR start rulePathTail
    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:366:1: rulePathTail returns [EObject current=null] : ( '/' ( ( RULE_ID ) ) ( '(' ( ( RULE_ID ) ) ')' )? ( (lv_tail_5_0= rulePathTail ) )? ) ;
    public final EObject rulePathTail() throws RecognitionException {
        EObject current = null;

        EObject lv_tail_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:371:6: ( ( '/' ( ( RULE_ID ) ) ( '(' ( ( RULE_ID ) ) ')' )? ( (lv_tail_5_0= rulePathTail ) )? ) )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:372:1: ( '/' ( ( RULE_ID ) ) ( '(' ( ( RULE_ID ) ) ')' )? ( (lv_tail_5_0= rulePathTail ) )? )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:372:1: ( '/' ( ( RULE_ID ) ) ( '(' ( ( RULE_ID ) ) ')' )? ( (lv_tail_5_0= rulePathTail ) )? )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:372:3: '/' ( ( RULE_ID ) ) ( '(' ( ( RULE_ID ) ) ')' )? ( (lv_tail_5_0= rulePathTail ) )?
            {
            match(input,17,FOLLOW_17_in_rulePathTail576); 

                    createLeafNode(grammarAccess.getPathTailAccess().getSolidusKeyword_0(), null); 
                
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:376:1: ( ( RULE_ID ) )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:377:1: ( RULE_ID )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:377:1: ( RULE_ID )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:378:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getPathTailRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePathTail594); 

            		createLeafNode(grammarAccess.getPathTailAccess().getFieldFieldCrossReference_1_0(), "field"); 
            	

            }


            }

            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:390:2: ( '(' ( ( RULE_ID ) ) ')' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==18) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:390:4: '(' ( ( RULE_ID ) ) ')'
                    {
                    match(input,18,FOLLOW_18_in_rulePathTail605); 

                            createLeafNode(grammarAccess.getPathTailAccess().getLeftParenthesisKeyword_2_0(), null); 
                        
                    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:394:1: ( ( RULE_ID ) )
                    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:395:1: ( RULE_ID )
                    {
                    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:395:1: ( RULE_ID )
                    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:396:3: RULE_ID
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getPathTailRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePathTail623); 

                    		createLeafNode(grammarAccess.getPathTailAccess().getAsEntityEntityCrossReference_2_1_0(), "asEntity"); 
                    	

                    }


                    }

                    match(input,19,FOLLOW_19_in_rulePathTail633); 

                            createLeafNode(grammarAccess.getPathTailAccess().getRightParenthesisKeyword_2_2(), null); 
                        

                    }
                    break;

            }

            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:412:3: ( (lv_tail_5_0= rulePathTail ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:413:1: (lv_tail_5_0= rulePathTail )
                    {
                    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:413:1: (lv_tail_5_0= rulePathTail )
                    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:414:3: lv_tail_5_0= rulePathTail
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getPathTailAccess().getTailPathTailParserRuleCall_3_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_rulePathTail_in_rulePathTail656);
                    lv_tail_5_0=rulePathTail();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getPathTailRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"tail",
                    	        		lv_tail_5_0, 
                    	        		"PathTail", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end rulePathTail


    // $ANTLR start entryRuleDeclaration
    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:444:1: entryRuleDeclaration returns [EObject current=null] : iv_ruleDeclaration= ruleDeclaration EOF ;
    public final EObject entryRuleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaration = null;


        try {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:445:2: (iv_ruleDeclaration= ruleDeclaration EOF )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:446:2: iv_ruleDeclaration= ruleDeclaration EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDeclarationRule(), currentNode); 
            pushFollow(FOLLOW_ruleDeclaration_in_entryRuleDeclaration693);
            iv_ruleDeclaration=ruleDeclaration();
            _fsp--;

             current =iv_ruleDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeclaration703); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleDeclaration


    // $ANTLR start ruleDeclaration
    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:453:1: ruleDeclaration returns [EObject current=null] : (this_ExternalVariable_0= ruleExternalVariable | this_EnumList_1= ruleEnumList | this_DataStore_2= ruleDataStore ) ;
    public final EObject ruleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_ExternalVariable_0 = null;

        EObject this_EnumList_1 = null;

        EObject this_DataStore_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:458:6: ( (this_ExternalVariable_0= ruleExternalVariable | this_EnumList_1= ruleEnumList | this_DataStore_2= ruleDataStore ) )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:459:1: (this_ExternalVariable_0= ruleExternalVariable | this_EnumList_1= ruleEnumList | this_DataStore_2= ruleDataStore )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:459:1: (this_ExternalVariable_0= ruleExternalVariable | this_EnumList_1= ruleEnumList | this_DataStore_2= ruleDataStore )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt6=1;
                }
                break;
            case 22:
                {
                alt6=2;
                }
                break;
            case 24:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("459:1: (this_ExternalVariable_0= ruleExternalVariable | this_EnumList_1= ruleEnumList | this_DataStore_2= ruleDataStore )", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:460:5: this_ExternalVariable_0= ruleExternalVariable
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getDeclarationAccess().getExternalVariableParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleExternalVariable_in_ruleDeclaration750);
                    this_ExternalVariable_0=ruleExternalVariable();
                    _fsp--;

                     
                            current = this_ExternalVariable_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:470:5: this_EnumList_1= ruleEnumList
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getDeclarationAccess().getEnumListParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleEnumList_in_ruleDeclaration777);
                    this_EnumList_1=ruleEnumList();
                    _fsp--;

                     
                            current = this_EnumList_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:480:5: this_DataStore_2= ruleDataStore
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getDeclarationAccess().getDataStoreParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleDataStore_in_ruleDeclaration804);
                    this_DataStore_2=ruleDataStore();
                    _fsp--;

                     
                            current = this_DataStore_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleDeclaration


    // $ANTLR start entryRuleExternalVariable
    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:496:1: entryRuleExternalVariable returns [EObject current=null] : iv_ruleExternalVariable= ruleExternalVariable EOF ;
    public final EObject entryRuleExternalVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalVariable = null;


        try {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:497:2: (iv_ruleExternalVariable= ruleExternalVariable EOF )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:498:2: iv_ruleExternalVariable= ruleExternalVariable EOF
            {
             currentNode = createCompositeNode(grammarAccess.getExternalVariableRule(), currentNode); 
            pushFollow(FOLLOW_ruleExternalVariable_in_entryRuleExternalVariable839);
            iv_ruleExternalVariable=ruleExternalVariable();
            _fsp--;

             current =iv_ruleExternalVariable; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExternalVariable849); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleExternalVariable


    // $ANTLR start ruleExternalVariable
    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:505:1: ruleExternalVariable returns [EObject current=null] : ( 'external-var' ( (lv_path_1_0= rulePathTail ) ) 'as' ( (lv_name_3_0= RULE_ID ) ) ) ;
    public final EObject ruleExternalVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_3_0=null;
        EObject lv_path_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:510:6: ( ( 'external-var' ( (lv_path_1_0= rulePathTail ) ) 'as' ( (lv_name_3_0= RULE_ID ) ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:511:1: ( 'external-var' ( (lv_path_1_0= rulePathTail ) ) 'as' ( (lv_name_3_0= RULE_ID ) ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:511:1: ( 'external-var' ( (lv_path_1_0= rulePathTail ) ) 'as' ( (lv_name_3_0= RULE_ID ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:511:3: 'external-var' ( (lv_path_1_0= rulePathTail ) ) 'as' ( (lv_name_3_0= RULE_ID ) )
            {
            match(input,20,FOLLOW_20_in_ruleExternalVariable884); 

                    createLeafNode(grammarAccess.getExternalVariableAccess().getExternalVarKeyword_0(), null); 
                
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:515:1: ( (lv_path_1_0= rulePathTail ) )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:516:1: (lv_path_1_0= rulePathTail )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:516:1: (lv_path_1_0= rulePathTail )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:517:3: lv_path_1_0= rulePathTail
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getExternalVariableAccess().getPathPathTailParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_rulePathTail_in_ruleExternalVariable905);
            lv_path_1_0=rulePathTail();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getExternalVariableRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"path",
            	        		lv_path_1_0, 
            	        		"PathTail", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,21,FOLLOW_21_in_ruleExternalVariable915); 

                    createLeafNode(grammarAccess.getExternalVariableAccess().getAsKeyword_2(), null); 
                
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:543:1: ( (lv_name_3_0= RULE_ID ) )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:544:1: (lv_name_3_0= RULE_ID )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:544:1: (lv_name_3_0= RULE_ID )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:545:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExternalVariable932); 

            			createLeafNode(grammarAccess.getExternalVariableAccess().getNameIDTerminalRuleCall_3_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getExternalVariableRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_3_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleExternalVariable


    // $ANTLR start entryRuleEnumList
    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:575:1: entryRuleEnumList returns [EObject current=null] : iv_ruleEnumList= ruleEnumList EOF ;
    public final EObject entryRuleEnumList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumList = null;


        try {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:576:2: (iv_ruleEnumList= ruleEnumList EOF )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:577:2: iv_ruleEnumList= ruleEnumList EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEnumListRule(), currentNode); 
            pushFollow(FOLLOW_ruleEnumList_in_entryRuleEnumList973);
            iv_ruleEnumList=ruleEnumList();
            _fsp--;

             current =iv_ruleEnumList; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumList983); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleEnumList


    // $ANTLR start ruleEnumList
    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:584:1: ruleEnumList returns [EObject current=null] : ( 'define' ( (lv_name_1_0= RULE_ID ) ) 'as' '(' ( ( RULE_ID ) )+ ')' 'of' ( ( RULE_ID ) ) ) ;
    public final EObject ruleEnumList() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:589:6: ( ( 'define' ( (lv_name_1_0= RULE_ID ) ) 'as' '(' ( ( RULE_ID ) )+ ')' 'of' ( ( RULE_ID ) ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:590:1: ( 'define' ( (lv_name_1_0= RULE_ID ) ) 'as' '(' ( ( RULE_ID ) )+ ')' 'of' ( ( RULE_ID ) ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:590:1: ( 'define' ( (lv_name_1_0= RULE_ID ) ) 'as' '(' ( ( RULE_ID ) )+ ')' 'of' ( ( RULE_ID ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:590:3: 'define' ( (lv_name_1_0= RULE_ID ) ) 'as' '(' ( ( RULE_ID ) )+ ')' 'of' ( ( RULE_ID ) )
            {
            match(input,22,FOLLOW_22_in_ruleEnumList1018); 

                    createLeafNode(grammarAccess.getEnumListAccess().getDefineKeyword_0(), null); 
                
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:594:1: ( (lv_name_1_0= RULE_ID ) )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:595:1: (lv_name_1_0= RULE_ID )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:595:1: (lv_name_1_0= RULE_ID )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:596:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumList1035); 

            			createLeafNode(grammarAccess.getEnumListAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getEnumListRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_1_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,21,FOLLOW_21_in_ruleEnumList1050); 

                    createLeafNode(grammarAccess.getEnumListAccess().getAsKeyword_2(), null); 
                
            match(input,18,FOLLOW_18_in_ruleEnumList1060); 

                    createLeafNode(grammarAccess.getEnumListAccess().getLeftParenthesisKeyword_3(), null); 
                
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:626:1: ( ( RULE_ID ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:627:1: ( RULE_ID )
            	    {
            	    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:627:1: ( RULE_ID )
            	    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:628:3: RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = factory.create(grammarAccess.getEnumListRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode, current);
            	    	        }
            	            
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumList1078); 

            	    		createLeafNode(grammarAccess.getEnumListAccess().getLiteralsEnumLiteralCrossReference_4_0(), "literals"); 
            	    	

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);

            match(input,19,FOLLOW_19_in_ruleEnumList1089); 

                    createLeafNode(grammarAccess.getEnumListAccess().getRightParenthesisKeyword_5(), null); 
                
            match(input,23,FOLLOW_23_in_ruleEnumList1099); 

                    createLeafNode(grammarAccess.getEnumListAccess().getOfKeyword_6(), null); 
                
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:648:1: ( ( RULE_ID ) )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:649:1: ( RULE_ID )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:649:1: ( RULE_ID )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:650:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getEnumListRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumList1117); 

            		createLeafNode(grammarAccess.getEnumListAccess().getEnumEnumerationCrossReference_7_0(), "enum"); 
            	

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleEnumList


    // $ANTLR start entryRuleDataStore
    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:670:1: entryRuleDataStore returns [EObject current=null] : iv_ruleDataStore= ruleDataStore EOF ;
    public final EObject entryRuleDataStore() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataStore = null;


        try {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:671:2: (iv_ruleDataStore= ruleDataStore EOF )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:672:2: iv_ruleDataStore= ruleDataStore EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDataStoreRule(), currentNode); 
            pushFollow(FOLLOW_ruleDataStore_in_entryRuleDataStore1153);
            iv_ruleDataStore=ruleDataStore();
            _fsp--;

             current =iv_ruleDataStore; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataStore1163); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleDataStore


    // $ANTLR start ruleDataStore
    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:679:1: ruleDataStore returns [EObject current=null] : ( 'data-store' ( (lv_name_1_0= RULE_ID ) ) 'of-type' ( ( RULE_ID ) ) ( (lv_multi_4_0= 'is-multi-valued' ) )? ) ;
    public final EObject ruleDataStore() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token lv_multi_4_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:684:6: ( ( 'data-store' ( (lv_name_1_0= RULE_ID ) ) 'of-type' ( ( RULE_ID ) ) ( (lv_multi_4_0= 'is-multi-valued' ) )? ) )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:685:1: ( 'data-store' ( (lv_name_1_0= RULE_ID ) ) 'of-type' ( ( RULE_ID ) ) ( (lv_multi_4_0= 'is-multi-valued' ) )? )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:685:1: ( 'data-store' ( (lv_name_1_0= RULE_ID ) ) 'of-type' ( ( RULE_ID ) ) ( (lv_multi_4_0= 'is-multi-valued' ) )? )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:685:3: 'data-store' ( (lv_name_1_0= RULE_ID ) ) 'of-type' ( ( RULE_ID ) ) ( (lv_multi_4_0= 'is-multi-valued' ) )?
            {
            match(input,24,FOLLOW_24_in_ruleDataStore1198); 

                    createLeafNode(grammarAccess.getDataStoreAccess().getDataStoreKeyword_0(), null); 
                
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:689:1: ( (lv_name_1_0= RULE_ID ) )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:690:1: (lv_name_1_0= RULE_ID )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:690:1: (lv_name_1_0= RULE_ID )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:691:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDataStore1215); 

            			createLeafNode(grammarAccess.getDataStoreAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getDataStoreRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_1_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,25,FOLLOW_25_in_ruleDataStore1230); 

                    createLeafNode(grammarAccess.getDataStoreAccess().getOfTypeKeyword_2(), null); 
                
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:717:1: ( ( RULE_ID ) )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:718:1: ( RULE_ID )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:718:1: ( RULE_ID )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:719:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getDataStoreRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDataStore1248); 

            		createLeafNode(grammarAccess.getDataStoreAccess().getClassEntityCrossReference_3_0(), "class"); 
            	

            }


            }

            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:731:2: ( (lv_multi_4_0= 'is-multi-valued' ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==26) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:732:1: (lv_multi_4_0= 'is-multi-valued' )
                    {
                    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:732:1: (lv_multi_4_0= 'is-multi-valued' )
                    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:733:3: lv_multi_4_0= 'is-multi-valued'
                    {
                    lv_multi_4_0=(Token)input.LT(1);
                    match(input,26,FOLLOW_26_in_ruleDataStore1266); 

                            createLeafNode(grammarAccess.getDataStoreAccess().getMultiIsMultiValuedKeyword_4_0(), "multi"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getDataStoreRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "multi", true, "is-multi-valued", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }
                    break;

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleDataStore


    // $ANTLR start entryRuleGroupElement
    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:760:1: entryRuleGroupElement returns [EObject current=null] : iv_ruleGroupElement= ruleGroupElement EOF ;
    public final EObject entryRuleGroupElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroupElement = null;


        try {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:761:2: (iv_ruleGroupElement= ruleGroupElement EOF )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:762:2: iv_ruleGroupElement= ruleGroupElement EOF
            {
             currentNode = createCompositeNode(grammarAccess.getGroupElementRule(), currentNode); 
            pushFollow(FOLLOW_ruleGroupElement_in_entryRuleGroupElement1316);
            iv_ruleGroupElement=ruleGroupElement();
            _fsp--;

             current =iv_ruleGroupElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGroupElement1326); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleGroupElement


    // $ANTLR start ruleGroupElement
    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:769:1: ruleGroupElement returns [EObject current=null] : (this_Field_0= ruleField | this_FieldGroup_1= ruleFieldGroup ) ;
    public final EObject ruleGroupElement() throws RecognitionException {
        EObject current = null;

        EObject this_Field_0 = null;

        EObject this_FieldGroup_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:774:6: ( (this_Field_0= ruleField | this_FieldGroup_1= ruleFieldGroup ) )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:775:1: (this_Field_0= ruleField | this_FieldGroup_1= ruleFieldGroup )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:775:1: (this_Field_0= ruleField | this_FieldGroup_1= ruleFieldGroup )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                alt9=1;
            }
            else if ( (LA9_0==27) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("775:1: (this_Field_0= ruleField | this_FieldGroup_1= ruleFieldGroup )", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:776:5: this_Field_0= ruleField
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getGroupElementAccess().getFieldParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleField_in_ruleGroupElement1373);
                    this_Field_0=ruleField();
                    _fsp--;

                     
                            current = this_Field_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:786:5: this_FieldGroup_1= ruleFieldGroup
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getGroupElementAccess().getFieldGroupParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleFieldGroup_in_ruleGroupElement1400);
                    this_FieldGroup_1=ruleFieldGroup();
                    _fsp--;

                     
                            current = this_FieldGroup_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleGroupElement


    // $ANTLR start entryRuleField
    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:802:1: entryRuleField returns [EObject current=null] : iv_ruleField= ruleField EOF ;
    public final EObject entryRuleField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleField = null;


        try {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:803:2: (iv_ruleField= ruleField EOF )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:804:2: iv_ruleField= ruleField EOF
            {
             currentNode = createCompositeNode(grammarAccess.getFieldRule(), currentNode); 
            pushFollow(FOLLOW_ruleField_in_entryRuleField1435);
            iv_ruleField=ruleField();
            _fsp--;

             current =iv_ruleField; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleField1445); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleField


    // $ANTLR start ruleField
    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:811:1: ruleField returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_label_1_0= ruleLabel ) ) ( (lv_path_2_0= rulePathTail ) ) ( (lv_attributes_3_0= ruleAttribute ) )* ) ;
    public final EObject ruleField() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_label_1_0 = null;

        EObject lv_path_2_0 = null;

        EObject lv_attributes_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:816:6: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_label_1_0= ruleLabel ) ) ( (lv_path_2_0= rulePathTail ) ) ( (lv_attributes_3_0= ruleAttribute ) )* ) )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:817:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_label_1_0= ruleLabel ) ) ( (lv_path_2_0= rulePathTail ) ) ( (lv_attributes_3_0= ruleAttribute ) )* )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:817:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_label_1_0= ruleLabel ) ) ( (lv_path_2_0= rulePathTail ) ) ( (lv_attributes_3_0= ruleAttribute ) )* )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:817:2: ( (lv_name_0_0= RULE_ID ) ) ( (lv_label_1_0= ruleLabel ) ) ( (lv_path_2_0= rulePathTail ) ) ( (lv_attributes_3_0= ruleAttribute ) )*
            {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:817:2: ( (lv_name_0_0= RULE_ID ) )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:818:1: (lv_name_0_0= RULE_ID )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:818:1: (lv_name_0_0= RULE_ID )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:819:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleField1487); 

            			createLeafNode(grammarAccess.getFieldAccess().getNameIDTerminalRuleCall_0_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getFieldRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_0_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:841:2: ( (lv_label_1_0= ruleLabel ) )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:842:1: (lv_label_1_0= ruleLabel )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:842:1: (lv_label_1_0= ruleLabel )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:843:3: lv_label_1_0= ruleLabel
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getFieldAccess().getLabelLabelParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleLabel_in_ruleField1513);
            lv_label_1_0=ruleLabel();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getFieldRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"label",
            	        		lv_label_1_0, 
            	        		"Label", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:865:2: ( (lv_path_2_0= rulePathTail ) )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:866:1: (lv_path_2_0= rulePathTail )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:866:1: (lv_path_2_0= rulePathTail )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:867:3: lv_path_2_0= rulePathTail
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getFieldAccess().getPathPathTailParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_rulePathTail_in_ruleField1534);
            lv_path_2_0=rulePathTail();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getFieldRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"path",
            	        		lv_path_2_0, 
            	        		"PathTail", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:889:2: ( (lv_attributes_3_0= ruleAttribute ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=33 && LA10_0<=34)||(LA10_0>=43 && LA10_0<=47)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:890:1: (lv_attributes_3_0= ruleAttribute )
            	    {
            	    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:890:1: (lv_attributes_3_0= ruleAttribute )
            	    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:891:3: lv_attributes_3_0= ruleAttribute
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getFieldAccess().getAttributesAttributeParserRuleCall_3_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleAttribute_in_ruleField1555);
            	    lv_attributes_3_0=ruleAttribute();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getFieldRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"attributes",
            	    	        		lv_attributes_3_0, 
            	    	        		"Attribute", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleField


    // $ANTLR start entryRuleFieldGroup
    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:921:1: entryRuleFieldGroup returns [EObject current=null] : iv_ruleFieldGroup= ruleFieldGroup EOF ;
    public final EObject entryRuleFieldGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFieldGroup = null;


        try {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:922:2: (iv_ruleFieldGroup= ruleFieldGroup EOF )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:923:2: iv_ruleFieldGroup= ruleFieldGroup EOF
            {
             currentNode = createCompositeNode(grammarAccess.getFieldGroupRule(), currentNode); 
            pushFollow(FOLLOW_ruleFieldGroup_in_entryRuleFieldGroup1592);
            iv_ruleFieldGroup=ruleFieldGroup();
            _fsp--;

             current =iv_ruleFieldGroup; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFieldGroup1602); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleFieldGroup


    // $ANTLR start ruleFieldGroup
    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:930:1: ruleFieldGroup returns [EObject current=null] : ( 'group' ( (lv_label_1_0= ruleLabel ) )? ( 'with' ( (lv_with_3_0= rulePathTail ) ) )? '{' ( (lv_elements_5_0= ruleGroupElement ) )+ '}' ( (lv_attributes_7_0= ruleAttribute ) )* ) ;
    public final EObject ruleFieldGroup() throws RecognitionException {
        EObject current = null;

        EObject lv_label_1_0 = null;

        EObject lv_with_3_0 = null;

        EObject lv_elements_5_0 = null;

        EObject lv_attributes_7_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:935:6: ( ( 'group' ( (lv_label_1_0= ruleLabel ) )? ( 'with' ( (lv_with_3_0= rulePathTail ) ) )? '{' ( (lv_elements_5_0= ruleGroupElement ) )+ '}' ( (lv_attributes_7_0= ruleAttribute ) )* ) )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:936:1: ( 'group' ( (lv_label_1_0= ruleLabel ) )? ( 'with' ( (lv_with_3_0= rulePathTail ) ) )? '{' ( (lv_elements_5_0= ruleGroupElement ) )+ '}' ( (lv_attributes_7_0= ruleAttribute ) )* )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:936:1: ( 'group' ( (lv_label_1_0= ruleLabel ) )? ( 'with' ( (lv_with_3_0= rulePathTail ) ) )? '{' ( (lv_elements_5_0= ruleGroupElement ) )+ '}' ( (lv_attributes_7_0= ruleAttribute ) )* )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:936:3: 'group' ( (lv_label_1_0= ruleLabel ) )? ( 'with' ( (lv_with_3_0= rulePathTail ) ) )? '{' ( (lv_elements_5_0= ruleGroupElement ) )+ '}' ( (lv_attributes_7_0= ruleAttribute ) )*
            {
            match(input,27,FOLLOW_27_in_ruleFieldGroup1637); 

                    createLeafNode(grammarAccess.getFieldGroupAccess().getGroupKeyword_0(), null); 
                
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:940:1: ( (lv_label_1_0= ruleLabel ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_STRING) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:941:1: (lv_label_1_0= ruleLabel )
                    {
                    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:941:1: (lv_label_1_0= ruleLabel )
                    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:942:3: lv_label_1_0= ruleLabel
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getFieldGroupAccess().getLabelLabelParserRuleCall_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleLabel_in_ruleFieldGroup1658);
                    lv_label_1_0=ruleLabel();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getFieldGroupRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"label",
                    	        		lv_label_1_0, 
                    	        		"Label", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;

            }

            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:964:3: ( 'with' ( (lv_with_3_0= rulePathTail ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==28) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:964:5: 'with' ( (lv_with_3_0= rulePathTail ) )
                    {
                    match(input,28,FOLLOW_28_in_ruleFieldGroup1670); 

                            createLeafNode(grammarAccess.getFieldGroupAccess().getWithKeyword_2_0(), null); 
                        
                    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:968:1: ( (lv_with_3_0= rulePathTail ) )
                    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:969:1: (lv_with_3_0= rulePathTail )
                    {
                    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:969:1: (lv_with_3_0= rulePathTail )
                    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:970:3: lv_with_3_0= rulePathTail
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getFieldGroupAccess().getWithPathTailParserRuleCall_2_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_rulePathTail_in_ruleFieldGroup1691);
                    lv_with_3_0=rulePathTail();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getFieldGroupRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"with",
                    	        		lv_with_3_0, 
                    	        		"PathTail", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;

            }

            match(input,29,FOLLOW_29_in_ruleFieldGroup1703); 

                    createLeafNode(grammarAccess.getFieldGroupAccess().getLeftCurlyBracketKeyword_3(), null); 
                
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:996:1: ( (lv_elements_5_0= ruleGroupElement ) )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID||LA13_0==27) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:997:1: (lv_elements_5_0= ruleGroupElement )
            	    {
            	    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:997:1: (lv_elements_5_0= ruleGroupElement )
            	    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:998:3: lv_elements_5_0= ruleGroupElement
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getFieldGroupAccess().getElementsGroupElementParserRuleCall_4_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleGroupElement_in_ruleFieldGroup1724);
            	    lv_elements_5_0=ruleGroupElement();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getFieldGroupRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"elements",
            	    	        		lv_elements_5_0, 
            	    	        		"GroupElement", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);

            match(input,30,FOLLOW_30_in_ruleFieldGroup1735); 

                    createLeafNode(grammarAccess.getFieldGroupAccess().getRightCurlyBracketKeyword_5(), null); 
                
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1024:1: ( (lv_attributes_7_0= ruleAttribute ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=33 && LA14_0<=34)||(LA14_0>=43 && LA14_0<=47)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1025:1: (lv_attributes_7_0= ruleAttribute )
            	    {
            	    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1025:1: (lv_attributes_7_0= ruleAttribute )
            	    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1026:3: lv_attributes_7_0= ruleAttribute
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getFieldGroupAccess().getAttributesAttributeParserRuleCall_6_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleAttribute_in_ruleFieldGroup1756);
            	    lv_attributes_7_0=ruleAttribute();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getFieldGroupRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"attributes",
            	    	        		lv_attributes_7_0, 
            	    	        		"Attribute", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleFieldGroup


    // $ANTLR start entryRuleAttribute
    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1056:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1057:2: (iv_ruleAttribute= ruleAttribute EOF )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1058:2: iv_ruleAttribute= ruleAttribute EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAttributeRule(), currentNode); 
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute1793);
            iv_ruleAttribute=ruleAttribute();
            _fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute1803); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleAttribute


    // $ANTLR start ruleAttribute
    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1065:1: ruleAttribute returns [EObject current=null] : (this_NormalAttribute_0= ruleNormalAttribute | this_EnumFieldAttribute_1= ruleEnumFieldAttribute ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        EObject this_NormalAttribute_0 = null;

        EObject this_EnumFieldAttribute_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1070:6: ( (this_NormalAttribute_0= ruleNormalAttribute | this_EnumFieldAttribute_1= ruleEnumFieldAttribute ) )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1071:1: (this_NormalAttribute_0= ruleNormalAttribute | this_EnumFieldAttribute_1= ruleEnumFieldAttribute )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1071:1: (this_NormalAttribute_0= ruleNormalAttribute | this_EnumFieldAttribute_1= ruleEnumFieldAttribute )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=43 && LA15_0<=47)) ) {
                alt15=1;
            }
            else if ( ((LA15_0>=33 && LA15_0<=34)) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1071:1: (this_NormalAttribute_0= ruleNormalAttribute | this_EnumFieldAttribute_1= ruleEnumFieldAttribute )", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1072:5: this_NormalAttribute_0= ruleNormalAttribute
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getAttributeAccess().getNormalAttributeParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleNormalAttribute_in_ruleAttribute1850);
                    this_NormalAttribute_0=ruleNormalAttribute();
                    _fsp--;

                     
                            current = this_NormalAttribute_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1082:5: this_EnumFieldAttribute_1= ruleEnumFieldAttribute
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getAttributeAccess().getEnumFieldAttributeParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleEnumFieldAttribute_in_ruleAttribute1877);
                    this_EnumFieldAttribute_1=ruleEnumFieldAttribute();
                    _fsp--;

                     
                            current = this_EnumFieldAttribute_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleAttribute


    // $ANTLR start entryRuleEnumFieldAttribute
    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1098:1: entryRuleEnumFieldAttribute returns [EObject current=null] : iv_ruleEnumFieldAttribute= ruleEnumFieldAttribute EOF ;
    public final EObject entryRuleEnumFieldAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumFieldAttribute = null;


        try {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1099:2: (iv_ruleEnumFieldAttribute= ruleEnumFieldAttribute EOF )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1100:2: iv_ruleEnumFieldAttribute= ruleEnumFieldAttribute EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEnumFieldAttributeRule(), currentNode); 
            pushFollow(FOLLOW_ruleEnumFieldAttribute_in_entryRuleEnumFieldAttribute1912);
            iv_ruleEnumFieldAttribute=ruleEnumFieldAttribute();
            _fsp--;

             current =iv_ruleEnumFieldAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumFieldAttribute1922); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleEnumFieldAttribute


    // $ANTLR start ruleEnumFieldAttribute
    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1107:1: ruleEnumFieldAttribute returns [EObject current=null] : (this_RestrictionAttribute_0= ruleRestrictionAttribute | this_RestrictionGroupAttribute_1= ruleRestrictionGroupAttribute ) ;
    public final EObject ruleEnumFieldAttribute() throws RecognitionException {
        EObject current = null;

        EObject this_RestrictionAttribute_0 = null;

        EObject this_RestrictionGroupAttribute_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1112:6: ( (this_RestrictionAttribute_0= ruleRestrictionAttribute | this_RestrictionGroupAttribute_1= ruleRestrictionGroupAttribute ) )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1113:1: (this_RestrictionAttribute_0= ruleRestrictionAttribute | this_RestrictionGroupAttribute_1= ruleRestrictionGroupAttribute )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1113:1: (this_RestrictionAttribute_0= ruleRestrictionAttribute | this_RestrictionGroupAttribute_1= ruleRestrictionGroupAttribute )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==33) ) {
                alt16=1;
            }
            else if ( (LA16_0==34) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1113:1: (this_RestrictionAttribute_0= ruleRestrictionAttribute | this_RestrictionGroupAttribute_1= ruleRestrictionGroupAttribute )", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1114:5: this_RestrictionAttribute_0= ruleRestrictionAttribute
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getEnumFieldAttributeAccess().getRestrictionAttributeParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleRestrictionAttribute_in_ruleEnumFieldAttribute1969);
                    this_RestrictionAttribute_0=ruleRestrictionAttribute();
                    _fsp--;

                     
                            current = this_RestrictionAttribute_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1124:5: this_RestrictionGroupAttribute_1= ruleRestrictionGroupAttribute
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getEnumFieldAttributeAccess().getRestrictionGroupAttributeParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleRestrictionGroupAttribute_in_ruleEnumFieldAttribute1996);
                    this_RestrictionGroupAttribute_1=ruleRestrictionGroupAttribute();
                    _fsp--;

                     
                            current = this_RestrictionGroupAttribute_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleEnumFieldAttribute


    // $ANTLR start entryRuleNormalAttribute
    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1140:1: entryRuleNormalAttribute returns [EObject current=null] : iv_ruleNormalAttribute= ruleNormalAttribute EOF ;
    public final EObject entryRuleNormalAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNormalAttribute = null;


        try {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1141:2: (iv_ruleNormalAttribute= ruleNormalAttribute EOF )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1142:2: iv_ruleNormalAttribute= ruleNormalAttribute EOF
            {
             currentNode = createCompositeNode(grammarAccess.getNormalAttributeRule(), currentNode); 
            pushFollow(FOLLOW_ruleNormalAttribute_in_entryRuleNormalAttribute2031);
            iv_ruleNormalAttribute=ruleNormalAttribute();
            _fsp--;

             current =iv_ruleNormalAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNormalAttribute2041); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleNormalAttribute


    // $ANTLR start ruleNormalAttribute
    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1149:1: ruleNormalAttribute returns [EObject current=null] : ( ( (lv_classExpr_0_0= ruleAttributeClassExpression ) ) ( 'if' ( (lv_clause_2_0= ruleBExpression ) ) )? ) ;
    public final EObject ruleNormalAttribute() throws RecognitionException {
        EObject current = null;

        EObject lv_classExpr_0_0 = null;

        EObject lv_clause_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1154:6: ( ( ( (lv_classExpr_0_0= ruleAttributeClassExpression ) ) ( 'if' ( (lv_clause_2_0= ruleBExpression ) ) )? ) )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1155:1: ( ( (lv_classExpr_0_0= ruleAttributeClassExpression ) ) ( 'if' ( (lv_clause_2_0= ruleBExpression ) ) )? )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1155:1: ( ( (lv_classExpr_0_0= ruleAttributeClassExpression ) ) ( 'if' ( (lv_clause_2_0= ruleBExpression ) ) )? )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1155:2: ( (lv_classExpr_0_0= ruleAttributeClassExpression ) ) ( 'if' ( (lv_clause_2_0= ruleBExpression ) ) )?
            {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1155:2: ( (lv_classExpr_0_0= ruleAttributeClassExpression ) )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1156:1: (lv_classExpr_0_0= ruleAttributeClassExpression )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1156:1: (lv_classExpr_0_0= ruleAttributeClassExpression )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1157:3: lv_classExpr_0_0= ruleAttributeClassExpression
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getNormalAttributeAccess().getClassExprAttributeClassExpressionParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleAttributeClassExpression_in_ruleNormalAttribute2087);
            lv_classExpr_0_0=ruleAttributeClassExpression();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getNormalAttributeRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"classExpr",
            	        		lv_classExpr_0_0, 
            	        		"AttributeClassExpression", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1179:2: ( 'if' ( (lv_clause_2_0= ruleBExpression ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==31) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1179:4: 'if' ( (lv_clause_2_0= ruleBExpression ) )
                    {
                    match(input,31,FOLLOW_31_in_ruleNormalAttribute2098); 

                            createLeafNode(grammarAccess.getNormalAttributeAccess().getIfKeyword_1_0(), null); 
                        
                    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1183:1: ( (lv_clause_2_0= ruleBExpression ) )
                    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1184:1: (lv_clause_2_0= ruleBExpression )
                    {
                    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1184:1: (lv_clause_2_0= ruleBExpression )
                    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1185:3: lv_clause_2_0= ruleBExpression
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getNormalAttributeAccess().getClauseBExpressionParserRuleCall_1_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleBExpression_in_ruleNormalAttribute2119);
                    lv_clause_2_0=ruleBExpression();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getNormalAttributeRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"clause",
                    	        		lv_clause_2_0, 
                    	        		"BExpression", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleNormalAttribute


    // $ANTLR start entryRuleAttributeClassExpression
    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1215:1: entryRuleAttributeClassExpression returns [EObject current=null] : iv_ruleAttributeClassExpression= ruleAttributeClassExpression EOF ;
    public final EObject entryRuleAttributeClassExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeClassExpression = null;


        try {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1216:2: (iv_ruleAttributeClassExpression= ruleAttributeClassExpression EOF )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1217:2: iv_ruleAttributeClassExpression= ruleAttributeClassExpression EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAttributeClassExpressionRule(), currentNode); 
            pushFollow(FOLLOW_ruleAttributeClassExpression_in_entryRuleAttributeClassExpression2157);
            iv_ruleAttributeClassExpression=ruleAttributeClassExpression();
            _fsp--;

             current =iv_ruleAttributeClassExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributeClassExpression2167); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleAttributeClassExpression


    // $ANTLR start ruleAttributeClassExpression
    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1224:1: ruleAttributeClassExpression returns [EObject current=null] : ( ( (lv_classes_0_0= ruleAttributeClass ) ) ( '+' ( (lv_classes_2_0= ruleAttributeClass ) ) )* ) ;
    public final EObject ruleAttributeClassExpression() throws RecognitionException {
        EObject current = null;

        Enumerator lv_classes_0_0 = null;

        Enumerator lv_classes_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1229:6: ( ( ( (lv_classes_0_0= ruleAttributeClass ) ) ( '+' ( (lv_classes_2_0= ruleAttributeClass ) ) )* ) )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1230:1: ( ( (lv_classes_0_0= ruleAttributeClass ) ) ( '+' ( (lv_classes_2_0= ruleAttributeClass ) ) )* )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1230:1: ( ( (lv_classes_0_0= ruleAttributeClass ) ) ( '+' ( (lv_classes_2_0= ruleAttributeClass ) ) )* )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1230:2: ( (lv_classes_0_0= ruleAttributeClass ) ) ( '+' ( (lv_classes_2_0= ruleAttributeClass ) ) )*
            {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1230:2: ( (lv_classes_0_0= ruleAttributeClass ) )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1231:1: (lv_classes_0_0= ruleAttributeClass )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1231:1: (lv_classes_0_0= ruleAttributeClass )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1232:3: lv_classes_0_0= ruleAttributeClass
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getAttributeClassExpressionAccess().getClassesAttributeClassEnumRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleAttributeClass_in_ruleAttributeClassExpression2213);
            lv_classes_0_0=ruleAttributeClass();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getAttributeClassExpressionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		add(
            	       			current, 
            	       			"classes",
            	        		lv_classes_0_0, 
            	        		"AttributeClass", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1254:2: ( '+' ( (lv_classes_2_0= ruleAttributeClass ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==32) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1254:4: '+' ( (lv_classes_2_0= ruleAttributeClass ) )
            	    {
            	    match(input,32,FOLLOW_32_in_ruleAttributeClassExpression2224); 

            	            createLeafNode(grammarAccess.getAttributeClassExpressionAccess().getPlusSignKeyword_1_0(), null); 
            	        
            	    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1258:1: ( (lv_classes_2_0= ruleAttributeClass ) )
            	    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1259:1: (lv_classes_2_0= ruleAttributeClass )
            	    {
            	    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1259:1: (lv_classes_2_0= ruleAttributeClass )
            	    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1260:3: lv_classes_2_0= ruleAttributeClass
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getAttributeClassExpressionAccess().getClassesAttributeClassEnumRuleCall_1_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleAttributeClass_in_ruleAttributeClassExpression2245);
            	    lv_classes_2_0=ruleAttributeClass();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getAttributeClassExpressionRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"classes",
            	    	        		lv_classes_2_0, 
            	    	        		"AttributeClass", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleAttributeClassExpression


    // $ANTLR start entryRuleRestrictionAttribute
    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1290:1: entryRuleRestrictionAttribute returns [EObject current=null] : iv_ruleRestrictionAttribute= ruleRestrictionAttribute EOF ;
    public final EObject entryRuleRestrictionAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRestrictionAttribute = null;


        try {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1291:2: (iv_ruleRestrictionAttribute= ruleRestrictionAttribute EOF )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1292:2: iv_ruleRestrictionAttribute= ruleRestrictionAttribute EOF
            {
             currentNode = createCompositeNode(grammarAccess.getRestrictionAttributeRule(), currentNode); 
            pushFollow(FOLLOW_ruleRestrictionAttribute_in_entryRuleRestrictionAttribute2283);
            iv_ruleRestrictionAttribute=ruleRestrictionAttribute();
            _fsp--;

             current =iv_ruleRestrictionAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRestrictionAttribute2293); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleRestrictionAttribute


    // $ANTLR start ruleRestrictionAttribute
    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1299:1: ruleRestrictionAttribute returns [EObject current=null] : ( 'restrict-to' ( (lv_literals_1_0= ruleEnumLiteralsCollection ) ) 'if' ( (lv_clause_3_0= ruleBExpression ) ) ) ;
    public final EObject ruleRestrictionAttribute() throws RecognitionException {
        EObject current = null;

        EObject lv_literals_1_0 = null;

        EObject lv_clause_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1304:6: ( ( 'restrict-to' ( (lv_literals_1_0= ruleEnumLiteralsCollection ) ) 'if' ( (lv_clause_3_0= ruleBExpression ) ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1305:1: ( 'restrict-to' ( (lv_literals_1_0= ruleEnumLiteralsCollection ) ) 'if' ( (lv_clause_3_0= ruleBExpression ) ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1305:1: ( 'restrict-to' ( (lv_literals_1_0= ruleEnumLiteralsCollection ) ) 'if' ( (lv_clause_3_0= ruleBExpression ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1305:3: 'restrict-to' ( (lv_literals_1_0= ruleEnumLiteralsCollection ) ) 'if' ( (lv_clause_3_0= ruleBExpression ) )
            {
            match(input,33,FOLLOW_33_in_ruleRestrictionAttribute2328); 

                    createLeafNode(grammarAccess.getRestrictionAttributeAccess().getRestrictToKeyword_0(), null); 
                
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1309:1: ( (lv_literals_1_0= ruleEnumLiteralsCollection ) )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1310:1: (lv_literals_1_0= ruleEnumLiteralsCollection )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1310:1: (lv_literals_1_0= ruleEnumLiteralsCollection )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1311:3: lv_literals_1_0= ruleEnumLiteralsCollection
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getRestrictionAttributeAccess().getLiteralsEnumLiteralsCollectionParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleEnumLiteralsCollection_in_ruleRestrictionAttribute2349);
            lv_literals_1_0=ruleEnumLiteralsCollection();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getRestrictionAttributeRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"literals",
            	        		lv_literals_1_0, 
            	        		"EnumLiteralsCollection", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,31,FOLLOW_31_in_ruleRestrictionAttribute2359); 

                    createLeafNode(grammarAccess.getRestrictionAttributeAccess().getIfKeyword_2(), null); 
                
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1337:1: ( (lv_clause_3_0= ruleBExpression ) )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1338:1: (lv_clause_3_0= ruleBExpression )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1338:1: (lv_clause_3_0= ruleBExpression )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1339:3: lv_clause_3_0= ruleBExpression
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getRestrictionAttributeAccess().getClauseBExpressionParserRuleCall_3_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleBExpression_in_ruleRestrictionAttribute2380);
            lv_clause_3_0=ruleBExpression();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getRestrictionAttributeRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"clause",
            	        		lv_clause_3_0, 
            	        		"BExpression", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleRestrictionAttribute


    // $ANTLR start entryRuleRestrictionGroupAttribute
    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1369:1: entryRuleRestrictionGroupAttribute returns [EObject current=null] : iv_ruleRestrictionGroupAttribute= ruleRestrictionGroupAttribute EOF ;
    public final EObject entryRuleRestrictionGroupAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRestrictionGroupAttribute = null;


        try {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1370:2: (iv_ruleRestrictionGroupAttribute= ruleRestrictionGroupAttribute EOF )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1371:2: iv_ruleRestrictionGroupAttribute= ruleRestrictionGroupAttribute EOF
            {
             currentNode = createCompositeNode(grammarAccess.getRestrictionGroupAttributeRule(), currentNode); 
            pushFollow(FOLLOW_ruleRestrictionGroupAttribute_in_entryRuleRestrictionGroupAttribute2416);
            iv_ruleRestrictionGroupAttribute=ruleRestrictionGroupAttribute();
            _fsp--;

             current =iv_ruleRestrictionGroupAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRestrictionGroupAttribute2426); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleRestrictionGroupAttribute


    // $ANTLR start ruleRestrictionGroupAttribute
    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1378:1: ruleRestrictionGroupAttribute returns [EObject current=null] : ( () 'restrict-to-group' '<' ( (lv_rules_3_0= ruleRestrictionRule ) )+ '>' ) ;
    public final EObject ruleRestrictionGroupAttribute() throws RecognitionException {
        EObject current = null;

        EObject lv_rules_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1383:6: ( ( () 'restrict-to-group' '<' ( (lv_rules_3_0= ruleRestrictionRule ) )+ '>' ) )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1384:1: ( () 'restrict-to-group' '<' ( (lv_rules_3_0= ruleRestrictionRule ) )+ '>' )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1384:1: ( () 'restrict-to-group' '<' ( (lv_rules_3_0= ruleRestrictionRule ) )+ '>' )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1384:2: () 'restrict-to-group' '<' ( (lv_rules_3_0= ruleRestrictionRule ) )+ '>'
            {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1384:2: ()
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1385:5: 
            {
             
                    temp=factory.create(grammarAccess.getRestrictionGroupAttributeAccess().getRestrictionGroupAttributeAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getRestrictionGroupAttributeAccess().getRestrictionGroupAttributeAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            match(input,34,FOLLOW_34_in_ruleRestrictionGroupAttribute2470); 

                    createLeafNode(grammarAccess.getRestrictionGroupAttributeAccess().getRestrictToGroupKeyword_1(), null); 
                
            match(input,35,FOLLOW_35_in_ruleRestrictionGroupAttribute2480); 

                    createLeafNode(grammarAccess.getRestrictionGroupAttributeAccess().getLessThanSignKeyword_2(), null); 
                
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1403:1: ( (lv_rules_3_0= ruleRestrictionRule ) )+
            int cnt19=0;
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_ID||LA19_0==18) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1404:1: (lv_rules_3_0= ruleRestrictionRule )
            	    {
            	    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1404:1: (lv_rules_3_0= ruleRestrictionRule )
            	    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1405:3: lv_rules_3_0= ruleRestrictionRule
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getRestrictionGroupAttributeAccess().getRulesRestrictionRuleParserRuleCall_3_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleRestrictionRule_in_ruleRestrictionGroupAttribute2501);
            	    lv_rules_3_0=ruleRestrictionRule();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getRestrictionGroupAttributeRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"rules",
            	    	        		lv_rules_3_0, 
            	    	        		"RestrictionRule", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt19 >= 1 ) break loop19;
                        EarlyExitException eee =
                            new EarlyExitException(19, input);
                        throw eee;
                }
                cnt19++;
            } while (true);

            match(input,36,FOLLOW_36_in_ruleRestrictionGroupAttribute2512); 

                    createLeafNode(grammarAccess.getRestrictionGroupAttributeAccess().getGreaterThanSignKeyword_4(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleRestrictionGroupAttribute


    // $ANTLR start entryRuleRestrictionRule
    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1439:1: entryRuleRestrictionRule returns [EObject current=null] : iv_ruleRestrictionRule= ruleRestrictionRule EOF ;
    public final EObject entryRuleRestrictionRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRestrictionRule = null;


        try {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1440:2: (iv_ruleRestrictionRule= ruleRestrictionRule EOF )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1441:2: iv_ruleRestrictionRule= ruleRestrictionRule EOF
            {
             currentNode = createCompositeNode(grammarAccess.getRestrictionRuleRule(), currentNode); 
            pushFollow(FOLLOW_ruleRestrictionRule_in_entryRuleRestrictionRule2548);
            iv_ruleRestrictionRule=ruleRestrictionRule();
            _fsp--;

             current =iv_ruleRestrictionRule; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRestrictionRule2558); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleRestrictionRule


    // $ANTLR start ruleRestrictionRule
    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1448:1: ruleRestrictionRule returns [EObject current=null] : ( ( (lv_literals_0_0= ruleEnumLiteralsCollection ) ) 'if' ( (lv_clause_2_0= ruleBExpression ) ) ) ;
    public final EObject ruleRestrictionRule() throws RecognitionException {
        EObject current = null;

        EObject lv_literals_0_0 = null;

        EObject lv_clause_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1453:6: ( ( ( (lv_literals_0_0= ruleEnumLiteralsCollection ) ) 'if' ( (lv_clause_2_0= ruleBExpression ) ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1454:1: ( ( (lv_literals_0_0= ruleEnumLiteralsCollection ) ) 'if' ( (lv_clause_2_0= ruleBExpression ) ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1454:1: ( ( (lv_literals_0_0= ruleEnumLiteralsCollection ) ) 'if' ( (lv_clause_2_0= ruleBExpression ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1454:2: ( (lv_literals_0_0= ruleEnumLiteralsCollection ) ) 'if' ( (lv_clause_2_0= ruleBExpression ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1454:2: ( (lv_literals_0_0= ruleEnumLiteralsCollection ) )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1455:1: (lv_literals_0_0= ruleEnumLiteralsCollection )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1455:1: (lv_literals_0_0= ruleEnumLiteralsCollection )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1456:3: lv_literals_0_0= ruleEnumLiteralsCollection
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getRestrictionRuleAccess().getLiteralsEnumLiteralsCollectionParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleEnumLiteralsCollection_in_ruleRestrictionRule2604);
            lv_literals_0_0=ruleEnumLiteralsCollection();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getRestrictionRuleRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"literals",
            	        		lv_literals_0_0, 
            	        		"EnumLiteralsCollection", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,31,FOLLOW_31_in_ruleRestrictionRule2614); 

                    createLeafNode(grammarAccess.getRestrictionRuleAccess().getIfKeyword_1(), null); 
                
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1482:1: ( (lv_clause_2_0= ruleBExpression ) )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1483:1: (lv_clause_2_0= ruleBExpression )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1483:1: (lv_clause_2_0= ruleBExpression )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1484:3: lv_clause_2_0= ruleBExpression
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getRestrictionRuleAccess().getClauseBExpressionParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleBExpression_in_ruleRestrictionRule2635);
            lv_clause_2_0=ruleBExpression();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getRestrictionRuleRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"clause",
            	        		lv_clause_2_0, 
            	        		"BExpression", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleRestrictionRule


    // $ANTLR start entryRuleReferenceTarget
    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1514:1: entryRuleReferenceTarget returns [EObject current=null] : iv_ruleReferenceTarget= ruleReferenceTarget EOF ;
    public final EObject entryRuleReferenceTarget() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReferenceTarget = null;


        try {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1515:2: (iv_ruleReferenceTarget= ruleReferenceTarget EOF )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1516:2: iv_ruleReferenceTarget= ruleReferenceTarget EOF
            {
             currentNode = createCompositeNode(grammarAccess.getReferenceTargetRule(), currentNode); 
            pushFollow(FOLLOW_ruleReferenceTarget_in_entryRuleReferenceTarget2671);
            iv_ruleReferenceTarget=ruleReferenceTarget();
            _fsp--;

             current =iv_ruleReferenceTarget; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReferenceTarget2681); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleReferenceTarget


    // $ANTLR start ruleReferenceTarget
    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1523:1: ruleReferenceTarget returns [EObject current=null] : (this_Field_0= ruleField | this_ExternalVariable_1= ruleExternalVariable ) ;
    public final EObject ruleReferenceTarget() throws RecognitionException {
        EObject current = null;

        EObject this_Field_0 = null;

        EObject this_ExternalVariable_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1528:6: ( (this_Field_0= ruleField | this_ExternalVariable_1= ruleExternalVariable ) )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1529:1: (this_Field_0= ruleField | this_ExternalVariable_1= ruleExternalVariable )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1529:1: (this_Field_0= ruleField | this_ExternalVariable_1= ruleExternalVariable )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_ID) ) {
                alt20=1;
            }
            else if ( (LA20_0==20) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1529:1: (this_Field_0= ruleField | this_ExternalVariable_1= ruleExternalVariable )", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1530:5: this_Field_0= ruleField
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getReferenceTargetAccess().getFieldParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleField_in_ruleReferenceTarget2728);
                    this_Field_0=ruleField();
                    _fsp--;

                     
                            current = this_Field_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1540:5: this_ExternalVariable_1= ruleExternalVariable
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getReferenceTargetAccess().getExternalVariableParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleExternalVariable_in_ruleReferenceTarget2755);
                    this_ExternalVariable_1=ruleExternalVariable();
                    _fsp--;

                     
                            current = this_ExternalVariable_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleReferenceTarget


    // $ANTLR start entryRuleReference
    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1556:1: entryRuleReference returns [EObject current=null] : iv_ruleReference= ruleReference EOF ;
    public final EObject entryRuleReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReference = null;


        try {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1557:2: (iv_ruleReference= ruleReference EOF )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1558:2: iv_ruleReference= ruleReference EOF
            {
             currentNode = createCompositeNode(grammarAccess.getReferenceRule(), currentNode); 
            pushFollow(FOLLOW_ruleReference_in_entryRuleReference2790);
            iv_ruleReference=ruleReference();
            _fsp--;

             current =iv_ruleReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReference2800); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleReference


    // $ANTLR start ruleReference
    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1565:1: ruleReference returns [EObject current=null] : ( ( RULE_ID ) ) ;
    public final EObject ruleReference() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1570:6: ( ( ( RULE_ID ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1571:1: ( ( RULE_ID ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1571:1: ( ( RULE_ID ) )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1572:1: ( RULE_ID )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1572:1: ( RULE_ID )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1573:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getReferenceRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleReference2842); 

            		createLeafNode(grammarAccess.getReferenceAccess().getRefReferenceTargetCrossReference_0(), "ref"); 
            	

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleReference


    // $ANTLR start entryRuleBExpression
    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1595:1: entryRuleBExpression returns [EObject current=null] : iv_ruleBExpression= ruleBExpression EOF ;
    public final EObject entryRuleBExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBExpression = null;


        try {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1596:2: (iv_ruleBExpression= ruleBExpression EOF )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1597:2: iv_ruleBExpression= ruleBExpression EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBExpressionRule(), currentNode); 
            pushFollow(FOLLOW_ruleBExpression_in_entryRuleBExpression2879);
            iv_ruleBExpression=ruleBExpression();
            _fsp--;

             current =iv_ruleBExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBExpression2889); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleBExpression


    // $ANTLR start ruleBExpression
    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1604:1: ruleBExpression returns [EObject current=null] : this_BOrExpression_0= ruleBOrExpression ;
    public final EObject ruleBExpression() throws RecognitionException {
        EObject current = null;

        EObject this_BOrExpression_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1609:6: (this_BOrExpression_0= ruleBOrExpression )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1611:5: this_BOrExpression_0= ruleBOrExpression
            {
             
                    currentNode=createCompositeNode(grammarAccess.getBExpressionAccess().getBOrExpressionParserRuleCall(), currentNode); 
                
            pushFollow(FOLLOW_ruleBOrExpression_in_ruleBExpression2935);
            this_BOrExpression_0=ruleBOrExpression();
            _fsp--;

             
                    current = this_BOrExpression_0; 
                    currentNode = currentNode.getParent();
                

            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleBExpression


    // $ANTLR start entryRuleBOrExpression
    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1627:1: entryRuleBOrExpression returns [EObject current=null] : iv_ruleBOrExpression= ruleBOrExpression EOF ;
    public final EObject entryRuleBOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBOrExpression = null;


        try {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1628:2: (iv_ruleBOrExpression= ruleBOrExpression EOF )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1629:2: iv_ruleBOrExpression= ruleBOrExpression EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBOrExpressionRule(), currentNode); 
            pushFollow(FOLLOW_ruleBOrExpression_in_entryRuleBOrExpression2969);
            iv_ruleBOrExpression=ruleBOrExpression();
            _fsp--;

             current =iv_ruleBOrExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBOrExpression2979); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleBOrExpression


    // $ANTLR start ruleBOrExpression
    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1636:1: ruleBOrExpression returns [EObject current=null] : (this_BAndExpression_0= ruleBAndExpression ( () 'or' ( (lv_right_3_0= ruleBAndExpression ) ) )* ) ;
    public final EObject ruleBOrExpression() throws RecognitionException {
        EObject current = null;

        EObject this_BAndExpression_0 = null;

        EObject lv_right_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1641:6: ( (this_BAndExpression_0= ruleBAndExpression ( () 'or' ( (lv_right_3_0= ruleBAndExpression ) ) )* ) )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1642:1: (this_BAndExpression_0= ruleBAndExpression ( () 'or' ( (lv_right_3_0= ruleBAndExpression ) ) )* )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1642:1: (this_BAndExpression_0= ruleBAndExpression ( () 'or' ( (lv_right_3_0= ruleBAndExpression ) ) )* )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1643:5: this_BAndExpression_0= ruleBAndExpression ( () 'or' ( (lv_right_3_0= ruleBAndExpression ) ) )*
            {
             
                    currentNode=createCompositeNode(grammarAccess.getBOrExpressionAccess().getBAndExpressionParserRuleCall_0(), currentNode); 
                
            pushFollow(FOLLOW_ruleBAndExpression_in_ruleBOrExpression3026);
            this_BAndExpression_0=ruleBAndExpression();
            _fsp--;

             
                    current = this_BAndExpression_0; 
                    currentNode = currentNode.getParent();
                
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1651:1: ( () 'or' ( (lv_right_3_0= ruleBAndExpression ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==37) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1651:2: () 'or' ( (lv_right_3_0= ruleBAndExpression ) )
            	    {
            	    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1651:2: ()
            	    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1652:5: 
            	    {
            	     
            	            temp=factory.create(grammarAccess.getBOrExpressionAccess().getOrOperationLeftAction_1_0().getType().getClassifier());
            	            try {
            	            	factory.set(temp, "left", current, null /*ParserRule*/, currentNode);
            	            } catch(ValueConverterException vce) {
            	            	handleValueConverterException(vce);
            	            }
            	            current = temp; 
            	            temp = null;
            	            CompositeNode newNode = createCompositeNode(grammarAccess.getBOrExpressionAccess().getOrOperationLeftAction_1_0(), currentNode.getParent());
            	        newNode.getChildren().add(currentNode);
            	        moveLookaheadInfo(currentNode, newNode);
            	        currentNode = newNode; 
            	            associateNodeWithAstElement(currentNode, current); 
            	        

            	    }

            	    match(input,37,FOLLOW_37_in_ruleBOrExpression3045); 

            	            createLeafNode(grammarAccess.getBOrExpressionAccess().getOrKeyword_1_1(), null); 
            	        
            	    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1671:1: ( (lv_right_3_0= ruleBAndExpression ) )
            	    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1672:1: (lv_right_3_0= ruleBAndExpression )
            	    {
            	    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1672:1: (lv_right_3_0= ruleBAndExpression )
            	    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1673:3: lv_right_3_0= ruleBAndExpression
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getBOrExpressionAccess().getRightBAndExpressionParserRuleCall_1_2_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleBAndExpression_in_ruleBOrExpression3066);
            	    lv_right_3_0=ruleBAndExpression();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getBOrExpressionRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		set(
            	    	       			current, 
            	    	       			"right",
            	    	        		lv_right_3_0, 
            	    	        		"BAndExpression", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleBOrExpression


    // $ANTLR start entryRuleBAndExpression
    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1703:1: entryRuleBAndExpression returns [EObject current=null] : iv_ruleBAndExpression= ruleBAndExpression EOF ;
    public final EObject entryRuleBAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBAndExpression = null;


        try {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1704:2: (iv_ruleBAndExpression= ruleBAndExpression EOF )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1705:2: iv_ruleBAndExpression= ruleBAndExpression EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBAndExpressionRule(), currentNode); 
            pushFollow(FOLLOW_ruleBAndExpression_in_entryRuleBAndExpression3104);
            iv_ruleBAndExpression=ruleBAndExpression();
            _fsp--;

             current =iv_ruleBAndExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBAndExpression3114); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleBAndExpression


    // $ANTLR start ruleBAndExpression
    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1712:1: ruleBAndExpression returns [EObject current=null] : (this_TerminalBExpression_0= ruleTerminalBExpression ( () 'and' ( (lv_right_3_0= ruleTerminalBExpression ) ) )* ) ;
    public final EObject ruleBAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_TerminalBExpression_0 = null;

        EObject lv_right_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1717:6: ( (this_TerminalBExpression_0= ruleTerminalBExpression ( () 'and' ( (lv_right_3_0= ruleTerminalBExpression ) ) )* ) )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1718:1: (this_TerminalBExpression_0= ruleTerminalBExpression ( () 'and' ( (lv_right_3_0= ruleTerminalBExpression ) ) )* )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1718:1: (this_TerminalBExpression_0= ruleTerminalBExpression ( () 'and' ( (lv_right_3_0= ruleTerminalBExpression ) ) )* )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1719:5: this_TerminalBExpression_0= ruleTerminalBExpression ( () 'and' ( (lv_right_3_0= ruleTerminalBExpression ) ) )*
            {
             
                    currentNode=createCompositeNode(grammarAccess.getBAndExpressionAccess().getTerminalBExpressionParserRuleCall_0(), currentNode); 
                
            pushFollow(FOLLOW_ruleTerminalBExpression_in_ruleBAndExpression3161);
            this_TerminalBExpression_0=ruleTerminalBExpression();
            _fsp--;

             
                    current = this_TerminalBExpression_0; 
                    currentNode = currentNode.getParent();
                
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1727:1: ( () 'and' ( (lv_right_3_0= ruleTerminalBExpression ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==38) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1727:2: () 'and' ( (lv_right_3_0= ruleTerminalBExpression ) )
            	    {
            	    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1727:2: ()
            	    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1728:5: 
            	    {
            	     
            	            temp=factory.create(grammarAccess.getBAndExpressionAccess().getAndOperationLeftAction_1_0().getType().getClassifier());
            	            try {
            	            	factory.set(temp, "left", current, null /*ParserRule*/, currentNode);
            	            } catch(ValueConverterException vce) {
            	            	handleValueConverterException(vce);
            	            }
            	            current = temp; 
            	            temp = null;
            	            CompositeNode newNode = createCompositeNode(grammarAccess.getBAndExpressionAccess().getAndOperationLeftAction_1_0(), currentNode.getParent());
            	        newNode.getChildren().add(currentNode);
            	        moveLookaheadInfo(currentNode, newNode);
            	        currentNode = newNode; 
            	            associateNodeWithAstElement(currentNode, current); 
            	        

            	    }

            	    match(input,38,FOLLOW_38_in_ruleBAndExpression3180); 

            	            createLeafNode(grammarAccess.getBAndExpressionAccess().getAndKeyword_1_1(), null); 
            	        
            	    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1747:1: ( (lv_right_3_0= ruleTerminalBExpression ) )
            	    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1748:1: (lv_right_3_0= ruleTerminalBExpression )
            	    {
            	    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1748:1: (lv_right_3_0= ruleTerminalBExpression )
            	    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1749:3: lv_right_3_0= ruleTerminalBExpression
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getBAndExpressionAccess().getRightTerminalBExpressionParserRuleCall_1_2_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleTerminalBExpression_in_ruleBAndExpression3201);
            	    lv_right_3_0=ruleTerminalBExpression();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getBAndExpressionRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		set(
            	    	       			current, 
            	    	       			"right",
            	    	        		lv_right_3_0, 
            	    	        		"TerminalBExpression", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleBAndExpression


    // $ANTLR start entryRuleTerminalBExpression
    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1779:1: entryRuleTerminalBExpression returns [EObject current=null] : iv_ruleTerminalBExpression= ruleTerminalBExpression EOF ;
    public final EObject entryRuleTerminalBExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerminalBExpression = null;


        try {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1780:2: (iv_ruleTerminalBExpression= ruleTerminalBExpression EOF )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1781:2: iv_ruleTerminalBExpression= ruleTerminalBExpression EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTerminalBExpressionRule(), currentNode); 
            pushFollow(FOLLOW_ruleTerminalBExpression_in_entryRuleTerminalBExpression3239);
            iv_ruleTerminalBExpression=ruleTerminalBExpression();
            _fsp--;

             current =iv_ruleTerminalBExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTerminalBExpression3249); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleTerminalBExpression


    // $ANTLR start ruleTerminalBExpression
    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1788:1: ruleTerminalBExpression returns [EObject current=null] : (this_AtomicReferringBExpression_0= ruleAtomicReferringBExpression | this_NegationExpression_1= ruleNegationExpression | ( '(' this_BExpression_3= ruleBExpression ')' ) ) ;
    public final EObject ruleTerminalBExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AtomicReferringBExpression_0 = null;

        EObject this_NegationExpression_1 = null;

        EObject this_BExpression_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1793:6: ( (this_AtomicReferringBExpression_0= ruleAtomicReferringBExpression | this_NegationExpression_1= ruleNegationExpression | ( '(' this_BExpression_3= ruleBExpression ')' ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1794:1: (this_AtomicReferringBExpression_0= ruleAtomicReferringBExpression | this_NegationExpression_1= ruleNegationExpression | ( '(' this_BExpression_3= ruleBExpression ')' ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1794:1: (this_AtomicReferringBExpression_0= ruleAtomicReferringBExpression | this_NegationExpression_1= ruleNegationExpression | ( '(' this_BExpression_3= ruleBExpression ')' ) )
            int alt23=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt23=1;
                }
                break;
            case 39:
                {
                alt23=2;
                }
                break;
            case 18:
                {
                alt23=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1794:1: (this_AtomicReferringBExpression_0= ruleAtomicReferringBExpression | this_NegationExpression_1= ruleNegationExpression | ( '(' this_BExpression_3= ruleBExpression ')' ) )", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1795:5: this_AtomicReferringBExpression_0= ruleAtomicReferringBExpression
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTerminalBExpressionAccess().getAtomicReferringBExpressionParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleAtomicReferringBExpression_in_ruleTerminalBExpression3296);
                    this_AtomicReferringBExpression_0=ruleAtomicReferringBExpression();
                    _fsp--;

                     
                            current = this_AtomicReferringBExpression_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1805:5: this_NegationExpression_1= ruleNegationExpression
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTerminalBExpressionAccess().getNegationExpressionParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleNegationExpression_in_ruleTerminalBExpression3323);
                    this_NegationExpression_1=ruleNegationExpression();
                    _fsp--;

                     
                            current = this_NegationExpression_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1814:6: ( '(' this_BExpression_3= ruleBExpression ')' )
                    {
                    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1814:6: ( '(' this_BExpression_3= ruleBExpression ')' )
                    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1814:8: '(' this_BExpression_3= ruleBExpression ')'
                    {
                    match(input,18,FOLLOW_18_in_ruleTerminalBExpression3339); 

                            createLeafNode(grammarAccess.getTerminalBExpressionAccess().getLeftParenthesisKeyword_2_0(), null); 
                        
                     
                            currentNode=createCompositeNode(grammarAccess.getTerminalBExpressionAccess().getBExpressionParserRuleCall_2_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleBExpression_in_ruleTerminalBExpression3361);
                    this_BExpression_3=ruleBExpression();
                    _fsp--;

                     
                            current = this_BExpression_3; 
                            currentNode = currentNode.getParent();
                        
                    match(input,19,FOLLOW_19_in_ruleTerminalBExpression3370); 

                            createLeafNode(grammarAccess.getTerminalBExpressionAccess().getRightParenthesisKeyword_2_2(), null); 
                        

                    }


                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleTerminalBExpression


    // $ANTLR start entryRuleNegationExpression
    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1839:1: entryRuleNegationExpression returns [EObject current=null] : iv_ruleNegationExpression= ruleNegationExpression EOF ;
    public final EObject entryRuleNegationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNegationExpression = null;


        try {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1840:2: (iv_ruleNegationExpression= ruleNegationExpression EOF )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1841:2: iv_ruleNegationExpression= ruleNegationExpression EOF
            {
             currentNode = createCompositeNode(grammarAccess.getNegationExpressionRule(), currentNode); 
            pushFollow(FOLLOW_ruleNegationExpression_in_entryRuleNegationExpression3407);
            iv_ruleNegationExpression=ruleNegationExpression();
            _fsp--;

             current =iv_ruleNegationExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNegationExpression3417); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleNegationExpression


    // $ANTLR start ruleNegationExpression
    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1848:1: ruleNegationExpression returns [EObject current=null] : ( 'not' ( (lv_expr_1_0= ruleBExpression ) ) ) ;
    public final EObject ruleNegationExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_expr_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1853:6: ( ( 'not' ( (lv_expr_1_0= ruleBExpression ) ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1854:1: ( 'not' ( (lv_expr_1_0= ruleBExpression ) ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1854:1: ( 'not' ( (lv_expr_1_0= ruleBExpression ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1854:3: 'not' ( (lv_expr_1_0= ruleBExpression ) )
            {
            match(input,39,FOLLOW_39_in_ruleNegationExpression3452); 

                    createLeafNode(grammarAccess.getNegationExpressionAccess().getNotKeyword_0(), null); 
                
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1858:1: ( (lv_expr_1_0= ruleBExpression ) )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1859:1: (lv_expr_1_0= ruleBExpression )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1859:1: (lv_expr_1_0= ruleBExpression )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1860:3: lv_expr_1_0= ruleBExpression
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getNegationExpressionAccess().getExprBExpressionParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleBExpression_in_ruleNegationExpression3473);
            lv_expr_1_0=ruleBExpression();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getNegationExpressionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"expr",
            	        		lv_expr_1_0, 
            	        		"BExpression", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleNegationExpression


    // $ANTLR start entryRuleAtomicReferringBExpression
    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1890:1: entryRuleAtomicReferringBExpression returns [EObject current=null] : iv_ruleAtomicReferringBExpression= ruleAtomicReferringBExpression EOF ;
    public final EObject entryRuleAtomicReferringBExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicReferringBExpression = null;


        try {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1891:2: (iv_ruleAtomicReferringBExpression= ruleAtomicReferringBExpression EOF )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1892:2: iv_ruleAtomicReferringBExpression= ruleAtomicReferringBExpression EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAtomicReferringBExpressionRule(), currentNode); 
            pushFollow(FOLLOW_ruleAtomicReferringBExpression_in_entryRuleAtomicReferringBExpression3509);
            iv_ruleAtomicReferringBExpression=ruleAtomicReferringBExpression();
            _fsp--;

             current =iv_ruleAtomicReferringBExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtomicReferringBExpression3519); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleAtomicReferringBExpression


    // $ANTLR start ruleAtomicReferringBExpression
    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1899:1: ruleAtomicReferringBExpression returns [EObject current=null] : (this_BComparison_0= ruleBComparison | this_EnumComparison_1= ruleEnumComparison | this_StringValueComparison_2= ruleStringValueComparison | this_PresenceCheck_3= rulePresenceCheck ) ;
    public final EObject ruleAtomicReferringBExpression() throws RecognitionException {
        EObject current = null;

        EObject this_BComparison_0 = null;

        EObject this_EnumComparison_1 = null;

        EObject this_StringValueComparison_2 = null;

        EObject this_PresenceCheck_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1904:6: ( (this_BComparison_0= ruleBComparison | this_EnumComparison_1= ruleEnumComparison | this_StringValueComparison_2= ruleStringValueComparison | this_PresenceCheck_3= rulePresenceCheck ) )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1905:1: (this_BComparison_0= ruleBComparison | this_EnumComparison_1= ruleEnumComparison | this_StringValueComparison_2= ruleStringValueComparison | this_PresenceCheck_3= rulePresenceCheck )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1905:1: (this_BComparison_0= ruleBComparison | this_EnumComparison_1= ruleEnumComparison | this_StringValueComparison_2= ruleStringValueComparison | this_PresenceCheck_3= rulePresenceCheck )
            int alt24=4;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case 41:
                    {
                    alt24=3;
                    }
                    break;
                case 42:
                    {
                    alt24=4;
                    }
                    break;
                case 13:
                case 50:
                case 51:
                    {
                    alt24=2;
                    }
                    break;
                case EOF:
                case RULE_ID:
                case 18:
                case 19:
                case 27:
                case 30:
                case 33:
                case 34:
                case 36:
                case 37:
                case 38:
                case 40:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                    {
                    alt24=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("1905:1: (this_BComparison_0= ruleBComparison | this_EnumComparison_1= ruleEnumComparison | this_StringValueComparison_2= ruleStringValueComparison | this_PresenceCheck_3= rulePresenceCheck )", 24, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1905:1: (this_BComparison_0= ruleBComparison | this_EnumComparison_1= ruleEnumComparison | this_StringValueComparison_2= ruleStringValueComparison | this_PresenceCheck_3= rulePresenceCheck )", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1906:5: this_BComparison_0= ruleBComparison
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getAtomicReferringBExpressionAccess().getBComparisonParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleBComparison_in_ruleAtomicReferringBExpression3566);
                    this_BComparison_0=ruleBComparison();
                    _fsp--;

                     
                            current = this_BComparison_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1916:5: this_EnumComparison_1= ruleEnumComparison
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getAtomicReferringBExpressionAccess().getEnumComparisonParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleEnumComparison_in_ruleAtomicReferringBExpression3593);
                    this_EnumComparison_1=ruleEnumComparison();
                    _fsp--;

                     
                            current = this_EnumComparison_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1926:5: this_StringValueComparison_2= ruleStringValueComparison
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getAtomicReferringBExpressionAccess().getStringValueComparisonParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleStringValueComparison_in_ruleAtomicReferringBExpression3620);
                    this_StringValueComparison_2=ruleStringValueComparison();
                    _fsp--;

                     
                            current = this_StringValueComparison_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 4 :
                    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1936:5: this_PresenceCheck_3= rulePresenceCheck
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getAtomicReferringBExpressionAccess().getPresenceCheckParserRuleCall_3(), currentNode); 
                        
                    pushFollow(FOLLOW_rulePresenceCheck_in_ruleAtomicReferringBExpression3647);
                    this_PresenceCheck_3=rulePresenceCheck();
                    _fsp--;

                     
                            current = this_PresenceCheck_3; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleAtomicReferringBExpression


    // $ANTLR start entryRuleBComparison
    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1952:1: entryRuleBComparison returns [EObject current=null] : iv_ruleBComparison= ruleBComparison EOF ;
    public final EObject entryRuleBComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBComparison = null;


        try {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1953:2: (iv_ruleBComparison= ruleBComparison EOF )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1954:2: iv_ruleBComparison= ruleBComparison EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBComparisonRule(), currentNode); 
            pushFollow(FOLLOW_ruleBComparison_in_entryRuleBComparison3682);
            iv_ruleBComparison=ruleBComparison();
            _fsp--;

             current =iv_ruleBComparison; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBComparison3692); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleBComparison


    // $ANTLR start ruleBComparison
    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1961:1: ruleBComparison returns [EObject current=null] : ( () ( (lv_ref_1_0= ruleReference ) ) ( 'is' ( (lv_bLiteral_3_0= ruleBLiteral ) ) )? ) ;
    public final EObject ruleBComparison() throws RecognitionException {
        EObject current = null;

        EObject lv_ref_1_0 = null;

        Enumerator lv_bLiteral_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1966:6: ( ( () ( (lv_ref_1_0= ruleReference ) ) ( 'is' ( (lv_bLiteral_3_0= ruleBLiteral ) ) )? ) )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1967:1: ( () ( (lv_ref_1_0= ruleReference ) ) ( 'is' ( (lv_bLiteral_3_0= ruleBLiteral ) ) )? )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1967:1: ( () ( (lv_ref_1_0= ruleReference ) ) ( 'is' ( (lv_bLiteral_3_0= ruleBLiteral ) ) )? )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1967:2: () ( (lv_ref_1_0= ruleReference ) ) ( 'is' ( (lv_bLiteral_3_0= ruleBLiteral ) ) )?
            {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1967:2: ()
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1968:5: 
            {
             
                    temp=factory.create(grammarAccess.getBComparisonAccess().getBComparisonAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getBComparisonAccess().getBComparisonAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1978:2: ( (lv_ref_1_0= ruleReference ) )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1979:1: (lv_ref_1_0= ruleReference )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1979:1: (lv_ref_1_0= ruleReference )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1980:3: lv_ref_1_0= ruleReference
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getBComparisonAccess().getRefReferenceParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleReference_in_ruleBComparison3747);
            lv_ref_1_0=ruleReference();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getBComparisonRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"ref",
            	        		lv_ref_1_0, 
            	        		"Reference", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2002:2: ( 'is' ( (lv_bLiteral_3_0= ruleBLiteral ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==40) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2002:4: 'is' ( (lv_bLiteral_3_0= ruleBLiteral ) )
                    {
                    match(input,40,FOLLOW_40_in_ruleBComparison3758); 

                            createLeafNode(grammarAccess.getBComparisonAccess().getIsKeyword_2_0(), null); 
                        
                    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2006:1: ( (lv_bLiteral_3_0= ruleBLiteral ) )
                    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2007:1: (lv_bLiteral_3_0= ruleBLiteral )
                    {
                    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2007:1: (lv_bLiteral_3_0= ruleBLiteral )
                    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2008:3: lv_bLiteral_3_0= ruleBLiteral
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getBComparisonAccess().getBLiteralBLiteralEnumRuleCall_2_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleBLiteral_in_ruleBComparison3779);
                    lv_bLiteral_3_0=ruleBLiteral();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getBComparisonRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"bLiteral",
                    	        		lv_bLiteral_3_0, 
                    	        		"BLiteral", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleBComparison


    // $ANTLR start entryRuleEnumComparison
    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2038:1: entryRuleEnumComparison returns [EObject current=null] : iv_ruleEnumComparison= ruleEnumComparison EOF ;
    public final EObject entryRuleEnumComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumComparison = null;


        try {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2039:2: (iv_ruleEnumComparison= ruleEnumComparison EOF )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2040:2: iv_ruleEnumComparison= ruleEnumComparison EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEnumComparisonRule(), currentNode); 
            pushFollow(FOLLOW_ruleEnumComparison_in_entryRuleEnumComparison3817);
            iv_ruleEnumComparison=ruleEnumComparison();
            _fsp--;

             current =iv_ruleEnumComparison; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumComparison3827); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleEnumComparison


    // $ANTLR start ruleEnumComparison
    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2047:1: ruleEnumComparison returns [EObject current=null] : (this_SingleEnumComparison_0= ruleSingleEnumComparison | this_MultiEnumComparison_1= ruleMultiEnumComparison ) ;
    public final EObject ruleEnumComparison() throws RecognitionException {
        EObject current = null;

        EObject this_SingleEnumComparison_0 = null;

        EObject this_MultiEnumComparison_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2052:6: ( (this_SingleEnumComparison_0= ruleSingleEnumComparison | this_MultiEnumComparison_1= ruleMultiEnumComparison ) )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2053:1: (this_SingleEnumComparison_0= ruleSingleEnumComparison | this_MultiEnumComparison_1= ruleMultiEnumComparison )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2053:1: (this_SingleEnumComparison_0= ruleSingleEnumComparison | this_MultiEnumComparison_1= ruleMultiEnumComparison )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_ID) ) {
                int LA26_1 = input.LA(2);

                if ( (LA26_1==13) ) {
                    alt26=1;
                }
                else if ( ((LA26_1>=50 && LA26_1<=51)) ) {
                    alt26=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("2053:1: (this_SingleEnumComparison_0= ruleSingleEnumComparison | this_MultiEnumComparison_1= ruleMultiEnumComparison )", 26, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("2053:1: (this_SingleEnumComparison_0= ruleSingleEnumComparison | this_MultiEnumComparison_1= ruleMultiEnumComparison )", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2054:5: this_SingleEnumComparison_0= ruleSingleEnumComparison
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getEnumComparisonAccess().getSingleEnumComparisonParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleSingleEnumComparison_in_ruleEnumComparison3874);
                    this_SingleEnumComparison_0=ruleSingleEnumComparison();
                    _fsp--;

                     
                            current = this_SingleEnumComparison_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2064:5: this_MultiEnumComparison_1= ruleMultiEnumComparison
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getEnumComparisonAccess().getMultiEnumComparisonParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleMultiEnumComparison_in_ruleEnumComparison3901);
                    this_MultiEnumComparison_1=ruleMultiEnumComparison();
                    _fsp--;

                     
                            current = this_MultiEnumComparison_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleEnumComparison


    // $ANTLR start entryRuleSingleEnumComparison
    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2080:1: entryRuleSingleEnumComparison returns [EObject current=null] : iv_ruleSingleEnumComparison= ruleSingleEnumComparison EOF ;
    public final EObject entryRuleSingleEnumComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleEnumComparison = null;


        try {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2081:2: (iv_ruleSingleEnumComparison= ruleSingleEnumComparison EOF )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2082:2: iv_ruleSingleEnumComparison= ruleSingleEnumComparison EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSingleEnumComparisonRule(), currentNode); 
            pushFollow(FOLLOW_ruleSingleEnumComparison_in_entryRuleSingleEnumComparison3936);
            iv_ruleSingleEnumComparison=ruleSingleEnumComparison();
            _fsp--;

             current =iv_ruleSingleEnumComparison; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSingleEnumComparison3946); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleSingleEnumComparison


    // $ANTLR start ruleSingleEnumComparison
    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2089:1: ruleSingleEnumComparison returns [EObject current=null] : ( ( (lv_ref_0_0= ruleReference ) ) '=' ( ( RULE_ID ) ) ) ;
    public final EObject ruleSingleEnumComparison() throws RecognitionException {
        EObject current = null;

        EObject lv_ref_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2094:6: ( ( ( (lv_ref_0_0= ruleReference ) ) '=' ( ( RULE_ID ) ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2095:1: ( ( (lv_ref_0_0= ruleReference ) ) '=' ( ( RULE_ID ) ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2095:1: ( ( (lv_ref_0_0= ruleReference ) ) '=' ( ( RULE_ID ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2095:2: ( (lv_ref_0_0= ruleReference ) ) '=' ( ( RULE_ID ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2095:2: ( (lv_ref_0_0= ruleReference ) )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2096:1: (lv_ref_0_0= ruleReference )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2096:1: (lv_ref_0_0= ruleReference )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2097:3: lv_ref_0_0= ruleReference
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getSingleEnumComparisonAccess().getRefReferenceParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleReference_in_ruleSingleEnumComparison3992);
            lv_ref_0_0=ruleReference();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getSingleEnumComparisonRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"ref",
            	        		lv_ref_0_0, 
            	        		"Reference", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,13,FOLLOW_13_in_ruleSingleEnumComparison4002); 

                    createLeafNode(grammarAccess.getSingleEnumComparisonAccess().getEqualsSignKeyword_1(), null); 
                
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2123:1: ( ( RULE_ID ) )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2124:1: ( RULE_ID )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2124:1: ( RULE_ID )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2125:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getSingleEnumComparisonRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSingleEnumComparison4020); 

            		createLeafNode(grammarAccess.getSingleEnumComparisonAccess().getELiteralEnumLiteralCrossReference_2_0(), "eLiteral"); 
            	

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleSingleEnumComparison


    // $ANTLR start entryRuleMultiEnumComparison
    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2145:1: entryRuleMultiEnumComparison returns [EObject current=null] : iv_ruleMultiEnumComparison= ruleMultiEnumComparison EOF ;
    public final EObject entryRuleMultiEnumComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiEnumComparison = null;


        try {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2146:2: (iv_ruleMultiEnumComparison= ruleMultiEnumComparison EOF )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2147:2: iv_ruleMultiEnumComparison= ruleMultiEnumComparison EOF
            {
             currentNode = createCompositeNode(grammarAccess.getMultiEnumComparisonRule(), currentNode); 
            pushFollow(FOLLOW_ruleMultiEnumComparison_in_entryRuleMultiEnumComparison4056);
            iv_ruleMultiEnumComparison=ruleMultiEnumComparison();
            _fsp--;

             current =iv_ruleMultiEnumComparison; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiEnumComparison4066); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleMultiEnumComparison


    // $ANTLR start ruleMultiEnumComparison
    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2154:1: ruleMultiEnumComparison returns [EObject current=null] : ( ( (lv_ref_0_0= ruleReference ) ) ( (lv_membership_1_0= ruleEnumMembership ) ) ( (lv_eLiterals_2_0= ruleEnumLiteralsCollection ) ) ) ;
    public final EObject ruleMultiEnumComparison() throws RecognitionException {
        EObject current = null;

        EObject lv_ref_0_0 = null;

        Enumerator lv_membership_1_0 = null;

        EObject lv_eLiterals_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2159:6: ( ( ( (lv_ref_0_0= ruleReference ) ) ( (lv_membership_1_0= ruleEnumMembership ) ) ( (lv_eLiterals_2_0= ruleEnumLiteralsCollection ) ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2160:1: ( ( (lv_ref_0_0= ruleReference ) ) ( (lv_membership_1_0= ruleEnumMembership ) ) ( (lv_eLiterals_2_0= ruleEnumLiteralsCollection ) ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2160:1: ( ( (lv_ref_0_0= ruleReference ) ) ( (lv_membership_1_0= ruleEnumMembership ) ) ( (lv_eLiterals_2_0= ruleEnumLiteralsCollection ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2160:2: ( (lv_ref_0_0= ruleReference ) ) ( (lv_membership_1_0= ruleEnumMembership ) ) ( (lv_eLiterals_2_0= ruleEnumLiteralsCollection ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2160:2: ( (lv_ref_0_0= ruleReference ) )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2161:1: (lv_ref_0_0= ruleReference )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2161:1: (lv_ref_0_0= ruleReference )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2162:3: lv_ref_0_0= ruleReference
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getMultiEnumComparisonAccess().getRefReferenceParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleReference_in_ruleMultiEnumComparison4112);
            lv_ref_0_0=ruleReference();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getMultiEnumComparisonRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"ref",
            	        		lv_ref_0_0, 
            	        		"Reference", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2184:2: ( (lv_membership_1_0= ruleEnumMembership ) )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2185:1: (lv_membership_1_0= ruleEnumMembership )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2185:1: (lv_membership_1_0= ruleEnumMembership )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2186:3: lv_membership_1_0= ruleEnumMembership
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getMultiEnumComparisonAccess().getMembershipEnumMembershipEnumRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleEnumMembership_in_ruleMultiEnumComparison4133);
            lv_membership_1_0=ruleEnumMembership();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getMultiEnumComparisonRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"membership",
            	        		lv_membership_1_0, 
            	        		"EnumMembership", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2208:2: ( (lv_eLiterals_2_0= ruleEnumLiteralsCollection ) )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2209:1: (lv_eLiterals_2_0= ruleEnumLiteralsCollection )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2209:1: (lv_eLiterals_2_0= ruleEnumLiteralsCollection )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2210:3: lv_eLiterals_2_0= ruleEnumLiteralsCollection
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getMultiEnumComparisonAccess().getELiteralsEnumLiteralsCollectionParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleEnumLiteralsCollection_in_ruleMultiEnumComparison4154);
            lv_eLiterals_2_0=ruleEnumLiteralsCollection();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getMultiEnumComparisonRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"eLiterals",
            	        		lv_eLiterals_2_0, 
            	        		"EnumLiteralsCollection", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleMultiEnumComparison


    // $ANTLR start entryRuleStringValueComparison
    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2240:1: entryRuleStringValueComparison returns [EObject current=null] : iv_ruleStringValueComparison= ruleStringValueComparison EOF ;
    public final EObject entryRuleStringValueComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValueComparison = null;


        try {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2241:2: (iv_ruleStringValueComparison= ruleStringValueComparison EOF )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2242:2: iv_ruleStringValueComparison= ruleStringValueComparison EOF
            {
             currentNode = createCompositeNode(grammarAccess.getStringValueComparisonRule(), currentNode); 
            pushFollow(FOLLOW_ruleStringValueComparison_in_entryRuleStringValueComparison4190);
            iv_ruleStringValueComparison=ruleStringValueComparison();
            _fsp--;

             current =iv_ruleStringValueComparison; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringValueComparison4200); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleStringValueComparison


    // $ANTLR start ruleStringValueComparison
    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2249:1: ruleStringValueComparison returns [EObject current=null] : ( ( (lv_ref_0_0= ruleReference ) ) 'equals' ( (lv_targetValue_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleStringValueComparison() throws RecognitionException {
        EObject current = null;

        Token lv_targetValue_2_0=null;
        EObject lv_ref_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2254:6: ( ( ( (lv_ref_0_0= ruleReference ) ) 'equals' ( (lv_targetValue_2_0= RULE_STRING ) ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2255:1: ( ( (lv_ref_0_0= ruleReference ) ) 'equals' ( (lv_targetValue_2_0= RULE_STRING ) ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2255:1: ( ( (lv_ref_0_0= ruleReference ) ) 'equals' ( (lv_targetValue_2_0= RULE_STRING ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2255:2: ( (lv_ref_0_0= ruleReference ) ) 'equals' ( (lv_targetValue_2_0= RULE_STRING ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2255:2: ( (lv_ref_0_0= ruleReference ) )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2256:1: (lv_ref_0_0= ruleReference )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2256:1: (lv_ref_0_0= ruleReference )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2257:3: lv_ref_0_0= ruleReference
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getStringValueComparisonAccess().getRefReferenceParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleReference_in_ruleStringValueComparison4246);
            lv_ref_0_0=ruleReference();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getStringValueComparisonRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"ref",
            	        		lv_ref_0_0, 
            	        		"Reference", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,41,FOLLOW_41_in_ruleStringValueComparison4256); 

                    createLeafNode(grammarAccess.getStringValueComparisonAccess().getEqualsKeyword_1(), null); 
                
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2283:1: ( (lv_targetValue_2_0= RULE_STRING ) )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2284:1: (lv_targetValue_2_0= RULE_STRING )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2284:1: (lv_targetValue_2_0= RULE_STRING )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2285:3: lv_targetValue_2_0= RULE_STRING
            {
            lv_targetValue_2_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringValueComparison4273); 

            			createLeafNode(grammarAccess.getStringValueComparisonAccess().getTargetValueSTRINGTerminalRuleCall_2_0(), "targetValue"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getStringValueComparisonRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"targetValue",
            	        		lv_targetValue_2_0, 
            	        		"STRING", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleStringValueComparison


    // $ANTLR start entryRulePresenceCheck
    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2315:1: entryRulePresenceCheck returns [EObject current=null] : iv_rulePresenceCheck= rulePresenceCheck EOF ;
    public final EObject entryRulePresenceCheck() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePresenceCheck = null;


        try {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2316:2: (iv_rulePresenceCheck= rulePresenceCheck EOF )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2317:2: iv_rulePresenceCheck= rulePresenceCheck EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPresenceCheckRule(), currentNode); 
            pushFollow(FOLLOW_rulePresenceCheck_in_entryRulePresenceCheck4314);
            iv_rulePresenceCheck=rulePresenceCheck();
            _fsp--;

             current =iv_rulePresenceCheck; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePresenceCheck4324); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRulePresenceCheck


    // $ANTLR start rulePresenceCheck
    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2324:1: rulePresenceCheck returns [EObject current=null] : ( ( (lv_ref_0_0= ruleReference ) ) 'is-present' ) ;
    public final EObject rulePresenceCheck() throws RecognitionException {
        EObject current = null;

        EObject lv_ref_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2329:6: ( ( ( (lv_ref_0_0= ruleReference ) ) 'is-present' ) )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2330:1: ( ( (lv_ref_0_0= ruleReference ) ) 'is-present' )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2330:1: ( ( (lv_ref_0_0= ruleReference ) ) 'is-present' )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2330:2: ( (lv_ref_0_0= ruleReference ) ) 'is-present'
            {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2330:2: ( (lv_ref_0_0= ruleReference ) )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2331:1: (lv_ref_0_0= ruleReference )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2331:1: (lv_ref_0_0= ruleReference )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2332:3: lv_ref_0_0= ruleReference
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getPresenceCheckAccess().getRefReferenceParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleReference_in_rulePresenceCheck4370);
            lv_ref_0_0=ruleReference();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getPresenceCheckRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"ref",
            	        		lv_ref_0_0, 
            	        		"Reference", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,42,FOLLOW_42_in_rulePresenceCheck4380); 

                    createLeafNode(grammarAccess.getPresenceCheckAccess().getIsPresentKeyword_1(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end rulePresenceCheck


    // $ANTLR start entryRuleEnumLiteralsCollection
    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2366:1: entryRuleEnumLiteralsCollection returns [EObject current=null] : iv_ruleEnumLiteralsCollection= ruleEnumLiteralsCollection EOF ;
    public final EObject entryRuleEnumLiteralsCollection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumLiteralsCollection = null;


        try {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2367:2: (iv_ruleEnumLiteralsCollection= ruleEnumLiteralsCollection EOF )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2368:2: iv_ruleEnumLiteralsCollection= ruleEnumLiteralsCollection EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEnumLiteralsCollectionRule(), currentNode); 
            pushFollow(FOLLOW_ruleEnumLiteralsCollection_in_entryRuleEnumLiteralsCollection4416);
            iv_ruleEnumLiteralsCollection=ruleEnumLiteralsCollection();
            _fsp--;

             current =iv_ruleEnumLiteralsCollection; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumLiteralsCollection4426); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleEnumLiteralsCollection


    // $ANTLR start ruleEnumLiteralsCollection
    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2375:1: ruleEnumLiteralsCollection returns [EObject current=null] : (this_DirectEnumLiteralsCollection_0= ruleDirectEnumLiteralsCollection | this_EnumListReference_1= ruleEnumListReference ) ;
    public final EObject ruleEnumLiteralsCollection() throws RecognitionException {
        EObject current = null;

        EObject this_DirectEnumLiteralsCollection_0 = null;

        EObject this_EnumListReference_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2380:6: ( (this_DirectEnumLiteralsCollection_0= ruleDirectEnumLiteralsCollection | this_EnumListReference_1= ruleEnumListReference ) )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2381:1: (this_DirectEnumLiteralsCollection_0= ruleDirectEnumLiteralsCollection | this_EnumListReference_1= ruleEnumListReference )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2381:1: (this_DirectEnumLiteralsCollection_0= ruleDirectEnumLiteralsCollection | this_EnumListReference_1= ruleEnumListReference )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==18) ) {
                alt27=1;
            }
            else if ( (LA27_0==RULE_ID) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("2381:1: (this_DirectEnumLiteralsCollection_0= ruleDirectEnumLiteralsCollection | this_EnumListReference_1= ruleEnumListReference )", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2382:5: this_DirectEnumLiteralsCollection_0= ruleDirectEnumLiteralsCollection
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getEnumLiteralsCollectionAccess().getDirectEnumLiteralsCollectionParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleDirectEnumLiteralsCollection_in_ruleEnumLiteralsCollection4473);
                    this_DirectEnumLiteralsCollection_0=ruleDirectEnumLiteralsCollection();
                    _fsp--;

                     
                            current = this_DirectEnumLiteralsCollection_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2392:5: this_EnumListReference_1= ruleEnumListReference
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getEnumLiteralsCollectionAccess().getEnumListReferenceParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleEnumListReference_in_ruleEnumLiteralsCollection4500);
                    this_EnumListReference_1=ruleEnumListReference();
                    _fsp--;

                     
                            current = this_EnumListReference_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleEnumLiteralsCollection


    // $ANTLR start entryRuleDirectEnumLiteralsCollection
    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2408:1: entryRuleDirectEnumLiteralsCollection returns [EObject current=null] : iv_ruleDirectEnumLiteralsCollection= ruleDirectEnumLiteralsCollection EOF ;
    public final EObject entryRuleDirectEnumLiteralsCollection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDirectEnumLiteralsCollection = null;


        try {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2409:2: (iv_ruleDirectEnumLiteralsCollection= ruleDirectEnumLiteralsCollection EOF )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2410:2: iv_ruleDirectEnumLiteralsCollection= ruleDirectEnumLiteralsCollection EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDirectEnumLiteralsCollectionRule(), currentNode); 
            pushFollow(FOLLOW_ruleDirectEnumLiteralsCollection_in_entryRuleDirectEnumLiteralsCollection4535);
            iv_ruleDirectEnumLiteralsCollection=ruleDirectEnumLiteralsCollection();
            _fsp--;

             current =iv_ruleDirectEnumLiteralsCollection; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDirectEnumLiteralsCollection4545); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleDirectEnumLiteralsCollection


    // $ANTLR start ruleDirectEnumLiteralsCollection
    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2417:1: ruleDirectEnumLiteralsCollection returns [EObject current=null] : ( () '(' ( ( RULE_ID ) )* ')' ) ;
    public final EObject ruleDirectEnumLiteralsCollection() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2422:6: ( ( () '(' ( ( RULE_ID ) )* ')' ) )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2423:1: ( () '(' ( ( RULE_ID ) )* ')' )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2423:1: ( () '(' ( ( RULE_ID ) )* ')' )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2423:2: () '(' ( ( RULE_ID ) )* ')'
            {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2423:2: ()
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2424:5: 
            {
             
                    temp=factory.create(grammarAccess.getDirectEnumLiteralsCollectionAccess().getDirectEnumLiteralsCollectionAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getDirectEnumLiteralsCollectionAccess().getDirectEnumLiteralsCollectionAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            match(input,18,FOLLOW_18_in_ruleDirectEnumLiteralsCollection4589); 

                    createLeafNode(grammarAccess.getDirectEnumLiteralsCollectionAccess().getLeftParenthesisKeyword_1(), null); 
                
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2438:1: ( ( RULE_ID ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==RULE_ID) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2439:1: ( RULE_ID )
            	    {
            	    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2439:1: ( RULE_ID )
            	    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2440:3: RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = factory.create(grammarAccess.getDirectEnumLiteralsCollectionRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode, current);
            	    	        }
            	            
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDirectEnumLiteralsCollection4607); 

            	    		createLeafNode(grammarAccess.getDirectEnumLiteralsCollectionAccess().getLiteralsEnumLiteralCrossReference_2_0(), "literals"); 
            	    	

            	    }


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            match(input,19,FOLLOW_19_in_ruleDirectEnumLiteralsCollection4618); 

                    createLeafNode(grammarAccess.getDirectEnumLiteralsCollectionAccess().getRightParenthesisKeyword_3(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleDirectEnumLiteralsCollection


    // $ANTLR start entryRuleEnumListReference
    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2464:1: entryRuleEnumListReference returns [EObject current=null] : iv_ruleEnumListReference= ruleEnumListReference EOF ;
    public final EObject entryRuleEnumListReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumListReference = null;


        try {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2465:2: (iv_ruleEnumListReference= ruleEnumListReference EOF )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2466:2: iv_ruleEnumListReference= ruleEnumListReference EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEnumListReferenceRule(), currentNode); 
            pushFollow(FOLLOW_ruleEnumListReference_in_entryRuleEnumListReference4654);
            iv_ruleEnumListReference=ruleEnumListReference();
            _fsp--;

             current =iv_ruleEnumListReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumListReference4664); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleEnumListReference


    // $ANTLR start ruleEnumListReference
    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2473:1: ruleEnumListReference returns [EObject current=null] : ( ( RULE_ID ) ) ;
    public final EObject ruleEnumListReference() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2478:6: ( ( ( RULE_ID ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2479:1: ( ( RULE_ID ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2479:1: ( ( RULE_ID ) )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2480:1: ( RULE_ID )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2480:1: ( RULE_ID )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2481:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getEnumListReferenceRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumListReference4706); 

            		createLeafNode(grammarAccess.getEnumListReferenceAccess().getRefEnumListCrossReference_0(), "ref"); 
            	

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleEnumListReference


    // $ANTLR start ruleAttributeClass
    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2501:1: ruleAttributeClass returns [Enumerator current=null] : ( ( 'display' ) | ( 'required' ) | ( 'readonly' ) | ( 'calculated' ) | ( 'doubleAsterisk' ) ) ;
    public final Enumerator ruleAttributeClass() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2505:6: ( ( ( 'display' ) | ( 'required' ) | ( 'readonly' ) | ( 'calculated' ) | ( 'doubleAsterisk' ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2506:1: ( ( 'display' ) | ( 'required' ) | ( 'readonly' ) | ( 'calculated' ) | ( 'doubleAsterisk' ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2506:1: ( ( 'display' ) | ( 'required' ) | ( 'readonly' ) | ( 'calculated' ) | ( 'doubleAsterisk' ) )
            int alt29=5;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt29=1;
                }
                break;
            case 44:
                {
                alt29=2;
                }
                break;
            case 45:
                {
                alt29=3;
                }
                break;
            case 46:
                {
                alt29=4;
                }
                break;
            case 47:
                {
                alt29=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("2506:1: ( ( 'display' ) | ( 'required' ) | ( 'readonly' ) | ( 'calculated' ) | ( 'doubleAsterisk' ) )", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2506:2: ( 'display' )
                    {
                    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2506:2: ( 'display' )
                    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2506:4: 'display'
                    {
                    match(input,43,FOLLOW_43_in_ruleAttributeClass4753); 

                            current = grammarAccess.getAttributeClassAccess().getDisplayEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getAttributeClassAccess().getDisplayEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2512:6: ( 'required' )
                    {
                    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2512:6: ( 'required' )
                    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2512:8: 'required'
                    {
                    match(input,44,FOLLOW_44_in_ruleAttributeClass4768); 

                            current = grammarAccess.getAttributeClassAccess().getRequiredEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getAttributeClassAccess().getRequiredEnumLiteralDeclaration_1(), null); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2518:6: ( 'readonly' )
                    {
                    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2518:6: ( 'readonly' )
                    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2518:8: 'readonly'
                    {
                    match(input,45,FOLLOW_45_in_ruleAttributeClass4783); 

                            current = grammarAccess.getAttributeClassAccess().getReadonlyEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getAttributeClassAccess().getReadonlyEnumLiteralDeclaration_2(), null); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2524:6: ( 'calculated' )
                    {
                    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2524:6: ( 'calculated' )
                    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2524:8: 'calculated'
                    {
                    match(input,46,FOLLOW_46_in_ruleAttributeClass4798); 

                            current = grammarAccess.getAttributeClassAccess().getCalculatedEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getAttributeClassAccess().getCalculatedEnumLiteralDeclaration_3(), null); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2530:6: ( 'doubleAsterisk' )
                    {
                    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2530:6: ( 'doubleAsterisk' )
                    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2530:8: 'doubleAsterisk'
                    {
                    match(input,47,FOLLOW_47_in_ruleAttributeClass4813); 

                            current = grammarAccess.getAttributeClassAccess().getDoubleAsteriskEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getAttributeClassAccess().getDoubleAsteriskEnumLiteralDeclaration_4(), null); 
                        

                    }


                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleAttributeClass


    // $ANTLR start ruleBLiteral
    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2540:1: ruleBLiteral returns [Enumerator current=null] : ( ( 'true' ) | ( 'false' ) ) ;
    public final Enumerator ruleBLiteral() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2544:6: ( ( ( 'true' ) | ( 'false' ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2545:1: ( ( 'true' ) | ( 'false' ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2545:1: ( ( 'true' ) | ( 'false' ) )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==48) ) {
                alt30=1;
            }
            else if ( (LA30_0==49) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("2545:1: ( ( 'true' ) | ( 'false' ) )", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2545:2: ( 'true' )
                    {
                    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2545:2: ( 'true' )
                    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2545:4: 'true'
                    {
                    match(input,48,FOLLOW_48_in_ruleBLiteral4856); 

                            current = grammarAccess.getBLiteralAccess().getTrueEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getBLiteralAccess().getTrueEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2551:6: ( 'false' )
                    {
                    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2551:6: ( 'false' )
                    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2551:8: 'false'
                    {
                    match(input,49,FOLLOW_49_in_ruleBLiteral4871); 

                            current = grammarAccess.getBLiteralAccess().getFalseEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getBLiteralAccess().getFalseEnumLiteralDeclaration_1(), null); 
                        

                    }


                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleBLiteral


    // $ANTLR start ruleEnumMembership
    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2561:1: ruleEnumMembership returns [Enumerator current=null] : ( ( 'is-one-of' ) | ( 'is-not-one-of' ) ) ;
    public final Enumerator ruleEnumMembership() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2565:6: ( ( ( 'is-one-of' ) | ( 'is-not-one-of' ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2566:1: ( ( 'is-one-of' ) | ( 'is-not-one-of' ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2566:1: ( ( 'is-one-of' ) | ( 'is-not-one-of' ) )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==50) ) {
                alt31=1;
            }
            else if ( (LA31_0==51) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("2566:1: ( ( 'is-one-of' ) | ( 'is-not-one-of' ) )", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2566:2: ( 'is-one-of' )
                    {
                    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2566:2: ( 'is-one-of' )
                    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2566:4: 'is-one-of'
                    {
                    match(input,50,FOLLOW_50_in_ruleEnumMembership4914); 

                            current = grammarAccess.getEnumMembershipAccess().getIsInEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getEnumMembershipAccess().getIsInEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2572:6: ( 'is-not-one-of' )
                    {
                    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2572:6: ( 'is-not-one-of' )
                    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2572:8: 'is-not-one-of'
                    {
                    match(input,51,FOLLOW_51_in_ruleEnumMembership4929); 

                            current = grammarAccess.getEnumMembershipAccess().getIsNotInEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getEnumMembershipAccess().getIsNotInEnumLiteralDeclaration_1(), null); 
                        

                    }


                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleEnumMembership


 

    public static final BitSet FOLLOW_ruleDynamicScreen_in_entryRuleDynamicScreen75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDynamicScreen85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleDynamicScreen120 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleLabel_in_ruleDynamicScreen141 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ruleDataImport_in_ruleDynamicScreen162 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleDynamicScreen172 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleDynamicScreen182 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDynamicScreen200 = new BitSet(new long[]{0x0000000009500000L});
    public static final BitSet FOLLOW_ruleDeclaration_in_ruleDynamicScreen221 = new BitSet(new long[]{0x0000000009500000L});
    public static final BitSet FOLLOW_ruleFieldGroup_in_ruleDynamicScreen243 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_ruleDataImport_in_entryRuleDataImport280 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataImport290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleDataImport325 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleDataImport335 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDataImport352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabel_in_entryRuleLabel393 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLabel403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleLabel445 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleLabel461 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleLabel478 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleLabel493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePathTail_in_entryRulePathTail531 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePathTail541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rulePathTail576 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePathTail594 = new BitSet(new long[]{0x0000000000060002L});
    public static final BitSet FOLLOW_18_in_rulePathTail605 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePathTail623 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_rulePathTail633 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rulePathTail_in_rulePathTail656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_entryRuleDeclaration693 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeclaration703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExternalVariable_in_ruleDeclaration750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumList_in_ruleDeclaration777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataStore_in_ruleDeclaration804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExternalVariable_in_entryRuleExternalVariable839 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExternalVariable849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleExternalVariable884 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rulePathTail_in_ruleExternalVariable905 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleExternalVariable915 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExternalVariable932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumList_in_entryRuleEnumList973 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumList983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleEnumList1018 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumList1035 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleEnumList1050 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleEnumList1060 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumList1078 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_19_in_ruleEnumList1089 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleEnumList1099 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumList1117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataStore_in_entryRuleDataStore1153 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataStore1163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleDataStore1198 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDataStore1215 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleDataStore1230 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDataStore1248 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_ruleDataStore1266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGroupElement_in_entryRuleGroupElement1316 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGroupElement1326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_in_ruleGroupElement1373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldGroup_in_ruleGroupElement1400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_in_entryRuleField1435 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleField1445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleField1487 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleLabel_in_ruleField1513 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rulePathTail_in_ruleField1534 = new BitSet(new long[]{0x0000F80600000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleField1555 = new BitSet(new long[]{0x0000F80600000002L});
    public static final BitSet FOLLOW_ruleFieldGroup_in_entryRuleFieldGroup1592 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFieldGroup1602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleFieldGroup1637 = new BitSet(new long[]{0x0000000030000020L});
    public static final BitSet FOLLOW_ruleLabel_in_ruleFieldGroup1658 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_28_in_ruleFieldGroup1670 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rulePathTail_in_ruleFieldGroup1691 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleFieldGroup1703 = new BitSet(new long[]{0x0000000008000010L});
    public static final BitSet FOLLOW_ruleGroupElement_in_ruleFieldGroup1724 = new BitSet(new long[]{0x0000000048000010L});
    public static final BitSet FOLLOW_30_in_ruleFieldGroup1735 = new BitSet(new long[]{0x0000F80600000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleFieldGroup1756 = new BitSet(new long[]{0x0000F80600000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute1793 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute1803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNormalAttribute_in_ruleAttribute1850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumFieldAttribute_in_ruleAttribute1877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumFieldAttribute_in_entryRuleEnumFieldAttribute1912 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumFieldAttribute1922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRestrictionAttribute_in_ruleEnumFieldAttribute1969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRestrictionGroupAttribute_in_ruleEnumFieldAttribute1996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNormalAttribute_in_entryRuleNormalAttribute2031 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNormalAttribute2041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeClassExpression_in_ruleNormalAttribute2087 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_31_in_ruleNormalAttribute2098 = new BitSet(new long[]{0x0000008000040010L});
    public static final BitSet FOLLOW_ruleBExpression_in_ruleNormalAttribute2119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeClassExpression_in_entryRuleAttributeClassExpression2157 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributeClassExpression2167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeClass_in_ruleAttributeClassExpression2213 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_32_in_ruleAttributeClassExpression2224 = new BitSet(new long[]{0x0000F80000000000L});
    public static final BitSet FOLLOW_ruleAttributeClass_in_ruleAttributeClassExpression2245 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_ruleRestrictionAttribute_in_entryRuleRestrictionAttribute2283 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRestrictionAttribute2293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleRestrictionAttribute2328 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_ruleEnumLiteralsCollection_in_ruleRestrictionAttribute2349 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleRestrictionAttribute2359 = new BitSet(new long[]{0x0000008000040010L});
    public static final BitSet FOLLOW_ruleBExpression_in_ruleRestrictionAttribute2380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRestrictionGroupAttribute_in_entryRuleRestrictionGroupAttribute2416 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRestrictionGroupAttribute2426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleRestrictionGroupAttribute2470 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleRestrictionGroupAttribute2480 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_ruleRestrictionRule_in_ruleRestrictionGroupAttribute2501 = new BitSet(new long[]{0x0000001000040010L});
    public static final BitSet FOLLOW_36_in_ruleRestrictionGroupAttribute2512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRestrictionRule_in_entryRuleRestrictionRule2548 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRestrictionRule2558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumLiteralsCollection_in_ruleRestrictionRule2604 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleRestrictionRule2614 = new BitSet(new long[]{0x0000008000040010L});
    public static final BitSet FOLLOW_ruleBExpression_in_ruleRestrictionRule2635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReferenceTarget_in_entryRuleReferenceTarget2671 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReferenceTarget2681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_in_ruleReferenceTarget2728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExternalVariable_in_ruleReferenceTarget2755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_entryRuleReference2790 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReference2800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleReference2842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBExpression_in_entryRuleBExpression2879 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBExpression2889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBOrExpression_in_ruleBExpression2935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBOrExpression_in_entryRuleBOrExpression2969 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBOrExpression2979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBAndExpression_in_ruleBOrExpression3026 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_37_in_ruleBOrExpression3045 = new BitSet(new long[]{0x0000008000040010L});
    public static final BitSet FOLLOW_ruleBAndExpression_in_ruleBOrExpression3066 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_ruleBAndExpression_in_entryRuleBAndExpression3104 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBAndExpression3114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminalBExpression_in_ruleBAndExpression3161 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_38_in_ruleBAndExpression3180 = new BitSet(new long[]{0x0000008000040010L});
    public static final BitSet FOLLOW_ruleTerminalBExpression_in_ruleBAndExpression3201 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_ruleTerminalBExpression_in_entryRuleTerminalBExpression3239 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTerminalBExpression3249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicReferringBExpression_in_ruleTerminalBExpression3296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNegationExpression_in_ruleTerminalBExpression3323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleTerminalBExpression3339 = new BitSet(new long[]{0x0000008000040010L});
    public static final BitSet FOLLOW_ruleBExpression_in_ruleTerminalBExpression3361 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleTerminalBExpression3370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNegationExpression_in_entryRuleNegationExpression3407 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNegationExpression3417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleNegationExpression3452 = new BitSet(new long[]{0x0000008000040010L});
    public static final BitSet FOLLOW_ruleBExpression_in_ruleNegationExpression3473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicReferringBExpression_in_entryRuleAtomicReferringBExpression3509 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtomicReferringBExpression3519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBComparison_in_ruleAtomicReferringBExpression3566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumComparison_in_ruleAtomicReferringBExpression3593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValueComparison_in_ruleAtomicReferringBExpression3620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePresenceCheck_in_ruleAtomicReferringBExpression3647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBComparison_in_entryRuleBComparison3682 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBComparison3692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_ruleBComparison3747 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_40_in_ruleBComparison3758 = new BitSet(new long[]{0x0003000000000000L});
    public static final BitSet FOLLOW_ruleBLiteral_in_ruleBComparison3779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumComparison_in_entryRuleEnumComparison3817 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumComparison3827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleEnumComparison_in_ruleEnumComparison3874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiEnumComparison_in_ruleEnumComparison3901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleEnumComparison_in_entryRuleSingleEnumComparison3936 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSingleEnumComparison3946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_ruleSingleEnumComparison3992 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleSingleEnumComparison4002 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSingleEnumComparison4020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiEnumComparison_in_entryRuleMultiEnumComparison4056 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiEnumComparison4066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_ruleMultiEnumComparison4112 = new BitSet(new long[]{0x000C000000000000L});
    public static final BitSet FOLLOW_ruleEnumMembership_in_ruleMultiEnumComparison4133 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_ruleEnumLiteralsCollection_in_ruleMultiEnumComparison4154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValueComparison_in_entryRuleStringValueComparison4190 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringValueComparison4200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_ruleStringValueComparison4246 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleStringValueComparison4256 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringValueComparison4273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePresenceCheck_in_entryRulePresenceCheck4314 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePresenceCheck4324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_rulePresenceCheck4370 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_rulePresenceCheck4380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumLiteralsCollection_in_entryRuleEnumLiteralsCollection4416 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumLiteralsCollection4426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDirectEnumLiteralsCollection_in_ruleEnumLiteralsCollection4473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumListReference_in_ruleEnumLiteralsCollection4500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDirectEnumLiteralsCollection_in_entryRuleDirectEnumLiteralsCollection4535 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDirectEnumLiteralsCollection4545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleDirectEnumLiteralsCollection4589 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDirectEnumLiteralsCollection4607 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_19_in_ruleDirectEnumLiteralsCollection4618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumListReference_in_entryRuleEnumListReference4654 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumListReference4664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumListReference4706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleAttributeClass4753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleAttributeClass4768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleAttributeClass4783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleAttributeClass4798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleAttributeClass4813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleBLiteral4856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleBLiteral4871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleEnumMembership4914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleEnumMembership4929 = new BitSet(new long[]{0x0000000000000002L});

}