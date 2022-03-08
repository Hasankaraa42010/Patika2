package dongu;

import java.util.Scanner;

public class TersUcgen {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner=new Scanner(System.in);
        System.out.println("Basamk sayısı");
        int sayi=scanner.nextInt();
        int k=0;
        for (int i = 1; i <= sayi; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = sayi*2+1; j >= 2*i+1; j--) {
                System.out.print("*");
            }

            System.out.println("");
        }

        }




    }

