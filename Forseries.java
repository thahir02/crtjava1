//program to print tables for given series
import java.util.*;
class Forseries
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
System.out.println("enter a number :");
int i,n,n1=0;
n=s.nextInt();
for(i=1;i<=10;i++)
{
System.out.print(n1+" ");
n1=n1+i;
}
}
}