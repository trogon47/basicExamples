package com.mark.lambdas;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExamples {

    public static void main (String[] args) {
        Book b1 = new Book("Riggs", "Miss peregrin");
        Book b2 = new Book("Rowling", "Harry Potter and the sorcers stone");
        Book b3 = new Book("Seuss", "The cat in the hat");

        List<Book> books = Arrays.asList(b3, b2, b1);
        List<String> sorted = books.stream().map((b) -> b.getAuthor()).sorted(Comparator.naturalOrder()).collect(Collectors.toList());
        for (String author: sorted) {
            System.out.println(author);
        }

        for (Book book: books) {
            System.out.println(book.getAuthor());
        }

        // In reverse alphabetical order and write to console
        Arrays.asList("red", "green", "blue").stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

        // Sort the names of the colours alphabetically, then write the first out to console
        System.out.println("trying out findfirst");
        Arrays.asList("red", "green", "blue").stream().sorted().findFirst().ifPresent(System.out::println);

        // Take list of stings, filter out any starting with "a", then print out strings remaining in
        // stream to console
        Arrays.asList("banana", "orange", "apple", "peach", "aardvark").stream().filter( t -> !t.startsWith("a")).forEach(System.out::println);

        // Take list of strings, make the string uppercase and create new list
        List<String> fruits = Arrays.asList("banana", "orange", "apple", "peach", "aardvark").stream().map( (fruit) -> {
            return fruit.toUpperCase();
        }).collect(Collectors.toList());
        for (String fruit: fruits) {
            System.out.println(fruit);
        }

    }
}
