/**
 */
package base;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link base.BaseClass#getBalance <em>Balance</em>}</li>
 * </ul>
 *
 * @see base.BasePackage#getBaseClass()
 * @model
 * @generated
 */
public interface BaseClass extends EObject {
	/**
	 * Returns the value of the '<em><b>Balance</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Balance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Balance</em>' attribute.
	 * @see #setBalance(String)
	 * @see base.BasePackage#getBaseClass_Balance()
	 * @model default=""
	 * @generated
	 */
	String getBalance();

	/**
	 * Sets the value of the '{@link base.BaseClass#getBalance <em>Balance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Balance</em>' attribute.
	 * @see #getBalance()
	 * @generated
	 */
	void setBalance(String value);

} // BaseClass
