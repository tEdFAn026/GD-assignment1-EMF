/**
 */
package zf41.CO7207.GD_assignment1_EMF.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import zf41.CO7207.GD_assignment1_EMF.Bike;
import zf41.CO7207.GD_assignment1_EMF.GD_assignment1_EMFPackage;
import zf41.CO7207.GD_assignment1_EMF.Manager;
import zf41.CO7207.GD_assignment1_EMF.SharedBicycleServiceProvider;
import zf41.CO7207.GD_assignment1_EMF.User;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Shared Bicycle Service Provider</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link zf41.CO7207.GD_assignment1_EMF.impl.SharedBicycleServiceProviderImpl#getUser <em>User</em>}</li>
 *   <li>{@link zf41.CO7207.GD_assignment1_EMF.impl.SharedBicycleServiceProviderImpl#getProviderName <em>Provider Name</em>}</li>
 *   <li>{@link zf41.CO7207.GD_assignment1_EMF.impl.SharedBicycleServiceProviderImpl#getManager <em>Manager</em>}</li>
 *   <li>{@link zf41.CO7207.GD_assignment1_EMF.impl.SharedBicycleServiceProviderImpl#getBike <em>Bike</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SharedBicycleServiceProviderImpl extends MinimalEObjectImpl.Container
		implements SharedBicycleServiceProvider {
	/**
	 * The cached value of the '{@link #getUser() <em>User</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUser()
	 * @generated
	 * @ordered
	 */
	protected EList<User> user;

	/**
	 * The default value of the '{@link #getProviderName() <em>Provider Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProviderName()
	 * @generated
	 * @ordered
	 */
	protected static final String PROVIDER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProviderName() <em>Provider Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProviderName()
	 * @generated
	 * @ordered
	 */
	protected String providerName = PROVIDER_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getManager() <em>Manager</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManager()
	 * @generated
	 * @ordered
	 */
	protected EList<Manager> manager;

	/**
	 * The cached value of the '{@link #getBike() <em>Bike</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBike()
	 * @generated
	 * @ordered
	 */
	protected EList<Bike> bike;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SharedBicycleServiceProviderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GD_assignment1_EMFPackage.Literals.SHARED_BICYCLE_SERVICE_PROVIDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<User> getUser() {
		if (user == null) {
			user = new EObjectWithInverseResolvingEList<User>(User.class, this,
					GD_assignment1_EMFPackage.SHARED_BICYCLE_SERVICE_PROVIDER__USER,
					GD_assignment1_EMFPackage.USER__SHARED_BICYCLE_SERVICE_PROVIDER);
		}
		return user;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProviderName() {
		return providerName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProviderName(String newProviderName) {
		String oldProviderName = providerName;
		providerName = newProviderName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					GD_assignment1_EMFPackage.SHARED_BICYCLE_SERVICE_PROVIDER__PROVIDER_NAME, oldProviderName,
					providerName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Manager> getManager() {
		if (manager == null) {
			manager = new EObjectWithInverseResolvingEList<Manager>(Manager.class, this,
					GD_assignment1_EMFPackage.SHARED_BICYCLE_SERVICE_PROVIDER__MANAGER,
					GD_assignment1_EMFPackage.MANAGER__SHARED_BICYCLE_SERVICE_PROVIDER);
		}
		return manager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Bike> getBike() {
		if (bike == null) {
			bike = new EObjectWithInverseResolvingEList<Bike>(Bike.class, this,
					GD_assignment1_EMFPackage.SHARED_BICYCLE_SERVICE_PROVIDER__BIKE,
					GD_assignment1_EMFPackage.BIKE__SHAREDBICYCLESERVICEPROVIDER);
		}
		return bike;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GD_assignment1_EMFPackage.SHARED_BICYCLE_SERVICE_PROVIDER__USER:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getUser()).basicAdd(otherEnd, msgs);
		case GD_assignment1_EMFPackage.SHARED_BICYCLE_SERVICE_PROVIDER__MANAGER:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getManager()).basicAdd(otherEnd, msgs);
		case GD_assignment1_EMFPackage.SHARED_BICYCLE_SERVICE_PROVIDER__BIKE:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getBike()).basicAdd(otherEnd, msgs);
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
		case GD_assignment1_EMFPackage.SHARED_BICYCLE_SERVICE_PROVIDER__USER:
			return ((InternalEList<?>) getUser()).basicRemove(otherEnd, msgs);
		case GD_assignment1_EMFPackage.SHARED_BICYCLE_SERVICE_PROVIDER__MANAGER:
			return ((InternalEList<?>) getManager()).basicRemove(otherEnd, msgs);
		case GD_assignment1_EMFPackage.SHARED_BICYCLE_SERVICE_PROVIDER__BIKE:
			return ((InternalEList<?>) getBike()).basicRemove(otherEnd, msgs);
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
		case GD_assignment1_EMFPackage.SHARED_BICYCLE_SERVICE_PROVIDER__USER:
			return getUser();
		case GD_assignment1_EMFPackage.SHARED_BICYCLE_SERVICE_PROVIDER__PROVIDER_NAME:
			return getProviderName();
		case GD_assignment1_EMFPackage.SHARED_BICYCLE_SERVICE_PROVIDER__MANAGER:
			return getManager();
		case GD_assignment1_EMFPackage.SHARED_BICYCLE_SERVICE_PROVIDER__BIKE:
			return getBike();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case GD_assignment1_EMFPackage.SHARED_BICYCLE_SERVICE_PROVIDER__USER:
			getUser().clear();
			getUser().addAll((Collection<? extends User>) newValue);
			return;
		case GD_assignment1_EMFPackage.SHARED_BICYCLE_SERVICE_PROVIDER__PROVIDER_NAME:
			setProviderName((String) newValue);
			return;
		case GD_assignment1_EMFPackage.SHARED_BICYCLE_SERVICE_PROVIDER__MANAGER:
			getManager().clear();
			getManager().addAll((Collection<? extends Manager>) newValue);
			return;
		case GD_assignment1_EMFPackage.SHARED_BICYCLE_SERVICE_PROVIDER__BIKE:
			getBike().clear();
			getBike().addAll((Collection<? extends Bike>) newValue);
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
		case GD_assignment1_EMFPackage.SHARED_BICYCLE_SERVICE_PROVIDER__USER:
			getUser().clear();
			return;
		case GD_assignment1_EMFPackage.SHARED_BICYCLE_SERVICE_PROVIDER__PROVIDER_NAME:
			setProviderName(PROVIDER_NAME_EDEFAULT);
			return;
		case GD_assignment1_EMFPackage.SHARED_BICYCLE_SERVICE_PROVIDER__MANAGER:
			getManager().clear();
			return;
		case GD_assignment1_EMFPackage.SHARED_BICYCLE_SERVICE_PROVIDER__BIKE:
			getBike().clear();
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
		case GD_assignment1_EMFPackage.SHARED_BICYCLE_SERVICE_PROVIDER__USER:
			return user != null && !user.isEmpty();
		case GD_assignment1_EMFPackage.SHARED_BICYCLE_SERVICE_PROVIDER__PROVIDER_NAME:
			return PROVIDER_NAME_EDEFAULT == null ? providerName != null : !PROVIDER_NAME_EDEFAULT.equals(providerName);
		case GD_assignment1_EMFPackage.SHARED_BICYCLE_SERVICE_PROVIDER__MANAGER:
			return manager != null && !manager.isEmpty();
		case GD_assignment1_EMFPackage.SHARED_BICYCLE_SERVICE_PROVIDER__BIKE:
			return bike != null && !bike.isEmpty();
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
		result.append(" (providerName: ");
		result.append(providerName);
		result.append(')');
		return result.toString();
	}

} //SharedBicycleServiceProviderImpl
