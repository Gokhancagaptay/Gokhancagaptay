public class ornek5 { public static void main(String[] args) {
    //dizide en büyük sayıyı bulan program
    double[] myList = {1.2,6.3,4.3,99.6};
    double total=0;
    double max=myList[0];
    for (double number:myList) {
        if (max<number){
            max=number;
        }total+=number;
        System.out.println(number);
    }
    System.out.println("Toplam"+total);
    System.out.println("En büyük="+max);
}
}
