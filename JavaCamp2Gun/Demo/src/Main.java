/*  Parametreli metod yapısı,
    Class ve field yapısı,
    Encapsulation Getter ve Setter yapısı,
    Contructor yapısı,
    Inheritance Yapısı
    
    Konuları işlenmiştir.
*/



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
        product2.setProductPrice(100);


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


//  Ürünleri liste içerisine aldık.
        Product[] products = {product1, product2, product3, productsTable1};
        System.out.println(
                        product1.getId() + " " + product1.getProductName() + "\n" +
                        product2.getId() + " " + product2.getProductName() + "\n" +
                        product3.getId() + " " + product3.getProductName() + "\n" +
                        productsTable1.getId() + " " + productsTable1.getProductName() + "\n");

// Contructor yardımıyla hesaplamalar yaptık.
        ProductManager productManager = new ProductManager();
        productManager.DiscountCallculator(product2.getProductPrice(), product2.getProductName());

    }
}
