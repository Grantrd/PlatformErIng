import javax.swing.*;
import java.awt.*;

public class Game {

    private static final int WIDTH = 616;
    private static final int HEIGHT = 293;
    JFrame frame = new JFrame("Duckman In Space!");
    Player p = new Player(0, 184); 
    Boss b = new Boss(198, 0);
    BossLArm bl = new BossLArm(b);
    BossRArm br = new BossRArm(b);
    Bullet f1 = new Bullet(-60, 0); Bullet f2 = new Bullet(-60, 0); Bullet f3 = new Bullet(-60, 0); 
    Bullet f4 = new Bullet(-60, 0); Bullet f5 = new Bullet(-60, 0); Bullet f6 = new Bullet(-60, 0); 
    Bullet f7 = new Bullet(-60, 0); Bullet f8 = new Bullet(-60, 0);
    Screen screen = new Screen(p, b, bl, br, f1, f2, f3, f4, f5, f6, f7, f8);
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
        Thred t1 = new Thred(frame, p, b, bl, br, screen, f1, f2, f3, f4, f5, f6, f7, f8);
        Thrad t2 = new Thrad(frame, p, b, f1, f2, f3, f4, f5, f6, f7, f8);
        Thrid t4 = new Thrid(frame, p, b, bl, br, screen, f1, f2, f3, f4, f5, f6, f7, f8);
        Throd t3 = new Throd(frame, p, b, bl, br, f1, f2, f3, f4, f5, f6, f7, f8);
        t1.start();   
        t2.start(); 
        t4.start();
        t3.start();    
    }
}