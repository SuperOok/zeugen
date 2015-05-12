/**
 */
package zeugen.zeugnis.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import zeugen.configuration.Notentyp;

import zeugen.zeugnis.Beurteilung;
import zeugen.zeugnis.ZeugnisPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Beurteilung</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link zeugen.zeugnis.impl.BeurteilungImpl#getNotentyp <em>Notentyp</em>}
 * </li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BeurteilungImpl extends MinimalEObjectImpl.Container implements
		Beurteilung {
	/**
	 * The cached value of the '{@link #getNotentyp() <em>Notentyp</em>}'
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getNotentyp()
	 * @generated
	 * @ordered
	 */
	protected Notentyp notentyp;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected BeurteilungImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ZeugnisPackage.Literals.BEURTEILUNG;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Notentyp getNotentyp() {
		if (notentyp != null && notentyp.eIsProxy()) {
			InternalEObject oldNotentyp = (InternalEObject) notentyp;
			notentyp = (Notentyp) eResolveProxy(oldNotentyp);
			if (notentyp != oldNotentyp) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ZeugnisPackage.BEURTEILUNG__NOTENTYP, oldNotentyp,
							notentyp));
			}
		}
		return notentyp;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Notentyp basicGetNotentyp() {
		return notentyp;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setNotentyp(Notentyp newNotentyp) {
		Notentyp oldNotentyp = notentyp;
		notentyp = newNotentyp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ZeugnisPackage.BEURTEILUNG__NOTENTYP, oldNotentyp, notentyp));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ZeugnisPackage.BEURTEILUNG__NOTENTYP:
			if (resolve)
				return getNotentyp();
			return basicGetNotentyp();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ZeugnisPackage.BEURTEILUNG__NOTENTYP:
			setNotentyp((Notentyp) newValue);
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
		case ZeugnisPackage.BEURTEILUNG__NOTENTYP:
			setNotentyp((Notentyp) null);
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
		case ZeugnisPackage.BEURTEILUNG__NOTENTYP:
			return notentyp != null;
		}
		return super.eIsSet(featureID);
	}

} // BeurteilungImpl
