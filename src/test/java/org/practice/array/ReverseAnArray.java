package org.practice.array;

 public class ReverseAnArray {

    public static void reverse(int [] numbers) {
        int start = 0;
        int end = numbers.length -1;

        while(start < end){
            int temp = numbers[start];
            numbers[start] = numbers[end];
            numbers[end] = temp;
            start ++;
            end --;
        }

        for(int i = 0; i <numbers.length; i++ ) {
            System.out.print(numbers[i]+" ");
        }
    }

    public static void main(String[] args) {
         int [] numbers = {1,2,3,4,5};
        reverse(numbers);
    }
}
