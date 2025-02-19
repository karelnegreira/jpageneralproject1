package com.example.jpatest;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JpatestApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpatestApplication.class, args);
	}

	@Bean
	public CommandLineRunner run(EmployeeRepository repository) {
		return (
				args -> {
					insertEmployees(repository);
					System.out.println(repository.findAll());
				}
				);
	}

	private void insertEmployees(EmployeeRepository repository) {
		repository.save(new Employee("Carolina", "Herrera"));
		repository.save(new Employee("Calvin", "Klein"));
		repository.save(new Employee("Paco", "Raban"));
		repository.save(new Employee("Georgio", "Armani"));
	}
}
