/**
 */
package zeugen.configuration;

import org.eclipse.emf.common.util.EList;
import zeugen.zeugnis.Klasse;
import zeugen.zeugnis.Zeugnis;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Schueler</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link zeugen.configuration.Schueler#getKlasse <em>Klasse</em>}</li>
 * <li>{@link zeugen.configuration.Schueler#getZeugnis <em>Zeugnis</em>}</li>
 * </ul>
 * </p>
 *
 * @see zeugen.configuration.ConfigurationPackage#getSchueler()
 * @model
 * @generated
 */
public interface Schueler extends Person {

	/**
	 * Returns the value of the '<em><b>Klasse</b></em>' reference. It is
	 * bidirectional and its opposite is '
	 * {@link zeugen.zeugnis.Klasse#getSchueler <em>Schueler</em>}'. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Klasse</em>' reference isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Klasse</em>' reference.
	 * @see #setKlasse(Klasse)
	 * @see zeugen.configuration.ConfigurationPackage#getSchueler_Klasse()
	 * @see zeugen.zeugnis.Klasse#getSchueler
	 * @model opposite="schueler"
	 * @generated
	 */
	Klasse getKlasse();

	/**
	 * Sets the value of the '{@link zeugen.configuration.Schueler#getKlasse
	 * <em>Klasse</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value
	 *            the new value of the '<em>Klasse</em>' reference.
	 * @see #getKlasse()
	 * @generated
	 */
	void setKlasse(Klasse value);

	/**
	 * Returns the value of the '<em><b>Zeugnis</b></em>' reference list. The
	 * list contents are of type {@link zeugen.zeugnis.Zeugnis}. It is
	 * bidirectional and its opposite is '
	 * {@link zeugen.zeugnis.Zeugnis#getSchueler <em>Schueler</em>}'. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Zeugnis</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Zeugnis</em>' reference list.
	 * @see zeugen.configuration.ConfigurationPackage#getSchueler_Zeugnis()
	 * @see zeugen.zeugnis.Zeugnis#getSchueler
	 * @model opposite="schueler"
	 * @generated
	 */
	EList<Zeugnis> getZeugnis();
} // Schueler
