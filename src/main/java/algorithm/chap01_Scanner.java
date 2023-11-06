package algorithm;

import java.util.Scanner;

public class chap01_Scanner {
    public static void main(String[] args){

    }

    public int scanIntExample (){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt(); //32비트
        return a;
    }

    public boolean scanBooleanExample(){
        Scanner scan = new Scanner(System.in);
        boolean flag = scan.nextBoolean();
        return flag;
    }

    public long scanLongExample(){
        Scanner scan = new Scanner(System.in);
        long a = scan.nextLong();
        return a;
    }

    public float scanFloatExample(){
        Scanner scan = new Scanner(System.in);
        float a = scan.nextFloat();
        return a;
    }

    public double scanDoubleExample() {
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        return a;
    }

    public String scanStringExample(){
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        return a;
    }

    public String scanStringLineExample(){
        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();
        return a;
    }
}
