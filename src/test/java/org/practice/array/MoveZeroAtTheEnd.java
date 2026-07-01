package org.practice.array;

public class MoveZeroAtTheEnd {

    public static void moveZeroAtEnd(int [] numbers) {

        int size = numbers.length;
        if(size == 0 || size == 1) {
            return;
        }
        int nz = 0; //nz = non zero, z- zero
        int z = 0;

        while(nz < size) {
            if(numbers[nz] != 0) {
                int temp = numbers[nz];
                numbers[nz] = numbers[z];
                numbers[z] = temp;

                nz ++;
                z ++;
            } else {
                nz ++;
            }
        }

        for(int i = 0; i<size; i++ ) {
            System.out.print(numbers[i]+" ");
        }
    }

    public static void main(String[] args) {

        int[] numbers = {0,1,0,3,12};

        moveZeroAtEnd(numbers);

    }
}
