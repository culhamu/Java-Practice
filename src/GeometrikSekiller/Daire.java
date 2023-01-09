package GeometrikSekiller;

import java.util.Scanner;

public class Daire implements IIslemler{
    Scanner scan=new Scanner(System.in);
    int r=0;
    @Override
    public void alan() {
        System.out.println("Yarı Çapı giriniz");
        r=scan.nextInt();
        System.out.println("Alan : "+(r*r*3.14));

    }

    @Override
    public void cevre() {

        System.out.println("Cevre : "+(2*r*3.14));
    }
}
