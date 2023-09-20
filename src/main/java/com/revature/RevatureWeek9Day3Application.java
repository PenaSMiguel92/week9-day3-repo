package com.revature;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:application2.yml")
public class RevatureWeek9Day3Application {

	public static void main(String[] args) {
		//SpringApplication.run(RevatureWeek9Day3Application.class, args);
		ApplicationContext applicationContext = SpringApplication.run(RevatureWeek9Day3Application.class);
	}

}
