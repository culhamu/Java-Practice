package Day11;

import java.util.ArrayList;
import java.util.List;

public class Q2_Find10PrimeNumbers {
    public static void main(String[] args) {
        /*
         * Write a program that accepts an integer as input and prints first 10 prime
         * numbers greater than input
         *
         * Check numbers if they are even or not in a return method
         */

        int input=5;
        int count=0;

        List<Integer> fist10Pime=new ArrayList<>();

        while (count<10){

            input++;
            if (isPrime(input)){
                fist10Pime.add(input);
                count++;
            }
        }

        System.out.println(fist10Pime);

    }private static boolean isPrime(int num){

        for (int i = 2; i <num ; i++) {

            if (num%i==0){
                return false;
            }

        }


        return true;
    }
}
