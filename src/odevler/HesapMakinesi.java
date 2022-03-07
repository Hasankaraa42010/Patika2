package odevler;

import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Hesap makinasına hoşgeldiniz:");
        System.out.println("Lütfen birinci sayı giriniz:");
        double sayi1=scanner.nextDouble();
        System.out.println("Lütfen ikinci sayı giriniz:");
        double sayi2=scanner.nextDouble();
        System.out.println("Hesap makinasına hoşgeldiniz:");
        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Lütfen seçiminizi yapınız:");
        byte secim=scanner.nextByte();
        switch (secim){
            case 1:
                System.out.println("Toplam:"+(sayi1+sayi2));
                break;

            case 2:
                System.out.println("Çıkarma:"+(sayi1-sayi2));
                break;
            case 3:
                System.out.println("Çarpım:"+(sayi1*sayi2));
                break;
            case 4:
                if (sayi2 != 0) {
                    System.out.println("Bölme:"+(sayi1/sayi2));
                }
                else {
                    System.out.println("Bir sayı 0 a  bolunemez.");

                }
                break;
            default:
                System.out.println("Yanlış seçim yaptınız.");
        }
    }
}
