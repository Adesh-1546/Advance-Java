package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    public static void main(String[] args) {

        //  PostgreSQL credentials
        String url = "jdbc:postgresql://localhost:5432/testdb";
        String username = "postgres";
        String password = "password"; // change accordingly

        Connection connection = null;

        try {
            // Step 1: Load Driver (optional for newer versions)
            Class.forName("org.postgresql.Driver");

            // Step 2: Establish connection
            connection = DriverManager.getConnection(url, username, password);

            // Step 3: Check connection
            if (connection != null) {
                System.out.println("PostgreSQL connected successfully!");
            }

        } catch (ClassNotFoundException e) {
            System.out.println("PostgreSQL Driver not found!");
        } catch (SQLException e) {
            System.out.println("Connection failed!");
            e.printStackTrace();
        } finally {
            // Step 4: Close connection
            try {
                if (connection != null) {
                    connection.close();
                    System.out.println("Connection closed.");
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}

/*
Expected Output:

PostgreSQL connected successfully!
Connection closed.

👉 If error:
Connection failed!
*/
