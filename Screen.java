import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
//import java.awt.event.KeyListener;

public class Screen extends JPanel {// implements KeyListener {
    int x = 500;
    int y = 505;
    private KeyEvent e;

    public Screen() {
        setLayout(null);
        repaint();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Toolkit tool = Toolkit.getDefaultToolkit();
        setBackground(Color.GREEN);
        g.setColor(Color.LIGHT_GRAY);
        // g.fillRect(0, 0, 100, 100);
        player(g);
    }

    public void player(Graphics g) {
        Image player = new ImageIcon(
                new ImageIcon("hornet.png").getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT)).getImage();
        Image bc = new ImageIcon(
                new ImageIcon("background.png").getImage().getScaledInstance(1000, 800, Image.SCALE_DEFAULT))
                        .getImage();
        super.paintComponent(g);
        g.drawImage(bc, 0, 0, this);
        g.drawImage(player, x, y, this);
        controls(e);
        validate();
    }

    public void controls(KeyEvent e) {
        System.out.println(x);
        System.out.println(y);
        try {
            if (e.getKeyCode() == KeyEvent.VK_LEFT) {
                x -= 2;
                System.out.println("x-");
            }

            if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
                x += 2;
                System.out.println("x+");
            }

            if (e.getKeyCode() == KeyEvent.VK_UP) {
                y -= 2;
                System.out.println("y-");
            }

            if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                y += 2;
                System.out.println("y+");
            }
        } catch (Exception s) {
            // TODO: handle exception
        }
    }
}
