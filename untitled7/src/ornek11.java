import java.util.Scanner;
public class ornek11 {
    public static void main(String[] args) {
        //dizilere tanımlanmış şehirleri bölgelerine göre yazan program
        Scanner scan = new Scanner(System.in);
        String[][] sehirler = new String[3][3];
        String[] bolgeler = new String[3];
        System.out.println("Marmara bölgesi için:0");
        System.out.println("İç Anadolu bölgesi için:1");
        System.out.println("Güney Doğu Anadolu bölgesi için:2");
        System.out.println("Hangi bölgenin şehirlerini görmek istiyorsanız tüşlayın:");
        sehirler[0][0] = "İstanbul";
        sehirler[0][1] = "Bursa";
        sehirler[0][2] = "Bilecik";
        sehirler[1][0] = "Ankara";
        sehirler[1][1] = "konya";
        sehirler[1][2] = "Kayseri";
        sehirler[2][0] = "Diyarbakır";
        sehirler[2][1] = "Şanlıurfa";
        sehirler[2][2] = "Gaziantep";
        bolgeler[0] = "MARMARA";
        bolgeler[1] = "İÇ ANDADOLU";
        bolgeler[2] = "GÜNEY DOĞU ANADOLU";
        int i = scan.nextInt();
        if (i <= 0 && i >= 0) {
            for (int j = 0; j <= 2; j++) {
                System.out.println(sehirler[i][j]);


            }
        } else if (i <= 1 && i >= 1) {
            for (int j = 0; j <= 2; j++) {
                System.out.println(sehirler[i][j]);

            }
        } else if (i <= 2 && i >= 2) {
            for (int j = 0; j <= 2; j++) {
                System.out.println(sehirler[i][j]);

            }

        }else {}

}
}