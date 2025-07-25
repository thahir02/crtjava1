/*Implement a program to convert temparature from Fahrenheit to Celsius.
Sample Input 0

44
Sample Output 0

6    */
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    int a=s.nextInt();
    System.out.println((a-32)*5/9);
    }
}