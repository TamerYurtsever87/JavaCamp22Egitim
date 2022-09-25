public class Main {
    public static void main(String[] args) {

        // Değer Tiplere Örnek

        int sayi1=200;
        int sayi2=150;
        int toplam=sayi1+sayi2;
        sayi1=75;
        sayi2=200;
        toplam=sayi1+sayi2;
        System.out.println("Değer tip sonucu: "+toplam);


        // Referans Tiplere örnek
        int[] number1=new int[]{1,3,4,6};
        int[] number2=new int[]{5,8,9,11,12};
        number2=number1;
        number1=new int[]{15,21,13};
        System.out.println("Referans tip sonucu: "+number1[0]);
        System.out.println("Referans tip sonucu: "+number2[0]);



    }
}