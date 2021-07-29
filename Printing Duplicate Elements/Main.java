import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner ob = new Scanner(System.in);
    int n = ob.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
    {
      arr[i]=ob.nextInt();
    }
    int count=0;
    for(int i=0;i<n;i++)
    {
      count=0;
      for(int j=0;j<n;j++)
      {
        if(i!=j &&arr[i]!='\0'&& arr[i]==arr[j] )
        {
  
          System.out.print(arr[i]+" " );
          arr[i]='\0';
          arr[j]='\0';
        }
      }
    
    }
    

  }
}