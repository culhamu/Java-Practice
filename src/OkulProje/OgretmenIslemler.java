package OkulProje;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class OgretmenIslemler implements IIslemler{
    Scanner scan=new Scanner(System.in);
    static int sicilNo=1000;
    List<Ogretmen> ogretmenList=new ArrayList<>();
    void ogretmenMenu() throws InterruptedException {
        System.out.println("   ============= İŞLEMLER =============\n" +
                "       1-EKLEME\n" +
                "       2-ARAMA\n" +
                "       3-LİSTELEME\n" +
                "       4-SİLME\n" +
                "       Q-ÇIKIŞ\n" +
                "   SEÇİMİNİZ:");

        try {
            int secim=scan.nextInt();
            switch (secim){
                case 1:{
                    ekleme();
                }
                case 2:{
                    arama();
                }
                case 3:{
                    listeleme();
                }
                case 4:{
                    silme();
                }
            }
        }catch (InputMismatchException e){
            String secim=scan.next();
            if (secim.equalsIgnoreCase("q")){
                AnaMenu anaMenu=new AnaMenu();
                anaMenu.menu();
            }else {
                System.out.println("HATALI GİRİŞ YAPTINIZ");
                ogretmenMenu();
            }
        }
    }




    @Override
    public void ekleme() {
        scan.next();
        System.out.print("Öğretmen adını giriniz: ");
        String ad=scan.nextLine();
        System.out.println("Öğretmen soyadını giriniz: ");
        String soyad=scan.nextLine();
        System.out.println("Öğretmen TCNO yu giriniz: ");
        String tcNo=scan.nextLine();
        System.out.println("Öğretmen yasını giriniz: ");
        int yas=scan.nextInt();
        System.out.println("Öğretmen bölümünü giriniz: ");
        String bolum=scan.nextLine();
        Ogretmen ogretmen=new Ogretmen(ad,soyad,tcNo,yas,bolum,sicilNo++);
        ogretmenList.add(ogretmen);
    }

    @Override
    public void arama() {

    }

    @Override
    public void listeleme() {

    }

    @Override
    public void silme() {

    }
}
