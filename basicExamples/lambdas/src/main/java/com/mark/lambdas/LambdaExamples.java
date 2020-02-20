package com.mark.lambdas;

import java.util.function.*;

public class LambdaExamples {
    public static void main(String[] args) {

        // Predicate Example
        // Take argument of String and return true if length of string is less than 10
        Predicate<String> strLen = (str) -> str.length() < 10;
        System.out.println(strLen.test("hello there I am in master"));
        System.out.println(strLen.test("Does this work ok"));

        // Consumer Example
        // Takes string argument, and write it out in lower case
        Consumer<String> writer = (str) -> System.out.println(str.toLowerCase());
        writer.accept("Wotcha");

        // Function
        // Take a single Double argument and return the String representation
        Function<Double, String> toStr = (dble) -> dble.toString();
        String result = toStr.apply(34.5);
        System.out.println("Result value is " + result + " which is a string of length " + result.length());

        // Supplier
        // Just returns a String
        Supplier<String> strSupplier = () -> "Hello there, this string has just been supplied!!";
        System.out.println("Supplied: " + strSupplier.get());

        // Unary Operator
        // Take a string parameter, change it to uppercase, and the return the resultant new string
        UnaryOperator<String> lower = (str) -> str.toLowerCase();
        System.out.println("output of string as lower case " + lower.apply("ALL THESE LETERS WERE UPPER CASE!!!"));

        // Binary Operator
        // Take 2 integers and return the sum
        BinaryOperator<Integer> adder = (a, b) -> a + b;
        System.out.println("The result of adding 5 and 7 is : " + adder.apply(5, 7));

        Predicate<String> longerThan10 = (s) -> s.length() > 10;
        System.out.println("Word is longer than 10 chars " + longerThan10.test("hedfsdfsdlltere"));

        Consumer<String> toLower = (s) -> System.out.println(s.toLowerCase());
        toLower.accept("JDDDDS");

        Function<Double, String> toStr2 = (d) -> d.toString();
        System.out.println(toStr2.apply(23.4).length());

        Supplier<String> supplyString = () -> "hello there";
        System.out.println("What have we got here " + supplyString.get());

        UnaryOperator<String> toUp = (s) -> s.toUpperCase();
        System.out.println("is it going to be upper case " + toUp.apply("was lower"));

        BinaryOperator<Integer> addIt = (a, b) -> a + b;
        System.out.println("2 + 10 = " + addIt.apply(2, 10));
    }
}
