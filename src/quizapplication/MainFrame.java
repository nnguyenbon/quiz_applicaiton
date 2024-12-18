package quizapplication;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

/**
 * Main frame for the Quiz Application.
 */
public class MainFrame extends JFrame {

    final int WINDOW_WIDTH = 800;
    final int WINDOW_HEIGHT = 800;
    private JPanel mainPanel;
    private QuizController quizController;
    private QuizPanel quizPanel;

    public MainFrame() {
        this.setTitle("Quiz Application");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        this.setLayout(new BorderLayout());
        this.setVisible(true);
        this.setLocationRelativeTo(null);

        JLabel label = new JLabel("Quiz Application");
        label.setForeground(Color.black);
        label.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 60));
        label.setHorizontalAlignment(SwingConstants.CENTER);
        this.add(label, BorderLayout.NORTH);
        
        quizController = new QuizController();
        quizController.loadQuestionFromFile("quiz.txt");

        quizPanel = new QuizPanel(this);
        showFirstQuestion();

        this.add(quizPanel, BorderLayout.CENTER);
    }

    /**
     * Display quiz from QuizController.
     */
    private void showFirstQuestion() {

    }
}
