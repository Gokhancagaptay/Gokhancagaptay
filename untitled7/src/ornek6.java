import java.util.Scanner;
public class ornek6 {
    public static void main(String[] args) {
        //iki sayı arasında olan tek sayıları toplayan program
        int c = 0, d = 0, sonuc = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Küçükten büyüğe doğru sırası ile a ve b sayısını giriniz:");
        for (int a = scan.nextInt(), b = scan.nextInt(); a <= b; a++) {


            if (a % 2 == 1||b<a) {
                d = d + a;
                c++;


            } else {
            }


        }

        System.out.println("teklerin toplamı:" + d);
        sonuc = d / c;
        System.out.println("teklerin ortalaması:" + sonuc);
    }
}

