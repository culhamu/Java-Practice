package Day05;

import java.util.Random;
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        /*
    TC kimlik numarasının son rakamı çift olmak zorundadır.
    0 rakamı ile başlayamaz. ilk 10 rakamın toplamının birler basamağı, 11. rakamı vermektedir.
Ayrıca; 1, 3, 5, 7 ve 9. rakamın toplamının 7 katı ile 2, 4, 6 ve 8. rakamın toplamının
9 katının toplamının birler basamağı 10. rakamı; 1, 3, 5, 7 ve 9. rakamın toplamının
8 katının birler basamağı 11. rakamı vermektedir.
 */


        System.out.println(tckimlikOlustur(""));


    }public static String tckimlikOlustur(String tcString){
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen ilk rakamı 0 olmayacak şekilde 9 basamaklı bir sayı giriniz");
        tcString=scan.nextLine();

       int tekToplam=0;
       int ciftToplam=0;

        for (int i = 1; i <tcString.length() ; i+=2) {


          tekToplam+=Integer.parseInt(tcString.substring(i,i+1));

        }for (int i = 0; i <tcString.length() ; i+=2){

               ciftToplam+=Integer.parseInt(tcString.substring(i,i+1));


        }
        System.out.println(ciftToplam);

        int onuncuRakam = (tekToplam * 7 + ciftToplam * 9) % 10;
        int onbirinciRakam = (tekToplam * 8) % 10;
        String tc=tcString+onuncuRakam+onbirinciRakam;
        return tc;


    }
}
