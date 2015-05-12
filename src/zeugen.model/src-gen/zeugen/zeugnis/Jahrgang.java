/**
 */
package zeugen.zeugnis;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Jahrgang</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link zeugen.zeugnis.Jahrgang#getBezeichnung <em>Bezeichnung</em>}</li>
 * <li>{@link zeugen.zeugnis.Jahrgang#getKlassen <em>Klassen</em>}</li>
 * </ul>
 * </p>
 *
 * @see zeugen.zeugnis.ZeugnisPackage#getJahrgang()
 * @model
 * @generated
 */
public interface Jahrgang extends EObject {
	/**
	 * Returns the value of the '<em><b>Bezeichnung</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bezeichnung</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Bezeichnung</em>' attribute.
	 * @see #setBezeichnung(String)
	 * @see zeugen.zeugnis.ZeugnisPackage#getJahrgang_Bezeichnung()
	 * @model required="true"
	 * @generated
	 */
	String getBezeichnung();

	/**
	 * Sets the value of the '{@link zeugen.zeugnis.Jahrgang#getBezeichnung
	 * <em>Bezeichnung</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Bezeichnung</em>' attribute.
	 * @see #getBezeichnung()
	 * @generated
	 */
	void setBezeichnung(String value);

	/**
	 * Returns the value of the '<em><b>Klassen</b></em>' containment reference
	 * list. The list contents are of type {@link zeugen.zeugnis.Klasse}. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Klassen</em>' containment reference list isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Klassen</em>' containment reference list.
	 * @see zeugen.zeugnis.ZeugnisPackage#getJahrgang_Klassen()
	 * @model containment="true"
	 * @generated
	 */
	EList<Klasse> getKlassen();

} // Jahrgang
