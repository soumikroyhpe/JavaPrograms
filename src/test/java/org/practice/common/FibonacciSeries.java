package org.practice.common;

import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {

        int a = 0;
        int b = 1;
        int c = 0;
        System.out.println("Fibonacci Series range up to : ");
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();

        System.out.println(a);
        System.out.println(b);


        for (int i = 2; i < range ; i++ ) {
            c = a + b;
            a = b;
            b = c;
            System.out.println(c);
        }
    }
}
