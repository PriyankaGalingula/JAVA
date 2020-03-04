import java.util.*;
class JavaAss13
{
public static void main(String args[])
{
int k;
Scanner sc=new Scanner(System.in);
System.out.println("enter n value");
int n=sc.nextInt();
System.out.println("enter element");
int a[]=new int[n];
System.out.println("enter element");
k=sc.nextInt();
for(int i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
for(int i=0;i<n;i++)
{
System.out.println(a[i]);
}

for(int i=0;i<n;i++)
{
if(k==a[i])
{
System.out.println("element found");
}
else
{
System.out.println("not found");
}
}
}
}