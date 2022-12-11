import java.util.Scanner;
public class ornek10 {
    //sayı bulmaca ve toplama diye aytı ayrı main klasörü dışına tanımlanmış programların main de çalıştırılması
    public static void main(String[] args) {
    sayıbulmaca();
    sayıbulmaca();
    sayıbulmaca();
    toplama();
}


    public static void sayıbulmaca(){
        System.out.println("Dizide aramak istedğiniz sayıyı giriniz:");

        int[] sayılar= new int[]{1,2,3,5,8,9,10};
        Scanner scan =new Scanner(System.in);
        int aranacak=scan.nextInt();
        boolean varMI=false;
        for(int sayi:sayılar ){
            if (sayi==aranacak) {
                varMI=true;
                break;

            }


        }
        if (varMI){
            System.out.println("Sayı mevcuttur");
        }else {
            System.out.println("Sayı mevcut değildir");
        }
    }
    public static void toplama(){

        Scanner scan=new Scanner(System.in);
        int a= scan.nextInt();
        int b= scan.nextInt();
        int c;
        c=a+b;
        System.out.println(c);
    }
}


