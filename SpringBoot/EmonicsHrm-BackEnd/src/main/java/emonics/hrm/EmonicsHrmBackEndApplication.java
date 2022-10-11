package emonics.hrm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("emonics.hrm")
public class EmonicsHrmBackEndApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmonicsHrmBackEndApplication.class, args);
	}

}
