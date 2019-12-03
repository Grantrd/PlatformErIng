import javax.swing.JFrame;

public class Thrad extends Thread {
    Screen s;
    JFrame j;
    double g = 30;
    int duckM = 1;
    int count = 1;
    double fall;

    public Thrad(JFrame f, Screen n) {
        this.s = n;
        this.j = f;
    }

    public void gravity() {
        fall = (g * duckM * count *.3);
        if (s.y < s.floor) {
            System.out.println("fall: " + fall);
            if (fall < (s.floor - s.y)) {
                s.y += fall;
            } else {
                s.y = s.floor;
                count = 1;
            }
            count++;
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
        }
    }
}