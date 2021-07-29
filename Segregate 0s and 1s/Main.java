import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner ob = new Scanner(System.in);
    int n = ob.nextInt();
    
    int temp;
    int a[]=new int[n];
    for(int i =0 ;i<n;i++)
    {
      a[i]=ob.nextInt();
    }
      
    for(int i=0;i<n-1;i++)
    {
      for(int j=i+1;j<n;j++)
      {
        if(a[i]>a[j])
        {
          temp=a[i];
          a[i]=a[j];
          a[j]=temp;
          
        }
      }
      
      
    }

    for(int i=0;i<a.length;i++)
    {
      System.out.print(a[i]+" ");
    }
  }
}