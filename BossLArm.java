import javax.swing.*;
import java.awt.*;

public class BossLArm extends Thread {
    int x;
    int y;
    int vx = 0;
    int vy = 0;
    int health = 100;
    int sizex = 64;
    int sizey = 64;
    int frameCount = 0;
    String player1 = "BossLArm1.png";
    String player2 = "BossLArm2.png";
    String player;
    Image i = bossCharacter("BossLArm1.png", 64, 64);
    int floor = 184;
    boolean hasJump = true;
    boolean one = true;
    boolean up = false;
    boolean down = false;
    boolean left = false;
    boolean right = false;
    Boss b;

    public BossLArm(Boss a) {
        this.b = a;
        this.x = a.x - 63;
        this.y = a.y + 13;
    }

    public Image bossCharacter(String i, int sx, int sy) {
        Image bossCharacter = new ImageIcon(new ImageIcon(i).getImage().getScaledInstance(sx, sy, Image.SCALE_DEFAULT))
                .getImage();
        return bossCharacter;
    }

    public void BLAni() {
        if (one) {
            i = bossCharacter(player1, 128, 128);
            one = false;
        } else {
            i = bossCharacter(player2, 128, 128);
            one = true;

        }
    }

    public void catchUP() {
        if (this.x != (b.x - 63)) {
            this.x = (b.x - 63);
        }
        if (this.y != (b.y + 13)) {
            this.y = (b.y + 13);
        }

    }

}

