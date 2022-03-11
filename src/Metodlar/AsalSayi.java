package Metodlar;

import java.util.Scanner;

public class AsalSayi {
    static boolean asal(int n){
        boolean a=false;
        for (int i = 2; i <n ; i++) {
            if (n%i==0){
            a=true;
            }

        }
        return a;
    }
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Sayı kaç;");
        int sayi=scanner.nextInt();
        if (asal(sayi)==false){
            System.out.println("Sayi asaldır");
        }
        else
        {
            System.out.println("değil.");
        }
    }
    }

