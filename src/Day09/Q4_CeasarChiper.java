package Day09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q4_CeasarChiper {
    /*
    The Ceasar cipher is a basic encryption technique used by Julius Ceasar
     to securely communicate with his generals.
     Each letter is replaced by another letter N positions down the english alphabet.
      For example, for a rotation of 5, the letter 'c' would be replaced by an 'h'.
      In case of a 'z', the alphabet rotates and it is transformed into a 'd'.
        Implement a decoder for the Ceasar cipher where N = 5.
        TIP: Use code.toCharArray() to get an array of characters
     */
    public static void main(String[] args) {
        String ingAlfabe="abcdefghijklmnopqrstuvwxyz";

        String code="hello world";
        char[] charACode=code.toCharArray();

        List<Character> sifreliCodeList=new ArrayList<>();

        for (char w:charACode) {

            char yenilist=(char) (w+5);
            sifreliCodeList.add(yenilist);

            
        }String str=sifreliCodeList.toString();
        str=str.replaceAll(",","");
        System.out.println(str);
    }
}
