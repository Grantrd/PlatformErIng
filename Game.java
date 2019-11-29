import javax.swing.*;
import java.awt.*;
// import java.awt.event.KeyEvent;


public class Game {
    private static final int WIDTH = 1000;
    private static final int HEIGHT = 1000;
    JFrame frame = new JFrame("Platformering");
    Screen screen = new Screen();
    Graphics g;

    public Game() {
        frame.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        frame.setMinimumSize(new Dimension(WIDTH, HEIGHT));
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(screen);
        frame.setVisible(true);

    }

    public void gameLoop() {
        boolean runnable = true;
        while (runnable) {
            screen.player(g);
        }
    }
}