lexer grammar InternalWsdlLanguage;
@header {
package nl.dslmeinte.xtext.examples.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T11 : 'wsdl' ;
T12 : 'namespace:' ;
T13 : 'messages:' ;
T14 : 'portTypes:' ;
T15 : 'bindings:' ;
T16 : 'services:' ;
T17 : 'xsd-import' ;
T18 : 'as' ;
T19 : '{' ;
T20 : '}' ;
T21 : '->' ;
T22 : 'operation' ;
T23 : ':' ;
T24 : '<-' ;
T25 : 'binds' ;
T26 : 'using' ;
T27 : 'soap' ;
T28 : '(' ;
T29 : ')' ;
T30 : 'http' ;
T31 : '-' ;
T32 : 'documentation' ;
T33 : 'port' ;
T34 : 'on' ;
T35 : 'document' ;
T36 : 'rpc' ;
T37 : 'get' ;
T38 : 'put' ;

// $ANTLR src "../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g" 1467
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g" 1469
RULE_INT : ('0'..'9')+;

// $ANTLR src "../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g" 1471
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g" 1473
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g" 1475
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g" 1477
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../nl.dslmeinte.xtext.examples.wsdl/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalWsdlLanguage.g" 1479
RULE_ANY_OTHER : .;


