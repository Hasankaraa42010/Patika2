package odevler;

import java.util.Scanner;

public class Siralama {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int enBuyuk,enKucuk;
        System.out.print("BirinciSayıyı gir:");
        int sayi1=scanner.nextInt();
        System.out.print("İkincisayıyı gir:");
        int sayi2=scanner.nextInt();
        System.out.print("Üçüncü sayıyı gir:");
        int sayi3=scanner.nextInt();
        enBuyuk=sayi1;
        enKucuk=sayi1;
        if (sayi2>enBuyuk){
            enBuyuk=sayi2;}
            else if (sayi2<enKucuk){
                enKucuk=sayi2;
            }

         if (sayi3>enBuyuk){
            enBuyuk=sayi3;
         }
           else if (sayi3<enKucuk){
               enKucuk=sayi3;
         }
        System.out.println(enKucuk);
        System.out.println(enBuyuk);
    }
}
