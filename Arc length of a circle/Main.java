import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner ob = new Scanner(System.in);
    double rad = ob.nextDouble();
    double ang = ob.nextDouble()/360;
    double cir = 2*3.14*rad;
    System.out.printf("%.2f",ang*cir);
    
  }
}