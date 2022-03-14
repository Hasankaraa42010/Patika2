package Diziler;

import java.util.Scanner;

public class DiziSiralama {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Kaç boyutlu bir dizi girceksiniz.");
        int boyut=scanner.nextInt();
        int dizi[]=new int[boyut];
        int fake[]=new int[boyut];

        for (int i = 0; i <boyut ; i++) {
            System.out.println("Lütfen "+(i+1)+". sayıyı girin:");
            dizi[i]=scanner.nextInt();

        }
        int enKucuk=dizi[0];
        int enBuyuk=dizi[0];
        int fakeKucuk=0;
        int fakeBuyuk=0;
        for (int m = 0; m < dizi.length; m++) {
            for (int i = 0; i < dizi.length; i++) {
                if (enKucuk>dizi[i]){
                    enKucuk=dizi[i];

                   fakeKucuk=i;
                }
                if (enBuyuk<dizi[i]){
                    enBuyuk=dizi[i];
                  fakeBuyuk=i;
                }

            }

            fake[m]=enKucuk;
            dizi[fakeKucuk]=enBuyuk;
            enKucuk=enBuyuk;
        }
        for (int i = 0; i < fake.length; i++) {
            System.out.println(fake[i]);
        }

    }
}
