import java.util.*;
public class Nestedif
{
  public static void main (String[]args)
  {
    int a, b, c;
    Scanner s = new Scanner (System.in);
      System.out.println ("enter three numbers:");
      a = s.nextInt ();
      b = s.nextInt ();
      c = s.nextInt ();
    if (a > b)
      {
	if (a > c)
	  {
	    System.out.println (a + "is the biggest number");
	  }
      
    else
      {
	System.out.println (c + "is the biggest number");
      }
  }
  else
    if (b > c)
  {

    System.out.println (b + "is the biggest number");
  }
else
  {

    System.out.println (c + "is the biggest number");
  }
}
}