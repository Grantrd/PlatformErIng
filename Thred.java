import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class Thred extends Thread implements KeyListener {
    boolean up = false;
    boolean down = false;
    boolean left = false;
    boolean right = false;
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
            System.out.println(n.y);
            System.out.println(n.x);
            if(up)
            {
                n.y -= 2;
                up = false;
            }
            if(down)
            {
                n.y += 2;
                down = false;
            }
            if(left)
            {
                n.x -= 2;
                left = false;
            }
            if(right)
            {
                n.x += 2;
                right = false;
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
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            up = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            down = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            left = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            right = true;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub

    }

}