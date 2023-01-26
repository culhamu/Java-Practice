package day09;

import java.util.Scanner;

public class Q1_ATM {

    static String sifre1 = "456456";
    static int bakiye=10000;


    public static void main(String[] args) {
        /*
        ATM
Kullanicidan giriş için kart numarasi ve şifresini isteyin,
 eger herhangi birini yanlis girerse tekrar isteyin.
 Kart numarasi aralarda boşluk ile girerse de eger doğruysa kabul edin.
 Kart numarasi ve sifre dogrulanirsa kullanicinin yapabileceği işlemleri ekrana yazdirin,
Menu listesinde Bakiye sorgula, para yatirma, para çekme, para gönderme
, sifre değiştirme ve cikis islemleri olacaktır.
Para çekme ve para gonderme işleminde mevcut bakiyeden buyuk para çekilemez,
Para gönderme işleminde istenen iban TR ile baslamali ve toplam 26 karakterli olmali,
 eger değilse menü ekraninageri donsun.
Sifre değiştirme işleminde mevcut şifreyi teyit ettikten sonra, sifre değişiklik işlemini yapmali,

         */Scanner scan = new Scanner(System.in);
         String kartNo="";
         while (kartNo.length()!=16){
             System.out.println("Lütfen kart numaranızı giriniz");
             kartNo = scan.next();
             kartNo = kartNo.replaceAll("\\D", "");
         }System.out.println("Lütfen şifrenizi giriniz");
        String sifre = scan.next();
        while (!sifre.equals(sifre1)){
            System.out.println("sifrenizi giriniz");
            sifre=scan.next();
        }

            menu();

    }public static void menu(){
        Scanner scan = new Scanner(System.in);

        int miktar=0;
        System.out.println("Lütfen gitmek istediğiniz menü numarasını giriniz");

            System.out.println("Menü:" + "\n" +
                    "1) Bakiye sorgula" + "\n" +
                    "2) Para yatırma" + "\n" +
                    "3) Para çekme" + "\n" +
                    "4) Para gönderme" + "\n" +
                    "5) Şifre değiştirme" + "\n" +
                    "6) Çıkış");

            int menuNo = scan.nextInt();

            switch (menuNo) {
                case 1:
                    System.out.println("Hesaptaki bakiye : "+bakiye);
                    menu();
                    break;
                case 2:
                    System.out.println("Lütfen yatırmak istediğiniz miktarı giriniz");
                    miktar=scan.nextInt();
                    bakiye+=miktar;
                    System.out.println("Yeni bakiyeniz : "+bakiye+" TL");
                    menu();
                    break;
                case 3:
                    if (miktar>bakiye){
                        System.out.println("Yetersiz bakiye bakiyeniz : "+bakiye+" TL");
                        menu();
                    }else {
                        System.out.println("Lütfen çekmek istediğiniz miktarı giriniz");
                        miktar=scan.nextInt();
                        bakiye-=miktar;
                        System.out.println("Yeni bakiyeniz : "+bakiye+" TL");
                        menu();
                    }
                    break;
                case 4:
                    System.out.print("Lütfen göndermek istediğiniz IBAN'ı giriniz: ");
                    String iban = scan.nextLine();

                    if (!iban.startsWith("TR")&&iban.length()!=26){
                        System.out.println("İban no TR ile başlamalıdır ve 26 haneli olmalıdır");
                        menu();
                        break;

                    }else {
                        System.out.println("göndermek istediginiz tutarı giriniz");
                       miktar = scan.nextInt();
                        if (miktar > bakiye) {
                            System.out.println("yetersiz bakiye");
                            menu();
                        } else {
                            bakiye -= miktar;
                            System.out.println("bakiyeniz :" + bakiye);
                            menu();
                        }
                    }break;
                        case 5:
                    System.out.println("Lütfen şifrenizi giriniz");
                     String sifre = scan.next();
                    if (!sifre.equals(sifre1)){
                        System.out.println("Şifrenizi yanlış girdiniz");
                        menu();
                    }else {
                        System.out.println("Lütfen yeni şifrenizi giriniz");
                        String yeniSifre=scan.next();
                        sifre1=yeniSifre;
                        menu();
                    }
                    break;
                case 6:
                    System.out.println("İyi günler");
                    break;
                default:
                    System.out.println("Geçersiz işlem menüsü");


        }
    }
}
