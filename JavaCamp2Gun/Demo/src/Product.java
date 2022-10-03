import java.util.Scanner;
public class Product {


    // Kapsülleme ile setter ve getter tanımladık ki istediğimiz bilgileri gerektiğinde saklayıp gerektiğinde gösterebilelim.
    private int id; // ürünün Kodu
    private String productName;     // ürünün ismi
    private String color;           // ürünün Rengi               // Product classımızın özelliklerini tanımladık.
    private String warrantyPeriod;  // Garanti süresi
    private double productPrice;    // ürün fiyatı

    // getter & setter..
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getWarrantyPeriod() {
        return warrantyPeriod;
    }

    public void setWarrantyPeriod(String warrantyPeriod) {
        this.warrantyPeriod = warrantyPeriod;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }
}
