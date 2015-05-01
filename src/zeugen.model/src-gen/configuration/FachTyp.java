/**
 */
package configuration;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Fach Typ</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see configuration.ConfigurationPackage#getFachTyp()
 * @model
 * @generated
 */
public enum FachTyp implements Enumerator {
	/**
	 * The '<em><b>SCHULFACH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SCHULFACH_VALUE
	 * @generated
	 * @ordered
	 */
	SCHULFACH(0, "SCHULFACH", "SCHULFACH"),

	/**
	 * The '<em><b>ARBEITSGEMEINSCHAFT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ARBEITSGEMEINSCHAFT_VALUE
	 * @generated
	 * @ordered
	 */
	ARBEITSGEMEINSCHAFT(1, "ARBEITSGEMEINSCHAFT", "ARBEITSGEMEINSCHAFT"),

	/**
	 * The '<em><b>ANDERE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANDERE_VALUE
	 * @generated
	 * @ordered
	 */
	ANDERE(2, "ANDERE", "ANDERE");

	/**
	 * The '<em><b>SCHULFACH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SCHULFACH</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SCHULFACH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SCHULFACH_VALUE = 0;

	/**
	 * The '<em><b>ARBEITSGEMEINSCHAFT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ARBEITSGEMEINSCHAFT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ARBEITSGEMEINSCHAFT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ARBEITSGEMEINSCHAFT_VALUE = 1;

	/**
	 * The '<em><b>ANDERE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ANDERE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ANDERE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ANDERE_VALUE = 2;

	/**
	 * An array of all the '<em><b>Fach Typ</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final FachTyp[] VALUES_ARRAY =
		new FachTyp[] {
			SCHULFACH,
			ARBEITSGEMEINSCHAFT,
			ANDERE,
		};

	/**
	 * A public read-only list of all the '<em><b>Fach Typ</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<FachTyp> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Fach Typ</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FachTyp get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FachTyp result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Fach Typ</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FachTyp getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FachTyp result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Fach Typ</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FachTyp get(int value) {
		switch (value) {
			case SCHULFACH_VALUE: return SCHULFACH;
			case ARBEITSGEMEINSCHAFT_VALUE: return ARBEITSGEMEINSCHAFT;
			case ANDERE_VALUE: return ANDERE;
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
	private FachTyp(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //FachTyp
