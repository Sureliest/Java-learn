import java.io.*;

public class StudentRank {
    String info[];
    String filePath;
    Student stu[];
    public StudentRank(String path)
    {
        filePath=path;
    }
    public void sortResult()
    {
        try{
            File f=new File(filePath);
            DataInputStream input=new DataInputStream(new FileInputStream(f));
            BufferedReader bf=new BufferedReader(new InputStreamReader(input));
            String data;
            while((data=bf.readLine())!=null)
            {
                info=data.split(", ");
            }
            stu=new Student[info.length];
            for(int i=0;i<info.length;i++)
            {
                String data1[]=info[i].split(" ");
                stu[i]=new Student(data1[0],Integer.valueOf(data1[1]));
            }
            for(int i=0;i<info.length;i++){
                for(int j=i+1;j<info.length;j++)
                {
                    if(stu[i].getPer()<stu[j].getPer())
                    {
                        Student stu1=stu[i];
                        stu[i]=stu[j];
                        stu[j]=stu1;
                    }
                }
            }
            FileWriter writer=new FileWriter("src/main/B.txt");
            for(int i=0;i<info.length;i++)
            {
                writer.write(stu[i].getName()+" "+stu[i].getPer()+"，");
            }
            writer.close();
        }
        catch (Exception e)
        {
            System.out.println(e.getStackTrace());
        }
    }
}
