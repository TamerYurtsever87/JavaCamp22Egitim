public class ProductManager {
    double discount = 18;
    double yuzde = 100;
    double discountYuzde = discount / yuzde;
    double toplam = 0;
    double total = 0;
    double totalNet = 0;
    double cargoOrani = 350;
    double cargoPrice = 19.90;

    // Contructor yapısı
    public ProductManager() {

        System.out.println("2 Yıllık Müşterilerimize Özel Kampanya, Seçili ürünlerde %" + discount + " indirim\n");

    }

    // Parametreli metod oluşturduk.
    public void DiscountCallculator(double productPrice,String productName) {

        if (discountYuzde >= 0.10 && discountYuzde <= 0.18) {

            toplam = productPrice * discountYuzde;
            total = productPrice - toplam;
            if (productPrice > cargoOrani) {
                totalNet = total;
                cargoPrice = 0;
                System.out.println("Sepete Eklenen ürün: "+productName+" Ürün fiyatı: " + productPrice + "TL + indirim Oranı %" + discount + "\n" + "AraToplam= " + total + "TL + Kargo Ücreti: " + cargoPrice + "TL\n" + "Ödenecek Tutar: " + totalNet + "TL");
                System.out.println("Kargo Ücretsiz.");
            } else {
                totalNet = total + cargoPrice;
                System.out.println("Sepete Eklenen ürün: "+productName+" Ürün fiyatı: " + productPrice + "TL + indirim Oranı %" + discount + "\n" + "AraToplam= " + total + "TL + Kargo Ücreti: " + cargoPrice + "TL\n" + "Ödenecek Tutar: " + totalNet + "TL");
            }

        } else if (discountYuzde < 0.10 || discountYuzde > 0.18) {
            cargoPrice = 0;
            toplam = productPrice * discountYuzde;
            total = productPrice - toplam;
            totalNet = total + cargoPrice;

            System.out.println("Ürün fiyatı: " + productPrice + "TL + indirim Oranı %" + discount + "\n" + "AraToplam= " + total + "TL + Kargo Ücreti: " + cargoPrice + "TL\n" + "Ödenecek Tutar: " + totalNet + "TL");
            System.out.println("Kargo Ücretsiz.");
        }
    }
}
