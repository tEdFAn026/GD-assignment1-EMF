/**
 */
package zf41.CO7207.GD_assignment1_EMF.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import zf41.CO7207.GD_assignment1_EMF.ActiveTransaction;
import zf41.CO7207.GD_assignment1_EMF.FinanceManager;
import zf41.CO7207.GD_assignment1_EMF.GD_assignment1_EMFPackage;
import zf41.CO7207.GD_assignment1_EMF.TransactionManager;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Active Transaction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link zf41.CO7207.GD_assignment1_EMF.impl.ActiveTransactionImpl#getFinanceManager <em>Finance Manager</em>}</li>
 *   <li>{@link zf41.CO7207.GD_assignment1_EMF.impl.ActiveTransactionImpl#getTransactionManager <em>Transaction Manager</em>}</li>
 *   <li>{@link zf41.CO7207.GD_assignment1_EMF.impl.ActiveTransactionImpl#isIsBalanceLow <em>Is Balance Low</em>}</li>
 *   <li>{@link zf41.CO7207.GD_assignment1_EMF.impl.ActiveTransactionImpl#isIsUsingAnOtherBike <em>Is Using An Other Bike</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActiveTransactionImpl extends TransactionImpl implements ActiveTransaction {
	/**
	 * The cached value of the '{@link #getFinanceManager() <em>Finance Manager</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinanceManager()
	 * @generated
	 * @ordered
	 */
	protected FinanceManager financeManager;

	/**
	 * The cached value of the '{@link #getTransactionManager() <em>Transaction Manager</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransactionManager()
	 * @generated
	 * @ordered
	 */
	protected TransactionManager transactionManager;

	/**
	 * The default value of the '{@link #isIsBalanceLow() <em>Is Balance Low</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsBalanceLow()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_BALANCE_LOW_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsBalanceLow() <em>Is Balance Low</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsBalanceLow()
	 * @generated
	 * @ordered
	 */
	protected boolean isBalanceLow = IS_BALANCE_LOW_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsUsingAnOtherBike() <em>Is Using An Other Bike</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsUsingAnOtherBike()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_USING_AN_OTHER_BIKE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsUsingAnOtherBike() <em>Is Using An Other Bike</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsUsingAnOtherBike()
	 * @generated
	 * @ordered
	 */
	protected boolean isUsingAnOtherBike = IS_USING_AN_OTHER_BIKE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActiveTransactionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GD_assignment1_EMFPackage.Literals.ACTIVE_TRANSACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FinanceManager getFinanceManager() {
		if (financeManager != null && financeManager.eIsProxy()) {
			InternalEObject oldFinanceManager = (InternalEObject) financeManager;
			financeManager = (FinanceManager) eResolveProxy(oldFinanceManager);
			if (financeManager != oldFinanceManager) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							GD_assignment1_EMFPackage.ACTIVE_TRANSACTION__FINANCE_MANAGER, oldFinanceManager,
							financeManager));
			}
		}
		return financeManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FinanceManager basicGetFinanceManager() {
		return financeManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFinanceManager(FinanceManager newFinanceManager, NotificationChain msgs) {
		FinanceManager oldFinanceManager = financeManager;
		financeManager = newFinanceManager;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GD_assignment1_EMFPackage.ACTIVE_TRANSACTION__FINANCE_MANAGER, oldFinanceManager,
					newFinanceManager);
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
	public void setFinanceManager(FinanceManager newFinanceManager) {
		if (newFinanceManager != financeManager) {
			NotificationChain msgs = null;
			if (financeManager != null)
				msgs = ((InternalEObject) financeManager).eInverseRemove(this,
						GD_assignment1_EMFPackage.FINANCE_MANAGER__ACTIVE_TRANSACTION, FinanceManager.class, msgs);
			if (newFinanceManager != null)
				msgs = ((InternalEObject) newFinanceManager).eInverseAdd(this,
						GD_assignment1_EMFPackage.FINANCE_MANAGER__ACTIVE_TRANSACTION, FinanceManager.class, msgs);
			msgs = basicSetFinanceManager(newFinanceManager, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					GD_assignment1_EMFPackage.ACTIVE_TRANSACTION__FINANCE_MANAGER, newFinanceManager,
					newFinanceManager));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransactionManager getTransactionManager() {
		if (transactionManager != null && transactionManager.eIsProxy()) {
			InternalEObject oldTransactionManager = (InternalEObject) transactionManager;
			transactionManager = (TransactionManager) eResolveProxy(oldTransactionManager);
			if (transactionManager != oldTransactionManager) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							GD_assignment1_EMFPackage.ACTIVE_TRANSACTION__TRANSACTION_MANAGER, oldTransactionManager,
							transactionManager));
			}
		}
		return transactionManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransactionManager basicGetTransactionManager() {
		return transactionManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransactionManager(TransactionManager newTransactionManager,
			NotificationChain msgs) {
		TransactionManager oldTransactionManager = transactionManager;
		transactionManager = newTransactionManager;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GD_assignment1_EMFPackage.ACTIVE_TRANSACTION__TRANSACTION_MANAGER, oldTransactionManager,
					newTransactionManager);
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
	public void setTransactionManager(TransactionManager newTransactionManager) {
		if (newTransactionManager != transactionManager) {
			NotificationChain msgs = null;
			if (transactionManager != null)
				msgs = ((InternalEObject) transactionManager).eInverseRemove(this,
						GD_assignment1_EMFPackage.TRANSACTION_MANAGER__ACTIVE_TRANSACTION, TransactionManager.class,
						msgs);
			if (newTransactionManager != null)
				msgs = ((InternalEObject) newTransactionManager).eInverseAdd(this,
						GD_assignment1_EMFPackage.TRANSACTION_MANAGER__ACTIVE_TRANSACTION, TransactionManager.class,
						msgs);
			msgs = basicSetTransactionManager(newTransactionManager, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					GD_assignment1_EMFPackage.ACTIVE_TRANSACTION__TRANSACTION_MANAGER, newTransactionManager,
					newTransactionManager));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsBalanceLow() {
		return isBalanceLow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsBalanceLow(boolean newIsBalanceLow) {
		boolean oldIsBalanceLow = isBalanceLow;
		isBalanceLow = newIsBalanceLow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					GD_assignment1_EMFPackage.ACTIVE_TRANSACTION__IS_BALANCE_LOW, oldIsBalanceLow, isBalanceLow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsUsingAnOtherBike() {
		return isUsingAnOtherBike;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsUsingAnOtherBike(boolean newIsUsingAnOtherBike) {
		boolean oldIsUsingAnOtherBike = isUsingAnOtherBike;
		isUsingAnOtherBike = newIsUsingAnOtherBike;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					GD_assignment1_EMFPackage.ACTIVE_TRANSACTION__IS_USING_AN_OTHER_BIKE, oldIsUsingAnOtherBike,
					isUsingAnOtherBike));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GD_assignment1_EMFPackage.ACTIVE_TRANSACTION__FINANCE_MANAGER:
			if (financeManager != null)
				msgs = ((InternalEObject) financeManager).eInverseRemove(this,
						GD_assignment1_EMFPackage.FINANCE_MANAGER__ACTIVE_TRANSACTION, FinanceManager.class, msgs);
			return basicSetFinanceManager((FinanceManager) otherEnd, msgs);
		case GD_assignment1_EMFPackage.ACTIVE_TRANSACTION__TRANSACTION_MANAGER:
			if (transactionManager != null)
				msgs = ((InternalEObject) transactionManager).eInverseRemove(this,
						GD_assignment1_EMFPackage.TRANSACTION_MANAGER__ACTIVE_TRANSACTION, TransactionManager.class,
						msgs);
			return basicSetTransactionManager((TransactionManager) otherEnd, msgs);
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
		case GD_assignment1_EMFPackage.ACTIVE_TRANSACTION__FINANCE_MANAGER:
			return basicSetFinanceManager(null, msgs);
		case GD_assignment1_EMFPackage.ACTIVE_TRANSACTION__TRANSACTION_MANAGER:
			return basicSetTransactionManager(null, msgs);
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
		case GD_assignment1_EMFPackage.ACTIVE_TRANSACTION__FINANCE_MANAGER:
			if (resolve)
				return getFinanceManager();
			return basicGetFinanceManager();
		case GD_assignment1_EMFPackage.ACTIVE_TRANSACTION__TRANSACTION_MANAGER:
			if (resolve)
				return getTransactionManager();
			return basicGetTransactionManager();
		case GD_assignment1_EMFPackage.ACTIVE_TRANSACTION__IS_BALANCE_LOW:
			return isIsBalanceLow();
		case GD_assignment1_EMFPackage.ACTIVE_TRANSACTION__IS_USING_AN_OTHER_BIKE:
			return isIsUsingAnOtherBike();
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
		case GD_assignment1_EMFPackage.ACTIVE_TRANSACTION__FINANCE_MANAGER:
			setFinanceManager((FinanceManager) newValue);
			return;
		case GD_assignment1_EMFPackage.ACTIVE_TRANSACTION__TRANSACTION_MANAGER:
			setTransactionManager((TransactionManager) newValue);
			return;
		case GD_assignment1_EMFPackage.ACTIVE_TRANSACTION__IS_BALANCE_LOW:
			setIsBalanceLow((Boolean) newValue);
			return;
		case GD_assignment1_EMFPackage.ACTIVE_TRANSACTION__IS_USING_AN_OTHER_BIKE:
			setIsUsingAnOtherBike((Boolean) newValue);
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
		case GD_assignment1_EMFPackage.ACTIVE_TRANSACTION__FINANCE_MANAGER:
			setFinanceManager((FinanceManager) null);
			return;
		case GD_assignment1_EMFPackage.ACTIVE_TRANSACTION__TRANSACTION_MANAGER:
			setTransactionManager((TransactionManager) null);
			return;
		case GD_assignment1_EMFPackage.ACTIVE_TRANSACTION__IS_BALANCE_LOW:
			setIsBalanceLow(IS_BALANCE_LOW_EDEFAULT);
			return;
		case GD_assignment1_EMFPackage.ACTIVE_TRANSACTION__IS_USING_AN_OTHER_BIKE:
			setIsUsingAnOtherBike(IS_USING_AN_OTHER_BIKE_EDEFAULT);
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
		case GD_assignment1_EMFPackage.ACTIVE_TRANSACTION__FINANCE_MANAGER:
			return financeManager != null;
		case GD_assignment1_EMFPackage.ACTIVE_TRANSACTION__TRANSACTION_MANAGER:
			return transactionManager != null;
		case GD_assignment1_EMFPackage.ACTIVE_TRANSACTION__IS_BALANCE_LOW:
			return isBalanceLow != IS_BALANCE_LOW_EDEFAULT;
		case GD_assignment1_EMFPackage.ACTIVE_TRANSACTION__IS_USING_AN_OTHER_BIKE:
			return isUsingAnOtherBike != IS_USING_AN_OTHER_BIKE_EDEFAULT;
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
		result.append(" (isBalanceLow: ");
		result.append(isBalanceLow);
		result.append(", isUsingAnOtherBike: ");
		result.append(isUsingAnOtherBike);
		result.append(')');
		return result.toString();
	}

} //ActiveTransactionImpl
