/*Given two non-negative integer values, return true if they have the same last digit, Ex:27 and 57.
Sample Input 0

10
4
Sample Output 0

false    */
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    int a=s.nextInt();
    int b=s.nextInt();
    System.out.println((a%10==b%10)?"true":"false");
    }
}