package java1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomNum {
    public List list=new ArrayList();
    public List randomNum()
    {
        Random random=new Random();
        char x,y;
        int a;
        for(int i=0;i<4;i++)
        {
            int choose=random.nextInt(3);
            if(choose==0){
                a=random.nextInt(10);
                list.add(a);
            }
            else if(choose==1){
                x=(char)(random.nextInt(26)+65);
                list.add(x);
            }
            else{
                y=(char)(random.nextInt(26)+97);
                list.add(y);
            }
        }
        return list;
    }
}
