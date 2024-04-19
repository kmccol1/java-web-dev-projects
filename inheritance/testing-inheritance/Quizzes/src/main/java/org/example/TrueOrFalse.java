package org.example;

public class TrueOrFalse extends Question
{
    private boolean correctAnswer;

    public TrueOrFalse(String text, boolean ans)
    {
        super(text);
        this.correctAnswer = ans;
    }

    @Override
    public void displayQuestion()
    {
        System.out.println("T or F: " + this.getPrompt());
    }

    @Override
    public void displayAnswer()
    {
        System.out.println("Answer: " + this.correctAnswer);
    }

    public boolean checkAnswer(String answer)
    {
        boolean result;

        result = answer.equalsIgnoreCase(String.valueOf(correctAnswer));

        return result;
    }

}
