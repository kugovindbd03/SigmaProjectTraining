/**
 */
package com.airbus.conanalyser.model.ConnectionAnalyser;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.airbus.conanalyser.model.ConnectionAnalyser.ConnectionAnalyserFactory
 * @model kind="package"
 * @generated
 */
public interface ConnectionAnalyserPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ConnectionAnalyser";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/a";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "a";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ConnectionAnalyserPackage eINSTANCE = com.airbus.conanalyser.model.ConnectionAnalyser.impl.ConnectionAnalyserPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.airbus.conanalyser.model.ConnectionAnalyser.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.airbus.conanalyser.model.ConnectionAnalyser.impl.ModelImpl
	 * @see com.airbus.conanalyser.model.ConnectionAnalyser.impl.ConnectionAnalyserPackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__PORT = 1;

	/**
	 * The feature id for the '<em><b>Fun out port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__FUN_OUT_PORT = 2;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.airbus.conanalyser.model.ConnectionAnalyser.impl.Fun_IN_PortImpl <em>Fun IN Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.airbus.conanalyser.model.ConnectionAnalyser.impl.Fun_IN_PortImpl
	 * @see com.airbus.conanalyser.model.ConnectionAnalyser.impl.ConnectionAnalyserPackageImpl#getFun_IN_Port()
	 * @generated
	 */
	int FUN_IN_PORT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUN_IN_PORT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Oper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUN_IN_PORT__OPER = 1;

	/**
	 * The number of structural features of the '<em>Fun IN Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUN_IN_PORT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Fun IN Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUN_IN_PORT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.airbus.conanalyser.model.ConnectionAnalyser.impl.Fun_OUT_PortImpl <em>Fun OUT Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.airbus.conanalyser.model.ConnectionAnalyser.impl.Fun_OUT_PortImpl
	 * @see com.airbus.conanalyser.model.ConnectionAnalyser.impl.ConnectionAnalyserPackageImpl#getFun_OUT_Port()
	 * @generated
	 */
	int FUN_OUT_PORT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUN_OUT_PORT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUN_OUT_PORT__OPERATOR = 1;

	/**
	 * The number of structural features of the '<em>Fun OUT Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUN_OUT_PORT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Fun OUT Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUN_OUT_PORT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '<em>Serialisation</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Calendar
	 * @see com.airbus.conanalyser.model.ConnectionAnalyser.impl.ConnectionAnalyserPackageImpl#getSerialisation()
	 * @generated
	 */
	int SERIALISATION = 3;


	/**
	 * Returns the meta object for class '{@link com.airbus.conanalyser.model.ConnectionAnalyser.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see com.airbus.conanalyser.model.ConnectionAnalyser.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for the attribute '{@link com.airbus.conanalyser.model.ConnectionAnalyser.Model#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.airbus.conanalyser.model.ConnectionAnalyser.Model#getName()
	 * @see #getModel()
	 * @generated
	 */
	EAttribute getModel_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link com.airbus.conanalyser.model.ConnectionAnalyser.Model#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Port</em>'.
	 * @see com.airbus.conanalyser.model.ConnectionAnalyser.Model#getPort()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Port();

	/**
	 * Returns the meta object for the containment reference list '{@link com.airbus.conanalyser.model.ConnectionAnalyser.Model#getFun_out_port <em>Fun out port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fun out port</em>'.
	 * @see com.airbus.conanalyser.model.ConnectionAnalyser.Model#getFun_out_port()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Fun_out_port();

	/**
	 * Returns the meta object for class '{@link com.airbus.conanalyser.model.ConnectionAnalyser.Fun_IN_Port <em>Fun IN Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fun IN Port</em>'.
	 * @see com.airbus.conanalyser.model.ConnectionAnalyser.Fun_IN_Port
	 * @generated
	 */
	EClass getFun_IN_Port();

	/**
	 * Returns the meta object for the attribute '{@link com.airbus.conanalyser.model.ConnectionAnalyser.Fun_IN_Port#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.airbus.conanalyser.model.ConnectionAnalyser.Fun_IN_Port#getName()
	 * @see #getFun_IN_Port()
	 * @generated
	 */
	EAttribute getFun_IN_Port_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.airbus.conanalyser.model.ConnectionAnalyser.Fun_IN_Port#getOper <em>Oper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Oper</em>'.
	 * @see com.airbus.conanalyser.model.ConnectionAnalyser.Fun_IN_Port#getOper()
	 * @see #getFun_IN_Port()
	 * @generated
	 */
	EAttribute getFun_IN_Port_Oper();

	/**
	 * Returns the meta object for class '{@link com.airbus.conanalyser.model.ConnectionAnalyser.Fun_OUT_Port <em>Fun OUT Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fun OUT Port</em>'.
	 * @see com.airbus.conanalyser.model.ConnectionAnalyser.Fun_OUT_Port
	 * @generated
	 */
	EClass getFun_OUT_Port();

	/**
	 * Returns the meta object for the attribute '{@link com.airbus.conanalyser.model.ConnectionAnalyser.Fun_OUT_Port#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.airbus.conanalyser.model.ConnectionAnalyser.Fun_OUT_Port#getName()
	 * @see #getFun_OUT_Port()
	 * @generated
	 */
	EAttribute getFun_OUT_Port_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.airbus.conanalyser.model.ConnectionAnalyser.Fun_OUT_Port#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see com.airbus.conanalyser.model.ConnectionAnalyser.Fun_OUT_Port#getOperator()
	 * @see #getFun_OUT_Port()
	 * @generated
	 */
	EAttribute getFun_OUT_Port_Operator();

	/**
	 * Returns the meta object for data type '{@link java.util.Calendar <em>Serialisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Serialisation</em>'.
	 * @see java.util.Calendar
	 * @model instanceClass="java.util.Calendar"
	 * @generated
	 */
	EDataType getSerialisation();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ConnectionAnalyserFactory getConnectionAnalyserFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.airbus.conanalyser.model.ConnectionAnalyser.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.airbus.conanalyser.model.ConnectionAnalyser.impl.ModelImpl
		 * @see com.airbus.conanalyser.model.ConnectionAnalyser.impl.ConnectionAnalyserPackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL__NAME = eINSTANCE.getModel_Name();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__PORT = eINSTANCE.getModel_Port();

		/**
		 * The meta object literal for the '<em><b>Fun out port</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__FUN_OUT_PORT = eINSTANCE.getModel_Fun_out_port();

		/**
		 * The meta object literal for the '{@link com.airbus.conanalyser.model.ConnectionAnalyser.impl.Fun_IN_PortImpl <em>Fun IN Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.airbus.conanalyser.model.ConnectionAnalyser.impl.Fun_IN_PortImpl
		 * @see com.airbus.conanalyser.model.ConnectionAnalyser.impl.ConnectionAnalyserPackageImpl#getFun_IN_Port()
		 * @generated
		 */
		EClass FUN_IN_PORT = eINSTANCE.getFun_IN_Port();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUN_IN_PORT__NAME = eINSTANCE.getFun_IN_Port_Name();

		/**
		 * The meta object literal for the '<em><b>Oper</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUN_IN_PORT__OPER = eINSTANCE.getFun_IN_Port_Oper();

		/**
		 * The meta object literal for the '{@link com.airbus.conanalyser.model.ConnectionAnalyser.impl.Fun_OUT_PortImpl <em>Fun OUT Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.airbus.conanalyser.model.ConnectionAnalyser.impl.Fun_OUT_PortImpl
		 * @see com.airbus.conanalyser.model.ConnectionAnalyser.impl.ConnectionAnalyserPackageImpl#getFun_OUT_Port()
		 * @generated
		 */
		EClass FUN_OUT_PORT = eINSTANCE.getFun_OUT_Port();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUN_OUT_PORT__NAME = eINSTANCE.getFun_OUT_Port_Name();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUN_OUT_PORT__OPERATOR = eINSTANCE.getFun_OUT_Port_Operator();

		/**
		 * The meta object literal for the '<em>Serialisation</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.Calendar
		 * @see com.airbus.conanalyser.model.ConnectionAnalyser.impl.ConnectionAnalyserPackageImpl#getSerialisation()
		 * @generated
		 */
		EDataType SERIALISATION = eINSTANCE.getSerialisation();

	}

} //ConnectionAnalyserPackage
