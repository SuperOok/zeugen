/**
 */
package zeugen.zeugnis.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import zeugen.zeugnis.*;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!--
 * end-user-doc -->
 * 
 * @generated
 */
public class ZeugnisFactoryImpl extends EFactoryImpl implements ZeugnisFactory {
	/**
	 * Creates the default factory implementation. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public static ZeugnisFactory init() {
		try {
			ZeugnisFactory theZeugnisFactory = (ZeugnisFactory) EPackage.Registry.INSTANCE
					.getEFactory(ZeugnisPackage.eNS_URI);
			if (theZeugnisFactory != null) {
				return theZeugnisFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ZeugnisFactoryImpl();
	}

	/**
	 * Creates an instance of the factory. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public ZeugnisFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case ZeugnisPackage.KLASSE:
			return createKlasse();
		case ZeugnisPackage.JAHRGANG:
			return createJahrgang();
		case ZeugnisPackage.ABSCHLUSS:
			return createAbschluss();
		case ZeugnisPackage.ZEUGNIS:
			return createZeugnis();
		case ZeugnisPackage.BEURTEILUNG:
			return createBeurteilung();
		case ZeugnisPackage.NOTE:
			return createNote();
		case ZeugnisPackage.FORMULIERUNG:
			return createFormulierung();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName()
					+ "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case ZeugnisPackage.ABSCHLUSS_TYP:
			return createAbschlussTypFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '"
					+ eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case ZeugnisPackage.ABSCHLUSS_TYP:
			return convertAbschlussTypToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '"
					+ eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Klasse createKlasse() {
		KlasseImpl klasse = new KlasseImpl();
		return klasse;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Jahrgang createJahrgang() {
		JahrgangImpl jahrgang = new JahrgangImpl();
		return jahrgang;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Abschluss createAbschluss() {
		AbschlussImpl abschluss = new AbschlussImpl();
		return abschluss;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Zeugnis createZeugnis() {
		ZeugnisImpl zeugnis = new ZeugnisImpl();
		return zeugnis;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Beurteilung createBeurteilung() {
		BeurteilungImpl beurteilung = new BeurteilungImpl();
		return beurteilung;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Note createNote() {
		NoteImpl note = new NoteImpl();
		return note;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Formulierung createFormulierung() {
		FormulierungImpl formulierung = new FormulierungImpl();
		return formulierung;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public AbschlussTyp createAbschlussTypFromString(EDataType eDataType,
			String initialValue) {
		AbschlussTyp result = AbschlussTyp.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException("The value '" + initialValue
					+ "' is not a valid enumerator of '" + eDataType.getName()
					+ "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertAbschlussTypToString(EDataType eDataType,
			Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public ZeugnisPackage getZeugnisPackage() {
		return (ZeugnisPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ZeugnisPackage getPackage() {
		return ZeugnisPackage.eINSTANCE;
	}

} // ZeugnisFactoryImpl
