//programe to sort the elememnts of array in ascending order
//Sorting of array using sort function
import java.util.*;
public class ArraySorting
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    int a[],i,n;
	    System.out.println("Enter size of an Array");
	    n=s.nextInt();
	    a=new int[n];
	    System.out.println("Enter n Elements");
	    for (i=0;i<n ;i++ )
	    {
	        a[i]=s.nextInt();

	    }
		System.out.println("The Elements before sorting");
		for (i=0;i<n ;i++ ) 
		{
		    System.out.print(a[i]+" ");
		}
		System.out.println();
		Arrays.sort(a);
		System.out.println("The Elements after sorting");
		for (i=0;i<n ;i++ )
	    {
	        System.out.print(a[i]+" ");

	    }
	}
}
