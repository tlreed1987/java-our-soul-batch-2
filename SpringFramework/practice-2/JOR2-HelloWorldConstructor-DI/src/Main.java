

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.Employee;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		Employee e1=(Employee) context.getBean("mgr");
		System.out.println(e1);
		System.out.println(e1.getAdd());
		
		Employee e2=(Employee) context.getBean("adm");
		System.out.println(e2);
		System.out.println(e2.getAdd());
		e2.getAdd().setCity("Dallas");
		
		System.out.println(e1.getAdd());
		
		
	}

}
