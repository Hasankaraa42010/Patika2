package Metodlar;

import java.util.Scanner;

public class DeseneGoreMetod {
    static void metot(int n,int temp,boolean down){
        System.out.print(temp+" ");
        if (temp <= 0) {
            down = false;
        }
        temp = down ? temp - 5: temp + 5;
        if (temp <= n) {
            metot(n, temp, down);
        }
    }

    static void desen(int n,int fake,boolean a){
        if (fake<=0){
            a=false;
        }
        if (a=true){
            fake-=5;
        }
        else if (a=false){
            fake+=5;
        }
        if (fake<=n){
            metot(n,fake,a);
        }
    }








    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("N sayısı: ");
        int n = input.nextInt();
        System.out.print("Çıktısı: ");
        desen(n,n,true);

    }

}
