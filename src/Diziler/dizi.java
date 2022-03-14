package odevler;

public class dizi {
    public static  void main(String[] args){
        int diziler[]={10, 20, 20, 10, 10, 20, 5, 20,7};
        int diziler2[]=new int[diziler.length];
        int toplam=0;
        boolean b=false;
        for (int j=0; j<diziler.length;j++){
            for (int dizi : diziler ) {
                if (diziler[j] == dizi) {
                    toplam++;
                }
            }

            for (int i = 0; i <j+1; i++) {
                if (diziler[j]==diziler2[i]){
                    b=false;
                    break;
                }
                else if(diziler[j]!=diziler2[i]){
                    b=true;
                }
            }
            diziler2[j]=diziler[j];

            if (b==true){
                System.out.println(diziler[j]+". sayısı "+toplam+" defa geçti.");

            }
            b=false;
            toplam=0;

        }
    }
}
