//programe using ListIterator cursor it is introdued in 1.2 version & it is child of Iterator & not universal cursor
import java.util.*;
class ListIteratorcursor
{
public static void main(String args[])
{
Vector v=new Vector();
for(int i=1;i<=10;i++)
{
v.addElement(i);
}
ListIterator e=v.listIterator();
while(e.hasNext())
{
System.out.println(e.next());
}
}
}
 