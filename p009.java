/*Implement a program to extract last three digits numbers from the given four digit number and calcualte sum of those three digits numbers.
Sample Input 0

1234
Sample Output 0

9  */
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    int a=s.nextInt();
    System.out.println((a%10)+(a/10)%10+(a/100)%10);
    }
}