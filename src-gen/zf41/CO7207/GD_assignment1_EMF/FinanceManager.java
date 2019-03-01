/**
 */
package zf41.CO7207.GD_assignment1_EMF;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Finance Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link zf41.CO7207.GD_assignment1_EMF.FinanceManager#getActiveTransaction <em>Active Transaction</em>}</li>
 * </ul>
 *
 * @see zf41.CO7207.GD_assignment1_EMF.GD_assignment1_EMFPackage#getFinanceManager()
 * @model
 * @generated
 */
public interface FinanceManager extends Manager {
	/**
	 * Returns the value of the '<em><b>Active Transaction</b></em>' reference list.
	 * The list contents are of type {@link zf41.CO7207.GD_assignment1_EMF.ActiveTransaction}.
	 * It is bidirectional and its opposite is '{@link zf41.CO7207.GD_assignment1_EMF.ActiveTransaction#getFinanceManager <em>Finance Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Active Transaction</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Active Transaction</em>' reference list.
	 * @see zf41.CO7207.GD_assignment1_EMF.GD_assignment1_EMFPackage#getFinanceManager_ActiveTransaction()
	 * @see zf41.CO7207.GD_assignment1_EMF.ActiveTransaction#getFinanceManager
	 * @model opposite="financeManager"
	 * @generated
	 */
	EList<ActiveTransaction> getActiveTransaction();

} // FinanceManager
