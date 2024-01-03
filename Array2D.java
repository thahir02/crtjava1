//program with 2d array with sum of reverse diagonal & sum of diagonal
import java.util.*;
public class Array2D
{
	public static void main(String[] args)
	{
	    Scanner s=new Scanner(System.in);
	    int a[][],i,j,n,sum=0,rev=0;
	    System.out.println("Enter a size of an array");
	    n=s.nextInt();
	    a=new int[n][n];
	    //program to enter elements to 2d array
	    System.out.println("Enter elements");
	    for (i=0;i<n;i++)
	    {
	        for(j=0;j<n;j++)
	        {
	            a[i][j]=s.nextInt();
	        }
	    }
	    //program to display 2d matrix
	    System.out .println("matreix is:");
	    for(i=0;i<n;i++)
	    {
	        for(j=0;j<n;j++)
	        {
	            System.out.print(a[i][j]+" ");
	        }
	        System.out.println();
	    }
	    // program to print sum of diagonal matrix
	    for (i=0;i<n;i++)
	    {
	        for (j=0;j<n;j++)
	        {
	            if(j==i)
	            sum=sum+a[j][i];
	        }
	    }
	    System.out.println("Sum of diagonal elements "+
	    sum);
	    //program to print sum of reverse of diagonal matrix
	    for(i=0;i<n;i++)
	    {
	        for(j=0;j<n;j++)
	        {
	            if(i+j==n-1)
	            {
	                rev=rev+a[i][j];
	            }
	        }
	    }
	    System.out.println(rev+" is the sum of reverse of the diagonal elements");
	}
}
