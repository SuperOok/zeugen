/**
 */
package zeugen.zeugnis;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc --> A representation of the literals of the enumeration '
 * <em><b>Abschluss Typ</b></em>', and utility methods for working with them.
 * <!-- end-user-doc -->
 * 
 * @see zeugen.zeugnis.ZeugnisPackage#getAbschlussTyp()
 * @model
 * @generated
 */
public enum AbschlussTyp implements Enumerator {
	/**
	 * The '<em><b>HALBJAHR</b></em>' literal object. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #HALBJAHR_VALUE
	 * @generated
	 * @ordered
	 */
	HALBJAHR(0, "HALBJAHR", "HALBJAHR"),

	/**
	 * The '<em><b>GANZJAHR</b></em>' literal object. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #GANZJAHR_VALUE
	 * @generated
	 * @ordered
	 */
	GANZJAHR(1, "GANZJAHR", "GANZJAHR");

	/**
	 * The '<em><b>HALBJAHR</b></em>' literal value. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>HALBJAHR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #HALBJAHR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HALBJAHR_VALUE = 0;

	/**
	 * The '<em><b>GANZJAHR</b></em>' literal value. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>GANZJAHR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #GANZJAHR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GANZJAHR_VALUE = 1;

	/**
	 * An array of all the '<em><b>Abschluss Typ</b></em>' enumerators. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private static final AbschlussTyp[] VALUES_ARRAY = new AbschlussTyp[] {
			HALBJAHR, GANZJAHR, };

	/**
	 * A public read-only list of all the '<em><b>Abschluss Typ</b></em>'
	 * enumerators. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final List<AbschlussTyp> VALUES = Collections
			.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Abschluss Typ</b></em>' literal with the specified
	 * literal value. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static AbschlussTyp get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AbschlussTyp result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Abschluss Typ</b></em>' literal with the specified
	 * name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static AbschlussTyp getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AbschlussTyp result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Abschluss Typ</b></em>' literal with the specified
	 * integer value. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static AbschlussTyp get(int value) {
		switch (value) {
		case HALBJAHR_VALUE:
			return HALBJAHR;
		case GANZJAHR_VALUE:
			return GANZJAHR;
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
	private AbschlussTyp(int value, String name, String literal) {
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

} // AbschlussTyp
