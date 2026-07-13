// Program to check the input string is a Palindrome or not

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a String : ");
	String str=sc.nextLine().toLowerCase();
	String rev="";
	rev="";
	int num=str.length();
	for(int i=num-1;i>=0;i--){
	    rev+=str.charAt(i);
	}
	if(str.equals(rev)){
	    System.out.println("Palindrome");
	}
	else {
	    System.out.println("Not Palindrome");
	}
  }
}
