//program to check given number is prime number
import java.util.*;
class ForPrime
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
System.out.println("enter a number :");
int i,n,c=0;
n=s.nextInt();
for(i=1;i<=n;i++)
{
if(n%i==0)
c=c+1;
}
if(c==2)
{
System.out.println(n+"is primenumber");
}
else
{
System.out.println(n+"is not a prime number");
}
}
}