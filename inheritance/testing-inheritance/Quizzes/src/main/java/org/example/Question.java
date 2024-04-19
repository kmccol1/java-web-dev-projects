package org.example;

public abstract class Question
{
    private int id;
    private String content;
    private String type;
    private String candidateAnswers;
    private String realAnswer;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCandidateAnswers() {
        return candidateAnswers;
    }

    public void setCandidateAnswers(String candidateAnswers) {
        this.candidateAnswers = candidateAnswers;
    }

    public String getRealAnswer() {
        return realAnswer;
    }

    public void setRealAnswer(String realAnswer) {
        this.realAnswer = realAnswer;
    }

    public void displayQuestions()
    {

    }
}
