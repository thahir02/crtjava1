/*Implement a program that takes two inputs from the user a and b, print 'true' if one of them is 10 or if their sum is 10.
Sample Input 0

9
10
Sample Output 0

true    */
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    int a=s.nextInt();
    int b=s.nextInt();
     if((a==10||b==10)||(a+b==10))
         System.out.println("true");
        else
            System.out.println("false");
    }
}