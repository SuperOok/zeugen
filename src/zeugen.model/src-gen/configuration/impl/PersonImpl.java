/**
 */
package configuration.impl;

import configuration.ConfigurationPackage;
import configuration.Geschlecht;
import configuration.Person;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link configuration.impl.PersonImpl#getVorname <em>Vorname</em>}</li>
 *   <li>{@link configuration.impl.PersonImpl#getNachname <em>Nachname</em>}</li>
 *   <li>{@link configuration.impl.PersonImpl#getGeburtstag <em>Geburtstag</em>}</li>
 *   <li>{@link configuration.impl.PersonImpl#getGeburtsort <em>Geburtsort</em>}</li>
 *   <li>{@link configuration.impl.PersonImpl#getName <em>Name</em>}</li>
 *   <li>{@link configuration.impl.PersonImpl#getGeschlecht <em>Geschlecht</em>}</li>
 *   <li>{@link configuration.impl.PersonImpl#getNamenszusatz <em>Namenszusatz</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PersonImpl extends MinimalEObjectImpl.Container implements Person {
	/**
	 * The cached value of the '{@link #getVorname() <em>Vorname</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVorname()
	 * @generated
	 * @ordered
	 */
	protected EList<String> vorname;

	/**
	 * The default value of the '{@link #getNachname() <em>Nachname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNachname()
	 * @generated
	 * @ordered
	 */
	protected static final String NACHNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNachname() <em>Nachname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNachname()
	 * @generated
	 * @ordered
	 */
	protected String nachname = NACHNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getGeburtstag() <em>Geburtstag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeburtstag()
	 * @generated
	 * @ordered
	 */
	protected static final Date GEBURTSTAG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGeburtstag() <em>Geburtstag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeburtstag()
	 * @generated
	 * @ordered
	 */
	protected Date geburtstag = GEBURTSTAG_EDEFAULT;

	/**
	 * The default value of the '{@link #getGeburtsort() <em>Geburtsort</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeburtsort()
	 * @generated
	 * @ordered
	 */
	protected static final String GEBURTSORT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGeburtsort() <em>Geburtsort</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeburtsort()
	 * @generated
	 * @ordered
	 */
	protected String geburtsort = GEBURTSORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getGeschlecht() <em>Geschlecht</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeschlecht()
	 * @generated
	 * @ordered
	 */
	protected static final Geschlecht GESCHLECHT_EDEFAULT = Geschlecht.UNBEKANNT;

	/**
	 * The cached value of the '{@link #getGeschlecht() <em>Geschlecht</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeschlecht()
	 * @generated
	 * @ordered
	 */
	protected Geschlecht geschlecht = GESCHLECHT_EDEFAULT;

	/**
	 * This is true if the Geschlecht attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean geschlechtESet;

	/**
	 * The default value of the '{@link #getNamenszusatz() <em>Namenszusatz</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamenszusatz()
	 * @generated
	 * @ordered
	 */
	protected static final String NAMENSZUSATZ_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNamenszusatz() <em>Namenszusatz</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamenszusatz()
	 * @generated
	 * @ordered
	 */
	protected String namenszusatz = NAMENSZUSATZ_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConfigurationPackage.Literals.PERSON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getVorname() {
		if (vorname == null) {
			vorname = new EDataTypeUniqueEList<String>(String.class, this, ConfigurationPackage.PERSON__VORNAME);
		}
		return vorname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNachname() {
		return nachname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNachname(String newNachname) {
		String oldNachname = nachname;
		nachname = newNachname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.PERSON__NACHNAME, oldNachname, nachname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getGeburtstag() {
		return geburtstag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeburtstag(Date newGeburtstag) {
		Date oldGeburtstag = geburtstag;
		geburtstag = newGeburtstag;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.PERSON__GEBURTSTAG, oldGeburtstag, geburtstag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGeburtsort() {
		return geburtsort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeburtsort(String newGeburtsort) {
		String oldGeburtsort = geburtsort;
		geburtsort = newGeburtsort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.PERSON__GEBURTSORT, oldGeburtsort, geburtsort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		// TODO: implement this method to return the 'Name' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Geschlecht getGeschlecht() {
		return geschlecht;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeschlecht(Geschlecht newGeschlecht) {
		Geschlecht oldGeschlecht = geschlecht;
		geschlecht = newGeschlecht == null ? GESCHLECHT_EDEFAULT : newGeschlecht;
		boolean oldGeschlechtESet = geschlechtESet;
		geschlechtESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.PERSON__GESCHLECHT, oldGeschlecht, geschlecht, !oldGeschlechtESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetGeschlecht() {
		Geschlecht oldGeschlecht = geschlecht;
		boolean oldGeschlechtESet = geschlechtESet;
		geschlecht = GESCHLECHT_EDEFAULT;
		geschlechtESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ConfigurationPackage.PERSON__GESCHLECHT, oldGeschlecht, GESCHLECHT_EDEFAULT, oldGeschlechtESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetGeschlecht() {
		return geschlechtESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNamenszusatz() {
		return namenszusatz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNamenszusatz(String newNamenszusatz) {
		String oldNamenszusatz = namenszusatz;
		namenszusatz = newNamenszusatz;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.PERSON__NAMENSZUSATZ, oldNamenszusatz, namenszusatz));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConfigurationPackage.PERSON__VORNAME:
				return getVorname();
			case ConfigurationPackage.PERSON__NACHNAME:
				return getNachname();
			case ConfigurationPackage.PERSON__GEBURTSTAG:
				return getGeburtstag();
			case ConfigurationPackage.PERSON__GEBURTSORT:
				return getGeburtsort();
			case ConfigurationPackage.PERSON__NAME:
				return getName();
			case ConfigurationPackage.PERSON__GESCHLECHT:
				return getGeschlecht();
			case ConfigurationPackage.PERSON__NAMENSZUSATZ:
				return getNamenszusatz();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ConfigurationPackage.PERSON__VORNAME:
				getVorname().clear();
				getVorname().addAll((Collection<? extends String>)newValue);
				return;
			case ConfigurationPackage.PERSON__NACHNAME:
				setNachname((String)newValue);
				return;
			case ConfigurationPackage.PERSON__GEBURTSTAG:
				setGeburtstag((Date)newValue);
				return;
			case ConfigurationPackage.PERSON__GEBURTSORT:
				setGeburtsort((String)newValue);
				return;
			case ConfigurationPackage.PERSON__GESCHLECHT:
				setGeschlecht((Geschlecht)newValue);
				return;
			case ConfigurationPackage.PERSON__NAMENSZUSATZ:
				setNamenszusatz((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ConfigurationPackage.PERSON__VORNAME:
				getVorname().clear();
				return;
			case ConfigurationPackage.PERSON__NACHNAME:
				setNachname(NACHNAME_EDEFAULT);
				return;
			case ConfigurationPackage.PERSON__GEBURTSTAG:
				setGeburtstag(GEBURTSTAG_EDEFAULT);
				return;
			case ConfigurationPackage.PERSON__GEBURTSORT:
				setGeburtsort(GEBURTSORT_EDEFAULT);
				return;
			case ConfigurationPackage.PERSON__GESCHLECHT:
				unsetGeschlecht();
				return;
			case ConfigurationPackage.PERSON__NAMENSZUSATZ:
				setNamenszusatz(NAMENSZUSATZ_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ConfigurationPackage.PERSON__VORNAME:
				return vorname != null && !vorname.isEmpty();
			case ConfigurationPackage.PERSON__NACHNAME:
				return NACHNAME_EDEFAULT == null ? nachname != null : !NACHNAME_EDEFAULT.equals(nachname);
			case ConfigurationPackage.PERSON__GEBURTSTAG:
				return GEBURTSTAG_EDEFAULT == null ? geburtstag != null : !GEBURTSTAG_EDEFAULT.equals(geburtstag);
			case ConfigurationPackage.PERSON__GEBURTSORT:
				return GEBURTSORT_EDEFAULT == null ? geburtsort != null : !GEBURTSORT_EDEFAULT.equals(geburtsort);
			case ConfigurationPackage.PERSON__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case ConfigurationPackage.PERSON__GESCHLECHT:
				return isSetGeschlecht();
			case ConfigurationPackage.PERSON__NAMENSZUSATZ:
				return NAMENSZUSATZ_EDEFAULT == null ? namenszusatz != null : !NAMENSZUSATZ_EDEFAULT.equals(namenszusatz);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (vorname: ");
		result.append(vorname);
		result.append(", nachname: ");
		result.append(nachname);
		result.append(", geburtstag: ");
		result.append(geburtstag);
		result.append(", geburtsort: ");
		result.append(geburtsort);
		result.append(", geschlecht: ");
		if (geschlechtESet) result.append(geschlecht); else result.append("<unset>");
		result.append(", namenszusatz: ");
		result.append(namenszusatz);
		result.append(')');
		return result.toString();
	}

} //PersonImpl
