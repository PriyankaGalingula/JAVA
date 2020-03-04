import java.util.*;
class javaString4
{

public static void main(String args[])
{
int c1=0,c2=0;
Scanner sc=new Scanner(System.in);
String s1=sc.nextLine();
String s2=sc.nextLine();
for(int i=0;i<s1.length();i++)
{
 c1++;
}
for(int i=0;i<s2.length();i++)
{
c2++;
}
if(c1==c2)
{
System.out.println(s1 + s2);
}
else if(c1>c2)
{
String s3=s1.substring(c1-c2)+s2;
System.out.println(s3);
}
else
{
String s3=s1.substring(c2-c1)+s2;
System.out.println(s3);
}
}
}