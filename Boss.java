import javax.swing.*;
import java.awt.*;

public class Boss extends Thread {
    int x;
    int y;
    int vx = 0;
    int vy = 0;
    int health = 100;
    int sizex = 64;
    int sizey = 64;
    int frameCount = 0;
    String player1 = "BossBod1.png";
    String player2 = "BossBod2.png";
    String player3 = "BossBod3.png";
    String player4 = "BossBod4.png";
    String player5 = "BossBod5.png";
    String player6 = "BossBod6.png";
    String player7 = "BossBod7.png";
    String player8 = "BossBod8.png";
    String player;
    Image i = bossCharacter("BossBod1.png", 64, 64);
    int floor = 184;
    boolean hasJump = true;

    boolean up = false;
    boolean down = false;
    boolean left = false;
    boolean right = false;

    public Boss(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Image bossCharacter(String i, int sx, int sy) {
        Image bossCharacter = new ImageIcon(new ImageIcon(i).getImage().getScaledInstance(sx, sy, Image.SCALE_DEFAULT))
                .getImage();
        return bossCharacter;
    }

    public void BAni() {
        frameCount++;

        if (frameCount == 1) {
            i = bossCharacter(player1, 128, 128);

        }
        else if (frameCount == 2) {
            i = bossCharacter(player2, 128, 128);

        }
        else if (frameCount == 3) {
            i = bossCharacter(player3, 128, 128);

        }
        else if (frameCount == 4) {
            i = bossCharacter(player4, 128, 128);

        }
        else if (frameCount == 5) {
            i = bossCharacter(player5, 128, 128);

        }
        else if (frameCount == 6) {
            i = bossCharacter(player6, 128, 128);

        }
        else if (frameCount == 7) {
            i = bossCharacter(player7, 128, 128);

        }
        else if (frameCount == 8) {
            i = bossCharacter(player8, 128, 128);
            frameCount = 0;

        } else {
            i = bossCharacter(player1, 128, 128);
            frameCount = 2;
        }
    }

}