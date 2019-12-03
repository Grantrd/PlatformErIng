import javax.swing.JFrame;

public class Thrad extends Thread {
    Player s;
    JFrame j;
    double g = 30;
    int duckM = 1;
    int count = 1;
    double fall;
    Boss b;

    public Thrad(JFrame f, Player n, Boss b) {
        this.s = n;
        this.j = f;
        this.b = b;
    }

    public void gravity() {
        if (s.y == s.floor){
            s.hasJump = true;
        }
        fall = (g * duckM * count *.3);
        if (s.y < s.floor) {
            s.hasJump = false;
            if (fall < (s.floor - s.y)) {
                s.y += fall;
            } else {
                s.y = s.floor;
                count = 1;
                s.vy = 0;
            }
            count++;
        }
    }
    public void velocity() {
        if(s.vx != 0 || s.vy != 0){
            if (s.vx > 0){
                s.x += s.vx; 
                if (s.y == s.floor){
                    s.vx -= 1;
                }     
            }
            if (s.vx < 0){
                s.x += s.vx;
                if (s.y == s.floor){
                s.vx +=1;
                }
            }
            if (s.vy > 0){
                s.y -= s.vy;
            }
            if (s.vy < 0){
                s.y += s.vy;
            }
        }
    }

    public void run() {
        while (true) {
            try {
                sleep(100);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            gravity();
            velocity();
        }
    }
}