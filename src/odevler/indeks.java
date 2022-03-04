package odevler;

import java.util.Scanner;

public class indeks {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen boyunuzu girin:");
        double boy=scanner.nextDouble();
        System.out.println("Lütfen kilonuzu girin:");
        double kilo=scanner.nextDouble();
        double indeks=kilo/(boy*boy);
        System.out.println(indeks);
    }
}
