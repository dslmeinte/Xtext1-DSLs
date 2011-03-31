/**
 * <copyright>
 * </copyright>
 *
 */
package nl.dslmeinte.xtext.examples.xsdLanguage;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Builtin Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see nl.dslmeinte.xtext.examples.xsdLanguage.XsdLanguagePackage#getBuiltinType()
 * @model
 * @generated
 */
public enum BuiltinType implements Enumerator
{
  /**
   * The '<em><b>Duration</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DURATION_VALUE
   * @generated
   * @ordered
   */
  DURATION(0, "duration", "duration"),

  /**
   * The '<em><b>Date Time</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DATE_TIME_VALUE
   * @generated
   * @ordered
   */
  DATE_TIME(1, "dateTime", "dateTime"),

  /**
   * The '<em><b>Time</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #TIME_VALUE
   * @generated
   * @ordered
   */
  TIME(2, "time", "time"),

  /**
   * The '<em><b>Date</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DATE_VALUE
   * @generated
   * @ordered
   */
  DATE(3, "date", "date"),

  /**
   * The '<em><b>String</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #STRING_VALUE
   * @generated
   * @ordered
   */
  STRING(4, "string", "string"),

  /**
   * The '<em><b>Decimal</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DECIMAL_VALUE
   * @generated
   * @ordered
   */
  DECIMAL(5, "decimal", "decimal"),

  /**
   * The '<em><b>Integer</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #INTEGER_VALUE
   * @generated
   * @ordered
   */
  INTEGER(6, "integer", "integer"),

  /**
   * The '<em><b>Positive Integer</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #POSITIVE_INTEGER_VALUE
   * @generated
   * @ordered
   */
  POSITIVE_INTEGER(7, "positiveInteger", "positiveInteger"),

  /**
   * The '<em><b>Non Negative Integer</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #NON_NEGATIVE_INTEGER_VALUE
   * @generated
   * @ordered
   */
  NON_NEGATIVE_INTEGER(8, "nonNegativeInteger", "nonNegativeInteger"),

  /**
   * The '<em><b>Token</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #TOKEN_VALUE
   * @generated
   * @ordered
   */
  TOKEN(9, "token", "token"),

  /**
   * The '<em><b>Base64 Binary</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #BASE64_BINARY_VALUE
   * @generated
   * @ordered
   */
  BASE64_BINARY(10, "base64Binary", "base64Binary");

  /**
   * The '<em><b>Duration</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Duration</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #DURATION
   * @model name="duration"
   * @generated
   * @ordered
   */
  public static final int DURATION_VALUE = 0;

  /**
   * The '<em><b>Date Time</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Date Time</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #DATE_TIME
   * @model name="dateTime"
   * @generated
   * @ordered
   */
  public static final int DATE_TIME_VALUE = 1;

  /**
   * The '<em><b>Time</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Time</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #TIME
   * @model name="time"
   * @generated
   * @ordered
   */
  public static final int TIME_VALUE = 2;

  /**
   * The '<em><b>Date</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Date</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #DATE
   * @model name="date"
   * @generated
   * @ordered
   */
  public static final int DATE_VALUE = 3;

  /**
   * The '<em><b>String</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>String</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #STRING
   * @model name="string"
   * @generated
   * @ordered
   */
  public static final int STRING_VALUE = 4;

  /**
   * The '<em><b>Decimal</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Decimal</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #DECIMAL
   * @model name="decimal"
   * @generated
   * @ordered
   */
  public static final int DECIMAL_VALUE = 5;

  /**
   * The '<em><b>Integer</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Integer</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #INTEGER
   * @model name="integer"
   * @generated
   * @ordered
   */
  public static final int INTEGER_VALUE = 6;

  /**
   * The '<em><b>Positive Integer</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Positive Integer</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #POSITIVE_INTEGER
   * @model name="positiveInteger"
   * @generated
   * @ordered
   */
  public static final int POSITIVE_INTEGER_VALUE = 7;

  /**
   * The '<em><b>Non Negative Integer</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Non Negative Integer</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #NON_NEGATIVE_INTEGER
   * @model name="nonNegativeInteger"
   * @generated
   * @ordered
   */
  public static final int NON_NEGATIVE_INTEGER_VALUE = 8;

  /**
   * The '<em><b>Token</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Token</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #TOKEN
   * @model name="token"
   * @generated
   * @ordered
   */
  public static final int TOKEN_VALUE = 9;

  /**
   * The '<em><b>Base64 Binary</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Base64 Binary</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #BASE64_BINARY
   * @model name="base64Binary"
   * @generated
   * @ordered
   */
  public static final int BASE64_BINARY_VALUE = 10;

  /**
   * An array of all the '<em><b>Builtin Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final BuiltinType[] VALUES_ARRAY =
    new BuiltinType[]
    {
      DURATION,
      DATE_TIME,
      TIME,
      DATE,
      STRING,
      DECIMAL,
      INTEGER,
      POSITIVE_INTEGER,
      NON_NEGATIVE_INTEGER,
      TOKEN,
      BASE64_BINARY,
    };

  /**
   * A public read-only list of all the '<em><b>Builtin Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<BuiltinType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Builtin Type</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static BuiltinType get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      BuiltinType result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Builtin Type</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static BuiltinType getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      BuiltinType result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Builtin Type</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static BuiltinType get(int value)
  {
    switch (value)
    {
      case DURATION_VALUE: return DURATION;
      case DATE_TIME_VALUE: return DATE_TIME;
      case TIME_VALUE: return TIME;
      case DATE_VALUE: return DATE;
      case STRING_VALUE: return STRING;
      case DECIMAL_VALUE: return DECIMAL;
      case INTEGER_VALUE: return INTEGER;
      case POSITIVE_INTEGER_VALUE: return POSITIVE_INTEGER;
      case NON_NEGATIVE_INTEGER_VALUE: return NON_NEGATIVE_INTEGER;
      case TOKEN_VALUE: return TOKEN;
      case BASE64_BINARY_VALUE: return BASE64_BINARY;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private BuiltinType(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //BuiltinType
