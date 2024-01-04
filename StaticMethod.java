//program for static method
public class StaticMethod
{
    void m1()
    {
        System.out.println("Instance Method");
    }
    static void m2()
    {
        System.out.println("Static Metod");
    }
	public static void main(String[] args) {
	    //StaticMethod.m1();
	    StaticMethod.m2();
	   StaticMethod s1=new StaticMethod();
	    s1.m1();
	    s1.m2();

	}
}