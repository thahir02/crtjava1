//programe to serch the element in an array
import java.util.*;
public class ArraySearch
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    int a[],i,n,sno;
	    System.out.println("Enter size of an Array");
	    n=s.nextInt();
	    a=new int[n];
	    System.out.println("Enter n Elements");
	    for (i=0;i<n ;i++ )
	    {
	        a[i]=s.nextInt();

	    }
		System.out.println("Ener Search Elements ");
		sno=s.nextInt();
		int r=Arrays.binarySearch(a,sno);
		if(r<0)
		{
		    System.out.println("Element not found");
		}
		else
		{
		    System.out.println("Elemnt is found \n position="+(r+1));
		}
	}
}