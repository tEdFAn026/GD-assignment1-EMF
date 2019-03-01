/**
 */
package zf41.CO7207.GD_assignment1_EMF.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import zf41.CO7207.GD_assignment1_EMF.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GD_assignment1_EMFFactoryImpl extends EFactoryImpl implements GD_assignment1_EMFFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GD_assignment1_EMFFactory init() {
		try {
			GD_assignment1_EMFFactory theGD_assignment1_EMFFactory = (GD_assignment1_EMFFactory) EPackage.Registry.INSTANCE
					.getEFactory(GD_assignment1_EMFPackage.eNS_URI);
			if (theGD_assignment1_EMFFactory != null) {
				return theGD_assignment1_EMFFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GD_assignment1_EMFFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GD_assignment1_EMFFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case GD_assignment1_EMFPackage.USER:
			return createUser();
		case GD_assignment1_EMFPackage.BIKE:
			return createBike();
		case GD_assignment1_EMFPackage.SHARED_BICYCLE_SERVICE_PROVIDER:
			return createSharedBicycleServiceProvider();
		case GD_assignment1_EMFPackage.ACTIVE_TRANSACTION:
			return createActiveTransaction();
		case GD_assignment1_EMFPackage.PASSED_TRANSACTION:
			return createPassedTransaction();
		case GD_assignment1_EMFPackage.TRANSACTION_RECORDS:
			return createTransactionRecords();
		case GD_assignment1_EMFPackage.FINANCE_MANAGER:
			return createFinanceManager();
		case GD_assignment1_EMFPackage.TRANSACTION_MANAGER:
			return createTransactionManager();
		case GD_assignment1_EMFPackage.USER_MANAGER:
			return createUserManager();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case GD_assignment1_EMFPackage.STATUS_OF_TRANSACTION:
			return createStatusOfTransactionFromString(eDataType, initialValue);
		case GD_assignment1_EMFPackage.STATUS_OF_BIKE:
			return createStatusOfBikeFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case GD_assignment1_EMFPackage.STATUS_OF_TRANSACTION:
			return convertStatusOfTransactionToString(eDataType, instanceValue);
		case GD_assignment1_EMFPackage.STATUS_OF_BIKE:
			return convertStatusOfBikeToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User createUser() {
		UserImpl user = new UserImpl();
		return user;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bike createBike() {
		BikeImpl bike = new BikeImpl();
		return bike;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SharedBicycleServiceProvider createSharedBicycleServiceProvider() {
		SharedBicycleServiceProviderImpl sharedBicycleServiceProvider = new SharedBicycleServiceProviderImpl();
		return sharedBicycleServiceProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActiveTransaction createActiveTransaction() {
		ActiveTransactionImpl activeTransaction = new ActiveTransactionImpl();
		return activeTransaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PassedTransaction createPassedTransaction() {
		PassedTransactionImpl passedTransaction = new PassedTransactionImpl();
		return passedTransaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransactionRecords createTransactionRecords() {
		TransactionRecordsImpl transactionRecords = new TransactionRecordsImpl();
		return transactionRecords;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FinanceManager createFinanceManager() {
		FinanceManagerImpl financeManager = new FinanceManagerImpl();
		return financeManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransactionManager createTransactionManager() {
		TransactionManagerImpl transactionManager = new TransactionManagerImpl();
		return transactionManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserManager createUserManager() {
		UserManagerImpl userManager = new UserManagerImpl();
		return userManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatusOfTransaction createStatusOfTransactionFromString(EDataType eDataType, String initialValue) {
		StatusOfTransaction result = StatusOfTransaction.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStatusOfTransactionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatusOfBike createStatusOfBikeFromString(EDataType eDataType, String initialValue) {
		StatusOfBike result = StatusOfBike.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStatusOfBikeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GD_assignment1_EMFPackage getGD_assignment1_EMFPackage() {
		return (GD_assignment1_EMFPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GD_assignment1_EMFPackage getPackage() {
		return GD_assignment1_EMFPackage.eINSTANCE;
	}

} //GD_assignment1_EMFFactoryImpl
