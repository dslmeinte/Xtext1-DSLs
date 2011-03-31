lexer grammar InternalWsdlLanguage;
@header {
package nl.dslmeinte.xtext.examples.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

T11 : 'document' ;
T12 : 'rpc' ;
T13 : 'get' ;
T14 : 'put' ;
T15 : 'wsdl' ;
T16 : 'namespace:' ;
T17 : 'messages:' ;
T18 : 'portTypes:' ;
T19 : 'bindings:' ;
T20 : 'services:' ;
T21 : 'xsd-import' ;
T22 : 'as' ;
T23 : '{' ;
T24 : '}' ;
T25 : '->' ;
T26 : 'operation' ;
T27 : ':' ;
T28 : '<-' ;
T29 : 'binds' ;
T30 : 'using' ;
T31 : 'soap' ;
T32 : '(' ;
T33 : ')' ;
T34 : 'http' ;
T35 : '-' ;
T36 : 'documentation' ;
T37 : 'port' ;
T38 : 'on' ;

// $ANTLR src "../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g" 3704
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g" 3706
RULE_INT : ('0'..'9')+;

// $ANTLR src "../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g" 3708
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g" 3710
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g" 3712
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g" 3714
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../nl.dslmeinte.xtext.examples.wsdl.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalWsdlLanguage.g" 3716
RULE_ANY_OTHER : .;


