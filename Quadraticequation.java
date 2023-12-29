import java.util.*;
public class Qudraticequation
{
  public static void main (String[]args)
  {
    double a,b,c;
    Scanner s=new Scanner(System.in);
    System.out.println("enter a,b,c:");
    a=s.nextDouble();
    b=s.nextDouble();
    c=s.nextDouble();
    double r1,r2,d;
    d=b*b-4*a*c;
    if(d<0)
    {
        System.out.println("roots are not possible");
    }
    else
    {
        r1=(-b+Math.sqrt(d))/(2*a);
        r2=(-b-Math.sqrt(d))/(2*a);
        System.out.println("root1="+r1);
        System.out.println("root2="+r2);
    }
    
}
} 