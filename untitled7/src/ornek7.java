import java.util.Scanner;

public class ornek7{
    public static void main(String[] args) {

        //klavyeden gririlen sayıdan itibaren 5000 değerine kadar olan sayılar içinde
        //11e bölünebilen sayıların kaç adet olduğunu ve toplamını ekrana yazan programı yapınız

        Scanner scan=new Scanner(System.in);

        int x= scan.nextInt();
        int sayac=0,top=0;

        if (x>=5000){
            System.exit(1);
        }else {

            for (int i=x;i<=5000;i++){

                if (i % 11 == 0) {

                    System.out.println(i);

                    sayac=sayac+1;
                    top=top+i;


                }
            }
            System.out.println("adet:"+sayac);
            System.out.println("toplam:"+top);
        }

    }
}