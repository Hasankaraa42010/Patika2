package BitirmeProjesi;

import com.sun.jdi.Value;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    void diziOlusturma(String dizi[][]){
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[0].length; j++) {
                dizi[i][j]="-";
            }

        }
    }

   public void run(int uzunluk,int yukseklik){
        String dizi[][]=new String[uzunluk][yukseklik];
        //Random random=new Random();
       Scanner scanner=new Scanner(System.in);
        boolean kontrol=true;
        int toplam=0;
        int cizgiVeBomba=0;
        int mayin=(uzunluk*yukseklik)/4;

       /* for (int i = 0; i <dizi.length; i++) {
            for (int j = 0; j < dizi[0].length; j++) {
                if (mayin!=0){
                int ran=random.nextInt(3);
                if (ran==1){
                    dizi[i][j]="*";
                    mayin--;


                }
                else {
                    dizi[i][j]="-";
                } }
                else {
                    dizi[i][j]="-";
                }
            }

        }*/


        String fake[][]=new String[uzunluk][yukseklik];
       diziOlusturma(fake);
       diziOlusturma(dizi);
       bomba(dizi);
       for (int i = 0; i < dizi.length; i++) {
           for (int j = 0; j < dizi[0].length; j++) {
               System.out.print(dizi[i][j]);
           }
           System.out.println();
       }
       while(kontrol){
           System.out.print("Kaçıncı satır");
           int satir=scanner.nextInt();
           System.out.print("Kacıncı sutun:");
           int sutun=scanner.nextInt();
           if (satir> dizi.length-1 || satir<0 ||sutun> dizi[0].length || sutun<0){
               System.out.println("İndekslerin dışında lütfen duzgun gir" +
                       "");
           }

           else if (dizi[satir][sutun].equals("*")){
               System.out.println("Game over");
               return;
           }
           else{
               if (satir==0 && sutun==0){
                   if (dizi[satir+1][sutun+1].equals("*")){
                       toplam++;
                   }
                   if (dizi[satir][sutun+1].equals("*")){
                       toplam++;
                   }
                   if (dizi[satir+1][sutun].equals("*")){
                       toplam++;
                   }
               }
               else if(satir==0 && sutun==dizi[0].length-1){
                   if (dizi[satir+1][sutun-1].equals("*")){
                       toplam++;
                   }
                   if (dizi[satir][sutun-1].equals("*")){
                       toplam++;
                   }
                   if (dizi[satir+1][sutun].equals("*")){
                       toplam++;
                   }
               }
               else if (satir==dizi.length-1 && sutun==0){
                   if (dizi[satir-1][sutun+1].equals("*")){
                       toplam++;
                   }
                   if (dizi[satir-1][sutun].equals("*")){
                      toplam++;
                   }
                   if (dizi[satir][sutun+1].equals("*")){
                       toplam++;
                   }
               }
               else if (satir==dizi.length-1 && sutun==dizi[0].length-1){
                   if (dizi[satir-1][sutun-1].equals("*")){
                       toplam++;
                   }
                   if (dizi[satir-1][sutun].equals("*")){
                       toplam++;
                   }
                   if (dizi[satir][sutun-1].equals("*")){
                       toplam++;
                   }
               }
               else if (satir==0 && sutun!=0 && sutun!=dizi[0].length-1){
                   if (dizi[satir][sutun-1].equals("*")){
                       toplam++;
                   }
                   if (dizi[satir][sutun+1].equals("*")){
                       toplam++;
                   }
                   if (dizi[satir+1][sutun].equals("*")){
                       toplam++;
                   }
                   if (dizi[satir+1][sutun+1].equals("*")){
                       toplam++;
                   }
                   if (dizi[satir+1][sutun+1].equals("*")){
                       toplam++;
                   }

               }
               else if (satir!=0 && sutun==dizi[0].length-1 && satir!= dizi.length-1){
                   if (dizi[satir-1][sutun].equals("*")){
                       toplam++;
                   }
                   if (dizi[satir-1][sutun-1].equals("*")){
                       toplam++;
                   }
                   if (dizi[satir][sutun-1].equals("*")){
                       toplam++;
                   }
                   if (dizi[satir+1][sutun-1].equals("*")){
                       toplam++;
                   }
                   if (dizi[satir+1][sutun].equals("*")){
                       toplam++;
                   }
               }
               else if (satir== dizi.length-1 && sutun!=0 && sutun!=dizi[0].length-1){
                   if (dizi[satir][sutun-1].equals("*")){
                       toplam++;
                   }
                   if (dizi[satir-1][sutun-1].equals("*")){
                       toplam++;
                   }
                   if (dizi[satir-1][sutun].equals("*")){
                       toplam++;
                   }
                   if (dizi[satir-1][sutun+1].equals("*")){
                       toplam++;
                   }

                   if (dizi[satir][sutun+1].equals("*")){
                       toplam++;
                   }
               }
               else if (satir!=0 && satir!= dizi.length-1 && sutun==0 ){
                   if (dizi[satir-1][sutun].equals("*")){
                       toplam++;
                   }
                   if (dizi[satir-1][sutun+1].equals("*")){
                       toplam++;
                   }
                   if (dizi[satir][sutun+1].equals("*")){
                       toplam++;
                   }
                   if (dizi[satir+1][sutun+1].equals("*")){
                       toplam++;
                   }
                   if (dizi[satir+1][sutun].equals("*")){
                       toplam++;
                   }
               }
               else {
                   if (dizi[satir-1][sutun].equals("*")){
                       toplam++;
                   }
                   if (dizi[satir-1][sutun+1].equals("*")){
                       toplam++;
                   }
                   if (dizi[satir][sutun+1].equals("*")){
                       toplam++;
                   }
                   if (dizi[satir+1][sutun+1].equals("*")){
                       toplam++;
                   }
                   if (dizi[satir+1][sutun].equals("*")){
                       toplam++;
                   }
                   if (dizi[satir+1][sutun-1].equals("*")){
                       toplam++;
                   }
                   if (dizi[satir][sutun-1].equals("*")){
                       toplam++;
                   }
                   if (dizi[satir-1][sutun-1].equals("*")){
                       toplam++;
                   }
               }
               String fakeToplam= String.valueOf(toplam);
               fake[satir][sutun]=fakeToplam;
               toplam=0;
               for (int i = 0; i < fake.length; i++) {
                   for (int j = 0; j < fake[0].length; j++) {
                       System.out.print(fake[i][j]);

                   }
                   System.out.println();
               }
           }
           cizgiVeBomba++;
           if (cizgiVeBomba+mayin==uzunluk*yukseklik){
               System.out.println("Oyunu kazandınız");
               return;
           }
       }
    }
    void bomba(String dizi[][]){
        Random random=new Random();

        int bomba=(dizi.length*dizi[0].length)/4;
        for (int i = 0; i < bomba; i++) {
            int randomi= (int) (Math.random()* dizi.length);
            int randomj=(int) (Math.random()* dizi[0].length);
            if (!(dizi[randomi][randomj].equals("*"))){
                dizi[randomi][randomj]="*";
            }
            else i--;
        }
    }
}
