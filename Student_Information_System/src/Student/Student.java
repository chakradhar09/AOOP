package Student;

import Course.ICourse;

import java.util.ArrayList;
import java.util.List;

public abstract class Student implements IStudent {
    protected String name;
    protected String id;
    protected List<ICourse> enrolledCourses = new ArrayList<>();

    public String getName(){
        return name;
    }
    public String getId(){
        return id;
    }

    public List<ICourse> getEnrolledCourses(){
        return enrolledCourses;
    }

    public void enrollCourse(ICourse course){
        enrolledCourses.add(course);
    }
    public void dropCourse(ICourse course){
        enrolledCourses.remove(course);
    }
}
