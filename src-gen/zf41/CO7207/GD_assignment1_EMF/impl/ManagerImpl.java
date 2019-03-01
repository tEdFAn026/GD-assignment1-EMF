/**
 */
package zf41.CO7207.GD_assignment1_EMF.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import zf41.CO7207.GD_assignment1_EMF.GD_assignment1_EMFPackage;
import zf41.CO7207.GD_assignment1_EMF.Manager;
import zf41.CO7207.GD_assignment1_EMF.SharedBicycleServiceProvider;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Manager</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link zf41.CO7207.GD_assignment1_EMF.impl.ManagerImpl#getId <em>Id</em>}</li>
 *   <li>{@link zf41.CO7207.GD_assignment1_EMF.impl.ManagerImpl#getSharedBicycleServiceProvider <em>Shared Bicycle Service Provider</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ManagerImpl extends MinimalEObjectImpl.Container implements Manager {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSharedBicycleServiceProvider() <em>Shared Bicycle Service Provider</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSharedBicycleServiceProvider()
	 * @generated
	 * @ordered
	 */
	protected SharedBicycleServiceProvider sharedBicycleServiceProvider;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ManagerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GD_assignment1_EMFPackage.Literals.MANAGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GD_assignment1_EMFPackage.MANAGER__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SharedBicycleServiceProvider getSharedBicycleServiceProvider() {
		if (sharedBicycleServiceProvider != null && sharedBicycleServiceProvider.eIsProxy()) {
			InternalEObject oldSharedBicycleServiceProvider = (InternalEObject) sharedBicycleServiceProvider;
			sharedBicycleServiceProvider = (SharedBicycleServiceProvider) eResolveProxy(
					oldSharedBicycleServiceProvider);
			if (sharedBicycleServiceProvider != oldSharedBicycleServiceProvider) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							GD_assignment1_EMFPackage.MANAGER__SHARED_BICYCLE_SERVICE_PROVIDER,
							oldSharedBicycleServiceProvider, sharedBicycleServiceProvider));
			}
		}
		return sharedBicycleServiceProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SharedBicycleServiceProvider basicGetSharedBicycleServiceProvider() {
		return sharedBicycleServiceProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSharedBicycleServiceProvider(
			SharedBicycleServiceProvider newSharedBicycleServiceProvider, NotificationChain msgs) {
		SharedBicycleServiceProvider oldSharedBicycleServiceProvider = sharedBicycleServiceProvider;
		sharedBicycleServiceProvider = newSharedBicycleServiceProvider;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GD_assignment1_EMFPackage.MANAGER__SHARED_BICYCLE_SERVICE_PROVIDER, oldSharedBicycleServiceProvider,
					newSharedBicycleServiceProvider);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSharedBicycleServiceProvider(SharedBicycleServiceProvider newSharedBicycleServiceProvider) {
		if (newSharedBicycleServiceProvider != sharedBicycleServiceProvider) {
			NotificationChain msgs = null;
			if (sharedBicycleServiceProvider != null)
				msgs = ((InternalEObject) sharedBicycleServiceProvider).eInverseRemove(this,
						GD_assignment1_EMFPackage.SHARED_BICYCLE_SERVICE_PROVIDER__MANAGER,
						SharedBicycleServiceProvider.class, msgs);
			if (newSharedBicycleServiceProvider != null)
				msgs = ((InternalEObject) newSharedBicycleServiceProvider).eInverseAdd(this,
						GD_assignment1_EMFPackage.SHARED_BICYCLE_SERVICE_PROVIDER__MANAGER,
						SharedBicycleServiceProvider.class, msgs);
			msgs = basicSetSharedBicycleServiceProvider(newSharedBicycleServiceProvider, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					GD_assignment1_EMFPackage.MANAGER__SHARED_BICYCLE_SERVICE_PROVIDER, newSharedBicycleServiceProvider,
					newSharedBicycleServiceProvider));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GD_assignment1_EMFPackage.MANAGER__SHARED_BICYCLE_SERVICE_PROVIDER:
			if (sharedBicycleServiceProvider != null)
				msgs = ((InternalEObject) sharedBicycleServiceProvider).eInverseRemove(this,
						GD_assignment1_EMFPackage.SHARED_BICYCLE_SERVICE_PROVIDER__MANAGER,
						SharedBicycleServiceProvider.class, msgs);
			return basicSetSharedBicycleServiceProvider((SharedBicycleServiceProvider) otherEnd, msgs);
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
		case GD_assignment1_EMFPackage.MANAGER__SHARED_BICYCLE_SERVICE_PROVIDER:
			return basicSetSharedBicycleServiceProvider(null, msgs);
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
		case GD_assignment1_EMFPackage.MANAGER__ID:
			return getId();
		case GD_assignment1_EMFPackage.MANAGER__SHARED_BICYCLE_SERVICE_PROVIDER:
			if (resolve)
				return getSharedBicycleServiceProvider();
			return basicGetSharedBicycleServiceProvider();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case GD_assignment1_EMFPackage.MANAGER__ID:
			setId((String) newValue);
			return;
		case GD_assignment1_EMFPackage.MANAGER__SHARED_BICYCLE_SERVICE_PROVIDER:
			setSharedBicycleServiceProvider((SharedBicycleServiceProvider) newValue);
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
		case GD_assignment1_EMFPackage.MANAGER__ID:
			setId(ID_EDEFAULT);
			return;
		case GD_assignment1_EMFPackage.MANAGER__SHARED_BICYCLE_SERVICE_PROVIDER:
			setSharedBicycleServiceProvider((SharedBicycleServiceProvider) null);
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
		case GD_assignment1_EMFPackage.MANAGER__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case GD_assignment1_EMFPackage.MANAGER__SHARED_BICYCLE_SERVICE_PROVIDER:
			return sharedBicycleServiceProvider != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //ManagerImpl
