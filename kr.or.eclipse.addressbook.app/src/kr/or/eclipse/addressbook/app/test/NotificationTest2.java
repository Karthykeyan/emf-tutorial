package kr.or.eclipse.addressbook.app.test;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;

import kr.or.eclipse.addressbook.AddressbookFactory;
import kr.or.eclipse.addressbook.AddressbookPackage;
import kr.or.eclipse.addressbook.Person;

public class NotificationTest2 {
	public static void main(String[] args) {
		Person person = AddressbookFactory.eINSTANCE.createPerson();
		AdapterImpl adapter = new AdapterImpl() {
			@Override
			public void notifyChanged(Notification msg) {
				if (msg.getFeature() == AddressbookPackage.eINSTANCE.getPerson_Web()) {
					System.out.println("웹 주소가 변경되었습니다.");
				}
			}
		};
		person.eAdapters().add(adapter);

		person.setName("이클립스");
		person.setWeb("http://eclipse.org");

		person.eAdapters().remove(adapter);
	}
}
