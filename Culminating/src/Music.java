import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Music extends JPanel implements ActionListener {

    JPanel welcomePanel = new JPanel();
    JPanel gamePanel = new JPanel();

    public Music() {
        super(new BorderLayout());
        welcomePanel.setBackground(Color.WHITE);

        gamePanel.setBackground(Color.BLACK);

        JButton startgame = new JButton("Start Game");
        startgame.addActionListener(this);

        JButton restart = new JButton("Restart");
        restart.addActionListener(this);

        welcomePanel.add(startgame);
        gamePanel.add(restart);

        add(welcomePanel);
    }

    /** Listens to the buttons and perfomr the swap. */
    public void actionPerformed(ActionEvent e) {

        for (Component component : getComponents())
            if (welcomePanel == component) {
                remove(welcomePanel);
                add(gamePanel);

            } else {
                remove(gamePanel);
                add(welcomePanel);
            }

        repaint();
        revalidate();
    }

    /**
     * Create the GUI and show it. For thread safety, this method should be
     * invoked from the event-dispatching thread.
     */
    private static void createAndShowGUI() {
        // Create and set up the window.
        JFrame frame = new JFrame("PanelSwap");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 600);//Set Size
        // Create and set up the content pane.
        JComponent newContentPane = new Music();
        newContentPane.setOpaque(true); // content panes must be opaque
        frame.setContentPane(newContentPane);

        // Display the window.
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        // Schedule a job for the event-dispatching thread:
        // creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}