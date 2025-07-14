/*Write a program to check whether the given two numbers are equal or not?
Sample Input 0

145
144
Sample Output 0

false  */
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    int a=s.nextInt();
    int b=s.nextInt();
    System.out.println((a==b)?"true":"false");
    }
}