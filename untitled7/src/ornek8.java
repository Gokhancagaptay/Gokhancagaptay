import java.util.Scanner;

public class ornek8 {
//girilen sayı asal mıı değil mi onu gösteren program
    public static void main(String[] args) {
        System.out.println("Kontrol etmek istediğiniz sayıyı giriniz:");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int remeinder = number % 2;
        boolean isprime = true;
        if (number == 1) {
            System.out.println("Sayı asal değildir");
            return;

        }
        if (number < 1) {
            System.out.println("Geçersiz sayı");
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isprime = false;
            }
        }
        if (isprime) {
            System.out.println("Sayı asaldır");
        } else {
            System.out.println("Sayı asal değildir");
        }


    }
}