package nl.dslmeinte.xtext.examples.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDynamicScreenDslLexer extends Lexer {
    public static final int RULE_ID=4;
    public static final int RULE_ANY_OTHER=10;
    public static final int T29=29;
    public static final int T28=28;
    public static final int T27=27;
    public static final int T26=26;
    public static final int T25=25;
    public static final int EOF=-1;
    public static final int T24=24;
    public static final int T23=23;
    public static final int T22=22;
    public static final int T21=21;
    public static final int T20=20;
    public static final int RULE_INT=6;
    public static final int T38=38;
    public static final int T37=37;
    public static final int T39=39;
    public static final int T34=34;
    public static final int T33=33;
    public static final int T36=36;
    public static final int T35=35;
    public static final int T30=30;
    public static final int T32=32;
    public static final int T31=31;
    public static final int T49=49;
    public static final int T48=48;
    public static final int T43=43;
    public static final int Tokens=52;
    public static final int RULE_SL_COMMENT=8;
    public static final int T42=42;
    public static final int T41=41;
    public static final int T40=40;
    public static final int T47=47;
    public static final int T46=46;
    public static final int T45=45;
    public static final int RULE_ML_COMMENT=7;
    public static final int T44=44;
    public static final int RULE_STRING=5;
    public static final int T50=50;
    public static final int T11=11;
    public static final int T12=12;
    public static final int T13=13;
    public static final int T14=14;
    public static final int T15=15;
    public static final int RULE_WS=9;
    public static final int T51=51;
    public static final int T16=16;
    public static final int T17=17;
    public static final int T18=18;
    public static final int T19=19;
    public InternalDynamicScreenDslLexer() {;} 
    public InternalDynamicScreenDslLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g"; }

    // $ANTLR start T11
    public final void mT11() throws RecognitionException {
        try {
            int _type = T11;
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:10:5: ( 'display' )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:10:7: 'display'
            {
            match("display"); 


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
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:11:5: ( 'required' )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:11:7: 'required'
            {
            match("required"); 


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
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:12:5: ( 'readonly' )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:12:7: 'readonly'
            {
            match("readonly"); 


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
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:13:5: ( 'calculated' )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:13:7: 'calculated'
            {
            match("calculated"); 


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
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:14:5: ( 'doubleAsterisk' )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:14:7: 'doubleAsterisk'
            {
            match("doubleAsterisk"); 


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
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:15:5: ( 'true' )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:15:7: 'true'
            {
            match("true"); 


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
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:16:5: ( 'false' )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:16:7: 'false'
            {
            match("false"); 


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
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:17:5: ( 'is-one-of' )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:17:7: 'is-one-of'
            {
            match("is-one-of"); 


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
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:18:5: ( 'is-not-one-of' )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:18:7: 'is-not-one-of'
            {
            match("is-not-one-of"); 


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
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:19:5: ( 'dynamic-screen' )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:19:7: 'dynamic-screen'
            {
            match("dynamic-screen"); 


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
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:20:5: ( 'view-class' )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:20:7: 'view-class'
            {
            match("view-class"); 


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
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:21:5: ( '=' )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:21:7: '='
            {
            match('='); 

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
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:22:5: ( 'data-import' )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:22:7: 'data-import'
            {
            match("data-import"); 


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
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:23:5: ( '[nl:' )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:23:7: '[nl:'
            {
            match("[nl:"); 


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
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:24:5: ( ']' )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:24:7: ']'
            {
            match(']'); 

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
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:25:5: ( '/' )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:25:7: '/'
            {
            match('/'); 

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
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:26:5: ( '(' )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:26:7: '('
            {
            match('('); 

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
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:27:5: ( ')' )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:27:7: ')'
            {
            match(')'); 

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
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:28:5: ( 'external-var' )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:28:7: 'external-var'
            {
            match("external-var"); 


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
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:29:5: ( 'as' )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:29:7: 'as'
            {
            match("as"); 


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
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:30:5: ( 'define' )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:30:7: 'define'
            {
            match("define"); 


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
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:31:5: ( 'of' )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:31:7: 'of'
            {
            match("of"); 


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
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:32:5: ( 'data-store' )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:32:7: 'data-store'
            {
            match("data-store"); 


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
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:33:5: ( 'of-type' )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:33:7: 'of-type'
            {
            match("of-type"); 


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
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:34:5: ( 'group' )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:34:7: 'group'
            {
            match("group"); 


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
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:35:5: ( '{' )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:35:7: '{'
            {
            match('{'); 

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
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:36:5: ( '}' )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:36:7: '}'
            {
            match('}'); 

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
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:37:5: ( 'with' )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:37:7: 'with'
            {
            match("with"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T38

    // $ANTLR start T39
    public final void mT39() throws RecognitionException {
        try {
            int _type = T39;
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:38:5: ( 'if' )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:38:7: 'if'
            {
            match("if"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T39

    // $ANTLR start T40
    public final void mT40() throws RecognitionException {
        try {
            int _type = T40;
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:39:5: ( '+' )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:39:7: '+'
            {
            match('+'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T40

    // $ANTLR start T41
    public final void mT41() throws RecognitionException {
        try {
            int _type = T41;
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:40:5: ( 'restrict-to' )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:40:7: 'restrict-to'
            {
            match("restrict-to"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T41

    // $ANTLR start T42
    public final void mT42() throws RecognitionException {
        try {
            int _type = T42;
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:41:5: ( 'restrict-to-group' )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:41:7: 'restrict-to-group'
            {
            match("restrict-to-group"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T42

    // $ANTLR start T43
    public final void mT43() throws RecognitionException {
        try {
            int _type = T43;
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:42:5: ( '<' )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:42:7: '<'
            {
            match('<'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T43

    // $ANTLR start T44
    public final void mT44() throws RecognitionException {
        try {
            int _type = T44;
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:43:5: ( '>' )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:43:7: '>'
            {
            match('>'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T44

    // $ANTLR start T45
    public final void mT45() throws RecognitionException {
        try {
            int _type = T45;
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:44:5: ( 'or' )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:44:7: 'or'
            {
            match("or"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T45

    // $ANTLR start T46
    public final void mT46() throws RecognitionException {
        try {
            int _type = T46;
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:45:5: ( 'and' )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:45:7: 'and'
            {
            match("and"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T46

    // $ANTLR start T47
    public final void mT47() throws RecognitionException {
        try {
            int _type = T47;
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:46:5: ( 'not' )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:46:7: 'not'
            {
            match("not"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T47

    // $ANTLR start T48
    public final void mT48() throws RecognitionException {
        try {
            int _type = T48;
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:47:5: ( 'is' )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:47:7: 'is'
            {
            match("is"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T48

    // $ANTLR start T49
    public final void mT49() throws RecognitionException {
        try {
            int _type = T49;
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:48:5: ( 'equals' )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:48:7: 'equals'
            {
            match("equals"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T49

    // $ANTLR start T50
    public final void mT50() throws RecognitionException {
        try {
            int _type = T50;
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:49:5: ( 'is-present' )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:49:7: 'is-present'
            {
            match("is-present"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T50

    // $ANTLR start T51
    public final void mT51() throws RecognitionException {
        try {
            int _type = T51;
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:50:5: ( 'is-multi-valued' )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:50:7: 'is-multi-valued'
            {
            match("is-multi-valued"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T51

    // $ANTLR start RULE_ID
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5686:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5686:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5686:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5686:11: '^'
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

            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5686:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:
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
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5688:10: ( ( '0' .. '9' )+ )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5688:12: ( '0' .. '9' )+
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5688:12: ( '0' .. '9' )+
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
            	    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5688:13: '0' .. '9'
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
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5690:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5690:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5690:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    new NoViableAltException("5690:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5690:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5690:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5690:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5690:62: ~ ( ( '\\\\' | '\"' ) )
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
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5690:82: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5690:87: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5690:88: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5690:129: ~ ( ( '\\\\' | '\\'' ) )
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
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5692:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5692:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5692:24: ( options {greedy=false; } : . )*
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
            	    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5692:52: .
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
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5694:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5694:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5694:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFE')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5694:24: ~ ( ( '\\n' | '\\r' ) )
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

            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5694:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5694:41: ( '\\r' )? '\\n'
                    {
                    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5694:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5694:41: '\\r'
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
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5696:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5696:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5696:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            	    // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:
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
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5698:16: ( . )
            // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:5698:18: .
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
        // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1:8: ( T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | T46 | T47 | T48 | T49 | T50 | T51 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=48;
        int LA12_0 = input.LA(1);

        if ( (LA12_0=='d') ) {
            switch ( input.LA(2) ) {
            case 'i':
                {
                int LA12_32 = input.LA(3);

                if ( (LA12_32=='s') ) {
                    int LA12_70 = input.LA(4);

                    if ( (LA12_70=='p') ) {
                        int LA12_95 = input.LA(5);

                        if ( (LA12_95=='l') ) {
                            int LA12_117 = input.LA(6);

                            if ( (LA12_117=='a') ) {
                                int LA12_133 = input.LA(7);

                                if ( (LA12_133=='y') ) {
                                    int LA12_147 = input.LA(8);

                                    if ( ((LA12_147>='0' && LA12_147<='9')||(LA12_147>='A' && LA12_147<='Z')||LA12_147=='_'||(LA12_147>='a' && LA12_147<='z')) ) {
                                        alt12=42;
                                    }
                                    else {
                                        alt12=1;}
                                }
                                else {
                                    alt12=42;}
                            }
                            else {
                                alt12=42;}
                        }
                        else {
                            alt12=42;}
                    }
                    else {
                        alt12=42;}
                }
                else {
                    alt12=42;}
                }
                break;
            case 'o':
                {
                int LA12_33 = input.LA(3);

                if ( (LA12_33=='u') ) {
                    int LA12_71 = input.LA(4);

                    if ( (LA12_71=='b') ) {
                        int LA12_96 = input.LA(5);

                        if ( (LA12_96=='l') ) {
                            int LA12_118 = input.LA(6);

                            if ( (LA12_118=='e') ) {
                                int LA12_134 = input.LA(7);

                                if ( (LA12_134=='A') ) {
                                    int LA12_148 = input.LA(8);

                                    if ( (LA12_148=='s') ) {
                                        int LA12_158 = input.LA(9);

                                        if ( (LA12_158=='t') ) {
                                            int LA12_165 = input.LA(10);

                                            if ( (LA12_165=='e') ) {
                                                int LA12_171 = input.LA(11);

                                                if ( (LA12_171=='r') ) {
                                                    int LA12_174 = input.LA(12);

                                                    if ( (LA12_174=='i') ) {
                                                        int LA12_177 = input.LA(13);

                                                        if ( (LA12_177=='s') ) {
                                                            int LA12_180 = input.LA(14);

                                                            if ( (LA12_180=='k') ) {
                                                                int LA12_181 = input.LA(15);

                                                                if ( ((LA12_181>='0' && LA12_181<='9')||(LA12_181>='A' && LA12_181<='Z')||LA12_181=='_'||(LA12_181>='a' && LA12_181<='z')) ) {
                                                                    alt12=42;
                                                                }
                                                                else {
                                                                    alt12=5;}
                                                            }
                                                            else {
                                                                alt12=42;}
                                                        }
                                                        else {
                                                            alt12=42;}
                                                    }
                                                    else {
                                                        alt12=42;}
                                                }
                                                else {
                                                    alt12=42;}
                                            }
                                            else {
                                                alt12=42;}
                                        }
                                        else {
                                            alt12=42;}
                                    }
                                    else {
                                        alt12=42;}
                                }
                                else {
                                    alt12=42;}
                            }
                            else {
                                alt12=42;}
                        }
                        else {
                            alt12=42;}
                    }
                    else {
                        alt12=42;}
                }
                else {
                    alt12=42;}
                }
                break;
            case 'y':
                {
                int LA12_34 = input.LA(3);

                if ( (LA12_34=='n') ) {
                    int LA12_72 = input.LA(4);

                    if ( (LA12_72=='a') ) {
                        int LA12_97 = input.LA(5);

                        if ( (LA12_97=='m') ) {
                            int LA12_119 = input.LA(6);

                            if ( (LA12_119=='i') ) {
                                int LA12_135 = input.LA(7);

                                if ( (LA12_135=='c') ) {
                                    int LA12_149 = input.LA(8);

                                    if ( (LA12_149=='-') ) {
                                        alt12=10;
                                    }
                                    else {
                                        alt12=42;}
                                }
                                else {
                                    alt12=42;}
                            }
                            else {
                                alt12=42;}
                        }
                        else {
                            alt12=42;}
                    }
                    else {
                        alt12=42;}
                }
                else {
                    alt12=42;}
                }
                break;
            case 'a':
                {
                int LA12_35 = input.LA(3);

                if ( (LA12_35=='t') ) {
                    int LA12_73 = input.LA(4);

                    if ( (LA12_73=='a') ) {
                        int LA12_98 = input.LA(5);

                        if ( (LA12_98=='-') ) {
                            int LA12_120 = input.LA(6);

                            if ( (LA12_120=='i') ) {
                                alt12=13;
                            }
                            else if ( (LA12_120=='s') ) {
                                alt12=23;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("1:1: Tokens : ( T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | T46 | T47 | T48 | T49 | T50 | T51 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );", 12, 120, input);

                                throw nvae;
                            }
                        }
                        else {
                            alt12=42;}
                    }
                    else {
                        alt12=42;}
                }
                else {
                    alt12=42;}
                }
                break;
            case 'e':
                {
                int LA12_36 = input.LA(3);

                if ( (LA12_36=='f') ) {
                    int LA12_74 = input.LA(4);

                    if ( (LA12_74=='i') ) {
                        int LA12_99 = input.LA(5);

                        if ( (LA12_99=='n') ) {
                            int LA12_121 = input.LA(6);

                            if ( (LA12_121=='e') ) {
                                int LA12_138 = input.LA(7);

                                if ( ((LA12_138>='0' && LA12_138<='9')||(LA12_138>='A' && LA12_138<='Z')||LA12_138=='_'||(LA12_138>='a' && LA12_138<='z')) ) {
                                    alt12=42;
                                }
                                else {
                                    alt12=21;}
                            }
                            else {
                                alt12=42;}
                        }
                        else {
                            alt12=42;}
                    }
                    else {
                        alt12=42;}
                }
                else {
                    alt12=42;}
                }
                break;
            default:
                alt12=42;}

        }
        else if ( (LA12_0=='r') ) {
            int LA12_2 = input.LA(2);

            if ( (LA12_2=='e') ) {
                switch ( input.LA(3) ) {
                case 'q':
                    {
                    int LA12_75 = input.LA(4);

                    if ( (LA12_75=='u') ) {
                        int LA12_100 = input.LA(5);

                        if ( (LA12_100=='i') ) {
                            int LA12_122 = input.LA(6);

                            if ( (LA12_122=='r') ) {
                                int LA12_139 = input.LA(7);

                                if ( (LA12_139=='e') ) {
                                    int LA12_151 = input.LA(8);

                                    if ( (LA12_151=='d') ) {
                                        int LA12_160 = input.LA(9);

                                        if ( ((LA12_160>='0' && LA12_160<='9')||(LA12_160>='A' && LA12_160<='Z')||LA12_160=='_'||(LA12_160>='a' && LA12_160<='z')) ) {
                                            alt12=42;
                                        }
                                        else {
                                            alt12=2;}
                                    }
                                    else {
                                        alt12=42;}
                                }
                                else {
                                    alt12=42;}
                            }
                            else {
                                alt12=42;}
                        }
                        else {
                            alt12=42;}
                    }
                    else {
                        alt12=42;}
                    }
                    break;
                case 's':
                    {
                    int LA12_76 = input.LA(4);

                    if ( (LA12_76=='t') ) {
                        int LA12_101 = input.LA(5);

                        if ( (LA12_101=='r') ) {
                            int LA12_123 = input.LA(6);

                            if ( (LA12_123=='i') ) {
                                int LA12_140 = input.LA(7);

                                if ( (LA12_140=='c') ) {
                                    int LA12_152 = input.LA(8);

                                    if ( (LA12_152=='t') ) {
                                        int LA12_161 = input.LA(9);

                                        if ( (LA12_161=='-') ) {
                                            int LA12_167 = input.LA(10);

                                            if ( (LA12_167=='t') ) {
                                                int LA12_172 = input.LA(11);

                                                if ( (LA12_172=='o') ) {
                                                    int LA12_175 = input.LA(12);

                                                    if ( (LA12_175=='-') ) {
                                                        alt12=32;
                                                    }
                                                    else {
                                                        alt12=31;}
                                                }
                                                else {
                                                    NoViableAltException nvae =
                                                        new NoViableAltException("1:1: Tokens : ( T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | T46 | T47 | T48 | T49 | T50 | T51 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );", 12, 172, input);

                                                    throw nvae;
                                                }
                                            }
                                            else {
                                                NoViableAltException nvae =
                                                    new NoViableAltException("1:1: Tokens : ( T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | T46 | T47 | T48 | T49 | T50 | T51 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );", 12, 167, input);

                                                throw nvae;
                                            }
                                        }
                                        else {
                                            alt12=42;}
                                    }
                                    else {
                                        alt12=42;}
                                }
                                else {
                                    alt12=42;}
                            }
                            else {
                                alt12=42;}
                        }
                        else {
                            alt12=42;}
                    }
                    else {
                        alt12=42;}
                    }
                    break;
                case 'a':
                    {
                    int LA12_77 = input.LA(4);

                    if ( (LA12_77=='d') ) {
                        int LA12_102 = input.LA(5);

                        if ( (LA12_102=='o') ) {
                            int LA12_124 = input.LA(6);

                            if ( (LA12_124=='n') ) {
                                int LA12_141 = input.LA(7);

                                if ( (LA12_141=='l') ) {
                                    int LA12_153 = input.LA(8);

                                    if ( (LA12_153=='y') ) {
                                        int LA12_162 = input.LA(9);

                                        if ( ((LA12_162>='0' && LA12_162<='9')||(LA12_162>='A' && LA12_162<='Z')||LA12_162=='_'||(LA12_162>='a' && LA12_162<='z')) ) {
                                            alt12=42;
                                        }
                                        else {
                                            alt12=3;}
                                    }
                                    else {
                                        alt12=42;}
                                }
                                else {
                                    alt12=42;}
                            }
                            else {
                                alt12=42;}
                        }
                        else {
                            alt12=42;}
                    }
                    else {
                        alt12=42;}
                    }
                    break;
                default:
                    alt12=42;}

            }
            else {
                alt12=42;}
        }
        else if ( (LA12_0=='c') ) {
            int LA12_3 = input.LA(2);

            if ( (LA12_3=='a') ) {
                int LA12_39 = input.LA(3);

                if ( (LA12_39=='l') ) {
                    int LA12_78 = input.LA(4);

                    if ( (LA12_78=='c') ) {
                        int LA12_103 = input.LA(5);

                        if ( (LA12_103=='u') ) {
                            int LA12_125 = input.LA(6);

                            if ( (LA12_125=='l') ) {
                                int LA12_142 = input.LA(7);

                                if ( (LA12_142=='a') ) {
                                    int LA12_154 = input.LA(8);

                                    if ( (LA12_154=='t') ) {
                                        int LA12_163 = input.LA(9);

                                        if ( (LA12_163=='e') ) {
                                            int LA12_169 = input.LA(10);

                                            if ( (LA12_169=='d') ) {
                                                int LA12_173 = input.LA(11);

                                                if ( ((LA12_173>='0' && LA12_173<='9')||(LA12_173>='A' && LA12_173<='Z')||LA12_173=='_'||(LA12_173>='a' && LA12_173<='z')) ) {
                                                    alt12=42;
                                                }
                                                else {
                                                    alt12=4;}
                                            }
                                            else {
                                                alt12=42;}
                                        }
                                        else {
                                            alt12=42;}
                                    }
                                    else {
                                        alt12=42;}
                                }
                                else {
                                    alt12=42;}
                            }
                            else {
                                alt12=42;}
                        }
                        else {
                            alt12=42;}
                    }
                    else {
                        alt12=42;}
                }
                else {
                    alt12=42;}
            }
            else {
                alt12=42;}
        }
        else if ( (LA12_0=='t') ) {
            int LA12_4 = input.LA(2);

            if ( (LA12_4=='r') ) {
                int LA12_40 = input.LA(3);

                if ( (LA12_40=='u') ) {
                    int LA12_79 = input.LA(4);

                    if ( (LA12_79=='e') ) {
                        int LA12_104 = input.LA(5);

                        if ( ((LA12_104>='0' && LA12_104<='9')||(LA12_104>='A' && LA12_104<='Z')||LA12_104=='_'||(LA12_104>='a' && LA12_104<='z')) ) {
                            alt12=42;
                        }
                        else {
                            alt12=6;}
                    }
                    else {
                        alt12=42;}
                }
                else {
                    alt12=42;}
            }
            else {
                alt12=42;}
        }
        else if ( (LA12_0=='f') ) {
            int LA12_5 = input.LA(2);

            if ( (LA12_5=='a') ) {
                int LA12_41 = input.LA(3);

                if ( (LA12_41=='l') ) {
                    int LA12_80 = input.LA(4);

                    if ( (LA12_80=='s') ) {
                        int LA12_105 = input.LA(5);

                        if ( (LA12_105=='e') ) {
                            int LA12_127 = input.LA(6);

                            if ( ((LA12_127>='0' && LA12_127<='9')||(LA12_127>='A' && LA12_127<='Z')||LA12_127=='_'||(LA12_127>='a' && LA12_127<='z')) ) {
                                alt12=42;
                            }
                            else {
                                alt12=7;}
                        }
                        else {
                            alt12=42;}
                    }
                    else {
                        alt12=42;}
                }
                else {
                    alt12=42;}
            }
            else {
                alt12=42;}
        }
        else if ( (LA12_0=='i') ) {
            switch ( input.LA(2) ) {
            case 's':
                {
                switch ( input.LA(3) ) {
                case '-':
                    {
                    switch ( input.LA(4) ) {
                    case 'm':
                        {
                        alt12=41;
                        }
                        break;
                    case 'n':
                        {
                        alt12=9;
                        }
                        break;
                    case 'o':
                        {
                        alt12=8;
                        }
                        break;
                    case 'p':
                        {
                        alt12=40;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("1:1: Tokens : ( T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | T46 | T47 | T48 | T49 | T50 | T51 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );", 12, 81, input);

                        throw nvae;
                    }

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
                    alt12=42;
                    }
                    break;
                default:
                    alt12=38;}

                }
                break;
            case 'f':
                {
                int LA12_43 = input.LA(3);

                if ( ((LA12_43>='0' && LA12_43<='9')||(LA12_43>='A' && LA12_43<='Z')||LA12_43=='_'||(LA12_43>='a' && LA12_43<='z')) ) {
                    alt12=42;
                }
                else {
                    alt12=29;}
                }
                break;
            default:
                alt12=42;}

        }
        else if ( (LA12_0=='v') ) {
            int LA12_7 = input.LA(2);

            if ( (LA12_7=='i') ) {
                int LA12_44 = input.LA(3);

                if ( (LA12_44=='e') ) {
                    int LA12_84 = input.LA(4);

                    if ( (LA12_84=='w') ) {
                        int LA12_110 = input.LA(5);

                        if ( (LA12_110=='-') ) {
                            alt12=11;
                        }
                        else {
                            alt12=42;}
                    }
                    else {
                        alt12=42;}
                }
                else {
                    alt12=42;}
            }
            else {
                alt12=42;}
        }
        else if ( (LA12_0=='=') ) {
            alt12=12;
        }
        else if ( (LA12_0=='[') ) {
            int LA12_9 = input.LA(2);

            if ( (LA12_9=='n') ) {
                alt12=14;
            }
            else {
                alt12=48;}
        }
        else if ( (LA12_0==']') ) {
            alt12=15;
        }
        else if ( (LA12_0=='/') ) {
            switch ( input.LA(2) ) {
            case '*':
                {
                alt12=45;
                }
                break;
            case '/':
                {
                alt12=46;
                }
                break;
            default:
                alt12=16;}

        }
        else if ( (LA12_0=='(') ) {
            alt12=17;
        }
        else if ( (LA12_0==')') ) {
            alt12=18;
        }
        else if ( (LA12_0=='e') ) {
            switch ( input.LA(2) ) {
            case 'q':
                {
                int LA12_53 = input.LA(3);

                if ( (LA12_53=='u') ) {
                    int LA12_85 = input.LA(4);

                    if ( (LA12_85=='a') ) {
                        int LA12_111 = input.LA(5);

                        if ( (LA12_111=='l') ) {
                            int LA12_129 = input.LA(6);

                            if ( (LA12_129=='s') ) {
                                int LA12_144 = input.LA(7);

                                if ( ((LA12_144>='0' && LA12_144<='9')||(LA12_144>='A' && LA12_144<='Z')||LA12_144=='_'||(LA12_144>='a' && LA12_144<='z')) ) {
                                    alt12=42;
                                }
                                else {
                                    alt12=39;}
                            }
                            else {
                                alt12=42;}
                        }
                        else {
                            alt12=42;}
                    }
                    else {
                        alt12=42;}
                }
                else {
                    alt12=42;}
                }
                break;
            case 'x':
                {
                int LA12_54 = input.LA(3);

                if ( (LA12_54=='t') ) {
                    int LA12_86 = input.LA(4);

                    if ( (LA12_86=='e') ) {
                        int LA12_112 = input.LA(5);

                        if ( (LA12_112=='r') ) {
                            int LA12_130 = input.LA(6);

                            if ( (LA12_130=='n') ) {
                                int LA12_145 = input.LA(7);

                                if ( (LA12_145=='a') ) {
                                    int LA12_156 = input.LA(8);

                                    if ( (LA12_156=='l') ) {
                                        int LA12_164 = input.LA(9);

                                        if ( (LA12_164=='-') ) {
                                            alt12=19;
                                        }
                                        else {
                                            alt12=42;}
                                    }
                                    else {
                                        alt12=42;}
                                }
                                else {
                                    alt12=42;}
                            }
                            else {
                                alt12=42;}
                        }
                        else {
                            alt12=42;}
                    }
                    else {
                        alt12=42;}
                }
                else {
                    alt12=42;}
                }
                break;
            default:
                alt12=42;}

        }
        else if ( (LA12_0=='a') ) {
            switch ( input.LA(2) ) {
            case 's':
                {
                int LA12_55 = input.LA(3);

                if ( ((LA12_55>='0' && LA12_55<='9')||(LA12_55>='A' && LA12_55<='Z')||LA12_55=='_'||(LA12_55>='a' && LA12_55<='z')) ) {
                    alt12=42;
                }
                else {
                    alt12=20;}
                }
                break;
            case 'n':
                {
                int LA12_56 = input.LA(3);

                if ( (LA12_56=='d') ) {
                    int LA12_88 = input.LA(4);

                    if ( ((LA12_88>='0' && LA12_88<='9')||(LA12_88>='A' && LA12_88<='Z')||LA12_88=='_'||(LA12_88>='a' && LA12_88<='z')) ) {
                        alt12=42;
                    }
                    else {
                        alt12=36;}
                }
                else {
                    alt12=42;}
                }
                break;
            default:
                alt12=42;}

        }
        else if ( (LA12_0=='o') ) {
            switch ( input.LA(2) ) {
            case 'f':
                {
                switch ( input.LA(3) ) {
                case '-':
                    {
                    alt12=24;
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
                    alt12=42;
                    }
                    break;
                default:
                    alt12=22;}

                }
                break;
            case 'r':
                {
                int LA12_58 = input.LA(3);

                if ( ((LA12_58>='0' && LA12_58<='9')||(LA12_58>='A' && LA12_58<='Z')||LA12_58=='_'||(LA12_58>='a' && LA12_58<='z')) ) {
                    alt12=42;
                }
                else {
                    alt12=35;}
                }
                break;
            default:
                alt12=42;}

        }
        else if ( (LA12_0=='g') ) {
            int LA12_17 = input.LA(2);

            if ( (LA12_17=='r') ) {
                int LA12_59 = input.LA(3);

                if ( (LA12_59=='o') ) {
                    int LA12_92 = input.LA(4);

                    if ( (LA12_92=='u') ) {
                        int LA12_114 = input.LA(5);

                        if ( (LA12_114=='p') ) {
                            int LA12_131 = input.LA(6);

                            if ( ((LA12_131>='0' && LA12_131<='9')||(LA12_131>='A' && LA12_131<='Z')||LA12_131=='_'||(LA12_131>='a' && LA12_131<='z')) ) {
                                alt12=42;
                            }
                            else {
                                alt12=25;}
                        }
                        else {
                            alt12=42;}
                    }
                    else {
                        alt12=42;}
                }
                else {
                    alt12=42;}
            }
            else {
                alt12=42;}
        }
        else if ( (LA12_0=='{') ) {
            alt12=26;
        }
        else if ( (LA12_0=='}') ) {
            alt12=27;
        }
        else if ( (LA12_0=='w') ) {
            int LA12_20 = input.LA(2);

            if ( (LA12_20=='i') ) {
                int LA12_62 = input.LA(3);

                if ( (LA12_62=='t') ) {
                    int LA12_93 = input.LA(4);

                    if ( (LA12_93=='h') ) {
                        int LA12_115 = input.LA(5);

                        if ( ((LA12_115>='0' && LA12_115<='9')||(LA12_115>='A' && LA12_115<='Z')||LA12_115=='_'||(LA12_115>='a' && LA12_115<='z')) ) {
                            alt12=42;
                        }
                        else {
                            alt12=28;}
                    }
                    else {
                        alt12=42;}
                }
                else {
                    alt12=42;}
            }
            else {
                alt12=42;}
        }
        else if ( (LA12_0=='+') ) {
            alt12=30;
        }
        else if ( (LA12_0=='<') ) {
            alt12=33;
        }
        else if ( (LA12_0=='>') ) {
            alt12=34;
        }
        else if ( (LA12_0=='n') ) {
            int LA12_24 = input.LA(2);

            if ( (LA12_24=='o') ) {
                int LA12_66 = input.LA(3);

                if ( (LA12_66=='t') ) {
                    int LA12_94 = input.LA(4);

                    if ( ((LA12_94>='0' && LA12_94<='9')||(LA12_94>='A' && LA12_94<='Z')||LA12_94=='_'||(LA12_94>='a' && LA12_94<='z')) ) {
                        alt12=42;
                    }
                    else {
                        alt12=37;}
                }
                else {
                    alt12=42;}
            }
            else {
                alt12=42;}
        }
        else if ( (LA12_0=='^') ) {
            int LA12_25 = input.LA(2);

            if ( ((LA12_25>='A' && LA12_25<='Z')||LA12_25=='_'||(LA12_25>='a' && LA12_25<='z')) ) {
                alt12=42;
            }
            else {
                alt12=48;}
        }
        else if ( ((LA12_0>='A' && LA12_0<='Z')||LA12_0=='_'||LA12_0=='b'||LA12_0=='h'||(LA12_0>='j' && LA12_0<='m')||(LA12_0>='p' && LA12_0<='q')||LA12_0=='s'||LA12_0=='u'||(LA12_0>='x' && LA12_0<='z')) ) {
            alt12=42;
        }
        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {
            alt12=43;
        }
        else if ( (LA12_0=='\"') ) {
            int LA12_28 = input.LA(2);

            if ( ((LA12_28>='\u0000' && LA12_28<='\uFFFE')) ) {
                alt12=44;
            }
            else {
                alt12=48;}
        }
        else if ( (LA12_0=='\'') ) {
            int LA12_29 = input.LA(2);

            if ( ((LA12_29>='\u0000' && LA12_29<='\uFFFE')) ) {
                alt12=44;
            }
            else {
                alt12=48;}
        }
        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {
            alt12=47;
        }
        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='#' && LA12_0<='&')||LA12_0=='*'||(LA12_0>=',' && LA12_0<='.')||(LA12_0>=':' && LA12_0<=';')||(LA12_0>='?' && LA12_0<='@')||LA12_0=='\\'||LA12_0=='`'||LA12_0=='|'||(LA12_0>='~' && LA12_0<='\uFFFE')) ) {
            alt12=48;
        }
        else {
            NoViableAltException nvae =
                new NoViableAltException("1:1: Tokens : ( T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | T46 | T47 | T48 | T49 | T50 | T51 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );", 12, 0, input);

            throw nvae;
        }
        switch (alt12) {
            case 1 :
                // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1:10: T11
                {
                mT11(); 

                }
                break;
            case 2 :
                // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1:14: T12
                {
                mT12(); 

                }
                break;
            case 3 :
                // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1:18: T13
                {
                mT13(); 

                }
                break;
            case 4 :
                // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1:22: T14
                {
                mT14(); 

                }
                break;
            case 5 :
                // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1:26: T15
                {
                mT15(); 

                }
                break;
            case 6 :
                // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1:30: T16
                {
                mT16(); 

                }
                break;
            case 7 :
                // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1:34: T17
                {
                mT17(); 

                }
                break;
            case 8 :
                // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1:38: T18
                {
                mT18(); 

                }
                break;
            case 9 :
                // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1:42: T19
                {
                mT19(); 

                }
                break;
            case 10 :
                // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1:46: T20
                {
                mT20(); 

                }
                break;
            case 11 :
                // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1:50: T21
                {
                mT21(); 

                }
                break;
            case 12 :
                // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1:54: T22
                {
                mT22(); 

                }
                break;
            case 13 :
                // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1:58: T23
                {
                mT23(); 

                }
                break;
            case 14 :
                // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1:62: T24
                {
                mT24(); 

                }
                break;
            case 15 :
                // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1:66: T25
                {
                mT25(); 

                }
                break;
            case 16 :
                // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1:70: T26
                {
                mT26(); 

                }
                break;
            case 17 :
                // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1:74: T27
                {
                mT27(); 

                }
                break;
            case 18 :
                // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1:78: T28
                {
                mT28(); 

                }
                break;
            case 19 :
                // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1:82: T29
                {
                mT29(); 

                }
                break;
            case 20 :
                // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1:86: T30
                {
                mT30(); 

                }
                break;
            case 21 :
                // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1:90: T31
                {
                mT31(); 

                }
                break;
            case 22 :
                // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1:94: T32
                {
                mT32(); 

                }
                break;
            case 23 :
                // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1:98: T33
                {
                mT33(); 

                }
                break;
            case 24 :
                // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1:102: T34
                {
                mT34(); 

                }
                break;
            case 25 :
                // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1:106: T35
                {
                mT35(); 

                }
                break;
            case 26 :
                // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1:110: T36
                {
                mT36(); 

                }
                break;
            case 27 :
                // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1:114: T37
                {
                mT37(); 

                }
                break;
            case 28 :
                // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1:118: T38
                {
                mT38(); 

                }
                break;
            case 29 :
                // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1:122: T39
                {
                mT39(); 

                }
                break;
            case 30 :
                // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1:126: T40
                {
                mT40(); 

                }
                break;
            case 31 :
                // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1:130: T41
                {
                mT41(); 

                }
                break;
            case 32 :
                // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1:134: T42
                {
                mT42(); 

                }
                break;
            case 33 :
                // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1:138: T43
                {
                mT43(); 

                }
                break;
            case 34 :
                // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1:142: T44
                {
                mT44(); 

                }
                break;
            case 35 :
                // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1:146: T45
                {
                mT45(); 

                }
                break;
            case 36 :
                // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1:150: T46
                {
                mT46(); 

                }
                break;
            case 37 :
                // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1:154: T47
                {
                mT47(); 

                }
                break;
            case 38 :
                // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1:158: T48
                {
                mT48(); 

                }
                break;
            case 39 :
                // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1:162: T49
                {
                mT49(); 

                }
                break;
            case 40 :
                // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1:166: T50
                {
                mT50(); 

                }
                break;
            case 41 :
                // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1:170: T51
                {
                mT51(); 

                }
                break;
            case 42 :
                // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1:174: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 43 :
                // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1:182: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 44 :
                // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1:191: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 45 :
                // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1:203: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 46 :
                // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1:219: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 47 :
                // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1:235: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 48 :
                // ../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g:1:243: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


 

}