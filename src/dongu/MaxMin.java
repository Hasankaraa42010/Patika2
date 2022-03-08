package dongu;

import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner=new Scanner(System.in);
        System.out.println("Sayı giriniz:");
        System.out.println("Kaç tane sayı gireceksiz:");
        int uzunluk=scanner.nextInt();
        int [] dizi=new int[uzunluk];
        for (int i = 0; i < dizi.length; i++) {
            System.out.println((i+1)+".sayıyı girin:");
            dizi[i]=scanner.nextInt();
        }
        boolean a=true;
        int enbuyuk=dizi[0];
        int enKucuk=dizi[0];
        for (int i = 0; i < dizi.length ; i++) {
            if (enbuyuk<dizi[i]){
                enbuyuk=dizi[i];
            }
            if (enKucuk>dizi[i]){
                enKucuk=dizi[i];
            }
        }
        System.out.println(" enbuyuk:"+enbuyuk);
        System.out.println("enkucuk:"+enKucuk);
    }
}
