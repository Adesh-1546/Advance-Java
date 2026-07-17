package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdateStudent {

    public static void main(String[] args) {

        String url = "jdbc:postgresql://localhost:5432/testdb";
        String user = "postgres";
        String pass = "password";

        String query = "UPDATE student SET name = ? WHERE id = ?";

        try (Connection con = DriverManager.getConnection(url, user, pass);
             PreparedStatement ps = con.prepareStatement(query)) {

            ps.setString(1, "UpdatedName");
            ps.setInt(2, 20);

            int rows = ps.executeUpdate();
            System.out.println("Updated: " + rows);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

/*
Output:
Updated: 1
*/
