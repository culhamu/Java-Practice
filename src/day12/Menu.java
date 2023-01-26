package day12;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    /*
    ============= İŞLEMLER =============
		 1-EKLEME
		 2-ARAMA
		 3-LİSTELEME
		 4-SİLME
		 Q-ÇIKIŞ
	SEÇİMİNİZ:
     */
    static int numara=1000;
    Scanner scan=new Scanner(System.in);

    ArrayList<Ogrenci> ogrenciList=new ArrayList<>();
    void menu(){
        System.out.println("  ============= İŞLEMLER =============\n" +
                "\t\t 1-EKLEME\n" +
                "\t\t 2-ARAMA\n" +
                "\t\t 3-LİSTELEME\n" +
                "\t\t 4-SİLME\n" +
                "\t\t Q-ÇIKIŞ\n" +
                "\tSEÇİMİNİZ:");
        try {
            int secim=scan.nextInt();
            switch (secim){

                case 1:{
                    ekleme();

                }
                case 2:{
                    System.out.println("ARANACAK TC NOYU GİRiNİZ");
                    arama(scan.next());
                }
                case 3:{
                    listeleme();
                }
                case 4:{
                    silme();
                } default:{
                    System.out.println("HATALI DEĞER GİRDİNİZ");
                }
            }
        }catch (InputMismatchException e){

            String islem=scan.next();
            if (islem.equalsIgnoreCase("q")){
                System.out.println("*******SİSTEMDEN ÇIKILIYOR********");
                System.exit(0);
            }else {
                System.out.println("HATALI GİRİŞ");
                menu();
            }
        }
    }

    private void silme() {
        System.out.println("SİLİNECEK TCNO YU GİRİNİZ: ");
        String tcNo=scan.next();
        for (int i = 0; i < ogrenciList.size(); i++) {
            if (ogrenciList.get(i).getTcNO().equals(tcNo)){
                ogrenciList.remove(i);
                listeleme();
                menu();
            }else {
                System.out.println("BU TC NO YA AİT ÖĞRENCİ YOKTUR");
                menu();
            }

        }
    }

    private void listeleme() {
        for (Ogrenci each:ogrenciList) {
            System.out.println(each);
            System.out.println("");
        }
    }

    private void arama(String tcNo) {
        for (Ogrenci each:ogrenciList) {

            if (each.getTcNO().equals(tcNo)){
                System.out.println("ARANAN ÖĞRENCİ = "+each);
                menu();

            }else {
                System.out.println(tcNo+" BU TC NOYA AİT ÖĞRENCİ YOKTUR!!!");
                menu();
            }
        }

    }

    private void ekleme() {
        scan.nextLine();
        System.out.print("ÖĞRENCİNİN ADI : ");
        String ad=scan.nextLine();
        System.out.print("ÖĞRENCİNİN SOYADI : ");
        String soyad=scan.nextLine();
        System.out.print("ÖĞRENCİNİN TCNO : ");
        String tcno=tcNoKontrol(scan.next());
        System.out.print("ÖĞRENCİNİN YAŞI : ");
        String yas=tcNoKontrol(scan.next());
        System.out.print("ÖĞRENCİNİN SINIFI : ");
        String sinif=tcNoKontrol(scan.next());
        Ogrenci ogrenci=new Ogrenci(ad,soyad,tcno,yas,++numara,sinif);
        ogrenciList.add(ogrenci);
        for (Ogrenci each:ogrenciList) {
            System.out.println(each);
        }


    }

    private String tcNoKontrol(String tcNo) {
        String tcNoArr[]=tcNo.split("");
        boolean kontrol=true;
        for (String each:tcNoArr) {
            if (!Character.isDigit(each.charAt(0))){
                kontrol=false;

            }
        }if (!kontrol){
            System.out.println("GİRİLEN TC NO HATALI");
            tcNoKontrol(scan.next());
            //menu();
        }return tcNo;

    }
}
