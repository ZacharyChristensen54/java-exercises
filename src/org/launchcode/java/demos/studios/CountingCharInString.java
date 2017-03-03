package org.launchcode.java.demos.studios;


import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by ZachBurt on 3/2/2017.
 */
public class CountingCharInString {
    public static void main(String[] args) {
        System.out.println("What string would you like to count the chars in? ");
        Scanner stringIn = new Scanner(System.in);
        HashMap<Character, Integer> charCount = countChar(stringIn);
        System.out.println(charCount);
    }

    private static HashMap<Character, Integer> countChar(Scanner myString) {
        String stringForUse = myString.nextLine().toUpperCase();
        char[] chars = stringForUse.toCharArray();
        HashMap<Character, Integer> charCount = new HashMap<>();
        for (int i = 0; i < stringForUse.length(); i++) {
            char charForCheck = stringForUse.charAt(i);
            if (Character.isAlphabetic(charForCheck)) {
                if (!charCount.containsKey(charForCheck)) {
                    charCount.put(charForCheck, 1);
                } else {
                    charCount.merge(charForCheck, 1, Integer::sum);
                }
            }
        }
        return charCount;
    }
}
