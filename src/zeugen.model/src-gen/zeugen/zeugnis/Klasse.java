/**
 */
package zeugen.zeugnis;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import zeugen.configuration.Klassenstufe;
import zeugen.configuration.Lehrkraft;
import zeugen.configuration.Schueler;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Klasse</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link zeugen.zeugnis.Klasse#getKlassenstufe <em>Klassenstufe</em>}</li>
 * <li>{@link zeugen.zeugnis.Klasse#getSchueler <em>Schueler</em>}</li>
 * <li>{@link zeugen.zeugnis.Klasse#getAbschluesse <em>Abschluesse</em>}</li>
 * <li>{@link zeugen.zeugnis.Klasse#getKlassenlehrer <em>Klassenlehrer</em>}</li>
 * <li>{@link zeugen.zeugnis.Klasse#getBezeichnung <em>Bezeichnung</em>}</li>
 * </ul>
 * </p>
 *
 * @see zeugen.zeugnis.ZeugnisPackage#getKlasse()
 * @model
 * @generated
 */
public interface Klasse extends EObject {
	/**
	 * Returns the value of the '<em><b>Klassenstufe</b></em>' reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Klassenstufe</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Klassenstufe</em>' reference.
	 * @see #setKlassenstufe(Klassenstufe)
	 * @see zeugen.zeugnis.ZeugnisPackage#getKlasse_Klassenstufe()
	 * @model required="true"
	 * @generated
	 */
	Klassenstufe getKlassenstufe();

	/**
	 * Sets the value of the '{@link zeugen.zeugnis.Klasse#getKlassenstufe
	 * <em>Klassenstufe</em>}' reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Klassenstufe</em>' reference.
	 * @see #getKlassenstufe()
	 * @generated
	 */
	void setKlassenstufe(Klassenstufe value);

	/**
	 * Returns the value of the '<em><b>Schueler</b></em>' reference list. The
	 * list contents are of type {@link zeugen.configuration.Schueler}. It is
	 * bidirectional and its opposite is '
	 * {@link zeugen.configuration.Schueler#getKlasse <em>Klasse</em>}'. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schueler</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Schueler</em>' reference list.
	 * @see zeugen.zeugnis.ZeugnisPackage#getKlasse_Schueler()
	 * @see zeugen.configuration.Schueler#getKlasse
	 * @model opposite="klasse"
	 * @generated
	 */
	EList<Schueler> getSchueler();

	/**
	 * Returns the value of the '<em><b>Abschluesse</b></em>' containment
	 * reference list. The list contents are of type
	 * {@link zeugen.zeugnis.Abschluss}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abschluesse</em>' containment reference list
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Abschluesse</em>' containment reference
	 *         list.
	 * @see zeugen.zeugnis.ZeugnisPackage#getKlasse_Abschluesse()
	 * @model containment="true"
	 * @generated
	 */
	EList<Abschluss> getAbschluesse();

	/**
	 * Returns the value of the '<em><b>Klassenlehrer</b></em>' reference. It is
	 * bidirectional and its opposite is '
	 * {@link zeugen.configuration.Lehrkraft#getKlasse <em>Klasse</em>}'. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Klassenlehrer</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Klassenlehrer</em>' reference.
	 * @see #setKlassenlehrer(Lehrkraft)
	 * @see zeugen.zeugnis.ZeugnisPackage#getKlasse_Klassenlehrer()
	 * @see zeugen.configuration.Lehrkraft#getKlasse
	 * @model opposite="klasse" required="true"
	 * @generated
	 */
	Lehrkraft getKlassenlehrer();

	/**
	 * Sets the value of the '{@link zeugen.zeugnis.Klasse#getKlassenlehrer
	 * <em>Klassenlehrer</em>}' reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Klassenlehrer</em>' reference.
	 * @see #getKlassenlehrer()
	 * @generated
	 */
	void setKlassenlehrer(Lehrkraft value);

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
	 * @see zeugen.zeugnis.ZeugnisPackage#getKlasse_Bezeichnung()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getBezeichnung();

	/**
	 * Sets the value of the '{@link zeugen.zeugnis.Klasse#getBezeichnung
	 * <em>Bezeichnung</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Bezeichnung</em>' attribute.
	 * @see #getBezeichnung()
	 * @generated
	 */
	void setBezeichnung(String value);

} // Klasse
