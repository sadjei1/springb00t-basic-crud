package com.example.demo;

import com.example.demo.Database.DatabaseTester;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import javax.sql.DataSource;
import java.sql.Connection;

@SpringBootApplication
public class BackendPracticeApplication {

	public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(BackendPracticeApplication.class, args);

        //This piece of code test for the database connection.
        DatabaseTester databaseTester = context.getBean(DatabaseTester.class);
        databaseTester.testConnection();

	}

}
