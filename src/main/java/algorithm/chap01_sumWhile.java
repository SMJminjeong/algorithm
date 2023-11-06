package algorithm;

import java.util.Scanner;

public class chap01_sumWhile {
    public static void main(String[] args){
        sum();
    }

    public static int sum() {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int sum = 0;
        int i = 1;

        while(i<=n){
            sum += i;
            i++;
            System.out.println("i : " + i);
        }

        System.out.println(sum);
        return sum;
    }
}
