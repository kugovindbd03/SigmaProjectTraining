/**
 */
package com.airbus.conanalyser.model.ConnectionAnalyser.impl;

import com.airbus.conanalyser.model.ConnectionAnalyser.ConnectionAnalyserPackage;
import com.airbus.conanalyser.model.ConnectionAnalyser.Fun_IN_Port;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fun IN Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.airbus.conanalyser.model.ConnectionAnalyser.impl.Fun_IN_PortImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.airbus.conanalyser.model.ConnectionAnalyser.impl.Fun_IN_PortImpl#getOper <em>Oper</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Fun_IN_PortImpl extends MinimalEObjectImpl.Container implements Fun_IN_Port {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getOper() <em>Oper</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOper()
	 * @generated
	 * @ordered
	 */
	protected static final String OPER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOper() <em>Oper</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOper()
	 * @generated
	 * @ordered
	 */
	protected String oper = OPER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Fun_IN_PortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConnectionAnalyserPackage.Literals.FUN_IN_PORT;
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
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConnectionAnalyserPackage.FUN_IN_PORT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOper() {
		return oper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOper(String newOper) {
		String oldOper = oper;
		oper = newOper;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConnectionAnalyserPackage.FUN_IN_PORT__OPER, oldOper, oper));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConnectionAnalyserPackage.FUN_IN_PORT__NAME:
				return getName();
			case ConnectionAnalyserPackage.FUN_IN_PORT__OPER:
				return getOper();
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
			case ConnectionAnalyserPackage.FUN_IN_PORT__NAME:
				setName((String)newValue);
				return;
			case ConnectionAnalyserPackage.FUN_IN_PORT__OPER:
				setOper((String)newValue);
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
			case ConnectionAnalyserPackage.FUN_IN_PORT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ConnectionAnalyserPackage.FUN_IN_PORT__OPER:
				setOper(OPER_EDEFAULT);
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
			case ConnectionAnalyserPackage.FUN_IN_PORT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ConnectionAnalyserPackage.FUN_IN_PORT__OPER:
				return OPER_EDEFAULT == null ? oper != null : !OPER_EDEFAULT.equals(oper);
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
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", oper: ");
		result.append(oper);
		result.append(')');
		return result.toString();
	}

} //Fun_IN_PortImpl
