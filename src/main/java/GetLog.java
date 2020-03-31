import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class GetLog {
    int t;
    String datalog;
    String oplog;
    String filePath;
    public GetLog(int t,String path)
    {
        this.t=t;
        this.filePath=path;
    }
    public void writeLog()throws Exception
    {
        GetDate date=new GetDate();
        GetOpLog op=new GetOpLog(t);
        datalog=date.getDataLog();
        oplog=op.writeOpLog();
        FileWriter f=new FileWriter(filePath);
//        System.out.println(datalog+oplog);
        f.write(datalog+oplog);
        f.close();
    }
}
