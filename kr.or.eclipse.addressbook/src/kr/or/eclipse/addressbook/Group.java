/**
 */
package kr.or.eclipse.addressbook;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kr.or.eclipse.addressbook.Group#getEntries <em>Entries</em>}</li>
 * </ul>
 * </p>
 *
 * @see kr.or.eclipse.addressbook.AddressbookPackage#getGroup()
 * @model
 * @generated
 */
public interface Group extends Entry {
	/**
	 * Returns the value of the '<em><b>Entries</b></em>' containment reference list.
	 * The list contents are of type {@link kr.or.eclipse.addressbook.Entry}.
	 * It is bidirectional and its opposite is '{@link kr.or.eclipse.addressbook.Entry#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entries</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entries</em>' containment reference list.
	 * @see kr.or.eclipse.addressbook.AddressbookPackage#getGroup_Entries()
	 * @see kr.or.eclipse.addressbook.Entry#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<Entry> getEntries();

} // Group
