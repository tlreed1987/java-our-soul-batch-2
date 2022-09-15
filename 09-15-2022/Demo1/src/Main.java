import static com.example.PowerStatus.OFF;
import static com.example.PowerStatus.ON;
import static com.example.PowerStatus.SLEEP;

import java.time.LocalDate;
import java.time.Year;
import java.util.ArrayList;
import java.util.List;

import com.example.Employee;

public class Main {

	public static void main(String... args) {
//				Computer c=new Computer();
//				c.setStatus(OFF);
//			//	System.out.println(c.getStatus().ordinal());
//				System.out.println(c.getStatus());
//				System.out.println(c.getStatus().getDesc());
//				c.setStatus(ON);
//				System.out.println(c.getStatus().name()); // default
//				System.out.println(c.getStatus().getDesc());
//				c.setStatus(SLEEP);
//				System.out.println(c.getStatus());
//				System.out.println(c.getStatus().getDesc());
		List<Employee> empList=new ArrayList<>();
		empList.add(new Employee.Builder()
				.id(101)
				.name("Nitin")
				.build());
		
		empList.add(new Employee.Builder()
				.name("Alex")
				.id(102)
				.build());
		
		empList.add(new Employee.Builder()
				.id(103)
				
				.build());
		
		empList.forEach(e->System.out.println(e));
		
		LocalDate dob=LocalDate.of(1998, 12, 4);
		System.out.println(dob);
		
		LocalDate dob1=Year.of(1989).atMonth(4).atDay(23); // fluent approach
		System.out.println(dob1);
	}
}
