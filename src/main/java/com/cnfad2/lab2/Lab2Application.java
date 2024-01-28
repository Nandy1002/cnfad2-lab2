package com.cnfad2.lab2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Lab2Application {

	public static void main(String[] args) {
		SpringApplication.run(Lab2Application.class, args);
		
		ApplicationContext aContext = new ClassPathXmlApplicationContext("config.xml");
		
		College clg = (College) aContext.getBean("college");
		Department dept = (Department) aContext.getBean("department");
		
		System.out.println(clg.getName());
	}

}
