package in.ineuron.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import in.ineuron.comp.wishMsgGenerator;

@SuppressWarnings("deprecation")
public class ConstructorInjectionXMLBeanFactory {

	public static void main(String[] args) {
		// Activate the container
        FileSystemResource resource=new FileSystemResource("src/in/ineuron/cfg/ApplicationContext.xml");
		
    	System.out.println("***********BeanFactory container starting************");
    	System.out.println();
        XmlBeanFactory factory=new XmlBeanFactory(resource);
    	System.out.println("***********BeanFactory container started************");
    	System.out.println();
        
		// Getting bean from container
    	wishMsgGenerator wmg = factory.getBean("wmg", wishMsgGenerator.class);
         System.out.println(wmg);
         System.out.println("The Hashcode of the WishMsgGenerator::"+wmg.hashCode());
         System.out.println();
		
         // Using the Bean
         String result=wmg.wishMsg("shraddha");
         System.out.println(result);
         System.out.println();
		
         
         
        
         wishMsgGenerator wmg1 = factory.getBean("wmg", wishMsgGenerator.class);
         System.out.println(wmg1);
         System.out.println("The Hashcode of the WishMsgGenerator::"+wmg1.hashCode());
         System.out.println();
		
         // Using the Bean
         String result1=wmg1.wishMsg("sara");
         System.out.println(result1);
         System.out.println();
		
         // Closing container
         System.out.println("***********BeanFactory container closing************");
        
         
	}

}
