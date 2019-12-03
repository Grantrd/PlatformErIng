import javax.swing.JFrame;

public class Thrid extends Thread {
    JFrame p;
    Screen s;
    Player n;
    Boss b;
    BossLArm bl;
    BossRArm br;
    Boolean run = true;

    public Thrid(JFrame frame, Player p2, Boss b, BossLArm bl, BossRArm br, Screen screen) {
        this.n = p2;
        this.p = frame;
        this.b = b;
        this.bl = bl;
        this.br = br;
        this.s = screen;
    }

    public void run() {
        while(run){
        s.animPrime();
        System.out.println("Primed Anim");
        try {
            sleep(500);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }}
    }
}