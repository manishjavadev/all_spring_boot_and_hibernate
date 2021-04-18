package com.manish.javadev;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.manish.javadev.model.Employee;
import com.manish.javadev.service.EmployeeService;

@SpringBootApplication
public class SpringDataQueryMethodDemo {

	public static void main(String[] args) {

		ConfigurableApplicationContext configurableApplicationContext = SpringApplication
				.run(SpringDataQueryMethodDemo.class, args);
		ApplicationContext ctx = (ApplicationContext) configurableApplicationContext;
		EmployeeService accountService = ctx.getBean("employeeService", EmployeeService.class);
		// createEmployee(accountService);

		System.out.println("Select Employee Lastname");
		findEmployeeByLastname(accountService, "ELX");

		System.out.println("Select Employee Lastname And Age");
		findEmployeeByLastnameAndAge(accountService, "ELX", 20);

	}

	private static void findEmployeeByLastnameAndAge(EmployeeService accountService, String lastname, int age) {
		/*
		 * List<Employee> employeeList = accountService.findByLastnameAndAge(lastname,
		 * age); employeeList.forEach(System.out::println);
		 */

	}

	private static void createEmployee(EmployeeService accountService) {
		List<Employee> employeeList = new ArrayList<>();
		Employee employee1 = new Employee("Sreekar", "ELX", "BLR", new Double(2500), 30);
		Employee employee2 = new Employee("Abhishek", "ELX", "BLR", new Double(3500), 20);
		Employee employee3 = new Employee("Vaishali", "Dureja", "BLR", new Double(4500), 17);
		employeeList.add(employee1);
		employeeList.add(employee2);
		employeeList.add(employee3);
		// List<Employee> savedEmployeeList =
		// accountService.saveMultipleEmployee(employeeList);
		// savedEmployeeList.forEach(System.out::println);

	}

	private static void findEmployeeByLastname(EmployeeService accountService, String lastname) {
		accountService.updateEmployeeByEmployeeId(17, new Long(3));

	}

}
