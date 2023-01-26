package day03;

public class Q7_soru {
    public static void main(String[] args) {
        //1-100 e kadar olan sayıların içinde mükemmel olanları yazdıran metodu yazınız

        for (int i = 0; i <=100 ; i++) {
            if (mukemmelSayi(i)){
                System.out.println(i);
            }

        }



    }public static boolean mukemmelSayi(int sayi) {
        int toplam = 0;
        for (int i = 1; i < sayi; i++) {
            if (sayi % i == 0) {
                toplam += i;

            }

        }
        if (toplam == sayi) {
            return true;
        } else return false;
    }
    }
