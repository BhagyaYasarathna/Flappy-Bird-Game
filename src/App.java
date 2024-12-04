import javax.swing.*;

import javax.swing.JFrame;

public class App {
    public static void main(String[] args) throws Exception {
        int boardWidth = 360; // in px
        int boardHeight = 640; // in px

        JFrame frame = new JFrame("Flaffy Bird");
        // frame.setVisible(true);
        frame.setSize(boardWidth, boardHeight);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        FlappyBird flappyBird = new FlappyBird();
        frame.add(flappyBird);
        frame.pack();
        flappyBird.requestFocus();
        frame.setVisible(true);
    }
}
