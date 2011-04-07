lexer grammar InternalDynamicScreenDsl;
@header {
package nl.dslmeinte.xtext.examples.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T11 : 'dynamic-screen' ;
T12 : 'data-import' ;
T13 : '=' ;
T14 : 'view-class' ;
T15 : '[nl:' ;
T16 : ']' ;
T17 : '/' ;
T18 : '(' ;
T19 : ')' ;
T20 : 'external-var' ;
T21 : 'as' ;
T22 : 'define' ;
T23 : 'of' ;
T24 : 'data-store' ;
T25 : 'of-type' ;
T26 : 'is-multi-valued' ;
T27 : 'group' ;
T28 : 'with' ;
T29 : '{' ;
T30 : '}' ;
T31 : 'if' ;
T32 : '+' ;
T33 : 'restrict-to' ;
T34 : 'restrict-to-group' ;
T35 : '<' ;
T36 : '>' ;
T37 : 'or' ;
T38 : '|' ;
T39 : 'and' ;
T40 : '&' ;
T41 : 'not' ;
T42 : '!' ;
T43 : 'is' ;
T44 : 'equals' ;
T45 : 'is-present' ;
T46 : 'display' ;
T47 : 'required' ;
T48 : 'readonly' ;
T49 : 'calculated' ;
T50 : 'doubleAsterisk' ;
T51 : 'true' ;
T52 : 'false' ;
T53 : 'is-one-of' ;
T54 : 'is-not-one-of' ;

// $ANTLR src "../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g" 2560
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g" 2562
RULE_INT : ('0'..'9')+;

// $ANTLR src "../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g" 2564
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g" 2566
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g" 2568
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g" 2570
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../nl.dslmeinte.xtext.examples.dynamic/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDynamicScreenDsl.g" 2572
RULE_ANY_OTHER : .;


