package com.manish.javadev;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Slice;
import org.springframework.data.domain.Sort.Direction;

import com.manish.javadev.model.Employee;
import com.manish.javadev.service.EmployeeService;

@SpringBootApplication
public class SpringDataPaginationDemo {

	public static void main(String[] args) {

		ConfigurableApplicationContext configurableApplicationContext = SpringApplication
				.run(SpringDataPaginationDemo.class, args);
		ApplicationContext ctx = (ApplicationContext) configurableApplicationContext;
		EmployeeService accountService = ctx.getBean("employeeService", EmployeeService.class);
		createEmployee(accountService);
		findEmployeeByCity(accountService);
	}

	private static void findEmployeeByCity(EmployeeService accountService) {
		for (int i = 0; i < 3; i++) {
			Slice<Employee> empLists = accountService.findEmployeeByCity("BLR",
					PageRequest.of(i, 4, Direction.ASC, "city"));
			empLists.forEach(System.out::println);
			System.out.println(empLists.getSize());
			System.out.println(empLists.getNumber());
		}
	}

	private static void createEmployee(EmployeeService accountService) {
		List<Employee> employeeList = new ArrayList<>();
		Employee employee1 = new Employee("Sreekar", "ELX", "BLR", new Double(2500), 30);
		Employee employee2 = new Employee("Abhishek", "ELX", "BLR", new Double(3500), 20);
		Employee employee3 = new Employee("Vaishali", "Dureja", "BLR", new Double(4500), 17);
		employeeList.add(employee1);
		employeeList.add(employee2);
		employeeList.add(employee3);
		List<Employee> savedEmployeeList = accountService.saveMultipleEmployee(employeeList);
		savedEmployeeList.forEach(System.out::println);
	}

}
