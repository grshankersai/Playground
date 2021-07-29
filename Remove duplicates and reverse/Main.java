import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner ob = new Scanner(System.in);
    String str = ob.next();
    char arr[] = str.toCharArray();
    for(int i=arr.length-1;i>=0;i--)
    {
      for(int j=i-1;j>=0;j--)
      {
        if(arr[i]==arr[j])
        {
          arr[j]='\0';
        }
      }
      if(arr[i]=='\0')
        continue;
      else
      {
        System.out.print(arr[i]);
      }
      
    }
    
    
  }
}