import java.util.ArrayList;

public class Student implements IStudent{
    private final String studentID;
    private final String name;
    private final ArrayList<String> courses;

    public Student(String studentID, String name, ArrayList<String> courses){
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

    public ArrayList<String> getCourses(){
        return courses;
    }
}
