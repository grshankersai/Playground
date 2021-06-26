import java.util.*;
import java.lang.*;
class Main
{
  public static void main(String args[])
  {
    Scanner ob = new Scanner(System.in);
    int n = ob.nextInt();
    double p = Math.sqrt(n);
    if(p-Math.ceil(p)==0)
    {
      System.out.println("YES");
    }
    else
    {
      System.out.println("NO");
      
    }
    
   
  }
}