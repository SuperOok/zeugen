/**
 */
package zeugen.zeugnis.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import zeugen.configuration.ConfigurationPackage;

import zeugen.configuration.impl.ConfigurationPackageImpl;

import zeugen.zeugnis.Abschluss;
import zeugen.zeugnis.AbschlussTyp;
import zeugen.zeugnis.Beurteilung;
import zeugen.zeugnis.Formulierung;
import zeugen.zeugnis.Jahrgang;
import zeugen.zeugnis.Klasse;
import zeugen.zeugnis.Note;
import zeugen.zeugnis.Zeugnis;
import zeugen.zeugnis.ZeugnisFactory;
import zeugen.zeugnis.ZeugnisPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!--
 * end-user-doc -->
 * 
 * @generated
 */
public class ZeugnisPackageImpl extends EPackageImpl implements ZeugnisPackage {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass klasseEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass jahrgangEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass abschlussEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass zeugnisEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass beurteilungEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass noteEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass formulierungEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EEnum abschlussTypEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the
	 * package package URI value.
	 * <p>
	 * Note: the correct way to create the package is via the static factory
	 * method {@link #init init()}, which also performs initialization of the
	 * package, or returns the registered package, if one already exists. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see zeugen.zeugnis.ZeugnisPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ZeugnisPackageImpl() {
		super(eNS_URI, ZeugnisFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model,
	 * and for any others upon which it depends.
	 * 
	 * <p>
	 * This method is used to initialize {@link ZeugnisPackage#eINSTANCE} when
	 * that field is accessed. Clients should not invoke it directly. Instead,
	 * they should simply access that field to obtain the package. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ZeugnisPackage init() {
		if (isInited)
			return (ZeugnisPackage) EPackage.Registry.INSTANCE
					.getEPackage(ZeugnisPackage.eNS_URI);

		// Obtain or create and register package
		ZeugnisPackageImpl theZeugnisPackage = (ZeugnisPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof ZeugnisPackageImpl ? EPackage.Registry.INSTANCE
				.get(eNS_URI) : new ZeugnisPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		ConfigurationPackageImpl theConfigurationPackage = (ConfigurationPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(ConfigurationPackage.eNS_URI) instanceof ConfigurationPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(ConfigurationPackage.eNS_URI)
				: ConfigurationPackage.eINSTANCE);

		// Create package meta-data objects
		theZeugnisPackage.createPackageContents();
		theConfigurationPackage.createPackageContents();

		// Initialize created meta-data
		theZeugnisPackage.initializePackageContents();
		theConfigurationPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theZeugnisPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ZeugnisPackage.eNS_URI,
				theZeugnisPackage);
		return theZeugnisPackage;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getKlasse() {
		return klasseEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getKlasse_Klassenstufe() {
		return (EReference) klasseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getKlasse_Schueler() {
		return (EReference) klasseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getKlasse_Abschluesse() {
		return (EReference) klasseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getKlasse_Klassenlehrer() {
		return (EReference) klasseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getKlasse_Bezeichnung() {
		return (EAttribute) klasseEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getJahrgang() {
		return jahrgangEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getJahrgang_Bezeichnung() {
		return (EAttribute) jahrgangEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getJahrgang_Klassen() {
		return (EReference) jahrgangEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getAbschluss() {
		return abschlussEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getAbschluss_Typ() {
		return (EAttribute) abschlussEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getAbschluss_Zeugnisse() {
		return (EReference) abschlussEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getZeugnis() {
		return zeugnisEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getZeugnis_Schueler() {
		return (EReference) zeugnisEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getZeugnis_Beurteilungen() {
		return (EReference) zeugnisEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getBeurteilung() {
		return beurteilungEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getBeurteilung_Notentyp() {
		return (EReference) beurteilungEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getNote() {
		return noteEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getNote_Wert() {
		return (EAttribute) noteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getFormulierung() {
		return formulierungEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getFormulierung_Wert() {
		return (EAttribute) formulierungEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EEnum getAbschlussTyp() {
		return abschlussTypEEnum;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public ZeugnisFactory getZeugnisFactory() {
		return (ZeugnisFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package. This method is guarded to
	 * have no affect on any invocation but its first. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		klasseEClass = createEClass(KLASSE);
		createEReference(klasseEClass, KLASSE__KLASSENSTUFE);
		createEReference(klasseEClass, KLASSE__SCHUELER);
		createEReference(klasseEClass, KLASSE__ABSCHLUESSE);
		createEReference(klasseEClass, KLASSE__KLASSENLEHRER);
		createEAttribute(klasseEClass, KLASSE__BEZEICHNUNG);

		jahrgangEClass = createEClass(JAHRGANG);
		createEAttribute(jahrgangEClass, JAHRGANG__BEZEICHNUNG);
		createEReference(jahrgangEClass, JAHRGANG__KLASSEN);

		abschlussEClass = createEClass(ABSCHLUSS);
		createEAttribute(abschlussEClass, ABSCHLUSS__TYP);
		createEReference(abschlussEClass, ABSCHLUSS__ZEUGNISSE);

		zeugnisEClass = createEClass(ZEUGNIS);
		createEReference(zeugnisEClass, ZEUGNIS__SCHUELER);
		createEReference(zeugnisEClass, ZEUGNIS__BEURTEILUNGEN);

		beurteilungEClass = createEClass(BEURTEILUNG);
		createEReference(beurteilungEClass, BEURTEILUNG__NOTENTYP);

		noteEClass = createEClass(NOTE);
		createEAttribute(noteEClass, NOTE__WERT);

		formulierungEClass = createEClass(FORMULIERUNG);
		createEAttribute(formulierungEClass, FORMULIERUNG__WERT);

		// Create enums
		abschlussTypEEnum = createEEnum(ABSCHLUSS_TYP);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model. This
	 * method is guarded to have no affect on any invocation but its first. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		ConfigurationPackage theConfigurationPackage = (ConfigurationPackage) EPackage.Registry.INSTANCE
				.getEPackage(ConfigurationPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		noteEClass.getESuperTypes().add(this.getBeurteilung());
		formulierungEClass.getESuperTypes().add(this.getBeurteilung());

		// Initialize classes, features, and operations; add parameters
		initEClass(klasseEClass, Klasse.class, "Klasse", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getKlasse_Klassenstufe(),
				theConfigurationPackage.getKlassenstufe(), null,
				"klassenstufe", null, 1, 1, Klasse.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKlasse_Schueler(),
				theConfigurationPackage.getSchueler(),
				theConfigurationPackage.getSchueler_Klasse(), "schueler", null,
				0, -1, Klasse.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKlasse_Abschluesse(), this.getAbschluss(), null,
				"abschluesse", null, 0, -1, Klasse.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKlasse_Klassenlehrer(),
				theConfigurationPackage.getLehrkraft(),
				theConfigurationPackage.getLehrkraft_Klasse(), "klassenlehrer",
				null, 1, 1, Klasse.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKlasse_Bezeichnung(), ecorePackage.getEString(),
				"bezeichnung", null, 1, 1, Klasse.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(jahrgangEClass, Jahrgang.class, "Jahrgang", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJahrgang_Bezeichnung(), ecorePackage.getEString(),
				"bezeichnung", null, 1, 1, Jahrgang.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getJahrgang_Klassen(), this.getKlasse(), null,
				"klassen", null, 0, -1, Jahrgang.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abschlussEClass, Abschluss.class, "Abschluss", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbschluss_Typ(), this.getAbschlussTyp(), "typ", null,
				1, 1, Abschluss.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getAbschluss_Zeugnisse(), this.getZeugnis(), null,
				"zeugnisse", null, 0, -1, Abschluss.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(zeugnisEClass, Zeugnis.class, "Zeugnis", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getZeugnis_Schueler(),
				theConfigurationPackage.getSchueler(),
				theConfigurationPackage.getSchueler_Zeugnis(), "schueler",
				null, 0, 1, Zeugnis.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZeugnis_Beurteilungen(), this.getBeurteilung(), null,
				"beurteilungen", null, 0, -1, Zeugnis.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(beurteilungEClass, Beurteilung.class, "Beurteilung",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBeurteilung_Notentyp(),
				theConfigurationPackage.getNotentyp(), null, "notentyp", null,
				1, 1, Beurteilung.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(noteEClass, Note.class, "Note", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNote_Wert(), ecorePackage.getEInt(), "wert", null, 1,
				1, Note.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(formulierungEClass, Formulierung.class, "Formulierung",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFormulierung_Wert(), ecorePackage.getEString(),
				"wert", null, 0, 1, Formulierung.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(abschlussTypEEnum, AbschlussTyp.class, "AbschlussTyp");
		addEEnumLiteral(abschlussTypEEnum, AbschlussTyp.HALBJAHR);
		addEEnumLiteral(abschlussTypEEnum, AbschlussTyp.GANZJAHR);

		// Create resource
		createResource(eNS_URI);
	}

} // ZeugnisPackageImpl
