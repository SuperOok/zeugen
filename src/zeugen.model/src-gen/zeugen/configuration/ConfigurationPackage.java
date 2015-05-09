/**
 */
package zeugen.configuration;

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
 * @see zeugen.configuration.ConfigurationFactory
 * @model kind="package"
 * @generated
 */
public interface ConfigurationPackage extends EPackage {
	/**
	 * The package name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNAME = "configuration";

	/**
	 * The package namespace URI. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_URI = "http://zeugen.configuration/1_0";

	/**
	 * The package namespace name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_PREFIX = "zeugen.configuration";

	/**
	 * The singleton instance of the package. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	ConfigurationPackage eINSTANCE = zeugen.configuration.impl.ConfigurationPackageImpl
			.init();

	/**
	 * The meta object id for the '{@link zeugen.configuration.impl.SchuleImpl
	 * <em>Schule</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see zeugen.configuration.impl.SchuleImpl
	 * @see zeugen.configuration.impl.ConfigurationPackageImpl#getSchule()
	 * @generated
	 */
	int SCHULE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SCHULE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Adresse</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SCHULE__ADRESSE = 1;

	/**
	 * The feature id for the '<em><b>Lehrer</b></em>' containment reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SCHULE__LEHRER = 2;

	/**
	 * The feature id for the '<em><b>Schulleiter</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SCHULE__SCHULLEITER = 3;

	/**
	 * The feature id for the '<em><b>Klassenstufen</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SCHULE__KLASSENSTUFEN = 4;

	/**
	 * The feature id for the '<em><b>Faecher</b></em>' containment reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SCHULE__FAECHER = 5;

	/**
	 * The number of structural features of the '<em>Schule</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SCHULE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Schule</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SCHULE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link zeugen.configuration.impl.PersonImpl
	 * <em>Person</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see zeugen.configuration.impl.PersonImpl
	 * @see zeugen.configuration.impl.ConfigurationPackageImpl#getPerson()
	 * @generated
	 */
	int PERSON = 5;

	/**
	 * The feature id for the '<em><b>Vorname</b></em>' attribute list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PERSON__VORNAME = 0;

	/**
	 * The feature id for the '<em><b>Nachname</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PERSON__NACHNAME = 1;

	/**
	 * The feature id for the '<em><b>Geburtstag</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PERSON__GEBURTSTAG = 2;

	/**
	 * The feature id for the '<em><b>Geburtsort</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PERSON__GEBURTSORT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PERSON__NAME = 4;

	/**
	 * The feature id for the '<em><b>Geschlecht</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PERSON__GESCHLECHT = 5;

	/**
	 * The feature id for the '<em><b>Namenszusatz</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PERSON__NAMENSZUSATZ = 6;

	/**
	 * The number of structural features of the '<em>Person</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PERSON_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Person</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PERSON_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '
	 * {@link zeugen.configuration.impl.LehrkraftImpl <em>Lehrkraft</em>}'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see zeugen.configuration.impl.LehrkraftImpl
	 * @see zeugen.configuration.impl.ConfigurationPackageImpl#getLehrkraft()
	 * @generated
	 */
	int LEHRKRAFT = 1;

	/**
	 * The feature id for the '<em><b>Vorname</b></em>' attribute list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LEHRKRAFT__VORNAME = PERSON__VORNAME;

	/**
	 * The feature id for the '<em><b>Nachname</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LEHRKRAFT__NACHNAME = PERSON__NACHNAME;

	/**
	 * The feature id for the '<em><b>Geburtstag</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LEHRKRAFT__GEBURTSTAG = PERSON__GEBURTSTAG;

	/**
	 * The feature id for the '<em><b>Geburtsort</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LEHRKRAFT__GEBURTSORT = PERSON__GEBURTSORT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LEHRKRAFT__NAME = PERSON__NAME;

	/**
	 * The feature id for the '<em><b>Geschlecht</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LEHRKRAFT__GESCHLECHT = PERSON__GESCHLECHT;

	/**
	 * The feature id for the '<em><b>Namenszusatz</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LEHRKRAFT__NAMENSZUSATZ = PERSON__NAMENSZUSATZ;

	/**
	 * The number of structural features of the '<em>Lehrkraft</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LEHRKRAFT_FEATURE_COUNT = PERSON_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Lehrkraft</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LEHRKRAFT_OPERATION_COUNT = PERSON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link zeugen.configuration.impl.NotentypImpl <em>Notentyp</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see zeugen.configuration.impl.NotentypImpl
	 * @see zeugen.configuration.impl.ConfigurationPackageImpl#getNotentyp()
	 * @generated
	 */
	int NOTENTYP = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NOTENTYP__NAME = 0;

	/**
	 * The feature id for the '<em><b>Typ</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NOTENTYP__TYP = 1;

	/**
	 * The feature id for the '<em><b>Klassenstufen</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NOTENTYP__KLASSENSTUFEN = 2;

	/**
	 * The number of structural features of the '<em>Notentyp</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NOTENTYP_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Notentyp</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NOTENTYP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '
	 * {@link zeugen.configuration.impl.KlassenstufeImpl <em>Klassenstufe</em>}'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see zeugen.configuration.impl.KlassenstufeImpl
	 * @see zeugen.configuration.impl.ConfigurationPackageImpl#getKlassenstufe()
	 * @generated
	 */
	int KLASSENSTUFE = 3;

	/**
	 * The feature id for the '<em><b>Bezeichnung</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int KLASSENSTUFE__BEZEICHNUNG = 0;

	/**
	 * The feature id for the '<em><b>Anzeigename</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int KLASSENSTUFE__ANZEIGENAME = 1;

	/**
	 * The feature id for the '<em><b>Notentypen</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int KLASSENSTUFE__NOTENTYPEN = 2;

	/**
	 * The number of structural features of the '<em>Klassenstufe</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int KLASSENSTUFE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Klassenstufe</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int KLASSENSTUFE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link zeugen.configuration.impl.AdresseImpl
	 * <em>Adresse</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see zeugen.configuration.impl.AdresseImpl
	 * @see zeugen.configuration.impl.ConfigurationPackageImpl#getAdresse()
	 * @generated
	 */
	int ADRESSE = 4;

	/**
	 * The feature id for the '<em><b>Strasse</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ADRESSE__STRASSE = 0;

	/**
	 * The feature id for the '<em><b>Postleitzahl</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ADRESSE__POSTLEITZAHL = 1;

	/**
	 * The feature id for the '<em><b>Stadt</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ADRESSE__STADT = 2;

	/**
	 * The number of structural features of the '<em>Adresse</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ADRESSE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Adresse</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ADRESSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link zeugen.configuration.Geschlecht
	 * <em>Geschlecht</em>}' enum. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see zeugen.configuration.Geschlecht
	 * @see zeugen.configuration.impl.ConfigurationPackageImpl#getGeschlecht()
	 * @generated
	 */
	int GESCHLECHT = 6;

	/**
	 * The meta object id for the '{@link zeugen.configuration.FachTyp
	 * <em>Fach Typ</em>}' enum. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see zeugen.configuration.FachTyp
	 * @see zeugen.configuration.impl.ConfigurationPackageImpl#getFachTyp()
	 * @generated
	 */
	int FACH_TYP = 7;

	/**
	 * Returns the meta object for class '{@link zeugen.configuration.Schule
	 * <em>Schule</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Schule</em>'.
	 * @see zeugen.configuration.Schule
	 * @generated
	 */
	EClass getSchule();

	/**
	 * Returns the meta object for the attribute '
	 * {@link zeugen.configuration.Schule#getName <em>Name</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see zeugen.configuration.Schule#getName()
	 * @see #getSchule()
	 * @generated
	 */
	EAttribute getSchule_Name();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link zeugen.configuration.Schule#getAdresse <em>Adresse</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Adresse</em>'.
	 * @see zeugen.configuration.Schule#getAdresse()
	 * @see #getSchule()
	 * @generated
	 */
	EReference getSchule_Adresse();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link zeugen.configuration.Schule#getLehrer <em>Lehrer</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '
	 *         <em>Lehrer</em>'.
	 * @see zeugen.configuration.Schule#getLehrer()
	 * @see #getSchule()
	 * @generated
	 */
	EReference getSchule_Lehrer();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link zeugen.configuration.Schule#getSchulleiter <em>Schulleiter</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '
	 *         <em>Schulleiter</em>'.
	 * @see zeugen.configuration.Schule#getSchulleiter()
	 * @see #getSchule()
	 * @generated
	 */
	EReference getSchule_Schulleiter();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link zeugen.configuration.Schule#getKlassenstufen
	 * <em>Klassenstufen</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '
	 *         <em>Klassenstufen</em>'.
	 * @see zeugen.configuration.Schule#getKlassenstufen()
	 * @see #getSchule()
	 * @generated
	 */
	EReference getSchule_Klassenstufen();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link zeugen.configuration.Schule#getFaecher <em>Faecher</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '
	 *         <em>Faecher</em>'.
	 * @see zeugen.configuration.Schule#getFaecher()
	 * @see #getSchule()
	 * @generated
	 */
	EReference getSchule_Faecher();

	/**
	 * Returns the meta object for class '{@link zeugen.configuration.Lehrkraft
	 * <em>Lehrkraft</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Lehrkraft</em>'.
	 * @see zeugen.configuration.Lehrkraft
	 * @generated
	 */
	EClass getLehrkraft();

	/**
	 * Returns the meta object for class '{@link zeugen.configuration.Notentyp
	 * <em>Notentyp</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Notentyp</em>'.
	 * @see zeugen.configuration.Notentyp
	 * @generated
	 */
	EClass getNotentyp();

	/**
	 * Returns the meta object for the attribute '
	 * {@link zeugen.configuration.Notentyp#getName <em>Name</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see zeugen.configuration.Notentyp#getName()
	 * @see #getNotentyp()
	 * @generated
	 */
	EAttribute getNotentyp_Name();

	/**
	 * Returns the meta object for the attribute '
	 * {@link zeugen.configuration.Notentyp#getTyp <em>Typ</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Typ</em>'.
	 * @see zeugen.configuration.Notentyp#getTyp()
	 * @see #getNotentyp()
	 * @generated
	 */
	EAttribute getNotentyp_Typ();

	/**
	 * Returns the meta object for the reference list '
	 * {@link zeugen.configuration.Notentyp#getKlassenstufen
	 * <em>Klassenstufen</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Klassenstufen</em>'.
	 * @see zeugen.configuration.Notentyp#getKlassenstufen()
	 * @see #getNotentyp()
	 * @generated
	 */
	EReference getNotentyp_Klassenstufen();

	/**
	 * Returns the meta object for class '
	 * {@link zeugen.configuration.Klassenstufe <em>Klassenstufe</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Klassenstufe</em>'.
	 * @see zeugen.configuration.Klassenstufe
	 * @generated
	 */
	EClass getKlassenstufe();

	/**
	 * Returns the meta object for the attribute '
	 * {@link zeugen.configuration.Klassenstufe#getBezeichnung
	 * <em>Bezeichnung</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Bezeichnung</em>'.
	 * @see zeugen.configuration.Klassenstufe#getBezeichnung()
	 * @see #getKlassenstufe()
	 * @generated
	 */
	EAttribute getKlassenstufe_Bezeichnung();

	/**
	 * Returns the meta object for the attribute '
	 * {@link zeugen.configuration.Klassenstufe#getAnzeigename
	 * <em>Anzeigename</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Anzeigename</em>'.
	 * @see zeugen.configuration.Klassenstufe#getAnzeigename()
	 * @see #getKlassenstufe()
	 * @generated
	 */
	EAttribute getKlassenstufe_Anzeigename();

	/**
	 * Returns the meta object for the reference list '
	 * {@link zeugen.configuration.Klassenstufe#getNotentypen
	 * <em>Notentypen</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Notentypen</em>'.
	 * @see zeugen.configuration.Klassenstufe#getNotentypen()
	 * @see #getKlassenstufe()
	 * @generated
	 */
	EReference getKlassenstufe_Notentypen();

	/**
	 * Returns the meta object for class '{@link zeugen.configuration.Adresse
	 * <em>Adresse</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Adresse</em>'.
	 * @see zeugen.configuration.Adresse
	 * @generated
	 */
	EClass getAdresse();

	/**
	 * Returns the meta object for the attribute '
	 * {@link zeugen.configuration.Adresse#getStrasse <em>Strasse</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Strasse</em>'.
	 * @see zeugen.configuration.Adresse#getStrasse()
	 * @see #getAdresse()
	 * @generated
	 */
	EAttribute getAdresse_Strasse();

	/**
	 * Returns the meta object for the attribute '
	 * {@link zeugen.configuration.Adresse#getPostleitzahl
	 * <em>Postleitzahl</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Postleitzahl</em>'.
	 * @see zeugen.configuration.Adresse#getPostleitzahl()
	 * @see #getAdresse()
	 * @generated
	 */
	EAttribute getAdresse_Postleitzahl();

	/**
	 * Returns the meta object for the attribute '
	 * {@link zeugen.configuration.Adresse#getStadt <em>Stadt</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Stadt</em>'.
	 * @see zeugen.configuration.Adresse#getStadt()
	 * @see #getAdresse()
	 * @generated
	 */
	EAttribute getAdresse_Stadt();

	/**
	 * Returns the meta object for class '{@link zeugen.configuration.Person
	 * <em>Person</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Person</em>'.
	 * @see zeugen.configuration.Person
	 * @generated
	 */
	EClass getPerson();

	/**
	 * Returns the meta object for the attribute list '
	 * {@link zeugen.configuration.Person#getVorname <em>Vorname</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute list '<em>Vorname</em>'.
	 * @see zeugen.configuration.Person#getVorname()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Vorname();

	/**
	 * Returns the meta object for the attribute '
	 * {@link zeugen.configuration.Person#getNachname <em>Nachname</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Nachname</em>'.
	 * @see zeugen.configuration.Person#getNachname()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Nachname();

	/**
	 * Returns the meta object for the attribute '
	 * {@link zeugen.configuration.Person#getGeburtstag <em>Geburtstag</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Geburtstag</em>'.
	 * @see zeugen.configuration.Person#getGeburtstag()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Geburtstag();

	/**
	 * Returns the meta object for the attribute '
	 * {@link zeugen.configuration.Person#getGeburtsort <em>Geburtsort</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Geburtsort</em>'.
	 * @see zeugen.configuration.Person#getGeburtsort()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Geburtsort();

	/**
	 * Returns the meta object for the attribute '
	 * {@link zeugen.configuration.Person#getName <em>Name</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see zeugen.configuration.Person#getName()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Name();

	/**
	 * Returns the meta object for the attribute '
	 * {@link zeugen.configuration.Person#getGeschlecht <em>Geschlecht</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Geschlecht</em>'.
	 * @see zeugen.configuration.Person#getGeschlecht()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Geschlecht();

	/**
	 * Returns the meta object for the attribute '
	 * {@link zeugen.configuration.Person#getNamenszusatz <em>Namenszusatz</em>}
	 * '. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Namenszusatz</em>'.
	 * @see zeugen.configuration.Person#getNamenszusatz()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Namenszusatz();

	/**
	 * Returns the meta object for enum '{@link zeugen.configuration.Geschlecht
	 * <em>Geschlecht</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for enum '<em>Geschlecht</em>'.
	 * @see zeugen.configuration.Geschlecht
	 * @generated
	 */
	EEnum getGeschlecht();

	/**
	 * Returns the meta object for enum '{@link zeugen.configuration.FachTyp
	 * <em>Fach Typ</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for enum '<em>Fach Typ</em>'.
	 * @see zeugen.configuration.FachTyp
	 * @generated
	 */
	EEnum getFachTyp();

	/**
	 * Returns the factory that creates the instances of the model. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ConfigurationFactory getConfigurationFactory();

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
		 * {@link zeugen.configuration.impl.SchuleImpl <em>Schule</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see zeugen.configuration.impl.SchuleImpl
		 * @see zeugen.configuration.impl.ConfigurationPackageImpl#getSchule()
		 * @generated
		 */
		EClass SCHULE = eINSTANCE.getSchule();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute SCHULE__NAME = eINSTANCE.getSchule_Name();

		/**
		 * The meta object literal for the '<em><b>Adresse</b></em>' containment
		 * reference feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference SCHULE__ADRESSE = eINSTANCE.getSchule_Adresse();

		/**
		 * The meta object literal for the '<em><b>Lehrer</b></em>' containment
		 * reference list feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference SCHULE__LEHRER = eINSTANCE.getSchule_Lehrer();

		/**
		 * The meta object literal for the '<em><b>Schulleiter</b></em>'
		 * containment reference feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EReference SCHULE__SCHULLEITER = eINSTANCE.getSchule_Schulleiter();

		/**
		 * The meta object literal for the '<em><b>Klassenstufen</b></em>'
		 * containment reference list feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EReference SCHULE__KLASSENSTUFEN = eINSTANCE.getSchule_Klassenstufen();

		/**
		 * The meta object literal for the '<em><b>Faecher</b></em>' containment
		 * reference list feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference SCHULE__FAECHER = eINSTANCE.getSchule_Faecher();

		/**
		 * The meta object literal for the '
		 * {@link zeugen.configuration.impl.LehrkraftImpl <em>Lehrkraft</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see zeugen.configuration.impl.LehrkraftImpl
		 * @see zeugen.configuration.impl.ConfigurationPackageImpl#getLehrkraft()
		 * @generated
		 */
		EClass LEHRKRAFT = eINSTANCE.getLehrkraft();

		/**
		 * The meta object literal for the '
		 * {@link zeugen.configuration.impl.NotentypImpl <em>Notentyp</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see zeugen.configuration.impl.NotentypImpl
		 * @see zeugen.configuration.impl.ConfigurationPackageImpl#getNotentyp()
		 * @generated
		 */
		EClass NOTENTYP = eINSTANCE.getNotentyp();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute NOTENTYP__NAME = eINSTANCE.getNotentyp_Name();

		/**
		 * The meta object literal for the '<em><b>Typ</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute NOTENTYP__TYP = eINSTANCE.getNotentyp_Typ();

		/**
		 * The meta object literal for the '<em><b>Klassenstufen</b></em>'
		 * reference list feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference NOTENTYP__KLASSENSTUFEN = eINSTANCE
				.getNotentyp_Klassenstufen();

		/**
		 * The meta object literal for the '
		 * {@link zeugen.configuration.impl.KlassenstufeImpl
		 * <em>Klassenstufe</em>}' class. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see zeugen.configuration.impl.KlassenstufeImpl
		 * @see zeugen.configuration.impl.ConfigurationPackageImpl#getKlassenstufe()
		 * @generated
		 */
		EClass KLASSENSTUFE = eINSTANCE.getKlassenstufe();

		/**
		 * The meta object literal for the '<em><b>Bezeichnung</b></em>'
		 * attribute feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute KLASSENSTUFE__BEZEICHNUNG = eINSTANCE
				.getKlassenstufe_Bezeichnung();

		/**
		 * The meta object literal for the '<em><b>Anzeigename</b></em>'
		 * attribute feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute KLASSENSTUFE__ANZEIGENAME = eINSTANCE
				.getKlassenstufe_Anzeigename();

		/**
		 * The meta object literal for the '<em><b>Notentypen</b></em>'
		 * reference list feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference KLASSENSTUFE__NOTENTYPEN = eINSTANCE
				.getKlassenstufe_Notentypen();

		/**
		 * The meta object literal for the '
		 * {@link zeugen.configuration.impl.AdresseImpl <em>Adresse</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see zeugen.configuration.impl.AdresseImpl
		 * @see zeugen.configuration.impl.ConfigurationPackageImpl#getAdresse()
		 * @generated
		 */
		EClass ADRESSE = eINSTANCE.getAdresse();

		/**
		 * The meta object literal for the '<em><b>Strasse</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute ADRESSE__STRASSE = eINSTANCE.getAdresse_Strasse();

		/**
		 * The meta object literal for the '<em><b>Postleitzahl</b></em>'
		 * attribute feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute ADRESSE__POSTLEITZAHL = eINSTANCE.getAdresse_Postleitzahl();

		/**
		 * The meta object literal for the '<em><b>Stadt</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute ADRESSE__STADT = eINSTANCE.getAdresse_Stadt();

		/**
		 * The meta object literal for the '
		 * {@link zeugen.configuration.impl.PersonImpl <em>Person</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see zeugen.configuration.impl.PersonImpl
		 * @see zeugen.configuration.impl.ConfigurationPackageImpl#getPerson()
		 * @generated
		 */
		EClass PERSON = eINSTANCE.getPerson();

		/**
		 * The meta object literal for the '<em><b>Vorname</b></em>' attribute
		 * list feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute PERSON__VORNAME = eINSTANCE.getPerson_Vorname();

		/**
		 * The meta object literal for the '<em><b>Nachname</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute PERSON__NACHNAME = eINSTANCE.getPerson_Nachname();

		/**
		 * The meta object literal for the '<em><b>Geburtstag</b></em>'
		 * attribute feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute PERSON__GEBURTSTAG = eINSTANCE.getPerson_Geburtstag();

		/**
		 * The meta object literal for the '<em><b>Geburtsort</b></em>'
		 * attribute feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute PERSON__GEBURTSORT = eINSTANCE.getPerson_Geburtsort();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute PERSON__NAME = eINSTANCE.getPerson_Name();

		/**
		 * The meta object literal for the '<em><b>Geschlecht</b></em>'
		 * attribute feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute PERSON__GESCHLECHT = eINSTANCE.getPerson_Geschlecht();

		/**
		 * The meta object literal for the '<em><b>Namenszusatz</b></em>'
		 * attribute feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute PERSON__NAMENSZUSATZ = eINSTANCE.getPerson_Namenszusatz();

		/**
		 * The meta object literal for the '
		 * {@link zeugen.configuration.Geschlecht <em>Geschlecht</em>}' enum.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see zeugen.configuration.Geschlecht
		 * @see zeugen.configuration.impl.ConfigurationPackageImpl#getGeschlecht()
		 * @generated
		 */
		EEnum GESCHLECHT = eINSTANCE.getGeschlecht();

		/**
		 * The meta object literal for the '{@link zeugen.configuration.FachTyp
		 * <em>Fach Typ</em>}' enum. <!-- begin-user-doc --> <!-- end-user-doc
		 * -->
		 * 
		 * @see zeugen.configuration.FachTyp
		 * @see zeugen.configuration.impl.ConfigurationPackageImpl#getFachTyp()
		 * @generated
		 */
		EEnum FACH_TYP = eINSTANCE.getFachTyp();

	}

} // ConfigurationPackage
