package oppWithNLayeredApp.business;

import oppWithNLayeredApp.core.logging.Logger;
import oppWithNLayeredApp.dataAccess.JdbcProductDao;
import oppWithNLayeredApp.dataAccess.ProductDao;
import oppWithNLayeredApp.entities.Product;

import java.util.List;

public class ProductManager {
    private ProductDao productDao;
    private Logger[] loggers;

    public ProductManager(ProductDao productDao ,Logger[] loggers) {
        this.productDao = productDao;
        this.loggers = loggers;
    }

    public void add(Product product) throws Exception {
        //iş kuralları
        if (product.getUnitPrice() < 10) {
            throw new Exception("Ürün fiyatı 10 dan küçük olamaz. ");
        }

        productDao.add(product);
        for(Logger logger: loggers){
            logger.log(product.getName());
        }

    }
}
