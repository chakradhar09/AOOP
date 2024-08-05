public class Main {
    public static void main(String[] args) {
        Student student = new Student("4954654646", "Chakri");
        Course course = new Course("561564", "AOOP");

        student.enrollCourse("561564");
        course.enrollStudent("4954654646");

        Enrollment enrollment = new Enrollment();
        enrollment.enroll(student, course);

        System.out.println(student);
        System.out.println(course);
    }
}
