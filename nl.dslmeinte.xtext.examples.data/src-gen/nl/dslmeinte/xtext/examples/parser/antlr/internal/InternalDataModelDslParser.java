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
import nl.dslmeinte.xtext.examples.services.DataModelDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDataModelDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'primitive-types'", "'{'", "'}'", "'extends'", "'->'", "'datatype'", "':'", "'enum'", "'transient'", "'abstract'", "'entity'", "'constraint'", "'uses'", "'function'", "'('", "')'", "'string'", "'int'", "'number'", "'boolean'", "'optional'", "'required'", "'repeated'"
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
    public String getGrammarFileName() { return "../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g"; }



     	private DataModelDslGrammarAccess grammarAccess;
     	
        public InternalDataModelDslParser(TokenStream input, IAstFactory factory, DataModelDslGrammarAccess grammarAccess) {
            this(input);
            this.factory = factory;
            registerRules(grammarAccess.getGrammar());
            this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected InputStream getTokenFile() {
        	ClassLoader classLoader = getClass().getClassLoader();
        	return classLoader.getResourceAsStream("nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.tokens");
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "DataModel";	
       	}
       	
       	@Override
       	protected DataModelDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start entryRuleDataModel
    // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:78:1: entryRuleDataModel returns [EObject current=null] : iv_ruleDataModel= ruleDataModel EOF ;
    public final EObject entryRuleDataModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataModel = null;


        try {
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:79:2: (iv_ruleDataModel= ruleDataModel EOF )
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:80:2: iv_ruleDataModel= ruleDataModel EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDataModelRule(), currentNode); 
            pushFollow(FOLLOW_ruleDataModel_in_entryRuleDataModel75);
            iv_ruleDataModel=ruleDataModel();
            _fsp--;

             current =iv_ruleDataModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataModel85); 

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
    // $ANTLR end entryRuleDataModel


    // $ANTLR start ruleDataModel
    // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:87:1: ruleDataModel returns [EObject current=null] : ( ( (lv_primitives_0_0= rulePrimitiveTypes ) ) ( (lv_compoundTypes_1_0= ruleCompoundType ) )* ) ;
    public final EObject ruleDataModel() throws RecognitionException {
        EObject current = null;

        EObject lv_primitives_0_0 = null;

        EObject lv_compoundTypes_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:92:6: ( ( ( (lv_primitives_0_0= rulePrimitiveTypes ) ) ( (lv_compoundTypes_1_0= ruleCompoundType ) )* ) )
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:93:1: ( ( (lv_primitives_0_0= rulePrimitiveTypes ) ) ( (lv_compoundTypes_1_0= ruleCompoundType ) )* )
            {
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:93:1: ( ( (lv_primitives_0_0= rulePrimitiveTypes ) ) ( (lv_compoundTypes_1_0= ruleCompoundType ) )* )
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:93:2: ( (lv_primitives_0_0= rulePrimitiveTypes ) ) ( (lv_compoundTypes_1_0= ruleCompoundType ) )*
            {
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:93:2: ( (lv_primitives_0_0= rulePrimitiveTypes ) )
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:94:1: (lv_primitives_0_0= rulePrimitiveTypes )
            {
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:94:1: (lv_primitives_0_0= rulePrimitiveTypes )
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:95:3: lv_primitives_0_0= rulePrimitiveTypes
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getDataModelAccess().getPrimitivesPrimitiveTypesParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_rulePrimitiveTypes_in_ruleDataModel131);
            lv_primitives_0_0=rulePrimitiveTypes();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getDataModelRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"primitives",
            	        		lv_primitives_0_0, 
            	        		"PrimitiveTypes", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:117:2: ( (lv_compoundTypes_1_0= ruleCompoundType ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==16||LA1_0==18) ) {
                    alt1=1;
                }
                else if ( LA1_0 ==19 && getUnorderedGroupHelper().canSelect(grammarAccess.getEntityAccess().getUnorderedGroup_0(), 0) ) {
                    alt1=1;
                }
                else if ( LA1_0 ==20 && getUnorderedGroupHelper().canSelect(grammarAccess.getEntityAccess().getUnorderedGroup_0(), 1) ) {
                    alt1=1;
                }
                else if ( (LA1_0==21) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:118:1: (lv_compoundTypes_1_0= ruleCompoundType )
            	    {
            	    // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:118:1: (lv_compoundTypes_1_0= ruleCompoundType )
            	    // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:119:3: lv_compoundTypes_1_0= ruleCompoundType
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getDataModelAccess().getCompoundTypesCompoundTypeParserRuleCall_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleCompoundType_in_ruleDataModel152);
            	    lv_compoundTypes_1_0=ruleCompoundType();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getDataModelRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"compoundTypes",
            	    	        		lv_compoundTypes_1_0, 
            	    	        		"CompoundType", 
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
    // $ANTLR end ruleDataModel


    // $ANTLR start entryRuleCompoundType
    // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:151:1: entryRuleCompoundType returns [EObject current=null] : iv_ruleCompoundType= ruleCompoundType EOF ;
    public final EObject entryRuleCompoundType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompoundType = null;


        try {
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:152:2: (iv_ruleCompoundType= ruleCompoundType EOF )
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:153:2: iv_ruleCompoundType= ruleCompoundType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getCompoundTypeRule(), currentNode); 
            pushFollow(FOLLOW_ruleCompoundType_in_entryRuleCompoundType191);
            iv_ruleCompoundType=ruleCompoundType();
            _fsp--;

             current =iv_ruleCompoundType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompoundType201); 

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
    // $ANTLR end entryRuleCompoundType


    // $ANTLR start ruleCompoundType
    // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:160:1: ruleCompoundType returns [EObject current=null] : (this_DataType_0= ruleDataType | this_Enumeration_1= ruleEnumeration | this_Entity_2= ruleEntity ) ;
    public final EObject ruleCompoundType() throws RecognitionException {
        EObject current = null;

        EObject this_DataType_0 = null;

        EObject this_Enumeration_1 = null;

        EObject this_Entity_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:165:6: ( (this_DataType_0= ruleDataType | this_Enumeration_1= ruleEnumeration | this_Entity_2= ruleEntity ) )
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:166:1: (this_DataType_0= ruleDataType | this_Enumeration_1= ruleEnumeration | this_Entity_2= ruleEntity )
            {
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:166:1: (this_DataType_0= ruleDataType | this_Enumeration_1= ruleEnumeration | this_Entity_2= ruleEntity )
            int alt2=3;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==16) ) {
                alt2=1;
            }
            else if ( (LA2_0==18) ) {
                alt2=2;
            }
            else if ( LA2_0 ==19 && getUnorderedGroupHelper().canSelect(grammarAccess.getEntityAccess().getUnorderedGroup_0(), 0) ) {
                alt2=3;
            }
            else if ( LA2_0 ==20 && getUnorderedGroupHelper().canSelect(grammarAccess.getEntityAccess().getUnorderedGroup_0(), 1) ) {
                alt2=3;
            }
            else if ( (LA2_0==21) ) {
                alt2=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("166:1: (this_DataType_0= ruleDataType | this_Enumeration_1= ruleEnumeration | this_Entity_2= ruleEntity )", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:167:5: this_DataType_0= ruleDataType
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getCompoundTypeAccess().getDataTypeParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleDataType_in_ruleCompoundType248);
                    this_DataType_0=ruleDataType();
                    _fsp--;

                     
                            current = this_DataType_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:177:5: this_Enumeration_1= ruleEnumeration
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getCompoundTypeAccess().getEnumerationParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleEnumeration_in_ruleCompoundType275);
                    this_Enumeration_1=ruleEnumeration();
                    _fsp--;

                     
                            current = this_Enumeration_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:187:5: this_Entity_2= ruleEntity
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getCompoundTypeAccess().getEntityParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleEntity_in_ruleCompoundType302);
                    this_Entity_2=ruleEntity();
                    _fsp--;

                     
                            current = this_Entity_2; 
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
    // $ANTLR end ruleCompoundType


    // $ANTLR start entryRulePrimitiveTypes
    // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:203:1: entryRulePrimitiveTypes returns [EObject current=null] : iv_rulePrimitiveTypes= rulePrimitiveTypes EOF ;
    public final EObject entryRulePrimitiveTypes() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveTypes = null;


        try {
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:204:2: (iv_rulePrimitiveTypes= rulePrimitiveTypes EOF )
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:205:2: iv_rulePrimitiveTypes= rulePrimitiveTypes EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPrimitiveTypesRule(), currentNode); 
            pushFollow(FOLLOW_rulePrimitiveTypes_in_entryRulePrimitiveTypes337);
            iv_rulePrimitiveTypes=rulePrimitiveTypes();
            _fsp--;

             current =iv_rulePrimitiveTypes; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitiveTypes347); 

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
    // $ANTLR end entryRulePrimitiveTypes


    // $ANTLR start rulePrimitiveTypes
    // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:212:1: rulePrimitiveTypes returns [EObject current=null] : ( () 'primitive-types' '{' ( (lv_primitiveTypes_3_0= rulePrimitiveType ) )* '}' ) ;
    public final EObject rulePrimitiveTypes() throws RecognitionException {
        EObject current = null;

        EObject lv_primitiveTypes_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:217:6: ( ( () 'primitive-types' '{' ( (lv_primitiveTypes_3_0= rulePrimitiveType ) )* '}' ) )
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:218:1: ( () 'primitive-types' '{' ( (lv_primitiveTypes_3_0= rulePrimitiveType ) )* '}' )
            {
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:218:1: ( () 'primitive-types' '{' ( (lv_primitiveTypes_3_0= rulePrimitiveType ) )* '}' )
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:218:2: () 'primitive-types' '{' ( (lv_primitiveTypes_3_0= rulePrimitiveType ) )* '}'
            {
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:218:2: ()
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:219:5: 
            {
             
                    temp=factory.create(grammarAccess.getPrimitiveTypesAccess().getPrimitiveTypesAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getPrimitiveTypesAccess().getPrimitiveTypesAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            match(input,11,FOLLOW_11_in_rulePrimitiveTypes391); 

                    createLeafNode(grammarAccess.getPrimitiveTypesAccess().getPrimitiveTypesKeyword_1(), null); 
                
            match(input,12,FOLLOW_12_in_rulePrimitiveTypes401); 

                    createLeafNode(grammarAccess.getPrimitiveTypesAccess().getLeftCurlyBracketKeyword_2(), null); 
                
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:237:1: ( (lv_primitiveTypes_3_0= rulePrimitiveType ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:238:1: (lv_primitiveTypes_3_0= rulePrimitiveType )
            	    {
            	    // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:238:1: (lv_primitiveTypes_3_0= rulePrimitiveType )
            	    // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:239:3: lv_primitiveTypes_3_0= rulePrimitiveType
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getPrimitiveTypesAccess().getPrimitiveTypesPrimitiveTypeParserRuleCall_3_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_rulePrimitiveType_in_rulePrimitiveTypes422);
            	    lv_primitiveTypes_3_0=rulePrimitiveType();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getPrimitiveTypesRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"primitiveTypes",
            	    	        		lv_primitiveTypes_3_0, 
            	    	        		"PrimitiveType", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            match(input,13,FOLLOW_13_in_rulePrimitiveTypes433); 

                    createLeafNode(grammarAccess.getPrimitiveTypesAccess().getRightCurlyBracketKeyword_4(), null); 
                

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
    // $ANTLR end rulePrimitiveTypes


    // $ANTLR start entryRulePrimitiveType
    // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:273:1: entryRulePrimitiveType returns [EObject current=null] : iv_rulePrimitiveType= rulePrimitiveType EOF ;
    public final EObject entryRulePrimitiveType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveType = null;


        try {
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:274:2: (iv_rulePrimitiveType= rulePrimitiveType EOF )
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:275:2: iv_rulePrimitiveType= rulePrimitiveType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPrimitiveTypeRule(), currentNode); 
            pushFollow(FOLLOW_rulePrimitiveType_in_entryRulePrimitiveType469);
            iv_rulePrimitiveType=rulePrimitiveType();
            _fsp--;

             current =iv_rulePrimitiveType; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitiveType479); 

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
    // $ANTLR end entryRulePrimitiveType


    // $ANTLR start rulePrimitiveType
    // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:282:1: rulePrimitiveType returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( ( 'extends' ( ( RULE_ID ) ) ) | ( '->' ( (lv_realizationType_4_0= ruleMetaPrimitiveType ) ) )? ) ) ;
    public final EObject rulePrimitiveType() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Enumerator lv_realizationType_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:287:6: ( ( ( (lv_name_0_0= RULE_ID ) ) ( ( 'extends' ( ( RULE_ID ) ) ) | ( '->' ( (lv_realizationType_4_0= ruleMetaPrimitiveType ) ) )? ) ) )
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:288:1: ( ( (lv_name_0_0= RULE_ID ) ) ( ( 'extends' ( ( RULE_ID ) ) ) | ( '->' ( (lv_realizationType_4_0= ruleMetaPrimitiveType ) ) )? ) )
            {
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:288:1: ( ( (lv_name_0_0= RULE_ID ) ) ( ( 'extends' ( ( RULE_ID ) ) ) | ( '->' ( (lv_realizationType_4_0= ruleMetaPrimitiveType ) ) )? ) )
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:288:2: ( (lv_name_0_0= RULE_ID ) ) ( ( 'extends' ( ( RULE_ID ) ) ) | ( '->' ( (lv_realizationType_4_0= ruleMetaPrimitiveType ) ) )? )
            {
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:288:2: ( (lv_name_0_0= RULE_ID ) )
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:289:1: (lv_name_0_0= RULE_ID )
            {
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:289:1: (lv_name_0_0= RULE_ID )
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:290:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimitiveType521); 

            			createLeafNode(grammarAccess.getPrimitiveTypeAccess().getNameIDTerminalRuleCall_0_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getPrimitiveTypeRule().getType().getClassifier());
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

            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:312:2: ( ( 'extends' ( ( RULE_ID ) ) ) | ( '->' ( (lv_realizationType_4_0= ruleMetaPrimitiveType ) ) )? )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==14) ) {
                alt5=1;
            }
            else if ( (LA5_0==EOF||LA5_0==RULE_ID||LA5_0==13||LA5_0==15) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("312:2: ( ( 'extends' ( ( RULE_ID ) ) ) | ( '->' ( (lv_realizationType_4_0= ruleMetaPrimitiveType ) ) )? )", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:312:3: ( 'extends' ( ( RULE_ID ) ) )
                    {
                    // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:312:3: ( 'extends' ( ( RULE_ID ) ) )
                    // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:312:5: 'extends' ( ( RULE_ID ) )
                    {
                    match(input,14,FOLLOW_14_in_rulePrimitiveType538); 

                            createLeafNode(grammarAccess.getPrimitiveTypeAccess().getExtendsKeyword_1_0_0(), null); 
                        
                    // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:316:1: ( ( RULE_ID ) )
                    // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:317:1: ( RULE_ID )
                    {
                    // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:317:1: ( RULE_ID )
                    // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:318:3: RULE_ID
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getPrimitiveTypeRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimitiveType556); 

                    		createLeafNode(grammarAccess.getPrimitiveTypeAccess().getSuperTypePrimitiveTypeCrossReference_1_0_1_0(), "superType"); 
                    	

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:331:6: ( '->' ( (lv_realizationType_4_0= ruleMetaPrimitiveType ) ) )?
                    {
                    // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:331:6: ( '->' ( (lv_realizationType_4_0= ruleMetaPrimitiveType ) ) )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==15) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:331:8: '->' ( (lv_realizationType_4_0= ruleMetaPrimitiveType ) )
                            {
                            match(input,15,FOLLOW_15_in_rulePrimitiveType574); 

                                    createLeafNode(grammarAccess.getPrimitiveTypeAccess().getHyphenMinusGreaterThanSignKeyword_1_1_0(), null); 
                                
                            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:335:1: ( (lv_realizationType_4_0= ruleMetaPrimitiveType ) )
                            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:336:1: (lv_realizationType_4_0= ruleMetaPrimitiveType )
                            {
                            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:336:1: (lv_realizationType_4_0= ruleMetaPrimitiveType )
                            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:337:3: lv_realizationType_4_0= ruleMetaPrimitiveType
                            {
                             
                            	        currentNode=createCompositeNode(grammarAccess.getPrimitiveTypeAccess().getRealizationTypeMetaPrimitiveTypeEnumRuleCall_1_1_1_0(), currentNode); 
                            	    
                            pushFollow(FOLLOW_ruleMetaPrimitiveType_in_rulePrimitiveType595);
                            lv_realizationType_4_0=ruleMetaPrimitiveType();
                            _fsp--;


                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getPrimitiveTypeRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode.getParent(), current);
                            	        }
                            	        try {
                            	       		set(
                            	       			current, 
                            	       			"realizationType",
                            	        		lv_realizationType_4_0, 
                            	        		"MetaPrimitiveType", 
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
    // $ANTLR end rulePrimitiveType


    // $ANTLR start entryRuleDataType
    // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:367:1: entryRuleDataType returns [EObject current=null] : iv_ruleDataType= ruleDataType EOF ;
    public final EObject entryRuleDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataType = null;


        try {
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:368:2: (iv_ruleDataType= ruleDataType EOF )
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:369:2: iv_ruleDataType= ruleDataType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDataTypeRule(), currentNode); 
            pushFollow(FOLLOW_ruleDataType_in_entryRuleDataType634);
            iv_ruleDataType=ruleDataType();
            _fsp--;

             current =iv_ruleDataType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataType644); 

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
    // $ANTLR end entryRuleDataType


    // $ANTLR start ruleDataType
    // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:376:1: ruleDataType returns [EObject current=null] : ( 'datatype' ( (lv_name_1_0= RULE_ID ) ) '{' ( (lv_fields_3_0= ruleField ) )* ( (lv_constraints_4_0= ruleConstraint ) )* ( (lv_functions_5_0= ruleFunction ) )* '}' ) ;
    public final EObject ruleDataType() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_fields_3_0 = null;

        EObject lv_constraints_4_0 = null;

        EObject lv_functions_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:381:6: ( ( 'datatype' ( (lv_name_1_0= RULE_ID ) ) '{' ( (lv_fields_3_0= ruleField ) )* ( (lv_constraints_4_0= ruleConstraint ) )* ( (lv_functions_5_0= ruleFunction ) )* '}' ) )
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:382:1: ( 'datatype' ( (lv_name_1_0= RULE_ID ) ) '{' ( (lv_fields_3_0= ruleField ) )* ( (lv_constraints_4_0= ruleConstraint ) )* ( (lv_functions_5_0= ruleFunction ) )* '}' )
            {
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:382:1: ( 'datatype' ( (lv_name_1_0= RULE_ID ) ) '{' ( (lv_fields_3_0= ruleField ) )* ( (lv_constraints_4_0= ruleConstraint ) )* ( (lv_functions_5_0= ruleFunction ) )* '}' )
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:382:3: 'datatype' ( (lv_name_1_0= RULE_ID ) ) '{' ( (lv_fields_3_0= ruleField ) )* ( (lv_constraints_4_0= ruleConstraint ) )* ( (lv_functions_5_0= ruleFunction ) )* '}'
            {
            match(input,16,FOLLOW_16_in_ruleDataType679); 

                    createLeafNode(grammarAccess.getDataTypeAccess().getDatatypeKeyword_0(), null); 
                
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:386:1: ( (lv_name_1_0= RULE_ID ) )
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:387:1: (lv_name_1_0= RULE_ID )
            {
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:387:1: (lv_name_1_0= RULE_ID )
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:388:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDataType696); 

            			createLeafNode(grammarAccess.getDataTypeAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getDataTypeRule().getType().getClassifier());
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

            match(input,12,FOLLOW_12_in_ruleDataType711); 

                    createLeafNode(grammarAccess.getDataTypeAccess().getLeftCurlyBracketKeyword_2(), null); 
                
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:414:1: ( (lv_fields_3_0= ruleField ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID||(LA6_0>=31 && LA6_0<=33)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:415:1: (lv_fields_3_0= ruleField )
            	    {
            	    // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:415:1: (lv_fields_3_0= ruleField )
            	    // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:416:3: lv_fields_3_0= ruleField
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getDataTypeAccess().getFieldsFieldParserRuleCall_3_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleField_in_ruleDataType732);
            	    lv_fields_3_0=ruleField();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getDataTypeRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"fields",
            	    	        		lv_fields_3_0, 
            	    	        		"Field", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:438:3: ( (lv_constraints_4_0= ruleConstraint ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==22) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:439:1: (lv_constraints_4_0= ruleConstraint )
            	    {
            	    // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:439:1: (lv_constraints_4_0= ruleConstraint )
            	    // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:440:3: lv_constraints_4_0= ruleConstraint
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getDataTypeAccess().getConstraintsConstraintParserRuleCall_4_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleConstraint_in_ruleDataType754);
            	    lv_constraints_4_0=ruleConstraint();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getDataTypeRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"constraints",
            	    	        		lv_constraints_4_0, 
            	    	        		"Constraint", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:462:3: ( (lv_functions_5_0= ruleFunction ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==24) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:463:1: (lv_functions_5_0= ruleFunction )
            	    {
            	    // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:463:1: (lv_functions_5_0= ruleFunction )
            	    // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:464:3: lv_functions_5_0= ruleFunction
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getDataTypeAccess().getFunctionsFunctionParserRuleCall_5_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleFunction_in_ruleDataType776);
            	    lv_functions_5_0=ruleFunction();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getDataTypeRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"functions",
            	    	        		lv_functions_5_0, 
            	    	        		"Function", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            match(input,13,FOLLOW_13_in_ruleDataType787); 

                    createLeafNode(grammarAccess.getDataTypeAccess().getRightCurlyBracketKeyword_6(), null); 
                

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
    // $ANTLR end ruleDataType


    // $ANTLR start entryRuleField
    // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:498:1: entryRuleField returns [EObject current=null] : iv_ruleField= ruleField EOF ;
    public final EObject entryRuleField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleField = null;


        try {
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:499:2: (iv_ruleField= ruleField EOF )
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:500:2: iv_ruleField= ruleField EOF
            {
             currentNode = createCompositeNode(grammarAccess.getFieldRule(), currentNode); 
            pushFollow(FOLLOW_ruleField_in_entryRuleField823);
            iv_ruleField=ruleField();
            _fsp--;

             current =iv_ruleField; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleField833); 

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
    // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:507:1: ruleField returns [EObject current=null] : ( ( (lv_modifier_0_0= ruleModifier ) )? ( (lv_name_1_0= RULE_ID ) ) ':' ( ( RULE_ID ) ) ) ;
    public final EObject ruleField() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Enumerator lv_modifier_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:512:6: ( ( ( (lv_modifier_0_0= ruleModifier ) )? ( (lv_name_1_0= RULE_ID ) ) ':' ( ( RULE_ID ) ) ) )
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:513:1: ( ( (lv_modifier_0_0= ruleModifier ) )? ( (lv_name_1_0= RULE_ID ) ) ':' ( ( RULE_ID ) ) )
            {
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:513:1: ( ( (lv_modifier_0_0= ruleModifier ) )? ( (lv_name_1_0= RULE_ID ) ) ':' ( ( RULE_ID ) ) )
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:513:2: ( (lv_modifier_0_0= ruleModifier ) )? ( (lv_name_1_0= RULE_ID ) ) ':' ( ( RULE_ID ) )
            {
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:513:2: ( (lv_modifier_0_0= ruleModifier ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=31 && LA9_0<=33)) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:514:1: (lv_modifier_0_0= ruleModifier )
                    {
                    // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:514:1: (lv_modifier_0_0= ruleModifier )
                    // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:515:3: lv_modifier_0_0= ruleModifier
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getFieldAccess().getModifierModifierEnumRuleCall_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleModifier_in_ruleField879);
                    lv_modifier_0_0=ruleModifier();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getFieldRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"modifier",
                    	        		lv_modifier_0_0, 
                    	        		"Modifier", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;

            }

            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:537:3: ( (lv_name_1_0= RULE_ID ) )
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:538:1: (lv_name_1_0= RULE_ID )
            {
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:538:1: (lv_name_1_0= RULE_ID )
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:539:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleField897); 

            			createLeafNode(grammarAccess.getFieldAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getFieldRule().getType().getClassifier());
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

            match(input,17,FOLLOW_17_in_ruleField912); 

                    createLeafNode(grammarAccess.getFieldAccess().getColonKeyword_2(), null); 
                
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:565:1: ( ( RULE_ID ) )
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:566:1: ( RULE_ID )
            {
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:566:1: ( RULE_ID )
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:567:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getFieldRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleField930); 

            		createLeafNode(grammarAccess.getFieldAccess().getTypeTypeCrossReference_3_0(), "type"); 
            	

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
    // $ANTLR end ruleField


    // $ANTLR start entryRuleEnumeration
    // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:587:1: entryRuleEnumeration returns [EObject current=null] : iv_ruleEnumeration= ruleEnumeration EOF ;
    public final EObject entryRuleEnumeration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumeration = null;


        try {
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:588:2: (iv_ruleEnumeration= ruleEnumeration EOF )
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:589:2: iv_ruleEnumeration= ruleEnumeration EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEnumerationRule(), currentNode); 
            pushFollow(FOLLOW_ruleEnumeration_in_entryRuleEnumeration966);
            iv_ruleEnumeration=ruleEnumeration();
            _fsp--;

             current =iv_ruleEnumeration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumeration976); 

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
    // $ANTLR end entryRuleEnumeration


    // $ANTLR start ruleEnumeration
    // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:596:1: ruleEnumeration returns [EObject current=null] : ( 'enum' ( (lv_name_1_0= RULE_ID ) ) '{' ( (lv_literals_3_0= ruleEnumLiteral ) )* '}' ) ;
    public final EObject ruleEnumeration() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_literals_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:601:6: ( ( 'enum' ( (lv_name_1_0= RULE_ID ) ) '{' ( (lv_literals_3_0= ruleEnumLiteral ) )* '}' ) )
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:602:1: ( 'enum' ( (lv_name_1_0= RULE_ID ) ) '{' ( (lv_literals_3_0= ruleEnumLiteral ) )* '}' )
            {
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:602:1: ( 'enum' ( (lv_name_1_0= RULE_ID ) ) '{' ( (lv_literals_3_0= ruleEnumLiteral ) )* '}' )
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:602:3: 'enum' ( (lv_name_1_0= RULE_ID ) ) '{' ( (lv_literals_3_0= ruleEnumLiteral ) )* '}'
            {
            match(input,18,FOLLOW_18_in_ruleEnumeration1011); 

                    createLeafNode(grammarAccess.getEnumerationAccess().getEnumKeyword_0(), null); 
                
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:606:1: ( (lv_name_1_0= RULE_ID ) )
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:607:1: (lv_name_1_0= RULE_ID )
            {
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:607:1: (lv_name_1_0= RULE_ID )
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:608:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumeration1028); 

            			createLeafNode(grammarAccess.getEnumerationAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getEnumerationRule().getType().getClassifier());
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

            match(input,12,FOLLOW_12_in_ruleEnumeration1043); 

                    createLeafNode(grammarAccess.getEnumerationAccess().getLeftCurlyBracketKeyword_2(), null); 
                
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:634:1: ( (lv_literals_3_0= ruleEnumLiteral ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:635:1: (lv_literals_3_0= ruleEnumLiteral )
            	    {
            	    // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:635:1: (lv_literals_3_0= ruleEnumLiteral )
            	    // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:636:3: lv_literals_3_0= ruleEnumLiteral
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getEnumerationAccess().getLiteralsEnumLiteralParserRuleCall_3_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleEnumLiteral_in_ruleEnumeration1064);
            	    lv_literals_3_0=ruleEnumLiteral();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getEnumerationRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"literals",
            	    	        		lv_literals_3_0, 
            	    	        		"EnumLiteral", 
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

            match(input,13,FOLLOW_13_in_ruleEnumeration1075); 

                    createLeafNode(grammarAccess.getEnumerationAccess().getRightCurlyBracketKeyword_4(), null); 
                

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
    // $ANTLR end ruleEnumeration


    // $ANTLR start entryRuleEnumLiteral
    // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:670:1: entryRuleEnumLiteral returns [EObject current=null] : iv_ruleEnumLiteral= ruleEnumLiteral EOF ;
    public final EObject entryRuleEnumLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumLiteral = null;


        try {
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:671:2: (iv_ruleEnumLiteral= ruleEnumLiteral EOF )
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:672:2: iv_ruleEnumLiteral= ruleEnumLiteral EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEnumLiteralRule(), currentNode); 
            pushFollow(FOLLOW_ruleEnumLiteral_in_entryRuleEnumLiteral1111);
            iv_ruleEnumLiteral=ruleEnumLiteral();
            _fsp--;

             current =iv_ruleEnumLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumLiteral1121); 

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
    // $ANTLR end entryRuleEnumLiteral


    // $ANTLR start ruleEnumLiteral
    // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:679:1: ruleEnumLiteral returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleEnumLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:684:6: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:685:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:685:1: ( (lv_name_0_0= RULE_ID ) )
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:686:1: (lv_name_0_0= RULE_ID )
            {
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:686:1: (lv_name_0_0= RULE_ID )
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:687:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumLiteral1162); 

            			createLeafNode(grammarAccess.getEnumLiteralAccess().getNameIDTerminalRuleCall_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getEnumLiteralRule().getType().getClassifier());
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
    // $ANTLR end ruleEnumLiteral


    // $ANTLR start entryRuleEntity
    // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:717:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:718:2: (iv_ruleEntity= ruleEntity EOF )
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:719:2: iv_ruleEntity= ruleEntity EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEntityRule(), currentNode); 
            pushFollow(FOLLOW_ruleEntity_in_entryRuleEntity1202);
            iv_ruleEntity=ruleEntity();
            _fsp--;

             current =iv_ruleEntity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntity1212); 

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
    // $ANTLR end entryRuleEntity


    // $ANTLR start ruleEntity
    // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:726:1: ruleEntity returns [EObject current=null] : ( ( ( ( ( ({...}? => ( ( (lv_transient_1_0= 'transient' ) ) ) ) | ({...}? => ( ( (lv_abstract_2_0= 'abstract' ) ) ) ) )* ) ) ) 'entity' ( (lv_name_4_0= RULE_ID ) ) ( 'extends' ( ( RULE_ID ) ) )? '{' ( (lv_fields_8_0= ruleField ) )* ( (lv_constraints_9_0= ruleConstraint ) )* ( (lv_functions_10_0= ruleFunction ) )* '}' ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token lv_transient_1_0=null;
        Token lv_abstract_2_0=null;
        Token lv_name_4_0=null;
        EObject lv_fields_8_0 = null;

        EObject lv_constraints_9_0 = null;

        EObject lv_functions_10_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:731:6: ( ( ( ( ( ( ({...}? => ( ( (lv_transient_1_0= 'transient' ) ) ) ) | ({...}? => ( ( (lv_abstract_2_0= 'abstract' ) ) ) ) )* ) ) ) 'entity' ( (lv_name_4_0= RULE_ID ) ) ( 'extends' ( ( RULE_ID ) ) )? '{' ( (lv_fields_8_0= ruleField ) )* ( (lv_constraints_9_0= ruleConstraint ) )* ( (lv_functions_10_0= ruleFunction ) )* '}' ) )
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:732:1: ( ( ( ( ( ({...}? => ( ( (lv_transient_1_0= 'transient' ) ) ) ) | ({...}? => ( ( (lv_abstract_2_0= 'abstract' ) ) ) ) )* ) ) ) 'entity' ( (lv_name_4_0= RULE_ID ) ) ( 'extends' ( ( RULE_ID ) ) )? '{' ( (lv_fields_8_0= ruleField ) )* ( (lv_constraints_9_0= ruleConstraint ) )* ( (lv_functions_10_0= ruleFunction ) )* '}' )
            {
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:732:1: ( ( ( ( ( ({...}? => ( ( (lv_transient_1_0= 'transient' ) ) ) ) | ({...}? => ( ( (lv_abstract_2_0= 'abstract' ) ) ) ) )* ) ) ) 'entity' ( (lv_name_4_0= RULE_ID ) ) ( 'extends' ( ( RULE_ID ) ) )? '{' ( (lv_fields_8_0= ruleField ) )* ( (lv_constraints_9_0= ruleConstraint ) )* ( (lv_functions_10_0= ruleFunction ) )* '}' )
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:732:2: ( ( ( ( ({...}? => ( ( (lv_transient_1_0= 'transient' ) ) ) ) | ({...}? => ( ( (lv_abstract_2_0= 'abstract' ) ) ) ) )* ) ) ) 'entity' ( (lv_name_4_0= RULE_ID ) ) ( 'extends' ( ( RULE_ID ) ) )? '{' ( (lv_fields_8_0= ruleField ) )* ( (lv_constraints_9_0= ruleConstraint ) )* ( (lv_functions_10_0= ruleFunction ) )* '}'
            {
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:732:2: ( ( ( ( ({...}? => ( ( (lv_transient_1_0= 'transient' ) ) ) ) | ({...}? => ( ( (lv_abstract_2_0= 'abstract' ) ) ) ) )* ) ) )
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:734:1: ( ( ( ({...}? => ( ( (lv_transient_1_0= 'transient' ) ) ) ) | ({...}? => ( ( (lv_abstract_2_0= 'abstract' ) ) ) ) )* ) )
            {
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:734:1: ( ( ( ({...}? => ( ( (lv_transient_1_0= 'transient' ) ) ) ) | ({...}? => ( ( (lv_abstract_2_0= 'abstract' ) ) ) ) )* ) )
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:735:2: ( ( ({...}? => ( ( (lv_transient_1_0= 'transient' ) ) ) ) | ({...}? => ( ( (lv_abstract_2_0= 'abstract' ) ) ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getEntityAccess().getUnorderedGroup_0());
            	
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:738:2: ( ( ({...}? => ( ( (lv_transient_1_0= 'transient' ) ) ) ) | ({...}? => ( ( (lv_abstract_2_0= 'abstract' ) ) ) ) )* )
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:739:3: ( ({...}? => ( ( (lv_transient_1_0= 'transient' ) ) ) ) | ({...}? => ( ( (lv_abstract_2_0= 'abstract' ) ) ) ) )*
            {
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:739:3: ( ({...}? => ( ( (lv_transient_1_0= 'transient' ) ) ) ) | ({...}? => ( ( (lv_abstract_2_0= 'abstract' ) ) ) ) )*
            loop11:
            do {
                int alt11=3;
                int LA11_0 = input.LA(1);

                if ( LA11_0 ==19 && getUnorderedGroupHelper().canSelect(grammarAccess.getEntityAccess().getUnorderedGroup_0(), 0) ) {
                    alt11=1;
                }
                else if ( LA11_0 ==20 && getUnorderedGroupHelper().canSelect(grammarAccess.getEntityAccess().getUnorderedGroup_0(), 1) ) {
                    alt11=2;
                }


                switch (alt11) {
            	case 1 :
            	    // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:741:4: ({...}? => ( ( (lv_transient_1_0= 'transient' ) ) ) )
            	    {
            	    // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:741:4: ({...}? => ( ( (lv_transient_1_0= 'transient' ) ) ) )
            	    // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:742:5: {...}? => ( ( (lv_transient_1_0= 'transient' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEntityAccess().getUnorderedGroup_0(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleEntity", "getUnorderedGroupHelper().canSelect(grammarAccess.getEntityAccess().getUnorderedGroup_0(), 0)");
            	    }
            	    // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:742:103: ( ( (lv_transient_1_0= 'transient' ) ) )
            	    // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:743:6: ( (lv_transient_1_0= 'transient' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getEntityAccess().getUnorderedGroup_0(), 0);
            	    	 				
            	    // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:746:6: ( (lv_transient_1_0= 'transient' ) )
            	    // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:747:1: (lv_transient_1_0= 'transient' )
            	    {
            	    // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:747:1: (lv_transient_1_0= 'transient' )
            	    // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:748:3: lv_transient_1_0= 'transient'
            	    {
            	    lv_transient_1_0=(Token)input.LT(1);
            	    match(input,19,FOLLOW_19_in_ruleEntity1297); 

            	            createLeafNode(grammarAccess.getEntityAccess().getTransientTransientKeyword_0_0_0(), "transient"); 
            	        

            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getEntityRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode, current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		set(current, "transient", true, "transient", lastConsumedNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	    

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEntityAccess().getUnorderedGroup_0());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:774:4: ({...}? => ( ( (lv_abstract_2_0= 'abstract' ) ) ) )
            	    {
            	    // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:774:4: ({...}? => ( ( (lv_abstract_2_0= 'abstract' ) ) ) )
            	    // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:775:5: {...}? => ( ( (lv_abstract_2_0= 'abstract' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEntityAccess().getUnorderedGroup_0(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEntity", "getUnorderedGroupHelper().canSelect(grammarAccess.getEntityAccess().getUnorderedGroup_0(), 1)");
            	    }
            	    // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:775:103: ( ( (lv_abstract_2_0= 'abstract' ) ) )
            	    // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:776:6: ( (lv_abstract_2_0= 'abstract' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getEntityAccess().getUnorderedGroup_0(), 1);
            	    	 				
            	    // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:779:6: ( (lv_abstract_2_0= 'abstract' ) )
            	    // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:780:1: (lv_abstract_2_0= 'abstract' )
            	    {
            	    // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:780:1: (lv_abstract_2_0= 'abstract' )
            	    // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:781:3: lv_abstract_2_0= 'abstract'
            	    {
            	    lv_abstract_2_0=(Token)input.LT(1);
            	    match(input,20,FOLLOW_20_in_ruleEntity1378); 

            	            createLeafNode(grammarAccess.getEntityAccess().getAbstractAbstractKeyword_0_1_0(), "abstract"); 
            	        

            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getEntityRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode, current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		set(current, "abstract", true, "abstract", lastConsumedNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	    

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEntityAccess().getUnorderedGroup_0());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getEntityAccess().getUnorderedGroup_0());
            	

            }

            match(input,21,FOLLOW_21_in_ruleEntity1440); 

                    createLeafNode(grammarAccess.getEntityAccess().getEntityKeyword_1(), null); 
                
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:818:1: ( (lv_name_4_0= RULE_ID ) )
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:819:1: (lv_name_4_0= RULE_ID )
            {
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:819:1: (lv_name_4_0= RULE_ID )
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:820:3: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntity1457); 

            			createLeafNode(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_2_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getEntityRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_4_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:842:2: ( 'extends' ( ( RULE_ID ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==14) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:842:4: 'extends' ( ( RULE_ID ) )
                    {
                    match(input,14,FOLLOW_14_in_ruleEntity1473); 

                            createLeafNode(grammarAccess.getEntityAccess().getExtendsKeyword_3_0(), null); 
                        
                    // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:846:1: ( ( RULE_ID ) )
                    // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:847:1: ( RULE_ID )
                    {
                    // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:847:1: ( RULE_ID )
                    // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:848:3: RULE_ID
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getEntityRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntity1491); 

                    		createLeafNode(grammarAccess.getEntityAccess().getSuperTypeEntityCrossReference_3_1_0(), "superType"); 
                    	

                    }


                    }


                    }
                    break;

            }

            match(input,12,FOLLOW_12_in_ruleEntity1503); 

                    createLeafNode(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_4(), null); 
                
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:864:1: ( (lv_fields_8_0= ruleField ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID||(LA13_0>=31 && LA13_0<=33)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:865:1: (lv_fields_8_0= ruleField )
            	    {
            	    // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:865:1: (lv_fields_8_0= ruleField )
            	    // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:866:3: lv_fields_8_0= ruleField
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getEntityAccess().getFieldsFieldParserRuleCall_5_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleField_in_ruleEntity1524);
            	    lv_fields_8_0=ruleField();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getEntityRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"fields",
            	    	        		lv_fields_8_0, 
            	    	        		"Field", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:888:3: ( (lv_constraints_9_0= ruleConstraint ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==22) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:889:1: (lv_constraints_9_0= ruleConstraint )
            	    {
            	    // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:889:1: (lv_constraints_9_0= ruleConstraint )
            	    // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:890:3: lv_constraints_9_0= ruleConstraint
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getEntityAccess().getConstraintsConstraintParserRuleCall_6_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleConstraint_in_ruleEntity1546);
            	    lv_constraints_9_0=ruleConstraint();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getEntityRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"constraints",
            	    	        		lv_constraints_9_0, 
            	    	        		"Constraint", 
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

            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:912:3: ( (lv_functions_10_0= ruleFunction ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==24) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:913:1: (lv_functions_10_0= ruleFunction )
            	    {
            	    // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:913:1: (lv_functions_10_0= ruleFunction )
            	    // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:914:3: lv_functions_10_0= ruleFunction
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getEntityAccess().getFunctionsFunctionParserRuleCall_7_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleFunction_in_ruleEntity1568);
            	    lv_functions_10_0=ruleFunction();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getEntityRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"functions",
            	    	        		lv_functions_10_0, 
            	    	        		"Function", 
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

            match(input,13,FOLLOW_13_in_ruleEntity1579); 

                    createLeafNode(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_8(), null); 
                

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
    // $ANTLR end ruleEntity


    // $ANTLR start entryRuleConstraint
    // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:948:1: entryRuleConstraint returns [EObject current=null] : iv_ruleConstraint= ruleConstraint EOF ;
    public final EObject entryRuleConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraint = null;


        try {
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:949:2: (iv_ruleConstraint= ruleConstraint EOF )
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:950:2: iv_ruleConstraint= ruleConstraint EOF
            {
             currentNode = createCompositeNode(grammarAccess.getConstraintRule(), currentNode); 
            pushFollow(FOLLOW_ruleConstraint_in_entryRuleConstraint1615);
            iv_ruleConstraint=ruleConstraint();
            _fsp--;

             current =iv_ruleConstraint; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstraint1625); 

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
    // $ANTLR end entryRuleConstraint


    // $ANTLR start ruleConstraint
    // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:957:1: ruleConstraint returns [EObject current=null] : ( 'constraint' ( (lv_name_1_0= RULE_ID ) ) 'uses' ( (lv_slots_3_0= ruleUsage ) )+ ) ;
    public final EObject ruleConstraint() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_slots_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:962:6: ( ( 'constraint' ( (lv_name_1_0= RULE_ID ) ) 'uses' ( (lv_slots_3_0= ruleUsage ) )+ ) )
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:963:1: ( 'constraint' ( (lv_name_1_0= RULE_ID ) ) 'uses' ( (lv_slots_3_0= ruleUsage ) )+ )
            {
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:963:1: ( 'constraint' ( (lv_name_1_0= RULE_ID ) ) 'uses' ( (lv_slots_3_0= ruleUsage ) )+ )
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:963:3: 'constraint' ( (lv_name_1_0= RULE_ID ) ) 'uses' ( (lv_slots_3_0= ruleUsage ) )+
            {
            match(input,22,FOLLOW_22_in_ruleConstraint1660); 

                    createLeafNode(grammarAccess.getConstraintAccess().getConstraintKeyword_0(), null); 
                
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:967:1: ( (lv_name_1_0= RULE_ID ) )
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:968:1: (lv_name_1_0= RULE_ID )
            {
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:968:1: (lv_name_1_0= RULE_ID )
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:969:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConstraint1677); 

            			createLeafNode(grammarAccess.getConstraintAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getConstraintRule().getType().getClassifier());
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

            match(input,23,FOLLOW_23_in_ruleConstraint1692); 

                    createLeafNode(grammarAccess.getConstraintAccess().getUsesKeyword_2(), null); 
                
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:995:1: ( (lv_slots_3_0= ruleUsage ) )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ID) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:996:1: (lv_slots_3_0= ruleUsage )
            	    {
            	    // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:996:1: (lv_slots_3_0= ruleUsage )
            	    // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:997:3: lv_slots_3_0= ruleUsage
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getConstraintAccess().getSlotsUsageParserRuleCall_3_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleUsage_in_ruleConstraint1713);
            	    lv_slots_3_0=ruleUsage();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getConstraintRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"slots",
            	    	        		lv_slots_3_0, 
            	    	        		"Usage", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt16 >= 1 ) break loop16;
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
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
    // $ANTLR end ruleConstraint


    // $ANTLR start entryRuleUsage
    // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:1027:1: entryRuleUsage returns [EObject current=null] : iv_ruleUsage= ruleUsage EOF ;
    public final EObject entryRuleUsage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUsage = null;


        try {
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:1028:2: (iv_ruleUsage= ruleUsage EOF )
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:1029:2: iv_ruleUsage= ruleUsage EOF
            {
             currentNode = createCompositeNode(grammarAccess.getUsageRule(), currentNode); 
            pushFollow(FOLLOW_ruleUsage_in_entryRuleUsage1750);
            iv_ruleUsage=ruleUsage();
            _fsp--;

             current =iv_ruleUsage; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUsage1760); 

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
    // $ANTLR end entryRuleUsage


    // $ANTLR start ruleUsage
    // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:1036:1: ruleUsage returns [EObject current=null] : ( ( RULE_ID ) ) ;
    public final EObject ruleUsage() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:1041:6: ( ( ( RULE_ID ) ) )
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:1042:1: ( ( RULE_ID ) )
            {
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:1042:1: ( ( RULE_ID ) )
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:1043:1: ( RULE_ID )
            {
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:1043:1: ( RULE_ID )
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:1044:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getUsageRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUsage1802); 

            		createLeafNode(grammarAccess.getUsageAccess().getFieldFieldCrossReference_0(), "field"); 
            	

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
    // $ANTLR end ruleUsage


    // $ANTLR start entryRuleFunction
    // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:1064:1: entryRuleFunction returns [EObject current=null] : iv_ruleFunction= ruleFunction EOF ;
    public final EObject entryRuleFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunction = null;


        try {
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:1065:2: (iv_ruleFunction= ruleFunction EOF )
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:1066:2: iv_ruleFunction= ruleFunction EOF
            {
             currentNode = createCompositeNode(grammarAccess.getFunctionRule(), currentNode); 
            pushFollow(FOLLOW_ruleFunction_in_entryRuleFunction1837);
            iv_ruleFunction=ruleFunction();
            _fsp--;

             current =iv_ruleFunction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunction1847); 

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
    // $ANTLR end entryRuleFunction


    // $ANTLR start ruleFunction
    // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:1073:1: ruleFunction returns [EObject current=null] : ( 'function' ( (lv_name_1_0= RULE_ID ) ) ':' ( ( RULE_ID ) ) ( '(' ( (lv_arguments_5_0= ruleArgument ) )+ ')' )? ) ;
    public final EObject ruleFunction() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_arguments_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:1078:6: ( ( 'function' ( (lv_name_1_0= RULE_ID ) ) ':' ( ( RULE_ID ) ) ( '(' ( (lv_arguments_5_0= ruleArgument ) )+ ')' )? ) )
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:1079:1: ( 'function' ( (lv_name_1_0= RULE_ID ) ) ':' ( ( RULE_ID ) ) ( '(' ( (lv_arguments_5_0= ruleArgument ) )+ ')' )? )
            {
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:1079:1: ( 'function' ( (lv_name_1_0= RULE_ID ) ) ':' ( ( RULE_ID ) ) ( '(' ( (lv_arguments_5_0= ruleArgument ) )+ ')' )? )
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:1079:3: 'function' ( (lv_name_1_0= RULE_ID ) ) ':' ( ( RULE_ID ) ) ( '(' ( (lv_arguments_5_0= ruleArgument ) )+ ')' )?
            {
            match(input,24,FOLLOW_24_in_ruleFunction1882); 

                    createLeafNode(grammarAccess.getFunctionAccess().getFunctionKeyword_0(), null); 
                
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:1083:1: ( (lv_name_1_0= RULE_ID ) )
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:1084:1: (lv_name_1_0= RULE_ID )
            {
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:1084:1: (lv_name_1_0= RULE_ID )
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:1085:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunction1899); 

            			createLeafNode(grammarAccess.getFunctionAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getFunctionRule().getType().getClassifier());
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

            match(input,17,FOLLOW_17_in_ruleFunction1914); 

                    createLeafNode(grammarAccess.getFunctionAccess().getColonKeyword_2(), null); 
                
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:1111:1: ( ( RULE_ID ) )
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:1112:1: ( RULE_ID )
            {
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:1112:1: ( RULE_ID )
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:1113:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getFunctionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunction1932); 

            		createLeafNode(grammarAccess.getFunctionAccess().getReturnTypeTypeCrossReference_3_0(), "returnType"); 
            	

            }


            }

            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:1125:2: ( '(' ( (lv_arguments_5_0= ruleArgument ) )+ ')' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==25) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:1125:4: '(' ( (lv_arguments_5_0= ruleArgument ) )+ ')'
                    {
                    match(input,25,FOLLOW_25_in_ruleFunction1943); 

                            createLeafNode(grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_4_0(), null); 
                        
                    // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:1129:1: ( (lv_arguments_5_0= ruleArgument ) )+
                    int cnt17=0;
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==RULE_ID) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:1130:1: (lv_arguments_5_0= ruleArgument )
                    	    {
                    	    // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:1130:1: (lv_arguments_5_0= ruleArgument )
                    	    // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:1131:3: lv_arguments_5_0= ruleArgument
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getFunctionAccess().getArgumentsArgumentParserRuleCall_4_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleArgument_in_ruleFunction1964);
                    	    lv_arguments_5_0=ruleArgument();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getFunctionRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"arguments",
                    	    	        		lv_arguments_5_0, 
                    	    	        		"Argument", 
                    	    	        		currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt17 >= 1 ) break loop17;
                                EarlyExitException eee =
                                    new EarlyExitException(17, input);
                                throw eee;
                        }
                        cnt17++;
                    } while (true);

                    match(input,26,FOLLOW_26_in_ruleFunction1975); 

                            createLeafNode(grammarAccess.getFunctionAccess().getRightParenthesisKeyword_4_2(), null); 
                        

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
    // $ANTLR end ruleFunction


    // $ANTLR start entryRuleArgument
    // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:1165:1: entryRuleArgument returns [EObject current=null] : iv_ruleArgument= ruleArgument EOF ;
    public final EObject entryRuleArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArgument = null;


        try {
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:1166:2: (iv_ruleArgument= ruleArgument EOF )
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:1167:2: iv_ruleArgument= ruleArgument EOF
            {
             currentNode = createCompositeNode(grammarAccess.getArgumentRule(), currentNode); 
            pushFollow(FOLLOW_ruleArgument_in_entryRuleArgument2013);
            iv_ruleArgument=ruleArgument();
            _fsp--;

             current =iv_ruleArgument; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArgument2023); 

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
    // $ANTLR end entryRuleArgument


    // $ANTLR start ruleArgument
    // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:1174:1: ruleArgument returns [EObject current=null] : ( ( ( RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleArgument() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:1179:6: ( ( ( ( RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:1180:1: ( ( ( RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:1180:1: ( ( ( RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:1180:2: ( ( RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:1180:2: ( ( RULE_ID ) )
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:1181:1: ( RULE_ID )
            {
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:1181:1: ( RULE_ID )
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:1182:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getArgumentRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleArgument2066); 

            		createLeafNode(grammarAccess.getArgumentAccess().getTypeTypeCrossReference_0_0(), "type"); 
            	

            }


            }

            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:1194:2: ( (lv_name_1_0= RULE_ID ) )
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:1195:1: (lv_name_1_0= RULE_ID )
            {
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:1195:1: (lv_name_1_0= RULE_ID )
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:1196:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleArgument2083); 

            			createLeafNode(grammarAccess.getArgumentAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getArgumentRule().getType().getClassifier());
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
    // $ANTLR end ruleArgument


    // $ANTLR start ruleMetaPrimitiveType
    // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:1230:1: ruleMetaPrimitiveType returns [Enumerator current=null] : ( ( 'string' ) | ( 'int' ) | ( 'number' ) | ( 'boolean' ) ) ;
    public final Enumerator ruleMetaPrimitiveType() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:1234:6: ( ( ( 'string' ) | ( 'int' ) | ( 'number' ) | ( 'boolean' ) ) )
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:1235:1: ( ( 'string' ) | ( 'int' ) | ( 'number' ) | ( 'boolean' ) )
            {
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:1235:1: ( ( 'string' ) | ( 'int' ) | ( 'number' ) | ( 'boolean' ) )
            int alt19=4;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt19=1;
                }
                break;
            case 28:
                {
                alt19=2;
                }
                break;
            case 29:
                {
                alt19=3;
                }
                break;
            case 30:
                {
                alt19=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1235:1: ( ( 'string' ) | ( 'int' ) | ( 'number' ) | ( 'boolean' ) )", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:1235:2: ( 'string' )
                    {
                    // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:1235:2: ( 'string' )
                    // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:1235:4: 'string'
                    {
                    match(input,27,FOLLOW_27_in_ruleMetaPrimitiveType2140); 

                            current = grammarAccess.getMetaPrimitiveTypeAccess().getStringEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getMetaPrimitiveTypeAccess().getStringEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:1241:6: ( 'int' )
                    {
                    // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:1241:6: ( 'int' )
                    // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:1241:8: 'int'
                    {
                    match(input,28,FOLLOW_28_in_ruleMetaPrimitiveType2155); 

                            current = grammarAccess.getMetaPrimitiveTypeAccess().getIntEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getMetaPrimitiveTypeAccess().getIntEnumLiteralDeclaration_1(), null); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:1247:6: ( 'number' )
                    {
                    // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:1247:6: ( 'number' )
                    // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:1247:8: 'number'
                    {
                    match(input,29,FOLLOW_29_in_ruleMetaPrimitiveType2170); 

                            current = grammarAccess.getMetaPrimitiveTypeAccess().getNumberEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getMetaPrimitiveTypeAccess().getNumberEnumLiteralDeclaration_2(), null); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:1253:6: ( 'boolean' )
                    {
                    // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:1253:6: ( 'boolean' )
                    // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:1253:8: 'boolean'
                    {
                    match(input,30,FOLLOW_30_in_ruleMetaPrimitiveType2185); 

                            current = grammarAccess.getMetaPrimitiveTypeAccess().getBooleanEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getMetaPrimitiveTypeAccess().getBooleanEnumLiteralDeclaration_3(), null); 
                        

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
    // $ANTLR end ruleMetaPrimitiveType


    // $ANTLR start ruleModifier
    // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:1263:1: ruleModifier returns [Enumerator current=null] : ( ( 'optional' ) | ( 'required' ) | ( 'repeated' ) ) ;
    public final Enumerator ruleModifier() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:1267:6: ( ( ( 'optional' ) | ( 'required' ) | ( 'repeated' ) ) )
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:1268:1: ( ( 'optional' ) | ( 'required' ) | ( 'repeated' ) )
            {
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:1268:1: ( ( 'optional' ) | ( 'required' ) | ( 'repeated' ) )
            int alt20=3;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt20=1;
                }
                break;
            case 32:
                {
                alt20=2;
                }
                break;
            case 33:
                {
                alt20=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1268:1: ( ( 'optional' ) | ( 'required' ) | ( 'repeated' ) )", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:1268:2: ( 'optional' )
                    {
                    // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:1268:2: ( 'optional' )
                    // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:1268:4: 'optional'
                    {
                    match(input,31,FOLLOW_31_in_ruleModifier2228); 

                            current = grammarAccess.getModifierAccess().getOptionalEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getModifierAccess().getOptionalEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:1274:6: ( 'required' )
                    {
                    // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:1274:6: ( 'required' )
                    // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:1274:8: 'required'
                    {
                    match(input,32,FOLLOW_32_in_ruleModifier2243); 

                            current = grammarAccess.getModifierAccess().getRequiredEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getModifierAccess().getRequiredEnumLiteralDeclaration_1(), null); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:1280:6: ( 'repeated' )
                    {
                    // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:1280:6: ( 'repeated' )
                    // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:1280:8: 'repeated'
                    {
                    match(input,33,FOLLOW_33_in_ruleModifier2258); 

                            current = grammarAccess.getModifierAccess().getRepeatedEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getModifierAccess().getRepeatedEnumLiteralDeclaration_2(), null); 
                        

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
    // $ANTLR end ruleModifier


 

    public static final BitSet FOLLOW_ruleDataModel_in_entryRuleDataModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveTypes_in_ruleDataModel131 = new BitSet(new long[]{0x00000000003D0002L});
    public static final BitSet FOLLOW_ruleCompoundType_in_ruleDataModel152 = new BitSet(new long[]{0x00000000003D0002L});
    public static final BitSet FOLLOW_ruleCompoundType_in_entryRuleCompoundType191 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompoundType201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataType_in_ruleCompoundType248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumeration_in_ruleCompoundType275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_ruleCompoundType302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveTypes_in_entryRulePrimitiveTypes337 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveTypes347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rulePrimitiveTypes391 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_rulePrimitiveTypes401 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_rulePrimitiveType_in_rulePrimitiveTypes422 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_13_in_rulePrimitiveTypes433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveType_in_entryRulePrimitiveType469 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveType479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimitiveType521 = new BitSet(new long[]{0x000000000000C002L});
    public static final BitSet FOLLOW_14_in_rulePrimitiveType538 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimitiveType556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rulePrimitiveType574 = new BitSet(new long[]{0x0000000078000000L});
    public static final BitSet FOLLOW_ruleMetaPrimitiveType_in_rulePrimitiveType595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataType_in_entryRuleDataType634 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataType644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleDataType679 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDataType696 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleDataType711 = new BitSet(new long[]{0x0000000381402010L});
    public static final BitSet FOLLOW_ruleField_in_ruleDataType732 = new BitSet(new long[]{0x0000000381402010L});
    public static final BitSet FOLLOW_ruleConstraint_in_ruleDataType754 = new BitSet(new long[]{0x0000000001402000L});
    public static final BitSet FOLLOW_ruleFunction_in_ruleDataType776 = new BitSet(new long[]{0x0000000001002000L});
    public static final BitSet FOLLOW_13_in_ruleDataType787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_in_entryRuleField823 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleField833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifier_in_ruleField879 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleField897 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleField912 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleField930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumeration_in_entryRuleEnumeration966 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumeration976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleEnumeration1011 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumeration1028 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleEnumeration1043 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_ruleEnumLiteral_in_ruleEnumeration1064 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_13_in_ruleEnumeration1075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumLiteral_in_entryRuleEnumLiteral1111 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumLiteral1121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumLiteral1162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity1202 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntity1212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleEntity1297 = new BitSet(new long[]{0x0000000000380000L});
    public static final BitSet FOLLOW_20_in_ruleEntity1378 = new BitSet(new long[]{0x0000000000380000L});
    public static final BitSet FOLLOW_21_in_ruleEntity1440 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntity1457 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_14_in_ruleEntity1473 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntity1491 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleEntity1503 = new BitSet(new long[]{0x0000000381402010L});
    public static final BitSet FOLLOW_ruleField_in_ruleEntity1524 = new BitSet(new long[]{0x0000000381402010L});
    public static final BitSet FOLLOW_ruleConstraint_in_ruleEntity1546 = new BitSet(new long[]{0x0000000001402000L});
    public static final BitSet FOLLOW_ruleFunction_in_ruleEntity1568 = new BitSet(new long[]{0x0000000001002000L});
    public static final BitSet FOLLOW_13_in_ruleEntity1579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraint_in_entryRuleConstraint1615 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstraint1625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleConstraint1660 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConstraint1677 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleConstraint1692 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleUsage_in_ruleConstraint1713 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleUsage_in_entryRuleUsage1750 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUsage1760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUsage1802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunction_in_entryRuleFunction1837 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunction1847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleFunction1882 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunction1899 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleFunction1914 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunction1932 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25_in_ruleFunction1943 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleArgument_in_ruleFunction1964 = new BitSet(new long[]{0x0000000004000010L});
    public static final BitSet FOLLOW_26_in_ruleFunction1975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArgument_in_entryRuleArgument2013 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArgument2023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleArgument2066 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleArgument2083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleMetaPrimitiveType2140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleMetaPrimitiveType2155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleMetaPrimitiveType2170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleMetaPrimitiveType2185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleModifier2228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleModifier2243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleModifier2258 = new BitSet(new long[]{0x0000000000000002L});

}
