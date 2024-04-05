package org.example;

import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        String str = "If the product of two terms is zero then common sense " +
                "says at least one of the two terms has to be zero to " +
                "start with. So if you move all the terms over to one side, " +
                "you can put the quadratics into a form that can be factored " +
                "allowing that side of the equation to equal zero. " +
                "Once you’ve done that, it’s pretty straightforward from there.";

        countCharacters(str);
    }

    public static HashMap<Character, Integer> countCharacters(String str){
        char[] charArray = str.toCharArray();

        HashMap<Character, Integer> charMap = new HashMap<>();

        for (char c : charArray){
            charMap.put(c, 1);
        }
        return charMap;
    }

    public static void printOutput(){
        for(Entry<Character, Integer> charEntry : charMap.entrySet()){
            System.out.println(charEntry.getKey() + ": " + charEntry.getValue());
        }

    }

    public static void readStringFromFile()
    {
        String str = "";

        try{
            File file = new File("str.txt");
            Scanner scanner = new Scanner(file);

            StringBuilder sb = new StringBuilder();

            while(scanner.hasNextLine())
            {
                sb.append(scanner.nextLine());
            }
            str = sb.toString();

        }
        catch(FileNotFoundException e){
            System.out.println("Error: file not found..." + e.toString());
        }
    }

    public static void getInput(){

    }
}