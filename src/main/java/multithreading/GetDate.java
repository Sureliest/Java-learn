package multithreading;

import java.text.SimpleDateFormat;
import java.util.Date;

public class GetDate {
    public GetDate()
    {
        Date date=new Date();
    }
    public String getDataLog()
    {
        Date date=new Date();
        SimpleDateFormat ft=new SimpleDateFormat("yyyyMMddhhmmss");
        String dataLog=ft.format(date);
        return dataLog;
    }
}
