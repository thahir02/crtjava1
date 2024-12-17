/*Write a program to accept three space seperated integers and print addition of those three numbers.
Sample Input 0

1 2 3
Sample Output 0

6   */
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    int a=s.nextInt();
    int b=s.nextInt();
    int c=s.nextInt();
    System.out.println(a+b+c);
    }
}
