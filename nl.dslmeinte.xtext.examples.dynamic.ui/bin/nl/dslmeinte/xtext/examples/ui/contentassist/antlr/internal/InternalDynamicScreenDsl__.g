lexer grammar InternalDynamicScreenDsl;
@header {
package nl.dslmeinte.xtext.examples.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

T11 : 'or' ;
T12 : '|' ;
T13 : 'and' ;
T14 : '&' ;
T15 : 'not' ;
T16 : '!' ;
T17 : 'display' ;
T18 : 'required' ;
T19 : 'readonly' ;
T20 : 'calculated' ;
T21 : 'doubleAsterisk' ;
T22 : 'true' ;
T23 : 'false' ;
T24 : 'is-one-of' ;
T25 : 'is-not-one-of' ;
T26 : 'dynamic-screen' ;
T27 : 'data-import' ;
T28 : '=' ;
T29 : 'view-class' ;
T30 : '[nl:' ;
T31 : ']' ;
T32 : '/' ;
T33 : '(' ;
T34 : ')' ;
T35 : 'external-var' ;
T36 : 'as' ;
T37 : 'define' ;
T38 : 'of' ;
T39 : 'data-store' ;
T40 : 'of-type' ;
T41 : 'group' ;
T42 : '{' ;
T43 : '}' ;
T44 : 'with' ;
T45 : 'if' ;
T46 : '+' ;
T47 : 'restrict-to' ;
T48 : 'restrict-to-group' ;
T49 : '<' ;
T50 : '>' ;
T51 : 'is' ;
T52 : 'equals' ;
T53 : 'is-present' ;
T54 : 'is-multi-valued' ;

// $ANTLR src "../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g" 5734
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g" 5736
RULE_INT : ('0'..'9')+;

// $ANTLR src "../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g" 5738
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g" 5740
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g" 5742
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g" 5744
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g" 5746
RULE_ANY_OTHER : .;


