package day09;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class Q2_Atm {
    static int sifre=1234;
    static   int bakiye=500;
    public static void main(String[] args) {
        /*
        ATM
Kullanicidan giriş için kart numarasi ve şifresini isteyin,
 eger herhangi birini yanlis girerse tekrar isteyin
 .Kart numarasi aralarda boşluk ile girerse de eger doğruysa kabul edin.
 Kart numarasi ve sifre dogrulanirsa kullanicinin yapabileceği işlemleri
  ekrana yazdirin,
Menu listesinde Bakiye sorgula, para yatirma, para çekme, para gönderme,
 sifre değiştirme ve cikis islemleri olacaktır.
Para çekme ve para gonderme işleminde mevcut bakiyeden
buyuk para çekilemez,
Para gönderme işleminde istenen iban TR ile baslamali ve
toplam 26 karakterli olmali, eger değilse menü ekraninageri donsun.
Sifre değiştirme işleminde mevcut şifreyi teyit ettikten sonra,
 sifre değişiklik işlemini yapmali,
         */
        Scanner scan=new Scanner(System.in);
        String kartno="";
        while (kartno.length()!=16){
            System.out.println("kart numaranızı giriniz");
            kartno=scan.nextLine();
            kartno=kartno.replaceAll("\\D","");
        } System.out.println("sifrenizi giriniz");
        sifre=scan.nextInt();
        while (sifre!=1234){
            System.out.println("sifrenizi giriniz");
            sifre=scan.nextInt();
        }
        List<String> islemler=new ArrayList<>(Arrays.asList("1-Bakiye Sorgula","2-Para Yatırma","3-Para Cekme","4-Para Gonderme",
                "5-Sifre Degistirme","6-Cıkıs"));
        menu(islemler);
    }public static void menu(List<String> islemler){
        Scanner scan=new Scanner(System.in);
        System.out.println("Yapmak istediginiz islemi giriniz"+"\n-------MENU-------");
        for (int i = 0; i <islemler.size() ; i++) {
            System.out.println(islemler.get(i)+" ");
        }
        int islem=scan.nextInt();
        if (islem==1){
            System.out.println("bakiyeniz :"+bakiye);
            System.out.println(" devam etmek istiyormusunuz?  E/H");
            char secim=scan.next().charAt(0);
            if (secim=='e' || secim=='E'){
                menu(islemler);
            }else
                System.out.println("İYİ GUNLER");
        } else if (islem==2) {
            System.out.println("yatırmak istediğiniz tutarı giriniz");
            int tutar=scan.nextInt();
            bakiye+=tutar;
            System.out.println("bakiyeniz :"+bakiye);
            System.out.println(" devam etmek istiyormusunuz?  E/H");
            char secim=scan.next().charAt(0);
            if (secim=='e' || secim=='E'){
                menu(islemler);
            }else
                System.out.println("İYİ GUNLER");
        } else if (islem==3) {
            System.out.println("cekmek istediğiniz tutarı giriniz");
            int cekme=scan.nextInt();
            if (cekme>bakiye){
                System.out.println("bakiye yetersiz");
                System.out.println(" devam etmek istiyormusunuz?  E/H");
                char secim=scan.next().charAt(0);
                if (secim=='e' || secim=='E'){
                    menu(islemler);
                }else
                    System.out.println("İYİ GUNLER");
            }else {
                bakiye-=cekme;
                System.out.println("bakiyeniz :"+bakiye);
                System.out.println(" devam etmek istiyormusunuz?  E/H");
                char secim=scan.next().charAt(0);
                if (secim=='e' || secim=='E'){
                    menu(islemler);
                }else
                    System.out.println("İYİ GUNLER");
            }
        } else if (islem==4) {
            System.out.println("göndermek istediğiniz kisinin ibanını giriniz");
            String iban=scan.next();
            if (!(iban.startsWith("TR") && iban.length()==26)){
                System.out.println("hatalı iban");
                menu(islemler);
            }else {
                System.out.println("göndermek istediginiz tutarı giriniz");
                int gonder = scan.nextInt();
                if (gonder > bakiye) {
                    System.out.println("yetersiz bakiye");
                    System.out.println(" devam etmek istiyormusunuz?  E/H");
                    char secim=scan.next().charAt(0);
                    if (secim=='e' || secim=='E'){
                        menu(islemler);
                    }else
                        System.out.println("İYİ GUNLER");
                } else {
                    bakiye -= gonder;
                    System.out.println("bakiyeniz :" + bakiye);
                    System.out.println(" devam etmek istiyormusunuz?  E/H");
                    char secim=scan.next().charAt(0);
                    if (secim=='e' || secim=='E'){
                        menu(islemler);
                    }else
                        System.out.println("İYİ GUNLER");
                }
            }
        } else if (islem==5) {
            int eskisifre=0;
            while (eskisifre!=sifre){
                System.out.println("eski sifreniz");
                eskisifre=scan.nextInt();
            }
            System.out.println("yeni sifreniz");
            int yenisisfre=scan.nextInt();
            sifre=yenisisfre;
            System.out.println("sifre degistirme basarili");
            System.out.println(" devam etmek istiyormusunuz?  E/H");
            char secim=scan.next().charAt(0);
            if (secim=='e' || secim=='E'){
                menu(islemler);
            }else
                System.out.println("İYİ GUNLER");
        } else if (islem==6) {
            System.out.println("iyi gunler");
        }
    }
}
