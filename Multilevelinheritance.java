//program using Multilevelinheritance a sub class can be inherited from another subclass 
//proram in dynamic way
class Student
{
    int admno;
    String name;
    void get(int admno,String name)
    {
      this.admno=admno;
      this.name=name;
    }
    void show()
    {
        System.out.println("admission number="+admno+"\nname="+name);
    }
    
}
class Marks extends Student
{
    int mat,phy,che;
    void getMarks(int mat,int phy,int che)
    {
        this.mat=mat;
        this.phy=phy;
        this.che=che;
    }
    void showMarks()
    {
        System.out.println("maths="+mat);
        System.out.println("physics="+phy);
        System.out.println("chemistry="+che);
    }
}
class Result extends Marks
{
    void Showresults()
    {
      System.out.println("total="+(mat+phy+che));
      System.out.println("average="+(mat+phy+che)/3); 
    }
}
class Multilevelinheritance
{
     public static void main (String[] args) 
    {
        Result s2=new Result();
        s2.get(3021,"22hr1a3046");
        s2.show();
        s2.getMarks(19,3,26);
        s2.showMarks();
        s2.Showresults();
        System.out.println("fail");
    }
}