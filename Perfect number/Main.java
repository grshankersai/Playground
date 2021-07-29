import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner ob = new Scanner(System.in);
    int a = ob.nextInt();
    int sum=0;
    for(int i=1;i<a;i++)
    {
      if(a%i==0)
      {
        sum=sum+i;
      }
        
    }
    if(sum==a)
    {
      System.out.println("Yes");
    }
    else
    {
      System.out.println("No");
    }
      
    

  }
}