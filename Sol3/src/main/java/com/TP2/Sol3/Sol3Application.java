package com.TP2.Sol3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Sol3Application {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);

		EmployeeManager employeeManager=context.getBean(EmployeeManager.class);

		Employee employee=new Employee("yassine","Software eng");
		employeeManager.notifyEmployee(employee,"tech lead","sms");
		employeeManager.notifyEmployee(employee,"PO","email");
		context.close();
	}

}
