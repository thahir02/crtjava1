//program to perform string handling functions like equals() this compares two string & print boolean value true
//or false,equalsIgnore() this also does same as equal but it ignores case sensitivity 
import java.util.*;
class StringFunctions1
{
public static void main(String[] args)
{
String s1="java";
String s2="python";
String s3="java";
String s4="JAVA";
System.out.println(s1.equals(s2));
System.out.println(s1.equals(s3));
System.out.println(s1.equals(s4));
System.out.println(s1.equalsIgnoreCase(s4));
}
}

