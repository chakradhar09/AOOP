package StudentDataBaseManager;

import java.sql.*;

public class StudentDataBaseManager {
    private static Connection connection = null;
    private static PreparedStatement preparedStatement;
    private String query;

    public StudentDataBaseManager(String url, String user, String password){
        try{
            Class.forName("org.postgresql.Driver");

            connection = DriverManager.getConnection(url, user, password);

            query = "create table if not exists studentRegistration(" +
                    "id numeric primary key," +
                    "name varchar(100)," +
                    "program varchar(20)," +
                    "branch varchar(20))";
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.executeUpdate();

            preparedStatement.close();
        } catch(SQLException e){
            if(e.getSQLState().equals("28000"))
                System.out.println("Invalid Authentication");
            else
                System.out.println(e.getMessage());
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    public boolean checkConnection(){
        return connection != null;
    }

    public void endConnection(){
        try{
            connection.close();
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }

    public void insertStudentRecord(int id, String name, String program, String branch){
        try{
            query = "insert into studentRegistration(id, name, program, branch) values(?, ?, ?, ?)";
            preparedStatement = connection.prepareStatement(query);

            preparedStatement.setInt(1, id);
            preparedStatement.setString(2, name);
            preparedStatement.setString(3, program);
            preparedStatement.setString(4, branch);
            preparedStatement.executeUpdate();

            System.out.println("Student is Registered Successfully");

            preparedStatement.close();
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
    public void updateStudentRecord(int id, String updatedValue){
        try{
            query = "update studentRegistration set name = ? where id = ?";
            preparedStatement = connection.prepareStatement(query);

            preparedStatement.setString(1, updatedValue);
            preparedStatement.setInt(2, id);
            preparedStatement.executeUpdate();

            System.out.println("Student Record Updated Successfully");

            preparedStatement.close();
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
    public void deleteStudentRecord(int id){
        try{
            query = "delete from studentRegistration where id = ?";
            preparedStatement = connection.prepareStatement(query);

            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();

            System.out.println("Student Record Deleted Successfully");

            preparedStatement.close();
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
    public void displayStudentRecords(){
        try{
            query = "select * from studentRegistration";
            preparedStatement = connection.prepareStatement(query);

            ResultSet resultSet = preparedStatement.executeQuery();
            System.out.println();
            while(resultSet.next()){
                System.out.println("Student ID: " + resultSet.getInt("id"));
                System.out.println("Name: " + resultSet.getString("name"));
                System.out.println("Program: " + resultSet.getString("program"));
                System.out.println("Branch: " + resultSet.getString("branch"));
                System.out.println();
            }

            preparedStatement.close();
            resultSet.close();
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
