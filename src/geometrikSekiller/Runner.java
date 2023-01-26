package geometrikSekiller;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("  ============= İŞLEMLER =============\n" +
                "\t\t 1-KARE\n" +
                "\t\t 2-DİKDÖRTGEN\n" +
                "\t\t 3-DAİRE\n" +
                "\tSEÇİMİNİZ:");
        int secim=scan.nextInt();
        switch (secim){
            case 1:{
                Kare kare=new Kare();
                kare.alan();
                kare.cevre();
            }
            case 2:{
                Dikdortgen dkdrt=new Dikdortgen();
                dkdrt.alan();
                dkdrt.cevre();
            }
            case 3:{
                Daire daire=new Daire();
                daire.alan();
                daire.cevre();
            }
        }
    }
}
