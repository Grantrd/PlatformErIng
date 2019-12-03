import javax.swing.*;
import java.awt.*;

public class Game {

    private static final int WIDTH = 600;
    private static final int HEIGHT = 293;
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
        Thred t1 = new Thred(frame, screen);
        Thrad t2 = new Thrad(frame, screen);
        t1.start();   
        t2.start();     
    }
}