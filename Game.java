import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Game implements KeyListener {

    private static final int WIDTH = 600;
    private static final int HEIGHT = 293;
    JFrame frame = new JFrame("Platformering");
    Screen screen = new Screen();
    Graphics g;
    boolean up = false;
    boolean down = false;
    boolean left = false;
    boolean right = false;

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
        if (e.getKeyCode() == KeyEvent.VK_SPACE) {
            screen.y -= 30;
        }
        if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            screen.y += 2;

        }
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            screen.x -= 2;
        }
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            screen.x += 2;
        }
        screen.repaint();
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
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
        // gravity();
        // System.out.println("hi");
        // try {
        // Thread.sleep(200);
        // } catch (InterruptedException e) {
        // // TODO Auto-generated catch block
        // e.printStackTrace();
        // }
        // frame.addKeyListener(this);
        // }
        Thred t1 = new Thred(2);
        Thred t2 = new Thred(3);
        t1.start();
        t2.start();

    }
}