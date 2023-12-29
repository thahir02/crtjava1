import java.util.*;
public class Testyear
{
  public static void main (String[]args)
  {
    int y;
    Scanner s=new Scanner(System.in);
    System.out.println("enter a year:");
    y=s.nextInt();
    if(y%4==0&&(y%100!=0||y%400==0))
    {
        System.out.println(y+" is a leap year");
    }
    else{
        System.out.println(y+" is not a leap year");
    }
}
} 