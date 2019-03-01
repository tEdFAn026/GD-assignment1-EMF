/**
 */
package zf41.CO7207.GD_assignment1_EMF.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import zf41.CO7207.GD_assignment1_EMF.GD_assignment1_EMFPackage;
import zf41.CO7207.GD_assignment1_EMF.PassedTransaction;
import zf41.CO7207.GD_assignment1_EMF.TransactionRecords;
import zf41.CO7207.GD_assignment1_EMF.User;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transaction Records</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link zf41.CO7207.GD_assignment1_EMF.impl.TransactionRecordsImpl#getUser <em>User</em>}</li>
 *   <li>{@link zf41.CO7207.GD_assignment1_EMF.impl.TransactionRecordsImpl#getPassedTransaction <em>Passed Transaction</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransactionRecordsImpl extends MinimalEObjectImpl.Container implements TransactionRecords {
	/**
	 * The cached value of the '{@link #getUser() <em>User</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUser()
	 * @generated
	 * @ordered
	 */
	protected User user;

	/**
	 * The cached value of the '{@link #getPassedTransaction() <em>Passed Transaction</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassedTransaction()
	 * @generated
	 * @ordered
	 */
	protected EList<PassedTransaction> passedTransaction;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransactionRecordsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GD_assignment1_EMFPackage.Literals.TRANSACTION_RECORDS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User getUser() {
		if (user != null && user.eIsProxy()) {
			InternalEObject oldUser = (InternalEObject) user;
			user = (User) eResolveProxy(oldUser);
			if (user != oldUser) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							GD_assignment1_EMFPackage.TRANSACTION_RECORDS__USER, oldUser, user));
			}
		}
		return user;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User basicGetUser() {
		return user;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUser(User newUser, NotificationChain msgs) {
		User oldUser = user;
		user = newUser;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GD_assignment1_EMFPackage.TRANSACTION_RECORDS__USER, oldUser, newUser);
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
	public void setUser(User newUser) {
		if (newUser != user) {
			NotificationChain msgs = null;
			if (user != null)
				msgs = ((InternalEObject) user).eInverseRemove(this,
						GD_assignment1_EMFPackage.USER__TRANSACTION_RECORDS, User.class, msgs);
			if (newUser != null)
				msgs = ((InternalEObject) newUser).eInverseAdd(this,
						GD_assignment1_EMFPackage.USER__TRANSACTION_RECORDS, User.class, msgs);
			msgs = basicSetUser(newUser, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GD_assignment1_EMFPackage.TRANSACTION_RECORDS__USER,
					newUser, newUser));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PassedTransaction> getPassedTransaction() {
		if (passedTransaction == null) {
			passedTransaction = new EObjectWithInverseResolvingEList<PassedTransaction>(PassedTransaction.class, this,
					GD_assignment1_EMFPackage.TRANSACTION_RECORDS__PASSED_TRANSACTION,
					GD_assignment1_EMFPackage.PASSED_TRANSACTION__TRANSACTION_RECORDS);
		}
		return passedTransaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GD_assignment1_EMFPackage.TRANSACTION_RECORDS__USER:
			if (user != null)
				msgs = ((InternalEObject) user).eInverseRemove(this,
						GD_assignment1_EMFPackage.USER__TRANSACTION_RECORDS, User.class, msgs);
			return basicSetUser((User) otherEnd, msgs);
		case GD_assignment1_EMFPackage.TRANSACTION_RECORDS__PASSED_TRANSACTION:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getPassedTransaction()).basicAdd(otherEnd,
					msgs);
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
		case GD_assignment1_EMFPackage.TRANSACTION_RECORDS__USER:
			return basicSetUser(null, msgs);
		case GD_assignment1_EMFPackage.TRANSACTION_RECORDS__PASSED_TRANSACTION:
			return ((InternalEList<?>) getPassedTransaction()).basicRemove(otherEnd, msgs);
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
		case GD_assignment1_EMFPackage.TRANSACTION_RECORDS__USER:
			if (resolve)
				return getUser();
			return basicGetUser();
		case GD_assignment1_EMFPackage.TRANSACTION_RECORDS__PASSED_TRANSACTION:
			return getPassedTransaction();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case GD_assignment1_EMFPackage.TRANSACTION_RECORDS__USER:
			setUser((User) newValue);
			return;
		case GD_assignment1_EMFPackage.TRANSACTION_RECORDS__PASSED_TRANSACTION:
			getPassedTransaction().clear();
			getPassedTransaction().addAll((Collection<? extends PassedTransaction>) newValue);
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
		case GD_assignment1_EMFPackage.TRANSACTION_RECORDS__USER:
			setUser((User) null);
			return;
		case GD_assignment1_EMFPackage.TRANSACTION_RECORDS__PASSED_TRANSACTION:
			getPassedTransaction().clear();
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
		case GD_assignment1_EMFPackage.TRANSACTION_RECORDS__USER:
			return user != null;
		case GD_assignment1_EMFPackage.TRANSACTION_RECORDS__PASSED_TRANSACTION:
			return passedTransaction != null && !passedTransaction.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TransactionRecordsImpl
