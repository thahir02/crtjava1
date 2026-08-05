//for loop patterns in Java 
//pattern 1 :-
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
