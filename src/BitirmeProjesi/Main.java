package BitirmeProjesi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MineSweeper mineSweeper=new MineSweeper();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen satır sayısını giriniz:");
        int satir=scanner.nextInt();
        System.out.println("Lütfen sutun sayısını giriniz:");
        int sutun=scanner.nextInt();
        mineSweeper.run(satir,sutun);
    }
}
