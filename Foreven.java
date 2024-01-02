//print n no.of even numbers
import java.util.*;
class Foreven{
    public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.println("enter value of n:");
    int a,n;
    n=s.nextInt();
    for(a=2;a<=n;a=a+2)
    {
        System.out.print(a+" ");
    }
    }
}