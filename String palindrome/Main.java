import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner ob = new Scanner(System.in);
    String str = ob.next();
    char ch[]= str.toCharArray();
    int count=0;
    for(int i=0;i<str.length()-1;i++)
    {
      if(ch[i]!=ch[str.length()-i-1])
      {
        count++;
      }
    }
    if(count==0)
    {
      System.out.println(str+" is a palindrome");
    }
    else
    {
      System.out.println(str+" is not a palindrome");
    }
    
    
    

  }
}