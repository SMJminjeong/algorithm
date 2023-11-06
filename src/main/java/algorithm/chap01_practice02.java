package algorithm;

import java.util.Scanner;

public class chap01_practice02 {
    public static void main(String[] args){
        //gaousSum();
    }

    // 가우스의 덧셈?
    // 연속된 양의 정수의 합을 n , (n+1) 곱하고 2로 나눠준 덧셈
    public static int gaousSum(){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;

        sum = (n * (n+1)) / 2;
        System.out.println(sum);
        return sum;
    }
}
