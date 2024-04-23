package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class QuizRunner
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("\nHello! Please answer the following questions to the best of your ability: ");

        ArrayList<String> checkOps = new ArrayList<>();
        checkOps.add("Python");
        checkOps.add("Java");
        checkOps.add("C++");
        checkOps.add("COBOL");

        ArrayList<String> checkAns = new ArrayList<>();
        checkAns.add("Java");
        checkAns.add("C++");

        ArrayList<String> multOps = new ArrayList<>();
        multOps.add("United States");
        multOps.add("Japan");
        multOps.add("Germany");
        multOps.add("Russia");

        Checkbox check1 = new Checkbox("\nWhat is the best coding language?: ", checkOps, checkAns);
        MultChoice mult1 = new MultChoice("\nWhich of the above countries uses taxpayer money to commit war crimes?: ", multOps, 0);
        TrueOrFalse trueOrFalse = new TrueOrFalse("\nTrue or false: The United States of America DOES NOT support genocide?: ", false);

        ArrayList<Question> quiz = new ArrayList<>();
        quiz.add(check1);
        quiz.add(mult1);
        quiz.add(trueOrFalse);

        String ans;
        for (Question prompt : quiz)
        {
            prompt.displayQuestion();
            System.out.println("Please enter your answer: ");
            ans = scan.nextLine();

            if (prompt.checkAnswer(ans) == true)
            {
                System.out.println("Correct!");
            }
            else
            {
                System.out.println("Incorrect!");
            }

            System.out.println();
        }
    }
}