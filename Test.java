//program using inheritance
class Firstyear
{
    void branch()
    {
        System.out.println("AI&DS");
    }
    void Subjects()
    {
        System.out.println("c,phyton,m1,m2,chemistry,physics");
    }
    void backlogs()
    {
        System.out.println("all clear");
    }
}
class Secondyear extends Firstyear
{
    void subjects()
    {
        Firstyear f1=new Firstyear();
        f1.branch();
        f1.Subjects();
        f1.backlogs();
        System.out.println("java,m3,ad&s");
    }
}
class Test 
{
     public static void main (String[] args) 
    {
        Secondyear s2=new Secondyear();
        s2.subjects();
    }
}