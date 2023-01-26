package day08;

import java.util.Scanner;

public class Q01_BirimDonusturucu {
    public static void main(String[] args) {
        /*
        // Saati saniyeye, mil'i kilometreye, kilogrami gram'a
        // ceviren bir method yaziniz.
        // Bu methodu main methodun disinda olusturup main methodun
        // icinden cagiriniz.
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("dönüştürmek istediğiniz birimi giriniz:\n=>Saat\n=>Mil\n=>Kg");
        String birim=scan.nextLine().toLowerCase();
        System.out.println("dönüştürmek istediğiniz birimin miktarınıngiriniz");
        Double miktar=scan.nextDouble();

        donusturucu(birim,miktar);
        donusturucu("saat",15.0);
        donusturucu("kg",25.5);
        donusturucu("mil",36.4);
        donusturucu("birim",45.8);
        donusturucu("saat",14.3);
    }

    private static void donusturucu(String brm, Double mktr) {

        switch (brm){

            case "saat":
                System.out.println(mktr+" saat "+mktr*60*60+" saniyedir");
                break;
            case "mil":
                System.out.println(mktr+" mil "+mktr*1.6+" kilometredir");
                break;
            case "kg":
                System.out.println(mktr+" kg "+mktr*1000+" gram dır");
                break;
            default:
                System.out.println("istenilenler dışında bir değer girdiniz");
        }

    }
}
