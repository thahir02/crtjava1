/*Given two integer values, print or return maximum value from the given integers.
Sample Input 0

4
6
Sample Output 0

6    */
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    int a=s.nextInt();
    int b=s.nextInt();
    System.out.println((a>b)?a:b);
    }
}