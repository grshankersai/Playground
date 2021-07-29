import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner ob = new Scanner(System.in);
    String str1 = ob.nextLine();
    String str2 = ob.nextLine();
    char ch1[] = str1.toCharArray();
    char ch2[] = str2.toCharArray();
    int arr[] = new int[128];
    Arrays.fill(arr,0);
    for(int i=0;i<ch1.length;i++){
      arr[ch1[i]]++;
    }
    for(int j=0;j<ch2.length;j++){
      arr[ch2[j]]--;
    }
    int flag=0;
    for(int i=0;i<128;i++){
      if(arr[i]!=0){
        flag=2;
        break;
      }
    }
    if(flag!=2){
      System.out.println("Anagram");
    }
    else{
      System.out.println("Not anagrams");
    }
  }
    
    
  
  }
