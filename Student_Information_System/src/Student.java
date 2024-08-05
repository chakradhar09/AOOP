import java.util.ArrayList;

public class Student implements IStudent{
    private final String studentID;
    private final String name;
    private ArrayList<String> courses = null;

    public Student(String studentID, String name){
        this.studentID = studentID;
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public String getStudent(){
        return studentID;
    }

    public void enrollCourse(String courseID){
        courses.add(courseID);
    }

    public String toString(){
        return "\nStudent ID: " + studentID + '\n' +
                "Student Name: " + name + '\n';
    }
}
