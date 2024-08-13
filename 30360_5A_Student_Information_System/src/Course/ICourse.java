package Course;

import Student.IStudent;

import java.util.List;

public interface ICourse {
    public String getId();
    public String getName();
    public List<IStudent> getEnrolledStudents();
    public void enrollStudent(IStudent student);
    public void dropStudent(IStudent student);
}
