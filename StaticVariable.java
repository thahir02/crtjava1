//program using static variable

public class StaicVariable
{
    int a=10;
    static int b=20;


	public static void main(String[] args) {
	    StaicVariable s1=new StaicVariable();
	    StaicVariable s2=new StaicVariable();
	    System.out.println(s1.a+" "+s1.b);
	    System.out.println(s2.a+" "+s2.b);
		s1.a=888;
		s1.b=999;
		System.out.println(s1.a+" "+s1.b);
	    System.out.println(s2.a+" "+s2.b);
	}
}
0 comments on commit 8b832f1
@thahir02
Comment
