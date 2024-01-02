//program to check give number is prime number 
//or not with less time complexity
import java.util.*;
class Primenumber
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
int i,n;
System.out.println("enter number :");
n=s.nextInt();
for(i=2;i<=n;i++)
{
if(n%i==0)
break;
}
System.out.print(n+" ");
if(i==n)
{
System.out.print(" is prime number");
}
else
{
System.out.print(" is not a prime number");
}
}
}
