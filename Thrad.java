import javax.swing.JFrame;

public class Thrad extends Thread {
    Player s;
    JFrame j;
    double g = 30;
    int duckM = 1;
    int count = 1;
    double fall;

    public Thrad(JFrame f, Player n) {
        this.s = n;
        this.j = f;
    }

    public void gravity() {
        if (s.y == s.floor){
            s.hasJump = true;
        }
        fall = (g * duckM * count *.3);
        if (s.y < s.floor) {
            s.hasJump = false;
            System.out.println("fall: " + fall);
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
                System.out.println(s.vx + " " + s.vy);
                s.x += s.vx; 
            }
            if (s.vx < 0){
                s.x += s.vx;
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
            // System.out.print(" world");
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