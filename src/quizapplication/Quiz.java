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
public class Quiz {
    private List<Question> questions;
    private int score;

    public Quiz() {
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }
    
    
}
