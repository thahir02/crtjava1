//for loop patterns in Java 
import java.util.Scanner;
public class p1 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the num1 : ");
		int n1=scanner.nextInt();
		System.out.print("Enter the num2 : ");
		int n2=scanner.nextInt();
		for(int i=0;i<=n1;i++) {
			for(int j=0;j<=n2;j++) {
				System.out.print("*"+" ");
			}
				System.out.println();
		}
	}		
}
/*
Output :-
Enter the num1 : 5
Enter the num2 : 5
* * * * * * 
* * * * * * 
* * * * * * 
* * * * * * 
* * * * * * 
* * * * * * 
*/
//pattern 2 :-
import java.util.Scanner;
public class p2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the num1 : ");
		int i=sc.nextInt();
		System.out.print("Enter the num2 : ");
		int j=sc.nextInt();
		for(int n1=0;n1<i;n1++) {
			for(int n2=0;n2<j;n2++) {
				System.out.print(n1+1 +" ");
			}
				System.out.println();
		}
	}		
}
/*
Output :-
Enter the num1 : 5
Enter the num2 : 5
1 1 1 1 1 
2 2 2 2 2 
3 3 3 3 3 
4 4 4 4 4 
5 5 5 5 5 
*/
//pattern 3 :-
import java.util.Scanner;
public class p3 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the num1 : ");
		int i=scanner.nextInt();
		System.out.print("Enter the num2 : ");
		int j=scanner.nextInt();
		for(int n1=0;n1<i;n1++) {
			for(int n2=0;n2<j;n2++) {
				System.out.print(n2+1+" ");
			}
				System.out.println();
		}
	}		
}
/*
Output :-
Enter the num1 : 5
Enter the num2 : 5
1 2 3 4 5 
1 2 3 4 5 
1 2 3 4 5 
1 2 3 4 5 
1 2 3 4 5 
*/
import java.util.Scanner;
public class p4 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the num1 : ");
		int i=scanner.nextInt();
		System.out.print("Enter the num2 : ");
		int j=scanner.nextInt();
		for(int n1=0;n1<=i;n1++) {
			for(int n2=0;n2<=j;n2++) {
				if(n1==0 || n1==i || n2==0 || n2==j ) {
					System.out.print("*"+" ");
				}
				else {
					System.out.print(" "+" ");
				}
			}
			System.out.println();
		}
/*
Output :-
Enter the num1 : 5
Enter the num2 : 5
* * * * * * 
*         * 
*         * 
*         * 
*         * 
* * * * * * 
*/
import java.util.Scanner;
public class p5 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the num1 : ");
		int i=scanner.nextInt();
		System.out.print("Enter the num2 : ");
		int j=scanner.nextInt();
		int count=1;
		for(int n1=1;n1<=i;n1++) {
			for(int n2=1;n2<=j;n2++) {
				if(count<10) {
					System.out.print(0);
				}
					System.out.print(count+" ");
					count++;
				}
			System.out.println();
		}
}
/*
Output :-
Enter the num1 : 5
Enter the num2 : 5
01 02 03 04 05 
06 07 08 09 10 
11 12 13 14 15 
16 17 18 19 20 
21 22 23 24 25 
*/	
import java.util.Scanner;
public class p6 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the num1 : ");
		int i=scanner.nextInt();
		System.out.print("Enter the num2 : ");
		int j=scanner.nextInt();
		for(int n1=1;n1<=i;n1++) {
			for(int n2=1;n2<=j;n2++) {
				if(n1*n2<10) {
					System.out.print(0);
				}
					System.out.print(n1*n2+" ");
				}
			System.out.println();
		}
}
}
/*
Output :-
Enter the num1 : 5
Enter the num2 : 5
01 02 03 04 05 
02 04 06 08 10 
03 06 09 12 15 
04 08 12 16 20 
05 10 15 20 25 
*/	
import java.util.Scanner;
public class p7 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the num1 : ");
		int i=scanner.nextInt();
		System.out.print("Enter the num2 : ");
		int j=scanner.nextInt();
		int count;
		for(int n1=0;n1<i;n1++) {
			count=n1+1;
			for(int n2=0;n2<j;n2++) {
				if(count<10) {
					System.out.print(" ");
				}
					System.out.print(count++ +" ");
				}
			System.out.println();
		}
}
}
/*
Output :-
Enter the num1 : 5
Enter the num2 : 5
01 02 03 04 05 
02 04 06 08 10 
03 06 09 12 15 
04 08 12 16 20 
05 10 15 20 25 
*/	
import java.util.Scanner;
public class p8 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the num1 : ");
		int i=scanner.nextInt();
		System.out.print("Enter the num2 : ");
		int j=scanner.nextInt();
		for(int n1=0;n1<i;n1++) {
			for(int n2=0;n2<=j;n2++) { // you can remove if condition and use n2<=n1 based on same indexes
				if(n1>=n2)
					System.out.print("*"+" ");
			}
			System.out.println();
		}
}
}
/*
Output :-
Enter the num1 : 5
Enter the num2 : 5
* 
* * 
* * * 
* * * * 
* * * * * 
*/	
import java.util.Scanner;
public class p9 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the num1 : ");
		int i=scanner.nextInt();
		System.out.print("Enter the num2 : ");
		int j=scanner.nextInt();
		for(int n1=0;n1<i;n1++) {
			for(int n2=0;n2<=n1;n2++) { 
					System.out.print(n2+1 +" ");
			}
			System.out.println();
		}
}
}	
/*
Output :-
Enter the num1 : 5
Enter the num2 : 5
1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5 
*/	
import java.util.Scanner;
public class p10 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the num1 : ");
		int i=scanner.nextInt();
		System.out.print("Enter the num2 : ");
		int j=scanner.nextInt();
		for(int n1=1;n1<=i;n1++) {
			for(int n2=1;n2<=n1;n2++) { 
				if (n1 < 10) {
					System.out.print("0");
				}
				System.out.print(n1+" ");
			}
			System.out.println();
		}
}
}
/*
Output :-
Enter the num1 : 5
Enter the num2 : 5
01 
02 02 
03 03 03 
04 04 04 04 
05 05 05 05 05 
*/
import java.util.Scanner;
public class p11 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the num1 : ");
		int i=scanner.nextInt();
		System.out.print("Enter the num2 : ");
		int j=scanner.nextInt();
		for(int n1=0;n1<i;n1++) {
			for(int n2=0;n2<j;n2++) { 
				if(n1+n2+1 >= i){
					System.out.print("*"+" ");
				}
				else {
					System.out.print(" "+" ");
				}
			}
			System.out.println();
		}
}
/*
Output :-
Enter the num1 : 5
Enter the num2 : 5
        * 
      * * 
    * * * 
  * * * * 
* * * * * 
*/
import java.util.Scanner;
public class p12 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the Size : ");
		int n=scanner.nextInt();
		for(int i=0;i<n;i++) {
			for(int k=0;k<(n-1)-i;k++) {
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++) {
				System.out.print("* ");
			}
		System.out.println();
		}
	}

}
//--------------------or---------------//
/*
for(int i=0;i<n;i++) {
	for(int j=0;j<n;j++) {
		if(i+j+1>=n) {
			System.out.print("* ");
		}
		else {
			System.out.print(" ");
		}
	}
		System.out.println();
	}
	}
}
*/
/*
Output :-
Enter the Size : 5
    * 
   * * 
  * * * 
 * * * * 
* * * * * 
*/
import java.util.Scanner;
public class p13 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the size : ");
		int n=scanner.nextInt();
		for(int i=0;i<n;i++) {
			for(int k=0;k<(n-1)-i;k++) {
				System.out.print(" ");
			}
			for(int j=0;j<n;j++) {
				if((j==0  || j==i || i==n-1)) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
		System.out.println();
		}
		
	}

}
/*
Output :-
Enter the size : 5
    *         
   * *       
  *   *     
 *     *   
* * * * * 
*/
import java.util.Scanner;
public class p14 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the size : ");
		int n=scanner.nextInt();
		for(int i=0;i<n;i++) {
			for(int k=0;k<(n-1)-i;k++) {
				System.out.print(" ");
			}
			for(int j=0;j<n;j++) {
				if((j==0  || j==i || i==n-1)) {
					System.out.print(j+1+" ");
				}
				else {
					System.out.print("  ");
				}
			}
		System.out.println();
		}
		
	}

}
/*
Output :-
Enter the size : 5
    1         
   1 2       
  1   3     
 1     4   
1 2 3 4 5 
*/
import java.util.Scanner;
public class p15 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the size : ");
		int n=scanner.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(j==0 || i==n-1 || i==j) {
					System.out.print(j+1 + " ");
				}
				else {
					System.out.print("  ");
				}
			}
		System.out.println();
		}
	}
}
/*
Output :-
Enter the size : 5
1         
1 2       
1   3     
1     4   
1 2 3 4 5 
*/
