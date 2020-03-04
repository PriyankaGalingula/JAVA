import java.util.*;
class JavaAss9
{
public static void main(String args[])
{
int r,rev=0;
Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
int n=sc.nextInt();
while(n>0)
{
r=n%10;
rev=rev*10+r;
n=n/10;
}
System.out.println(rev);
}
}
