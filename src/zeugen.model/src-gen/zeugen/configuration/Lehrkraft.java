/**
 */
package zeugen.configuration;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Lehrkraft</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link zeugen.configuration.Lehrkraft#getFaecher <em>Faecher</em>}</li>
 * </ul>
 * </p>
 *
 * @see zeugen.configuration.ConfigurationPackage#getLehrkraft()
 * @model
 * @generated
 */
public interface Lehrkraft extends Person {

	/**
	 * Returns the value of the '<em><b>Faecher</b></em>' reference list. The
	 * list contents are of type {@link zeugen.configuration.Notentyp}. It is
	 * bidirectional and its opposite is '
	 * {@link zeugen.configuration.Notentyp#getLehrkraefte <em>Lehrkraefte</em>}
	 * '. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Faecher</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Faecher</em>' reference list.
	 * @see zeugen.configuration.ConfigurationPackage#getLehrkraft_Faecher()
	 * @see zeugen.configuration.Notentyp#getLehrkraefte
	 * @model opposite="lehrkraefte"
	 * @generated
	 */
	EList<Notentyp> getFaecher();
} // Lehrkraft
