package org.example;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfChar {
    public static void main(String[] args) {

        String str = "programming";
        char [] chr = str.toCharArray();
        Map<Character,Integer> newMap = new HashMap<>();

        for(char c : chr) {
            if(newMap.containsKey(c)) {
                Integer count = newMap.get(c);
                newMap.put(c,count+1);
            } else {
                newMap.put(c,1);
            }
        }
//        for (int i = 0; i<chr.length ; i++) {
//            System.out.println(chr[i]);
//
//            if(newMap.containsKey(chr[i])) {
//                Integer count = newMap.get(chr[i]);
//                newMap.put(chr[i],count+1);
//            } else {
//                newMap.put(chr[i],1);
//            }
//        }
        System.out.println(newMap);
        for (char c : newMap.keySet()) {
            if(newMap.get(c)>1)
            System.out.println(c+":"+newMap.get(c));
        }
    }
}
