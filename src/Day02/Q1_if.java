package Day02;

import java.util.Scanner;

public class Q1_if {
    public static void main(String[] args) {

        //Kullanicidan bir sayi aliniz
        //Sayi 0 dan buyuk esit ise 10 dan kucuk olup olmadigini kontrol ediniz.
        //10 dan kucuk ise ekrana "Rakam" yazdiriniz degilse "Pozitif Sayi" yazdiriniz.
        //Sayi 0 dan kucuk ise ekrana "Negatif Sayi" yazdiriniz.
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir tamsayi giriniz");
        int sayi= scan.nextInt();
        
        if (sayi>=0&&sayi<10){
            System.out.println("Rakam");
            
        } else if (sayi>10) {
            System.out.println("Pozitif sayi");
        }else System.out.println("Negetif sayi");
        System.out.println("*****************ternary***********************");

        System.out.println((sayi>=0 ? (sayi<10)?"Rakam":"Pozitif Sayi":"Negatif Sayi"));

    }
}
