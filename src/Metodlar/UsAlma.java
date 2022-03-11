package Metodlar;

import java.util.Scanner;

public class UsAlma {
    public static int us(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Sayı kaç;");
        int sayi=scanner.nextInt();
        System.out.println("üSTÜ KAÇ:");
        int us=scanner.nextInt();
        int fake=sayi;
        for (int i = 1; i <us ; i++) {
            fake=fake*sayi;
        }
        return fake;
    }
    public static int us1 (int x,int y){
        if (y==0){
            return 1;
        }
        return us1(x,y-1)*x;
    }
    public static void main(String[] args){
        System.out.println(us1(5,4));
    }
}
