import java.util.*;
class Main
{
public static void main(String[] args)  
{
    Scanner sc = new Scanner(System.in);
    int n,i,num1,num2,num1_index=-1,num2_index=-1;
    n=sc.nextInt();
	int a[]=new int[n];
	for(i=0;i<n;i++)
	{
		a[i]=sc.nextInt();
	}
	num1=sc.nextInt();
	num2=sc.nextInt();
	for(i=0;i<n;i++)
	{
		if(num1==a[i] && num1_index==-1)
		{
			num1_index=i;
		}
		if(num2==a[i] && num2_index==-1)
		{
			num2_index=i;
		}
	}
	System.out.println("Element 1 index = "+num1_index);
	System.out.println("Element 2 index = "+num2_index);
} 
} 
