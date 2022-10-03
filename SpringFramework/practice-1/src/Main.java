

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.Employee;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		Employee e1=(Employee) context.getBean("emp");
		System.out.println(e1);
		e1.setId(1);
		e1.setName("Nitin");
		e1.setSalary(2300.00);
		System.out.println(e1);
		Employee e2=(Employee) context.getBean("emp");
		System.out.println(e2);
		e2.setId(2);
		e2.setName("Miyako");
		e2.setSalary(3300.00);
		System.out.println(e2);
		System.out.println(e1);
	}

}
