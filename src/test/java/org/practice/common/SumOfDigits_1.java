package org.practice.common;

public class SumOfDigits_1 {


    //If number is 0 then Sum of Digits will be 0
    // If  number % 9 gives remainder as 0 then sum of digits will be 9
    // If  number % 9 doesn't give remainder as 0 then sum of digits will be the remainder

    public static int  fnSumOfDigit (int num) {
        if (num == 0) {
            return 0;
        }
        //  return (num % 9 == 0) ? 9 : num % 9;
        if(num % 9 == 0) {
            return 9;
        }

        return num % 9;
    }

    public static void main(String[] args) {
        int num = 555;
        int sumOfDigits = fnSumOfDigit(num);
        System.out.println("Number is :" +num +",Sum of digits is : "+sumOfDigits);
    }
}
