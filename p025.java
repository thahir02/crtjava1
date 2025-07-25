/*There are 3 friends named Denver, Berlin, Rio who worked at a compnay. Given thier monthly salaries and monthly expendictures, returns the highest saving amoung them.
Sample Input 0

5 1 2 2 4 3
Sample Output 0

4    */
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    int a1=s.nextInt();
    int a2=s.nextInt();
    int b1=s.nextInt();
    int b2=s.nextInt();
    int c1=s.nextInt();
    int c2=s.nextInt();
    int a,b,c;
        a=a1-a2;
        b=b1-b2;
        c=c1-c2;
    if((a>b) && (a>c))
    {
            System.out.println(a);
        
    }
    else if(b>c && b>a){
            System.out.println(b);
        }
    
    else{
            System.out.println(c);
        }
    
    }
}