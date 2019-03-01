/**
 */
package zf41.CO7207.GD_assignment1_EMF;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shared Bicycle Service Provider</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link zf41.CO7207.GD_assignment1_EMF.SharedBicycleServiceProvider#getUser <em>User</em>}</li>
 *   <li>{@link zf41.CO7207.GD_assignment1_EMF.SharedBicycleServiceProvider#getProviderName <em>Provider Name</em>}</li>
 *   <li>{@link zf41.CO7207.GD_assignment1_EMF.SharedBicycleServiceProvider#getManager <em>Manager</em>}</li>
 *   <li>{@link zf41.CO7207.GD_assignment1_EMF.SharedBicycleServiceProvider#getBike <em>Bike</em>}</li>
 * </ul>
 *
 * @see zf41.CO7207.GD_assignment1_EMF.GD_assignment1_EMFPackage#getSharedBicycleServiceProvider()
 * @model
 * @generated
 */
public interface SharedBicycleServiceProvider extends EObject {
	/**
	 * Returns the value of the '<em><b>User</b></em>' reference list.
	 * The list contents are of type {@link zf41.CO7207.GD_assignment1_EMF.User}.
	 * It is bidirectional and its opposite is '{@link zf41.CO7207.GD_assignment1_EMF.User#getSharedBicycleServiceProvider <em>Shared Bicycle Service Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User</em>' reference list.
	 * @see zf41.CO7207.GD_assignment1_EMF.GD_assignment1_EMFPackage#getSharedBicycleServiceProvider_User()
	 * @see zf41.CO7207.GD_assignment1_EMF.User#getSharedBicycleServiceProvider
	 * @model opposite="sharedBicycleServiceProvider"
	 * @generated
	 */
	EList<User> getUser();

	/**
	 * Returns the value of the '<em><b>Provider Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provider Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provider Name</em>' attribute.
	 * @see #setProviderName(String)
	 * @see zf41.CO7207.GD_assignment1_EMF.GD_assignment1_EMFPackage#getSharedBicycleServiceProvider_ProviderName()
	 * @model
	 * @generated
	 */
	String getProviderName();

	/**
	 * Sets the value of the '{@link zf41.CO7207.GD_assignment1_EMF.SharedBicycleServiceProvider#getProviderName <em>Provider Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provider Name</em>' attribute.
	 * @see #getProviderName()
	 * @generated
	 */
	void setProviderName(String value);

	/**
	 * Returns the value of the '<em><b>Manager</b></em>' reference list.
	 * The list contents are of type {@link zf41.CO7207.GD_assignment1_EMF.Manager}.
	 * It is bidirectional and its opposite is '{@link zf41.CO7207.GD_assignment1_EMF.Manager#getSharedBicycleServiceProvider <em>Shared Bicycle Service Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Manager</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Manager</em>' reference list.
	 * @see zf41.CO7207.GD_assignment1_EMF.GD_assignment1_EMFPackage#getSharedBicycleServiceProvider_Manager()
	 * @see zf41.CO7207.GD_assignment1_EMF.Manager#getSharedBicycleServiceProvider
	 * @model opposite="sharedBicycleServiceProvider" lower="3"
	 * @generated
	 */
	EList<Manager> getManager();

	/**
	 * Returns the value of the '<em><b>Bike</b></em>' reference list.
	 * The list contents are of type {@link zf41.CO7207.GD_assignment1_EMF.Bike}.
	 * It is bidirectional and its opposite is '{@link zf41.CO7207.GD_assignment1_EMF.Bike#getSharedbicycleserviceprovider <em>Sharedbicycleserviceprovider</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bike</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bike</em>' reference list.
	 * @see zf41.CO7207.GD_assignment1_EMF.GD_assignment1_EMFPackage#getSharedBicycleServiceProvider_Bike()
	 * @see zf41.CO7207.GD_assignment1_EMF.Bike#getSharedbicycleserviceprovider
	 * @model opposite="sharedbicycleserviceprovider" required="true"
	 * @generated
	 */
	EList<Bike> getBike();

} // SharedBicycleServiceProvider
