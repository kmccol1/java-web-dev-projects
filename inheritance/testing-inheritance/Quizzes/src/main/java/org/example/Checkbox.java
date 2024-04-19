package org.example;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Checkbox extends Question
{
    private ArrayList<String> options;
    private ArrayList<String> correctAnswers;

    public Checkbox(String text, ArrayList<String> ops, ArrayList<String> correctAns)
    {
        super(text);
        this.options = ops;
        this.correctAnswers = correctAns;
    }

    @Override
    public void displayQuestion()
    {
        System.out.println(this.getPrompt());
        for(int i =0; i < this.options.size(); i ++ )
        {
            System.out.println((i + 1) + "." + this.options.get(i));
        }
    }

    @Override
    public void displayAnswer()
    {
        for(int i =0; i < this.correctAnswers.size(); i ++ )
        {
            System.out.println((i + 1) + "." + this.correctAnswers.get(i));
        }
    }

    public boolean checkAnswer(String answer)
    {
        boolean result;

        result = correctAnswers.contains(answer);

        return result;
    }
}
