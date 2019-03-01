/**
 */
package zf41.CO7207.GD_assignment1_EMF;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see zf41.CO7207.GD_assignment1_EMF.GD_assignment1_EMFFactory
 * @model kind="package"
 * @generated
 */
public interface GD_assignment1_EMFPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "GD_assignment1_EMF";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/GD_assignment1_EMF";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "GD_assignment1_EMF";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GD_assignment1_EMFPackage eINSTANCE = zf41.CO7207.GD_assignment1_EMF.impl.GD_assignment1_EMFPackageImpl.init();

	/**
	 * The meta object id for the '{@link zf41.CO7207.GD_assignment1_EMF.impl.UserImpl <em>User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see zf41.CO7207.GD_assignment1_EMF.impl.UserImpl
	 * @see zf41.CO7207.GD_assignment1_EMF.impl.GD_assignment1_EMFPackageImpl#getUser()
	 * @generated
	 */
	int USER = 0;

	/**
	 * The feature id for the '<em><b>User ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__USER_ID = 0;

	/**
	 * The feature id for the '<em><b>User Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__USER_NAME = 1;

	/**
	 * The feature id for the '<em><b>Balance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__BALANCE = 2;

	/**
	 * The feature id for the '<em><b>Shared Bicycle Service Provider</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__SHARED_BICYCLE_SERVICE_PROVIDER = 3;

	/**
	 * The feature id for the '<em><b>Active Transaction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__ACTIVE_TRANSACTION = 4;

	/**
	 * The feature id for the '<em><b>Transaction Records</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__TRANSACTION_RECORDS = 5;

	/**
	 * The number of structural features of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link zf41.CO7207.GD_assignment1_EMF.impl.BikeImpl <em>Bike</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see zf41.CO7207.GD_assignment1_EMF.impl.BikeImpl
	 * @see zf41.CO7207.GD_assignment1_EMF.impl.GD_assignment1_EMFPackageImpl#getBike()
	 * @generated
	 */
	int BIKE = 1;

	/**
	 * The feature id for the '<em><b>Bike ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIKE__BIKE_ID = 0;

	/**
	 * The feature id for the '<em><b>Active Transaction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIKE__ACTIVE_TRANSACTION = 1;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIKE__STATUS = 2;

	/**
	 * The feature id for the '<em><b>Sharedbicycleserviceprovider</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIKE__SHAREDBICYCLESERVICEPROVIDER = 3;

	/**
	 * The number of structural features of the '<em>Bike</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIKE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Bike</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIKE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link zf41.CO7207.GD_assignment1_EMF.impl.SharedBicycleServiceProviderImpl <em>Shared Bicycle Service Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see zf41.CO7207.GD_assignment1_EMF.impl.SharedBicycleServiceProviderImpl
	 * @see zf41.CO7207.GD_assignment1_EMF.impl.GD_assignment1_EMFPackageImpl#getSharedBicycleServiceProvider()
	 * @generated
	 */
	int SHARED_BICYCLE_SERVICE_PROVIDER = 2;

	/**
	 * The feature id for the '<em><b>User</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_BICYCLE_SERVICE_PROVIDER__USER = 0;

	/**
	 * The feature id for the '<em><b>Provider Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_BICYCLE_SERVICE_PROVIDER__PROVIDER_NAME = 1;

	/**
	 * The feature id for the '<em><b>Manager</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_BICYCLE_SERVICE_PROVIDER__MANAGER = 2;

	/**
	 * The feature id for the '<em><b>Bike</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_BICYCLE_SERVICE_PROVIDER__BIKE = 3;

	/**
	 * The number of structural features of the '<em>Shared Bicycle Service Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_BICYCLE_SERVICE_PROVIDER_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Shared Bicycle Service Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_BICYCLE_SERVICE_PROVIDER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link zf41.CO7207.GD_assignment1_EMF.impl.TransactionImpl <em>Transaction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see zf41.CO7207.GD_assignment1_EMF.impl.TransactionImpl
	 * @see zf41.CO7207.GD_assignment1_EMF.impl.GD_assignment1_EMFPackageImpl#getTransaction()
	 * @generated
	 */
	int TRANSACTION = 3;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION__PRICE = 0;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION__DATE = 1;

	/**
	 * The feature id for the '<em><b>User</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION__USER = 2;

	/**
	 * The feature id for the '<em><b>Bike</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION__BIKE = 3;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION__STATUS = 4;

	/**
	 * The number of structural features of the '<em>Transaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Transaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link zf41.CO7207.GD_assignment1_EMF.impl.ActiveTransactionImpl <em>Active Transaction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see zf41.CO7207.GD_assignment1_EMF.impl.ActiveTransactionImpl
	 * @see zf41.CO7207.GD_assignment1_EMF.impl.GD_assignment1_EMFPackageImpl#getActiveTransaction()
	 * @generated
	 */
	int ACTIVE_TRANSACTION = 4;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_TRANSACTION__PRICE = TRANSACTION__PRICE;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_TRANSACTION__DATE = TRANSACTION__DATE;

	/**
	 * The feature id for the '<em><b>User</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_TRANSACTION__USER = TRANSACTION__USER;

	/**
	 * The feature id for the '<em><b>Bike</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_TRANSACTION__BIKE = TRANSACTION__BIKE;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_TRANSACTION__STATUS = TRANSACTION__STATUS;

	/**
	 * The feature id for the '<em><b>Finance Manager</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_TRANSACTION__FINANCE_MANAGER = TRANSACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Transaction Manager</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_TRANSACTION__TRANSACTION_MANAGER = TRANSACTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Balance Low</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_TRANSACTION__IS_BALANCE_LOW = TRANSACTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is Using An Other Bike</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_TRANSACTION__IS_USING_AN_OTHER_BIKE = TRANSACTION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Active Transaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_TRANSACTION_FEATURE_COUNT = TRANSACTION_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Active Transaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_TRANSACTION_OPERATION_COUNT = TRANSACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link zf41.CO7207.GD_assignment1_EMF.impl.PassedTransactionImpl <em>Passed Transaction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see zf41.CO7207.GD_assignment1_EMF.impl.PassedTransactionImpl
	 * @see zf41.CO7207.GD_assignment1_EMF.impl.GD_assignment1_EMFPackageImpl#getPassedTransaction()
	 * @generated
	 */
	int PASSED_TRANSACTION = 5;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSED_TRANSACTION__PRICE = TRANSACTION__PRICE;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSED_TRANSACTION__DATE = TRANSACTION__DATE;

	/**
	 * The feature id for the '<em><b>User</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSED_TRANSACTION__USER = TRANSACTION__USER;

	/**
	 * The feature id for the '<em><b>Bike</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSED_TRANSACTION__BIKE = TRANSACTION__BIKE;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSED_TRANSACTION__STATUS = TRANSACTION__STATUS;

	/**
	 * The feature id for the '<em><b>Transaction Records</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSED_TRANSACTION__TRANSACTION_RECORDS = TRANSACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Passed Transaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSED_TRANSACTION_FEATURE_COUNT = TRANSACTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Passed Transaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSED_TRANSACTION_OPERATION_COUNT = TRANSACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link zf41.CO7207.GD_assignment1_EMF.impl.TransactionRecordsImpl <em>Transaction Records</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see zf41.CO7207.GD_assignment1_EMF.impl.TransactionRecordsImpl
	 * @see zf41.CO7207.GD_assignment1_EMF.impl.GD_assignment1_EMFPackageImpl#getTransactionRecords()
	 * @generated
	 */
	int TRANSACTION_RECORDS = 6;

	/**
	 * The feature id for the '<em><b>User</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_RECORDS__USER = 0;

	/**
	 * The feature id for the '<em><b>Passed Transaction</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_RECORDS__PASSED_TRANSACTION = 1;

	/**
	 * The number of structural features of the '<em>Transaction Records</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_RECORDS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Transaction Records</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_RECORDS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link zf41.CO7207.GD_assignment1_EMF.impl.ManagerImpl <em>Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see zf41.CO7207.GD_assignment1_EMF.impl.ManagerImpl
	 * @see zf41.CO7207.GD_assignment1_EMF.impl.GD_assignment1_EMFPackageImpl#getManager()
	 * @generated
	 */
	int MANAGER = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER__ID = 0;

	/**
	 * The feature id for the '<em><b>Shared Bicycle Service Provider</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER__SHARED_BICYCLE_SERVICE_PROVIDER = 1;

	/**
	 * The number of structural features of the '<em>Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link zf41.CO7207.GD_assignment1_EMF.impl.FinanceManagerImpl <em>Finance Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see zf41.CO7207.GD_assignment1_EMF.impl.FinanceManagerImpl
	 * @see zf41.CO7207.GD_assignment1_EMF.impl.GD_assignment1_EMFPackageImpl#getFinanceManager()
	 * @generated
	 */
	int FINANCE_MANAGER = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINANCE_MANAGER__ID = MANAGER__ID;

	/**
	 * The feature id for the '<em><b>Shared Bicycle Service Provider</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINANCE_MANAGER__SHARED_BICYCLE_SERVICE_PROVIDER = MANAGER__SHARED_BICYCLE_SERVICE_PROVIDER;

	/**
	 * The feature id for the '<em><b>Active Transaction</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINANCE_MANAGER__ACTIVE_TRANSACTION = MANAGER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Finance Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINANCE_MANAGER_FEATURE_COUNT = MANAGER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Finance Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINANCE_MANAGER_OPERATION_COUNT = MANAGER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link zf41.CO7207.GD_assignment1_EMF.impl.TransactionManagerImpl <em>Transaction Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see zf41.CO7207.GD_assignment1_EMF.impl.TransactionManagerImpl
	 * @see zf41.CO7207.GD_assignment1_EMF.impl.GD_assignment1_EMFPackageImpl#getTransactionManager()
	 * @generated
	 */
	int TRANSACTION_MANAGER = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_MANAGER__ID = MANAGER__ID;

	/**
	 * The feature id for the '<em><b>Shared Bicycle Service Provider</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_MANAGER__SHARED_BICYCLE_SERVICE_PROVIDER = MANAGER__SHARED_BICYCLE_SERVICE_PROVIDER;

	/**
	 * The feature id for the '<em><b>Active Transaction</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_MANAGER__ACTIVE_TRANSACTION = MANAGER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Transaction Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_MANAGER_FEATURE_COUNT = MANAGER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Transaction Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_MANAGER_OPERATION_COUNT = MANAGER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link zf41.CO7207.GD_assignment1_EMF.impl.UserManagerImpl <em>User Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see zf41.CO7207.GD_assignment1_EMF.impl.UserManagerImpl
	 * @see zf41.CO7207.GD_assignment1_EMF.impl.GD_assignment1_EMFPackageImpl#getUserManager()
	 * @generated
	 */
	int USER_MANAGER = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_MANAGER__ID = MANAGER__ID;

	/**
	 * The feature id for the '<em><b>Shared Bicycle Service Provider</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_MANAGER__SHARED_BICYCLE_SERVICE_PROVIDER = MANAGER__SHARED_BICYCLE_SERVICE_PROVIDER;

	/**
	 * The number of structural features of the '<em>User Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_MANAGER_FEATURE_COUNT = MANAGER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>User Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_MANAGER_OPERATION_COUNT = MANAGER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link zf41.CO7207.GD_assignment1_EMF.StatusOfTransaction <em>Status Of Transaction</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see zf41.CO7207.GD_assignment1_EMF.StatusOfTransaction
	 * @see zf41.CO7207.GD_assignment1_EMF.impl.GD_assignment1_EMFPackageImpl#getStatusOfTransaction()
	 * @generated
	 */
	int STATUS_OF_TRANSACTION = 11;

	/**
	 * The meta object id for the '{@link zf41.CO7207.GD_assignment1_EMF.StatusOfBike <em>Status Of Bike</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see zf41.CO7207.GD_assignment1_EMF.StatusOfBike
	 * @see zf41.CO7207.GD_assignment1_EMF.impl.GD_assignment1_EMFPackageImpl#getStatusOfBike()
	 * @generated
	 */
	int STATUS_OF_BIKE = 12;

	/**
	 * Returns the meta object for class '{@link zf41.CO7207.GD_assignment1_EMF.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User</em>'.
	 * @see zf41.CO7207.GD_assignment1_EMF.User
	 * @generated
	 */
	EClass getUser();

	/**
	 * Returns the meta object for the attribute '{@link zf41.CO7207.GD_assignment1_EMF.User#getUserID <em>User ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User ID</em>'.
	 * @see zf41.CO7207.GD_assignment1_EMF.User#getUserID()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_UserID();

	/**
	 * Returns the meta object for the attribute '{@link zf41.CO7207.GD_assignment1_EMF.User#getUserName <em>User Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Name</em>'.
	 * @see zf41.CO7207.GD_assignment1_EMF.User#getUserName()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_UserName();

	/**
	 * Returns the meta object for the attribute '{@link zf41.CO7207.GD_assignment1_EMF.User#getBalance <em>Balance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Balance</em>'.
	 * @see zf41.CO7207.GD_assignment1_EMF.User#getBalance()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Balance();

	/**
	 * Returns the meta object for the reference '{@link zf41.CO7207.GD_assignment1_EMF.User#getSharedBicycleServiceProvider <em>Shared Bicycle Service Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Shared Bicycle Service Provider</em>'.
	 * @see zf41.CO7207.GD_assignment1_EMF.User#getSharedBicycleServiceProvider()
	 * @see #getUser()
	 * @generated
	 */
	EReference getUser_SharedBicycleServiceProvider();

	/**
	 * Returns the meta object for the containment reference '{@link zf41.CO7207.GD_assignment1_EMF.User#getActiveTransaction <em>Active Transaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Active Transaction</em>'.
	 * @see zf41.CO7207.GD_assignment1_EMF.User#getActiveTransaction()
	 * @see #getUser()
	 * @generated
	 */
	EReference getUser_ActiveTransaction();

	/**
	 * Returns the meta object for the reference '{@link zf41.CO7207.GD_assignment1_EMF.User#getTransactionRecords <em>Transaction Records</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transaction Records</em>'.
	 * @see zf41.CO7207.GD_assignment1_EMF.User#getTransactionRecords()
	 * @see #getUser()
	 * @generated
	 */
	EReference getUser_TransactionRecords();

	/**
	 * Returns the meta object for class '{@link zf41.CO7207.GD_assignment1_EMF.Bike <em>Bike</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bike</em>'.
	 * @see zf41.CO7207.GD_assignment1_EMF.Bike
	 * @generated
	 */
	EClass getBike();

	/**
	 * Returns the meta object for the attribute '{@link zf41.CO7207.GD_assignment1_EMF.Bike#getBikeID <em>Bike ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bike ID</em>'.
	 * @see zf41.CO7207.GD_assignment1_EMF.Bike#getBikeID()
	 * @see #getBike()
	 * @generated
	 */
	EAttribute getBike_BikeID();

	/**
	 * Returns the meta object for the containment reference '{@link zf41.CO7207.GD_assignment1_EMF.Bike#getActiveTransaction <em>Active Transaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Active Transaction</em>'.
	 * @see zf41.CO7207.GD_assignment1_EMF.Bike#getActiveTransaction()
	 * @see #getBike()
	 * @generated
	 */
	EReference getBike_ActiveTransaction();

	/**
	 * Returns the meta object for the attribute '{@link zf41.CO7207.GD_assignment1_EMF.Bike#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see zf41.CO7207.GD_assignment1_EMF.Bike#getStatus()
	 * @see #getBike()
	 * @generated
	 */
	EAttribute getBike_Status();

	/**
	 * Returns the meta object for the reference '{@link zf41.CO7207.GD_assignment1_EMF.Bike#getSharedbicycleserviceprovider <em>Sharedbicycleserviceprovider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sharedbicycleserviceprovider</em>'.
	 * @see zf41.CO7207.GD_assignment1_EMF.Bike#getSharedbicycleserviceprovider()
	 * @see #getBike()
	 * @generated
	 */
	EReference getBike_Sharedbicycleserviceprovider();

	/**
	 * Returns the meta object for class '{@link zf41.CO7207.GD_assignment1_EMF.SharedBicycleServiceProvider <em>Shared Bicycle Service Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shared Bicycle Service Provider</em>'.
	 * @see zf41.CO7207.GD_assignment1_EMF.SharedBicycleServiceProvider
	 * @generated
	 */
	EClass getSharedBicycleServiceProvider();

	/**
	 * Returns the meta object for the reference list '{@link zf41.CO7207.GD_assignment1_EMF.SharedBicycleServiceProvider#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>User</em>'.
	 * @see zf41.CO7207.GD_assignment1_EMF.SharedBicycleServiceProvider#getUser()
	 * @see #getSharedBicycleServiceProvider()
	 * @generated
	 */
	EReference getSharedBicycleServiceProvider_User();

	/**
	 * Returns the meta object for the attribute '{@link zf41.CO7207.GD_assignment1_EMF.SharedBicycleServiceProvider#getProviderName <em>Provider Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Provider Name</em>'.
	 * @see zf41.CO7207.GD_assignment1_EMF.SharedBicycleServiceProvider#getProviderName()
	 * @see #getSharedBicycleServiceProvider()
	 * @generated
	 */
	EAttribute getSharedBicycleServiceProvider_ProviderName();

	/**
	 * Returns the meta object for the reference list '{@link zf41.CO7207.GD_assignment1_EMF.SharedBicycleServiceProvider#getManager <em>Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Manager</em>'.
	 * @see zf41.CO7207.GD_assignment1_EMF.SharedBicycleServiceProvider#getManager()
	 * @see #getSharedBicycleServiceProvider()
	 * @generated
	 */
	EReference getSharedBicycleServiceProvider_Manager();

	/**
	 * Returns the meta object for the reference list '{@link zf41.CO7207.GD_assignment1_EMF.SharedBicycleServiceProvider#getBike <em>Bike</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Bike</em>'.
	 * @see zf41.CO7207.GD_assignment1_EMF.SharedBicycleServiceProvider#getBike()
	 * @see #getSharedBicycleServiceProvider()
	 * @generated
	 */
	EReference getSharedBicycleServiceProvider_Bike();

	/**
	 * Returns the meta object for class '{@link zf41.CO7207.GD_assignment1_EMF.Transaction <em>Transaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transaction</em>'.
	 * @see zf41.CO7207.GD_assignment1_EMF.Transaction
	 * @generated
	 */
	EClass getTransaction();

	/**
	 * Returns the meta object for the attribute '{@link zf41.CO7207.GD_assignment1_EMF.Transaction#getPrice <em>Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Price</em>'.
	 * @see zf41.CO7207.GD_assignment1_EMF.Transaction#getPrice()
	 * @see #getTransaction()
	 * @generated
	 */
	EAttribute getTransaction_Price();

	/**
	 * Returns the meta object for the attribute '{@link zf41.CO7207.GD_assignment1_EMF.Transaction#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see zf41.CO7207.GD_assignment1_EMF.Transaction#getDate()
	 * @see #getTransaction()
	 * @generated
	 */
	EAttribute getTransaction_Date();

	/**
	 * Returns the meta object for the containment reference '{@link zf41.CO7207.GD_assignment1_EMF.Transaction#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>User</em>'.
	 * @see zf41.CO7207.GD_assignment1_EMF.Transaction#getUser()
	 * @see #getTransaction()
	 * @generated
	 */
	EReference getTransaction_User();

	/**
	 * Returns the meta object for the containment reference '{@link zf41.CO7207.GD_assignment1_EMF.Transaction#getBike <em>Bike</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bike</em>'.
	 * @see zf41.CO7207.GD_assignment1_EMF.Transaction#getBike()
	 * @see #getTransaction()
	 * @generated
	 */
	EReference getTransaction_Bike();

	/**
	 * Returns the meta object for the attribute '{@link zf41.CO7207.GD_assignment1_EMF.Transaction#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see zf41.CO7207.GD_assignment1_EMF.Transaction#getStatus()
	 * @see #getTransaction()
	 * @generated
	 */
	EAttribute getTransaction_Status();

	/**
	 * Returns the meta object for class '{@link zf41.CO7207.GD_assignment1_EMF.ActiveTransaction <em>Active Transaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Active Transaction</em>'.
	 * @see zf41.CO7207.GD_assignment1_EMF.ActiveTransaction
	 * @generated
	 */
	EClass getActiveTransaction();

	/**
	 * Returns the meta object for the reference '{@link zf41.CO7207.GD_assignment1_EMF.ActiveTransaction#getFinanceManager <em>Finance Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Finance Manager</em>'.
	 * @see zf41.CO7207.GD_assignment1_EMF.ActiveTransaction#getFinanceManager()
	 * @see #getActiveTransaction()
	 * @generated
	 */
	EReference getActiveTransaction_FinanceManager();

	/**
	 * Returns the meta object for the reference '{@link zf41.CO7207.GD_assignment1_EMF.ActiveTransaction#getTransactionManager <em>Transaction Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transaction Manager</em>'.
	 * @see zf41.CO7207.GD_assignment1_EMF.ActiveTransaction#getTransactionManager()
	 * @see #getActiveTransaction()
	 * @generated
	 */
	EReference getActiveTransaction_TransactionManager();

	/**
	 * Returns the meta object for the attribute '{@link zf41.CO7207.GD_assignment1_EMF.ActiveTransaction#isIsBalanceLow <em>Is Balance Low</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Balance Low</em>'.
	 * @see zf41.CO7207.GD_assignment1_EMF.ActiveTransaction#isIsBalanceLow()
	 * @see #getActiveTransaction()
	 * @generated
	 */
	EAttribute getActiveTransaction_IsBalanceLow();

	/**
	 * Returns the meta object for the attribute '{@link zf41.CO7207.GD_assignment1_EMF.ActiveTransaction#isIsUsingAnOtherBike <em>Is Using An Other Bike</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Using An Other Bike</em>'.
	 * @see zf41.CO7207.GD_assignment1_EMF.ActiveTransaction#isIsUsingAnOtherBike()
	 * @see #getActiveTransaction()
	 * @generated
	 */
	EAttribute getActiveTransaction_IsUsingAnOtherBike();

	/**
	 * Returns the meta object for class '{@link zf41.CO7207.GD_assignment1_EMF.PassedTransaction <em>Passed Transaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Passed Transaction</em>'.
	 * @see zf41.CO7207.GD_assignment1_EMF.PassedTransaction
	 * @generated
	 */
	EClass getPassedTransaction();

	/**
	 * Returns the meta object for the reference '{@link zf41.CO7207.GD_assignment1_EMF.PassedTransaction#getTransactionRecords <em>Transaction Records</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transaction Records</em>'.
	 * @see zf41.CO7207.GD_assignment1_EMF.PassedTransaction#getTransactionRecords()
	 * @see #getPassedTransaction()
	 * @generated
	 */
	EReference getPassedTransaction_TransactionRecords();

	/**
	 * Returns the meta object for class '{@link zf41.CO7207.GD_assignment1_EMF.TransactionRecords <em>Transaction Records</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transaction Records</em>'.
	 * @see zf41.CO7207.GD_assignment1_EMF.TransactionRecords
	 * @generated
	 */
	EClass getTransactionRecords();

	/**
	 * Returns the meta object for the reference '{@link zf41.CO7207.GD_assignment1_EMF.TransactionRecords#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>User</em>'.
	 * @see zf41.CO7207.GD_assignment1_EMF.TransactionRecords#getUser()
	 * @see #getTransactionRecords()
	 * @generated
	 */
	EReference getTransactionRecords_User();

	/**
	 * Returns the meta object for the reference list '{@link zf41.CO7207.GD_assignment1_EMF.TransactionRecords#getPassedTransaction <em>Passed Transaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Passed Transaction</em>'.
	 * @see zf41.CO7207.GD_assignment1_EMF.TransactionRecords#getPassedTransaction()
	 * @see #getTransactionRecords()
	 * @generated
	 */
	EReference getTransactionRecords_PassedTransaction();

	/**
	 * Returns the meta object for class '{@link zf41.CO7207.GD_assignment1_EMF.Manager <em>Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Manager</em>'.
	 * @see zf41.CO7207.GD_assignment1_EMF.Manager
	 * @generated
	 */
	EClass getManager();

	/**
	 * Returns the meta object for the attribute '{@link zf41.CO7207.GD_assignment1_EMF.Manager#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see zf41.CO7207.GD_assignment1_EMF.Manager#getId()
	 * @see #getManager()
	 * @generated
	 */
	EAttribute getManager_Id();

	/**
	 * Returns the meta object for the reference '{@link zf41.CO7207.GD_assignment1_EMF.Manager#getSharedBicycleServiceProvider <em>Shared Bicycle Service Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Shared Bicycle Service Provider</em>'.
	 * @see zf41.CO7207.GD_assignment1_EMF.Manager#getSharedBicycleServiceProvider()
	 * @see #getManager()
	 * @generated
	 */
	EReference getManager_SharedBicycleServiceProvider();

	/**
	 * Returns the meta object for class '{@link zf41.CO7207.GD_assignment1_EMF.FinanceManager <em>Finance Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Finance Manager</em>'.
	 * @see zf41.CO7207.GD_assignment1_EMF.FinanceManager
	 * @generated
	 */
	EClass getFinanceManager();

	/**
	 * Returns the meta object for the reference list '{@link zf41.CO7207.GD_assignment1_EMF.FinanceManager#getActiveTransaction <em>Active Transaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Active Transaction</em>'.
	 * @see zf41.CO7207.GD_assignment1_EMF.FinanceManager#getActiveTransaction()
	 * @see #getFinanceManager()
	 * @generated
	 */
	EReference getFinanceManager_ActiveTransaction();

	/**
	 * Returns the meta object for class '{@link zf41.CO7207.GD_assignment1_EMF.TransactionManager <em>Transaction Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transaction Manager</em>'.
	 * @see zf41.CO7207.GD_assignment1_EMF.TransactionManager
	 * @generated
	 */
	EClass getTransactionManager();

	/**
	 * Returns the meta object for the reference list '{@link zf41.CO7207.GD_assignment1_EMF.TransactionManager#getActiveTransaction <em>Active Transaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Active Transaction</em>'.
	 * @see zf41.CO7207.GD_assignment1_EMF.TransactionManager#getActiveTransaction()
	 * @see #getTransactionManager()
	 * @generated
	 */
	EReference getTransactionManager_ActiveTransaction();

	/**
	 * Returns the meta object for class '{@link zf41.CO7207.GD_assignment1_EMF.UserManager <em>User Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Manager</em>'.
	 * @see zf41.CO7207.GD_assignment1_EMF.UserManager
	 * @generated
	 */
	EClass getUserManager();

	/**
	 * Returns the meta object for enum '{@link zf41.CO7207.GD_assignment1_EMF.StatusOfTransaction <em>Status Of Transaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Status Of Transaction</em>'.
	 * @see zf41.CO7207.GD_assignment1_EMF.StatusOfTransaction
	 * @generated
	 */
	EEnum getStatusOfTransaction();

	/**
	 * Returns the meta object for enum '{@link zf41.CO7207.GD_assignment1_EMF.StatusOfBike <em>Status Of Bike</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Status Of Bike</em>'.
	 * @see zf41.CO7207.GD_assignment1_EMF.StatusOfBike
	 * @generated
	 */
	EEnum getStatusOfBike();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GD_assignment1_EMFFactory getGD_assignment1_EMFFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link zf41.CO7207.GD_assignment1_EMF.impl.UserImpl <em>User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see zf41.CO7207.GD_assignment1_EMF.impl.UserImpl
		 * @see zf41.CO7207.GD_assignment1_EMF.impl.GD_assignment1_EMFPackageImpl#getUser()
		 * @generated
		 */
		EClass USER = eINSTANCE.getUser();

		/**
		 * The meta object literal for the '<em><b>User ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__USER_ID = eINSTANCE.getUser_UserID();

		/**
		 * The meta object literal for the '<em><b>User Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__USER_NAME = eINSTANCE.getUser_UserName();

		/**
		 * The meta object literal for the '<em><b>Balance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__BALANCE = eINSTANCE.getUser_Balance();

		/**
		 * The meta object literal for the '<em><b>Shared Bicycle Service Provider</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER__SHARED_BICYCLE_SERVICE_PROVIDER = eINSTANCE.getUser_SharedBicycleServiceProvider();

		/**
		 * The meta object literal for the '<em><b>Active Transaction</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER__ACTIVE_TRANSACTION = eINSTANCE.getUser_ActiveTransaction();

		/**
		 * The meta object literal for the '<em><b>Transaction Records</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER__TRANSACTION_RECORDS = eINSTANCE.getUser_TransactionRecords();

		/**
		 * The meta object literal for the '{@link zf41.CO7207.GD_assignment1_EMF.impl.BikeImpl <em>Bike</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see zf41.CO7207.GD_assignment1_EMF.impl.BikeImpl
		 * @see zf41.CO7207.GD_assignment1_EMF.impl.GD_assignment1_EMFPackageImpl#getBike()
		 * @generated
		 */
		EClass BIKE = eINSTANCE.getBike();

		/**
		 * The meta object literal for the '<em><b>Bike ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BIKE__BIKE_ID = eINSTANCE.getBike_BikeID();

		/**
		 * The meta object literal for the '<em><b>Active Transaction</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BIKE__ACTIVE_TRANSACTION = eINSTANCE.getBike_ActiveTransaction();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BIKE__STATUS = eINSTANCE.getBike_Status();

		/**
		 * The meta object literal for the '<em><b>Sharedbicycleserviceprovider</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BIKE__SHAREDBICYCLESERVICEPROVIDER = eINSTANCE.getBike_Sharedbicycleserviceprovider();

		/**
		 * The meta object literal for the '{@link zf41.CO7207.GD_assignment1_EMF.impl.SharedBicycleServiceProviderImpl <em>Shared Bicycle Service Provider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see zf41.CO7207.GD_assignment1_EMF.impl.SharedBicycleServiceProviderImpl
		 * @see zf41.CO7207.GD_assignment1_EMF.impl.GD_assignment1_EMFPackageImpl#getSharedBicycleServiceProvider()
		 * @generated
		 */
		EClass SHARED_BICYCLE_SERVICE_PROVIDER = eINSTANCE.getSharedBicycleServiceProvider();

		/**
		 * The meta object literal for the '<em><b>User</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHARED_BICYCLE_SERVICE_PROVIDER__USER = eINSTANCE.getSharedBicycleServiceProvider_User();

		/**
		 * The meta object literal for the '<em><b>Provider Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHARED_BICYCLE_SERVICE_PROVIDER__PROVIDER_NAME = eINSTANCE
				.getSharedBicycleServiceProvider_ProviderName();

		/**
		 * The meta object literal for the '<em><b>Manager</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHARED_BICYCLE_SERVICE_PROVIDER__MANAGER = eINSTANCE.getSharedBicycleServiceProvider_Manager();

		/**
		 * The meta object literal for the '<em><b>Bike</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHARED_BICYCLE_SERVICE_PROVIDER__BIKE = eINSTANCE.getSharedBicycleServiceProvider_Bike();

		/**
		 * The meta object literal for the '{@link zf41.CO7207.GD_assignment1_EMF.impl.TransactionImpl <em>Transaction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see zf41.CO7207.GD_assignment1_EMF.impl.TransactionImpl
		 * @see zf41.CO7207.GD_assignment1_EMF.impl.GD_assignment1_EMFPackageImpl#getTransaction()
		 * @generated
		 */
		EClass TRANSACTION = eINSTANCE.getTransaction();

		/**
		 * The meta object literal for the '<em><b>Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSACTION__PRICE = eINSTANCE.getTransaction_Price();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSACTION__DATE = eINSTANCE.getTransaction_Date();

		/**
		 * The meta object literal for the '<em><b>User</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSACTION__USER = eINSTANCE.getTransaction_User();

		/**
		 * The meta object literal for the '<em><b>Bike</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSACTION__BIKE = eINSTANCE.getTransaction_Bike();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSACTION__STATUS = eINSTANCE.getTransaction_Status();

		/**
		 * The meta object literal for the '{@link zf41.CO7207.GD_assignment1_EMF.impl.ActiveTransactionImpl <em>Active Transaction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see zf41.CO7207.GD_assignment1_EMF.impl.ActiveTransactionImpl
		 * @see zf41.CO7207.GD_assignment1_EMF.impl.GD_assignment1_EMFPackageImpl#getActiveTransaction()
		 * @generated
		 */
		EClass ACTIVE_TRANSACTION = eINSTANCE.getActiveTransaction();

		/**
		 * The meta object literal for the '<em><b>Finance Manager</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVE_TRANSACTION__FINANCE_MANAGER = eINSTANCE.getActiveTransaction_FinanceManager();

		/**
		 * The meta object literal for the '<em><b>Transaction Manager</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVE_TRANSACTION__TRANSACTION_MANAGER = eINSTANCE.getActiveTransaction_TransactionManager();

		/**
		 * The meta object literal for the '<em><b>Is Balance Low</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVE_TRANSACTION__IS_BALANCE_LOW = eINSTANCE.getActiveTransaction_IsBalanceLow();

		/**
		 * The meta object literal for the '<em><b>Is Using An Other Bike</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVE_TRANSACTION__IS_USING_AN_OTHER_BIKE = eINSTANCE.getActiveTransaction_IsUsingAnOtherBike();

		/**
		 * The meta object literal for the '{@link zf41.CO7207.GD_assignment1_EMF.impl.PassedTransactionImpl <em>Passed Transaction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see zf41.CO7207.GD_assignment1_EMF.impl.PassedTransactionImpl
		 * @see zf41.CO7207.GD_assignment1_EMF.impl.GD_assignment1_EMFPackageImpl#getPassedTransaction()
		 * @generated
		 */
		EClass PASSED_TRANSACTION = eINSTANCE.getPassedTransaction();

		/**
		 * The meta object literal for the '<em><b>Transaction Records</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PASSED_TRANSACTION__TRANSACTION_RECORDS = eINSTANCE.getPassedTransaction_TransactionRecords();

		/**
		 * The meta object literal for the '{@link zf41.CO7207.GD_assignment1_EMF.impl.TransactionRecordsImpl <em>Transaction Records</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see zf41.CO7207.GD_assignment1_EMF.impl.TransactionRecordsImpl
		 * @see zf41.CO7207.GD_assignment1_EMF.impl.GD_assignment1_EMFPackageImpl#getTransactionRecords()
		 * @generated
		 */
		EClass TRANSACTION_RECORDS = eINSTANCE.getTransactionRecords();

		/**
		 * The meta object literal for the '<em><b>User</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSACTION_RECORDS__USER = eINSTANCE.getTransactionRecords_User();

		/**
		 * The meta object literal for the '<em><b>Passed Transaction</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSACTION_RECORDS__PASSED_TRANSACTION = eINSTANCE.getTransactionRecords_PassedTransaction();

		/**
		 * The meta object literal for the '{@link zf41.CO7207.GD_assignment1_EMF.impl.ManagerImpl <em>Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see zf41.CO7207.GD_assignment1_EMF.impl.ManagerImpl
		 * @see zf41.CO7207.GD_assignment1_EMF.impl.GD_assignment1_EMFPackageImpl#getManager()
		 * @generated
		 */
		EClass MANAGER = eINSTANCE.getManager();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MANAGER__ID = eINSTANCE.getManager_Id();

		/**
		 * The meta object literal for the '<em><b>Shared Bicycle Service Provider</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MANAGER__SHARED_BICYCLE_SERVICE_PROVIDER = eINSTANCE.getManager_SharedBicycleServiceProvider();

		/**
		 * The meta object literal for the '{@link zf41.CO7207.GD_assignment1_EMF.impl.FinanceManagerImpl <em>Finance Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see zf41.CO7207.GD_assignment1_EMF.impl.FinanceManagerImpl
		 * @see zf41.CO7207.GD_assignment1_EMF.impl.GD_assignment1_EMFPackageImpl#getFinanceManager()
		 * @generated
		 */
		EClass FINANCE_MANAGER = eINSTANCE.getFinanceManager();

		/**
		 * The meta object literal for the '<em><b>Active Transaction</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FINANCE_MANAGER__ACTIVE_TRANSACTION = eINSTANCE.getFinanceManager_ActiveTransaction();

		/**
		 * The meta object literal for the '{@link zf41.CO7207.GD_assignment1_EMF.impl.TransactionManagerImpl <em>Transaction Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see zf41.CO7207.GD_assignment1_EMF.impl.TransactionManagerImpl
		 * @see zf41.CO7207.GD_assignment1_EMF.impl.GD_assignment1_EMFPackageImpl#getTransactionManager()
		 * @generated
		 */
		EClass TRANSACTION_MANAGER = eINSTANCE.getTransactionManager();

		/**
		 * The meta object literal for the '<em><b>Active Transaction</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSACTION_MANAGER__ACTIVE_TRANSACTION = eINSTANCE.getTransactionManager_ActiveTransaction();

		/**
		 * The meta object literal for the '{@link zf41.CO7207.GD_assignment1_EMF.impl.UserManagerImpl <em>User Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see zf41.CO7207.GD_assignment1_EMF.impl.UserManagerImpl
		 * @see zf41.CO7207.GD_assignment1_EMF.impl.GD_assignment1_EMFPackageImpl#getUserManager()
		 * @generated
		 */
		EClass USER_MANAGER = eINSTANCE.getUserManager();

		/**
		 * The meta object literal for the '{@link zf41.CO7207.GD_assignment1_EMF.StatusOfTransaction <em>Status Of Transaction</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see zf41.CO7207.GD_assignment1_EMF.StatusOfTransaction
		 * @see zf41.CO7207.GD_assignment1_EMF.impl.GD_assignment1_EMFPackageImpl#getStatusOfTransaction()
		 * @generated
		 */
		EEnum STATUS_OF_TRANSACTION = eINSTANCE.getStatusOfTransaction();

		/**
		 * The meta object literal for the '{@link zf41.CO7207.GD_assignment1_EMF.StatusOfBike <em>Status Of Bike</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see zf41.CO7207.GD_assignment1_EMF.StatusOfBike
		 * @see zf41.CO7207.GD_assignment1_EMF.impl.GD_assignment1_EMFPackageImpl#getStatusOfBike()
		 * @generated
		 */
		EEnum STATUS_OF_BIKE = eINSTANCE.getStatusOfBike();

	}

} //GD_assignment1_EMFPackage
