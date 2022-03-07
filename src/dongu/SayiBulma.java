package dongu;

import java.util.Scanner;

public class SayiBulma {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner=new Scanner(System.in);
        System.out.println("Sayıyı giriniz:");
        int sayi=scanner.nextInt();
        for (int i = 0; i <sayi ; i++) {
            if (i%3==0 && i%4==0)
            {
                System.out.println(i);
            }
        }

    }
}
