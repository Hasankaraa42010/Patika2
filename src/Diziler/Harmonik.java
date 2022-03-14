package Diziler;

public class Harmonik {
    public static void main(String[] args) {
        double dizi[]={1,2,3,4,5,1};
        double harmon = 0;
        for (double eleman:dizi)
        {
            double sayi=1/eleman;
           ;
            harmon= harmon+sayi;
        }
        System.out.println(dizi.length/harmon);

    }
}
