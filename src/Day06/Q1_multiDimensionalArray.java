package Day06;

import java.util.Arrays;

public class Q1_multiDimensionalArray {
    public static void main(String[] args) {

        char[][] harfler=new char[3][4];

        harfler[0][0]='A';
        harfler[0][1]='B';
        harfler[0][2]='C';
        harfler[0][3]='D';

        harfler[1][0]='F';
        harfler[1][1]='G';
        harfler[1][2]='H';
        harfler[1][3]='I';

        harfler[2][0]='J';
        harfler[2][1]='K';
        harfler[2][2]='L';
        harfler[2][3]='M';

        System.out.println(Arrays.deepToString(harfler));

        int[][] sayilar={{10,20,30},{1,2,3},{100,200,300}};

    }
}
