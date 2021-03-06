/**
 */
package zeugen.configuration.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import zeugen.configuration.Adresse;
import zeugen.configuration.ConfigurationPackage;
import zeugen.configuration.Klassenstufe;
import zeugen.configuration.Lehrkraft;
import zeugen.configuration.Notentyp;
import zeugen.configuration.Person;
import zeugen.configuration.Schueler;
import zeugen.configuration.Schule;
import zeugen.configuration.Schulleiter;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Schule</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link zeugen.configuration.impl.SchuleImpl#getName <em>Name</em>}</li>
 * <li>{@link zeugen.configuration.impl.SchuleImpl#getAdresse <em>Adresse</em>}</li>
 * <li>{@link zeugen.configuration.impl.SchuleImpl#getLehrer <em>Lehrer</em>}</li>
 * <li>{@link zeugen.configuration.impl.SchuleImpl#getSchulleiter <em>
 * Schulleiter</em>}</li>
 * <li>{@link zeugen.configuration.impl.SchuleImpl#getKlassenstufen <em>
 * Klassenstufen</em>}</li>
 * <li>{@link zeugen.configuration.impl.SchuleImpl#getFaecher <em>Faecher</em>}</li>
 * <li>{@link zeugen.configuration.impl.SchuleImpl#getSchueler <em>Schueler
 * </em>}</li>
 * <li>{@link zeugen.configuration.impl.SchuleImpl#getEhemalige <em>Ehemalige
 * </em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SchuleImpl extends MinimalEObjectImpl.Container implements Schule {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAdresse() <em>Adresse</em>}'
	 * containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getAdresse()
	 * @generated
	 * @ordered
	 */
	protected Adresse adresse;

	/**
	 * The cached value of the '{@link #getLehrer() <em>Lehrer</em>}'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getLehrer()
	 * @generated
	 * @ordered
	 */
	protected EList<Lehrkraft> lehrer;

	/**
	 * The cached value of the '{@link #getSchulleiter() <em>Schulleiter</em>}'
	 * containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getSchulleiter()
	 * @generated
	 * @ordered
	 */
	protected Schulleiter schulleiter;

	/**
	 * The cached value of the '{@link #getKlassenstufen()
	 * <em>Klassenstufen</em>}' containment reference list. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @see #getKlassenstufen()
	 * @generated
	 * @ordered
	 */
	protected EList<Klassenstufe> klassenstufen;

	/**
	 * The cached value of the '{@link #getFaecher() <em>Faecher</em>}'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getFaecher()
	 * @generated
	 * @ordered
	 */
	protected EList<Notentyp> faecher;

	/**
	 * The cached value of the '{@link #getSchueler() <em>Schueler</em>}'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getSchueler()
	 * @generated
	 * @ordered
	 */
	protected EList<Schueler> schueler;

	/**
	 * The cached value of the '{@link #getEhemalige() <em>Ehemalige</em>}'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getEhemalige()
	 * @generated
	 * @ordered
	 */
	protected EList<Person> ehemalige;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected SchuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConfigurationPackage.Literals.SCHULE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ConfigurationPackage.SCHULE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adresse getAdresse() {
		return adresse;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetAdresse(Adresse newAdresse,
			NotificationChain msgs) {
		Adresse oldAdresse = adresse;
		adresse = newAdresse;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET, ConfigurationPackage.SCHULE__ADRESSE,
					oldAdresse, newAdresse);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setAdresse(Adresse newAdresse) {
		if (newAdresse != adresse) {
			NotificationChain msgs = null;
			if (adresse != null)
				msgs = ((InternalEObject) adresse).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- ConfigurationPackage.SCHULE__ADRESSE, null,
						msgs);
			if (newAdresse != null)
				msgs = ((InternalEObject) newAdresse).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- ConfigurationPackage.SCHULE__ADRESSE, null,
						msgs);
			msgs = basicSetAdresse(newAdresse, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ConfigurationPackage.SCHULE__ADRESSE, newAdresse,
					newAdresse));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EList<Lehrkraft> getLehrer() {
		if (lehrer == null) {
			lehrer = new EObjectContainmentEList<Lehrkraft>(Lehrkraft.class,
					this, ConfigurationPackage.SCHULE__LEHRER);
		}
		return lehrer;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Schulleiter getSchulleiter() {
		return schulleiter;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetSchulleiter(Schulleiter newSchulleiter,
			NotificationChain msgs) {
		Schulleiter oldSchulleiter = schulleiter;
		schulleiter = newSchulleiter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET, ConfigurationPackage.SCHULE__SCHULLEITER,
					oldSchulleiter, newSchulleiter);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setSchulleiter(Schulleiter newSchulleiter) {
		if (newSchulleiter != schulleiter) {
			NotificationChain msgs = null;
			if (schulleiter != null)
				msgs = ((InternalEObject) schulleiter).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- ConfigurationPackage.SCHULE__SCHULLEITER,
						null, msgs);
			if (newSchulleiter != null)
				msgs = ((InternalEObject) newSchulleiter).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- ConfigurationPackage.SCHULE__SCHULLEITER,
						null, msgs);
			msgs = basicSetSchulleiter(newSchulleiter, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ConfigurationPackage.SCHULE__SCHULLEITER, newSchulleiter,
					newSchulleiter));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EList<Klassenstufe> getKlassenstufen() {
		if (klassenstufen == null) {
			klassenstufen = new EObjectContainmentEList<Klassenstufe>(
					Klassenstufe.class, this,
					ConfigurationPackage.SCHULE__KLASSENSTUFEN);
		}
		return klassenstufen;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EList<Notentyp> getFaecher() {
		if (faecher == null) {
			faecher = new EObjectContainmentEList<Notentyp>(Notentyp.class,
					this, ConfigurationPackage.SCHULE__FAECHER);
		}
		return faecher;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EList<Schueler> getSchueler() {
		if (schueler == null) {
			schueler = new EObjectContainmentEList<Schueler>(Schueler.class,
					this, ConfigurationPackage.SCHULE__SCHUELER);
		}
		return schueler;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EList<Person> getEhemalige() {
		if (ehemalige == null) {
			ehemalige = new EObjectContainmentEList<Person>(Person.class, this,
					ConfigurationPackage.SCHULE__EHEMALIGE);
		}
		return ehemalige;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ConfigurationPackage.SCHULE__ADRESSE:
			return basicSetAdresse(null, msgs);
		case ConfigurationPackage.SCHULE__LEHRER:
			return ((InternalEList<?>) getLehrer()).basicRemove(otherEnd, msgs);
		case ConfigurationPackage.SCHULE__SCHULLEITER:
			return basicSetSchulleiter(null, msgs);
		case ConfigurationPackage.SCHULE__KLASSENSTUFEN:
			return ((InternalEList<?>) getKlassenstufen()).basicRemove(
					otherEnd, msgs);
		case ConfigurationPackage.SCHULE__FAECHER:
			return ((InternalEList<?>) getFaecher())
					.basicRemove(otherEnd, msgs);
		case ConfigurationPackage.SCHULE__SCHUELER:
			return ((InternalEList<?>) getSchueler()).basicRemove(otherEnd,
					msgs);
		case ConfigurationPackage.SCHULE__EHEMALIGE:
			return ((InternalEList<?>) getEhemalige()).basicRemove(otherEnd,
					msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ConfigurationPackage.SCHULE__NAME:
			return getName();
		case ConfigurationPackage.SCHULE__ADRESSE:
			return getAdresse();
		case ConfigurationPackage.SCHULE__LEHRER:
			return getLehrer();
		case ConfigurationPackage.SCHULE__SCHULLEITER:
			return getSchulleiter();
		case ConfigurationPackage.SCHULE__KLASSENSTUFEN:
			return getKlassenstufen();
		case ConfigurationPackage.SCHULE__FAECHER:
			return getFaecher();
		case ConfigurationPackage.SCHULE__SCHUELER:
			return getSchueler();
		case ConfigurationPackage.SCHULE__EHEMALIGE:
			return getEhemalige();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ConfigurationPackage.SCHULE__NAME:
			setName((String) newValue);
			return;
		case ConfigurationPackage.SCHULE__ADRESSE:
			setAdresse((Adresse) newValue);
			return;
		case ConfigurationPackage.SCHULE__LEHRER:
			getLehrer().clear();
			getLehrer().addAll((Collection<? extends Lehrkraft>) newValue);
			return;
		case ConfigurationPackage.SCHULE__SCHULLEITER:
			setSchulleiter((Schulleiter) newValue);
			return;
		case ConfigurationPackage.SCHULE__KLASSENSTUFEN:
			getKlassenstufen().clear();
			getKlassenstufen().addAll(
					(Collection<? extends Klassenstufe>) newValue);
			return;
		case ConfigurationPackage.SCHULE__FAECHER:
			getFaecher().clear();
			getFaecher().addAll((Collection<? extends Notentyp>) newValue);
			return;
		case ConfigurationPackage.SCHULE__SCHUELER:
			getSchueler().clear();
			getSchueler().addAll((Collection<? extends Schueler>) newValue);
			return;
		case ConfigurationPackage.SCHULE__EHEMALIGE:
			getEhemalige().clear();
			getEhemalige().addAll((Collection<? extends Person>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case ConfigurationPackage.SCHULE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case ConfigurationPackage.SCHULE__ADRESSE:
			setAdresse((Adresse) null);
			return;
		case ConfigurationPackage.SCHULE__LEHRER:
			getLehrer().clear();
			return;
		case ConfigurationPackage.SCHULE__SCHULLEITER:
			setSchulleiter((Schulleiter) null);
			return;
		case ConfigurationPackage.SCHULE__KLASSENSTUFEN:
			getKlassenstufen().clear();
			return;
		case ConfigurationPackage.SCHULE__FAECHER:
			getFaecher().clear();
			return;
		case ConfigurationPackage.SCHULE__SCHUELER:
			getSchueler().clear();
			return;
		case ConfigurationPackage.SCHULE__EHEMALIGE:
			getEhemalige().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case ConfigurationPackage.SCHULE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT
					.equals(name);
		case ConfigurationPackage.SCHULE__ADRESSE:
			return adresse != null;
		case ConfigurationPackage.SCHULE__LEHRER:
			return lehrer != null && !lehrer.isEmpty();
		case ConfigurationPackage.SCHULE__SCHULLEITER:
			return schulleiter != null;
		case ConfigurationPackage.SCHULE__KLASSENSTUFEN:
			return klassenstufen != null && !klassenstufen.isEmpty();
		case ConfigurationPackage.SCHULE__FAECHER:
			return faecher != null && !faecher.isEmpty();
		case ConfigurationPackage.SCHULE__SCHUELER:
			return schueler != null && !schueler.isEmpty();
		case ConfigurationPackage.SCHULE__EHEMALIGE:
			return ehemalige != null && !ehemalige.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} // SchuleImpl
