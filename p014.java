/*Implement a program to take voltage and current and print the calculated power.
Sample Input 0

230
10
Sample Output 0

2300  */
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    int v=s.nextInt();
    int c=s.nextInt();
    System.out.println(v*c);
    }
}