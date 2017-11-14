/**
 */
package com.airbus.conanalyser.model.ConnectionAnalyser;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fun OUT Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.airbus.conanalyser.model.ConnectionAnalyser.Fun_OUT_Port#getName <em>Name</em>}</li>
 *   <li>{@link com.airbus.conanalyser.model.ConnectionAnalyser.Fun_OUT_Port#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @see com.airbus.conanalyser.model.ConnectionAnalyser.ConnectionAnalyserPackage#getFun_OUT_Port()
 * @model
 * @generated
 */
public interface Fun_OUT_Port extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.airbus.conanalyser.model.ConnectionAnalyser.ConnectionAnalyserPackage#getFun_OUT_Port_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.airbus.conanalyser.model.ConnectionAnalyser.Fun_OUT_Port#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see #setOperator(String)
	 * @see com.airbus.conanalyser.model.ConnectionAnalyser.ConnectionAnalyserPackage#getFun_OUT_Port_Operator()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getOperator();

	/**
	 * Sets the value of the '{@link com.airbus.conanalyser.model.ConnectionAnalyser.Fun_OUT_Port#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(String value);

} // Fun_OUT_Port
