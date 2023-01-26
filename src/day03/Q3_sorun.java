package day03;

public class Q3_sorun {
    public static void main(String[] args) {
        int sayi=1453;
        int basamaksayisi=0;
        while (sayi>0){
            sayi=sayi/10;
            basamaksayisi++;
        }
        System.out.println(basamaksayisi);
    }
}
