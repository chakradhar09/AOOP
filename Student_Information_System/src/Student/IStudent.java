package Student;

import Course.ICourse;

import java.util.List;

public interface IStudent {
    public String getName();
    public String getId();
    public List<ICourse> getEnrolledCourses();
    public void enrollCourse(ICourse course);
    public void dropCourse(ICourse course);
}
