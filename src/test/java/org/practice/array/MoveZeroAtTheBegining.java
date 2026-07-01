package org.practice.array;

public class MoveZeroAtTheBegining {

    public static void moveZeroAtBegining(int [] numbers) {

        int size = numbers.length;
        if(size == 0 || size == 1) {
            return;
        }
        int nz = 0;   //nz = non zero, z- zero
        int z = 0;

        while(z < size) {
            if(numbers[z] == 0) {
                int temp = numbers[z];
                numbers[z] = numbers[nz];
                numbers[nz] = temp;

                nz ++;
                z ++;
            } else {
                z ++;
            }
        }

        for(int i = 0; i<size; i++ ) {
            System.out.print(numbers[i]+" ");
        }
    }

    public static void main(String[] args) {

        int[] numbers = {1,2,6,0,1,0,3,12};

        moveZeroAtBegining(numbers);

    }
}
