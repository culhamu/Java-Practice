package day03;

import java.util.Scanner;

public class Q1_BolmeOperatoru {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bolunen sayiyi giriniz");
        int a= scan.nextInt();
        System.out.println("Lütfen bolen sayiyi giriniz");
        int b= scan.nextInt();
        System.out.println(bol(a, b));
    }

    public static int bol(int bolunen, int bolen) {
        int bolum=0;

        while (bolunen>=bolen){
            bolunen-=bolen;

            bolum++;
        }
        return bolum;
    }
}
