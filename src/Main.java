import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int count,number;
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz :");
        count=input.nextInt();
        int maxNumber =0;
        int minNumber =0;
        for (int i =1; i<=count;i++){
            System.out.print(i+". Sayıyı giriniz: ");
            number=input.nextInt();
            if (maxNumber<number){
                maxNumber =number;
            }
            if (minNumber>number){
                minNumber =number;
            }
        }
        System.out.println("En Küçük Sayı : " +minNumber);
        System.out.println("En Büyük Sayı : " +maxNumber);
    }
}



















