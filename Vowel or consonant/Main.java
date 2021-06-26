import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner ob = new Scanner(System.in);
    String str = ob.next();
    char c = str.charAt(0);
    if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
    {
      System.out.println("Vowel");
    }
    else
    {
      System.out.println("Consonant");
    }
      
    

  }
}