package jor.empapp.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import jor.empapp.model.Employee;

@Aspect
@Component
public class EmplpoyeeServiceAspect {
	
	
			@Before(value="execution(* jor.empapp.service.EmployeeServiceImpl.*(..))")
	        public void beforeAdvice(JoinPoint jp) {
					System.out.println(jp.getSignature());
			}
			
			@After(value="execution(* jor.empapp.service.EmployeeServiceImpl.*(..))")
	        public void afterAdvice(JoinPoint jp) {
					System.out.println(jp.getSignature());
			}
			
			@Around(value = "execution(* jor.empapp.service.EmployeeServiceImpl.addEmployee(..))")
			 public void around(ProceedingJoinPoint jp) {
				long intime=System.currentTimeMillis();
				Object[] obj=jp.getArgs();
				Employee e1=(Employee) obj[0];
				e1.setName(e1.getName().toUpperCase());
			
				System.out.println("Arg:"+obj[0]);
					try {
					jp.proceed();
				} catch (Throwable e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				long outtime=System.currentTimeMillis();
				long duration=outtime-intime;
				System.out.println(duration);
			}	

}
