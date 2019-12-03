import javax.swing.JFrame;

public class Throd extends Thread {
    Player s;
    JFrame j;
    Boss b;
    BossLArm bl;
    BossRArm br;

    public Throd(JFrame f, Player n, Boss a, BossLArm bl, BossRArm br) {
        this.b = a;
        this.s = n;
        this.j = f;
        this.br = br;
        this.bl = bl;
    }

    public void run() {
        b.chase(this.s, this.bl, this.br);
        b.patrol(this.s, this.bl, this.br);
    }

}