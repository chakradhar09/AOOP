package TeacherDataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TeacherDatabase {
    private static Connection connection = null;
    private String query;
    private static PreparedStatement preparedStatement;

    public TeacherDatabase(String url, String user, String password) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");

            connection = DriverManager.getConnection(url, user, password);

            query = "CREATE TABLE IF NOT EXISTS teacherInformation(" +
                    "id INTEGER PRIMARY KEY," +
                    "name VARCHAR(100)," +
                    "address VARCHAR(300))";
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            if(e.getSQLState().equals("28000")) {
                System.out.println("Invalid Authentication");
                System.out.println(e.getMessage());
            }
            else{
                System.out.println(e.getMessage());
            }
        }catch(ClassNotFoundException e){
            System.out.println("MySQL JDBC Driver not found");
            System.out.println(e.getMessage());
        }
    }

    public void insertTeacherInfo(int id, String name, String address){
        try{
            query = "INSERT INTO teacherInformation(id, name, address) VALUES(?, ?, ?)";
            preparedStatement = connection.prepareStatement(query);

            preparedStatement.setInt(1, id);
            preparedStatement.setString(2, name);
            preparedStatement.setString(3, address);
            preparedStatement.executeUpdate();

            System.out.println("Record Inserted Successfully");

            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
