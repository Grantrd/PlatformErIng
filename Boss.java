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
    String player1 = "Images/BossBod1.png";
    String player2 = "Images/BossBod2.png";
    String player3 = "Images/BossBod3.png";
    String player4 = "Images/BossBod4.png";
    String player5 = "Images/BossBod5.png";
    String player6 = "Images/BossBod6.png";
    String player7 = "Images/BossBod7.png";
    String player8 = "Images/BossBod8.png";
    String player;
    Image i = bossCharacter("Images/BossBod1.png", 64, 64);
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

        } else if (frameCount == 2) {
            i = bossCharacter(player2, 128, 128);

        } else if (frameCount == 3) {
            i = bossCharacter(player3, 128, 128);

        } else if (frameCount == 4) {
            i = bossCharacter(player4, 128, 128);

        } else if (frameCount == 5) {
            i = bossCharacter(player5, 128, 128);

        } else if (frameCount == 6) {
            i = bossCharacter(player6, 128, 128);

        } else if (frameCount == 7) {
            i = bossCharacter(player7, 128, 128);

        } else if (frameCount == 8) {
            i = bossCharacter(player8, 128, 128);
            frameCount = 0;

        } else {
            i = bossCharacter(player1, 128, 128);
            frameCount = 2;
        }
    }

    public void chase(Player a, BossLArm bl, BossRArm br) {
        boolean caught = false;
        while (!caught) {
            System.out.println(caught);
            if (a.x > this.x) {
                this.x += 1;
            }
            if (a.x < x) {
                this.x -= 1;
            }
            if ((a.y - 130) > this.y) {
                this.y += 1;
            }
            if ((a.y - 130) < this.y) {
                this.y -= 1;
            }
            if((a.x == this.x) && ((this.y - 130) == a.y)){
                caught = true;
            }
            try {
                sleep(150);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            bl.catchUP();
            br.catchUP();
            System.out.println(this.x + " " + this.y);

        }

    }

    public void patrol(Player a, BossLArm bl, BossRArm br) {
        if ((a.y - 125) > y) {
            y += 5;
        } else if ((a.y - 125) < y) {
            y -= 5;
        }
        while (this.x != 38) {
            this.x--;
            bl.catchUP();
            br.catchUP();
            if (this.x == 38) {
                break;
            }
            try {
                sleep(10);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        while (this.x != 435) {
            this.x++;
            bl.catchUP();
            br.catchUP();
            if (this.x == 435) {
                break;
            }
            try {
                sleep(10);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        while (this.x != 198) {
            this.x--;
            bl.catchUP();
            br.catchUP();
            if (this.x == 198) {
                break;
            }
            try {
                sleep(10);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}