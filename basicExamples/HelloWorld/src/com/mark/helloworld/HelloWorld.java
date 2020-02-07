package com.mark.helloworld;

import java.util.*;
import java.io.*;

class HelloWorld {

    public static String LetterChanges(String str) {
        str = "fun zTimes!";
        String newStr = "";
        for (char c: str.toCharArray()) {
            if (Character.isAlphabetic(c)) {
                System
                        .out.println("Char is " + c);
                if ( Character.toLowerCase(c) == 'z' ) {
                    newStr += Character.isUpperCase(c) ? 'A' : 'a';
                } else {
                    List vowels = Arrays.asList('a', 'e', 'i', 'o', 'u');
                    System.out.println("voewls" + vowels);
                    c+=1;
                    newStr += vowels.contains(c) ? Character.toUpperCase(c) : c;
                }
            } else {
                newStr += c;
            }
        }
        return newStr;
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(LetterChanges(s.nextLine()));
    }

}
