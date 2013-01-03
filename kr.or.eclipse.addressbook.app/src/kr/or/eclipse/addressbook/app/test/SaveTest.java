package kr.or.eclipse.addressbook.app.test;

import java.io.IOException;
import java.util.HashMap;

import kr.or.eclipse.addressbook.AddressbookFactory;
import kr.or.eclipse.addressbook.Group;
import kr.or.eclipse.addressbook.Person;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

public class SaveTest {
	public static void main(String[] args) throws IOException {
		Group family = AddressbookFactory.eINSTANCE.createGroup();
		family.setName("가족");

		Person father = AddressbookFactory.eINSTANCE.createPerson();
		father.setName("아빠");
		father.setEmail("father@blahblah.net");
		father.setPhoneNumber("012-3456-7890");

		family.getEntries().add(father);

		ResourceSet set = new ResourceSetImpl();
		set.getResourceFactoryRegistry()
				.getExtensionToFactoryMap()
				.put(Resource.Factory.Registry.DEFAULT_EXTENSION,
						new XMIResourceFactoryImpl());

		XMIResource resource = (XMIResource) set.createResource(URI
				.createFileURI("C:/Users/Jeeeyul/Desktop/test.xml"));
		resource.setEncoding("ms949");

		resource.getContents().add(family);

		resource.save(System.out, new HashMap<Object, Object>());
	}
}
