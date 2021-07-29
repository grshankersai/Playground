import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner ob = new Scanner(System.in);
    int n = ob.nextInt();
    int f = 0;
    int s = 1;
    int temp=0;
    System.out.print("0 1 ");
    for(int i=2;i<n;i++)
    {
      temp=f+s;
      System.out.print(temp+" ");
      f=s;
      s=temp;
      
    }
    

  }
}