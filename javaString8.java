import java.util.*;
class javaString8
{
public static void main(String args[])
{
int c=0;
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
for(int i=0;i<str.length();i++)
{
for(int j=0;j<str.length();j++)
{
if(str.charAt(i)!=str.charAt(j))
{
c++;
break;
}
}
}
System.out.println(c);
}
}