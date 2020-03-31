package java1;

import java.lang.reflect.Array;
import java.util.*;

public class RandomStudent {
    public void randomStu()
    {
        LinkedList<Character> list=new LinkedList<Character>();
        for(int i=0;i<16;i++)
        {
            list.add((char)(i+65));
        }
//        Iterator ite=list.listIterator();
//        int i=0;
//        while(ite.hasNext())
//        {
//            System.out.print(ite.next());
//            System.out.println(" "+list.get(i));
//            i++;
//        }
//        List group1=new ArrayList()
        Random r=new Random(1);
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                int num = r.nextInt(list.size());
//                group[i].add(list.get(num));
                System.out.print(list.get(num));
                list.remove(list.get(num));
            }
            System.out.println("\n");
        }
//        for(int i=0;i<4;i++)
//        {
//            System.out.print("group"+i+": ");
//            Iterator ite=group[i].iterator();
//            while (ite.hasNext())
//            {
//                System.out.print(ite.next()+" ");
//            }
//        }
    }
}
