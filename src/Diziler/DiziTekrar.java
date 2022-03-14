package Diziler;

import java.lang.reflect.Array;
import java.util.Arrays;

public class DiziTekrar {
    static boolean kontrol(int dizi[], int deger) {
        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i] == deger) {
                return true;
            }

        }
        return false;
    }

    public static void main(String[] args) {
        int dizi[] = {1, 5, 2, 3, 6, 2, 7, 9, 8, 7, 4, 5, 6, 4,};
        int fakeDizi[] = new int[dizi.length];
        Arrays.sort(dizi);
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi.length; j++) {
                if (dizi[i] == dizi[j] && i != j && !kontrol(fakeDizi,dizi[j])) {
                    fakeDizi[j] = dizi[j];
                }
            }

        }
        Arrays.sort(fakeDizi);
        System.out.println(Arrays.toString(fakeDizi));
        for (int i = 0; i < fakeDizi.length; i++) {
            if (fakeDizi[i] != 0 && fakeDizi[i] % 2 == 0 ) {
                System.out.println(fakeDizi[i]);
            } }
    }
}

