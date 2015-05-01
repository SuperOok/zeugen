/**
 */
package configuration;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Schule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link configuration.Schule#getName <em>Name</em>}</li>
 *   <li>{@link configuration.Schule#getAdresse <em>Adresse</em>}</li>
 *   <li>{@link configuration.Schule#getLehrer <em>Lehrer</em>}</li>
 *   <li>{@link configuration.Schule#getSchulleiter <em>Schulleiter</em>}</li>
 *   <li>{@link configuration.Schule#getKlassenstufen <em>Klassenstufen</em>}</li>
 *   <li>{@link configuration.Schule#getFaecher <em>Faecher</em>}</li>
 * </ul>
 * </p>
 *
 * @see configuration.ConfigurationPackage#getSchule()
 * @model
 * @generated
 */
public interface Schule extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see configuration.ConfigurationPackage#getSchule_Name()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link configuration.Schule#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Adresse</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Adresse</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Adresse</em>' containment reference.
	 * @see #setAdresse(Adresse)
	 * @see configuration.ConfigurationPackage#getSchule_Adresse()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Adresse getAdresse();

	/**
	 * Sets the value of the '{@link configuration.Schule#getAdresse <em>Adresse</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Adresse</em>' containment reference.
	 * @see #getAdresse()
	 * @generated
	 */
	void setAdresse(Adresse value);

	/**
	 * Returns the value of the '<em><b>Lehrer</b></em>' containment reference list.
	 * The list contents are of type {@link configuration.Lehrkraft}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lehrer</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lehrer</em>' containment reference list.
	 * @see configuration.ConfigurationPackage#getSchule_Lehrer()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Lehrkraft> getLehrer();

	/**
	 * Returns the value of the '<em><b>Schulleiter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schulleiter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schulleiter</em>' containment reference.
	 * @see #setSchulleiter(Lehrkraft)
	 * @see configuration.ConfigurationPackage#getSchule_Schulleiter()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Lehrkraft getSchulleiter();

	/**
	 * Sets the value of the '{@link configuration.Schule#getSchulleiter <em>Schulleiter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schulleiter</em>' containment reference.
	 * @see #getSchulleiter()
	 * @generated
	 */
	void setSchulleiter(Lehrkraft value);

	/**
	 * Returns the value of the '<em><b>Klassenstufen</b></em>' containment reference list.
	 * The list contents are of type {@link configuration.Klassenstufe}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Klassenstufen</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Klassenstufen</em>' containment reference list.
	 * @see configuration.ConfigurationPackage#getSchule_Klassenstufen()
	 * @model containment="true"
	 * @generated
	 */
	EList<Klassenstufe> getKlassenstufen();

	/**
	 * Returns the value of the '<em><b>Faecher</b></em>' containment reference list.
	 * The list contents are of type {@link configuration.Notentyp}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Faecher</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Faecher</em>' containment reference list.
	 * @see configuration.ConfigurationPackage#getSchule_Faecher()
	 * @model containment="true"
	 * @generated
	 */
	EList<Notentyp> getFaecher();

} // Schule
