import javax.swing.*;
import java.awt.*;

public class Player extends Thread {
    int x;
    int y;
    int vx = 0;
    int vy = 0;
    int health = 100;
    int sizex = 64;
    int sizey = 64;
    String player1 = "duck2.png";
    String player2 = "duck1.png";
    String player;
    Image i = character("duck1.png", 64, 64);
    int floor = 184;
    boolean hasJump = true;
    boolean one = false;
    boolean up = false;
    boolean down = false;
    boolean left = false;
    boolean right = false;

    public Player(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Image character(String i, int sx, int sy) {
        Image character = new ImageIcon(new ImageIcon(i).getImage().getScaledInstance(sx, sy, Image.SCALE_DEFAULT))
                .getImage();
        return character;
    }

    public void ani() {
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