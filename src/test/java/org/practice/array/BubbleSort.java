package org.practice.array;

public class BubbleSort {


    public static void sorting(int [] arr) {

        int temp;
        int n = arr.length;

        boolean alreadySorted = true; //this will help to check whether array is already sorted or not!!!

        for(int i = 0; i < n-1; i++) {

            for(int j = 0; j < n-i-1; j++) {

                if(arr[j] > arr[j+1]) {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    alreadySorted = false;
                }
            }
            if (alreadySorted){
                System.out.println("This array is already sorted!!!!");
                break;
            }
        }

        for(int a : arr) {
            System.out.println(a);
        }

    }


    public static void main(String[] args) {

       int [] unsortedlist = {14,2,1,40,50,3};
        //int [] unsortedlist = {1,2,3,4,5,6};

            sorting(unsortedlist);

    }
}
