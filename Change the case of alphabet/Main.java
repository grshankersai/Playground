import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner ob = new Scanner(System.in);
    String str= ob.next();
    if(str.charAt(0)>=65 && str.charAt(0)<=92)
    System.out.println(str.toLowerCase());
    else
    {
      System.out.println(str.toUpperCase());
      
    }

  }
}