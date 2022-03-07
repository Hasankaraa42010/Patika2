package odevler;

import java.util.Scanner;

public class DersGecme {public static  void main(String[] args){
    Scanner scanner=new Scanner(System.in);


    System.out.print("Matematik notu:");
    int mat=scanner.nextInt();
    if (mat>100 || mat<0){
        System.out.println("Geçersiz not giriş.");
        mat=0;
    }
    System.out.print("turkce notu:");
    int turkce=scanner.nextInt();
    if (turkce>100 || turkce<0){
        System.out.println("Geçersiz not giriş.");
        turkce=0;
    }
    System.out.print("kimya  notu:");
    int kimya=scanner.nextInt();
    if (kimya>100 || kimya<0){
        System.out.println("Geçersiz not giriş.");
        kimya=0;
    }
    System.out.print("fizik notu:");
    int fizik=scanner.nextInt();
    if (fizik>100 || fizik<0){
        System.out.println("Geçersiz not giriş.");
        fizik=0;
    }
    System.out.print("muzik notu:");
    int muzik=scanner.nextInt();
    if (muzik>100 || muzik<0){
        System.out.println("Geçersiz not giriş.");
        muzik=0;
    }
    double ortalama=(mat+fizik+muzik+kimya+turkce)/5;
    if (ortalama>=55){
        System.out.println("Öğrenci "+ortalama+" notu ile başarıyla geçti" );
    }
    else {
        System.out.println("Öğrenci "+ortalama+" notu ile kaldı." );
    }
}

}
