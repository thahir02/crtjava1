import java.util.*;
class Smallnumber
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter three numbers:");
		int a,b,c;
		a=s.nextInt();
		b=s.nextInt();
		c=s.nextInt();
		if(a>b && a>c){
			System.out.println("first number is smallest i.e:"+a);
		}
		  else  if(b<c && b>a){
			    System.out.println("second number is smallest i.e :"+b);
			}
		
	else
		{
		System.out.println("thrid number is smllest i.e :"+c);
		}
}
}
