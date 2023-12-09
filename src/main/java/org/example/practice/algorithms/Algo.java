package org.example.practice.algorithms;

import java.util.ArrayList;
import java.util.List;

public class Algo {

    public static String reverseWords(final String original) {
        if (original.isBlank()) {
            return original;


        } else {
            String[] words = original.split(" ");
            StringBuilder reversedString = new StringBuilder();
            for (String word : words) {
                StringBuilder reversedWord = new StringBuilder(word).reverse();
                reversedString.append(reversedWord).append(" ");


            }

            return reversedString.toString().trim();
        }

    }
    public static String hash(String input){
        char temp;
for(int i= 0 ; i<input.length()-4; i++){
    input.replaceAll(String.valueOf(input.charAt(i)),"*");
}
        System.out.println(input);
return input;
    }
    public static  void main (String []args){
        System.out.println(reverseWords("Victory is mine"));
        System.out.println(reverseWords("Victory is mine, no controversy"));
        System.out.println(reverseWords(" a"));
       hash("AdediniJamesOloruntoba");
    }
}