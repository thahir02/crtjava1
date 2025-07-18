/*Create a program that takes the number of wins, draws and losses and calculates the number of points a football team has obtained so far.

1. wins get 3 points
2. draws get 1 points
3. losses get 0 points  
Sample Input 0

3 4 2
Sample Output 0

13   */
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    int a=s.nextInt();
    int b=s.nextInt();
    int c=s.nextInt();
    System.out.println((a*3)+(b*1)+(c*0));
    }
}