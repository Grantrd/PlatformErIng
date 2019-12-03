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

    public void gravity() {
        if (screen.y < screen.floor) {
            System.out.println(screen.y);
            screen.y++;
        }
    }

    public void gaming() {
        gravity();
    }

    public void gameLoop() {
        Thred t1 = new Thred(frame, screen);
        t1.start();        
        System.out.println("hi");
    }
}