import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class Thred extends Thread implements KeyListener {
    JFrame p;
    Screen s;
    Player n;

    public Thred(JFrame frame, Player p2, Screen screen) {
        this.n = p2;
        this.p = frame;
        this.s = screen;
    }

	@Override
    public void run() {
        p.addKeyListener(this);
        while (true) {
            //System.out.println("Hello");
            if (n.up) {
                n.vy = 30;
                n.up = false;
            }
            if (n.down) {
                n.y += 0;
                n.down = false;
            }
            if (n.left) {
                n.vx += -6;
                if (n.vx < -12){
                    n.vx = -12;
                }
                n.left = false;
            }
            if (n.right) {
                n.vx += 6;
                if (n.vx > 12){
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