package nl.dslmeinte.xtext.examples.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalXsdLanguageLexer extends Lexer {
    public static final int RULE_ID=4;
    public static final int RULE_ANY_OTHER=11;
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
    public static final int Tokens=50;
    public static final int RULE_SL_COMMENT=9;
    public static final int T42=42;
    public static final int T41=41;
    public static final int T40=40;
    public static final int T47=47;
    public static final int T46=46;
    public static final int T45=45;
    public static final int RULE_ML_COMMENT=8;
    public static final int T44=44;
    public static final int RULE_STRING=5;
    public static final int RULE_PATTERN_STRING=7;
    public static final int T12=12;
    public static final int T13=13;
    public static final int T14=14;
    public static final int T15=15;
    public static final int RULE_WS=10;
    public static final int T16=16;
    public static final int T17=17;
    public static final int T18=18;
    public static final int T19=19;
    public InternalXsdLanguageLexer() {;} 
    public InternalXsdLanguageLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g"; }

    // $ANTLR start T12
    public final void mT12() throws RecognitionException {
        try {
            int _type = T12;
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:10:5: ( 'duration' )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:10:7: 'duration'
            {
            match("duration"); 


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
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:11:5: ( 'dateTime' )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:11:7: 'dateTime'
            {
            match("dateTime"); 


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
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:12:5: ( 'time' )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:12:7: 'time'
            {
            match("time"); 


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
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:13:5: ( 'date' )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:13:7: 'date'
            {
            match("date"); 


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
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:14:5: ( 'string' )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:14:7: 'string'
            {
            match("string"); 


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
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:15:5: ( 'decimal' )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:15:7: 'decimal'
            {
            match("decimal"); 


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
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:16:5: ( 'integer' )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:16:7: 'integer'
            {
            match("integer"); 


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
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:17:5: ( 'positiveInteger' )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:17:7: 'positiveInteger'
            {
            match("positiveInteger"); 


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
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:18:5: ( 'nonNegativeInteger' )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:18:7: 'nonNegativeInteger'
            {
            match("nonNegativeInteger"); 


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
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:19:5: ( 'token' )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:19:7: 'token'
            {
            match("token"); 


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
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:20:5: ( 'base64Binary' )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:20:7: 'base64Binary'
            {
            match("base64Binary"); 


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
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:21:5: ( 'schema' )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:21:7: 'schema'
            {
            match("schema"); 


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
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:22:5: ( 'namespace' )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:22:7: 'namespace'
            {
            match("namespace"); 


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
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:23:5: ( 'import' )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:23:7: 'import'
            {
            match("import"); 


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
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:24:5: ( 'as' )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:24:7: 'as'
            {
            match("as"); 


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
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:25:5: ( 'element' )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:25:7: 'element'
            {
            match("element"); 


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
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:26:5: ( '->' )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:26:7: '->'
            {
            match("->"); 


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
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:27:5: ( ':' )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:27:7: ':'
            {
            match(':'); 

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
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:28:5: ( 'simple-type' )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:28:7: 'simple-type'
            {
            match("simple-type"); 


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
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:29:5: ( '[' )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:29:7: '['
            {
            match('['); 

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
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:30:5: ( ']' )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:30:7: ']'
            {
            match(']'); 

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
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:31:5: ( 'enumeration' )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:31:7: 'enumeration'
            {
            match("enumeration"); 


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
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:32:5: ( '{' )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:32:7: '{'
            {
            match('{'); 

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
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:33:5: ( '}' )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:33:7: '}'
            {
            match('}'); 

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
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:34:5: ( '::' )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:34:7: '::'
            {
            match("::"); 


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
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:35:5: ( 'maxLength' )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:35:7: 'maxLength'
            {
            match("maxLength"); 


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
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:36:5: ( '=' )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:36:7: '='
            {
            match('='); 

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
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:37:5: ( 'pattern' )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:37:7: 'pattern'
            {
            match("pattern"); 


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
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:38:5: ( 'range' )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:38:7: 'range'
            {
            match("range"); 


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
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:39:5: ( '..' )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:39:7: '..'
            {
            match(".."); 


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
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:40:5: ( 'length' )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:40:7: 'length'
            {
            match("length"); 


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
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:41:5: ( 'complex-type' )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:41:7: 'complex-type'
            {
            match("complex-type"); 


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
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:42:5: ( 'extends' )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:42:7: 'extends'
            {
            match("extends"); 


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
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:43:5: ( 'documentation:' )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:43:7: 'documentation:'
            {
            match("documentation:"); 


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
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:44:5: ( '@' )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:44:7: '@'
            {
            match('@'); 

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
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:45:5: ( 'abstract' )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:45:7: 'abstract'
            {
            match("abstract"); 


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
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:46:5: ( 'required' )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:46:7: 'required'
            {
            match("required"); 


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
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:47:5: ( '*' )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:47:7: '*'
            {
            match('*'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T49

    // $ANTLR start RULE_PATTERN_STRING
    public final void mRULE_PATTERN_STRING() throws RecognitionException {
        try {
            int _type = RULE_PATTERN_STRING;
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5536:21: ( '/' ( '\\\\' '/' | ~ ( '/' ) )* '/' )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5536:23: '/' ( '\\\\' '/' | ~ ( '/' ) )* '/'
            {
            match('/'); 
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5536:27: ( '\\\\' '/' | ~ ( '/' ) )*
            loop1:
            do {
                int alt1=3;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='\\') ) {
                    int LA1_2 = input.LA(2);

                    if ( (LA1_2=='/') ) {
                        int LA1_4 = input.LA(3);

                        if ( ((LA1_4>='\u0000' && LA1_4<='\uFFFE')) ) {
                            alt1=1;
                        }

                        else {
                            alt1=2;
                        }

                    }
                    else if ( ((LA1_2>='\u0000' && LA1_2<='.')||(LA1_2>='0' && LA1_2<='\uFFFE')) ) {
                        alt1=2;
                    }


                }
                else if ( ((LA1_0>='\u0000' && LA1_0<='.')||(LA1_0>='0' && LA1_0<='[')||(LA1_0>=']' && LA1_0<='\uFFFE')) ) {
                    alt1=2;
                }


                switch (alt1) {
            	case 1 :
            	    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5536:28: '\\\\' '/'
            	    {
            	    match('\\'); 
            	    match('/'); 

            	    }
            	    break;
            	case 2 :
            	    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5536:37: ~ ( '/' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='.')||(input.LA(1)>='0' && input.LA(1)<='\uFFFE') ) {
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
            	    break loop1;
                }
            } while (true);

            match('/'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_PATTERN_STRING

    // $ANTLR start RULE_ID
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5538:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' | '0' .. '9' )* )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5538:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' | '0' .. '9' )*
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5538:11: ( '^' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='^') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5538:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5538:36: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' | '0' .. '9' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='-'||(LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:
            	    {
            	    if ( input.LA(1)=='-'||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
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
            	    break loop3;
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
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5540:10: ( ( '0' .. '9' )+ )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5540:12: ( '0' .. '9' )+
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5540:12: ( '0' .. '9' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5540:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
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
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5542:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5542:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5542:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='\"') ) {
                alt7=1;
            }
            else if ( (LA7_0=='\'') ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("5542:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5542:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5542:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='!')||(LA5_0>='#' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFE')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5542:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5542:62: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop5;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5542:82: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5542:87: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='&')||(LA6_0>='(' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFE')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5542:88: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5542:129: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop6;
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
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5544:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5544:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5544:24: ( options {greedy=false; } : . )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='*') ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1=='/') ) {
                        alt8=2;
                    }
                    else if ( ((LA8_1>='\u0000' && LA8_1<='.')||(LA8_1>='0' && LA8_1<='\uFFFE')) ) {
                        alt8=1;
                    }


                }
                else if ( ((LA8_0>='\u0000' && LA8_0<=')')||(LA8_0>='+' && LA8_0<='\uFFFE')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5544:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop8;
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
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5546:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5546:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5546:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\u0000' && LA9_0<='\t')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\uFFFE')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5546:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop9;
                }
            } while (true);

            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5546:40: ( ( '\\r' )? '\\n' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\n'||LA11_0=='\r') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5546:41: ( '\\r' )? '\\n'
                    {
                    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5546:41: ( '\\r' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='\r') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5546:41: '\\r'
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
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5548:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5548:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5548:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:
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
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
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
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5550:16: ( . )
            // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:5550:18: .
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
        // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1:8: ( T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | T46 | T47 | T48 | T49 | RULE_PATTERN_STRING | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt13=46;
        alt13 = dfa13.predict(input);
        switch (alt13) {
            case 1 :
                // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1:10: T12
                {
                mT12(); 

                }
                break;
            case 2 :
                // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1:14: T13
                {
                mT13(); 

                }
                break;
            case 3 :
                // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1:18: T14
                {
                mT14(); 

                }
                break;
            case 4 :
                // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1:22: T15
                {
                mT15(); 

                }
                break;
            case 5 :
                // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1:26: T16
                {
                mT16(); 

                }
                break;
            case 6 :
                // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1:30: T17
                {
                mT17(); 

                }
                break;
            case 7 :
                // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1:34: T18
                {
                mT18(); 

                }
                break;
            case 8 :
                // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1:38: T19
                {
                mT19(); 

                }
                break;
            case 9 :
                // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1:42: T20
                {
                mT20(); 

                }
                break;
            case 10 :
                // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1:46: T21
                {
                mT21(); 

                }
                break;
            case 11 :
                // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1:50: T22
                {
                mT22(); 

                }
                break;
            case 12 :
                // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1:54: T23
                {
                mT23(); 

                }
                break;
            case 13 :
                // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1:58: T24
                {
                mT24(); 

                }
                break;
            case 14 :
                // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1:62: T25
                {
                mT25(); 

                }
                break;
            case 15 :
                // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1:66: T26
                {
                mT26(); 

                }
                break;
            case 16 :
                // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1:70: T27
                {
                mT27(); 

                }
                break;
            case 17 :
                // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1:74: T28
                {
                mT28(); 

                }
                break;
            case 18 :
                // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1:78: T29
                {
                mT29(); 

                }
                break;
            case 19 :
                // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1:82: T30
                {
                mT30(); 

                }
                break;
            case 20 :
                // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1:86: T31
                {
                mT31(); 

                }
                break;
            case 21 :
                // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1:90: T32
                {
                mT32(); 

                }
                break;
            case 22 :
                // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1:94: T33
                {
                mT33(); 

                }
                break;
            case 23 :
                // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1:98: T34
                {
                mT34(); 

                }
                break;
            case 24 :
                // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1:102: T35
                {
                mT35(); 

                }
                break;
            case 25 :
                // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1:106: T36
                {
                mT36(); 

                }
                break;
            case 26 :
                // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1:110: T37
                {
                mT37(); 

                }
                break;
            case 27 :
                // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1:114: T38
                {
                mT38(); 

                }
                break;
            case 28 :
                // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1:118: T39
                {
                mT39(); 

                }
                break;
            case 29 :
                // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1:122: T40
                {
                mT40(); 

                }
                break;
            case 30 :
                // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1:126: T41
                {
                mT41(); 

                }
                break;
            case 31 :
                // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1:130: T42
                {
                mT42(); 

                }
                break;
            case 32 :
                // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1:134: T43
                {
                mT43(); 

                }
                break;
            case 33 :
                // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1:138: T44
                {
                mT44(); 

                }
                break;
            case 34 :
                // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1:142: T45
                {
                mT45(); 

                }
                break;
            case 35 :
                // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1:146: T46
                {
                mT46(); 

                }
                break;
            case 36 :
                // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1:150: T47
                {
                mT47(); 

                }
                break;
            case 37 :
                // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1:154: T48
                {
                mT48(); 

                }
                break;
            case 38 :
                // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1:158: T49
                {
                mT49(); 

                }
                break;
            case 39 :
                // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1:162: RULE_PATTERN_STRING
                {
                mRULE_PATTERN_STRING(); 

                }
                break;
            case 40 :
                // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1:182: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 41 :
                // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1:190: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 42 :
                // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1:199: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 43 :
                // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1:211: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 44 :
                // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1:227: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 45 :
                // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1:243: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 46 :
                // ../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g:1:251: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA13_eotS =
        "\1\uffff\11\44\1\37\1\70\4\uffff\1\44\1\uffff\1\44\1\37\2\44\2\uffff"+
        "\2\37\2\uffff\2\37\2\uffff\4\44\1\uffff\15\44\1\135\3\44\7\uffff"+
        "\1\44\1\uffff\2\44\1\uffff\2\44\3\uffff\1\110\4\uffff\21\44\1\uffff"+
        "\10\44\1\uffff\1\110\3\uffff\2\44\1\u008a\1\44\1\u008c\24\44\1\110"+
        "\1\uffff\1\110\3\44\1\uffff\1\44\1\uffff\1\u00a5\20\44\1\u00b6\6"+
        "\44\1\uffff\1\u00bd\1\u00be\2\44\1\u00c1\13\44\1\uffff\1\u00cd\2"+
        "\44\1\u00d0\2\44\2\uffff\1\44\1\u00d4\1\uffff\1\44\1\u00d6\4\44"+
        "\1\u00db\1\44\1\u00dd\2\44\1\uffff\1\44\1\u00e1\1\uffff\1\u00e2"+
        "\2\44\1\uffff\1\44\1\uffff\3\44\1\u00e9\1\uffff\1\44\1\uffff\1\44"+
        "\1\u00ec\1\44\2\uffff\4\44\1\u00f2\1\44\1\uffff\1\44\1\u00f5\1\uffff"+
        "\5\44\1\uffff\2\44\1\uffff\2\44\1\u00ff\3\44\1\u0103\2\44\1\uffff"+
        "\2\44\1\u0108\1\uffff\1\u0109\3\44\3\uffff\2\44\1\u010f\1\44\1\uffff"+
        "\2\44\1\u0113\1\uffff";
    static final String DFA13_eofS =
        "\u0114\uffff";
    static final String DFA13_minS =
        "\1\0\1\141\1\151\1\143\1\155\3\141\1\142\1\154\1\76\1\72\4\uffff"+
        "\1\141\1\uffff\1\141\1\56\1\145\1\157\2\uffff\1\0\1\101\2\uffff"+
        "\2\0\2\uffff\1\162\1\143\1\164\1\143\1\uffff\1\155\1\153\1\162\1"+
        "\150\1\155\1\164\1\160\1\163\1\164\1\156\1\155\2\163\1\55\1\145"+
        "\1\165\1\164\7\uffff\1\170\1\uffff\1\161\1\156\1\uffff\1\156\1\155"+
        "\2\uffff\2\0\4\uffff\1\141\1\151\1\145\1\165\2\145\1\151\1\145\1"+
        "\160\1\145\1\157\1\151\1\164\1\116\2\145\1\164\1\uffff\2\155\1\145"+
        "\1\114\1\165\2\147\1\160\4\0\1\uffff\1\164\1\155\1\55\1\155\1\55"+
        "\2\156\1\155\1\154\1\147\1\162\1\164\2\145\1\163\1\66\1\162\2\145"+
        "\1\156\1\145\1\151\1\145\1\164\1\154\1\0\1\uffff\1\0\1\151\1\141"+
        "\1\151\1\uffff\1\145\1\uffff\1\55\1\147\1\141\2\145\1\164\1\151"+
        "\1\162\1\147\1\160\1\64\1\141\1\156\1\162\1\144\1\156\1\162\1\55"+
        "\1\150\1\145\1\157\1\154\1\155\1\156\1\uffff\3\55\1\162\1\55\1\166"+
        "\1\156\2\141\1\102\1\143\1\164\1\141\1\163\1\147\1\145\1\uffff\1"+
        "\55\1\170\1\156\1\55\1\145\1\164\2\uffff\1\164\1\55\1\uffff\1\145"+
        "\1\55\1\164\1\143\1\151\1\164\1\55\1\164\1\55\1\164\1\144\1\uffff"+
        "\2\55\1\uffff\1\55\1\141\1\171\1\uffff\1\111\1\uffff\1\151\1\145"+
        "\1\156\1\55\1\uffff\1\151\1\uffff\1\150\1\55\1\164\2\uffff\1\164"+
        "\1\160\1\156\1\166\1\55\1\141\1\uffff\1\157\1\55\1\uffff\1\171\1"+
        "\151\1\145\1\164\1\145\1\uffff\1\162\1\156\1\uffff\1\160\1\157\1"+
        "\55\1\145\1\111\1\171\1\55\1\145\1\156\1\uffff\1\147\1\156\1\55"+
        "\1\uffff\1\55\1\72\1\145\1\164\3\uffff\1\162\1\145\1\55\1\147\1"+
        "\uffff\1\145\1\162\1\55\1\uffff";
    static final String DFA13_maxS =
        "\1\ufffe\1\165\1\157\1\164\1\156\2\157\1\141\1\163\1\170\1\76\1"+
        "\72\4\uffff\1\141\1\uffff\1\145\1\56\1\145\1\157\2\uffff\1\ufffe"+
        "\1\172\2\uffff\2\ufffe\2\uffff\1\162\1\143\1\164\1\143\1\uffff\1"+
        "\155\1\153\1\162\1\150\1\155\1\164\1\160\1\163\1\164\1\156\1\155"+
        "\2\163\1\172\1\145\1\165\1\164\7\uffff\1\170\1\uffff\1\161\1\156"+
        "\1\uffff\1\156\1\155\2\uffff\2\ufffe\4\uffff\1\141\1\151\1\145\1"+
        "\165\2\145\1\151\1\145\1\160\1\145\1\157\1\151\1\164\1\116\2\145"+
        "\1\164\1\uffff\2\155\1\145\1\114\1\165\2\147\1\160\4\ufffe\1\uffff"+
        "\1\164\1\155\1\172\1\155\1\172\2\156\1\155\1\154\1\147\1\162\1\164"+
        "\2\145\1\163\1\66\1\162\2\145\1\156\1\145\1\151\1\145\1\164\1\154"+
        "\1\ufffe\1\uffff\1\ufffe\1\151\1\141\1\151\1\uffff\1\145\1\uffff"+
        "\1\172\1\147\1\141\2\145\1\164\1\151\1\162\1\147\1\160\1\64\1\141"+
        "\1\156\1\162\1\144\1\156\1\162\1\172\1\150\1\145\1\157\1\154\1\155"+
        "\1\156\1\uffff\2\172\1\55\1\162\1\172\1\166\1\156\2\141\1\102\1"+
        "\143\1\164\1\141\1\163\1\147\1\145\1\uffff\1\172\1\170\1\156\1\172"+
        "\1\145\1\164\2\uffff\1\164\1\172\1\uffff\1\145\1\172\1\164\1\143"+
        "\1\151\1\164\1\172\1\164\1\172\1\164\1\144\1\uffff\1\55\1\172\1"+
        "\uffff\1\172\1\141\1\171\1\uffff\1\111\1\uffff\1\151\1\145\1\156"+
        "\1\172\1\uffff\1\151\1\uffff\1\150\1\172\1\164\2\uffff\1\164\1\160"+
        "\1\156\1\166\1\172\1\141\1\uffff\1\157\1\172\1\uffff\1\171\1\151"+
        "\1\145\1\164\1\145\1\uffff\1\162\1\156\1\uffff\1\160\1\157\1\172"+
        "\1\145\1\111\1\171\1\172\1\145\1\156\1\uffff\1\147\1\156\1\172\1"+
        "\uffff\1\172\1\72\1\145\1\164\3\uffff\1\162\1\145\1\172\1\147\1"+
        "\uffff\1\145\1\162\1\172\1\uffff";
    static final String DFA13_acceptS =
        "\14\uffff\1\24\1\25\1\27\1\30\1\uffff\1\33\4\uffff\1\43\1\46\2\uffff"+
        "\1\50\1\51\2\uffff\1\55\1\56\4\uffff\1\50\21\uffff\1\21\1\31\1\22"+
        "\1\24\1\25\1\27\1\30\1\uffff\1\33\2\uffff\1\36\2\uffff\1\43\1\46"+
        "\2\uffff\1\47\1\51\1\52\1\55\21\uffff\1\17\14\uffff\1\54\32\uffff"+
        "\1\53\4\uffff\1\4\1\uffff\1\3\30\uffff\1\12\20\uffff\1\35\6\uffff"+
        "\1\5\1\14\2\uffff\1\16\13\uffff\1\37\2\uffff\1\6\3\uffff\1\7\1\uffff"+
        "\1\34\4\uffff\1\20\1\uffff\1\41\3\uffff\1\1\1\2\6\uffff\1\44\2\uffff"+
        "\1\45\5\uffff\1\15\2\uffff\1\32\11\uffff\1\23\3\uffff\1\26\4\uffff"+
        "\1\13\1\40\1\42\4\uffff\1\10\3\uffff\1\11";
    static final String DFA13_specialS =
        "\u0114\uffff}>";
    static final String[] DFA13_transitionS = {
            "\11\37\2\36\2\37\1\36\22\37\1\36\1\37\1\34\4\37\1\35\2\37\1"+
            "\27\2\37\1\12\1\23\1\30\12\33\1\13\2\37\1\21\2\37\1\26\32\32"+
            "\1\14\1\37\1\15\1\31\2\37\1\10\1\7\1\25\1\1\1\11\3\32\1\4\2"+
            "\32\1\24\1\20\1\6\1\32\1\5\1\32\1\22\1\3\1\2\6\32\1\16\1\37"+
            "\1\17\uff81\37",
            "\1\42\3\uffff\1\41\11\uffff\1\43\5\uffff\1\40",
            "\1\45\5\uffff\1\46",
            "\1\50\5\uffff\1\51\12\uffff\1\47",
            "\1\53\1\52",
            "\1\55\15\uffff\1\54",
            "\1\57\15\uffff\1\56",
            "\1\60",
            "\1\61\20\uffff\1\62",
            "\1\63\1\uffff\1\64\11\uffff\1\65",
            "\1\66",
            "\1\67",
            "",
            "",
            "",
            "",
            "\1\75",
            "",
            "\1\100\3\uffff\1\77",
            "\1\101",
            "\1\102",
            "\1\103",
            "",
            "",
            "\52\110\1\106\4\110\1\107\uffcf\110",
            "\32\44\6\uffff\32\44",
            "",
            "",
            "\uffff\112",
            "\uffff\112",
            "",
            "",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\44\2\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\136",
            "\1\137",
            "\1\140",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\141",
            "",
            "\1\142",
            "\1\143",
            "",
            "\1\144",
            "\1\145",
            "",
            "",
            "\52\151\1\146\4\151\1\147\54\151\1\150\uffa2\151",
            "\uffff\152",
            "",
            "",
            "",
            "",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\173",
            "",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\52\151\1\146\4\151\1\u0084\54\151\1\150\uffa2\151",
            "\uffff\u0085",
            "\52\151\1\146\4\151\1\u0086\54\151\1\150\uffa2\151",
            "\52\151\1\146\4\151\1\147\54\151\1\150\uffa2\151",
            "",
            "\1\u0087",
            "\1\u0088",
            "\1\44\2\uffff\12\44\7\uffff\23\44\1\u0089\6\44\4\uffff\1\44"+
            "\1\uffff\32\44",
            "\1\u008b",
            "\1\44\2\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "\uffff\u0085",
            "",
            "\52\151\1\146\4\151\1\147\54\151\1\150\uffa2\151",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "",
            "\1\u00a4",
            "",
            "\1\44\2\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "\1\44\2\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bc",
            "",
            "\1\44\2\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\44\2\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u00bf",
            "\1\u00c0",
            "\1\44\2\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5",
            "\1\u00c6",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00c9",
            "\1\u00ca",
            "\1\u00cb",
            "\1\u00cc",
            "",
            "\1\44\2\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u00ce",
            "\1\u00cf",
            "\1\44\2\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u00d1",
            "\1\u00d2",
            "",
            "",
            "\1\u00d3",
            "\1\44\2\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "\1\u00d5",
            "\1\44\2\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u00d7",
            "\1\u00d8",
            "\1\u00d9",
            "\1\u00da",
            "\1\44\2\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u00dc",
            "\1\44\2\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u00de",
            "\1\u00df",
            "",
            "\1\u00e0",
            "\1\44\2\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "\1\44\2\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u00e3",
            "\1\u00e4",
            "",
            "\1\u00e5",
            "",
            "\1\u00e6",
            "\1\u00e7",
            "\1\u00e8",
            "\1\44\2\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "\1\u00ea",
            "",
            "\1\u00eb",
            "\1\44\2\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u00ed",
            "",
            "",
            "\1\u00ee",
            "\1\u00ef",
            "\1\u00f0",
            "\1\u00f1",
            "\1\44\2\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u00f3",
            "",
            "\1\u00f4",
            "\1\44\2\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "\1\u00f6",
            "\1\u00f7",
            "\1\u00f8",
            "\1\u00f9",
            "\1\u00fa",
            "",
            "\1\u00fb",
            "\1\u00fc",
            "",
            "\1\u00fd",
            "\1\u00fe",
            "\1\44\2\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u0100",
            "\1\u0101",
            "\1\u0102",
            "\1\44\2\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u0104",
            "\1\u0105",
            "",
            "\1\u0106",
            "\1\u0107",
            "\1\44\2\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "\1\44\2\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u010a",
            "\1\u010b",
            "\1\u010c",
            "",
            "",
            "",
            "\1\u010d",
            "\1\u010e",
            "\1\44\2\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u0110",
            "",
            "\1\u0111",
            "\1\u0112",
            "\1\44\2\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            ""
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | T46 | T47 | T48 | T49 | RULE_PATTERN_STRING | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
    }
 

}