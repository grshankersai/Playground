import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner ob = new Scanner(System.in);
    String str1= ob.next();
    String str2= ob.next();
    String str3= ob.next();
    char c1[]=str1.toCharArray();
    char c2[]=str2.toCharArray();
    for(int i=0;i<c1.length;i++)
    {
      if(c1[i]=='a'||c1[i]=='e'||c1[i]=='i'||c1[i]=='o'||c1[i]=='u'|| c1[i]=='A'||c1[i]=='E'||c1[i]=='I'||c1[i]=='O'||c1[i]=='U')
      {
        c1[i]='$';
      }
    }
    for(int i=0;i<c2.length;i++)
    {
      if(! (c2[i]=='a'||c2[i]=='e'||c2[i]=='i'||c2[i]=='o'||c2[i]=='u'|| c2[i]=='A'||c2[i]=='E'||c2[i]=='I'||c2[i]=='O'||c2[i]=='U'))
      {
        c2[i]='#';
      }
      
    }
    String s1 = new String(c1);
    String s2 = new String(c2);
    str3=str3.toUpperCase();
    System.out.println(s1+s2+str3);
    
    
    

  }
}