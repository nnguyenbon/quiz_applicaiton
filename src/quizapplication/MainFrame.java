/*
 * Include QuizPanel, ResultPanel
 */
package quizapplication;

import java.awt.HeadlessException;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Nguyen Kim Bao Nguyen - CE191239
 */
public class MainFrame extends JFrame{
    final int WINDOW_WIDTH = 800;
    final int WINDOW_HEIGHT = 800;
    private JPanel mainPanel;

    public MainFrame() {
        this.setTitle("Quiz Application");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
    }
    
    
}
