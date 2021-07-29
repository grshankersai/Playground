import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner ob = new Scanner(System.in);
    int n = ob.nextInt();
    int r = ob.nextInt();
    int c = ob.nextInt();
    int a[][]=new int[r][c];
    int b[][]=new int[r][c];
    int i,j;
    for(i=0;i<r;i++)
    {
      for(j=0;j<c;j++)
      {
        a[i][j]=ob.nextInt();
        
      }
    }
    for(i=0;i<r;i++)
    {
      for(j=0;j<c;j++)
      {
        b[i][j]=ob.nextInt();
        
      }
    }
     for(i=0;i<r;i++)
    {
      for(j=0;j<c;j++)
      {
       System.out.print(a[i][j]+b[i][j]+" ");
        
      }
    }

  }
}