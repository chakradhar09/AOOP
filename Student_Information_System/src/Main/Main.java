package Main;

import Course.*;
import Enrollment.*;
import Student.*;

public class Main {
    public static void main(String[] args) {
        IStudent student1 = new CSE("12345", "Alice");
        IStudent student2 = new ECE("54321", "Bob");
        ICourse course1 = new RegularMode("CS101", "Introduction to Computer Science");
        ICourse course2 = new AdvancedMode("MATH201", "Calculus II");

        Enrollment enrollment1 = new Enrollment(student1, course1);
        Enrollment enrollment2 = new Enrollment(student2, course2);

        StudentManager studentManager = new StudentManager();
        CourseManager courseManager = new CourseManager();
        EnrollmentManager enrollmentManager = new EnrollmentManager();

        studentManager.addStudent(student1);
        studentManager.addStudent(student2);
        courseManager.addCourse(course1);
        courseManager.addCourse(course2);
        enrollmentManager.addEnrollment(enrollment1);
        enrollmentManager.addEnrollment(enrollment2);

        System.out.println(student1.getName());
        System.out.println(course1.getName());
        System.out.println(enrollment1.getStudent().getName());
        System.out.println(enrollment1.getCourse().getName());
    }
}

