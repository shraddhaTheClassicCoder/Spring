package in.ineuron.test;

import java.util.Arrays;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

import in.ineuron.comp.wishMsgGenerator;

@SuppressWarnings("deprecation")
public class SetterInjectionXMLBeanFactory {

	public static void main(String[] args) {
		// Activate the container
       ApplicationContext context=new ClassPathXmlApplicationContext("in/ineuron/cfg/ApplicationContext.xml");
       
    	System.out.println("***********ApplicationContext container starting************");
    	System.out.println("No of Beans:"+context.getBeanDefinitionCount());
    	System.out.println("Name of beans"+Arrays.toString(context.getBeanDefinitionNames()));
       
    	System.out.println("***********ApplicationContext container started************");
    	System.out.println();
        
		// Getting bean from container
    	wishMsgGenerator wmg = context.getBean("wmg", wishMsgGenerator.class);
         System.out.println(wmg);
         System.out.println("The Hashcode of the WishMsgGenerator::"+wmg.hashCode());
         System.out.println();
		
         // Using the Bean
         String result=wmg.wishMsg("shraddha");
         System.out.println(result);
         System.out.println();
		
         
         
        
         wishMsgGenerator wmg1 = context.getBean("wmg", wishMsgGenerator.class);
         System.out.println(wmg1);
         System.out.println("The Hashcode of the WishMsgGenerator::"+wmg1.hashCode());
         System.out.println();
		
         // Using the Bean
         String result1=wmg1.wishMsg("shraddha");
         System.out.println(result1);
         System.out.println();
		
         // Closing container
         System.out.println("***********ApplicationContext container closing************");
        
         
	}

}
