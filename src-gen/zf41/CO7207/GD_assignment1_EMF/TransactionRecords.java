/**
 */
package zf41.CO7207.GD_assignment1_EMF;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transaction Records</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link zf41.CO7207.GD_assignment1_EMF.TransactionRecords#getUser <em>User</em>}</li>
 *   <li>{@link zf41.CO7207.GD_assignment1_EMF.TransactionRecords#getPassedTransaction <em>Passed Transaction</em>}</li>
 * </ul>
 *
 * @see zf41.CO7207.GD_assignment1_EMF.GD_assignment1_EMFPackage#getTransactionRecords()
 * @model
 * @generated
 */
public interface TransactionRecords extends EObject {
	/**
	 * Returns the value of the '<em><b>User</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link zf41.CO7207.GD_assignment1_EMF.User#getTransactionRecords <em>Transaction Records</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User</em>' reference.
	 * @see #setUser(User)
	 * @see zf41.CO7207.GD_assignment1_EMF.GD_assignment1_EMFPackage#getTransactionRecords_User()
	 * @see zf41.CO7207.GD_assignment1_EMF.User#getTransactionRecords
	 * @model opposite="transactionRecords" required="true"
	 * @generated
	 */
	User getUser();

	/**
	 * Sets the value of the '{@link zf41.CO7207.GD_assignment1_EMF.TransactionRecords#getUser <em>User</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User</em>' reference.
	 * @see #getUser()
	 * @generated
	 */
	void setUser(User value);

	/**
	 * Returns the value of the '<em><b>Passed Transaction</b></em>' reference list.
	 * The list contents are of type {@link zf41.CO7207.GD_assignment1_EMF.PassedTransaction}.
	 * It is bidirectional and its opposite is '{@link zf41.CO7207.GD_assignment1_EMF.PassedTransaction#getTransactionRecords <em>Transaction Records</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Passed Transaction</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passed Transaction</em>' reference list.
	 * @see zf41.CO7207.GD_assignment1_EMF.GD_assignment1_EMFPackage#getTransactionRecords_PassedTransaction()
	 * @see zf41.CO7207.GD_assignment1_EMF.PassedTransaction#getTransactionRecords
	 * @model opposite="transactionRecords"
	 * @generated
	 */
	EList<PassedTransaction> getPassedTransaction();

} // TransactionRecords
