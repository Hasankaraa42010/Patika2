package dongu;

import java.util.Scanner;

public class YakinKuvvet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Program Başladı");
        int sinir;
        System.out.print("Lütfen bir sınır sayısı belirleyin : ");
        sinir = input.nextInt();
        double sonuc4,sonuc5;
        for (int i=1,j=1;i<sinir && j<sinir ;i*=4 ,j*=5) {
            System.out.println(i);
            System.out.println(j);
        }
        System.out.println("Program Bitti");
    }
}
