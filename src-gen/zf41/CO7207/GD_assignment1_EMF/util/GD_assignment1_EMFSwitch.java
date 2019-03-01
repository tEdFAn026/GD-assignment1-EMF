/**
 */
package zf41.CO7207.GD_assignment1_EMF.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import zf41.CO7207.GD_assignment1_EMF.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see zf41.CO7207.GD_assignment1_EMF.GD_assignment1_EMFPackage
 * @generated
 */
public class GD_assignment1_EMFSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GD_assignment1_EMFPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GD_assignment1_EMFSwitch() {
		if (modelPackage == null) {
			modelPackage = GD_assignment1_EMFPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case GD_assignment1_EMFPackage.USER: {
			User user = (User) theEObject;
			T result = caseUser(user);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GD_assignment1_EMFPackage.BIKE: {
			Bike bike = (Bike) theEObject;
			T result = caseBike(bike);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GD_assignment1_EMFPackage.SHARED_BICYCLE_SERVICE_PROVIDER: {
			SharedBicycleServiceProvider sharedBicycleServiceProvider = (SharedBicycleServiceProvider) theEObject;
			T result = caseSharedBicycleServiceProvider(sharedBicycleServiceProvider);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GD_assignment1_EMFPackage.TRANSACTION: {
			Transaction transaction = (Transaction) theEObject;
			T result = caseTransaction(transaction);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GD_assignment1_EMFPackage.ACTIVE_TRANSACTION: {
			ActiveTransaction activeTransaction = (ActiveTransaction) theEObject;
			T result = caseActiveTransaction(activeTransaction);
			if (result == null)
				result = caseTransaction(activeTransaction);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GD_assignment1_EMFPackage.PASSED_TRANSACTION: {
			PassedTransaction passedTransaction = (PassedTransaction) theEObject;
			T result = casePassedTransaction(passedTransaction);
			if (result == null)
				result = caseTransaction(passedTransaction);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GD_assignment1_EMFPackage.TRANSACTION_RECORDS: {
			TransactionRecords transactionRecords = (TransactionRecords) theEObject;
			T result = caseTransactionRecords(transactionRecords);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GD_assignment1_EMFPackage.MANAGER: {
			Manager manager = (Manager) theEObject;
			T result = caseManager(manager);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GD_assignment1_EMFPackage.FINANCE_MANAGER: {
			FinanceManager financeManager = (FinanceManager) theEObject;
			T result = caseFinanceManager(financeManager);
			if (result == null)
				result = caseManager(financeManager);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GD_assignment1_EMFPackage.TRANSACTION_MANAGER: {
			TransactionManager transactionManager = (TransactionManager) theEObject;
			T result = caseTransactionManager(transactionManager);
			if (result == null)
				result = caseManager(transactionManager);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GD_assignment1_EMFPackage.USER_MANAGER: {
			UserManager userManager = (UserManager) theEObject;
			T result = caseUserManager(userManager);
			if (result == null)
				result = caseManager(userManager);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUser(User object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bike</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bike</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBike(Bike object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Shared Bicycle Service Provider</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Shared Bicycle Service Provider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSharedBicycleServiceProvider(SharedBicycleServiceProvider object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transaction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transaction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransaction(Transaction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Active Transaction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Active Transaction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActiveTransaction(ActiveTransaction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Passed Transaction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Passed Transaction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePassedTransaction(PassedTransaction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transaction Records</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transaction Records</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransactionRecords(TransactionRecords object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Manager</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Manager</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseManager(Manager object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Finance Manager</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Finance Manager</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFinanceManager(FinanceManager object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transaction Manager</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transaction Manager</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransactionManager(TransactionManager object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User Manager</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User Manager</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUserManager(UserManager object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //GD_assignment1_EMFSwitch
