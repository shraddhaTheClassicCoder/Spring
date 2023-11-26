package in.ineuron.comp;

import java.util.Date;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;

@Component(value = "voter")
@PropertySource(value = { "in/ineuron/commons/application.properties" })
public class Voter {

	@Value("${voter.info.name}")
	private String name;

	@Value("${voter.info.age}")
	private Integer age;

	private Date doj;

	static {
		System.out.println("Voter .class file loading...");
	}

	public Voter() {

		System.out.println("Voter:: Zero param constructor");
	}

	@PostConstruct
	public void myInit() throws IllegalAccessException {

		System.out.println("Voter.myInit()");

		boolean flag = false;

		if (age < 18)
			age = age * -1;

		if (name == null) {
			System.out.println("Name Cannot be null");
			flag = true;
		}

		if (age > 100) {
			System.out.println("Age must not be > 100");
			flag = true;
		}

		if (flag)
			throw new IllegalAccessException("Invalid Inputs...");

	}

	public String checkAgeEligibilty() {

		System.out.println("Voter.checkVotingEligibility()");

		if (age >= 18)
			return "Mr/Miss/Mrs: " + name + " u r eligibile for voting: " + age + " ---> on " + doj;
		else
			return "Mr/Miss/Mrs: " + name + " u r not eligibile for voting: " + age + "---> on " + doj;
	}

	@PreDestroy
	public void myDestroy() {
		System.out.println("Voter.myDestroy()");
		// nullify the bean properties
		name = null;
		age = 0;
		doj = null;
	}

	@Override
	public String toString() {
		return "Voter [name=" + name + ", age=" + age + ", doj=" + doj + "]";
	}

}
