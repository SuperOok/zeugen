/**
 */
package zeugen.configuration.impl;

import org.eclipse.emf.ecore.EClass;

import zeugen.configuration.ConfigurationPackage;
import zeugen.configuration.Schulleiter;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Schulleiter</b></em>'. <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class SchulleiterImpl extends LehrkraftImpl implements Schulleiter {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected SchulleiterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConfigurationPackage.Literals.SCHULLEITER;
	}

} // SchulleiterImpl
