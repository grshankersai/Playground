import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner ob = new Scanner(System.in);
    int n = ob.nextInt();
    int a[]= new int[n];
    a[0]=0;
    a[1]=0;
    int p=1;
    int k=1;
    for(int i=2;i<n;i++)
    {
      if(i%2==0)
      {
        a[i]=p*2;
        p++;
      }
      else
      {
        a[i]=k;
        k++;
      }
    }
    System.out.println(a[n-1]);
	
  }
}