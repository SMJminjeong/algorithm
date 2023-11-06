package algorithm;

import java.util.Scanner;

public class chap01_for {
    public static void main(String[] args){
        sumTo7();
    }

    // n이 7이면 1+2+3+4+5+6+7=28 로 출력
    public static int sumTo7(){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int sum = 0;

        String result = "";
        for(int i = 1; i<a+1; i++){
            sum += i;
            if(i != a) {
                result += i + "+";
                System.out.println(result);
            }
            else{
                result += i + "=" + sum;
                System.out.println(result);
            }
        }

        System.out.println(sum);
        return sum;
    }
}
