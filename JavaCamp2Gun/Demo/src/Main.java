import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
    //  Product classın içindeki bilgileri set ettik.
        Product product1 = new Product(); // oluşturduğumuzun class'ın refesansını aldık.

        product1.setId(1);
        product1.setProductName("Bike");
        product1.setColor("White");
        product1.setWarrantyPeriod("4");
        product1.setProductPrice(4500);

    //  Yeni ürünlerin eklemesini yaptık.
        Product product2 = new Product();
        product2.setId(2);
        product2.setProductName("Phone N91");
        product2.setColor("Blue");
        product2.setWarrantyPeriod("1");
        product2.setProductPrice(1000);


        Product product3 = new Product();
        product3.setId(3);
        product3.setProductName("Laptop");
        product3.setColor("Black");
        product3.setWarrantyPeriod("2");
        product3.setProductPrice(7500);

        ProductsTable productsTable1 = new ProductsTable();
        productsTable1.setId(4);
        productsTable1.setProductName("MoonTable");
        productsTable1.setColor("Brown");
        productsTable1.setNumberOfChairs(6);
        productsTable1.setLength(3000);
        productsTable1.setHeight(70);
        productsTable1.setWidth(1200);
        productsTable1.setWarrantyPeriod("3");
        productsTable1.setProductPrice(12000);

        ProductsTable productsTable2 = new ProductsTable();
        productsTable2.setId(5);
        productsTable2.setProductName("SunTable");
        productsTable2.setColor("Red");
        productsTable2.setNumberOfChairs(4);
        productsTable2.setLength(3500);
        productsTable2.setHeight(80);
        productsTable2.setWidth(1300);
        productsTable2.setWarrantyPeriod("4");
        productsTable2.setProductPrice(10000);


//  Ürünleri liste içerisine aldık ve kullanıcıya sırası ile ürün isimlerini sunduk
        Product[] products = {product1, product2, product3, productsTable1,productsTable2};

        for (Product product : products) {
            System.out.println(product.getId() + " " + product.getProductName());

        }

// ürün seçimi ve fiyat hesaplamalarını yaptık
        ProductManager productManager = new ProductManager();
        int selectProduct;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Almak istediğiniz ürünü seçiniz :");
        selectProduct=scanner.nextInt()-1;

        productManager.DiscountCallculator(products[selectProduct]);

    }
}