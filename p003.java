/*Implement a program that takes a number as a input, increment the number by +1 and print the result.
Sample Input 0

1
Sample Output 0

2   */
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s=new Scanner (System.in);
        int a=s.nextInt();
        int b=a+1;
        System.out.println(b);
    }
}