/**
 */
package zeugen.zeugnis.impl;

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

import zeugen.zeugnis.Jahrgang;
import zeugen.zeugnis.Klasse;
import zeugen.zeugnis.ZeugnisPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Jahrgang</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link zeugen.zeugnis.impl.JahrgangImpl#getBezeichnung <em>Bezeichnung
 * </em>}</li>
 * <li>{@link zeugen.zeugnis.impl.JahrgangImpl#getKlassen <em>Klassen</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JahrgangImpl extends MinimalEObjectImpl.Container implements
		Jahrgang {
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
	 * The cached value of the '{@link #getKlassen() <em>Klassen</em>}'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getKlassen()
	 * @generated
	 * @ordered
	 */
	protected EList<Klasse> klassen;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected JahrgangImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ZeugnisPackage.Literals.JAHRGANG;
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
					ZeugnisPackage.JAHRGANG__BEZEICHNUNG, oldBezeichnung,
					bezeichnung));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EList<Klasse> getKlassen() {
		if (klassen == null) {
			klassen = new EObjectContainmentEList<Klasse>(Klasse.class, this,
					ZeugnisPackage.JAHRGANG__KLASSEN);
		}
		return klassen;
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
		case ZeugnisPackage.JAHRGANG__KLASSEN:
			return ((InternalEList<?>) getKlassen())
					.basicRemove(otherEnd, msgs);
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
		case ZeugnisPackage.JAHRGANG__BEZEICHNUNG:
			return getBezeichnung();
		case ZeugnisPackage.JAHRGANG__KLASSEN:
			return getKlassen();
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
		case ZeugnisPackage.JAHRGANG__BEZEICHNUNG:
			setBezeichnung((String) newValue);
			return;
		case ZeugnisPackage.JAHRGANG__KLASSEN:
			getKlassen().clear();
			getKlassen().addAll((Collection<? extends Klasse>) newValue);
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
		case ZeugnisPackage.JAHRGANG__BEZEICHNUNG:
			setBezeichnung(BEZEICHNUNG_EDEFAULT);
			return;
		case ZeugnisPackage.JAHRGANG__KLASSEN:
			getKlassen().clear();
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
		case ZeugnisPackage.JAHRGANG__BEZEICHNUNG:
			return BEZEICHNUNG_EDEFAULT == null ? bezeichnung != null
					: !BEZEICHNUNG_EDEFAULT.equals(bezeichnung);
		case ZeugnisPackage.JAHRGANG__KLASSEN:
			return klassen != null && !klassen.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} // JahrgangImpl
