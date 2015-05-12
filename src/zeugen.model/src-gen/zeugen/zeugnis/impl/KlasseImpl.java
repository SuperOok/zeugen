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
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import zeugen.configuration.ConfigurationPackage;
import zeugen.configuration.Klassenstufe;
import zeugen.configuration.Lehrkraft;
import zeugen.configuration.Schueler;

import zeugen.zeugnis.Abschluss;
import zeugen.zeugnis.Klasse;
import zeugen.zeugnis.ZeugnisPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Klasse</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link zeugen.zeugnis.impl.KlasseImpl#getKlassenstufe <em>Klassenstufe
 * </em>}</li>
 * <li>{@link zeugen.zeugnis.impl.KlasseImpl#getSchueler <em>Schueler</em>}</li>
 * <li>{@link zeugen.zeugnis.impl.KlasseImpl#getAbschluesse <em>Abschluesse
 * </em>}</li>
 * <li>{@link zeugen.zeugnis.impl.KlasseImpl#getKlassenlehrer <em>Klassenlehrer
 * </em>}</li>
 * <li>{@link zeugen.zeugnis.impl.KlasseImpl#getBezeichnung <em>Bezeichnung
 * </em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class KlasseImpl extends MinimalEObjectImpl.Container implements Klasse {
	/**
	 * The cached value of the '{@link #getKlassenstufe() <em>Klassenstufe</em>}
	 * ' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getKlassenstufe()
	 * @generated
	 * @ordered
	 */
	protected Klassenstufe klassenstufe;

	/**
	 * The cached value of the '{@link #getSchueler() <em>Schueler</em>}'
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getSchueler()
	 * @generated
	 * @ordered
	 */
	protected EList<Schueler> schueler;

	/**
	 * The cached value of the '{@link #getAbschluesse() <em>Abschluesse</em>}'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getAbschluesse()
	 * @generated
	 * @ordered
	 */
	protected EList<Abschluss> abschluesse;

	/**
	 * The cached value of the '{@link #getKlassenlehrer()
	 * <em>Klassenlehrer</em>}' reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getKlassenlehrer()
	 * @generated
	 * @ordered
	 */
	protected Lehrkraft klassenlehrer;

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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected KlasseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ZeugnisPackage.Literals.KLASSE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Klassenstufe getKlassenstufe() {
		if (klassenstufe != null && klassenstufe.eIsProxy()) {
			InternalEObject oldKlassenstufe = (InternalEObject) klassenstufe;
			klassenstufe = (Klassenstufe) eResolveProxy(oldKlassenstufe);
			if (klassenstufe != oldKlassenstufe) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ZeugnisPackage.KLASSE__KLASSENSTUFE,
							oldKlassenstufe, klassenstufe));
			}
		}
		return klassenstufe;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Klassenstufe basicGetKlassenstufe() {
		return klassenstufe;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setKlassenstufe(Klassenstufe newKlassenstufe) {
		Klassenstufe oldKlassenstufe = klassenstufe;
		klassenstufe = newKlassenstufe;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ZeugnisPackage.KLASSE__KLASSENSTUFE, oldKlassenstufe,
					klassenstufe));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EList<Schueler> getSchueler() {
		if (schueler == null) {
			schueler = new EObjectWithInverseResolvingEList<Schueler>(
					Schueler.class, this, ZeugnisPackage.KLASSE__SCHUELER,
					ConfigurationPackage.SCHUELER__KLASSE);
		}
		return schueler;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EList<Abschluss> getAbschluesse() {
		if (abschluesse == null) {
			abschluesse = new EObjectContainmentEList<Abschluss>(
					Abschluss.class, this, ZeugnisPackage.KLASSE__ABSCHLUESSE);
		}
		return abschluesse;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Lehrkraft getKlassenlehrer() {
		if (klassenlehrer != null && klassenlehrer.eIsProxy()) {
			InternalEObject oldKlassenlehrer = (InternalEObject) klassenlehrer;
			klassenlehrer = (Lehrkraft) eResolveProxy(oldKlassenlehrer);
			if (klassenlehrer != oldKlassenlehrer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ZeugnisPackage.KLASSE__KLASSENLEHRER,
							oldKlassenlehrer, klassenlehrer));
			}
		}
		return klassenlehrer;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Lehrkraft basicGetKlassenlehrer() {
		return klassenlehrer;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetKlassenlehrer(Lehrkraft newKlassenlehrer,
			NotificationChain msgs) {
		Lehrkraft oldKlassenlehrer = klassenlehrer;
		klassenlehrer = newKlassenlehrer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET, ZeugnisPackage.KLASSE__KLASSENLEHRER,
					oldKlassenlehrer, newKlassenlehrer);
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
	public void setKlassenlehrer(Lehrkraft newKlassenlehrer) {
		if (newKlassenlehrer != klassenlehrer) {
			NotificationChain msgs = null;
			if (klassenlehrer != null)
				msgs = ((InternalEObject) klassenlehrer).eInverseRemove(this,
						ConfigurationPackage.LEHRKRAFT__KLASSE,
						Lehrkraft.class, msgs);
			if (newKlassenlehrer != null)
				msgs = ((InternalEObject) newKlassenlehrer).eInverseAdd(this,
						ConfigurationPackage.LEHRKRAFT__KLASSE,
						Lehrkraft.class, msgs);
			msgs = basicSetKlassenlehrer(newKlassenlehrer, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ZeugnisPackage.KLASSE__KLASSENLEHRER, newKlassenlehrer,
					newKlassenlehrer));
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
					ZeugnisPackage.KLASSE__BEZEICHNUNG, oldBezeichnung,
					bezeichnung));
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
		case ZeugnisPackage.KLASSE__SCHUELER:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getSchueler())
					.basicAdd(otherEnd, msgs);
		case ZeugnisPackage.KLASSE__KLASSENLEHRER:
			if (klassenlehrer != null)
				msgs = ((InternalEObject) klassenlehrer).eInverseRemove(this,
						ConfigurationPackage.LEHRKRAFT__KLASSE,
						Lehrkraft.class, msgs);
			return basicSetKlassenlehrer((Lehrkraft) otherEnd, msgs);
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
		case ZeugnisPackage.KLASSE__SCHUELER:
			return ((InternalEList<?>) getSchueler()).basicRemove(otherEnd,
					msgs);
		case ZeugnisPackage.KLASSE__ABSCHLUESSE:
			return ((InternalEList<?>) getAbschluesse()).basicRemove(otherEnd,
					msgs);
		case ZeugnisPackage.KLASSE__KLASSENLEHRER:
			return basicSetKlassenlehrer(null, msgs);
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
		case ZeugnisPackage.KLASSE__KLASSENSTUFE:
			if (resolve)
				return getKlassenstufe();
			return basicGetKlassenstufe();
		case ZeugnisPackage.KLASSE__SCHUELER:
			return getSchueler();
		case ZeugnisPackage.KLASSE__ABSCHLUESSE:
			return getAbschluesse();
		case ZeugnisPackage.KLASSE__KLASSENLEHRER:
			if (resolve)
				return getKlassenlehrer();
			return basicGetKlassenlehrer();
		case ZeugnisPackage.KLASSE__BEZEICHNUNG:
			return getBezeichnung();
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
		case ZeugnisPackage.KLASSE__KLASSENSTUFE:
			setKlassenstufe((Klassenstufe) newValue);
			return;
		case ZeugnisPackage.KLASSE__SCHUELER:
			getSchueler().clear();
			getSchueler().addAll((Collection<? extends Schueler>) newValue);
			return;
		case ZeugnisPackage.KLASSE__ABSCHLUESSE:
			getAbschluesse().clear();
			getAbschluesse().addAll((Collection<? extends Abschluss>) newValue);
			return;
		case ZeugnisPackage.KLASSE__KLASSENLEHRER:
			setKlassenlehrer((Lehrkraft) newValue);
			return;
		case ZeugnisPackage.KLASSE__BEZEICHNUNG:
			setBezeichnung((String) newValue);
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
		case ZeugnisPackage.KLASSE__KLASSENSTUFE:
			setKlassenstufe((Klassenstufe) null);
			return;
		case ZeugnisPackage.KLASSE__SCHUELER:
			getSchueler().clear();
			return;
		case ZeugnisPackage.KLASSE__ABSCHLUESSE:
			getAbschluesse().clear();
			return;
		case ZeugnisPackage.KLASSE__KLASSENLEHRER:
			setKlassenlehrer((Lehrkraft) null);
			return;
		case ZeugnisPackage.KLASSE__BEZEICHNUNG:
			setBezeichnung(BEZEICHNUNG_EDEFAULT);
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
		case ZeugnisPackage.KLASSE__KLASSENSTUFE:
			return klassenstufe != null;
		case ZeugnisPackage.KLASSE__SCHUELER:
			return schueler != null && !schueler.isEmpty();
		case ZeugnisPackage.KLASSE__ABSCHLUESSE:
			return abschluesse != null && !abschluesse.isEmpty();
		case ZeugnisPackage.KLASSE__KLASSENLEHRER:
			return klassenlehrer != null;
		case ZeugnisPackage.KLASSE__BEZEICHNUNG:
			return BEZEICHNUNG_EDEFAULT == null ? bezeichnung != null
					: !BEZEICHNUNG_EDEFAULT.equals(bezeichnung);
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

} // KlasseImpl
