import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] sayilar = {1, 2, 3, 5, 7, 9, 15};
        int girilenSayi = scanner.nextInt();
        boolean control = false;
        for (int x : sayilar) {
            if (x == girilenSayi) {
                control = true;
                break;
            } else {
                control = false;
            }
        }
        if (control) {
            System.out.println("Aradaığnız Sayi Listede VAR");
        } else {
            System.out.println("Aradaığnız Sayi Listede YOK");
        }
    }
}