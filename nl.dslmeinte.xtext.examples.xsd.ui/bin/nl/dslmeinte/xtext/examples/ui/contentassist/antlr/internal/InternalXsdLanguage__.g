lexer grammar InternalXsdLanguage;
@header {
package nl.dslmeinte.xtext.examples.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

T12 : 'duration' ;
T13 : 'dateTime' ;
T14 : 'time' ;
T15 : 'date' ;
T16 : 'string' ;
T17 : 'decimal' ;
T18 : 'integer' ;
T19 : 'positiveInteger' ;
T20 : 'nonNegativeInteger' ;
T21 : 'token' ;
T22 : 'base64Binary' ;
T23 : 'schema' ;
T24 : 'namespace' ;
T25 : 'import' ;
T26 : 'as' ;
T27 : 'element' ;
T28 : '->' ;
T29 : ':' ;
T30 : 'simple-type' ;
T31 : '[' ;
T32 : ']' ;
T33 : 'enumeration' ;
T34 : '{' ;
T35 : '}' ;
T36 : '::' ;
T37 : 'maxLength' ;
T38 : '=' ;
T39 : 'pattern' ;
T40 : 'range' ;
T41 : '..' ;
T42 : 'length' ;
T43 : 'complex-type' ;
T44 : 'extends' ;
T45 : 'documentation:' ;
T46 : '@' ;
T47 : 'abstract' ;
T48 : 'required' ;
T49 : '*' ;

// $ANTLR src "../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g" 5536
RULE_PATTERN_STRING : '/' ('\\' '/'|~('/'))* '/';

// $ANTLR src "../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g" 5538
RULE_ID : '^'? ('a'..'z'|'A'..'Z') ('a'..'z'|'A'..'Z'|'_'|'-'|'0'..'9')*;

// $ANTLR src "../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g" 5540
RULE_INT : ('0'..'9')+;

// $ANTLR src "../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g" 5542
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g" 5544
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g" 5546
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g" 5548
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../nl.dslmeinte.xtext.examples.xsd.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalXsdLanguage.g" 5550
RULE_ANY_OTHER : .;


