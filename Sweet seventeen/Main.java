import java.util.*;
class Main
{
  public static void main(String args[])
  {
    //Try out your code here
    Scanner ob = new Scanner(System.in);
    String str = ob.nextLine();
    char arr[] = str.toCharArray();
    double decimal = 0;
    int i,val=0;
    int count=0;
    for(i=arr.length-1;i>=0;i--)
    {
		if(arr[i]>='1' && arr[i]<='9')
        {
          val = arr[i]-48;
        }
      else if(arr[i]>='a' && arr[i]<='g')
      {
        val = arr[i]-97+10;
      }
      else if(arr[i]>='A' && arr[i]<='G')
      {
        val = arr[i]-65+10;
      }
      decimal = decimal + val * Math.pow(17,count);
      count++;
    }
    System.out.println(decimal);
    
  }
}