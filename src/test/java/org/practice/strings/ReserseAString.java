package org.practice.strings;

public class ReserseAString {

    public static void main(String[] args) {

        //1st approach
        String str = "Soumik";
        char [] c = str.toCharArray();
        String reverse = "";
        String reverse2 = "";
        for (int i = 0 ; i < c.length; i++) {
            reverse = c[i] + reverse;
        }
        System.out.println(reverse);

        //2nd approach
        String str1 = "Soumik";
        char [] charArray;
        for (int k = str1.length()-1; k>= 0; k--) {
            reverse2 = reverse2 + str1.charAt(k);
        }

        System.out.println(reverse2);


    }
}
