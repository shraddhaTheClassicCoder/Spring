package in.ineuron.test;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ineuron.comp.Printer;

@SuppressWarnings("deprecation")
public class SetterInjectionApplicationContext {

	public static void main(String[] args) throws IOException {
		// Activate the container
		ClassPathXmlApplicationContext factory = new ClassPathXmlApplicationContext(
				"in\\ineuron\\cfg\\ApplicationContext.xml");

		System.out.println("***********BeanFactory container starting************");
		System.out.println();

		System.out.println("***********BeanFactory container started************");
		System.out.println();

	    System.in.read();
		// Getting bean from container
		Printer p1 = factory.getBean("printer", Printer.class);

		System.out.println("The Hashcode of the WishMsgGenerator::" + p1.hashCode());
		System.out.println(p1);

		
		Printer p2= factory.getBean("printer", Printer.class);

		System.out.println("The Hashcode of the WishMsgGenerator::" + p2.hashCode());
		System.out.println(p2);

		
		// Closing container
		System.out.println("***********BeanFactory container closing************");

	}

}
