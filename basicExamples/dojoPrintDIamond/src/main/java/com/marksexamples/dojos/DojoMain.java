package com.marksexamples.dojos;

import java.util.Scanner;

public class DojoMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter letter : ");
        String chs = scanner.nextLine();
        PrintDiamond printDiamond = new PrintDiamond();
        System.out.print(printDiamond.print(chs.charAt(0)));
    }
}