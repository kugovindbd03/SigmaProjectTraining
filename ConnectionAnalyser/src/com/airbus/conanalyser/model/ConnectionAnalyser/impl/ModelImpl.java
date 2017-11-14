/**
 */
package com.airbus.conanalyser.model.ConnectionAnalyser.impl;

import com.airbus.conanalyser.model.ConnectionAnalyser.ConnectionAnalyserPackage;
import com.airbus.conanalyser.model.ConnectionAnalyser.Fun_IN_Port;
import com.airbus.conanalyser.model.ConnectionAnalyser.Fun_OUT_Port;
import com.airbus.conanalyser.model.ConnectionAnalyser.Model;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.airbus.conanalyser.model.ConnectionAnalyser.impl.ModelImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.airbus.conanalyser.model.ConnectionAnalyser.impl.ModelImpl#getPort <em>Port</em>}</li>
 *   <li>{@link com.airbus.conanalyser.model.ConnectionAnalyser.impl.ModelImpl#getFun_out_port <em>Fun out port</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelImpl extends MinimalEObjectImpl.Container implements Model {
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
	 * The cached value of the '{@link #getPort() <em>Port</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected EList<Fun_IN_Port> port;

	/**
	 * The cached value of the '{@link #getFun_out_port() <em>Fun out port</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFun_out_port()
	 * @generated
	 * @ordered
	 */
	protected EList<Fun_OUT_Port> fun_out_port;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConnectionAnalyserPackage.Literals.MODEL;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ConnectionAnalyserPackage.MODEL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Fun_IN_Port> getPort() {
		if (port == null) {
			port = new EObjectContainmentEList<Fun_IN_Port>(Fun_IN_Port.class, this, ConnectionAnalyserPackage.MODEL__PORT);
		}
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Fun_OUT_Port> getFun_out_port() {
		if (fun_out_port == null) {
			fun_out_port = new EObjectContainmentEList<Fun_OUT_Port>(Fun_OUT_Port.class, this, ConnectionAnalyserPackage.MODEL__FUN_OUT_PORT);
		}
		return fun_out_port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConnectionAnalyserPackage.MODEL__PORT:
				return ((InternalEList<?>)getPort()).basicRemove(otherEnd, msgs);
			case ConnectionAnalyserPackage.MODEL__FUN_OUT_PORT:
				return ((InternalEList<?>)getFun_out_port()).basicRemove(otherEnd, msgs);
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
			case ConnectionAnalyserPackage.MODEL__NAME:
				return getName();
			case ConnectionAnalyserPackage.MODEL__PORT:
				return getPort();
			case ConnectionAnalyserPackage.MODEL__FUN_OUT_PORT:
				return getFun_out_port();
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
			case ConnectionAnalyserPackage.MODEL__NAME:
				setName((String)newValue);
				return;
			case ConnectionAnalyserPackage.MODEL__PORT:
				getPort().clear();
				getPort().addAll((Collection<? extends Fun_IN_Port>)newValue);
				return;
			case ConnectionAnalyserPackage.MODEL__FUN_OUT_PORT:
				getFun_out_port().clear();
				getFun_out_port().addAll((Collection<? extends Fun_OUT_Port>)newValue);
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
			case ConnectionAnalyserPackage.MODEL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ConnectionAnalyserPackage.MODEL__PORT:
				getPort().clear();
				return;
			case ConnectionAnalyserPackage.MODEL__FUN_OUT_PORT:
				getFun_out_port().clear();
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
			case ConnectionAnalyserPackage.MODEL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ConnectionAnalyserPackage.MODEL__PORT:
				return port != null && !port.isEmpty();
			case ConnectionAnalyserPackage.MODEL__FUN_OUT_PORT:
				return fun_out_port != null && !fun_out_port.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //ModelImpl
