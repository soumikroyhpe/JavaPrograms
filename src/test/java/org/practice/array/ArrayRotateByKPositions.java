package org.practice.array;

public class ArrayRotateByKPositions {


    static void reverse(int [] arr, int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start ++;
            end --;
        }

    }

    static void rotate(int [] a, int k) {
        k = k % a.length;
        if(k < 0){
            k = k + a.length;
        }
        reverse(a,0,k-1);
        reverse(a, k, a.length-1);
        reverse(a,0,a.length-1);

    }


    static void rotateOneTime(int [] arr) {
        int temp = arr[0];

        for(int k = 1; k<arr.length ; k++){
            arr[k-1] = arr[k];
        }
        arr[arr.length-1] = temp;

    }



    public static void main(String[] args) {
        int a [] = {1,2,3,4,5};

        for(int i = 0; i <a.length; i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        //rotateOneTime(a);
        rotate(a,1);
        for(int i = 0; i <a.length; i++){
            System.out.print(a[i]+" ");
        }
    }
}
