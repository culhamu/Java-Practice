package day06;

import java.util.Arrays;
import java.util.Scanner;

public class Q2_menu {
    public static void main(String[] args) {

        // create 2D array of food:
        // print all the foods sorted
        // american
        //----------
        // italian
        //----------
        // asian
        //----------
        // afghani
        //----------
        // indian

        String[][] food = {{"steak", "hot dog", "cheeseburger"}, {"pizza", "pasta", "canoli"},
                {"sushi", "ramen", "fried rice", "dumplings"}, {"kebab", "manto"},
                {"beriyani", "masal", "curry", "chicken tikka masala"}};
        Scanner scn=new Scanner(System.in);
        System.out.println("Lütfen hangi ülkenin mutfağını merak ediyorsayınız numarasını giriniz:\n" +
                "Örneğin: 1 Amerika\n" +
                "2 İtalian\n" +
                "3 Asian\n" +
                "4 Afghani\n" +
                "5 İndian");
        int UlkeMutfakNo=scn.nextInt();

        switch (UlkeMutfakNo){
            case 1:
                System.out.println(Arrays.toString(food[0]));
                break;
            case 2:
                System.out.println(Arrays.toString(food[1]));
                break;
            case 3:
                System.out.println(Arrays.toString(food[2]));
                break;
            case 4:
                System.out.println(Arrays.toString(food[3]));
                break;
            case 5:
                System.out.println(Arrays.toString(food[4]));
                break;
            default:
                System.out.println("Geçersiz giriş");

        }

    }
}
