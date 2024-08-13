package Enrollment;

import Course.*;
import Student.*;

public class Enrollment implements IEnrollment {
    private final IStudent student;
    private final ICourse course;

    public Enrollment(IStudent student, ICourse course){
        this.student = student;
        this.course = course;

        student.enrollCourse(course);
        course.enrollStudent(student);
    }

    public IStudent getStudent(){
        return student;
    }
    public ICourse getCourse(){
        return course;
    }
}
