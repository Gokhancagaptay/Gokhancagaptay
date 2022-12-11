import java.util.Scanner;
public class ornek4 {
    //üssü sayı hesaplama programı
    public static void main(String[] args) {

Scanner k=new Scanner(System.in);

int t=1;
        System.out.println("Taban kaç olmasını istiyorsanız o sayıyı giriniz:");
int a=k.nextInt();
        System.out.println("Üssü kaç olmasını istiyorsanız o sayıyı giriniz:");
int b=k.nextInt();
for(int i=1;i<=b;i++){
t=t*a;
}
        System.out.println(a+" üssü "+b+"="+t);
    }

}
