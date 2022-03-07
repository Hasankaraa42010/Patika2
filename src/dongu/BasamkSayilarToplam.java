package dongu;

import java.util.Scanner;

public class BasamkSayilarToplam {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen sayı giriniz:");
        int sayi=scanner.nextInt();
        int toplam=0;
        int rakam;
        while (sayi>0){
            rakam=sayi%10;
            toplam+=rakam;
            sayi/=10;
        }
        System.out.println(toplam);

    }

}
