package Course;

import Student.IStudent;

import java.util.ArrayList;
import java.util.List;

public abstract class Course implements ICourse {
    protected String name;
    protected String id;
    protected List<IStudent> enrolledStudents = new ArrayList<>();

    public String getName(){
        return name;
    }
    public String getId(){
        return id;
    }

    public List<IStudent> getEnrolledStudents(){
        return enrolledStudents;
    }

    public void enrollStudent(IStudent student){
        enrolledStudents.add(student);
    }
    public void dropStudent(IStudent student){
        enrolledStudents.remove(student);
    }
}
