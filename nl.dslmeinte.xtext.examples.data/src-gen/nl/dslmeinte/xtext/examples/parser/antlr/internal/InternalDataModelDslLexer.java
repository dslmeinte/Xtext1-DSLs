package nl.dslmeinte.xtext.examples.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDataModelDslLexer extends Lexer {
    public static final int RULE_ID=4;
    public static final int RULE_ANY_OTHER=10;
    public static final int T29=29;
    public static final int T28=28;
    public static final int T27=27;
    public static final int T26=26;
    public static final int T25=25;
    public static final int Tokens=34;
    public static final int T24=24;
    public static final int EOF=-1;
    public static final int RULE_SL_COMMENT=8;
    public static final int T23=23;
    public static final int T22=22;
    public static final int T21=21;
    public static final int T20=20;
    public static final int RULE_ML_COMMENT=7;
    public static final int RULE_STRING=6;
    public static final int RULE_INT=5;
    public static final int T11=11;
    public static final int T12=12;
    public static final int T13=13;
    public static final int T14=14;
    public static final int RULE_WS=9;
    public static final int T15=15;
    public static final int T33=33;
    public static final int T16=16;
    public static final int T17=17;
    public static final int T18=18;
    public static final int T30=30;
    public static final int T19=19;
    public static final int T32=32;
    public static final int T31=31;
    public InternalDataModelDslLexer() {;} 
    public InternalDataModelDslLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g"; }

    // $ANTLR start T11
    public final void mT11() throws RecognitionException {
        try {
            int _type = T11;
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:10:5: ( 'primitive-types' )
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:10:7: 'primitive-types'
            {
            match("primitive-types"); 


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
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:11:5: ( '{' )
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:11:7: '{'
            {
            match('{'); 

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
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:12:5: ( '}' )
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:12:7: '}'
            {
            match('}'); 

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
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:13:5: ( 'extends' )
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:13:7: 'extends'
            {
            match("extends"); 


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
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:14:5: ( '->' )
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:14:7: '->'
            {
            match("->"); 


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
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:15:5: ( 'datatype' )
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:15:7: 'datatype'
            {
            match("datatype"); 


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
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:16:5: ( ':' )
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:16:7: ':'
            {
            match(':'); 

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
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:17:5: ( 'enum' )
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:17:7: 'enum'
            {
            match("enum"); 


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
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:18:5: ( 'transient' )
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:18:7: 'transient'
            {
            match("transient"); 


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
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:19:5: ( 'abstract' )
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:19:7: 'abstract'
            {
            match("abstract"); 


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
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:20:5: ( 'entity' )
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:20:7: 'entity'
            {
            match("entity"); 


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
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:21:5: ( 'constraint' )
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:21:7: 'constraint'
            {
            match("constraint"); 


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
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:22:5: ( 'uses' )
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:22:7: 'uses'
            {
            match("uses"); 


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
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:23:5: ( 'function' )
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:23:7: 'function'
            {
            match("function"); 


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
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:24:5: ( '(' )
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:24:7: '('
            {
            match('('); 

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
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:25:5: ( ')' )
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:25:7: ')'
            {
            match(')'); 

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
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:26:5: ( 'string' )
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:26:7: 'string'
            {
            match("string"); 


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
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:27:5: ( 'int' )
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:27:7: 'int'
            {
            match("int"); 


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
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:28:5: ( 'number' )
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:28:7: 'number'
            {
            match("number"); 


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
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:29:5: ( 'boolean' )
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:29:7: 'boolean'
            {
            match("boolean"); 


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
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:30:5: ( 'optional' )
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:30:7: 'optional'
            {
            match("optional"); 


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
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:31:5: ( 'required' )
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:31:7: 'required'
            {
            match("required"); 


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
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:32:5: ( 'repeated' )
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:32:7: 'repeated'
            {
            match("repeated"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T33

    // $ANTLR start RULE_ID
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:1289:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:1289:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:1289:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:1289:11: '^'
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

            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:1289:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:
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
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:1291:10: ( ( '0' .. '9' )+ )
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:1291:12: ( '0' .. '9' )+
            {
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:1291:12: ( '0' .. '9' )+
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
            	    // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:1291:13: '0' .. '9'
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
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:1293:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:1293:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:1293:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    new NoViableAltException("1293:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:1293:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:1293:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:1293:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:1293:62: ~ ( ( '\\\\' | '\"' ) )
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
                    // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:1293:82: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:1293:87: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:1293:88: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:1293:129: ~ ( ( '\\\\' | '\\'' ) )
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
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:1295:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:1295:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:1295:24: ( options {greedy=false; } : . )*
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
            	    // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:1295:52: .
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
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:1297:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:1297:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:1297:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFE')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:1297:24: ~ ( ( '\\n' | '\\r' ) )
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

            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:1297:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:1297:41: ( '\\r' )? '\\n'
                    {
                    // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:1297:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:1297:41: '\\r'
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
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:1299:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:1299:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:1299:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            	    // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:
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
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:1301:16: ( . )
            // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:1301:18: .
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
        // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:1:8: ( T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=30;
        int LA12_0 = input.LA(1);

        if ( (LA12_0=='p') ) {
            int LA12_1 = input.LA(2);

            if ( (LA12_1=='r') ) {
                int LA12_29 = input.LA(3);

                if ( (LA12_29=='i') ) {
                    int LA12_56 = input.LA(4);

                    if ( (LA12_56=='m') ) {
                        int LA12_73 = input.LA(5);

                        if ( (LA12_73=='i') ) {
                            int LA12_90 = input.LA(6);

                            if ( (LA12_90=='t') ) {
                                int LA12_106 = input.LA(7);

                                if ( (LA12_106=='i') ) {
                                    int LA12_120 = input.LA(8);

                                    if ( (LA12_120=='v') ) {
                                        int LA12_134 = input.LA(9);

                                        if ( (LA12_134=='e') ) {
                                            int LA12_145 = input.LA(10);

                                            if ( (LA12_145=='-') ) {
                                                alt12=1;
                                            }
                                            else {
                                                alt12=24;}
                                        }
                                        else {
                                            alt12=24;}
                                    }
                                    else {
                                        alt12=24;}
                                }
                                else {
                                    alt12=24;}
                            }
                            else {
                                alt12=24;}
                        }
                        else {
                            alt12=24;}
                    }
                    else {
                        alt12=24;}
                }
                else {
                    alt12=24;}
            }
            else {
                alt12=24;}
        }
        else if ( (LA12_0=='{') ) {
            alt12=2;
        }
        else if ( (LA12_0=='}') ) {
            alt12=3;
        }
        else if ( (LA12_0=='e') ) {
            switch ( input.LA(2) ) {
            case 'n':
                {
                switch ( input.LA(3) ) {
                case 't':
                    {
                    int LA12_57 = input.LA(4);

                    if ( (LA12_57=='i') ) {
                        int LA12_74 = input.LA(5);

                        if ( (LA12_74=='t') ) {
                            int LA12_91 = input.LA(6);

                            if ( (LA12_91=='y') ) {
                                int LA12_107 = input.LA(7);

                                if ( ((LA12_107>='0' && LA12_107<='9')||(LA12_107>='A' && LA12_107<='Z')||LA12_107=='_'||(LA12_107>='a' && LA12_107<='z')) ) {
                                    alt12=24;
                                }
                                else {
                                    alt12=11;}
                            }
                            else {
                                alt12=24;}
                        }
                        else {
                            alt12=24;}
                    }
                    else {
                        alt12=24;}
                    }
                    break;
                case 'u':
                    {
                    int LA12_58 = input.LA(4);

                    if ( (LA12_58=='m') ) {
                        int LA12_75 = input.LA(5);

                        if ( ((LA12_75>='0' && LA12_75<='9')||(LA12_75>='A' && LA12_75<='Z')||LA12_75=='_'||(LA12_75>='a' && LA12_75<='z')) ) {
                            alt12=24;
                        }
                        else {
                            alt12=8;}
                    }
                    else {
                        alt12=24;}
                    }
                    break;
                default:
                    alt12=24;}

                }
                break;
            case 'x':
                {
                int LA12_34 = input.LA(3);

                if ( (LA12_34=='t') ) {
                    int LA12_59 = input.LA(4);

                    if ( (LA12_59=='e') ) {
                        int LA12_76 = input.LA(5);

                        if ( (LA12_76=='n') ) {
                            int LA12_93 = input.LA(6);

                            if ( (LA12_93=='d') ) {
                                int LA12_108 = input.LA(7);

                                if ( (LA12_108=='s') ) {
                                    int LA12_122 = input.LA(8);

                                    if ( ((LA12_122>='0' && LA12_122<='9')||(LA12_122>='A' && LA12_122<='Z')||LA12_122=='_'||(LA12_122>='a' && LA12_122<='z')) ) {
                                        alt12=24;
                                    }
                                    else {
                                        alt12=4;}
                                }
                                else {
                                    alt12=24;}
                            }
                            else {
                                alt12=24;}
                        }
                        else {
                            alt12=24;}
                    }
                    else {
                        alt12=24;}
                }
                else {
                    alt12=24;}
                }
                break;
            default:
                alt12=24;}

        }
        else if ( (LA12_0=='-') ) {
            int LA12_5 = input.LA(2);

            if ( (LA12_5=='>') ) {
                alt12=5;
            }
            else {
                alt12=30;}
        }
        else if ( (LA12_0=='d') ) {
            int LA12_6 = input.LA(2);

            if ( (LA12_6=='a') ) {
                int LA12_36 = input.LA(3);

                if ( (LA12_36=='t') ) {
                    int LA12_60 = input.LA(4);

                    if ( (LA12_60=='a') ) {
                        int LA12_77 = input.LA(5);

                        if ( (LA12_77=='t') ) {
                            int LA12_94 = input.LA(6);

                            if ( (LA12_94=='y') ) {
                                int LA12_109 = input.LA(7);

                                if ( (LA12_109=='p') ) {
                                    int LA12_123 = input.LA(8);

                                    if ( (LA12_123=='e') ) {
                                        int LA12_136 = input.LA(9);

                                        if ( ((LA12_136>='0' && LA12_136<='9')||(LA12_136>='A' && LA12_136<='Z')||LA12_136=='_'||(LA12_136>='a' && LA12_136<='z')) ) {
                                            alt12=24;
                                        }
                                        else {
                                            alt12=6;}
                                    }
                                    else {
                                        alt12=24;}
                                }
                                else {
                                    alt12=24;}
                            }
                            else {
                                alt12=24;}
                        }
                        else {
                            alt12=24;}
                    }
                    else {
                        alt12=24;}
                }
                else {
                    alt12=24;}
            }
            else {
                alt12=24;}
        }
        else if ( (LA12_0==':') ) {
            alt12=7;
        }
        else if ( (LA12_0=='t') ) {
            int LA12_8 = input.LA(2);

            if ( (LA12_8=='r') ) {
                int LA12_38 = input.LA(3);

                if ( (LA12_38=='a') ) {
                    int LA12_61 = input.LA(4);

                    if ( (LA12_61=='n') ) {
                        int LA12_78 = input.LA(5);

                        if ( (LA12_78=='s') ) {
                            int LA12_95 = input.LA(6);

                            if ( (LA12_95=='i') ) {
                                int LA12_110 = input.LA(7);

                                if ( (LA12_110=='e') ) {
                                    int LA12_124 = input.LA(8);

                                    if ( (LA12_124=='n') ) {
                                        int LA12_137 = input.LA(9);

                                        if ( (LA12_137=='t') ) {
                                            int LA12_147 = input.LA(10);

                                            if ( ((LA12_147>='0' && LA12_147<='9')||(LA12_147>='A' && LA12_147<='Z')||LA12_147=='_'||(LA12_147>='a' && LA12_147<='z')) ) {
                                                alt12=24;
                                            }
                                            else {
                                                alt12=9;}
                                        }
                                        else {
                                            alt12=24;}
                                    }
                                    else {
                                        alt12=24;}
                                }
                                else {
                                    alt12=24;}
                            }
                            else {
                                alt12=24;}
                        }
                        else {
                            alt12=24;}
                    }
                    else {
                        alt12=24;}
                }
                else {
                    alt12=24;}
            }
            else {
                alt12=24;}
        }
        else if ( (LA12_0=='a') ) {
            int LA12_9 = input.LA(2);

            if ( (LA12_9=='b') ) {
                int LA12_39 = input.LA(3);

                if ( (LA12_39=='s') ) {
                    int LA12_62 = input.LA(4);

                    if ( (LA12_62=='t') ) {
                        int LA12_79 = input.LA(5);

                        if ( (LA12_79=='r') ) {
                            int LA12_96 = input.LA(6);

                            if ( (LA12_96=='a') ) {
                                int LA12_111 = input.LA(7);

                                if ( (LA12_111=='c') ) {
                                    int LA12_125 = input.LA(8);

                                    if ( (LA12_125=='t') ) {
                                        int LA12_138 = input.LA(9);

                                        if ( ((LA12_138>='0' && LA12_138<='9')||(LA12_138>='A' && LA12_138<='Z')||LA12_138=='_'||(LA12_138>='a' && LA12_138<='z')) ) {
                                            alt12=24;
                                        }
                                        else {
                                            alt12=10;}
                                    }
                                    else {
                                        alt12=24;}
                                }
                                else {
                                    alt12=24;}
                            }
                            else {
                                alt12=24;}
                        }
                        else {
                            alt12=24;}
                    }
                    else {
                        alt12=24;}
                }
                else {
                    alt12=24;}
            }
            else {
                alt12=24;}
        }
        else if ( (LA12_0=='c') ) {
            int LA12_10 = input.LA(2);

            if ( (LA12_10=='o') ) {
                int LA12_40 = input.LA(3);

                if ( (LA12_40=='n') ) {
                    int LA12_63 = input.LA(4);

                    if ( (LA12_63=='s') ) {
                        int LA12_80 = input.LA(5);

                        if ( (LA12_80=='t') ) {
                            int LA12_97 = input.LA(6);

                            if ( (LA12_97=='r') ) {
                                int LA12_112 = input.LA(7);

                                if ( (LA12_112=='a') ) {
                                    int LA12_126 = input.LA(8);

                                    if ( (LA12_126=='i') ) {
                                        int LA12_139 = input.LA(9);

                                        if ( (LA12_139=='n') ) {
                                            int LA12_149 = input.LA(10);

                                            if ( (LA12_149=='t') ) {
                                                int LA12_156 = input.LA(11);

                                                if ( ((LA12_156>='0' && LA12_156<='9')||(LA12_156>='A' && LA12_156<='Z')||LA12_156=='_'||(LA12_156>='a' && LA12_156<='z')) ) {
                                                    alt12=24;
                                                }
                                                else {
                                                    alt12=12;}
                                            }
                                            else {
                                                alt12=24;}
                                        }
                                        else {
                                            alt12=24;}
                                    }
                                    else {
                                        alt12=24;}
                                }
                                else {
                                    alt12=24;}
                            }
                            else {
                                alt12=24;}
                        }
                        else {
                            alt12=24;}
                    }
                    else {
                        alt12=24;}
                }
                else {
                    alt12=24;}
            }
            else {
                alt12=24;}
        }
        else if ( (LA12_0=='u') ) {
            int LA12_11 = input.LA(2);

            if ( (LA12_11=='s') ) {
                int LA12_41 = input.LA(3);

                if ( (LA12_41=='e') ) {
                    int LA12_64 = input.LA(4);

                    if ( (LA12_64=='s') ) {
                        int LA12_81 = input.LA(5);

                        if ( ((LA12_81>='0' && LA12_81<='9')||(LA12_81>='A' && LA12_81<='Z')||LA12_81=='_'||(LA12_81>='a' && LA12_81<='z')) ) {
                            alt12=24;
                        }
                        else {
                            alt12=13;}
                    }
                    else {
                        alt12=24;}
                }
                else {
                    alt12=24;}
            }
            else {
                alt12=24;}
        }
        else if ( (LA12_0=='f') ) {
            int LA12_12 = input.LA(2);

            if ( (LA12_12=='u') ) {
                int LA12_42 = input.LA(3);

                if ( (LA12_42=='n') ) {
                    int LA12_65 = input.LA(4);

                    if ( (LA12_65=='c') ) {
                        int LA12_82 = input.LA(5);

                        if ( (LA12_82=='t') ) {
                            int LA12_99 = input.LA(6);

                            if ( (LA12_99=='i') ) {
                                int LA12_113 = input.LA(7);

                                if ( (LA12_113=='o') ) {
                                    int LA12_127 = input.LA(8);

                                    if ( (LA12_127=='n') ) {
                                        int LA12_140 = input.LA(9);

                                        if ( ((LA12_140>='0' && LA12_140<='9')||(LA12_140>='A' && LA12_140<='Z')||LA12_140=='_'||(LA12_140>='a' && LA12_140<='z')) ) {
                                            alt12=24;
                                        }
                                        else {
                                            alt12=14;}
                                    }
                                    else {
                                        alt12=24;}
                                }
                                else {
                                    alt12=24;}
                            }
                            else {
                                alt12=24;}
                        }
                        else {
                            alt12=24;}
                    }
                    else {
                        alt12=24;}
                }
                else {
                    alt12=24;}
            }
            else {
                alt12=24;}
        }
        else if ( (LA12_0=='(') ) {
            alt12=15;
        }
        else if ( (LA12_0==')') ) {
            alt12=16;
        }
        else if ( (LA12_0=='s') ) {
            int LA12_15 = input.LA(2);

            if ( (LA12_15=='t') ) {
                int LA12_45 = input.LA(3);

                if ( (LA12_45=='r') ) {
                    int LA12_66 = input.LA(4);

                    if ( (LA12_66=='i') ) {
                        int LA12_83 = input.LA(5);

                        if ( (LA12_83=='n') ) {
                            int LA12_100 = input.LA(6);

                            if ( (LA12_100=='g') ) {
                                int LA12_114 = input.LA(7);

                                if ( ((LA12_114>='0' && LA12_114<='9')||(LA12_114>='A' && LA12_114<='Z')||LA12_114=='_'||(LA12_114>='a' && LA12_114<='z')) ) {
                                    alt12=24;
                                }
                                else {
                                    alt12=17;}
                            }
                            else {
                                alt12=24;}
                        }
                        else {
                            alt12=24;}
                    }
                    else {
                        alt12=24;}
                }
                else {
                    alt12=24;}
            }
            else {
                alt12=24;}
        }
        else if ( (LA12_0=='i') ) {
            int LA12_16 = input.LA(2);

            if ( (LA12_16=='n') ) {
                int LA12_46 = input.LA(3);

                if ( (LA12_46=='t') ) {
                    int LA12_67 = input.LA(4);

                    if ( ((LA12_67>='0' && LA12_67<='9')||(LA12_67>='A' && LA12_67<='Z')||LA12_67=='_'||(LA12_67>='a' && LA12_67<='z')) ) {
                        alt12=24;
                    }
                    else {
                        alt12=18;}
                }
                else {
                    alt12=24;}
            }
            else {
                alt12=24;}
        }
        else if ( (LA12_0=='n') ) {
            int LA12_17 = input.LA(2);

            if ( (LA12_17=='u') ) {
                int LA12_47 = input.LA(3);

                if ( (LA12_47=='m') ) {
                    int LA12_68 = input.LA(4);

                    if ( (LA12_68=='b') ) {
                        int LA12_85 = input.LA(5);

                        if ( (LA12_85=='e') ) {
                            int LA12_101 = input.LA(6);

                            if ( (LA12_101=='r') ) {
                                int LA12_115 = input.LA(7);

                                if ( ((LA12_115>='0' && LA12_115<='9')||(LA12_115>='A' && LA12_115<='Z')||LA12_115=='_'||(LA12_115>='a' && LA12_115<='z')) ) {
                                    alt12=24;
                                }
                                else {
                                    alt12=19;}
                            }
                            else {
                                alt12=24;}
                        }
                        else {
                            alt12=24;}
                    }
                    else {
                        alt12=24;}
                }
                else {
                    alt12=24;}
            }
            else {
                alt12=24;}
        }
        else if ( (LA12_0=='b') ) {
            int LA12_18 = input.LA(2);

            if ( (LA12_18=='o') ) {
                int LA12_48 = input.LA(3);

                if ( (LA12_48=='o') ) {
                    int LA12_69 = input.LA(4);

                    if ( (LA12_69=='l') ) {
                        int LA12_86 = input.LA(5);

                        if ( (LA12_86=='e') ) {
                            int LA12_102 = input.LA(6);

                            if ( (LA12_102=='a') ) {
                                int LA12_116 = input.LA(7);

                                if ( (LA12_116=='n') ) {
                                    int LA12_130 = input.LA(8);

                                    if ( ((LA12_130>='0' && LA12_130<='9')||(LA12_130>='A' && LA12_130<='Z')||LA12_130=='_'||(LA12_130>='a' && LA12_130<='z')) ) {
                                        alt12=24;
                                    }
                                    else {
                                        alt12=20;}
                                }
                                else {
                                    alt12=24;}
                            }
                            else {
                                alt12=24;}
                        }
                        else {
                            alt12=24;}
                    }
                    else {
                        alt12=24;}
                }
                else {
                    alt12=24;}
            }
            else {
                alt12=24;}
        }
        else if ( (LA12_0=='o') ) {
            int LA12_19 = input.LA(2);

            if ( (LA12_19=='p') ) {
                int LA12_49 = input.LA(3);

                if ( (LA12_49=='t') ) {
                    int LA12_70 = input.LA(4);

                    if ( (LA12_70=='i') ) {
                        int LA12_87 = input.LA(5);

                        if ( (LA12_87=='o') ) {
                            int LA12_103 = input.LA(6);

                            if ( (LA12_103=='n') ) {
                                int LA12_117 = input.LA(7);

                                if ( (LA12_117=='a') ) {
                                    int LA12_131 = input.LA(8);

                                    if ( (LA12_131=='l') ) {
                                        int LA12_142 = input.LA(9);

                                        if ( ((LA12_142>='0' && LA12_142<='9')||(LA12_142>='A' && LA12_142<='Z')||LA12_142=='_'||(LA12_142>='a' && LA12_142<='z')) ) {
                                            alt12=24;
                                        }
                                        else {
                                            alt12=21;}
                                    }
                                    else {
                                        alt12=24;}
                                }
                                else {
                                    alt12=24;}
                            }
                            else {
                                alt12=24;}
                        }
                        else {
                            alt12=24;}
                    }
                    else {
                        alt12=24;}
                }
                else {
                    alt12=24;}
            }
            else {
                alt12=24;}
        }
        else if ( (LA12_0=='r') ) {
            int LA12_20 = input.LA(2);

            if ( (LA12_20=='e') ) {
                switch ( input.LA(3) ) {
                case 'p':
                    {
                    int LA12_71 = input.LA(4);

                    if ( (LA12_71=='e') ) {
                        int LA12_88 = input.LA(5);

                        if ( (LA12_88=='a') ) {
                            int LA12_104 = input.LA(6);

                            if ( (LA12_104=='t') ) {
                                int LA12_118 = input.LA(7);

                                if ( (LA12_118=='e') ) {
                                    int LA12_132 = input.LA(8);

                                    if ( (LA12_132=='d') ) {
                                        int LA12_143 = input.LA(9);

                                        if ( ((LA12_143>='0' && LA12_143<='9')||(LA12_143>='A' && LA12_143<='Z')||LA12_143=='_'||(LA12_143>='a' && LA12_143<='z')) ) {
                                            alt12=24;
                                        }
                                        else {
                                            alt12=23;}
                                    }
                                    else {
                                        alt12=24;}
                                }
                                else {
                                    alt12=24;}
                            }
                            else {
                                alt12=24;}
                        }
                        else {
                            alt12=24;}
                    }
                    else {
                        alt12=24;}
                    }
                    break;
                case 'q':
                    {
                    int LA12_72 = input.LA(4);

                    if ( (LA12_72=='u') ) {
                        int LA12_89 = input.LA(5);

                        if ( (LA12_89=='i') ) {
                            int LA12_105 = input.LA(6);

                            if ( (LA12_105=='r') ) {
                                int LA12_119 = input.LA(7);

                                if ( (LA12_119=='e') ) {
                                    int LA12_133 = input.LA(8);

                                    if ( (LA12_133=='d') ) {
                                        int LA12_144 = input.LA(9);

                                        if ( ((LA12_144>='0' && LA12_144<='9')||(LA12_144>='A' && LA12_144<='Z')||LA12_144=='_'||(LA12_144>='a' && LA12_144<='z')) ) {
                                            alt12=24;
                                        }
                                        else {
                                            alt12=22;}
                                    }
                                    else {
                                        alt12=24;}
                                }
                                else {
                                    alt12=24;}
                            }
                            else {
                                alt12=24;}
                        }
                        else {
                            alt12=24;}
                    }
                    else {
                        alt12=24;}
                    }
                    break;
                default:
                    alt12=24;}

            }
            else {
                alt12=24;}
        }
        else if ( (LA12_0=='^') ) {
            int LA12_21 = input.LA(2);

            if ( ((LA12_21>='A' && LA12_21<='Z')||LA12_21=='_'||(LA12_21>='a' && LA12_21<='z')) ) {
                alt12=24;
            }
            else {
                alt12=30;}
        }
        else if ( ((LA12_0>='A' && LA12_0<='Z')||LA12_0=='_'||(LA12_0>='g' && LA12_0<='h')||(LA12_0>='j' && LA12_0<='m')||LA12_0=='q'||(LA12_0>='v' && LA12_0<='z')) ) {
            alt12=24;
        }
        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {
            alt12=25;
        }
        else if ( (LA12_0=='\"') ) {
            int LA12_24 = input.LA(2);

            if ( ((LA12_24>='\u0000' && LA12_24<='\uFFFE')) ) {
                alt12=26;
            }
            else {
                alt12=30;}
        }
        else if ( (LA12_0=='\'') ) {
            int LA12_25 = input.LA(2);

            if ( ((LA12_25>='\u0000' && LA12_25<='\uFFFE')) ) {
                alt12=26;
            }
            else {
                alt12=30;}
        }
        else if ( (LA12_0=='/') ) {
            switch ( input.LA(2) ) {
            case '/':
                {
                alt12=28;
                }
                break;
            case '*':
                {
                alt12=27;
                }
                break;
            default:
                alt12=30;}

        }
        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {
            alt12=29;
        }
        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='#' && LA12_0<='&')||(LA12_0>='*' && LA12_0<=',')||LA12_0=='.'||(LA12_0>=';' && LA12_0<='@')||(LA12_0>='[' && LA12_0<=']')||LA12_0=='`'||LA12_0=='|'||(LA12_0>='~' && LA12_0<='\uFFFE')) ) {
            alt12=30;
        }
        else {
            NoViableAltException nvae =
                new NoViableAltException("1:1: Tokens : ( T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );", 12, 0, input);

            throw nvae;
        }
        switch (alt12) {
            case 1 :
                // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:1:10: T11
                {
                mT11(); 

                }
                break;
            case 2 :
                // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:1:14: T12
                {
                mT12(); 

                }
                break;
            case 3 :
                // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:1:18: T13
                {
                mT13(); 

                }
                break;
            case 4 :
                // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:1:22: T14
                {
                mT14(); 

                }
                break;
            case 5 :
                // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:1:26: T15
                {
                mT15(); 

                }
                break;
            case 6 :
                // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:1:30: T16
                {
                mT16(); 

                }
                break;
            case 7 :
                // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:1:34: T17
                {
                mT17(); 

                }
                break;
            case 8 :
                // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:1:38: T18
                {
                mT18(); 

                }
                break;
            case 9 :
                // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:1:42: T19
                {
                mT19(); 

                }
                break;
            case 10 :
                // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:1:46: T20
                {
                mT20(); 

                }
                break;
            case 11 :
                // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:1:50: T21
                {
                mT21(); 

                }
                break;
            case 12 :
                // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:1:54: T22
                {
                mT22(); 

                }
                break;
            case 13 :
                // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:1:58: T23
                {
                mT23(); 

                }
                break;
            case 14 :
                // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:1:62: T24
                {
                mT24(); 

                }
                break;
            case 15 :
                // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:1:66: T25
                {
                mT25(); 

                }
                break;
            case 16 :
                // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:1:70: T26
                {
                mT26(); 

                }
                break;
            case 17 :
                // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:1:74: T27
                {
                mT27(); 

                }
                break;
            case 18 :
                // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:1:78: T28
                {
                mT28(); 

                }
                break;
            case 19 :
                // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:1:82: T29
                {
                mT29(); 

                }
                break;
            case 20 :
                // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:1:86: T30
                {
                mT30(); 

                }
                break;
            case 21 :
                // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:1:90: T31
                {
                mT31(); 

                }
                break;
            case 22 :
                // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:1:94: T32
                {
                mT32(); 

                }
                break;
            case 23 :
                // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:1:98: T33
                {
                mT33(); 

                }
                break;
            case 24 :
                // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:1:102: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 25 :
                // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:1:110: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 26 :
                // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:1:119: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 27 :
                // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:1:131: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 28 :
                // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:1:147: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 29 :
                // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:1:163: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 30 :
                // ../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g:1:171: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


 

}