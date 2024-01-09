// first create one text file with any name.txt
// we are performing addition operation give any inputs in text file it will automatically will taken by code
import java.io.*;
import java.util.*;
class Properties1 
{
	public static void main(String[] args)throws Exception
	{
		int a,b,c;
		Properties p=new Properties();
		FileInputStream f1=new FileInputStream("prop.txt"); //prop.txt is text file the input given in text file
		p.load(f1);
		a=Integer.parseInt(p.getProperty("num1"));
		b=Integer.parseInt(p.getProperty("num2"));
		c=a+b;
        System.out.println(c);// here additon operation is performed on data given in text file & result is stored in c.
	}
}
