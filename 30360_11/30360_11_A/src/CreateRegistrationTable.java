import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateRegistrationTable {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/students";
        String user = "postgres";
        String password = "goldenhand";

        try{
            Class.forName("org.postgresql.Driver");

            Connection connection = DriverManager.getConnection(url, user, password);

            Statement statement = connection.createStatement();

            String query = "create table if not exists registration (" +
                    "id numeric primary key," +
                    "name varchar(100)," +
                    "address varchar(300)," +
                    "program varchar(10)," +
                    "branch varchar(20))";

            statement.executeUpdate(query);
            System.out.println("Registration Table Created Successfully...");

            statement.close();
            connection.close();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
