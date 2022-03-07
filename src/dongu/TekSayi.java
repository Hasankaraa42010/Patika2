package dongu;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class TekSayi {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner=new Scanner(System.in);
        /*
        Java döngüler ile tek bir sayı girilene kadar kullanıcıdan
        girişleri kabul eden ve girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.
         */
        System.out.println("  Sayi giriniz:");
        int sayi=scanner.nextInt();
        int sum=0;
        while (sayi%2==0){
            if (sayi%4==0){
                sum= sum+sayi;
            }
            System.out.println("tekrar gir");
            sayi=scanner.nextInt();

        }
        System.out.println(sum);
    }
}
