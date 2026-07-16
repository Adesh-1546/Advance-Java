package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementExample {

    public static void main(String[] args) {

        String url = "jdbc:postgresql://localhost:5432/testdb";
        String username = "postgres";
        String password = "password";

        Connection con = null;
        Statement stmt = null;

        try {
            //  Step 1: Establish connection
            con = DriverManager.getConnection(url, username, password);

            //  Step 2: Create Statement
            stmt = con.createStatement();

            //  Step 3: Execute query (INSERT)
            String query = "INSERT INTO student (id, name) VALUES (1, 'Adesh')";
            int rows = stmt.executeUpdate(query);

            System.out.println("Rows affected: " + rows);

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            //  Step 4: Close resources
            try {
                if (stmt != null) stmt.close();
                if (con != null) con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}

/*
Expected Output:

Rows affected: 1

👉 If table not created:
ERROR: relation "student" does not exist
*/
