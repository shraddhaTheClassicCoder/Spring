package in.ineuron.comp;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component(value = "wmg")
@Scope(scopeName = "singleton")
public class WishMsgGenerator {

	@Autowired(required = true)
	@Qualifier("dt1")
	private LocalDateTime date;;

	static {
		System.out.println("WishMsgGenerator .class file is loading");
	}

	public WishMsgGenerator() {
		System.out.println("WishMsgGenerator class is instantiated...");
	}

	public String wishMsg(String userName) {

		int hours = date.getHour();

		if (hours < 12) {
			return "Good Morning::" + userName;
		} else if (hours < 16) {
			return "Good Afternoon::" + userName;

		} else if (hours < 20) {
			return "Good Evening::" + userName;

		} else

			return "Good Night" + userName;
	}

	@Override
	public String toString() {
		return "WishMsgGenerator [date=" + date + "]";
	}

}
