import java.util.*;
import java.lang.Math;
class Main
{
  public static boolean checkPrime(int n)
  {
    int count=0;
    for(int i=1;i<n;i++)
    {
      if(n%i==0)
      {
        count++;
      }
    }
    if(count==1)
    {
      return true;
    }
    else
    {
      return false;
    }
    
    
  }
  public static void main(String args[])
  {
    Scanner ob = new Scanner(System.in);
    int n = ob.nextInt();
    if(checkPrime(n))
    {
      System.out.printf("%.2f",Math.sqrt(n));
    }
    else
    {
      System.out.println("0.00");
    }
    
    

  }
}