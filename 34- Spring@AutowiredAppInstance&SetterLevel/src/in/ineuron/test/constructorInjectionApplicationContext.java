package in.ineuron.test;

import java.io.IOException;
import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import in.ineuron.comp.FlipKart;

@SuppressWarnings("deprecation")
public class constructorInjectionApplicationContext {

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
		FlipKart flipKrt = context.getBean("fKart", FlipKart.class);
		System.out.println(flipKrt);

		String status = flipKrt.doShopping(new String[] { "fossil", "tissot" }, new float[] { 234.34f, 345.45f });

		System.out.println(status);
		// Closing container
		System.out.println("***********ApplicationContext container closing************");

	}

}
