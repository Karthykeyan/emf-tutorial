package kr.or.eclipse.addressbook.app.test;

import kr.or.eclipse.addressbook.AddressbookFactory;
import kr.or.eclipse.addressbook.Group;
import kr.or.eclipse.addressbook.Person;

public class BasicTest {
	public static void main(String[] args) {
		Group family = AddressbookFactory.eINSTANCE.createGroup();
		family.setName("가족");

		Person father = AddressbookFactory.eINSTANCE.createPerson();
		father.setName("아빠");
		father.setEmail("father@blahblah.net");
		father.setPhoneNumber("012-3456-7890");

		family.getEntries().add(father);

		System.out.println(father.getParent().getName());
	}
}
