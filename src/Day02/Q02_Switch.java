package Day02;

import java.util.Scanner;

public class Q02_Switch {
    public static void main(String[] args) {

        /*
         * Kullanicidan iki tamsayi sayi ve islem cinsini alin
         * ve sayilari kullanicinin belirledigi isleme tabii tutup sonucu yazdirin.
         *
         * islem cinsi icin 1:toplama 2:cikarma 3:carpma 4: bolme
         *
         * Ornek : Inputs : sayilar : 18 , 10  islem : 3
         *         Output : 18 X 10 = 180
         *
         *
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen iki tane tam sayi giriniz");
        int a= scan.nextInt();
        int b= scan.nextInt();
        System.out.println("Lütfen işlem türünü seçiniz: \n " +
                "1:Toplama \n" +
                "2:Cikarma\n"+
                "3:Carpma\n"+
                "4:Bölme");
        int islem= scan.nextInt();
        if (islem==1) System.out.println(a+b);
        else if (islem==2) System.out.println(a-b);
        else if (islem==3) System.out.println(a*b);
        else if (islem==4) {
            if (b==0) System.out.println("İslem tanımsız");
            else System.out.println(a/b);
        }else System.out.println("Yanlis giris yaptınız , lütfen tekrar deneyiniz");
        System.out.println("**********************Swıtch Cozumu*****************");
        switch (islem){
            case 1: System.out.println(a+"+"+b+"="+(a+b));break;
            case 2: System.out.println(a+"-"+b+"="+(a-b));break;
            case 3: System.out.println(a+"*"+b+"="+(a*b));break;
            case 4:
                if (b==0) System.out.println("İslem tanımsız");
                else System.out.println(a+"/"+b+"="+(a/b));break;
            default:
                System.out.println("Yanlis giris yaptınız , lütfen tekrar deneyiniz");




        }








    }
}
