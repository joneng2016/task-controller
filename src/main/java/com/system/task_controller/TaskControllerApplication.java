package com.system.task_controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = "com.system.task_controller.entities")
@EnableJpaRepositories(basePackages = "com.system.task_controller.repository")
public class TaskControllerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TaskControllerApplication.class, args);
	}

}
