package com.example.quizandroid1;

import java.io.Serializable;

public class GameModel implements Serializable {
    private String currentLevel;
    private String question;
    private String firstVariant;
    private String secondVariant;
    private String thirdVariant;
    private String fourVariant;
    private String answer;
    private int icon;

    public GameModel(String currentLevel, String question, String firstVariant, String secondVariant, String thirdVariant, String fourVariant, String answer, int icon) {
        this.currentLevel = currentLevel;
        this.question = question;
        this.firstVariant = firstVariant;
        this.secondVariant = secondVariant;
        this.thirdVariant = thirdVariant;
        this.fourVariant = fourVariant;
        this.answer = answer;
        this.icon = icon;
    }

    public String getCurrentLevel() {
        return currentLevel;
    }

    public void setCurrentLevel(String currentLevel) {
        this.currentLevel = currentLevel;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getFirstVariant() {
        return firstVariant;
    }

    public void setFirstVariant(String firstVariant) {
        this.firstVariant = firstVariant;
    }

    public String getSecondVariant() {
        return secondVariant;
    }

    public void setSecondVariant(String secondVariant) {
        this.secondVariant = secondVariant;
    }

    public String getThirdVariant() {
        return thirdVariant;
    }

    public void setThirdVariant(String thirdVariant) {
        this.thirdVariant = thirdVariant;
    }

    public String getFourVariant() {
        return fourVariant;
    }

    public void setFourVariant(String fourVariant) {
        this.fourVariant = fourVariant;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }
}
