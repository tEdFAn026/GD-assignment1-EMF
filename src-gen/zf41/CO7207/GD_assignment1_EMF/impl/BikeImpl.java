/**
 */
package zf41.CO7207.GD_assignment1_EMF.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import zf41.CO7207.GD_assignment1_EMF.ActiveTransaction;
import zf41.CO7207.GD_assignment1_EMF.Bike;
import zf41.CO7207.GD_assignment1_EMF.GD_assignment1_EMFPackage;
import zf41.CO7207.GD_assignment1_EMF.SharedBicycleServiceProvider;
import zf41.CO7207.GD_assignment1_EMF.StatusOfBike;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bike</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link zf41.CO7207.GD_assignment1_EMF.impl.BikeImpl#getBikeID <em>Bike ID</em>}</li>
 *   <li>{@link zf41.CO7207.GD_assignment1_EMF.impl.BikeImpl#getActiveTransaction <em>Active Transaction</em>}</li>
 *   <li>{@link zf41.CO7207.GD_assignment1_EMF.impl.BikeImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link zf41.CO7207.GD_assignment1_EMF.impl.BikeImpl#getSharedbicycleserviceprovider <em>Sharedbicycleserviceprovider</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BikeImpl extends MinimalEObjectImpl.Container implements Bike {
	/**
	 * The default value of the '{@link #getBikeID() <em>Bike ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBikeID()
	 * @generated
	 * @ordered
	 */
	protected static final String BIKE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBikeID() <em>Bike ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBikeID()
	 * @generated
	 * @ordered
	 */
	protected String bikeID = BIKE_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getActiveTransaction() <em>Active Transaction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActiveTransaction()
	 * @generated
	 * @ordered
	 */
	protected ActiveTransaction activeTransaction;

	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final StatusOfBike STATUS_EDEFAULT = StatusOfBike.FUNCTIONALLY_INTACT;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected StatusOfBike status = STATUS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSharedbicycleserviceprovider() <em>Sharedbicycleserviceprovider</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSharedbicycleserviceprovider()
	 * @generated
	 * @ordered
	 */
	protected SharedBicycleServiceProvider sharedbicycleserviceprovider;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BikeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GD_assignment1_EMFPackage.Literals.BIKE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBikeID() {
		return bikeID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBikeID(String newBikeID) {
		String oldBikeID = bikeID;
		bikeID = newBikeID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GD_assignment1_EMFPackage.BIKE__BIKE_ID, oldBikeID,
					bikeID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActiveTransaction getActiveTransaction() {
		return activeTransaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActiveTransaction(ActiveTransaction newActiveTransaction, NotificationChain msgs) {
		ActiveTransaction oldActiveTransaction = activeTransaction;
		activeTransaction = newActiveTransaction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GD_assignment1_EMFPackage.BIKE__ACTIVE_TRANSACTION, oldActiveTransaction, newActiveTransaction);
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
	public void setActiveTransaction(ActiveTransaction newActiveTransaction) {
		if (newActiveTransaction != activeTransaction) {
			NotificationChain msgs = null;
			if (activeTransaction != null)
				msgs = ((InternalEObject) activeTransaction).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - GD_assignment1_EMFPackage.BIKE__ACTIVE_TRANSACTION, null, msgs);
			if (newActiveTransaction != null)
				msgs = ((InternalEObject) newActiveTransaction).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - GD_assignment1_EMFPackage.BIKE__ACTIVE_TRANSACTION, null, msgs);
			msgs = basicSetActiveTransaction(newActiveTransaction, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GD_assignment1_EMFPackage.BIKE__ACTIVE_TRANSACTION,
					newActiveTransaction, newActiveTransaction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatusOfBike getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(StatusOfBike newStatus) {
		StatusOfBike oldStatus = status;
		status = newStatus == null ? STATUS_EDEFAULT : newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GD_assignment1_EMFPackage.BIKE__STATUS, oldStatus,
					status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SharedBicycleServiceProvider getSharedbicycleserviceprovider() {
		if (sharedbicycleserviceprovider != null && sharedbicycleserviceprovider.eIsProxy()) {
			InternalEObject oldSharedbicycleserviceprovider = (InternalEObject) sharedbicycleserviceprovider;
			sharedbicycleserviceprovider = (SharedBicycleServiceProvider) eResolveProxy(
					oldSharedbicycleserviceprovider);
			if (sharedbicycleserviceprovider != oldSharedbicycleserviceprovider) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							GD_assignment1_EMFPackage.BIKE__SHAREDBICYCLESERVICEPROVIDER,
							oldSharedbicycleserviceprovider, sharedbicycleserviceprovider));
			}
		}
		return sharedbicycleserviceprovider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SharedBicycleServiceProvider basicGetSharedbicycleserviceprovider() {
		return sharedbicycleserviceprovider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSharedbicycleserviceprovider(
			SharedBicycleServiceProvider newSharedbicycleserviceprovider, NotificationChain msgs) {
		SharedBicycleServiceProvider oldSharedbicycleserviceprovider = sharedbicycleserviceprovider;
		sharedbicycleserviceprovider = newSharedbicycleserviceprovider;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GD_assignment1_EMFPackage.BIKE__SHAREDBICYCLESERVICEPROVIDER, oldSharedbicycleserviceprovider,
					newSharedbicycleserviceprovider);
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
	public void setSharedbicycleserviceprovider(SharedBicycleServiceProvider newSharedbicycleserviceprovider) {
		if (newSharedbicycleserviceprovider != sharedbicycleserviceprovider) {
			NotificationChain msgs = null;
			if (sharedbicycleserviceprovider != null)
				msgs = ((InternalEObject) sharedbicycleserviceprovider).eInverseRemove(this,
						GD_assignment1_EMFPackage.SHARED_BICYCLE_SERVICE_PROVIDER__BIKE,
						SharedBicycleServiceProvider.class, msgs);
			if (newSharedbicycleserviceprovider != null)
				msgs = ((InternalEObject) newSharedbicycleserviceprovider).eInverseAdd(this,
						GD_assignment1_EMFPackage.SHARED_BICYCLE_SERVICE_PROVIDER__BIKE,
						SharedBicycleServiceProvider.class, msgs);
			msgs = basicSetSharedbicycleserviceprovider(newSharedbicycleserviceprovider, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					GD_assignment1_EMFPackage.BIKE__SHAREDBICYCLESERVICEPROVIDER, newSharedbicycleserviceprovider,
					newSharedbicycleserviceprovider));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GD_assignment1_EMFPackage.BIKE__SHAREDBICYCLESERVICEPROVIDER:
			if (sharedbicycleserviceprovider != null)
				msgs = ((InternalEObject) sharedbicycleserviceprovider).eInverseRemove(this,
						GD_assignment1_EMFPackage.SHARED_BICYCLE_SERVICE_PROVIDER__BIKE,
						SharedBicycleServiceProvider.class, msgs);
			return basicSetSharedbicycleserviceprovider((SharedBicycleServiceProvider) otherEnd, msgs);
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
		case GD_assignment1_EMFPackage.BIKE__ACTIVE_TRANSACTION:
			return basicSetActiveTransaction(null, msgs);
		case GD_assignment1_EMFPackage.BIKE__SHAREDBICYCLESERVICEPROVIDER:
			return basicSetSharedbicycleserviceprovider(null, msgs);
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
		case GD_assignment1_EMFPackage.BIKE__BIKE_ID:
			return getBikeID();
		case GD_assignment1_EMFPackage.BIKE__ACTIVE_TRANSACTION:
			return getActiveTransaction();
		case GD_assignment1_EMFPackage.BIKE__STATUS:
			return getStatus();
		case GD_assignment1_EMFPackage.BIKE__SHAREDBICYCLESERVICEPROVIDER:
			if (resolve)
				return getSharedbicycleserviceprovider();
			return basicGetSharedbicycleserviceprovider();
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
		case GD_assignment1_EMFPackage.BIKE__BIKE_ID:
			setBikeID((String) newValue);
			return;
		case GD_assignment1_EMFPackage.BIKE__ACTIVE_TRANSACTION:
			setActiveTransaction((ActiveTransaction) newValue);
			return;
		case GD_assignment1_EMFPackage.BIKE__STATUS:
			setStatus((StatusOfBike) newValue);
			return;
		case GD_assignment1_EMFPackage.BIKE__SHAREDBICYCLESERVICEPROVIDER:
			setSharedbicycleserviceprovider((SharedBicycleServiceProvider) newValue);
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
		case GD_assignment1_EMFPackage.BIKE__BIKE_ID:
			setBikeID(BIKE_ID_EDEFAULT);
			return;
		case GD_assignment1_EMFPackage.BIKE__ACTIVE_TRANSACTION:
			setActiveTransaction((ActiveTransaction) null);
			return;
		case GD_assignment1_EMFPackage.BIKE__STATUS:
			setStatus(STATUS_EDEFAULT);
			return;
		case GD_assignment1_EMFPackage.BIKE__SHAREDBICYCLESERVICEPROVIDER:
			setSharedbicycleserviceprovider((SharedBicycleServiceProvider) null);
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
		case GD_assignment1_EMFPackage.BIKE__BIKE_ID:
			return BIKE_ID_EDEFAULT == null ? bikeID != null : !BIKE_ID_EDEFAULT.equals(bikeID);
		case GD_assignment1_EMFPackage.BIKE__ACTIVE_TRANSACTION:
			return activeTransaction != null;
		case GD_assignment1_EMFPackage.BIKE__STATUS:
			return status != STATUS_EDEFAULT;
		case GD_assignment1_EMFPackage.BIKE__SHAREDBICYCLESERVICEPROVIDER:
			return sharedbicycleserviceprovider != null;
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
		result.append(" (bikeID: ");
		result.append(bikeID);
		result.append(", status: ");
		result.append(status);
		result.append(')');
		return result.toString();
	}

} //BikeImpl
