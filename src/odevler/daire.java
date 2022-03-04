package odevler;

import java.awt.datatransfer.SystemFlavorMap;
import java.util.Scanner;

public class daire {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen dairenin kenan uzunluğunu girin:");
        double kenar = scanner.nextDouble();
        System.out.print("Lütfen dairenin adilimim derecesini girin girin:");
        //Formül : (𝜋 * (r*r) * 𝛼) / 360
        double dilim=scanner.nextDouble();
        double alan=(Math.PI*(kenar*kenar)*dilim)/360;
        System.out.println("Daire diliminin alanı:"+alan);
    }
}