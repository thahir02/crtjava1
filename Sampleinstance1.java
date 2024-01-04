//program using instance variables with parameter passing
class Sampleinstance1
{
    int a,b;
    void get(int x,int y)
    {
        a=x;
        b=y;
    }
    void show()
    {
        System.out.println("a="+a+" b="+b);
    }
	public static void main(String[] args) {
	    Sampleinstance1 s1=new Sampleinstance1();
	    Sampleinstance1 s2=new Sampleinstance1();
	    s1.get(2,3);
	    s1.show();
	    // if value for vaiables a & are not get for s2
	    s2.show();//it shows a=0 b=0 because values are not asinged
	    s2.get(19,100);
	    s2.show();
	}
}
