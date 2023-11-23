package in.ineuron.test;

import java.io.IOException;
import java.util.Arrays;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ineuron.comp.MarksInfo;

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

		
		MarksInfo info=factory.getBean("marks",MarksInfo.class);
	
		System.out.println(info);
		// Closing container
		System.out.println("***********BeanFactory container closing************");

	}

}
