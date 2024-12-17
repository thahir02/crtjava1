//Implement a program to read user name and display welcome message on the console.
//Sample Input 0

//admin
//Sample Output 0

//welcome admin

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
    Scanner s= new Scanner(System.in);
    String input=s.nextLine();
    System.out.println("welcome "+input);
    }
}