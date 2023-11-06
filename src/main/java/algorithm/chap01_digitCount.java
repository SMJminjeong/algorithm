package algorithm;

import java.util.Scanner;

public class chap01_digitCount {
    public static void main(String[] args) {
        digitCount();
    }

    public static void digitCount(){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int digitCount = 0;

        int absoluteNum = Math.abs(a);
        while(absoluteNum > 0){
            absoluteNum /= 10;
            digitCount++;
        }

        System.out.println("그 수는 " + digitCount + "자리입니다.");

    }
}
