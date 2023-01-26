package day09;

import java.util.ArrayList;
import java.util.List;

public class Q3_commaSeperate {
    /*
    Write a method that returns a comma-separated string based on a given list of integers.
     Each element should be preceded by the letter 'e' if the number is even,
      and preceded by the letter 'o' if the number is odd. For example,
      if the input list is (3,44), the output should be 'o3,e44'.
     */
    public static void main(String[] args) {

        String input="3,44";
        System.out.println(virgulleAyir(input));


    }public static String virgulleAyir(String str){

        String[] strYeni=str.split("");
      List<String> list=new ArrayList<>();
        for (int i = 0; i < strYeni.length; i++) {
            list.add(strYeni[i]);

        }
        String yenilist="";
        list.add(0,"o");
        int index=list.indexOf(",");
        list.add(index+1,"e");
        for (int i = 0; i < list.size(); i++) {
             yenilist+=list.get(i);

        }

        return yenilist;
    }


}