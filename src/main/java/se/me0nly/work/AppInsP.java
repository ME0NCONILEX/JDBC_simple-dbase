package se.me0nly.work;
import se.me0nly.model.Role;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class AppInsP {
    static final String DB_URL = "jdbc:mysql://localhost:3306/todoit?useTimezone=true&serverTimezone=UTC";
    static final String USER = "root";
    static final String PASS = "P0assword";

    public AppInsP(String username, String pwd, Role roleUser) {

    }

    public static void main(String[] args) {
        // Open a connection
        try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stmt = conn.createStatement();
        ) {
            // Execute a query
            System.out.println("Inserting records into the table 'people' ");
            String sql = "INSERT INTO people VALUES (1, 'Johan', 'Big name', 49)";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO people VALUES (2, 'Ulf', 'Little name', 41)";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO people VALUES (3, 'Helen', 'Strid', 35)";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO people VALUES(4, 'Maria', 'Sally', 28)";
            stmt.executeUpdate(sql);
            System.out.println("Inserted records into the table...");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
