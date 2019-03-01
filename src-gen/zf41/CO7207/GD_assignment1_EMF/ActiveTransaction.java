/**
 */
package zf41.CO7207.GD_assignment1_EMF;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Active Transaction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link zf41.CO7207.GD_assignment1_EMF.ActiveTransaction#getFinanceManager <em>Finance Manager</em>}</li>
 *   <li>{@link zf41.CO7207.GD_assignment1_EMF.ActiveTransaction#getTransactionManager <em>Transaction Manager</em>}</li>
 *   <li>{@link zf41.CO7207.GD_assignment1_EMF.ActiveTransaction#isIsBalanceLow <em>Is Balance Low</em>}</li>
 *   <li>{@link zf41.CO7207.GD_assignment1_EMF.ActiveTransaction#isIsUsingAnOtherBike <em>Is Using An Other Bike</em>}</li>
 * </ul>
 *
 * @see zf41.CO7207.GD_assignment1_EMF.GD_assignment1_EMFPackage#getActiveTransaction()
 * @model
 * @generated
 */
public interface ActiveTransaction extends Transaction {
	/**
	 * Returns the value of the '<em><b>Finance Manager</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link zf41.CO7207.GD_assignment1_EMF.FinanceManager#getActiveTransaction <em>Active Transaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Finance Manager</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Finance Manager</em>' reference.
	 * @see #setFinanceManager(FinanceManager)
	 * @see zf41.CO7207.GD_assignment1_EMF.GD_assignment1_EMFPackage#getActiveTransaction_FinanceManager()
	 * @see zf41.CO7207.GD_assignment1_EMF.FinanceManager#getActiveTransaction
	 * @model opposite="activeTransaction" required="true"
	 * @generated
	 */
	FinanceManager getFinanceManager();

	/**
	 * Sets the value of the '{@link zf41.CO7207.GD_assignment1_EMF.ActiveTransaction#getFinanceManager <em>Finance Manager</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Finance Manager</em>' reference.
	 * @see #getFinanceManager()
	 * @generated
	 */
	void setFinanceManager(FinanceManager value);

	/**
	 * Returns the value of the '<em><b>Transaction Manager</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link zf41.CO7207.GD_assignment1_EMF.TransactionManager#getActiveTransaction <em>Active Transaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transaction Manager</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transaction Manager</em>' reference.
	 * @see #setTransactionManager(TransactionManager)
	 * @see zf41.CO7207.GD_assignment1_EMF.GD_assignment1_EMFPackage#getActiveTransaction_TransactionManager()
	 * @see zf41.CO7207.GD_assignment1_EMF.TransactionManager#getActiveTransaction
	 * @model opposite="activeTransaction" required="true"
	 * @generated
	 */
	TransactionManager getTransactionManager();

	/**
	 * Sets the value of the '{@link zf41.CO7207.GD_assignment1_EMF.ActiveTransaction#getTransactionManager <em>Transaction Manager</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transaction Manager</em>' reference.
	 * @see #getTransactionManager()
	 * @generated
	 */
	void setTransactionManager(TransactionManager value);

	/**
	 * Returns the value of the '<em><b>Is Balance Low</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Balance Low</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Balance Low</em>' attribute.
	 * @see #setIsBalanceLow(boolean)
	 * @see zf41.CO7207.GD_assignment1_EMF.GD_assignment1_EMFPackage#getActiveTransaction_IsBalanceLow()
	 * @model
	 * @generated
	 */
	boolean isIsBalanceLow();

	/**
	 * Sets the value of the '{@link zf41.CO7207.GD_assignment1_EMF.ActiveTransaction#isIsBalanceLow <em>Is Balance Low</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Balance Low</em>' attribute.
	 * @see #isIsBalanceLow()
	 * @generated
	 */
	void setIsBalanceLow(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Using An Other Bike</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Using An Other Bike</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Using An Other Bike</em>' attribute.
	 * @see #setIsUsingAnOtherBike(boolean)
	 * @see zf41.CO7207.GD_assignment1_EMF.GD_assignment1_EMFPackage#getActiveTransaction_IsUsingAnOtherBike()
	 * @model
	 * @generated
	 */
	boolean isIsUsingAnOtherBike();

	/**
	 * Sets the value of the '{@link zf41.CO7207.GD_assignment1_EMF.ActiveTransaction#isIsUsingAnOtherBike <em>Is Using An Other Bike</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Using An Other Bike</em>' attribute.
	 * @see #isIsUsingAnOtherBike()
	 * @generated
	 */
	void setIsUsingAnOtherBike(boolean value);

} // ActiveTransaction
