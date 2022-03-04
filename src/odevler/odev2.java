package odevler;

import java.util.Scanner;

public class odev2 {
    public static void main(String[] args){
        //kdv oranı hesaplayan program
        Scanner scanner=new Scanner(System.in);
        double kdv = 0;
        System.out.println("Lütfen ürünün fiyatını girin");
        double fiyat=scanner.nextDouble();
        if (fiyat>=1000){
            kdv=8;
            
        }
        else if (fiyat<1000){
            kdv=18;
        }
        fiyat=fiyat*(100+kdv)/100;
        System.out.println("Ürünün kdvli fiyatı:"+fiyat);
    }
}
