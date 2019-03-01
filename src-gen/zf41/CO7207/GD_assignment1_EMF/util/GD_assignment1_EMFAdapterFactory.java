/**
 */
package zf41.CO7207.GD_assignment1_EMF.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import zf41.CO7207.GD_assignment1_EMF.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see zf41.CO7207.GD_assignment1_EMF.GD_assignment1_EMFPackage
 * @generated
 */
public class GD_assignment1_EMFAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GD_assignment1_EMFPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GD_assignment1_EMFAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = GD_assignment1_EMFPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
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
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GD_assignment1_EMFSwitch<Adapter> modelSwitch = new GD_assignment1_EMFSwitch<Adapter>() {
		@Override
		public Adapter caseUser(User object) {
			return createUserAdapter();
		}

		@Override
		public Adapter caseBike(Bike object) {
			return createBikeAdapter();
		}

		@Override
		public Adapter caseSharedBicycleServiceProvider(SharedBicycleServiceProvider object) {
			return createSharedBicycleServiceProviderAdapter();
		}

		@Override
		public Adapter caseTransaction(Transaction object) {
			return createTransactionAdapter();
		}

		@Override
		public Adapter caseActiveTransaction(ActiveTransaction object) {
			return createActiveTransactionAdapter();
		}

		@Override
		public Adapter casePassedTransaction(PassedTransaction object) {
			return createPassedTransactionAdapter();
		}

		@Override
		public Adapter caseTransactionRecords(TransactionRecords object) {
			return createTransactionRecordsAdapter();
		}

		@Override
		public Adapter caseManager(Manager object) {
			return createManagerAdapter();
		}

		@Override
		public Adapter caseFinanceManager(FinanceManager object) {
			return createFinanceManagerAdapter();
		}

		@Override
		public Adapter caseTransactionManager(TransactionManager object) {
			return createTransactionManagerAdapter();
		}

		@Override
		public Adapter caseUserManager(UserManager object) {
			return createUserManagerAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link zf41.CO7207.GD_assignment1_EMF.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see zf41.CO7207.GD_assignment1_EMF.User
	 * @generated
	 */
	public Adapter createUserAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link zf41.CO7207.GD_assignment1_EMF.Bike <em>Bike</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see zf41.CO7207.GD_assignment1_EMF.Bike
	 * @generated
	 */
	public Adapter createBikeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link zf41.CO7207.GD_assignment1_EMF.SharedBicycleServiceProvider <em>Shared Bicycle Service Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see zf41.CO7207.GD_assignment1_EMF.SharedBicycleServiceProvider
	 * @generated
	 */
	public Adapter createSharedBicycleServiceProviderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link zf41.CO7207.GD_assignment1_EMF.Transaction <em>Transaction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see zf41.CO7207.GD_assignment1_EMF.Transaction
	 * @generated
	 */
	public Adapter createTransactionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link zf41.CO7207.GD_assignment1_EMF.ActiveTransaction <em>Active Transaction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see zf41.CO7207.GD_assignment1_EMF.ActiveTransaction
	 * @generated
	 */
	public Adapter createActiveTransactionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link zf41.CO7207.GD_assignment1_EMF.PassedTransaction <em>Passed Transaction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see zf41.CO7207.GD_assignment1_EMF.PassedTransaction
	 * @generated
	 */
	public Adapter createPassedTransactionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link zf41.CO7207.GD_assignment1_EMF.TransactionRecords <em>Transaction Records</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see zf41.CO7207.GD_assignment1_EMF.TransactionRecords
	 * @generated
	 */
	public Adapter createTransactionRecordsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link zf41.CO7207.GD_assignment1_EMF.Manager <em>Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see zf41.CO7207.GD_assignment1_EMF.Manager
	 * @generated
	 */
	public Adapter createManagerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link zf41.CO7207.GD_assignment1_EMF.FinanceManager <em>Finance Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see zf41.CO7207.GD_assignment1_EMF.FinanceManager
	 * @generated
	 */
	public Adapter createFinanceManagerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link zf41.CO7207.GD_assignment1_EMF.TransactionManager <em>Transaction Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see zf41.CO7207.GD_assignment1_EMF.TransactionManager
	 * @generated
	 */
	public Adapter createTransactionManagerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link zf41.CO7207.GD_assignment1_EMF.UserManager <em>User Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see zf41.CO7207.GD_assignment1_EMF.UserManager
	 * @generated
	 */
	public Adapter createUserManagerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //GD_assignment1_EMFAdapterFactory
