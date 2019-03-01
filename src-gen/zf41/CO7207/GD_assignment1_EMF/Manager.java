/**
 */
package zf41.CO7207.GD_assignment1_EMF;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link zf41.CO7207.GD_assignment1_EMF.Manager#getId <em>Id</em>}</li>
 *   <li>{@link zf41.CO7207.GD_assignment1_EMF.Manager#getSharedBicycleServiceProvider <em>Shared Bicycle Service Provider</em>}</li>
 * </ul>
 *
 * @see zf41.CO7207.GD_assignment1_EMF.GD_assignment1_EMFPackage#getManager()
 * @model abstract="true"
 * @generated
 */
public interface Manager extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see zf41.CO7207.GD_assignment1_EMF.GD_assignment1_EMFPackage#getManager_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link zf41.CO7207.GD_assignment1_EMF.Manager#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Shared Bicycle Service Provider</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link zf41.CO7207.GD_assignment1_EMF.SharedBicycleServiceProvider#getManager <em>Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shared Bicycle Service Provider</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shared Bicycle Service Provider</em>' reference.
	 * @see #setSharedBicycleServiceProvider(SharedBicycleServiceProvider)
	 * @see zf41.CO7207.GD_assignment1_EMF.GD_assignment1_EMFPackage#getManager_SharedBicycleServiceProvider()
	 * @see zf41.CO7207.GD_assignment1_EMF.SharedBicycleServiceProvider#getManager
	 * @model opposite="manager" required="true"
	 * @generated
	 */
	SharedBicycleServiceProvider getSharedBicycleServiceProvider();

	/**
	 * Sets the value of the '{@link zf41.CO7207.GD_assignment1_EMF.Manager#getSharedBicycleServiceProvider <em>Shared Bicycle Service Provider</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shared Bicycle Service Provider</em>' reference.
	 * @see #getSharedBicycleServiceProvider()
	 * @generated
	 */
	void setSharedBicycleServiceProvider(SharedBicycleServiceProvider value);

} // Manager
