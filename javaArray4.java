import java.util.*;
class javaArray4
{
public static void main(String args[])
{
int n,m=0,sum=0;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
{
System.out.println("enter number");
a[i]=sc.nextInt();
}
for(int i=0;i<n;i++)
{
if(a[i]%2!=0)
{
m=a[i]*i;
sum=sum+m;
}
}
System.out.println(sum);
}
}
