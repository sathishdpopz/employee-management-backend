package com.example.demo;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringBackendApplication.class, args);
	}
    @Autowired
	private EmployeeRepository employeeRepository;
	@Override
	public void run(String... args) throws Exception {
//		Employee employee =new Employee();
//		employee.setFirstName("Sathish");
//		employee.setLastName("Babu");
//		employee.setEmailId("sathishbabu5661@gmail.com");
//		employeeRepository.save(employee);
//
//		Employee employee1 =new Employee();
//		employee1.setFirstName("Sathish");
//		employee1.setLastName("dpopz");
//		employee1.setEmailId("sathishdpopz@gmail.com");
//		employeeRepository.save(employee1);
	}
}
