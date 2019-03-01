/**
 */
package zf41.CO7207.GD_assignment1_EMF.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import zf41.CO7207.GD_assignment1_EMF.ActiveTransaction;
import zf41.CO7207.GD_assignment1_EMF.FinanceManager;
import zf41.CO7207.GD_assignment1_EMF.GD_assignment1_EMFPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Finance Manager</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link zf41.CO7207.GD_assignment1_EMF.impl.FinanceManagerImpl#getActiveTransaction <em>Active Transaction</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FinanceManagerImpl extends ManagerImpl implements FinanceManager {
	/**
	 * The cached value of the '{@link #getActiveTransaction() <em>Active Transaction</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActiveTransaction()
	 * @generated
	 * @ordered
	 */
	protected EList<ActiveTransaction> activeTransaction;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FinanceManagerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GD_assignment1_EMFPackage.Literals.FINANCE_MANAGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActiveTransaction> getActiveTransaction() {
		if (activeTransaction == null) {
			activeTransaction = new EObjectWithInverseResolvingEList<ActiveTransaction>(ActiveTransaction.class, this,
					GD_assignment1_EMFPackage.FINANCE_MANAGER__ACTIVE_TRANSACTION,
					GD_assignment1_EMFPackage.ACTIVE_TRANSACTION__FINANCE_MANAGER);
		}
		return activeTransaction;
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
		case GD_assignment1_EMFPackage.FINANCE_MANAGER__ACTIVE_TRANSACTION:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getActiveTransaction()).basicAdd(otherEnd,
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
		case GD_assignment1_EMFPackage.FINANCE_MANAGER__ACTIVE_TRANSACTION:
			return ((InternalEList<?>) getActiveTransaction()).basicRemove(otherEnd, msgs);
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
		case GD_assignment1_EMFPackage.FINANCE_MANAGER__ACTIVE_TRANSACTION:
			return getActiveTransaction();
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
		case GD_assignment1_EMFPackage.FINANCE_MANAGER__ACTIVE_TRANSACTION:
			getActiveTransaction().clear();
			getActiveTransaction().addAll((Collection<? extends ActiveTransaction>) newValue);
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
		case GD_assignment1_EMFPackage.FINANCE_MANAGER__ACTIVE_TRANSACTION:
			getActiveTransaction().clear();
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
		case GD_assignment1_EMFPackage.FINANCE_MANAGER__ACTIVE_TRANSACTION:
			return activeTransaction != null && !activeTransaction.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FinanceManagerImpl
