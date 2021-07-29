import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner ob = new Scanner(System.in);
    ArrayList<Integer> arr = new ArrayList<Integer>();
    int n = ob.nextInt();
    for(int i=0;i<n;i++){
      arr.add(ob.nextInt());
  }
    int pos = ob.nextInt();
    if(pos<=n)
    System.out.println(arr.get(pos-1));
    else
     System.out.println("No node found");  
  
}
}