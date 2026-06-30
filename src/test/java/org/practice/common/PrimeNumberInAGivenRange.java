package org.practice.common;

public class PrimeNumberInAGivenRange {

    public static void main(String[] args) {

        int startRange = 1;
        int endRange = 100;

        int count;

        boolean isPrime;

        for (int i = startRange; i<= endRange; i++) {
           count = 0;
            isPrime = true;
             for(int j = 2 ; j<= i/2 ; j++) {
                    if(i % j == 0)
                    {
                        count ++;
                        isPrime = false;
                        break;
                    }
             }
             if(isPrime) {
                 System.out.println(i + " is a prime number!!");
             }
        }
    }
}
