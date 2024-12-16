/*
 * Coordinate the flow of application activities, manage user state and responses.
 */
package quizapplication;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Nguyen Kim Bao Nguyen - CE191239
 */
public class QuizController {
    private Quiz quiz;
    private List<Question> questions;
    private List<Answer> answers;
    public ArrayList<String> inputLine = new ArrayList<>();

    public QuizController() {
//        this.quiz = new Quiz(); 
    }
    
    public void loadQuestionFromFile(String fileName) {
        try (Scanner sc = new Scanner(new File(fileName))) {
            int numQuestions = Integer.parseInt(sc.nextLine().trim());
            
            for (int i = 0; i < numQuestions; i++) {
            //Doc cau hoi roi bo Q:
            String questionText = sc.nextLine().substring(3).trim(); 
            inputLine.add(questionText);
            
            //Doc 4 dap an
            String[] choices = new String[4];
            for (int j = 0; j < 4; j++) {
                choices[j] = sc.nextLine().substring(3).trim(); //Bo C:
                inputLine.add(choices[j]);
            }
            
            int correctAnswerIndex = Integer.parseInt(sc.nextLine().substring(4).trim()) - 1;
            inputLine.add(String.format("%d", correctAnswerIndex));
            
            Question question = new Question(questionText, correctAnswerIndex);
        }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
