package nl.dslmeinte.xtext.examples.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalWsdlLanguageLexer extends Lexer {
    public static final int RULE_ID=4;
    public static final int RULE_ANY_OTHER=10;
    public static final int T29=29;
    public static final int T28=28;
    public static final int T27=27;
    public static final int T26=26;
    public static final int T25=25;
    public static final int Tokens=39;
    public static final int T24=24;
    public static final int EOF=-1;
    public static final int RULE_SL_COMMENT=8;
    public static final int T23=23;
    public static final int T22=22;
    public static final int T21=21;
    public static final int T20=20;
    public static final int RULE_ML_COMMENT=7;
    public static final int RULE_STRING=5;
    public static final int RULE_INT=6;
    public static final int T38=38;
    public static final int T11=11;
    public static final int T37=37;
    public static final int T12=12;
    public static final int T13=13;
    public static final int T14=14;
    public static final int T34=34;
    public static final int RULE_WS=9;
    public static final int T15=15;
    public static final int T33=33;
    public static final int T16=16;
    public static final int T36=36;
    public static final int T17=17;
    public static final int T35=35;
    public static final int T18=18;
    public static final int T30=30;
    public static final int T19=19;
    public static final int T32=32;
    public static final int T31=31;
    public InternalWsdlLanguageLexer() {;} 
    public InternalWsdlLanguageLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g"; }

    // $ANTLR start T11
    public final void mT11() throws RecognitionException {
        try {
            int _type = T11;
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:10:5: ( 'wsdl' )
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:10:7: 'wsdl'
            {
            match("wsdl"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T11

    // $ANTLR start T12
    public final void mT12() throws RecognitionException {
        try {
            int _type = T12;
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:11:5: ( 'namespace:' )
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:11:7: 'namespace:'
            {
            match("namespace:"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T12

    // $ANTLR start T13
    public final void mT13() throws RecognitionException {
        try {
            int _type = T13;
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:12:5: ( 'messages:' )
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:12:7: 'messages:'
            {
            match("messages:"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T13

    // $ANTLR start T14
    public final void mT14() throws RecognitionException {
        try {
            int _type = T14;
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:13:5: ( 'portTypes:' )
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:13:7: 'portTypes:'
            {
            match("portTypes:"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T14

    // $ANTLR start T15
    public final void mT15() throws RecognitionException {
        try {
            int _type = T15;
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:14:5: ( 'bindings:' )
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:14:7: 'bindings:'
            {
            match("bindings:"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T15

    // $ANTLR start T16
    public final void mT16() throws RecognitionException {
        try {
            int _type = T16;
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:15:5: ( 'services:' )
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:15:7: 'services:'
            {
            match("services:"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T16

    // $ANTLR start T17
    public final void mT17() throws RecognitionException {
        try {
            int _type = T17;
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:16:5: ( 'xsd-import' )
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:16:7: 'xsd-import'
            {
            match("xsd-import"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T17

    // $ANTLR start T18
    public final void mT18() throws RecognitionException {
        try {
            int _type = T18;
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:17:5: ( 'as' )
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:17:7: 'as'
            {
            match("as"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T18

    // $ANTLR start T19
    public final void mT19() throws RecognitionException {
        try {
            int _type = T19;
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:18:5: ( '{' )
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:18:7: '{'
            {
            match('{'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T19

    // $ANTLR start T20
    public final void mT20() throws RecognitionException {
        try {
            int _type = T20;
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:19:5: ( '}' )
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:19:7: '}'
            {
            match('}'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T20

    // $ANTLR start T21
    public final void mT21() throws RecognitionException {
        try {
            int _type = T21;
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:20:5: ( '->' )
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:20:7: '->'
            {
            match("->"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T21

    // $ANTLR start T22
    public final void mT22() throws RecognitionException {
        try {
            int _type = T22;
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:21:5: ( 'operation' )
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:21:7: 'operation'
            {
            match("operation"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T22

    // $ANTLR start T23
    public final void mT23() throws RecognitionException {
        try {
            int _type = T23;
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:22:5: ( ':' )
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:22:7: ':'
            {
            match(':'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T23

    // $ANTLR start T24
    public final void mT24() throws RecognitionException {
        try {
            int _type = T24;
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:23:5: ( '<-' )
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:23:7: '<-'
            {
            match("<-"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T24

    // $ANTLR start T25
    public final void mT25() throws RecognitionException {
        try {
            int _type = T25;
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:24:5: ( 'binds' )
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:24:7: 'binds'
            {
            match("binds"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T25

    // $ANTLR start T26
    public final void mT26() throws RecognitionException {
        try {
            int _type = T26;
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:25:5: ( 'using' )
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:25:7: 'using'
            {
            match("using"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T26

    // $ANTLR start T27
    public final void mT27() throws RecognitionException {
        try {
            int _type = T27;
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:26:5: ( 'soap' )
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:26:7: 'soap'
            {
            match("soap"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T27

    // $ANTLR start T28
    public final void mT28() throws RecognitionException {
        try {
            int _type = T28;
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:27:5: ( '(' )
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:27:7: '('
            {
            match('('); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T28

    // $ANTLR start T29
    public final void mT29() throws RecognitionException {
        try {
            int _type = T29;
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:28:5: ( ')' )
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:28:7: ')'
            {
            match(')'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T29

    // $ANTLR start T30
    public final void mT30() throws RecognitionException {
        try {
            int _type = T30;
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:29:5: ( 'http' )
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:29:7: 'http'
            {
            match("http"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T30

    // $ANTLR start T31
    public final void mT31() throws RecognitionException {
        try {
            int _type = T31;
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:30:5: ( '-' )
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:30:7: '-'
            {
            match('-'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T31

    // $ANTLR start T32
    public final void mT32() throws RecognitionException {
        try {
            int _type = T32;
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:31:5: ( 'documentation' )
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:31:7: 'documentation'
            {
            match("documentation"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T32

    // $ANTLR start T33
    public final void mT33() throws RecognitionException {
        try {
            int _type = T33;
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:32:5: ( 'port' )
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:32:7: 'port'
            {
            match("port"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T33

    // $ANTLR start T34
    public final void mT34() throws RecognitionException {
        try {
            int _type = T34;
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:33:5: ( 'on' )
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:33:7: 'on'
            {
            match("on"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T34

    // $ANTLR start T35
    public final void mT35() throws RecognitionException {
        try {
            int _type = T35;
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:34:5: ( 'document' )
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:34:7: 'document'
            {
            match("document"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T35

    // $ANTLR start T36
    public final void mT36() throws RecognitionException {
        try {
            int _type = T36;
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:35:5: ( 'rpc' )
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:35:7: 'rpc'
            {
            match("rpc"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T36

    // $ANTLR start T37
    public final void mT37() throws RecognitionException {
        try {
            int _type = T37;
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:36:5: ( 'get' )
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:36:7: 'get'
            {
            match("get"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T37

    // $ANTLR start T38
    public final void mT38() throws RecognitionException {
        try {
            int _type = T38;
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:37:5: ( 'put' )
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:37:7: 'put'
            {
            match("put"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T38

    // $ANTLR start RULE_ID
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:1467:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:1467:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:1467:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:1467:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:1467:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ID

    // $ANTLR start RULE_INT
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:1469:10: ( ( '0' .. '9' )+ )
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:1469:12: ( '0' .. '9' )+
            {
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:1469:12: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:1469:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_INT

    // $ANTLR start RULE_STRING
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:1471:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:1471:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:1471:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\"') ) {
                alt6=1;
            }
            else if ( (LA6_0=='\'') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1471:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:1471:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:1471:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFE')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:1471:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:1471:62: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFE') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:1471:82: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:1471:87: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFE')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:1471:88: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:1471:129: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFE') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_STRING

    // $ANTLR start RULE_ML_COMMENT
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:1473:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:1473:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:1473:24: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFE')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFE')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:1473:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match("*/"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ML_COMMENT

    // $ANTLR start RULE_SL_COMMENT
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:1475:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:1475:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:1475:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFE')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:1475:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFE') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:1475:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:1475:41: ( '\\r' )? '\\n'
                    {
                    // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:1475:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:1475:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_SL_COMMENT

    // $ANTLR start RULE_WS
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:1477:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:1477:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:1477:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_WS

    // $ANTLR start RULE_ANY_OTHER
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:1479:16: ( . )
            // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:1479:18: .
            {
            matchAny(); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ANY_OTHER

    public void mTokens() throws RecognitionException {
        // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:1:8: ( T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=35;
        int LA12_0 = input.LA(1);

        if ( (LA12_0=='w') ) {
            int LA12_1 = input.LA(2);

            if ( (LA12_1=='s') ) {
                int LA12_30 = input.LA(3);

                if ( (LA12_30=='d') ) {
                    int LA12_61 = input.LA(4);

                    if ( (LA12_61=='l') ) {
                        int LA12_78 = input.LA(5);

                        if ( ((LA12_78>='0' && LA12_78<='9')||(LA12_78>='A' && LA12_78<='Z')||LA12_78=='_'||(LA12_78>='a' && LA12_78<='z')) ) {
                            alt12=29;
                        }
                        else {
                            alt12=1;}
                    }
                    else {
                        alt12=29;}
                }
                else {
                    alt12=29;}
            }
            else {
                alt12=29;}
        }
        else if ( (LA12_0=='n') ) {
            int LA12_2 = input.LA(2);

            if ( (LA12_2=='a') ) {
                int LA12_32 = input.LA(3);

                if ( (LA12_32=='m') ) {
                    int LA12_62 = input.LA(4);

                    if ( (LA12_62=='e') ) {
                        int LA12_79 = input.LA(5);

                        if ( (LA12_79=='s') ) {
                            int LA12_94 = input.LA(6);

                            if ( (LA12_94=='p') ) {
                                int LA12_106 = input.LA(7);

                                if ( (LA12_106=='a') ) {
                                    int LA12_115 = input.LA(8);

                                    if ( (LA12_115=='c') ) {
                                        int LA12_122 = input.LA(9);

                                        if ( (LA12_122=='e') ) {
                                            int LA12_129 = input.LA(10);

                                            if ( (LA12_129==':') ) {
                                                alt12=2;
                                            }
                                            else {
                                                alt12=29;}
                                        }
                                        else {
                                            alt12=29;}
                                    }
                                    else {
                                        alt12=29;}
                                }
                                else {
                                    alt12=29;}
                            }
                            else {
                                alt12=29;}
                        }
                        else {
                            alt12=29;}
                    }
                    else {
                        alt12=29;}
                }
                else {
                    alt12=29;}
            }
            else {
                alt12=29;}
        }
        else if ( (LA12_0=='m') ) {
            int LA12_3 = input.LA(2);

            if ( (LA12_3=='e') ) {
                int LA12_33 = input.LA(3);

                if ( (LA12_33=='s') ) {
                    int LA12_63 = input.LA(4);

                    if ( (LA12_63=='s') ) {
                        int LA12_80 = input.LA(5);

                        if ( (LA12_80=='a') ) {
                            int LA12_95 = input.LA(6);

                            if ( (LA12_95=='g') ) {
                                int LA12_107 = input.LA(7);

                                if ( (LA12_107=='e') ) {
                                    int LA12_116 = input.LA(8);

                                    if ( (LA12_116=='s') ) {
                                        int LA12_123 = input.LA(9);

                                        if ( (LA12_123==':') ) {
                                            alt12=3;
                                        }
                                        else {
                                            alt12=29;}
                                    }
                                    else {
                                        alt12=29;}
                                }
                                else {
                                    alt12=29;}
                            }
                            else {
                                alt12=29;}
                        }
                        else {
                            alt12=29;}
                    }
                    else {
                        alt12=29;}
                }
                else {
                    alt12=29;}
            }
            else {
                alt12=29;}
        }
        else if ( (LA12_0=='p') ) {
            switch ( input.LA(2) ) {
            case 'o':
                {
                int LA12_34 = input.LA(3);

                if ( (LA12_34=='r') ) {
                    int LA12_64 = input.LA(4);

                    if ( (LA12_64=='t') ) {
                        switch ( input.LA(5) ) {
                        case 'T':
                            {
                            int LA12_96 = input.LA(6);

                            if ( (LA12_96=='y') ) {
                                int LA12_108 = input.LA(7);

                                if ( (LA12_108=='p') ) {
                                    int LA12_117 = input.LA(8);

                                    if ( (LA12_117=='e') ) {
                                        int LA12_124 = input.LA(9);

                                        if ( (LA12_124=='s') ) {
                                            int LA12_131 = input.LA(10);

                                            if ( (LA12_131==':') ) {
                                                alt12=4;
                                            }
                                            else {
                                                alt12=29;}
                                        }
                                        else {
                                            alt12=29;}
                                    }
                                    else {
                                        alt12=29;}
                                }
                                else {
                                    alt12=29;}
                            }
                            else {
                                alt12=29;}
                            }
                            break;
                        case '0':
                        case '1':
                        case '2':
                        case '3':
                        case '4':
                        case '5':
                        case '6':
                        case '7':
                        case '8':
                        case '9':
                        case 'A':
                        case 'B':
                        case 'C':
                        case 'D':
                        case 'E':
                        case 'F':
                        case 'G':
                        case 'H':
                        case 'I':
                        case 'J':
                        case 'K':
                        case 'L':
                        case 'M':
                        case 'N':
                        case 'O':
                        case 'P':
                        case 'Q':
                        case 'R':
                        case 'S':
                        case 'U':
                        case 'V':
                        case 'W':
                        case 'X':
                        case 'Y':
                        case 'Z':
                        case '_':
                        case 'a':
                        case 'b':
                        case 'c':
                        case 'd':
                        case 'e':
                        case 'f':
                        case 'g':
                        case 'h':
                        case 'i':
                        case 'j':
                        case 'k':
                        case 'l':
                        case 'm':
                        case 'n':
                        case 'o':
                        case 'p':
                        case 'q':
                        case 'r':
                        case 's':
                        case 't':
                        case 'u':
                        case 'v':
                        case 'w':
                        case 'x':
                        case 'y':
                        case 'z':
                            {
                            alt12=29;
                            }
                            break;
                        default:
                            alt12=23;}

                    }
                    else {
                        alt12=29;}
                }
                else {
                    alt12=29;}
                }
                break;
            case 'u':
                {
                int LA12_35 = input.LA(3);

                if ( (LA12_35=='t') ) {
                    int LA12_65 = input.LA(4);

                    if ( ((LA12_65>='0' && LA12_65<='9')||(LA12_65>='A' && LA12_65<='Z')||LA12_65=='_'||(LA12_65>='a' && LA12_65<='z')) ) {
                        alt12=29;
                    }
                    else {
                        alt12=28;}
                }
                else {
                    alt12=29;}
                }
                break;
            default:
                alt12=29;}

        }
        else if ( (LA12_0=='b') ) {
            int LA12_5 = input.LA(2);

            if ( (LA12_5=='i') ) {
                int LA12_36 = input.LA(3);

                if ( (LA12_36=='n') ) {
                    int LA12_66 = input.LA(4);

                    if ( (LA12_66=='d') ) {
                        switch ( input.LA(5) ) {
                        case 's':
                            {
                            int LA12_98 = input.LA(6);

                            if ( ((LA12_98>='0' && LA12_98<='9')||(LA12_98>='A' && LA12_98<='Z')||LA12_98=='_'||(LA12_98>='a' && LA12_98<='z')) ) {
                                alt12=29;
                            }
                            else {
                                alt12=15;}
                            }
                            break;
                        case 'i':
                            {
                            int LA12_99 = input.LA(6);

                            if ( (LA12_99=='n') ) {
                                int LA12_110 = input.LA(7);

                                if ( (LA12_110=='g') ) {
                                    int LA12_118 = input.LA(8);

                                    if ( (LA12_118=='s') ) {
                                        int LA12_125 = input.LA(9);

                                        if ( (LA12_125==':') ) {
                                            alt12=5;
                                        }
                                        else {
                                            alt12=29;}
                                    }
                                    else {
                                        alt12=29;}
                                }
                                else {
                                    alt12=29;}
                            }
                            else {
                                alt12=29;}
                            }
                            break;
                        default:
                            alt12=29;}

                    }
                    else {
                        alt12=29;}
                }
                else {
                    alt12=29;}
            }
            else {
                alt12=29;}
        }
        else if ( (LA12_0=='s') ) {
            switch ( input.LA(2) ) {
            case 'e':
                {
                int LA12_37 = input.LA(3);

                if ( (LA12_37=='r') ) {
                    int LA12_67 = input.LA(4);

                    if ( (LA12_67=='v') ) {
                        int LA12_84 = input.LA(5);

                        if ( (LA12_84=='i') ) {
                            int LA12_100 = input.LA(6);

                            if ( (LA12_100=='c') ) {
                                int LA12_111 = input.LA(7);

                                if ( (LA12_111=='e') ) {
                                    int LA12_119 = input.LA(8);

                                    if ( (LA12_119=='s') ) {
                                        int LA12_126 = input.LA(9);

                                        if ( (LA12_126==':') ) {
                                            alt12=6;
                                        }
                                        else {
                                            alt12=29;}
                                    }
                                    else {
                                        alt12=29;}
                                }
                                else {
                                    alt12=29;}
                            }
                            else {
                                alt12=29;}
                        }
                        else {
                            alt12=29;}
                    }
                    else {
                        alt12=29;}
                }
                else {
                    alt12=29;}
                }
                break;
            case 'o':
                {
                int LA12_38 = input.LA(3);

                if ( (LA12_38=='a') ) {
                    int LA12_68 = input.LA(4);

                    if ( (LA12_68=='p') ) {
                        int LA12_85 = input.LA(5);

                        if ( ((LA12_85>='0' && LA12_85<='9')||(LA12_85>='A' && LA12_85<='Z')||LA12_85=='_'||(LA12_85>='a' && LA12_85<='z')) ) {
                            alt12=29;
                        }
                        else {
                            alt12=17;}
                    }
                    else {
                        alt12=29;}
                }
                else {
                    alt12=29;}
                }
                break;
            default:
                alt12=29;}

        }
        else if ( (LA12_0=='x') ) {
            int LA12_7 = input.LA(2);

            if ( (LA12_7=='s') ) {
                int LA12_39 = input.LA(3);

                if ( (LA12_39=='d') ) {
                    int LA12_69 = input.LA(4);

                    if ( (LA12_69=='-') ) {
                        alt12=7;
                    }
                    else {
                        alt12=29;}
                }
                else {
                    alt12=29;}
            }
            else {
                alt12=29;}
        }
        else if ( (LA12_0=='a') ) {
            int LA12_8 = input.LA(2);

            if ( (LA12_8=='s') ) {
                int LA12_40 = input.LA(3);

                if ( ((LA12_40>='0' && LA12_40<='9')||(LA12_40>='A' && LA12_40<='Z')||LA12_40=='_'||(LA12_40>='a' && LA12_40<='z')) ) {
                    alt12=29;
                }
                else {
                    alt12=8;}
            }
            else {
                alt12=29;}
        }
        else if ( (LA12_0=='{') ) {
            alt12=9;
        }
        else if ( (LA12_0=='}') ) {
            alt12=10;
        }
        else if ( (LA12_0=='-') ) {
            int LA12_11 = input.LA(2);

            if ( (LA12_11=='>') ) {
                alt12=11;
            }
            else {
                alt12=21;}
        }
        else if ( (LA12_0=='o') ) {
            switch ( input.LA(2) ) {
            case 'p':
                {
                int LA12_45 = input.LA(3);

                if ( (LA12_45=='e') ) {
                    int LA12_71 = input.LA(4);

                    if ( (LA12_71=='r') ) {
                        int LA12_87 = input.LA(5);

                        if ( (LA12_87=='a') ) {
                            int LA12_102 = input.LA(6);

                            if ( (LA12_102=='t') ) {
                                int LA12_112 = input.LA(7);

                                if ( (LA12_112=='i') ) {
                                    int LA12_120 = input.LA(8);

                                    if ( (LA12_120=='o') ) {
                                        int LA12_127 = input.LA(9);

                                        if ( (LA12_127=='n') ) {
                                            int LA12_134 = input.LA(10);

                                            if ( ((LA12_134>='0' && LA12_134<='9')||(LA12_134>='A' && LA12_134<='Z')||LA12_134=='_'||(LA12_134>='a' && LA12_134<='z')) ) {
                                                alt12=29;
                                            }
                                            else {
                                                alt12=12;}
                                        }
                                        else {
                                            alt12=29;}
                                    }
                                    else {
                                        alt12=29;}
                                }
                                else {
                                    alt12=29;}
                            }
                            else {
                                alt12=29;}
                        }
                        else {
                            alt12=29;}
                    }
                    else {
                        alt12=29;}
                }
                else {
                    alt12=29;}
                }
                break;
            case 'n':
                {
                int LA12_46 = input.LA(3);

                if ( ((LA12_46>='0' && LA12_46<='9')||(LA12_46>='A' && LA12_46<='Z')||LA12_46=='_'||(LA12_46>='a' && LA12_46<='z')) ) {
                    alt12=29;
                }
                else {
                    alt12=24;}
                }
                break;
            default:
                alt12=29;}

        }
        else if ( (LA12_0==':') ) {
            alt12=13;
        }
        else if ( (LA12_0=='<') ) {
            int LA12_14 = input.LA(2);

            if ( (LA12_14=='-') ) {
                alt12=14;
            }
            else {
                alt12=35;}
        }
        else if ( (LA12_0=='u') ) {
            int LA12_15 = input.LA(2);

            if ( (LA12_15=='s') ) {
                int LA12_49 = input.LA(3);

                if ( (LA12_49=='i') ) {
                    int LA12_73 = input.LA(4);

                    if ( (LA12_73=='n') ) {
                        int LA12_88 = input.LA(5);

                        if ( (LA12_88=='g') ) {
                            int LA12_103 = input.LA(6);

                            if ( ((LA12_103>='0' && LA12_103<='9')||(LA12_103>='A' && LA12_103<='Z')||LA12_103=='_'||(LA12_103>='a' && LA12_103<='z')) ) {
                                alt12=29;
                            }
                            else {
                                alt12=16;}
                        }
                        else {
                            alt12=29;}
                    }
                    else {
                        alt12=29;}
                }
                else {
                    alt12=29;}
            }
            else {
                alt12=29;}
        }
        else if ( (LA12_0=='(') ) {
            alt12=18;
        }
        else if ( (LA12_0==')') ) {
            alt12=19;
        }
        else if ( (LA12_0=='h') ) {
            int LA12_18 = input.LA(2);

            if ( (LA12_18=='t') ) {
                int LA12_52 = input.LA(3);

                if ( (LA12_52=='t') ) {
                    int LA12_74 = input.LA(4);

                    if ( (LA12_74=='p') ) {
                        int LA12_89 = input.LA(5);

                        if ( ((LA12_89>='0' && LA12_89<='9')||(LA12_89>='A' && LA12_89<='Z')||LA12_89=='_'||(LA12_89>='a' && LA12_89<='z')) ) {
                            alt12=29;
                        }
                        else {
                            alt12=20;}
                    }
                    else {
                        alt12=29;}
                }
                else {
                    alt12=29;}
            }
            else {
                alt12=29;}
        }
        else if ( (LA12_0=='d') ) {
            int LA12_19 = input.LA(2);

            if ( (LA12_19=='o') ) {
                int LA12_53 = input.LA(3);

                if ( (LA12_53=='c') ) {
                    int LA12_75 = input.LA(4);

                    if ( (LA12_75=='u') ) {
                        int LA12_90 = input.LA(5);

                        if ( (LA12_90=='m') ) {
                            int LA12_105 = input.LA(6);

                            if ( (LA12_105=='e') ) {
                                int LA12_114 = input.LA(7);

                                if ( (LA12_114=='n') ) {
                                    int LA12_121 = input.LA(8);

                                    if ( (LA12_121=='t') ) {
                                        switch ( input.LA(9) ) {
                                        case 'a':
                                            {
                                            int LA12_135 = input.LA(10);

                                            if ( (LA12_135=='t') ) {
                                                int LA12_140 = input.LA(11);

                                                if ( (LA12_140=='i') ) {
                                                    int LA12_141 = input.LA(12);

                                                    if ( (LA12_141=='o') ) {
                                                        int LA12_142 = input.LA(13);

                                                        if ( (LA12_142=='n') ) {
                                                            int LA12_143 = input.LA(14);

                                                            if ( ((LA12_143>='0' && LA12_143<='9')||(LA12_143>='A' && LA12_143<='Z')||LA12_143=='_'||(LA12_143>='a' && LA12_143<='z')) ) {
                                                                alt12=29;
                                                            }
                                                            else {
                                                                alt12=22;}
                                                        }
                                                        else {
                                                            alt12=29;}
                                                    }
                                                    else {
                                                        alt12=29;}
                                                }
                                                else {
                                                    alt12=29;}
                                            }
                                            else {
                                                alt12=29;}
                                            }
                                            break;
                                        case '0':
                                        case '1':
                                        case '2':
                                        case '3':
                                        case '4':
                                        case '5':
                                        case '6':
                                        case '7':
                                        case '8':
                                        case '9':
                                        case 'A':
                                        case 'B':
                                        case 'C':
                                        case 'D':
                                        case 'E':
                                        case 'F':
                                        case 'G':
                                        case 'H':
                                        case 'I':
                                        case 'J':
                                        case 'K':
                                        case 'L':
                                        case 'M':
                                        case 'N':
                                        case 'O':
                                        case 'P':
                                        case 'Q':
                                        case 'R':
                                        case 'S':
                                        case 'T':
                                        case 'U':
                                        case 'V':
                                        case 'W':
                                        case 'X':
                                        case 'Y':
                                        case 'Z':
                                        case '_':
                                        case 'b':
                                        case 'c':
                                        case 'd':
                                        case 'e':
                                        case 'f':
                                        case 'g':
                                        case 'h':
                                        case 'i':
                                        case 'j':
                                        case 'k':
                                        case 'l':
                                        case 'm':
                                        case 'n':
                                        case 'o':
                                        case 'p':
                                        case 'q':
                                        case 'r':
                                        case 's':
                                        case 't':
                                        case 'u':
                                        case 'v':
                                        case 'w':
                                        case 'x':
                                        case 'y':
                                        case 'z':
                                            {
                                            alt12=29;
                                            }
                                            break;
                                        default:
                                            alt12=25;}

                                    }
                                    else {
                                        alt12=29;}
                                }
                                else {
                                    alt12=29;}
                            }
                            else {
                                alt12=29;}
                        }
                        else {
                            alt12=29;}
                    }
                    else {
                        alt12=29;}
                }
                else {
                    alt12=29;}
            }
            else {
                alt12=29;}
        }
        else if ( (LA12_0=='r') ) {
            int LA12_20 = input.LA(2);

            if ( (LA12_20=='p') ) {
                int LA12_54 = input.LA(3);

                if ( (LA12_54=='c') ) {
                    int LA12_76 = input.LA(4);

                    if ( ((LA12_76>='0' && LA12_76<='9')||(LA12_76>='A' && LA12_76<='Z')||LA12_76=='_'||(LA12_76>='a' && LA12_76<='z')) ) {
                        alt12=29;
                    }
                    else {
                        alt12=26;}
                }
                else {
                    alt12=29;}
            }
            else {
                alt12=29;}
        }
        else if ( (LA12_0=='g') ) {
            int LA12_21 = input.LA(2);

            if ( (LA12_21=='e') ) {
                int LA12_55 = input.LA(3);

                if ( (LA12_55=='t') ) {
                    int LA12_77 = input.LA(4);

                    if ( ((LA12_77>='0' && LA12_77<='9')||(LA12_77>='A' && LA12_77<='Z')||LA12_77=='_'||(LA12_77>='a' && LA12_77<='z')) ) {
                        alt12=29;
                    }
                    else {
                        alt12=27;}
                }
                else {
                    alt12=29;}
            }
            else {
                alt12=29;}
        }
        else if ( (LA12_0=='^') ) {
            int LA12_22 = input.LA(2);

            if ( ((LA12_22>='A' && LA12_22<='Z')||LA12_22=='_'||(LA12_22>='a' && LA12_22<='z')) ) {
                alt12=29;
            }
            else {
                alt12=35;}
        }
        else if ( ((LA12_0>='A' && LA12_0<='Z')||LA12_0=='_'||LA12_0=='c'||(LA12_0>='e' && LA12_0<='f')||(LA12_0>='i' && LA12_0<='l')||LA12_0=='q'||LA12_0=='t'||LA12_0=='v'||(LA12_0>='y' && LA12_0<='z')) ) {
            alt12=29;
        }
        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {
            alt12=30;
        }
        else if ( (LA12_0=='\"') ) {
            int LA12_25 = input.LA(2);

            if ( ((LA12_25>='\u0000' && LA12_25<='\uFFFE')) ) {
                alt12=31;
            }
            else {
                alt12=35;}
        }
        else if ( (LA12_0=='\'') ) {
            int LA12_26 = input.LA(2);

            if ( ((LA12_26>='\u0000' && LA12_26<='\uFFFE')) ) {
                alt12=31;
            }
            else {
                alt12=35;}
        }
        else if ( (LA12_0=='/') ) {
            switch ( input.LA(2) ) {
            case '/':
                {
                alt12=33;
                }
                break;
            case '*':
                {
                alt12=32;
                }
                break;
            default:
                alt12=35;}

        }
        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {
            alt12=34;
        }
        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='#' && LA12_0<='&')||(LA12_0>='*' && LA12_0<=',')||LA12_0=='.'||LA12_0==';'||(LA12_0>='=' && LA12_0<='@')||(LA12_0>='[' && LA12_0<=']')||LA12_0=='`'||LA12_0=='|'||(LA12_0>='~' && LA12_0<='\uFFFE')) ) {
            alt12=35;
        }
        else {
            NoViableAltException nvae =
                new NoViableAltException("1:1: Tokens : ( T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );", 12, 0, input);

            throw nvae;
        }
        switch (alt12) {
            case 1 :
                // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:1:10: T11
                {
                mT11(); 

                }
                break;
            case 2 :
                // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:1:14: T12
                {
                mT12(); 

                }
                break;
            case 3 :
                // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:1:18: T13
                {
                mT13(); 

                }
                break;
            case 4 :
                // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:1:22: T14
                {
                mT14(); 

                }
                break;
            case 5 :
                // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:1:26: T15
                {
                mT15(); 

                }
                break;
            case 6 :
                // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:1:30: T16
                {
                mT16(); 

                }
                break;
            case 7 :
                // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:1:34: T17
                {
                mT17(); 

                }
                break;
            case 8 :
                // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:1:38: T18
                {
                mT18(); 

                }
                break;
            case 9 :
                // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:1:42: T19
                {
                mT19(); 

                }
                break;
            case 10 :
                // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:1:46: T20
                {
                mT20(); 

                }
                break;
            case 11 :
                // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:1:50: T21
                {
                mT21(); 

                }
                break;
            case 12 :
                // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:1:54: T22
                {
                mT22(); 

                }
                break;
            case 13 :
                // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:1:58: T23
                {
                mT23(); 

                }
                break;
            case 14 :
                // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:1:62: T24
                {
                mT24(); 

                }
                break;
            case 15 :
                // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:1:66: T25
                {
                mT25(); 

                }
                break;
            case 16 :
                // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:1:70: T26
                {
                mT26(); 

                }
                break;
            case 17 :
                // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:1:74: T27
                {
                mT27(); 

                }
                break;
            case 18 :
                // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:1:78: T28
                {
                mT28(); 

                }
                break;
            case 19 :
                // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:1:82: T29
                {
                mT29(); 

                }
                break;
            case 20 :
                // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:1:86: T30
                {
                mT30(); 

                }
                break;
            case 21 :
                // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:1:90: T31
                {
                mT31(); 

                }
                break;
            case 22 :
                // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:1:94: T32
                {
                mT32(); 

                }
                break;
            case 23 :
                // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:1:98: T33
                {
                mT33(); 

                }
                break;
            case 24 :
                // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:1:102: T34
                {
                mT34(); 

                }
                break;
            case 25 :
                // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:1:106: T35
                {
                mT35(); 

                }
                break;
            case 26 :
                // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:1:110: T36
                {
                mT36(); 

                }
                break;
            case 27 :
                // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:1:114: T37
                {
                mT37(); 

                }
                break;
            case 28 :
                // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:1:118: T38
                {
                mT38(); 

                }
                break;
            case 29 :
                // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:1:122: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 30 :
                // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:1:130: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 31 :
                // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:1:139: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 32 :
                // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:1:151: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 33 :
                // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:1:167: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 34 :
                // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:1:183: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 35 :
                // ../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g:1:191: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


 

}