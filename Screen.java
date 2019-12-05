import javax.swing.*;
import java.awt.*;

public class Screen extends JPanel {
    private static final long serialVersionUID = 1L;
    String backgroundL = "Images/background.png";
    Image background = bc(backgroundL);
    Player p;
    Boss b;
    BossLArm bl;
    BossRArm br;
    Anim o;
    int lastCount = 0;
    Bullet f1, f2, f3, f4, f5, f6, f7, f8;
    Laser l1;

    public Screen(Player p, Boss b, BossLArm bl, BossRArm br, Bullet f1, Bullet f2, 
    Bullet f3, Bullet f4, Bullet f5, Bullet f6, Bullet f7, Bullet f8, Laser l1) {
        this.p = p;
        this.b = b;
        this.bl = bl;
        this.br = br;
        this.f1 = f1; this.f2 = f2; this.f3 = f3; this.f4 = f4;
        this.f5 = f5; this.f6 = f6; this.f7 = f7; this.f8 = f8;
        this.l1 = l1;
        setLayout(null);
        repaint();
    }
    public void animPrime(){
        p.PAni();
        b.BAni();
        bl.BLAni();
        br.BRAni();
        f1.BulAni(); f2.BulAni(); f3.BulAni(); f4.BulAni(); 
        f5.BulAni(); f6.BulAni(); f7.BulAni(); f8.BulAni();
        
    }
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        l1.LasAni();
        g.drawImage(background, 0, 0, this);
        g.drawImage(p.i, p.x, p.y, this);
        g.drawImage(b.i, b.x, b.y, this);
        g.drawImage(bl.i, bl.x, bl.y, this);
        g.drawImage(br.i, br.x, br.y, this);
        g.drawImage(l1.i, l1.x, l1.y, this);
        g.drawImage(f1.i, f1.x, f1.y, this);  g.drawImage(f2.i, f2.x, f2.y, this);
        g.drawImage(f3.i, f3.x, f3.y, this);  g.drawImage(f4.i, f4.x, f4.y, this);
        g.drawImage(f5.i, f5.x, f5.y, this);  g.drawImage(f6.i, f6.x, f6.y, this);
        g.drawImage(f7.i, f7.x, f7.y, this);  g.drawImage(f8.i, f8.x, f8.y, this);
        
    }

    public Image bc(String i) {
        Image bc = new ImageIcon(new ImageIcon(i).getImage().getScaledInstance(600, 256, Image.SCALE_DEFAULT))
                .getImage();
        return bc;
    }
}