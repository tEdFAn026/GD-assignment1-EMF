/**
 */
package zf41.CO7207.GD_assignment1_EMF;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bike</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link zf41.CO7207.GD_assignment1_EMF.Bike#getBikeID <em>Bike ID</em>}</li>
 *   <li>{@link zf41.CO7207.GD_assignment1_EMF.Bike#getActiveTransaction <em>Active Transaction</em>}</li>
 *   <li>{@link zf41.CO7207.GD_assignment1_EMF.Bike#getStatus <em>Status</em>}</li>
 *   <li>{@link zf41.CO7207.GD_assignment1_EMF.Bike#getSharedbicycleserviceprovider <em>Sharedbicycleserviceprovider</em>}</li>
 * </ul>
 *
 * @see zf41.CO7207.GD_assignment1_EMF.GD_assignment1_EMFPackage#getBike()
 * @model
 * @generated
 */
public interface Bike extends EObject {
	/**
	 * Returns the value of the '<em><b>Bike ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bike ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bike ID</em>' attribute.
	 * @see #setBikeID(String)
	 * @see zf41.CO7207.GD_assignment1_EMF.GD_assignment1_EMFPackage#getBike_BikeID()
	 * @model
	 * @generated
	 */
	String getBikeID();

	/**
	 * Sets the value of the '{@link zf41.CO7207.GD_assignment1_EMF.Bike#getBikeID <em>Bike ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bike ID</em>' attribute.
	 * @see #getBikeID()
	 * @generated
	 */
	void setBikeID(String value);

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
	 * @see zf41.CO7207.GD_assignment1_EMF.GD_assignment1_EMFPackage#getBike_ActiveTransaction()
	 * @model containment="true"
	 * @generated
	 */
	ActiveTransaction getActiveTransaction();

	/**
	 * Sets the value of the '{@link zf41.CO7207.GD_assignment1_EMF.Bike#getActiveTransaction <em>Active Transaction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Active Transaction</em>' containment reference.
	 * @see #getActiveTransaction()
	 * @generated
	 */
	void setActiveTransaction(ActiveTransaction value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link zf41.CO7207.GD_assignment1_EMF.StatusOfBike}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see zf41.CO7207.GD_assignment1_EMF.StatusOfBike
	 * @see #setStatus(StatusOfBike)
	 * @see zf41.CO7207.GD_assignment1_EMF.GD_assignment1_EMFPackage#getBike_Status()
	 * @model
	 * @generated
	 */
	StatusOfBike getStatus();

	/**
	 * Sets the value of the '{@link zf41.CO7207.GD_assignment1_EMF.Bike#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see zf41.CO7207.GD_assignment1_EMF.StatusOfBike
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(StatusOfBike value);

	/**
	 * Returns the value of the '<em><b>Sharedbicycleserviceprovider</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link zf41.CO7207.GD_assignment1_EMF.SharedBicycleServiceProvider#getBike <em>Bike</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sharedbicycleserviceprovider</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sharedbicycleserviceprovider</em>' reference.
	 * @see #setSharedbicycleserviceprovider(SharedBicycleServiceProvider)
	 * @see zf41.CO7207.GD_assignment1_EMF.GD_assignment1_EMFPackage#getBike_Sharedbicycleserviceprovider()
	 * @see zf41.CO7207.GD_assignment1_EMF.SharedBicycleServiceProvider#getBike
	 * @model opposite="bike" required="true"
	 * @generated
	 */
	SharedBicycleServiceProvider getSharedbicycleserviceprovider();

	/**
	 * Sets the value of the '{@link zf41.CO7207.GD_assignment1_EMF.Bike#getSharedbicycleserviceprovider <em>Sharedbicycleserviceprovider</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sharedbicycleserviceprovider</em>' reference.
	 * @see #getSharedbicycleserviceprovider()
	 * @generated
	 */
	void setSharedbicycleserviceprovider(SharedBicycleServiceProvider value);

} // Bike
