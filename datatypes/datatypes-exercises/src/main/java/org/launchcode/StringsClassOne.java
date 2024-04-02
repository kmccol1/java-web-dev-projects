package org.launchcode;

import java.util.Scanner;

public class StringsClassOne {
    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);
        boolean contains = false;

        String sentence = "Alice was beginning to get very tired of sitting by her sister " +
                "on the bank, and of having nothing to do: once or twice she had peeped " +
                "into the book her sister was reading, but it had no pictures or " +
                "conversations in it, ‘and what is the use of a book,’ " +
                "thought Alice ‘without pictures or conversation?’";

        System.out.println("Please enter a term to search for within this string: " + sentence);
        String searchTerm = scan.nextLine();


        sentence = sentence.toUpperCase();
        searchTerm = searchTerm.toUpperCase();
        contains = sentence.contains(searchTerm);

        System.out.println(contains);

        if (contains)
        {
            System.out.println("Found at index: " + sentence.indexOf(searchTerm));
            System.out.println("Your term is: " + searchTerm.length() + " characters long.");
            String newSentence = sentence.replace(searchTerm, "");
            System.out.println("New sentence without the term: " + newSentence);
        }



    }
}
