import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner ob = new Scanner(System.in);
    int n = ob.nextInt();
    int f=0;
    int s=1;
    int temp=0;
    for(int i=2;i<n;i++)
    {
      temp=f+s;
      f=s;
      s=temp;
      
    }
    if(n==1)
      System.out.println("0");
    else if(n==2)
      System.out.println("1");
    else
      System.out.println(temp);

  }
}