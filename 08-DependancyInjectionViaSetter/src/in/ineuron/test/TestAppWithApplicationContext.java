package in.ineuron.test;

import java.io.IOException;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ineuron.comp.FlipKart;

public class TestAppWithApplicationContext {

	public static void main(String[] args) throws IOException {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"in\\ineuron\\cfg\\ApplicationContext.xml");

		System.out.println("*****Container Started*****");

		System.in.read();

		FlipKart kart = context.getBean("flipkart", FlipKart.class);
		System.out.println(kart);

		String status = kart.doShopping(new String[] { "fossil", "tissot" }, new float[] { 234.34f, 345.45f });

		System.out.println(status);

		System.out.println("*****Container Stopped*****");
	}

}