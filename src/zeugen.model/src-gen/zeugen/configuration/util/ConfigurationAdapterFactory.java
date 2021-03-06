/**
 */
package zeugen.configuration.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import zeugen.configuration.*;

/**
 * <!-- begin-user-doc --> The <b>Adapter Factory</b> for the model. It provides
 * an adapter <code>createXXX</code> method for each class of the model. <!--
 * end-user-doc -->
 * 
 * @see zeugen.configuration.ConfigurationPackage
 * @generated
 */
public class ConfigurationAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected static ConfigurationPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public ConfigurationAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ConfigurationPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc --> This implementation returns <code>true</code> if
	 * the object is either the model's package or is an instance object of the
	 * model. <!-- end-user-doc -->
	 * 
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ConfigurationSwitch<Adapter> modelSwitch = new ConfigurationSwitch<Adapter>() {
		@Override
		public Adapter caseSchule(Schule object) {
			return createSchuleAdapter();
		}

		@Override
		public Adapter caseLehrkraft(Lehrkraft object) {
			return createLehrkraftAdapter();
		}

		@Override
		public Adapter caseNotentyp(Notentyp object) {
			return createNotentypAdapter();
		}

		@Override
		public Adapter caseKlassenstufe(Klassenstufe object) {
			return createKlassenstufeAdapter();
		}

		@Override
		public Adapter caseAdresse(Adresse object) {
			return createAdresseAdapter();
		}

		@Override
		public Adapter casePerson(Person object) {
			return createPersonAdapter();
		}

		@Override
		public Adapter caseSchulleiter(Schulleiter object) {
			return createSchulleiterAdapter();
		}

		@Override
		public Adapter caseSchueler(Schueler object) {
			return createSchuelerAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param target
	 *            the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link zeugen.configuration.Schule <em>Schule</em>}'. <!-- begin-user-doc
	 * --> This default implementation returns null so that we can easily ignore
	 * cases; it's useful to ignore a case when inheritance will catch all the
	 * cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see zeugen.configuration.Schule
	 * @generated
	 */
	public Adapter createSchuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link zeugen.configuration.Lehrkraft <em>Lehrkraft</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we
	 * can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see zeugen.configuration.Lehrkraft
	 * @generated
	 */
	public Adapter createLehrkraftAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link zeugen.configuration.Notentyp <em>Notentyp</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we
	 * can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see zeugen.configuration.Notentyp
	 * @generated
	 */
	public Adapter createNotentypAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link zeugen.configuration.Klassenstufe <em>Klassenstufe</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we
	 * can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see zeugen.configuration.Klassenstufe
	 * @generated
	 */
	public Adapter createKlassenstufeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link zeugen.configuration.Adresse <em>Adresse</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we
	 * can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see zeugen.configuration.Adresse
	 * @generated
	 */
	public Adapter createAdresseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link zeugen.configuration.Person <em>Person</em>}'. <!-- begin-user-doc
	 * --> This default implementation returns null so that we can easily ignore
	 * cases; it's useful to ignore a case when inheritance will catch all the
	 * cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see zeugen.configuration.Person
	 * @generated
	 */
	public Adapter createPersonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link zeugen.configuration.Schulleiter <em>Schulleiter</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we
	 * can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see zeugen.configuration.Schulleiter
	 * @generated
	 */
	public Adapter createSchulleiterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link zeugen.configuration.Schueler <em>Schueler</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we
	 * can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see zeugen.configuration.Schueler
	 * @generated
	 */
	public Adapter createSchuelerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case. <!-- begin-user-doc --> This
	 * default implementation returns null. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} // ConfigurationAdapterFactory
