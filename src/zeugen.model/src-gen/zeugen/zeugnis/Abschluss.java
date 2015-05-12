/**
 */
package zeugen.zeugnis;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Abschluss</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link zeugen.zeugnis.Abschluss#getTyp <em>Typ</em>}</li>
 * <li>{@link zeugen.zeugnis.Abschluss#getZeugnisse <em>Zeugnisse</em>}</li>
 * </ul>
 * </p>
 *
 * @see zeugen.zeugnis.ZeugnisPackage#getAbschluss()
 * @model
 * @generated
 */
public interface Abschluss extends EObject {
	/**
	 * Returns the value of the '<em><b>Typ</b></em>' attribute. The literals
	 * are from the enumeration {@link zeugen.zeugnis.AbschlussTyp}. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Typ</em>' attribute isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Typ</em>' attribute.
	 * @see zeugen.zeugnis.AbschlussTyp
	 * @see #setTyp(AbschlussTyp)
	 * @see zeugen.zeugnis.ZeugnisPackage#getAbschluss_Typ()
	 * @model required="true"
	 * @generated
	 */
	AbschlussTyp getTyp();

	/**
	 * Sets the value of the '{@link zeugen.zeugnis.Abschluss#getTyp
	 * <em>Typ</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Typ</em>' attribute.
	 * @see zeugen.zeugnis.AbschlussTyp
	 * @see #getTyp()
	 * @generated
	 */
	void setTyp(AbschlussTyp value);

	/**
	 * Returns the value of the '<em><b>Zeugnisse</b></em>' containment
	 * reference list. The list contents are of type
	 * {@link zeugen.zeugnis.Zeugnis}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Zeugnisse</em>' containment reference list
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Zeugnisse</em>' containment reference list.
	 * @see zeugen.zeugnis.ZeugnisPackage#getAbschluss_Zeugnisse()
	 * @model containment="true"
	 * @generated
	 */
	EList<Zeugnis> getZeugnisse();

} // Abschluss
