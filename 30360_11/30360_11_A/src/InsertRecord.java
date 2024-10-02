import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertRecord {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/students";
        String user = "postgres";
        String password = "goldenhand";

        try{
            Class.forName("org.postgresql.Driver");

            Connection connection = DriverManager.getConnection(url, user, password);

            String query = "insert into registration(id, name, program, branch) values(?, ?, ?, ?)";

            PreparedStatement preparedStatement = connection.prepareStatement(query);

            preparedStatement.setInt(1, 30164);
            preparedStatement.setString(2, "G. Rohit");
            preparedStatement.setString(3, "Btech");
            preparedStatement.setString(4, "CSE");
            preparedStatement.executeUpdate();

            preparedStatement.setInt(1, 30174);
            preparedStatement.setString(2, "Navya Bokam");
            preparedStatement.setString(3, "Btech");
            preparedStatement.setString(4, "CSE");
            preparedStatement.executeUpdate();

            preparedStatement.setInt(1, 30178);
            preparedStatement.setString(2, "B. Rishi");
            preparedStatement.setString(3, "Btech");
            preparedStatement.setString(4, "CSE");
            preparedStatement.executeUpdate();

            preparedStatement.setInt(1, 30360);
            preparedStatement.setString(2, "Chilakapati Srijaya Chakradhar");
            preparedStatement.setString(3, "Btech");
            preparedStatement.setString(4, "CSE");
            preparedStatement.executeUpdate();

            System.out.println("Record Inserted Successfully...");

            preparedStatement.close();
            connection.close();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
