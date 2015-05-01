/**
 */
package configuration;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Notentyp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link configuration.Notentyp#getName <em>Name</em>}</li>
 *   <li>{@link configuration.Notentyp#getTyp <em>Typ</em>}</li>
 *   <li>{@link configuration.Notentyp#getKlassenstufen <em>Klassenstufen</em>}</li>
 * </ul>
 * </p>
 *
 * @see configuration.ConfigurationPackage#getNotentyp()
 * @model
 * @generated
 */
public interface Notentyp extends EObject {
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
	 * @see configuration.ConfigurationPackage#getNotentyp_Name()
	 * @model id="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link configuration.Notentyp#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Typ</b></em>' attribute.
	 * The default value is <code>"SCHULFACH"</code>.
	 * The literals are from the enumeration {@link configuration.FachTyp}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Typ</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Typ</em>' attribute.
	 * @see configuration.FachTyp
	 * @see #setTyp(FachTyp)
	 * @see configuration.ConfigurationPackage#getNotentyp_Typ()
	 * @model default="SCHULFACH" required="true"
	 * @generated
	 */
	FachTyp getTyp();

	/**
	 * Sets the value of the '{@link configuration.Notentyp#getTyp <em>Typ</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Typ</em>' attribute.
	 * @see configuration.FachTyp
	 * @see #getTyp()
	 * @generated
	 */
	void setTyp(FachTyp value);

	/**
	 * Returns the value of the '<em><b>Klassenstufen</b></em>' reference list.
	 * The list contents are of type {@link configuration.Klassenstufe}.
	 * It is bidirectional and its opposite is '{@link configuration.Klassenstufe#getNotentypen <em>Notentypen</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Klassenstufen</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Klassenstufen</em>' reference list.
	 * @see configuration.ConfigurationPackage#getNotentyp_Klassenstufen()
	 * @see configuration.Klassenstufe#getNotentypen
	 * @model opposite="notentypen"
	 * @generated
	 */
	EList<Klassenstufe> getKlassenstufen();

} // Notentyp
