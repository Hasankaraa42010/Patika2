package Diziler;

import java.util.Scanner;

public class Palindromik {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Kelimeyi giriniz:");
        String kelime=scanner.nextLine();
        String deger="";
        for (int i = 0; i < kelime.length(); i++) {
           deger+=kelime.charAt(kelime.length()-(i+1));
        }
        if (deger.equals(kelime)){
            System.out.println("Palindromik");
        }
        else {
            System.out.println("Değil.");
        }
    }
}
