/**
 */
package com.airbus.conanalyser.model.ConnectionAnalyser;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fun IN Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.airbus.conanalyser.model.ConnectionAnalyser.Fun_IN_Port#getName <em>Name</em>}</li>
 *   <li>{@link com.airbus.conanalyser.model.ConnectionAnalyser.Fun_IN_Port#getOper <em>Oper</em>}</li>
 * </ul>
 *
 * @see com.airbus.conanalyser.model.ConnectionAnalyser.ConnectionAnalyserPackage#getFun_IN_Port()
 * @model
 * @generated
 */
public interface Fun_IN_Port extends EObject {
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
	 * @see com.airbus.conanalyser.model.ConnectionAnalyser.ConnectionAnalyserPackage#getFun_IN_Port_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.airbus.conanalyser.model.ConnectionAnalyser.Fun_IN_Port#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Oper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Oper</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Oper</em>' attribute.
	 * @see #setOper(String)
	 * @see com.airbus.conanalyser.model.ConnectionAnalyser.ConnectionAnalyserPackage#getFun_IN_Port_Oper()
	 * @model
	 * @generated
	 */
	String getOper();

	/**
	 * Sets the value of the '{@link com.airbus.conanalyser.model.ConnectionAnalyser.Fun_IN_Port#getOper <em>Oper</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Oper</em>' attribute.
	 * @see #getOper()
	 * @generated
	 */
	void setOper(String value);

} // Fun_IN_Port
