package org.practice.common;

import java.nio.file.FileSystemNotFoundException;
import java.util.Scanner;

public class OddAndEvenNumber {

    public static void main(String[] args) {

        int number;
        System.out.println("Enter the number:: ");
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();

        if( number % 2 == 0) {
            System.out.println("Even number : "+number);
        } else {
            System.out.println("Odd number : "+number);
        }

    }
}
