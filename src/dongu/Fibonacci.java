package dongu;

public class Fibonacci {
    public static void main(String[] args) {
        // write your code here
        //9 Elemanlı Fibonacci Serisi : 0 1 1 2 3 5 8 13 21 34
        int toplam=1;
        int toplam2=1;
        System.out.println("0");
        System.out.println("1");
        for (int i = 0; i <4 ; i++) {
            System.out.println(toplam2);
            toplam=toplam+toplam2;
            System.out.println(toplam);
            toplam2=toplam2+toplam;

        }


    }
    }
