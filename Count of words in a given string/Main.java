import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner ob = new Scanner(System.in);
    String str=ob.nextLine();
    char arr[]=str.toCharArray();
    int count=0;
    for(int i=0;i<str.length();i++)
    {
      if(str.charAt(i)==' ')
      {
        count++;
      }
    }
    
    System.out.println(count+1);
    
  }
}