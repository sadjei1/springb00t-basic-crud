package com.example.demo.Database;

import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.Connection;

@Component
public class DatabaseTester {

    private final DataSource dataSource;

    public DatabaseTester(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void testConnection() {
        try (Connection connection = dataSource.getConnection()) {
            if (connection.isValid(2)) {
                System.out.println("✅ Successfully connected to the database!");
            } else {
                System.out.println("❌ Connection is not valid!");
            }
        } catch (Exception e) {
            System.err.println("❌ Failed to connect to the database: " + e.getMessage());
        }
    }

}
