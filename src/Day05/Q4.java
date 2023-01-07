package Day05;

import java.util.Arrays;

public class Q4 {
    public static void main(String[] args) {
        /*
        String' lerden oluşan bir arrayde öğeler 'n' veya 'k' ile bitiyorsa,
         o öğelerin baş harflerini ekrana yazdıran metodu yazınız.
        Örnek: { "Kemal", "Jonathan", "Mark", "Jackson", "Ali" } ==> Çıktı JMJ
         */
        String[] arr={ "Kemal", "Jonathan", "Mark", "Jackson", "Ali" };
        System.out.println("ilk harfler: "+harfKontrol(arr));



    }

    private static String harfKontrol(String[] arr) {
        String ilkHarfler="";
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].endsWith("n")||arr[i].endsWith("k")){
                ilkHarfler+=arr[i].charAt(0);

            }


        }
return ilkHarfler;
    }
}
