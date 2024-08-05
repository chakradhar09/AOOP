package Course;

import java.util.ArrayList;
import java.util.List;

public class CourseManager {
    private final List<ICourse> courses = new ArrayList<>();

    public void addCourse(ICourse course){
        courses.add(course);
    }
}
