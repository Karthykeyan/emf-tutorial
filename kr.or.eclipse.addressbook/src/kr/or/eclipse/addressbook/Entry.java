/**
 */
package kr.or.eclipse.addressbook;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kr.or.eclipse.addressbook.Entry#getName <em>Name</em>}</li>
 *   <li>{@link kr.or.eclipse.addressbook.Entry#getParent <em>Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @see kr.or.eclipse.addressbook.AddressbookPackage#getEntry()
 * @model
 * @generated
 */
public interface Entry extends EObject {
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
	 * @see kr.or.eclipse.addressbook.AddressbookPackage#getEntry_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link kr.or.eclipse.addressbook.Entry#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link kr.or.eclipse.addressbook.Group#getEntries <em>Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(Group)
	 * @see kr.or.eclipse.addressbook.AddressbookPackage#getEntry_Parent()
	 * @see kr.or.eclipse.addressbook.Group#getEntries
	 * @model opposite="entries" transient="false"
	 * @generated
	 */
	Group getParent();

	/**
	 * Sets the value of the '{@link kr.or.eclipse.addressbook.Entry#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(Group value);

} // Entry
