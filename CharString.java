//program to print the character of a String
import java.util.*;

public class CharString 
{
  
public static void main (String args[])
  {
    
Scanner s = new Scanner (System.in);
    
String s1;
    
System.out.println ("enter a string:");
    
s1 = s.next ();
    
int i;
    
for (i = 0; i < s1.length (); i++)
      
      {
	
System.out.println (s1.charAt (i));
      
}
  
 
}

}


