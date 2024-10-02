import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateDataBase{
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/";
        String user = "postgres";
        String password = "goldenhand";

        try{
            Class.forName("org.postgresql.Driver");

            Connection connection = DriverManager.getConnection(url, user, password);

            Statement statement = connection.createStatement();

            String query = "create database students";

            statement.executeUpdate(query);
            System.out.println("DataBase Crated Successfully....");

            statement.close();
            connection.close();
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
