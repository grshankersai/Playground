import java.util.Scanner;
class Main
{
  public static int fun1(int n)
  {
    int sum=0,rem;
    while(n!=0)
    {
      rem=n%10;
      sum=sum+rem;
      n=n/10;
    }
    if(sum>9)
    {
     sum= fun1(sum);
    }
    return sum;
   
    
    
  }
  public static void main(String args[])
  {
    Scanner ob = new Scanner(System.in);
    int n = ob.nextInt();
    int p = fun1(n);
    System.out.println(p);
    
  }
}