import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdateRecord {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/students";
        String user = "postgres";
        String password = "goldenhand";

        try{
            Class.forName("org.postgresql.Driver");

            Connection connection = DriverManager.getConnection(url, user, password);

            String query = "update registration set address = ? where id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);

            preparedStatement.setString(1, "Mosapet");
            preparedStatement.setInt(2, 30164);
            preparedStatement.executeUpdate();

            System.out.println("Record Updated Successfully...");

            preparedStatement.close();
            connection.close();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
