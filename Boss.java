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
    Image i = bossCharacter("Images/BossBod1.png", 128, 128);
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
        int caught = 0;
        boolean grab = false;
        while (caught < 6) {
            if (grab == true) {
                caught++;
                grab = false;
            }
            if (a.x > this.x) {
                this.x += 3;
            }
            if (a.x < x) {
                this.x -= 3;
            }
            if ((a.y - 150) > this.y) {
                this.y += 1;
            }
            if ((a.y - 150) < this.y) {
                this.y -= 1;
            }
            if ((a.x < (this.x + 11) && a.x > (this.x - 11))) {
                grab = true;
            }
            try {
                sleep(35);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            bl.catchUP();
            br.catchUP();

        }

    }

    public void bullets(Player a, BossLArm bl, BossRArm br, Bullet f1, Bullet f2, Bullet f3, Bullet f4, Bullet f5,
            Bullet f6, Bullet f7, Bullet f8) {
        int timer = 0;

        while (timer < 100) {
            timer++;
            if (timer == 10 || timer == 20 || timer == 30 || timer == 40 || timer == 50 || timer == 60 || timer == 70
                    || timer == 80 || timer == 90 || timer == 100) {
                // Spawn bullets from his shoulder guns with diagonal velocity.
                if (timer == 10 || timer == 50 || timer == 90) {
                    f1.vx = 4;
                    f1.vy = -13;
                    f1.x = (bl.x + 45);
                    f1.y = (bl.y + 14);
                    f2.vx = -4;
                    f2.vy = -13;
                    f2.x = (br.x + 3);
                    f2.y = (bl.y + 14);
                }
                if (timer == 20 || timer == 60) {
                    f3.vx = 4;
                    f3.vy = -13;
                    f3.x = (bl.x + 45);
                    f3.y = (bl.y + 14);
                    f4.vx = -4;
                    f4.vy = -13;
                    f4.x = (br.x + 3);
                    f4.y = (bl.y + 14);
                }
                if (timer == 30 || timer == 70) {
                    f5.vx = 4;
                    f5.vy = -13;
                    f5.x = (bl.x + 45);
                    f5.y = (bl.y + 14);
                    f6.vx = -4;
                    f6.vy = -13;
                    f6.x = (br.x + 3);
                    f6.y = (bl.y + 14);
                }
                if (timer == 40 || timer == 80) {
                    f7.vx = 4;
                    f7.vy = -13;
                    f7.x = (bl.x + 45);
                    f7.y = (bl.y + 14);
                    f8.vx = -4;
                    f8.vy = -13;
                    f8.x = (br.x + 3);
                    f8.y = (bl.y + 14);
                }

                System.out.print("pew! pew! ");
            }
            if (a.x > this.x) {
                this.x += 2;
            }
            if (a.x < x) {
                this.x -= 2;
            }
            if ((a.y - 150) > this.y) {
                this.y += 1;
            }
            if ((a.y - 150) < this.y) {
                this.y -= 1;
            }
            try {
                sleep(30);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            bl.catchUP();
            br.catchUP();

        }
    }

    public void hyperbeam(Player a, BossLArm bl, BossRArm br, Laser l1) {
        int timer = 0;
        while (timer < 100) {
            timer++;
            if (timer <= 15) {
                l1.setCharge(1);
                l1.catchUP();
                // womwomwomwom
            }
            if (timer > 15 && timer < 40) {
                l1.setCharge(2);
                l1.catchUP();
                // smol laser
            }
            if (timer >= 40 && timer < 80) {
                l1.setCharge(3);
                l1.catchUP();
                // BZZZZT
            }
            if (timer >= 80 && timer < 90) {
                l1.setCharge(4);
                l1.catchUP();
                // fizzle
            }
            if (timer >= 90) {
                l1.setCharge(5);
                l1.catchUP();
                // fizzle
            }

            System.out.print("bzzzZZZZZZZZZZt " + l1.charge);

            if (a.x > (this.x + 108)) {
                this.x += 2;
            } else {
                this.x -= 2;
            }
            if ((a.y - 150) > this.y) {
                this.y += 1;
            }
            if ((a.y - 150) < this.y) {
                this.y -= 1;
            }
            try {
                sleep(40);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            bl.catchUP();
            br.catchUP();

        }
        l1.setCharge(6);
        l1.x = -80;
        l1.y = 0;
        l1.LasAni();
    }

    public void patrol(Player a, BossLArm bl, BossRArm br) {
        if ((a.y - 125) > y) {
            y += 5;
        } else if ((a.y - 125) < y) {
            y -= 5;
        }
        while (this.y > 5) {
            this.y--;
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
        while (this.x >= 38) {
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
        while (this.x <= 435) {
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