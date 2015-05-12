/**
 */
package zeugen.zeugnis;

import org.eclipse.emf.ecore.EObject;

import zeugen.configuration.Notentyp;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Beurteilung</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link zeugen.zeugnis.Beurteilung#getNotentyp <em>Notentyp</em>}</li>
 * </ul>
 * </p>
 *
 * @see zeugen.zeugnis.ZeugnisPackage#getBeurteilung()
 * @model
 * @generated
 */
public interface Beurteilung extends EObject {
	/**
	 * Returns the value of the '<em><b>Notentyp</b></em>' reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Notentyp</em>' reference isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Notentyp</em>' reference.
	 * @see #setNotentyp(Notentyp)
	 * @see zeugen.zeugnis.ZeugnisPackage#getBeurteilung_Notentyp()
	 * @model required="true"
	 * @generated
	 */
	Notentyp getNotentyp();

	/**
	 * Sets the value of the '{@link zeugen.zeugnis.Beurteilung#getNotentyp
	 * <em>Notentyp</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value
	 *            the new value of the '<em>Notentyp</em>' reference.
	 * @see #getNotentyp()
	 * @generated
	 */
	void setNotentyp(Notentyp value);

} // Beurteilung
