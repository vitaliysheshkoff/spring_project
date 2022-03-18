package com.example.demo;

import org.flywaydb.core.Flyway;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.flyway.FlywayMigrationStrategy;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication{

	public static void main(String[] args) {
		//cleanMigrateStrategy();
		SpringApplication.run(DemoApplication.class, args);
		System.out.println("Hello world!");

	}

	/*@Bean
	public static FlywayMigrationStrategy cleanMigrateStrategy() {
		return flyway -> {

			flyway.clean();
			*//*lyway.repair();
			flyway.migrate();*//*
		};
	}*/


}
