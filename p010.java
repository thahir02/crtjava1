/*Implement a program to perform multiplication operation on given and next to given number.
Sample Input 0

2
Sample Output 0

6   */
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    int a=s.nextInt();
    int b=a++;
    System.out.println(a*b);
    }
}