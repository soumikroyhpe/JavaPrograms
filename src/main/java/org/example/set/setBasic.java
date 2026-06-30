package org.example.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class setBasic {
    public static void main(String[] args) {

        String str[] = {"Soumik","Rahul","Paul","Rahul","Papu"};
        Set<String> hashset = new HashSet<>(Arrays.asList(str));
        System.out.println("ArraysAsList: "+hashset);

        Integer[] arr = {2,1,3,4,1,2};

        Set<Integer> arrSet = Set.copyOf(Arrays.asList(arr));
        System.out.println("CopyOf: "+arrSet);

        String[] array = {"a", "b", "c"};

        //Set<String> set = new HashSet<>(Arrays.asList(array)); // mutable set

        // If you want it to be immutable (like Set.of):
        Set<String> immutableSet = Set.copyOf(Arrays.asList(array));

        System.out.println(immutableSet);
    }
}
