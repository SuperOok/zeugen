/**
 */
package configuration;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link configuration.Person#getVorname <em>Vorname</em>}</li>
 *   <li>{@link configuration.Person#getNachname <em>Nachname</em>}</li>
 *   <li>{@link configuration.Person#getGeburtstag <em>Geburtstag</em>}</li>
 *   <li>{@link configuration.Person#getGeburtsort <em>Geburtsort</em>}</li>
 *   <li>{@link configuration.Person#getName <em>Name</em>}</li>
 *   <li>{@link configuration.Person#getGeschlecht <em>Geschlecht</em>}</li>
 *   <li>{@link configuration.Person#getNamenszusatz <em>Namenszusatz</em>}</li>
 * </ul>
 * </p>
 *
 * @see configuration.ConfigurationPackage#getPerson()
 * @model
 * @generated
 */
public interface Person extends EObject {
	/**
	 * Returns the value of the '<em><b>Vorname</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vorname</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vorname</em>' attribute list.
	 * @see configuration.ConfigurationPackage#getPerson_Vorname()
	 * @model required="true"
	 * @generated
	 */
	EList<String> getVorname();

	/**
	 * Returns the value of the '<em><b>Nachname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nachname</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nachname</em>' attribute.
	 * @see #setNachname(String)
	 * @see configuration.ConfigurationPackage#getPerson_Nachname()
	 * @model required="true"
	 * @generated
	 */
	String getNachname();

	/**
	 * Sets the value of the '{@link configuration.Person#getNachname <em>Nachname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nachname</em>' attribute.
	 * @see #getNachname()
	 * @generated
	 */
	void setNachname(String value);

	/**
	 * Returns the value of the '<em><b>Geburtstag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Geburtstag</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Geburtstag</em>' attribute.
	 * @see #setGeburtstag(Date)
	 * @see configuration.ConfigurationPackage#getPerson_Geburtstag()
	 * @model
	 * @generated
	 */
	Date getGeburtstag();

	/**
	 * Sets the value of the '{@link configuration.Person#getGeburtstag <em>Geburtstag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geburtstag</em>' attribute.
	 * @see #getGeburtstag()
	 * @generated
	 */
	void setGeburtstag(Date value);

	/**
	 * Returns the value of the '<em><b>Geburtsort</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Geburtsort</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Geburtsort</em>' attribute.
	 * @see #setGeburtsort(String)
	 * @see configuration.ConfigurationPackage#getPerson_Geburtsort()
	 * @model
	 * @generated
	 */
	String getGeburtsort();

	/**
	 * Sets the value of the '{@link configuration.Person#getGeburtsort <em>Geburtsort</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geburtsort</em>' attribute.
	 * @see #getGeburtsort()
	 * @generated
	 */
	void setGeburtsort(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see configuration.ConfigurationPackage#getPerson_Name()
	 * @model id="true" required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getName();

	/**
	 * Returns the value of the '<em><b>Geschlecht</b></em>' attribute.
	 * The default value is <code>"UNBEKANNT"</code>.
	 * The literals are from the enumeration {@link configuration.Geschlecht}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Geschlecht</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Geschlecht</em>' attribute.
	 * @see configuration.Geschlecht
	 * @see #isSetGeschlecht()
	 * @see #unsetGeschlecht()
	 * @see #setGeschlecht(Geschlecht)
	 * @see configuration.ConfigurationPackage#getPerson_Geschlecht()
	 * @model default="UNBEKANNT" unsettable="true" required="true"
	 * @generated
	 */
	Geschlecht getGeschlecht();

	/**
	 * Sets the value of the '{@link configuration.Person#getGeschlecht <em>Geschlecht</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geschlecht</em>' attribute.
	 * @see configuration.Geschlecht
	 * @see #isSetGeschlecht()
	 * @see #unsetGeschlecht()
	 * @see #getGeschlecht()
	 * @generated
	 */
	void setGeschlecht(Geschlecht value);

	/**
	 * Unsets the value of the '{@link configuration.Person#getGeschlecht <em>Geschlecht</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetGeschlecht()
	 * @see #getGeschlecht()
	 * @see #setGeschlecht(Geschlecht)
	 * @generated
	 */
	void unsetGeschlecht();

	/**
	 * Returns whether the value of the '{@link configuration.Person#getGeschlecht <em>Geschlecht</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Geschlecht</em>' attribute is set.
	 * @see #unsetGeschlecht()
	 * @see #getGeschlecht()
	 * @see #setGeschlecht(Geschlecht)
	 * @generated
	 */
	boolean isSetGeschlecht();

	/**
	 * Returns the value of the '<em><b>Namenszusatz</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Namenszusatz</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Namenszusatz</em>' attribute.
	 * @see #setNamenszusatz(String)
	 * @see configuration.ConfigurationPackage#getPerson_Namenszusatz()
	 * @model
	 * @generated
	 */
	String getNamenszusatz();

	/**
	 * Sets the value of the '{@link configuration.Person#getNamenszusatz <em>Namenszusatz</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Namenszusatz</em>' attribute.
	 * @see #getNamenszusatz()
	 * @generated
	 */
	void setNamenszusatz(String value);

} // Person
