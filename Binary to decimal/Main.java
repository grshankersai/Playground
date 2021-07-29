import java.util.*;
import java.lang.Math;
class Main
{
  public static void main(String args[])
  {
    Scanner ob = new Scanner(System.in);
    int bin= ob.nextInt();
    int n = bin;
    int count=0;

    double sum=0;
    int rem;
    
    while(bin!=0)
    {
      rem=bin%10;
      if(rem == 1)
      {
        sum = sum + Math.pow(2,count);
      }
      count++;
      bin=bin/10;
    }
    System.out.println(sum);
    
    

  }
}