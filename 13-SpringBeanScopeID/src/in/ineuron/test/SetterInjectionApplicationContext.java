package in.ineuron.test;

import java.io.IOException;
import java.util.Arrays;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ineuron.comp.Student;

@SuppressWarnings("deprecation")
public class SetterInjectionApplicationContext {

	public static void main(String[] args) throws IOException {
		// Activate the container
		ClassPathXmlApplicationContext factory = new ClassPathXmlApplicationContext(
				"in\\ineuron\\cfg\\ApplicationContext.xml");

		System.out.println("***********BeanFactory container starting************");
		System.out.println();

		System.out.println("***********BeanFactory container started************");
		System.out.println("Bean Id::" + Arrays.toString(factory.getBeanDefinitionNames()));

		System.in.read();
		// Getting bean from container
		Student s1 = factory.getBean("in.ineuron.comp.Student#0", Student.class);

		System.out.println("The Hashcode of the WishMsgGenerator::" + s1.hashCode());
		System.out.println(s1);

		System.out.println();

		Student s2 = factory.getBean("in.ineuron.comp.Student#1", Student.class);

		System.out.println("The Hashcode of the WishMsgGenerator::" + s2.hashCode());
		System.out.println(s2);

		// Closing container
		System.out.println("***********BeanFactory container closing************");

	}

}
