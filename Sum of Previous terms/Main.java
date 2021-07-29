import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner ob = new Scanner(System.in);
    int n = ob.nextInt();
    if(n>30)
    {
      System.out.println("Invalid Input");
    }
    else if(n==1 || n==2)
    {
      System.out.println(n);
    }
    else
    {
      int f=1;
      int s=2;
      int temp=0;
      for(int i=3;i<=n;i++)
      {
        temp=f+s;
        f=s;
        s=temp;
        
      }
     System.out.println(temp);
    }

  }
}