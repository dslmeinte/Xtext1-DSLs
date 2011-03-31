lexer grammar InternalDataModelDsl;
@header {
package nl.dslmeinte.xtext.examples.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

T11 : 'string' ;
T12 : 'int' ;
T13 : 'number' ;
T14 : 'boolean' ;
T15 : 'optional' ;
T16 : 'required' ;
T17 : 'repeated' ;
T18 : 'primitive-types' ;
T19 : '{' ;
T20 : '}' ;
T21 : 'extends' ;
T22 : '->' ;
T23 : 'datatype' ;
T24 : ':' ;
T25 : 'enum' ;
T26 : 'entity' ;
T27 : 'constraint' ;
T28 : 'uses' ;
T29 : 'function' ;
T30 : '(' ;
T31 : ')' ;
T32 : 'transient' ;
T33 : 'abstract' ;

// $ANTLR src "../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g" 2916
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g" 2918
RULE_INT : ('0'..'9')+;

// $ANTLR src "../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g" 2920
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g" 2922
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g" 2924
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g" 2926
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../nl.dslmeinte.xtext.examples.data.ui/src-gen/nl/dslmeinte/xtext/examples/ui/contentassist/antlr/internal/InternalDataModelDsl.g" 2928
RULE_ANY_OTHER : .;


