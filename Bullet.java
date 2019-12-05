import javax.swing.*;
import java.awt.*;


public class Bullet extends Thread{
    int x = -30;
    int y = 0;
    int vx = 0;
    int vy = 0;
    int threat = 10;
    int sizex = 64;
    int sizey = 64;
    String player1 = "Images/bullet1.png";
    String player2 = "Images/bullet2.png";
    String player;
    Image i = character("Images/bullet1.png", 64, 64);
    int floor = 300;
    boolean one = false;

    public Bullet(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Image character(String i, int sx, int sy) {
        Image character = new ImageIcon(new ImageIcon(i).getImage().getScaledInstance(sx, sy, Image.SCALE_DEFAULT))
                .getImage();
        return character;
    }

    public void BulAni(){
        if (one) {
            i = character(player1, 64, 64);
            one = false;
            yield();
            
        } else {
            i = character(player2, 64, 64);
            one = true;
            yield();
            
        }
    }

}