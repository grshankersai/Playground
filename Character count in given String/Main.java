import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try out your code here
    Scanner ob = new Scanner(System.in);
    String str = ob.next();
    int i,j,count,flag=0;
    char arr[]=str.toCharArray();
    for(i=0;i<arr.length;i++)
    {
      
     // System.out.print(arr[i]);
      char c = arr[i];
      count=0;
      while(i<(arr.length-1) && arr[i]==arr[i+1] )
      {
        count++;
        i++;
        if(count+1==arr.length)
        {
          flag=1;
        }
      }
      if(flag==1)
      {
        System.out.println("Invalid Input");
      }
      else
      {
        System.out.print(c+ ""+ (count+1));
      }
        
      
     
    
     }
    }
    
    
  }