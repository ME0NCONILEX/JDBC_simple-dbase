package se.me0nly.work;
import se.me0nly.util.JDBCConnectionException;
import se.me0nly.util.MySqlConnection;
import java.sql.*;

public class AppQTd {
    static final String DB_URL = "jdbc:mysql://localhost:3306/todoit?useTimezone=true&serverTimezone=UTC";
    static final String USER = "root";
    static final String PASS = "P0assword";
    static final String QUERY = "SELECT id, title, description, deadline, done, assignee FROM todo_item";

    public static void main(String[] args) {
        // Open a connection
        try {
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            try {
                Statement stmt = conn.createStatement();
                try {
                    ResultSet rs = stmt.executeQuery(QUERY);
                    try {
                        while (rs.next()) {
                            //Display values
                            System.out.print("Person ID: " + rs.getInt("id") + ", ");
                            System.out.print( "title: " + rs.getString("title") + ", ");
                            System.out.print( "description: " + rs.getString("description") + ", ");
                            System.out.println(" deadline: " + rs.getString("deadline") + ", ");
                            System.out.println(" done: " + rs.getString("done") + ", ");
                            System.out.print(" assignee: " + rs.getInt("assignee") + "\n");

                        }
                    } finally {
                        rs.close();
                    }
                } finally {
                    stmt.close();
                }
            } finally {
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void myex() {

        String query = "select * from person where id = ? and first_name like ? and last_name like ?";

        int todo_itemId = 7;
        try (
                Connection connection = MySqlConnection.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(query);

        ) {

            preparedStatement.setInt(1, todo_itemId);
            preparedStatement.setString(2, "A" + "%");
            preparedStatement.setString(3,"W" + "%");

            try (ResultSet resultSet = preparedStatement.executeQuery();) {

                while (resultSet.next()) {
                    System.out.println(resultSet.getInt("id"));
                    System.out.println(resultSet.getString("title"));
                    System.out.println(resultSet.getString("description"));
                    System.out.println(resultSet.getString("deadline"));
                    System.out.println(resultSet.getString("done"));
                    System.out.println(resultSet.getString("assignee"));
                    System.out.println("-------------");
                }
            }
        } catch (JDBCConnectionException | SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}


