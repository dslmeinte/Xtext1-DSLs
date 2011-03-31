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
import nl.dslmeinte.xtext.examples.services.WsdlLanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalWsdlLanguageParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'wsdl'", "'namespace:'", "'messages:'", "'portTypes:'", "'bindings:'", "'services:'", "'xsd-import'", "'as'", "'{'", "'}'", "'->'", "'operation'", "':'", "'<-'", "'binds'", "'using'", "'soap'", "'('", "')'", "'http'", "'-'", "'documentation'", "'port'", "'on'", "'document'", "'rpc'", "'get'", "'put'"
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
    public String getGrammarFileName() { return "../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g"; }



     	private WsdlLanguageGrammarAccess grammarAccess;
     	
        public InternalWsdlLanguageParser(TokenStream input, IAstFactory factory, WsdlLanguageGrammarAccess grammarAccess) {
            this(input);
            this.factory = factory;
            registerRules(grammarAccess.getGrammar());
            this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected InputStream getTokenFile() {
        	ClassLoader classLoader = getClass().getClassLoader();
        	return classLoader.getResourceAsStream("nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.tokens");
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Definitions";	
       	}
       	
       	@Override
       	protected WsdlLanguageGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start entryRuleDefinitions
    // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:78:1: entryRuleDefinitions returns [EObject current=null] : iv_ruleDefinitions= ruleDefinitions EOF ;
    public final EObject entryRuleDefinitions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefinitions = null;


        try {
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:79:2: (iv_ruleDefinitions= ruleDefinitions EOF )
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:80:2: iv_ruleDefinitions= ruleDefinitions EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDefinitionsRule(), currentNode); 
            pushFollow(FOLLOW_ruleDefinitions_in_entryRuleDefinitions75);
            iv_ruleDefinitions=ruleDefinitions();
            _fsp--;

             current =iv_ruleDefinitions; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefinitions85); 

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
    // $ANTLR end entryRuleDefinitions


    // $ANTLR start ruleDefinitions
    // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:87:1: ruleDefinitions returns [EObject current=null] : ( 'wsdl' ( (lv_name_1_0= RULE_ID ) ) 'namespace:' ( (lv_nsUri_3_0= RULE_STRING ) ) ( (lv_xsdImport_4_0= ruleXsdImport ) ) ( 'messages:' ( (lv_messages_6_0= ruleMessage ) )* )? ( 'portTypes:' ( (lv_portTypes_8_0= rulePortType ) )* )? ( 'bindings:' ( (lv_bindings_10_0= ruleBinding ) )* )? ( 'services:' ( (lv_services_12_0= ruleService ) )* )? ) ;
    public final EObject ruleDefinitions() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token lv_nsUri_3_0=null;
        EObject lv_xsdImport_4_0 = null;

        EObject lv_messages_6_0 = null;

        EObject lv_portTypes_8_0 = null;

        EObject lv_bindings_10_0 = null;

        EObject lv_services_12_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:92:6: ( ( 'wsdl' ( (lv_name_1_0= RULE_ID ) ) 'namespace:' ( (lv_nsUri_3_0= RULE_STRING ) ) ( (lv_xsdImport_4_0= ruleXsdImport ) ) ( 'messages:' ( (lv_messages_6_0= ruleMessage ) )* )? ( 'portTypes:' ( (lv_portTypes_8_0= rulePortType ) )* )? ( 'bindings:' ( (lv_bindings_10_0= ruleBinding ) )* )? ( 'services:' ( (lv_services_12_0= ruleService ) )* )? ) )
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:93:1: ( 'wsdl' ( (lv_name_1_0= RULE_ID ) ) 'namespace:' ( (lv_nsUri_3_0= RULE_STRING ) ) ( (lv_xsdImport_4_0= ruleXsdImport ) ) ( 'messages:' ( (lv_messages_6_0= ruleMessage ) )* )? ( 'portTypes:' ( (lv_portTypes_8_0= rulePortType ) )* )? ( 'bindings:' ( (lv_bindings_10_0= ruleBinding ) )* )? ( 'services:' ( (lv_services_12_0= ruleService ) )* )? )
            {
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:93:1: ( 'wsdl' ( (lv_name_1_0= RULE_ID ) ) 'namespace:' ( (lv_nsUri_3_0= RULE_STRING ) ) ( (lv_xsdImport_4_0= ruleXsdImport ) ) ( 'messages:' ( (lv_messages_6_0= ruleMessage ) )* )? ( 'portTypes:' ( (lv_portTypes_8_0= rulePortType ) )* )? ( 'bindings:' ( (lv_bindings_10_0= ruleBinding ) )* )? ( 'services:' ( (lv_services_12_0= ruleService ) )* )? )
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:93:3: 'wsdl' ( (lv_name_1_0= RULE_ID ) ) 'namespace:' ( (lv_nsUri_3_0= RULE_STRING ) ) ( (lv_xsdImport_4_0= ruleXsdImport ) ) ( 'messages:' ( (lv_messages_6_0= ruleMessage ) )* )? ( 'portTypes:' ( (lv_portTypes_8_0= rulePortType ) )* )? ( 'bindings:' ( (lv_bindings_10_0= ruleBinding ) )* )? ( 'services:' ( (lv_services_12_0= ruleService ) )* )?
            {
            match(input,11,FOLLOW_11_in_ruleDefinitions120); 

                    createLeafNode(grammarAccess.getDefinitionsAccess().getWsdlKeyword_0(), null); 
                
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:97:1: ( (lv_name_1_0= RULE_ID ) )
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:98:1: (lv_name_1_0= RULE_ID )
            {
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:98:1: (lv_name_1_0= RULE_ID )
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:99:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDefinitions137); 

            			createLeafNode(grammarAccess.getDefinitionsAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getDefinitionsRule().getType().getClassifier());
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

            match(input,12,FOLLOW_12_in_ruleDefinitions152); 

                    createLeafNode(grammarAccess.getDefinitionsAccess().getNamespaceKeyword_2(), null); 
                
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:125:1: ( (lv_nsUri_3_0= RULE_STRING ) )
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:126:1: (lv_nsUri_3_0= RULE_STRING )
            {
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:126:1: (lv_nsUri_3_0= RULE_STRING )
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:127:3: lv_nsUri_3_0= RULE_STRING
            {
            lv_nsUri_3_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDefinitions169); 

            			createLeafNode(grammarAccess.getDefinitionsAccess().getNsUriSTRINGTerminalRuleCall_3_0(), "nsUri"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getDefinitionsRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"nsUri",
            	        		lv_nsUri_3_0, 
            	        		"STRING", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:149:2: ( (lv_xsdImport_4_0= ruleXsdImport ) )
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:150:1: (lv_xsdImport_4_0= ruleXsdImport )
            {
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:150:1: (lv_xsdImport_4_0= ruleXsdImport )
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:151:3: lv_xsdImport_4_0= ruleXsdImport
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getDefinitionsAccess().getXsdImportXsdImportParserRuleCall_4_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleXsdImport_in_ruleDefinitions195);
            lv_xsdImport_4_0=ruleXsdImport();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getDefinitionsRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"xsdImport",
            	        		lv_xsdImport_4_0, 
            	        		"XsdImport", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:173:2: ( 'messages:' ( (lv_messages_6_0= ruleMessage ) )* )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:173:4: 'messages:' ( (lv_messages_6_0= ruleMessage ) )*
                    {
                    match(input,13,FOLLOW_13_in_ruleDefinitions206); 

                            createLeafNode(grammarAccess.getDefinitionsAccess().getMessagesKeyword_5_0(), null); 
                        
                    // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:177:1: ( (lv_messages_6_0= ruleMessage ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==RULE_ID) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:178:1: (lv_messages_6_0= ruleMessage )
                    	    {
                    	    // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:178:1: (lv_messages_6_0= ruleMessage )
                    	    // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:179:3: lv_messages_6_0= ruleMessage
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getDefinitionsAccess().getMessagesMessageParserRuleCall_5_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleMessage_in_ruleDefinitions227);
                    	    lv_messages_6_0=ruleMessage();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getDefinitionsRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"messages",
                    	    	        		lv_messages_6_0, 
                    	    	        		"Message", 
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
                    break;

            }

            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:201:5: ( 'portTypes:' ( (lv_portTypes_8_0= rulePortType ) )* )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:201:7: 'portTypes:' ( (lv_portTypes_8_0= rulePortType ) )*
                    {
                    match(input,14,FOLLOW_14_in_ruleDefinitions241); 

                            createLeafNode(grammarAccess.getDefinitionsAccess().getPortTypesKeyword_6_0(), null); 
                        
                    // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:205:1: ( (lv_portTypes_8_0= rulePortType ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==RULE_ID) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:206:1: (lv_portTypes_8_0= rulePortType )
                    	    {
                    	    // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:206:1: (lv_portTypes_8_0= rulePortType )
                    	    // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:207:3: lv_portTypes_8_0= rulePortType
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getDefinitionsAccess().getPortTypesPortTypeParserRuleCall_6_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_rulePortType_in_ruleDefinitions262);
                    	    lv_portTypes_8_0=rulePortType();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getDefinitionsRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"portTypes",
                    	    	        		lv_portTypes_8_0, 
                    	    	        		"PortType", 
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


                    }
                    break;

            }

            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:229:5: ( 'bindings:' ( (lv_bindings_10_0= ruleBinding ) )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==15) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:229:7: 'bindings:' ( (lv_bindings_10_0= ruleBinding ) )*
                    {
                    match(input,15,FOLLOW_15_in_ruleDefinitions276); 

                            createLeafNode(grammarAccess.getDefinitionsAccess().getBindingsKeyword_7_0(), null); 
                        
                    // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:233:1: ( (lv_bindings_10_0= ruleBinding ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==RULE_ID) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:234:1: (lv_bindings_10_0= ruleBinding )
                    	    {
                    	    // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:234:1: (lv_bindings_10_0= ruleBinding )
                    	    // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:235:3: lv_bindings_10_0= ruleBinding
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getDefinitionsAccess().getBindingsBindingParserRuleCall_7_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleBinding_in_ruleDefinitions297);
                    	    lv_bindings_10_0=ruleBinding();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getDefinitionsRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"bindings",
                    	    	        		lv_bindings_10_0, 
                    	    	        		"Binding", 
                    	    	        		currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:257:5: ( 'services:' ( (lv_services_12_0= ruleService ) )* )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==16) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:257:7: 'services:' ( (lv_services_12_0= ruleService ) )*
                    {
                    match(input,16,FOLLOW_16_in_ruleDefinitions311); 

                            createLeafNode(grammarAccess.getDefinitionsAccess().getServicesKeyword_8_0(), null); 
                        
                    // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:261:1: ( (lv_services_12_0= ruleService ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==RULE_ID) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:262:1: (lv_services_12_0= ruleService )
                    	    {
                    	    // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:262:1: (lv_services_12_0= ruleService )
                    	    // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:263:3: lv_services_12_0= ruleService
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getDefinitionsAccess().getServicesServiceParserRuleCall_8_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleService_in_ruleDefinitions332);
                    	    lv_services_12_0=ruleService();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getDefinitionsRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"services",
                    	    	        		lv_services_12_0, 
                    	    	        		"Service", 
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
    // $ANTLR end ruleDefinitions


    // $ANTLR start entryRuleXsdImport
    // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:293:1: entryRuleXsdImport returns [EObject current=null] : iv_ruleXsdImport= ruleXsdImport EOF ;
    public final EObject entryRuleXsdImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXsdImport = null;


        try {
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:294:2: (iv_ruleXsdImport= ruleXsdImport EOF )
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:295:2: iv_ruleXsdImport= ruleXsdImport EOF
            {
             currentNode = createCompositeNode(grammarAccess.getXsdImportRule(), currentNode); 
            pushFollow(FOLLOW_ruleXsdImport_in_entryRuleXsdImport371);
            iv_ruleXsdImport=ruleXsdImport();
            _fsp--;

             current =iv_ruleXsdImport; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleXsdImport381); 

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
    // $ANTLR end entryRuleXsdImport


    // $ANTLR start ruleXsdImport
    // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:302:1: ruleXsdImport returns [EObject current=null] : ( 'xsd-import' ( (lv_importURI_1_0= RULE_STRING ) ) 'as' ( (lv_nsPrefix_3_0= RULE_ID ) ) ) ;
    public final EObject ruleXsdImport() throws RecognitionException {
        EObject current = null;

        Token lv_importURI_1_0=null;
        Token lv_nsPrefix_3_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:307:6: ( ( 'xsd-import' ( (lv_importURI_1_0= RULE_STRING ) ) 'as' ( (lv_nsPrefix_3_0= RULE_ID ) ) ) )
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:308:1: ( 'xsd-import' ( (lv_importURI_1_0= RULE_STRING ) ) 'as' ( (lv_nsPrefix_3_0= RULE_ID ) ) )
            {
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:308:1: ( 'xsd-import' ( (lv_importURI_1_0= RULE_STRING ) ) 'as' ( (lv_nsPrefix_3_0= RULE_ID ) ) )
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:308:3: 'xsd-import' ( (lv_importURI_1_0= RULE_STRING ) ) 'as' ( (lv_nsPrefix_3_0= RULE_ID ) )
            {
            match(input,17,FOLLOW_17_in_ruleXsdImport416); 

                    createLeafNode(grammarAccess.getXsdImportAccess().getXsdImportKeyword_0(), null); 
                
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:312:1: ( (lv_importURI_1_0= RULE_STRING ) )
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:313:1: (lv_importURI_1_0= RULE_STRING )
            {
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:313:1: (lv_importURI_1_0= RULE_STRING )
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:314:3: lv_importURI_1_0= RULE_STRING
            {
            lv_importURI_1_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleXsdImport433); 

            			createLeafNode(grammarAccess.getXsdImportAccess().getImportURISTRINGTerminalRuleCall_1_0(), "importURI"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getXsdImportRule().getType().getClassifier());
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

            match(input,18,FOLLOW_18_in_ruleXsdImport448); 

                    createLeafNode(grammarAccess.getXsdImportAccess().getAsKeyword_2(), null); 
                
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:340:1: ( (lv_nsPrefix_3_0= RULE_ID ) )
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:341:1: (lv_nsPrefix_3_0= RULE_ID )
            {
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:341:1: (lv_nsPrefix_3_0= RULE_ID )
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:342:3: lv_nsPrefix_3_0= RULE_ID
            {
            lv_nsPrefix_3_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleXsdImport465); 

            			createLeafNode(grammarAccess.getXsdImportAccess().getNsPrefixIDTerminalRuleCall_3_0(), "nsPrefix"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getXsdImportRule().getType().getClassifier());
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
    // $ANTLR end ruleXsdImport


    // $ANTLR start entryRuleMessage
    // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:372:1: entryRuleMessage returns [EObject current=null] : iv_ruleMessage= ruleMessage EOF ;
    public final EObject entryRuleMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessage = null;


        try {
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:373:2: (iv_ruleMessage= ruleMessage EOF )
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:374:2: iv_ruleMessage= ruleMessage EOF
            {
             currentNode = createCompositeNode(grammarAccess.getMessageRule(), currentNode); 
            pushFollow(FOLLOW_ruleMessage_in_entryRuleMessage506);
            iv_ruleMessage=ruleMessage();
            _fsp--;

             current =iv_ruleMessage; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMessage516); 

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
    // $ANTLR end entryRuleMessage


    // $ANTLR start ruleMessage
    // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:381:1: ruleMessage returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) '{' ( (lv_parts_2_0= rulePart ) )* '}' ) ;
    public final EObject ruleMessage() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_parts_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:386:6: ( ( ( (lv_name_0_0= RULE_ID ) ) '{' ( (lv_parts_2_0= rulePart ) )* '}' ) )
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:387:1: ( ( (lv_name_0_0= RULE_ID ) ) '{' ( (lv_parts_2_0= rulePart ) )* '}' )
            {
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:387:1: ( ( (lv_name_0_0= RULE_ID ) ) '{' ( (lv_parts_2_0= rulePart ) )* '}' )
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:387:2: ( (lv_name_0_0= RULE_ID ) ) '{' ( (lv_parts_2_0= rulePart ) )* '}'
            {
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:387:2: ( (lv_name_0_0= RULE_ID ) )
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:388:1: (lv_name_0_0= RULE_ID )
            {
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:388:1: (lv_name_0_0= RULE_ID )
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:389:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMessage558); 

            			createLeafNode(grammarAccess.getMessageAccess().getNameIDTerminalRuleCall_0_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getMessageRule().getType().getClassifier());
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

            match(input,19,FOLLOW_19_in_ruleMessage573); 

                    createLeafNode(grammarAccess.getMessageAccess().getLeftCurlyBracketKeyword_1(), null); 
                
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:415:1: ( (lv_parts_2_0= rulePart ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:416:1: (lv_parts_2_0= rulePart )
            	    {
            	    // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:416:1: (lv_parts_2_0= rulePart )
            	    // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:417:3: lv_parts_2_0= rulePart
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getMessageAccess().getPartsPartParserRuleCall_2_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_rulePart_in_ruleMessage594);
            	    lv_parts_2_0=rulePart();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getMessageRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"parts",
            	    	        		lv_parts_2_0, 
            	    	        		"Part", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            match(input,20,FOLLOW_20_in_ruleMessage605); 

                    createLeafNode(grammarAccess.getMessageAccess().getRightCurlyBracketKeyword_3(), null); 
                

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
    // $ANTLR end ruleMessage


    // $ANTLR start entryRulePart
    // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:451:1: entryRulePart returns [EObject current=null] : iv_rulePart= rulePart EOF ;
    public final EObject entryRulePart() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePart = null;


        try {
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:452:2: (iv_rulePart= rulePart EOF )
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:453:2: iv_rulePart= rulePart EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPartRule(), currentNode); 
            pushFollow(FOLLOW_rulePart_in_entryRulePart641);
            iv_rulePart=rulePart();
            _fsp--;

             current =iv_rulePart; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePart651); 

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
    // $ANTLR end entryRulePart


    // $ANTLR start rulePart
    // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:460:1: rulePart returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) '->' ( ( RULE_ID ) ) ) ;
    public final EObject rulePart() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:465:6: ( ( ( (lv_name_0_0= RULE_ID ) ) '->' ( ( RULE_ID ) ) ) )
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:466:1: ( ( (lv_name_0_0= RULE_ID ) ) '->' ( ( RULE_ID ) ) )
            {
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:466:1: ( ( (lv_name_0_0= RULE_ID ) ) '->' ( ( RULE_ID ) ) )
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:466:2: ( (lv_name_0_0= RULE_ID ) ) '->' ( ( RULE_ID ) )
            {
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:466:2: ( (lv_name_0_0= RULE_ID ) )
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:467:1: (lv_name_0_0= RULE_ID )
            {
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:467:1: (lv_name_0_0= RULE_ID )
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:468:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePart693); 

            			createLeafNode(grammarAccess.getPartAccess().getNameIDTerminalRuleCall_0_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getPartRule().getType().getClassifier());
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

            match(input,21,FOLLOW_21_in_rulePart708); 

                    createLeafNode(grammarAccess.getPartAccess().getHyphenMinusGreaterThanSignKeyword_1(), null); 
                
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:494:1: ( ( RULE_ID ) )
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:495:1: ( RULE_ID )
            {
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:495:1: ( RULE_ID )
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:496:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getPartRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePart726); 

            		createLeafNode(grammarAccess.getPartAccess().getDefTopLevelDefinitionCrossReference_2_0(), "def"); 
            	

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
    // $ANTLR end rulePart


    // $ANTLR start entryRulePortType
    // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:516:1: entryRulePortType returns [EObject current=null] : iv_rulePortType= rulePortType EOF ;
    public final EObject entryRulePortType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePortType = null;


        try {
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:517:2: (iv_rulePortType= rulePortType EOF )
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:518:2: iv_rulePortType= rulePortType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPortTypeRule(), currentNode); 
            pushFollow(FOLLOW_rulePortType_in_entryRulePortType762);
            iv_rulePortType=rulePortType();
            _fsp--;

             current =iv_rulePortType; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePortType772); 

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
    // $ANTLR end entryRulePortType


    // $ANTLR start rulePortType
    // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:525:1: rulePortType returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) '{' ( (lv_operations_2_0= ruleOperation ) )* '}' ) ;
    public final EObject rulePortType() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_operations_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:530:6: ( ( ( (lv_name_0_0= RULE_ID ) ) '{' ( (lv_operations_2_0= ruleOperation ) )* '}' ) )
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:531:1: ( ( (lv_name_0_0= RULE_ID ) ) '{' ( (lv_operations_2_0= ruleOperation ) )* '}' )
            {
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:531:1: ( ( (lv_name_0_0= RULE_ID ) ) '{' ( (lv_operations_2_0= ruleOperation ) )* '}' )
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:531:2: ( (lv_name_0_0= RULE_ID ) ) '{' ( (lv_operations_2_0= ruleOperation ) )* '}'
            {
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:531:2: ( (lv_name_0_0= RULE_ID ) )
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:532:1: (lv_name_0_0= RULE_ID )
            {
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:532:1: (lv_name_0_0= RULE_ID )
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:533:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePortType814); 

            			createLeafNode(grammarAccess.getPortTypeAccess().getNameIDTerminalRuleCall_0_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getPortTypeRule().getType().getClassifier());
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

            match(input,19,FOLLOW_19_in_rulePortType829); 

                    createLeafNode(grammarAccess.getPortTypeAccess().getLeftCurlyBracketKeyword_1(), null); 
                
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:559:1: ( (lv_operations_2_0= ruleOperation ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==22) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:560:1: (lv_operations_2_0= ruleOperation )
            	    {
            	    // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:560:1: (lv_operations_2_0= ruleOperation )
            	    // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:561:3: lv_operations_2_0= ruleOperation
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getPortTypeAccess().getOperationsOperationParserRuleCall_2_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleOperation_in_rulePortType850);
            	    lv_operations_2_0=ruleOperation();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getPortTypeRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"operations",
            	    	        		lv_operations_2_0, 
            	    	        		"Operation", 
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

            match(input,20,FOLLOW_20_in_rulePortType861); 

                    createLeafNode(grammarAccess.getPortTypeAccess().getRightCurlyBracketKeyword_3(), null); 
                

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
    // $ANTLR end rulePortType


    // $ANTLR start entryRuleOperation
    // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:595:1: entryRuleOperation returns [EObject current=null] : iv_ruleOperation= ruleOperation EOF ;
    public final EObject entryRuleOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperation = null;


        try {
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:596:2: (iv_ruleOperation= ruleOperation EOF )
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:597:2: iv_ruleOperation= ruleOperation EOF
            {
             currentNode = createCompositeNode(grammarAccess.getOperationRule(), currentNode); 
            pushFollow(FOLLOW_ruleOperation_in_entryRuleOperation897);
            iv_ruleOperation=ruleOperation();
            _fsp--;

             current =iv_ruleOperation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperation907); 

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
    // $ANTLR end entryRuleOperation


    // $ANTLR start ruleOperation
    // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:604:1: ruleOperation returns [EObject current=null] : (this_OneWayOperation_0= ruleOneWayOperation | this_RequestResponseOperation_1= ruleRequestResponseOperation | this_SolicitResponseOperation_2= ruleSolicitResponseOperation | this_NotificationOperation_3= ruleNotificationOperation ) ;
    public final EObject ruleOperation() throws RecognitionException {
        EObject current = null;

        EObject this_OneWayOperation_0 = null;

        EObject this_RequestResponseOperation_1 = null;

        EObject this_SolicitResponseOperation_2 = null;

        EObject this_NotificationOperation_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:609:6: ( (this_OneWayOperation_0= ruleOneWayOperation | this_RequestResponseOperation_1= ruleRequestResponseOperation | this_SolicitResponseOperation_2= ruleSolicitResponseOperation | this_NotificationOperation_3= ruleNotificationOperation ) )
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:610:1: (this_OneWayOperation_0= ruleOneWayOperation | this_RequestResponseOperation_1= ruleRequestResponseOperation | this_SolicitResponseOperation_2= ruleSolicitResponseOperation | this_NotificationOperation_3= ruleNotificationOperation )
            {
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:610:1: (this_OneWayOperation_0= ruleOneWayOperation | this_RequestResponseOperation_1= ruleRequestResponseOperation | this_SolicitResponseOperation_2= ruleSolicitResponseOperation | this_NotificationOperation_3= ruleNotificationOperation )
            int alt11=4;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==22) ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==RULE_ID) ) {
                    int LA11_2 = input.LA(3);

                    if ( (LA11_2==23) ) {
                        int LA11_3 = input.LA(4);

                        if ( (LA11_3==RULE_ID) ) {
                            switch ( input.LA(5) ) {
                            case 21:
                                {
                                alt11=2;
                                }
                                break;
                            case 24:
                                {
                                alt11=3;
                                }
                                break;
                            case EOF:
                            case 20:
                            case 22:
                                {
                                alt11=1;
                                }
                                break;
                            default:
                                NoViableAltException nvae =
                                    new NoViableAltException("610:1: (this_OneWayOperation_0= ruleOneWayOperation | this_RequestResponseOperation_1= ruleRequestResponseOperation | this_SolicitResponseOperation_2= ruleSolicitResponseOperation | this_NotificationOperation_3= ruleNotificationOperation )", 11, 4, input);

                                throw nvae;
                            }

                        }
                        else if ( (LA11_3==21) ) {
                            alt11=4;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("610:1: (this_OneWayOperation_0= ruleOneWayOperation | this_RequestResponseOperation_1= ruleRequestResponseOperation | this_SolicitResponseOperation_2= ruleSolicitResponseOperation | this_NotificationOperation_3= ruleNotificationOperation )", 11, 3, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("610:1: (this_OneWayOperation_0= ruleOneWayOperation | this_RequestResponseOperation_1= ruleRequestResponseOperation | this_SolicitResponseOperation_2= ruleSolicitResponseOperation | this_NotificationOperation_3= ruleNotificationOperation )", 11, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("610:1: (this_OneWayOperation_0= ruleOneWayOperation | this_RequestResponseOperation_1= ruleRequestResponseOperation | this_SolicitResponseOperation_2= ruleSolicitResponseOperation | this_NotificationOperation_3= ruleNotificationOperation )", 11, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("610:1: (this_OneWayOperation_0= ruleOneWayOperation | this_RequestResponseOperation_1= ruleRequestResponseOperation | this_SolicitResponseOperation_2= ruleSolicitResponseOperation | this_NotificationOperation_3= ruleNotificationOperation )", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:611:5: this_OneWayOperation_0= ruleOneWayOperation
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getOperationAccess().getOneWayOperationParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleOneWayOperation_in_ruleOperation954);
                    this_OneWayOperation_0=ruleOneWayOperation();
                    _fsp--;

                     
                            current = this_OneWayOperation_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:621:5: this_RequestResponseOperation_1= ruleRequestResponseOperation
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getOperationAccess().getRequestResponseOperationParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleRequestResponseOperation_in_ruleOperation981);
                    this_RequestResponseOperation_1=ruleRequestResponseOperation();
                    _fsp--;

                     
                            current = this_RequestResponseOperation_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:631:5: this_SolicitResponseOperation_2= ruleSolicitResponseOperation
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getOperationAccess().getSolicitResponseOperationParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleSolicitResponseOperation_in_ruleOperation1008);
                    this_SolicitResponseOperation_2=ruleSolicitResponseOperation();
                    _fsp--;

                     
                            current = this_SolicitResponseOperation_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 4 :
                    // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:641:5: this_NotificationOperation_3= ruleNotificationOperation
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getOperationAccess().getNotificationOperationParserRuleCall_3(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleNotificationOperation_in_ruleOperation1035);
                    this_NotificationOperation_3=ruleNotificationOperation();
                    _fsp--;

                     
                            current = this_NotificationOperation_3; 
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
    // $ANTLR end ruleOperation


    // $ANTLR start entryRuleOneWayOperation
    // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:657:1: entryRuleOneWayOperation returns [EObject current=null] : iv_ruleOneWayOperation= ruleOneWayOperation EOF ;
    public final EObject entryRuleOneWayOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOneWayOperation = null;


        try {
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:658:2: (iv_ruleOneWayOperation= ruleOneWayOperation EOF )
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:659:2: iv_ruleOneWayOperation= ruleOneWayOperation EOF
            {
             currentNode = createCompositeNode(grammarAccess.getOneWayOperationRule(), currentNode); 
            pushFollow(FOLLOW_ruleOneWayOperation_in_entryRuleOneWayOperation1070);
            iv_ruleOneWayOperation=ruleOneWayOperation();
            _fsp--;

             current =iv_ruleOneWayOperation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOneWayOperation1080); 

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
    // $ANTLR end entryRuleOneWayOperation


    // $ANTLR start ruleOneWayOperation
    // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:666:1: ruleOneWayOperation returns [EObject current=null] : ( 'operation' ( (lv_name_1_0= RULE_ID ) ) ':' ( ( RULE_ID ) ) ) ;
    public final EObject ruleOneWayOperation() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:671:6: ( ( 'operation' ( (lv_name_1_0= RULE_ID ) ) ':' ( ( RULE_ID ) ) ) )
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:672:1: ( 'operation' ( (lv_name_1_0= RULE_ID ) ) ':' ( ( RULE_ID ) ) )
            {
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:672:1: ( 'operation' ( (lv_name_1_0= RULE_ID ) ) ':' ( ( RULE_ID ) ) )
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:672:3: 'operation' ( (lv_name_1_0= RULE_ID ) ) ':' ( ( RULE_ID ) )
            {
            match(input,22,FOLLOW_22_in_ruleOneWayOperation1115); 

                    createLeafNode(grammarAccess.getOneWayOperationAccess().getOperationKeyword_0(), null); 
                
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:676:1: ( (lv_name_1_0= RULE_ID ) )
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:677:1: (lv_name_1_0= RULE_ID )
            {
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:677:1: (lv_name_1_0= RULE_ID )
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:678:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleOneWayOperation1132); 

            			createLeafNode(grammarAccess.getOneWayOperationAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getOneWayOperationRule().getType().getClassifier());
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

            match(input,23,FOLLOW_23_in_ruleOneWayOperation1147); 

                    createLeafNode(grammarAccess.getOneWayOperationAccess().getColonKeyword_2(), null); 
                
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:704:1: ( ( RULE_ID ) )
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:705:1: ( RULE_ID )
            {
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:705:1: ( RULE_ID )
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:706:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getOneWayOperationRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleOneWayOperation1165); 

            		createLeafNode(grammarAccess.getOneWayOperationAccess().getInputMessageCrossReference_3_0(), "input"); 
            	

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
    // $ANTLR end ruleOneWayOperation


    // $ANTLR start entryRuleRequestResponseOperation
    // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:726:1: entryRuleRequestResponseOperation returns [EObject current=null] : iv_ruleRequestResponseOperation= ruleRequestResponseOperation EOF ;
    public final EObject entryRuleRequestResponseOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequestResponseOperation = null;


        try {
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:727:2: (iv_ruleRequestResponseOperation= ruleRequestResponseOperation EOF )
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:728:2: iv_ruleRequestResponseOperation= ruleRequestResponseOperation EOF
            {
             currentNode = createCompositeNode(grammarAccess.getRequestResponseOperationRule(), currentNode); 
            pushFollow(FOLLOW_ruleRequestResponseOperation_in_entryRuleRequestResponseOperation1201);
            iv_ruleRequestResponseOperation=ruleRequestResponseOperation();
            _fsp--;

             current =iv_ruleRequestResponseOperation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRequestResponseOperation1211); 

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
    // $ANTLR end entryRuleRequestResponseOperation


    // $ANTLR start ruleRequestResponseOperation
    // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:735:1: ruleRequestResponseOperation returns [EObject current=null] : ( 'operation' ( (lv_name_1_0= RULE_ID ) ) ':' ( ( RULE_ID ) ) '->' ( ( RULE_ID ) ) ) ;
    public final EObject ruleRequestResponseOperation() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:740:6: ( ( 'operation' ( (lv_name_1_0= RULE_ID ) ) ':' ( ( RULE_ID ) ) '->' ( ( RULE_ID ) ) ) )
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:741:1: ( 'operation' ( (lv_name_1_0= RULE_ID ) ) ':' ( ( RULE_ID ) ) '->' ( ( RULE_ID ) ) )
            {
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:741:1: ( 'operation' ( (lv_name_1_0= RULE_ID ) ) ':' ( ( RULE_ID ) ) '->' ( ( RULE_ID ) ) )
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:741:3: 'operation' ( (lv_name_1_0= RULE_ID ) ) ':' ( ( RULE_ID ) ) '->' ( ( RULE_ID ) )
            {
            match(input,22,FOLLOW_22_in_ruleRequestResponseOperation1246); 

                    createLeafNode(grammarAccess.getRequestResponseOperationAccess().getOperationKeyword_0(), null); 
                
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:745:1: ( (lv_name_1_0= RULE_ID ) )
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:746:1: (lv_name_1_0= RULE_ID )
            {
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:746:1: (lv_name_1_0= RULE_ID )
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:747:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRequestResponseOperation1263); 

            			createLeafNode(grammarAccess.getRequestResponseOperationAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getRequestResponseOperationRule().getType().getClassifier());
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

            match(input,23,FOLLOW_23_in_ruleRequestResponseOperation1278); 

                    createLeafNode(grammarAccess.getRequestResponseOperationAccess().getColonKeyword_2(), null); 
                
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:773:1: ( ( RULE_ID ) )
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:774:1: ( RULE_ID )
            {
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:774:1: ( RULE_ID )
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:775:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getRequestResponseOperationRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRequestResponseOperation1296); 

            		createLeafNode(grammarAccess.getRequestResponseOperationAccess().getInputMessageCrossReference_3_0(), "input"); 
            	

            }


            }

            match(input,21,FOLLOW_21_in_ruleRequestResponseOperation1306); 

                    createLeafNode(grammarAccess.getRequestResponseOperationAccess().getHyphenMinusGreaterThanSignKeyword_4(), null); 
                
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:791:1: ( ( RULE_ID ) )
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:792:1: ( RULE_ID )
            {
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:792:1: ( RULE_ID )
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:793:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getRequestResponseOperationRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRequestResponseOperation1324); 

            		createLeafNode(grammarAccess.getRequestResponseOperationAccess().getOutputMessageCrossReference_5_0(), "output"); 
            	

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
    // $ANTLR end ruleRequestResponseOperation


    // $ANTLR start entryRuleSolicitResponseOperation
    // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:813:1: entryRuleSolicitResponseOperation returns [EObject current=null] : iv_ruleSolicitResponseOperation= ruleSolicitResponseOperation EOF ;
    public final EObject entryRuleSolicitResponseOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSolicitResponseOperation = null;


        try {
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:814:2: (iv_ruleSolicitResponseOperation= ruleSolicitResponseOperation EOF )
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:815:2: iv_ruleSolicitResponseOperation= ruleSolicitResponseOperation EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSolicitResponseOperationRule(), currentNode); 
            pushFollow(FOLLOW_ruleSolicitResponseOperation_in_entryRuleSolicitResponseOperation1360);
            iv_ruleSolicitResponseOperation=ruleSolicitResponseOperation();
            _fsp--;

             current =iv_ruleSolicitResponseOperation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSolicitResponseOperation1370); 

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
    // $ANTLR end entryRuleSolicitResponseOperation


    // $ANTLR start ruleSolicitResponseOperation
    // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:822:1: ruleSolicitResponseOperation returns [EObject current=null] : ( 'operation' ( (lv_name_1_0= RULE_ID ) ) ':' ( ( RULE_ID ) ) '<-' ( ( RULE_ID ) ) ) ;
    public final EObject ruleSolicitResponseOperation() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:827:6: ( ( 'operation' ( (lv_name_1_0= RULE_ID ) ) ':' ( ( RULE_ID ) ) '<-' ( ( RULE_ID ) ) ) )
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:828:1: ( 'operation' ( (lv_name_1_0= RULE_ID ) ) ':' ( ( RULE_ID ) ) '<-' ( ( RULE_ID ) ) )
            {
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:828:1: ( 'operation' ( (lv_name_1_0= RULE_ID ) ) ':' ( ( RULE_ID ) ) '<-' ( ( RULE_ID ) ) )
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:828:3: 'operation' ( (lv_name_1_0= RULE_ID ) ) ':' ( ( RULE_ID ) ) '<-' ( ( RULE_ID ) )
            {
            match(input,22,FOLLOW_22_in_ruleSolicitResponseOperation1405); 

                    createLeafNode(grammarAccess.getSolicitResponseOperationAccess().getOperationKeyword_0(), null); 
                
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:832:1: ( (lv_name_1_0= RULE_ID ) )
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:833:1: (lv_name_1_0= RULE_ID )
            {
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:833:1: (lv_name_1_0= RULE_ID )
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:834:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSolicitResponseOperation1422); 

            			createLeafNode(grammarAccess.getSolicitResponseOperationAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getSolicitResponseOperationRule().getType().getClassifier());
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

            match(input,23,FOLLOW_23_in_ruleSolicitResponseOperation1437); 

                    createLeafNode(grammarAccess.getSolicitResponseOperationAccess().getColonKeyword_2(), null); 
                
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:860:1: ( ( RULE_ID ) )
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:861:1: ( RULE_ID )
            {
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:861:1: ( RULE_ID )
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:862:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getSolicitResponseOperationRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSolicitResponseOperation1455); 

            		createLeafNode(grammarAccess.getSolicitResponseOperationAccess().getInputMessageCrossReference_3_0(), "input"); 
            	

            }


            }

            match(input,24,FOLLOW_24_in_ruleSolicitResponseOperation1465); 

                    createLeafNode(grammarAccess.getSolicitResponseOperationAccess().getLessThanSignHyphenMinusKeyword_4(), null); 
                
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:878:1: ( ( RULE_ID ) )
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:879:1: ( RULE_ID )
            {
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:879:1: ( RULE_ID )
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:880:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getSolicitResponseOperationRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSolicitResponseOperation1483); 

            		createLeafNode(grammarAccess.getSolicitResponseOperationAccess().getOutputMessageCrossReference_5_0(), "output"); 
            	

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
    // $ANTLR end ruleSolicitResponseOperation


    // $ANTLR start entryRuleNotificationOperation
    // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:900:1: entryRuleNotificationOperation returns [EObject current=null] : iv_ruleNotificationOperation= ruleNotificationOperation EOF ;
    public final EObject entryRuleNotificationOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotificationOperation = null;


        try {
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:901:2: (iv_ruleNotificationOperation= ruleNotificationOperation EOF )
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:902:2: iv_ruleNotificationOperation= ruleNotificationOperation EOF
            {
             currentNode = createCompositeNode(grammarAccess.getNotificationOperationRule(), currentNode); 
            pushFollow(FOLLOW_ruleNotificationOperation_in_entryRuleNotificationOperation1519);
            iv_ruleNotificationOperation=ruleNotificationOperation();
            _fsp--;

             current =iv_ruleNotificationOperation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNotificationOperation1529); 

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
    // $ANTLR end entryRuleNotificationOperation


    // $ANTLR start ruleNotificationOperation
    // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:909:1: ruleNotificationOperation returns [EObject current=null] : ( 'operation' ( (lv_name_1_0= RULE_ID ) ) ':' '->' ( ( RULE_ID ) ) ) ;
    public final EObject ruleNotificationOperation() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:914:6: ( ( 'operation' ( (lv_name_1_0= RULE_ID ) ) ':' '->' ( ( RULE_ID ) ) ) )
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:915:1: ( 'operation' ( (lv_name_1_0= RULE_ID ) ) ':' '->' ( ( RULE_ID ) ) )
            {
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:915:1: ( 'operation' ( (lv_name_1_0= RULE_ID ) ) ':' '->' ( ( RULE_ID ) ) )
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:915:3: 'operation' ( (lv_name_1_0= RULE_ID ) ) ':' '->' ( ( RULE_ID ) )
            {
            match(input,22,FOLLOW_22_in_ruleNotificationOperation1564); 

                    createLeafNode(grammarAccess.getNotificationOperationAccess().getOperationKeyword_0(), null); 
                
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:919:1: ( (lv_name_1_0= RULE_ID ) )
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:920:1: (lv_name_1_0= RULE_ID )
            {
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:920:1: (lv_name_1_0= RULE_ID )
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:921:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNotificationOperation1581); 

            			createLeafNode(grammarAccess.getNotificationOperationAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getNotificationOperationRule().getType().getClassifier());
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

            match(input,23,FOLLOW_23_in_ruleNotificationOperation1596); 

                    createLeafNode(grammarAccess.getNotificationOperationAccess().getColonKeyword_2(), null); 
                
            match(input,21,FOLLOW_21_in_ruleNotificationOperation1606); 

                    createLeafNode(grammarAccess.getNotificationOperationAccess().getHyphenMinusGreaterThanSignKeyword_3(), null); 
                
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:951:1: ( ( RULE_ID ) )
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:952:1: ( RULE_ID )
            {
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:952:1: ( RULE_ID )
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:953:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getNotificationOperationRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNotificationOperation1624); 

            		createLeafNode(grammarAccess.getNotificationOperationAccess().getOutputMessageCrossReference_4_0(), "output"); 
            	

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
    // $ANTLR end ruleNotificationOperation


    // $ANTLR start entryRuleBinding
    // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:973:1: entryRuleBinding returns [EObject current=null] : iv_ruleBinding= ruleBinding EOF ;
    public final EObject entryRuleBinding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinding = null;


        try {
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:974:2: (iv_ruleBinding= ruleBinding EOF )
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:975:2: iv_ruleBinding= ruleBinding EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBindingRule(), currentNode); 
            pushFollow(FOLLOW_ruleBinding_in_entryRuleBinding1660);
            iv_ruleBinding=ruleBinding();
            _fsp--;

             current =iv_ruleBinding; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBinding1670); 

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
    // $ANTLR end entryRuleBinding


    // $ANTLR start ruleBinding
    // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:982:1: ruleBinding returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) 'binds' ( ( RULE_ID ) ) 'using' ( (lv_transport_4_0= ruleTransport ) ) ) ;
    public final EObject ruleBinding() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_transport_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:987:6: ( ( ( (lv_name_0_0= RULE_ID ) ) 'binds' ( ( RULE_ID ) ) 'using' ( (lv_transport_4_0= ruleTransport ) ) ) )
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:988:1: ( ( (lv_name_0_0= RULE_ID ) ) 'binds' ( ( RULE_ID ) ) 'using' ( (lv_transport_4_0= ruleTransport ) ) )
            {
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:988:1: ( ( (lv_name_0_0= RULE_ID ) ) 'binds' ( ( RULE_ID ) ) 'using' ( (lv_transport_4_0= ruleTransport ) ) )
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:988:2: ( (lv_name_0_0= RULE_ID ) ) 'binds' ( ( RULE_ID ) ) 'using' ( (lv_transport_4_0= ruleTransport ) )
            {
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:988:2: ( (lv_name_0_0= RULE_ID ) )
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:989:1: (lv_name_0_0= RULE_ID )
            {
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:989:1: (lv_name_0_0= RULE_ID )
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:990:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBinding1712); 

            			createLeafNode(grammarAccess.getBindingAccess().getNameIDTerminalRuleCall_0_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getBindingRule().getType().getClassifier());
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

            match(input,25,FOLLOW_25_in_ruleBinding1727); 

                    createLeafNode(grammarAccess.getBindingAccess().getBindsKeyword_1(), null); 
                
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:1016:1: ( ( RULE_ID ) )
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:1017:1: ( RULE_ID )
            {
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:1017:1: ( RULE_ID )
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:1018:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getBindingRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBinding1745); 

            		createLeafNode(grammarAccess.getBindingAccess().getTypePortTypeCrossReference_2_0(), "type"); 
            	

            }


            }

            match(input,26,FOLLOW_26_in_ruleBinding1755); 

                    createLeafNode(grammarAccess.getBindingAccess().getUsingKeyword_3(), null); 
                
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:1034:1: ( (lv_transport_4_0= ruleTransport ) )
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:1035:1: (lv_transport_4_0= ruleTransport )
            {
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:1035:1: (lv_transport_4_0= ruleTransport )
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:1036:3: lv_transport_4_0= ruleTransport
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getBindingAccess().getTransportTransportParserRuleCall_4_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleTransport_in_ruleBinding1776);
            lv_transport_4_0=ruleTransport();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getBindingRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"transport",
            	        		lv_transport_4_0, 
            	        		"Transport", 
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
    // $ANTLR end ruleBinding


    // $ANTLR start entryRuleTransport
    // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:1066:1: entryRuleTransport returns [EObject current=null] : iv_ruleTransport= ruleTransport EOF ;
    public final EObject entryRuleTransport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransport = null;


        try {
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:1067:2: (iv_ruleTransport= ruleTransport EOF )
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:1068:2: iv_ruleTransport= ruleTransport EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTransportRule(), currentNode); 
            pushFollow(FOLLOW_ruleTransport_in_entryRuleTransport1812);
            iv_ruleTransport=ruleTransport();
            _fsp--;

             current =iv_ruleTransport; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransport1822); 

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
    // $ANTLR end entryRuleTransport


    // $ANTLR start ruleTransport
    // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:1075:1: ruleTransport returns [EObject current=null] : (this_SoapTransport_0= ruleSoapTransport | this_HttpTransport_1= ruleHttpTransport ) ;
    public final EObject ruleTransport() throws RecognitionException {
        EObject current = null;

        EObject this_SoapTransport_0 = null;

        EObject this_HttpTransport_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:1080:6: ( (this_SoapTransport_0= ruleSoapTransport | this_HttpTransport_1= ruleHttpTransport ) )
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:1081:1: (this_SoapTransport_0= ruleSoapTransport | this_HttpTransport_1= ruleHttpTransport )
            {
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:1081:1: (this_SoapTransport_0= ruleSoapTransport | this_HttpTransport_1= ruleHttpTransport )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==27) ) {
                alt12=1;
            }
            else if ( (LA12_0==30) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1081:1: (this_SoapTransport_0= ruleSoapTransport | this_HttpTransport_1= ruleHttpTransport )", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:1082:5: this_SoapTransport_0= ruleSoapTransport
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTransportAccess().getSoapTransportParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleSoapTransport_in_ruleTransport1869);
                    this_SoapTransport_0=ruleSoapTransport();
                    _fsp--;

                     
                            current = this_SoapTransport_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:1092:5: this_HttpTransport_1= ruleHttpTransport
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTransportAccess().getHttpTransportParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleHttpTransport_in_ruleTransport1896);
                    this_HttpTransport_1=ruleHttpTransport();
                    _fsp--;

                     
                            current = this_HttpTransport_1; 
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
    // $ANTLR end ruleTransport


    // $ANTLR start entryRuleSoapTransport
    // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:1108:1: entryRuleSoapTransport returns [EObject current=null] : iv_ruleSoapTransport= ruleSoapTransport EOF ;
    public final EObject entryRuleSoapTransport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSoapTransport = null;


        try {
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:1109:2: (iv_ruleSoapTransport= ruleSoapTransport EOF )
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:1110:2: iv_ruleSoapTransport= ruleSoapTransport EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSoapTransportRule(), currentNode); 
            pushFollow(FOLLOW_ruleSoapTransport_in_entryRuleSoapTransport1931);
            iv_ruleSoapTransport=ruleSoapTransport();
            _fsp--;

             current =iv_ruleSoapTransport; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSoapTransport1941); 

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
    // $ANTLR end entryRuleSoapTransport


    // $ANTLR start ruleSoapTransport
    // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:1117:1: ruleSoapTransport returns [EObject current=null] : ( 'soap' '(' ( (lv_type_2_0= ruleSoapType ) ) ')' ) ;
    public final EObject ruleSoapTransport() throws RecognitionException {
        EObject current = null;

        Enumerator lv_type_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:1122:6: ( ( 'soap' '(' ( (lv_type_2_0= ruleSoapType ) ) ')' ) )
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:1123:1: ( 'soap' '(' ( (lv_type_2_0= ruleSoapType ) ) ')' )
            {
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:1123:1: ( 'soap' '(' ( (lv_type_2_0= ruleSoapType ) ) ')' )
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:1123:3: 'soap' '(' ( (lv_type_2_0= ruleSoapType ) ) ')'
            {
            match(input,27,FOLLOW_27_in_ruleSoapTransport1976); 

                    createLeafNode(grammarAccess.getSoapTransportAccess().getSoapKeyword_0(), null); 
                
            match(input,28,FOLLOW_28_in_ruleSoapTransport1986); 

                    createLeafNode(grammarAccess.getSoapTransportAccess().getLeftParenthesisKeyword_1(), null); 
                
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:1131:1: ( (lv_type_2_0= ruleSoapType ) )
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:1132:1: (lv_type_2_0= ruleSoapType )
            {
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:1132:1: (lv_type_2_0= ruleSoapType )
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:1133:3: lv_type_2_0= ruleSoapType
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getSoapTransportAccess().getTypeSoapTypeEnumRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleSoapType_in_ruleSoapTransport2007);
            lv_type_2_0=ruleSoapType();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getSoapTransportRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"type",
            	        		lv_type_2_0, 
            	        		"SoapType", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,29,FOLLOW_29_in_ruleSoapTransport2017); 

                    createLeafNode(grammarAccess.getSoapTransportAccess().getRightParenthesisKeyword_3(), null); 
                

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
    // $ANTLR end ruleSoapTransport


    // $ANTLR start entryRuleHttpTransport
    // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:1167:1: entryRuleHttpTransport returns [EObject current=null] : iv_ruleHttpTransport= ruleHttpTransport EOF ;
    public final EObject entryRuleHttpTransport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHttpTransport = null;


        try {
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:1168:2: (iv_ruleHttpTransport= ruleHttpTransport EOF )
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:1169:2: iv_ruleHttpTransport= ruleHttpTransport EOF
            {
             currentNode = createCompositeNode(grammarAccess.getHttpTransportRule(), currentNode); 
            pushFollow(FOLLOW_ruleHttpTransport_in_entryRuleHttpTransport2053);
            iv_ruleHttpTransport=ruleHttpTransport();
            _fsp--;

             current =iv_ruleHttpTransport; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHttpTransport2063); 

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
    // $ANTLR end entryRuleHttpTransport


    // $ANTLR start ruleHttpTransport
    // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:1176:1: ruleHttpTransport returns [EObject current=null] : ( 'http' '-' ( (lv_type_2_0= ruleHttpType ) ) ) ;
    public final EObject ruleHttpTransport() throws RecognitionException {
        EObject current = null;

        Enumerator lv_type_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:1181:6: ( ( 'http' '-' ( (lv_type_2_0= ruleHttpType ) ) ) )
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:1182:1: ( 'http' '-' ( (lv_type_2_0= ruleHttpType ) ) )
            {
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:1182:1: ( 'http' '-' ( (lv_type_2_0= ruleHttpType ) ) )
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:1182:3: 'http' '-' ( (lv_type_2_0= ruleHttpType ) )
            {
            match(input,30,FOLLOW_30_in_ruleHttpTransport2098); 

                    createLeafNode(grammarAccess.getHttpTransportAccess().getHttpKeyword_0(), null); 
                
            match(input,31,FOLLOW_31_in_ruleHttpTransport2108); 

                    createLeafNode(grammarAccess.getHttpTransportAccess().getHyphenMinusKeyword_1(), null); 
                
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:1190:1: ( (lv_type_2_0= ruleHttpType ) )
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:1191:1: (lv_type_2_0= ruleHttpType )
            {
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:1191:1: (lv_type_2_0= ruleHttpType )
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:1192:3: lv_type_2_0= ruleHttpType
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getHttpTransportAccess().getTypeHttpTypeEnumRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleHttpType_in_ruleHttpTransport2129);
            lv_type_2_0=ruleHttpType();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getHttpTransportRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"type",
            	        		lv_type_2_0, 
            	        		"HttpType", 
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
    // $ANTLR end ruleHttpTransport


    // $ANTLR start entryRuleService
    // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:1222:1: entryRuleService returns [EObject current=null] : iv_ruleService= ruleService EOF ;
    public final EObject entryRuleService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleService = null;


        try {
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:1223:2: (iv_ruleService= ruleService EOF )
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:1224:2: iv_ruleService= ruleService EOF
            {
             currentNode = createCompositeNode(grammarAccess.getServiceRule(), currentNode); 
            pushFollow(FOLLOW_ruleService_in_entryRuleService2165);
            iv_ruleService=ruleService();
            _fsp--;

             current =iv_ruleService; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleService2175); 

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
    // $ANTLR end entryRuleService


    // $ANTLR start ruleService
    // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:1231:1: ruleService returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) '{' ( 'documentation' ( (lv_documentation_3_0= RULE_STRING ) ) )? ( (lv_ports_4_0= rulePort ) )* '}' ) ;
    public final EObject ruleService() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_documentation_3_0=null;
        EObject lv_ports_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:1236:6: ( ( ( (lv_name_0_0= RULE_ID ) ) '{' ( 'documentation' ( (lv_documentation_3_0= RULE_STRING ) ) )? ( (lv_ports_4_0= rulePort ) )* '}' ) )
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:1237:1: ( ( (lv_name_0_0= RULE_ID ) ) '{' ( 'documentation' ( (lv_documentation_3_0= RULE_STRING ) ) )? ( (lv_ports_4_0= rulePort ) )* '}' )
            {
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:1237:1: ( ( (lv_name_0_0= RULE_ID ) ) '{' ( 'documentation' ( (lv_documentation_3_0= RULE_STRING ) ) )? ( (lv_ports_4_0= rulePort ) )* '}' )
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:1237:2: ( (lv_name_0_0= RULE_ID ) ) '{' ( 'documentation' ( (lv_documentation_3_0= RULE_STRING ) ) )? ( (lv_ports_4_0= rulePort ) )* '}'
            {
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:1237:2: ( (lv_name_0_0= RULE_ID ) )
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:1238:1: (lv_name_0_0= RULE_ID )
            {
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:1238:1: (lv_name_0_0= RULE_ID )
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:1239:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleService2217); 

            			createLeafNode(grammarAccess.getServiceAccess().getNameIDTerminalRuleCall_0_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getServiceRule().getType().getClassifier());
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

            match(input,19,FOLLOW_19_in_ruleService2232); 

                    createLeafNode(grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_1(), null); 
                
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:1265:1: ( 'documentation' ( (lv_documentation_3_0= RULE_STRING ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==32) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:1265:3: 'documentation' ( (lv_documentation_3_0= RULE_STRING ) )
                    {
                    match(input,32,FOLLOW_32_in_ruleService2243); 

                            createLeafNode(grammarAccess.getServiceAccess().getDocumentationKeyword_2_0(), null); 
                        
                    // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:1269:1: ( (lv_documentation_3_0= RULE_STRING ) )
                    // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:1270:1: (lv_documentation_3_0= RULE_STRING )
                    {
                    // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:1270:1: (lv_documentation_3_0= RULE_STRING )
                    // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:1271:3: lv_documentation_3_0= RULE_STRING
                    {
                    lv_documentation_3_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleService2260); 

                    			createLeafNode(grammarAccess.getServiceAccess().getDocumentationSTRINGTerminalRuleCall_2_1_0(), "documentation"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getServiceRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"documentation",
                    	        		lv_documentation_3_0, 
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

            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:1293:4: ( (lv_ports_4_0= rulePort ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==33) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:1294:1: (lv_ports_4_0= rulePort )
            	    {
            	    // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:1294:1: (lv_ports_4_0= rulePort )
            	    // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:1295:3: lv_ports_4_0= rulePort
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getServiceAccess().getPortsPortParserRuleCall_3_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_rulePort_in_ruleService2288);
            	    lv_ports_4_0=rulePort();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getServiceRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"ports",
            	    	        		lv_ports_4_0, 
            	    	        		"Port", 
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

            match(input,20,FOLLOW_20_in_ruleService2299); 

                    createLeafNode(grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_4(), null); 
                

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
    // $ANTLR end ruleService


    // $ANTLR start entryRulePort
    // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:1329:1: entryRulePort returns [EObject current=null] : iv_rulePort= rulePort EOF ;
    public final EObject entryRulePort() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePort = null;


        try {
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:1330:2: (iv_rulePort= rulePort EOF )
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:1331:2: iv_rulePort= rulePort EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPortRule(), currentNode); 
            pushFollow(FOLLOW_rulePort_in_entryRulePort2335);
            iv_rulePort=rulePort();
            _fsp--;

             current =iv_rulePort; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePort2345); 

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
    // $ANTLR end entryRulePort


    // $ANTLR start rulePort
    // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:1338:1: rulePort returns [EObject current=null] : ( 'port' ( (lv_name_1_0= RULE_ID ) ) 'binds' ( ( RULE_ID ) ) 'on' ( (lv_location_5_0= RULE_STRING ) ) ) ;
    public final EObject rulePort() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token lv_location_5_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:1343:6: ( ( 'port' ( (lv_name_1_0= RULE_ID ) ) 'binds' ( ( RULE_ID ) ) 'on' ( (lv_location_5_0= RULE_STRING ) ) ) )
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:1344:1: ( 'port' ( (lv_name_1_0= RULE_ID ) ) 'binds' ( ( RULE_ID ) ) 'on' ( (lv_location_5_0= RULE_STRING ) ) )
            {
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:1344:1: ( 'port' ( (lv_name_1_0= RULE_ID ) ) 'binds' ( ( RULE_ID ) ) 'on' ( (lv_location_5_0= RULE_STRING ) ) )
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:1344:3: 'port' ( (lv_name_1_0= RULE_ID ) ) 'binds' ( ( RULE_ID ) ) 'on' ( (lv_location_5_0= RULE_STRING ) )
            {
            match(input,33,FOLLOW_33_in_rulePort2380); 

                    createLeafNode(grammarAccess.getPortAccess().getPortKeyword_0(), null); 
                
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:1348:1: ( (lv_name_1_0= RULE_ID ) )
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:1349:1: (lv_name_1_0= RULE_ID )
            {
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:1349:1: (lv_name_1_0= RULE_ID )
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:1350:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePort2397); 

            			createLeafNode(grammarAccess.getPortAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getPortRule().getType().getClassifier());
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

            match(input,25,FOLLOW_25_in_rulePort2412); 

                    createLeafNode(grammarAccess.getPortAccess().getBindsKeyword_2(), null); 
                
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:1376:1: ( ( RULE_ID ) )
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:1377:1: ( RULE_ID )
            {
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:1377:1: ( RULE_ID )
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:1378:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getPortRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePort2430); 

            		createLeafNode(grammarAccess.getPortAccess().getBindingBindingCrossReference_3_0(), "binding"); 
            	

            }


            }

            match(input,34,FOLLOW_34_in_rulePort2440); 

                    createLeafNode(grammarAccess.getPortAccess().getOnKeyword_4(), null); 
                
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:1394:1: ( (lv_location_5_0= RULE_STRING ) )
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:1395:1: (lv_location_5_0= RULE_STRING )
            {
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:1395:1: (lv_location_5_0= RULE_STRING )
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:1396:3: lv_location_5_0= RULE_STRING
            {
            lv_location_5_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePort2457); 

            			createLeafNode(grammarAccess.getPortAccess().getLocationSTRINGTerminalRuleCall_5_0(), "location"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getPortRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"location",
            	        		lv_location_5_0, 
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
    // $ANTLR end rulePort


    // $ANTLR start ruleSoapType
    // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:1426:1: ruleSoapType returns [Enumerator current=null] : ( ( 'document' ) | ( 'rpc' ) ) ;
    public final Enumerator ruleSoapType() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:1430:6: ( ( ( 'document' ) | ( 'rpc' ) ) )
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:1431:1: ( ( 'document' ) | ( 'rpc' ) )
            {
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:1431:1: ( ( 'document' ) | ( 'rpc' ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==35) ) {
                alt15=1;
            }
            else if ( (LA15_0==36) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1431:1: ( ( 'document' ) | ( 'rpc' ) )", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:1431:2: ( 'document' )
                    {
                    // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:1431:2: ( 'document' )
                    // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:1431:4: 'document'
                    {
                    match(input,35,FOLLOW_35_in_ruleSoapType2510); 

                            current = grammarAccess.getSoapTypeAccess().getDocumentEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getSoapTypeAccess().getDocumentEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:1437:6: ( 'rpc' )
                    {
                    // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:1437:6: ( 'rpc' )
                    // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:1437:8: 'rpc'
                    {
                    match(input,36,FOLLOW_36_in_ruleSoapType2525); 

                            current = grammarAccess.getSoapTypeAccess().getRpcEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getSoapTypeAccess().getRpcEnumLiteralDeclaration_1(), null); 
                        

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
    // $ANTLR end ruleSoapType


    // $ANTLR start ruleHttpType
    // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:1447:1: ruleHttpType returns [Enumerator current=null] : ( ( 'get' ) | ( 'put' ) ) ;
    public final Enumerator ruleHttpType() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:1451:6: ( ( ( 'get' ) | ( 'put' ) ) )
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:1452:1: ( ( 'get' ) | ( 'put' ) )
            {
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:1452:1: ( ( 'get' ) | ( 'put' ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==37) ) {
                alt16=1;
            }
            else if ( (LA16_0==38) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1452:1: ( ( 'get' ) | ( 'put' ) )", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:1452:2: ( 'get' )
                    {
                    // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:1452:2: ( 'get' )
                    // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:1452:4: 'get'
                    {
                    match(input,37,FOLLOW_37_in_ruleHttpType2568); 

                            current = grammarAccess.getHttpTypeAccess().getGetEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getHttpTypeAccess().getGetEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:1458:6: ( 'put' )
                    {
                    // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:1458:6: ( 'put' )
                    // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:1458:8: 'put'
                    {
                    match(input,38,FOLLOW_38_in_ruleHttpType2583); 

                            current = grammarAccess.getHttpTypeAccess().getPutEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getHttpTypeAccess().getPutEnumLiteralDeclaration_1(), null); 
                        

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
    // $ANTLR end ruleHttpType


 

    public static final BitSet FOLLOW_ruleDefinitions_in_entryRuleDefinitions75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefinitions85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleDefinitions120 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDefinitions137 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleDefinitions152 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDefinitions169 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ruleXsdImport_in_ruleDefinitions195 = new BitSet(new long[]{0x000000000001E002L});
    public static final BitSet FOLLOW_13_in_ruleDefinitions206 = new BitSet(new long[]{0x000000000001C012L});
    public static final BitSet FOLLOW_ruleMessage_in_ruleDefinitions227 = new BitSet(new long[]{0x000000000001C012L});
    public static final BitSet FOLLOW_14_in_ruleDefinitions241 = new BitSet(new long[]{0x0000000000018012L});
    public static final BitSet FOLLOW_rulePortType_in_ruleDefinitions262 = new BitSet(new long[]{0x0000000000018012L});
    public static final BitSet FOLLOW_15_in_ruleDefinitions276 = new BitSet(new long[]{0x0000000000010012L});
    public static final BitSet FOLLOW_ruleBinding_in_ruleDefinitions297 = new BitSet(new long[]{0x0000000000010012L});
    public static final BitSet FOLLOW_16_in_ruleDefinitions311 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleService_in_ruleDefinitions332 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleXsdImport_in_entryRuleXsdImport371 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXsdImport381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleXsdImport416 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleXsdImport433 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleXsdImport448 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleXsdImport465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessage_in_entryRuleMessage506 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMessage516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMessage558 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleMessage573 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_rulePart_in_ruleMessage594 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_20_in_ruleMessage605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePart_in_entryRulePart641 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePart651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePart693 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_rulePart708 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePart726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePortType_in_entryRulePortType762 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePortType772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePortType814 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_rulePortType829 = new BitSet(new long[]{0x0000000000500000L});
    public static final BitSet FOLLOW_ruleOperation_in_rulePortType850 = new BitSet(new long[]{0x0000000000500000L});
    public static final BitSet FOLLOW_20_in_rulePortType861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperation_in_entryRuleOperation897 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperation907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOneWayOperation_in_ruleOperation954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRequestResponseOperation_in_ruleOperation981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSolicitResponseOperation_in_ruleOperation1008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotificationOperation_in_ruleOperation1035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOneWayOperation_in_entryRuleOneWayOperation1070 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOneWayOperation1080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleOneWayOperation1115 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleOneWayOperation1132 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleOneWayOperation1147 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleOneWayOperation1165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRequestResponseOperation_in_entryRuleRequestResponseOperation1201 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRequestResponseOperation1211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleRequestResponseOperation1246 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRequestResponseOperation1263 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleRequestResponseOperation1278 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRequestResponseOperation1296 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleRequestResponseOperation1306 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRequestResponseOperation1324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSolicitResponseOperation_in_entryRuleSolicitResponseOperation1360 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSolicitResponseOperation1370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleSolicitResponseOperation1405 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSolicitResponseOperation1422 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleSolicitResponseOperation1437 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSolicitResponseOperation1455 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleSolicitResponseOperation1465 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSolicitResponseOperation1483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotificationOperation_in_entryRuleNotificationOperation1519 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNotificationOperation1529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleNotificationOperation1564 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNotificationOperation1581 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleNotificationOperation1596 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleNotificationOperation1606 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNotificationOperation1624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinding_in_entryRuleBinding1660 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBinding1670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBinding1712 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleBinding1727 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBinding1745 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleBinding1755 = new BitSet(new long[]{0x0000000048000000L});
    public static final BitSet FOLLOW_ruleTransport_in_ruleBinding1776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransport_in_entryRuleTransport1812 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransport1822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSoapTransport_in_ruleTransport1869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHttpTransport_in_ruleTransport1896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSoapTransport_in_entryRuleSoapTransport1931 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSoapTransport1941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleSoapTransport1976 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleSoapTransport1986 = new BitSet(new long[]{0x0000001800000000L});
    public static final BitSet FOLLOW_ruleSoapType_in_ruleSoapTransport2007 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleSoapTransport2017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHttpTransport_in_entryRuleHttpTransport2053 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHttpTransport2063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleHttpTransport2098 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleHttpTransport2108 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_ruleHttpType_in_ruleHttpTransport2129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleService_in_entryRuleService2165 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleService2175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleService2217 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleService2232 = new BitSet(new long[]{0x0000000300100000L});
    public static final BitSet FOLLOW_32_in_ruleService2243 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleService2260 = new BitSet(new long[]{0x0000000200100000L});
    public static final BitSet FOLLOW_rulePort_in_ruleService2288 = new BitSet(new long[]{0x0000000200100000L});
    public static final BitSet FOLLOW_20_in_ruleService2299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePort_in_entryRulePort2335 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePort2345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rulePort2380 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePort2397 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_rulePort2412 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePort2430 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_rulePort2440 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePort2457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleSoapType2510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleSoapType2525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleHttpType2568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleHttpType2583 = new BitSet(new long[]{0x0000000000000002L});

}