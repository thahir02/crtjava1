//program using instance variables with out parametet passing
class Sampleinstance
{
    int a,b;
    void get()
    {
        a=10;
        b=20;
    }
    void show()
    {
        System.out.println("a="+a+" b="+b);
    }
	public static void main(String[] args) {
	    Sampleinstance s1=new Sampleinstance();
	    Sampleinstance s2=new Sampleinstance();
	    s1.get();
	    s1.show();
	    // if value for vaiables a & are not get for s2
	    s2.show();//it shows a=0 b=0 because values are not asinged
	}
}
