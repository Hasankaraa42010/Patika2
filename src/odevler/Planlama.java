package odevler;

import java.util.Scanner;

public class Planlama {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Hava sıcaklığınmı giriniz:")
        ;
        int hava=scanner.nextInt();
        while (hava<5){
            System.out.println("kayak");
            break;
        }
        while (hava>=5 && hava<15){
            System.out.println("Sinema");
            break;
        }
        while (hava<25 && hava>=15){
            System.out.println("piknik");
            break;
        }
        while (hava>=25){
            System.out.println("yüzme");
            break;
        }

    }
}
