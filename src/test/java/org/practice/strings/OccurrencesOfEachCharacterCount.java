package org.practice.strings;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class OccurrencesOfEachCharacterCount {

    public static void main(String[] args) {
        String str = "Programmingp";

        HashMap<Character,Integer> map = new HashMap<>();

        char [] c =str.toLowerCase().toCharArray();

        for (int i = 0; i < c.length ;i++) {
            map.put(c[i],map.getOrDefault(c[i],0)+1);
        }

        for(Map.Entry<Character,Integer> entry :map.entrySet()) {
           // if (entry.getValue() == 1)
            System.out.println(entry.getKey() +" : "+entry.getValue());
        }

    }

}
