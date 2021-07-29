import java.util.*;
class Main
{
  public static boolean checkprime(int a)
  {
    int count=0;
    for(int i=1;i<a;i++)
    {
      if(a%i==0)
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
    int a = ob.nextInt();
    int b = ob.nextInt();
    int sum=0;
    for(int i = a+1 ;i<b;i++)
    {
      if(checkprime(i))
      {
        sum+=i;
      }
    }
    System.out.println(sum);
    
 
  }
}