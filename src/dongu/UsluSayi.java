package dongu;

import java.util.Scanner;

public class UsluSayi {
    public static void main(String[] args) {
        // write your code here
        Scanner input = new Scanner(System.in);
        System.out.println("Sayi:");
        int sayi1=input.nextInt();
        System.out.println("Ustü:");
        int sayi2=input.nextInt();
        int carpm=1;
        for (int i = 1; i <=sayi2 ; i++) {
            carpm*=sayi1;
        }
        System.out.println(carpm);
    }

}
