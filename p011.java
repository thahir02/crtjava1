/*Implement a program to find division and modulo division of given two integer values.
Sample Input 0

5
2
Sample Output 0

2 1   */
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    int a=s.nextInt();
    int b=s.nextInt();
    System.out.println(a/b+" "+a%b);
    }
}