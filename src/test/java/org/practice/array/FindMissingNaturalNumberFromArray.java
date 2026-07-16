package org.practice.array;

public class FindMissingNaturalNumberFromArray {

    public static void findMissingNumber(int [] numbers, int length) {

        int expectedSum = (length * (length+1))/2;  // formula used:: (n(n+1))/2 to find the sum of Natural numbers

        int actualSum = 0;

        // finding the sum of present array elements'
        for (int a : numbers) {
            actualSum = actualSum + a;
        }
        int missingNumber = expectedSum - actualSum;
        System.out.println("Missing number in the array is : "+missingNumber);
    }


    public static void main(String[] args) {
        int [] numArray = {1,2,4,5,6};
        int n = 6;  //Length of Natural number array
        findMissingNumber(numArray,n);
    }
}
