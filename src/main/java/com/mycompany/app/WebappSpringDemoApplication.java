package com.mycompany.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

@SpringBootApplication(exclude = HibernateJpaAutoConfiguration.class)
public class WebappSpringDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebappSpringDemoApplication.class, args);
	}

}
