/*Implement a program to read seconds values in timer and convert it into hours.
Sample Input 0

3600
Sample Output 0

1  */
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    int sec=s.nextInt();
    System.out.println(sec/3600);
    }
}