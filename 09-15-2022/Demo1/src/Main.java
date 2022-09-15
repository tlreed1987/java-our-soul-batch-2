import static com.example.PowerStatus.OFF;
import static com.example.PowerStatus.ON;
import static com.example.PowerStatus.SLEEP;

public class Main {

	public static void main(String... args) {
				Computer c=new Computer();
				c.setStatus(OFF);
			//	System.out.println(c.getStatus().ordinal());
				System.out.println(c.getStatus());
				System.out.println(c.getStatus().getDesc());
				c.setStatus(ON);
				System.out.println(c.getStatus().name()); // default
				System.out.println(c.getStatus().getDesc());
				c.setStatus(SLEEP);
				System.out.println(c.getStatus());
				System.out.println(c.getStatus().getDesc());
				
				
	}
}
