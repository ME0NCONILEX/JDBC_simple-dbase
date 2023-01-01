package se.me0nly.work;

import se.me0nly.util.JDBCConnectionException;
import se.me0nly.util.MySqlConnection;

import java.sql.*;

import static java.sql.DriverManager.getConnection;

public class AppQP {
    static final String DB_URL = "jdbc:mysql://localhost:3306/todoit?useTimezone=true&serverTimezone=UTC";
    static final String USER = "root";
    static final String PASS = "P0assword";
    static final String QUERY = "SELECT id, first_name, last_name, age FROM people";

    public static void main(String[] args) {
        // Open a connection
        try {
            Connection conn = getConnection(DB_URL, USER, PASS);
            try {
                Statement stmt = conn.createStatement();
                try {
                    ResultSet rs = stmt.executeQuery(QUERY);
                    try {
                        while (rs.next()) {
                            //Display values
                            System.out.print("Person ID: " + rs.getInt("id") + ", ");
                            System.out.print( "First name: " + rs.getString("first_name") + ", ");
                            System.out.println(" Last name: " + rs.getString("last_name") + ", ");
                            System.out.print(" Age: " + rs.getInt("age") + "\n");

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

        int personId = 7;
        try (
                Connection connection = MySqlConnection.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(query);

        ) {

            preparedStatement.setInt(1, personId);
            preparedStatement.setString(2, "A" + "%");
            preparedStatement.setString(3,"U" + "%");

            try (ResultSet resultSet = preparedStatement.executeQuery();) {

                while (resultSet.next()) {
                    System.out.println(resultSet.getInt("id"));
                    System.out.println(resultSet.getString("first_name"));
                    System.out.println(resultSet.getString("last_name"));
                    System.out.println("-------------");
                }

            }

        } catch (JDBCConnectionException | SQLException e) {
            System.out.println(e.getMessage());
        }

    }

    }


