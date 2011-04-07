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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'dynamic-screen'", "'data-import'", "'='", "'view-class'", "'[nl:'", "']'", "'/'", "'('", "')'", "'external-var'", "'as'", "'define'", "'of'", "'data-store'", "'of-type'", "'is-multi-valued'", "'group'", "'with'", "'{'", "'}'", "'if'", "'+'", "'restrict-to'", "'restrict-to-group'", "'<'", "'>'", "'or'", "'|'", "'and'", "'&'", "'not'", "'!'", "'is'", "'equals'", "'is-present'", "'display'", "'required'", "'readonly'", "'calculated'", "'doubleAsterisk'", "'true'", "'false'", "'is-one-of'", "'is-not-one-of'"
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
    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:87:1: ruleDynamicScreen returns [EObject current=null] : ( 'dynamic-screen' ( (lv_label_1_0= ruleLabel ) ) 'data-import' '=' ( (lv_importURI_4_0= RULE_STRING ) ) 'view-class' '=' ( ( RULE_ID ) ) ( (lv_declarations_8_0= ruleDeclaration ) )* ( (lv_groups_9_0= ruleFieldGroup ) )+ ) ;
    public final EObject ruleDynamicScreen() throws RecognitionException {
        EObject current = null;

        Token lv_importURI_4_0=null;
        EObject lv_label_1_0 = null;

        EObject lv_declarations_8_0 = null;

        EObject lv_groups_9_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:92:6: ( ( 'dynamic-screen' ( (lv_label_1_0= ruleLabel ) ) 'data-import' '=' ( (lv_importURI_4_0= RULE_STRING ) ) 'view-class' '=' ( ( RULE_ID ) ) ( (lv_declarations_8_0= ruleDeclaration ) )* ( (lv_groups_9_0= ruleFieldGroup ) )+ ) )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:93:1: ( 'dynamic-screen' ( (lv_label_1_0= ruleLabel ) ) 'data-import' '=' ( (lv_importURI_4_0= RULE_STRING ) ) 'view-class' '=' ( ( RULE_ID ) ) ( (lv_declarations_8_0= ruleDeclaration ) )* ( (lv_groups_9_0= ruleFieldGroup ) )+ )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:93:1: ( 'dynamic-screen' ( (lv_label_1_0= ruleLabel ) ) 'data-import' '=' ( (lv_importURI_4_0= RULE_STRING ) ) 'view-class' '=' ( ( RULE_ID ) ) ( (lv_declarations_8_0= ruleDeclaration ) )* ( (lv_groups_9_0= ruleFieldGroup ) )+ )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:93:3: 'dynamic-screen' ( (lv_label_1_0= ruleLabel ) ) 'data-import' '=' ( (lv_importURI_4_0= RULE_STRING ) ) 'view-class' '=' ( ( RULE_ID ) ) ( (lv_declarations_8_0= ruleDeclaration ) )* ( (lv_groups_9_0= ruleFieldGroup ) )+
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

            match(input,12,FOLLOW_12_in_ruleDynamicScreen151); 

                    createLeafNode(grammarAccess.getDynamicScreenAccess().getDataImportKeyword_2(), null); 
                
            match(input,13,FOLLOW_13_in_ruleDynamicScreen161); 

                    createLeafNode(grammarAccess.getDynamicScreenAccess().getEqualsSignKeyword_3(), null); 
                
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:129:1: ( (lv_importURI_4_0= RULE_STRING ) )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:130:1: (lv_importURI_4_0= RULE_STRING )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:130:1: (lv_importURI_4_0= RULE_STRING )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:131:3: lv_importURI_4_0= RULE_STRING
            {
            lv_importURI_4_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDynamicScreen178); 

            			createLeafNode(grammarAccess.getDynamicScreenAccess().getImportURISTRINGTerminalRuleCall_4_0(), "importURI"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getDynamicScreenRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"importURI",
            	        		lv_importURI_4_0, 
            	        		"STRING", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,14,FOLLOW_14_in_ruleDynamicScreen193); 

                    createLeafNode(grammarAccess.getDynamicScreenAccess().getViewClassKeyword_5(), null); 
                
            match(input,13,FOLLOW_13_in_ruleDynamicScreen203); 

                    createLeafNode(grammarAccess.getDynamicScreenAccess().getEqualsSignKeyword_6(), null); 
                
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:161:1: ( ( RULE_ID ) )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:162:1: ( RULE_ID )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:162:1: ( RULE_ID )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:163:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getDynamicScreenRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDynamicScreen221); 

            		createLeafNode(grammarAccess.getDynamicScreenAccess().getViewClassEntityCrossReference_7_0(), "viewClass"); 
            	

            }


            }

            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:175:2: ( (lv_declarations_8_0= ruleDeclaration ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==20||LA1_0==22||LA1_0==24) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:176:1: (lv_declarations_8_0= ruleDeclaration )
            	    {
            	    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:176:1: (lv_declarations_8_0= ruleDeclaration )
            	    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:177:3: lv_declarations_8_0= ruleDeclaration
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getDynamicScreenAccess().getDeclarationsDeclarationParserRuleCall_8_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleDeclaration_in_ruleDynamicScreen242);
            	    lv_declarations_8_0=ruleDeclaration();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getDynamicScreenRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"declarations",
            	    	        		lv_declarations_8_0, 
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

            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:199:3: ( (lv_groups_9_0= ruleFieldGroup ) )+
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
            	    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:200:1: (lv_groups_9_0= ruleFieldGroup )
            	    {
            	    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:200:1: (lv_groups_9_0= ruleFieldGroup )
            	    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:201:3: lv_groups_9_0= ruleFieldGroup
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getDynamicScreenAccess().getGroupsFieldGroupParserRuleCall_9_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleFieldGroup_in_ruleDynamicScreen264);
            	    lv_groups_9_0=ruleFieldGroup();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getDynamicScreenRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"groups",
            	    	        		lv_groups_9_0, 
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


    // $ANTLR start entryRuleLabel
    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:231:1: entryRuleLabel returns [EObject current=null] : iv_ruleLabel= ruleLabel EOF ;
    public final EObject entryRuleLabel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLabel = null;


        try {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:232:2: (iv_ruleLabel= ruleLabel EOF )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:233:2: iv_ruleLabel= ruleLabel EOF
            {
             currentNode = createCompositeNode(grammarAccess.getLabelRule(), currentNode); 
            pushFollow(FOLLOW_ruleLabel_in_entryRuleLabel301);
            iv_ruleLabel=ruleLabel();
            _fsp--;

             current =iv_ruleLabel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLabel311); 

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
    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:240:1: ruleLabel returns [EObject current=null] : ( ( (lv_en_0_0= RULE_STRING ) ) ( '[nl:' ( (lv_nl_2_0= RULE_STRING ) ) ']' )? ) ;
    public final EObject ruleLabel() throws RecognitionException {
        EObject current = null;

        Token lv_en_0_0=null;
        Token lv_nl_2_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:245:6: ( ( ( (lv_en_0_0= RULE_STRING ) ) ( '[nl:' ( (lv_nl_2_0= RULE_STRING ) ) ']' )? ) )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:246:1: ( ( (lv_en_0_0= RULE_STRING ) ) ( '[nl:' ( (lv_nl_2_0= RULE_STRING ) ) ']' )? )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:246:1: ( ( (lv_en_0_0= RULE_STRING ) ) ( '[nl:' ( (lv_nl_2_0= RULE_STRING ) ) ']' )? )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:246:2: ( (lv_en_0_0= RULE_STRING ) ) ( '[nl:' ( (lv_nl_2_0= RULE_STRING ) ) ']' )?
            {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:246:2: ( (lv_en_0_0= RULE_STRING ) )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:247:1: (lv_en_0_0= RULE_STRING )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:247:1: (lv_en_0_0= RULE_STRING )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:248:3: lv_en_0_0= RULE_STRING
            {
            lv_en_0_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleLabel353); 

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

            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:270:2: ( '[nl:' ( (lv_nl_2_0= RULE_STRING ) ) ']' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:270:4: '[nl:' ( (lv_nl_2_0= RULE_STRING ) ) ']'
                    {
                    match(input,15,FOLLOW_15_in_ruleLabel369); 

                            createLeafNode(grammarAccess.getLabelAccess().getNlKeyword_1_0(), null); 
                        
                    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:274:1: ( (lv_nl_2_0= RULE_STRING ) )
                    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:275:1: (lv_nl_2_0= RULE_STRING )
                    {
                    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:275:1: (lv_nl_2_0= RULE_STRING )
                    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:276:3: lv_nl_2_0= RULE_STRING
                    {
                    lv_nl_2_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleLabel386); 

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

                    match(input,16,FOLLOW_16_in_ruleLabel401); 

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
    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:310:1: entryRulePathTail returns [EObject current=null] : iv_rulePathTail= rulePathTail EOF ;
    public final EObject entryRulePathTail() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePathTail = null;


        try {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:311:2: (iv_rulePathTail= rulePathTail EOF )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:312:2: iv_rulePathTail= rulePathTail EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPathTailRule(), currentNode); 
            pushFollow(FOLLOW_rulePathTail_in_entryRulePathTail439);
            iv_rulePathTail=rulePathTail();
            _fsp--;

             current =iv_rulePathTail; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePathTail449); 

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
    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:319:1: rulePathTail returns [EObject current=null] : ( '/' ( ( RULE_ID ) ) ( '(' ( ( RULE_ID ) ) ')' )? ( (lv_tail_5_0= rulePathTail ) )? ) ;
    public final EObject rulePathTail() throws RecognitionException {
        EObject current = null;

        EObject lv_tail_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:324:6: ( ( '/' ( ( RULE_ID ) ) ( '(' ( ( RULE_ID ) ) ')' )? ( (lv_tail_5_0= rulePathTail ) )? ) )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:325:1: ( '/' ( ( RULE_ID ) ) ( '(' ( ( RULE_ID ) ) ')' )? ( (lv_tail_5_0= rulePathTail ) )? )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:325:1: ( '/' ( ( RULE_ID ) ) ( '(' ( ( RULE_ID ) ) ')' )? ( (lv_tail_5_0= rulePathTail ) )? )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:325:3: '/' ( ( RULE_ID ) ) ( '(' ( ( RULE_ID ) ) ')' )? ( (lv_tail_5_0= rulePathTail ) )?
            {
            match(input,17,FOLLOW_17_in_rulePathTail484); 

                    createLeafNode(grammarAccess.getPathTailAccess().getSolidusKeyword_0(), null); 
                
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:329:1: ( ( RULE_ID ) )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:330:1: ( RULE_ID )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:330:1: ( RULE_ID )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:331:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getPathTailRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePathTail502); 

            		createLeafNode(grammarAccess.getPathTailAccess().getFieldFieldCrossReference_1_0(), "field"); 
            	

            }


            }

            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:343:2: ( '(' ( ( RULE_ID ) ) ')' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==18) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:343:4: '(' ( ( RULE_ID ) ) ')'
                    {
                    match(input,18,FOLLOW_18_in_rulePathTail513); 

                            createLeafNode(grammarAccess.getPathTailAccess().getLeftParenthesisKeyword_2_0(), null); 
                        
                    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:347:1: ( ( RULE_ID ) )
                    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:348:1: ( RULE_ID )
                    {
                    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:348:1: ( RULE_ID )
                    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:349:3: RULE_ID
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getPathTailRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePathTail531); 

                    		createLeafNode(grammarAccess.getPathTailAccess().getAsEntityEntityCrossReference_2_1_0(), "asEntity"); 
                    	

                    }


                    }

                    match(input,19,FOLLOW_19_in_rulePathTail541); 

                            createLeafNode(grammarAccess.getPathTailAccess().getRightParenthesisKeyword_2_2(), null); 
                        

                    }
                    break;

            }

            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:365:3: ( (lv_tail_5_0= rulePathTail ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:366:1: (lv_tail_5_0= rulePathTail )
                    {
                    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:366:1: (lv_tail_5_0= rulePathTail )
                    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:367:3: lv_tail_5_0= rulePathTail
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getPathTailAccess().getTailPathTailParserRuleCall_3_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_rulePathTail_in_rulePathTail564);
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
    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:397:1: entryRuleDeclaration returns [EObject current=null] : iv_ruleDeclaration= ruleDeclaration EOF ;
    public final EObject entryRuleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaration = null;


        try {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:398:2: (iv_ruleDeclaration= ruleDeclaration EOF )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:399:2: iv_ruleDeclaration= ruleDeclaration EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDeclarationRule(), currentNode); 
            pushFollow(FOLLOW_ruleDeclaration_in_entryRuleDeclaration601);
            iv_ruleDeclaration=ruleDeclaration();
            _fsp--;

             current =iv_ruleDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeclaration611); 

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
    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:406:1: ruleDeclaration returns [EObject current=null] : (this_ExternalVariable_0= ruleExternalVariable | this_EnumList_1= ruleEnumList | this_DataStore_2= ruleDataStore ) ;
    public final EObject ruleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_ExternalVariable_0 = null;

        EObject this_EnumList_1 = null;

        EObject this_DataStore_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:411:6: ( (this_ExternalVariable_0= ruleExternalVariable | this_EnumList_1= ruleEnumList | this_DataStore_2= ruleDataStore ) )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:412:1: (this_ExternalVariable_0= ruleExternalVariable | this_EnumList_1= ruleEnumList | this_DataStore_2= ruleDataStore )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:412:1: (this_ExternalVariable_0= ruleExternalVariable | this_EnumList_1= ruleEnumList | this_DataStore_2= ruleDataStore )
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
                    new NoViableAltException("412:1: (this_ExternalVariable_0= ruleExternalVariable | this_EnumList_1= ruleEnumList | this_DataStore_2= ruleDataStore )", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:413:5: this_ExternalVariable_0= ruleExternalVariable
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getDeclarationAccess().getExternalVariableParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleExternalVariable_in_ruleDeclaration658);
                    this_ExternalVariable_0=ruleExternalVariable();
                    _fsp--;

                     
                            current = this_ExternalVariable_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:423:5: this_EnumList_1= ruleEnumList
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getDeclarationAccess().getEnumListParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleEnumList_in_ruleDeclaration685);
                    this_EnumList_1=ruleEnumList();
                    _fsp--;

                     
                            current = this_EnumList_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:433:5: this_DataStore_2= ruleDataStore
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getDeclarationAccess().getDataStoreParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleDataStore_in_ruleDeclaration712);
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
    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:449:1: entryRuleExternalVariable returns [EObject current=null] : iv_ruleExternalVariable= ruleExternalVariable EOF ;
    public final EObject entryRuleExternalVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalVariable = null;


        try {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:450:2: (iv_ruleExternalVariable= ruleExternalVariable EOF )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:451:2: iv_ruleExternalVariable= ruleExternalVariable EOF
            {
             currentNode = createCompositeNode(grammarAccess.getExternalVariableRule(), currentNode); 
            pushFollow(FOLLOW_ruleExternalVariable_in_entryRuleExternalVariable747);
            iv_ruleExternalVariable=ruleExternalVariable();
            _fsp--;

             current =iv_ruleExternalVariable; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExternalVariable757); 

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
    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:458:1: ruleExternalVariable returns [EObject current=null] : ( 'external-var' ( (lv_path_1_0= rulePathTail ) ) 'as' ( (lv_name_3_0= RULE_ID ) ) ) ;
    public final EObject ruleExternalVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_3_0=null;
        EObject lv_path_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:463:6: ( ( 'external-var' ( (lv_path_1_0= rulePathTail ) ) 'as' ( (lv_name_3_0= RULE_ID ) ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:464:1: ( 'external-var' ( (lv_path_1_0= rulePathTail ) ) 'as' ( (lv_name_3_0= RULE_ID ) ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:464:1: ( 'external-var' ( (lv_path_1_0= rulePathTail ) ) 'as' ( (lv_name_3_0= RULE_ID ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:464:3: 'external-var' ( (lv_path_1_0= rulePathTail ) ) 'as' ( (lv_name_3_0= RULE_ID ) )
            {
            match(input,20,FOLLOW_20_in_ruleExternalVariable792); 

                    createLeafNode(grammarAccess.getExternalVariableAccess().getExternalVarKeyword_0(), null); 
                
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:468:1: ( (lv_path_1_0= rulePathTail ) )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:469:1: (lv_path_1_0= rulePathTail )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:469:1: (lv_path_1_0= rulePathTail )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:470:3: lv_path_1_0= rulePathTail
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getExternalVariableAccess().getPathPathTailParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_rulePathTail_in_ruleExternalVariable813);
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

            match(input,21,FOLLOW_21_in_ruleExternalVariable823); 

                    createLeafNode(grammarAccess.getExternalVariableAccess().getAsKeyword_2(), null); 
                
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:496:1: ( (lv_name_3_0= RULE_ID ) )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:497:1: (lv_name_3_0= RULE_ID )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:497:1: (lv_name_3_0= RULE_ID )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:498:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExternalVariable840); 

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
    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:528:1: entryRuleEnumList returns [EObject current=null] : iv_ruleEnumList= ruleEnumList EOF ;
    public final EObject entryRuleEnumList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumList = null;


        try {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:529:2: (iv_ruleEnumList= ruleEnumList EOF )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:530:2: iv_ruleEnumList= ruleEnumList EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEnumListRule(), currentNode); 
            pushFollow(FOLLOW_ruleEnumList_in_entryRuleEnumList881);
            iv_ruleEnumList=ruleEnumList();
            _fsp--;

             current =iv_ruleEnumList; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumList891); 

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
    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:537:1: ruleEnumList returns [EObject current=null] : ( 'define' ( (lv_name_1_0= RULE_ID ) ) 'as' '(' ( ( RULE_ID ) )+ ')' 'of' ( ( RULE_ID ) ) ) ;
    public final EObject ruleEnumList() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:542:6: ( ( 'define' ( (lv_name_1_0= RULE_ID ) ) 'as' '(' ( ( RULE_ID ) )+ ')' 'of' ( ( RULE_ID ) ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:543:1: ( 'define' ( (lv_name_1_0= RULE_ID ) ) 'as' '(' ( ( RULE_ID ) )+ ')' 'of' ( ( RULE_ID ) ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:543:1: ( 'define' ( (lv_name_1_0= RULE_ID ) ) 'as' '(' ( ( RULE_ID ) )+ ')' 'of' ( ( RULE_ID ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:543:3: 'define' ( (lv_name_1_0= RULE_ID ) ) 'as' '(' ( ( RULE_ID ) )+ ')' 'of' ( ( RULE_ID ) )
            {
            match(input,22,FOLLOW_22_in_ruleEnumList926); 

                    createLeafNode(grammarAccess.getEnumListAccess().getDefineKeyword_0(), null); 
                
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:547:1: ( (lv_name_1_0= RULE_ID ) )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:548:1: (lv_name_1_0= RULE_ID )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:548:1: (lv_name_1_0= RULE_ID )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:549:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumList943); 

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

            match(input,21,FOLLOW_21_in_ruleEnumList958); 

                    createLeafNode(grammarAccess.getEnumListAccess().getAsKeyword_2(), null); 
                
            match(input,18,FOLLOW_18_in_ruleEnumList968); 

                    createLeafNode(grammarAccess.getEnumListAccess().getLeftParenthesisKeyword_3(), null); 
                
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:579:1: ( ( RULE_ID ) )+
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
            	    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:580:1: ( RULE_ID )
            	    {
            	    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:580:1: ( RULE_ID )
            	    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:581:3: RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = factory.create(grammarAccess.getEnumListRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode, current);
            	    	        }
            	            
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumList986); 

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

            match(input,19,FOLLOW_19_in_ruleEnumList997); 

                    createLeafNode(grammarAccess.getEnumListAccess().getRightParenthesisKeyword_5(), null); 
                
            match(input,23,FOLLOW_23_in_ruleEnumList1007); 

                    createLeafNode(grammarAccess.getEnumListAccess().getOfKeyword_6(), null); 
                
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:601:1: ( ( RULE_ID ) )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:602:1: ( RULE_ID )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:602:1: ( RULE_ID )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:603:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getEnumListRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumList1025); 

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
    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:623:1: entryRuleDataStore returns [EObject current=null] : iv_ruleDataStore= ruleDataStore EOF ;
    public final EObject entryRuleDataStore() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataStore = null;


        try {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:624:2: (iv_ruleDataStore= ruleDataStore EOF )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:625:2: iv_ruleDataStore= ruleDataStore EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDataStoreRule(), currentNode); 
            pushFollow(FOLLOW_ruleDataStore_in_entryRuleDataStore1061);
            iv_ruleDataStore=ruleDataStore();
            _fsp--;

             current =iv_ruleDataStore; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataStore1071); 

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
    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:632:1: ruleDataStore returns [EObject current=null] : ( 'data-store' ( (lv_name_1_0= RULE_ID ) ) 'of-type' ( ( RULE_ID ) ) ( (lv_multi_4_0= 'is-multi-valued' ) )? ) ;
    public final EObject ruleDataStore() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token lv_multi_4_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:637:6: ( ( 'data-store' ( (lv_name_1_0= RULE_ID ) ) 'of-type' ( ( RULE_ID ) ) ( (lv_multi_4_0= 'is-multi-valued' ) )? ) )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:638:1: ( 'data-store' ( (lv_name_1_0= RULE_ID ) ) 'of-type' ( ( RULE_ID ) ) ( (lv_multi_4_0= 'is-multi-valued' ) )? )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:638:1: ( 'data-store' ( (lv_name_1_0= RULE_ID ) ) 'of-type' ( ( RULE_ID ) ) ( (lv_multi_4_0= 'is-multi-valued' ) )? )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:638:3: 'data-store' ( (lv_name_1_0= RULE_ID ) ) 'of-type' ( ( RULE_ID ) ) ( (lv_multi_4_0= 'is-multi-valued' ) )?
            {
            match(input,24,FOLLOW_24_in_ruleDataStore1106); 

                    createLeafNode(grammarAccess.getDataStoreAccess().getDataStoreKeyword_0(), null); 
                
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:642:1: ( (lv_name_1_0= RULE_ID ) )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:643:1: (lv_name_1_0= RULE_ID )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:643:1: (lv_name_1_0= RULE_ID )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:644:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDataStore1123); 

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

            match(input,25,FOLLOW_25_in_ruleDataStore1138); 

                    createLeafNode(grammarAccess.getDataStoreAccess().getOfTypeKeyword_2(), null); 
                
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:670:1: ( ( RULE_ID ) )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:671:1: ( RULE_ID )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:671:1: ( RULE_ID )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:672:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getDataStoreRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDataStore1156); 

            		createLeafNode(grammarAccess.getDataStoreAccess().getClassEntityCrossReference_3_0(), "class"); 
            	

            }


            }

            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:684:2: ( (lv_multi_4_0= 'is-multi-valued' ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==26) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:685:1: (lv_multi_4_0= 'is-multi-valued' )
                    {
                    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:685:1: (lv_multi_4_0= 'is-multi-valued' )
                    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:686:3: lv_multi_4_0= 'is-multi-valued'
                    {
                    lv_multi_4_0=(Token)input.LT(1);
                    match(input,26,FOLLOW_26_in_ruleDataStore1174); 

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
    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:713:1: entryRuleGroupElement returns [EObject current=null] : iv_ruleGroupElement= ruleGroupElement EOF ;
    public final EObject entryRuleGroupElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroupElement = null;


        try {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:714:2: (iv_ruleGroupElement= ruleGroupElement EOF )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:715:2: iv_ruleGroupElement= ruleGroupElement EOF
            {
             currentNode = createCompositeNode(grammarAccess.getGroupElementRule(), currentNode); 
            pushFollow(FOLLOW_ruleGroupElement_in_entryRuleGroupElement1224);
            iv_ruleGroupElement=ruleGroupElement();
            _fsp--;

             current =iv_ruleGroupElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGroupElement1234); 

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
    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:722:1: ruleGroupElement returns [EObject current=null] : (this_Field_0= ruleField | this_FieldGroup_1= ruleFieldGroup ) ;
    public final EObject ruleGroupElement() throws RecognitionException {
        EObject current = null;

        EObject this_Field_0 = null;

        EObject this_FieldGroup_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:727:6: ( (this_Field_0= ruleField | this_FieldGroup_1= ruleFieldGroup ) )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:728:1: (this_Field_0= ruleField | this_FieldGroup_1= ruleFieldGroup )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:728:1: (this_Field_0= ruleField | this_FieldGroup_1= ruleFieldGroup )
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
                    new NoViableAltException("728:1: (this_Field_0= ruleField | this_FieldGroup_1= ruleFieldGroup )", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:729:5: this_Field_0= ruleField
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getGroupElementAccess().getFieldParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleField_in_ruleGroupElement1281);
                    this_Field_0=ruleField();
                    _fsp--;

                     
                            current = this_Field_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:739:5: this_FieldGroup_1= ruleFieldGroup
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getGroupElementAccess().getFieldGroupParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleFieldGroup_in_ruleGroupElement1308);
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
    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:755:1: entryRuleField returns [EObject current=null] : iv_ruleField= ruleField EOF ;
    public final EObject entryRuleField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleField = null;


        try {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:756:2: (iv_ruleField= ruleField EOF )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:757:2: iv_ruleField= ruleField EOF
            {
             currentNode = createCompositeNode(grammarAccess.getFieldRule(), currentNode); 
            pushFollow(FOLLOW_ruleField_in_entryRuleField1343);
            iv_ruleField=ruleField();
            _fsp--;

             current =iv_ruleField; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleField1353); 

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
    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:764:1: ruleField returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_label_1_0= ruleLabel ) ) ( (lv_path_2_0= rulePathTail ) ) ( (lv_attributes_3_0= ruleAttribute ) )* ) ;
    public final EObject ruleField() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_label_1_0 = null;

        EObject lv_path_2_0 = null;

        EObject lv_attributes_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:769:6: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_label_1_0= ruleLabel ) ) ( (lv_path_2_0= rulePathTail ) ) ( (lv_attributes_3_0= ruleAttribute ) )* ) )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:770:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_label_1_0= ruleLabel ) ) ( (lv_path_2_0= rulePathTail ) ) ( (lv_attributes_3_0= ruleAttribute ) )* )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:770:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_label_1_0= ruleLabel ) ) ( (lv_path_2_0= rulePathTail ) ) ( (lv_attributes_3_0= ruleAttribute ) )* )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:770:2: ( (lv_name_0_0= RULE_ID ) ) ( (lv_label_1_0= ruleLabel ) ) ( (lv_path_2_0= rulePathTail ) ) ( (lv_attributes_3_0= ruleAttribute ) )*
            {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:770:2: ( (lv_name_0_0= RULE_ID ) )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:771:1: (lv_name_0_0= RULE_ID )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:771:1: (lv_name_0_0= RULE_ID )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:772:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleField1395); 

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

            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:794:2: ( (lv_label_1_0= ruleLabel ) )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:795:1: (lv_label_1_0= ruleLabel )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:795:1: (lv_label_1_0= ruleLabel )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:796:3: lv_label_1_0= ruleLabel
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getFieldAccess().getLabelLabelParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleLabel_in_ruleField1421);
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

            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:818:2: ( (lv_path_2_0= rulePathTail ) )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:819:1: (lv_path_2_0= rulePathTail )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:819:1: (lv_path_2_0= rulePathTail )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:820:3: lv_path_2_0= rulePathTail
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getFieldAccess().getPathPathTailParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_rulePathTail_in_ruleField1442);
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

            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:842:2: ( (lv_attributes_3_0= ruleAttribute ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=33 && LA10_0<=34)||(LA10_0>=46 && LA10_0<=50)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:843:1: (lv_attributes_3_0= ruleAttribute )
            	    {
            	    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:843:1: (lv_attributes_3_0= ruleAttribute )
            	    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:844:3: lv_attributes_3_0= ruleAttribute
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getFieldAccess().getAttributesAttributeParserRuleCall_3_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleAttribute_in_ruleField1463);
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
    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:874:1: entryRuleFieldGroup returns [EObject current=null] : iv_ruleFieldGroup= ruleFieldGroup EOF ;
    public final EObject entryRuleFieldGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFieldGroup = null;


        try {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:875:2: (iv_ruleFieldGroup= ruleFieldGroup EOF )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:876:2: iv_ruleFieldGroup= ruleFieldGroup EOF
            {
             currentNode = createCompositeNode(grammarAccess.getFieldGroupRule(), currentNode); 
            pushFollow(FOLLOW_ruleFieldGroup_in_entryRuleFieldGroup1500);
            iv_ruleFieldGroup=ruleFieldGroup();
            _fsp--;

             current =iv_ruleFieldGroup; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFieldGroup1510); 

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
    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:883:1: ruleFieldGroup returns [EObject current=null] : ( 'group' ( (lv_label_1_0= ruleLabel ) )? ( 'with' ( (lv_with_3_0= rulePathTail ) ) )? '{' ( (lv_elements_5_0= ruleGroupElement ) )+ '}' ( (lv_attributes_7_0= ruleAttribute ) )* ) ;
    public final EObject ruleFieldGroup() throws RecognitionException {
        EObject current = null;

        EObject lv_label_1_0 = null;

        EObject lv_with_3_0 = null;

        EObject lv_elements_5_0 = null;

        EObject lv_attributes_7_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:888:6: ( ( 'group' ( (lv_label_1_0= ruleLabel ) )? ( 'with' ( (lv_with_3_0= rulePathTail ) ) )? '{' ( (lv_elements_5_0= ruleGroupElement ) )+ '}' ( (lv_attributes_7_0= ruleAttribute ) )* ) )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:889:1: ( 'group' ( (lv_label_1_0= ruleLabel ) )? ( 'with' ( (lv_with_3_0= rulePathTail ) ) )? '{' ( (lv_elements_5_0= ruleGroupElement ) )+ '}' ( (lv_attributes_7_0= ruleAttribute ) )* )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:889:1: ( 'group' ( (lv_label_1_0= ruleLabel ) )? ( 'with' ( (lv_with_3_0= rulePathTail ) ) )? '{' ( (lv_elements_5_0= ruleGroupElement ) )+ '}' ( (lv_attributes_7_0= ruleAttribute ) )* )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:889:3: 'group' ( (lv_label_1_0= ruleLabel ) )? ( 'with' ( (lv_with_3_0= rulePathTail ) ) )? '{' ( (lv_elements_5_0= ruleGroupElement ) )+ '}' ( (lv_attributes_7_0= ruleAttribute ) )*
            {
            match(input,27,FOLLOW_27_in_ruleFieldGroup1545); 

                    createLeafNode(grammarAccess.getFieldGroupAccess().getGroupKeyword_0(), null); 
                
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:893:1: ( (lv_label_1_0= ruleLabel ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_STRING) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:894:1: (lv_label_1_0= ruleLabel )
                    {
                    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:894:1: (lv_label_1_0= ruleLabel )
                    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:895:3: lv_label_1_0= ruleLabel
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getFieldGroupAccess().getLabelLabelParserRuleCall_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleLabel_in_ruleFieldGroup1566);
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

            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:917:3: ( 'with' ( (lv_with_3_0= rulePathTail ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==28) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:917:5: 'with' ( (lv_with_3_0= rulePathTail ) )
                    {
                    match(input,28,FOLLOW_28_in_ruleFieldGroup1578); 

                            createLeafNode(grammarAccess.getFieldGroupAccess().getWithKeyword_2_0(), null); 
                        
                    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:921:1: ( (lv_with_3_0= rulePathTail ) )
                    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:922:1: (lv_with_3_0= rulePathTail )
                    {
                    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:922:1: (lv_with_3_0= rulePathTail )
                    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:923:3: lv_with_3_0= rulePathTail
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getFieldGroupAccess().getWithPathTailParserRuleCall_2_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_rulePathTail_in_ruleFieldGroup1599);
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

            match(input,29,FOLLOW_29_in_ruleFieldGroup1611); 

                    createLeafNode(grammarAccess.getFieldGroupAccess().getLeftCurlyBracketKeyword_3(), null); 
                
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:949:1: ( (lv_elements_5_0= ruleGroupElement ) )+
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
            	    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:950:1: (lv_elements_5_0= ruleGroupElement )
            	    {
            	    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:950:1: (lv_elements_5_0= ruleGroupElement )
            	    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:951:3: lv_elements_5_0= ruleGroupElement
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getFieldGroupAccess().getElementsGroupElementParserRuleCall_4_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleGroupElement_in_ruleFieldGroup1632);
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

            match(input,30,FOLLOW_30_in_ruleFieldGroup1643); 

                    createLeafNode(grammarAccess.getFieldGroupAccess().getRightCurlyBracketKeyword_5(), null); 
                
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:977:1: ( (lv_attributes_7_0= ruleAttribute ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=33 && LA14_0<=34)||(LA14_0>=46 && LA14_0<=50)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:978:1: (lv_attributes_7_0= ruleAttribute )
            	    {
            	    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:978:1: (lv_attributes_7_0= ruleAttribute )
            	    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:979:3: lv_attributes_7_0= ruleAttribute
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getFieldGroupAccess().getAttributesAttributeParserRuleCall_6_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleAttribute_in_ruleFieldGroup1664);
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
    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1009:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1010:2: (iv_ruleAttribute= ruleAttribute EOF )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1011:2: iv_ruleAttribute= ruleAttribute EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAttributeRule(), currentNode); 
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute1701);
            iv_ruleAttribute=ruleAttribute();
            _fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute1711); 

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
    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1018:1: ruleAttribute returns [EObject current=null] : (this_NormalAttribute_0= ruleNormalAttribute | this_EnumFieldAttribute_1= ruleEnumFieldAttribute ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        EObject this_NormalAttribute_0 = null;

        EObject this_EnumFieldAttribute_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1023:6: ( (this_NormalAttribute_0= ruleNormalAttribute | this_EnumFieldAttribute_1= ruleEnumFieldAttribute ) )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1024:1: (this_NormalAttribute_0= ruleNormalAttribute | this_EnumFieldAttribute_1= ruleEnumFieldAttribute )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1024:1: (this_NormalAttribute_0= ruleNormalAttribute | this_EnumFieldAttribute_1= ruleEnumFieldAttribute )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=46 && LA15_0<=50)) ) {
                alt15=1;
            }
            else if ( ((LA15_0>=33 && LA15_0<=34)) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1024:1: (this_NormalAttribute_0= ruleNormalAttribute | this_EnumFieldAttribute_1= ruleEnumFieldAttribute )", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1025:5: this_NormalAttribute_0= ruleNormalAttribute
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getAttributeAccess().getNormalAttributeParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleNormalAttribute_in_ruleAttribute1758);
                    this_NormalAttribute_0=ruleNormalAttribute();
                    _fsp--;

                     
                            current = this_NormalAttribute_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1035:5: this_EnumFieldAttribute_1= ruleEnumFieldAttribute
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getAttributeAccess().getEnumFieldAttributeParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleEnumFieldAttribute_in_ruleAttribute1785);
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
    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1051:1: entryRuleEnumFieldAttribute returns [EObject current=null] : iv_ruleEnumFieldAttribute= ruleEnumFieldAttribute EOF ;
    public final EObject entryRuleEnumFieldAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumFieldAttribute = null;


        try {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1052:2: (iv_ruleEnumFieldAttribute= ruleEnumFieldAttribute EOF )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1053:2: iv_ruleEnumFieldAttribute= ruleEnumFieldAttribute EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEnumFieldAttributeRule(), currentNode); 
            pushFollow(FOLLOW_ruleEnumFieldAttribute_in_entryRuleEnumFieldAttribute1820);
            iv_ruleEnumFieldAttribute=ruleEnumFieldAttribute();
            _fsp--;

             current =iv_ruleEnumFieldAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumFieldAttribute1830); 

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
    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1060:1: ruleEnumFieldAttribute returns [EObject current=null] : (this_RestrictionAttribute_0= ruleRestrictionAttribute | this_RestrictionGroupAttribute_1= ruleRestrictionGroupAttribute ) ;
    public final EObject ruleEnumFieldAttribute() throws RecognitionException {
        EObject current = null;

        EObject this_RestrictionAttribute_0 = null;

        EObject this_RestrictionGroupAttribute_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1065:6: ( (this_RestrictionAttribute_0= ruleRestrictionAttribute | this_RestrictionGroupAttribute_1= ruleRestrictionGroupAttribute ) )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1066:1: (this_RestrictionAttribute_0= ruleRestrictionAttribute | this_RestrictionGroupAttribute_1= ruleRestrictionGroupAttribute )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1066:1: (this_RestrictionAttribute_0= ruleRestrictionAttribute | this_RestrictionGroupAttribute_1= ruleRestrictionGroupAttribute )
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
                    new NoViableAltException("1066:1: (this_RestrictionAttribute_0= ruleRestrictionAttribute | this_RestrictionGroupAttribute_1= ruleRestrictionGroupAttribute )", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1067:5: this_RestrictionAttribute_0= ruleRestrictionAttribute
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getEnumFieldAttributeAccess().getRestrictionAttributeParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleRestrictionAttribute_in_ruleEnumFieldAttribute1877);
                    this_RestrictionAttribute_0=ruleRestrictionAttribute();
                    _fsp--;

                     
                            current = this_RestrictionAttribute_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1077:5: this_RestrictionGroupAttribute_1= ruleRestrictionGroupAttribute
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getEnumFieldAttributeAccess().getRestrictionGroupAttributeParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleRestrictionGroupAttribute_in_ruleEnumFieldAttribute1904);
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
    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1093:1: entryRuleNormalAttribute returns [EObject current=null] : iv_ruleNormalAttribute= ruleNormalAttribute EOF ;
    public final EObject entryRuleNormalAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNormalAttribute = null;


        try {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1094:2: (iv_ruleNormalAttribute= ruleNormalAttribute EOF )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1095:2: iv_ruleNormalAttribute= ruleNormalAttribute EOF
            {
             currentNode = createCompositeNode(grammarAccess.getNormalAttributeRule(), currentNode); 
            pushFollow(FOLLOW_ruleNormalAttribute_in_entryRuleNormalAttribute1939);
            iv_ruleNormalAttribute=ruleNormalAttribute();
            _fsp--;

             current =iv_ruleNormalAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNormalAttribute1949); 

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
    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1102:1: ruleNormalAttribute returns [EObject current=null] : ( ( (lv_classExpr_0_0= ruleAttributeClassExpression ) ) ( 'if' ( (lv_clause_2_0= ruleBExpression ) ) )? ) ;
    public final EObject ruleNormalAttribute() throws RecognitionException {
        EObject current = null;

        EObject lv_classExpr_0_0 = null;

        EObject lv_clause_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1107:6: ( ( ( (lv_classExpr_0_0= ruleAttributeClassExpression ) ) ( 'if' ( (lv_clause_2_0= ruleBExpression ) ) )? ) )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1108:1: ( ( (lv_classExpr_0_0= ruleAttributeClassExpression ) ) ( 'if' ( (lv_clause_2_0= ruleBExpression ) ) )? )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1108:1: ( ( (lv_classExpr_0_0= ruleAttributeClassExpression ) ) ( 'if' ( (lv_clause_2_0= ruleBExpression ) ) )? )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1108:2: ( (lv_classExpr_0_0= ruleAttributeClassExpression ) ) ( 'if' ( (lv_clause_2_0= ruleBExpression ) ) )?
            {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1108:2: ( (lv_classExpr_0_0= ruleAttributeClassExpression ) )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1109:1: (lv_classExpr_0_0= ruleAttributeClassExpression )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1109:1: (lv_classExpr_0_0= ruleAttributeClassExpression )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1110:3: lv_classExpr_0_0= ruleAttributeClassExpression
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getNormalAttributeAccess().getClassExprAttributeClassExpressionParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleAttributeClassExpression_in_ruleNormalAttribute1995);
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

            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1132:2: ( 'if' ( (lv_clause_2_0= ruleBExpression ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==31) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1132:4: 'if' ( (lv_clause_2_0= ruleBExpression ) )
                    {
                    match(input,31,FOLLOW_31_in_ruleNormalAttribute2006); 

                            createLeafNode(grammarAccess.getNormalAttributeAccess().getIfKeyword_1_0(), null); 
                        
                    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1136:1: ( (lv_clause_2_0= ruleBExpression ) )
                    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1137:1: (lv_clause_2_0= ruleBExpression )
                    {
                    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1137:1: (lv_clause_2_0= ruleBExpression )
                    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1138:3: lv_clause_2_0= ruleBExpression
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getNormalAttributeAccess().getClauseBExpressionParserRuleCall_1_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleBExpression_in_ruleNormalAttribute2027);
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
    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1168:1: entryRuleAttributeClassExpression returns [EObject current=null] : iv_ruleAttributeClassExpression= ruleAttributeClassExpression EOF ;
    public final EObject entryRuleAttributeClassExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeClassExpression = null;


        try {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1169:2: (iv_ruleAttributeClassExpression= ruleAttributeClassExpression EOF )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1170:2: iv_ruleAttributeClassExpression= ruleAttributeClassExpression EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAttributeClassExpressionRule(), currentNode); 
            pushFollow(FOLLOW_ruleAttributeClassExpression_in_entryRuleAttributeClassExpression2065);
            iv_ruleAttributeClassExpression=ruleAttributeClassExpression();
            _fsp--;

             current =iv_ruleAttributeClassExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributeClassExpression2075); 

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
    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1177:1: ruleAttributeClassExpression returns [EObject current=null] : ( ( (lv_classes_0_0= ruleAttributeClass ) ) ( '+' ( (lv_classes_2_0= ruleAttributeClass ) ) )* ) ;
    public final EObject ruleAttributeClassExpression() throws RecognitionException {
        EObject current = null;

        Enumerator lv_classes_0_0 = null;

        Enumerator lv_classes_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1182:6: ( ( ( (lv_classes_0_0= ruleAttributeClass ) ) ( '+' ( (lv_classes_2_0= ruleAttributeClass ) ) )* ) )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1183:1: ( ( (lv_classes_0_0= ruleAttributeClass ) ) ( '+' ( (lv_classes_2_0= ruleAttributeClass ) ) )* )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1183:1: ( ( (lv_classes_0_0= ruleAttributeClass ) ) ( '+' ( (lv_classes_2_0= ruleAttributeClass ) ) )* )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1183:2: ( (lv_classes_0_0= ruleAttributeClass ) ) ( '+' ( (lv_classes_2_0= ruleAttributeClass ) ) )*
            {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1183:2: ( (lv_classes_0_0= ruleAttributeClass ) )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1184:1: (lv_classes_0_0= ruleAttributeClass )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1184:1: (lv_classes_0_0= ruleAttributeClass )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1185:3: lv_classes_0_0= ruleAttributeClass
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getAttributeClassExpressionAccess().getClassesAttributeClassEnumRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleAttributeClass_in_ruleAttributeClassExpression2121);
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

            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1207:2: ( '+' ( (lv_classes_2_0= ruleAttributeClass ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==32) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1207:4: '+' ( (lv_classes_2_0= ruleAttributeClass ) )
            	    {
            	    match(input,32,FOLLOW_32_in_ruleAttributeClassExpression2132); 

            	            createLeafNode(grammarAccess.getAttributeClassExpressionAccess().getPlusSignKeyword_1_0(), null); 
            	        
            	    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1211:1: ( (lv_classes_2_0= ruleAttributeClass ) )
            	    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1212:1: (lv_classes_2_0= ruleAttributeClass )
            	    {
            	    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1212:1: (lv_classes_2_0= ruleAttributeClass )
            	    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1213:3: lv_classes_2_0= ruleAttributeClass
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getAttributeClassExpressionAccess().getClassesAttributeClassEnumRuleCall_1_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleAttributeClass_in_ruleAttributeClassExpression2153);
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
    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1243:1: entryRuleRestrictionAttribute returns [EObject current=null] : iv_ruleRestrictionAttribute= ruleRestrictionAttribute EOF ;
    public final EObject entryRuleRestrictionAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRestrictionAttribute = null;


        try {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1244:2: (iv_ruleRestrictionAttribute= ruleRestrictionAttribute EOF )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1245:2: iv_ruleRestrictionAttribute= ruleRestrictionAttribute EOF
            {
             currentNode = createCompositeNode(grammarAccess.getRestrictionAttributeRule(), currentNode); 
            pushFollow(FOLLOW_ruleRestrictionAttribute_in_entryRuleRestrictionAttribute2191);
            iv_ruleRestrictionAttribute=ruleRestrictionAttribute();
            _fsp--;

             current =iv_ruleRestrictionAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRestrictionAttribute2201); 

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
    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1252:1: ruleRestrictionAttribute returns [EObject current=null] : ( 'restrict-to' ( (lv_literals_1_0= ruleEnumLiteralsCollection ) ) 'if' ( (lv_clause_3_0= ruleBExpression ) ) ) ;
    public final EObject ruleRestrictionAttribute() throws RecognitionException {
        EObject current = null;

        EObject lv_literals_1_0 = null;

        EObject lv_clause_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1257:6: ( ( 'restrict-to' ( (lv_literals_1_0= ruleEnumLiteralsCollection ) ) 'if' ( (lv_clause_3_0= ruleBExpression ) ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1258:1: ( 'restrict-to' ( (lv_literals_1_0= ruleEnumLiteralsCollection ) ) 'if' ( (lv_clause_3_0= ruleBExpression ) ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1258:1: ( 'restrict-to' ( (lv_literals_1_0= ruleEnumLiteralsCollection ) ) 'if' ( (lv_clause_3_0= ruleBExpression ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1258:3: 'restrict-to' ( (lv_literals_1_0= ruleEnumLiteralsCollection ) ) 'if' ( (lv_clause_3_0= ruleBExpression ) )
            {
            match(input,33,FOLLOW_33_in_ruleRestrictionAttribute2236); 

                    createLeafNode(grammarAccess.getRestrictionAttributeAccess().getRestrictToKeyword_0(), null); 
                
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1262:1: ( (lv_literals_1_0= ruleEnumLiteralsCollection ) )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1263:1: (lv_literals_1_0= ruleEnumLiteralsCollection )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1263:1: (lv_literals_1_0= ruleEnumLiteralsCollection )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1264:3: lv_literals_1_0= ruleEnumLiteralsCollection
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getRestrictionAttributeAccess().getLiteralsEnumLiteralsCollectionParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleEnumLiteralsCollection_in_ruleRestrictionAttribute2257);
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

            match(input,31,FOLLOW_31_in_ruleRestrictionAttribute2267); 

                    createLeafNode(grammarAccess.getRestrictionAttributeAccess().getIfKeyword_2(), null); 
                
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1290:1: ( (lv_clause_3_0= ruleBExpression ) )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1291:1: (lv_clause_3_0= ruleBExpression )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1291:1: (lv_clause_3_0= ruleBExpression )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1292:3: lv_clause_3_0= ruleBExpression
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getRestrictionAttributeAccess().getClauseBExpressionParserRuleCall_3_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleBExpression_in_ruleRestrictionAttribute2288);
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
    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1322:1: entryRuleRestrictionGroupAttribute returns [EObject current=null] : iv_ruleRestrictionGroupAttribute= ruleRestrictionGroupAttribute EOF ;
    public final EObject entryRuleRestrictionGroupAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRestrictionGroupAttribute = null;


        try {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1323:2: (iv_ruleRestrictionGroupAttribute= ruleRestrictionGroupAttribute EOF )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1324:2: iv_ruleRestrictionGroupAttribute= ruleRestrictionGroupAttribute EOF
            {
             currentNode = createCompositeNode(grammarAccess.getRestrictionGroupAttributeRule(), currentNode); 
            pushFollow(FOLLOW_ruleRestrictionGroupAttribute_in_entryRuleRestrictionGroupAttribute2324);
            iv_ruleRestrictionGroupAttribute=ruleRestrictionGroupAttribute();
            _fsp--;

             current =iv_ruleRestrictionGroupAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRestrictionGroupAttribute2334); 

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
    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1331:1: ruleRestrictionGroupAttribute returns [EObject current=null] : ( () 'restrict-to-group' '<' ( (lv_rules_3_0= ruleRestrictionRule ) )+ '>' ) ;
    public final EObject ruleRestrictionGroupAttribute() throws RecognitionException {
        EObject current = null;

        EObject lv_rules_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1336:6: ( ( () 'restrict-to-group' '<' ( (lv_rules_3_0= ruleRestrictionRule ) )+ '>' ) )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1337:1: ( () 'restrict-to-group' '<' ( (lv_rules_3_0= ruleRestrictionRule ) )+ '>' )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1337:1: ( () 'restrict-to-group' '<' ( (lv_rules_3_0= ruleRestrictionRule ) )+ '>' )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1337:2: () 'restrict-to-group' '<' ( (lv_rules_3_0= ruleRestrictionRule ) )+ '>'
            {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1337:2: ()
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1338:5: 
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

            match(input,34,FOLLOW_34_in_ruleRestrictionGroupAttribute2378); 

                    createLeafNode(grammarAccess.getRestrictionGroupAttributeAccess().getRestrictToGroupKeyword_1(), null); 
                
            match(input,35,FOLLOW_35_in_ruleRestrictionGroupAttribute2388); 

                    createLeafNode(grammarAccess.getRestrictionGroupAttributeAccess().getLessThanSignKeyword_2(), null); 
                
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1356:1: ( (lv_rules_3_0= ruleRestrictionRule ) )+
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
            	    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1357:1: (lv_rules_3_0= ruleRestrictionRule )
            	    {
            	    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1357:1: (lv_rules_3_0= ruleRestrictionRule )
            	    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1358:3: lv_rules_3_0= ruleRestrictionRule
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getRestrictionGroupAttributeAccess().getRulesRestrictionRuleParserRuleCall_3_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleRestrictionRule_in_ruleRestrictionGroupAttribute2409);
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

            match(input,36,FOLLOW_36_in_ruleRestrictionGroupAttribute2420); 

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
    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1392:1: entryRuleRestrictionRule returns [EObject current=null] : iv_ruleRestrictionRule= ruleRestrictionRule EOF ;
    public final EObject entryRuleRestrictionRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRestrictionRule = null;


        try {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1393:2: (iv_ruleRestrictionRule= ruleRestrictionRule EOF )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1394:2: iv_ruleRestrictionRule= ruleRestrictionRule EOF
            {
             currentNode = createCompositeNode(grammarAccess.getRestrictionRuleRule(), currentNode); 
            pushFollow(FOLLOW_ruleRestrictionRule_in_entryRuleRestrictionRule2456);
            iv_ruleRestrictionRule=ruleRestrictionRule();
            _fsp--;

             current =iv_ruleRestrictionRule; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRestrictionRule2466); 

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
    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1401:1: ruleRestrictionRule returns [EObject current=null] : ( ( (lv_literals_0_0= ruleEnumLiteralsCollection ) ) 'if' ( (lv_clause_2_0= ruleBExpression ) ) ) ;
    public final EObject ruleRestrictionRule() throws RecognitionException {
        EObject current = null;

        EObject lv_literals_0_0 = null;

        EObject lv_clause_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1406:6: ( ( ( (lv_literals_0_0= ruleEnumLiteralsCollection ) ) 'if' ( (lv_clause_2_0= ruleBExpression ) ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1407:1: ( ( (lv_literals_0_0= ruleEnumLiteralsCollection ) ) 'if' ( (lv_clause_2_0= ruleBExpression ) ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1407:1: ( ( (lv_literals_0_0= ruleEnumLiteralsCollection ) ) 'if' ( (lv_clause_2_0= ruleBExpression ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1407:2: ( (lv_literals_0_0= ruleEnumLiteralsCollection ) ) 'if' ( (lv_clause_2_0= ruleBExpression ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1407:2: ( (lv_literals_0_0= ruleEnumLiteralsCollection ) )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1408:1: (lv_literals_0_0= ruleEnumLiteralsCollection )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1408:1: (lv_literals_0_0= ruleEnumLiteralsCollection )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1409:3: lv_literals_0_0= ruleEnumLiteralsCollection
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getRestrictionRuleAccess().getLiteralsEnumLiteralsCollectionParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleEnumLiteralsCollection_in_ruleRestrictionRule2512);
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

            match(input,31,FOLLOW_31_in_ruleRestrictionRule2522); 

                    createLeafNode(grammarAccess.getRestrictionRuleAccess().getIfKeyword_1(), null); 
                
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1435:1: ( (lv_clause_2_0= ruleBExpression ) )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1436:1: (lv_clause_2_0= ruleBExpression )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1436:1: (lv_clause_2_0= ruleBExpression )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1437:3: lv_clause_2_0= ruleBExpression
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getRestrictionRuleAccess().getClauseBExpressionParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleBExpression_in_ruleRestrictionRule2543);
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
    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1467:1: entryRuleReferenceTarget returns [EObject current=null] : iv_ruleReferenceTarget= ruleReferenceTarget EOF ;
    public final EObject entryRuleReferenceTarget() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReferenceTarget = null;


        try {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1468:2: (iv_ruleReferenceTarget= ruleReferenceTarget EOF )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1469:2: iv_ruleReferenceTarget= ruleReferenceTarget EOF
            {
             currentNode = createCompositeNode(grammarAccess.getReferenceTargetRule(), currentNode); 
            pushFollow(FOLLOW_ruleReferenceTarget_in_entryRuleReferenceTarget2579);
            iv_ruleReferenceTarget=ruleReferenceTarget();
            _fsp--;

             current =iv_ruleReferenceTarget; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReferenceTarget2589); 

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
    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1476:1: ruleReferenceTarget returns [EObject current=null] : (this_Field_0= ruleField | this_ExternalVariable_1= ruleExternalVariable ) ;
    public final EObject ruleReferenceTarget() throws RecognitionException {
        EObject current = null;

        EObject this_Field_0 = null;

        EObject this_ExternalVariable_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1481:6: ( (this_Field_0= ruleField | this_ExternalVariable_1= ruleExternalVariable ) )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1482:1: (this_Field_0= ruleField | this_ExternalVariable_1= ruleExternalVariable )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1482:1: (this_Field_0= ruleField | this_ExternalVariable_1= ruleExternalVariable )
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
                    new NoViableAltException("1482:1: (this_Field_0= ruleField | this_ExternalVariable_1= ruleExternalVariable )", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1483:5: this_Field_0= ruleField
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getReferenceTargetAccess().getFieldParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleField_in_ruleReferenceTarget2636);
                    this_Field_0=ruleField();
                    _fsp--;

                     
                            current = this_Field_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1493:5: this_ExternalVariable_1= ruleExternalVariable
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getReferenceTargetAccess().getExternalVariableParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleExternalVariable_in_ruleReferenceTarget2663);
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
    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1509:1: entryRuleReference returns [EObject current=null] : iv_ruleReference= ruleReference EOF ;
    public final EObject entryRuleReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReference = null;


        try {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1510:2: (iv_ruleReference= ruleReference EOF )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1511:2: iv_ruleReference= ruleReference EOF
            {
             currentNode = createCompositeNode(grammarAccess.getReferenceRule(), currentNode); 
            pushFollow(FOLLOW_ruleReference_in_entryRuleReference2698);
            iv_ruleReference=ruleReference();
            _fsp--;

             current =iv_ruleReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReference2708); 

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
    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1518:1: ruleReference returns [EObject current=null] : ( ( RULE_ID ) ) ;
    public final EObject ruleReference() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1523:6: ( ( ( RULE_ID ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1524:1: ( ( RULE_ID ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1524:1: ( ( RULE_ID ) )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1525:1: ( RULE_ID )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1525:1: ( RULE_ID )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1526:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getReferenceRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleReference2750); 

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
    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1548:1: entryRuleBExpression returns [EObject current=null] : iv_ruleBExpression= ruleBExpression EOF ;
    public final EObject entryRuleBExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBExpression = null;


        try {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1549:2: (iv_ruleBExpression= ruleBExpression EOF )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1550:2: iv_ruleBExpression= ruleBExpression EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBExpressionRule(), currentNode); 
            pushFollow(FOLLOW_ruleBExpression_in_entryRuleBExpression2787);
            iv_ruleBExpression=ruleBExpression();
            _fsp--;

             current =iv_ruleBExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBExpression2797); 

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
    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1557:1: ruleBExpression returns [EObject current=null] : this_BOrExpression_0= ruleBOrExpression ;
    public final EObject ruleBExpression() throws RecognitionException {
        EObject current = null;

        EObject this_BOrExpression_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1562:6: (this_BOrExpression_0= ruleBOrExpression )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1564:5: this_BOrExpression_0= ruleBOrExpression
            {
             
                    currentNode=createCompositeNode(grammarAccess.getBExpressionAccess().getBOrExpressionParserRuleCall(), currentNode); 
                
            pushFollow(FOLLOW_ruleBOrExpression_in_ruleBExpression2843);
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
    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1580:1: entryRuleBOrExpression returns [EObject current=null] : iv_ruleBOrExpression= ruleBOrExpression EOF ;
    public final EObject entryRuleBOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBOrExpression = null;


        try {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1581:2: (iv_ruleBOrExpression= ruleBOrExpression EOF )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1582:2: iv_ruleBOrExpression= ruleBOrExpression EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBOrExpressionRule(), currentNode); 
            pushFollow(FOLLOW_ruleBOrExpression_in_entryRuleBOrExpression2877);
            iv_ruleBOrExpression=ruleBOrExpression();
            _fsp--;

             current =iv_ruleBOrExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBOrExpression2887); 

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
    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1589:1: ruleBOrExpression returns [EObject current=null] : (this_BAndExpression_0= ruleBAndExpression ( () ( 'or' | '|' ) ( (lv_right_4_0= ruleBAndExpression ) ) )* ) ;
    public final EObject ruleBOrExpression() throws RecognitionException {
        EObject current = null;

        EObject this_BAndExpression_0 = null;

        EObject lv_right_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1594:6: ( (this_BAndExpression_0= ruleBAndExpression ( () ( 'or' | '|' ) ( (lv_right_4_0= ruleBAndExpression ) ) )* ) )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1595:1: (this_BAndExpression_0= ruleBAndExpression ( () ( 'or' | '|' ) ( (lv_right_4_0= ruleBAndExpression ) ) )* )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1595:1: (this_BAndExpression_0= ruleBAndExpression ( () ( 'or' | '|' ) ( (lv_right_4_0= ruleBAndExpression ) ) )* )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1596:5: this_BAndExpression_0= ruleBAndExpression ( () ( 'or' | '|' ) ( (lv_right_4_0= ruleBAndExpression ) ) )*
            {
             
                    currentNode=createCompositeNode(grammarAccess.getBOrExpressionAccess().getBAndExpressionParserRuleCall_0(), currentNode); 
                
            pushFollow(FOLLOW_ruleBAndExpression_in_ruleBOrExpression2934);
            this_BAndExpression_0=ruleBAndExpression();
            _fsp--;

             
                    current = this_BAndExpression_0; 
                    currentNode = currentNode.getParent();
                
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1604:1: ( () ( 'or' | '|' ) ( (lv_right_4_0= ruleBAndExpression ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=37 && LA22_0<=38)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1604:2: () ( 'or' | '|' ) ( (lv_right_4_0= ruleBAndExpression ) )
            	    {
            	    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1604:2: ()
            	    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1605:5: 
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

            	    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1620:2: ( 'or' | '|' )
            	    int alt21=2;
            	    int LA21_0 = input.LA(1);

            	    if ( (LA21_0==37) ) {
            	        alt21=1;
            	    }
            	    else if ( (LA21_0==38) ) {
            	        alt21=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("1620:2: ( 'or' | '|' )", 21, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt21) {
            	        case 1 :
            	            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1620:4: 'or'
            	            {
            	            match(input,37,FOLLOW_37_in_ruleBOrExpression2954); 

            	                    createLeafNode(grammarAccess.getBOrExpressionAccess().getOrKeyword_1_1_0(), null); 
            	                

            	            }
            	            break;
            	        case 2 :
            	            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1625:7: '|'
            	            {
            	            match(input,38,FOLLOW_38_in_ruleBOrExpression2970); 

            	                    createLeafNode(grammarAccess.getBOrExpressionAccess().getVerticalLineKeyword_1_1_1(), null); 
            	                

            	            }
            	            break;

            	    }

            	    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1629:2: ( (lv_right_4_0= ruleBAndExpression ) )
            	    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1630:1: (lv_right_4_0= ruleBAndExpression )
            	    {
            	    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1630:1: (lv_right_4_0= ruleBAndExpression )
            	    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1631:3: lv_right_4_0= ruleBAndExpression
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getBOrExpressionAccess().getRightBAndExpressionParserRuleCall_1_2_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleBAndExpression_in_ruleBOrExpression2992);
            	    lv_right_4_0=ruleBAndExpression();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getBOrExpressionRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		set(
            	    	       			current, 
            	    	       			"right",
            	    	        		lv_right_4_0, 
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
    // $ANTLR end ruleBOrExpression


    // $ANTLR start entryRuleBAndExpression
    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1661:1: entryRuleBAndExpression returns [EObject current=null] : iv_ruleBAndExpression= ruleBAndExpression EOF ;
    public final EObject entryRuleBAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBAndExpression = null;


        try {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1662:2: (iv_ruleBAndExpression= ruleBAndExpression EOF )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1663:2: iv_ruleBAndExpression= ruleBAndExpression EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBAndExpressionRule(), currentNode); 
            pushFollow(FOLLOW_ruleBAndExpression_in_entryRuleBAndExpression3030);
            iv_ruleBAndExpression=ruleBAndExpression();
            _fsp--;

             current =iv_ruleBAndExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBAndExpression3040); 

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
    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1670:1: ruleBAndExpression returns [EObject current=null] : (this_NegationExpression_0= ruleNegationExpression ( () ( 'and' | '&' ) ( (lv_right_4_0= ruleNegationExpression ) ) )* ) ;
    public final EObject ruleBAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NegationExpression_0 = null;

        EObject lv_right_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1675:6: ( (this_NegationExpression_0= ruleNegationExpression ( () ( 'and' | '&' ) ( (lv_right_4_0= ruleNegationExpression ) ) )* ) )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1676:1: (this_NegationExpression_0= ruleNegationExpression ( () ( 'and' | '&' ) ( (lv_right_4_0= ruleNegationExpression ) ) )* )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1676:1: (this_NegationExpression_0= ruleNegationExpression ( () ( 'and' | '&' ) ( (lv_right_4_0= ruleNegationExpression ) ) )* )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1677:5: this_NegationExpression_0= ruleNegationExpression ( () ( 'and' | '&' ) ( (lv_right_4_0= ruleNegationExpression ) ) )*
            {
             
                    currentNode=createCompositeNode(grammarAccess.getBAndExpressionAccess().getNegationExpressionParserRuleCall_0(), currentNode); 
                
            pushFollow(FOLLOW_ruleNegationExpression_in_ruleBAndExpression3087);
            this_NegationExpression_0=ruleNegationExpression();
            _fsp--;

             
                    current = this_NegationExpression_0; 
                    currentNode = currentNode.getParent();
                
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1685:1: ( () ( 'and' | '&' ) ( (lv_right_4_0= ruleNegationExpression ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=39 && LA24_0<=40)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1685:2: () ( 'and' | '&' ) ( (lv_right_4_0= ruleNegationExpression ) )
            	    {
            	    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1685:2: ()
            	    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1686:5: 
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

            	    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1701:2: ( 'and' | '&' )
            	    int alt23=2;
            	    int LA23_0 = input.LA(1);

            	    if ( (LA23_0==39) ) {
            	        alt23=1;
            	    }
            	    else if ( (LA23_0==40) ) {
            	        alt23=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("1701:2: ( 'and' | '&' )", 23, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt23) {
            	        case 1 :
            	            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1701:4: 'and'
            	            {
            	            match(input,39,FOLLOW_39_in_ruleBAndExpression3107); 

            	                    createLeafNode(grammarAccess.getBAndExpressionAccess().getAndKeyword_1_1_0(), null); 
            	                

            	            }
            	            break;
            	        case 2 :
            	            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1706:7: '&'
            	            {
            	            match(input,40,FOLLOW_40_in_ruleBAndExpression3123); 

            	                    createLeafNode(grammarAccess.getBAndExpressionAccess().getAmpersandKeyword_1_1_1(), null); 
            	                

            	            }
            	            break;

            	    }

            	    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1710:2: ( (lv_right_4_0= ruleNegationExpression ) )
            	    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1711:1: (lv_right_4_0= ruleNegationExpression )
            	    {
            	    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1711:1: (lv_right_4_0= ruleNegationExpression )
            	    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1712:3: lv_right_4_0= ruleNegationExpression
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getBAndExpressionAccess().getRightNegationExpressionParserRuleCall_1_2_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleNegationExpression_in_ruleBAndExpression3145);
            	    lv_right_4_0=ruleNegationExpression();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getBAndExpressionRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		set(
            	    	       			current, 
            	    	       			"right",
            	    	        		lv_right_4_0, 
            	    	        		"NegationExpression", 
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
            	    break loop24;
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


    // $ANTLR start entryRuleNegationExpression
    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1742:1: entryRuleNegationExpression returns [EObject current=null] : iv_ruleNegationExpression= ruleNegationExpression EOF ;
    public final EObject entryRuleNegationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNegationExpression = null;


        try {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1743:2: (iv_ruleNegationExpression= ruleNegationExpression EOF )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1744:2: iv_ruleNegationExpression= ruleNegationExpression EOF
            {
             currentNode = createCompositeNode(grammarAccess.getNegationExpressionRule(), currentNode); 
            pushFollow(FOLLOW_ruleNegationExpression_in_entryRuleNegationExpression3183);
            iv_ruleNegationExpression=ruleNegationExpression();
            _fsp--;

             current =iv_ruleNegationExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNegationExpression3193); 

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
    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1751:1: ruleNegationExpression returns [EObject current=null] : (this_TerminalBExpression_0= ruleTerminalBExpression | ( () ( 'not' | '!' ) ( (lv_expr_4_0= ruleNegationExpression ) ) ) ) ;
    public final EObject ruleNegationExpression() throws RecognitionException {
        EObject current = null;

        EObject this_TerminalBExpression_0 = null;

        EObject lv_expr_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1756:6: ( (this_TerminalBExpression_0= ruleTerminalBExpression | ( () ( 'not' | '!' ) ( (lv_expr_4_0= ruleNegationExpression ) ) ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1757:1: (this_TerminalBExpression_0= ruleTerminalBExpression | ( () ( 'not' | '!' ) ( (lv_expr_4_0= ruleNegationExpression ) ) ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1757:1: (this_TerminalBExpression_0= ruleTerminalBExpression | ( () ( 'not' | '!' ) ( (lv_expr_4_0= ruleNegationExpression ) ) ) )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_ID||LA26_0==18) ) {
                alt26=1;
            }
            else if ( ((LA26_0>=41 && LA26_0<=42)) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1757:1: (this_TerminalBExpression_0= ruleTerminalBExpression | ( () ( 'not' | '!' ) ( (lv_expr_4_0= ruleNegationExpression ) ) ) )", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1758:5: this_TerminalBExpression_0= ruleTerminalBExpression
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getNegationExpressionAccess().getTerminalBExpressionParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleTerminalBExpression_in_ruleNegationExpression3240);
                    this_TerminalBExpression_0=ruleTerminalBExpression();
                    _fsp--;

                     
                            current = this_TerminalBExpression_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1767:6: ( () ( 'not' | '!' ) ( (lv_expr_4_0= ruleNegationExpression ) ) )
                    {
                    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1767:6: ( () ( 'not' | '!' ) ( (lv_expr_4_0= ruleNegationExpression ) ) )
                    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1767:7: () ( 'not' | '!' ) ( (lv_expr_4_0= ruleNegationExpression ) )
                    {
                    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1767:7: ()
                    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1768:5: 
                    {
                     
                            temp=factory.create(grammarAccess.getNegationExpressionAccess().getNegationExpressionAction_1_0().getType().getClassifier());
                            current = temp; 
                            temp = null;
                            CompositeNode newNode = createCompositeNode(grammarAccess.getNegationExpressionAccess().getNegationExpressionAction_1_0(), currentNode.getParent());
                        newNode.getChildren().add(currentNode);
                        moveLookaheadInfo(currentNode, newNode);
                        currentNode = newNode; 
                            associateNodeWithAstElement(currentNode, current); 
                        

                    }

                    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1778:2: ( 'not' | '!' )
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==41) ) {
                        alt25=1;
                    }
                    else if ( (LA25_0==42) ) {
                        alt25=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("1778:2: ( 'not' | '!' )", 25, 0, input);

                        throw nvae;
                    }
                    switch (alt25) {
                        case 1 :
                            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1778:4: 'not'
                            {
                            match(input,41,FOLLOW_41_in_ruleNegationExpression3266); 

                                    createLeafNode(grammarAccess.getNegationExpressionAccess().getNotKeyword_1_1_0(), null); 
                                

                            }
                            break;
                        case 2 :
                            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1783:7: '!'
                            {
                            match(input,42,FOLLOW_42_in_ruleNegationExpression3282); 

                                    createLeafNode(grammarAccess.getNegationExpressionAccess().getExclamationMarkKeyword_1_1_1(), null); 
                                

                            }
                            break;

                    }

                    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1787:2: ( (lv_expr_4_0= ruleNegationExpression ) )
                    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1788:1: (lv_expr_4_0= ruleNegationExpression )
                    {
                    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1788:1: (lv_expr_4_0= ruleNegationExpression )
                    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1789:3: lv_expr_4_0= ruleNegationExpression
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getNegationExpressionAccess().getExprNegationExpressionParserRuleCall_1_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleNegationExpression_in_ruleNegationExpression3304);
                    lv_expr_4_0=ruleNegationExpression();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getNegationExpressionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"expr",
                    	        		lv_expr_4_0, 
                    	        		"NegationExpression", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


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
    // $ANTLR end ruleNegationExpression


    // $ANTLR start entryRuleTerminalBExpression
    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1819:1: entryRuleTerminalBExpression returns [EObject current=null] : iv_ruleTerminalBExpression= ruleTerminalBExpression EOF ;
    public final EObject entryRuleTerminalBExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerminalBExpression = null;


        try {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1820:2: (iv_ruleTerminalBExpression= ruleTerminalBExpression EOF )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1821:2: iv_ruleTerminalBExpression= ruleTerminalBExpression EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTerminalBExpressionRule(), currentNode); 
            pushFollow(FOLLOW_ruleTerminalBExpression_in_entryRuleTerminalBExpression3341);
            iv_ruleTerminalBExpression=ruleTerminalBExpression();
            _fsp--;

             current =iv_ruleTerminalBExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTerminalBExpression3351); 

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
    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1828:1: ruleTerminalBExpression returns [EObject current=null] : (this_AtomicReferringBExpression_0= ruleAtomicReferringBExpression | ( '(' this_BExpression_2= ruleBExpression ')' ) ) ;
    public final EObject ruleTerminalBExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AtomicReferringBExpression_0 = null;

        EObject this_BExpression_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1833:6: ( (this_AtomicReferringBExpression_0= ruleAtomicReferringBExpression | ( '(' this_BExpression_2= ruleBExpression ')' ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1834:1: (this_AtomicReferringBExpression_0= ruleAtomicReferringBExpression | ( '(' this_BExpression_2= ruleBExpression ')' ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1834:1: (this_AtomicReferringBExpression_0= ruleAtomicReferringBExpression | ( '(' this_BExpression_2= ruleBExpression ')' ) )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_ID) ) {
                alt27=1;
            }
            else if ( (LA27_0==18) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1834:1: (this_AtomicReferringBExpression_0= ruleAtomicReferringBExpression | ( '(' this_BExpression_2= ruleBExpression ')' ) )", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1835:5: this_AtomicReferringBExpression_0= ruleAtomicReferringBExpression
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTerminalBExpressionAccess().getAtomicReferringBExpressionParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleAtomicReferringBExpression_in_ruleTerminalBExpression3398);
                    this_AtomicReferringBExpression_0=ruleAtomicReferringBExpression();
                    _fsp--;

                     
                            current = this_AtomicReferringBExpression_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1844:6: ( '(' this_BExpression_2= ruleBExpression ')' )
                    {
                    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1844:6: ( '(' this_BExpression_2= ruleBExpression ')' )
                    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1844:8: '(' this_BExpression_2= ruleBExpression ')'
                    {
                    match(input,18,FOLLOW_18_in_ruleTerminalBExpression3414); 

                            createLeafNode(grammarAccess.getTerminalBExpressionAccess().getLeftParenthesisKeyword_1_0(), null); 
                        
                     
                            currentNode=createCompositeNode(grammarAccess.getTerminalBExpressionAccess().getBExpressionParserRuleCall_1_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleBExpression_in_ruleTerminalBExpression3436);
                    this_BExpression_2=ruleBExpression();
                    _fsp--;

                     
                            current = this_BExpression_2; 
                            currentNode = currentNode.getParent();
                        
                    match(input,19,FOLLOW_19_in_ruleTerminalBExpression3445); 

                            createLeafNode(grammarAccess.getTerminalBExpressionAccess().getRightParenthesisKeyword_1_2(), null); 
                        

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


    // $ANTLR start entryRuleAtomicReferringBExpression
    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1869:1: entryRuleAtomicReferringBExpression returns [EObject current=null] : iv_ruleAtomicReferringBExpression= ruleAtomicReferringBExpression EOF ;
    public final EObject entryRuleAtomicReferringBExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicReferringBExpression = null;


        try {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1870:2: (iv_ruleAtomicReferringBExpression= ruleAtomicReferringBExpression EOF )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1871:2: iv_ruleAtomicReferringBExpression= ruleAtomicReferringBExpression EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAtomicReferringBExpressionRule(), currentNode); 
            pushFollow(FOLLOW_ruleAtomicReferringBExpression_in_entryRuleAtomicReferringBExpression3482);
            iv_ruleAtomicReferringBExpression=ruleAtomicReferringBExpression();
            _fsp--;

             current =iv_ruleAtomicReferringBExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtomicReferringBExpression3492); 

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
    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1878:1: ruleAtomicReferringBExpression returns [EObject current=null] : (this_BComparison_0= ruleBComparison | this_EnumComparison_1= ruleEnumComparison | this_StringValueComparison_2= ruleStringValueComparison | this_PresenceCheck_3= rulePresenceCheck ) ;
    public final EObject ruleAtomicReferringBExpression() throws RecognitionException {
        EObject current = null;

        EObject this_BComparison_0 = null;

        EObject this_EnumComparison_1 = null;

        EObject this_StringValueComparison_2 = null;

        EObject this_PresenceCheck_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1883:6: ( (this_BComparison_0= ruleBComparison | this_EnumComparison_1= ruleEnumComparison | this_StringValueComparison_2= ruleStringValueComparison | this_PresenceCheck_3= rulePresenceCheck ) )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1884:1: (this_BComparison_0= ruleBComparison | this_EnumComparison_1= ruleEnumComparison | this_StringValueComparison_2= ruleStringValueComparison | this_PresenceCheck_3= rulePresenceCheck )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1884:1: (this_BComparison_0= ruleBComparison | this_EnumComparison_1= ruleEnumComparison | this_StringValueComparison_2= ruleStringValueComparison | this_PresenceCheck_3= rulePresenceCheck )
            int alt28=4;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case 13:
                case 53:
                case 54:
                    {
                    alt28=2;
                    }
                    break;
                case 45:
                    {
                    alt28=4;
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
                case 39:
                case 40:
                case 43:
                case 46:
                case 47:
                case 48:
                case 49:
                case 50:
                    {
                    alt28=1;
                    }
                    break;
                case 44:
                    {
                    alt28=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("1884:1: (this_BComparison_0= ruleBComparison | this_EnumComparison_1= ruleEnumComparison | this_StringValueComparison_2= ruleStringValueComparison | this_PresenceCheck_3= rulePresenceCheck )", 28, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1884:1: (this_BComparison_0= ruleBComparison | this_EnumComparison_1= ruleEnumComparison | this_StringValueComparison_2= ruleStringValueComparison | this_PresenceCheck_3= rulePresenceCheck )", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1885:5: this_BComparison_0= ruleBComparison
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getAtomicReferringBExpressionAccess().getBComparisonParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleBComparison_in_ruleAtomicReferringBExpression3539);
                    this_BComparison_0=ruleBComparison();
                    _fsp--;

                     
                            current = this_BComparison_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1895:5: this_EnumComparison_1= ruleEnumComparison
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getAtomicReferringBExpressionAccess().getEnumComparisonParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleEnumComparison_in_ruleAtomicReferringBExpression3566);
                    this_EnumComparison_1=ruleEnumComparison();
                    _fsp--;

                     
                            current = this_EnumComparison_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1905:5: this_StringValueComparison_2= ruleStringValueComparison
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getAtomicReferringBExpressionAccess().getStringValueComparisonParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleStringValueComparison_in_ruleAtomicReferringBExpression3593);
                    this_StringValueComparison_2=ruleStringValueComparison();
                    _fsp--;

                     
                            current = this_StringValueComparison_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 4 :
                    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1915:5: this_PresenceCheck_3= rulePresenceCheck
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getAtomicReferringBExpressionAccess().getPresenceCheckParserRuleCall_3(), currentNode); 
                        
                    pushFollow(FOLLOW_rulePresenceCheck_in_ruleAtomicReferringBExpression3620);
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
    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1931:1: entryRuleBComparison returns [EObject current=null] : iv_ruleBComparison= ruleBComparison EOF ;
    public final EObject entryRuleBComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBComparison = null;


        try {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1932:2: (iv_ruleBComparison= ruleBComparison EOF )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1933:2: iv_ruleBComparison= ruleBComparison EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBComparisonRule(), currentNode); 
            pushFollow(FOLLOW_ruleBComparison_in_entryRuleBComparison3655);
            iv_ruleBComparison=ruleBComparison();
            _fsp--;

             current =iv_ruleBComparison; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBComparison3665); 

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
    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1940:1: ruleBComparison returns [EObject current=null] : ( () ( (lv_ref_1_0= ruleReference ) ) ( 'is' ( (lv_bLiteral_3_0= ruleBLiteral ) ) )? ) ;
    public final EObject ruleBComparison() throws RecognitionException {
        EObject current = null;

        EObject lv_ref_1_0 = null;

        Enumerator lv_bLiteral_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1945:6: ( ( () ( (lv_ref_1_0= ruleReference ) ) ( 'is' ( (lv_bLiteral_3_0= ruleBLiteral ) ) )? ) )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1946:1: ( () ( (lv_ref_1_0= ruleReference ) ) ( 'is' ( (lv_bLiteral_3_0= ruleBLiteral ) ) )? )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1946:1: ( () ( (lv_ref_1_0= ruleReference ) ) ( 'is' ( (lv_bLiteral_3_0= ruleBLiteral ) ) )? )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1946:2: () ( (lv_ref_1_0= ruleReference ) ) ( 'is' ( (lv_bLiteral_3_0= ruleBLiteral ) ) )?
            {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1946:2: ()
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1947:5: 
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

            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1957:2: ( (lv_ref_1_0= ruleReference ) )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1958:1: (lv_ref_1_0= ruleReference )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1958:1: (lv_ref_1_0= ruleReference )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1959:3: lv_ref_1_0= ruleReference
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getBComparisonAccess().getRefReferenceParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleReference_in_ruleBComparison3720);
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

            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1981:2: ( 'is' ( (lv_bLiteral_3_0= ruleBLiteral ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==43) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1981:4: 'is' ( (lv_bLiteral_3_0= ruleBLiteral ) )
                    {
                    match(input,43,FOLLOW_43_in_ruleBComparison3731); 

                            createLeafNode(grammarAccess.getBComparisonAccess().getIsKeyword_2_0(), null); 
                        
                    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1985:1: ( (lv_bLiteral_3_0= ruleBLiteral ) )
                    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1986:1: (lv_bLiteral_3_0= ruleBLiteral )
                    {
                    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1986:1: (lv_bLiteral_3_0= ruleBLiteral )
                    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:1987:3: lv_bLiteral_3_0= ruleBLiteral
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getBComparisonAccess().getBLiteralBLiteralEnumRuleCall_2_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleBLiteral_in_ruleBComparison3752);
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
    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2017:1: entryRuleEnumComparison returns [EObject current=null] : iv_ruleEnumComparison= ruleEnumComparison EOF ;
    public final EObject entryRuleEnumComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumComparison = null;


        try {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2018:2: (iv_ruleEnumComparison= ruleEnumComparison EOF )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2019:2: iv_ruleEnumComparison= ruleEnumComparison EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEnumComparisonRule(), currentNode); 
            pushFollow(FOLLOW_ruleEnumComparison_in_entryRuleEnumComparison3790);
            iv_ruleEnumComparison=ruleEnumComparison();
            _fsp--;

             current =iv_ruleEnumComparison; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumComparison3800); 

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
    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2026:1: ruleEnumComparison returns [EObject current=null] : (this_SingleEnumComparison_0= ruleSingleEnumComparison | this_MultiEnumComparison_1= ruleMultiEnumComparison ) ;
    public final EObject ruleEnumComparison() throws RecognitionException {
        EObject current = null;

        EObject this_SingleEnumComparison_0 = null;

        EObject this_MultiEnumComparison_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2031:6: ( (this_SingleEnumComparison_0= ruleSingleEnumComparison | this_MultiEnumComparison_1= ruleMultiEnumComparison ) )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2032:1: (this_SingleEnumComparison_0= ruleSingleEnumComparison | this_MultiEnumComparison_1= ruleMultiEnumComparison )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2032:1: (this_SingleEnumComparison_0= ruleSingleEnumComparison | this_MultiEnumComparison_1= ruleMultiEnumComparison )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_ID) ) {
                int LA30_1 = input.LA(2);

                if ( ((LA30_1>=53 && LA30_1<=54)) ) {
                    alt30=2;
                }
                else if ( (LA30_1==13) ) {
                    alt30=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("2032:1: (this_SingleEnumComparison_0= ruleSingleEnumComparison | this_MultiEnumComparison_1= ruleMultiEnumComparison )", 30, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("2032:1: (this_SingleEnumComparison_0= ruleSingleEnumComparison | this_MultiEnumComparison_1= ruleMultiEnumComparison )", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2033:5: this_SingleEnumComparison_0= ruleSingleEnumComparison
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getEnumComparisonAccess().getSingleEnumComparisonParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleSingleEnumComparison_in_ruleEnumComparison3847);
                    this_SingleEnumComparison_0=ruleSingleEnumComparison();
                    _fsp--;

                     
                            current = this_SingleEnumComparison_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2043:5: this_MultiEnumComparison_1= ruleMultiEnumComparison
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getEnumComparisonAccess().getMultiEnumComparisonParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleMultiEnumComparison_in_ruleEnumComparison3874);
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
    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2059:1: entryRuleSingleEnumComparison returns [EObject current=null] : iv_ruleSingleEnumComparison= ruleSingleEnumComparison EOF ;
    public final EObject entryRuleSingleEnumComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleEnumComparison = null;


        try {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2060:2: (iv_ruleSingleEnumComparison= ruleSingleEnumComparison EOF )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2061:2: iv_ruleSingleEnumComparison= ruleSingleEnumComparison EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSingleEnumComparisonRule(), currentNode); 
            pushFollow(FOLLOW_ruleSingleEnumComparison_in_entryRuleSingleEnumComparison3909);
            iv_ruleSingleEnumComparison=ruleSingleEnumComparison();
            _fsp--;

             current =iv_ruleSingleEnumComparison; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSingleEnumComparison3919); 

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
    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2068:1: ruleSingleEnumComparison returns [EObject current=null] : ( ( (lv_ref_0_0= ruleReference ) ) '=' ( ( RULE_ID ) ) ) ;
    public final EObject ruleSingleEnumComparison() throws RecognitionException {
        EObject current = null;

        EObject lv_ref_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2073:6: ( ( ( (lv_ref_0_0= ruleReference ) ) '=' ( ( RULE_ID ) ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2074:1: ( ( (lv_ref_0_0= ruleReference ) ) '=' ( ( RULE_ID ) ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2074:1: ( ( (lv_ref_0_0= ruleReference ) ) '=' ( ( RULE_ID ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2074:2: ( (lv_ref_0_0= ruleReference ) ) '=' ( ( RULE_ID ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2074:2: ( (lv_ref_0_0= ruleReference ) )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2075:1: (lv_ref_0_0= ruleReference )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2075:1: (lv_ref_0_0= ruleReference )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2076:3: lv_ref_0_0= ruleReference
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getSingleEnumComparisonAccess().getRefReferenceParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleReference_in_ruleSingleEnumComparison3965);
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

            match(input,13,FOLLOW_13_in_ruleSingleEnumComparison3975); 

                    createLeafNode(grammarAccess.getSingleEnumComparisonAccess().getEqualsSignKeyword_1(), null); 
                
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2102:1: ( ( RULE_ID ) )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2103:1: ( RULE_ID )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2103:1: ( RULE_ID )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2104:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getSingleEnumComparisonRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSingleEnumComparison3993); 

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
    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2124:1: entryRuleMultiEnumComparison returns [EObject current=null] : iv_ruleMultiEnumComparison= ruleMultiEnumComparison EOF ;
    public final EObject entryRuleMultiEnumComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiEnumComparison = null;


        try {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2125:2: (iv_ruleMultiEnumComparison= ruleMultiEnumComparison EOF )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2126:2: iv_ruleMultiEnumComparison= ruleMultiEnumComparison EOF
            {
             currentNode = createCompositeNode(grammarAccess.getMultiEnumComparisonRule(), currentNode); 
            pushFollow(FOLLOW_ruleMultiEnumComparison_in_entryRuleMultiEnumComparison4029);
            iv_ruleMultiEnumComparison=ruleMultiEnumComparison();
            _fsp--;

             current =iv_ruleMultiEnumComparison; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiEnumComparison4039); 

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
    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2133:1: ruleMultiEnumComparison returns [EObject current=null] : ( ( (lv_ref_0_0= ruleReference ) ) ( (lv_membership_1_0= ruleEnumMembership ) ) ( (lv_eLiterals_2_0= ruleEnumLiteralsCollection ) ) ) ;
    public final EObject ruleMultiEnumComparison() throws RecognitionException {
        EObject current = null;

        EObject lv_ref_0_0 = null;

        Enumerator lv_membership_1_0 = null;

        EObject lv_eLiterals_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2138:6: ( ( ( (lv_ref_0_0= ruleReference ) ) ( (lv_membership_1_0= ruleEnumMembership ) ) ( (lv_eLiterals_2_0= ruleEnumLiteralsCollection ) ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2139:1: ( ( (lv_ref_0_0= ruleReference ) ) ( (lv_membership_1_0= ruleEnumMembership ) ) ( (lv_eLiterals_2_0= ruleEnumLiteralsCollection ) ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2139:1: ( ( (lv_ref_0_0= ruleReference ) ) ( (lv_membership_1_0= ruleEnumMembership ) ) ( (lv_eLiterals_2_0= ruleEnumLiteralsCollection ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2139:2: ( (lv_ref_0_0= ruleReference ) ) ( (lv_membership_1_0= ruleEnumMembership ) ) ( (lv_eLiterals_2_0= ruleEnumLiteralsCollection ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2139:2: ( (lv_ref_0_0= ruleReference ) )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2140:1: (lv_ref_0_0= ruleReference )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2140:1: (lv_ref_0_0= ruleReference )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2141:3: lv_ref_0_0= ruleReference
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getMultiEnumComparisonAccess().getRefReferenceParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleReference_in_ruleMultiEnumComparison4085);
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

            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2163:2: ( (lv_membership_1_0= ruleEnumMembership ) )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2164:1: (lv_membership_1_0= ruleEnumMembership )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2164:1: (lv_membership_1_0= ruleEnumMembership )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2165:3: lv_membership_1_0= ruleEnumMembership
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getMultiEnumComparisonAccess().getMembershipEnumMembershipEnumRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleEnumMembership_in_ruleMultiEnumComparison4106);
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

            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2187:2: ( (lv_eLiterals_2_0= ruleEnumLiteralsCollection ) )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2188:1: (lv_eLiterals_2_0= ruleEnumLiteralsCollection )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2188:1: (lv_eLiterals_2_0= ruleEnumLiteralsCollection )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2189:3: lv_eLiterals_2_0= ruleEnumLiteralsCollection
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getMultiEnumComparisonAccess().getELiteralsEnumLiteralsCollectionParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleEnumLiteralsCollection_in_ruleMultiEnumComparison4127);
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
    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2219:1: entryRuleStringValueComparison returns [EObject current=null] : iv_ruleStringValueComparison= ruleStringValueComparison EOF ;
    public final EObject entryRuleStringValueComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValueComparison = null;


        try {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2220:2: (iv_ruleStringValueComparison= ruleStringValueComparison EOF )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2221:2: iv_ruleStringValueComparison= ruleStringValueComparison EOF
            {
             currentNode = createCompositeNode(grammarAccess.getStringValueComparisonRule(), currentNode); 
            pushFollow(FOLLOW_ruleStringValueComparison_in_entryRuleStringValueComparison4163);
            iv_ruleStringValueComparison=ruleStringValueComparison();
            _fsp--;

             current =iv_ruleStringValueComparison; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringValueComparison4173); 

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
    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2228:1: ruleStringValueComparison returns [EObject current=null] : ( ( (lv_ref_0_0= ruleReference ) ) 'equals' ( (lv_targetValue_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleStringValueComparison() throws RecognitionException {
        EObject current = null;

        Token lv_targetValue_2_0=null;
        EObject lv_ref_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2233:6: ( ( ( (lv_ref_0_0= ruleReference ) ) 'equals' ( (lv_targetValue_2_0= RULE_STRING ) ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2234:1: ( ( (lv_ref_0_0= ruleReference ) ) 'equals' ( (lv_targetValue_2_0= RULE_STRING ) ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2234:1: ( ( (lv_ref_0_0= ruleReference ) ) 'equals' ( (lv_targetValue_2_0= RULE_STRING ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2234:2: ( (lv_ref_0_0= ruleReference ) ) 'equals' ( (lv_targetValue_2_0= RULE_STRING ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2234:2: ( (lv_ref_0_0= ruleReference ) )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2235:1: (lv_ref_0_0= ruleReference )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2235:1: (lv_ref_0_0= ruleReference )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2236:3: lv_ref_0_0= ruleReference
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getStringValueComparisonAccess().getRefReferenceParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleReference_in_ruleStringValueComparison4219);
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

            match(input,44,FOLLOW_44_in_ruleStringValueComparison4229); 

                    createLeafNode(grammarAccess.getStringValueComparisonAccess().getEqualsKeyword_1(), null); 
                
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2262:1: ( (lv_targetValue_2_0= RULE_STRING ) )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2263:1: (lv_targetValue_2_0= RULE_STRING )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2263:1: (lv_targetValue_2_0= RULE_STRING )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2264:3: lv_targetValue_2_0= RULE_STRING
            {
            lv_targetValue_2_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringValueComparison4246); 

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
    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2294:1: entryRulePresenceCheck returns [EObject current=null] : iv_rulePresenceCheck= rulePresenceCheck EOF ;
    public final EObject entryRulePresenceCheck() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePresenceCheck = null;


        try {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2295:2: (iv_rulePresenceCheck= rulePresenceCheck EOF )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2296:2: iv_rulePresenceCheck= rulePresenceCheck EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPresenceCheckRule(), currentNode); 
            pushFollow(FOLLOW_rulePresenceCheck_in_entryRulePresenceCheck4287);
            iv_rulePresenceCheck=rulePresenceCheck();
            _fsp--;

             current =iv_rulePresenceCheck; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePresenceCheck4297); 

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
    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2303:1: rulePresenceCheck returns [EObject current=null] : ( ( (lv_ref_0_0= ruleReference ) ) 'is-present' ) ;
    public final EObject rulePresenceCheck() throws RecognitionException {
        EObject current = null;

        EObject lv_ref_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2308:6: ( ( ( (lv_ref_0_0= ruleReference ) ) 'is-present' ) )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2309:1: ( ( (lv_ref_0_0= ruleReference ) ) 'is-present' )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2309:1: ( ( (lv_ref_0_0= ruleReference ) ) 'is-present' )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2309:2: ( (lv_ref_0_0= ruleReference ) ) 'is-present'
            {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2309:2: ( (lv_ref_0_0= ruleReference ) )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2310:1: (lv_ref_0_0= ruleReference )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2310:1: (lv_ref_0_0= ruleReference )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2311:3: lv_ref_0_0= ruleReference
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getPresenceCheckAccess().getRefReferenceParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleReference_in_rulePresenceCheck4343);
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

            match(input,45,FOLLOW_45_in_rulePresenceCheck4353); 

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
    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2345:1: entryRuleEnumLiteralsCollection returns [EObject current=null] : iv_ruleEnumLiteralsCollection= ruleEnumLiteralsCollection EOF ;
    public final EObject entryRuleEnumLiteralsCollection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumLiteralsCollection = null;


        try {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2346:2: (iv_ruleEnumLiteralsCollection= ruleEnumLiteralsCollection EOF )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2347:2: iv_ruleEnumLiteralsCollection= ruleEnumLiteralsCollection EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEnumLiteralsCollectionRule(), currentNode); 
            pushFollow(FOLLOW_ruleEnumLiteralsCollection_in_entryRuleEnumLiteralsCollection4389);
            iv_ruleEnumLiteralsCollection=ruleEnumLiteralsCollection();
            _fsp--;

             current =iv_ruleEnumLiteralsCollection; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumLiteralsCollection4399); 

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
    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2354:1: ruleEnumLiteralsCollection returns [EObject current=null] : (this_DirectEnumLiteralsCollection_0= ruleDirectEnumLiteralsCollection | this_EnumListReference_1= ruleEnumListReference ) ;
    public final EObject ruleEnumLiteralsCollection() throws RecognitionException {
        EObject current = null;

        EObject this_DirectEnumLiteralsCollection_0 = null;

        EObject this_EnumListReference_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2359:6: ( (this_DirectEnumLiteralsCollection_0= ruleDirectEnumLiteralsCollection | this_EnumListReference_1= ruleEnumListReference ) )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2360:1: (this_DirectEnumLiteralsCollection_0= ruleDirectEnumLiteralsCollection | this_EnumListReference_1= ruleEnumListReference )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2360:1: (this_DirectEnumLiteralsCollection_0= ruleDirectEnumLiteralsCollection | this_EnumListReference_1= ruleEnumListReference )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==18) ) {
                alt31=1;
            }
            else if ( (LA31_0==RULE_ID) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("2360:1: (this_DirectEnumLiteralsCollection_0= ruleDirectEnumLiteralsCollection | this_EnumListReference_1= ruleEnumListReference )", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2361:5: this_DirectEnumLiteralsCollection_0= ruleDirectEnumLiteralsCollection
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getEnumLiteralsCollectionAccess().getDirectEnumLiteralsCollectionParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleDirectEnumLiteralsCollection_in_ruleEnumLiteralsCollection4446);
                    this_DirectEnumLiteralsCollection_0=ruleDirectEnumLiteralsCollection();
                    _fsp--;

                     
                            current = this_DirectEnumLiteralsCollection_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2371:5: this_EnumListReference_1= ruleEnumListReference
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getEnumLiteralsCollectionAccess().getEnumListReferenceParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleEnumListReference_in_ruleEnumLiteralsCollection4473);
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
    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2387:1: entryRuleDirectEnumLiteralsCollection returns [EObject current=null] : iv_ruleDirectEnumLiteralsCollection= ruleDirectEnumLiteralsCollection EOF ;
    public final EObject entryRuleDirectEnumLiteralsCollection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDirectEnumLiteralsCollection = null;


        try {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2388:2: (iv_ruleDirectEnumLiteralsCollection= ruleDirectEnumLiteralsCollection EOF )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2389:2: iv_ruleDirectEnumLiteralsCollection= ruleDirectEnumLiteralsCollection EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDirectEnumLiteralsCollectionRule(), currentNode); 
            pushFollow(FOLLOW_ruleDirectEnumLiteralsCollection_in_entryRuleDirectEnumLiteralsCollection4508);
            iv_ruleDirectEnumLiteralsCollection=ruleDirectEnumLiteralsCollection();
            _fsp--;

             current =iv_ruleDirectEnumLiteralsCollection; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDirectEnumLiteralsCollection4518); 

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
    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2396:1: ruleDirectEnumLiteralsCollection returns [EObject current=null] : ( () '(' ( ( RULE_ID ) )* ')' ) ;
    public final EObject ruleDirectEnumLiteralsCollection() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2401:6: ( ( () '(' ( ( RULE_ID ) )* ')' ) )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2402:1: ( () '(' ( ( RULE_ID ) )* ')' )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2402:1: ( () '(' ( ( RULE_ID ) )* ')' )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2402:2: () '(' ( ( RULE_ID ) )* ')'
            {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2402:2: ()
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2403:5: 
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

            match(input,18,FOLLOW_18_in_ruleDirectEnumLiteralsCollection4562); 

                    createLeafNode(grammarAccess.getDirectEnumLiteralsCollectionAccess().getLeftParenthesisKeyword_1(), null); 
                
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2417:1: ( ( RULE_ID ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==RULE_ID) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2418:1: ( RULE_ID )
            	    {
            	    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2418:1: ( RULE_ID )
            	    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2419:3: RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = factory.create(grammarAccess.getDirectEnumLiteralsCollectionRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode, current);
            	    	        }
            	            
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDirectEnumLiteralsCollection4580); 

            	    		createLeafNode(grammarAccess.getDirectEnumLiteralsCollectionAccess().getLiteralsEnumLiteralCrossReference_2_0(), "literals"); 
            	    	

            	    }


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            match(input,19,FOLLOW_19_in_ruleDirectEnumLiteralsCollection4591); 

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
    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2443:1: entryRuleEnumListReference returns [EObject current=null] : iv_ruleEnumListReference= ruleEnumListReference EOF ;
    public final EObject entryRuleEnumListReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumListReference = null;


        try {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2444:2: (iv_ruleEnumListReference= ruleEnumListReference EOF )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2445:2: iv_ruleEnumListReference= ruleEnumListReference EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEnumListReferenceRule(), currentNode); 
            pushFollow(FOLLOW_ruleEnumListReference_in_entryRuleEnumListReference4627);
            iv_ruleEnumListReference=ruleEnumListReference();
            _fsp--;

             current =iv_ruleEnumListReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumListReference4637); 

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
    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2452:1: ruleEnumListReference returns [EObject current=null] : ( ( RULE_ID ) ) ;
    public final EObject ruleEnumListReference() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2457:6: ( ( ( RULE_ID ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2458:1: ( ( RULE_ID ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2458:1: ( ( RULE_ID ) )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2459:1: ( RULE_ID )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2459:1: ( RULE_ID )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2460:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getEnumListReferenceRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumListReference4679); 

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
    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2480:1: ruleAttributeClass returns [Enumerator current=null] : ( ( 'display' ) | ( 'required' ) | ( 'readonly' ) | ( 'calculated' ) | ( 'doubleAsterisk' ) ) ;
    public final Enumerator ruleAttributeClass() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2484:6: ( ( ( 'display' ) | ( 'required' ) | ( 'readonly' ) | ( 'calculated' ) | ( 'doubleAsterisk' ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2485:1: ( ( 'display' ) | ( 'required' ) | ( 'readonly' ) | ( 'calculated' ) | ( 'doubleAsterisk' ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2485:1: ( ( 'display' ) | ( 'required' ) | ( 'readonly' ) | ( 'calculated' ) | ( 'doubleAsterisk' ) )
            int alt33=5;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt33=1;
                }
                break;
            case 47:
                {
                alt33=2;
                }
                break;
            case 48:
                {
                alt33=3;
                }
                break;
            case 49:
                {
                alt33=4;
                }
                break;
            case 50:
                {
                alt33=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("2485:1: ( ( 'display' ) | ( 'required' ) | ( 'readonly' ) | ( 'calculated' ) | ( 'doubleAsterisk' ) )", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2485:2: ( 'display' )
                    {
                    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2485:2: ( 'display' )
                    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2485:4: 'display'
                    {
                    match(input,46,FOLLOW_46_in_ruleAttributeClass4726); 

                            current = grammarAccess.getAttributeClassAccess().getDisplayEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getAttributeClassAccess().getDisplayEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2491:6: ( 'required' )
                    {
                    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2491:6: ( 'required' )
                    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2491:8: 'required'
                    {
                    match(input,47,FOLLOW_47_in_ruleAttributeClass4741); 

                            current = grammarAccess.getAttributeClassAccess().getRequiredEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getAttributeClassAccess().getRequiredEnumLiteralDeclaration_1(), null); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2497:6: ( 'readonly' )
                    {
                    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2497:6: ( 'readonly' )
                    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2497:8: 'readonly'
                    {
                    match(input,48,FOLLOW_48_in_ruleAttributeClass4756); 

                            current = grammarAccess.getAttributeClassAccess().getReadonlyEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getAttributeClassAccess().getReadonlyEnumLiteralDeclaration_2(), null); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2503:6: ( 'calculated' )
                    {
                    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2503:6: ( 'calculated' )
                    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2503:8: 'calculated'
                    {
                    match(input,49,FOLLOW_49_in_ruleAttributeClass4771); 

                            current = grammarAccess.getAttributeClassAccess().getCalculatedEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getAttributeClassAccess().getCalculatedEnumLiteralDeclaration_3(), null); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2509:6: ( 'doubleAsterisk' )
                    {
                    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2509:6: ( 'doubleAsterisk' )
                    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2509:8: 'doubleAsterisk'
                    {
                    match(input,50,FOLLOW_50_in_ruleAttributeClass4786); 

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
    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2519:1: ruleBLiteral returns [Enumerator current=null] : ( ( 'true' ) | ( 'false' ) ) ;
    public final Enumerator ruleBLiteral() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2523:6: ( ( ( 'true' ) | ( 'false' ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2524:1: ( ( 'true' ) | ( 'false' ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2524:1: ( ( 'true' ) | ( 'false' ) )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==51) ) {
                alt34=1;
            }
            else if ( (LA34_0==52) ) {
                alt34=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("2524:1: ( ( 'true' ) | ( 'false' ) )", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2524:2: ( 'true' )
                    {
                    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2524:2: ( 'true' )
                    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2524:4: 'true'
                    {
                    match(input,51,FOLLOW_51_in_ruleBLiteral4829); 

                            current = grammarAccess.getBLiteralAccess().getTrueEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getBLiteralAccess().getTrueEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2530:6: ( 'false' )
                    {
                    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2530:6: ( 'false' )
                    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2530:8: 'false'
                    {
                    match(input,52,FOLLOW_52_in_ruleBLiteral4844); 

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
    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2540:1: ruleEnumMembership returns [Enumerator current=null] : ( ( 'is-one-of' ) | ( 'is-not-one-of' ) ) ;
    public final Enumerator ruleEnumMembership() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2544:6: ( ( ( 'is-one-of' ) | ( 'is-not-one-of' ) ) )
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2545:1: ( ( 'is-one-of' ) | ( 'is-not-one-of' ) )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2545:1: ( ( 'is-one-of' ) | ( 'is-not-one-of' ) )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==53) ) {
                alt35=1;
            }
            else if ( (LA35_0==54) ) {
                alt35=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("2545:1: ( ( 'is-one-of' ) | ( 'is-not-one-of' ) )", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2545:2: ( 'is-one-of' )
                    {
                    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2545:2: ( 'is-one-of' )
                    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2545:4: 'is-one-of'
                    {
                    match(input,53,FOLLOW_53_in_ruleEnumMembership4887); 

                            current = grammarAccess.getEnumMembershipAccess().getIsInEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getEnumMembershipAccess().getIsInEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2551:6: ( 'is-not-one-of' )
                    {
                    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2551:6: ( 'is-not-one-of' )
                    // ../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g:2551:8: 'is-not-one-of'
                    {
                    match(input,54,FOLLOW_54_in_ruleEnumMembership4902); 

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
    public static final BitSet FOLLOW_11_in_ruleDynamicScreen120 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleLabel_in_ruleDynamicScreen141 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleDynamicScreen151 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleDynamicScreen161 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDynamicScreen178 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleDynamicScreen193 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleDynamicScreen203 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDynamicScreen221 = new BitSet(new long[]{0x0000000009500000L});
    public static final BitSet FOLLOW_ruleDeclaration_in_ruleDynamicScreen242 = new BitSet(new long[]{0x0000000009500000L});
    public static final BitSet FOLLOW_ruleFieldGroup_in_ruleDynamicScreen264 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_ruleLabel_in_entryRuleLabel301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLabel311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleLabel353 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleLabel369 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleLabel386 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleLabel401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePathTail_in_entryRulePathTail439 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePathTail449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rulePathTail484 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePathTail502 = new BitSet(new long[]{0x0000000000060002L});
    public static final BitSet FOLLOW_18_in_rulePathTail513 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePathTail531 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_rulePathTail541 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rulePathTail_in_rulePathTail564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_entryRuleDeclaration601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeclaration611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExternalVariable_in_ruleDeclaration658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumList_in_ruleDeclaration685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataStore_in_ruleDeclaration712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExternalVariable_in_entryRuleExternalVariable747 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExternalVariable757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleExternalVariable792 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rulePathTail_in_ruleExternalVariable813 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleExternalVariable823 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExternalVariable840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumList_in_entryRuleEnumList881 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumList891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleEnumList926 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumList943 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleEnumList958 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleEnumList968 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumList986 = new BitSet(new long[]{0x0000000000080020L});
    public static final BitSet FOLLOW_19_in_ruleEnumList997 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleEnumList1007 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumList1025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataStore_in_entryRuleDataStore1061 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataStore1071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleDataStore1106 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDataStore1123 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleDataStore1138 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDataStore1156 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_ruleDataStore1174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGroupElement_in_entryRuleGroupElement1224 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGroupElement1234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_in_ruleGroupElement1281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldGroup_in_ruleGroupElement1308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_in_entryRuleField1343 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleField1353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleField1395 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleLabel_in_ruleField1421 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rulePathTail_in_ruleField1442 = new BitSet(new long[]{0x0007C00600000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleField1463 = new BitSet(new long[]{0x0007C00600000002L});
    public static final BitSet FOLLOW_ruleFieldGroup_in_entryRuleFieldGroup1500 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFieldGroup1510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleFieldGroup1545 = new BitSet(new long[]{0x0000000030000010L});
    public static final BitSet FOLLOW_ruleLabel_in_ruleFieldGroup1566 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_28_in_ruleFieldGroup1578 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rulePathTail_in_ruleFieldGroup1599 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleFieldGroup1611 = new BitSet(new long[]{0x0000000008000020L});
    public static final BitSet FOLLOW_ruleGroupElement_in_ruleFieldGroup1632 = new BitSet(new long[]{0x0000000048000020L});
    public static final BitSet FOLLOW_30_in_ruleFieldGroup1643 = new BitSet(new long[]{0x0007C00600000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleFieldGroup1664 = new BitSet(new long[]{0x0007C00600000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute1701 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute1711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNormalAttribute_in_ruleAttribute1758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumFieldAttribute_in_ruleAttribute1785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumFieldAttribute_in_entryRuleEnumFieldAttribute1820 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumFieldAttribute1830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRestrictionAttribute_in_ruleEnumFieldAttribute1877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRestrictionGroupAttribute_in_ruleEnumFieldAttribute1904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNormalAttribute_in_entryRuleNormalAttribute1939 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNormalAttribute1949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeClassExpression_in_ruleNormalAttribute1995 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_31_in_ruleNormalAttribute2006 = new BitSet(new long[]{0x0000060000040020L});
    public static final BitSet FOLLOW_ruleBExpression_in_ruleNormalAttribute2027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeClassExpression_in_entryRuleAttributeClassExpression2065 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributeClassExpression2075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeClass_in_ruleAttributeClassExpression2121 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_32_in_ruleAttributeClassExpression2132 = new BitSet(new long[]{0x0007C00000000000L});
    public static final BitSet FOLLOW_ruleAttributeClass_in_ruleAttributeClassExpression2153 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_ruleRestrictionAttribute_in_entryRuleRestrictionAttribute2191 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRestrictionAttribute2201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleRestrictionAttribute2236 = new BitSet(new long[]{0x0000000000040020L});
    public static final BitSet FOLLOW_ruleEnumLiteralsCollection_in_ruleRestrictionAttribute2257 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleRestrictionAttribute2267 = new BitSet(new long[]{0x0000060000040020L});
    public static final BitSet FOLLOW_ruleBExpression_in_ruleRestrictionAttribute2288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRestrictionGroupAttribute_in_entryRuleRestrictionGroupAttribute2324 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRestrictionGroupAttribute2334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleRestrictionGroupAttribute2378 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleRestrictionGroupAttribute2388 = new BitSet(new long[]{0x0000000000040020L});
    public static final BitSet FOLLOW_ruleRestrictionRule_in_ruleRestrictionGroupAttribute2409 = new BitSet(new long[]{0x0000001000040020L});
    public static final BitSet FOLLOW_36_in_ruleRestrictionGroupAttribute2420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRestrictionRule_in_entryRuleRestrictionRule2456 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRestrictionRule2466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumLiteralsCollection_in_ruleRestrictionRule2512 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleRestrictionRule2522 = new BitSet(new long[]{0x0000060000040020L});
    public static final BitSet FOLLOW_ruleBExpression_in_ruleRestrictionRule2543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReferenceTarget_in_entryRuleReferenceTarget2579 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReferenceTarget2589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_in_ruleReferenceTarget2636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExternalVariable_in_ruleReferenceTarget2663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_entryRuleReference2698 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReference2708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleReference2750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBExpression_in_entryRuleBExpression2787 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBExpression2797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBOrExpression_in_ruleBExpression2843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBOrExpression_in_entryRuleBOrExpression2877 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBOrExpression2887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBAndExpression_in_ruleBOrExpression2934 = new BitSet(new long[]{0x0000006000000002L});
    public static final BitSet FOLLOW_37_in_ruleBOrExpression2954 = new BitSet(new long[]{0x0000060000040020L});
    public static final BitSet FOLLOW_38_in_ruleBOrExpression2970 = new BitSet(new long[]{0x0000060000040020L});
    public static final BitSet FOLLOW_ruleBAndExpression_in_ruleBOrExpression2992 = new BitSet(new long[]{0x0000006000000002L});
    public static final BitSet FOLLOW_ruleBAndExpression_in_entryRuleBAndExpression3030 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBAndExpression3040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNegationExpression_in_ruleBAndExpression3087 = new BitSet(new long[]{0x0000018000000002L});
    public static final BitSet FOLLOW_39_in_ruleBAndExpression3107 = new BitSet(new long[]{0x0000060000040020L});
    public static final BitSet FOLLOW_40_in_ruleBAndExpression3123 = new BitSet(new long[]{0x0000060000040020L});
    public static final BitSet FOLLOW_ruleNegationExpression_in_ruleBAndExpression3145 = new BitSet(new long[]{0x0000018000000002L});
    public static final BitSet FOLLOW_ruleNegationExpression_in_entryRuleNegationExpression3183 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNegationExpression3193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminalBExpression_in_ruleNegationExpression3240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleNegationExpression3266 = new BitSet(new long[]{0x0000060000040020L});
    public static final BitSet FOLLOW_42_in_ruleNegationExpression3282 = new BitSet(new long[]{0x0000060000040020L});
    public static final BitSet FOLLOW_ruleNegationExpression_in_ruleNegationExpression3304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminalBExpression_in_entryRuleTerminalBExpression3341 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTerminalBExpression3351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicReferringBExpression_in_ruleTerminalBExpression3398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleTerminalBExpression3414 = new BitSet(new long[]{0x0000060000040020L});
    public static final BitSet FOLLOW_ruleBExpression_in_ruleTerminalBExpression3436 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleTerminalBExpression3445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicReferringBExpression_in_entryRuleAtomicReferringBExpression3482 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtomicReferringBExpression3492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBComparison_in_ruleAtomicReferringBExpression3539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumComparison_in_ruleAtomicReferringBExpression3566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValueComparison_in_ruleAtomicReferringBExpression3593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePresenceCheck_in_ruleAtomicReferringBExpression3620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBComparison_in_entryRuleBComparison3655 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBComparison3665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_ruleBComparison3720 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_43_in_ruleBComparison3731 = new BitSet(new long[]{0x0018000000000000L});
    public static final BitSet FOLLOW_ruleBLiteral_in_ruleBComparison3752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumComparison_in_entryRuleEnumComparison3790 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumComparison3800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleEnumComparison_in_ruleEnumComparison3847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiEnumComparison_in_ruleEnumComparison3874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleEnumComparison_in_entryRuleSingleEnumComparison3909 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSingleEnumComparison3919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_ruleSingleEnumComparison3965 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleSingleEnumComparison3975 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSingleEnumComparison3993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiEnumComparison_in_entryRuleMultiEnumComparison4029 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiEnumComparison4039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_ruleMultiEnumComparison4085 = new BitSet(new long[]{0x0060000000000000L});
    public static final BitSet FOLLOW_ruleEnumMembership_in_ruleMultiEnumComparison4106 = new BitSet(new long[]{0x0000000000040020L});
    public static final BitSet FOLLOW_ruleEnumLiteralsCollection_in_ruleMultiEnumComparison4127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValueComparison_in_entryRuleStringValueComparison4163 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringValueComparison4173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_ruleStringValueComparison4219 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleStringValueComparison4229 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringValueComparison4246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePresenceCheck_in_entryRulePresenceCheck4287 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePresenceCheck4297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_rulePresenceCheck4343 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_rulePresenceCheck4353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumLiteralsCollection_in_entryRuleEnumLiteralsCollection4389 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumLiteralsCollection4399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDirectEnumLiteralsCollection_in_ruleEnumLiteralsCollection4446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumListReference_in_ruleEnumLiteralsCollection4473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDirectEnumLiteralsCollection_in_entryRuleDirectEnumLiteralsCollection4508 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDirectEnumLiteralsCollection4518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleDirectEnumLiteralsCollection4562 = new BitSet(new long[]{0x0000000000080020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDirectEnumLiteralsCollection4580 = new BitSet(new long[]{0x0000000000080020L});
    public static final BitSet FOLLOW_19_in_ruleDirectEnumLiteralsCollection4591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumListReference_in_entryRuleEnumListReference4627 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumListReference4637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumListReference4679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleAttributeClass4726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleAttributeClass4741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleAttributeClass4756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleAttributeClass4771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleAttributeClass4786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleBLiteral4829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleBLiteral4844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleEnumMembership4887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleEnumMembership4902 = new BitSet(new long[]{0x0000000000000002L});

}