package algorithm;

import java.util.Scanner;

public class chap01_condition {
    public static void main(String[] args){
        minusAb();
    }

    public static void minusAb() {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();

        if(a >= b) {
            System.out.println("a보다 더 큰 값을 입력하세요!");
            b = scan.nextInt();
        }

        int sum = b-a;
        System.out.println("b - a 는 " + sum + " 입니다.");
    }
}
