package kr.or.eclipse.addressbook.app.test;

import java.io.IOException;
import java.util.HashMap;

import kr.or.eclipse.addressbook.AddressbookPackage;
import kr.or.eclipse.addressbook.Group;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

public class LoadTest {
	public static void main(String[] args) throws IOException {
		ResourceSet set = new ResourceSetImpl();
		set.getPackageRegistry().put(AddressbookPackage.eNS_URI,
				AddressbookPackage.eINSTANCE);

		set.getResourceFactoryRegistry()
				.getExtensionToFactoryMap()
				.put(Resource.Factory.Registry.DEFAULT_EXTENSION,
						new XMIResourceFactoryImpl());

		Resource resource = set.createResource(URI
				.createFileURI("C:/Users/Jeeeyul/Desktop/test.xml"));

		resource.load(new HashMap<Object, Object>());

		Group group = (Group) resource.getContents().get(0);
		System.out.println(group);
	}
}
