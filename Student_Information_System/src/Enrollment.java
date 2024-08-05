public class Enrollment implements IEnrollment{
    public void enroll(Student student, Course course) {
        student.enrollCourse(course.getCourse());
        course.enrollStudent(student.getStudent());
    }
}
