import business.CategoryManager;
import business.CourseManager;
import business.InstructorManager;
import core.logger.DatabaseLogger;
import core.logger.FileLogger;
import core.logger.Logger;
import core.logger.MailLogger;
import dataAccess.HibernateDao;
import dataAccess.JDBCDatabaseDao;
import entities.Category;
import entities.Course;
import entities.Instructor;

public class Main {
    public static void main(String[] args) throws Exception {
        Logger[] loggers = {new DatabaseLogger(), new MailLogger(), new FileLogger()};

        Category category1 = new Category(4, "JavaScript");
        CategoryManager categoryManager = new CategoryManager(new JDBCDatabaseDao(),loggers);
        categoryManager.add(category1);

        Course course1 = new Course(4, "JavaScript", "JS ile FrontEnd Eğitimi", 175);
        CourseManager courseManager = new CourseManager(new HibernateDao(), loggers);
        courseManager.add(course1);

        Instructor instructor = new Instructor(1, "Engin", "Demiroğ");
        InstructorManager instructorManager = new InstructorManager(new JDBCDatabaseDao(), loggers);
        instructorManager.add(instructor);
    }
}