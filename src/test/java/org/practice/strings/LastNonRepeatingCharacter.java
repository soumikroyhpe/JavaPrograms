package org.practice.strings;

import java.util.*;

public class LastNonRepeatingCharacter {

    public static void main(String[] args) {
        String str = "programmingjhdskj";

        Map<Character,Integer> map = new HashMap<>();
        List<Character> list = new ArrayList<>();

        for (char c : str.toCharArray())
        {
            map.put(c,map.getOrDefault(c,0)+1);
        }

        /*
       for(Map.Entry<Character,Integer> entry : map.entrySet()) {

            if (entry.getValue() == 1) {
                System.out.println(entry.getKey());
                list.add(entry.getKey());
            }
        }


        int lenght = list.size();
        System.out.println("Last non repeating character : "+ list.get(lenght-1));
        */


        boolean found = false;

        // Traverse from end to beginning
        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);

            if (map.get(ch) == 1) {
                System.out.println("Last non-repeating character: " + ch);
                found = true;
                break;
            }
        }

        // If no non-repeating character exists
        if (!found) {
            System.out.println("No non-repeating character found.");
        }



    }
}
