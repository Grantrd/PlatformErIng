import javax.swing.*;
import java.awt.*;

public class Screen extends JPanel {
    private static final long serialVersionUID = 1L;
    String backgroundL = "background.png";
    Image background = bc(backgroundL);
    Player p;
    Boss b;
    BossLArm bl;
    BossRArm br;
    Anim o;
    int lastCount = 0;

    public Screen(Player p, Boss b, BossLArm bl, BossRArm br) {
        this.p = p;
        this.b = b;
        this.bl = bl;
        this.br = br;
        setLayout(null);
        repaint();
    }

    @Override
    public void paintComponent(Graphics g) {
        p.PAni();
        b.BAni();
        bl.BLAni();
        br.BRAni();
        super.paintComponent(g);
        g.drawImage(background, 0, 0, this);
        g.drawImage(p.i, p.x, p.y, this);
        g.drawImage(b.i, b.x, b.y, this);
        g.drawImage(bl.i, bl.x, bl.y, this);
        g.drawImage(br.i, br.x, br.y, this);
    }

    public Image bc(String i) {
        Image bc = new ImageIcon(new ImageIcon(i).getImage().getScaledInstance(600, 256, Image.SCALE_DEFAULT))
                .getImage();
        return bc;
    }
}