package business;


import core.logger.Logger;
import dataAccess.HibernateDao;
import dataAccess.MainDatabaseDao;
import entities.Instructor;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class InstructorManager {

    private MainDatabaseDao mainDatabaseDao;
    private Logger[] loggers;

    public InstructorManager(MainDatabaseDao mainDatabaseDao, Logger[] loggers) {
        this.mainDatabaseDao = mainDatabaseDao;
        this.loggers = loggers;
    }

    public void add(Instructor instructor){

        mainDatabaseDao.addDao();

        for(Logger logger:loggers){
            logger.log(instructor.getFirstName()+ " " + instructor.getLastName());
        }
    }
}
