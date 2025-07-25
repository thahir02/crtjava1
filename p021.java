/*Implement a program to convert temparature from Celsius to Fahrenheit.
Sample Input 0

1
Sample Output 0

33
    */
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    int a=s.nextInt();
    System.out.println((a*9/5)+32);
    }
}