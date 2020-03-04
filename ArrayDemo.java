import java.util.*;
import java.util.ArrayList;

class ArrayDemo
{
	public static void main(String args[])
	{
	int c=0,i,j,k,temp=0;
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int a[]=new int[n];
	
	System.out.println("enter the values");
		for(i=0;i<n;i++)
		{
		a[i]=sc.nextInt();
		}
		System.out.println("enter key");
			k=sc.nextInt();
		for(i=0;i<n;i++)
		{
			if(a[i]==k)
			{
				System.out.println(i);
				break;
			}
		
				temp=k;
				for(j=0;j<n;j++)
				{
					if(temp>a[j] && temp<a[j+1])
					{
						c=j+1;
						System.out.println(c);
					}
				}
				
		}
	}
}
			
