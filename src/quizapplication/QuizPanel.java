package quizapplication;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

/**
 * Display questions and answers using radio buttons.
 * @author Nguyen Kim Bao Nguyen
 */
public class QuizPanel extends JPanel {
    private MainFrame mainFrame;
    private JLabel questionLabel;
    private JRadioButton[] answerButtons;
    private JButton nextButton;
    private JButton submitButton;
    private ButtonGroup buttonGroup;

    public QuizPanel(MainFrame m) {
        this.mainFrame = m;
        
        questionLabel = new JLabel("Quiz: ");
        add(questionLabel, BorderLayout.NORTH);
        
        JPanel answersPanel = new JPanel(new GridLayout(4, 1));
        answerButtons = new JRadioButton[4];
        buttonGroup = new ButtonGroup(); //Group to make sure only one option is selected

        for (int i = 0; i < 4; i++) {
            answerButtons[i] = new JRadioButton("Answer " + (i + 1));
            buttonGroup.add(answerButtons[i]);
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
    
    public void setQuestion(String question) {
        questionLabel.setText(question);
    }

    public void setAnswers(String[] answers) {
        if (answers.length == 4) {
            for (int i = 0; i < 4; i++) {
                answerButtons[i].setText(answers[i]);
            }
        }
    }

    public int getSelectedAnswer() {
        for (int i = 0; i < answerButtons.length; i++) {
            if (answerButtons[i].isSelected()) {
                return i;
            }
        }
        return -1;
    }
}
