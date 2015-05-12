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
import zeugen.configuration.FachTyp;
import zeugen.configuration.Klassenstufe;
import zeugen.configuration.Lehrkraft;
import zeugen.configuration.Notentyp;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Notentyp</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link zeugen.configuration.impl.NotentypImpl#getName <em>Name</em>}</li>
 * <li>{@link zeugen.configuration.impl.NotentypImpl#getTyp <em>Typ</em>}</li>
 * <li>{@link zeugen.configuration.impl.NotentypImpl#getKlassenstufen <em>
 * Klassenstufen</em>}</li>
 * <li>{@link zeugen.configuration.impl.NotentypImpl#getLehrkraefte <em>
 * Lehrkraefte</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NotentypImpl extends MinimalEObjectImpl.Container implements
		Notentyp {
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
	 * The default value of the '{@link #getTyp() <em>Typ</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getTyp()
	 * @generated
	 * @ordered
	 */
	protected static final FachTyp TYP_EDEFAULT = FachTyp.SCHULFACH;

	/**
	 * The cached value of the '{@link #getTyp() <em>Typ</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getTyp()
	 * @generated
	 * @ordered
	 */
	protected FachTyp typ = TYP_EDEFAULT;

	/**
	 * The cached value of the '{@link #getKlassenstufen()
	 * <em>Klassenstufen</em>}' reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getKlassenstufen()
	 * @generated
	 * @ordered
	 */
	protected EList<Klassenstufe> klassenstufen;

	/**
	 * The cached value of the '{@link #getLehrkraefte() <em>Lehrkraefte</em>}'
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getLehrkraefte()
	 * @generated
	 * @ordered
	 */
	protected EList<Lehrkraft> lehrkraefte;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected NotentypImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConfigurationPackage.Literals.NOTENTYP;
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
					ConfigurationPackage.NOTENTYP__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public FachTyp getTyp() {
		return typ;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setTyp(FachTyp newTyp) {
		FachTyp oldTyp = typ;
		typ = newTyp == null ? TYP_EDEFAULT : newTyp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ConfigurationPackage.NOTENTYP__TYP, oldTyp, typ));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EList<Klassenstufe> getKlassenstufen() {
		if (klassenstufen == null) {
			klassenstufen = new EObjectWithInverseResolvingEList.ManyInverse<Klassenstufe>(
					Klassenstufe.class, this,
					ConfigurationPackage.NOTENTYP__KLASSENSTUFEN,
					ConfigurationPackage.KLASSENSTUFE__NOTENTYPEN);
		}
		return klassenstufen;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EList<Lehrkraft> getLehrkraefte() {
		if (lehrkraefte == null) {
			lehrkraefte = new EObjectWithInverseResolvingEList.ManyInverse<Lehrkraft>(
					Lehrkraft.class, this,
					ConfigurationPackage.NOTENTYP__LEHRKRAEFTE,
					ConfigurationPackage.LEHRKRAFT__FAECHER);
		}
		return lehrkraefte;
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
		case ConfigurationPackage.NOTENTYP__KLASSENSTUFEN:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getKlassenstufen())
					.basicAdd(otherEnd, msgs);
		case ConfigurationPackage.NOTENTYP__LEHRKRAEFTE:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getLehrkraefte())
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
		case ConfigurationPackage.NOTENTYP__KLASSENSTUFEN:
			return ((InternalEList<?>) getKlassenstufen()).basicRemove(
					otherEnd, msgs);
		case ConfigurationPackage.NOTENTYP__LEHRKRAEFTE:
			return ((InternalEList<?>) getLehrkraefte()).basicRemove(otherEnd,
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
		case ConfigurationPackage.NOTENTYP__NAME:
			return getName();
		case ConfigurationPackage.NOTENTYP__TYP:
			return getTyp();
		case ConfigurationPackage.NOTENTYP__KLASSENSTUFEN:
			return getKlassenstufen();
		case ConfigurationPackage.NOTENTYP__LEHRKRAEFTE:
			return getLehrkraefte();
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
		case ConfigurationPackage.NOTENTYP__NAME:
			setName((String) newValue);
			return;
		case ConfigurationPackage.NOTENTYP__TYP:
			setTyp((FachTyp) newValue);
			return;
		case ConfigurationPackage.NOTENTYP__KLASSENSTUFEN:
			getKlassenstufen().clear();
			getKlassenstufen().addAll(
					(Collection<? extends Klassenstufe>) newValue);
			return;
		case ConfigurationPackage.NOTENTYP__LEHRKRAEFTE:
			getLehrkraefte().clear();
			getLehrkraefte().addAll((Collection<? extends Lehrkraft>) newValue);
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
		case ConfigurationPackage.NOTENTYP__NAME:
			setName(NAME_EDEFAULT);
			return;
		case ConfigurationPackage.NOTENTYP__TYP:
			setTyp(TYP_EDEFAULT);
			return;
		case ConfigurationPackage.NOTENTYP__KLASSENSTUFEN:
			getKlassenstufen().clear();
			return;
		case ConfigurationPackage.NOTENTYP__LEHRKRAEFTE:
			getLehrkraefte().clear();
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
		case ConfigurationPackage.NOTENTYP__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT
					.equals(name);
		case ConfigurationPackage.NOTENTYP__TYP:
			return typ != TYP_EDEFAULT;
		case ConfigurationPackage.NOTENTYP__KLASSENSTUFEN:
			return klassenstufen != null && !klassenstufen.isEmpty();
		case ConfigurationPackage.NOTENTYP__LEHRKRAEFTE:
			return lehrkraefte != null && !lehrkraefte.isEmpty();
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
		result.append(", typ: ");
		result.append(typ);
		result.append(')');
		return result.toString();
	}

} // NotentypImpl
