package in.ineuron.test;

import java.io.IOException;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import in.ineuron.comp.Student;

@SuppressWarnings("deprecation")
public class ConstructorInjectionXMLBeanFactory {

	public static void main(String[] args) throws IOException {
		/*
		 * // Activate the container FileSystemResource resource = new
		 * FileSystemResource("src\\in\\ineuron\\cfg\\ApplicationContext.xml");
		 * 
		 * System.out.println("***********BeanFactory container starting************");
		 * 
		 * XmlBeanFactory factory = new XmlBeanFactory(resource);
		 * System.out.println("***********BeanFactory container started************");
		 * System.out.println();
		 * System.out.println("Constructor Injection using type::");
		 * 
		 * // Getting bean from container Student std1 = factory.getBean("std1",
		 * Student.class); System.out.println(std1); System.out.println();
		 * 
		 * System.out.println("Constructor Injection using name::"); Student std2 =
		 * factory.getBean("std2", Student.class); System.out.println(std2);
		 * System.out.println();
		 * 
		 * System.out.println("Constructor Injection using index::"); Student std3 =
		 * factory.getBean("std3", Student.class); System.out.println(std3);
		 * System.out.println();
		 * 
		 * // Closing container
		 * System.out.println("***********BeanFactory container closing************");
		 */
		
		DefaultListableBeanFactory factory1=null;
		XmlBeanDefinitionReader reader=null;
		
		
		factory1= new DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(factory1);
		
		reader.loadBeanDefinitions("in\\ineuron\\cfg\\ApplicationContext.xml");
		
		System.out.println("COntainer started...");
		System.in.read();
		
		Student student1=factory1.getBean("std2",Student.class);
		System.out.println(student1);
		System.out.println();
		System.out.println("Container Closed...");
		
		
	}

}
