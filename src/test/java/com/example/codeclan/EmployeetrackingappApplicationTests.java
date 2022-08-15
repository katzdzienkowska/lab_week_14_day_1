package com.example.codeclan;

import com.example.codeclan.models.Employee;
import com.example.codeclan.repositories.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmployeetrackingappApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createEmployee1() {
		Employee employee1 = new Employee("Kat", 34, 123456, "kat@gmail.com");
		employeeRepository.save(employee1);
	}

	@Test
	public void createEmployee2() {
		Employee employee2 = new Employee("Oskar", 2, 654321, "oskar@gmail.com");
		employeeRepository.save(employee2);
	}

}
