import java.util.*;
class javaArray1
{
public static void main(String args[])
{
int sum=0,n=10,i,j,flag=0,avg;
int a[]={1,2,3,4,5,6,7,8,9,10};
for( i=1;i<=10;i++)
{
	for(j=2;j<=i;j++)
	{
	if(i%j==0)
	{
		
		flag=1;
		break;
	}
	if(flag==1)
	{
	 
	if(i%2!=0)
	{
	sum=sum+a[i];
	avg=sum/2;
	}
	}
	}

}
System.out.println(sum);
}
}
