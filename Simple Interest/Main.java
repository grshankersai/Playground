import java.util.*;
class Main
{
  public static void main(String args[])
  {
    float P,n,r,SI;
  	Scanner sc=new Scanner(System.in);
    P=sc.nextFloat();
    n=sc.nextFloat();
    r=sc.nextFloat();
  	SI = (P*n*r)/100;
  	System.out.printf("%f",SI);
  }
}