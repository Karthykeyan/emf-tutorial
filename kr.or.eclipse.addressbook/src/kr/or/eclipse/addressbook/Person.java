/**
 */
package kr.or.eclipse.addressbook;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kr.or.eclipse.addressbook.Person#getEmail <em>Email</em>}</li>
 *   <li>{@link kr.or.eclipse.addressbook.Person#getWeb <em>Web</em>}</li>
 *   <li>{@link kr.or.eclipse.addressbook.Person#getPhoneNumber <em>Phone Number</em>}</li>
 * </ul>
 * </p>
 *
 * @see kr.or.eclipse.addressbook.AddressbookPackage#getPerson()
 * @model
 * @generated
 */
public interface Person extends Entry {
	/**
	 * Returns the value of the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Email</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email</em>' attribute.
	 * @see #setEmail(String)
	 * @see kr.or.eclipse.addressbook.AddressbookPackage#getPerson_Email()
	 * @model
	 * @generated
	 */
	String getEmail();

	/**
	 * Sets the value of the '{@link kr.or.eclipse.addressbook.Person#getEmail <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email</em>' attribute.
	 * @see #getEmail()
	 * @generated
	 */
	void setEmail(String value);

	/**
	 * Returns the value of the '<em><b>Web</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Web</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Web</em>' attribute.
	 * @see #setWeb(String)
	 * @see kr.or.eclipse.addressbook.AddressbookPackage#getPerson_Web()
	 * @model
	 * @generated
	 */
	String getWeb();

	/**
	 * Sets the value of the '{@link kr.or.eclipse.addressbook.Person#getWeb <em>Web</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Web</em>' attribute.
	 * @see #getWeb()
	 * @generated
	 */
	void setWeb(String value);

	/**
	 * Returns the value of the '<em><b>Phone Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phone Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phone Number</em>' attribute.
	 * @see #setPhoneNumber(String)
	 * @see kr.or.eclipse.addressbook.AddressbookPackage#getPerson_PhoneNumber()
	 * @model
	 * @generated
	 */
	String getPhoneNumber();

	/**
	 * Sets the value of the '{@link kr.or.eclipse.addressbook.Person#getPhoneNumber <em>Phone Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phone Number</em>' attribute.
	 * @see #getPhoneNumber()
	 * @generated
	 */
	void setPhoneNumber(String value);

} // Person
