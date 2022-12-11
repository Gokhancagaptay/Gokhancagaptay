import java.util.Scanner;
//İstediğimiz adette sayı karşılaşrırma yaptıran progam

public class ornek2 {
    public static void main(String[] args) {

            int n, enBuyuk = 0, a;
            System.out.println("Karsılastırmak istediğniz sayı adetini giriniz");
            Scanner scan = new Scanner(System.in);
            n = scan.nextInt();
            for (int i = 1; i <= n; i++) {
                System.out.println(i + ".sayıyı giriniz");
                a = scan.nextInt();
                {
                    if (a > enBuyuk) {
                        enBuyuk = a;
                    } else {
                    }
                }

            }
            System.out.println("En Büyük sayı:"+enBuyuk);


        }
    }
