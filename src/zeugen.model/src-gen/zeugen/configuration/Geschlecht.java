/**
 */
package zeugen.configuration;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc --> A representation of the literals of the enumeration '
 * <em><b>Geschlecht</b></em>', and utility methods for working with them. <!--
 * end-user-doc -->
 * 
 * @see zeugen.configuration.ConfigurationPackage#getGeschlecht()
 * @model
 * @generated
 */
public enum Geschlecht implements Enumerator {
	/**
	 * The '<em><b>MANN</b></em>' literal object. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #MANN_VALUE
	 * @generated
	 * @ordered
	 */
	MANN(1, "MANN", "MANN"),

	/**
	 * The '<em><b>FRAU</b></em>' literal object. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #FRAU_VALUE
	 * @generated
	 * @ordered
	 */
	FRAU(2, "FRAU", "FRAU"),

	/**
	 * The '<em><b>UNBEKANNT</b></em>' literal object. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #UNBEKANNT_VALUE
	 * @generated
	 * @ordered
	 */
	UNBEKANNT(0, "UNBEKANNT", "UNBEKANNT");

	/**
	 * The '<em><b>MANN</b></em>' literal value. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MANN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #MANN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MANN_VALUE = 1;

	/**
	 * The '<em><b>FRAU</b></em>' literal value. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FRAU</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #FRAU
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FRAU_VALUE = 2;

	/**
	 * The '<em><b>UNBEKANNT</b></em>' literal value. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>UNBEKANNT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #UNBEKANNT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UNBEKANNT_VALUE = 0;

	/**
	 * An array of all the '<em><b>Geschlecht</b></em>' enumerators. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private static final Geschlecht[] VALUES_ARRAY = new Geschlecht[] { MANN,
			FRAU, UNBEKANNT, };

	/**
	 * A public read-only list of all the '<em><b>Geschlecht</b></em>'
	 * enumerators. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final List<Geschlecht> VALUES = Collections
			.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Geschlecht</b></em>' literal with the specified
	 * literal value. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static Geschlecht get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Geschlecht result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Geschlecht</b></em>' literal with the specified name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static Geschlecht getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Geschlecht result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Geschlecht</b></em>' literal with the specified
	 * integer value. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static Geschlecht get(int value) {
		switch (value) {
		case MANN_VALUE:
			return MANN;
		case FRAU_VALUE:
			return FRAU;
		case UNBEKANNT_VALUE:
			return UNBEKANNT;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	private Geschlecht(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string
	 * representation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} // Geschlecht
