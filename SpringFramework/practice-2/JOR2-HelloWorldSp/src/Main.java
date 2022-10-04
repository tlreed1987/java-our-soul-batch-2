

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.Employee;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		Employee e1=(Employee) context.getBean("mgr");
		System.out.println(e1);
		System.out.println(e1.getAdd());
	
		
		
	}

}
