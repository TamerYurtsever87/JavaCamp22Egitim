import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        //220-284 arkadas sayilardır.
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int total1 = 0;
        int total2 = 0;
        for (int i = 1; i < number1; i++) {
            if (number1 % i == 0) {
                total1 = total1 + i;
            }
        }
        for (int i = 1; i < number2; i++) {
            if (number2 % i == 0) {
                total2 = total2 + i;
            }
        }
        if (number1 == total2 && number2 == total1) {
            System.out.println("Girilen 2 sayi Arkadas Sayilardir.");
        } else {
            System.out.println("Girilen 2 sayi Arkadas Sayi Degildir.");
        }
    }
}