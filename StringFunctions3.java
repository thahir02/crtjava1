//program to perform string handling functions like equals() & equalsIgnoreCase() using Scanner 
import java.util.*;
class StringFunctions3
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
String s1,s2;
System.out.println("enter two Strings:");
s1=s.next();
s2=s.next();
if(s1.equals(s2))
{
System.out.println("String are equal");
}
else if(s1.equalsIgnoreCase(s2))
{
System.out.println("Strings are equal & are case sensitive");
}
else
{
System.out.println("String are not equal");
}
}
}

