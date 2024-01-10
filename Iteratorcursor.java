//programe using Iterator cursor it is introdued in1.2 version & it a universal cursor
import java.util.*;
class Iteratorcursor
{
public static void main(String args[])
{
Vector v=new Vector();
for(int i=1;i<=10;i++)
{
v.addElement(i);
}
Iterator e=v.iterator();
while(e.hasNext())
{
System.out.println(e.next());
}
}
}
 