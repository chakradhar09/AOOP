import java.util.ArrayList;

public class Course implements ICourse{
    private final String courseID;
    private final String name;
    private final ArrayList<String> students;

    public Course(String courseID, String name, ArrayList<String> students){
        this.courseID = courseID;
        this.name = name;
        this.students = new ArrayList<>();
    }

    public String getCourse(){
        return courseID;
    }

    public void enrollStudent(String studentID){
        students.add(studentID);
    }

    public ArrayList<String> getStudents(){
        return students;
    }
}
