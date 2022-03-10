package Metodlar;

import java.util.Scanner;

public class Palidrom {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen sayıyı girin:");
        int sayi=input.nextInt();
    //tersten de düzdende aynı olan sayılar

        String mesaj="";
        int rakam=0;
        int fake=sayi;
        while (sayi>0){
            rakam=sayi%10;
            sayi=sayi/10;
            mesaj=rakam+mesaj;

        }
        System.out.println(mesaj);
        int a=Integer.parseInt(mesaj);
        if (fake==a){
            System.out.println("polidrom");
        }
        else {
            System.out.println("Polidrom değil.");
            System.out.println(fake);
        }
    }
}
