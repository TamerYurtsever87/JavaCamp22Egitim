package beginnerCourse.business;

import beginnerCourse.core.dataAccess.MainDatabase;
import beginnerCourse.core.logger.BaseLogger;
import beginnerCourse.entities.Course;
import beginnerCourse.entities.Instructor;

import java.util.ArrayList;
import java.util.List;


public class InstructorManager {

    private Course course;
    private final MainDatabase mainDatabase;
    private final BaseLogger[] baseLoggers;
    private Instructor[] instructors;


    public InstructorManager(MainDatabase mainDatabase, BaseLogger[] baseLoggers) {
        this.mainDatabase = mainDatabase;
        this.baseLoggers = baseLoggers;
    }

    public void add(Instructor instructor) {

        List intructorsList = new ArrayList() {
        };

        intructorsList.add("ID: "+instructor.getInstructorId());
        intructorsList.add("Eğitmen Adı: " +instructor.getEducationFirstName());
        intructorsList.add("Eğitmen SoyAdı: " +instructor.getEducationLastName());
        intructorsList.add("Eğitmen Bilgisi: " +instructor.getEducationInfo());

        for (int i = 0; i < intructorsList.size(); i++) {
            System.out.println(intructorsList.get(i));

        }
        System.out.println("Eğitmen Bilgileri Kaydedildi.\n");
        mainDatabase.add(course, instructor);
    }
}