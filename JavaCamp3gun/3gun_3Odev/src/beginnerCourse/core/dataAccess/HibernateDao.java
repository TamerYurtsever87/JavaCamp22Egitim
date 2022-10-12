package beginnerCourse.core.dataAccess;

import beginnerCourse.entities.Course;
import beginnerCourse.entities.Instructor;

public class HibernateDao implements MainDatabase{
    public void add(Course course, Instructor instructor){
        System.out.println("\nHibernateDoa Veritabanına Eklendi.\n");

    }
    public void delete(Course course, Instructor instructor){
        System.out.println("\nHibernateDoa Veritabanından Silindi.\n");
    }

    public void update(Course course, Instructor instructor) {
        System.out.println("\nHibernateDoa Veritabanında Güncellendi.\n");
    }
}
