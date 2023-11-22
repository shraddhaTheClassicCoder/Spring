package in.ineuron.test;

import java.util.Scanner;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import in.ineuron.controller.MyController;
import in.ineuron.vo.CustomerVo;

public class TestClass {

	public static void main(String[] args) {

		// Taking the inputs from the user using scanner class

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the Customer Name: ");
		String customerName = scanner.next();

		System.out.println("Enter the Customer Address: ");
		String customerAddress = scanner.next();

		System.out.println("Enter the paymet: ");
		String customerPamt = scanner.next();

		System.out.println("Enter the  rate: ");
		String customerRate = scanner.next();

		System.out.println("Enter the  time: ");
		String customerTime = scanner.next();

		CustomerVo vo = new CustomerVo();
		vo.setCustomerName(customerName);
		vo.setCustomerAddress(customerAddress);
		vo.setPamt(customerPamt);
		vo.setRate(customerRate);
		vo.setTime(customerTime);

		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();

		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);

		reader.loadBeanDefinitions("in\\ineuron\\cfg\\ApplicationContext.xml");

		System.out.println("********Container Started**********");

		MyController controller = factory.getBean("customerController", MyController.class);

		try {
			@SuppressWarnings("unused")
			String status = controller.processCustomer(vo);
			
			System.out.println(status);
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("********Container closed**********");

		scanner.close();
	}

}
