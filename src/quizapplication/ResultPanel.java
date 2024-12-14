/*
 * Display Score
 */
package quizapplication;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author Nguyen Kim Bao Nguyen - CE191239
 */
public class ResultPanel {
    private MainFrame mainFrame;
    private JLabel resultLabel;
    private JButton restartButton;
    
    public ResultPanel(MainFrame mainFrame) {
        this.mainFrame = mainFrame;
        mainFrame.setLayout(new BorderLayout());
        
        resultLabel = new JLabel("Score ");
        mainFrame.add(resultLabel, BorderLayout.CENTER);
        
        restartButton = new JButton("Restart");
        mainFrame.add(restartButton, BorderLayout.SOUTH);
    }
    
    public void setResult(int score) {
        resultLabel.setText("I know you will get: " + score + "!");
    }
}
