package org.example;

public abstract class Question
{
    private String prompt;

    public Question(String text)
    {
        this.prompt = text;
    }

    public String getPrompt() {
        return prompt;
    }

    public void setPrompt(String prompt) {
        this.prompt = prompt;
    }

    public abstract void displayQuestion();
    public abstract void displayAnswer();
    public abstract boolean checkAnswer(String answer);
}
