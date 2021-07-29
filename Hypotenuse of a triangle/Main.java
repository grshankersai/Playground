import java.lang.Math;
import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner ob = new Scanner(System.in);
    float a = ob.nextFloat();
    float b = ob.nextFloat();
    float exp = (a*a)+(b*b);
    double ans = Math.pow(exp,0.5);
    System.out.printf("%.2f",ans);

  }
}