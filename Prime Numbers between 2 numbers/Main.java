import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner ob = new Scanner(System.in);
    int n = ob.nextInt();
    for(int i=2;i<=n;i++)
    {
      int count=0;
      for(int j=1;j<i;j++)
      {
        if(i%j==0)
        {
          count++;
        }

      }
      if(count==1)
      {
        System.out.print(i+" ");
      }

    }
    
    
  }
}