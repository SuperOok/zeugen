/**
 */
package zeugen.configuration.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import zeugen.configuration.Adresse;
import zeugen.configuration.ConfigurationFactory;
import zeugen.configuration.ConfigurationPackage;
import zeugen.configuration.FachTyp;
import zeugen.configuration.Geschlecht;
import zeugen.configuration.Klassenstufe;
import zeugen.configuration.Lehrkraft;
import zeugen.configuration.Notentyp;
import zeugen.configuration.Person;
import zeugen.configuration.Schule;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!--
 * end-user-doc -->
 * 
 * @generated
 */
public class ConfigurationPackageImpl extends EPackageImpl implements
		ConfigurationPackage {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass schuleEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass lehrkraftEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass notentypEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass klassenstufeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass adresseEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass personEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EEnum geschlechtEEnum = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EEnum fachTypEEnum = null;

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
	 * @see zeugen.configuration.ConfigurationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ConfigurationPackageImpl() {
		super(eNS_URI, ConfigurationFactory.eINSTANCE);
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
	 * This method is used to initialize {@link ConfigurationPackage#eINSTANCE}
	 * when that field is accessed. Clients should not invoke it directly.
	 * Instead, they should simply access that field to obtain the package. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ConfigurationPackage init() {
		if (isInited)
			return (ConfigurationPackage) EPackage.Registry.INSTANCE
					.getEPackage(ConfigurationPackage.eNS_URI);

		// Obtain or create and register package
		ConfigurationPackageImpl theConfigurationPackage = (ConfigurationPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof ConfigurationPackageImpl ? EPackage.Registry.INSTANCE
				.get(eNS_URI) : new ConfigurationPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theConfigurationPackage.createPackageContents();

		// Initialize created meta-data
		theConfigurationPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theConfigurationPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ConfigurationPackage.eNS_URI,
				theConfigurationPackage);
		return theConfigurationPackage;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getSchule() {
		return schuleEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getSchule_Name() {
		return (EAttribute) schuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getSchule_Adresse() {
		return (EReference) schuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getSchule_Lehrer() {
		return (EReference) schuleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getSchule_Schulleiter() {
		return (EReference) schuleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getSchule_Klassenstufen() {
		return (EReference) schuleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getSchule_Faecher() {
		return (EReference) schuleEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getLehrkraft() {
		return lehrkraftEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getNotentyp() {
		return notentypEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getNotentyp_Name() {
		return (EAttribute) notentypEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getNotentyp_Typ() {
		return (EAttribute) notentypEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getNotentyp_Klassenstufen() {
		return (EReference) notentypEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getKlassenstufe() {
		return klassenstufeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getKlassenstufe_Bezeichnung() {
		return (EAttribute) klassenstufeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getKlassenstufe_Anzeigename() {
		return (EAttribute) klassenstufeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getKlassenstufe_Notentypen() {
		return (EReference) klassenstufeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getAdresse() {
		return adresseEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getAdresse_Strasse() {
		return (EAttribute) adresseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getAdresse_Postleitzahl() {
		return (EAttribute) adresseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getAdresse_Stadt() {
		return (EAttribute) adresseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getPerson() {
		return personEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getPerson_Vorname() {
		return (EAttribute) personEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getPerson_Nachname() {
		return (EAttribute) personEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getPerson_Geburtstag() {
		return (EAttribute) personEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getPerson_Geburtsort() {
		return (EAttribute) personEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getPerson_Name() {
		return (EAttribute) personEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getPerson_Geschlecht() {
		return (EAttribute) personEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getPerson_Namenszusatz() {
		return (EAttribute) personEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EEnum getGeschlecht() {
		return geschlechtEEnum;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EEnum getFachTyp() {
		return fachTypEEnum;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public ConfigurationFactory getConfigurationFactory() {
		return (ConfigurationFactory) getEFactoryInstance();
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
		schuleEClass = createEClass(SCHULE);
		createEAttribute(schuleEClass, SCHULE__NAME);
		createEReference(schuleEClass, SCHULE__ADRESSE);
		createEReference(schuleEClass, SCHULE__LEHRER);
		createEReference(schuleEClass, SCHULE__SCHULLEITER);
		createEReference(schuleEClass, SCHULE__KLASSENSTUFEN);
		createEReference(schuleEClass, SCHULE__FAECHER);

		lehrkraftEClass = createEClass(LEHRKRAFT);

		notentypEClass = createEClass(NOTENTYP);
		createEAttribute(notentypEClass, NOTENTYP__NAME);
		createEAttribute(notentypEClass, NOTENTYP__TYP);
		createEReference(notentypEClass, NOTENTYP__KLASSENSTUFEN);

		klassenstufeEClass = createEClass(KLASSENSTUFE);
		createEAttribute(klassenstufeEClass, KLASSENSTUFE__BEZEICHNUNG);
		createEAttribute(klassenstufeEClass, KLASSENSTUFE__ANZEIGENAME);
		createEReference(klassenstufeEClass, KLASSENSTUFE__NOTENTYPEN);

		adresseEClass = createEClass(ADRESSE);
		createEAttribute(adresseEClass, ADRESSE__STRASSE);
		createEAttribute(adresseEClass, ADRESSE__POSTLEITZAHL);
		createEAttribute(adresseEClass, ADRESSE__STADT);

		personEClass = createEClass(PERSON);
		createEAttribute(personEClass, PERSON__VORNAME);
		createEAttribute(personEClass, PERSON__NACHNAME);
		createEAttribute(personEClass, PERSON__GEBURTSTAG);
		createEAttribute(personEClass, PERSON__GEBURTSORT);
		createEAttribute(personEClass, PERSON__NAME);
		createEAttribute(personEClass, PERSON__GESCHLECHT);
		createEAttribute(personEClass, PERSON__NAMENSZUSATZ);

		// Create enums
		geschlechtEEnum = createEEnum(GESCHLECHT);
		fachTypEEnum = createEEnum(FACH_TYP);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		lehrkraftEClass.getESuperTypes().add(this.getPerson());

		// Initialize classes, features, and operations; add parameters
		initEClass(schuleEClass, Schule.class, "Schule", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSchule_Name(), ecorePackage.getEString(), "name",
				null, 1, 1, Schule.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getSchule_Adresse(), this.getAdresse(), null, "adresse",
				null, 1, 1, Schule.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSchule_Lehrer(), this.getLehrkraft(), null, "lehrer",
				null, 1, -1, Schule.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSchule_Schulleiter(), this.getLehrkraft(), null,
				"schulleiter", null, 1, 1, Schule.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSchule_Klassenstufen(), this.getKlassenstufe(), null,
				"klassenstufen", null, 0, -1, Schule.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSchule_Faecher(), this.getNotentyp(), null,
				"faecher", null, 0, -1, Schule.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lehrkraftEClass, Lehrkraft.class, "Lehrkraft", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(notentypEClass, Notentyp.class, "Notentyp", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNotentyp_Name(), ecorePackage.getEString(), "name",
				null, 0, 1, Notentyp.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getNotentyp_Typ(), this.getFachTyp(), "typ",
				"SCHULFACH", 1, 1, Notentyp.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getNotentyp_Klassenstufen(), this.getKlassenstufe(),
				this.getKlassenstufe_Notentypen(), "klassenstufen", null, 0,
				-1, Notentyp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(klassenstufeEClass, Klassenstufe.class, "Klassenstufe",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKlassenstufe_Bezeichnung(),
				ecorePackage.getEString(), "bezeichnung", null, 0, 1,
				Klassenstufe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKlassenstufe_Anzeigename(),
				ecorePackage.getEString(), "anzeigename", null, 0, 1,
				Klassenstufe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKlassenstufe_Notentypen(), this.getNotentyp(),
				this.getNotentyp_Klassenstufen(), "notentypen", null, 0, -1,
				Klassenstufe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(adresseEClass, Adresse.class, "Adresse", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAdresse_Strasse(), ecorePackage.getEString(),
				"strasse", null, 1, 1, Adresse.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getAdresse_Postleitzahl(), ecorePackage.getEString(),
				"postleitzahl", null, 1, 1, Adresse.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getAdresse_Stadt(), ecorePackage.getEString(), "stadt",
				null, 1, 1, Adresse.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(personEClass, Person.class, "Person", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPerson_Vorname(), ecorePackage.getEString(),
				"vorname", null, 1, -1, Person.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerson_Nachname(), ecorePackage.getEString(),
				"nachname", null, 1, 1, Person.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerson_Geburtstag(), ecorePackage.getEDate(),
				"geburtstag", null, 0, 1, Person.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerson_Geburtsort(), ecorePackage.getEString(),
				"geburtsort", null, 0, 1, Person.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerson_Name(), ecorePackage.getEString(), "name",
				null, 1, 1, Person.class, IS_TRANSIENT, IS_VOLATILE,
				!IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getPerson_Geschlecht(), this.getGeschlecht(),
				"geschlecht", "UNBEKANNT", 1, 1, Person.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerson_Namenszusatz(), ecorePackage.getEString(),
				"namenszusatz", null, 0, 1, Person.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(geschlechtEEnum, Geschlecht.class, "Geschlecht");
		addEEnumLiteral(geschlechtEEnum, Geschlecht.MANN);
		addEEnumLiteral(geschlechtEEnum, Geschlecht.FRAU);
		addEEnumLiteral(geschlechtEEnum, Geschlecht.UNBEKANNT);

		initEEnum(fachTypEEnum, FachTyp.class, "FachTyp");
		addEEnumLiteral(fachTypEEnum, FachTyp.SCHULFACH);
		addEEnumLiteral(fachTypEEnum, FachTyp.ARBEITSGEMEINSCHAFT);
		addEEnumLiteral(fachTypEEnum, FachTyp.ANDERE);

		// Create resource
		createResource(eNS_URI);
	}

} // ConfigurationPackageImpl
