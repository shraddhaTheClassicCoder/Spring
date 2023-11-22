package in.ineuron.test;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import in.ineuron.comp.wishMsgGenerator;

@SuppressWarnings("deprecation")
public class SetterInjectionApplicationContext {

	public static void main(String[] args) throws IOException {
		// Activate the container
        ClassPathXmlApplicationContext factory=new ClassPathXmlApplicationContext("in\\ineuron\\cfg\\ApplicationContext.xml");
		
    	System.out.println("***********BeanFactory container starting************");
    	System.out.println();
     
    	
    	System.out.println("***********BeanFactory container started************");
    	System.out.println();
        
    	//System.in.read();
		// Getting bean from container
    	wishMsgGenerator wmg1 = factory.getBean("wmg1", wishMsgGenerator.class);
         System.out.println(wmg1);
         System.out.println("The Hashcode of the WishMsgGenerator::"+wmg1.hashCode());
         System.out.println();
		
         // Using the Bean
         String result=wmg1.wishMsg("shraddha");
         System.out.println(result);
         System.out.println();
		
   
         wishMsgGenerator wmg2 = factory.getBean("wmg2", wishMsgGenerator.class);
         System.out.println(wmg2);
         System.out.println("The Hashcode of the WishMsgGenerator::"+wmg2.hashCode());
         System.out.println();
		
         // Using the Bean
         String result1=wmg2.wishMsg("pratik");
         System.out.println(result1);
         System.out.println();
		
   
         
         // Closing container
         System.out.println("***********BeanFactory container closing************");
        
         
	}

}
