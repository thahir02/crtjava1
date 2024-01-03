//program to know sum and avg of elements of array
import java.util.*;
public class Sumavg
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    int a[],i,n,sum=0;
	    float avg;
	    System.out.println("enter the size :");
	    n=s.nextInt();
	    a=new int[n];
	    System.out.println("enter elements: ");
	    for(i=0;i<n;i++)
	    {
	        a[i]=s.nextInt();
	    }
	    System.out.println("sum of elements is:");
	    for(i=0;i<n;i++)
	   {
	       sum=sum+a[i];
	      
	   }
	   System.out.println(sum);
	   avg=(float)sum/n;
	   System.out.println(avg+" is average");
	}
}
