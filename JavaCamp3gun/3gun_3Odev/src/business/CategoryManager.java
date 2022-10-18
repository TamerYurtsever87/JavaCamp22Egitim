package business;

import core.logger.Logger;
import dataAccess.MainDatabaseDao;
import entities.Category;



public class CategoryManager {
    private MainDatabaseDao mainDatabaseDao;
    private Logger[] loggers;

    public CategoryManager(MainDatabaseDao mainDatabaseDao, Logger[] loggers) {
        this.mainDatabaseDao = mainDatabaseDao;
        this.loggers = loggers;
    }
    public void add(Category category) throws Exception {
        Category[] categories = {
                new Category(1, "Java"),
                new Category(2, "C#/Unity engine"),
                new Category(3, "C++/Unrel Engine")
        };

        for (Category categorys : categories) {
            if (category.getName() == categorys.getName()) {
                throw new Exception("Kategori ismi tekrar edemez.");
            }
        }
        mainDatabaseDao.addDao();

        for(Logger logger : loggers){
            logger.log("Loglama Yapıldı.");
        }
    }
}

