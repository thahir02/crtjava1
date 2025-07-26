/*Given three integer values, print or return minimum of three integers.
Sample Input 0

1
2
3
Sample Output 0

1    */
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    int a=s.nextInt();
    int b=s.nextInt();
    int c=s.nextInt();
    if(a<b && a<c)
    {
        System.out.println(a);
    }
    else if(b<a && b<c)
    {
        System.out.println(b);
    }
    else
    {
        System.out.println(c);
     }
    }
}