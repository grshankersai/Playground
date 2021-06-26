import java.util.Scanner;
class Main
{
  public static int fun(int r)
  {
    int fact=1;
    for(int i=1;i<=r;i++)
    {
      fact=fact*i;
      
    }
    return fact;
  }
  public static void main(String args[])
  {
    Scanner ob = new Scanner(System.in);
    int n = ob.nextInt();
    int a =n;
    int sum=0;
    int rem;
    while(n!=0)
    {
      rem=n%10;
      sum=sum+fun(rem);
      n=n/10;
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