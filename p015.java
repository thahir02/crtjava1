/*Implement a program to convert given age into days, by considering 365 days as the length of the year and ignore leap years. 
Sample Input 0

65
Sample Output 0

23725  */
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    int a=s.nextInt();
    System.out.println(a*365);
    }
}