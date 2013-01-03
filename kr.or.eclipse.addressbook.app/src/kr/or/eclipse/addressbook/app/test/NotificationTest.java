package kr.or.eclipse.addressbook.app.test;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;

import kr.or.eclipse.addressbook.AddressbookFactory;
import kr.or.eclipse.addressbook.Person;

public class NotificationTest {
	public static void main(String[] args) {
		Person person = AddressbookFactory.eINSTANCE.createPerson();
		AdapterImpl adapter = new AdapterImpl() {
			@Override
			public void notifyChanged(Notification msg) {
				System.out.println(msg.isTouch());
				System.out.println(msg);
			}
		};
		person.eAdapters().add(adapter);

		person.setName("이클립스");
		person.setWeb("http://eclipse.org");

		person.eAdapters().remove(adapter);
	}
}
