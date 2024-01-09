//program using collections with Enumeration cursor to get objects one by one it is (1.0version) so is not a universal cursor
import java.util.*;
public class EnumerationEx
{
	public static void main(String[] args) {
	    Vector v=new Vector();
	    for(int i=0;i<=10;i++)
	    {
	        v.addElement(i);
	    }
	    Enumeration e=v.elements();
	    while(e.hasMoreElements())
	    {
	        System.out.print(e.nextElement()+" ");
	    }
	
	}
}
