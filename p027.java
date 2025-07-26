/*Given two integer values, print or return minimum value from the given integers.
Sample Input 0

34
11
Sample Output 0

11    */
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    int a=s.nextInt();
    int b=s.nextInt();
    System.out.println((a<b)?a:b);
    }
}