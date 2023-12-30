import java.util.*;
//factorial of a number
class Whilefact{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
int n,r=1;
System.out.println("enter n value:");
n=s.nextInt();
while(n>=1)
{
r=r*n;
n=n-1;
}
System.out.print(r);
}
}