package Day05;

import java.util.Arrays;

public class Q5 {
    public static void main(String[] args) {
        /*
          MOUNTAIN ARRAY SORUSU : *Verilen herhangi bir arrayin
          Mountain Array olup olmadıgını kontrol etmek için bir kod yazınız.
             Not:
            Mountain Array ==> [0, 2, 5, 3, 1]
          Bir array elemanları en büyük degerine kadar sürekli artan,
          en büyük degerinden sonra sürekli azalan deger alıyorsa Mountain Array' dir.
          Mountain Array Degil ==> [5, 2, 7, 1, 4]
          Bir array elemanları en büyük degerine kadar sürekli azalan,
         en büyük degerinden sonra sürekli artan deger alıyorsa Mounta!n Array degildir
         */
        int [] arr1={0,2,5,3,1};
        int [] arr2={5,2,7,1,4};

        mountainArr(arr1);
        mountainArr(arr2);
    }

    private static void mountainArr(int[] arr) {
        int enbuyuk=0;
        int enbuyukindex=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>enbuyuk){
                enbuyuk=arr[i];
                enbuyukindex=i;
            }

        }
        boolean kontrol=true;
        for (int i = enbuyukindex; i < arr.length-1 ; i++) {
            if (arr[i]>arr[i+1]){
                continue;

            }else kontrol=false;
            break;


        }if (kontrol){
            for (int i = enbuyukindex; i>0 ; i--) {
                if (arr[i]>arr[i-1]){
                    continue;
                }else kontrol=false;
                break;


            }
        }




        if (kontrol){
            System.out.println(Arrays.toString(arr) +"array mountaindir");
        }else System.out.println(Arrays.toString(arr)+"array mountain değil");
    }
}
