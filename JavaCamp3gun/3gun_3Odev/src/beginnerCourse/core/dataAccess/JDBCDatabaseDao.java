package beginnerCourse.core.dataAccess;

import beginnerCourse.entities.Course;
import beginnerCourse.entities.Instructor;

public class JDBCDatabaseDao implements MainDatabase{

    @Override
    public void add(Course course, Instructor instructor) {
        System.out.println("JBDCDatabaseDoa Veritabanına Eklendi.\n");
    }

    @Override
    public void delete(Course course, Instructor instructor) {
        System.out.println("JBDCDatabaseDoa Veritabanına Eklendi.\n");
    }

    @Override
    public void update(Course course, Instructor instructor) {
        System.out.println("JBDCDatabaseDoa Veritabanına Eklendi.\n");
    }
}
