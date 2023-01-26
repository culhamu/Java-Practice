package day10;

import java.util.Random;
import java.util.Scanner;

public class Q2_tasKagitMakas {
    public static void main(String[] args) {
        /*
        taş kağıt makas bilgisayara karşı 5 puana ilk ulaşan kazanır
         */
        Scanner scan=new Scanner(System.in);

        Random rnd=new Random(3);

        int userChoise=0;
        int compChoise=0;
        int user=0;
        int comp=0;


        do {System.out.println("""
                Aşagıdakilerden birini giriniz
                1:Tas
                2:Kağıt
                3:Makas""");
            userChoise= scan.nextInt();
            //bilgisayarın seçimi
            compChoise=rnd.nextInt(3)+1;
            //Karşılaştırma ve puanlama
            switch (compChoise) {
                case 1 -> System.out.println("bilgisayar=taş");
                case 2 -> System.out.println("bilgisayar=kağıt");
                case 3 -> System.out.println("bilgisayar=makas");
            }
            switch (userChoise) {
                case 1 -> System.out.println("oyuncu= taş");
                case 2 -> System.out.println("oyuncu= kağıt");
                case 3 -> System.out.println("oyuncu= makas");
            }

            if (userChoise==1&&compChoise==2){
                System.out.println("Kağıt taşı sarar!--bilgisayar+1");
                comp++;
                System.out.println("Oyuncu = "+user+" Bilgisayar = "+comp);
            }else  if (userChoise==1&&compChoise==3) {
                System.out.println("Taş makası kırar!--oyuncu+1");
                user++;
                System.out.println("Oyuncu = " + user + " Bilgisayar = " + comp);
            }else  if (userChoise==2&&compChoise==1) {
                System.out.println("Kağıt taşı sarar!--oyuncu+1");
                user++;
                System.out.println("Oyuncu = " + user + " Bilgisayar = " + comp);
            }else  if (userChoise==2&&compChoise==3) {
                System.out.println("Makas kağıdı keser!--bilgisayar+1");
                comp++;
                System.out.println("Oyuncu = " + user + " Bilgisayar = " + comp);
            }else  if (userChoise==3&&compChoise==1) {
                System.out.println("Taş makası kırar!--bilgisayar+1");
                comp++;
                System.out.println("Oyuncu = " + user + " Bilgisayar = " + comp);
            }else  if (userChoise==3&&compChoise==2) {
                System.out.println("Makas kağıdı keser !--oyuncu+1");
                user++;
                System.out.println("Oyuncu = " + user + " Bilgisayar = " + comp);
            }else {
                System.out.println("Berabere!");
                System.out.println("Oyuncu = " + user + " Bilgisayar = " + comp);
            }

        }while (user!=5&&comp!=5);{

            //kazananı gösterelim
            if (user>comp){
                System.out.println("oyuncu kazandı");
            }else System.out.println("maalesef kaybettin");
        }




    }
}
