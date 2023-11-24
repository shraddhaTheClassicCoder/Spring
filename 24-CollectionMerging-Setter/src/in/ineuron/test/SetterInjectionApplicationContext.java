package in.ineuron.test;

import java.io.IOException;
import java.util.Arrays;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ineuron.comp.EngCourses;

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
		System.out.println("Bean Id::" + Arrays.toString(factory.getBeanDefinitionNames()));
		System.out.println();

		EngCourses course = factory.getBean("CS", EngCourses.class);
		System.out.println(course);
		System.out.println();

		// Closing container
		System.out.println("***********BeanFactory container closing************");

	}

}
