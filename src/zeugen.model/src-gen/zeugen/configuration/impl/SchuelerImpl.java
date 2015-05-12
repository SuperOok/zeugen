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
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import zeugen.configuration.ConfigurationPackage;
import zeugen.configuration.Schueler;
import zeugen.zeugnis.Klasse;
import zeugen.zeugnis.Zeugnis;
import zeugen.zeugnis.ZeugnisPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Schueler</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link zeugen.configuration.impl.SchuelerImpl#getKlasse <em>Klasse</em>}</li>
 * <li>{@link zeugen.configuration.impl.SchuelerImpl#getZeugnis <em>Zeugnis
 * </em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SchuelerImpl extends PersonImpl implements Schueler {
	/**
	 * The cached value of the '{@link #getKlasse() <em>Klasse</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getKlasse()
	 * @generated
	 * @ordered
	 */
	protected Klasse klasse;
	/**
	 * The cached value of the '{@link #getZeugnis() <em>Zeugnis</em>}'
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getZeugnis()
	 * @generated
	 * @ordered
	 */
	protected EList<Zeugnis> zeugnis;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected SchuelerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConfigurationPackage.Literals.SCHUELER;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Klasse getKlasse() {
		if (klasse != null && klasse.eIsProxy()) {
			InternalEObject oldKlasse = (InternalEObject) klasse;
			klasse = (Klasse) eResolveProxy(oldKlasse);
			if (klasse != oldKlasse) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ConfigurationPackage.SCHUELER__KLASSE, oldKlasse,
							klasse));
			}
		}
		return klasse;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Klasse basicGetKlasse() {
		return klasse;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetKlasse(Klasse newKlasse,
			NotificationChain msgs) {
		Klasse oldKlasse = klasse;
		klasse = newKlasse;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET, ConfigurationPackage.SCHUELER__KLASSE,
					oldKlasse, newKlasse);
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
	public void setKlasse(Klasse newKlasse) {
		if (newKlasse != klasse) {
			NotificationChain msgs = null;
			if (klasse != null)
				msgs = ((InternalEObject) klasse).eInverseRemove(this,
						ZeugnisPackage.KLASSE__SCHUELER, Klasse.class, msgs);
			if (newKlasse != null)
				msgs = ((InternalEObject) newKlasse).eInverseAdd(this,
						ZeugnisPackage.KLASSE__SCHUELER, Klasse.class, msgs);
			msgs = basicSetKlasse(newKlasse, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ConfigurationPackage.SCHUELER__KLASSE, newKlasse, newKlasse));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EList<Zeugnis> getZeugnis() {
		if (zeugnis == null) {
			zeugnis = new EObjectWithInverseResolvingEList<Zeugnis>(
					Zeugnis.class, this,
					ConfigurationPackage.SCHUELER__ZEUGNIS,
					ZeugnisPackage.ZEUGNIS__SCHUELER);
		}
		return zeugnis;
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
		case ConfigurationPackage.SCHUELER__KLASSE:
			if (klasse != null)
				msgs = ((InternalEObject) klasse).eInverseRemove(this,
						ZeugnisPackage.KLASSE__SCHUELER, Klasse.class, msgs);
			return basicSetKlasse((Klasse) otherEnd, msgs);
		case ConfigurationPackage.SCHUELER__ZEUGNIS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getZeugnis())
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
		case ConfigurationPackage.SCHUELER__KLASSE:
			return basicSetKlasse(null, msgs);
		case ConfigurationPackage.SCHUELER__ZEUGNIS:
			return ((InternalEList<?>) getZeugnis())
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
		case ConfigurationPackage.SCHUELER__KLASSE:
			if (resolve)
				return getKlasse();
			return basicGetKlasse();
		case ConfigurationPackage.SCHUELER__ZEUGNIS:
			return getZeugnis();
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
		case ConfigurationPackage.SCHUELER__KLASSE:
			setKlasse((Klasse) newValue);
			return;
		case ConfigurationPackage.SCHUELER__ZEUGNIS:
			getZeugnis().clear();
			getZeugnis().addAll((Collection<? extends Zeugnis>) newValue);
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
		case ConfigurationPackage.SCHUELER__KLASSE:
			setKlasse((Klasse) null);
			return;
		case ConfigurationPackage.SCHUELER__ZEUGNIS:
			getZeugnis().clear();
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
		case ConfigurationPackage.SCHUELER__KLASSE:
			return klasse != null;
		case ConfigurationPackage.SCHUELER__ZEUGNIS:
			return zeugnis != null && !zeugnis.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // SchuelerImpl
