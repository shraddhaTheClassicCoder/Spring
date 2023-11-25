package in.ineuron.test;

import java.io.IOException;
import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ineuron.comp.Employee;

@SuppressWarnings("deprecation")
public class ApplicationContextMainApp {

	public static void main(String[] args) throws IOException {
		// Activate the container
		ApplicationContext context = new ClassPathXmlApplicationContext("in/ineuron/cfg/ApplicationContext.xml");

		System.out.println("***********ApplicationContext container starting************");
		System.out.println("No of Beans:" + context.getBeanDefinitionCount());
		System.out.println("Name of beans" + Arrays.toString(context.getBeanDefinitionNames()));

		System.out.println("***********ApplicationContext container started************");
		System.out.println();

		System.in.read();

		// Getting bean from container
		Employee emp = context.getBean("emp", Employee.class);
		System.out.println(emp);

		
		// Closing container
		System.out.println("***********ApplicationContext container closing************");
		
		((AbstractApplicationContext) context).close();

	}

}
