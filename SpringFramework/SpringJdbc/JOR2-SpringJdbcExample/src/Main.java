import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.model.Employee;
import com.example.model.EmployeeDao;

public class Main {

	public static void main(String[] args) {
	ApplicationContext ctx=new ClassPathXmlApplicationContext("jdbcConfig.xml");
		
		EmployeeDao dao=(EmployeeDao)ctx.getBean("dao");
		Employee e=new Employee();
		e.setId(10);
		e.setDeptId(101);
		e.setName("Aileen");
		e.setSalary(2133.56);
	    int status=dao.register(e);
		System.out.println(status);

	}

}
