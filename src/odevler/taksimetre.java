package odevler;

import java.util.Scanner;

public class taksimetre {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Lütfen kilometreyi girin:");
        double km=scanner.nextDouble();
        double fiyat=10;
        fiyat=fiyat+km*2.20;
        if (fiyat<20){
            fiyat=20;

        }
        System.out.println("Borç="+fiyat);
    }
}
