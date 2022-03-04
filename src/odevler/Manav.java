package odevler;

import java.util.Scanner;

public class Manav {
    //Armut : 2,14 TL
    //Elma : 3,67 TL
    //Domates : 1,11 TL
    //Muz: 0,95 TL
    //Patlıcan : 5,00 TL
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double armut=2.14;
        System.out.println("Armut:"+armut);
        double Elma=3.67;
        System.out.println("Elma:"+Elma);
        double Domates=1.11;
        System.out.println("Domates:"+Domates);
        double Muz=0.95;
        System.out.println("Muz"+Muz);
        double Patlıcan=5;
        System.out.println("Patlıcan:"+Patlıcan);
        System.out.print("Kaç kilo armut?");
        int armutkg=scanner.nextInt();
        System.out.print("Kaç kilo Elma?");
        int Elmakg=scanner.nextInt();
        System.out.print("Kaç kilo Domates?");
        int Domateskg=scanner.nextInt();
        System.out.print("Kaç kilo Muz?");
        int Muzkg=scanner.nextInt();
        System.out.print("Kaç kilo Patlıcan?");
        int Patlıcankg=scanner.nextInt();
        double toplamTutar=(armut*armutkg)+(Elma*Elmakg)+(Domates+Domateskg)+(Muz*Muzkg)+(Patlıcan*Patlıcankg);
        System.out.println("Toplam tutar:"+toplamTutar);

    }
}