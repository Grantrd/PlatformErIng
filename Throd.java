import javax.swing.JFrame;

public class Throd extends Thread {
    Player s;
    JFrame j;
    Boss b;
    BossLArm bl;
    BossRArm br;
    Bullet f1, f2, f3, f4, f5, f6, f7, f8;

    public Throd(JFrame f, Player n, Boss a, BossLArm bl, BossRArm br, Bullet f1, Bullet f2, 
    Bullet f3, Bullet f4, Bullet f5, Bullet f6, Bullet f7, Bullet f8) {
        this.b = a;
        this.s = n;
        this.j = f;
        this.br = br;
        this.bl = bl;
        this.f1 = f1; this.f2 = f2; this.f3 = f3; this.f4 = f4;
        this.f5 = f5; this.f6 = f6; this.f7 = f7; this.f8 = f8;
    }

    public void run() {
        while (s.health > 0){
        b.patrol(this.s, this.bl, this.br);
        b.chase(this.s, this.bl, this.br);  
        b.bullets(this.s, this.bl, this.br, f1, f2, f3, f4, f5, f6, f7, f8);
        }     
    }

}