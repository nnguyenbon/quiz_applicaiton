/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizapplication;

import java.util.List;

/**
 *
 * @author Nguyen Kim Bao Nguyen - CE191239
 */
public class Question {
    private List<Answer> answers;
    private int correctAnswerIndex;
    private int score;
    private String questionText;

    public Question(String questionText, int correctAnswerIndex) {
        this.correctAnswerIndex = correctAnswerIndex;
        this.questionText = questionText;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }
    
    public void addAnswer(String answerText, boolean isCorrect) {
        answers.add(new Answer(answerText, isCorrect));
    }
}
