lexer grammar InternalXsdLanguage;
@header {
package nl.dslmeinte.xtext.examples.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T12 : 'schema' ;
T13 : 'namespace' ;
T14 : 'import' ;
T15 : 'as' ;
T16 : 'element' ;
T17 : '->' ;
T18 : ':' ;
T19 : 'simple-type' ;
T20 : '[' ;
T21 : ']' ;
T22 : 'enumeration' ;
T23 : '{' ;
T24 : '}' ;
T25 : '::' ;
T26 : 'maxLength' ;
T27 : '=' ;
T28 : 'pattern' ;
T29 : 'range' ;
T30 : '..' ;
T31 : 'length' ;
T32 : 'abstract' ;
T33 : 'complex-type' ;
T34 : 'extends' ;
T35 : 'documentation:' ;
T36 : 'required' ;
T37 : '@' ;
T38 : '*' ;
T39 : 'duration' ;
T40 : 'dateTime' ;
T41 : 'time' ;
T42 : 'date' ;
T43 : 'string' ;
T44 : 'decimal' ;
T45 : 'integer' ;
T46 : 'positiveInteger' ;
T47 : 'nonNegativeInteger' ;
T48 : 'token' ;
T49 : 'base64Binary' ;

// $ANTLR src "../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g" 2561
RULE_PATTERN_STRING : '/' ('\\' '/'|~('/'))* '/';

// $ANTLR src "../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g" 2563
RULE_ID : '^'? ('a'..'z'|'A'..'Z') ('a'..'z'|'A'..'Z'|'_'|'-'|'0'..'9')*;

// $ANTLR src "../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g" 2565
RULE_INT : ('0'..'9')+;

// $ANTLR src "../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g" 2567
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g" 2569
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g" 2571
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g" 2573
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../nl.dslmeinte.xtext.examples.xsd/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalXsdLanguage.g" 2575
RULE_ANY_OTHER : .;


