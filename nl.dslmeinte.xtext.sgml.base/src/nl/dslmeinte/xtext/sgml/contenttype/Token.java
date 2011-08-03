package nl.dslmeinte.xtext.sgml.contenttype;

/**
 * Simple token representation used by {@link SimpleSgmlRecognizer}.
 * 
 * @author Meinte Boersma
 */
class Token {

	private Terminals type;
	private String text;

	Token(Terminals type) {
		this(type, null);
	}

	Token(Terminals type, String text) {
		this.type = type;
		this.text = text;
	}

	Terminals getType() {
		return type;
	}

	String getText() {
		return text;
	}

}