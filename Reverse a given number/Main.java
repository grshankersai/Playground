import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner ob = new Scanner(System.in);
    int n = ob.nextInt();
    int rem=0,numbo=0;
    while(n!=0)
    {
      rem=n%10;
      numbo=(numbo*10)+rem;
      n=n/10;
    }
    System.out.println(numbo);
    
    
  }
}