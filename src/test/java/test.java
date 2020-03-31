import java1.LoginUser;
import java1.RandomNum;
import java1.RandomStudent;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class test {
    public static void main(String[] args)
    {
//        String file="src/main/test.txt";
//
//        try{
//            testFile tf=new testFile(file);
//            tf.isCorrectUser();
//            GetLog log=new GetLog(0,"src/main/log.sql");
//            log.writeLog();
//            StudentRank sr=new StudentRank("src/main/A.txt");
//            sr.sortResult();
//        }
//        catch (Exception e)
//        {
//            System.out.println(e.getStackTrace());
//            e.getStackTrace();
//        }


        RandomStudent rs = new RandomStudent();
        rs.randomStu();


//        RandomNum num=new RandomNum();
//        List list=num.randomNum();
//        Iterator ite=list.iterator();
//        while (ite.hasNext())
//        {
//            System.out.print(ite.next()+" ");
//        }

//        try{
//            LoginUser lg=new LoginUser("E:\\WorkStation\\Mycodes\\java\\DEMO\\src\\main\\java\\java1\\UserInfo.txt");
//            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//            String name=br.readLine();
//            String pwd=br.readLine();
//            if(lg.login(name,pwd)==1)
//                System.out.println("账号名称及密码正确");
//            else System.out.println("账号名称或密码错误");
//        }
//        catch (Exception e){
//            e.getStackTrace();
//        }
    }
}
