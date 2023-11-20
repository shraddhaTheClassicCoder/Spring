package in.ineuron.test;

import java.util.Arrays;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

import in.ineuron.comp.wishMsgGenerator;

@SuppressWarnings("deprecation")
public class ConstructorInjectionApplicationContext {

	public static void main(String[] args) {
		// Activate the container
		ApplicationContext context = new ClassPathXmlApplicationContext("in/ineuron/cfg/ApplicationContext.xml");

		System.out.println("***********ApplicationContext container starting************");
		System.out.println("No of Beans:" + context.getBeanDefinitionCount());
		System.out.println("Name of beans" + Arrays.toString(context.getBeanDefinitionNames()));

		System.out.println("***********ApplicationContext container started************");
		System.out.println();

		// Getting bean from container
		wishMsgGenerator wmg = context.getBean("wmg", wishMsgGenerator.class);
		System.out.println(wmg);
		System.out.println("The Hashcode of the WishMsgGenerator::" + wmg.hashCode());

		// Closing container
		System.out.println("***********ApplicationContext container closing************");

	}

}
