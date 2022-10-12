package beginnerCourse.core.dataAccess;

import beginnerCourse.entities.Course;
import beginnerCourse.entities.Instructor;

public interface MainDatabase {
    void add(Course course, Instructor instructor);
    void delete(Course course, Instructor instructor);
    void update(Course course, Instructor instructor);
}

