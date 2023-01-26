package day05;

public class Q1 {
    public static void main(String[] args) {
        /*
        1-Kullanıcı tarafından girilen string ifadenin içindeki sayısal değerleri toplayan metodu yazınız
         */

        stringIfadeToplam("nasıl1 gidi5yor ar9kadaşım5");

    }public static void stringIfadeToplam(String str){

        str=str.replaceAll("\\D","");

       int toplam=0;
        for (int i = 0; i < str.length(); i++) {

            toplam+=Integer.parseInt(str.substring(i,i+1));
        }
        System.out.println(toplam);

    }
}
