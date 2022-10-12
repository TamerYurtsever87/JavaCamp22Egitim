package beginnerCourse.business;

import beginnerCourse.core.dataAccess.MainDatabase;
import beginnerCourse.core.logger.BaseLogger;
import beginnerCourse.entities.Course;
import beginnerCourse.entities.Instructor;

import java.util.ArrayList;
import java.util.List;

public class CourseManager {
    private Instructor instructor;
    private MainDatabase mainDatabase;
    private BaseLogger[] baseLoggers;



    public CourseManager(MainDatabase mainDatabase, BaseLogger[] baseLoggers) {
        this.mainDatabase = mainDatabase;
        this.baseLoggers = baseLoggers;

    }

    public void add(Course course) throws Exception {
        if (course.getCoursePrice() <= 0) {
            throw new Exception("Kurs ücreti 0'dan büyük olmalı");
        }

        List coursesList = new ArrayList() {
        };
        coursesList.add("ID: "+course.getCourseId());
        coursesList.add("Kurs Adı: "+course.getCourseName());
        coursesList.add("Kurs Süresi: "+course.getEducationTime());
        coursesList.add("Kurs Bilgisi: "+course.getCourseInfo());
        coursesList.add("Kurs Ücreti: "+course.getCoursePrice()+"\n");

        for(int i=0;i<coursesList.size();i++){
            System.out.println(coursesList.get(i));
        } System.out.println("Kurs Bilgileri Kaydedildi.\n");


        for (BaseLogger baselog:baseLoggers) {
            baselog.add(course.getCourseName());
        }
        mainDatabase.add(course,instructor);


    }

}


