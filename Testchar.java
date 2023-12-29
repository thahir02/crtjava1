import java.util.*;
public class Testchar
{
  public static void main (String[]args)
  {
    char a;
    Scanner s=new Scanner(System.in);
    System.out.println("enter a Character:");
    a=s.next().charAt(0);
    if(a=='a'||a=='A'||a=='e'||a=='E'||a=='i'||a=='I'||a=='o'||a=='O'||a=='U'||a=='u')
    {
        System.out.println("vowel");
    }
    else{
        System.out.println("consonant");
    }
    
}
}