/*
 * Coordinate the flow of application activities, manage user state and responses.
 */
package quizapplication;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nguyen Kim Bao Nguyen - CE191239
 */
public class QuizController {
    private Quiz quiz;

    public QuizController() {
        this.quiz = new Quiz(); 
    }
    
    public void loadQuestionFromFile(String fileName) {
        try (BufferedReader br = new BufferedReader(new FileReader("quiz.txt"))) {
            int questionCount = Integer.parseInt(br.readLine().trim());
        
        for (int i = 0; i < questionCount; i++) {
            // Đọc nội dung câu hỏi
            String line = br.readLine();
            if (line.startsWith("Q:")) {
                String questionText = line.substring(3).trim();
                String[] answers = new String[4];
                int correctAnswerIndex = -1;

                // Đọc 4 đáp án
                for (int j = 0; j < 4; j++) {
                    line = br.readLine();
                    if (line.startsWith("C:")) {
                        answers[j] = line.substring(3).trim();
                    }
                }

                // Đọc đáp án đúng
                line = br.readLine();
                if (line.startsWith("An:")) {
                    correctAnswerIndex = Integer.parseInt(line.substring(4).trim()) - 1;
                }
            }
        }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
