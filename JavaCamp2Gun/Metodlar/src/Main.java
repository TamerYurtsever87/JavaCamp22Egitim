public class Main {
    public static void main(String[] args) {
        UrunSorgulama(); // Ürün Sorgulamak için Metod Çağrıldı.
    }

    // ürün sorgulama metod bloğu
    public static void UrunSorgulama() {
        // String urunSorma = "TV Ünitesi ";  <-- örnek

        String urunSorma = "Dolap";// Aracanak ürünü giriniz.

        String[] urunler = {"Sandalye", "Masa", "Dolap", "Yatak", "Koltuk"}; // ürün stok listesi
        boolean stokDurumu = false;
    // istenen ürün, Stoktaki ürünler içerisinde arandı.
        for (String urun : urunler) {
            if (urunSorma == urun) {
                stokDurumu = true;
                break;
            }
        }
    // Aranan ürünün stokta olup olmadığı bilgisi verildi.
        if (stokDurumu) {
            stoktaVarMesaji(urunSorma);
        } else {
            stoktaYokMesaji(urunSorma);
        }
    }

    // Stok Bilgi mesajı metodu
    public static void stoktaVarMesaji(String urunSorma){
        System.out.println("* " + urunSorma + " * Stoğumuzda Mevcut");
    }

    public static void stoktaYokMesaji(String urunSorma){
        System.out.println("* " + urunSorma + " * Stoğumuzda Mevcut Değildir.");
    }


}