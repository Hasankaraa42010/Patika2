package dongu;

import java.util.Scanner;

public class HarmonikSayi {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen sayı giriniz:");
        int sayi=scanner.nextInt();
        double toplam=0;
        for (int i = 1; i <=sayi ; i++) {
            toplam=toplam+(1.0/i);

        }
        System.out.println(toplam);

    }

}
