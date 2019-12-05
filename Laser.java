import javax.swing.*;
import java.awt.*;

public class Laser extends Thread {
    int x = -80;
    int y = 0;
    int threat = 40;
    int sizex = 64;
    int sizey = 64;
    int frameCount = 0;
    String player1 = "Images/Laser1.png";
    String player2 = "Images/Laser2.png";
    String player3 = "Images/Laser3.png";
    String player4 = "Images/Laser4.png";
    String player;
    Image i;
    int floor = 184;
    boolean hasJump = true;
    boolean up = false;
    boolean down = false;
    boolean left = false;
    boolean right = false;
    int charge = 1;
    Boss b;
    BossRArm br;

    public Laser(Boss b, BossRArm br) {
        this.b = b;
        this.br = br;
    }

    public Image laserCharacter(String i, int sx, int sy) {
        Image laserCharacter = new ImageIcon(new ImageIcon(i).getImage().getScaledInstance(sx, sy, Image.SCALE_DEFAULT))
                .getImage();
        return laserCharacter;
    }

    public void setCharge(int i) {
        charge = i;
    }

    public void LasAni() {
        if (charge == 1) {
            i = laserCharacter(player1, 128, 220);

        } else if (charge == 2 || charge == 4) {
            i = laserCharacter(player2, 128, 220);

        } else if (charge == 3) {
            i = laserCharacter(player3, 128, 220);

        } else if (charge == 5) {
            i = laserCharacter(player4, 128, 220);
        }
    }

    public void catchUP() {
        if (br.one) {
            if (this.x != (b.x + 86)) {
                this.x = (b.x + 86);
            }
            //if (this.y != (b.y + 86)) {
            //    this.y = (b.y + 86);
            //}
            if (this.y != (b.y + 57)) {
                this.y = (b.y + 57);
            }
        } else {
            if (this.x != (b.x + 86)) {
                this.x = (b.x + 86);
            }
            // if (this.y != (b.y + 93)) {
            //     this.y = (b.y + 93);
            // }
            if (this.y != (b.y + 64)) {
                this.y = (b.y + 64);
            }
        }
    }

}
