package Day04;

import java.util.Arrays;

public class Q02 {public static void main(String[] args) {


    String[] arr1 = {"John", "Brad", "Ange", "Sofia", "Emily"};
    String[] arr2 = {"sofia", "brad", "grace", "emily", "hazel"};
    System.out.println(Arrays.toString(yeniArrayGetir(arr1, arr2)));

}public static String [] yeniArrayGetir(String[] arr1 ,String[] arr2 ) {
    String bol = "";
    for (int i = 0; i < arr1.length; i++) {
        for (int j = 0; j < arr2.length; j++) {
            if (arr1[i].equalsIgnoreCase(arr2[j])) {
                bol += arr2[j] + "-";
            }
        }
    }
    String[] newArray = bol.split("-");

    return newArray;
    }
}
