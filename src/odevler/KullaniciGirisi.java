package odevler;

import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        String name,password;
        String gmail="hsn";
        System.out.print("Kullanıcı adgiriniz:");
        name=scanner.nextLine();
        System.out.print("Şifre giriniz:");
        password=scanner.nextLine();

        if (name.equals("hasankara") && password.equals("123")){
            System.out.println("Giriş başarılı.");
        }
        else {
            System.out.println("Giriş başarısız oldu şifrenizi unuttuysanız gmail kullanarak giriş yapabilirsiniz" +
                    ".Giriş yapmak istiyorsanız evet yazın.");
            String giris=scanner.nextLine();
            if (giris.equals("evet")){
                System.out.print("Lütfen gmail yazın.");
                String gmail1=scanner.nextLine();
                if (gmail.equals(gmail1)){
                    System.out.println("Giriş başarılı.Lütfen yeni şifre giriniz.");
                    password=scanner.nextLine();
                    System.out.println("Şifre başarıyla oluşturuldu.");
                }
                else {
                    System.out.println("Yanlış gmail girdniz.");
                }
            }
            else{
                System.out.println("İyi günler");
            }
        }
    }
}
