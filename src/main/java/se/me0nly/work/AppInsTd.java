package se.me0nly.work;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class AppInsTd {
    static final String DB_URL = "jdbc:mysql://localhost:3306/todoit?useTimezone=true&serverTimezone=UTC";
    static final String USER = "root";
    static final String PASS = "P0assword";

    public static void main(String[] args) {
        // Open a connection
        try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stmt = conn.createStatement();
        ) {
            // Execute a query
            System.out.println("Inserting records into the table 'todo_item' ");
            String sql = "INSERT INTO todo_item VALUES (1, 'Work ex1', 'Please describe Work ex1', '2023-01-01', '0', '1')";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO todo_item VALUES (2, 'Work ex2', 'Please describe Work ex2', '2023-01-02', '0', '1')";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO todo_item VALUES (3, 'Work ex3', 'Please describe Work ex3', '2023-01-03', '0', '1')";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO todo_item VALUES (4, 'Work ex4', 'Please describe Work ex4', '2023-01-03', '0', '1')";
            stmt.executeUpdate(sql);
            System.out.println("Inserted records into the table 'todo_item' ");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
