//program using singleinheritance a superclass with single subclass 
class First
{
    void m1()
    {
        System.out.println("m1 method in super class");
    }
    void m2()
    {
        System.out.println("m2 method in super class");
    }
    
}
class Second extends First
{
    void m3()
    {
        System.out.println("m3 method in sub class");
    }
}
class Singleinheritance  
{
     public static void main (String[] args) 
    {
        Second s2=new Second();
        s2.m1();
        s2.m2();
        s2.m3();
    }
}