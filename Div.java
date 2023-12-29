import java.util.*;
public class Div
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    System.out.println("enter a,b:");
	    int a,b,d;
	    a=s.nextInt();
	    b=s.nextInt();
	    if(b==0)
	    {
	        System.out.println("if b is 0  it is invalid \n enter another number:");
	        b=s.nextInt();
	    }
	    d=a/b;
	    System.out.println("division of two numbers is:"+d);
	    
		
	}
}
