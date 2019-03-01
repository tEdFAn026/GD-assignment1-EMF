/**
 */
package zf41.CO7207.GD_assignment1_EMF;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Passed Transaction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link zf41.CO7207.GD_assignment1_EMF.PassedTransaction#getTransactionRecords <em>Transaction Records</em>}</li>
 * </ul>
 *
 * @see zf41.CO7207.GD_assignment1_EMF.GD_assignment1_EMFPackage#getPassedTransaction()
 * @model
 * @generated
 */
public interface PassedTransaction extends Transaction {
	/**
	 * Returns the value of the '<em><b>Transaction Records</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link zf41.CO7207.GD_assignment1_EMF.TransactionRecords#getPassedTransaction <em>Passed Transaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transaction Records</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transaction Records</em>' reference.
	 * @see #setTransactionRecords(TransactionRecords)
	 * @see zf41.CO7207.GD_assignment1_EMF.GD_assignment1_EMFPackage#getPassedTransaction_TransactionRecords()
	 * @see zf41.CO7207.GD_assignment1_EMF.TransactionRecords#getPassedTransaction
	 * @model opposite="passedTransaction" required="true"
	 * @generated
	 */
	TransactionRecords getTransactionRecords();

	/**
	 * Sets the value of the '{@link zf41.CO7207.GD_assignment1_EMF.PassedTransaction#getTransactionRecords <em>Transaction Records</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transaction Records</em>' reference.
	 * @see #getTransactionRecords()
	 * @generated
	 */
	void setTransactionRecords(TransactionRecords value);

} // PassedTransaction
