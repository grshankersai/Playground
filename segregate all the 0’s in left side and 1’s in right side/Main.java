import java.util.*;
class Main
{
  public static void main(String args[])
  {
    //Try out your code here
    Scanner ob = new Scanner(System.in);
    int n = ob.nextInt();
    int arr[] = new int[n];
    int count0=0;
    for(int i=0;i<n;i++){
      arr[i]=ob.nextInt();
           if(arr[i]==0){
        count0++;
      }
    }

    for(int i=0;i<n;i++){
      if(i<count0){
        System.out.print("0");
      }else{
        System.out.print("1");
      }
    }
    
  }
}