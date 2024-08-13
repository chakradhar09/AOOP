package Enrollment;

import java.util.ArrayList;
import java.util.List;

public class EnrollmentManager {
    private final List<IEnrollment> enrollments = new ArrayList<>();

    public void addEnrollment(IEnrollment enrollment){
        enrollments.add(enrollment);
    }
}
