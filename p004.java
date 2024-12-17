/*Implement a program to read a number and check whether it is divisible by 3 or not.
Sample Input 0

3
Sample Output 0

Yes  */
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
    Scanner s= new Scanner(System.in);
    int a=s.nextInt();
    System.out.println((a%3==0)?"Yes":"No");
    }
}