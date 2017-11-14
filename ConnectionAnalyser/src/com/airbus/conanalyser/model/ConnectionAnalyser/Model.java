/**
 */
package com.airbus.conanalyser.model.ConnectionAnalyser;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.airbus.conanalyser.model.ConnectionAnalyser.Model#getName <em>Name</em>}</li>
 *   <li>{@link com.airbus.conanalyser.model.ConnectionAnalyser.Model#getPort <em>Port</em>}</li>
 *   <li>{@link com.airbus.conanalyser.model.ConnectionAnalyser.Model#getFun_out_port <em>Fun out port</em>}</li>
 * </ul>
 *
 * @see com.airbus.conanalyser.model.ConnectionAnalyser.ConnectionAnalyserPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject {
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
	 * @see com.airbus.conanalyser.model.ConnectionAnalyser.ConnectionAnalyserPackage#getModel_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.airbus.conanalyser.model.ConnectionAnalyser.Model#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Port</b></em>' containment reference list.
	 * The list contents are of type {@link com.airbus.conanalyser.model.ConnectionAnalyser.Fun_IN_Port}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' containment reference list.
	 * @see com.airbus.conanalyser.model.ConnectionAnalyser.ConnectionAnalyserPackage#getModel_Port()
	 * @model containment="true"
	 * @generated
	 */
	EList<Fun_IN_Port> getPort();

	/**
	 * Returns the value of the '<em><b>Fun out port</b></em>' containment reference list.
	 * The list contents are of type {@link com.airbus.conanalyser.model.ConnectionAnalyser.Fun_OUT_Port}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fun out port</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fun out port</em>' containment reference list.
	 * @see com.airbus.conanalyser.model.ConnectionAnalyser.ConnectionAnalyserPackage#getModel_Fun_out_port()
	 * @model containment="true"
	 * @generated
	 */
	EList<Fun_OUT_Port> getFun_out_port();

} // Model
