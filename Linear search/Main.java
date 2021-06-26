import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner ob = new Scanner(System.in);
    int n = ob.nextInt();
    int arr[]=new int[n];
    for(int i =0;i<n;i++)
    {
      arr[i]=ob.nextInt();
    }
    int key=ob.nextInt();
    int count=0;
     for(int i =0;i<n;i++)
    {
       if(key==arr[i])
       {
         count++;
         System.out.println(i+1);
         break;
       }
         
     
    }
    if(count==0)
      System.out.println(key+" isn't present in the array.");

    

  }
}