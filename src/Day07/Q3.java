package Day07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q3 {
    public static void main(String[] args) {
        //Girilen desimal değeri binary değere çeviren metodu oluşturunuz.
        //Örnek: 12 = 1 1 0 0
        int sayi=12;
        List<Integer> binary=new ArrayList<>();

        while (sayi>0){
            int kalan=sayi%2;
            sayi=sayi/2;
            binary.add(kalan);

        }
        //Collections.reverse(binary);

        System.out.println(binary);
    }
}
