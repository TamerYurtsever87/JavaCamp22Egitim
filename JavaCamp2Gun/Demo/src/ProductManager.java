public class ProductManager {
    // ürün ve ürünle ilgili bilgiler
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
    //Indirim oranı ve Kargo ücreti hesaplama bilgisini müşteriye sunma.
    public void DiscountCallculator(Product product) {

        if (discountYuzde >= 0.10 && discountYuzde <= 0.18) {

            toplam = product.getProductPrice() * discountYuzde;
            total = product.getProductPrice() - toplam;
            if (product.getProductPrice() > cargoOrani) {
                totalNet = total;
                cargoPrice = 0;
                System.out.println("Sepete Eklenen ürünün Adı: "+"''"+product.getProductName()+"''"+"\nÜrünün fiyatı: " + product.getProductPrice() + "TL + indirim Oranı %" + discount + "\n" + "AraToplam= " + total + "TL + Kargo Ücreti: " + cargoPrice + "TL\n" + "Ödenecek Tutar: " + totalNet + "TL");
                System.out.println("Kargo Ücretsiz.");
            } else {
                totalNet = total + cargoPrice;
                System.out.println("Sepete Eklenen ürün: "+"''"+product.getProductName()+"''"+"\nÜrün fiyatı: " + product.getProductPrice()+ "TL + indirim Oranı %" + discount + "\n" + "AraToplam= " + total + "TL + Kargo Ücreti: " + cargoPrice + "TL\n" + "Ödenecek Tutar: " + totalNet + "TL");
                System.out.println("Sadece 300 TL ve üzeri Alış Veriş lerde Kargo Ücretsizdir.");
            }

        } else if (discountYuzde < 0.10 || discountYuzde > 0.18) {
            cargoPrice = 0;
            toplam = product.getProductPrice() * discountYuzde;
            total = product.getProductPrice()- toplam;
            totalNet = total + cargoPrice;

            System.out.println("Ürün fiyatı: " + product.getProductPrice() + "TL + indirim Oranı %" + discount + "\n" + "AraToplam= " + total + "TL + Kargo Ücreti: " + cargoPrice + "TL\n" + "Ödenecek Tutar: " + totalNet + "TL");
            System.out.println("Kargo Ücretsiz.");
        }
    }
}
