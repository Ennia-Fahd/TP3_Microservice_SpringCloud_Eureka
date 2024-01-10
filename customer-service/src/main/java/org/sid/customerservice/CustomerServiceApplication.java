package org.sid.customerservice;

import org.sid.customerservice.repositories.CustomerRepository;
import org.sid.customerservice.entities.Customer;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;


import java.util.List;

@SpringBootApplication
public class CustomerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerServiceApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(CustomerRepository customerRepository, RepositoryRestConfiguration repositoryRestConfiguration){
		return args -> {
			// Expose the id of the entity
			repositoryRestConfiguration.exposeIdsFor(Customer.class);
			customerRepository.saveAll(
					List.of(
							Customer.builder().name("Fahd").email("Fahd@gmail.com").build(),
							Customer.builder().name("Ennia").email("Ennia@gmail.com").build(),
							Customer.builder().name("Ahmed").email("Ahmed@gmail.com").build()
					)
			);
			customerRepository.findAll().forEach(c->{
				System.out.println(c);
			});
		};
	}
}
