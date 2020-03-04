import java.util.*;
class javaArray2
{
public static void main(String args[])
{
int c=0,n=4,sum=0;
int a[]={1,2,3,4};
int b[]={3,4,5,6};
for(int i=0;i<n;i++)
{
for(int j=0;j<n;j++)
{
if(a[i]==b[j])
{
c++;
sum=c+c;
}
}
}
System.out.println(sum);
}
}