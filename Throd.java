import javax.swing.JFrame;
import java.util.Timer; 
import java.util.TimerTask;

public class Throd extends Thread{
    Player s;
    JFrame j;

    public Throd(JFrame f, Player n) {
        this.s = n;
        this.j = f;
    }

    public void run(){
Timer pAniT = new Timer();
TimerTask pAniTask = new Anim();
pAniT.schedule(pAniTask, 500, 500);
    }

}