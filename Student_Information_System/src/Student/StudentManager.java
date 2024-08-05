package Student;

import java.util.ArrayList;
import java.util.List;

public class StudentManager {
    private final List<IStudent> students = new ArrayList<>();

    public void addStudent(IStudent student){
        students.add(student);
    }
}
