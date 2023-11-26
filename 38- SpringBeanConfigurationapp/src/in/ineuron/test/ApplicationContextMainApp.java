package in.ineuron.test;

import java.io.IOException;
import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.ineuron.cfg.AppConfig;
import in.ineuron.comp.WishMsgGenerator;

@SuppressWarnings("deprecation")
public class ApplicationContextMainApp {

	public static void main(String[] args) throws IOException {
		// Activate the container
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		System.out.println("***********ApplicationContext container starting************");
		System.out.println("No of Beans:" + context.getBeanDefinitionCount());
		System.out.println("Name of beans" + Arrays.toString(context.getBeanDefinitionNames()));

		System.out.println("***********ApplicationContext container started************");
		System.out.println();

		System.in.read();

		// Getting bean from container

		WishMsgGenerator wmg = context.getBean(WishMsgGenerator.class);
		String msg = wmg.wishMsg("shraddha");
		System.out.println(msg);

		// Closing container
		System.out.println("***********ApplicationContext container closing************");

	}

}
