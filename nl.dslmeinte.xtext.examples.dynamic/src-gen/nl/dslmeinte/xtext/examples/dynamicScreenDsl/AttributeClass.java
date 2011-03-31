/**
 * <copyright>
 * </copyright>
 *
 */
package nl.dslmeinte.xtext.examples.dynamicScreenDsl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Attribute Class</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see nl.dslmeinte.xtext.examples.dynamicScreenDsl.DynamicScreenDslPackage#getAttributeClass()
 * @model
 * @generated
 */
public enum AttributeClass implements Enumerator
{
  /**
   * The '<em><b>Display</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DISPLAY_VALUE
   * @generated
   * @ordered
   */
  DISPLAY(0, "display", "display"),

  /**
   * The '<em><b>Required</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #REQUIRED_VALUE
   * @generated
   * @ordered
   */
  REQUIRED(1, "required", "required"),

  /**
   * The '<em><b>Readonly</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #READONLY_VALUE
   * @generated
   * @ordered
   */
  READONLY(2, "readonly", "readonly"),

  /**
   * The '<em><b>Calculated</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #CALCULATED_VALUE
   * @generated
   * @ordered
   */
  CALCULATED(3, "calculated", "calculated"),

  /**
   * The '<em><b>Double Asterisk</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DOUBLE_ASTERISK_VALUE
   * @generated
   * @ordered
   */
  DOUBLE_ASTERISK(4, "doubleAsterisk", "doubleAsterisk");

  /**
   * The '<em><b>Display</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Display</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #DISPLAY
   * @model name="display"
   * @generated
   * @ordered
   */
  public static final int DISPLAY_VALUE = 0;

  /**
   * The '<em><b>Required</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Required</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #REQUIRED
   * @model name="required"
   * @generated
   * @ordered
   */
  public static final int REQUIRED_VALUE = 1;

  /**
   * The '<em><b>Readonly</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Readonly</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #READONLY
   * @model name="readonly"
   * @generated
   * @ordered
   */
  public static final int READONLY_VALUE = 2;

  /**
   * The '<em><b>Calculated</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Calculated</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #CALCULATED
   * @model name="calculated"
   * @generated
   * @ordered
   */
  public static final int CALCULATED_VALUE = 3;

  /**
   * The '<em><b>Double Asterisk</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Double Asterisk</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #DOUBLE_ASTERISK
   * @model name="doubleAsterisk"
   * @generated
   * @ordered
   */
  public static final int DOUBLE_ASTERISK_VALUE = 4;

  /**
   * An array of all the '<em><b>Attribute Class</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final AttributeClass[] VALUES_ARRAY =
    new AttributeClass[]
    {
      DISPLAY,
      REQUIRED,
      READONLY,
      CALCULATED,
      DOUBLE_ASTERISK,
    };

  /**
   * A public read-only list of all the '<em><b>Attribute Class</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<AttributeClass> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Attribute Class</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static AttributeClass get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      AttributeClass result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Attribute Class</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static AttributeClass getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      AttributeClass result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Attribute Class</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static AttributeClass get(int value)
  {
    switch (value)
    {
      case DISPLAY_VALUE: return DISPLAY;
      case REQUIRED_VALUE: return REQUIRED;
      case READONLY_VALUE: return READONLY;
      case CALCULATED_VALUE: return CALCULATED;
      case DOUBLE_ASTERISK_VALUE: return DOUBLE_ASTERISK;
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
  private AttributeClass(int value, String name, String literal)
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
  
} //AttributeClass
