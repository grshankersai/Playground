import java.util.*;
class Main
{
  public static boolean check(int a){
    HashSet<Integer> abc = new HashSet<>();
    while(a!=0){
      int rem = a%10;
      if(abc.contains(rem))
        return false;
      else
        abc.add(rem);
      a=a/10;
    }
    return true;
  }
  
  public static void main(String args[])
  {
    Scanner ob = new Scanner(System.in);
    int lb = ob.nextInt();
    int ub = ob.nextInt();
    int count=0;
    for(int i=lb;i<=ub;i++){
      if(check(i))
        count++;
    }
    if(count==0){
      System.out.println("No Unique Number");
    }else{
      System.out.println(count);
    }
    
    
    
  }
}