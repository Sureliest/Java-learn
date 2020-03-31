import java.io.*;
import java.util.Scanner;

public class testFile {
    private String filePath;
    public testFile(String filePath){
        this.filePath=filePath;
    }
    public void isCorrectUser()throws Exception
    {
        File f=new File(filePath);
//        第一种
//        InputStream in=new FileInputStream(f);
//        BufferedReader bf=new BufferedReader(new InputStreamReader(in));
//        第二种
        DataInputStream input=new DataInputStream(new FileInputStream(f));
        BufferedReader bf=new BufferedReader(new InputStreamReader(input));
//        BufferedReader bf=new BufferedReader(new FileReader(f));
        String str=null;
        String Data[]=new String[2];
        while((str=bf.readLine())!=null)
        {
            Data=str.split(",");
        }
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入账号名称：");
        String name=sc.next();
        System.out.println("请输入密码：");
        String pwd=sc.next();
        if(Data[0].equals(name)&&Data[1].equals(pwd))
        {
            System.out.println("验证成功！");
        }
        else System.out.println("验证失败！");
        bf.close();
    }
}
