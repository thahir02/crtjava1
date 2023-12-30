import java.util.*;
class Ternary1{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
System.out.println("enter three numbers:");
int a,b, c,r;
a=s.nextInt();
b=s.nextInt();
c=s.nextInt();
r=(a<b&&a<c)?a:(b<c)?b:c;
System.out.println(r+"is smallest number"	);
}
}