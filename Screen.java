import javax.swing.*;
import java.awt.*;

public class Screen extends JPanel {
    private static final long serialVersionUID = 1L;
    final int floor = 184;
    int x = 0;
    int y = floor;
    String playerL = "duck1.png";
    String backgroundL = "background.png";
    Image player; //= character(playerL, 64, 64);
    Image background = bc(backgroundL);
    String playerm = "duck2.png";
    boolean one = false;

    public Screen() {
        setLayout(null);
        repaint();
    }

    @Override
    public void paintComponent(Graphics g) {
        ani();
        super.paintComponent(g);
        g.drawImage(background, 0, 0, this);
        g.drawImage(player, x, y, this);

    }

    public void ani() {
        if (one) {
            player = character(playerL, 64, 64);
            one = false;
        } else {
            player = character(playerm, 64, 64);
            one = true;
        }
    }

    public Image character(String i, int sx, int sy) {
        Image character = new ImageIcon(new ImageIcon(i).getImage().getScaledInstance(sx, sy, Image.SCALE_DEFAULT))
                .getImage();
        return character;
    }

    public Image bc(String i) {
        Image bc = new ImageIcon(new ImageIcon(i).getImage().getScaledInstance(600, 256, Image.SCALE_DEFAULT))
                .getImage();
        return bc;
    }
}