import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //6 - 1,2,3
        //28- 1,2,4,7,14
        int sayi = scanner.nextInt();
        int toplam = 0;

        for (int i = 2; i < sayi; i++) {
            if (sayi % i == 0) {
                toplam = toplam + i;

            }
        }
        if(toplam==sayi){
            System.out.println(sayi +" Mukemmel Sayi");
        }else {
            System.out.println(sayi +" Mukemmel Sayi Degil");
        }
    }
}