package day06;

import java.util.Arrays;

public class Q5_soru {
    public static void main(String[] args) {
         /*
         * create a custom return type method accepts a name as parameter
         * and prints the name as a char array
         * (do not use toCharArray() method)
         * Input : John
         * Output : [J, o, h, n]
         Parametre olarak String bir isim girdiginiz, size o ismin harflerini
         bir char Array olarak yazdiran bir method olusturunuz.
         toCharArray() methodunu kullanmayiniz!
         * Input : John
         * Output : [J, o, h, n]
         */
        String name="Mustafa";
            kelimeninHarfleriniAyir(name);

    }public static void  kelimeninHarfleriniAyir(String name){
        char[] harfler=new char[name.length()];

        for (int i = 0; i < name.length(); i++) {
            harfler[i]=name.charAt(i);

        }
        System.out.println("kelimenin harflerinin array i : "+ Arrays.toString(harfler));
    }
}
