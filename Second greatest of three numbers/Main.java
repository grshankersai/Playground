import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner ob = new Scanner(System.in);
    int a = ob.nextInt();
    int b = ob.nextInt();
    int c = ob.nextInt();
    if(a>b&&a>c)
    {
      if(b>c)
      {
        System.out.println(b);
      }
      else
      {
        System.out.println(c);
        
      }
    }
    
    if(b>a&&b>c)
    {
      if(a>c)
      {
        System.out.println(a);
      }
      else
      {
        System.out.println(c);
        
      }
    }
    
    if(c>a&&c>b)
    {
      if(a>b)
      {
        System.out.println(a);
      }
      else
      {
        System.out.println(b);
        
      }
    }

  }
}