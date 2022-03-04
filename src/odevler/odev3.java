package odevler;

import java.util.Scanner;

public class odev3 {
    public static void main(String[] args){
        //3 kenarı verilen üçgenin alanını hesaplayan program
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen birinci kenarı verin");
        int kenar1=scanner.nextInt();
        System.out.println("Lütfen ikinci kenarı verin");
        int kenar2=scanner.nextInt();
        System.out.println("Lütfen üçüçcü kenarı verin");
        int kenar3=scanner.nextInt();
        int u=(kenar1+kenar2+kenar3)/2;
        double alan=u*(u-kenar1)*(u-kenar3)*(u-kenar2);
        double m= Math.sqrt(alan);
        System.out.println(m);
    }
}
