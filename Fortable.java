//program to print tables for given number
import java.util.*;
class Fortable
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
System.out.println("enter a number :");
int i,n;
n=s.nextInt();
for(i=1;i<=10;i++)
{
System.out.println(i+"*"+n+"="+i*n);
}
}
}