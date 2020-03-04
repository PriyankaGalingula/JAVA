import java.util.*;
class JavaAs12
{
public static void main(String args[])
{
int i,j,sum=0;
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int m=sc.nextInt();
for(i=n;i<=m;i++)
{
int flag=0;
for(j=2;j<=i/2;j++)
{
if(i%j==0)
{
flag=1;
break;
}
}

if(flag==0)
{
System.out.println(i);
sum=sum+i;
}
}
System.out.println(sum);
}
}

