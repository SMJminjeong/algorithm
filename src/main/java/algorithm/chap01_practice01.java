package algorithm;

import java.sql.SQLOutput;

public class chap01_practice01 {

    public static void main(String[] args){
        //max4(1, 2, 3, 4);
        min3(1, 3, 5);
    }

    // 네 값의 최댓값을 구하라
    public static int max4(int a, int b, int c, int d){
        int max = a;
        if(b>max) max = b;
        if(c>max) max = c;
        if(d>max) max = d;
        System.out.println(max);
        return max;
    }

    // 세 값의 최솟값을 구하라
    public static int min3(int a, int b, int c){
        int min = a;
        if(b<min) min = b;
        if(c<min) min = c;
        System.out.println(min);
        return min;
    }

}
