/*Implement a program to read number of days and convert it into number of months.
Note: consider 30 days per month
Sample Input 0

50
Sample Output 0

1  */
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    int a=s.nextInt();
    System.out.println(a/30);
    }
}