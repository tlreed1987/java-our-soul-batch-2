

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.Employee;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		
		Employee e2=(Employee) context.getBean("emp");
		System.out.println(e2);
		System.out.println(e2.getAdd());
		
		
		
	}

}
