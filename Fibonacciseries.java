//program to print fibonacci series
import java.util.*;
class Fibonacciseries
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
System.out.println("enter a number :");
int i,n,n1=0,n2=1,n3;
n=s.nextInt();
System.out.print(n1+" "+n2+" ");
for(i=1;i<=n-2;i++)
{
n3=n1+n2;
System.out.print(n3+" ");
n1=n2;
n2=n3;
}
}
}