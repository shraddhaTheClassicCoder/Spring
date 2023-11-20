package in.ineuron.util;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

	public Config() {
		System.out.println("Config Obj is created");
	}

	@Bean
	public EncryptPassword getInc() {
		 EncryptPassword pw=new EncryptPassword("SHA-01");
		 return pw;
	}
}
