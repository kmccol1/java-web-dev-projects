package org.example;

import java.util.ArrayList;
import java.util.Optional;

public class MultChoice extends Question
{
    private ArrayList<String> options;
    private int correctAnswerIndex;

    public MultChoice(String text, ArrayList<String>ops, int ansIndex)
    {
        super(text);
        this.options = ops;
        this.correctAnswerIndex = ansIndex;
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
        System.out.println("Answer: " + this.options.get(correctAnswerIndex));
    }

    public boolean checkAnswer(String answer)
    {
        boolean result = false;
        int index = Integer.parseInt(answer) - 1;

        if (this.correctAnswerIndex == index)
            result = true;

        return result;
    }
}
