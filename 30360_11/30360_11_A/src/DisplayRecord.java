import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DisplayRecord {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/students";
        String user = "postgres";
        String password = "goldenhand";

        try{
            Class.forName("org.postgresql.Driver");

            Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement();

            String query = "select * from registration";
            ResultSet resultSet = statement.executeQuery(query);

            while(resultSet.next()){
                System.out.println("ID: " + resultSet.getInt("id"));
                System.out.println("Name: " + resultSet.getString("name"));
                System.out.println("Address: " + resultSet.getString("address"));
                System.out.println("Program: " + resultSet.getString("program"));
                System.out.println("Branch: " + resultSet.getString("branch"));
                System.out.println();
            }

            resultSet.close();
            statement.close();
            connection.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
