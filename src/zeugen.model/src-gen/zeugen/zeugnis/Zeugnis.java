/**
 */
package zeugen.zeugnis;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import zeugen.configuration.Schueler;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Zeugnis</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link zeugen.zeugnis.Zeugnis#getSchueler <em>Schueler</em>}</li>
 * <li>{@link zeugen.zeugnis.Zeugnis#getBeurteilungen <em>Beurteilungen</em>}</li>
 * </ul>
 * </p>
 *
 * @see zeugen.zeugnis.ZeugnisPackage#getZeugnis()
 * @model
 * @generated
 */
public interface Zeugnis extends EObject {
	/**
	 * Returns the value of the '<em><b>Schueler</b></em>' reference. It is
	 * bidirectional and its opposite is '
	 * {@link zeugen.configuration.Schueler#getZeugnis <em>Zeugnis</em>}'. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schueler</em>' reference isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Schueler</em>' reference.
	 * @see #setSchueler(Schueler)
	 * @see zeugen.zeugnis.ZeugnisPackage#getZeugnis_Schueler()
	 * @see zeugen.configuration.Schueler#getZeugnis
	 * @model opposite="zeugnis"
	 * @generated
	 */
	Schueler getSchueler();

	/**
	 * Sets the value of the '{@link zeugen.zeugnis.Zeugnis#getSchueler
	 * <em>Schueler</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value
	 *            the new value of the '<em>Schueler</em>' reference.
	 * @see #getSchueler()
	 * @generated
	 */
	void setSchueler(Schueler value);

	/**
	 * Returns the value of the '<em><b>Beurteilungen</b></em>' containment
	 * reference list. The list contents are of type
	 * {@link zeugen.zeugnis.Beurteilung}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Beurteilungen</em>' containment reference list
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Beurteilungen</em>' containment reference
	 *         list.
	 * @see zeugen.zeugnis.ZeugnisPackage#getZeugnis_Beurteilungen()
	 * @model containment="true"
	 * @generated
	 */
	EList<Beurteilung> getBeurteilungen();

} // Zeugnis
