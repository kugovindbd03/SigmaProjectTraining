/**
 */
package com.airbus.conanalyser.model.ConnectionAnalyser.impl;

import com.airbus.conanalyser.model.ConnectionAnalyser.*;
import java.util.Calendar;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConnectionAnalyserFactoryImpl extends EFactoryImpl implements ConnectionAnalyserFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ConnectionAnalyserFactory init() {
		try {
			ConnectionAnalyserFactory theConnectionAnalyserFactory = (ConnectionAnalyserFactory)EPackage.Registry.INSTANCE.getEFactory(ConnectionAnalyserPackage.eNS_URI);
			if (theConnectionAnalyserFactory != null) {
				return theConnectionAnalyserFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ConnectionAnalyserFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionAnalyserFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ConnectionAnalyserPackage.MODEL: return createModel();
			case ConnectionAnalyserPackage.FUN_IN_PORT: return createFun_IN_Port();
			case ConnectionAnalyserPackage.FUN_OUT_PORT: return createFun_OUT_Port();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ConnectionAnalyserPackage.SERIALISATION:
				return createSerialisationFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ConnectionAnalyserPackage.SERIALISATION:
				return convertSerialisationToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model createModel() {
		ModelImpl model = new ModelImpl();
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fun_IN_Port createFun_IN_Port() {
		Fun_IN_PortImpl fun_IN_Port = new Fun_IN_PortImpl();
		return fun_IN_Port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fun_OUT_Port createFun_OUT_Port() {
		Fun_OUT_PortImpl fun_OUT_Port = new Fun_OUT_PortImpl();
		return fun_OUT_Port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Calendar createSerialisationFromString(EDataType eDataType, String initialValue) {
		return (Calendar)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSerialisationToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionAnalyserPackage getConnectionAnalyserPackage() {
		return (ConnectionAnalyserPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ConnectionAnalyserPackage getPackage() {
		return ConnectionAnalyserPackage.eINSTANCE;
	}

} //ConnectionAnalyserFactoryImpl
