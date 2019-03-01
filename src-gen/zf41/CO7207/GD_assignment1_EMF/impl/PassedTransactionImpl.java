/**
 */
package zf41.CO7207.GD_assignment1_EMF.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import zf41.CO7207.GD_assignment1_EMF.GD_assignment1_EMFPackage;
import zf41.CO7207.GD_assignment1_EMF.PassedTransaction;
import zf41.CO7207.GD_assignment1_EMF.TransactionRecords;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Passed Transaction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link zf41.CO7207.GD_assignment1_EMF.impl.PassedTransactionImpl#getTransactionRecords <em>Transaction Records</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PassedTransactionImpl extends TransactionImpl implements PassedTransaction {
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
	protected PassedTransactionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GD_assignment1_EMFPackage.Literals.PASSED_TRANSACTION;
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
							GD_assignment1_EMFPackage.PASSED_TRANSACTION__TRANSACTION_RECORDS, oldTransactionRecords,
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
					GD_assignment1_EMFPackage.PASSED_TRANSACTION__TRANSACTION_RECORDS, oldTransactionRecords,
					newTransactionRecords);
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
						GD_assignment1_EMFPackage.TRANSACTION_RECORDS__PASSED_TRANSACTION, TransactionRecords.class,
						msgs);
			if (newTransactionRecords != null)
				msgs = ((InternalEObject) newTransactionRecords).eInverseAdd(this,
						GD_assignment1_EMFPackage.TRANSACTION_RECORDS__PASSED_TRANSACTION, TransactionRecords.class,
						msgs);
			msgs = basicSetTransactionRecords(newTransactionRecords, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					GD_assignment1_EMFPackage.PASSED_TRANSACTION__TRANSACTION_RECORDS, newTransactionRecords,
					newTransactionRecords));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GD_assignment1_EMFPackage.PASSED_TRANSACTION__TRANSACTION_RECORDS:
			if (transactionRecords != null)
				msgs = ((InternalEObject) transactionRecords).eInverseRemove(this,
						GD_assignment1_EMFPackage.TRANSACTION_RECORDS__PASSED_TRANSACTION, TransactionRecords.class,
						msgs);
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
		case GD_assignment1_EMFPackage.PASSED_TRANSACTION__TRANSACTION_RECORDS:
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
		case GD_assignment1_EMFPackage.PASSED_TRANSACTION__TRANSACTION_RECORDS:
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
		case GD_assignment1_EMFPackage.PASSED_TRANSACTION__TRANSACTION_RECORDS:
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
		case GD_assignment1_EMFPackage.PASSED_TRANSACTION__TRANSACTION_RECORDS:
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
		case GD_assignment1_EMFPackage.PASSED_TRANSACTION__TRANSACTION_RECORDS:
			return transactionRecords != null;
		}
		return super.eIsSet(featureID);
	}

} //PassedTransactionImpl
