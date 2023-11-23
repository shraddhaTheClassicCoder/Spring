package in.ineuron.test;

import java.io.IOException;
import java.util.Arrays;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ineuron.comp.ContactInfo;

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
		
		ContactInfo info=factory.getBean("contact",ContactInfo.class);
	
		System.out.println(info);
		System.out.println();
		// Closing container
		System.out.println("***********BeanFactory container closing************");

	}

}
