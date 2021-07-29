import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner ob = new Scanner(System.in);
    int n = ob.nextInt();
    int rem=0;
    String str = new String();
    while(n!=0)
    {
      rem=n%2;
      str=str+""+rem;
      n=n/2;
    }
    for(int i=str.length()-1;i>=0;i--)
    {
      System.out.print(str.charAt(i));
    }
    
  
  }
}