package multithreading;

import java.util.LinkedList;
import java.util.Queue;

public class ConsumerProducer {
    public static void main(String []args)
    {
        int max_size=100;
        Queue<String> log=new LinkedList<String>();
        InLog l1=new InLog(log,max_size,1);
        InLog l2=new InLog(log,max_size,2);
        DeLog d1=new DeLog(log,max_size);
        l1.start();
        l2.start();
        d1.start();
    }
}
class InLog extends Thread
{
    private Queue<String> log;
    private int max_size,id;
    public InLog(Queue<String> log,int max_size,int id)
    {
        this.id=id;
        this.log=log;
        this.max_size=max_size;
    }
    public void run()
    {
        while(true)
        {
            synchronized (log)
            {
                while(log.size()==max_size)
                {
                    try
                    {
                        System.out.println("日志记录到100，不可继续创建");
                        log.wait();
                    }
                    catch (InterruptedException e){}
                }
//                try{
//                    sleep(800);
//                }
//                catch (InterruptedException e){}
                System.out.println("用户 "+id+" 产生日志");
                log.add("用户 "+id+" "+new GetDate().getDataLog());
                log.notifyAll();
            }
        }
    }

}
class DeLog extends Thread
{
    private Queue<String> log;
    private int max_size;

    public DeLog(Queue<String> log,int max_size)
    {
        this.log=log;
        this.max_size=max_size;
    }
    public void run()
    {
        while (true)
        {
            synchronized (log)
            {
//                while(log.isEmpty())
                while (log.size()==0)
                {
                    System.out.println("无日志文件需要打印");
                    try{
                        log.wait();
                    }
                    catch (InterruptedException e){}
                }
//                try{
//                    sleep(50);
//                }
//                catch (InterruptedException e){}
                System.out.println(log.element());
                log.remove();
                log.notifyAll();
            }
        }
    }
}
