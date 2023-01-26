package day03;

import java.util.Scanner;

public class Q6_soru {
    public static void main(String[] args) {
        /*
        Bir sayinin mükemmel olup olmadiğini bulan bir method yaziniz.
        Mükemmel sayi : bir sayinin kendisi hariç bölenlerinin toplamı, kendisine eşitse o sayi mükemmeldir.
        ORNEK:
        INPUT     : 6
        OUTPUT : 1,2,3
                      1+2+3 = 6 = 6 (Mükemmel)

 */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        int sayi=scan.nextInt();
        if (mukemmelSayi(sayi)){
            System.out.println(sayi+" sayı mükemmel sayı");
        }else System.out.println(sayi+" sayı mükemmel sayı değil");

    }public static boolean mukemmelSayi(int sayi){
        int toplam=0;
        for (int i = 1; i < sayi; i++) {
            if (sayi%i==0){
                toplam+=i;

            }

        }if (toplam==sayi){
            return true;
        }else return false;

    }
}
