package OkulProje;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AnaMenu {
    Scanner scan=new Scanner(System.in);
    void menu() throws InterruptedException {
        System.out.println(" ====================================\n" +
                "    ÖĞRENCİ VE ÖĞRETMEN YÖNETİM PANELİ\n" +
                "   ====================================\n" +
                "    1- ÖĞRENCİ İŞLEMLERİ\n" +
                "    2- ÖĞRETMEN İŞLEMLERİ\n" +
                "    Q- ÇIKIŞ\n"+
                "    SECİMİNİZ: ");
        try {
            int secim=scan.nextInt();
            switch (secim){
                case 1:{
                    OgrenciIslemler ogrenciMenu=new OgrenciIslemler();
                }
                case 2:{
                    OgretmenIslemler ogretmenMenu=new OgretmenIslemler();
                }

            }
        }catch (InputMismatchException e){
            String secim=scan.next();
            if (secim.equalsIgnoreCase("q")){
                System.out.println("SİSTEMDEN ÇIKILIYOR");
                System.exit(0);
            }else {
                System.out.println("HATALI GİRİŞ YAPTINIZ");
                Thread.sleep(2000);
                menu();
            }
        }
    }

}
