/**
 */
package com.airbus.conanalyser.model.ConnectionAnalyser;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.airbus.conanalyser.model.ConnectionAnalyser.ConnectionAnalyserPackage
 * @generated
 */
public interface ConnectionAnalyserFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ConnectionAnalyserFactory eINSTANCE = com.airbus.conanalyser.model.ConnectionAnalyser.impl.ConnectionAnalyserFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model</em>'.
	 * @generated
	 */
	Model createModel();

	/**
	 * Returns a new object of class '<em>Fun IN Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fun IN Port</em>'.
	 * @generated
	 */
	Fun_IN_Port createFun_IN_Port();

	/**
	 * Returns a new object of class '<em>Fun OUT Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fun OUT Port</em>'.
	 * @generated
	 */
	Fun_OUT_Port createFun_OUT_Port();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ConnectionAnalyserPackage getConnectionAnalyserPackage();

} //ConnectionAnalyserFactory
