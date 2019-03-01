/**
 */
package zf41.CO7207.GD_assignment1_EMF;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link zf41.CO7207.GD_assignment1_EMF.User#getUserID <em>User ID</em>}</li>
 *   <li>{@link zf41.CO7207.GD_assignment1_EMF.User#getUserName <em>User Name</em>}</li>
 *   <li>{@link zf41.CO7207.GD_assignment1_EMF.User#getBalance <em>Balance</em>}</li>
 *   <li>{@link zf41.CO7207.GD_assignment1_EMF.User#getSharedBicycleServiceProvider <em>Shared Bicycle Service Provider</em>}</li>
 *   <li>{@link zf41.CO7207.GD_assignment1_EMF.User#getActiveTransaction <em>Active Transaction</em>}</li>
 *   <li>{@link zf41.CO7207.GD_assignment1_EMF.User#getTransactionRecords <em>Transaction Records</em>}</li>
 * </ul>
 *
 * @see zf41.CO7207.GD_assignment1_EMF.GD_assignment1_EMFPackage#getUser()
 * @model
 * @generated
 */
public interface User extends EObject {
	/**
	 * Returns the value of the '<em><b>User ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User ID</em>' attribute.
	 * @see #setUserID(String)
	 * @see zf41.CO7207.GD_assignment1_EMF.GD_assignment1_EMFPackage#getUser_UserID()
	 * @model
	 * @generated
	 */
	String getUserID();

	/**
	 * Sets the value of the '{@link zf41.CO7207.GD_assignment1_EMF.User#getUserID <em>User ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User ID</em>' attribute.
	 * @see #getUserID()
	 * @generated
	 */
	void setUserID(String value);

	/**
	 * Returns the value of the '<em><b>User Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Name</em>' attribute.
	 * @see #setUserName(String)
	 * @see zf41.CO7207.GD_assignment1_EMF.GD_assignment1_EMFPackage#getUser_UserName()
	 * @model
	 * @generated
	 */
	String getUserName();

	/**
	 * Sets the value of the '{@link zf41.CO7207.GD_assignment1_EMF.User#getUserName <em>User Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Name</em>' attribute.
	 * @see #getUserName()
	 * @generated
	 */
	void setUserName(String value);

	/**
	 * Returns the value of the '<em><b>Balance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Balance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Balance</em>' attribute.
	 * @see #setBalance(float)
	 * @see zf41.CO7207.GD_assignment1_EMF.GD_assignment1_EMFPackage#getUser_Balance()
	 * @model
	 * @generated
	 */
	float getBalance();

	/**
	 * Sets the value of the '{@link zf41.CO7207.GD_assignment1_EMF.User#getBalance <em>Balance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Balance</em>' attribute.
	 * @see #getBalance()
	 * @generated
	 */
	void setBalance(float value);

	/**
	 * Returns the value of the '<em><b>Shared Bicycle Service Provider</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link zf41.CO7207.GD_assignment1_EMF.SharedBicycleServiceProvider#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shared Bicycle Service Provider</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shared Bicycle Service Provider</em>' reference.
	 * @see #setSharedBicycleServiceProvider(SharedBicycleServiceProvider)
	 * @see zf41.CO7207.GD_assignment1_EMF.GD_assignment1_EMFPackage#getUser_SharedBicycleServiceProvider()
	 * @see zf41.CO7207.GD_assignment1_EMF.SharedBicycleServiceProvider#getUser
	 * @model opposite="user" required="true"
	 * @generated
	 */
	SharedBicycleServiceProvider getSharedBicycleServiceProvider();

	/**
	 * Sets the value of the '{@link zf41.CO7207.GD_assignment1_EMF.User#getSharedBicycleServiceProvider <em>Shared Bicycle Service Provider</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shared Bicycle Service Provider</em>' reference.
	 * @see #getSharedBicycleServiceProvider()
	 * @generated
	 */
	void setSharedBicycleServiceProvider(SharedBicycleServiceProvider value);

	/**
	 * Returns the value of the '<em><b>Active Transaction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Active Transaction</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Active Transaction</em>' containment reference.
	 * @see #setActiveTransaction(ActiveTransaction)
	 * @see zf41.CO7207.GD_assignment1_EMF.GD_assignment1_EMFPackage#getUser_ActiveTransaction()
	 * @model containment="true"
	 * @generated
	 */
	ActiveTransaction getActiveTransaction();

	/**
	 * Sets the value of the '{@link zf41.CO7207.GD_assignment1_EMF.User#getActiveTransaction <em>Active Transaction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Active Transaction</em>' containment reference.
	 * @see #getActiveTransaction()
	 * @generated
	 */
	void setActiveTransaction(ActiveTransaction value);

	/**
	 * Returns the value of the '<em><b>Transaction Records</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link zf41.CO7207.GD_assignment1_EMF.TransactionRecords#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transaction Records</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transaction Records</em>' reference.
	 * @see #setTransactionRecords(TransactionRecords)
	 * @see zf41.CO7207.GD_assignment1_EMF.GD_assignment1_EMFPackage#getUser_TransactionRecords()
	 * @see zf41.CO7207.GD_assignment1_EMF.TransactionRecords#getUser
	 * @model opposite="user" required="true"
	 * @generated
	 */
	TransactionRecords getTransactionRecords();

	/**
	 * Sets the value of the '{@link zf41.CO7207.GD_assignment1_EMF.User#getTransactionRecords <em>Transaction Records</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transaction Records</em>' reference.
	 * @see #getTransactionRecords()
	 * @generated
	 */
	void setTransactionRecords(TransactionRecords value);

} // User
