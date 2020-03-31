public class Student {
    private String stuName;
    private int stuPerformance;
    public Student(String name,int per)
    {
        stuName=name;
        stuPerformance=per;
    }
    public String getName() {return stuName;}
    public int getPer(){return stuPerformance;}
}
