/**
 */
package zeugen.configuration;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc --> The <b>Factory</b> for the model. It provides a
 * create method for each non-abstract class of the model. <!-- end-user-doc -->
 * 
 * @see zeugen.configuration.ConfigurationPackage
 * @generated
 */
public interface ConfigurationFactory extends EFactory {
	/**
	 * The singleton instance of the factory. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	ConfigurationFactory eINSTANCE = zeugen.configuration.impl.ConfigurationFactoryImpl
			.init();

	/**
	 * Returns a new object of class '<em>Schule</em>'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Schule</em>'.
	 * @generated
	 */
	Schule createSchule();

	/**
	 * Returns a new object of class '<em>Lehrkraft</em>'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Lehrkraft</em>'.
	 * @generated
	 */
	Lehrkraft createLehrkraft();

	/**
	 * Returns a new object of class '<em>Notentyp</em>'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Notentyp</em>'.
	 * @generated
	 */
	Notentyp createNotentyp();

	/**
	 * Returns a new object of class '<em>Klassenstufe</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Klassenstufe</em>'.
	 * @generated
	 */
	Klassenstufe createKlassenstufe();

	/**
	 * Returns a new object of class '<em>Adresse</em>'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Adresse</em>'.
	 * @generated
	 */
	Adresse createAdresse();

	/**
	 * Returns a new object of class '<em>Person</em>'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Person</em>'.
	 * @generated
	 */
	Person createPerson();

	/**
	 * Returns the package supported by this factory. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the package supported by this factory.
	 * @generated
	 */
	ConfigurationPackage getConfigurationPackage();

} // ConfigurationFactory
