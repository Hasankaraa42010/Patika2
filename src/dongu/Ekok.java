package dongu;

import java.util.Scanner;

public class Ekok {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen sayı giriniz:");
        int sayi1=scanner.nextInt();
        System.out.println("Lütfen ikinci sayi");
        int sayi2=scanner.nextInt();
        int i=1;

        int ebob=1;
        while (sayi1>=i && sayi2>=i){
        if (sayi1%sayi2==0 ){
            System.out.println(sayi1);
        return;
        }
        else if (sayi2%sayi1==0){
            System.out.println(sayi2);
    return;
        }
        else{
            if (sayi1%i==0 && sayi2%i==0){
                ebob=i;
            }
        }

        i++;
        }

        System.out.println((sayi1*sayi2)/ebob);
    }

}
