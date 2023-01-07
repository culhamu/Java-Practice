package Day03;

import java.util.Scanner;

public class Q2_soru {
    public static void main(String[] args) {
        /*
         * Ask the user for a String and a sentence
         * Find and print occurrence of String in sentence.
         * (without case sensitivity)
         *
         * sentence ="hihihi" String="hi" output="There are 3 "hi"s in hihihi "
         * sentence ="I am coming" String="com" output ="there is 1 "com" in sentence "
         *
         *//*
         * Kullanicidan bir kelime ve cumle aliniz
         * Kelimeyi cumle icinde aratip yazdiriniz
         *
         * Orn : Cumle = "hihihi" String = "hi" output = "hihihi" ' nin icinde 3 tane "hi" var
         * Orn : Cumle = "Yoldayim" String = "yol" output = "Yoldayim" in icinde 1 tane "yol" var
         */
        Scanner scan=new Scanner(System.in);
       String cumle=scan.nextLine();
        String arnckKelime=scan.nextLine();

        while (cumle.contains(arnckKelime)){
            System.out.println("Lutfen arnckKelime giriniz");
            arnckKelime= scan.nextLine();
            arnckKelime+=1;

            if (cumle.contains(arnckKelime)){
                System.out.println("tane var"+arnckKelime);
                break;


            }else System.out.println("hiç yok");

        }

    }
}
