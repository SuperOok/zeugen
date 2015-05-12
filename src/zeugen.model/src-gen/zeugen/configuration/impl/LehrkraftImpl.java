/**
 */
package zeugen.configuration.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import zeugen.configuration.ConfigurationPackage;
import zeugen.configuration.Lehrkraft;
import zeugen.configuration.Notentyp;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Lehrkraft</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link zeugen.configuration.impl.LehrkraftImpl#getFaecher <em>Faecher
 * </em>}</li>
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
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ConfigurationPackage.LEHRKRAFT__FAECHER:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getFaecher())
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
		case ConfigurationPackage.LEHRKRAFT__FAECHER:
			return ((InternalEList<?>) getFaecher())
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
		case ConfigurationPackage.LEHRKRAFT__FAECHER:
			return getFaecher();
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
		}
		return super.eIsSet(featureID);
	}

} // LehrkraftImpl
