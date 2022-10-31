import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        int sayi,i,total=0;
        Scanner input = new Scanner(System.in);
        System.out.println("Sayıyı giriniz: ");
        sayi = input.nextInt();
        for (i=1;i<sayi;i++ ){
            if(sayi%i==0){
                total = total + i;
            }
        }
        if(total == sayi){
            System.out.println(sayi+" Sayısı mükemmeldir");
        }
        else{
            System.out.println(sayi+" Sayısı mükemmel değildir");
        }
    }
}
