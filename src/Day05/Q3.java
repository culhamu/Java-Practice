package Day05;

import java.util.ArrayList;
import java.util.Random;

public class Q3 {
    public static void main(String[] args) {
        /*
        3-kullanıcının istediği büyüklükte diziye 0-100 arası
        rastgele sayılarla doldurup kaçının ortalamanın altında
        ,kaçının ortalamanın üzerinde olduğunu bulan metodu bulunuz
         */
        int[] sayiDizisi=new int[10];
        Random rndm=new Random();

        int toplam=0;
        double ort=(double) toplam/sayiDizisi.length;

        for (int i = 0; i < sayiDizisi.length; i++) {
            sayiDizisi[i]= rndm.nextInt(100);
        }
        for (int i = 0; i < sayiDizisi.length; i++) {
            toplam+=sayiDizisi[i];

        }int ortAlti=0;
        int ortUstu=0;
        for (int i = 0; i < sayiDizisi.length; i++) {
            if (sayiDizisi[i]<ort){
                ortAlti++;
            } else if (sayiDizisi[i]>ort) {
                ortUstu++;

            }

        } System.out.println("Ortalama değer: " + ort);
        System.out.println("Ortalamanın altında olanlar: " + ortAlti);
        System.out.println("Ortalamanın üzerinde olanlar: " + ortUstu);

    }
}
