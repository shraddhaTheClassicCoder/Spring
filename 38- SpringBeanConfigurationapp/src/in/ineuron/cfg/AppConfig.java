package in.ineuron.cfg;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = { "in.ineuron" })
public class AppConfig {
	
	static {
		System.out.println("AppConfig .class file loading....");
	}

	public AppConfig() {
		System.out.println("AppConfig class is instantiated...");
	}
	
	@Bean("dt1")
	public LocalDateTime createObj1() {
		System.out.println("AppConfig.createObj1()");
		return LocalDateTime.now();
	}
	
	@Bean("dt2")
	@Qualifier("createObj2")
	public LocalDateTime createObj2() {
		System.out.println("AppConfig.createObj2()");
		return LocalDateTime.now();
	}
}


