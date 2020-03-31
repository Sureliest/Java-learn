public class GetOpLog {
    int e=0;
    public GetOpLog(int e)
    {
        this.e=e;
    }
    public String writeOpLog()
    {
        String OpLog=null;
        switch (e)
        {
            case 0: {
                OpLog = "---当前无操作";
                break;
            }
            case 1:{
                OpLog="---生成SQL备份文件";
                break;
            }
            default:break;
        }
        return OpLog;
    }
}
