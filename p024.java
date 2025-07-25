/*Kalyan is travelling to mumbai, but this time he is taking flight. His brother has already told him about luggage weight limits of flight but he forgot it. Now he is taking with him 3 trolly bags. As per the current airlines which amir will fly. has below weight limits.

1) There can be at max 2 check-in and 1 cabin luggage.
2) Check-in has total limit of L1.
3) Cabin has limit of L2.

Now, Kalyan has 3 luggage has weights as W1 and W2 and W3 respectively. Now he should be smart enough to make sure that he can travel with all the 3 luggage without paying extra charge.

Find out whether Kalyan can take all of his luggage without any extra charges or not. If all good and no extra changes were paid, output "Yes" otherwise "No".

Input Format

integers W1,W2,W3 and L1,L2
Sample Input 0

1 2 3 4 4
Sample Output 0

Yes
Sample Input 1

1 2 3 2 2
Sample Output 1

No    */
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    int w1=s.nextInt();
    int w2=s.nextInt();
    int w3=s.nextInt();
    int l1=s.nextInt();
    int l2=s.nextInt();
    System.out.println((w1+w2+w3<=l1+l2)?"Yes":"No");
    }
}