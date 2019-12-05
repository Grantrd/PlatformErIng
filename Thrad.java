import javax.swing.JFrame;

public class Thrad extends Thread {
    Player s;
    JFrame j;
    double g = 30;
    int duckM = 1;
    int count = 1;
    double fall;
    Boss b;
    Bullet f1, f2, f3, f4, f5, f6, f7, f8;
    Laser l1;

    public Thrad(JFrame f, Player n, Boss b, Bullet f1, Bullet f2, 
    Bullet f3, Bullet f4, Bullet f5, Bullet f6, Bullet f7, Bullet f8, Laser l1) {
        this.s = n;
        this.j = f;
        this.b = b;
        this.f1 = f1; this.f2 = f2; this.f3 = f3; this.f4 = f4;
        this.f5 = f5; this.f6 = f6; this.f7 = f7; this.f8 = f8;
        this.l1 = l1;
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
            if (s.vy < 0 || s.vy > 0){
                s.y -= s.vy;
            }
        }
    }
    public void projectileUpdate(Bullet f){
        if(f.vx != 0 || f.vy != 0){
            if (f.vx > 0){
                f.x += f.vx; 
                if (f.y == f.floor){
                    f.vx -= 1;
                }     
            }
            if (f.vx < 0){
                f.x += f.vx;
                if (f.y == f.floor){
                f.vx +=1;
                }
            }
            if (f.vy < 0 || f.vy > 0){
                f.y -= f.vy;
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
            projectileUpdate(f1); projectileUpdate(f2); projectileUpdate(f3); projectileUpdate(f4);
            projectileUpdate(f5); projectileUpdate(f6); projectileUpdate(f7); projectileUpdate(f8);
            l1.LasAni();
        }
    }
}