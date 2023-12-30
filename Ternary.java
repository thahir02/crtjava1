import java.util.*;
class Ternary{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
System.out.println("enter two numbers:");
int a,b,r;
a=s.nextInt();
b=s.nextInt();
r=(a>b)?a:b;
System.out.println(r+"is bigger number"	);
}
}