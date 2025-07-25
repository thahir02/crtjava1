/*Implement a program that takes the memory size as an argument and returns the actual memory size.
Note: The actual storage loss on a USB device is 7% of the overall memory size! 
Sample Input 0

1
Sample Output 0

0.93
Sample Input 1

2
Sample Output 1

1.86   */
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    int a=s.nextInt();
    double b=0.93*a;
    System.out.printf("%.2f",b);
    }
}