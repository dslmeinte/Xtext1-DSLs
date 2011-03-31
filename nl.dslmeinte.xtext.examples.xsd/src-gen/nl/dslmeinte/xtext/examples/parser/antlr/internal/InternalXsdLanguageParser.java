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
import nl.dslmeinte.xtext.examples.services.XsdLanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalXsdLanguageParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_PATTERN_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'schema'", "'namespace'", "'import'", "'as'", "'element'", "'->'", "':'", "'simple-type'", "'['", "']'", "'enumeration'", "'{'", "'}'", "'::'", "'maxLength'", "'='", "'pattern'", "'range'", "'..'", "'length'", "'abstract'", "'complex-type'", "'extends'", "'documentation:'", "'required'", "'@'", "'*'", "'duration'", "'dateTime'", "'time'", "'date'", "'string'", "'decimal'", "'integer'", "'positiveInteger'", "'nonNegativeInteger'", "'token'", "'base64Binary'"
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
    public String getGrammarFileName() { return "../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g"; }



     	private XsdLanguageGrammarAccess grammarAccess;
     	
        public InternalXsdLanguageParser(TokenStream input, IAstFactory factory, XsdLanguageGrammarAccess grammarAccess) {
            this(input);
            this.factory = factory;
            registerRules(grammarAccess.getGrammar());
            this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected InputStream getTokenFile() {
        	ClassLoader classLoader = getClass().getClassLoader();
        	return classLoader.getResourceAsStream("nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.tokens");
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Schema";	
       	}
       	
       	@Override
       	protected XsdLanguageGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start entryRuleSchema
    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:78:1: entryRuleSchema returns [EObject current=null] : iv_ruleSchema= ruleSchema EOF ;
    public final EObject entryRuleSchema() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSchema = null;


        try {
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:79:2: (iv_ruleSchema= ruleSchema EOF )
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:80:2: iv_ruleSchema= ruleSchema EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSchemaRule(), currentNode); 
            pushFollow(FOLLOW_ruleSchema_in_entryRuleSchema75);
            iv_ruleSchema=ruleSchema();
            _fsp--;

             current =iv_ruleSchema; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSchema85); 

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
    // $ANTLR end entryRuleSchema


    // $ANTLR start ruleSchema
    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:87:1: ruleSchema returns [EObject current=null] : ( 'schema' ( (lv_name_1_0= RULE_ID ) ) 'namespace' ( (lv_nsURI_3_0= RULE_STRING ) ) ( (lv_imports_4_0= ruleImport ) )* ( (lv_definitions_5_0= ruleTopLevelDefinition ) )* ) ;
    public final EObject ruleSchema() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token lv_nsURI_3_0=null;
        EObject lv_imports_4_0 = null;

        EObject lv_definitions_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:92:6: ( ( 'schema' ( (lv_name_1_0= RULE_ID ) ) 'namespace' ( (lv_nsURI_3_0= RULE_STRING ) ) ( (lv_imports_4_0= ruleImport ) )* ( (lv_definitions_5_0= ruleTopLevelDefinition ) )* ) )
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:93:1: ( 'schema' ( (lv_name_1_0= RULE_ID ) ) 'namespace' ( (lv_nsURI_3_0= RULE_STRING ) ) ( (lv_imports_4_0= ruleImport ) )* ( (lv_definitions_5_0= ruleTopLevelDefinition ) )* )
            {
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:93:1: ( 'schema' ( (lv_name_1_0= RULE_ID ) ) 'namespace' ( (lv_nsURI_3_0= RULE_STRING ) ) ( (lv_imports_4_0= ruleImport ) )* ( (lv_definitions_5_0= ruleTopLevelDefinition ) )* )
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:93:3: 'schema' ( (lv_name_1_0= RULE_ID ) ) 'namespace' ( (lv_nsURI_3_0= RULE_STRING ) ) ( (lv_imports_4_0= ruleImport ) )* ( (lv_definitions_5_0= ruleTopLevelDefinition ) )*
            {
            match(input,12,FOLLOW_12_in_ruleSchema120); 

                    createLeafNode(grammarAccess.getSchemaAccess().getSchemaKeyword_0(), null); 
                
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:97:1: ( (lv_name_1_0= RULE_ID ) )
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:98:1: (lv_name_1_0= RULE_ID )
            {
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:98:1: (lv_name_1_0= RULE_ID )
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:99:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSchema137); 

            			createLeafNode(grammarAccess.getSchemaAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getSchemaRule().getType().getClassifier());
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

            match(input,13,FOLLOW_13_in_ruleSchema152); 

                    createLeafNode(grammarAccess.getSchemaAccess().getNamespaceKeyword_2(), null); 
                
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:125:1: ( (lv_nsURI_3_0= RULE_STRING ) )
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:126:1: (lv_nsURI_3_0= RULE_STRING )
            {
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:126:1: (lv_nsURI_3_0= RULE_STRING )
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:127:3: lv_nsURI_3_0= RULE_STRING
            {
            lv_nsURI_3_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSchema169); 

            			createLeafNode(grammarAccess.getSchemaAccess().getNsURISTRINGTerminalRuleCall_3_0(), "nsURI"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getSchemaRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"nsURI",
            	        		lv_nsURI_3_0, 
            	        		"STRING", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:149:2: ( (lv_imports_4_0= ruleImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:150:1: (lv_imports_4_0= ruleImport )
            	    {
            	    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:150:1: (lv_imports_4_0= ruleImport )
            	    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:151:3: lv_imports_4_0= ruleImport
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getSchemaAccess().getImportsImportParserRuleCall_4_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleImport_in_ruleSchema195);
            	    lv_imports_4_0=ruleImport();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getSchemaRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"imports",
            	    	        		lv_imports_4_0, 
            	    	        		"Import", 
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

            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:173:3: ( (lv_definitions_5_0= ruleTopLevelDefinition ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==16||LA2_0==19||(LA2_0>=32 && LA2_0<=33)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:174:1: (lv_definitions_5_0= ruleTopLevelDefinition )
            	    {
            	    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:174:1: (lv_definitions_5_0= ruleTopLevelDefinition )
            	    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:175:3: lv_definitions_5_0= ruleTopLevelDefinition
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getSchemaAccess().getDefinitionsTopLevelDefinitionParserRuleCall_5_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleTopLevelDefinition_in_ruleSchema217);
            	    lv_definitions_5_0=ruleTopLevelDefinition();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getSchemaRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"definitions",
            	    	        		lv_definitions_5_0, 
            	    	        		"TopLevelDefinition", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
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
    // $ANTLR end ruleSchema


    // $ANTLR start entryRuleImport
    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:205:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:206:2: (iv_ruleImport= ruleImport EOF )
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:207:2: iv_ruleImport= ruleImport EOF
            {
             currentNode = createCompositeNode(grammarAccess.getImportRule(), currentNode); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport254);
            iv_ruleImport=ruleImport();
            _fsp--;

             current =iv_ruleImport; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport264); 

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
    // $ANTLR end entryRuleImport


    // $ANTLR start ruleImport
    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:214:1: ruleImport returns [EObject current=null] : ( 'import' ( (lv_importURI_1_0= RULE_STRING ) ) 'as' ( (lv_nsPrefix_3_0= RULE_ID ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token lv_importURI_1_0=null;
        Token lv_nsPrefix_3_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:219:6: ( ( 'import' ( (lv_importURI_1_0= RULE_STRING ) ) 'as' ( (lv_nsPrefix_3_0= RULE_ID ) ) ) )
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:220:1: ( 'import' ( (lv_importURI_1_0= RULE_STRING ) ) 'as' ( (lv_nsPrefix_3_0= RULE_ID ) ) )
            {
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:220:1: ( 'import' ( (lv_importURI_1_0= RULE_STRING ) ) 'as' ( (lv_nsPrefix_3_0= RULE_ID ) ) )
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:220:3: 'import' ( (lv_importURI_1_0= RULE_STRING ) ) 'as' ( (lv_nsPrefix_3_0= RULE_ID ) )
            {
            match(input,14,FOLLOW_14_in_ruleImport299); 

                    createLeafNode(grammarAccess.getImportAccess().getImportKeyword_0(), null); 
                
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:224:1: ( (lv_importURI_1_0= RULE_STRING ) )
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:225:1: (lv_importURI_1_0= RULE_STRING )
            {
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:225:1: (lv_importURI_1_0= RULE_STRING )
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:226:3: lv_importURI_1_0= RULE_STRING
            {
            lv_importURI_1_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleImport316); 

            			createLeafNode(grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_1_0(), "importURI"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getImportRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"importURI",
            	        		lv_importURI_1_0, 
            	        		"STRING", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,15,FOLLOW_15_in_ruleImport331); 

                    createLeafNode(grammarAccess.getImportAccess().getAsKeyword_2(), null); 
                
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:252:1: ( (lv_nsPrefix_3_0= RULE_ID ) )
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:253:1: (lv_nsPrefix_3_0= RULE_ID )
            {
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:253:1: (lv_nsPrefix_3_0= RULE_ID )
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:254:3: lv_nsPrefix_3_0= RULE_ID
            {
            lv_nsPrefix_3_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleImport348); 

            			createLeafNode(grammarAccess.getImportAccess().getNsPrefixIDTerminalRuleCall_3_0(), "nsPrefix"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getImportRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"nsPrefix",
            	        		lv_nsPrefix_3_0, 
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
    // $ANTLR end ruleImport


    // $ANTLR start entryRuleTopLevelDefinition
    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:284:1: entryRuleTopLevelDefinition returns [EObject current=null] : iv_ruleTopLevelDefinition= ruleTopLevelDefinition EOF ;
    public final EObject entryRuleTopLevelDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTopLevelDefinition = null;


        try {
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:285:2: (iv_ruleTopLevelDefinition= ruleTopLevelDefinition EOF )
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:286:2: iv_ruleTopLevelDefinition= ruleTopLevelDefinition EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTopLevelDefinitionRule(), currentNode); 
            pushFollow(FOLLOW_ruleTopLevelDefinition_in_entryRuleTopLevelDefinition389);
            iv_ruleTopLevelDefinition=ruleTopLevelDefinition();
            _fsp--;

             current =iv_ruleTopLevelDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTopLevelDefinition399); 

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
    // $ANTLR end entryRuleTopLevelDefinition


    // $ANTLR start ruleTopLevelDefinition
    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:293:1: ruleTopLevelDefinition returns [EObject current=null] : (this_TopLevelType_0= ruleTopLevelType | this_TopLevelElement_1= ruleTopLevelElement ) ;
    public final EObject ruleTopLevelDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_TopLevelType_0 = null;

        EObject this_TopLevelElement_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:298:6: ( (this_TopLevelType_0= ruleTopLevelType | this_TopLevelElement_1= ruleTopLevelElement ) )
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:299:1: (this_TopLevelType_0= ruleTopLevelType | this_TopLevelElement_1= ruleTopLevelElement )
            {
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:299:1: (this_TopLevelType_0= ruleTopLevelType | this_TopLevelElement_1= ruleTopLevelElement )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==19||(LA3_0>=32 && LA3_0<=33)) ) {
                alt3=1;
            }
            else if ( (LA3_0==16) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("299:1: (this_TopLevelType_0= ruleTopLevelType | this_TopLevelElement_1= ruleTopLevelElement )", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:300:5: this_TopLevelType_0= ruleTopLevelType
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTopLevelDefinitionAccess().getTopLevelTypeParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleTopLevelType_in_ruleTopLevelDefinition446);
                    this_TopLevelType_0=ruleTopLevelType();
                    _fsp--;

                     
                            current = this_TopLevelType_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:310:5: this_TopLevelElement_1= ruleTopLevelElement
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTopLevelDefinitionAccess().getTopLevelElementParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleTopLevelElement_in_ruleTopLevelDefinition473);
                    this_TopLevelElement_1=ruleTopLevelElement();
                    _fsp--;

                     
                            current = this_TopLevelElement_1; 
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
    // $ANTLR end ruleTopLevelDefinition


    // $ANTLR start entryRuleTopLevelType
    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:326:1: entryRuleTopLevelType returns [EObject current=null] : iv_ruleTopLevelType= ruleTopLevelType EOF ;
    public final EObject entryRuleTopLevelType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTopLevelType = null;


        try {
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:327:2: (iv_ruleTopLevelType= ruleTopLevelType EOF )
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:328:2: iv_ruleTopLevelType= ruleTopLevelType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTopLevelTypeRule(), currentNode); 
            pushFollow(FOLLOW_ruleTopLevelType_in_entryRuleTopLevelType508);
            iv_ruleTopLevelType=ruleTopLevelType();
            _fsp--;

             current =iv_ruleTopLevelType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTopLevelType518); 

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
    // $ANTLR end entryRuleTopLevelType


    // $ANTLR start ruleTopLevelType
    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:335:1: ruleTopLevelType returns [EObject current=null] : (this_TopLevelSimpleType_0= ruleTopLevelSimpleType | this_TopLevelComplexType_1= ruleTopLevelComplexType ) ;
    public final EObject ruleTopLevelType() throws RecognitionException {
        EObject current = null;

        EObject this_TopLevelSimpleType_0 = null;

        EObject this_TopLevelComplexType_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:340:6: ( (this_TopLevelSimpleType_0= ruleTopLevelSimpleType | this_TopLevelComplexType_1= ruleTopLevelComplexType ) )
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:341:1: (this_TopLevelSimpleType_0= ruleTopLevelSimpleType | this_TopLevelComplexType_1= ruleTopLevelComplexType )
            {
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:341:1: (this_TopLevelSimpleType_0= ruleTopLevelSimpleType | this_TopLevelComplexType_1= ruleTopLevelComplexType )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==19) ) {
                alt4=1;
            }
            else if ( ((LA4_0>=32 && LA4_0<=33)) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("341:1: (this_TopLevelSimpleType_0= ruleTopLevelSimpleType | this_TopLevelComplexType_1= ruleTopLevelComplexType )", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:342:5: this_TopLevelSimpleType_0= ruleTopLevelSimpleType
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTopLevelTypeAccess().getTopLevelSimpleTypeParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleTopLevelSimpleType_in_ruleTopLevelType565);
                    this_TopLevelSimpleType_0=ruleTopLevelSimpleType();
                    _fsp--;

                     
                            current = this_TopLevelSimpleType_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:352:5: this_TopLevelComplexType_1= ruleTopLevelComplexType
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTopLevelTypeAccess().getTopLevelComplexTypeParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleTopLevelComplexType_in_ruleTopLevelType592);
                    this_TopLevelComplexType_1=ruleTopLevelComplexType();
                    _fsp--;

                     
                            current = this_TopLevelComplexType_1; 
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
    // $ANTLR end ruleTopLevelType


    // $ANTLR start entryRuleTopLevelElement
    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:368:1: entryRuleTopLevelElement returns [EObject current=null] : iv_ruleTopLevelElement= ruleTopLevelElement EOF ;
    public final EObject entryRuleTopLevelElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTopLevelElement = null;


        try {
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:369:2: (iv_ruleTopLevelElement= ruleTopLevelElement EOF )
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:370:2: iv_ruleTopLevelElement= ruleTopLevelElement EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTopLevelElementRule(), currentNode); 
            pushFollow(FOLLOW_ruleTopLevelElement_in_entryRuleTopLevelElement627);
            iv_ruleTopLevelElement=ruleTopLevelElement();
            _fsp--;

             current =iv_ruleTopLevelElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTopLevelElement637); 

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
    // $ANTLR end entryRuleTopLevelElement


    // $ANTLR start ruleTopLevelElement
    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:377:1: ruleTopLevelElement returns [EObject current=null] : ( 'element' ( (lv_name_1_0= RULE_ID ) ) ( ( '->' ( (lv_typeRef_3_0= ruleNamedTypeReference ) ) ) | ( ':' ( (lv_embeddedTypeDef_5_0= ruleEmbeddedType ) ) ) ) ) ;
    public final EObject ruleTopLevelElement() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_typeRef_3_0 = null;

        EObject lv_embeddedTypeDef_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:382:6: ( ( 'element' ( (lv_name_1_0= RULE_ID ) ) ( ( '->' ( (lv_typeRef_3_0= ruleNamedTypeReference ) ) ) | ( ':' ( (lv_embeddedTypeDef_5_0= ruleEmbeddedType ) ) ) ) ) )
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:383:1: ( 'element' ( (lv_name_1_0= RULE_ID ) ) ( ( '->' ( (lv_typeRef_3_0= ruleNamedTypeReference ) ) ) | ( ':' ( (lv_embeddedTypeDef_5_0= ruleEmbeddedType ) ) ) ) )
            {
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:383:1: ( 'element' ( (lv_name_1_0= RULE_ID ) ) ( ( '->' ( (lv_typeRef_3_0= ruleNamedTypeReference ) ) ) | ( ':' ( (lv_embeddedTypeDef_5_0= ruleEmbeddedType ) ) ) ) )
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:383:3: 'element' ( (lv_name_1_0= RULE_ID ) ) ( ( '->' ( (lv_typeRef_3_0= ruleNamedTypeReference ) ) ) | ( ':' ( (lv_embeddedTypeDef_5_0= ruleEmbeddedType ) ) ) )
            {
            match(input,16,FOLLOW_16_in_ruleTopLevelElement672); 

                    createLeafNode(grammarAccess.getTopLevelElementAccess().getElementKeyword_0(), null); 
                
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:387:1: ( (lv_name_1_0= RULE_ID ) )
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:388:1: (lv_name_1_0= RULE_ID )
            {
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:388:1: (lv_name_1_0= RULE_ID )
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:389:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTopLevelElement689); 

            			createLeafNode(grammarAccess.getTopLevelElementAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getTopLevelElementRule().getType().getClassifier());
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

            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:411:2: ( ( '->' ( (lv_typeRef_3_0= ruleNamedTypeReference ) ) ) | ( ':' ( (lv_embeddedTypeDef_5_0= ruleEmbeddedType ) ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            else if ( (LA5_0==18) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("411:2: ( ( '->' ( (lv_typeRef_3_0= ruleNamedTypeReference ) ) ) | ( ':' ( (lv_embeddedTypeDef_5_0= ruleEmbeddedType ) ) ) )", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:411:3: ( '->' ( (lv_typeRef_3_0= ruleNamedTypeReference ) ) )
                    {
                    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:411:3: ( '->' ( (lv_typeRef_3_0= ruleNamedTypeReference ) ) )
                    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:411:5: '->' ( (lv_typeRef_3_0= ruleNamedTypeReference ) )
                    {
                    match(input,17,FOLLOW_17_in_ruleTopLevelElement706); 

                            createLeafNode(grammarAccess.getTopLevelElementAccess().getHyphenMinusGreaterThanSignKeyword_2_0_0(), null); 
                        
                    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:415:1: ( (lv_typeRef_3_0= ruleNamedTypeReference ) )
                    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:416:1: (lv_typeRef_3_0= ruleNamedTypeReference )
                    {
                    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:416:1: (lv_typeRef_3_0= ruleNamedTypeReference )
                    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:417:3: lv_typeRef_3_0= ruleNamedTypeReference
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getTopLevelElementAccess().getTypeRefNamedTypeReferenceParserRuleCall_2_0_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleNamedTypeReference_in_ruleTopLevelElement727);
                    lv_typeRef_3_0=ruleNamedTypeReference();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getTopLevelElementRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"typeRef",
                    	        		lv_typeRef_3_0, 
                    	        		"NamedTypeReference", 
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
                case 2 :
                    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:440:6: ( ':' ( (lv_embeddedTypeDef_5_0= ruleEmbeddedType ) ) )
                    {
                    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:440:6: ( ':' ( (lv_embeddedTypeDef_5_0= ruleEmbeddedType ) ) )
                    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:440:8: ':' ( (lv_embeddedTypeDef_5_0= ruleEmbeddedType ) )
                    {
                    match(input,18,FOLLOW_18_in_ruleTopLevelElement745); 

                            createLeafNode(grammarAccess.getTopLevelElementAccess().getColonKeyword_2_1_0(), null); 
                        
                    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:444:1: ( (lv_embeddedTypeDef_5_0= ruleEmbeddedType ) )
                    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:445:1: (lv_embeddedTypeDef_5_0= ruleEmbeddedType )
                    {
                    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:445:1: (lv_embeddedTypeDef_5_0= ruleEmbeddedType )
                    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:446:3: lv_embeddedTypeDef_5_0= ruleEmbeddedType
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getTopLevelElementAccess().getEmbeddedTypeDefEmbeddedTypeParserRuleCall_2_1_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleEmbeddedType_in_ruleTopLevelElement766);
                    lv_embeddedTypeDef_5_0=ruleEmbeddedType();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getTopLevelElementRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"embeddedTypeDef",
                    	        		lv_embeddedTypeDef_5_0, 
                    	        		"EmbeddedType", 
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
    // $ANTLR end ruleTopLevelElement


    // $ANTLR start entryRuleTopLevelSimpleType
    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:476:1: entryRuleTopLevelSimpleType returns [EObject current=null] : iv_ruleTopLevelSimpleType= ruleTopLevelSimpleType EOF ;
    public final EObject entryRuleTopLevelSimpleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTopLevelSimpleType = null;


        try {
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:477:2: (iv_ruleTopLevelSimpleType= ruleTopLevelSimpleType EOF )
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:478:2: iv_ruleTopLevelSimpleType= ruleTopLevelSimpleType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTopLevelSimpleTypeRule(), currentNode); 
            pushFollow(FOLLOW_ruleTopLevelSimpleType_in_entryRuleTopLevelSimpleType804);
            iv_ruleTopLevelSimpleType=ruleTopLevelSimpleType();
            _fsp--;

             current =iv_ruleTopLevelSimpleType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTopLevelSimpleType814); 

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
    // $ANTLR end entryRuleTopLevelSimpleType


    // $ANTLR start ruleTopLevelSimpleType
    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:485:1: ruleTopLevelSimpleType returns [EObject current=null] : ( 'simple-type' ( (lv_name_1_0= RULE_ID ) ) ( (lv_restriction_2_0= ruleRestriction ) )? ( (lv_documentation_3_0= ruleDocumentation ) )? ) ;
    public final EObject ruleTopLevelSimpleType() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_restriction_2_0 = null;

        EObject lv_documentation_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:490:6: ( ( 'simple-type' ( (lv_name_1_0= RULE_ID ) ) ( (lv_restriction_2_0= ruleRestriction ) )? ( (lv_documentation_3_0= ruleDocumentation ) )? ) )
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:491:1: ( 'simple-type' ( (lv_name_1_0= RULE_ID ) ) ( (lv_restriction_2_0= ruleRestriction ) )? ( (lv_documentation_3_0= ruleDocumentation ) )? )
            {
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:491:1: ( 'simple-type' ( (lv_name_1_0= RULE_ID ) ) ( (lv_restriction_2_0= ruleRestriction ) )? ( (lv_documentation_3_0= ruleDocumentation ) )? )
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:491:3: 'simple-type' ( (lv_name_1_0= RULE_ID ) ) ( (lv_restriction_2_0= ruleRestriction ) )? ( (lv_documentation_3_0= ruleDocumentation ) )?
            {
            match(input,19,FOLLOW_19_in_ruleTopLevelSimpleType849); 

                    createLeafNode(grammarAccess.getTopLevelSimpleTypeAccess().getSimpleTypeKeyword_0(), null); 
                
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:495:1: ( (lv_name_1_0= RULE_ID ) )
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:496:1: (lv_name_1_0= RULE_ID )
            {
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:496:1: (lv_name_1_0= RULE_ID )
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:497:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTopLevelSimpleType866); 

            			createLeafNode(grammarAccess.getTopLevelSimpleTypeAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getTopLevelSimpleTypeRule().getType().getClassifier());
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

            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:519:2: ( (lv_restriction_2_0= ruleRestriction ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:520:1: (lv_restriction_2_0= ruleRestriction )
                    {
                    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:520:1: (lv_restriction_2_0= ruleRestriction )
                    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:521:3: lv_restriction_2_0= ruleRestriction
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getTopLevelSimpleTypeAccess().getRestrictionRestrictionParserRuleCall_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleRestriction_in_ruleTopLevelSimpleType892);
                    lv_restriction_2_0=ruleRestriction();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getTopLevelSimpleTypeRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"restriction",
                    	        		lv_restriction_2_0, 
                    	        		"Restriction", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;

            }

            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:543:3: ( (lv_documentation_3_0= ruleDocumentation ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==25) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:544:1: (lv_documentation_3_0= ruleDocumentation )
                    {
                    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:544:1: (lv_documentation_3_0= ruleDocumentation )
                    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:545:3: lv_documentation_3_0= ruleDocumentation
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getTopLevelSimpleTypeAccess().getDocumentationDocumentationParserRuleCall_3_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleDocumentation_in_ruleTopLevelSimpleType914);
                    lv_documentation_3_0=ruleDocumentation();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getTopLevelSimpleTypeRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"documentation",
                    	        		lv_documentation_3_0, 
                    	        		"Documentation", 
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
    // $ANTLR end ruleTopLevelSimpleType


    // $ANTLR start entryRuleRestriction
    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:575:1: entryRuleRestriction returns [EObject current=null] : iv_ruleRestriction= ruleRestriction EOF ;
    public final EObject entryRuleRestriction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRestriction = null;


        try {
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:576:2: (iv_ruleRestriction= ruleRestriction EOF )
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:577:2: iv_ruleRestriction= ruleRestriction EOF
            {
             currentNode = createCompositeNode(grammarAccess.getRestrictionRule(), currentNode); 
            pushFollow(FOLLOW_ruleRestriction_in_entryRuleRestriction951);
            iv_ruleRestriction=ruleRestriction();
            _fsp--;

             current =iv_ruleRestriction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRestriction961); 

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
    // $ANTLR end entryRuleRestriction


    // $ANTLR start ruleRestriction
    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:584:1: ruleRestriction returns [EObject current=null] : ( '[' ( (lv_typeRef_1_0= ruleNonComplexTypeReference ) ) ']' ':' ( (lv_facets_4_0= ruleFacet ) )+ ) ;
    public final EObject ruleRestriction() throws RecognitionException {
        EObject current = null;

        EObject lv_typeRef_1_0 = null;

        EObject lv_facets_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:589:6: ( ( '[' ( (lv_typeRef_1_0= ruleNonComplexTypeReference ) ) ']' ':' ( (lv_facets_4_0= ruleFacet ) )+ ) )
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:590:1: ( '[' ( (lv_typeRef_1_0= ruleNonComplexTypeReference ) ) ']' ':' ( (lv_facets_4_0= ruleFacet ) )+ )
            {
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:590:1: ( '[' ( (lv_typeRef_1_0= ruleNonComplexTypeReference ) ) ']' ':' ( (lv_facets_4_0= ruleFacet ) )+ )
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:590:3: '[' ( (lv_typeRef_1_0= ruleNonComplexTypeReference ) ) ']' ':' ( (lv_facets_4_0= ruleFacet ) )+
            {
            match(input,20,FOLLOW_20_in_ruleRestriction996); 

                    createLeafNode(grammarAccess.getRestrictionAccess().getLeftSquareBracketKeyword_0(), null); 
                
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:594:1: ( (lv_typeRef_1_0= ruleNonComplexTypeReference ) )
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:595:1: (lv_typeRef_1_0= ruleNonComplexTypeReference )
            {
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:595:1: (lv_typeRef_1_0= ruleNonComplexTypeReference )
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:596:3: lv_typeRef_1_0= ruleNonComplexTypeReference
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getRestrictionAccess().getTypeRefNonComplexTypeReferenceParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleNonComplexTypeReference_in_ruleRestriction1017);
            lv_typeRef_1_0=ruleNonComplexTypeReference();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getRestrictionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"typeRef",
            	        		lv_typeRef_1_0, 
            	        		"NonComplexTypeReference", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,21,FOLLOW_21_in_ruleRestriction1027); 

                    createLeafNode(grammarAccess.getRestrictionAccess().getRightSquareBracketKeyword_2(), null); 
                
            match(input,18,FOLLOW_18_in_ruleRestriction1037); 

                    createLeafNode(grammarAccess.getRestrictionAccess().getColonKeyword_3(), null); 
                
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:626:1: ( (lv_facets_4_0= ruleFacet ) )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==22||LA8_0==26||(LA8_0>=28 && LA8_0<=29)||LA8_0==31) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:627:1: (lv_facets_4_0= ruleFacet )
            	    {
            	    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:627:1: (lv_facets_4_0= ruleFacet )
            	    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:628:3: lv_facets_4_0= ruleFacet
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getRestrictionAccess().getFacetsFacetParserRuleCall_4_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleFacet_in_ruleRestriction1058);
            	    lv_facets_4_0=ruleFacet();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getRestrictionRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"facets",
            	    	        		lv_facets_4_0, 
            	    	        		"Facet", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
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
    // $ANTLR end ruleRestriction


    // $ANTLR start entryRuleFacet
    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:658:1: entryRuleFacet returns [EObject current=null] : iv_ruleFacet= ruleFacet EOF ;
    public final EObject entryRuleFacet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFacet = null;


        try {
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:659:2: (iv_ruleFacet= ruleFacet EOF )
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:660:2: iv_ruleFacet= ruleFacet EOF
            {
             currentNode = createCompositeNode(grammarAccess.getFacetRule(), currentNode); 
            pushFollow(FOLLOW_ruleFacet_in_entryRuleFacet1095);
            iv_ruleFacet=ruleFacet();
            _fsp--;

             current =iv_ruleFacet; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFacet1105); 

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
    // $ANTLR end entryRuleFacet


    // $ANTLR start ruleFacet
    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:667:1: ruleFacet returns [EObject current=null] : (this_EnumerationFacet_0= ruleEnumerationFacet | this_MaxLengthFacet_1= ruleMaxLengthFacet | this_PatternFacet_2= rulePatternFacet | this_RangeFacet_3= ruleRangeFacet | this_LengthFacet_4= ruleLengthFacet ) ;
    public final EObject ruleFacet() throws RecognitionException {
        EObject current = null;

        EObject this_EnumerationFacet_0 = null;

        EObject this_MaxLengthFacet_1 = null;

        EObject this_PatternFacet_2 = null;

        EObject this_RangeFacet_3 = null;

        EObject this_LengthFacet_4 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:672:6: ( (this_EnumerationFacet_0= ruleEnumerationFacet | this_MaxLengthFacet_1= ruleMaxLengthFacet | this_PatternFacet_2= rulePatternFacet | this_RangeFacet_3= ruleRangeFacet | this_LengthFacet_4= ruleLengthFacet ) )
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:673:1: (this_EnumerationFacet_0= ruleEnumerationFacet | this_MaxLengthFacet_1= ruleMaxLengthFacet | this_PatternFacet_2= rulePatternFacet | this_RangeFacet_3= ruleRangeFacet | this_LengthFacet_4= ruleLengthFacet )
            {
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:673:1: (this_EnumerationFacet_0= ruleEnumerationFacet | this_MaxLengthFacet_1= ruleMaxLengthFacet | this_PatternFacet_2= rulePatternFacet | this_RangeFacet_3= ruleRangeFacet | this_LengthFacet_4= ruleLengthFacet )
            int alt9=5;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt9=1;
                }
                break;
            case 26:
                {
                alt9=2;
                }
                break;
            case 28:
                {
                alt9=3;
                }
                break;
            case 29:
                {
                alt9=4;
                }
                break;
            case 31:
                {
                alt9=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("673:1: (this_EnumerationFacet_0= ruleEnumerationFacet | this_MaxLengthFacet_1= ruleMaxLengthFacet | this_PatternFacet_2= rulePatternFacet | this_RangeFacet_3= ruleRangeFacet | this_LengthFacet_4= ruleLengthFacet )", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:674:5: this_EnumerationFacet_0= ruleEnumerationFacet
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getFacetAccess().getEnumerationFacetParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleEnumerationFacet_in_ruleFacet1152);
                    this_EnumerationFacet_0=ruleEnumerationFacet();
                    _fsp--;

                     
                            current = this_EnumerationFacet_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:684:5: this_MaxLengthFacet_1= ruleMaxLengthFacet
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getFacetAccess().getMaxLengthFacetParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleMaxLengthFacet_in_ruleFacet1179);
                    this_MaxLengthFacet_1=ruleMaxLengthFacet();
                    _fsp--;

                     
                            current = this_MaxLengthFacet_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:694:5: this_PatternFacet_2= rulePatternFacet
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getFacetAccess().getPatternFacetParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_rulePatternFacet_in_ruleFacet1206);
                    this_PatternFacet_2=rulePatternFacet();
                    _fsp--;

                     
                            current = this_PatternFacet_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 4 :
                    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:704:5: this_RangeFacet_3= ruleRangeFacet
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getFacetAccess().getRangeFacetParserRuleCall_3(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleRangeFacet_in_ruleFacet1233);
                    this_RangeFacet_3=ruleRangeFacet();
                    _fsp--;

                     
                            current = this_RangeFacet_3; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 5 :
                    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:714:5: this_LengthFacet_4= ruleLengthFacet
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getFacetAccess().getLengthFacetParserRuleCall_4(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleLengthFacet_in_ruleFacet1260);
                    this_LengthFacet_4=ruleLengthFacet();
                    _fsp--;

                     
                            current = this_LengthFacet_4; 
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
    // $ANTLR end ruleFacet


    // $ANTLR start entryRuleEnumerationFacet
    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:730:1: entryRuleEnumerationFacet returns [EObject current=null] : iv_ruleEnumerationFacet= ruleEnumerationFacet EOF ;
    public final EObject entryRuleEnumerationFacet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumerationFacet = null;


        try {
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:731:2: (iv_ruleEnumerationFacet= ruleEnumerationFacet EOF )
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:732:2: iv_ruleEnumerationFacet= ruleEnumerationFacet EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEnumerationFacetRule(), currentNode); 
            pushFollow(FOLLOW_ruleEnumerationFacet_in_entryRuleEnumerationFacet1295);
            iv_ruleEnumerationFacet=ruleEnumerationFacet();
            _fsp--;

             current =iv_ruleEnumerationFacet; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumerationFacet1305); 

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
    // $ANTLR end entryRuleEnumerationFacet


    // $ANTLR start ruleEnumerationFacet
    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:739:1: ruleEnumerationFacet returns [EObject current=null] : ( 'enumeration' '{' ( (lv_literals_2_0= ruleEnumerationLiteral ) )+ '}' ) ;
    public final EObject ruleEnumerationFacet() throws RecognitionException {
        EObject current = null;

        EObject lv_literals_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:744:6: ( ( 'enumeration' '{' ( (lv_literals_2_0= ruleEnumerationLiteral ) )+ '}' ) )
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:745:1: ( 'enumeration' '{' ( (lv_literals_2_0= ruleEnumerationLiteral ) )+ '}' )
            {
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:745:1: ( 'enumeration' '{' ( (lv_literals_2_0= ruleEnumerationLiteral ) )+ '}' )
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:745:3: 'enumeration' '{' ( (lv_literals_2_0= ruleEnumerationLiteral ) )+ '}'
            {
            match(input,22,FOLLOW_22_in_ruleEnumerationFacet1340); 

                    createLeafNode(grammarAccess.getEnumerationFacetAccess().getEnumerationKeyword_0(), null); 
                
            match(input,23,FOLLOW_23_in_ruleEnumerationFacet1350); 

                    createLeafNode(grammarAccess.getEnumerationFacetAccess().getLeftCurlyBracketKeyword_1(), null); 
                
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:753:1: ( (lv_literals_2_0= ruleEnumerationLiteral ) )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=RULE_ID && LA10_0<=RULE_STRING)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:754:1: (lv_literals_2_0= ruleEnumerationLiteral )
            	    {
            	    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:754:1: (lv_literals_2_0= ruleEnumerationLiteral )
            	    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:755:3: lv_literals_2_0= ruleEnumerationLiteral
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getEnumerationFacetAccess().getLiteralsEnumerationLiteralParserRuleCall_2_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleEnumerationLiteral_in_ruleEnumerationFacet1371);
            	    lv_literals_2_0=ruleEnumerationLiteral();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getEnumerationFacetRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"literals",
            	    	        		lv_literals_2_0, 
            	    	        		"EnumerationLiteral", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);

            match(input,24,FOLLOW_24_in_ruleEnumerationFacet1382); 

                    createLeafNode(grammarAccess.getEnumerationFacetAccess().getRightCurlyBracketKeyword_3(), null); 
                

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
    // $ANTLR end ruleEnumerationFacet


    // $ANTLR start entryRuleEnumerationLiteral
    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:789:1: entryRuleEnumerationLiteral returns [EObject current=null] : iv_ruleEnumerationLiteral= ruleEnumerationLiteral EOF ;
    public final EObject entryRuleEnumerationLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumerationLiteral = null;


        try {
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:790:2: (iv_ruleEnumerationLiteral= ruleEnumerationLiteral EOF )
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:791:2: iv_ruleEnumerationLiteral= ruleEnumerationLiteral EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEnumerationLiteralRule(), currentNode); 
            pushFollow(FOLLOW_ruleEnumerationLiteral_in_entryRuleEnumerationLiteral1418);
            iv_ruleEnumerationLiteral=ruleEnumerationLiteral();
            _fsp--;

             current =iv_ruleEnumerationLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumerationLiteral1428); 

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
    // $ANTLR end entryRuleEnumerationLiteral


    // $ANTLR start ruleEnumerationLiteral
    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:798:1: ruleEnumerationLiteral returns [EObject current=null] : ( ( ( (lv_value_0_1= RULE_ID | lv_value_0_2= RULE_STRING ) ) ) ( '::' ( (lv_annotation_2_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleEnumerationLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_1=null;
        Token lv_value_0_2=null;
        Token lv_annotation_2_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:803:6: ( ( ( ( (lv_value_0_1= RULE_ID | lv_value_0_2= RULE_STRING ) ) ) ( '::' ( (lv_annotation_2_0= RULE_STRING ) ) )? ) )
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:804:1: ( ( ( (lv_value_0_1= RULE_ID | lv_value_0_2= RULE_STRING ) ) ) ( '::' ( (lv_annotation_2_0= RULE_STRING ) ) )? )
            {
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:804:1: ( ( ( (lv_value_0_1= RULE_ID | lv_value_0_2= RULE_STRING ) ) ) ( '::' ( (lv_annotation_2_0= RULE_STRING ) ) )? )
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:804:2: ( ( (lv_value_0_1= RULE_ID | lv_value_0_2= RULE_STRING ) ) ) ( '::' ( (lv_annotation_2_0= RULE_STRING ) ) )?
            {
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:804:2: ( ( (lv_value_0_1= RULE_ID | lv_value_0_2= RULE_STRING ) ) )
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:805:1: ( (lv_value_0_1= RULE_ID | lv_value_0_2= RULE_STRING ) )
            {
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:805:1: ( (lv_value_0_1= RULE_ID | lv_value_0_2= RULE_STRING ) )
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:806:1: (lv_value_0_1= RULE_ID | lv_value_0_2= RULE_STRING )
            {
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:806:1: (lv_value_0_1= RULE_ID | lv_value_0_2= RULE_STRING )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                alt11=1;
            }
            else if ( (LA11_0==RULE_STRING) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("806:1: (lv_value_0_1= RULE_ID | lv_value_0_2= RULE_STRING )", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:807:3: lv_value_0_1= RULE_ID
                    {
                    lv_value_0_1=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumerationLiteral1472); 

                    			createLeafNode(grammarAccess.getEnumerationLiteralAccess().getValueIDTerminalRuleCall_0_0_0(), "value"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getEnumerationLiteralRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"value",
                    	        		lv_value_0_1, 
                    	        		"ID", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }
                    break;
                case 2 :
                    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:828:8: lv_value_0_2= RULE_STRING
                    {
                    lv_value_0_2=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEnumerationLiteral1492); 

                    			createLeafNode(grammarAccess.getEnumerationLiteralAccess().getValueSTRINGTerminalRuleCall_0_0_1(), "value"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getEnumerationLiteralRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"value",
                    	        		lv_value_0_2, 
                    	        		"STRING", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }
                    break;

            }


            }


            }

            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:852:2: ( '::' ( (lv_annotation_2_0= RULE_STRING ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==25) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:852:4: '::' ( (lv_annotation_2_0= RULE_STRING ) )
                    {
                    match(input,25,FOLLOW_25_in_ruleEnumerationLiteral1511); 

                            createLeafNode(grammarAccess.getEnumerationLiteralAccess().getColonColonKeyword_1_0(), null); 
                        
                    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:856:1: ( (lv_annotation_2_0= RULE_STRING ) )
                    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:857:1: (lv_annotation_2_0= RULE_STRING )
                    {
                    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:857:1: (lv_annotation_2_0= RULE_STRING )
                    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:858:3: lv_annotation_2_0= RULE_STRING
                    {
                    lv_annotation_2_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEnumerationLiteral1528); 

                    			createLeafNode(grammarAccess.getEnumerationLiteralAccess().getAnnotationSTRINGTerminalRuleCall_1_1_0(), "annotation"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getEnumerationLiteralRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"annotation",
                    	        		lv_annotation_2_0, 
                    	        		"STRING", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

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
    // $ANTLR end ruleEnumerationLiteral


    // $ANTLR start entryRuleMaxLengthFacet
    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:888:1: entryRuleMaxLengthFacet returns [EObject current=null] : iv_ruleMaxLengthFacet= ruleMaxLengthFacet EOF ;
    public final EObject entryRuleMaxLengthFacet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMaxLengthFacet = null;


        try {
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:889:2: (iv_ruleMaxLengthFacet= ruleMaxLengthFacet EOF )
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:890:2: iv_ruleMaxLengthFacet= ruleMaxLengthFacet EOF
            {
             currentNode = createCompositeNode(grammarAccess.getMaxLengthFacetRule(), currentNode); 
            pushFollow(FOLLOW_ruleMaxLengthFacet_in_entryRuleMaxLengthFacet1571);
            iv_ruleMaxLengthFacet=ruleMaxLengthFacet();
            _fsp--;

             current =iv_ruleMaxLengthFacet; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMaxLengthFacet1581); 

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
    // $ANTLR end entryRuleMaxLengthFacet


    // $ANTLR start ruleMaxLengthFacet
    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:897:1: ruleMaxLengthFacet returns [EObject current=null] : ( 'maxLength' '=' ( (lv_maxLength_2_0= RULE_INT ) ) ) ;
    public final EObject ruleMaxLengthFacet() throws RecognitionException {
        EObject current = null;

        Token lv_maxLength_2_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:902:6: ( ( 'maxLength' '=' ( (lv_maxLength_2_0= RULE_INT ) ) ) )
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:903:1: ( 'maxLength' '=' ( (lv_maxLength_2_0= RULE_INT ) ) )
            {
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:903:1: ( 'maxLength' '=' ( (lv_maxLength_2_0= RULE_INT ) ) )
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:903:3: 'maxLength' '=' ( (lv_maxLength_2_0= RULE_INT ) )
            {
            match(input,26,FOLLOW_26_in_ruleMaxLengthFacet1616); 

                    createLeafNode(grammarAccess.getMaxLengthFacetAccess().getMaxLengthKeyword_0(), null); 
                
            match(input,27,FOLLOW_27_in_ruleMaxLengthFacet1626); 

                    createLeafNode(grammarAccess.getMaxLengthFacetAccess().getEqualsSignKeyword_1(), null); 
                
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:911:1: ( (lv_maxLength_2_0= RULE_INT ) )
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:912:1: (lv_maxLength_2_0= RULE_INT )
            {
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:912:1: (lv_maxLength_2_0= RULE_INT )
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:913:3: lv_maxLength_2_0= RULE_INT
            {
            lv_maxLength_2_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleMaxLengthFacet1643); 

            			createLeafNode(grammarAccess.getMaxLengthFacetAccess().getMaxLengthINTTerminalRuleCall_2_0(), "maxLength"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getMaxLengthFacetRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"maxLength",
            	        		lv_maxLength_2_0, 
            	        		"INT", 
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
    // $ANTLR end ruleMaxLengthFacet


    // $ANTLR start entryRulePatternFacet
    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:943:1: entryRulePatternFacet returns [EObject current=null] : iv_rulePatternFacet= rulePatternFacet EOF ;
    public final EObject entryRulePatternFacet() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePatternFacet = null;


        try {
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:944:2: (iv_rulePatternFacet= rulePatternFacet EOF )
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:945:2: iv_rulePatternFacet= rulePatternFacet EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPatternFacetRule(), currentNode); 
            pushFollow(FOLLOW_rulePatternFacet_in_entryRulePatternFacet1684);
            iv_rulePatternFacet=rulePatternFacet();
            _fsp--;

             current =iv_rulePatternFacet; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePatternFacet1694); 

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
    // $ANTLR end entryRulePatternFacet


    // $ANTLR start rulePatternFacet
    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:952:1: rulePatternFacet returns [EObject current=null] : ( 'pattern' '=' ( (lv_pattern_2_0= RULE_PATTERN_STRING ) ) ) ;
    public final EObject rulePatternFacet() throws RecognitionException {
        EObject current = null;

        Token lv_pattern_2_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:957:6: ( ( 'pattern' '=' ( (lv_pattern_2_0= RULE_PATTERN_STRING ) ) ) )
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:958:1: ( 'pattern' '=' ( (lv_pattern_2_0= RULE_PATTERN_STRING ) ) )
            {
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:958:1: ( 'pattern' '=' ( (lv_pattern_2_0= RULE_PATTERN_STRING ) ) )
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:958:3: 'pattern' '=' ( (lv_pattern_2_0= RULE_PATTERN_STRING ) )
            {
            match(input,28,FOLLOW_28_in_rulePatternFacet1729); 

                    createLeafNode(grammarAccess.getPatternFacetAccess().getPatternKeyword_0(), null); 
                
            match(input,27,FOLLOW_27_in_rulePatternFacet1739); 

                    createLeafNode(grammarAccess.getPatternFacetAccess().getEqualsSignKeyword_1(), null); 
                
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:966:1: ( (lv_pattern_2_0= RULE_PATTERN_STRING ) )
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:967:1: (lv_pattern_2_0= RULE_PATTERN_STRING )
            {
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:967:1: (lv_pattern_2_0= RULE_PATTERN_STRING )
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:968:3: lv_pattern_2_0= RULE_PATTERN_STRING
            {
            lv_pattern_2_0=(Token)input.LT(1);
            match(input,RULE_PATTERN_STRING,FOLLOW_RULE_PATTERN_STRING_in_rulePatternFacet1756); 

            			createLeafNode(grammarAccess.getPatternFacetAccess().getPatternPATTERN_STRINGTerminalRuleCall_2_0(), "pattern"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getPatternFacetRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"pattern",
            	        		lv_pattern_2_0, 
            	        		"PATTERN_STRING", 
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
    // $ANTLR end rulePatternFacet


    // $ANTLR start entryRuleRangeFacet
    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:998:1: entryRuleRangeFacet returns [EObject current=null] : iv_ruleRangeFacet= ruleRangeFacet EOF ;
    public final EObject entryRuleRangeFacet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRangeFacet = null;


        try {
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:999:2: (iv_ruleRangeFacet= ruleRangeFacet EOF )
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1000:2: iv_ruleRangeFacet= ruleRangeFacet EOF
            {
             currentNode = createCompositeNode(grammarAccess.getRangeFacetRule(), currentNode); 
            pushFollow(FOLLOW_ruleRangeFacet_in_entryRuleRangeFacet1797);
            iv_ruleRangeFacet=ruleRangeFacet();
            _fsp--;

             current =iv_ruleRangeFacet; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRangeFacet1807); 

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
    // $ANTLR end entryRuleRangeFacet


    // $ANTLR start ruleRangeFacet
    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1007:1: ruleRangeFacet returns [EObject current=null] : ( 'range' '=' ( (lv_lower_2_0= RULE_INT ) ) '..' ( (lv_upper_4_0= RULE_INT ) ) ) ;
    public final EObject ruleRangeFacet() throws RecognitionException {
        EObject current = null;

        Token lv_lower_2_0=null;
        Token lv_upper_4_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1012:6: ( ( 'range' '=' ( (lv_lower_2_0= RULE_INT ) ) '..' ( (lv_upper_4_0= RULE_INT ) ) ) )
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1013:1: ( 'range' '=' ( (lv_lower_2_0= RULE_INT ) ) '..' ( (lv_upper_4_0= RULE_INT ) ) )
            {
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1013:1: ( 'range' '=' ( (lv_lower_2_0= RULE_INT ) ) '..' ( (lv_upper_4_0= RULE_INT ) ) )
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1013:3: 'range' '=' ( (lv_lower_2_0= RULE_INT ) ) '..' ( (lv_upper_4_0= RULE_INT ) )
            {
            match(input,29,FOLLOW_29_in_ruleRangeFacet1842); 

                    createLeafNode(grammarAccess.getRangeFacetAccess().getRangeKeyword_0(), null); 
                
            match(input,27,FOLLOW_27_in_ruleRangeFacet1852); 

                    createLeafNode(grammarAccess.getRangeFacetAccess().getEqualsSignKeyword_1(), null); 
                
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1021:1: ( (lv_lower_2_0= RULE_INT ) )
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1022:1: (lv_lower_2_0= RULE_INT )
            {
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1022:1: (lv_lower_2_0= RULE_INT )
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1023:3: lv_lower_2_0= RULE_INT
            {
            lv_lower_2_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleRangeFacet1869); 

            			createLeafNode(grammarAccess.getRangeFacetAccess().getLowerINTTerminalRuleCall_2_0(), "lower"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getRangeFacetRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"lower",
            	        		lv_lower_2_0, 
            	        		"INT", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,30,FOLLOW_30_in_ruleRangeFacet1884); 

                    createLeafNode(grammarAccess.getRangeFacetAccess().getFullStopFullStopKeyword_3(), null); 
                
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1049:1: ( (lv_upper_4_0= RULE_INT ) )
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1050:1: (lv_upper_4_0= RULE_INT )
            {
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1050:1: (lv_upper_4_0= RULE_INT )
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1051:3: lv_upper_4_0= RULE_INT
            {
            lv_upper_4_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleRangeFacet1901); 

            			createLeafNode(grammarAccess.getRangeFacetAccess().getUpperINTTerminalRuleCall_4_0(), "upper"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getRangeFacetRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"upper",
            	        		lv_upper_4_0, 
            	        		"INT", 
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
    // $ANTLR end ruleRangeFacet


    // $ANTLR start entryRuleLengthFacet
    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1081:1: entryRuleLengthFacet returns [EObject current=null] : iv_ruleLengthFacet= ruleLengthFacet EOF ;
    public final EObject entryRuleLengthFacet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLengthFacet = null;


        try {
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1082:2: (iv_ruleLengthFacet= ruleLengthFacet EOF )
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1083:2: iv_ruleLengthFacet= ruleLengthFacet EOF
            {
             currentNode = createCompositeNode(grammarAccess.getLengthFacetRule(), currentNode); 
            pushFollow(FOLLOW_ruleLengthFacet_in_entryRuleLengthFacet1942);
            iv_ruleLengthFacet=ruleLengthFacet();
            _fsp--;

             current =iv_ruleLengthFacet; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLengthFacet1952); 

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
    // $ANTLR end entryRuleLengthFacet


    // $ANTLR start ruleLengthFacet
    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1090:1: ruleLengthFacet returns [EObject current=null] : ( 'length' '=' ( (lv_length_2_0= RULE_INT ) ) ) ;
    public final EObject ruleLengthFacet() throws RecognitionException {
        EObject current = null;

        Token lv_length_2_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1095:6: ( ( 'length' '=' ( (lv_length_2_0= RULE_INT ) ) ) )
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1096:1: ( 'length' '=' ( (lv_length_2_0= RULE_INT ) ) )
            {
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1096:1: ( 'length' '=' ( (lv_length_2_0= RULE_INT ) ) )
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1096:3: 'length' '=' ( (lv_length_2_0= RULE_INT ) )
            {
            match(input,31,FOLLOW_31_in_ruleLengthFacet1987); 

                    createLeafNode(grammarAccess.getLengthFacetAccess().getLengthKeyword_0(), null); 
                
            match(input,27,FOLLOW_27_in_ruleLengthFacet1997); 

                    createLeafNode(grammarAccess.getLengthFacetAccess().getEqualsSignKeyword_1(), null); 
                
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1104:1: ( (lv_length_2_0= RULE_INT ) )
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1105:1: (lv_length_2_0= RULE_INT )
            {
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1105:1: (lv_length_2_0= RULE_INT )
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1106:3: lv_length_2_0= RULE_INT
            {
            lv_length_2_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleLengthFacet2014); 

            			createLeafNode(grammarAccess.getLengthFacetAccess().getLengthINTTerminalRuleCall_2_0(), "length"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getLengthFacetRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"length",
            	        		lv_length_2_0, 
            	        		"INT", 
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
    // $ANTLR end ruleLengthFacet


    // $ANTLR start entryRuleDocumentation
    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1136:1: entryRuleDocumentation returns [EObject current=null] : iv_ruleDocumentation= ruleDocumentation EOF ;
    public final EObject entryRuleDocumentation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDocumentation = null;


        try {
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1137:2: (iv_ruleDocumentation= ruleDocumentation EOF )
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1138:2: iv_ruleDocumentation= ruleDocumentation EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDocumentationRule(), currentNode); 
            pushFollow(FOLLOW_ruleDocumentation_in_entryRuleDocumentation2055);
            iv_ruleDocumentation=ruleDocumentation();
            _fsp--;

             current =iv_ruleDocumentation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDocumentation2065); 

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
    // $ANTLR end entryRuleDocumentation


    // $ANTLR start ruleDocumentation
    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1145:1: ruleDocumentation returns [EObject current=null] : ( '::' ( (lv_text_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleDocumentation() throws RecognitionException {
        EObject current = null;

        Token lv_text_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1150:6: ( ( '::' ( (lv_text_1_0= RULE_STRING ) ) ) )
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1151:1: ( '::' ( (lv_text_1_0= RULE_STRING ) ) )
            {
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1151:1: ( '::' ( (lv_text_1_0= RULE_STRING ) ) )
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1151:3: '::' ( (lv_text_1_0= RULE_STRING ) )
            {
            match(input,25,FOLLOW_25_in_ruleDocumentation2100); 

                    createLeafNode(grammarAccess.getDocumentationAccess().getColonColonKeyword_0(), null); 
                
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1155:1: ( (lv_text_1_0= RULE_STRING ) )
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1156:1: (lv_text_1_0= RULE_STRING )
            {
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1156:1: (lv_text_1_0= RULE_STRING )
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1157:3: lv_text_1_0= RULE_STRING
            {
            lv_text_1_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDocumentation2117); 

            			createLeafNode(grammarAccess.getDocumentationAccess().getTextSTRINGTerminalRuleCall_1_0(), "text"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getDocumentationRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"text",
            	        		lv_text_1_0, 
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
    // $ANTLR end ruleDocumentation


    // $ANTLR start entryRuleTopLevelComplexType
    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1187:1: entryRuleTopLevelComplexType returns [EObject current=null] : iv_ruleTopLevelComplexType= ruleTopLevelComplexType EOF ;
    public final EObject entryRuleTopLevelComplexType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTopLevelComplexType = null;


        try {
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1188:2: (iv_ruleTopLevelComplexType= ruleTopLevelComplexType EOF )
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1189:2: iv_ruleTopLevelComplexType= ruleTopLevelComplexType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTopLevelComplexTypeRule(), currentNode); 
            pushFollow(FOLLOW_ruleTopLevelComplexType_in_entryRuleTopLevelComplexType2158);
            iv_ruleTopLevelComplexType=ruleTopLevelComplexType();
            _fsp--;

             current =iv_ruleTopLevelComplexType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTopLevelComplexType2168); 

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
    // $ANTLR end entryRuleTopLevelComplexType


    // $ANTLR start ruleTopLevelComplexType
    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1196:1: ruleTopLevelComplexType returns [EObject current=null] : ( ( (lv_abstract_0_0= 'abstract' ) )? 'complex-type' ( (lv_name_2_0= RULE_ID ) ) ( 'extends' ( (lv_extends_4_0= ruleTopLevelComplexTypeReference ) ) )? '{' ( (lv_properties_6_0= ruleProperty ) )* '}' ( 'documentation:' ( (lv_documentation_9_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleTopLevelComplexType() throws RecognitionException {
        EObject current = null;

        Token lv_abstract_0_0=null;
        Token lv_name_2_0=null;
        Token lv_documentation_9_0=null;
        EObject lv_extends_4_0 = null;

        EObject lv_properties_6_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1201:6: ( ( ( (lv_abstract_0_0= 'abstract' ) )? 'complex-type' ( (lv_name_2_0= RULE_ID ) ) ( 'extends' ( (lv_extends_4_0= ruleTopLevelComplexTypeReference ) ) )? '{' ( (lv_properties_6_0= ruleProperty ) )* '}' ( 'documentation:' ( (lv_documentation_9_0= RULE_STRING ) ) )? ) )
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1202:1: ( ( (lv_abstract_0_0= 'abstract' ) )? 'complex-type' ( (lv_name_2_0= RULE_ID ) ) ( 'extends' ( (lv_extends_4_0= ruleTopLevelComplexTypeReference ) ) )? '{' ( (lv_properties_6_0= ruleProperty ) )* '}' ( 'documentation:' ( (lv_documentation_9_0= RULE_STRING ) ) )? )
            {
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1202:1: ( ( (lv_abstract_0_0= 'abstract' ) )? 'complex-type' ( (lv_name_2_0= RULE_ID ) ) ( 'extends' ( (lv_extends_4_0= ruleTopLevelComplexTypeReference ) ) )? '{' ( (lv_properties_6_0= ruleProperty ) )* '}' ( 'documentation:' ( (lv_documentation_9_0= RULE_STRING ) ) )? )
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1202:2: ( (lv_abstract_0_0= 'abstract' ) )? 'complex-type' ( (lv_name_2_0= RULE_ID ) ) ( 'extends' ( (lv_extends_4_0= ruleTopLevelComplexTypeReference ) ) )? '{' ( (lv_properties_6_0= ruleProperty ) )* '}' ( 'documentation:' ( (lv_documentation_9_0= RULE_STRING ) ) )?
            {
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1202:2: ( (lv_abstract_0_0= 'abstract' ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==32) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1203:1: (lv_abstract_0_0= 'abstract' )
                    {
                    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1203:1: (lv_abstract_0_0= 'abstract' )
                    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1204:3: lv_abstract_0_0= 'abstract'
                    {
                    lv_abstract_0_0=(Token)input.LT(1);
                    match(input,32,FOLLOW_32_in_ruleTopLevelComplexType2211); 

                            createLeafNode(grammarAccess.getTopLevelComplexTypeAccess().getAbstractAbstractKeyword_0_0(), "abstract"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getTopLevelComplexTypeRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "abstract", true, "abstract", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }
                    break;

            }

            match(input,33,FOLLOW_33_in_ruleTopLevelComplexType2235); 

                    createLeafNode(grammarAccess.getTopLevelComplexTypeAccess().getComplexTypeKeyword_1(), null); 
                
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1227:1: ( (lv_name_2_0= RULE_ID ) )
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1228:1: (lv_name_2_0= RULE_ID )
            {
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1228:1: (lv_name_2_0= RULE_ID )
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1229:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTopLevelComplexType2252); 

            			createLeafNode(grammarAccess.getTopLevelComplexTypeAccess().getNameIDTerminalRuleCall_2_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getTopLevelComplexTypeRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_2_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1251:2: ( 'extends' ( (lv_extends_4_0= ruleTopLevelComplexTypeReference ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==34) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1251:4: 'extends' ( (lv_extends_4_0= ruleTopLevelComplexTypeReference ) )
                    {
                    match(input,34,FOLLOW_34_in_ruleTopLevelComplexType2268); 

                            createLeafNode(grammarAccess.getTopLevelComplexTypeAccess().getExtendsKeyword_3_0(), null); 
                        
                    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1255:1: ( (lv_extends_4_0= ruleTopLevelComplexTypeReference ) )
                    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1256:1: (lv_extends_4_0= ruleTopLevelComplexTypeReference )
                    {
                    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1256:1: (lv_extends_4_0= ruleTopLevelComplexTypeReference )
                    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1257:3: lv_extends_4_0= ruleTopLevelComplexTypeReference
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getTopLevelComplexTypeAccess().getExtendsTopLevelComplexTypeReferenceParserRuleCall_3_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleTopLevelComplexTypeReference_in_ruleTopLevelComplexType2289);
                    lv_extends_4_0=ruleTopLevelComplexTypeReference();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getTopLevelComplexTypeRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"extends",
                    	        		lv_extends_4_0, 
                    	        		"TopLevelComplexTypeReference", 
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

            match(input,23,FOLLOW_23_in_ruleTopLevelComplexType2301); 

                    createLeafNode(grammarAccess.getTopLevelComplexTypeAccess().getLeftCurlyBracketKeyword_4(), null); 
                
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1283:1: ( (lv_properties_6_0= ruleProperty ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID||(LA15_0>=36 && LA15_0<=37)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1284:1: (lv_properties_6_0= ruleProperty )
            	    {
            	    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1284:1: (lv_properties_6_0= ruleProperty )
            	    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1285:3: lv_properties_6_0= ruleProperty
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getTopLevelComplexTypeAccess().getPropertiesPropertyParserRuleCall_5_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleProperty_in_ruleTopLevelComplexType2322);
            	    lv_properties_6_0=ruleProperty();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getTopLevelComplexTypeRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"properties",
            	    	        		lv_properties_6_0, 
            	    	        		"Property", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            match(input,24,FOLLOW_24_in_ruleTopLevelComplexType2333); 

                    createLeafNode(grammarAccess.getTopLevelComplexTypeAccess().getRightCurlyBracketKeyword_6(), null); 
                
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1311:1: ( 'documentation:' ( (lv_documentation_9_0= RULE_STRING ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==35) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1311:3: 'documentation:' ( (lv_documentation_9_0= RULE_STRING ) )
                    {
                    match(input,35,FOLLOW_35_in_ruleTopLevelComplexType2344); 

                            createLeafNode(grammarAccess.getTopLevelComplexTypeAccess().getDocumentationKeyword_7_0(), null); 
                        
                    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1315:1: ( (lv_documentation_9_0= RULE_STRING ) )
                    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1316:1: (lv_documentation_9_0= RULE_STRING )
                    {
                    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1316:1: (lv_documentation_9_0= RULE_STRING )
                    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1317:3: lv_documentation_9_0= RULE_STRING
                    {
                    lv_documentation_9_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTopLevelComplexType2361); 

                    			createLeafNode(grammarAccess.getTopLevelComplexTypeAccess().getDocumentationSTRINGTerminalRuleCall_7_1_0(), "documentation"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getTopLevelComplexTypeRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"documentation",
                    	        		lv_documentation_9_0, 
                    	        		"STRING", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

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
    // $ANTLR end ruleTopLevelComplexType


    // $ANTLR start entryRuleProperty
    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1347:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1348:2: (iv_ruleProperty= ruleProperty EOF )
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1349:2: iv_ruleProperty= ruleProperty EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPropertyRule(), currentNode); 
            pushFollow(FOLLOW_ruleProperty_in_entryRuleProperty2404);
            iv_ruleProperty=ruleProperty();
            _fsp--;

             current =iv_ruleProperty; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProperty2414); 

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
    // $ANTLR end entryRuleProperty


    // $ANTLR start ruleProperty
    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1356:1: ruleProperty returns [EObject current=null] : (this_Element_0= ruleElement | this_Attribute_1= ruleAttribute ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        EObject this_Element_0 = null;

        EObject this_Attribute_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1361:6: ( (this_Element_0= ruleElement | this_Attribute_1= ruleAttribute ) )
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1362:1: (this_Element_0= ruleElement | this_Attribute_1= ruleAttribute )
            {
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1362:1: (this_Element_0= ruleElement | this_Attribute_1= ruleAttribute )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_ID) ) {
                alt17=1;
            }
            else if ( ((LA17_0>=36 && LA17_0<=37)) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1362:1: (this_Element_0= ruleElement | this_Attribute_1= ruleAttribute )", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1363:5: this_Element_0= ruleElement
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getPropertyAccess().getElementParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleElement_in_ruleProperty2461);
                    this_Element_0=ruleElement();
                    _fsp--;

                     
                            current = this_Element_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1373:5: this_Attribute_1= ruleAttribute
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getPropertyAccess().getAttributeParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleAttribute_in_ruleProperty2488);
                    this_Attribute_1=ruleAttribute();
                    _fsp--;

                     
                            current = this_Attribute_1; 
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
    // $ANTLR end ruleProperty


    // $ANTLR start entryRuleElement
    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1389:1: entryRuleElement returns [EObject current=null] : iv_ruleElement= ruleElement EOF ;
    public final EObject entryRuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElement = null;


        try {
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1390:2: (iv_ruleElement= ruleElement EOF )
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1391:2: iv_ruleElement= ruleElement EOF
            {
             currentNode = createCompositeNode(grammarAccess.getElementRule(), currentNode); 
            pushFollow(FOLLOW_ruleElement_in_entryRuleElement2523);
            iv_ruleElement=ruleElement();
            _fsp--;

             current =iv_ruleElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleElement2533); 

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
    // $ANTLR end entryRuleElement


    // $ANTLR start ruleElement
    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1398:1: ruleElement returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( ( '->' ( (lv_typeRef_2_0= ruleNamedTypeReference ) ) ) | ( ':' ( (lv_embeddedTypeDef_4_0= ruleEmbeddedType ) ) ) ) ( (lv_multiplicity_5_0= ruleMultiplicity ) )? ) ;
    public final EObject ruleElement() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_typeRef_2_0 = null;

        EObject lv_embeddedTypeDef_4_0 = null;

        EObject lv_multiplicity_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1403:6: ( ( ( (lv_name_0_0= RULE_ID ) ) ( ( '->' ( (lv_typeRef_2_0= ruleNamedTypeReference ) ) ) | ( ':' ( (lv_embeddedTypeDef_4_0= ruleEmbeddedType ) ) ) ) ( (lv_multiplicity_5_0= ruleMultiplicity ) )? ) )
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1404:1: ( ( (lv_name_0_0= RULE_ID ) ) ( ( '->' ( (lv_typeRef_2_0= ruleNamedTypeReference ) ) ) | ( ':' ( (lv_embeddedTypeDef_4_0= ruleEmbeddedType ) ) ) ) ( (lv_multiplicity_5_0= ruleMultiplicity ) )? )
            {
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1404:1: ( ( (lv_name_0_0= RULE_ID ) ) ( ( '->' ( (lv_typeRef_2_0= ruleNamedTypeReference ) ) ) | ( ':' ( (lv_embeddedTypeDef_4_0= ruleEmbeddedType ) ) ) ) ( (lv_multiplicity_5_0= ruleMultiplicity ) )? )
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1404:2: ( (lv_name_0_0= RULE_ID ) ) ( ( '->' ( (lv_typeRef_2_0= ruleNamedTypeReference ) ) ) | ( ':' ( (lv_embeddedTypeDef_4_0= ruleEmbeddedType ) ) ) ) ( (lv_multiplicity_5_0= ruleMultiplicity ) )?
            {
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1404:2: ( (lv_name_0_0= RULE_ID ) )
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1405:1: (lv_name_0_0= RULE_ID )
            {
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1405:1: (lv_name_0_0= RULE_ID )
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1406:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleElement2575); 

            			createLeafNode(grammarAccess.getElementAccess().getNameIDTerminalRuleCall_0_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getElementRule().getType().getClassifier());
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

            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1428:2: ( ( '->' ( (lv_typeRef_2_0= ruleNamedTypeReference ) ) ) | ( ':' ( (lv_embeddedTypeDef_4_0= ruleEmbeddedType ) ) ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==17) ) {
                alt18=1;
            }
            else if ( (LA18_0==18) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1428:2: ( ( '->' ( (lv_typeRef_2_0= ruleNamedTypeReference ) ) ) | ( ':' ( (lv_embeddedTypeDef_4_0= ruleEmbeddedType ) ) ) )", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1428:3: ( '->' ( (lv_typeRef_2_0= ruleNamedTypeReference ) ) )
                    {
                    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1428:3: ( '->' ( (lv_typeRef_2_0= ruleNamedTypeReference ) ) )
                    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1428:5: '->' ( (lv_typeRef_2_0= ruleNamedTypeReference ) )
                    {
                    match(input,17,FOLLOW_17_in_ruleElement2592); 

                            createLeafNode(grammarAccess.getElementAccess().getHyphenMinusGreaterThanSignKeyword_1_0_0(), null); 
                        
                    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1432:1: ( (lv_typeRef_2_0= ruleNamedTypeReference ) )
                    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1433:1: (lv_typeRef_2_0= ruleNamedTypeReference )
                    {
                    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1433:1: (lv_typeRef_2_0= ruleNamedTypeReference )
                    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1434:3: lv_typeRef_2_0= ruleNamedTypeReference
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getElementAccess().getTypeRefNamedTypeReferenceParserRuleCall_1_0_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleNamedTypeReference_in_ruleElement2613);
                    lv_typeRef_2_0=ruleNamedTypeReference();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getElementRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"typeRef",
                    	        		lv_typeRef_2_0, 
                    	        		"NamedTypeReference", 
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
                case 2 :
                    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1457:6: ( ':' ( (lv_embeddedTypeDef_4_0= ruleEmbeddedType ) ) )
                    {
                    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1457:6: ( ':' ( (lv_embeddedTypeDef_4_0= ruleEmbeddedType ) ) )
                    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1457:8: ':' ( (lv_embeddedTypeDef_4_0= ruleEmbeddedType ) )
                    {
                    match(input,18,FOLLOW_18_in_ruleElement2631); 

                            createLeafNode(grammarAccess.getElementAccess().getColonKeyword_1_1_0(), null); 
                        
                    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1461:1: ( (lv_embeddedTypeDef_4_0= ruleEmbeddedType ) )
                    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1462:1: (lv_embeddedTypeDef_4_0= ruleEmbeddedType )
                    {
                    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1462:1: (lv_embeddedTypeDef_4_0= ruleEmbeddedType )
                    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1463:3: lv_embeddedTypeDef_4_0= ruleEmbeddedType
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getElementAccess().getEmbeddedTypeDefEmbeddedTypeParserRuleCall_1_1_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleEmbeddedType_in_ruleElement2652);
                    lv_embeddedTypeDef_4_0=ruleEmbeddedType();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getElementRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"embeddedTypeDef",
                    	        		lv_embeddedTypeDef_4_0, 
                    	        		"EmbeddedType", 
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

            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1485:4: ( (lv_multiplicity_5_0= ruleMultiplicity ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==20) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1486:1: (lv_multiplicity_5_0= ruleMultiplicity )
                    {
                    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1486:1: (lv_multiplicity_5_0= ruleMultiplicity )
                    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1487:3: lv_multiplicity_5_0= ruleMultiplicity
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getElementAccess().getMultiplicityMultiplicityParserRuleCall_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleMultiplicity_in_ruleElement2675);
                    lv_multiplicity_5_0=ruleMultiplicity();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getElementRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"multiplicity",
                    	        		lv_multiplicity_5_0, 
                    	        		"Multiplicity", 
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
    // $ANTLR end ruleElement


    // $ANTLR start entryRuleAttribute
    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1517:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1518:2: (iv_ruleAttribute= ruleAttribute EOF )
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1519:2: iv_ruleAttribute= ruleAttribute EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAttributeRule(), currentNode); 
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute2712);
            iv_ruleAttribute=ruleAttribute();
            _fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute2722); 

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
    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1526:1: ruleAttribute returns [EObject current=null] : ( ( (lv_required_0_0= 'required' ) )? '@' ( (lv_name_2_0= RULE_ID ) ) '->' ( (lv_typeRef_4_0= ruleNonComplexTypeReference ) ) ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_required_0_0=null;
        Token lv_name_2_0=null;
        EObject lv_typeRef_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1531:6: ( ( ( (lv_required_0_0= 'required' ) )? '@' ( (lv_name_2_0= RULE_ID ) ) '->' ( (lv_typeRef_4_0= ruleNonComplexTypeReference ) ) ) )
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1532:1: ( ( (lv_required_0_0= 'required' ) )? '@' ( (lv_name_2_0= RULE_ID ) ) '->' ( (lv_typeRef_4_0= ruleNonComplexTypeReference ) ) )
            {
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1532:1: ( ( (lv_required_0_0= 'required' ) )? '@' ( (lv_name_2_0= RULE_ID ) ) '->' ( (lv_typeRef_4_0= ruleNonComplexTypeReference ) ) )
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1532:2: ( (lv_required_0_0= 'required' ) )? '@' ( (lv_name_2_0= RULE_ID ) ) '->' ( (lv_typeRef_4_0= ruleNonComplexTypeReference ) )
            {
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1532:2: ( (lv_required_0_0= 'required' ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==36) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1533:1: (lv_required_0_0= 'required' )
                    {
                    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1533:1: (lv_required_0_0= 'required' )
                    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1534:3: lv_required_0_0= 'required'
                    {
                    lv_required_0_0=(Token)input.LT(1);
                    match(input,36,FOLLOW_36_in_ruleAttribute2765); 

                            createLeafNode(grammarAccess.getAttributeAccess().getRequiredRequiredKeyword_0_0(), "required"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getAttributeRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "required", true, "required", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }
                    break;

            }

            match(input,37,FOLLOW_37_in_ruleAttribute2789); 

                    createLeafNode(grammarAccess.getAttributeAccess().getCommercialAtKeyword_1(), null); 
                
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1557:1: ( (lv_name_2_0= RULE_ID ) )
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1558:1: (lv_name_2_0= RULE_ID )
            {
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1558:1: (lv_name_2_0= RULE_ID )
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1559:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttribute2806); 

            			createLeafNode(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_2_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getAttributeRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_2_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,17,FOLLOW_17_in_ruleAttribute2821); 

                    createLeafNode(grammarAccess.getAttributeAccess().getHyphenMinusGreaterThanSignKeyword_3(), null); 
                
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1585:1: ( (lv_typeRef_4_0= ruleNonComplexTypeReference ) )
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1586:1: (lv_typeRef_4_0= ruleNonComplexTypeReference )
            {
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1586:1: (lv_typeRef_4_0= ruleNonComplexTypeReference )
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1587:3: lv_typeRef_4_0= ruleNonComplexTypeReference
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getAttributeAccess().getTypeRefNonComplexTypeReferenceParserRuleCall_4_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleNonComplexTypeReference_in_ruleAttribute2842);
            lv_typeRef_4_0=ruleNonComplexTypeReference();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getAttributeRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"typeRef",
            	        		lv_typeRef_4_0, 
            	        		"NonComplexTypeReference", 
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
    // $ANTLR end ruleAttribute


    // $ANTLR start entryRuleMultiplicity
    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1617:1: entryRuleMultiplicity returns [EObject current=null] : iv_ruleMultiplicity= ruleMultiplicity EOF ;
    public final EObject entryRuleMultiplicity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicity = null;


        try {
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1618:2: (iv_ruleMultiplicity= ruleMultiplicity EOF )
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1619:2: iv_ruleMultiplicity= ruleMultiplicity EOF
            {
             currentNode = createCompositeNode(grammarAccess.getMultiplicityRule(), currentNode); 
            pushFollow(FOLLOW_ruleMultiplicity_in_entryRuleMultiplicity2878);
            iv_ruleMultiplicity=ruleMultiplicity();
            _fsp--;

             current =iv_ruleMultiplicity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiplicity2888); 

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
    // $ANTLR end entryRuleMultiplicity


    // $ANTLR start ruleMultiplicity
    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1626:1: ruleMultiplicity returns [EObject current=null] : ( () '[' ( ( (lv_lower_2_0= RULE_INT ) ) '..' ) ( ( (lv_upper_4_0= RULE_INT ) ) | ( (lv_unbounded_5_0= '*' ) ) ) ']' ) ;
    public final EObject ruleMultiplicity() throws RecognitionException {
        EObject current = null;

        Token lv_lower_2_0=null;
        Token lv_upper_4_0=null;
        Token lv_unbounded_5_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1631:6: ( ( () '[' ( ( (lv_lower_2_0= RULE_INT ) ) '..' ) ( ( (lv_upper_4_0= RULE_INT ) ) | ( (lv_unbounded_5_0= '*' ) ) ) ']' ) )
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1632:1: ( () '[' ( ( (lv_lower_2_0= RULE_INT ) ) '..' ) ( ( (lv_upper_4_0= RULE_INT ) ) | ( (lv_unbounded_5_0= '*' ) ) ) ']' )
            {
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1632:1: ( () '[' ( ( (lv_lower_2_0= RULE_INT ) ) '..' ) ( ( (lv_upper_4_0= RULE_INT ) ) | ( (lv_unbounded_5_0= '*' ) ) ) ']' )
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1632:2: () '[' ( ( (lv_lower_2_0= RULE_INT ) ) '..' ) ( ( (lv_upper_4_0= RULE_INT ) ) | ( (lv_unbounded_5_0= '*' ) ) ) ']'
            {
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1632:2: ()
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1633:5: 
            {
             
                    temp=factory.create(grammarAccess.getMultiplicityAccess().getMultiplicityAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getMultiplicityAccess().getMultiplicityAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            match(input,20,FOLLOW_20_in_ruleMultiplicity2932); 

                    createLeafNode(grammarAccess.getMultiplicityAccess().getLeftSquareBracketKeyword_1(), null); 
                
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1647:1: ( ( (lv_lower_2_0= RULE_INT ) ) '..' )
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1647:2: ( (lv_lower_2_0= RULE_INT ) ) '..'
            {
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1647:2: ( (lv_lower_2_0= RULE_INT ) )
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1648:1: (lv_lower_2_0= RULE_INT )
            {
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1648:1: (lv_lower_2_0= RULE_INT )
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1649:3: lv_lower_2_0= RULE_INT
            {
            lv_lower_2_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleMultiplicity2950); 

            			createLeafNode(grammarAccess.getMultiplicityAccess().getLowerINTTerminalRuleCall_2_0_0(), "lower"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getMultiplicityRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"lower",
            	        		lv_lower_2_0, 
            	        		"INT", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,30,FOLLOW_30_in_ruleMultiplicity2965); 

                    createLeafNode(grammarAccess.getMultiplicityAccess().getFullStopFullStopKeyword_2_1(), null); 
                

            }

            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1675:2: ( ( (lv_upper_4_0= RULE_INT ) ) | ( (lv_unbounded_5_0= '*' ) ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_INT) ) {
                alt21=1;
            }
            else if ( (LA21_0==38) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1675:2: ( ( (lv_upper_4_0= RULE_INT ) ) | ( (lv_unbounded_5_0= '*' ) ) )", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1675:3: ( (lv_upper_4_0= RULE_INT ) )
                    {
                    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1675:3: ( (lv_upper_4_0= RULE_INT ) )
                    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1676:1: (lv_upper_4_0= RULE_INT )
                    {
                    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1676:1: (lv_upper_4_0= RULE_INT )
                    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1677:3: lv_upper_4_0= RULE_INT
                    {
                    lv_upper_4_0=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleMultiplicity2984); 

                    			createLeafNode(grammarAccess.getMultiplicityAccess().getUpperINTTerminalRuleCall_3_0_0(), "upper"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getMultiplicityRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"upper",
                    	        		lv_upper_4_0, 
                    	        		"INT", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1700:6: ( (lv_unbounded_5_0= '*' ) )
                    {
                    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1700:6: ( (lv_unbounded_5_0= '*' ) )
                    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1701:1: (lv_unbounded_5_0= '*' )
                    {
                    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1701:1: (lv_unbounded_5_0= '*' )
                    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1702:3: lv_unbounded_5_0= '*'
                    {
                    lv_unbounded_5_0=(Token)input.LT(1);
                    match(input,38,FOLLOW_38_in_ruleMultiplicity3013); 

                            createLeafNode(grammarAccess.getMultiplicityAccess().getUnboundedAsteriskKeyword_3_1_0(), "unbounded"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getMultiplicityRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "unbounded", true, "*", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }


                    }
                    break;

            }

            match(input,21,FOLLOW_21_in_ruleMultiplicity3037); 

                    createLeafNode(grammarAccess.getMultiplicityAccess().getRightSquareBracketKeyword_4(), null); 
                

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
    // $ANTLR end ruleMultiplicity


    // $ANTLR start entryRuleNamedTypeReference
    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1733:1: entryRuleNamedTypeReference returns [EObject current=null] : iv_ruleNamedTypeReference= ruleNamedTypeReference EOF ;
    public final EObject entryRuleNamedTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamedTypeReference = null;


        try {
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1734:2: (iv_ruleNamedTypeReference= ruleNamedTypeReference EOF )
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1735:2: iv_ruleNamedTypeReference= ruleNamedTypeReference EOF
            {
             currentNode = createCompositeNode(grammarAccess.getNamedTypeReferenceRule(), currentNode); 
            pushFollow(FOLLOW_ruleNamedTypeReference_in_entryRuleNamedTypeReference3073);
            iv_ruleNamedTypeReference=ruleNamedTypeReference();
            _fsp--;

             current =iv_ruleNamedTypeReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNamedTypeReference3083); 

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
    // $ANTLR end entryRuleNamedTypeReference


    // $ANTLR start ruleNamedTypeReference
    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1742:1: ruleNamedTypeReference returns [EObject current=null] : (this_TopLevelTypeReference_0= ruleTopLevelTypeReference | this_BuiltinTypeReference_1= ruleBuiltinTypeReference ) ;
    public final EObject ruleNamedTypeReference() throws RecognitionException {
        EObject current = null;

        EObject this_TopLevelTypeReference_0 = null;

        EObject this_BuiltinTypeReference_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1747:6: ( (this_TopLevelTypeReference_0= ruleTopLevelTypeReference | this_BuiltinTypeReference_1= ruleBuiltinTypeReference ) )
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1748:1: (this_TopLevelTypeReference_0= ruleTopLevelTypeReference | this_BuiltinTypeReference_1= ruleBuiltinTypeReference )
            {
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1748:1: (this_TopLevelTypeReference_0= ruleTopLevelTypeReference | this_BuiltinTypeReference_1= ruleBuiltinTypeReference )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_ID) ) {
                alt22=1;
            }
            else if ( ((LA22_0>=39 && LA22_0<=49)) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1748:1: (this_TopLevelTypeReference_0= ruleTopLevelTypeReference | this_BuiltinTypeReference_1= ruleBuiltinTypeReference )", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1749:5: this_TopLevelTypeReference_0= ruleTopLevelTypeReference
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getNamedTypeReferenceAccess().getTopLevelTypeReferenceParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleTopLevelTypeReference_in_ruleNamedTypeReference3130);
                    this_TopLevelTypeReference_0=ruleTopLevelTypeReference();
                    _fsp--;

                     
                            current = this_TopLevelTypeReference_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1759:5: this_BuiltinTypeReference_1= ruleBuiltinTypeReference
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getNamedTypeReferenceAccess().getBuiltinTypeReferenceParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleBuiltinTypeReference_in_ruleNamedTypeReference3157);
                    this_BuiltinTypeReference_1=ruleBuiltinTypeReference();
                    _fsp--;

                     
                            current = this_BuiltinTypeReference_1; 
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
    // $ANTLR end ruleNamedTypeReference


    // $ANTLR start entryRuleNonComplexTypeReference
    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1775:1: entryRuleNonComplexTypeReference returns [EObject current=null] : iv_ruleNonComplexTypeReference= ruleNonComplexTypeReference EOF ;
    public final EObject entryRuleNonComplexTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNonComplexTypeReference = null;


        try {
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1776:2: (iv_ruleNonComplexTypeReference= ruleNonComplexTypeReference EOF )
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1777:2: iv_ruleNonComplexTypeReference= ruleNonComplexTypeReference EOF
            {
             currentNode = createCompositeNode(grammarAccess.getNonComplexTypeReferenceRule(), currentNode); 
            pushFollow(FOLLOW_ruleNonComplexTypeReference_in_entryRuleNonComplexTypeReference3192);
            iv_ruleNonComplexTypeReference=ruleNonComplexTypeReference();
            _fsp--;

             current =iv_ruleNonComplexTypeReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNonComplexTypeReference3202); 

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
    // $ANTLR end entryRuleNonComplexTypeReference


    // $ANTLR start ruleNonComplexTypeReference
    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1784:1: ruleNonComplexTypeReference returns [EObject current=null] : (this_TopLevelSimpleTypeReference_0= ruleTopLevelSimpleTypeReference | this_BuiltinTypeReference_1= ruleBuiltinTypeReference ) ;
    public final EObject ruleNonComplexTypeReference() throws RecognitionException {
        EObject current = null;

        EObject this_TopLevelSimpleTypeReference_0 = null;

        EObject this_BuiltinTypeReference_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1789:6: ( (this_TopLevelSimpleTypeReference_0= ruleTopLevelSimpleTypeReference | this_BuiltinTypeReference_1= ruleBuiltinTypeReference ) )
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1790:1: (this_TopLevelSimpleTypeReference_0= ruleTopLevelSimpleTypeReference | this_BuiltinTypeReference_1= ruleBuiltinTypeReference )
            {
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1790:1: (this_TopLevelSimpleTypeReference_0= ruleTopLevelSimpleTypeReference | this_BuiltinTypeReference_1= ruleBuiltinTypeReference )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_ID) ) {
                alt23=1;
            }
            else if ( ((LA23_0>=39 && LA23_0<=49)) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1790:1: (this_TopLevelSimpleTypeReference_0= ruleTopLevelSimpleTypeReference | this_BuiltinTypeReference_1= ruleBuiltinTypeReference )", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1791:5: this_TopLevelSimpleTypeReference_0= ruleTopLevelSimpleTypeReference
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getNonComplexTypeReferenceAccess().getTopLevelSimpleTypeReferenceParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleTopLevelSimpleTypeReference_in_ruleNonComplexTypeReference3249);
                    this_TopLevelSimpleTypeReference_0=ruleTopLevelSimpleTypeReference();
                    _fsp--;

                     
                            current = this_TopLevelSimpleTypeReference_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1801:5: this_BuiltinTypeReference_1= ruleBuiltinTypeReference
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getNonComplexTypeReferenceAccess().getBuiltinTypeReferenceParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleBuiltinTypeReference_in_ruleNonComplexTypeReference3276);
                    this_BuiltinTypeReference_1=ruleBuiltinTypeReference();
                    _fsp--;

                     
                            current = this_BuiltinTypeReference_1; 
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
    // $ANTLR end ruleNonComplexTypeReference


    // $ANTLR start entryRuleBuiltinTypeReference
    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1817:1: entryRuleBuiltinTypeReference returns [EObject current=null] : iv_ruleBuiltinTypeReference= ruleBuiltinTypeReference EOF ;
    public final EObject entryRuleBuiltinTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBuiltinTypeReference = null;


        try {
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1818:2: (iv_ruleBuiltinTypeReference= ruleBuiltinTypeReference EOF )
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1819:2: iv_ruleBuiltinTypeReference= ruleBuiltinTypeReference EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBuiltinTypeReferenceRule(), currentNode); 
            pushFollow(FOLLOW_ruleBuiltinTypeReference_in_entryRuleBuiltinTypeReference3311);
            iv_ruleBuiltinTypeReference=ruleBuiltinTypeReference();
            _fsp--;

             current =iv_ruleBuiltinTypeReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBuiltinTypeReference3321); 

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
    // $ANTLR end entryRuleBuiltinTypeReference


    // $ANTLR start ruleBuiltinTypeReference
    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1826:1: ruleBuiltinTypeReference returns [EObject current=null] : ( (lv_builtin_0_0= ruleBuiltinType ) ) ;
    public final EObject ruleBuiltinTypeReference() throws RecognitionException {
        EObject current = null;

        Enumerator lv_builtin_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1831:6: ( ( (lv_builtin_0_0= ruleBuiltinType ) ) )
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1832:1: ( (lv_builtin_0_0= ruleBuiltinType ) )
            {
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1832:1: ( (lv_builtin_0_0= ruleBuiltinType ) )
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1833:1: (lv_builtin_0_0= ruleBuiltinType )
            {
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1833:1: (lv_builtin_0_0= ruleBuiltinType )
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1834:3: lv_builtin_0_0= ruleBuiltinType
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getBuiltinTypeReferenceAccess().getBuiltinBuiltinTypeEnumRuleCall_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleBuiltinType_in_ruleBuiltinTypeReference3366);
            lv_builtin_0_0=ruleBuiltinType();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getBuiltinTypeReferenceRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"builtin",
            	        		lv_builtin_0_0, 
            	        		"BuiltinType", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

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
    // $ANTLR end ruleBuiltinTypeReference


    // $ANTLR start entryRuleTopLevelTypeReference
    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1864:1: entryRuleTopLevelTypeReference returns [EObject current=null] : iv_ruleTopLevelTypeReference= ruleTopLevelTypeReference EOF ;
    public final EObject entryRuleTopLevelTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTopLevelTypeReference = null;


        try {
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1865:2: (iv_ruleTopLevelTypeReference= ruleTopLevelTypeReference EOF )
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1866:2: iv_ruleTopLevelTypeReference= ruleTopLevelTypeReference EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTopLevelTypeReferenceRule(), currentNode); 
            pushFollow(FOLLOW_ruleTopLevelTypeReference_in_entryRuleTopLevelTypeReference3401);
            iv_ruleTopLevelTypeReference=ruleTopLevelTypeReference();
            _fsp--;

             current =iv_ruleTopLevelTypeReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTopLevelTypeReference3411); 

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
    // $ANTLR end entryRuleTopLevelTypeReference


    // $ANTLR start ruleTopLevelTypeReference
    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1873:1: ruleTopLevelTypeReference returns [EObject current=null] : (this_DirectTopLevelTypeReference_0= ruleDirectTopLevelTypeReference | this_ImportedTopLevelTypeReference_1= ruleImportedTopLevelTypeReference ) ;
    public final EObject ruleTopLevelTypeReference() throws RecognitionException {
        EObject current = null;

        EObject this_DirectTopLevelTypeReference_0 = null;

        EObject this_ImportedTopLevelTypeReference_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1878:6: ( (this_DirectTopLevelTypeReference_0= ruleDirectTopLevelTypeReference | this_ImportedTopLevelTypeReference_1= ruleImportedTopLevelTypeReference ) )
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1879:1: (this_DirectTopLevelTypeReference_0= ruleDirectTopLevelTypeReference | this_ImportedTopLevelTypeReference_1= ruleImportedTopLevelTypeReference )
            {
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1879:1: (this_DirectTopLevelTypeReference_0= ruleDirectTopLevelTypeReference | this_ImportedTopLevelTypeReference_1= ruleImportedTopLevelTypeReference )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_ID) ) {
                int LA24_1 = input.LA(2);

                if ( (LA24_1==18) ) {
                    alt24=2;
                }
                else if ( (LA24_1==EOF||LA24_1==RULE_ID||LA24_1==16||(LA24_1>=19 && LA24_1<=20)||LA24_1==24||(LA24_1>=32 && LA24_1<=33)||(LA24_1>=36 && LA24_1<=37)) ) {
                    alt24=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1879:1: (this_DirectTopLevelTypeReference_0= ruleDirectTopLevelTypeReference | this_ImportedTopLevelTypeReference_1= ruleImportedTopLevelTypeReference )", 24, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1879:1: (this_DirectTopLevelTypeReference_0= ruleDirectTopLevelTypeReference | this_ImportedTopLevelTypeReference_1= ruleImportedTopLevelTypeReference )", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1880:5: this_DirectTopLevelTypeReference_0= ruleDirectTopLevelTypeReference
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTopLevelTypeReferenceAccess().getDirectTopLevelTypeReferenceParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleDirectTopLevelTypeReference_in_ruleTopLevelTypeReference3458);
                    this_DirectTopLevelTypeReference_0=ruleDirectTopLevelTypeReference();
                    _fsp--;

                     
                            current = this_DirectTopLevelTypeReference_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1890:5: this_ImportedTopLevelTypeReference_1= ruleImportedTopLevelTypeReference
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTopLevelTypeReferenceAccess().getImportedTopLevelTypeReferenceParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleImportedTopLevelTypeReference_in_ruleTopLevelTypeReference3485);
                    this_ImportedTopLevelTypeReference_1=ruleImportedTopLevelTypeReference();
                    _fsp--;

                     
                            current = this_ImportedTopLevelTypeReference_1; 
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
    // $ANTLR end ruleTopLevelTypeReference


    // $ANTLR start entryRuleTopLevelComplexTypeReference
    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1906:1: entryRuleTopLevelComplexTypeReference returns [EObject current=null] : iv_ruleTopLevelComplexTypeReference= ruleTopLevelComplexTypeReference EOF ;
    public final EObject entryRuleTopLevelComplexTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTopLevelComplexTypeReference = null;


        try {
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1907:2: (iv_ruleTopLevelComplexTypeReference= ruleTopLevelComplexTypeReference EOF )
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1908:2: iv_ruleTopLevelComplexTypeReference= ruleTopLevelComplexTypeReference EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTopLevelComplexTypeReferenceRule(), currentNode); 
            pushFollow(FOLLOW_ruleTopLevelComplexTypeReference_in_entryRuleTopLevelComplexTypeReference3520);
            iv_ruleTopLevelComplexTypeReference=ruleTopLevelComplexTypeReference();
            _fsp--;

             current =iv_ruleTopLevelComplexTypeReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTopLevelComplexTypeReference3530); 

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
    // $ANTLR end entryRuleTopLevelComplexTypeReference


    // $ANTLR start ruleTopLevelComplexTypeReference
    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1915:1: ruleTopLevelComplexTypeReference returns [EObject current=null] : (this_DirectTopLevelComplexTypeReference_0= ruleDirectTopLevelComplexTypeReference | this_ImportedTopLevelComplexTypeReference_1= ruleImportedTopLevelComplexTypeReference ) ;
    public final EObject ruleTopLevelComplexTypeReference() throws RecognitionException {
        EObject current = null;

        EObject this_DirectTopLevelComplexTypeReference_0 = null;

        EObject this_ImportedTopLevelComplexTypeReference_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1920:6: ( (this_DirectTopLevelComplexTypeReference_0= ruleDirectTopLevelComplexTypeReference | this_ImportedTopLevelComplexTypeReference_1= ruleImportedTopLevelComplexTypeReference ) )
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1921:1: (this_DirectTopLevelComplexTypeReference_0= ruleDirectTopLevelComplexTypeReference | this_ImportedTopLevelComplexTypeReference_1= ruleImportedTopLevelComplexTypeReference )
            {
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1921:1: (this_DirectTopLevelComplexTypeReference_0= ruleDirectTopLevelComplexTypeReference | this_ImportedTopLevelComplexTypeReference_1= ruleImportedTopLevelComplexTypeReference )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_ID) ) {
                int LA25_1 = input.LA(2);

                if ( (LA25_1==18) ) {
                    alt25=2;
                }
                else if ( (LA25_1==EOF||LA25_1==23) ) {
                    alt25=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1921:1: (this_DirectTopLevelComplexTypeReference_0= ruleDirectTopLevelComplexTypeReference | this_ImportedTopLevelComplexTypeReference_1= ruleImportedTopLevelComplexTypeReference )", 25, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1921:1: (this_DirectTopLevelComplexTypeReference_0= ruleDirectTopLevelComplexTypeReference | this_ImportedTopLevelComplexTypeReference_1= ruleImportedTopLevelComplexTypeReference )", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1922:5: this_DirectTopLevelComplexTypeReference_0= ruleDirectTopLevelComplexTypeReference
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTopLevelComplexTypeReferenceAccess().getDirectTopLevelComplexTypeReferenceParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleDirectTopLevelComplexTypeReference_in_ruleTopLevelComplexTypeReference3577);
                    this_DirectTopLevelComplexTypeReference_0=ruleDirectTopLevelComplexTypeReference();
                    _fsp--;

                     
                            current = this_DirectTopLevelComplexTypeReference_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1932:5: this_ImportedTopLevelComplexTypeReference_1= ruleImportedTopLevelComplexTypeReference
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTopLevelComplexTypeReferenceAccess().getImportedTopLevelComplexTypeReferenceParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleImportedTopLevelComplexTypeReference_in_ruleTopLevelComplexTypeReference3604);
                    this_ImportedTopLevelComplexTypeReference_1=ruleImportedTopLevelComplexTypeReference();
                    _fsp--;

                     
                            current = this_ImportedTopLevelComplexTypeReference_1; 
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
    // $ANTLR end ruleTopLevelComplexTypeReference


    // $ANTLR start entryRuleTopLevelSimpleTypeReference
    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1948:1: entryRuleTopLevelSimpleTypeReference returns [EObject current=null] : iv_ruleTopLevelSimpleTypeReference= ruleTopLevelSimpleTypeReference EOF ;
    public final EObject entryRuleTopLevelSimpleTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTopLevelSimpleTypeReference = null;


        try {
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1949:2: (iv_ruleTopLevelSimpleTypeReference= ruleTopLevelSimpleTypeReference EOF )
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1950:2: iv_ruleTopLevelSimpleTypeReference= ruleTopLevelSimpleTypeReference EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTopLevelSimpleTypeReferenceRule(), currentNode); 
            pushFollow(FOLLOW_ruleTopLevelSimpleTypeReference_in_entryRuleTopLevelSimpleTypeReference3639);
            iv_ruleTopLevelSimpleTypeReference=ruleTopLevelSimpleTypeReference();
            _fsp--;

             current =iv_ruleTopLevelSimpleTypeReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTopLevelSimpleTypeReference3649); 

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
    // $ANTLR end entryRuleTopLevelSimpleTypeReference


    // $ANTLR start ruleTopLevelSimpleTypeReference
    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1957:1: ruleTopLevelSimpleTypeReference returns [EObject current=null] : (this_DirectTopLevelSimpleTypeReference_0= ruleDirectTopLevelSimpleTypeReference | this_ImportedTopLevelSimpleTypeReference_1= ruleImportedTopLevelSimpleTypeReference ) ;
    public final EObject ruleTopLevelSimpleTypeReference() throws RecognitionException {
        EObject current = null;

        EObject this_DirectTopLevelSimpleTypeReference_0 = null;

        EObject this_ImportedTopLevelSimpleTypeReference_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1962:6: ( (this_DirectTopLevelSimpleTypeReference_0= ruleDirectTopLevelSimpleTypeReference | this_ImportedTopLevelSimpleTypeReference_1= ruleImportedTopLevelSimpleTypeReference ) )
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1963:1: (this_DirectTopLevelSimpleTypeReference_0= ruleDirectTopLevelSimpleTypeReference | this_ImportedTopLevelSimpleTypeReference_1= ruleImportedTopLevelSimpleTypeReference )
            {
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1963:1: (this_DirectTopLevelSimpleTypeReference_0= ruleDirectTopLevelSimpleTypeReference | this_ImportedTopLevelSimpleTypeReference_1= ruleImportedTopLevelSimpleTypeReference )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_ID) ) {
                int LA26_1 = input.LA(2);

                if ( (LA26_1==18) ) {
                    alt26=2;
                }
                else if ( (LA26_1==EOF||LA26_1==RULE_ID||LA26_1==21||LA26_1==24||(LA26_1>=36 && LA26_1<=37)) ) {
                    alt26=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1963:1: (this_DirectTopLevelSimpleTypeReference_0= ruleDirectTopLevelSimpleTypeReference | this_ImportedTopLevelSimpleTypeReference_1= ruleImportedTopLevelSimpleTypeReference )", 26, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1963:1: (this_DirectTopLevelSimpleTypeReference_0= ruleDirectTopLevelSimpleTypeReference | this_ImportedTopLevelSimpleTypeReference_1= ruleImportedTopLevelSimpleTypeReference )", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1964:5: this_DirectTopLevelSimpleTypeReference_0= ruleDirectTopLevelSimpleTypeReference
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTopLevelSimpleTypeReferenceAccess().getDirectTopLevelSimpleTypeReferenceParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleDirectTopLevelSimpleTypeReference_in_ruleTopLevelSimpleTypeReference3696);
                    this_DirectTopLevelSimpleTypeReference_0=ruleDirectTopLevelSimpleTypeReference();
                    _fsp--;

                     
                            current = this_DirectTopLevelSimpleTypeReference_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1974:5: this_ImportedTopLevelSimpleTypeReference_1= ruleImportedTopLevelSimpleTypeReference
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTopLevelSimpleTypeReferenceAccess().getImportedTopLevelSimpleTypeReferenceParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleImportedTopLevelSimpleTypeReference_in_ruleTopLevelSimpleTypeReference3723);
                    this_ImportedTopLevelSimpleTypeReference_1=ruleImportedTopLevelSimpleTypeReference();
                    _fsp--;

                     
                            current = this_ImportedTopLevelSimpleTypeReference_1; 
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
    // $ANTLR end ruleTopLevelSimpleTypeReference


    // $ANTLR start entryRuleDirectTopLevelTypeReference
    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1990:1: entryRuleDirectTopLevelTypeReference returns [EObject current=null] : iv_ruleDirectTopLevelTypeReference= ruleDirectTopLevelTypeReference EOF ;
    public final EObject entryRuleDirectTopLevelTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDirectTopLevelTypeReference = null;


        try {
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1991:2: (iv_ruleDirectTopLevelTypeReference= ruleDirectTopLevelTypeReference EOF )
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1992:2: iv_ruleDirectTopLevelTypeReference= ruleDirectTopLevelTypeReference EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDirectTopLevelTypeReferenceRule(), currentNode); 
            pushFollow(FOLLOW_ruleDirectTopLevelTypeReference_in_entryRuleDirectTopLevelTypeReference3758);
            iv_ruleDirectTopLevelTypeReference=ruleDirectTopLevelTypeReference();
            _fsp--;

             current =iv_ruleDirectTopLevelTypeReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDirectTopLevelTypeReference3768); 

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
    // $ANTLR end entryRuleDirectTopLevelTypeReference


    // $ANTLR start ruleDirectTopLevelTypeReference
    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:1999:1: ruleDirectTopLevelTypeReference returns [EObject current=null] : ( ( RULE_ID ) ) ;
    public final EObject ruleDirectTopLevelTypeReference() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:2004:6: ( ( ( RULE_ID ) ) )
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:2005:1: ( ( RULE_ID ) )
            {
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:2005:1: ( ( RULE_ID ) )
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:2006:1: ( RULE_ID )
            {
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:2006:1: ( RULE_ID )
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:2007:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getDirectTopLevelTypeReferenceRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDirectTopLevelTypeReference3810); 

            		createLeafNode(grammarAccess.getDirectTopLevelTypeReferenceAccess().getRefTopLevelTypeCrossReference_0(), "ref"); 
            	

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
    // $ANTLR end ruleDirectTopLevelTypeReference


    // $ANTLR start entryRuleDirectTopLevelSimpleTypeReference
    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:2027:1: entryRuleDirectTopLevelSimpleTypeReference returns [EObject current=null] : iv_ruleDirectTopLevelSimpleTypeReference= ruleDirectTopLevelSimpleTypeReference EOF ;
    public final EObject entryRuleDirectTopLevelSimpleTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDirectTopLevelSimpleTypeReference = null;


        try {
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:2028:2: (iv_ruleDirectTopLevelSimpleTypeReference= ruleDirectTopLevelSimpleTypeReference EOF )
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:2029:2: iv_ruleDirectTopLevelSimpleTypeReference= ruleDirectTopLevelSimpleTypeReference EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDirectTopLevelSimpleTypeReferenceRule(), currentNode); 
            pushFollow(FOLLOW_ruleDirectTopLevelSimpleTypeReference_in_entryRuleDirectTopLevelSimpleTypeReference3845);
            iv_ruleDirectTopLevelSimpleTypeReference=ruleDirectTopLevelSimpleTypeReference();
            _fsp--;

             current =iv_ruleDirectTopLevelSimpleTypeReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDirectTopLevelSimpleTypeReference3855); 

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
    // $ANTLR end entryRuleDirectTopLevelSimpleTypeReference


    // $ANTLR start ruleDirectTopLevelSimpleTypeReference
    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:2036:1: ruleDirectTopLevelSimpleTypeReference returns [EObject current=null] : ( ( RULE_ID ) ) ;
    public final EObject ruleDirectTopLevelSimpleTypeReference() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:2041:6: ( ( ( RULE_ID ) ) )
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:2042:1: ( ( RULE_ID ) )
            {
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:2042:1: ( ( RULE_ID ) )
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:2043:1: ( RULE_ID )
            {
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:2043:1: ( RULE_ID )
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:2044:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getDirectTopLevelSimpleTypeReferenceRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDirectTopLevelSimpleTypeReference3897); 

            		createLeafNode(grammarAccess.getDirectTopLevelSimpleTypeReferenceAccess().getRefTopLevelSimpleTypeCrossReference_0(), "ref"); 
            	

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
    // $ANTLR end ruleDirectTopLevelSimpleTypeReference


    // $ANTLR start entryRuleDirectTopLevelComplexTypeReference
    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:2064:1: entryRuleDirectTopLevelComplexTypeReference returns [EObject current=null] : iv_ruleDirectTopLevelComplexTypeReference= ruleDirectTopLevelComplexTypeReference EOF ;
    public final EObject entryRuleDirectTopLevelComplexTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDirectTopLevelComplexTypeReference = null;


        try {
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:2065:2: (iv_ruleDirectTopLevelComplexTypeReference= ruleDirectTopLevelComplexTypeReference EOF )
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:2066:2: iv_ruleDirectTopLevelComplexTypeReference= ruleDirectTopLevelComplexTypeReference EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDirectTopLevelComplexTypeReferenceRule(), currentNode); 
            pushFollow(FOLLOW_ruleDirectTopLevelComplexTypeReference_in_entryRuleDirectTopLevelComplexTypeReference3932);
            iv_ruleDirectTopLevelComplexTypeReference=ruleDirectTopLevelComplexTypeReference();
            _fsp--;

             current =iv_ruleDirectTopLevelComplexTypeReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDirectTopLevelComplexTypeReference3942); 

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
    // $ANTLR end entryRuleDirectTopLevelComplexTypeReference


    // $ANTLR start ruleDirectTopLevelComplexTypeReference
    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:2073:1: ruleDirectTopLevelComplexTypeReference returns [EObject current=null] : ( ( RULE_ID ) ) ;
    public final EObject ruleDirectTopLevelComplexTypeReference() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:2078:6: ( ( ( RULE_ID ) ) )
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:2079:1: ( ( RULE_ID ) )
            {
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:2079:1: ( ( RULE_ID ) )
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:2080:1: ( RULE_ID )
            {
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:2080:1: ( RULE_ID )
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:2081:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getDirectTopLevelComplexTypeReferenceRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDirectTopLevelComplexTypeReference3984); 

            		createLeafNode(grammarAccess.getDirectTopLevelComplexTypeReferenceAccess().getRefTopLevelComplexTypeCrossReference_0(), "ref"); 
            	

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
    // $ANTLR end ruleDirectTopLevelComplexTypeReference


    // $ANTLR start entryRuleImportedTopLevelTypeReference
    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:2101:1: entryRuleImportedTopLevelTypeReference returns [EObject current=null] : iv_ruleImportedTopLevelTypeReference= ruleImportedTopLevelTypeReference EOF ;
    public final EObject entryRuleImportedTopLevelTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImportedTopLevelTypeReference = null;


        try {
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:2102:2: (iv_ruleImportedTopLevelTypeReference= ruleImportedTopLevelTypeReference EOF )
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:2103:2: iv_ruleImportedTopLevelTypeReference= ruleImportedTopLevelTypeReference EOF
            {
             currentNode = createCompositeNode(grammarAccess.getImportedTopLevelTypeReferenceRule(), currentNode); 
            pushFollow(FOLLOW_ruleImportedTopLevelTypeReference_in_entryRuleImportedTopLevelTypeReference4019);
            iv_ruleImportedTopLevelTypeReference=ruleImportedTopLevelTypeReference();
            _fsp--;

             current =iv_ruleImportedTopLevelTypeReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImportedTopLevelTypeReference4029); 

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
    // $ANTLR end entryRuleImportedTopLevelTypeReference


    // $ANTLR start ruleImportedTopLevelTypeReference
    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:2110:1: ruleImportedTopLevelTypeReference returns [EObject current=null] : ( ( ( RULE_ID ) ) ':' ( ( RULE_ID ) ) ) ;
    public final EObject ruleImportedTopLevelTypeReference() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:2115:6: ( ( ( ( RULE_ID ) ) ':' ( ( RULE_ID ) ) ) )
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:2116:1: ( ( ( RULE_ID ) ) ':' ( ( RULE_ID ) ) )
            {
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:2116:1: ( ( ( RULE_ID ) ) ':' ( ( RULE_ID ) ) )
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:2116:2: ( ( RULE_ID ) ) ':' ( ( RULE_ID ) )
            {
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:2116:2: ( ( RULE_ID ) )
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:2117:1: ( RULE_ID )
            {
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:2117:1: ( RULE_ID )
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:2118:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getImportedTopLevelTypeReferenceRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleImportedTopLevelTypeReference4072); 

            		createLeafNode(grammarAccess.getImportedTopLevelTypeReferenceAccess().getImportImportCrossReference_0_0(), "import"); 
            	

            }


            }

            match(input,18,FOLLOW_18_in_ruleImportedTopLevelTypeReference4082); 

                    createLeafNode(grammarAccess.getImportedTopLevelTypeReferenceAccess().getColonKeyword_1(), null); 
                
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:2134:1: ( ( RULE_ID ) )
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:2135:1: ( RULE_ID )
            {
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:2135:1: ( RULE_ID )
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:2136:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getImportedTopLevelTypeReferenceRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleImportedTopLevelTypeReference4100); 

            		createLeafNode(grammarAccess.getImportedTopLevelTypeReferenceAccess().getRefTopLevelTypeCrossReference_2_0(), "ref"); 
            	

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
    // $ANTLR end ruleImportedTopLevelTypeReference


    // $ANTLR start entryRuleImportedTopLevelSimpleTypeReference
    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:2156:1: entryRuleImportedTopLevelSimpleTypeReference returns [EObject current=null] : iv_ruleImportedTopLevelSimpleTypeReference= ruleImportedTopLevelSimpleTypeReference EOF ;
    public final EObject entryRuleImportedTopLevelSimpleTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImportedTopLevelSimpleTypeReference = null;


        try {
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:2157:2: (iv_ruleImportedTopLevelSimpleTypeReference= ruleImportedTopLevelSimpleTypeReference EOF )
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:2158:2: iv_ruleImportedTopLevelSimpleTypeReference= ruleImportedTopLevelSimpleTypeReference EOF
            {
             currentNode = createCompositeNode(grammarAccess.getImportedTopLevelSimpleTypeReferenceRule(), currentNode); 
            pushFollow(FOLLOW_ruleImportedTopLevelSimpleTypeReference_in_entryRuleImportedTopLevelSimpleTypeReference4136);
            iv_ruleImportedTopLevelSimpleTypeReference=ruleImportedTopLevelSimpleTypeReference();
            _fsp--;

             current =iv_ruleImportedTopLevelSimpleTypeReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImportedTopLevelSimpleTypeReference4146); 

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
    // $ANTLR end entryRuleImportedTopLevelSimpleTypeReference


    // $ANTLR start ruleImportedTopLevelSimpleTypeReference
    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:2165:1: ruleImportedTopLevelSimpleTypeReference returns [EObject current=null] : ( ( ( RULE_ID ) ) ':' ( ( RULE_ID ) ) ) ;
    public final EObject ruleImportedTopLevelSimpleTypeReference() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:2170:6: ( ( ( ( RULE_ID ) ) ':' ( ( RULE_ID ) ) ) )
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:2171:1: ( ( ( RULE_ID ) ) ':' ( ( RULE_ID ) ) )
            {
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:2171:1: ( ( ( RULE_ID ) ) ':' ( ( RULE_ID ) ) )
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:2171:2: ( ( RULE_ID ) ) ':' ( ( RULE_ID ) )
            {
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:2171:2: ( ( RULE_ID ) )
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:2172:1: ( RULE_ID )
            {
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:2172:1: ( RULE_ID )
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:2173:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getImportedTopLevelSimpleTypeReferenceRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleImportedTopLevelSimpleTypeReference4189); 

            		createLeafNode(grammarAccess.getImportedTopLevelSimpleTypeReferenceAccess().getImportImportCrossReference_0_0(), "import"); 
            	

            }


            }

            match(input,18,FOLLOW_18_in_ruleImportedTopLevelSimpleTypeReference4199); 

                    createLeafNode(grammarAccess.getImportedTopLevelSimpleTypeReferenceAccess().getColonKeyword_1(), null); 
                
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:2189:1: ( ( RULE_ID ) )
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:2190:1: ( RULE_ID )
            {
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:2190:1: ( RULE_ID )
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:2191:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getImportedTopLevelSimpleTypeReferenceRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleImportedTopLevelSimpleTypeReference4217); 

            		createLeafNode(grammarAccess.getImportedTopLevelSimpleTypeReferenceAccess().getRefTopLevelSimpleTypeCrossReference_2_0(), "ref"); 
            	

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
    // $ANTLR end ruleImportedTopLevelSimpleTypeReference


    // $ANTLR start entryRuleImportedTopLevelComplexTypeReference
    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:2211:1: entryRuleImportedTopLevelComplexTypeReference returns [EObject current=null] : iv_ruleImportedTopLevelComplexTypeReference= ruleImportedTopLevelComplexTypeReference EOF ;
    public final EObject entryRuleImportedTopLevelComplexTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImportedTopLevelComplexTypeReference = null;


        try {
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:2212:2: (iv_ruleImportedTopLevelComplexTypeReference= ruleImportedTopLevelComplexTypeReference EOF )
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:2213:2: iv_ruleImportedTopLevelComplexTypeReference= ruleImportedTopLevelComplexTypeReference EOF
            {
             currentNode = createCompositeNode(grammarAccess.getImportedTopLevelComplexTypeReferenceRule(), currentNode); 
            pushFollow(FOLLOW_ruleImportedTopLevelComplexTypeReference_in_entryRuleImportedTopLevelComplexTypeReference4253);
            iv_ruleImportedTopLevelComplexTypeReference=ruleImportedTopLevelComplexTypeReference();
            _fsp--;

             current =iv_ruleImportedTopLevelComplexTypeReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImportedTopLevelComplexTypeReference4263); 

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
    // $ANTLR end entryRuleImportedTopLevelComplexTypeReference


    // $ANTLR start ruleImportedTopLevelComplexTypeReference
    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:2220:1: ruleImportedTopLevelComplexTypeReference returns [EObject current=null] : ( ( ( RULE_ID ) ) ':' ( ( RULE_ID ) ) ) ;
    public final EObject ruleImportedTopLevelComplexTypeReference() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:2225:6: ( ( ( ( RULE_ID ) ) ':' ( ( RULE_ID ) ) ) )
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:2226:1: ( ( ( RULE_ID ) ) ':' ( ( RULE_ID ) ) )
            {
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:2226:1: ( ( ( RULE_ID ) ) ':' ( ( RULE_ID ) ) )
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:2226:2: ( ( RULE_ID ) ) ':' ( ( RULE_ID ) )
            {
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:2226:2: ( ( RULE_ID ) )
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:2227:1: ( RULE_ID )
            {
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:2227:1: ( RULE_ID )
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:2228:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getImportedTopLevelComplexTypeReferenceRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleImportedTopLevelComplexTypeReference4306); 

            		createLeafNode(grammarAccess.getImportedTopLevelComplexTypeReferenceAccess().getImportImportCrossReference_0_0(), "import"); 
            	

            }


            }

            match(input,18,FOLLOW_18_in_ruleImportedTopLevelComplexTypeReference4316); 

                    createLeafNode(grammarAccess.getImportedTopLevelComplexTypeReferenceAccess().getColonKeyword_1(), null); 
                
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:2244:1: ( ( RULE_ID ) )
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:2245:1: ( RULE_ID )
            {
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:2245:1: ( RULE_ID )
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:2246:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getImportedTopLevelComplexTypeReferenceRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleImportedTopLevelComplexTypeReference4334); 

            		createLeafNode(grammarAccess.getImportedTopLevelComplexTypeReferenceAccess().getRefTopLevelComplexTypeCrossReference_2_0(), "ref"); 
            	

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
    // $ANTLR end ruleImportedTopLevelComplexTypeReference


    // $ANTLR start entryRuleEmbeddedType
    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:2268:1: entryRuleEmbeddedType returns [EObject current=null] : iv_ruleEmbeddedType= ruleEmbeddedType EOF ;
    public final EObject entryRuleEmbeddedType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmbeddedType = null;


        try {
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:2269:2: (iv_ruleEmbeddedType= ruleEmbeddedType EOF )
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:2270:2: iv_ruleEmbeddedType= ruleEmbeddedType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEmbeddedTypeRule(), currentNode); 
            pushFollow(FOLLOW_ruleEmbeddedType_in_entryRuleEmbeddedType4372);
            iv_ruleEmbeddedType=ruleEmbeddedType();
            _fsp--;

             current =iv_ruleEmbeddedType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEmbeddedType4382); 

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
    // $ANTLR end entryRuleEmbeddedType


    // $ANTLR start ruleEmbeddedType
    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:2277:1: ruleEmbeddedType returns [EObject current=null] : (this_EmbeddedComplexType_0= ruleEmbeddedComplexType | this_EmbeddedSimpleType_1= ruleEmbeddedSimpleType ) ;
    public final EObject ruleEmbeddedType() throws RecognitionException {
        EObject current = null;

        EObject this_EmbeddedComplexType_0 = null;

        EObject this_EmbeddedSimpleType_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:2282:6: ( (this_EmbeddedComplexType_0= ruleEmbeddedComplexType | this_EmbeddedSimpleType_1= ruleEmbeddedSimpleType ) )
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:2283:1: (this_EmbeddedComplexType_0= ruleEmbeddedComplexType | this_EmbeddedSimpleType_1= ruleEmbeddedSimpleType )
            {
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:2283:1: (this_EmbeddedComplexType_0= ruleEmbeddedComplexType | this_EmbeddedSimpleType_1= ruleEmbeddedSimpleType )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==33) ) {
                alt27=1;
            }
            else if ( (LA27_0==19) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("2283:1: (this_EmbeddedComplexType_0= ruleEmbeddedComplexType | this_EmbeddedSimpleType_1= ruleEmbeddedSimpleType )", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:2284:5: this_EmbeddedComplexType_0= ruleEmbeddedComplexType
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getEmbeddedTypeAccess().getEmbeddedComplexTypeParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleEmbeddedComplexType_in_ruleEmbeddedType4429);
                    this_EmbeddedComplexType_0=ruleEmbeddedComplexType();
                    _fsp--;

                     
                            current = this_EmbeddedComplexType_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:2294:5: this_EmbeddedSimpleType_1= ruleEmbeddedSimpleType
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getEmbeddedTypeAccess().getEmbeddedSimpleTypeParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleEmbeddedSimpleType_in_ruleEmbeddedType4456);
                    this_EmbeddedSimpleType_1=ruleEmbeddedSimpleType();
                    _fsp--;

                     
                            current = this_EmbeddedSimpleType_1; 
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
    // $ANTLR end ruleEmbeddedType


    // $ANTLR start entryRuleEmbeddedComplexType
    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:2310:1: entryRuleEmbeddedComplexType returns [EObject current=null] : iv_ruleEmbeddedComplexType= ruleEmbeddedComplexType EOF ;
    public final EObject entryRuleEmbeddedComplexType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmbeddedComplexType = null;


        try {
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:2311:2: (iv_ruleEmbeddedComplexType= ruleEmbeddedComplexType EOF )
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:2312:2: iv_ruleEmbeddedComplexType= ruleEmbeddedComplexType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEmbeddedComplexTypeRule(), currentNode); 
            pushFollow(FOLLOW_ruleEmbeddedComplexType_in_entryRuleEmbeddedComplexType4491);
            iv_ruleEmbeddedComplexType=ruleEmbeddedComplexType();
            _fsp--;

             current =iv_ruleEmbeddedComplexType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEmbeddedComplexType4501); 

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
    // $ANTLR end entryRuleEmbeddedComplexType


    // $ANTLR start ruleEmbeddedComplexType
    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:2319:1: ruleEmbeddedComplexType returns [EObject current=null] : ( () 'complex-type' ( 'extends' ( (lv_extends_3_0= ruleTopLevelComplexTypeReference ) ) )? '{' ( (lv_properties_5_0= ruleProperty ) )* '}' ) ;
    public final EObject ruleEmbeddedComplexType() throws RecognitionException {
        EObject current = null;

        EObject lv_extends_3_0 = null;

        EObject lv_properties_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:2324:6: ( ( () 'complex-type' ( 'extends' ( (lv_extends_3_0= ruleTopLevelComplexTypeReference ) ) )? '{' ( (lv_properties_5_0= ruleProperty ) )* '}' ) )
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:2325:1: ( () 'complex-type' ( 'extends' ( (lv_extends_3_0= ruleTopLevelComplexTypeReference ) ) )? '{' ( (lv_properties_5_0= ruleProperty ) )* '}' )
            {
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:2325:1: ( () 'complex-type' ( 'extends' ( (lv_extends_3_0= ruleTopLevelComplexTypeReference ) ) )? '{' ( (lv_properties_5_0= ruleProperty ) )* '}' )
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:2325:2: () 'complex-type' ( 'extends' ( (lv_extends_3_0= ruleTopLevelComplexTypeReference ) ) )? '{' ( (lv_properties_5_0= ruleProperty ) )* '}'
            {
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:2325:2: ()
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:2326:5: 
            {
             
                    temp=factory.create(grammarAccess.getEmbeddedComplexTypeAccess().getEmbeddedComplexTypeAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getEmbeddedComplexTypeAccess().getEmbeddedComplexTypeAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            match(input,33,FOLLOW_33_in_ruleEmbeddedComplexType4545); 

                    createLeafNode(grammarAccess.getEmbeddedComplexTypeAccess().getComplexTypeKeyword_1(), null); 
                
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:2340:1: ( 'extends' ( (lv_extends_3_0= ruleTopLevelComplexTypeReference ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==34) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:2340:3: 'extends' ( (lv_extends_3_0= ruleTopLevelComplexTypeReference ) )
                    {
                    match(input,34,FOLLOW_34_in_ruleEmbeddedComplexType4556); 

                            createLeafNode(grammarAccess.getEmbeddedComplexTypeAccess().getExtendsKeyword_2_0(), null); 
                        
                    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:2344:1: ( (lv_extends_3_0= ruleTopLevelComplexTypeReference ) )
                    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:2345:1: (lv_extends_3_0= ruleTopLevelComplexTypeReference )
                    {
                    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:2345:1: (lv_extends_3_0= ruleTopLevelComplexTypeReference )
                    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:2346:3: lv_extends_3_0= ruleTopLevelComplexTypeReference
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getEmbeddedComplexTypeAccess().getExtendsTopLevelComplexTypeReferenceParserRuleCall_2_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleTopLevelComplexTypeReference_in_ruleEmbeddedComplexType4577);
                    lv_extends_3_0=ruleTopLevelComplexTypeReference();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getEmbeddedComplexTypeRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"extends",
                    	        		lv_extends_3_0, 
                    	        		"TopLevelComplexTypeReference", 
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

            match(input,23,FOLLOW_23_in_ruleEmbeddedComplexType4589); 

                    createLeafNode(grammarAccess.getEmbeddedComplexTypeAccess().getLeftCurlyBracketKeyword_3(), null); 
                
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:2372:1: ( (lv_properties_5_0= ruleProperty ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==RULE_ID||(LA29_0>=36 && LA29_0<=37)) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:2373:1: (lv_properties_5_0= ruleProperty )
            	    {
            	    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:2373:1: (lv_properties_5_0= ruleProperty )
            	    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:2374:3: lv_properties_5_0= ruleProperty
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getEmbeddedComplexTypeAccess().getPropertiesPropertyParserRuleCall_4_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleProperty_in_ruleEmbeddedComplexType4610);
            	    lv_properties_5_0=ruleProperty();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getEmbeddedComplexTypeRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"properties",
            	    	        		lv_properties_5_0, 
            	    	        		"Property", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            match(input,24,FOLLOW_24_in_ruleEmbeddedComplexType4621); 

                    createLeafNode(grammarAccess.getEmbeddedComplexTypeAccess().getRightCurlyBracketKeyword_5(), null); 
                

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
    // $ANTLR end ruleEmbeddedComplexType


    // $ANTLR start entryRuleEmbeddedSimpleType
    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:2408:1: entryRuleEmbeddedSimpleType returns [EObject current=null] : iv_ruleEmbeddedSimpleType= ruleEmbeddedSimpleType EOF ;
    public final EObject entryRuleEmbeddedSimpleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmbeddedSimpleType = null;


        try {
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:2409:2: (iv_ruleEmbeddedSimpleType= ruleEmbeddedSimpleType EOF )
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:2410:2: iv_ruleEmbeddedSimpleType= ruleEmbeddedSimpleType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEmbeddedSimpleTypeRule(), currentNode); 
            pushFollow(FOLLOW_ruleEmbeddedSimpleType_in_entryRuleEmbeddedSimpleType4657);
            iv_ruleEmbeddedSimpleType=ruleEmbeddedSimpleType();
            _fsp--;

             current =iv_ruleEmbeddedSimpleType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEmbeddedSimpleType4667); 

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
    // $ANTLR end entryRuleEmbeddedSimpleType


    // $ANTLR start ruleEmbeddedSimpleType
    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:2417:1: ruleEmbeddedSimpleType returns [EObject current=null] : ( 'simple-type' ( (lv_restriction_1_0= ruleRestriction ) ) ( (lv_documentation_2_0= ruleDocumentation ) )? ) ;
    public final EObject ruleEmbeddedSimpleType() throws RecognitionException {
        EObject current = null;

        EObject lv_restriction_1_0 = null;

        EObject lv_documentation_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:2422:6: ( ( 'simple-type' ( (lv_restriction_1_0= ruleRestriction ) ) ( (lv_documentation_2_0= ruleDocumentation ) )? ) )
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:2423:1: ( 'simple-type' ( (lv_restriction_1_0= ruleRestriction ) ) ( (lv_documentation_2_0= ruleDocumentation ) )? )
            {
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:2423:1: ( 'simple-type' ( (lv_restriction_1_0= ruleRestriction ) ) ( (lv_documentation_2_0= ruleDocumentation ) )? )
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:2423:3: 'simple-type' ( (lv_restriction_1_0= ruleRestriction ) ) ( (lv_documentation_2_0= ruleDocumentation ) )?
            {
            match(input,19,FOLLOW_19_in_ruleEmbeddedSimpleType4702); 

                    createLeafNode(grammarAccess.getEmbeddedSimpleTypeAccess().getSimpleTypeKeyword_0(), null); 
                
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:2427:1: ( (lv_restriction_1_0= ruleRestriction ) )
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:2428:1: (lv_restriction_1_0= ruleRestriction )
            {
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:2428:1: (lv_restriction_1_0= ruleRestriction )
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:2429:3: lv_restriction_1_0= ruleRestriction
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getEmbeddedSimpleTypeAccess().getRestrictionRestrictionParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleRestriction_in_ruleEmbeddedSimpleType4723);
            lv_restriction_1_0=ruleRestriction();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getEmbeddedSimpleTypeRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"restriction",
            	        		lv_restriction_1_0, 
            	        		"Restriction", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:2451:2: ( (lv_documentation_2_0= ruleDocumentation ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==25) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:2452:1: (lv_documentation_2_0= ruleDocumentation )
                    {
                    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:2452:1: (lv_documentation_2_0= ruleDocumentation )
                    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:2453:3: lv_documentation_2_0= ruleDocumentation
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getEmbeddedSimpleTypeAccess().getDocumentationDocumentationParserRuleCall_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleDocumentation_in_ruleEmbeddedSimpleType4744);
                    lv_documentation_2_0=ruleDocumentation();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getEmbeddedSimpleTypeRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"documentation",
                    	        		lv_documentation_2_0, 
                    	        		"Documentation", 
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
    // $ANTLR end ruleEmbeddedSimpleType


    // $ANTLR start ruleBuiltinType
    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:2487:1: ruleBuiltinType returns [Enumerator current=null] : ( ( 'duration' ) | ( 'dateTime' ) | ( 'time' ) | ( 'date' ) | ( 'string' ) | ( 'decimal' ) | ( 'integer' ) | ( 'positiveInteger' ) | ( 'nonNegativeInteger' ) | ( 'token' ) | ( 'base64Binary' ) ) ;
    public final Enumerator ruleBuiltinType() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:2491:6: ( ( ( 'duration' ) | ( 'dateTime' ) | ( 'time' ) | ( 'date' ) | ( 'string' ) | ( 'decimal' ) | ( 'integer' ) | ( 'positiveInteger' ) | ( 'nonNegativeInteger' ) | ( 'token' ) | ( 'base64Binary' ) ) )
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:2492:1: ( ( 'duration' ) | ( 'dateTime' ) | ( 'time' ) | ( 'date' ) | ( 'string' ) | ( 'decimal' ) | ( 'integer' ) | ( 'positiveInteger' ) | ( 'nonNegativeInteger' ) | ( 'token' ) | ( 'base64Binary' ) )
            {
            // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:2492:1: ( ( 'duration' ) | ( 'dateTime' ) | ( 'time' ) | ( 'date' ) | ( 'string' ) | ( 'decimal' ) | ( 'integer' ) | ( 'positiveInteger' ) | ( 'nonNegativeInteger' ) | ( 'token' ) | ( 'base64Binary' ) )
            int alt31=11;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt31=1;
                }
                break;
            case 40:
                {
                alt31=2;
                }
                break;
            case 41:
                {
                alt31=3;
                }
                break;
            case 42:
                {
                alt31=4;
                }
                break;
            case 43:
                {
                alt31=5;
                }
                break;
            case 44:
                {
                alt31=6;
                }
                break;
            case 45:
                {
                alt31=7;
                }
                break;
            case 46:
                {
                alt31=8;
                }
                break;
            case 47:
                {
                alt31=9;
                }
                break;
            case 48:
                {
                alt31=10;
                }
                break;
            case 49:
                {
                alt31=11;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("2492:1: ( ( 'duration' ) | ( 'dateTime' ) | ( 'time' ) | ( 'date' ) | ( 'string' ) | ( 'decimal' ) | ( 'integer' ) | ( 'positiveInteger' ) | ( 'nonNegativeInteger' ) | ( 'token' ) | ( 'base64Binary' ) )", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:2492:2: ( 'duration' )
                    {
                    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:2492:2: ( 'duration' )
                    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:2492:4: 'duration'
                    {
                    match(input,39,FOLLOW_39_in_ruleBuiltinType4797); 

                            current = grammarAccess.getBuiltinTypeAccess().getDurationEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getBuiltinTypeAccess().getDurationEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:2498:6: ( 'dateTime' )
                    {
                    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:2498:6: ( 'dateTime' )
                    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:2498:8: 'dateTime'
                    {
                    match(input,40,FOLLOW_40_in_ruleBuiltinType4812); 

                            current = grammarAccess.getBuiltinTypeAccess().getDateTimeEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getBuiltinTypeAccess().getDateTimeEnumLiteralDeclaration_1(), null); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:2504:6: ( 'time' )
                    {
                    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:2504:6: ( 'time' )
                    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:2504:8: 'time'
                    {
                    match(input,41,FOLLOW_41_in_ruleBuiltinType4827); 

                            current = grammarAccess.getBuiltinTypeAccess().getTimeEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getBuiltinTypeAccess().getTimeEnumLiteralDeclaration_2(), null); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:2510:6: ( 'date' )
                    {
                    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:2510:6: ( 'date' )
                    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:2510:8: 'date'
                    {
                    match(input,42,FOLLOW_42_in_ruleBuiltinType4842); 

                            current = grammarAccess.getBuiltinTypeAccess().getDateEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getBuiltinTypeAccess().getDateEnumLiteralDeclaration_3(), null); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:2516:6: ( 'string' )
                    {
                    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:2516:6: ( 'string' )
                    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:2516:8: 'string'
                    {
                    match(input,43,FOLLOW_43_in_ruleBuiltinType4857); 

                            current = grammarAccess.getBuiltinTypeAccess().getStringEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getBuiltinTypeAccess().getStringEnumLiteralDeclaration_4(), null); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:2522:6: ( 'decimal' )
                    {
                    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:2522:6: ( 'decimal' )
                    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:2522:8: 'decimal'
                    {
                    match(input,44,FOLLOW_44_in_ruleBuiltinType4872); 

                            current = grammarAccess.getBuiltinTypeAccess().getDecimalEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getBuiltinTypeAccess().getDecimalEnumLiteralDeclaration_5(), null); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:2528:6: ( 'integer' )
                    {
                    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:2528:6: ( 'integer' )
                    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:2528:8: 'integer'
                    {
                    match(input,45,FOLLOW_45_in_ruleBuiltinType4887); 

                            current = grammarAccess.getBuiltinTypeAccess().getIntegerEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getBuiltinTypeAccess().getIntegerEnumLiteralDeclaration_6(), null); 
                        

                    }


                    }
                    break;
                case 8 :
                    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:2534:6: ( 'positiveInteger' )
                    {
                    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:2534:6: ( 'positiveInteger' )
                    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:2534:8: 'positiveInteger'
                    {
                    match(input,46,FOLLOW_46_in_ruleBuiltinType4902); 

                            current = grammarAccess.getBuiltinTypeAccess().getPositiveIntegerEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getBuiltinTypeAccess().getPositiveIntegerEnumLiteralDeclaration_7(), null); 
                        

                    }


                    }
                    break;
                case 9 :
                    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:2540:6: ( 'nonNegativeInteger' )
                    {
                    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:2540:6: ( 'nonNegativeInteger' )
                    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:2540:8: 'nonNegativeInteger'
                    {
                    match(input,47,FOLLOW_47_in_ruleBuiltinType4917); 

                            current = grammarAccess.getBuiltinTypeAccess().getNonNegativeIntegerEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getBuiltinTypeAccess().getNonNegativeIntegerEnumLiteralDeclaration_8(), null); 
                        

                    }


                    }
                    break;
                case 10 :
                    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:2546:6: ( 'token' )
                    {
                    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:2546:6: ( 'token' )
                    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:2546:8: 'token'
                    {
                    match(input,48,FOLLOW_48_in_ruleBuiltinType4932); 

                            current = grammarAccess.getBuiltinTypeAccess().getTokenEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getBuiltinTypeAccess().getTokenEnumLiteralDeclaration_9(), null); 
                        

                    }


                    }
                    break;
                case 11 :
                    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:2552:6: ( 'base64Binary' )
                    {
                    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:2552:6: ( 'base64Binary' )
                    // ../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g:2552:8: 'base64Binary'
                    {
                    match(input,49,FOLLOW_49_in_ruleBuiltinType4947); 

                            current = grammarAccess.getBuiltinTypeAccess().getBase64BinaryEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getBuiltinTypeAccess().getBase64BinaryEnumLiteralDeclaration_10(), null); 
                        

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
    // $ANTLR end ruleBuiltinType


 

    public static final BitSet FOLLOW_ruleSchema_in_entryRuleSchema75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSchema85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleSchema120 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSchema137 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleSchema152 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSchema169 = new BitSet(new long[]{0x0000000300094002L});
    public static final BitSet FOLLOW_ruleImport_in_ruleSchema195 = new BitSet(new long[]{0x0000000300094002L});
    public static final BitSet FOLLOW_ruleTopLevelDefinition_in_ruleSchema217 = new BitSet(new long[]{0x0000000300090002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport254 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleImport299 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleImport316 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleImport331 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleImport348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTopLevelDefinition_in_entryRuleTopLevelDefinition389 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTopLevelDefinition399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTopLevelType_in_ruleTopLevelDefinition446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTopLevelElement_in_ruleTopLevelDefinition473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTopLevelType_in_entryRuleTopLevelType508 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTopLevelType518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTopLevelSimpleType_in_ruleTopLevelType565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTopLevelComplexType_in_ruleTopLevelType592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTopLevelElement_in_entryRuleTopLevelElement627 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTopLevelElement637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleTopLevelElement672 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTopLevelElement689 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_17_in_ruleTopLevelElement706 = new BitSet(new long[]{0x0003FF8000000010L});
    public static final BitSet FOLLOW_ruleNamedTypeReference_in_ruleTopLevelElement727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleTopLevelElement745 = new BitSet(new long[]{0x0000000200080000L});
    public static final BitSet FOLLOW_ruleEmbeddedType_in_ruleTopLevelElement766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTopLevelSimpleType_in_entryRuleTopLevelSimpleType804 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTopLevelSimpleType814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleTopLevelSimpleType849 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTopLevelSimpleType866 = new BitSet(new long[]{0x0000000002100002L});
    public static final BitSet FOLLOW_ruleRestriction_in_ruleTopLevelSimpleType892 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_ruleDocumentation_in_ruleTopLevelSimpleType914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRestriction_in_entryRuleRestriction951 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRestriction961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleRestriction996 = new BitSet(new long[]{0x0003FF8000000010L});
    public static final BitSet FOLLOW_ruleNonComplexTypeReference_in_ruleRestriction1017 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleRestriction1027 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleRestriction1037 = new BitSet(new long[]{0x00000000B4400000L});
    public static final BitSet FOLLOW_ruleFacet_in_ruleRestriction1058 = new BitSet(new long[]{0x00000000B4400002L});
    public static final BitSet FOLLOW_ruleFacet_in_entryRuleFacet1095 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFacet1105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumerationFacet_in_ruleFacet1152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMaxLengthFacet_in_ruleFacet1179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePatternFacet_in_ruleFacet1206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRangeFacet_in_ruleFacet1233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLengthFacet_in_ruleFacet1260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumerationFacet_in_entryRuleEnumerationFacet1295 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumerationFacet1305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleEnumerationFacet1340 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleEnumerationFacet1350 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleEnumerationLiteral_in_ruleEnumerationFacet1371 = new BitSet(new long[]{0x0000000001000030L});
    public static final BitSet FOLLOW_24_in_ruleEnumerationFacet1382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumerationLiteral_in_entryRuleEnumerationLiteral1418 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumerationLiteral1428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumerationLiteral1472 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEnumerationLiteral1492 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25_in_ruleEnumerationLiteral1511 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEnumerationLiteral1528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMaxLengthFacet_in_entryRuleMaxLengthFacet1571 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMaxLengthFacet1581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleMaxLengthFacet1616 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleMaxLengthFacet1626 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleMaxLengthFacet1643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePatternFacet_in_entryRulePatternFacet1684 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePatternFacet1694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rulePatternFacet1729 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_rulePatternFacet1739 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_PATTERN_STRING_in_rulePatternFacet1756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRangeFacet_in_entryRuleRangeFacet1797 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRangeFacet1807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleRangeFacet1842 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleRangeFacet1852 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleRangeFacet1869 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleRangeFacet1884 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleRangeFacet1901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLengthFacet_in_entryRuleLengthFacet1942 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLengthFacet1952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleLengthFacet1987 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleLengthFacet1997 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleLengthFacet2014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDocumentation_in_entryRuleDocumentation2055 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDocumentation2065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleDocumentation2100 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDocumentation2117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTopLevelComplexType_in_entryRuleTopLevelComplexType2158 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTopLevelComplexType2168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleTopLevelComplexType2211 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleTopLevelComplexType2235 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTopLevelComplexType2252 = new BitSet(new long[]{0x0000000400800000L});
    public static final BitSet FOLLOW_34_in_ruleTopLevelComplexType2268 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleTopLevelComplexTypeReference_in_ruleTopLevelComplexType2289 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleTopLevelComplexType2301 = new BitSet(new long[]{0x0000003001000010L});
    public static final BitSet FOLLOW_ruleProperty_in_ruleTopLevelComplexType2322 = new BitSet(new long[]{0x0000003001000010L});
    public static final BitSet FOLLOW_24_in_ruleTopLevelComplexType2333 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_35_in_ruleTopLevelComplexType2344 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTopLevelComplexType2361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty2404 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProperty2414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElement_in_ruleProperty2461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleProperty2488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElement_in_entryRuleElement2523 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElement2533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleElement2575 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_17_in_ruleElement2592 = new BitSet(new long[]{0x0003FF8000000010L});
    public static final BitSet FOLLOW_ruleNamedTypeReference_in_ruleElement2613 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_18_in_ruleElement2631 = new BitSet(new long[]{0x0000000200080000L});
    public static final BitSet FOLLOW_ruleEmbeddedType_in_ruleElement2652 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_ruleMultiplicity_in_ruleElement2675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute2712 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute2722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleAttribute2765 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleAttribute2789 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttribute2806 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleAttribute2821 = new BitSet(new long[]{0x0003FF8000000010L});
    public static final BitSet FOLLOW_ruleNonComplexTypeReference_in_ruleAttribute2842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicity_in_entryRuleMultiplicity2878 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplicity2888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleMultiplicity2932 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleMultiplicity2950 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleMultiplicity2965 = new BitSet(new long[]{0x0000004000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleMultiplicity2984 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_38_in_ruleMultiplicity3013 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleMultiplicity3037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamedTypeReference_in_entryRuleNamedTypeReference3073 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNamedTypeReference3083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTopLevelTypeReference_in_ruleNamedTypeReference3130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBuiltinTypeReference_in_ruleNamedTypeReference3157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNonComplexTypeReference_in_entryRuleNonComplexTypeReference3192 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNonComplexTypeReference3202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTopLevelSimpleTypeReference_in_ruleNonComplexTypeReference3249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBuiltinTypeReference_in_ruleNonComplexTypeReference3276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBuiltinTypeReference_in_entryRuleBuiltinTypeReference3311 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBuiltinTypeReference3321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBuiltinType_in_ruleBuiltinTypeReference3366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTopLevelTypeReference_in_entryRuleTopLevelTypeReference3401 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTopLevelTypeReference3411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDirectTopLevelTypeReference_in_ruleTopLevelTypeReference3458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImportedTopLevelTypeReference_in_ruleTopLevelTypeReference3485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTopLevelComplexTypeReference_in_entryRuleTopLevelComplexTypeReference3520 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTopLevelComplexTypeReference3530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDirectTopLevelComplexTypeReference_in_ruleTopLevelComplexTypeReference3577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImportedTopLevelComplexTypeReference_in_ruleTopLevelComplexTypeReference3604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTopLevelSimpleTypeReference_in_entryRuleTopLevelSimpleTypeReference3639 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTopLevelSimpleTypeReference3649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDirectTopLevelSimpleTypeReference_in_ruleTopLevelSimpleTypeReference3696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImportedTopLevelSimpleTypeReference_in_ruleTopLevelSimpleTypeReference3723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDirectTopLevelTypeReference_in_entryRuleDirectTopLevelTypeReference3758 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDirectTopLevelTypeReference3768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDirectTopLevelTypeReference3810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDirectTopLevelSimpleTypeReference_in_entryRuleDirectTopLevelSimpleTypeReference3845 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDirectTopLevelSimpleTypeReference3855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDirectTopLevelSimpleTypeReference3897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDirectTopLevelComplexTypeReference_in_entryRuleDirectTopLevelComplexTypeReference3932 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDirectTopLevelComplexTypeReference3942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDirectTopLevelComplexTypeReference3984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImportedTopLevelTypeReference_in_entryRuleImportedTopLevelTypeReference4019 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImportedTopLevelTypeReference4029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleImportedTopLevelTypeReference4072 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleImportedTopLevelTypeReference4082 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleImportedTopLevelTypeReference4100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImportedTopLevelSimpleTypeReference_in_entryRuleImportedTopLevelSimpleTypeReference4136 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImportedTopLevelSimpleTypeReference4146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleImportedTopLevelSimpleTypeReference4189 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleImportedTopLevelSimpleTypeReference4199 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleImportedTopLevelSimpleTypeReference4217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImportedTopLevelComplexTypeReference_in_entryRuleImportedTopLevelComplexTypeReference4253 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImportedTopLevelComplexTypeReference4263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleImportedTopLevelComplexTypeReference4306 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleImportedTopLevelComplexTypeReference4316 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleImportedTopLevelComplexTypeReference4334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmbeddedType_in_entryRuleEmbeddedType4372 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEmbeddedType4382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmbeddedComplexType_in_ruleEmbeddedType4429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmbeddedSimpleType_in_ruleEmbeddedType4456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmbeddedComplexType_in_entryRuleEmbeddedComplexType4491 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEmbeddedComplexType4501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleEmbeddedComplexType4545 = new BitSet(new long[]{0x0000000400800000L});
    public static final BitSet FOLLOW_34_in_ruleEmbeddedComplexType4556 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleTopLevelComplexTypeReference_in_ruleEmbeddedComplexType4577 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleEmbeddedComplexType4589 = new BitSet(new long[]{0x0000003001000010L});
    public static final BitSet FOLLOW_ruleProperty_in_ruleEmbeddedComplexType4610 = new BitSet(new long[]{0x0000003001000010L});
    public static final BitSet FOLLOW_24_in_ruleEmbeddedComplexType4621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmbeddedSimpleType_in_entryRuleEmbeddedSimpleType4657 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEmbeddedSimpleType4667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleEmbeddedSimpleType4702 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ruleRestriction_in_ruleEmbeddedSimpleType4723 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_ruleDocumentation_in_ruleEmbeddedSimpleType4744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleBuiltinType4797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleBuiltinType4812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleBuiltinType4827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleBuiltinType4842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleBuiltinType4857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleBuiltinType4872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleBuiltinType4887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleBuiltinType4902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleBuiltinType4917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleBuiltinType4932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleBuiltinType4947 = new BitSet(new long[]{0x0000000000000002L});

}