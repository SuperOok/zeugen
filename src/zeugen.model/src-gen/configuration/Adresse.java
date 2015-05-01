/**
 */
package configuration;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Adresse</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link configuration.Adresse#getStrasse <em>Strasse</em>}</li>
 *   <li>{@link configuration.Adresse#getPostleitzahl <em>Postleitzahl</em>}</li>
 *   <li>{@link configuration.Adresse#getStadt <em>Stadt</em>}</li>
 * </ul>
 * </p>
 *
 * @see configuration.ConfigurationPackage#getAdresse()
 * @model
 * @generated
 */
public interface Adresse extends EObject {
	/**
	 * Returns the value of the '<em><b>Strasse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Strasse</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Strasse</em>' attribute.
	 * @see #setStrasse(String)
	 * @see configuration.ConfigurationPackage#getAdresse_Strasse()
	 * @model required="true"
	 * @generated
	 */
	String getStrasse();

	/**
	 * Sets the value of the '{@link configuration.Adresse#getStrasse <em>Strasse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strasse</em>' attribute.
	 * @see #getStrasse()
	 * @generated
	 */
	void setStrasse(String value);

	/**
	 * Returns the value of the '<em><b>Postleitzahl</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Postleitzahl</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Postleitzahl</em>' attribute.
	 * @see #setPostleitzahl(String)
	 * @see configuration.ConfigurationPackage#getAdresse_Postleitzahl()
	 * @model required="true"
	 * @generated
	 */
	String getPostleitzahl();

	/**
	 * Sets the value of the '{@link configuration.Adresse#getPostleitzahl <em>Postleitzahl</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Postleitzahl</em>' attribute.
	 * @see #getPostleitzahl()
	 * @generated
	 */
	void setPostleitzahl(String value);

	/**
	 * Returns the value of the '<em><b>Stadt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stadt</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stadt</em>' attribute.
	 * @see #setStadt(String)
	 * @see configuration.ConfigurationPackage#getAdresse_Stadt()
	 * @model required="true"
	 * @generated
	 */
	String getStadt();

	/**
	 * Sets the value of the '{@link configuration.Adresse#getStadt <em>Stadt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stadt</em>' attribute.
	 * @see #getStadt()
	 * @generated
	 */
	void setStadt(String value);

} // Adresse
