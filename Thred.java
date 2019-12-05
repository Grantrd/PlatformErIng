import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class Thred extends Thread implements KeyListener {
    JFrame p;
    Screen s;
    Player n;
    Boss b;
    BossLArm bl;
    BossRArm br;
    Bullet f1, f2, f3, f4, f5, f6, f7, f8;

    public Thred(JFrame frame, Player p2, Boss b, BossLArm bl, BossRArm br, Screen screen, Bullet f1, Bullet f2, 
    Bullet f3, Bullet f4, Bullet f5, Bullet f6, Bullet f7, Bullet f8) {
        this.n = p2;
        this.p = frame;
        this.b = b;
        this.bl = bl;
        this.br = br;
        this.s = screen;
        this.f1 = f1; this.f2 = f2; this.f3 = f3; this.f4 = f4;
        this.f5 = f5; this.f6 = f6; this.f7 = f7; this.f8 = f8;
    }

    @Override
    public void run() {
        p.addKeyListener(this);
        s.animPrime();
        while (true) {
            if (n.up) {
                n.vy = 30;
                n.up = false;
            }
            if (n.down) {
                n.y += 0;
                n.down = false;
            }
            if (n.left) {
                n.vx += -9;
                if (n.vx < -12) {
                    n.vx = -12;
                }
                n.left = false;
            }
            if (n.right) {
                n.vx += 9;
                if (n.vx > 12) {
                    n.vx = 12;
                }
                n.right = false;
            }
            s.repaint();
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_SPACE) {
            n.up = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            n.down = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            n.left = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            n.right = true;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub

    }

}