/**
 */
package zeugen.zeugnis.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import zeugen.zeugnis.*;

/**
 * <!-- begin-user-doc --> The <b>Adapter Factory</b> for the model. It provides
 * an adapter <code>createXXX</code> method for each class of the model. <!--
 * end-user-doc -->
 * 
 * @see zeugen.zeugnis.ZeugnisPackage
 * @generated
 */
public class ZeugnisAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected static ZeugnisPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public ZeugnisAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ZeugnisPackage.eINSTANCE;
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
	protected ZeugnisSwitch<Adapter> modelSwitch = new ZeugnisSwitch<Adapter>() {
		@Override
		public Adapter caseKlasse(Klasse object) {
			return createKlasseAdapter();
		}

		@Override
		public Adapter caseJahrgang(Jahrgang object) {
			return createJahrgangAdapter();
		}

		@Override
		public Adapter caseAbschluss(Abschluss object) {
			return createAbschlussAdapter();
		}

		@Override
		public Adapter caseZeugnis(Zeugnis object) {
			return createZeugnisAdapter();
		}

		@Override
		public Adapter caseBeurteilung(Beurteilung object) {
			return createBeurteilungAdapter();
		}

		@Override
		public Adapter caseNote(Note object) {
			return createNoteAdapter();
		}

		@Override
		public Adapter caseFormulierung(Formulierung object) {
			return createFormulierungAdapter();
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
	 * {@link zeugen.zeugnis.Klasse <em>Klasse</em>}'. <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore
	 * cases; it's useful to ignore a case when inheritance will catch all the
	 * cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see zeugen.zeugnis.Klasse
	 * @generated
	 */
	public Adapter createKlasseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link zeugen.zeugnis.Jahrgang <em>Jahrgang</em>}'. <!-- begin-user-doc
	 * --> This default implementation returns null so that we can easily ignore
	 * cases; it's useful to ignore a case when inheritance will catch all the
	 * cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see zeugen.zeugnis.Jahrgang
	 * @generated
	 */
	public Adapter createJahrgangAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link zeugen.zeugnis.Abschluss <em>Abschluss</em>}'. <!-- begin-user-doc
	 * --> This default implementation returns null so that we can easily ignore
	 * cases; it's useful to ignore a case when inheritance will catch all the
	 * cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see zeugen.zeugnis.Abschluss
	 * @generated
	 */
	public Adapter createAbschlussAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link zeugen.zeugnis.Zeugnis <em>Zeugnis</em>}'. <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore
	 * cases; it's useful to ignore a case when inheritance will catch all the
	 * cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see zeugen.zeugnis.Zeugnis
	 * @generated
	 */
	public Adapter createZeugnisAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link zeugen.zeugnis.Beurteilung <em>Beurteilung</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we
	 * can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see zeugen.zeugnis.Beurteilung
	 * @generated
	 */
	public Adapter createBeurteilungAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link zeugen.zeugnis.Note
	 * <em>Note</em>}'. <!-- begin-user-doc --> This default implementation
	 * returns null so that we can easily ignore cases; it's useful to ignore a
	 * case when inheritance will catch all the cases anyway. <!-- end-user-doc
	 * -->
	 * 
	 * @return the new adapter.
	 * @see zeugen.zeugnis.Note
	 * @generated
	 */
	public Adapter createNoteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link zeugen.zeugnis.Formulierung <em>Formulierung</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we
	 * can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see zeugen.zeugnis.Formulierung
	 * @generated
	 */
	public Adapter createFormulierungAdapter() {
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

} // ZeugnisAdapterFactory
