package day11;

import java.util.Scanner;

public class Q1_EbobEkok {
    public static void main(String[] args) {
        /*
        // Take 2 integers from user and find GCD (Greatest Common Divisor) and LCM (Least Common Multiple)
        // Kullanicidan 2 adet tamsayi alip, EBOB ve EKOK'larini bulan program yaziniz.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen ebob ve ekok u bulmak için 2 tane sayı giriniz");
        int sayi1 = scan.nextInt();
        int sayi2 = scan.nextInt();
        int buyukSayi = 0;
        int kucukSayi = 0;


        if (sayi1 < sayi2) {

            kucukSayi = sayi1;
        } else kucukSayi = sayi2;


        int flag = 0;

        for (int i = kucukSayi; i > 1; i--) {

            if (sayi1 % i == 0 && sayi2 % i == 0) {

                System.out.println("sayıların ebub u : " + i);
                flag++;
                break;
            }

        }
        if (flag == 0) {
            System.out.println("Bu sayıların ebob u yoktur");
        }

        for (int i = 1; i <= sayi2 * sayi1; i++) {

            if (i % sayi1 == 0 && i % sayi2 == 0) {

                System.out.println("Sayıların ekok u : " + i);

                break;
            }

        }

    }
}
