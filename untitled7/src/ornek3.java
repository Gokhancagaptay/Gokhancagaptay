import java.util.Scanner;
public class ornek3 {
//final vize ortalaması hesabı yapan program
    public static void main(String[] args) {
        int vize, fnal;
        double ort ;
        char isim;
        Scanner a = new Scanner(System.in);
        System.out.println("vize notunuzu giriniz");
        vize = a.nextInt();
        System.out.println("Final notunuzu giriniz");
        fnal = a.nextInt();
        ort=(vize*0.4+fnal*0.6);

        String mesaj = "Öğrenci sayisi=";
        if (fnal < 50) {
            System.out.println("kaldınız");

        } else if (ort>50) {
            System.out.println("geçtin");

        }else {
            System.out.println("kaldın");
        }
    }
}

