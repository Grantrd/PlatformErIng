import javax.swing.*;
import java.awt.*;
public class Screen extends JPanel {
    private static final long serialVersionUID = 1L;
    private static final int floor = 505;
    int x = 500;   
    int y = floor;
    String playerL =  "hornet.png";
    String backgroundL = "background.png";
    public Screen() {
        setLayout(null);
        repaint();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);       
        draw(g);
    }
    public void draw(Graphics g){
        Image player = character(playerL, 200, 200);
        Image background = bc(backgroundL);
        g.drawImage(background, 0, 0, this);
        g.drawImage(player, x, y, this);
        repaint();
    }

    public Image character(String i, int sx, int sy) {
        Image character = new ImageIcon(new ImageIcon(i).getImage().getScaledInstance(sx, sy, Image.SCALE_DEFAULT))
                .getImage();
        return character;
    }

    public Image bc(String i) {
        Image bc = new ImageIcon(new ImageIcon(i).getImage().getScaledInstance(1000, 800, Image.SCALE_DEFAULT)).getImage();
        return bc;
    } 
}