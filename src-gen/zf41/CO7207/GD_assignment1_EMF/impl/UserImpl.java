/**
 */
package zf41.CO7207.GD_assignment1_EMF.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import zf41.CO7207.GD_assignment1_EMF.ActiveTransaction;
import zf41.CO7207.GD_assignment1_EMF.GD_assignment1_EMFPackage;
import zf41.CO7207.GD_assignment1_EMF.SharedBicycleServiceProvider;
import zf41.CO7207.GD_assignment1_EMF.TransactionRecords;
import zf41.CO7207.GD_assignment1_EMF.User;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link zf41.CO7207.GD_assignment1_EMF.impl.UserImpl#getUserID <em>User ID</em>}</li>
 *   <li>{@link zf41.CO7207.GD_assignment1_EMF.impl.UserImpl#getUserName <em>User Name</em>}</li>
 *   <li>{@link zf41.CO7207.GD_assignment1_EMF.impl.UserImpl#getBalance <em>Balance</em>}</li>
 *   <li>{@link zf41.CO7207.GD_assignment1_EMF.impl.UserImpl#getSharedBicycleServiceProvider <em>Shared Bicycle Service Provider</em>}</li>
 *   <li>{@link zf41.CO7207.GD_assignment1_EMF.impl.UserImpl#getActiveTransaction <em>Active Transaction</em>}</li>
 *   <li>{@link zf41.CO7207.GD_assignment1_EMF.impl.UserImpl#getTransactionRecords <em>Transaction Records</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UserImpl extends MinimalEObjectImpl.Container implements User {
	/**
	 * The default value of the '{@link #getUserID() <em>User ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserID()
	 * @generated
	 * @ordered
	 */
	protected static final String USER_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUserID() <em>User ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserID()
	 * @generated
	 * @ordered
	 */
	protected String userID = USER_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getUserName() <em>User Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserName()
	 * @generated
	 * @ordered
	 */
	protected static final String USER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUserName() <em>User Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserName()
	 * @generated
	 * @ordered
	 */
	protected String userName = USER_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getBalance() <em>Balance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBalance()
	 * @generated
	 * @ordered
	 */
	protected static final float BALANCE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getBalance() <em>Balance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBalance()
	 * @generated
	 * @ordered
	 */
	protected float balance = BALANCE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSharedBicycleServiceProvider() <em>Shared Bicycle Service Provider</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSharedBicycleServiceProvider()
	 * @generated
	 * @ordered
	 */
	protected SharedBicycleServiceProvider sharedBicycleServiceProvider;

	/**
	 * The cached value of the '{@link #getActiveTransaction() <em>Active Transaction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActiveTransaction()
	 * @generated
	 * @ordered
	 */
	protected ActiveTransaction activeTransaction;

	/**
	 * The cached value of the '{@link #getTransactionRecords() <em>Transaction Records</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransactionRecords()
	 * @generated
	 * @ordered
	 */
	protected TransactionRecords transactionRecords;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GD_assignment1_EMFPackage.Literals.USER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUserID() {
		return userID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserID(String newUserID) {
		String oldUserID = userID;
		userID = newUserID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GD_assignment1_EMFPackage.USER__USER_ID, oldUserID,
					userID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserName(String newUserName) {
		String oldUserName = userName;
		userName = newUserName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GD_assignment1_EMFPackage.USER__USER_NAME,
					oldUserName, userName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getBalance() {
		return balance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBalance(float newBalance) {
		float oldBalance = balance;
		balance = newBalance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GD_assignment1_EMFPackage.USER__BALANCE, oldBalance,
					balance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SharedBicycleServiceProvider getSharedBicycleServiceProvider() {
		if (sharedBicycleServiceProvider != null && sharedBicycleServiceProvider.eIsProxy()) {
			InternalEObject oldSharedBicycleServiceProvider = (InternalEObject) sharedBicycleServiceProvider;
			sharedBicycleServiceProvider = (SharedBicycleServiceProvider) eResolveProxy(
					oldSharedBicycleServiceProvider);
			if (sharedBicycleServiceProvider != oldSharedBicycleServiceProvider) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							GD_assignment1_EMFPackage.USER__SHARED_BICYCLE_SERVICE_PROVIDER,
							oldSharedBicycleServiceProvider, sharedBicycleServiceProvider));
			}
		}
		return sharedBicycleServiceProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SharedBicycleServiceProvider basicGetSharedBicycleServiceProvider() {
		return sharedBicycleServiceProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSharedBicycleServiceProvider(
			SharedBicycleServiceProvider newSharedBicycleServiceProvider, NotificationChain msgs) {
		SharedBicycleServiceProvider oldSharedBicycleServiceProvider = sharedBicycleServiceProvider;
		sharedBicycleServiceProvider = newSharedBicycleServiceProvider;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GD_assignment1_EMFPackage.USER__SHARED_BICYCLE_SERVICE_PROVIDER, oldSharedBicycleServiceProvider,
					newSharedBicycleServiceProvider);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSharedBicycleServiceProvider(SharedBicycleServiceProvider newSharedBicycleServiceProvider) {
		if (newSharedBicycleServiceProvider != sharedBicycleServiceProvider) {
			NotificationChain msgs = null;
			if (sharedBicycleServiceProvider != null)
				msgs = ((InternalEObject) sharedBicycleServiceProvider).eInverseRemove(this,
						GD_assignment1_EMFPackage.SHARED_BICYCLE_SERVICE_PROVIDER__USER,
						SharedBicycleServiceProvider.class, msgs);
			if (newSharedBicycleServiceProvider != null)
				msgs = ((InternalEObject) newSharedBicycleServiceProvider).eInverseAdd(this,
						GD_assignment1_EMFPackage.SHARED_BICYCLE_SERVICE_PROVIDER__USER,
						SharedBicycleServiceProvider.class, msgs);
			msgs = basicSetSharedBicycleServiceProvider(newSharedBicycleServiceProvider, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					GD_assignment1_EMFPackage.USER__SHARED_BICYCLE_SERVICE_PROVIDER, newSharedBicycleServiceProvider,
					newSharedBicycleServiceProvider));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActiveTransaction getActiveTransaction() {
		return activeTransaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActiveTransaction(ActiveTransaction newActiveTransaction, NotificationChain msgs) {
		ActiveTransaction oldActiveTransaction = activeTransaction;
		activeTransaction = newActiveTransaction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GD_assignment1_EMFPackage.USER__ACTIVE_TRANSACTION, oldActiveTransaction, newActiveTransaction);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActiveTransaction(ActiveTransaction newActiveTransaction) {
		if (newActiveTransaction != activeTransaction) {
			NotificationChain msgs = null;
			if (activeTransaction != null)
				msgs = ((InternalEObject) activeTransaction).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - GD_assignment1_EMFPackage.USER__ACTIVE_TRANSACTION, null, msgs);
			if (newActiveTransaction != null)
				msgs = ((InternalEObject) newActiveTransaction).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - GD_assignment1_EMFPackage.USER__ACTIVE_TRANSACTION, null, msgs);
			msgs = basicSetActiveTransaction(newActiveTransaction, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GD_assignment1_EMFPackage.USER__ACTIVE_TRANSACTION,
					newActiveTransaction, newActiveTransaction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransactionRecords getTransactionRecords() {
		if (transactionRecords != null && transactionRecords.eIsProxy()) {
			InternalEObject oldTransactionRecords = (InternalEObject) transactionRecords;
			transactionRecords = (TransactionRecords) eResolveProxy(oldTransactionRecords);
			if (transactionRecords != oldTransactionRecords) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							GD_assignment1_EMFPackage.USER__TRANSACTION_RECORDS, oldTransactionRecords,
							transactionRecords));
			}
		}
		return transactionRecords;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransactionRecords basicGetTransactionRecords() {
		return transactionRecords;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransactionRecords(TransactionRecords newTransactionRecords,
			NotificationChain msgs) {
		TransactionRecords oldTransactionRecords = transactionRecords;
		transactionRecords = newTransactionRecords;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GD_assignment1_EMFPackage.USER__TRANSACTION_RECORDS, oldTransactionRecords, newTransactionRecords);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransactionRecords(TransactionRecords newTransactionRecords) {
		if (newTransactionRecords != transactionRecords) {
			NotificationChain msgs = null;
			if (transactionRecords != null)
				msgs = ((InternalEObject) transactionRecords).eInverseRemove(this,
						GD_assignment1_EMFPackage.TRANSACTION_RECORDS__USER, TransactionRecords.class, msgs);
			if (newTransactionRecords != null)
				msgs = ((InternalEObject) newTransactionRecords).eInverseAdd(this,
						GD_assignment1_EMFPackage.TRANSACTION_RECORDS__USER, TransactionRecords.class, msgs);
			msgs = basicSetTransactionRecords(newTransactionRecords, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GD_assignment1_EMFPackage.USER__TRANSACTION_RECORDS,
					newTransactionRecords, newTransactionRecords));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GD_assignment1_EMFPackage.USER__SHARED_BICYCLE_SERVICE_PROVIDER:
			if (sharedBicycleServiceProvider != null)
				msgs = ((InternalEObject) sharedBicycleServiceProvider).eInverseRemove(this,
						GD_assignment1_EMFPackage.SHARED_BICYCLE_SERVICE_PROVIDER__USER,
						SharedBicycleServiceProvider.class, msgs);
			return basicSetSharedBicycleServiceProvider((SharedBicycleServiceProvider) otherEnd, msgs);
		case GD_assignment1_EMFPackage.USER__TRANSACTION_RECORDS:
			if (transactionRecords != null)
				msgs = ((InternalEObject) transactionRecords).eInverseRemove(this,
						GD_assignment1_EMFPackage.TRANSACTION_RECORDS__USER, TransactionRecords.class, msgs);
			return basicSetTransactionRecords((TransactionRecords) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GD_assignment1_EMFPackage.USER__SHARED_BICYCLE_SERVICE_PROVIDER:
			return basicSetSharedBicycleServiceProvider(null, msgs);
		case GD_assignment1_EMFPackage.USER__ACTIVE_TRANSACTION:
			return basicSetActiveTransaction(null, msgs);
		case GD_assignment1_EMFPackage.USER__TRANSACTION_RECORDS:
			return basicSetTransactionRecords(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case GD_assignment1_EMFPackage.USER__USER_ID:
			return getUserID();
		case GD_assignment1_EMFPackage.USER__USER_NAME:
			return getUserName();
		case GD_assignment1_EMFPackage.USER__BALANCE:
			return getBalance();
		case GD_assignment1_EMFPackage.USER__SHARED_BICYCLE_SERVICE_PROVIDER:
			if (resolve)
				return getSharedBicycleServiceProvider();
			return basicGetSharedBicycleServiceProvider();
		case GD_assignment1_EMFPackage.USER__ACTIVE_TRANSACTION:
			return getActiveTransaction();
		case GD_assignment1_EMFPackage.USER__TRANSACTION_RECORDS:
			if (resolve)
				return getTransactionRecords();
			return basicGetTransactionRecords();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case GD_assignment1_EMFPackage.USER__USER_ID:
			setUserID((String) newValue);
			return;
		case GD_assignment1_EMFPackage.USER__USER_NAME:
			setUserName((String) newValue);
			return;
		case GD_assignment1_EMFPackage.USER__BALANCE:
			setBalance((Float) newValue);
			return;
		case GD_assignment1_EMFPackage.USER__SHARED_BICYCLE_SERVICE_PROVIDER:
			setSharedBicycleServiceProvider((SharedBicycleServiceProvider) newValue);
			return;
		case GD_assignment1_EMFPackage.USER__ACTIVE_TRANSACTION:
			setActiveTransaction((ActiveTransaction) newValue);
			return;
		case GD_assignment1_EMFPackage.USER__TRANSACTION_RECORDS:
			setTransactionRecords((TransactionRecords) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case GD_assignment1_EMFPackage.USER__USER_ID:
			setUserID(USER_ID_EDEFAULT);
			return;
		case GD_assignment1_EMFPackage.USER__USER_NAME:
			setUserName(USER_NAME_EDEFAULT);
			return;
		case GD_assignment1_EMFPackage.USER__BALANCE:
			setBalance(BALANCE_EDEFAULT);
			return;
		case GD_assignment1_EMFPackage.USER__SHARED_BICYCLE_SERVICE_PROVIDER:
			setSharedBicycleServiceProvider((SharedBicycleServiceProvider) null);
			return;
		case GD_assignment1_EMFPackage.USER__ACTIVE_TRANSACTION:
			setActiveTransaction((ActiveTransaction) null);
			return;
		case GD_assignment1_EMFPackage.USER__TRANSACTION_RECORDS:
			setTransactionRecords((TransactionRecords) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case GD_assignment1_EMFPackage.USER__USER_ID:
			return USER_ID_EDEFAULT == null ? userID != null : !USER_ID_EDEFAULT.equals(userID);
		case GD_assignment1_EMFPackage.USER__USER_NAME:
			return USER_NAME_EDEFAULT == null ? userName != null : !USER_NAME_EDEFAULT.equals(userName);
		case GD_assignment1_EMFPackage.USER__BALANCE:
			return balance != BALANCE_EDEFAULT;
		case GD_assignment1_EMFPackage.USER__SHARED_BICYCLE_SERVICE_PROVIDER:
			return sharedBicycleServiceProvider != null;
		case GD_assignment1_EMFPackage.USER__ACTIVE_TRANSACTION:
			return activeTransaction != null;
		case GD_assignment1_EMFPackage.USER__TRANSACTION_RECORDS:
			return transactionRecords != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (userID: ");
		result.append(userID);
		result.append(", userName: ");
		result.append(userName);
		result.append(", balance: ");
		result.append(balance);
		result.append(')');
		return result.toString();
	}

} //UserImpl
