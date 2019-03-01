/**
 */
package zf41.CO7207.GD_assignment1_EMF;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see zf41.CO7207.GD_assignment1_EMF.GD_assignment1_EMFPackage
 * @generated
 */
public interface GD_assignment1_EMFFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GD_assignment1_EMFFactory eINSTANCE = zf41.CO7207.GD_assignment1_EMF.impl.GD_assignment1_EMFFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>User</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>User</em>'.
	 * @generated
	 */
	User createUser();

	/**
	 * Returns a new object of class '<em>Bike</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bike</em>'.
	 * @generated
	 */
	Bike createBike();

	/**
	 * Returns a new object of class '<em>Shared Bicycle Service Provider</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Shared Bicycle Service Provider</em>'.
	 * @generated
	 */
	SharedBicycleServiceProvider createSharedBicycleServiceProvider();

	/**
	 * Returns a new object of class '<em>Active Transaction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Active Transaction</em>'.
	 * @generated
	 */
	ActiveTransaction createActiveTransaction();

	/**
	 * Returns a new object of class '<em>Passed Transaction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Passed Transaction</em>'.
	 * @generated
	 */
	PassedTransaction createPassedTransaction();

	/**
	 * Returns a new object of class '<em>Transaction Records</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transaction Records</em>'.
	 * @generated
	 */
	TransactionRecords createTransactionRecords();

	/**
	 * Returns a new object of class '<em>Finance Manager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Finance Manager</em>'.
	 * @generated
	 */
	FinanceManager createFinanceManager();

	/**
	 * Returns a new object of class '<em>Transaction Manager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transaction Manager</em>'.
	 * @generated
	 */
	TransactionManager createTransactionManager();

	/**
	 * Returns a new object of class '<em>User Manager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>User Manager</em>'.
	 * @generated
	 */
	UserManager createUserManager();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	GD_assignment1_EMFPackage getGD_assignment1_EMFPackage();

} //GD_assignment1_EMFFactory
