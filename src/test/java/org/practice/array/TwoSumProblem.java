
/*
  /Naveen's video link- https://www.youtube.com/watch?v=o42jBlO09Vg
  Input : nums = {2,7,11,15}, target= 9
  output: [0,1]
  Explanation : Because num[0] + num[1] == 9, we return [0,1]
  */

package org.practice.array;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSumProblem {

    public static int[] findTwoSum(int [] numArray, int target){

        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < numArray.length; i++){
            int extra = target - numArray[i];
            if(map.containsKey(extra)) {
                return new int[] {map.get(extra),i};
            } else {
                map.put(numArray[i], i);
            }
        }

        return null;
    }


    public static void main(String[] args) {

        int [] numbers = {2,11,5,4};

        int target = 9;

        int [] result =findTwoSum(numbers, target);
        System.out.println(Arrays.toString(result));
    }
}
