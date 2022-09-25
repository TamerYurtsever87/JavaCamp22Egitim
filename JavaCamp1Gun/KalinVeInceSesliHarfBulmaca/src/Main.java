import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String girilenHarf = scanner.next();

        String[] kalinSesliler = {"a", "ı", "o", "u", "A", "I", "O", "U"};
        String[] inceSesliler = {"e", "i", "ö", "ü", "E", "İ", "Ö", "Ü"};
        String control = "0";
        for (String harf1 : kalinSesliler) {

            if (harf1.equals(girilenHarf)) {
                System.out.println("Kalin Sesli Harf");
                control = "1";
                return;
            }

        }
        for (String harf2 : inceSesliler) {
            if (harf2.equals(girilenHarf)) {
                System.out.println("ince Sesli Harf");
                control = "2";
                return;
            } else {
                System.out.println("Sessiz Harf Girdiniz.");
                control = "3";
                return;
            }
        }
    }
}



