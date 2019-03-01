/**
 */
package zf41.CO7207.GD_assignment1_EMF.impl;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import zf41.CO7207.GD_assignment1_EMF.Bike;
import zf41.CO7207.GD_assignment1_EMF.GD_assignment1_EMFPackage;
import zf41.CO7207.GD_assignment1_EMF.StatusOfTransaction;
import zf41.CO7207.GD_assignment1_EMF.Transaction;
import zf41.CO7207.GD_assignment1_EMF.User;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transaction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link zf41.CO7207.GD_assignment1_EMF.impl.TransactionImpl#getPrice <em>Price</em>}</li>
 *   <li>{@link zf41.CO7207.GD_assignment1_EMF.impl.TransactionImpl#getDate <em>Date</em>}</li>
 *   <li>{@link zf41.CO7207.GD_assignment1_EMF.impl.TransactionImpl#getUser <em>User</em>}</li>
 *   <li>{@link zf41.CO7207.GD_assignment1_EMF.impl.TransactionImpl#getBike <em>Bike</em>}</li>
 *   <li>{@link zf41.CO7207.GD_assignment1_EMF.impl.TransactionImpl#getStatus <em>Status</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TransactionImpl extends MinimalEObjectImpl.Container implements Transaction {
	/**
	 * The default value of the '{@link #getPrice() <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrice()
	 * @generated
	 * @ordered
	 */
	protected static final float PRICE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPrice() <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrice()
	 * @generated
	 * @ordered
	 */
	protected float price = PRICE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected Date date = DATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getUser() <em>User</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUser()
	 * @generated
	 * @ordered
	 */
	protected User user;

	/**
	 * The cached value of the '{@link #getBike() <em>Bike</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBike()
	 * @generated
	 * @ordered
	 */
	protected Bike bike;

	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final StatusOfTransaction STATUS_EDEFAULT = StatusOfTransaction.WAITING_FOR_CHECK;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected StatusOfTransaction status = STATUS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransactionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GD_assignment1_EMFPackage.Literals.TRANSACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getPrice() {
		return price;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrice(float newPrice) {
		float oldPrice = price;
		price = newPrice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GD_assignment1_EMFPackage.TRANSACTION__PRICE,
					oldPrice, price));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate(Date newDate) {
		Date oldDate = date;
		date = newDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GD_assignment1_EMFPackage.TRANSACTION__DATE, oldDate,
					date));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User getUser() {
		return user;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUser(User newUser, NotificationChain msgs) {
		User oldUser = user;
		user = newUser;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GD_assignment1_EMFPackage.TRANSACTION__USER, oldUser, newUser);
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
	public void setUser(User newUser) {
		if (newUser != user) {
			NotificationChain msgs = null;
			if (user != null)
				msgs = ((InternalEObject) user).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - GD_assignment1_EMFPackage.TRANSACTION__USER, null, msgs);
			if (newUser != null)
				msgs = ((InternalEObject) newUser).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - GD_assignment1_EMFPackage.TRANSACTION__USER, null, msgs);
			msgs = basicSetUser(newUser, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GD_assignment1_EMFPackage.TRANSACTION__USER, newUser,
					newUser));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bike getBike() {
		return bike;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBike(Bike newBike, NotificationChain msgs) {
		Bike oldBike = bike;
		bike = newBike;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GD_assignment1_EMFPackage.TRANSACTION__BIKE, oldBike, newBike);
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
	public void setBike(Bike newBike) {
		if (newBike != bike) {
			NotificationChain msgs = null;
			if (bike != null)
				msgs = ((InternalEObject) bike).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - GD_assignment1_EMFPackage.TRANSACTION__BIKE, null, msgs);
			if (newBike != null)
				msgs = ((InternalEObject) newBike).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - GD_assignment1_EMFPackage.TRANSACTION__BIKE, null, msgs);
			msgs = basicSetBike(newBike, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GD_assignment1_EMFPackage.TRANSACTION__BIKE, newBike,
					newBike));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatusOfTransaction getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(StatusOfTransaction newStatus) {
		StatusOfTransaction oldStatus = status;
		status = newStatus == null ? STATUS_EDEFAULT : newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GD_assignment1_EMFPackage.TRANSACTION__STATUS,
					oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GD_assignment1_EMFPackage.TRANSACTION__USER:
			return basicSetUser(null, msgs);
		case GD_assignment1_EMFPackage.TRANSACTION__BIKE:
			return basicSetBike(null, msgs);
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
		case GD_assignment1_EMFPackage.TRANSACTION__PRICE:
			return getPrice();
		case GD_assignment1_EMFPackage.TRANSACTION__DATE:
			return getDate();
		case GD_assignment1_EMFPackage.TRANSACTION__USER:
			return getUser();
		case GD_assignment1_EMFPackage.TRANSACTION__BIKE:
			return getBike();
		case GD_assignment1_EMFPackage.TRANSACTION__STATUS:
			return getStatus();
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
		case GD_assignment1_EMFPackage.TRANSACTION__PRICE:
			setPrice((Float) newValue);
			return;
		case GD_assignment1_EMFPackage.TRANSACTION__DATE:
			setDate((Date) newValue);
			return;
		case GD_assignment1_EMFPackage.TRANSACTION__USER:
			setUser((User) newValue);
			return;
		case GD_assignment1_EMFPackage.TRANSACTION__BIKE:
			setBike((Bike) newValue);
			return;
		case GD_assignment1_EMFPackage.TRANSACTION__STATUS:
			setStatus((StatusOfTransaction) newValue);
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
		case GD_assignment1_EMFPackage.TRANSACTION__PRICE:
			setPrice(PRICE_EDEFAULT);
			return;
		case GD_assignment1_EMFPackage.TRANSACTION__DATE:
			setDate(DATE_EDEFAULT);
			return;
		case GD_assignment1_EMFPackage.TRANSACTION__USER:
			setUser((User) null);
			return;
		case GD_assignment1_EMFPackage.TRANSACTION__BIKE:
			setBike((Bike) null);
			return;
		case GD_assignment1_EMFPackage.TRANSACTION__STATUS:
			setStatus(STATUS_EDEFAULT);
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
		case GD_assignment1_EMFPackage.TRANSACTION__PRICE:
			return price != PRICE_EDEFAULT;
		case GD_assignment1_EMFPackage.TRANSACTION__DATE:
			return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals(date);
		case GD_assignment1_EMFPackage.TRANSACTION__USER:
			return user != null;
		case GD_assignment1_EMFPackage.TRANSACTION__BIKE:
			return bike != null;
		case GD_assignment1_EMFPackage.TRANSACTION__STATUS:
			return status != STATUS_EDEFAULT;
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
		result.append(" (price: ");
		result.append(price);
		result.append(", date: ");
		result.append(date);
		result.append(", status: ");
		result.append(status);
		result.append(')');
		return result.toString();
	}

} //TransactionImpl
