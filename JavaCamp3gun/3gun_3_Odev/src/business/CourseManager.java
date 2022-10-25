package business;

import core.logger.Logger;
import dataAccess.MainDatabaseDao;
import entities.Course;

public class CourseManager {

    private MainDatabaseDao mainDatabaseDao;
    private Logger[] loggers;

    public CourseManager(MainDatabaseDao mainDatabaseDao, Logger[] loggers) {
        this.mainDatabaseDao = mainDatabaseDao;
        this.loggers = loggers;
    }

    public void add(Course course) throws Exception {
        Course[] courses = {
                new Course(1,"Java", "Programlama", 100),
                new Course(2, "C#", "C# ile Unityde Oyun geliştirme", 150),
                new Course(3,"C++", "C++ ile Unreal Engine de oyun geliştirme", 200)
        };

        for(Course courseies : courses){
            if(course.getName() == courseies.getName()){
                throw new Exception("Kurs ismi tekrar edemez");
            }else if(course.getPrice() < 0){
                throw new Exception("Bir kursun fiyatı 0 dan küçük olamaz");
            }
        }
        mainDatabaseDao.addDao();

        for(Logger logger : loggers){
            logger.log("Kurs kaydedildi");
        }
    }
}