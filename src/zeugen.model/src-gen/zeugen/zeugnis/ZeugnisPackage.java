/**
 */
package zeugen.zeugnis;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc --> The <b>Package</b> for the model. It contains
 * accessors for the meta objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each operation of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * 
 * @see zeugen.zeugnis.ZeugnisFactory
 * @model kind="package"
 * @generated
 */
public interface ZeugnisPackage extends EPackage {
	/**
	 * The package name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNAME = "zeugnis";

	/**
	 * The package namespace URI. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_URI = "http://zeugen.zeugnis/1_0";

	/**
	 * The package namespace name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_PREFIX = "zeugen.zeugnis";

	/**
	 * The singleton instance of the package. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	ZeugnisPackage eINSTANCE = zeugen.zeugnis.impl.ZeugnisPackageImpl.init();

	/**
	 * The meta object id for the '{@link zeugen.zeugnis.impl.KlasseImpl
	 * <em>Klasse</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see zeugen.zeugnis.impl.KlasseImpl
	 * @see zeugen.zeugnis.impl.ZeugnisPackageImpl#getKlasse()
	 * @generated
	 */
	int KLASSE = 0;

	/**
	 * The feature id for the '<em><b>Klassenstufe</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int KLASSE__KLASSENSTUFE = 0;

	/**
	 * The feature id for the '<em><b>Schueler</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int KLASSE__SCHUELER = 1;

	/**
	 * The feature id for the '<em><b>Abschluesse</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int KLASSE__ABSCHLUESSE = 2;

	/**
	 * The feature id for the '<em><b>Klassenlehrer</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int KLASSE__KLASSENLEHRER = 3;

	/**
	 * The feature id for the '<em><b>Bezeichnung</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int KLASSE__BEZEICHNUNG = 4;

	/**
	 * The number of structural features of the '<em>Klasse</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int KLASSE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Klasse</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int KLASSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link zeugen.zeugnis.impl.JahrgangImpl
	 * <em>Jahrgang</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see zeugen.zeugnis.impl.JahrgangImpl
	 * @see zeugen.zeugnis.impl.ZeugnisPackageImpl#getJahrgang()
	 * @generated
	 */
	int JAHRGANG = 1;

	/**
	 * The feature id for the '<em><b>Bezeichnung</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int JAHRGANG__BEZEICHNUNG = 0;

	/**
	 * The feature id for the '<em><b>Klassen</b></em>' containment reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int JAHRGANG__KLASSEN = 1;

	/**
	 * The number of structural features of the '<em>Jahrgang</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int JAHRGANG_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Jahrgang</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int JAHRGANG_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link zeugen.zeugnis.impl.AbschlussImpl
	 * <em>Abschluss</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see zeugen.zeugnis.impl.AbschlussImpl
	 * @see zeugen.zeugnis.impl.ZeugnisPackageImpl#getAbschluss()
	 * @generated
	 */
	int ABSCHLUSS = 2;

	/**
	 * The feature id for the '<em><b>Typ</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ABSCHLUSS__TYP = 0;

	/**
	 * The feature id for the '<em><b>Zeugnisse</b></em>' containment reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ABSCHLUSS__ZEUGNISSE = 1;

	/**
	 * The number of structural features of the '<em>Abschluss</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ABSCHLUSS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Abschluss</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ABSCHLUSS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link zeugen.zeugnis.impl.ZeugnisImpl
	 * <em>Zeugnis</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see zeugen.zeugnis.impl.ZeugnisImpl
	 * @see zeugen.zeugnis.impl.ZeugnisPackageImpl#getZeugnis()
	 * @generated
	 */
	int ZEUGNIS = 3;

	/**
	 * The feature id for the '<em><b>Schueler</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ZEUGNIS__SCHUELER = 0;

	/**
	 * The feature id for the '<em><b>Beurteilungen</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ZEUGNIS__BEURTEILUNGEN = 1;

	/**
	 * The number of structural features of the '<em>Zeugnis</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ZEUGNIS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Zeugnis</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ZEUGNIS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link zeugen.zeugnis.impl.BeurteilungImpl
	 * <em>Beurteilung</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see zeugen.zeugnis.impl.BeurteilungImpl
	 * @see zeugen.zeugnis.impl.ZeugnisPackageImpl#getBeurteilung()
	 * @generated
	 */
	int BEURTEILUNG = 4;

	/**
	 * The feature id for the '<em><b>Notentyp</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BEURTEILUNG__NOTENTYP = 0;

	/**
	 * The number of structural features of the '<em>Beurteilung</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BEURTEILUNG_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Beurteilung</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BEURTEILUNG_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link zeugen.zeugnis.impl.NoteImpl
	 * <em>Note</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see zeugen.zeugnis.impl.NoteImpl
	 * @see zeugen.zeugnis.impl.ZeugnisPackageImpl#getNote()
	 * @generated
	 */
	int NOTE = 5;

	/**
	 * The feature id for the '<em><b>Notentyp</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NOTE__NOTENTYP = BEURTEILUNG__NOTENTYP;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NOTE__WERT = BEURTEILUNG_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Note</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NOTE_FEATURE_COUNT = BEURTEILUNG_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Note</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NOTE_OPERATION_COUNT = BEURTEILUNG_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link zeugen.zeugnis.impl.FormulierungImpl
	 * <em>Formulierung</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see zeugen.zeugnis.impl.FormulierungImpl
	 * @see zeugen.zeugnis.impl.ZeugnisPackageImpl#getFormulierung()
	 * @generated
	 */
	int FORMULIERUNG = 6;

	/**
	 * The feature id for the '<em><b>Notentyp</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FORMULIERUNG__NOTENTYP = BEURTEILUNG__NOTENTYP;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FORMULIERUNG__WERT = BEURTEILUNG_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Formulierung</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FORMULIERUNG_FEATURE_COUNT = BEURTEILUNG_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Formulierung</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FORMULIERUNG_OPERATION_COUNT = BEURTEILUNG_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link zeugen.zeugnis.AbschlussTyp
	 * <em>Abschluss Typ</em>}' enum. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see zeugen.zeugnis.AbschlussTyp
	 * @see zeugen.zeugnis.impl.ZeugnisPackageImpl#getAbschlussTyp()
	 * @generated
	 */
	int ABSCHLUSS_TYP = 7;

	/**
	 * Returns the meta object for class '{@link zeugen.zeugnis.Klasse
	 * <em>Klasse</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Klasse</em>'.
	 * @see zeugen.zeugnis.Klasse
	 * @generated
	 */
	EClass getKlasse();

	/**
	 * Returns the meta object for the reference '
	 * {@link zeugen.zeugnis.Klasse#getKlassenstufe <em>Klassenstufe</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Klassenstufe</em>'.
	 * @see zeugen.zeugnis.Klasse#getKlassenstufe()
	 * @see #getKlasse()
	 * @generated
	 */
	EReference getKlasse_Klassenstufe();

	/**
	 * Returns the meta object for the reference list '
	 * {@link zeugen.zeugnis.Klasse#getSchueler <em>Schueler</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Schueler</em>'.
	 * @see zeugen.zeugnis.Klasse#getSchueler()
	 * @see #getKlasse()
	 * @generated
	 */
	EReference getKlasse_Schueler();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link zeugen.zeugnis.Klasse#getAbschluesse <em>Abschluesse</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '
	 *         <em>Abschluesse</em>'.
	 * @see zeugen.zeugnis.Klasse#getAbschluesse()
	 * @see #getKlasse()
	 * @generated
	 */
	EReference getKlasse_Abschluesse();

	/**
	 * Returns the meta object for the reference '
	 * {@link zeugen.zeugnis.Klasse#getKlassenlehrer <em>Klassenlehrer</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Klassenlehrer</em>'.
	 * @see zeugen.zeugnis.Klasse#getKlassenlehrer()
	 * @see #getKlasse()
	 * @generated
	 */
	EReference getKlasse_Klassenlehrer();

	/**
	 * Returns the meta object for the attribute '
	 * {@link zeugen.zeugnis.Klasse#getBezeichnung <em>Bezeichnung</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Bezeichnung</em>'.
	 * @see zeugen.zeugnis.Klasse#getBezeichnung()
	 * @see #getKlasse()
	 * @generated
	 */
	EAttribute getKlasse_Bezeichnung();

	/**
	 * Returns the meta object for class '{@link zeugen.zeugnis.Jahrgang
	 * <em>Jahrgang</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Jahrgang</em>'.
	 * @see zeugen.zeugnis.Jahrgang
	 * @generated
	 */
	EClass getJahrgang();

	/**
	 * Returns the meta object for the attribute '
	 * {@link zeugen.zeugnis.Jahrgang#getBezeichnung <em>Bezeichnung</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Bezeichnung</em>'.
	 * @see zeugen.zeugnis.Jahrgang#getBezeichnung()
	 * @see #getJahrgang()
	 * @generated
	 */
	EAttribute getJahrgang_Bezeichnung();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link zeugen.zeugnis.Jahrgang#getKlassen <em>Klassen</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '
	 *         <em>Klassen</em>'.
	 * @see zeugen.zeugnis.Jahrgang#getKlassen()
	 * @see #getJahrgang()
	 * @generated
	 */
	EReference getJahrgang_Klassen();

	/**
	 * Returns the meta object for class '{@link zeugen.zeugnis.Abschluss
	 * <em>Abschluss</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Abschluss</em>'.
	 * @see zeugen.zeugnis.Abschluss
	 * @generated
	 */
	EClass getAbschluss();

	/**
	 * Returns the meta object for the attribute '
	 * {@link zeugen.zeugnis.Abschluss#getTyp <em>Typ</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Typ</em>'.
	 * @see zeugen.zeugnis.Abschluss#getTyp()
	 * @see #getAbschluss()
	 * @generated
	 */
	EAttribute getAbschluss_Typ();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link zeugen.zeugnis.Abschluss#getZeugnisse <em>Zeugnisse</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '
	 *         <em>Zeugnisse</em>'.
	 * @see zeugen.zeugnis.Abschluss#getZeugnisse()
	 * @see #getAbschluss()
	 * @generated
	 */
	EReference getAbschluss_Zeugnisse();

	/**
	 * Returns the meta object for class '{@link zeugen.zeugnis.Zeugnis
	 * <em>Zeugnis</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Zeugnis</em>'.
	 * @see zeugen.zeugnis.Zeugnis
	 * @generated
	 */
	EClass getZeugnis();

	/**
	 * Returns the meta object for the reference '
	 * {@link zeugen.zeugnis.Zeugnis#getSchueler <em>Schueler</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Schueler</em>'.
	 * @see zeugen.zeugnis.Zeugnis#getSchueler()
	 * @see #getZeugnis()
	 * @generated
	 */
	EReference getZeugnis_Schueler();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link zeugen.zeugnis.Zeugnis#getBeurteilungen <em>Beurteilungen</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '
	 *         <em>Beurteilungen</em>'.
	 * @see zeugen.zeugnis.Zeugnis#getBeurteilungen()
	 * @see #getZeugnis()
	 * @generated
	 */
	EReference getZeugnis_Beurteilungen();

	/**
	 * Returns the meta object for class '{@link zeugen.zeugnis.Beurteilung
	 * <em>Beurteilung</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Beurteilung</em>'.
	 * @see zeugen.zeugnis.Beurteilung
	 * @generated
	 */
	EClass getBeurteilung();

	/**
	 * Returns the meta object for the reference '
	 * {@link zeugen.zeugnis.Beurteilung#getNotentyp <em>Notentyp</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Notentyp</em>'.
	 * @see zeugen.zeugnis.Beurteilung#getNotentyp()
	 * @see #getBeurteilung()
	 * @generated
	 */
	EReference getBeurteilung_Notentyp();

	/**
	 * Returns the meta object for class '{@link zeugen.zeugnis.Note
	 * <em>Note</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Note</em>'.
	 * @see zeugen.zeugnis.Note
	 * @generated
	 */
	EClass getNote();

	/**
	 * Returns the meta object for the attribute '
	 * {@link zeugen.zeugnis.Note#getWert <em>Wert</em>}'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see zeugen.zeugnis.Note#getWert()
	 * @see #getNote()
	 * @generated
	 */
	EAttribute getNote_Wert();

	/**
	 * Returns the meta object for class '{@link zeugen.zeugnis.Formulierung
	 * <em>Formulierung</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Formulierung</em>'.
	 * @see zeugen.zeugnis.Formulierung
	 * @generated
	 */
	EClass getFormulierung();

	/**
	 * Returns the meta object for the attribute '
	 * {@link zeugen.zeugnis.Formulierung#getWert <em>Wert</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see zeugen.zeugnis.Formulierung#getWert()
	 * @see #getFormulierung()
	 * @generated
	 */
	EAttribute getFormulierung_Wert();

	/**
	 * Returns the meta object for enum '{@link zeugen.zeugnis.AbschlussTyp
	 * <em>Abschluss Typ</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for enum '<em>Abschluss Typ</em>'.
	 * @see zeugen.zeugnis.AbschlussTyp
	 * @generated
	 */
	EEnum getAbschlussTyp();

	/**
	 * Returns the factory that creates the instances of the model. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ZeugnisFactory getZeugnisFactory();

	/**
	 * <!-- begin-user-doc --> Defines literals for the meta objects that
	 * represent
	 * <ul>
	 * <li>each class,</li>
	 * <li>each feature of each class,</li>
	 * <li>each operation of each class,</li>
	 * <li>each enum,</li>
	 * <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '
		 * {@link zeugen.zeugnis.impl.KlasseImpl <em>Klasse</em>}' class. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see zeugen.zeugnis.impl.KlasseImpl
		 * @see zeugen.zeugnis.impl.ZeugnisPackageImpl#getKlasse()
		 * @generated
		 */
		EClass KLASSE = eINSTANCE.getKlasse();

		/**
		 * The meta object literal for the '<em><b>Klassenstufe</b></em>'
		 * reference feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference KLASSE__KLASSENSTUFE = eINSTANCE.getKlasse_Klassenstufe();

		/**
		 * The meta object literal for the '<em><b>Schueler</b></em>' reference
		 * list feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference KLASSE__SCHUELER = eINSTANCE.getKlasse_Schueler();

		/**
		 * The meta object literal for the '<em><b>Abschluesse</b></em>'
		 * containment reference list feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EReference KLASSE__ABSCHLUESSE = eINSTANCE.getKlasse_Abschluesse();

		/**
		 * The meta object literal for the '<em><b>Klassenlehrer</b></em>'
		 * reference feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference KLASSE__KLASSENLEHRER = eINSTANCE.getKlasse_Klassenlehrer();

		/**
		 * The meta object literal for the '<em><b>Bezeichnung</b></em>'
		 * attribute feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute KLASSE__BEZEICHNUNG = eINSTANCE.getKlasse_Bezeichnung();

		/**
		 * The meta object literal for the '
		 * {@link zeugen.zeugnis.impl.JahrgangImpl <em>Jahrgang</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see zeugen.zeugnis.impl.JahrgangImpl
		 * @see zeugen.zeugnis.impl.ZeugnisPackageImpl#getJahrgang()
		 * @generated
		 */
		EClass JAHRGANG = eINSTANCE.getJahrgang();

		/**
		 * The meta object literal for the '<em><b>Bezeichnung</b></em>'
		 * attribute feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute JAHRGANG__BEZEICHNUNG = eINSTANCE.getJahrgang_Bezeichnung();

		/**
		 * The meta object literal for the '<em><b>Klassen</b></em>' containment
		 * reference list feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference JAHRGANG__KLASSEN = eINSTANCE.getJahrgang_Klassen();

		/**
		 * The meta object literal for the '
		 * {@link zeugen.zeugnis.impl.AbschlussImpl <em>Abschluss</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see zeugen.zeugnis.impl.AbschlussImpl
		 * @see zeugen.zeugnis.impl.ZeugnisPackageImpl#getAbschluss()
		 * @generated
		 */
		EClass ABSCHLUSS = eINSTANCE.getAbschluss();

		/**
		 * The meta object literal for the '<em><b>Typ</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute ABSCHLUSS__TYP = eINSTANCE.getAbschluss_Typ();

		/**
		 * The meta object literal for the '<em><b>Zeugnisse</b></em>'
		 * containment reference list feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EReference ABSCHLUSS__ZEUGNISSE = eINSTANCE.getAbschluss_Zeugnisse();

		/**
		 * The meta object literal for the '
		 * {@link zeugen.zeugnis.impl.ZeugnisImpl <em>Zeugnis</em>}' class. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see zeugen.zeugnis.impl.ZeugnisImpl
		 * @see zeugen.zeugnis.impl.ZeugnisPackageImpl#getZeugnis()
		 * @generated
		 */
		EClass ZEUGNIS = eINSTANCE.getZeugnis();

		/**
		 * The meta object literal for the '<em><b>Schueler</b></em>' reference
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference ZEUGNIS__SCHUELER = eINSTANCE.getZeugnis_Schueler();

		/**
		 * The meta object literal for the '<em><b>Beurteilungen</b></em>'
		 * containment reference list feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EReference ZEUGNIS__BEURTEILUNGEN = eINSTANCE
				.getZeugnis_Beurteilungen();

		/**
		 * The meta object literal for the '
		 * {@link zeugen.zeugnis.impl.BeurteilungImpl <em>Beurteilung</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see zeugen.zeugnis.impl.BeurteilungImpl
		 * @see zeugen.zeugnis.impl.ZeugnisPackageImpl#getBeurteilung()
		 * @generated
		 */
		EClass BEURTEILUNG = eINSTANCE.getBeurteilung();

		/**
		 * The meta object literal for the '<em><b>Notentyp</b></em>' reference
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference BEURTEILUNG__NOTENTYP = eINSTANCE.getBeurteilung_Notentyp();

		/**
		 * The meta object literal for the '{@link zeugen.zeugnis.impl.NoteImpl
		 * <em>Note</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see zeugen.zeugnis.impl.NoteImpl
		 * @see zeugen.zeugnis.impl.ZeugnisPackageImpl#getNote()
		 * @generated
		 */
		EClass NOTE = eINSTANCE.getNote();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute NOTE__WERT = eINSTANCE.getNote_Wert();

		/**
		 * The meta object literal for the '
		 * {@link zeugen.zeugnis.impl.FormulierungImpl <em>Formulierung</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see zeugen.zeugnis.impl.FormulierungImpl
		 * @see zeugen.zeugnis.impl.ZeugnisPackageImpl#getFormulierung()
		 * @generated
		 */
		EClass FORMULIERUNG = eINSTANCE.getFormulierung();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute FORMULIERUNG__WERT = eINSTANCE.getFormulierung_Wert();

		/**
		 * The meta object literal for the '{@link zeugen.zeugnis.AbschlussTyp
		 * <em>Abschluss Typ</em>}' enum. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see zeugen.zeugnis.AbschlussTyp
		 * @see zeugen.zeugnis.impl.ZeugnisPackageImpl#getAbschlussTyp()
		 * @generated
		 */
		EEnum ABSCHLUSS_TYP = eINSTANCE.getAbschlussTyp();

	}

} // ZeugnisPackage
