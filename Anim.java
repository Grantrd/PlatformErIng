import java.util.TimerTask;

public class Anim extends TimerTask{
    Player p;
    Boss b;
    public int gCount = 0;
    public void run(){
        p.PAni();
        b.BAni();        
    }

}