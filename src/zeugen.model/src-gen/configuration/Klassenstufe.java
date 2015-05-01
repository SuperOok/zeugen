/**
 */
package configuration;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Klassenstufe</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link configuration.Klassenstufe#getBezeichnung <em>Bezeichnung</em>}</li>
 *   <li>{@link configuration.Klassenstufe#getAnzeigename <em>Anzeigename</em>}</li>
 *   <li>{@link configuration.Klassenstufe#getNotentypen <em>Notentypen</em>}</li>
 * </ul>
 * </p>
 *
 * @see configuration.ConfigurationPackage#getKlassenstufe()
 * @model
 * @generated
 */
public interface Klassenstufe extends EObject {
	/**
	 * Returns the value of the '<em><b>Bezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bezeichnung</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bezeichnung</em>' attribute.
	 * @see #setBezeichnung(String)
	 * @see configuration.ConfigurationPackage#getKlassenstufe_Bezeichnung()
	 * @model
	 * @generated
	 */
	String getBezeichnung();

	/**
	 * Sets the value of the '{@link configuration.Klassenstufe#getBezeichnung <em>Bezeichnung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bezeichnung</em>' attribute.
	 * @see #getBezeichnung()
	 * @generated
	 */
	void setBezeichnung(String value);

	/**
	 * Returns the value of the '<em><b>Anzeigename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Anzeigename</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Anzeigename</em>' attribute.
	 * @see #setAnzeigename(String)
	 * @see configuration.ConfigurationPackage#getKlassenstufe_Anzeigename()
	 * @model
	 * @generated
	 */
	String getAnzeigename();

	/**
	 * Sets the value of the '{@link configuration.Klassenstufe#getAnzeigename <em>Anzeigename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anzeigename</em>' attribute.
	 * @see #getAnzeigename()
	 * @generated
	 */
	void setAnzeigename(String value);

	/**
	 * Returns the value of the '<em><b>Notentypen</b></em>' reference list.
	 * The list contents are of type {@link configuration.Notentyp}.
	 * It is bidirectional and its opposite is '{@link configuration.Notentyp#getKlassenstufen <em>Klassenstufen</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Notentypen</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notentypen</em>' reference list.
	 * @see configuration.ConfigurationPackage#getKlassenstufe_Notentypen()
	 * @see configuration.Notentyp#getKlassenstufen
	 * @model opposite="klassenstufen"
	 * @generated
	 */
	EList<Notentyp> getNotentypen();

} // Klassenstufe
