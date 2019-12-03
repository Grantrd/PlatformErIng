import javax.swing.*;
import java.awt.*;

public class Screen extends JPanel {
    private static final long serialVersionUID = 1L;
    String backgroundL = "background.png";
    Image background = bc(backgroundL);
    Player p;

    public Screen(Player p) {
        this.p = p;
        setLayout(null);
        repaint();
    }

    @Override
    public void paintComponent(Graphics g) {
        p.ani();
        super.paintComponent(g);
        g.drawImage(background, 0, 0, this);
        g.drawImage(p.i, p.x, p.y, this);
    }

    public Image bc(String i) {
        Image bc = new ImageIcon(new ImageIcon(i).getImage().getScaledInstance(600, 256, Image.SCALE_DEFAULT))
                .getImage();
        return bc;
    }
}