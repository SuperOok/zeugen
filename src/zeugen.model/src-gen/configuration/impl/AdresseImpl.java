/**
 */
package configuration.impl;

import configuration.Adresse;
import configuration.ConfigurationPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Adresse</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link configuration.impl.AdresseImpl#getStrasse <em>Strasse</em>}</li>
 *   <li>{@link configuration.impl.AdresseImpl#getPostleitzahl <em>Postleitzahl</em>}</li>
 *   <li>{@link configuration.impl.AdresseImpl#getStadt <em>Stadt</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AdresseImpl extends MinimalEObjectImpl.Container implements Adresse {
	/**
	 * The default value of the '{@link #getStrasse() <em>Strasse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrasse()
	 * @generated
	 * @ordered
	 */
	protected static final String STRASSE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStrasse() <em>Strasse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrasse()
	 * @generated
	 * @ordered
	 */
	protected String strasse = STRASSE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPostleitzahl() <em>Postleitzahl</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostleitzahl()
	 * @generated
	 * @ordered
	 */
	protected static final String POSTLEITZAHL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPostleitzahl() <em>Postleitzahl</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostleitzahl()
	 * @generated
	 * @ordered
	 */
	protected String postleitzahl = POSTLEITZAHL_EDEFAULT;

	/**
	 * The default value of the '{@link #getStadt() <em>Stadt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStadt()
	 * @generated
	 * @ordered
	 */
	protected static final String STADT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStadt() <em>Stadt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStadt()
	 * @generated
	 * @ordered
	 */
	protected String stadt = STADT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdresseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConfigurationPackage.Literals.ADRESSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStrasse() {
		return strasse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStrasse(String newStrasse) {
		String oldStrasse = strasse;
		strasse = newStrasse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.ADRESSE__STRASSE, oldStrasse, strasse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPostleitzahl() {
		return postleitzahl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPostleitzahl(String newPostleitzahl) {
		String oldPostleitzahl = postleitzahl;
		postleitzahl = newPostleitzahl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.ADRESSE__POSTLEITZAHL, oldPostleitzahl, postleitzahl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStadt() {
		return stadt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStadt(String newStadt) {
		String oldStadt = stadt;
		stadt = newStadt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.ADRESSE__STADT, oldStadt, stadt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConfigurationPackage.ADRESSE__STRASSE:
				return getStrasse();
			case ConfigurationPackage.ADRESSE__POSTLEITZAHL:
				return getPostleitzahl();
			case ConfigurationPackage.ADRESSE__STADT:
				return getStadt();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ConfigurationPackage.ADRESSE__STRASSE:
				setStrasse((String)newValue);
				return;
			case ConfigurationPackage.ADRESSE__POSTLEITZAHL:
				setPostleitzahl((String)newValue);
				return;
			case ConfigurationPackage.ADRESSE__STADT:
				setStadt((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ConfigurationPackage.ADRESSE__STRASSE:
				setStrasse(STRASSE_EDEFAULT);
				return;
			case ConfigurationPackage.ADRESSE__POSTLEITZAHL:
				setPostleitzahl(POSTLEITZAHL_EDEFAULT);
				return;
			case ConfigurationPackage.ADRESSE__STADT:
				setStadt(STADT_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ConfigurationPackage.ADRESSE__STRASSE:
				return STRASSE_EDEFAULT == null ? strasse != null : !STRASSE_EDEFAULT.equals(strasse);
			case ConfigurationPackage.ADRESSE__POSTLEITZAHL:
				return POSTLEITZAHL_EDEFAULT == null ? postleitzahl != null : !POSTLEITZAHL_EDEFAULT.equals(postleitzahl);
			case ConfigurationPackage.ADRESSE__STADT:
				return STADT_EDEFAULT == null ? stadt != null : !STADT_EDEFAULT.equals(stadt);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (strasse: ");
		result.append(strasse);
		result.append(", postleitzahl: ");
		result.append(postleitzahl);
		result.append(", stadt: ");
		result.append(stadt);
		result.append(')');
		return result.toString();
	}

} //AdresseImpl
