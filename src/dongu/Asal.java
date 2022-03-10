package dongu;

import java.util.Scanner;

public class Asal {
    public static void main(String[] args) {
       boolean a=false;


        for (int i = 2; i <100 ; i++) {
            for (int j = 2; j <i ; j++) {
                if (i%j==0){
                    a=true;
                }

            }
            if (a==false){
                System.out.println(i);
            }

        a=false;
        }

    }
}
