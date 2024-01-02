//program using break
import java.util.*;
class Break
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
int i;
for(i=1;i<=10;i++)
{
if(i==5)
{
break;
}
System.out.print(i+" ");
}
}
}