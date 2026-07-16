package org.practice.array;

public class BinarySearch {

    public static int findPositionOfAnElement(int [] nums, int target){


        int start = 0;
        int end = nums.length -1;

        while(start <= end) {
            int mid = (start + end)/2;

            if (nums[mid] == target)
                return mid;
            if (nums[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }


        return -1;
    }


    public static void main(String[] args) {

        int [] numbers = {1,5,8,10,20,24,99,100,210,300,444};
        //int target = 0;
        int target = 99;
        int position = findPositionOfAnElement(numbers,target) + 1;
        if(position == 0){
            System.out.println("Number is not available inside an array!!!");
        } else {
            System.out.println(position);
        }

    }
}
