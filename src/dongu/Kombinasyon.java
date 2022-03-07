package dongu;

import java.util.Scanner;

public class Kombinasyon {
    public static void main(String[] args) {
        // write your code here
        Scanner input=new Scanner(System.in);
        int n, r;
        int nFac = 1, rFac = 1, nrFac = 1;
        System.out.println("C(n,r)");
        System.out.print("n'yi giriniz: ");
        n = input.nextInt();
        System.out.print("r'yi giriniz: ");
        r = input.nextInt();

        for (int i = 1; i <= n; i++) {
            nFac *= i;
        }
        for (int i = 1; i <= r; i++) {
            rFac *= i;
        }
        for (int i = 1; i <= n-r; i++) {
            nrFac *= i;
        }
        System.out.println(nFac/(rFac*nrFac));

    }
    }


