package dongu;

import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
        String userName, password;
        Scanner input = new Scanner(System.in);
        int right = 3;
        int balance = 1500;
        int select;
            while (right!=0){
                System.out.print("Kullanıcı Adınız :");
                  userName = input.nextLine();
                 System.out.print("Parolanız : ");
                 password = input.nextLine();
                if (userName.equals("hasan") && password.equals("123")) {
                         System.out.println("Merhaba, Kodluyoruz Bankasına Hoşgeldiniz!");
                    System.out.println("1-Para yatırma\n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye Sorgula\n" +
                            "4-Çıkış Yap");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                    select = input.nextInt();
                    switch (select){
                        case 1:
                            System.out.println("Lütfen kac tl yatırmak istediğinizi yazın:");
                            int para=input.nextInt();
                            balance+=para;
                            System.out.println("BAKİYENİZ:"+balance);
                            right=0;
                            break;
                        case 2:
                        System.out.println("Lütfen kac tl çekmek istediğinizi yazın:");
                        para=input.nextInt();
                            if (para > balance) {
                                System.out.println("Bakiye yetersiz.");
                            } else {
                                balance-=para;
                            }
                            System.out.println("BAKİYENİZ:"+balance);
                            right=0;
                            break;

                        case 3:
                            System.out.println("Bakiyeniz:"+balance);
                            right=0;
                            break;
                        case 4:
                            System.out.println("Çıkış yapılıyor...");
                            return;
                        default:
                            System.out.println("HATALI İŞLEM YAPTINIZ:");
                            break;
                    }

                }
                else{
                    //if (right==0){
                    //    System.out.println("Kart bloke olmuştur.Lütfen banka ile iletişime geçiniz.");
                    //    break;
                   // }
                    System.out.println("Bilgiler yanlış Lütfen tekrar deneyin.");
                    right--;
                    System.out.println("Kalan hakkınız:"+right);
                }
            }


        //
    }
}
