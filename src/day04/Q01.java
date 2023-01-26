package day04;

import java.util.ArrayList;
import java.util.Arrays;

public class Q01 {
    public static void main(String[] args) {

      /*  arasinda ayni olan elemanlari bir liste ekleyen program yazin
                * (buyuk kucuk harf onemsiz)
     *
     * Input1 : {John,Brad,Ange,Sofia,Emily} Input2 : {sofia,brad,grace,emily,hazel}
     *
     * Output : [sofia,brad,emily]
     */
       // Input1 : {John,Brad,Ange,Sofia,Emily};
       // Input2 : {sofia,brad,grace,emily,hazel};
        String[] arr1=new String[5];

        arr1[0]="John";
        arr1[1]="Brad";
        arr1[2]="Angel";
        arr1[3]="Sofia";
        arr1[4]="Emily";
        System.out.println(Arrays.toString(arr1));
        String[] arr2={"sofia","brad","grace","emily","hazel"};
        System.out.println(Arrays.toString(arr2));
        ortakElemanlar(arr1,arr2);

    }

    private static void ortakElemanlar(String[] arr1, String[] arr2) {
        ArrayList <String> arrayList=new ArrayList<>();
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i].equalsIgnoreCase(arr2[j])){
                    arrayList.add(arr1[i]);
                }

            }

        } System.out.println(arrayList);


    }
}
