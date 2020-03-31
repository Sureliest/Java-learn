package multithreading;
import java.*;
public class Userlogin extends Thread
{
    private Thread t;
    private String threadname;
    private String Username;
    private String Userpwd;
    public Userlogin(String name,String Username,String Userpwd)
    {
        threadname = name;
        this.Username=Username;
        this.Userpwd=Userpwd;
//        System.out.println("Creating "+threadname);
    }
    public void run()
    {
//        System.out.println("Running "+threadname);
        GetDate date=new GetDate();
        try{
            Thread.sleep(100);
        }catch(InterruptedException e)
        {
            System.out.println("Thread "+threadname+" interrupt");
        }
        System.out.println(Username+" is login:"+date.getDataLog());
//        System.out.println("Exiting "+threadname);
    }
    public void start()
    {
//        System.out.println("Starting "+threadname);
        if(t==null){
            t=new Thread(this,threadname);
            t.start();
        }
    }
}
class TestThread {
    static  int i=0;
    public  static void main(String args[]) {
        Userlogin R1 = new Userlogin( "Thread-1","User1","123");
        R1.start();

        Userlogin R2 = new Userlogin( "Thread-2","User2","456");
        R2.start();

        Userlogin R3=new Userlogin("Thread-3","User3","789");
        R3.start();

        Userlogin R4=new Userlogin("Thread-4","User4","012");
        R4.start();
    }
}
