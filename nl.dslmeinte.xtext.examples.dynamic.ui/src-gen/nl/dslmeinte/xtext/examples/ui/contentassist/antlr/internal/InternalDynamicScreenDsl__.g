lexer grammar InternalDynamicScreenDsl;
@header {
package nl.dslmeinte.xtext.examples.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

T11 : 'display' ;
T12 : 'required' ;
T13 : 'readonly' ;
T14 : 'calculated' ;
T15 : 'doubleAsterisk' ;
T16 : 'true' ;
T17 : 'false' ;
T18 : 'is-one-of' ;
T19 : 'is-not-one-of' ;
T20 : 'dynamic-screen' ;
T21 : 'view-class' ;
T22 : '=' ;
T23 : 'data-import' ;
T24 : '[nl:' ;
T25 : ']' ;
T26 : '/' ;
T27 : '(' ;
T28 : ')' ;
T29 : 'external-var' ;
T30 : 'as' ;
T31 : 'define' ;
T32 : 'of' ;
T33 : 'data-store' ;
T34 : 'of-type' ;
T35 : 'group' ;
T36 : '{' ;
T37 : '}' ;
T38 : 'with' ;
T39 : 'if' ;
T40 : '+' ;
T41 : 'restrict-to' ;
T42 : 'restrict-to-group' ;
T43 : '<' ;
T44 : '>' ;
T45 : 'or' ;
T46 : 'and' ;
T47 : 'not' ;
T48 : 'is' ;
T49 : 'equals' ;
T50 : 'is-present' ;
T51 : 'is-multi-valued' ;

// $ANTLR src "../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g" 5686
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g" 5688
RULE_INT : ('0'..'9')+;

// $ANTLR src "../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g" 5690
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g" 5692
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g" 5694
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g" 5696
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../nl.dslmeinte.xtext.examples.dynamic.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDynamicScreenDsl.g" 5698
RULE_ANY_OTHER : .;


