package Day03;

public class ifadeArama {
    public static void main(String[] args) {
        //100 den geriya 0 doğru 13 e bölünebileni ekrana alt alta yazdıracak
        /*
        100'den 0'a kadar 13'e tam bölünebilen sayıları ve toplamlarını ekrana yazdırınız (büyükten küçüğe).
         */

        int toplam=0;

        for (int i =100; i >1 ; i--) {
            if (i%13==0){
                System.out.println(i);
                toplam+=i;


            }

        }   System.out.println(toplam);

    }
}
