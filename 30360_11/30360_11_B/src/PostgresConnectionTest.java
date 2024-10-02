import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PostgresConnectionTest {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/tests";
        String user = "postgres";
        String password = "goldenhand";

        Connection connection = null;

        try{
            Class.forName("org.postgresql.Driver");

            connection = DriverManager.getConnection(url, user, password);

            if(connection != null)
                System.out.println("Connected to the database...");
        }
        catch (ClassNotFoundException e){
            System.out.println("PostgreSQL JDBC driver not found");
            System.out.println(e.getMessage());
        }
        catch(SQLException e){
            if(e.getSQLState().equals("28000")) //SQL state 28000 indicates invalid authentication
                System.out.println("Invalid Username or Password");
            else {
                System.out.println("Failed to connect to the database...");
                System.out.println(e.getMessage());
            }
        }
        finally {
            try{
                if(connection != null && !connection.isClosed())
                    connection.close();
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
}
