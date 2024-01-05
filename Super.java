//program using super keyword "this" keyword for 'representing current class Object' & "super" for 'representing super class object' 
class A
{
    int a=100;
    void show()
    {
        System.out.println("super demo");
    }
}
class B extends A
{
    int a=256;
    void show(int a)
    {
        super.show();
        System.out.println(a);
        System.out.println(this.a);
        System.out.println(super.a);
    }
}
class Super
{
     public static void main (String[] args) 
    {
        B ta=new B();
        ta.show(02);
    }
}