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
import zeugen.configuration.Lehrkraft;
import zeugen.configuration.Notentyp;
import zeugen.zeugnis.Klasse;
import zeugen.zeugnis.ZeugnisPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Lehrkraft</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link zeugen.configuration.impl.LehrkraftImpl#getFaecher <em>Faecher
 * </em>}</li>
 * <li>{@link zeugen.configuration.impl.LehrkraftImpl#getKlasse <em>Klasse</em>}
 * </li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LehrkraftImpl extends PersonImpl implements Lehrkraft {
	/**
	 * The cached value of the '{@link #getFaecher() <em>Faecher</em>}'
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getFaecher()
	 * @generated
	 * @ordered
	 */
	protected EList<Notentyp> faecher;

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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected LehrkraftImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConfigurationPackage.Literals.LEHRKRAFT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EList<Notentyp> getFaecher() {
		if (faecher == null) {
			faecher = new EObjectWithInverseResolvingEList.ManyInverse<Notentyp>(
					Notentyp.class, this,
					ConfigurationPackage.LEHRKRAFT__FAECHER,
					ConfigurationPackage.NOTENTYP__LEHRKRAEFTE);
		}
		return faecher;
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
							ConfigurationPackage.LEHRKRAFT__KLASSE, oldKlasse,
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
					Notification.SET, ConfigurationPackage.LEHRKRAFT__KLASSE,
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
						ZeugnisPackage.KLASSE__KLASSENLEHRER, Klasse.class,
						msgs);
			if (newKlasse != null)
				msgs = ((InternalEObject) newKlasse).eInverseAdd(this,
						ZeugnisPackage.KLASSE__KLASSENLEHRER, Klasse.class,
						msgs);
			msgs = basicSetKlasse(newKlasse, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ConfigurationPackage.LEHRKRAFT__KLASSE, newKlasse,
					newKlasse));
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
		case ConfigurationPackage.LEHRKRAFT__FAECHER:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getFaecher())
					.basicAdd(otherEnd, msgs);
		case ConfigurationPackage.LEHRKRAFT__KLASSE:
			if (klasse != null)
				msgs = ((InternalEObject) klasse).eInverseRemove(this,
						ZeugnisPackage.KLASSE__KLASSENLEHRER, Klasse.class,
						msgs);
			return basicSetKlasse((Klasse) otherEnd, msgs);
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
		case ConfigurationPackage.LEHRKRAFT__FAECHER:
			return ((InternalEList<?>) getFaecher())
					.basicRemove(otherEnd, msgs);
		case ConfigurationPackage.LEHRKRAFT__KLASSE:
			return basicSetKlasse(null, msgs);
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
		case ConfigurationPackage.LEHRKRAFT__FAECHER:
			return getFaecher();
		case ConfigurationPackage.LEHRKRAFT__KLASSE:
			if (resolve)
				return getKlasse();
			return basicGetKlasse();
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
		case ConfigurationPackage.LEHRKRAFT__FAECHER:
			getFaecher().clear();
			getFaecher().addAll((Collection<? extends Notentyp>) newValue);
			return;
		case ConfigurationPackage.LEHRKRAFT__KLASSE:
			setKlasse((Klasse) newValue);
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
		case ConfigurationPackage.LEHRKRAFT__FAECHER:
			getFaecher().clear();
			return;
		case ConfigurationPackage.LEHRKRAFT__KLASSE:
			setKlasse((Klasse) null);
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
		case ConfigurationPackage.LEHRKRAFT__FAECHER:
			return faecher != null && !faecher.isEmpty();
		case ConfigurationPackage.LEHRKRAFT__KLASSE:
			return klasse != null;
		}
		return super.eIsSet(featureID);
	}

} // LehrkraftImpl
