import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class Thred extends Thread implements KeyListener {
    JFrame p;
    Screen n;

    public Thred(JFrame t, Screen q) {
        this.p = t;
        this.n = q;
    }

    @Override
    public void run() {
        p.addKeyListener(this);
        while (true) {
            //System.out.println("Hello");
            if (n.up) {
                n.y -= 150;
                n.up = false;
            }
            if (n.down) {
                n.y += 2;
                n.down = false;
            }
            if (n.left) {
                n.x -= 2;
                n.left = false;
            }
            if (n.right) {
                n.x += 2;
                n.right = false;
            }
            n.repaint();
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