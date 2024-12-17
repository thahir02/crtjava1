/*Implement a program to clcualte the free number of cups the user gets for a specified number of cups bought by the user. The user get 1 cup free for every 6 cups bought.
Sample Input 0

6
Sample Output 0

7  */
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    System.out.println(n+n/6);
    }
}