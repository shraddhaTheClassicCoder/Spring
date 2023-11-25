package in.ineuron.comp;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@PropertySource(value = { "in/ineuron/commons/application.properties" })
public class FlipKart {

	// Below is Autowired using field injection
	@Autowired
	@Qualifier("dtdc")
	private Courier courier;

	@Value("${flipkart.info.discount}")
	private Float discount;

	int Random = 0;

	static {
		System.out.println("FlipKart .class file is loading...");
	}

	public FlipKart() {
		System.out.println("Zero Param Constructor::");
	}

	// business logic

	public String doShopping(String[] items, float[] prices) {

		System.out.println("FlipKart.doShopping()");
		System.out.println("Implementation class is:" + courier.getClass().getName());

		float billamt = 0;

		java.util.Random random = null;

		for (float price : prices) {
			billamt += price;

		}

		billamt = billamt - (discount / 100.0f);
		random = new java.util.Random();
		int oid = random.nextInt(1000);
		String msg = courier.deliver(oid);

		return Arrays.toString(items) + " are purchased with prices" + Arrays.toString(prices) + "with BillAmount::"
				+ billamt + "=====>" + msg;
	}

	@Override
	public String toString() {
		return "FlipKart [courier=" + courier + "]";
	}

}
