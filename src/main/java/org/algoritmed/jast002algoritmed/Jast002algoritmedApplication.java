package org.algoritmed.jast002algoritmed;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:config-app-spring.xml")
public class Jast002algoritmedApplication {

	public static void main(String[] args) {
		SpringApplication.run(Jast002algoritmedApplication.class, args);
	}

}
