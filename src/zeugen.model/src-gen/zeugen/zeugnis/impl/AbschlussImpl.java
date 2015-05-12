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

import zeugen.zeugnis.Abschluss;
import zeugen.zeugnis.AbschlussTyp;
import zeugen.zeugnis.Zeugnis;
import zeugen.zeugnis.ZeugnisPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Abschluss</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link zeugen.zeugnis.impl.AbschlussImpl#getTyp <em>Typ</em>}</li>
 * <li>{@link zeugen.zeugnis.impl.AbschlussImpl#getZeugnisse <em>Zeugnisse</em>}
 * </li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AbschlussImpl extends MinimalEObjectImpl.Container implements
		Abschluss {
	/**
	 * The default value of the '{@link #getTyp() <em>Typ</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getTyp()
	 * @generated
	 * @ordered
	 */
	protected static final AbschlussTyp TYP_EDEFAULT = AbschlussTyp.HALBJAHR;

	/**
	 * The cached value of the '{@link #getTyp() <em>Typ</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getTyp()
	 * @generated
	 * @ordered
	 */
	protected AbschlussTyp typ = TYP_EDEFAULT;

	/**
	 * The cached value of the '{@link #getZeugnisse() <em>Zeugnisse</em>}'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getZeugnisse()
	 * @generated
	 * @ordered
	 */
	protected EList<Zeugnis> zeugnisse;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected AbschlussImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ZeugnisPackage.Literals.ABSCHLUSS;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public AbschlussTyp getTyp() {
		return typ;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setTyp(AbschlussTyp newTyp) {
		AbschlussTyp oldTyp = typ;
		typ = newTyp == null ? TYP_EDEFAULT : newTyp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ZeugnisPackage.ABSCHLUSS__TYP, oldTyp, typ));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EList<Zeugnis> getZeugnisse() {
		if (zeugnisse == null) {
			zeugnisse = new EObjectContainmentEList<Zeugnis>(Zeugnis.class,
					this, ZeugnisPackage.ABSCHLUSS__ZEUGNISSE);
		}
		return zeugnisse;
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
		case ZeugnisPackage.ABSCHLUSS__ZEUGNISSE:
			return ((InternalEList<?>) getZeugnisse()).basicRemove(otherEnd,
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
		case ZeugnisPackage.ABSCHLUSS__TYP:
			return getTyp();
		case ZeugnisPackage.ABSCHLUSS__ZEUGNISSE:
			return getZeugnisse();
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
		case ZeugnisPackage.ABSCHLUSS__TYP:
			setTyp((AbschlussTyp) newValue);
			return;
		case ZeugnisPackage.ABSCHLUSS__ZEUGNISSE:
			getZeugnisse().clear();
			getZeugnisse().addAll((Collection<? extends Zeugnis>) newValue);
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
		case ZeugnisPackage.ABSCHLUSS__TYP:
			setTyp(TYP_EDEFAULT);
			return;
		case ZeugnisPackage.ABSCHLUSS__ZEUGNISSE:
			getZeugnisse().clear();
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
		case ZeugnisPackage.ABSCHLUSS__TYP:
			return typ != TYP_EDEFAULT;
		case ZeugnisPackage.ABSCHLUSS__ZEUGNISSE:
			return zeugnisse != null && !zeugnisse.isEmpty();
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
		result.append(" (typ: ");
		result.append(typ);
		result.append(')');
		return result.toString();
	}

} // AbschlussImpl
