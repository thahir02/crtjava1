//Exception programes
import java.util.*;
public class TestException{
    public static void main(String arg[])
    {
        Scanner s=new Scanner(System.in);
        int a,b,c;
        System.out.println("enter two numbers");
        a=s.nextInt();
        b=s.nextInt();
        c=a/b;
        System.out.println("division="+c);//Exception occurs if we enter value of b as Zero
    }
}