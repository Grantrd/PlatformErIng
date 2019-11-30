import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Game implements KeyListener {

    private static final int WIDTH = 1000;
    private static final int HEIGHT = 800;
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

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            screen.y -= 2;
            System.out.println("up");
        } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            screen.y += 2;
            System.out.println("down");

        } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            screen.x -= 2;
            System.out.println("left");
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            screen.x += 2;
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    public void gameLoop() {
        boolean runnable = true;
        while (runnable) {
            frame.addKeyListener(this);
            screen.draw(g);
        }
    }
}
