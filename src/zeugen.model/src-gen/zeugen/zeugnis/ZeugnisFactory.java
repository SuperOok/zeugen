/**
 */
package zeugen.zeugnis;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc --> The <b>Factory</b> for the model. It provides a
 * create method for each non-abstract class of the model. <!-- end-user-doc -->
 * 
 * @see zeugen.zeugnis.ZeugnisPackage
 * @generated
 */
public interface ZeugnisFactory extends EFactory {
	/**
	 * The singleton instance of the factory. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	ZeugnisFactory eINSTANCE = zeugen.zeugnis.impl.ZeugnisFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Klasse</em>'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Klasse</em>'.
	 * @generated
	 */
	Klasse createKlasse();

	/**
	 * Returns a new object of class '<em>Jahrgang</em>'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Jahrgang</em>'.
	 * @generated
	 */
	Jahrgang createJahrgang();

	/**
	 * Returns a new object of class '<em>Abschluss</em>'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Abschluss</em>'.
	 * @generated
	 */
	Abschluss createAbschluss();

	/**
	 * Returns a new object of class '<em>Zeugnis</em>'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Zeugnis</em>'.
	 * @generated
	 */
	Zeugnis createZeugnis();

	/**
	 * Returns a new object of class '<em>Beurteilung</em>'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Beurteilung</em>'.
	 * @generated
	 */
	Beurteilung createBeurteilung();

	/**
	 * Returns a new object of class '<em>Note</em>'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Note</em>'.
	 * @generated
	 */
	Note createNote();

	/**
	 * Returns a new object of class '<em>Formulierung</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Formulierung</em>'.
	 * @generated
	 */
	Formulierung createFormulierung();

	/**
	 * Returns the package supported by this factory. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the package supported by this factory.
	 * @generated
	 */
	ZeugnisPackage getZeugnisPackage();

} // ZeugnisFactory
