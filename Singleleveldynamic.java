//program using singleinheritance a superclass with single subclass 
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
        System.out.println("total="+(mat+phy+che));
        System.out.println("average="+(mat+phy+che)/3);
    }
}
class Singleleveldynamic 
{
     public static void main (String[] args) 
    {
        Marks s2=new Marks();
        s2.get(0001,"mego");
        s2.show();
        s2.getMarks(48,56,99);
        s2.showMarks();
    }
}