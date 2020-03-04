import java.util.*;
class javaArray3
{
public static void main(String args[])
{
int s=0,c=0,sum=0,n=4;
int a[]={2,2,2,2};
for(int i=0;i<n;i++)
{
if(i%2==0)
{
s=s+(a[i]*a[i]);
}
else
{
c=c+(a[i]*a[i]*a[i]);
}


}
sum=s+c;
System.out.println(sum);
}
}