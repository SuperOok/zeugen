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

import zeugen.configuration.ConfigurationPackage;
import zeugen.configuration.Schueler;

import zeugen.zeugnis.Beurteilung;
import zeugen.zeugnis.Zeugnis;
import zeugen.zeugnis.ZeugnisPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Zeugnis</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link zeugen.zeugnis.impl.ZeugnisImpl#getSchueler <em>Schueler</em>}</li>
 * <li>{@link zeugen.zeugnis.impl.ZeugnisImpl#getBeurteilungen <em>Beurteilungen
 * </em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ZeugnisImpl extends MinimalEObjectImpl.Container implements
		Zeugnis {
	/**
	 * The cached value of the '{@link #getSchueler() <em>Schueler</em>}'
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getSchueler()
	 * @generated
	 * @ordered
	 */
	protected Schueler schueler;

	/**
	 * The cached value of the '{@link #getBeurteilungen()
	 * <em>Beurteilungen</em>}' containment reference list. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @see #getBeurteilungen()
	 * @generated
	 * @ordered
	 */
	protected EList<Beurteilung> beurteilungen;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ZeugnisImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ZeugnisPackage.Literals.ZEUGNIS;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Schueler getSchueler() {
		if (schueler != null && schueler.eIsProxy()) {
			InternalEObject oldSchueler = (InternalEObject) schueler;
			schueler = (Schueler) eResolveProxy(oldSchueler);
			if (schueler != oldSchueler) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ZeugnisPackage.ZEUGNIS__SCHUELER, oldSchueler,
							schueler));
			}
		}
		return schueler;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Schueler basicGetSchueler() {
		return schueler;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetSchueler(Schueler newSchueler,
			NotificationChain msgs) {
		Schueler oldSchueler = schueler;
		schueler = newSchueler;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET, ZeugnisPackage.ZEUGNIS__SCHUELER,
					oldSchueler, newSchueler);
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
	public void setSchueler(Schueler newSchueler) {
		if (newSchueler != schueler) {
			NotificationChain msgs = null;
			if (schueler != null)
				msgs = ((InternalEObject) schueler).eInverseRemove(this,
						ConfigurationPackage.SCHUELER__ZEUGNIS, Schueler.class,
						msgs);
			if (newSchueler != null)
				msgs = ((InternalEObject) newSchueler).eInverseAdd(this,
						ConfigurationPackage.SCHUELER__ZEUGNIS, Schueler.class,
						msgs);
			msgs = basicSetSchueler(newSchueler, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ZeugnisPackage.ZEUGNIS__SCHUELER, newSchueler, newSchueler));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EList<Beurteilung> getBeurteilungen() {
		if (beurteilungen == null) {
			beurteilungen = new EObjectContainmentEList<Beurteilung>(
					Beurteilung.class, this,
					ZeugnisPackage.ZEUGNIS__BEURTEILUNGEN);
		}
		return beurteilungen;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ZeugnisPackage.ZEUGNIS__SCHUELER:
			if (schueler != null)
				msgs = ((InternalEObject) schueler).eInverseRemove(this,
						ConfigurationPackage.SCHUELER__ZEUGNIS, Schueler.class,
						msgs);
			return basicSetSchueler((Schueler) otherEnd, msgs);
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
		case ZeugnisPackage.ZEUGNIS__SCHUELER:
			return basicSetSchueler(null, msgs);
		case ZeugnisPackage.ZEUGNIS__BEURTEILUNGEN:
			return ((InternalEList<?>) getBeurteilungen()).basicRemove(
					otherEnd, msgs);
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
		case ZeugnisPackage.ZEUGNIS__SCHUELER:
			if (resolve)
				return getSchueler();
			return basicGetSchueler();
		case ZeugnisPackage.ZEUGNIS__BEURTEILUNGEN:
			return getBeurteilungen();
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
		case ZeugnisPackage.ZEUGNIS__SCHUELER:
			setSchueler((Schueler) newValue);
			return;
		case ZeugnisPackage.ZEUGNIS__BEURTEILUNGEN:
			getBeurteilungen().clear();
			getBeurteilungen().addAll(
					(Collection<? extends Beurteilung>) newValue);
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
		case ZeugnisPackage.ZEUGNIS__SCHUELER:
			setSchueler((Schueler) null);
			return;
		case ZeugnisPackage.ZEUGNIS__BEURTEILUNGEN:
			getBeurteilungen().clear();
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
		case ZeugnisPackage.ZEUGNIS__SCHUELER:
			return schueler != null;
		case ZeugnisPackage.ZEUGNIS__BEURTEILUNGEN:
			return beurteilungen != null && !beurteilungen.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // ZeugnisImpl
