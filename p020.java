/*Implement a program to find the area of the circle
Sample Input 0

1
Sample Output 0

3.14
Sample Input 1

3
Sample Output 1

28.27    */
import java.io.*;
import java.util.*;
public class Solution {

    public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    int a=s.nextInt();
    double b=Math.PI*a*a;
    System.out.printf("%.2f",b);
    }
}