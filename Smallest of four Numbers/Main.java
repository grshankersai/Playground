import java.util.*;
class Main
{
  public static void main(String args[])
  {
    //Try out your code here
    Scanner ob = new Scanner(System.in);
    int c,min=9999;
    for(int i=0;i<4;i++)
    {
      c=ob.nextInt();
      if(c<min)
        min=c;
      
    }
    System.out.println(min);
    
    
  }
}