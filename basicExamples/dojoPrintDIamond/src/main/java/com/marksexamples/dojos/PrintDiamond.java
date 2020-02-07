package com.marksexamples.dojos;

public class PrintDiamond {

    public String print(char endChar) {
        int charInterval = Character.toLowerCase(endChar) - 'a' ;
        StringBuilder builder = new StringBuilder();
        builder.append(appendSpace(charInterval)).append("A\n");
        for (int i = 1; i <= charInterval; i++) {
            builder.append(appendSpace(charInterval - i));
            Character ch = Character.toUpperCase((char) ('a' + i));
            builder.append(ch);
            int spaces = i + (i-1);
            builder.append(appendSpace(spaces));
            builder.append(ch + "\n");
        }
        for (int i = charInterval - 1; i >= 1; i--) {
            builder.append(appendSpace(charInterval - i));
            Character ch = Character.toUpperCase((char) ('a' + i));
            builder.append(ch);
            int spaces = i + (i-1);
            builder.append(appendSpace(spaces));
            builder.append(ch + "\n");
        }
        builder.append(appendSpace(charInterval)).append("A");
        return builder.toString();
    }

    private String appendSpace(int noOfSpaces) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < noOfSpaces; i++) {
            builder.append(" ");
        }
        return builder.toString();
    }
}
