import java.util.Scanner;
class JavaAss11
{
public static void main(String args[])
{
int i;
Scanner sc=new Scanner(System.in);
System.out.println("enter the value");
int n=sc.nextInt();
for(i=1;i<=n;i++)
{
if(i%2==0)
{
System.out.println(i*(-1));
}
else
{
System.out.println(i);
}
}
}
}
