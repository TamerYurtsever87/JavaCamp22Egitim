import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sayi = scanner.nextInt();
        boolean isControl = true;

        if(sayi==1){
            System.out.println(sayi + " Sayisi Asal Degildir. En kucuk Asal Sayi 2'dir. ");
            return;
        }

        if(sayi<1){
            System.out.println("Gecersiz Sayi.");
            return;
        }


        for (int i = 2; i < sayi; i++) {
            if (sayi % i == 0) {
                isControl = false;
                break;
            }
        }

        if (isControl) {
            System.out.println("Sayi Asaldir.");
        }
        else
        {
            System.out.println("Sayi Asal Degildir.");
        }




    }

}


