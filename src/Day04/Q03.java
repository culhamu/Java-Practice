package Day04;

public class Q03 {
    public static void main(String[] args) {
        //Create an array of 5 floats and calculate their sum.
        float [] flt={1.0f,2.0f,3.0f,4.0f,5.0f};
        float toplam=0;

        System.out.println("********************************************");
        for (int i = 0; i < flt.length; i++) {
            toplam+=flt[i];

        }
        System.out.println(toplam);
        System.out.println("*************While ile çözümü******************");
        toplam=0;
        int i=0;
        while (i<flt.length){

            toplam+=flt[i];
            i++;
        }
        System.out.println(toplam);
    }
}
