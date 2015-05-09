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

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import zeugen.configuration.ConfigurationPackage;
import zeugen.configuration.Klassenstufe;
import zeugen.configuration.Notentyp;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Klassenstufe</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link zeugen.configuration.impl.KlassenstufeImpl#getBezeichnung <em>
 * Bezeichnung</em>}</li>
 * <li>{@link zeugen.configuration.impl.KlassenstufeImpl#getAnzeigename <em>
 * Anzeigename</em>}</li>
 * <li>{@link zeugen.configuration.impl.KlassenstufeImpl#getNotentypen <em>
 * Notentypen</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class KlassenstufeImpl extends MinimalEObjectImpl.Container implements
		Klassenstufe {
	/**
	 * The default value of the '{@link #getBezeichnung() <em>Bezeichnung</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getBezeichnung()
	 * @generated
	 * @ordered
	 */
	protected static final String BEZEICHNUNG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBezeichnung() <em>Bezeichnung</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getBezeichnung()
	 * @generated
	 * @ordered
	 */
	protected String bezeichnung = BEZEICHNUNG_EDEFAULT;

	/**
	 * The default value of the '{@link #getAnzeigename() <em>Anzeigename</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getAnzeigename()
	 * @generated
	 * @ordered
	 */
	protected static final String ANZEIGENAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAnzeigename() <em>Anzeigename</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getAnzeigename()
	 * @generated
	 * @ordered
	 */
	protected String anzeigename = ANZEIGENAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNotentypen() <em>Notentypen</em>}'
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getNotentypen()
	 * @generated
	 * @ordered
	 */
	protected EList<Notentyp> notentypen;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected KlassenstufeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConfigurationPackage.Literals.KLASSENSTUFE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getBezeichnung() {
		return bezeichnung;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setBezeichnung(String newBezeichnung) {
		String oldBezeichnung = bezeichnung;
		bezeichnung = newBezeichnung;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ConfigurationPackage.KLASSENSTUFE__BEZEICHNUNG,
					oldBezeichnung, bezeichnung));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getAnzeigename() {
		return anzeigename;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setAnzeigename(String newAnzeigename) {
		String oldAnzeigename = anzeigename;
		anzeigename = newAnzeigename;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ConfigurationPackage.KLASSENSTUFE__ANZEIGENAME,
					oldAnzeigename, anzeigename));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EList<Notentyp> getNotentypen() {
		if (notentypen == null) {
			notentypen = new EObjectWithInverseResolvingEList.ManyInverse<Notentyp>(
					Notentyp.class, this,
					ConfigurationPackage.KLASSENSTUFE__NOTENTYPEN,
					ConfigurationPackage.NOTENTYP__KLASSENSTUFEN);
		}
		return notentypen;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ConfigurationPackage.KLASSENSTUFE__NOTENTYPEN:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getNotentypen())
					.basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
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
		case ConfigurationPackage.KLASSENSTUFE__NOTENTYPEN:
			return ((InternalEList<?>) getNotentypen()).basicRemove(otherEnd,
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
		case ConfigurationPackage.KLASSENSTUFE__BEZEICHNUNG:
			return getBezeichnung();
		case ConfigurationPackage.KLASSENSTUFE__ANZEIGENAME:
			return getAnzeigename();
		case ConfigurationPackage.KLASSENSTUFE__NOTENTYPEN:
			return getNotentypen();
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
		case ConfigurationPackage.KLASSENSTUFE__BEZEICHNUNG:
			setBezeichnung((String) newValue);
			return;
		case ConfigurationPackage.KLASSENSTUFE__ANZEIGENAME:
			setAnzeigename((String) newValue);
			return;
		case ConfigurationPackage.KLASSENSTUFE__NOTENTYPEN:
			getNotentypen().clear();
			getNotentypen().addAll((Collection<? extends Notentyp>) newValue);
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
		case ConfigurationPackage.KLASSENSTUFE__BEZEICHNUNG:
			setBezeichnung(BEZEICHNUNG_EDEFAULT);
			return;
		case ConfigurationPackage.KLASSENSTUFE__ANZEIGENAME:
			setAnzeigename(ANZEIGENAME_EDEFAULT);
			return;
		case ConfigurationPackage.KLASSENSTUFE__NOTENTYPEN:
			getNotentypen().clear();
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
		case ConfigurationPackage.KLASSENSTUFE__BEZEICHNUNG:
			return BEZEICHNUNG_EDEFAULT == null ? bezeichnung != null
					: !BEZEICHNUNG_EDEFAULT.equals(bezeichnung);
		case ConfigurationPackage.KLASSENSTUFE__ANZEIGENAME:
			return ANZEIGENAME_EDEFAULT == null ? anzeigename != null
					: !ANZEIGENAME_EDEFAULT.equals(anzeigename);
		case ConfigurationPackage.KLASSENSTUFE__NOTENTYPEN:
			return notentypen != null && !notentypen.isEmpty();
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
		result.append(" (bezeichnung: ");
		result.append(bezeichnung);
		result.append(", anzeigename: ");
		result.append(anzeigename);
		result.append(')');
		return result.toString();
	}

} // KlassenstufeImpl
