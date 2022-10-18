package dataAccess;

import entities.Course;

public class HibernateDao implements MainDatabaseDao {
    public void addDao(){

        System.out.println("Hibernate Veri tabanına eklendi.");
    }

}
