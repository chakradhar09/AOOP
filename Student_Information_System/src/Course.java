import java.util.ArrayList;

public class Course implements ICourse{
    private final String courseID;
    private final String name;
    private ArrayList<String> students = null;

    public Course(String courseID, String name){
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

    public String toString(){
        return "\nCourse ID: " + courseID + '\n'+
                "Course Name: " + name +'\n';
    }
}
