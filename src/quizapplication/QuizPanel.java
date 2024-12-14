/*
 * Display questions and answers
 */
package quizapplication;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Nguyen Kim Bao Nguyen - CE191239
 */
public class QuizPanel extends JPanel {
    private MainFrame mainFrame;
    private JLabel questionLabel;
    private JButton[] answerButtons;
    private JButton nextButton;
    private JButton submitButton;
    
    public QuizPanel(MainFrame m) {
        this.mainFrame = m;
        
        questionLabel = new JLabel("Quiz: ");
        add(questionLabel, BorderLayout.NORTH);
        
        JPanel answersPanel = new JPanel(new GridLayout(4, 1)); 
        answerButtons = new JButton[4];
        for (int i = 0; i < 4; i++) {
            answerButtons[i] = new JButton("Answer " + (i + 1));
            answersPanel.add(answerButtons[i]);
        }
        add(answersPanel, BorderLayout.CENTER);
        
        JPanel controlPanel = new JPanel(new GridLayout(1, 2));
        nextButton = new JButton("Next");
        submitButton = new JButton("Submit");
        controlPanel.add(nextButton);
        controlPanel.add(submitButton);
        add(controlPanel, BorderLayout.SOUTH);
    }
}
