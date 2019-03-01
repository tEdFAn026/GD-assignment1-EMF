/**
 */
package zf41.CO7207.GD_assignment1_EMF;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transaction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link zf41.CO7207.GD_assignment1_EMF.Transaction#getPrice <em>Price</em>}</li>
 *   <li>{@link zf41.CO7207.GD_assignment1_EMF.Transaction#getDate <em>Date</em>}</li>
 *   <li>{@link zf41.CO7207.GD_assignment1_EMF.Transaction#getUser <em>User</em>}</li>
 *   <li>{@link zf41.CO7207.GD_assignment1_EMF.Transaction#getBike <em>Bike</em>}</li>
 *   <li>{@link zf41.CO7207.GD_assignment1_EMF.Transaction#getStatus <em>Status</em>}</li>
 * </ul>
 *
 * @see zf41.CO7207.GD_assignment1_EMF.GD_assignment1_EMFPackage#getTransaction()
 * @model abstract="true"
 * @generated
 */
public interface Transaction extends EObject {
	/**
	 * Returns the value of the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Price</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Price</em>' attribute.
	 * @see #setPrice(float)
	 * @see zf41.CO7207.GD_assignment1_EMF.GD_assignment1_EMFPackage#getTransaction_Price()
	 * @model
	 * @generated
	 */
	float getPrice();

	/**
	 * Sets the value of the '{@link zf41.CO7207.GD_assignment1_EMF.Transaction#getPrice <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Price</em>' attribute.
	 * @see #getPrice()
	 * @generated
	 */
	void setPrice(float value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(Date)
	 * @see zf41.CO7207.GD_assignment1_EMF.GD_assignment1_EMFPackage#getTransaction_Date()
	 * @model
	 * @generated
	 */
	Date getDate();

	/**
	 * Sets the value of the '{@link zf41.CO7207.GD_assignment1_EMF.Transaction#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(Date value);

	/**
	 * Returns the value of the '<em><b>User</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User</em>' containment reference.
	 * @see #setUser(User)
	 * @see zf41.CO7207.GD_assignment1_EMF.GD_assignment1_EMFPackage#getTransaction_User()
	 * @model containment="true" required="true"
	 * @generated
	 */
	User getUser();

	/**
	 * Sets the value of the '{@link zf41.CO7207.GD_assignment1_EMF.Transaction#getUser <em>User</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User</em>' containment reference.
	 * @see #getUser()
	 * @generated
	 */
	void setUser(User value);

	/**
	 * Returns the value of the '<em><b>Bike</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bike</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bike</em>' containment reference.
	 * @see #setBike(Bike)
	 * @see zf41.CO7207.GD_assignment1_EMF.GD_assignment1_EMFPackage#getTransaction_Bike()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Bike getBike();

	/**
	 * Sets the value of the '{@link zf41.CO7207.GD_assignment1_EMF.Transaction#getBike <em>Bike</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bike</em>' containment reference.
	 * @see #getBike()
	 * @generated
	 */
	void setBike(Bike value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link zf41.CO7207.GD_assignment1_EMF.StatusOfTransaction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see zf41.CO7207.GD_assignment1_EMF.StatusOfTransaction
	 * @see #setStatus(StatusOfTransaction)
	 * @see zf41.CO7207.GD_assignment1_EMF.GD_assignment1_EMFPackage#getTransaction_Status()
	 * @model
	 * @generated
	 */
	StatusOfTransaction getStatus();

	/**
	 * Sets the value of the '{@link zf41.CO7207.GD_assignment1_EMF.Transaction#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see zf41.CO7207.GD_assignment1_EMF.StatusOfTransaction
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(StatusOfTransaction value);

} // Transaction
