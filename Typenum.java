import java.util.*;
public class Typenum
{
  public static void main (String[]args)
  {
    int num;
    Scanner s=new Scanner(System.in);
    System.out.println("enter a number:");
    num=s.nextInt();
    if(num>0){
      System.out.println(num+"is positive");
    
}
else if(num<0){
    System.out.println(num+"is negative");
}
else{
    System.out.println(num+"is 0");
}
}
}