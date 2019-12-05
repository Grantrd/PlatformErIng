import javax.swing.JFrame;

public class Thrid extends Thread {
    JFrame p;
    Screen s;
    Player n;
    Boss b;
    BossLArm bl;
    BossRArm br;
    Boolean run = true;
    Bullet f1, f2, f3, f4, f5, f6, f7, f8;

    public Thrid(JFrame frame, Player p2, Boss b, BossLArm bl, BossRArm br, Screen screen, Bullet f1, Bullet f2, 
    Bullet f3, Bullet f4, Bullet f5, Bullet f6, Bullet f7, Bullet f8) {
        this.n = p2;
        this.p = frame;
        this.b = b;
        this.bl = bl;
        this.br = br;
        this.s = screen;
        this.f1 = f1; this.f2 = f2; this.f3 = f3; this.f4 = f4;
        this.f5 = f5; this.f6 = f6; this.f7 = f7; this.f8 = f8;
    }

    public void run() {
        while(run){
        s.animPrime();
        try {
            sleep(500);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }}
    }
}