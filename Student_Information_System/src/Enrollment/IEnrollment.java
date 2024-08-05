package Enrollment;

import Course.*;
import Student.*;

public interface IEnrollment {
    public IStudent getStudent();
    public ICourse getCourse();
}
