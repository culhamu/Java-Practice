package com.mustafaculha.deneme;

import com.mustafaculha.swingornegi.Pencere;

import java.util.*;

public class Main {
    public static void main(String[] args) {

       // Pencere pencere=new Pencere();
        List<String> list=new ArrayList<>();
        list.add("Java");
        list.add("Phyton");
        list.add("C++");
        list.add("PHP");
        list.add("GO");

        Collections.sort(list,new BuyuktenKucugeString());

        for (String str:list) {

            System.out.println(str);
        }

        System.out.println("*************************************");

        Collections.sort(list,new KucuktenBuyuge());

        for (String str:list) {

            System.out.println(str);
        }
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

    }

}
class BuyuktenKucugeString implements Comparator<String>{
    @Override
    public int compare(String o1, String o2) {
        return -o1.compareTo(o2);
    }
}
class KucuktenBuyuge implements Comparator<String>{
    @Override
    public int compare(String o1, String o2) {
        return o1.compareTo(o2);
    }
}
