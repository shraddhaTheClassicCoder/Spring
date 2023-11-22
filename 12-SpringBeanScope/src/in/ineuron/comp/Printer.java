package in.ineuron.comp;

public class Printer {
	
	private static Printer INSTANCE=null;
	
	static {
		System.out.println("Printer .class file is loading");
	}
	
	private Printer() {
	
	}

	public static Printer getInstance()
	{
		if(INSTANCE==null) {
			INSTANCE =new Printer();
		}
		return INSTANCE;
	}

	@Override
	public String toString() {
		return "Printer [ hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
}
