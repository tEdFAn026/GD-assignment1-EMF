/**
 */
package zf41.CO7207.GD_assignment1_EMF;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Status Of Bike</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see zf41.CO7207.GD_assignment1_EMF.GD_assignment1_EMFPackage#getStatusOfBike()
 * @model
 * @generated
 */
public enum StatusOfBike implements Enumerator {
	/**
	 * The '<em><b>Functionally Intact</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FUNCTIONALLY_INTACT_VALUE
	 * @generated
	 * @ordered
	 */
	FUNCTIONALLY_INTACT(0, "FunctionallyIntact", "FunctionallyIntact"),

	/**
	 * The '<em><b>Need Repair</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NEED_REPAIR_VALUE
	 * @generated
	 * @ordered
	 */
	NEED_REPAIR(1, "NeedRepair", "NeedRepair");

	/**
	 * The '<em><b>Functionally Intact</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Functionally Intact</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FUNCTIONALLY_INTACT
	 * @model name="FunctionallyIntact"
	 * @generated
	 * @ordered
	 */
	public static final int FUNCTIONALLY_INTACT_VALUE = 0;

	/**
	 * The '<em><b>Need Repair</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Need Repair</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NEED_REPAIR
	 * @model name="NeedRepair"
	 * @generated
	 * @ordered
	 */
	public static final int NEED_REPAIR_VALUE = 1;

	/**
	 * An array of all the '<em><b>Status Of Bike</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final StatusOfBike[] VALUES_ARRAY = new StatusOfBike[] { FUNCTIONALLY_INTACT, NEED_REPAIR, };

	/**
	 * A public read-only list of all the '<em><b>Status Of Bike</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<StatusOfBike> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Status Of Bike</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static StatusOfBike get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			StatusOfBike result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Status Of Bike</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static StatusOfBike getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			StatusOfBike result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Status Of Bike</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static StatusOfBike get(int value) {
		switch (value) {
		case FUNCTIONALLY_INTACT_VALUE:
			return FUNCTIONALLY_INTACT;
		case NEED_REPAIR_VALUE:
			return NEED_REPAIR;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private StatusOfBike(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} //StatusOfBike
