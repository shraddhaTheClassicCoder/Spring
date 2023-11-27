package in.ineuron.test;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ineuron.controller.MyController;
import in.ineuron.vo.CustomerVo;

public class TestClass {

	public static void main(String[] args) throws IOException {

		// Taking the inputs from the user using scanner class

		
		  Scanner scanner = new Scanner(System.in);
		  
		  System.out.println("Enter the Customer Name: "); String customerName =
		  scanner.next();
		  
		  System.out.println("Enter the Customer Address: "); String customerAddress =
		  scanner.next();
		  
		  System.out.println("Enter the paymet: "); String customerPamt =
		  scanner.next();
		  
		  System.out.println("Enter the  rate: "); String customerRate =
		  scanner.next();
		  
		  System.out.println("Enter the  time: "); String customerTime =
		  scanner.next();
		  
		  CustomerVo vo = new CustomerVo(); vo.setCustomerName(customerName);
		  vo.setCustomerAddress(customerAddress); vo.setPamt(customerPamt);
		  vo.setRate(customerRate); vo.setTime(customerTime);
		 

		ClassPathXmlApplicationContext factory = new ClassPathXmlApplicationContext(
				"in\\ineuron\\cfg\\ApplicationContext.xml");
		

		
		System.out.println("********Container Started**********");

		System.out.println("Bean Id are::"+Arrays.toString(factory.getBeanDefinitionNames()));

		System.in.read();
		
		  MyController controller = factory.getBean(MyController.class);
		  
		  try {
		  
		  @SuppressWarnings("unused") String status = controller.processCustomer(vo);
		  
		  
		  System.out.println(status); } catch (Exception e) { e.printStackTrace(); }
		 
		System.out.println("********Container closed**********");
        factory.close();
		//scanner.close();
		
	}

}
