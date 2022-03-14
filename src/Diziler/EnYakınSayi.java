package Diziler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class EnYakınSayi {
    public static void main(String[] args) {
        int dizi[]={5,-12,852,6,1,89};
        Arrays.sort(dizi);
        System.out.println(Arrays.toString(dizi));
        System.out.println("Sayı giriniz:");
        Scanner scanner=new Scanner(System.in);
        int sayi=scanner.nextInt();
        int altIndeks=0;
        int ustIndeks=0;
        boolean a=true;

        for (int i = 0; i <dizi.length ; i++) {
            if (sayi>dizi[dizi.length-1]){
                System.out.println("Sayı en buyuk sayıdan bile büyük");
                a=false;
                break;

            }
            else if (sayi<dizi[0]){
                System.out.println("Sayı en kucuk sayıdan bile kucuk");
                a=false;
                break;
            }
            else if (sayi>=dizi[i] && sayi<dizi[i+1]){
                altIndeks=dizi[i];
                ustIndeks=dizi[i+1];
                break;
            }






        }
        if (a){
            System.out.println(altIndeks);
            System.out.println(ustIndeks);
        }

    }
}
