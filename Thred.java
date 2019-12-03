public class Thred extends Thread{
    int a = 0;
    int count = 0;
    public Thred(int i)
	{
       
	}

    @Override
    public void run() {
        while(true){
            System.out.println("hi world " + a + ": " + count);
            count++;
        }
        
    }    
    
}