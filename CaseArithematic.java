import java.util.*;
//program for performing add,sub,mul,div
class CaseArithematic{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
System.out.println("enter  two numbers:");
int a,b,r;
a=s.nextInt();
b=s.nextInt();
System.out.println("\n1.addition\n2.subtraction\n3.multiplication\n4.division");
System.out.println("Enter you choice :");
int ch=s.nextInt();
switch(ch)
{
	case 1:
	r=a+b;
	System.out.println(r);
	break;
	case 2:
	r=a-b;
	System.out.println(r);
	break;
	case 3:
	r=a*b;
	System.out.println(r);
	break;
	case 4:
	r=a/b;
	System.out.println(r);
	break;
	default:
	System.out.println("invalid retry");

}
}
}
	