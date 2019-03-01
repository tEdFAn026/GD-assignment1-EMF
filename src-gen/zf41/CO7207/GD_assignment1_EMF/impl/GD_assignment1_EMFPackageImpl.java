/**
 */
package zf41.CO7207.GD_assignment1_EMF.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import zf41.CO7207.GD_assignment1_EMF.ActiveTransaction;
import zf41.CO7207.GD_assignment1_EMF.Bike;
import zf41.CO7207.GD_assignment1_EMF.FinanceManager;
import zf41.CO7207.GD_assignment1_EMF.GD_assignment1_EMFFactory;
import zf41.CO7207.GD_assignment1_EMF.GD_assignment1_EMFPackage;
import zf41.CO7207.GD_assignment1_EMF.Manager;
import zf41.CO7207.GD_assignment1_EMF.PassedTransaction;
import zf41.CO7207.GD_assignment1_EMF.SharedBicycleServiceProvider;
import zf41.CO7207.GD_assignment1_EMF.StatusOfBike;
import zf41.CO7207.GD_assignment1_EMF.StatusOfTransaction;
import zf41.CO7207.GD_assignment1_EMF.Transaction;
import zf41.CO7207.GD_assignment1_EMF.TransactionManager;
import zf41.CO7207.GD_assignment1_EMF.TransactionRecords;
import zf41.CO7207.GD_assignment1_EMF.User;
import zf41.CO7207.GD_assignment1_EMF.UserManager;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GD_assignment1_EMFPackageImpl extends EPackageImpl implements GD_assignment1_EMFPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bikeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sharedBicycleServiceProviderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transactionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activeTransactionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass passedTransactionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transactionRecordsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass managerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass financeManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transactionManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum statusOfTransactionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum statusOfBikeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see zf41.CO7207.GD_assignment1_EMF.GD_assignment1_EMFPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GD_assignment1_EMFPackageImpl() {
		super(eNS_URI, GD_assignment1_EMFFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link GD_assignment1_EMFPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GD_assignment1_EMFPackage init() {
		if (isInited)
			return (GD_assignment1_EMFPackage) EPackage.Registry.INSTANCE
					.getEPackage(GD_assignment1_EMFPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredGD_assignment1_EMFPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		GD_assignment1_EMFPackageImpl theGD_assignment1_EMFPackage = registeredGD_assignment1_EMFPackage instanceof GD_assignment1_EMFPackageImpl
				? (GD_assignment1_EMFPackageImpl) registeredGD_assignment1_EMFPackage
				: new GD_assignment1_EMFPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theGD_assignment1_EMFPackage.createPackageContents();

		// Initialize created meta-data
		theGD_assignment1_EMFPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theGD_assignment1_EMFPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GD_assignment1_EMFPackage.eNS_URI, theGD_assignment1_EMFPackage);
		return theGD_assignment1_EMFPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUser() {
		return userEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_UserID() {
		return (EAttribute) userEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_UserName() {
		return (EAttribute) userEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_Balance() {
		return (EAttribute) userEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUser_SharedBicycleServiceProvider() {
		return (EReference) userEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUser_ActiveTransaction() {
		return (EReference) userEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUser_TransactionRecords() {
		return (EReference) userEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBike() {
		return bikeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBike_BikeID() {
		return (EAttribute) bikeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBike_ActiveTransaction() {
		return (EReference) bikeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBike_Status() {
		return (EAttribute) bikeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBike_Sharedbicycleserviceprovider() {
		return (EReference) bikeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSharedBicycleServiceProvider() {
		return sharedBicycleServiceProviderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSharedBicycleServiceProvider_User() {
		return (EReference) sharedBicycleServiceProviderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSharedBicycleServiceProvider_ProviderName() {
		return (EAttribute) sharedBicycleServiceProviderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSharedBicycleServiceProvider_Manager() {
		return (EReference) sharedBicycleServiceProviderEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSharedBicycleServiceProvider_Bike() {
		return (EReference) sharedBicycleServiceProviderEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransaction() {
		return transactionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransaction_Price() {
		return (EAttribute) transactionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransaction_Date() {
		return (EAttribute) transactionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransaction_User() {
		return (EReference) transactionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransaction_Bike() {
		return (EReference) transactionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransaction_Status() {
		return (EAttribute) transactionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActiveTransaction() {
		return activeTransactionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActiveTransaction_FinanceManager() {
		return (EReference) activeTransactionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActiveTransaction_TransactionManager() {
		return (EReference) activeTransactionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActiveTransaction_IsBalanceLow() {
		return (EAttribute) activeTransactionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActiveTransaction_IsUsingAnOtherBike() {
		return (EAttribute) activeTransactionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPassedTransaction() {
		return passedTransactionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassedTransaction_TransactionRecords() {
		return (EReference) passedTransactionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransactionRecords() {
		return transactionRecordsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransactionRecords_User() {
		return (EReference) transactionRecordsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransactionRecords_PassedTransaction() {
		return (EReference) transactionRecordsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getManager() {
		return managerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getManager_Id() {
		return (EAttribute) managerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getManager_SharedBicycleServiceProvider() {
		return (EReference) managerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFinanceManager() {
		return financeManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFinanceManager_ActiveTransaction() {
		return (EReference) financeManagerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransactionManager() {
		return transactionManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransactionManager_ActiveTransaction() {
		return (EReference) transactionManagerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUserManager() {
		return userManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getStatusOfTransaction() {
		return statusOfTransactionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getStatusOfBike() {
		return statusOfBikeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GD_assignment1_EMFFactory getGD_assignment1_EMFFactory() {
		return (GD_assignment1_EMFFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		userEClass = createEClass(USER);
		createEAttribute(userEClass, USER__USER_ID);
		createEAttribute(userEClass, USER__USER_NAME);
		createEAttribute(userEClass, USER__BALANCE);
		createEReference(userEClass, USER__SHARED_BICYCLE_SERVICE_PROVIDER);
		createEReference(userEClass, USER__ACTIVE_TRANSACTION);
		createEReference(userEClass, USER__TRANSACTION_RECORDS);

		bikeEClass = createEClass(BIKE);
		createEAttribute(bikeEClass, BIKE__BIKE_ID);
		createEReference(bikeEClass, BIKE__ACTIVE_TRANSACTION);
		createEAttribute(bikeEClass, BIKE__STATUS);
		createEReference(bikeEClass, BIKE__SHAREDBICYCLESERVICEPROVIDER);

		sharedBicycleServiceProviderEClass = createEClass(SHARED_BICYCLE_SERVICE_PROVIDER);
		createEReference(sharedBicycleServiceProviderEClass, SHARED_BICYCLE_SERVICE_PROVIDER__USER);
		createEAttribute(sharedBicycleServiceProviderEClass, SHARED_BICYCLE_SERVICE_PROVIDER__PROVIDER_NAME);
		createEReference(sharedBicycleServiceProviderEClass, SHARED_BICYCLE_SERVICE_PROVIDER__MANAGER);
		createEReference(sharedBicycleServiceProviderEClass, SHARED_BICYCLE_SERVICE_PROVIDER__BIKE);

		transactionEClass = createEClass(TRANSACTION);
		createEAttribute(transactionEClass, TRANSACTION__PRICE);
		createEAttribute(transactionEClass, TRANSACTION__DATE);
		createEReference(transactionEClass, TRANSACTION__USER);
		createEReference(transactionEClass, TRANSACTION__BIKE);
		createEAttribute(transactionEClass, TRANSACTION__STATUS);

		activeTransactionEClass = createEClass(ACTIVE_TRANSACTION);
		createEReference(activeTransactionEClass, ACTIVE_TRANSACTION__FINANCE_MANAGER);
		createEReference(activeTransactionEClass, ACTIVE_TRANSACTION__TRANSACTION_MANAGER);
		createEAttribute(activeTransactionEClass, ACTIVE_TRANSACTION__IS_BALANCE_LOW);
		createEAttribute(activeTransactionEClass, ACTIVE_TRANSACTION__IS_USING_AN_OTHER_BIKE);

		passedTransactionEClass = createEClass(PASSED_TRANSACTION);
		createEReference(passedTransactionEClass, PASSED_TRANSACTION__TRANSACTION_RECORDS);

		transactionRecordsEClass = createEClass(TRANSACTION_RECORDS);
		createEReference(transactionRecordsEClass, TRANSACTION_RECORDS__USER);
		createEReference(transactionRecordsEClass, TRANSACTION_RECORDS__PASSED_TRANSACTION);

		managerEClass = createEClass(MANAGER);
		createEAttribute(managerEClass, MANAGER__ID);
		createEReference(managerEClass, MANAGER__SHARED_BICYCLE_SERVICE_PROVIDER);

		financeManagerEClass = createEClass(FINANCE_MANAGER);
		createEReference(financeManagerEClass, FINANCE_MANAGER__ACTIVE_TRANSACTION);

		transactionManagerEClass = createEClass(TRANSACTION_MANAGER);
		createEReference(transactionManagerEClass, TRANSACTION_MANAGER__ACTIVE_TRANSACTION);

		userManagerEClass = createEClass(USER_MANAGER);

		// Create enums
		statusOfTransactionEEnum = createEEnum(STATUS_OF_TRANSACTION);
		statusOfBikeEEnum = createEEnum(STATUS_OF_BIKE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		activeTransactionEClass.getESuperTypes().add(this.getTransaction());
		passedTransactionEClass.getESuperTypes().add(this.getTransaction());
		financeManagerEClass.getESuperTypes().add(this.getManager());
		transactionManagerEClass.getESuperTypes().add(this.getManager());
		userManagerEClass.getESuperTypes().add(this.getManager());

		// Initialize classes, features, and operations; add parameters
		initEClass(userEClass, User.class, "User", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUser_UserID(), ecorePackage.getEString(), "userID", null, 0, 1, User.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_UserName(), ecorePackage.getEString(), "userName", null, 0, 1, User.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_Balance(), ecorePackage.getEFloat(), "balance", null, 0, 1, User.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUser_SharedBicycleServiceProvider(), this.getSharedBicycleServiceProvider(),
				this.getSharedBicycleServiceProvider_User(), "sharedBicycleServiceProvider", null, 1, 1, User.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUser_ActiveTransaction(), this.getActiveTransaction(), null, "activeTransaction", null, 0, 1,
				User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUser_TransactionRecords(), this.getTransactionRecords(), this.getTransactionRecords_User(),
				"transactionRecords", null, 1, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bikeEClass, Bike.class, "Bike", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBike_BikeID(), ecorePackage.getEString(), "bikeID", null, 0, 1, Bike.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBike_ActiveTransaction(), this.getActiveTransaction(), null, "activeTransaction", null, 0, 1,
				Bike.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBike_Status(), this.getStatusOfBike(), "status", null, 0, 1, Bike.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBike_Sharedbicycleserviceprovider(), this.getSharedBicycleServiceProvider(),
				this.getSharedBicycleServiceProvider_Bike(), "sharedbicycleserviceprovider", null, 1, 1, Bike.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sharedBicycleServiceProviderEClass, SharedBicycleServiceProvider.class,
				"SharedBicycleServiceProvider", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSharedBicycleServiceProvider_User(), this.getUser(),
				this.getUser_SharedBicycleServiceProvider(), "user", null, 0, -1, SharedBicycleServiceProvider.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSharedBicycleServiceProvider_ProviderName(), ecorePackage.getEString(), "providerName", null,
				0, 1, SharedBicycleServiceProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSharedBicycleServiceProvider_Manager(), this.getManager(),
				this.getManager_SharedBicycleServiceProvider(), "manager", null, 3, -1,
				SharedBicycleServiceProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSharedBicycleServiceProvider_Bike(), this.getBike(),
				this.getBike_Sharedbicycleserviceprovider(), "bike", null, 1, -1, SharedBicycleServiceProvider.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transactionEClass, Transaction.class, "Transaction", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTransaction_Price(), ecorePackage.getEFloat(), "price", null, 0, 1, Transaction.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransaction_Date(), ecorePackage.getEDate(), "date", null, 0, 1, Transaction.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransaction_User(), this.getUser(), null, "user", null, 1, 1, Transaction.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransaction_Bike(), this.getBike(), null, "bike", null, 1, 1, Transaction.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransaction_Status(), this.getStatusOfTransaction(), "status", null, 0, 1, Transaction.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(activeTransactionEClass, ActiveTransaction.class, "ActiveTransaction", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActiveTransaction_FinanceManager(), this.getFinanceManager(),
				this.getFinanceManager_ActiveTransaction(), "financeManager", null, 1, 1, ActiveTransaction.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActiveTransaction_TransactionManager(), this.getTransactionManager(),
				this.getTransactionManager_ActiveTransaction(), "transactionManager", null, 1, 1,
				ActiveTransaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActiveTransaction_IsBalanceLow(), ecorePackage.getEBoolean(), "isBalanceLow", null, 0, 1,
				ActiveTransaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getActiveTransaction_IsUsingAnOtherBike(), ecorePackage.getEBoolean(), "isUsingAnOtherBike",
				null, 0, 1, ActiveTransaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(passedTransactionEClass, PassedTransaction.class, "PassedTransaction", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPassedTransaction_TransactionRecords(), this.getTransactionRecords(),
				this.getTransactionRecords_PassedTransaction(), "transactionRecords", null, 1, 1,
				PassedTransaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transactionRecordsEClass, TransactionRecords.class, "TransactionRecords", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransactionRecords_User(), this.getUser(), this.getUser_TransactionRecords(), "user", null, 1,
				1, TransactionRecords.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransactionRecords_PassedTransaction(), this.getPassedTransaction(),
				this.getPassedTransaction_TransactionRecords(), "passedTransaction", null, 0, -1,
				TransactionRecords.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(managerEClass, Manager.class, "Manager", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getManager_Id(), ecorePackage.getEString(), "id", null, 0, 1, Manager.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getManager_SharedBicycleServiceProvider(), this.getSharedBicycleServiceProvider(),
				this.getSharedBicycleServiceProvider_Manager(), "sharedBicycleServiceProvider", null, 1, 1,
				Manager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(financeManagerEClass, FinanceManager.class, "FinanceManager", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFinanceManager_ActiveTransaction(), this.getActiveTransaction(),
				this.getActiveTransaction_FinanceManager(), "activeTransaction", null, 0, -1, FinanceManager.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transactionManagerEClass, TransactionManager.class, "TransactionManager", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransactionManager_ActiveTransaction(), this.getActiveTransaction(),
				this.getActiveTransaction_TransactionManager(), "activeTransaction", null, 0, -1,
				TransactionManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(userManagerEClass, UserManager.class, "UserManager", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(statusOfTransactionEEnum, StatusOfTransaction.class, "StatusOfTransaction");
		addEEnumLiteral(statusOfTransactionEEnum, StatusOfTransaction.WAITING_FOR_CHECK);
		addEEnumLiteral(statusOfTransactionEEnum, StatusOfTransaction.SUCCESS);
		addEEnumLiteral(statusOfTransactionEEnum, StatusOfTransaction.CANCELED);
		addEEnumLiteral(statusOfTransactionEEnum, StatusOfTransaction.IN_PROGRESS);

		initEEnum(statusOfBikeEEnum, StatusOfBike.class, "StatusOfBike");
		addEEnumLiteral(statusOfBikeEEnum, StatusOfBike.FUNCTIONALLY_INTACT);
		addEEnumLiteral(statusOfBikeEEnum, StatusOfBike.NEED_REPAIR);

		// Create resource
		createResource(eNS_URI);
	}

} //GD_assignment1_EMFPackageImpl
