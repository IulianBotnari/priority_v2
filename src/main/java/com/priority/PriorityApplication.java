package com.priority;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class PriorityApplication {

	public static void main(String[] args) {
		SpringApplication.run(PriorityApplication.class, args);
	}

}
