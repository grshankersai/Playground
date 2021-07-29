import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner ob = new Scanner(System.in);
    int a = ob.nextInt();
    int b = a;
    int c = a;
    int count=0;
    double sum=0;
    int rem;
    while(b!=0)
    {
      count++;
      b=b/10;
    }
    while(a!=0)
    {
      rem=a%10;
      sum=sum+Math.pow(rem,count);
      a=a/10;
    }
    if(sum==c)
    {
      System.out.println("ARMSTRONG");
    }
    else
    {
      System.out.println("NOT AN ARMSTRONG");
      
    }
      
    

  }
}